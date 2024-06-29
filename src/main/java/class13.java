import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class13 {

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field88;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "J")
    private long field93;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "J")
    private long field83;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "Ljava/io/File;")
    private File field89;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field80 = 100;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "[Lgaa;")
    public static class300[] field92 = new class300[14];

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Ljava/io/File;", line = 3)
    public final File method47(byte arg0) {
        field81++;
        return arg0 == 3 ? this.field89 : null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BJ)V", line = 19)
    public final void method48(byte arg0, long arg1) throws IOException {
        field90++;
        int var4 = -7 % ((arg0 - 31) / 36);
        this.field88.seek(arg1);
        this.field83 = arg1;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)J", line = 31)
    public final long method49(byte arg0) throws IOException {
        if (arg0 > -17) {
            this.method47((byte) 94);
        }
        field84++;
        return this.field88.length();
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBI[B)I", line = 42)
    public final int method50(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 != -26) {
            this.field93 = -32L;
        }
        field91++;
        int var5 = this.field88.read(arg3, arg2, arg0);
        if (var5 > 0) {
            this.field83 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V", line = 60)
    public final void method51(boolean arg0) throws IOException {
        field82++;
        if (this.field88 != null) {
            this.field88.close();
            this.field88 = null;
        }
        if (!arg0) {
            this.method47((byte) -68);
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 88)
    public class13(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field88 = new RandomAccessFile(arg0, arg1);
        this.field93 = arg2;
        this.field83 = 0L;
        this.field89 = arg0;
        int var5 = this.field88.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field88.seek(0L);
            this.field88.write(var5);
        }
        this.field88.seek(0L);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 122)
    public static void method52(int arg0) {
        if (arg0 != -14445) {
            method52(107);
        }
        field92 = null;
    }

    @OriginalMember(owner = "client!vl", name = "finalize", descriptor = "()V", line = 132)
    protected final void finalize() throws Throwable {
        if (this.field88 != null) {
            System.out.println("Warning! fileondisk " + this.field89 + " not closed correctly using close(). Auto-closing instead. ");
            this.method51(true);
        }
        field86++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "([BIII)V", line = 149)
    public final void method53(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field87++;
        if (((long) arg3 + this.field83) > this.field93) {
            this.field88.seek(this.field93);
            this.field88.write(1);
            throw new EOFException();
        }
        this.field88.write(arg0, arg2, arg3);
        if (arg1 != 4657) {
            this.method47((byte) 49);
        }
        this.field83 += arg3;
    }
}

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class455 {

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field6315;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "J")
    private long field6316;

    @OriginalMember(owner = "client!mea", name = "n", descriptor = "Ljava/io/File;")
    private File field6328;

    @OriginalMember(owner = "client!mea", name = "m", descriptor = "J")
    private long field6327;

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "[J")
    public static long[] field6319 = new long[100];

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!mea", name = "f", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!mea", name = "g", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!mea", name = "i", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!mea", name = "j", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!mea", name = "k", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!mea", name = "l", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!mea", name = "h", descriptor = "Loba;")
    public static class275 field6322;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)V", line = 8)
    public static void method2697(byte arg0) {
        int var1 = 40 % ((arg0 + 46) / 52);
        field6322 = null;
        field6319 = null;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)J", line = 26)
    public final long method2698(int arg0) throws IOException {
        if (arg0 >= -13) {
            this.method2699(-92);
        }
        field6317++;
        return this.field6315.length();
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(I)Ljava/io/File;", line = 37)
    public final File method2699(int arg0) {
        field6324++;
        return arg0 > -86 ? null : this.field6328;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I[BII)V", line = 51)
    public final void method2700(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field6325++;
        if (this.field6316 < (long) arg3 + this.field6327) {
            this.field6315.seek(this.field6316);
            this.field6315.write(1);
            throw new EOFException();
        }
        this.field6315.write(arg1, arg0, arg3);
        if (arg2 != 1) {
            method2697((byte) 114);
        }
        this.field6327 += arg3;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(JB)V", line = 71)
    public final void method2701(long arg0, byte arg1) throws IOException {
        if (arg1 <= -1) {
            field6318++;
            this.field6315.seek(arg0);
            this.field6327 = arg0;
        }
    }

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "(I)V", line = 86)
    public final void method2702(int arg0) throws IOException {
        if (arg0 != -1) {
            return;
        }
        if (this.field6315 != null) {
            this.field6315.close();
            this.field6315 = null;
        }
        field6323++;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I[BIB)I", line = 102)
    public final int method2703(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        if (arg3 != -82) {
            this.field6327 = -46L;
        }
        field6326++;
        int var5 = this.field6315.read(arg1, arg0, arg2);
        if (var5 > 0) {
            this.field6327 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!mea", name = "finalize", descriptor = "()V", line = 119)
    protected final void finalize() throws Throwable {
        field6320++;
        if (this.field6315 != null) {
            System.out.println("Warning! fileondisk " + this.field6328 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2702(-1);
        }
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 134)
    public class455(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field6315 = new RandomAccessFile(arg0, arg1);
        this.field6316 = arg2;
        this.field6328 = arg0;
        this.field6327 = 0L;
        int var5 = this.field6315.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field6315.seek(0L);
            this.field6315.write(var5);
        }
        this.field6315.seek(0L);
    }
}

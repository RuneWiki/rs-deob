import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class574 {

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field7536;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "J")
    private long field7543;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "Ljava/io/File;")
    private File field7534;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "J")
    private long field7539;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "Z")
    public static boolean field7531 = false;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public static int field7540 = 0;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "J")
    public static long field7544 = 0L;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "Ljj;")
    public static class120 field7537;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)J", line = 6)
    public final long method3155(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field7543 = -95L;
        }
        field7538++;
        return this.field7536.length();
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIB[B)I", line = 17)
    public final int method3156(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field7546++;
        int var5 = this.field7536.read(arg3, arg0, arg1);
        if (arg2 <= 118) {
            field7544 = 45L;
        }
        if (var5 > 0) {
            this.field7539 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V", line = 34)
    public final void method3157(int arg0) throws IOException {
        if (this.field7536 != null) {
            this.field7536.close();
            this.field7536 = null;
        }
        int var2 = 45 % ((-arg0 - 16) / 39);
        field7547++;
    }

    @OriginalMember(owner = "client!cr", name = "finalize", descriptor = "()V", line = 50)
    protected final void finalize() throws Throwable {
        if (this.field7536 != null) {
            System.out.println("Warning! fileondisk " + this.field7534 + " not closed correctly using close(). Auto-closing instead. ");
            this.method3157(28);
        }
        field7542++;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)Ljava/io/File;", line = 69)
    public final File method3158(boolean arg0) {
        field7532++;
        if (!arg0) {
            method3160(0);
        }
        return this.field7534;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", line = 83)
    public static final String method3159(String arg0, String arg1, String arg2, int arg3) {
        if (arg3 <= 43) {
            return null;
        }
        field7533++;
        for (int var4 = arg0.indexOf(arg2); var4 != -1; var4 = arg0.indexOf(arg2, arg1.length() + var4)) {
            arg0 = arg0.substring(0, var4) + arg1 + arg0.substring(arg2.length() + var4);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V", line = 107)
    public static void method3160(int arg0) {
        field7537 = null;
        if (arg0 != 0) {
            field7531 = false;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(III[B)V", line = 121)
    public final void method3161(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field7541++;
        if (this.field7543 < ((long) arg2 + this.field7539)) {
            this.field7536.seek(this.field7543);
            this.field7536.write(1);
            throw new EOFException();
        } else {
            this.field7536.write(arg3, arg1, arg2);
            if (arg0 == 3874) {
                this.field7539 += arg2;
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 139)
    public class574(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field7536 = new RandomAccessFile(arg0, arg1);
        this.field7543 = arg2;
        this.field7534 = arg0;
        this.field7539 = 0L;
        int var5 = this.field7536.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field7536.seek(0L);
            this.field7536.write(var5);
        }
        this.field7536.seek(0L);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BI)Z", line = 172)
    public static final boolean method3162(byte arg0, int arg1) {
        if (arg0 != 13) {
            method3162((byte) 105, -126);
        }
        field7535++;
        return arg1 == 10 || arg1 == 11 || arg1 == 12;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(JB)V", line = 186)
    public final void method3163(long arg0, byte arg1) throws IOException {
        field7545++;
        this.field7536.seek(arg0);
        this.field7539 = arg0;
        if (arg1 != 103) {
            field7540 = -123;
        }
    }
}

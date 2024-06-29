import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class29 {

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field405;

    @OriginalMember(owner = "client!qaa", name = "j", descriptor = "Ljava/io/File;")
    private File field408;

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "J")
    private long field403;

    @OriginalMember(owner = "client!qaa", name = "k", descriptor = "J")
    private long field409;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!qaa", name = "h", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!qaa", name = "i", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!qaa", name = "l", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!qaa", name = "m", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Z)Ljava/io/File;")
    public final File method208(boolean arg0) {
        if (!arg0) {
            this.field409 = -94L;
        }
        field399++;
        return this.field408;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZII[B)V")
    public final void method209(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field407++;
        if (this.field403 < ((long) arg1 + this.field409)) {
            this.field405.seek(this.field403);
            this.field405.write(1);
            throw new EOFException();
        }
        this.field405.write(arg3, arg2, arg1);
        this.field409 += arg1;
        if (arg0) {
            this.field408 = null;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V")
    public final void method210(int arg0) throws IOException {
        if (arg0 != 14471) {
            return;
        }
        field402++;
        if (this.field405 != null) {
            this.field405.close();
            this.field405 = null;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field411++;
        if (this.field405 != null) {
            System.out.println("Warning! fileondisk " + this.field408 + " not closed correctly using close(). Auto-closing instead. ");
            this.method210(14471);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method211(int arg0, String arg1) {
        field406++;
        if (arg1 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0 != 1) {
            return false;
        }
        while (class50.field719 > var2) {
            if (arg1.equalsIgnoreCase(class662.field9293[var2])) {
                return true;
            }
            var2++;
        }
        return arg1.equalsIgnoreCase(class251.field3549.field7955);
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "([BIII)I")
    public final int method212(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg3 != 19065) {
            this.field408 = null;
        }
        field410++;
        int var5 = this.field405.read(arg0, arg2, arg1);
        if (var5 > 0) {
            this.field409 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BJ)V")
    public final void method213(byte arg0, long arg1) throws IOException {
        if (arg0 != -92) {
            this.field403 = -107L;
        }
        this.field405.seek(arg1);
        field401++;
        this.field409 = arg1;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method214(char arg0, String arg1, int arg2) {
        if (arg2 > -65) {
            return null;
        }
        field400++;
        int var3 = class631.method3605(arg0, 1, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0 != arg1.charAt(var8); var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)J")
    public final long method215(byte arg0) throws IOException {
        field404++;
        if (arg0 < 96) {
            this.field408 = null;
        }
        return this.field405.length();
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field405 = new RandomAccessFile(arg0, arg1);
        this.field408 = arg0;
        this.field403 = arg2;
        this.field409 = 0L;
        int var5 = this.field405.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field405.seek(0L);
            this.field405.write(var5);
        }
        this.field405.seek(0L);
    }
}

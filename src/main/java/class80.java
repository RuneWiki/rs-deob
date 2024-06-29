import java.applet.Applet;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class80 {

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1138;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "Ljava/io/File;")
    private File field1143;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "J")
    private long field1133;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "J")
    private long field1141;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field1131 = 0;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "Ljava/applet/Applet;")
    public static Applet field1134;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILmc;)Lwga;", line = 5)
    public static final class507 method496(int arg0, class234 arg1) {
        field1135++;
        if (arg0 == 0) {
            class14 var2 = class600.method3240(-8314, arg1);
            int var3 = arg1.method1497((byte) 82);
            int var4 = arg1.method1497((byte) 117);
            return new class507(var2.field149, var2.field143, var2.field144, var2.field151, var2.field140, var2.field141, var2.field146, var2.field150, var2.field142, var3, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)J", line = 24)
    public final long method497(byte arg0) throws IOException {
        if (arg0 < 100) {
            method498(-107);
        }
        field1137++;
        return this.field1138.length();
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 35)
    public static void method498(int arg0) {
        field1134 = null;
        if (arg0 < 1) {
            field1131 = 88;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[BIZ)I", line = 46)
    public final int method499(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        field1130++;
        int var5 = this.field1138.read(arg1, arg2, arg0);
        if (var5 > 0) {
            this.field1133 += var5;
        }
        if (!arg3) {
            field1129 = 17;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "([BIBI)V", line = 62)
    public final void method500(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        if (arg2 != 0) {
            this.field1143 = null;
        }
        field1140++;
        if ((long) arg1 + this.field1133 > this.field1141) {
            this.field1138.seek(this.field1141);
            this.field1138.write(1);
            throw new EOFException();
        } else {
            this.field1138.write(arg0, arg3, arg1);
            this.field1133 += arg1;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILwm;I)Lrca;", line = 84)
    public static final class389 method501(int arg0, int arg1, class30 arg2, int arg3) {
        field1127++;
        class234 var4 = new class234(arg2.method139(arg0, (byte) -94, arg1));
        if (arg3 != 2) {
            method498(-82);
        }
        class389 var5 = new class389(arg1, var4.method1540((byte) -89), var4.method1540((byte) -95), var4.method1497((byte) 47), var4.method1497((byte) 79), var4.method1509(true) == 1, var4.method1509(true), var4.method1509(true));
        int var6 = var4.method1509(true);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field4972.method3593(new class346(var4.method1509(true), var4.method1553((byte) -111), var4.method1553((byte) -111), var4.method1553((byte) -118), var4.method1553((byte) -128), var4.method1553((byte) 19), var4.method1553((byte) 34), var4.method1553((byte) -124), var4.method1553((byte) 12)), arg3 ^ 0xD);
        }
        var5.method2248((byte) -7);
        return var5;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)Ljava/io/File;", line = 112)
    public final File method502(int arg0) {
        int var2 = 36 / ((arg0 + 41) / 52);
        field1139++;
        return this.field1143;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)V", line = 124)
    public final void method503(byte arg0) throws IOException {
        if (arg0 != 61) {
            return;
        }
        if (this.field1138 != null) {
            this.field1138.close();
            this.field1138 = null;
        }
        field1132++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIZZZ)V", line = 142)
    public static final void method504(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (arg3 > arg2) {
            int var7 = (arg2 + arg3) / 2;
            int var8 = arg2;
            class230 var9 = class21.field199[var7];
            class21.field199[var7] = class21.field199[arg3];
            class21.field199[arg3] = var9;
            for (int var10 = arg2; var10 < arg3; var10++) {
                if (class62.method365(arg4, var9, class21.field199[var10], arg0, arg5, (byte) -123, arg1) <= 0) {
                    class230 var11 = class21.field199[var10];
                    class21.field199[var10] = class21.field199[var8];
                    class21.field199[var8++] = var11;
                }
            }
            class21.field199[arg3] = class21.field199[var8];
            class21.field199[var8] = var9;
            method504(arg0, arg1, arg2, var8 - 1, arg4, arg5, false);
            method504(arg0, arg1, var8 + 1, arg3, arg4, arg5, false);
        }
        field1126++;
        if (arg6) {
            method501(-39, -112, null, 49);
        }
    }

    @OriginalMember(owner = "client!vm", name = "finalize", descriptor = "()V", line = 188)
    protected final void finalize() throws Throwable {
        field1136++;
        if (this.field1138 != null) {
            System.out.println("Warning! fileondisk " + this.field1143 + " not closed correctly using close(). Auto-closing instead. ");
            this.method503((byte) 61);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIII[BI)V", line = 201)
    public static final void method505(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field1142++;
        if (arg5 >= arg1) {
            return;
        }
        int var6 = arg2 + arg5;
        int var7 = arg1 - arg5 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = -90 % ((arg0 - 47) / 34);
                int var9 = arg1 - arg5 & 0x3;
                while (true) {
                    var9--;
                    if (var9 < 0) {
                        return;
                    }
                    arg4[var6++] = 1;
                }
            }
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BJ)V", line = 230)
    public final void method506(byte arg0, long arg1) throws IOException {
        field1128++;
        int var4 = 86 % ((arg0 + 5) / 56);
        this.field1138.seek(arg1);
        this.field1133 = arg1;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 251)
    public class80(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field1138 = new RandomAccessFile(arg0, arg1);
        this.field1143 = arg0;
        this.field1133 = 0L;
        this.field1141 = arg2;
        int var5 = this.field1138.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1138.seek(0L);
            this.field1138.write(var5);
        }
        this.field1138.seek(0L);
    }
}

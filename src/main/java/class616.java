import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class616 {

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    private int field8694 = 0;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "[Lds;")
    public class65[] field8680;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public int field8684;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "Ltm;")
    public static class334 field8687 = new class334(4, 1);

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "[I")
    public static int[] field8698 = new int[4];

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "Ljava/lang/String;")
    public static String field8695;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "Ljava/lang/String;")
    public static String field8697;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field8677;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field8678;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field8679;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field8683;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field8686;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field8688;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public static int field8691;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field8692;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public static int field8693;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    public static int field8696;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "J")
    private long field8682;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Lds;")
    private class65 field8685;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "Lds;")
    private class65 field8689;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)Lds;")
    public final class65 method3508(byte arg0) {
        this.field8694 = 0;
        field8688++;
        if (arg0 >= -31) {
            this.field8682 = -120L;
        }
        return this.method3520(-1);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)Z")
    public static final boolean method3509(int arg0, int arg1) {
        if (arg1 <= 89) {
            method3519(-22, (byte) 19);
        }
        field8678++;
        return arg0 == 4 || arg0 == 8 || arg0 == 11;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V")
    public static void method3510(boolean arg0) {
        field8698 = null;
        field8697 = null;
        field8687 = null;
        if (arg0) {
            field8695 = null;
        }
        field8695 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)I")
    public final int method3511(int arg0) {
        field8681++;
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field8684; var3++) {
            class65 var4 = this.field8680[var3];
            class65 var5 = var4.field1044;
            while (var4 != var5) {
                var5 = var5.field1044;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZJ)Lds;")
    public final class65 method3512(boolean arg0, long arg1) {
        field8686++;
        this.field8682 = arg1;
        if (!arg0) {
            this.field8684 = -60;
        }
        class65 var4 = this.field8680[(int) (arg1 & (long) (this.field8684 - 1))];
        for (this.field8685 = var4.field1044; this.field8685 != var4; this.field8685 = this.field8685.field1044) {
            if (this.field8685.field1039 == arg1) {
                class65 var5 = this.field8685;
                this.field8685 = this.field8685.field1044;
                return var5;
            }
        }
        this.field8685 = null;
        return null;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)Lds;")
    public final class65 method3513(int arg0) {
        field8683++;
        if (this.field8685 == null) {
            return null;
        }
        class65 var2 = this.field8680[(int) ((long) (this.field8684 + arg0) & this.field8682)];
        while (this.field8685 != var2) {
            if (this.field8685.field1039 == this.field8682) {
                class65 var3 = this.field8685;
                this.field8685 = this.field8685.field1044;
                return var3;
            }
            this.field8685 = this.field8685.field1044;
        }
        this.field8685 = null;
        return null;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)I")
    public final int method3514(int arg0) {
        if (arg0 == -56002843) {
            field8691++;
            return this.field8684;
        } else {
            return 77;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([Lds;I)I")
    public final int method3515(class65[] arg0, int arg1) {
        field8690++;
        int var3 = 0;
        int var4 = 111 / ((59 - arg1) / 59);
        for (int var5 = 0; var5 < this.field8684; var5++) {
            class65 var6 = this.field8680[var5];
            for (class65 var7 = var6.field1044; var7 != var6; var7 = var7.field1044) {
                arg0[var3++] = var7;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IJLds;)V")
    public final void method3516(int arg0, long arg1, class65 arg2) {
        field8676++;
        if (arg2.field1042 != null) {
            arg2.method636((byte) 97);
        }
        if (arg0 != 255) {
            this.field8682 = 77L;
        }
        class65 var5 = this.field8680[(int) ((long) (this.field8684 - 1) & arg1)];
        arg2.field1044 = var5;
        arg2.field1042 = var5.field1042;
        arg2.field1042.field1044 = arg2;
        arg2.field1039 = arg1;
        arg2.field1044.field1042 = arg2;
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V")
    public final void method3517(int arg0) {
        for (int var2 = 0; var2 < this.field8684; var2++) {
            class65 var3 = this.field8680[var2];
            while (true) {
                class65 var4 = var3.field1044;
                if (var3 == var4) {
                    break;
                }
                var4.method636((byte) 97);
            }
        }
        field8696++;
        if (arg0 < -55) {
            this.field8689 = null;
            this.field8685 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([BIZ)[B")
    public static final byte[] method3518(byte[] arg0, int arg1, boolean arg2) {
        field8677++;
        byte[] var3 = new byte[arg1];
        class571.method3313(arg0, 0, var3, 0, arg1);
        if (arg2) {
            field8687 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(I)V")
    public class616(int arg0) {
        this.field8680 = new class65[arg0];
        this.field8684 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class65 var3 = this.field8680[var2] = new class65();
            var3.field1044 = var3;
            var3.field1042 = var3;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)I")
    public static final int method3519(int arg0, byte arg1) {
        field8679++;
        double var2 = (double) ((arg0 & 0xFFF182) >> 16) / 256.0D;
        double var4 = (double) ((arg0 & 0xFF40) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (arg1 <= 126) {
            method3519(6, (byte) 97);
        }
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return ((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)Lds;")
    public final class65 method3520(int arg0) {
        if (arg0 != -1) {
            this.field8682 = 119L;
        }
        field8692++;
        if (this.field8694 > 0 && this.field8680[this.field8694 - 1] != this.field8689) {
            class65 var2 = this.field8689;
            this.field8689 = var2.field1044;
            return var2;
        }
        while (this.field8694 < this.field8684) {
            class65 var3 = this.field8680[this.field8694++].field1044;
            if (this.field8680[this.field8694 - 1] != var3) {
                this.field8689 = var3.field1044;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;Lrs;BI)Lwaa;")
    public static final class621 method3521(String arg0, class166 arg1, byte arg2, int arg3) {
        field8693++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        if (arg2 != -99) {
            method3510(false);
        }
        OpenGL.glGetObjectParameterivARB(var4, 35713, class468.field6817, 0);
        if (class468.field6817[0] == 0) {
            if (class468.field6817[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class468.field6817, 1);
            if (class468.field6817[1] > 1) {
                byte[] var6 = new byte[class468.field6817[1]];
                OpenGL.glGetInfoLogARB(var4, class468.field6817[1], class468.field6817, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class468.field6817[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class621(arg1, var4, arg3);
    }

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field8695 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field8697 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
    }
}

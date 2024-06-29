import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class511 {

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public int field7116 = 128;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public int field7119 = 128;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public int field7110;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public int field7108;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public int field7112;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public int field7105;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "[I")
    public static int[] field7106 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field7109 = -1;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZC)Z", line = 4)
    public static final boolean method2991(boolean arg0, char arg1) {
        field7115++;
        if (!arg0) {
            method2997(true, 83);
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ldk;B)V", line = 16)
    public final void method2992(class511 arg0, byte arg1) {
        this.field7112 = arg0.field7112;
        this.field7105 = arg0.field7105;
        if (arg1 != 118) {
            method2991(true, (char) 65509);
        }
        field7113++;
        this.field7110 = arg0.field7110;
        this.field7119 = arg0.field7119;
        this.field7108 = arg0.field7108;
        this.field7116 = arg0.field7116;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)Ldk;", line = 32)
    public final class511 method2993(int arg0) {
        if (arg0 != 2) {
            this.method2992(null, (byte) -10);
        }
        field7117++;
        return new class511(this.field7110, this.field7119, this.field7116, this.field7112, this.field7108, this.field7105);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Loea;ILaa;IILjava/lang/String;ILda;ILat;II)V", line = 53)
    public static final void method2994(class597 arg0, int arg1, class487 arg2, int arg3, int arg4, String arg5, int arg6, class60 arg7, int arg8, class378 arg9, int arg10, int arg11) {
        field7107++;
        int var12;
        if (class438.field6252 == 4) {
            var12 = (int) class451.field6366 & 0x3FFF;
        } else {
            var12 = (int) class451.field6366 + class28.field748 & 0x3FFF;
        }
        int var13 = Math.max(arg9.field5385 / 2, arg9.field5465 / 2) + 10;
        int var14 = arg10 * arg10 + (arg3 * arg3);
        if ((var13 * var13) < var14) {
            return;
        }
        int var15 = class255.field3698[var12];
        int var16 = class255.field3695[var12];
        if (class438.field6252 != 4) {
            var16 = var16 * 256 / (class548.field7552 + 256);
            var15 = var15 * 256 / (class548.field7552 + 256);
        }
        int var17 = arg3 * var15 + arg10 * var16 >> 14;
        int var18 = arg3 * var16 - (arg10 * var15) >> 14;
        int var19 = arg0.method3393(arg5, false, 100, null);
        int var20 = arg0.method3391(null, 0, 0, arg11, arg5);
        int var21 = var17 - var19 / 2;
        if (-arg9.field5385 <= var21 && arg9.field5385 >= var21 && (-arg9.field5465) <= var18 && var18 <= arg9.field5465) {
            arg7.method646(null, 0, 0, null, arg1, 0, 50, arg2, arg9.field5465 / 2 + (-var18 - var20) + arg6 - arg8, arg4, arg6, var19, arg9.field5385 / 2 + arg4 + var21, false, 1, arg5);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 100)
    public static final String method2995(String arg0, int arg1) {
        if (arg1 != 3) {
            method2994(null, -94, null, 2, -110, null, -7, null, -71, null, -47, 104);
        }
        field7114++;
        if (class141.field2334.startsWith("win")) {
            return arg0 + ".dll";
        } else if (class141.field2334.startsWith("linux")) {
            return "lib" + arg0 + ".so";
        } else if (class141.field2334.startsWith("mac")) {
            return "lib" + arg0 + ".dylib";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)I", line = 124)
    public static final int method2996(int arg0, int arg1, int arg2, int arg3) {
        field7111++;
        if (arg0 == arg1) {
            return arg0;
        }
        int var4 = 128 - arg3;
        if (arg2 == 1) {
            int var5 = (arg0 & 0x7F) * var4 + (arg1 & 0x7F) * arg3 >> 7;
            int var6 = (arg0 & 0x380) * var4 + (arg1 & 0x380) * arg3 >> 7;
            int var7 = (arg0 & 0xFC00) * var4 + (arg1 & 0xFC00) * arg3 >> 7;
            return var7 & 0xFC00 | var6 & 0x380 | var5 & 0x7F;
        } else {
            return -53;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)Z", line = 147)
    public static final boolean method2997(boolean arg0, int arg1) {
        if (!arg0) {
            field7106 = null;
        }
        field7118++;
        return arg1 == 10 || arg1 == 11 || arg1 == 12;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V", line = 163)
    public static void method2998(int arg0) {
        if (arg0 != -6896) {
            field7109 = -7;
        }
        field7106 = null;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(I)V", line = 180)
    public class511(int arg0) {
        this.field7110 = arg0;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(IIIIII)V", line = 187)
    private class511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7110 = arg0;
        this.field7119 = arg1;
        this.field7108 = arg4;
        this.field7112 = arg3;
        this.field7116 = arg2;
        this.field7105 = arg5;
    }
}

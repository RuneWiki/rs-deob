import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class14 extends class320 {

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "[I")
    public static int[] field223 = new int[1000];

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "Lpi;")
    public static class342 field218 = new class342("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public int field216;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public int field217;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public int field220;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public int field225;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    public int field228;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    public int field230;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    public int field232;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    public int field233;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    public int field234;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
    public int field235;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    public int field236;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
    public int field238;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "Lui;")
    public class151 field240;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "Lbq;")
    public class189 field221;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "Lij;")
    public class288 field215;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "Lbi;")
    public static class333 field226;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "Lgn;")
    public class493 field237;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
    public static void method89(int arg0) {
        field218 = null;
        field226 = null;
        field223 = null;
        if (arg0 != 1690713128) {
            field223 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([[BILhu;)V")
    public static final void method90(byte[][] arg0, int arg1, class85 arg2) {
        if (arg1 != 64) {
            field226 = null;
        }
        field231++;
        int var3 = class322.field4920.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class381.field5776[var4] >> 8) * 64 - class200.field2931;
                int var7 = (class381.field5776[var4] & 0xFF) * 64 - class403.field6059;
                class386.method2389(arg1 ^ 0x3DFC);
                arg2.method656(var6, var7, var5, class141.field2244, arg1 ^ 0xFFFF9D47, class4.field109);
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)Z")
    public static final boolean method91(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class492.field7279; var3++) {
            class531 var4 = class501.field7390[var3];
            if (var4.field7806 == 1) {
                int var5 = var4.field7810 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field7808 * var5 >> 8) + var4.field7807;
                    int var7 = (var4.field7809 * var5 >> 8) + var4.field7818;
                    int var8 = (var4.field7823 * var5 >> 8) + var4.field7815;
                    int var9 = (var4.field7811 * var5 >> 8) + var4.field7820;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field7806 == 2) {
                int var10 = arg0 - var4.field7810;
                if (var10 > 0) {
                    int var11 = (var4.field7808 * var10 >> 8) + var4.field7807;
                    int var12 = (var4.field7809 * var10 >> 8) + var4.field7818;
                    int var13 = (var4.field7823 * var10 >> 8) + var4.field7815;
                    int var14 = (var4.field7811 * var10 >> 8) + var4.field7820;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field7806 == 3) {
                int var15 = var4.field7807 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field7804 * var15 >> 8) + var4.field7810;
                    int var17 = (var4.field7816 * var15 >> 8) + var4.field7822;
                    int var18 = (var4.field7823 * var15 >> 8) + var4.field7815;
                    int var19 = (var4.field7811 * var15 >> 8) + var4.field7820;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field7806 == 4) {
                int var20 = arg2 - var4.field7807;
                if (var20 > 0) {
                    int var21 = (var4.field7804 * var20 >> 8) + var4.field7810;
                    int var22 = (var4.field7816 * var20 >> 8) + var4.field7822;
                    int var23 = (var4.field7823 * var20 >> 8) + var4.field7815;
                    int var24 = (var4.field7811 * var20 >> 8) + var4.field7820;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field7806 == 5) {
                int var25 = arg1 - var4.field7815;
                if (var25 > 0) {
                    int var26 = (var4.field7804 * var25 >> 8) + var4.field7810;
                    int var27 = (var4.field7816 * var25 >> 8) + var4.field7822;
                    int var28 = (var4.field7808 * var25 >> 8) + var4.field7807;
                    int var29 = (var4.field7809 * var25 >> 8) + var4.field7818;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZLvr;IZILvr;)I")
    public static final int method92(int arg0, boolean arg1, class89 arg2, int arg3, boolean arg4, int arg5, class89 arg6) {
        field227++;
        int var7 = class389.method2403(arg3, arg6, arg2, -1, arg4);
        if (arg0 != 8) {
            method91(53, 37, -21);
        }
        if (var7 != 0) {
            return arg4 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class389.method2403(arg5, arg6, arg2, -1, arg1);
            return arg1 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
    public final void method93(boolean arg0) {
        this.field237 = null;
        this.field240 = null;
        field229++;
        if (arg0) {
            this.field221 = null;
            this.field215 = null;
        }
    }
}

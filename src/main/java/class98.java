import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class98 {

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "[I")
    private int[] field1607;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "[I")
    private int[] field1612;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Lrg;")
    private class270 field1611;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "Lrg;")
    private class270 field1615;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "[Lrg;")
    private class270[] field1618;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "[I")
    public static int[] field1609 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Lmh;")
    public static class62 field1608 = class201.method1405(true, "loc");

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Lmh;")
    public static class62 field1604 = class201.method1405(true, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "[I")
    public static int[] field1617 = new int[2048];

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Lmh;")
    private static class62 field1620 = class201.method1405(true, "purple:");

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lmh;")
    public static class62 field1603 = field1620;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Lmh;")
    public static class62 field1614 = field1620;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1606 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "Lhi;")
    public static class26 field1622;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "[I")
    public static int[] field1621;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lhi;ZLgg;)Z", line = 5)
    public final boolean method784(class26 arg0, boolean arg1, class126 arg2) {
        field1619++;
        for (int var4 = 0; var4 < this.field1607.length; var4++) {
            if (!arg0.method136(5, this.field1607[var4])) {
                return false;
            }
        }
        if (!arg1) {
            this.field1607 = (int[]) null;
        }
        for (int var5 = 0; var5 < this.field1612.length; var5++) {
            if (!arg2.method187(this.field1612[var5], 255)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lgg;ZIIBDLhi;Z)[I", line = 44)
    public final int[] method785(class126 arg0, boolean arg1, int arg2, int arg3, byte arg4, double arg5, class26 arg6, boolean arg7) {
        field1613++;
        if (arg4 < 42) {
            return (int[]) null;
        }
        int[] var10 = new int[arg2 * arg3];
        class216.method1536(arg5, 59);
        class87.field1394 = arg6;
        class205.field3480 = arg0;
        class122.method934(-44, arg2, arg3);
        for (int var11 = 0; var11 < this.field1618.length; var11++) {
            this.field1618[var11].method1852(arg3, 255, arg2);
        }
        int var12;
        int var13;
        byte var14;
        if (arg7) {
            var12 = -1;
            var13 = arg2 - 1;
            var14 = -1;
        } else {
            var12 = arg2;
            var13 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg3; var16++) {
            if (arg1) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field1611.field4588) {
                int[] var21 = this.field1611.method6(18693, var16);
                var20 = var21;
                var19 = var21;
                var18 = var21;
            } else {
                int[][] var17 = this.field1611.method11(false, var16);
                var18 = var17[0];
                var19 = var17[1];
                var20 = var17[2];
            }
            for (int var22 = var13; var22 != var12; var22 += var14) {
                int var23 = var18[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class17.field170[var23];
                int var25 = var19[var22] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                int var26 = var20[var22] >> 4;
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class17.field170[var25];
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class17.field170[var26];
                var10[var15++] = (var24 << 16) + (var27 << 8) + var28;
                if (arg1) {
                    var15 += arg2 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field1618.length; var29++) {
            this.field1618[var29].method1276((byte) -119);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ltd;II)V", line = 202)
    public static final void method786(class222 arg0, int arg1, int arg2) {
        if (arg0.field3852 > class199.field3367) {
            class75.method567(arg0, (byte) 53);
        } else if (arg0.field3837 < class199.field3367) {
            class155.method1149(arg0, -73);
        } else {
            class62.method412(-54, arg0);
        }
        if (arg0.field3821 < 128 || arg0.field3814 < 128 || arg0.field3821 >= 13184 || arg0.field3814 >= 13184) {
            arg0.field3837 = 0;
            arg0.field3852 = 0;
            arg0.field3847 = -1;
            arg0.field3836 = -1;
            arg0.field3821 = arg0.field3828[0] * 128 + arg0.method1101(true) * 64;
            arg0.field3814 = arg0.field3846[0] * 128 + arg0.method1101(true) * 64;
            arg0.method1575((byte) -123);
        }
        int var3 = 85 / ((arg1 + 20) / 40);
        field1605++;
        if (class268.field4551 == arg0 && (arg0.field3821 < 1536 || arg0.field3814 < 1536 || arg0.field3821 >= 11776 || arg0.field3814 >= 11776)) {
            arg0.field3837 = 0;
            arg0.field3852 = 0;
            arg0.field3836 = -1;
            arg0.field3847 = -1;
            arg0.field3821 = arg0.field3828[0] * 128 + arg0.method1101(true) * 64;
            arg0.field3814 = arg0.field3846[0] * 128 + arg0.method1101(true) * 64;
            arg0.method1575((byte) 23);
        }
        class112.method877(arg0, 0);
        class118.method917(arg0, (byte) -83);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 252)
    public static void method787(int arg0) {
        field1620 = null;
        field1604 = null;
        field1622 = null;
        field1603 = null;
        field1621 = null;
        field1609 = null;
        field1608 = null;
        field1617 = null;
        field1606 = null;
        if (arg0 < 44) {
            field1623 = -35;
        }
        field1614 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(DLhi;IILgg;ZI)[B", line = 292)
    public final byte[] method788(double arg0, class26 arg1, int arg2, int arg3, class126 arg4, boolean arg5, int arg6) {
        class216.method1536(arg0, 54);
        class87.field1394 = arg1;
        byte[] var9 = new byte[arg2 * 4 * arg3];
        class205.field3480 = arg4;
        class122.method934(-114, arg3, arg2);
        for (int var10 = 0; var10 < this.field1618.length; var10++) {
            this.field1618[var10].method1852(arg2, arg6 ^ 0xFF, arg3);
        }
        field1610++;
        int var11 = 0;
        for (int var12 = arg6; var12 < arg2; var12++) {
            if (arg5) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field1611.field4588) {
                int[] var13 = this.field1611.method6(18693, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field1611.method11(false, var12);
                var16 = var17[0];
                var14 = var17[2];
                var15 = var17[1];
            }
            int[] var18;
            if (this.field1615.field4588) {
                var18 = this.field1615.method6(arg6 ^ 0x4905, var12);
            } else {
                var18 = this.field1615.method11(false, var12)[0];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                int var21 = var16[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = var14[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                int var23 = class17.field170[var20];
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class17.field170[var22];
                int var25 = class17.field170[var21];
                int var26;
                if (var25 == 0 && var23 == 0 && var24 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var23;
                var9[var11++] = (byte) var24;
                var9[var11++] = (byte) var26;
                if (arg5) {
                    var11 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field1618.length; var27++) {
            this.field1618[var27].method1276((byte) -69);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V", line = 428)
    public class98() {
        this.field1607 = new int[0];
        this.field1612 = new int[0];
        this.field1611 = new class69();
        this.field1611.field4578 = 1;
        this.field1615 = new class69();
        this.field1615.field4578 = 1;
        this.field1618 = new class270[] { this.field1611, this.field1615 };
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lmi;)V", line = 442)
    public class98(class92 arg0) {
        int var2 = arg0.method702(-1);
        int var3 = 0;
        this.field1618 = new class270[var2];
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class270 var7 = class236.method1667(arg0, true);
            if (var7.method1714(123) >= 0) {
                var4++;
            }
            if (var7.method1269((byte) 125) >= 0) {
                var3++;
            }
            int var8 = var7.field4582.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method702(-1);
            }
            this.field1618[var6] = var7;
        }
        this.field1607 = new int[var4];
        this.field1612 = new int[var3];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class270 var13 = this.field1618[var12];
            int var14 = var13.field4582.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field4582[var15] = this.field1618[var5[var12][var15]];
            }
            int var16 = var13.method1714(109);
            int var17 = var13.method1269((byte) 123);
            if (var16 > 0) {
                this.field1607[var10++] = var16;
            }
            if (var17 > 0) {
                this.field1612[var11++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field1611 = this.field1618[arg0.method702(-1)];
        this.field1615 = this.field1618[arg0.method702(-1)];
    }
}

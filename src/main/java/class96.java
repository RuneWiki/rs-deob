import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class96 {

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "[I")
    private int[] field1786;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "[I")
    private int[] field1791;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "Ltm;")
    private class71 field1797;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Ltm;")
    private class71 field1796;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "[Ltm;")
    private class71[] field1782;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Lud;")
    public static class279 field1783 = class130.method1024("Objet d(Wabonn-Bs", 255);

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "Lud;")
    public static class279 field1787 = class130.method1024("<br>", 255);

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Lud;")
    public static class279 field1778 = class130.method1024("null", 255);

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Lud;")
    public static class279 field1784 = class130.method1024(" de votre liste d(Wamis)3", 255);

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "[Lqg;")
    public static class239[] field1780 = new class239[2048];

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "Lud;")
    public static class279 field1790 = class130.method1024("classement ", 255);

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "Lud;")
    public static class279 field1788 = class130.method1024("<img=1>", 255);

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field1793 = 0;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 6)
    public static final void method795(int arg0) {
        field1792++;
        class119.field2148.method1334((byte) -25);
        class34.field767.method1334((byte) -25);
        class172.field3111.method1334((byte) -25);
        if (arg0 != -1) {
            field1784 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZLkc;ILok;ID)[B", line = 35)
    public final byte[] method796(int arg0, boolean arg1, class36 arg2, int arg3, class149 arg4, int arg5, double arg6) {
        field1781++;
        class98.method844(arg6, 102);
        byte[] var9 = new byte[arg3 * arg5 * 4];
        class3.field110 = arg4;
        class31.field722 = arg2;
        class163.method1281(true, arg5, arg3);
        for (int var10 = 0; var10 < this.field1782.length; var10++) {
            this.field1782[var10].method623(arg0 + 1666, arg5, arg3);
        }
        if (arg0 != -1411) {
            this.field1791 = (int[]) null;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            if (arg1) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field1797.field1389) {
                int[] var13 = this.field1797.method199(var12, (byte) -85);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field1797.method86(var12, arg0 ^ 0xFFFFFA77);
                var15 = var17[2];
                var16 = var17[1];
                var14 = var17[0];
            }
            int[] var18;
            if (this.field1796.field1389) {
                var18 = this.field1796.method199(var12, (byte) -77);
            } else {
                var18 = this.field1796.method86(var12, -125)[0];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                int var20 = var16[var19] >> 4;
                int var21 = var15[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = class212.field3723[var21];
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var23 = class212.field3723[var20];
                int var24 = var14[var19] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class212.field3723[var24];
                int var26;
                if (var25 == 0 && var23 == 0 && var22 == 0) {
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
                var9[var11++] = (byte) var22;
                var9[var11++] = (byte) var26;
                if (arg1) {
                    var11 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field1782.length; var27++) {
            this.field1782[var27].method85(30767);
        }
        return var9;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V", line = 172)
    public static final void method797(int arg0, int arg1) {
        field1789++;
        class104 var2 = class293.method2085(12, arg0, false);
        var2.method875(12466);
        if (arg1 != -22296) {
            method797(126, 32);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lkc;ZZIIILok;D)[I", line = 193)
    public final int[] method798(class36 arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, class149 arg6, double arg7) {
        class98.method844(arg7, 127);
        class31.field722 = arg0;
        field1785++;
        class3.field110 = arg6;
        int[] var10 = new int[arg3 * arg4];
        class163.method1281(true, arg4, arg3);
        for (int var11 = 0; var11 < this.field1782.length; var11++) {
            this.field1782[var11].method623(255, arg4, arg3);
        }
        int var12;
        int var13;
        byte var14;
        if (arg2) {
            var12 = arg3 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var13 = arg3;
            var12 = 0;
            var14 = 1;
        }
        int var15 = 0;
        if (arg5 <= 2) {
            this.method796(96, true, (class36) null, 58, (class149) null, 57, 0.30124894656815415D);
        }
        for (int var16 = 0; var16 < arg4; var16++) {
            if (arg1) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field1797.field1389) {
                int[] var17 = this.field1797.method199(var16, (byte) -127);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field1797.method86(var16, 4);
                var19 = var21[2];
                var20 = var21[0];
                var18 = var21[1];
            }
            for (int var22 = var12; var22 != var13; var22 += var14) {
                int var23 = var20[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var18[var22] >> 4;
                int var25 = class212.field3723[var23];
                int var26 = var19[var22] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var27 = class212.field3723[var26];
                int var28 = class212.field3723[var24];
                var10[var15++] = (var28 << 8) + ((var25 << 16) + var27);
                if (arg1) {
                    var15 += arg3 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field1782.length; var29++) {
            this.field1782[var29].method85(30767);
        }
        return var10;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)Lvh;", line = 321)
    public static final class53 method799(byte arg0) {
        field1795++;
        class53 var1 = new class53(34);
        var1.method464(11, false);
        var1.method464(class253.field4519, false);
        var1.method464(class145.field2624 ? 1 : 0, false);
        var1.method464(class289.field5158 ? 1 : 0, false);
        var1.method464(class202.field3608 ? 1 : 0, false);
        var1.method464(class29.field685 ? 1 : 0, false);
        var1.method464(class86.field1614 ? 1 : 0, false);
        var1.method464(class221.field3901 ? 1 : 0, false);
        var1.method464(class198.field3536 ? 1 : 0, false);
        var1.method464(class220.field3883 ? 1 : 0, false);
        var1.method464(class171.field3086, false);
        var1.method464(class126.field2340 ? 1 : 0, false);
        var1.method464(class162.field2929 ? 1 : 0, false);
        var1.method464(class68.field1335 ? 1 : 0, false);
        var1.method464(class141.field2566, false);
        var1.method464(class80.field1525 ? 1 : 0, false);
        var1.method464(class41.field875, false);
        var1.method464(class113.field2073, false);
        var1.method464(class3.field105, false);
        var1.method505(class236.field4121, (byte) 7);
        var1.method505(class239.field4218, (byte) 7);
        var1.method464(class208.method1533(), false);
        if (arg0 != 31) {
            return (class53) null;
        }
        var1.method444((byte) 46, class293.field5224);
        var1.method464(class283.field5062, false);
        var1.method464(class39.field853 ? 1 : 0, false);
        var1.method464(class292.field5204 ? 1 : 0, false);
        var1.method464(class50.field1029, false);
        var1.method464(class177.field3185 ? 1 : 0, false);
        var1.method464(class307.field5448 ? 1 : 0, false);
        return var1;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V", line = 363)
    public static void method800(int arg0) {
        field1780 = null;
        field1790 = null;
        field1778 = null;
        field1787 = null;
        field1783 = null;
        field1788 = null;
        if (arg0 != -1933341052) {
            method795(-7);
        }
        field1784 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLkc;Lok;)Z", line = 388)
    public final boolean method801(byte arg0, class36 arg1, class149 arg2) {
        field1777++;
        if (class135.field2458 > 0) {
            for (int var4 = 0; var4 < this.field1786.length; var4++) {
                if (!arg2.method1180(this.field1786[var4], 11934, class135.field2458)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1786.length; var5++) {
                if (!arg2.method1186(this.field1786[var5], -22698)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field1791.length; var6++) {
            if (!arg1.method321(this.field1791[var6], (byte) 99)) {
                return false;
            }
        }
        if (arg0 != -109) {
            field1794 = -20;
        }
        return true;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)Lud;", line = 447)
    public static final class279 method802(int arg0, byte arg1) {
        field1779++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        class279 var2 = new class279();
        var2.field4967 = 1;
        if (arg1 != 25) {
            field1787 = (class279) null;
        }
        var2.field4935 = new byte[1];
        var2.field4935[0] = (byte) arg0;
        return var2;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V", line = 486)
    public class96() {
        this.field1786 = new int[0];
        this.field1791 = new int[0];
        this.field1797 = new class302();
        this.field1797.field1391 = 1;
        this.field1796 = new class302();
        this.field1782 = new class71[] { this.field1797, this.field1796 };
        this.field1796.field1391 = 1;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lvh;)V", line = 499)
    public class96(class53 arg0) {
        int var2 = arg0.method483(-109);
        int var3 = 0;
        int var4 = 0;
        this.field1782 = new class71[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class71 var7 = class84.method730(arg0, 0);
            if (var7.method625((byte) 120) >= 0) {
                var3++;
            }
            if (var7.method87(-3) >= 0) {
                var4++;
            }
            int var8 = var7.field1393.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method483(-120);
            }
            this.field1782[var6] = var7;
        }
        this.field1786 = new int[var3];
        this.field1791 = new int[var4];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class71 var13 = this.field1782[var12];
            int var14 = var13.field1393.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field1393[var15] = this.field1782[var5[var12][var15]];
            }
            int var16 = var13.method625((byte) 119);
            int var17 = var13.method87(-3);
            if (var16 > 0) {
                this.field1786[var10++] = var16;
            }
            if (var17 > 0) {
                this.field1791[var11++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field1797 = this.field1782[arg0.method483(-113)];
        this.field1796 = this.field1782[arg0.method483(-114)];
    }
}

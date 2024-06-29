import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 extends class202 {

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "[Ljc;")
    public class231[] field8;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "Z")
    public static boolean field9 = true;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "[Ltk;")
    public static class50[] field17 = new class50[4];

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
    public static int field12 = 0;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    public static int field19 = -1;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "Z")
    public static boolean field18 = false;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "Z")
    public static boolean field14 = true;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "Lnh;")
    public static class52 field3 = new class52(0, 0);

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "[I")
    public static int[] field13;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "[Lw;")
    public static class141[] field11;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)Loh;")
    public static final class263 method1(int arg0, int arg1, int arg2) {
        field6++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return class234.field4084;
        } else if (var3 < -6) {
            return class154.field2786;
        } else if (var3 < -3) {
            return class85.field1676;
        } else if (var3 < 0) {
            return class157.field2834;
        } else if (var3 > 9) {
            return class218.field3870;
        } else if (var3 > 6) {
            return class78.field1586;
        } else if (var3 > 3) {
            return class251.field4370;
        } else if (var3 > 0) {
            return class148.field2690;
        } else if (arg0 == -1674) {
            return class73.field1529;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(ZI)V")
    public static final void method2(boolean arg0, int arg1) {
        field10++;
        byte var2 = 4;
        byte[][] var3 = class78.field1587;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class128.field2370[var5] >> 8) * 64 - class93.field1844;
            int var12 = (class128.field2370[var5] & 0xFF) * 64 - class142.field2596;
            byte[] var13 = var3[var5];
            if (var13 != null) {
                class61.method371((byte) 77);
                class142.method938(var12, arg0, (class145.field2654 - 6) * 8, var13, class3.field68 * 8 - 48, var11, -11, class103.field1954);
            }
        }
        if (arg1 != 6) {
            method9(-52, 65, -22, 81, -10, (byte) 23, false);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class128.field2370[var6] >> 8) * 64 - class93.field1844;
            int var8 = (class128.field2370[var6] & 0xFF) * 64 - class142.field2596;
            byte[] var9 = var3[var6];
            if (var9 == null && class145.field2654 < 800) {
                class61.method371((byte) 77);
                for (int var10 = 0; var10 < var2; var10++) {
                    class153.method1010((byte) -88, 64, var7, 64, var8, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)I")
    public static final int method3(int arg0, int arg1) {
        field7++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * arg1 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)V")
    public static final void method4(byte arg0) {
        if (class207.field3755 < 0) {
            class75.field1554 = -1;
            class182.field3299 = -1;
            class207.field3755 = 0;
        }
        field4++;
        if (class8.field149 < class207.field3755) {
            class75.field1554 = -1;
            class182.field3299 = -1;
            class207.field3755 = class8.field149;
        }
        if (class113.field2115 < 0) {
            class182.field3299 = -1;
            class113.field2115 = 0;
            class75.field1554 = -1;
        }
        if (arg0 < 107) {
            method5(31);
        }
        if (class112.field2110 < class113.field2115) {
            class75.field1554 = -1;
            class113.field2115 = class112.field2110;
            class182.field3299 = -1;
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lue;Lue;IZ)V")
    public class1(class86 arg0, class86 arg1, int arg2, boolean arg3) {
        class277 var5 = new class277();
        int var6 = arg0.method587((byte) 115, arg2);
        this.field8 = new class231[var6];
        int[] var7 = arg0.method577(2828, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method596(41, arg2, var7[var8]);
            class230 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class230 var12 = (class230) var5.method1878(true); var12 != null; var12 = (class230) var5.method1881(-44)) {
                if (var12.field4027 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method589(-99, 0, var11);
                } else {
                    var13 = arg1.method589(-108, var11, 0);
                }
                var10 = new class230(var11, var13);
                var5.method1883(var10, (byte) -3);
            }
            this.field8[var7[var8]] = new class231(var9, var10);
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
    public static void method5(int arg0) {
        if (arg0 <= -15) {
            field3 = null;
            field13 = null;
            field17 = null;
            field11 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)Z")
    public final boolean method6(int arg0, int arg1) {
        if (arg1 != -1) {
            field9 = false;
        }
        field16++;
        return this.field8[arg0].field4046;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lue;Lue;Lng;I)V")
    public static final void method7(class86 arg0, class86 arg1, class74 arg2, int arg3) {
        class218.field3876 = arg1;
        field15++;
        class251.field4376 = arg2;
        class219.field3881 = arg0;
        if (class219.field3881 != null) {
            class239.field4175 = class219.field3881.method587((byte) 115, 1);
        }
        if (class218.field3876 != null) {
            class130.field2393 = class218.field3876.method587((byte) 115, 1);
        }
        if (arg3 != 1) {
            method5(-91);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZZ)I")
    public static final int method8(boolean arg0, boolean arg1) {
        field2++;
        long var2 = class25.method182(arg0);
        for (class180 var4 = arg1 ? (class180) client.field2765.method38(24172) : (class180) client.field2765.method36(86); var4 != null; var4 = (class180) client.field2765.method36(-125)) {
            if (var2 > (var4.field3283 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field3283 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field4226;
                    class48.field1038[var5] = class154.field2787[var5];
                    var4.method1614(-1204826926);
                    return var5;
                }
                var4.method1614(-1204826926);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIBZ)V")
    public static final void method9(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        field1++;
        if (class3.field68 == arg4 && class145.field2654 == arg1 && class171.field3128 == arg3 || class77.method526(-26670)) {
            return;
        }
        class171.field3128 = arg3;
        class145.field2654 = arg1;
        class3.field68 = arg4;
        if (class77.method526(-26670)) {
            class171.field3128 = 0;
        }
        if (arg6) {
            class244.method1659(28, 26473);
        } else {
            class244.method1659(25, 26473);
        }
        class93.method656(-19472, class127.field2359, true);
        int var7 = class93.field1844;
        class93.field1844 = (arg4 - 6) * 8;
        int var8 = class142.field2596;
        class142.field2596 = arg1 * 8 - 48;
        class19.field426 = class162.method1064(class3.field68 * 8, 1, class145.field2654 * 8);
        int var9 = class142.field2596 - var8;
        class27.field714 = null;
        int var10 = class93.field1844 - var7;
        int var11 = class142.field2596;
        int var12 = class93.field1844;
        if (arg6) {
            class13.field345 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class90 var14 = class31.field774[var13];
                if (var14 != null) {
                    var14.field4705 -= var9 * 128;
                    var14.field4688 -= var10 * 128;
                    if (var14.field4688 >= 0 && var14.field4688 <= 13184 && var14.field4705 >= 0 && var14.field4705 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field4714[var15] -= var10;
                            var14.field4713[var15] -= var9;
                        }
                        class117.field2191[class13.field345++] = var13;
                    } else {
                        class31.field774[var13].field1787 = null;
                        class31.field774[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class90 var32 = class31.field774[var16];
                if (var32 != null) {
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field4714[var33] -= var10;
                        var32.field4713[var33] -= var9;
                    }
                    var32.field4705 -= var9 * 128;
                    var32.field4688 -= var10 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class137 var30 = class151.field2725[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field4714[var31] -= var10;
                    var30.field4713[var31] -= var9;
                }
                var30.field4688 -= var10 * 128;
                var30.field4705 -= var9 * 128;
            }
        }
        byte var18 = 0;
        class12.field321 = arg3;
        class229.field4018.method897(false, arg2, 126, arg0);
        if (arg5 > -29) {
            method7((class86) null, (class86) null, (class74) null, 84);
        }
        byte var19 = 0;
        byte var20 = 1;
        byte var21 = 104;
        byte var22 = 1;
        byte var23 = 104;
        if (var9 < 0) {
            var21 = -1;
            var19 = 103;
            var20 = -1;
        }
        if (var10 < 0) {
            var23 = -1;
            var18 = 103;
            var22 = -1;
        }
        for (int var24 = var18; var24 != var23; var24 += var22) {
            for (int var26 = var19; var26 != var21; var26 += var20) {
                int var27 = var10 + var24;
                int var28 = var9 + var26;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class107.field2020[var29][var24][var26] = class107.field2020[var29][var27][var28];
                    } else {
                        class107.field2020[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class173 var25 = (class173) class189.field3408.method1878(true); var25 != null; var25 = (class173) class189.field3408.method1881(102)) {
            var25.field3149 -= var10;
            var25.field3140 -= var9;
            if (var25.field3149 < 0 || var25.field3140 < 0 || var25.field3149 >= 104 || var25.field3140 >= 104) {
                var25.method1614(-1204826926);
            }
        }
        class122.field2257 = -1;
        class112.field2107 = 0;
        if (arg6) {
            class109.field2048 -= var10;
            class18.field419 -= var9;
            class152.field2738 -= var9 * 128;
            class127.field2357 -= var10 * 128;
            class239.field4166 -= var9;
            class130.field2382 -= var10;
        } else {
            class89.field1772 = 1;
        }
        if (class105.field1988 != 0) {
            class105.field1988 -= var10;
            class194.field3465 -= var9;
        }
        class20.field450.method1884(-33);
        class182.field3300.method1884(-33);
    }
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class146 extends class139 {

    @OriginalMember(owner = "client!pg", name = "ab", descriptor = "I")
    private int field2985 = 0;

    @OriginalMember(owner = "client!pg", name = "eb", descriptor = "I")
    private int field2989 = 2048;

    @OriginalMember(owner = "client!pg", name = "tb", descriptor = "I")
    private int field3004 = 25;

    @OriginalMember(owner = "client!pg", name = "gb", descriptor = "I")
    private int field2991 = 1;

    @OriginalMember(owner = "client!pg", name = "rb", descriptor = "I")
    private int field3002 = 5;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
    private int field2978 = 5;

    @OriginalMember(owner = "client!pg", name = "bb", descriptor = "I")
    private int field2986 = 2;

    @OriginalMember(owner = "client!pg", name = "nb", descriptor = "[Lrf;")
    public static class163[] field2998 = new class163[1000];

    @OriginalMember(owner = "client!pg", name = "hb", descriptor = "[I")
    public static int[] field2992 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!pg", name = "sb", descriptor = "Lrf;")
    private static class163 field3003 = class53.method392(97, "Please contact customer support)3");

    @OriginalMember(owner = "client!pg", name = "jb", descriptor = "Lrf;")
    public static class163 field2994 = class53.method392(51, "Registrierter Benutzer");

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "Lrf;")
    public static class163 field2984 = class53.method392(-90, "Konfig geladen)3");

    @OriginalMember(owner = "client!pg", name = "ub", descriptor = "Lrf;")
    public static class163 field3005 = field3003;

    @OriginalMember(owner = "client!pg", name = "pb", descriptor = "Lfc;")
    public static class54 field3000 = new class54(64);

    @OriginalMember(owner = "client!pg", name = "wb", descriptor = "Lrf;")
    public static class163 field3007 = class53.method392(-48, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "I")
    private int field2982;

    @OriginalMember(owner = "client!pg", name = "cb", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!pg", name = "db", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!pg", name = "fb", descriptor = "I")
    private int field2990;

    @OriginalMember(owner = "client!pg", name = "ib", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!pg", name = "kb", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!pg", name = "lb", descriptor = "I")
    private int field2996;

    @OriginalMember(owner = "client!pg", name = "mb", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!pg", name = "ob", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!pg", name = "qb", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!pg", name = "vb", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "[[I")
    private int[][] field2983;

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class146() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lrf;Lu;Lrf;B)[Lpf;")
    public static final class145[] method945(class163 arg0, class184 arg1, class163 arg2, byte arg3) {
        if (arg3 != -35) {
            method945((class163) null, (class184) null, (class163) null, (byte) -16);
        }
        ++field2981;
        int var4 = arg1.method1228(arg3 ^ -94, arg0);
        int var5 = arg1.method1231(arg2, var4, 2);
        return class82.method552(var5, arg1, var4, 0);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)V")
    public static final void method946(int arg0, byte arg1) {
        ++field2997;
        class95 var2 = (class95) class65.field1373.method465((long) arg0, (byte) -62);
        if (arg1 == -126) {
            if (var2 != null) {
                for (int var3 = 0; ~var3 > ~var2.field2037.length; ++var3) {
                    var2.field2037[var3] = -1;
                    var2.field2038[var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        int[] var3 = super.field2859.method1319(-112, arg0);
        if (arg1 != 7451) {
            method947(-50);
        }
        ++field3001;
        if (super.field2859.field3966) {
            int var4 = class180.field3607[arg0];
            int var5 = this.field2986;
            if (~var5 != -3) {
                if (~var5 == -2) {
                    for (int var6 = 0; ~class23.field402 < ~var6; ++var6) {
                        int var7 = class189.field3772[var6];
                        var3[var6] = this.method949(2, var4, var7, -2049)[1];
                    }
                } else {
                    for (int var8 = 0; ~class23.field402 < ~var8; ++var8) {
                        int var9 = class189.field3772[var8];
                        var3[var8] = this.method949(1, var4, var9, -2049)[0];
                    }
                }
            } else {
                for (int var10 = 0; class23.field402 > var10; ++var10) {
                    int var11 = class189.field3772[var10];
                    int[] var12 = this.method949(2, var4, var11, -2049);
                    var3[var10] = var12[1] + -var12[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
    public static void method947(int arg0) {
        field2998 = null;
        field3003 = null;
        field3000 = null;
        field3005 = null;
        field2992 = null;
        field2994 = null;
        if (arg0 != Integer.MAX_VALUE) {
            field2984 = null;
        }
        field2984 = null;
        field3007 = null;
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(B)V")
    private final void method948(byte arg0) {
        ++field2999;
        Random var2 = new Random((long) this.field2985);
        this.field3004 = this.field3002 * this.field2978;
        this.field2983 = new int[this.field3004][2];
        int var3 = 4096 / this.field3002;
        this.field2996 = var3 >> 1;
        int var4 = this.field2996 * this.field2989 >> 12;
        int var5 = 4096 / this.field2978;
        this.field2982 = var5 >> 1;
        int var6 = this.field2989 * this.field2982 >> 12;
        for (int var7 = 0; this.field2978 > var7; ++var7) {
            int var9 = var5 * var7;
            for (int var10 = 0; var10 < this.field3002; ++var10) {
                int var11 = this.field3002 * var7 + var10;
                int var12 = var4 * (-4096 + class170.method1149(true, 8192, var2)) >> 12;
                int var13 = var6 * (-4096 + class170.method1149(true, 8192, var2)) >> 12;
                this.field2983[var11][0] = var3 * var10 + var12;
                this.field2983[var11][1] = var13 - -var9;
            }
        }
        int var8 = 87 / ((arg0 - 44) / 33);
        this.field2990 = this.field3002 > this.field2978 ? this.field3002 : this.field2978;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field2978 = arg2.method344(255);
                                }
                            } else {
                                this.field3002 = arg2.method344(255);
                            }
                        } else {
                            this.field2991 = arg2.method344(255);
                        }
                    } else {
                        this.field2986 = arg2.method344(255);
                    }
                } else {
                    this.field2989 = arg2.method390((byte) 97);
                }
            } else {
                this.field2985 = arg2.method344(255);
            }
        } else {
            this.field3002 = this.field2978 = arg2.method344(255);
        }
        ++field2988;
        if (arg1 != 21) {
            method945((class163) null, (class184) null, (class163) null, (byte) -57);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIII)[I")
    private final int[] method949(int arg0, int arg1, int arg2, int arg3) {
        ++field2993;
        int[] var5 = new int[arg0];
        for (int var6 = 0; ~arg0 < ~var6; ++var6) {
            var5[var6] = Integer.MAX_VALUE;
        }
        int var7 = this.field2996 + arg2;
        if (~var7 < -4097) {
            var7 -= 4096;
        }
        int var8 = this.field2982 + arg1;
        int var9 = this.field3002 * var7 >> 12;
        if (var8 > 4096) {
            var8 -= 4096;
        }
        int var10 = this.field2978 * var8 >> 12;
        int var11 = -1;
        int var12 = Integer.MAX_VALUE;
        int var13 = -1;
        int var14 = Integer.MAX_VALUE;
        int var15 = this.field3002 <= 2 ? this.field3002 + -1 : 2;
        int var16 = this.field2978 <= 2 ? this.field2978 + -1 : 2;
        for (int var17 = -var15; var15 >= var17; ++var17) {
            for (int var25 = -var16; ~var25 >= ~var16; ++var25) {
                int var26 = var9 + var17;
                if (var26 < 0) {
                    var26 += this.field3002;
                }
                if (var26 >= this.field3002) {
                    var26 -= this.field3002;
                }
                int var27 = var10 + var25;
                if (~var27 > -1) {
                    var27 += this.field2978;
                }
                if (this.field2978 <= var27) {
                    var27 -= this.field2978;
                }
                int var28 = this.field3002 * var27 + var26;
                int var29 = this.field2983[var28][1];
                int var30 = this.field2983[var28][0];
                int var31 = var7 - var30;
                if (var31 < 0) {
                    var31 = -var31;
                }
                int var32 = -var29 + var8;
                if (~var32 > -1) {
                    var32 = -var32;
                }
                if (var31 > 2048) {
                    var31 = -var31 + 4096;
                }
                if (var32 > 2048) {
                    var32 = -var32 + 4096;
                }
                int var33 = var31 * var31 + var32 * var32 >> 12;
                if (var12 > var33) {
                    if (~var11 == 0) {
                        var11 = var28;
                        var14 = var33;
                    } else {
                        var14 = var12;
                        var11 = var13;
                    }
                    var12 = var33;
                    var13 = var28;
                } else if (var11 == var13 && ~var11 != ~var28 || var33 < var14 && ~var13 != ~var28) {
                    var11 = var28;
                    var14 = var33;
                }
            }
        }
        int var18 = -this.field2983[var13][0] + var7;
        int var19 = -this.field2983[var13][1] + var8;
        if (~var19 > -1) {
            var19 = -var19;
        }
        if (~var19 < -2049) {
            var19 = -var19 + 4096;
        }
        int var20 = -this.field2983[var11][0] + var7;
        int var21 = -this.field2983[var11][1] + var8;
        if (var18 < 0) {
            var18 = -var18;
        }
        if (~var21 > -1) {
            var21 = -var21;
        }
        if (arg3 > ~var21) {
            var21 = -var21 + 4096;
        }
        if (var20 < 0) {
            var20 = -var20;
        }
        if (var20 > 2048) {
            var20 = -var20 + 4096;
        }
        if (~var18 < -2049) {
            var18 = 4096 - var18;
        }
        int var22 = this.field2991;
        int var23;
        int var24;
        if (var22 != 1) {
            if (var22 == 2) {
                var23 = Math.max(var18, var19);
                var24 = Math.max(var20, var21);
            } else {
                var23 = var18 * var18 + var19 * var19;
                var24 = var20 * var20 + var21 * var21;
            }
        } else {
            var23 = (int) Math.sqrt((double) (var18 * var18 + var19 * var19));
            var24 = (int) Math.sqrt((double) (var20 * var20 - -(var21 * var21)));
        }
        if (arg0 > 1) {
            var5[1] = this.field2990 * var24;
        }
        var5[0] = this.field2990 * var23;
        return var5;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    public final void method127(int arg0) {
        if (arg0 != 0) {
            field2992 = null;
        }
        ++field3006;
        this.method948((byte) -82);
    }

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)V")
    public static final void method950(int arg0) {
        ++field2980;
        class31.method209(arg0 + 1919, false);
        class103.field2153 = 0;
        boolean var1 = true;
        for (int var2 = 0; ~class163.field3347.length < ~var2; ++var2) {
            if (class73.field1524[var2] != -1 && class163.field3347[var2] == null) {
                class163.field3347[var2] = class72.field1519.method1235(0, (byte) -64, class73.field1524[var2]);
                if (class163.field3347[var2] == null) {
                    ++class103.field2153;
                    var1 = false;
                }
            }
            if (~class39.field809[var2] != 0 && class163.field3324[var2] == null) {
                class163.field3324[var2] = class72.field1519.method1241(0, (byte) 120, class60.field1221[var2], class39.field809[var2]);
                if (class163.field3324[var2] == null) {
                    var1 = false;
                    ++class103.field2153;
                }
            }
        }
        if (!var1) {
            class124.field2583 = 1;
        } else {
            class141.field2900 = 0;
            boolean var3 = true;
            for (int var4 = 0; class163.field3347.length > var4; ++var4) {
                byte[] var56 = class163.field3324[var4];
                if (var56 != null) {
                    int var57 = (class25.field460[var4] >> 8) * 64 + -class172.field3493;
                    int var58 = (class25.field460[var4] & 255) * 64 + -class69.field1470;
                    if (class186.field3715) {
                        var58 = 10;
                        var57 = 10;
                    }
                    var3 &= class136.method896(var57, (byte) 72, var56, var58);
                }
            }
            if (!var3) {
                class124.field2583 = 2;
            } else {
                if (class124.field2583 != 0) {
                    class48.method293(true, class180.method1216(new class163[] { class95.field2034, class9.field186 }, false), true);
                }
                client.method198((byte) -127);
                class114.method783(-78);
                client.method198((byte) -119);
                class7.method62();
                client.method198((byte) -123);
                System.gc();
                for (int var5 = 0; ~var5 > -5; ++var5) {
                    class103.field2163[var5].method871((byte) 88);
                }
                if (arg0 != 8) {
                    field3007 = null;
                }
                for (int var6 = 0; var6 < 4; ++var6) {
                    for (int var54 = 0; var54 < 104; ++var54) {
                        for (int var55 = 0; ~var55 > -105; ++var55) {
                            class21.field372[var6][var54][var55] = 0;
                        }
                    }
                }
                client.method198((byte) -114);
                class51.method330((byte) 94);
                int var7 = class163.field3347.length;
                class152.method979(-29);
                class31.method209(1927, true);
                if (!class186.field3715) {
                    for (int var8 = 0; var8 < var7; ++var8) {
                        int var17 = (class25.field460[var8] >> 8) * 64 + -class172.field3493;
                        int var18 = (class25.field460[var8] & 255) * 64 + -class69.field1470;
                        byte[] var19 = class163.field3347[var8];
                        if (var19 != null) {
                            client.method198((byte) -128);
                            class143.method928((class116.field2454 + -6) * 8, class103.field2163, (byte) -54, (class23.field403 + -6) * 8, var17, var19, var18);
                        }
                    }
                    for (int var9 = 0; ~var9 > ~var7; ++var9) {
                        int var14 = (class25.field460[var9] >> 8) * 64 + -class172.field3493;
                        byte[] var15 = class163.field3347[var9];
                        int var16 = (class25.field460[var9] & 255) * 64 - class69.field1470;
                        if (var15 == null && ~class23.field403 > -801) {
                            client.method198((byte) -125);
                            class23.method139(64, var14, var16, 0, 64);
                        }
                    }
                    class31.method209(1927, true);
                    for (int var10 = 0; ~var10 > ~var7; ++var10) {
                        byte[] var11 = class163.field3324[var10];
                        if (var11 != null) {
                            int var12 = (class25.field460[var10] >> 8) * 64 + -class172.field3493;
                            int var13 = (255 & class25.field460[var10]) * 64 + -class69.field1470;
                            client.method198((byte) -122);
                            class101.method692(var13, var12, var11, class103.field2163, 2);
                        }
                    }
                }
                if (class186.field3715) {
                    for (int var20 = 0; ~var20 > -5; ++var20) {
                        client.method198((byte) -122);
                        for (int var34 = 0; var34 < 13; ++var34) {
                            for (int var35 = 0; ~var35 > -14; ++var35) {
                                int var36 = class16.field270[var20][var34][var35];
                                boolean var37 = false;
                                if (var36 != -1) {
                                    int var38 = (var36 & 54252657) >> 24;
                                    int var39 = var36 >> 1 & 3;
                                    int var40 = var36 >> 14 & 1023;
                                    int var41 = (var36 & 16378) >> 3;
                                    int var42 = (var40 / 8 << 8) - -(var41 / 8);
                                    for (int var43 = 0; ~class25.field460.length < ~var43; ++var43) {
                                        if (~class25.field460[var43] == ~var42 && class163.field3347[var43] != null) {
                                            var37 = true;
                                            class172.method1154(true, class103.field2163, (7 & var40) * 8, var20, (var41 & 7) * 8, var34 * 8, class163.field3347[var43], var38, var35 * 8, var39);
                                            break;
                                        }
                                    }
                                }
                                if (!var37) {
                                    class64.method459(var35 * 8, var20, false, var34 * 8);
                                }
                            }
                        }
                    }
                    for (int var21 = 0; ~var21 > -14; ++var21) {
                        for (int var32 = 0; ~var32 > -14; ++var32) {
                            int var33 = class16.field270[0][var21][var32];
                            if (var33 == -1) {
                                class23.method139(8, var21 * 8, var32 * 8, 0, 8);
                            }
                        }
                    }
                    class31.method209(1927, true);
                    for (int var22 = 0; var22 < 4; ++var22) {
                        client.method198((byte) -117);
                        for (int var23 = 0; var23 < 13; ++var23) {
                            for (int var24 = 0; var24 < 13; ++var24) {
                                int var25 = class16.field270[var22][var23][var24];
                                if (var25 != -1) {
                                    int var26 = 3 & var25 >> 24;
                                    int var27 = (7 & var25) >> 1;
                                    int var28 = 1023 & var25 >> 14;
                                    int var29 = (16380 & var25) >> 3;
                                    int var30 = (var28 / 8 << 8) + var29 / 8;
                                    for (int var31 = 0; ~var31 > ~class25.field460.length; ++var31) {
                                        if (class25.field460[var31] == var30 && class163.field3324[var31] != null) {
                                            class105.method719((var29 & 7) * 8, -1, var24 * 8, var22, class103.field2163, var23 * 8, (7 & var28) * 8, var26, class163.field3324[var31], var27);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class31.method209(1927, true);
                class114.method783(80);
                client.method198((byte) -124);
                class189.method1276(class103.field2163, arg0 ^ -39);
                class31.method209(1927, true);
                int var44 = class132.field2751;
                if (var44 > class60.field1227) {
                    var44 = class60.field1227;
                }
                if (~(class60.field1227 + -1) < ~var44) {
                    int var45 = class60.field1227 - 1;
                }
                if (!class86.field1880) {
                    class25.method153(0);
                } else {
                    class25.method153(class132.field2751);
                }
                for (int var46 = 0; var46 < 104; ++var46) {
                    for (int var53 = 0; var53 < 104; ++var53) {
                        class88.method616((byte) -17, var53, var46);
                    }
                }
                client.method198((byte) -119);
                class69.method490(0);
                class114.method783(112);
                if (class141.field2907 != null) {
                    class141.field2896.method326(104, 83);
                    class141.field2896.method369(1057001181, (byte) -128);
                    ++class7.field145;
                }
                if (!class186.field3715) {
                    int var47 = (class116.field2454 + -6) / 8;
                    int var48 = (class116.field2454 + 6) / 8;
                    int var49 = (class23.field403 - 6) / 8;
                    int var50 = (class23.field403 + 6) / 8;
                    for (int var51 = var47 + -1; ~var51 >= ~(var48 - -1); ++var51) {
                        for (int var52 = var49 + -1; ~var52 >= ~(var50 + 1); ++var52) {
                            if (~var51 > ~var47 || ~var51 < ~var48 || ~var49 < ~var52 || var50 < var52) {
                                class72.field1519.method1239(class180.method1216(new class163[] { class39.field804, class34.method217(var51, -85), class115.field2431, class34.method217(var52, arg0 ^ -59) }, false), arg0 + -107);
                                class72.field1519.method1239(class180.method1216(new class163[] { class74.field1549, class34.method217(var51, -44), class115.field2431, class34.method217(var52, -71) }, false), -69);
                            }
                        }
                    }
                }
                class84.method589(30, -26);
                client.method198((byte) -122);
                class56.method409(-30791);
                class141.field2896.method326(104, 97);
                class101.method691((byte) -79);
            }
        }
    }
}

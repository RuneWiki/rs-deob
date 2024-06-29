import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class171 extends class106 {

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    public int field3112;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    private int field3109;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "[I")
    public int[] field3113;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "[Z")
    private boolean[] field3110;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "[[I")
    public int[][] field3108;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field3104 = 0;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field3106 = 0;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1098(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != 15) {
            return;
        }
        if (arg3 <= class154.field2793 && class233.field4281 <= arg1) {
            boolean var6;
            if (arg2 < class79.field1526) {
                arg2 = class79.field1526;
                var6 = false;
            } else if (class25.field524 >= arg2) {
                var6 = true;
            } else {
                var6 = false;
                arg2 = class25.field524;
            }
            boolean var7;
            if (arg0 < class79.field1526) {
                arg0 = class79.field1526;
                var7 = false;
            } else if (class25.field524 >= arg0) {
                var7 = true;
            } else {
                var7 = false;
                arg0 = class25.field524;
            }
            if (class233.field4281 <= arg3) {
                class55.method380(arg4, 125, class43.field887[arg3++], arg2, arg0);
            } else {
                arg3 = class233.field4281;
            }
            if (arg1 <= class154.field2793) {
                class55.method380(arg4, arg5 + 108, class43.field887[arg1--], arg2, arg0);
            } else {
                arg1 = class154.field2793;
            }
            if (var7 && var6) {
                for (int var8 = arg3; var8 <= arg1; var8++) {
                    int[] var9 = class43.field887[var8];
                    var9[arg0] = var9[arg2] = arg4;
                }
            } else if (var7) {
                for (int var10 = arg3; var10 <= arg1; var10++) {
                    class43.field887[var10][arg0] = arg4;
                }
            } else if (var6) {
                for (int var11 = arg3; var11 <= arg1; var11++) {
                    class43.field887[var11][arg2] = arg4;
                }
            }
        }
        field3107++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lvg;IIIIIII)V")
    public static final void method1099(class225 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8;
        int var9 = var8 = (arg6 << 7) - class1.field42;
        int var10;
        int var11 = var10 = (arg7 << 7) - class73.field1426;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14;
        int var15 = var14 = var11 + 128;
        int var16 = class233.field4286[arg1][arg6][arg7] - class116.field2084;
        int var17 = class233.field4286[arg1][arg6 + 1][arg7] - class116.field2084;
        int var18 = class233.field4286[arg1][arg6 + 1][arg7 + 1] - class116.field2084;
        int var19 = class233.field4286[arg1][arg6][arg7 + 1] - class116.field2084;
        int var20 = arg4 * var11 + arg5 * var9 >> 16;
        int var21 = arg5 * var11 - arg4 * var9 >> 16;
        int var23 = arg3 * var16 - arg2 * var21 >> 16;
        int var24 = arg2 * var16 + arg3 * var21 >> 16;
        if (var24 < 50) {
            return;
        }
        int var26 = arg4 * var10 + arg5 * var13 >> 16;
        int var27 = arg5 * var10 - arg4 * var13 >> 16;
        int var29 = arg3 * var17 - arg2 * var27 >> 16;
        int var30 = arg2 * var17 + arg3 * var27 >> 16;
        if (var30 < 50) {
            return;
        }
        int var32 = arg4 * var15 + arg5 * var12 >> 16;
        int var33 = arg5 * var15 - arg4 * var12 >> 16;
        int var35 = arg3 * var18 - arg2 * var33 >> 16;
        int var36 = arg2 * var18 + arg3 * var33 >> 16;
        if (var36 < 50) {
            return;
        }
        int var38 = arg4 * var14 + arg5 * var8 >> 16;
        int var39 = arg5 * var14 - arg4 * var8 >> 16;
        int var41 = arg3 * var19 - arg2 * var39 >> 16;
        int var42 = arg2 * var19 + arg3 * var39 >> 16;
        if (var42 < 50) {
            return;
        }
        int var44 = class61.field1196;
        int var45 = class61.field1204;
        int var46 = (var20 << 9) / var24 + var44;
        int var47 = (var23 << 9) / var24 + var45;
        int var48 = (var26 << 9) / var30 + var44;
        int var49 = (var29 << 9) / var30 + var45;
        int var50 = (var32 << 9) / var36 + var44;
        int var51 = (var35 << 9) / var36 + var45;
        int var52 = (var38 << 9) / var42 + var44;
        int var53 = (var41 << 9) / var42 + var45;
        class61.field1201 = 0;
        if ((var49 - var53) * (var50 - var52) - (var48 - var52) * (var51 - var53) > 0) {
            if (class138.field2510 && class231.method1510(class2.field70, class15.field358, var51, var53, var49, var50, var52, var48)) {
                class124.field2234 = arg6;
                class11.field209 = arg7;
            }
            class61.field1206 = false;
            if (var50 < 0 || var52 < 0 || var48 < 0 || var50 > class61.field1203 || var52 > class61.field1203 || var48 > class61.field1203) {
                class61.field1206 = true;
            }
            if (arg0.field3915 == -1) {
                if (arg0.field3928 != 12345678) {
                    class61.method405(var51, var53, var49, var50, var52, var48, arg0.field3928, arg0.field3921, arg0.field3914);
                }
            } else if (class16.field365) {
                int var54 = class61.field1198.method462(true, arg0.field3915);
                class61.method405(var51, var53, var49, var50, var52, var48, class122.method740(var54, arg0.field3928), class122.method740(var54, arg0.field3921), class122.method740(var54, arg0.field3914));
            } else if (arg0.field3930) {
                class61.method412(var51, var53, var49, var50, var52, var48, arg0.field3928, arg0.field3921, arg0.field3914, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field3915);
            } else {
                class61.method412(var51, var53, var49, var50, var52, var48, arg0.field3928, arg0.field3921, arg0.field3914, var32, var38, var26, var35, var41, var29, var36, var42, var30, arg0.field3915);
            }
        }
        if ((var46 - var48) * (var53 - var49) - (var47 - var49) * (var52 - var48) <= 0) {
            return;
        }
        if (class138.field2510 && class231.method1510(class2.field70, class15.field358, var47, var49, var53, var46, var48, var52)) {
            class124.field2234 = arg6;
            class11.field209 = arg7;
        }
        class61.field1206 = false;
        if (var46 < 0 || var48 < 0 || var52 < 0 || var46 > class61.field1203 || var48 > class61.field1203 || var52 > class61.field1203) {
            class61.field1206 = true;
        }
        if (arg0.field3915 != -1) {
            if (!class16.field365) {
                class61.method412(var47, var49, var53, var46, var48, var52, arg0.field3926, arg0.field3914, arg0.field3921, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field3915);
                return;
            }
            int var55 = class61.field1198.method462(true, arg0.field3915);
            class61.method405(var47, var49, var53, var46, var48, var52, class122.method740(var55, arg0.field3926), class122.method740(var55, arg0.field3914), class122.method740(var55, arg0.field3921));
        } else if (arg0.field3926 != 12345678) {
            class61.method405(var47, var49, var53, var46, var48, var52, arg0.field3926, arg0.field3914, arg0.field3921);
            return;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public static final void method1100(int arg0) {
        field3105++;
        try {
            if (class36.field739 == 0) {
                if (class142.field2588 != null) {
                    class142.field2588.method336(-13112);
                    class142.field2588 = null;
                }
                class225.field3919 = null;
                class36.field739 = 1;
                class174.field3157 = 0;
                class217.field3786 = false;
            }
            if (class36.field739 == 1) {
                if (class225.field3919 == null) {
                    class225.field3919 = class174.field3151.method258(class36.field745, class191.field3373, (byte) -67);
                }
                if (class225.field3919.field1501 == 2) {
                    throw new IOException();
                }
                if (class225.field3919.field1501 == 1) {
                    class142.field2588 = new class47((Socket) class225.field3919.field1503, class174.field3151);
                    class225.field3919 = null;
                    class36.field739 = 2;
                }
            }
            if (class36.field739 == 2) {
                long var1 = class162.field2939 = class160.field2899.method981(false);
                class48.field984.field4101 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class48.field984.method1447(-1, 14);
                class48.field984.method1447(-1, var3);
                class142.field2588.method331(51, 2, class48.field984.field4087, 0);
                class1.field34.field4101 = 0;
                class36.field739 = 3;
            }
            if (class36.field739 == 3) {
                if (class64.field1251 != null) {
                    class64.field1251.method1063(21835);
                }
                if (class137.field2498 != null) {
                    class137.field2498.method1063(21835);
                }
                int var4 = class142.field2588.method339((byte) 107);
                if (class64.field1251 != null) {
                    class64.field1251.method1063(21835);
                }
                if (class137.field2498 != null) {
                    class137.field2498.method1063(21835);
                }
                if (var4 != 0) {
                    class78.method507((byte) 95, var4);
                    return;
                }
                class1.field34.field4101 = 0;
                class36.field739 = 4;
            }
            if (class36.field739 == 4) {
                if (class1.field34.field4101 < 8) {
                    int var5 = class142.field2588.method337(true);
                    if (var5 > 8 - class1.field34.field4101) {
                        var5 = 8 - class1.field34.field4101;
                    }
                    if (var5 > 0) {
                        class142.field2588.method334((byte) 95, class1.field34.field4087, class1.field34.field4101, var5);
                        class1.field34.field4101 += var5;
                    }
                }
                if (class1.field34.field4101 == 8) {
                    class1.field34.field4101 = 0;
                    class202.field3597 = class1.field34.method1469((byte) -13);
                    class36.field739 = 5;
                }
            }
            if (class36.field739 == 5) {
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class202.field3597 >> 32), (int) class202.field3597 };
                class48.field984.field4101 = 0;
                class48.field984.method1447(arg0 ^ 0xFFFFFFF7, 10);
                class48.field984.method1461(var6[0], (byte) 88);
                class48.field984.method1461(var6[1], (byte) 105);
                class48.field984.method1461(var6[2], (byte) 53);
                class48.field984.method1461(var6[3], (byte) 80);
                class48.field984.method1458((byte) 80, class160.field2899.method981(false));
                class48.field984.method1479(class160.field2871, 165744536);
                class48.field984.method1460(class40.field823, arg0 ^ 0x8, class156.field2824);
                class163.field2948.field4101 = 0;
                if (class200.field3534 == 40) {
                    class163.field2948.method1447(-1, 18);
                } else {
                    class163.field2948.method1447(arg0 - 9, 16);
                }
                class163.field2948.method1447(arg0 ^ 0xFFFFFFF7, class48.field984.field4101 + class65.method431(class215.field3767, 1) + 129);
                class163.field2948.method1461(493, (byte) 117);
                class163.field2948.method1447(-1, class13.field300 ? 1 : 0);
                class120.method724(-30891, class163.field2948);
                class163.field2948.method1479(class215.field3767, 165744536);
                class163.field2948.method1461(class175.field3175, (byte) 26);
                class163.field2948.method1461(class155.field2810.field3422, (byte) 42);
                class163.field2948.method1461(class228.field4023.field3422, (byte) 39);
                class163.field2948.method1461(class175.field3181.field3422, (byte) 61);
                class163.field2948.method1461(class178.field3224.field3422, (byte) 120);
                class163.field2948.method1461(class56.field1126.field3422, (byte) 115);
                class163.field2948.method1461(class140.field2548.field3422, (byte) 52);
                class163.field2948.method1461(class16.field363.field3422, (byte) 42);
                class163.field2948.method1461(class176.field3188.field3422, (byte) 104);
                class163.field2948.method1461(class164.field2960.field3422, (byte) 96);
                class163.field2948.method1461(class36.field738.field3422, (byte) 92);
                class163.field2948.method1461(class23.field521.field3422, (byte) 110);
                class163.field2948.method1461(class106.field1884.field3422, (byte) 87);
                class163.field2948.method1461(class222.field3853.field3422, (byte) 126);
                class163.field2948.method1461(class36.field755.field3422, (byte) 61);
                class163.field2948.method1461(class200.field3540.field3422, (byte) 79);
                class163.field2948.method1461(class48.field993.field3422, (byte) 73);
                class163.field2948.method1461(class164.field2964.field3422, (byte) 30);
                class163.field2948.method1461(class91.field1661.field3422, (byte) 109);
                class163.field2948.method1461(class236.field4383.field3422, (byte) 52);
                class163.field2948.method1461(class91.field1668.field3422, (byte) 59);
                class163.field2948.method1461(class56.field1127.field3422, (byte) 73);
                class163.field2948.method1461(class37.field777.field3422, (byte) 84);
                class163.field2948.method1461(class40.field829.field3422, (byte) 76);
                class163.field2948.method1461(class58.field1164.field3422, (byte) 25);
                class163.field2948.method1468(class48.field984.field4101, class48.field984.field4087, 0, (byte) 126);
                class142.field2588.method331(47, class163.field2948.field4101, class163.field2948.field4087, 0);
                class48.field984.method655(var6, arg0 ^ 0x8);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class1.field34.method655(var6, 0);
                class36.field739 = 6;
            }
            if (class36.field739 == 6 && class142.field2588.method337(true) > 0) {
                int var8 = class142.field2588.method339((byte) 102);
                if (var8 == 21 && class200.field3534 == 20) {
                    class36.field739 = 7;
                } else if (var8 == 2) {
                    class36.field739 = 9;
                } else if (var8 == 15 && class200.field3534 == 40) {
                    class47.method333((byte) -66);
                    return;
                } else if (var8 == 23 && class7.field105 < 1) {
                    class7.field105++;
                    class36.field739 = 0;
                } else {
                    class78.method507((byte) 95, var8);
                    return;
                }
            }
            if (class36.field739 == 7 && class142.field2588.method337(true) > 0) {
                class157.field2841 = class142.field2588.method339((byte) 108) * 60 + 180;
                class36.field739 = 8;
            }
            if (class36.field739 == arg0) {
                class174.field3157 = 0;
                class203.method1286(class182.field3283, -28588, class126.method761(new class151[] { class137.method874(class157.field2841 / 60, false), class225.field3918 }, 10260), class81.field1548);
                if (--class157.field2841 <= 0) {
                    class36.field739 = 0;
                }
            } else {
                if (class36.field739 == 9 && class142.field2588.method337(true) >= 9) {
                    class150.field2683 = class142.field2588.method339((byte) 103);
                    class228.field4005 = class142.field2588.method339((byte) 107);
                    class3.field73 = class142.field2588.method339((byte) -67) == 1;
                    class163.field2943 = class142.field2588.method339((byte) 109);
                    class163.field2943 <<= 0x8;
                    class163.field2943 += class142.field2588.method339((byte) -8);
                    class64.field1246 = class142.field2588.method339((byte) 109);
                    class142.field2588.method334((byte) 95, class1.field34.field4087, 0, 1);
                    class1.field34.field4101 = 0;
                    class219.field3813 = class1.field34.method654((byte) 12);
                    class142.field2588.method334((byte) 95, class1.field34.field4087, 0, 2);
                    class1.field34.field4101 = 0;
                    class68.field1329 = class1.field34.method1490((byte) 73);
                    class36.field739 = 10;
                }
                if (class36.field739 != 10) {
                    class174.field3157++;
                    if (class174.field3157 > 2000) {
                        if (class7.field105 < 1) {
                            class36.field739 = 0;
                            if (class36.field745 == class206.field3657) {
                                class36.field745 = class203.field3606;
                            } else {
                                class36.field745 = class206.field3657;
                            }
                            class7.field105++;
                        } else {
                            class78.method507((byte) 95, -3);
                        }
                    }
                } else if (class142.field2588.method337(true) >= class68.field1329) {
                    class1.field34.field4101 = 0;
                    class142.field2588.method334((byte) 95, class1.field34.field4087, 0, class68.field1329);
                    class213.method1334(arg0 ^ 0xA8);
                    class169.field3089 = -1;
                    class212.method1328((byte) 117, false);
                    class219.field3813 = -1;
                }
            }
        } catch (IOException var9) {
            if (class7.field105 < 1) {
                class36.field739 = 0;
                class7.field105++;
                if (class36.field745 == class206.field3657) {
                    class36.field745 = class203.field3606;
                } else {
                    class36.field745 = class206.field3657;
                }
            } else {
                class78.method507((byte) 95, -2);
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I[B)V")
    public class171(int arg0, byte[] arg1) {
        this.field3112 = arg0;
        class229 var3 = new class229(arg1);
        this.field3109 = var3.method1475(255);
        this.field3113 = new int[this.field3109];
        this.field3110 = new boolean[this.field3109];
        this.field3108 = new int[this.field3109][];
        for (int var4 = 0; var4 < this.field3109; var4++) {
            this.field3113[var4] = var3.method1475(255);
        }
        for (int var5 = 0; var5 < this.field3109; var5++) {
            this.field3110[var5] = var3.method1475(255) == 1;
        }
        for (int var6 = 0; var6 < this.field3109; var6++) {
            this.field3108[var6] = new int[var3.method1475(255)];
        }
        for (int var7 = 0; var7 < this.field3109; var7++) {
            for (int var8 = 0; var8 < this.field3108[var7].length; var8++) {
                this.field3108[var7][var8] = var3.method1475(255);
            }
        }
    }
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class232 extends class200 {

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
    private int field4078 = 16;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "I")
    private int field4082 = 0;

    @OriginalMember(owner = "client!kk", name = "Y", descriptor = "I")
    private int field4088 = 4096;

    @OriginalMember(owner = "client!kk", name = "Z", descriptor = "I")
    private int field4089 = 0;

    @OriginalMember(owner = "client!kk", name = "V", descriptor = "I")
    private int field4085 = 2000;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "[I")
    public static int[] field4080 = new int[32];

    @OriginalMember(owner = "client!kk", name = "X", descriptor = "Lid;")
    public static class149 field4087 = class60.method382(" GMT", (byte) 102);

    @OriginalMember(owner = "client!kk", name = "T", descriptor = "[I")
    public static int[] field4083 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!kk", name = "cb", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!kk", name = "db", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!kk", name = "eb", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!kk", name = "U", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!kk", name = "W", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!kk", name = "ab", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!kk", name = "bb", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "Lal;")
    public static class230 field4081;

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
    public class232() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(B)V")
    public static void method1566(byte arg0) {
        field4083 = null;
        field4087 = null;
        field4080 = null;
        if (arg0 <= 89) {
            field4083 = null;
        }
        field4081 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        if (arg1 != 55) {
            this.method31((class74) null, true, 94);
        }
        ++field4090;
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            int var4 = this.field4088 >> 1;
            int[][] var5 = super.field3638.method1885((byte) 103);
            Random var6 = new Random((long) this.field4089);
            for (int var7 = 0; this.field4085 > var7; ++var7) {
                int var8 = this.field4088 <= 0 ? this.field4082 : this.field4082 - (var4 + -class35.method200(0, var6, this.field4088));
                int var9 = 255 & var8 >> 4;
                int var10 = class35.method200(118, var6, class137.field2515);
                int var11 = class35.method200(125, var6, class276.field4934);
                int var12 = (class106.field1832[var9] * this.field4078 >> 12) + var10;
                int var13 = var12 - var10;
                int var14 = (class270.field4860[var9] * this.field4078 >> 12) + var11;
                int var15 = -var11 + var14;
                if (var13 != 0 || ~var15 != -1) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    boolean var16 = ~var15 < ~var13;
                    if (var16) {
                        int var17 = var12;
                        int var18 = var10;
                        var12 = var14;
                        var14 = var17;
                        var10 = var11;
                        var11 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var14;
                        var14 = var20;
                        var12 = var19;
                    }
                    int var21 = var11;
                    int var22 = var14 - var11;
                    int var23 = -var10 + var12;
                    if (~var22 > -1) {
                        var22 = -var22;
                    }
                    int var24 = 2048 / var23;
                    int var25 = -var23 / 2;
                    int var26 = ~var14 < ~var11 ? 1 : -1;
                    int var27 = 1024 + -(class35.method200(-69, var6, 4096) >> 2);
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        var25 += var22;
                        int var29 = var28 & class261.field4667;
                        int var30 = var21 & class191.field3436;
                        if (~var25 < -1) {
                            var25 -= var23;
                            var21 -= -var26;
                        }
                        int var31 = var27 - -1024 - -((-var10 + var28) * var24);
                        if (var16) {
                            var5[var30][var29] = var31;
                        } else {
                            var5[var29][var30] = var31;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
    public final void method150(int arg0) {
        ++field4084;
        class124.method871(-124);
        int var2 = 47 / ((-60 - arg0) / 62);
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V")
    public static final void method1567(int arg0) {
        class41.field646.method1291(0);
        ++field4079;
        class116.field1987.method1291(0);
        if (arg0 >= -1) {
            method1567(45);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BIIIIZ)V")
    public static final void method1568(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4091;
        ++class86.field1567;
        class32.method191(3658);
        if (!arg5) {
            class111.method786(arg0 + -34, true);
            class85.method636(true, -14896);
            class111.method786(121, false);
        }
        class85.method636(false, arg0 ^ -14938);
        if (!arg5) {
            class100.method717(arg0 + -32);
        }
        class10.method56(1);
        if (class194.field3468 == 1) {
            int var6 = class57.field1004;
            int var7 = class55.field985 - -class156.field2872 & 2047;
            if (~(class75.field1365 / 256) < ~var6) {
                var6 = class75.field1365 / 256;
            }
            if (class201.field3650[4] && ~var6 > ~(class249.field4370[4] + 128)) {
                var6 = class249.field4370[4] + 128;
            }
            class71.method444(class287.method1968(class277.field4948, class77.field1449.field2347, class77.field1449.field2340, (byte) 98) + -50, arg0 + -8, var6 * 3 + 600, var7, class75.field1351, var6, arg1, class86.field1569);
        }
        int var8 = class269.field4853;
        int var9 = class10.field140;
        if (arg0 == 118) {
            int var10 = class2.field29;
            int var11 = class186.field3354;
            int var12 = class147.field2646;
            for (int var13 = 0; ~var13 > -6; ++var13) {
                if (class201.field3650[var13]) {
                    int var19 = (int) (Math.random() * (double) (class25.field376[var13] * 2 + 1) - (double) class25.field376[var13] + Math.sin((double) class206.field3694[var13] / 100.0D * (double) class27.field408[var13]) * (double) class249.field4370[var13]);
                    if (~var13 == -2) {
                        class10.field140 += var19;
                    }
                    if (var13 == 4) {
                        class186.field3354 += var19;
                        if (~class186.field3354 > -129) {
                            class186.field3354 = 128;
                        }
                        if (~class186.field3354 < -384) {
                            class186.field3354 = 383;
                        }
                    }
                    if (~var13 == -1) {
                        class269.field4853 += var19;
                    }
                    if (var13 == 3) {
                        class147.field2646 = class147.field2646 - -var19 & 2047;
                    }
                    if (var13 == 2) {
                        class2.field29 += var19;
                    }
                }
            }
            class162.method1194(true);
            class72.method461(arg4, arg3, arg4 - -arg2, arg1 + arg3);
            class235.method1584();
            if (!class32.field481 && ~arg4 >= ~class189.field3383 && ~class189.field3383 > ~(arg2 + arg4) && arg3 <= class2.field32 && arg1 + arg3 > class2.field32) {
                class133.field2429 = 0;
                int var14 = class159.field2926;
                int var15 = class102.field1800;
                class226.field3958 = (-arg4 + class189.field3383) * (-var14 + var15) / arg2 + var14;
                int var16 = class284.field5023;
                class61.field1105 = true;
                int var17 = class240.field4198;
                class2.field26 = (-arg3 + class2.field32) * (-var16 + var17) / arg1 + var16;
            } else {
                class61.field1105 = false;
                class133.field2429 = 0;
            }
            class279.method1923(64);
            byte var18 = ~class94.method687(0) != -3 ? 1 : (byte) class86.field1567;
            class72.method459(arg4, arg3, arg2, arg1, 0);
            class63.method398(class269.field4853, class10.field140, class2.field29, class186.field3354, class147.field2646, class135.field2449, class151.field2749, class190.field3409, class24.field355, class216.field3808, class94.field1661, class277.field4948 + 1, var18, class77.field1449.field2347 >> 7, class77.field1449.field2340 >> 7);
            class279.method1923(arg0 + -54);
            class126.method880();
            class115.method797(arg3, 256, arg4, 256, arg2, arg1, 20);
            class230.method1561(256, arg4, arg2, arg0 ^ -119, arg1, 256, arg3);
            ((class136) class235.field4129).method952(class149.field2683, (byte) -33);
            class151.method1076(arg2, arg1, arg4, arg3, arg0 ^ -48);
            class186.field3354 = var11;
            class10.field140 = var9;
            class2.field29 = var10;
            class269.field4853 = var8;
            class147.field2646 = var12;
            if (class59.field1059 && class271.field4868.method327((byte) -105) == 0) {
                class59.field1059 = false;
            }
            if (class59.field1059) {
                class72.method459(arg4, arg3, arg2, arg1, 0);
                class73.method471(class3.field39, false, (byte) -48);
            }
            if (!arg5 && !class59.field1059 && !class32.field481 && ~class189.field3383 <= ~arg4 && arg2 + arg4 > class189.field3383 && ~arg3 >= ~class2.field32 && class2.field32 < arg1 + arg3) {
                class75.method539(arg3, class189.field3383, -127, arg2, arg1, class2.field32, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (arg1) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (~arg2 != -4) {
                            if (arg2 == 4) {
                                this.field4088 = arg0.method485(-2386);
                            }
                        } else {
                            this.field4082 = arg0.method485(-2386);
                        }
                    } else {
                        this.field4078 = arg0.method489((byte) 117);
                    }
                } else {
                    this.field4085 = arg0.method485(-2386);
                }
            } else {
                this.field4089 = arg0.method489((byte) 119);
            }
            ++field4086;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field4080[var1] = var0 + -1;
            var0 += var0;
        }
        field4092 = 0;
        field4093 = 0;
        field4094 = 2;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class7 extends class195 {

    @OriginalMember(owner = "client!fc", name = "cb", descriptor = "I")
    private int field158 = 0;

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "I")
    private int field156 = 4096;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "Lck;")
    public static class119 field150 = class298.method1987((byte) 57, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!fc", name = "bb", descriptor = "[I")
    public static int[] field157 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!fc", name = "db", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "[I")
    public static int[] field152;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lfj;II)V", line = 5)
    public final void method13(class3 arg0, int arg1, int arg2) {
        field154++;
        if (arg1 > -117) {
            return;
        }
        if (arg2 == 0) {
            this.field158 = arg0.method63((byte) 1);
        } else if (arg2 == 1) {
            this.field156 = arg0.method63((byte) 1);
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V", line = 42)
    public static void method86(int arg0) {
        field157 = null;
        field150 = null;
        field152 = null;
        if (arg0 != 15) {
            field152 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILba;II)V", line = 60)
    public static final void method87(int arg0, int arg1, class292 arg2, int arg3, int arg4) {
        int var5 = 19 % ((arg4 + 71) / 55);
        field151++;
        if (class124.field1917 == arg2 || class272.field4474 >= 400) {
            return;
        }
        class119 var6;
        if (arg2.field4873 == 0) {
            var6 = class170.method1074(new class119[] { arg2.field4861, class169.method1068(arg2.field4858, class124.field1917.field4858, -23736), class131.field2004, class96.field1466, class234.method1506(arg2.field4858, (byte) -79), class262.field4255 }, -71);
        } else {
            var6 = class170.method1074(new class119[] { arg2.field4861, class131.field2004, class92.field1424, class234.method1506(arg2.field4873, (byte) -79), class262.field4255 }, -116);
        }
        if (class198.field3171 == 1) {
            class173.field2741++;
            class222.method1411(class170.method1074(new class119[] { class283.field4673, class298.field5029, var6 }, -79), -32768, arg3, class169.field2678, arg1, (short) 7, (long) arg0);
        } else if (!class114.field1725) {
            for (int var7 = 7; var7 >= 0; var7--) {
                if (class106.field1636[var7] != null) {
                    boolean var8 = false;
                    short var9 = 0;
                    if (class23.field359 == 0 && class106.field1636[var7].method793(class206.field3288, 40)) {
                        if (arg2.field4858 > class124.field1917.field4858) {
                            var9 = 2000;
                        }
                        if (class124.field1917.field4850 != 0 && arg2.field4850 != 0) {
                            if (class124.field1917.field4850 == arg2.field4850) {
                                var9 = 2000;
                            } else {
                                var9 = 0;
                            }
                        }
                    } else if (class154.field2452[var7]) {
                        var9 = 2000;
                    }
                    short var10 = class279.field4604[var7];
                    short var11 = (short) (var9 + var10);
                    class222.method1411(class170.method1074(new class119[] { class262.field4271, var6 }, -115), -32768, arg3, class106.field1636[var7], arg1, var11, (long) arg0);
                    class87.field1312++;
                }
            }
        } else if ((class205.field3249 & 0x8) == 8) {
            class285.field4705++;
            class222.method1411(class170.method1074(new class119[] { class150.field2388, class298.field5029, var6 }, -88), -32768, arg3, class227.field3633, arg1, (short) 10, (long) arg0);
        }
        for (int var12 = 0; var12 < class272.field4474; var12++) {
            if (class88.field1355[var12] == 33) {
                class212.field3398[var12] = class170.method1074(new class119[] { class262.field4271, var6 }, -69);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V", line = 179)
    public class7() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILsd;ILml;IIILsd;)V", line = 185)
    public static final void method88(int arg0, class278 arg1, int arg2, class134 arg3, int arg4, int arg5, int arg6, class278 arg7) {
        class296.field4918 = arg5;
        field159++;
        class190.field3003 = arg4;
        class163.field2572 = arg0;
        class154.field2470 = arg6;
        class56.field920 = arg3;
        if (class207.field3303 != null) {
            return;
        }
        class174.field2790 = true;
        int var8 = -94 % ((10 - arg2) / 62);
        if (class217.field3498 == null) {
            class217.field3498 = class147.method960(0, class6.field148, class1.field21, false);
        }
        if (class247.field4002 == null) {
            class247.field4002 = class185.method1177((byte) 104, 0, class1.field21, class113.field1719);
        }
        if (class252.field4057 == null) {
            class252.field4057 = class185.method1177((byte) 104, 0, class1.field21, class62.field982);
        }
        if (class166.field2619 == null) {
            class166.field2619 = class185.method1177((byte) 104, 0, class1.field21, class144.field2295);
        }
        int var9 = class190.field3003 / 5;
        int var10 = class190.field3003 / 5 * 4;
        class121.method807(class296.field4918, class163.field2572, class190.field3003, class154.field2470, 0, 168);
        class121.method809(class296.field4918, class163.field2572, var9, 23, 12425273, 9135624);
        class121.method809(class296.field4918 + var9, class163.field2572, var10, 23, 5197647, 2697513);
        arg1.method1835(class200.field3193, var9 / 2 + class296.field4918, class163.field2572 + 15, 0, -1);
        if (class166.field2619 != null) {
            class166.field2619[1].method246(class296.field4918 + var9 + 2, class163.field2572 + 1);
            arg7.method1827(class110.field1684, var9 + class296.field4918 + 12, class163.field2572 + 10, 16777215, -1);
            class166.field2619[0].method246(class296.field4918 + var9 + 2, class163.field2572 - -12);
            arg7.method1827(class250.field4036, class296.field4918 + var9 + 12, class163.field2572 - -21, 16777215, -1);
        }
        if (class252.field4057 != null) {
            int var11 = var9 + class296.field4918 + 140;
            if (field157[0] == 0 && class287.field4732[0] == 0) {
                class252.field4057[2].method246(var11, class163.field2572 + 4);
            } else {
                class252.field4057[0].method246(var11, class163.field2572 + 4);
            }
            if (field157[0] == 0 && class287.field4732[0] == 1) {
                class252.field4057[3].method246(var11 + 15, class163.field2572 + 4);
            } else {
                class252.field4057[1].method246(var11 + 15, class163.field2572 + 4);
            }
            arg1.method1827(class268.field4421, var11 + 32, class163.field2572 - -17, 16777215, -1);
            int var12 = class296.field4918 + var9 + 250;
            if (field157[0] == 1 && class287.field4732[0] == 0) {
                class252.field4057[2].method246(var12, class163.field2572 + 4);
            } else {
                class252.field4057[0].method246(var12, class163.field2572 + 4);
            }
            if (field157[0] == 1 && class287.field4732[0] == 1) {
                class252.field4057[3].method246(var12 + 15, class163.field2572 + 4);
            } else {
                class252.field4057[1].method246(var12 + 15, class163.field2572 + 4);
            }
            arg1.method1827(class152.field2418, var12 + 32, class163.field2572 + 17, 16777215, -1);
            int var13 = class296.field4918 + var9 + 360;
            if (field157[0] == 2 && class287.field4732[0] == 0) {
                class252.field4057[2].method246(var13, class163.field2572 + 4);
            } else {
                class252.field4057[0].method246(var13, class163.field2572 + 4);
            }
            if (field157[0] == 2 && class287.field4732[0] == 1) {
                class252.field4057[3].method246(var13 + 15, class163.field2572 - -4);
            } else {
                class252.field4057[1].method246(var13 + 15, class163.field2572 + 4);
            }
            arg1.method1827(class237.field3808, var13 + 32, class163.field2572 + 17, 16777215, -1);
            int var14 = var9 + class296.field4918 + 470;
            if (field157[0] == 3 && class287.field4732[0] == 0) {
                class252.field4057[2].method246(var14, class163.field2572 + 4);
            } else {
                class252.field4057[0].method246(var14, class163.field2572 + 4);
            }
            if (field157[0] == 3 && class287.field4732[0] == 1) {
                class252.field4057[3].method246(var14 + 15, class163.field2572 + 4);
            } else {
                class252.field4057[1].method246(var14 + 15, class163.field2572 - -4);
            }
            arg1.method1827(class243.field3911, var14 + 32, class163.field2572 + 17, 16777215, -1);
        }
        class121.method811(class190.field3003 - 58 - 10, class163.field2572 - -4, 58, 16, 0);
        class124.field1918 = -1;
        if (class217.field3498 == null) {
            return;
        }
        byte var15 = 88;
        int var16 = class190.field3003 / (var15 + 1);
        byte var17 = 19;
        int var18 = (class154.field2470 - 23) / (var17 + 1);
        int var19;
        int var20;
        do {
            var19 = var16;
            var20 = var18;
            if (class238.field3816 <= (var16 - 1) * var18) {
                var16--;
            }
            if (((var18 - 1) * var16) >= class238.field3816) {
                var18--;
            }
            if (class238.field3816 <= ((var18 - 1) * var16)) {
                var18--;
            }
        } while (var18 != var20 || var16 != var19);
        int var21 = (class190.field3003 - (var15 * var16)) / (var16 + 1);
        if (var21 > 5) {
            var21 = 5;
        }
        int var22 = (class154.field2470 - (var17 * var18) - 23) / (var18 + 1);
        int var23 = (class190.field3003 - (var15 * var16) - ((var16 + -1) * var21)) / 2;
        if (var22 > 5) {
            var22 = 5;
        }
        int var24 = (class154.field2470 - ((var18 - 1) * var22) - (var17 * var18) - 23) / 2;
        int var25 = var24 + 23;
        int var26 = 0;
        int var27 = var23;
        for (int var28 = 0; var28 < class238.field3816; var28++) {
            boolean var29 = true;
            class158 var30 = class280.field4629[var28];
            class119 var31 = class234.method1506(var30.field2510, (byte) -79);
            if (var30.field2510 == -1) {
                var31 = class215.field3439;
                var29 = false;
            } else if (var30.field2510 > 1980) {
                var31 = class173.field2744;
                var29 = false;
            }
            if (class129.field1984 >= var27 && var25 <= class65.field1024 && var27 + var15 > class129.field1984 && class65.field1024 < var17 + var25 && var29) {
                class124.field1918 = var28;
                class217.field3498[var30.field2515 ? 1 : 0].method338(class296.field4918 + var27, class163.field2572 + var25, 128, 16777215);
            } else {
                class217.field3498[var30.field2515 ? 1 : 0].method139(class296.field4918 + var27, class163.field2572 - -var25);
            }
            if (class247.field4002 != null) {
                class247.field4002[var30.field2521 + (var30.field2515 ? 8 : 0)].method246(var27 + class296.field4918 + 29, class163.field2572 + var25);
            }
            arg1.method1835(class234.method1506(var30.field2520, (byte) -79), var27 + class296.field4918 + 15, class163.field2572 - -var25 - (-(var17 / 2) - 5), 0, -1);
            arg7.method1835(var31, class296.field4918 + var27 + 60, class163.field2572 - -(var17 / 2) + var25 + 5, 268435455, -1);
            var25 += var22 + var17;
            var26++;
            if (var26 >= var18) {
                var25 = var24 + 23;
                var27 += var15 + var21;
                var26 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)[I", line = 408)
    public final int[] method11(int arg0, boolean arg1) {
        field155++;
        if (arg1) {
            this.method13((class3) null, 101, 97);
        }
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            int[] var4 = this.method1253(0, 83, arg0);
            for (int var5 = 0; var5 < class157.field2504; var5++) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field158 && var6 <= this.field156 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIII)V", line = 442)
    public static final void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field153++;
        if (arg1 < 7) {
            return;
        }
        int var6 = arg5;
        int var7 = arg3 * arg3;
        int var8 = 0;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = arg5 << 1;
        int var12 = var7 << 1;
        int var13 = var9 - (var11 - 1) * var12;
        int var14 = (1 - var11) * var7 + var10;
        int var15 = var9 << 2;
        int var16 = var7 << 2;
        int var17 = (var8 + 1) * var15;
        int var18 = ((var8 << 1) + 3) * var10;
        if (arg2 >= class108.field1650 && class236.field3800 >= arg2) {
            int var19 = class197.method1264(-90, arg0 + arg3, class79.field1226, class59.field957);
            int var20 = class197.method1264(-102, arg0 - arg3, class79.field1226, class59.field957);
            class36.method282(var19, var20, arg4, class256.field4113[arg2], 26175);
        }
        int var21 = (arg5 - 1) * var16;
        int var22 = ((arg5 << 1) - 3) * var12;
        while (var6 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var8++;
                    var13 += var17;
                    var14 += var18;
                    var17 += var15;
                    var18 += var15;
                }
            }
            if (var13 < 0) {
                var8++;
                var13 += var17;
                var14 += var18;
                var17 += var15;
                var18 += var15;
            }
            var14 += -var21;
            var6--;
            var21 -= var16;
            var13 += -var22;
            int var23 = arg2 - var6;
            int var24 = arg2 + var6;
            if (var24 >= class108.field1650 && class236.field3800 >= var23) {
                int var25 = class197.method1264(-106, arg0 + var8, class79.field1226, class59.field957);
                int var26 = class197.method1264(-111, arg0 - var8, class79.field1226, class59.field957);
                if (class108.field1650 <= var23) {
                    class36.method282(var25, var26, arg4, class256.field4113[var23], 26175);
                }
                if (var24 <= class236.field3800) {
                    class36.method282(var25, var26, arg4, class256.field4113[var24], 26175);
                }
            }
            var22 -= var16;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class462 implements class346 {

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Ljava/lang/String;")
    private String field6658;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Leq;")
    private class209 field6657;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Z")
    public static boolean field6656 = false;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Lgba;")
    public static class664 field6660;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field6661;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "[[Z")
    public static boolean[][] field6655;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2811(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V", line = 4)
    public static void method2806(int arg0) {
        field6655 = null;
        field6660 = null;
        if (arg0 != 1) {
            field6660 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Lqfa;", line = 17)
    public final class98 method492(int arg0) {
        if (arg0 != -29480) {
            method2809(-40);
        }
        field6653++;
        return class98.field1670;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BIIIZ)V", line = 30)
    public static final void method2807(byte arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (class471.field6781.field6684.method1843(27669) == 0) {
            class497.method2990(120, false);
        } else {
            class1.field14 = class471.field6781.field6684.method1843(27669);
            class54.method490((byte) 116, true, 0);
        }
        field6652++;
        class545.field7687 = arg3;
        class712.field9953 = arg4;
        class373.field5233 = arg1;
        class542.method3193(arg2);
        int var5 = -28 % ((arg0 + 54) / 52);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "()V", line = 54)
    public static final void method2808() {
        for (int var0 = 0; var0 < class153.field2298; var0++) {
            if (!class43.field650[var0]) {
                class122 var1 = class502.field7171[var0];
                class36 var2 = var1.field1891;
                int var3 = var1.field1882;
                int var4 = var2.method294(42) - class252.field3600;
                int var5 = (var4 * 2 >> class440.field6142) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method290((byte) -119) - var4 >> class440.field6142;
                int var9 = var2.method291(0) - var4 >> class440.field6142;
                int var10 = var2.method291(0) + var4 >> class440.field6142;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class453.field6328) {
                    var10 = class453.field6328 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field1892[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class613.field8871) {
                        var16 = class613.field8871 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class113 var19 = class470.method2853(var3, var17, var11, field6661 == null ? (field6661 = method2811("bba")) : field6661);
                        if (var19 != null && var19.field1811 != 0) {
                            if (var19.field1811 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field1892[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field1892[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field1892[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field1892[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class43.field650[var0] = true;
                class138.field2153[var3].method1079(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)I", line = 234)
    public final int method493(byte arg0) {
        field6651++;
        if (this.field6657.method1470(this.field6658, -7490)) {
            return 100;
        } else {
            if (arg0 != 124) {
                field6660 = null;
            }
            return this.field6657.method1460(this.field6658, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)I", line = 251)
    public static final int method2809(int arg0) {
        field6650++;
        if (class565.field7984 == 0) {
            class259.field3781.method1764(new class514("jaclib"), -14733);
            if (class259.field3781.method1766((byte) -107).method493((byte) 124) != 100) {
                return 1;
            }
            if (!((class514) class259.field3781.method1766((byte) -107)).method3067(0)) {
                class345.field4858.method1969(arg0 ^ 0xFFFFFF82);
            }
            class565.field7984 = 1;
        }
        if (class565.field7984 == 1) {
            class528.field7503 = class259.method1765(arg0 ^ 0x943);
            class259.field3768.method1764(new class54(class128.field1932), -14733);
            class259.field3782.method1764(new class514("jaggl"), -14733);
            class259.field3783.method1764(new class514("jagdx"), arg0 ^ 0xFFFFC673);
            class259.field3784.method1764(new class514("jagmisc"), arg0 - 14733);
            class259.field3785.method1764(new class514("sw3d"), arg0 - 14733);
            class259.field3786.method1764(new class514("hw3d"), arg0 - 14733);
            class259.field3787.method1764(new class514("jagtheora"), -14733);
            class259.field3788.method1764(new class54(class345.field4863), -14733);
            class259.field3789.method1764(new class54(class444.field6177), -14733);
            class259.field3790.method1764(new class54(class14.field167), arg0 ^ 0xFFFFC673);
            class259.field3791.method1764(new class54(class231.field3293), -14733);
            class259.field3792.method1764(new class54(class372.field5214), -14733);
            class259.field3793.method1764(new class54(class744.field10424), -14733);
            class259.field3794.method1764(new class54(class136.field2119), -14733);
            class259.field3795.method1764(new class54(class497.field7079), arg0 - 14733);
            class259.field3796.method1764(new class54(class46.field673), -14733);
            class259.field3797.method1764(new class54(class292.field4105), -14733);
            class259.field3798.method1764(new class54(class491.field7005), -14733);
            class259.field3799.method1764(new class54(class86.field1559), -14733);
            class259.field3800.method1764(new class54(class711.field9935), -14733);
            class259.field3801.method1764(new class54(class411.field5688), -14733);
            class259.field3802.method1764(new class685(class427.field5962, "huffman"), -14733);
            class259.field3803.method1764(new class54(class513.field7322), -14733);
            class259.field3804.method1764(new class54(class515.field7336), -14733);
            class259.field3805.method1764(new class54(class722.field10091), -14733);
            class259.field3806.method1764(new class462(class588.field8272, "details"), -14733);
            for (int var1 = 0; var1 < class528.field7503.length; var1++) {
                if (class528.field7503[var1].method1766((byte) -107) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class259[] var3 = class528.field7503;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class259 var5 = var3[var4];
                int var6 = var5.method1763(24753);
                int var7 = var5.method1766((byte) -107).method493((byte) 124);
                var2 += var6 * var7 / 100;
            }
            class565.field7984 = 2;
            class148.field2268 = var2;
        }
        if (class528.field7503 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = arg0;
        boolean var10 = true;
        class259[] var11 = class528.field7503;
        for (int var12 = 0; var12 < var11.length; var12++) {
            class259 var16 = var11[var12];
            int var17 = var16.method1763(24753);
            int var18 = var16.method1766((byte) -107).method493((byte) 124);
            var9 += var17 * var18 / 100;
            var8 += var17;
            if (var18 < 100) {
                var10 = false;
            }
        }
        if (var10) {
            if (!((class514) class259.field3784.method1766((byte) -107)).method3067(arg0)) {
                class345.field4858.method1972(arg0 ^ 0x65E9);
            }
            if (!((class514) class259.field3787.method1766((byte) -107)).method3067(0)) {
                class610.field8828 = class345.field4858.method1971(arg0 - 9198);
            }
            class528.field7503 = null;
        }
        int var13 = var8 - class148.field2268;
        int var14 = var9 - class148.field2268;
        int var15 = var13 > 0 ? var14 * 100 / var13 : 100;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Leq;Ljava/lang/String;)V", line = 396)
    private class462(class209 arg0, String arg1) {
        this.field6658 = arg1;
        this.field6657 = arg0;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lvk;Leq;B)V", line = 405)
    public static final void method2810(class367 arg0, class209 arg1, byte arg2) {
        class373.field5234 = "";
        if (arg2 > -94) {
            method2806(0);
        }
        class35.field510 = arg1;
        class318.field4511 = arg0;
        field6654++;
        if (class166.field2445.startsWith("win")) {
            class373.field5234 = class373.field5234 + "windows/";
        } else if (class166.field2445.startsWith("linux")) {
            class373.field5234 = class373.field5234 + "linux/";
        } else if (class166.field2445.startsWith("mac")) {
            class373.field5234 = class373.field5234 + "macos/";
        }
        if (class318.field4511.field5130) {
            class373.field5234 = class373.field5234 + "msjava/";
        } else if (class166.field2450.startsWith("amd64") || class166.field2450.startsWith("x86_64")) {
            class373.field5234 = class373.field5234 + "x86_64/";
        } else if (class166.field2450.startsWith("i386") || class166.field2450.startsWith("i486") || class166.field2450.startsWith("i586") || class166.field2450.startsWith("x86")) {
            class373.field5234 = class373.field5234 + "x86/";
        } else if (class166.field2450.startsWith("ppc")) {
            class373.field5234 = class373.field5234 + "ppc/";
        } else {
            class373.field5234 = class373.field5234 + "universal/";
        }
    }
}

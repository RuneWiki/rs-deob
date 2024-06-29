import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class193 extends class364 {

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "I")
    private int field2853 = 0;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "Lbr;")
    private class348 field2839 = new class348();

    @OriginalMember(owner = "client!vp", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2847 = "Please remove ";

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "I")
    public static int field2843 = 0;

    @OriginalMember(owner = "client!vp", name = "E", descriptor = "Lui;")
    public static class365 field2851 = new class365();

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!vp", name = "x", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!vp", name = "y", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!vp", name = "C", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!vp", name = "H", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!vp", name = "I", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(B)V")
    public static void method1484(byte arg0) {
        field2847 = null;
        if (arg0 == 21) {
            field2851 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lsk;B)V")
    public final void method463(class168 arg0, byte arg1) {
        super.field5192[super.field5189] = 21;
        if (arg1 == -4) {
            ++field2849;
            super.field5180[super.field5189] = arg0;
            ++super.field5189;
            if (~super.field5189 <= -5001) {
                super.field5189 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)V")
    private final void method1485(int arg0) {
        ++field2854;
        int var2 = super.field5190++;
        if (super.field5190 >= 5000) {
            super.field5190 = 0;
        }
        if (arg0 != 0) {
            this.method467(-61);
        }
        this.field2853 = super.field5192[var2];
        Object var3 = super.field5180[var2];
        super.field5180[var2] = null;
        if (this.field2853 == 21) {
            class391.method2490(this.field2839, (class168) var3);
        } else if (this.field2853 != 20) {
            if (this.field2853 >= 30 && this.field2853 <= 33) {
                class73.field1222.method693(3000.0F, super.field5193[var2] * 1.5F);
                ((class126) var3).method812(class415.field6013, class71.field1203, class46.field755, class207.field3035, this.field2853 + -30 == 0);
            } else if (this.field2853 >= 40 && this.field2853 <= 43) {
                class73.field1222.method693(3000.0F, super.field5193[var2] * 1.5F);
                ((class126) var3).method812(class415.field6013, class71.field1203, class46.field755, class15.field229, ~(this.field2853 - 40) == -1);
            } else if (~this.field2853 == -23) {
                class73.field1222.method768(-1, 1583160, 40);
            } else {
                if (~this.field2853 != -24) {
                    if (~this.field2853 == -25) {
                        class73.field1222.method755(0, (class59[]) null);
                        return;
                    }
                } else {
                    class73.field1222.method761();
                }
            }
        } else {
            class168 var4 = (class168) var3;
            if (var4.field2505 != null) {
                var4.field2505.method137(33, class73.field1222);
            }
            if (var4.field2510 != null) {
                var4.field2510.method137(31, class73.field1222);
            }
            if (var4.field2506 != null) {
                var4.field2506.method137(arg0 + -107, class73.field1222);
            }
            if (var4.field2507 != null) {
                var4.field2507.method137(arg0 ^ 64, class73.field1222);
            }
            if (var4.field2501 != null) {
                var4.field2501.method137(121, class73.field1222);
            }
            for (class36 var5 = var4.field2488; var5 != null; var5 = var5.field505) {
                var5.field511.method137(arg0 ^ -90, class73.field1222);
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(FBIZLnc;)V")
    public final void method472(float arg0, byte arg1, int arg2, boolean arg3, class126 arg4) {
        super.field5192[super.field5189] = (byte) (arg3 ? arg2 + 40 : arg2 + 30);
        ++field2838;
        super.field5180[super.field5189] = arg4;
        super.field5193[super.field5189] = arg0;
        int var6 = -120 / ((arg1 - 15) / 37);
        ++super.field5189;
        if (super.field5189 >= 5000) {
            super.field5189 = 0;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILsk;)V")
    public final void method475(int arg0, class168 arg1) {
        ++field2840;
        --super.field5190;
        if (super.field5190 < 0) {
            super.field5190 = 4999;
        }
        super.field5192[super.field5190] = 21;
        if (arg0 > 10) {
            super.field5180[super.field5190] = arg1;
        }
    }

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "(I)V")
    public static final void method1486(int arg0) {
        class406.field5909 = arg0;
        for (int var1 = 0; var1 < class139.field2209; ++var1) {
            for (int var2 = 0; var2 < class436.field6353; ++var2) {
                if (class443.field6447[arg0][var1][var2] == null) {
                    class443.field6447[arg0][var1][var2] = new class168(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLpe;)I")
    public static final int method1487(byte arg0, class390 arg1) {
        ++field2848;
        if (arg1.field5650 == 0) {
            return 0;
        } else {
            if (~arg1.field5625 != 0 && arg1.field5625 < 32768) {
                class98 var2 = class447.field6512[arg1.field5625];
                if (var2 != null) {
                    int var3 = -var2.field6520 + arg1.field6520;
                    int var4 = arg1.field6519 - var2.field6519;
                    if (~var3 != -1 || ~var4 != -1) {
                        arg1.method2469(-16384, (int) (2607.5945876176133D * Math.atan2((double) var3, (double) var4)) & 16383);
                    }
                }
            }
            if (arg1.field5625 >= 32768) {
                int var5 = arg1.field5625 + -32768;
                if (class379.field5381 == var5) {
                    var5 = 2047;
                }
                class127 var6 = class367.field5225[var5];
                if (var6 != null) {
                    int var7 = -var6.field6520 + arg1.field6520;
                    int var8 = arg1.field6519 - var6.field6519;
                    if (var7 != 0 || var8 != 0) {
                        arg1.method2469(-16384, 16383 & (int) (2607.5945876176133D * Math.atan2((double) var7, (double) var8)));
                    }
                }
            }
            if (arg0 < 59) {
                method1489(68, (class174) null, (class174) null);
            }
            if ((~arg1.field5668 != -1 || ~arg1.field5634 != -1) && (~arg1.field5695 == -1 || arg1.field5693 > 0)) {
                int var9 = arg1.field6520 - (-class379.field5384 + arg1.field5668 - class379.field5384) * 64;
                int var10 = -((-class294.field4362 + -class294.field4362 + arg1.field5634) * 64) + arg1.field6519;
                if (~var9 != -1 || var10 != 0) {
                    arg1.method2469(-16384, (int) (Math.atan2((double) var9, (double) var10) * 2607.5945876176133D) & 16383);
                }
                arg1.field5634 = 0;
                arg1.field5668 = 0;
            }
            return arg1.method2482((byte) 111);
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V")
    public final void method467(int arg0) {
        ++field2852;
        if (arg0 >= -86) {
            method1489(68, (class174) null, (class174) null);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IB)V")
    public final void method473(int arg0, byte arg1) {
        if (arg1 != -66) {
            method1488(109, (class278) null);
        }
        ++field2845;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILqp;)V")
    public static final void method1488(int arg0, class278 arg1) {
        if (arg0 == -2034) {
            ++field2846;
            if (!class84.field1365) {
                arg1.method251(arg0 ^ -1957);
                --class389.field5591;
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V")
    public final void method464(int arg0, int arg1) {
        ++field2841;
        super.field5192[super.field5189] = (byte) arg1;
        ++super.field5189;
        if (arg0 != 3797) {
            this.method475(33, (class168) null);
        }
        if (~super.field5189 <= -5001) {
            super.field5189 = 0;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
    public final void method466(int arg0) {
        ++field2844;
        while (super.field5190 != super.field5189) {
            this.method1485(0);
        }
        int var2 = -61 / ((47 - arg0) / 53);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lsk;I)V")
    public final void method468(class168 arg0, int arg1) {
        super.field5192[super.field5189] = 20;
        ++field2850;
        super.field5180[super.field5189] = arg0;
        ++super.field5189;
        if (~super.field5189 <= -5001) {
            super.field5189 = 0;
        }
        if (arg1 != 5000) {
            this.method468((class168) null, -126);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILdp;Ldp;)V")
    public static final void method1489(int arg0, class174 arg1, class174 arg2) {
        class187.field2772 = arg2;
        class308.field4493 = arg1;
        if (arg0 != 1583160) {
            method1488(89, (class278) null);
        }
        ++field2842;
    }
}

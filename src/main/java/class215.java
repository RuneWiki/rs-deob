import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class215 extends class170 {

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "[I")
    public static int[] field3700 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!qj", name = "Z", descriptor = "[I")
    public static int[] field3706 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "[I")
    public static int[] field3699 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
    public static int field3696 = -1;

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "Lsc;")
    private static class181 field3705 = class149.method967(255, "Loading)3)3)3");

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "Lsc;")
    public static class181 field3695 = field3705;

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
    public static int field3701 = 0;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!qj", name = "ab", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!qj", name = "bb", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "Lhd;")
    private class214 field3703;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILvf;)V")
    public final void method1425(int arg0, class230 arg1) {
        if (arg0 >= -22) {
            method1426(126, (class116) null, 125, (byte) 98);
        }
        field3693++;
        while (true) {
            int var3 = arg1.method1516((byte) 82);
            if (var3 == 0) {
                return;
            }
            this.method1428(0, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILed;IB)V")
    public static final void method1426(int arg0, class116 arg1, int arg2, byte arg3) {
        field3704++;
        if ((arg0 & 0x20) != 0) {
            arg1.field2668 = class76.field1223.method1549(109);
            if (arg1.field2668.method1217(0, true) == 126) {
                arg1.field2668 = arg1.field2668.method1215(105, 1);
                class202.method1357(arg1.field2668, 2, (byte) -102, arg1.method770(arg3 ^ 0x2B));
            } else if (class258.field4507 == arg1) {
                class202.method1357(arg1.field2668, 2, (byte) -117, arg1.method770(60));
            }
            arg1.field2642 = 0;
            arg1.field2648 = 0;
            arg1.field2620 = 150;
        }
        if ((arg0 & 0x400) != 0) {
            arg1.field2682 = class76.field1223.method1548(-100001);
            int var4 = class76.field1223.method1531((byte) -43);
            arg1.field2662 = (var4 & 0xFFFF) + class237.field4125;
            if (arg1.field2682 == 65535) {
                arg1.field2682 = -1;
            }
            arg1.field2679 = var4 >> 16;
            arg1.field2687 = 0;
            arg1.field2673 = 0;
            if (arg1.field2662 > class237.field4125) {
                arg1.field2673 = -1;
            }
        }
        if ((arg0 & 0x100) != 0) {
            arg1.field2666 = class76.field1223.method1539(arg3 ^ 0xFFFFA135);
            arg1.field2646 = class76.field1223.method1539(-24286);
            arg1.field2645 = class76.field1223.method1516((byte) 82);
            arg1.field2650 = class76.field1223.method1516((byte) 82);
            arg1.field2677 = class76.field1223.method1558((byte) 73) + class237.field4125;
            arg1.field2657 = class76.field1223.method1558((byte) -115) + class237.field4125;
            arg1.field2626 = class76.field1223.method1516((byte) 82);
            arg1.field2631 = 1;
            arg1.field2676 = 0;
        }
        if ((arg0 & 0x200) != 0) {
            int var5 = class76.field1223.method1516((byte) 82);
            int var6 = class76.field1223.method1516((byte) 82);
            arg1.method1052(122, var6, var5, class237.field4125);
        }
        if (arg3 != 23) {
            return;
        }
        if ((arg0 & 0x40) != 0) {
            arg1.field2641 = class76.field1223.method1554(0);
            arg1.field2659 = class76.field1223.method1558((byte) 87);
        }
        if ((arg0 & 0x8) != 0) {
            int var7 = class76.field1223.method1543(255);
            byte[] var8 = new byte[var7];
            class230 var9 = new class230(var8);
            class76.field1223.method1532(0, var8, var7, arg3 ^ 0xE67236BF);
            class86.field1373[arg2] = var9;
            arg1.method769(28874, var9);
        }
        if ((arg0 & 0x2) != 0) {
            int var10 = class76.field1223.method1516((byte) 82);
            int var11 = class76.field1223.method1513(arg3 - 12160);
            arg1.method1052(121, var11, var10, class237.field4125);
            arg1.field2640 = class237.field4125 + 300;
            arg1.field2688 = class76.field1223.method1539(-24286);
        }
        if ((arg0 & 0x1) != 0) {
            int var12 = class76.field1223.method1558((byte) 76);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = class76.field1223.method1539(arg3 - 24309);
            class250.method1699((byte) 61, var12, arg1, var13);
        }
        if ((arg0 & 0x10) != 0) {
            arg1.field2658 = class76.field1223.method1558((byte) 123);
            if (arg1.field2658 == 65535) {
                arg1.field2658 = -1;
            }
        }
        if ((arg0 & 0x4) == 0) {
            return;
        }
        int var14 = class76.field1223.method1558((byte) 106);
        int var15 = class76.field1223.method1539(-24286);
        int var16 = class76.field1223.method1543(255);
        boolean var17 = (var14 & 0x8000) != 0;
        int var18 = class76.field1223.field3933;
        if (arg1.field1883 != null && arg1.field1905 != null) {
            long var19 = arg1.field1883.method1197(-117);
            boolean var21 = false;
            if (var15 <= 1) {
                if (!var17 && class116.field1914 == 1 || class11.field241 == 1) {
                    var21 = true;
                } else {
                    for (int var22 = 0; var22 < class221.field3815; var22++) {
                        if (class256.field4483[var22] == var19) {
                            var21 = true;
                            break;
                        }
                    }
                }
            }
            if (!var21 && class145.field2362 == 0) {
                class61.field938.field3933 = 0;
                class76.field1223.method1527((byte) -110, var16, 0, class61.field938.field3977);
                class61.field938.field3933 = 0;
                int var23 = -1;
                class181 var25;
                if (var17) {
                    var14 &= 0x7FFF;
                    class35 var24 = class38.method281(class61.field938, (byte) -11);
                    var23 = var24.field555;
                    var25 = var24.field547.method1490(115, class61.field938);
                } else {
                    var25 = class245.method1657(class261.method1774(true, class61.field938).method1218(-32));
                }
                arg1.field2668 = var25.method1232(123);
                arg1.field2642 = var14 >> 8;
                arg1.field2620 = 150;
                arg1.field2648 = var14 & 0xFF;
                if (var15 == 2) {
                    class221.method1467((class181) null, class175.method1164(new class181[] { class170.field2860, arg1.method770(112) }, (byte) 125), -6700, var25, var17 ? 17 : 1, var23);
                } else if (var15 == 1) {
                    class221.method1467((class181) null, class175.method1164(new class181[] { class86.field1368, arg1.method770(arg3 + 56) }, (byte) 124), -6700, var25, var17 ? 17 : 1, var23);
                } else {
                    class221.method1467((class181) null, arg1.method770(arg3 ^ 0x2A), arg3 - 6723, var25, var17 ? 17 : 2, var23);
                }
            }
        }
        class76.field1223.field3933 = var18 + var16;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)I")
    public final int method1427(int arg0, int arg1, int arg2) {
        field3694++;
        if (this.field3703 == null) {
            return arg2;
        }
        class124 var4 = (class124) this.field3703.method1424(true, (long) arg0);
        if (arg1 == 0) {
            return var4 == null ? arg2 : var4.field2029;
        } else {
            return -123;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILvf;)V")
    private final void method1428(int arg0, int arg1, class230 arg2) {
        field3702++;
        if (arg0 != 0) {
            this.field3703 = null;
        }
        if (arg1 != 249) {
            return;
        }
        int var4 = arg2.method1516((byte) 82);
        if (this.field3703 == null) {
            int var5 = class264.method1789(-50, var4);
            this.field3703 = new class214(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method1516((byte) 82) == 1;
            int var8 = arg2.method1508(true);
            class41 var9;
            if (var7) {
                var9 = new class199(arg2.method1549(67));
            } else {
                var9 = new class124(arg2.method1529(-32494));
            }
            this.field3703.method1422((long) var8, var9, ~arg0);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lsc;II)Lsc;")
    public final class181 method1429(class181 arg0, int arg1, int arg2) {
        if (arg1 < 83) {
            field3706 = null;
        }
        field3707++;
        if (this.field3703 == null) {
            return arg0;
        } else {
            class199 var4 = (class199) this.field3703.method1424(true, (long) arg2);
            return var4 == null ? arg0 : var4.field3453;
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V")
    public static void method1430(byte arg0) {
        field3695 = null;
        field3700 = null;
        field3706 = null;
        field3699 = null;
        field3705 = null;
        if (arg0 <= 44) {
            method1431(-13, 55);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)Lfb;")
    public static final class212 method1431(int arg0, int arg1) {
        field3708++;
        if (arg0 == 0) {
            return new class2();
        } else if (arg0 == 1) {
            return new class162();
        } else if (arg0 == 2) {
            return new class166();
        } else if (arg0 == 3) {
            return new class163();
        } else if (arg0 == 4) {
            return new class9();
        } else if (arg0 == 5) {
            return new class177();
        } else if (arg0 == 6) {
            return new class61();
        } else if (arg0 == 7) {
            return new class33();
        } else if (arg0 == 8) {
            return new class189();
        } else if (arg0 == 9) {
            return new class187();
        } else if (arg0 == 10) {
            return new class255();
        } else if (arg0 == 11) {
            return new class141();
        } else if (arg0 == 12) {
            return new class65();
        } else if (arg0 == 13) {
            return new class240();
        } else if (arg0 == 14) {
            return new class161();
        } else if (arg0 == 15) {
            return new class27();
        } else if (arg0 == 16) {
            return new class37();
        } else if (arg0 == 17) {
            return new class63();
        } else if (arg0 == 18) {
            return new class57();
        } else if (arg0 == 19) {
            return new class143();
        } else if (arg0 == 20) {
            return new class257();
        } else if (arg0 == 21) {
            return new class79();
        } else if (arg0 == 22) {
            return new class206();
        } else if (arg0 == 23) {
            return new class151();
        } else if (arg0 == 24) {
            return new class169();
        } else if (arg0 == 25) {
            return new class82();
        } else if (arg0 == 26) {
            return new class23();
        } else if (arg0 == 27) {
            return new class126();
        } else if (arg0 == 28) {
            return new class62();
        } else if (arg0 == 29) {
            return new class84();
        } else if (arg0 == 30) {
            return new class146();
        } else if (arg0 == 31) {
            return new class179();
        } else if (arg0 == 32) {
            return new class237();
        } else if (arg0 == 33) {
            return new class248();
        } else if (arg0 == 34) {
            return new class25();
        } else if (arg0 == 35) {
            return new class221();
        } else if (arg0 == 36) {
            return new class222();
        } else if (arg0 == 37) {
            return new class5();
        } else if (arg0 == 38) {
            return new class244();
        } else if (arg0 == 39) {
            return new class156();
        } else {
            if (arg1 != -9787) {
                method1430((byte) -47);
            }
            return null;
        }
    }
}

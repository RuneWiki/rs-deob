import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class141 {

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Lab;")
    private class3 field3433 = new class3(256);

    @OriginalMember(owner = "client!va", name = "l", descriptor = "Ltb;")
    private class130 field3442;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Ltb;")
    private class130 field3440;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Lca;")
    public static class16 field3436 = new class16();

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Loa;")
    public static class98 field3444 = class38.method349(255, "");

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field3447 = 0;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "Loa;")
    public static class98 field3445 = class38.method349(255, "bevor Sie die (WRegelversto-8 melden(W Option benutzen");

    @OriginalMember(owner = "client!va", name = "s", descriptor = "[Loa;")
    public static class98[] field3449 = new class98[100];

    @OriginalMember(owner = "client!va", name = "w", descriptor = "Z")
    public static boolean field3453 = false;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "[I")
    public static int[] field3454 = new int[2000];

    @OriginalMember(owner = "client!va", name = "p", descriptor = "Loa;")
    public static class98 field3446 = class38.method349(255, "@or1@");

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "[Loa;")
    public static class98[] field3450;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ltb;ILtb;Ltb;)V")
    public static final void method1127(class130 arg0, int arg1, class130 arg2, class130 arg3) {
        if (arg1 == -1) {
            class130.field3059 = arg3;
            field3441++;
            client.field511 = arg2;
            class1.field14 = arg0;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIII)V")
    public static final void method1128(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class126 var5 = (class126) class119.field2656.method512(-106); var5 != null; var5 = (class126) class119.field2656.method513(-65)) {
            if (var5.field2811 != -1 || var5.field2823 != null) {
                int var6 = 0;
                if (arg4 > var5.field2825) {
                    var6 += arg4 - var5.field2825;
                } else if (var5.field2801 > arg4) {
                    var6 += var5.field2801 - arg4;
                }
                if (var5.field2828 < arg2) {
                    var6 += arg2 - var5.field2828;
                } else if (arg2 < var5.field2818) {
                    var6 += var5.field2818 - arg2;
                }
                if (var6 - 64 > var5.field2819 || class149.field3671 == 0 || var5.field2794 != arg0) {
                    if (var5.field2813 != null) {
                        class82.field1872.method1218(var5.field2813);
                        var5.field2813 = null;
                    }
                    if (var5.field2810 != null) {
                        class82.field1872.method1218(var5.field2810);
                        var5.field2810 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field2819 - var6) * class149.field3671 / var5.field2819;
                    if (var5.field2813 != null) {
                        var5.field2813.method849(var7);
                    } else if (var5.field2811 >= 0) {
                        class136 var8 = class136.method1105(class15.field310, var5.field2811, 0);
                        if (var8 != null) {
                            class116 var9 = var8.method1102().method929(class49.field1096);
                            class104 var10 = class104.method870(var9, 100, var7);
                            var10.method851(-1);
                            class82.field1872.method1217(var10);
                            var5.field2813 = var10;
                        }
                    }
                    if (var5.field2810 != null) {
                        var5.field2810.method849(var7);
                        if (!var5.field2810.method976((byte) 75)) {
                            var5.field2810 = null;
                        }
                    } else if (var5.field2823 != null && (var5.field2814 -= arg3) <= 0) {
                        int var11 = (int) (Math.random() * (double) var5.field2823.length);
                        class136 var12 = class136.method1105(class15.field310, var5.field2823[var11], 0);
                        if (var12 != null) {
                            class116 var13 = var12.method1102().method929(class49.field1096);
                            class104 var14 = class104.method870(var13, 100, var7);
                            var14.method851(0);
                            class82.field1872.method1217(var14);
                            var5.field2810 = var14;
                            var5.field2814 = (int) (Math.random() * (double) (var5.field2800 - var5.field2817)) + var5.field2817;
                        }
                    }
                }
            }
        }
        field3448++;
        if (arg1 != -1) {
            method1128(33, -61, -101, -20, 72);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lh;")
    public static final class49 method1129(int arg0, int arg1) {
        field3438++;
        if (arg0 != -1) {
            method1128(-14, 41, 70, -19, -121);
        }
        class49 var2 = (class49) class32.field779.method730((byte) 35, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class117.field2620.method1058(16, arg0 ^ 0xFFFFFFE2, arg1);
        class49 var4 = new class49();
        if (var3 != null) {
            var4.method419(false, new class8(var3));
        }
        class32.field779.method732(arg0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static final void method1130(int arg0) {
        field3434++;
        for (int var1 = 0; var1 < class74.field1603; var1++) {
            int var2 = class96.field2205[var1];
            class150 var3 = class38.field935[var2];
            int var4 = class36.field890.method62((byte) 122);
            if ((var4 & 0x8) != 0) {
                int var5 = class36.field890.method86(arg0 ^ 0xFFFFFF84);
                int var6 = class36.field890.method86(5);
                var3.method1183(var5, (byte) -51, class119.field2680, var6);
                var3.field3632 = class119.field2680 + 300;
                var3.field3634 = class36.field890.method98(113);
                var3.field3611 = class36.field890.method62((byte) 82);
            }
            if ((var4 & 0x2) != 0) {
                var3.field3668 = class36.field890.method76(arg0 ^ 0xFFFFEA52);
                if (var3.field3668 == 65535) {
                    var3.field3668 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field3669 = class36.field890.method104(-1);
                int var7 = class36.field890.method90(-14);
                var3.field3614 = (var7 & 0xFFFF) + class119.field2680;
                var3.field3659 = 0;
                var3.field3627 = 0;
                var3.field3645 = var7 >> 16;
                if (var3.field3669 == 65535) {
                    var3.field3669 = -1;
                }
                if (class119.field2680 < var3.field3614) {
                    var3.field3627 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var8 = class36.field890.method76(-5546);
                int var9 = class36.field890.method86(-126);
                if (var8 == 65535) {
                    var8 = -1;
                }
                if (var3.field3612 == var8 && var8 != -1) {
                    int var10 = class48.method413(-118, var8).field805;
                    if (var10 == 1) {
                        var3.field3605 = var9;
                        var3.field3641 = 0;
                        var3.field3604 = 0;
                        var3.field3633 = 0;
                    }
                    if (var10 == 2) {
                        var3.field3633 = 0;
                    }
                } else if (var8 == -1 || var3.field3612 == -1 || class48.method413(-106, var8).field854 >= class48.method413(-116, var3.field3612).field854) {
                    var3.field3612 = var8;
                    var3.field3604 = 0;
                    var3.field3605 = var9;
                    var3.field3633 = 0;
                    var3.field3641 = 0;
                    var3.field3661 = var3.field3608;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field3709 = class11.method122(class36.field890.method76(arg0 - 5550), arg0 ^ 0x5A);
                var3.field3660 = var3.field3709.field3333;
                var3.field3658 = var3.field3709.field3364;
                var3.field3626 = var3.field3709.field3315;
                var3.field3616 = var3.field3709.field3322;
                var3.field3617 = var3.field3709.field3354;
                var3.field3628 = var3.field3709.field3324;
                var3.field3642 = var3.field3709.field3355;
                var3.field3640 = var3.field3709.field3340;
                var3.field3624 = var3.field3709.field3321;
            }
            if ((var4 & 0x40) != 0) {
                var3.field3606 = class36.field890.method93(67);
                var3.field3613 = 100;
            }
            if ((var4 & 0x80) != 0) {
                var3.field3663 = class36.field890.method68(-2);
                var3.field3629 = class36.field890.method76(-5546);
            }
            if ((var4 & 0x4) != 0) {
                int var11 = class36.field890.method86(-86);
                int var12 = class36.field890.method62((byte) 88);
                var3.method1183(var11, (byte) -51, class119.field2680, var12);
                var3.field3632 = class119.field2680 + 300;
                var3.field3634 = class36.field890.method98(109);
                var3.field3611 = class36.field890.method98(121);
            }
        }
        if (arg0 != 4) {
            method1136((byte) 113);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Loa;Ltb;ILoa;ZI)V")
    public static final void method1131(class98 arg0, class130 arg1, int arg2, class98 arg3, boolean arg4, int arg5) {
        field3435++;
        int var6 = arg1.method1060((byte) -124, arg3);
        int var7 = arg1.method1048(arg0, var6, (byte) 124);
        if (arg2 != 2935) {
            method1127(null, -50, null, null);
        }
        class98.method794(10000, var6, var7, arg4, arg5, arg1);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI[I)Lr;")
    public final class116 method1132(byte arg0, int arg1, int[] arg2) {
        if (arg0 != 89) {
            this.method1133(50, -27, null);
        }
        field3452++;
        long var4 = (long) arg1 ^ 0x300000000L;
        class116 var6 = (class116) this.field3433.method17(-16, var4);
        if (var6 != null) {
            return var6;
        } else if (arg2 == null || arg2[0] > 0) {
            class95 var7 = class95.method763(this.field3442, arg1);
            if (var7 == null) {
                return null;
            }
            class116 var8 = var7.method755();
            this.field3433.method12(var8, -31636, var4);
            if (arg2 != null) {
                arg2[0] -= var8.field2602.length;
            }
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II[I)Lr;")
    public final class116 method1133(int arg0, int arg1, int[] arg2) {
        if (arg0 != 0) {
            method1136((byte) 26);
        }
        long var4 = (long) arg1 ^ 0x200000000L;
        field3439++;
        class116 var6 = (class116) this.field3433.method17(-16, var4);
        if (var6 != null) {
            return var6;
        } else if (arg2 == null || arg2[0] > 0) {
            class136 var7 = class136.method1101(this.field3440, arg1);
            if (var7 == null) {
                return null;
            }
            class116 var8 = var7.method1102();
            this.field3433.method12(var8, arg0 - 31636, var4);
            if (arg2 != null) {
                arg2[0] -= var8.field2602.length;
            }
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BII)I")
    public static final int method1134(byte arg0, int arg1, int arg2) {
        field3451++;
        if (arg0 != 33) {
            field3446 = null;
        }
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILhf;I)V")
    public static final void method1135(int arg0, int arg1, class55 arg2, int arg3) {
        if ((arg3 & 0x100) != 0) {
            int var4 = class36.field890.method86(-79);
            int var5 = class36.field890.method62((byte) 117);
            arg2.method1183(var4, (byte) -51, class119.field2680, var5);
            arg2.field3632 = class119.field2680 + 300;
            arg2.field3634 = class36.field890.method75(true);
            arg2.field3611 = class36.field890.method98(124);
        }
        if ((arg3 & 0x8) != 0) {
            int var6 = class36.field890.method91(arg0 + 11121);
            int var7 = class36.field890.method98(110);
            if (var6 == 65535) {
                var6 = -1;
            }
            class8.method94((byte) -103, var6, var7, arg2);
        }
        field3437++;
        if ((arg3 & 0x10) != 0) {
            arg2.field3606 = class36.field890.method93(65);
            if (arg2.field3606.method813(0, -9128) == 126) {
                arg2.field3606 = arg2.field3606.method781(0, 1);
                class90.method736(2, arg2.field3606, true, arg2.field1212);
            } else if (class73.field1536 == arg2) {
                class90.method736(2, arg2.field3606, true, arg2.field1212);
            }
            arg2.field3618 = 0;
            arg2.field3613 = 150;
            arg2.field3643 = 0;
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field3621 = class36.field890.method98(127);
            arg2.field3623 = class36.field890.method98(121);
            arg2.field3651 = class36.field890.method75(true);
            arg2.field3647 = class36.field890.method75(true);
            arg2.field3602 = class36.field890.method91(128) + class119.field2680;
            arg2.field3666 = class36.field890.method104(-1) + class119.field2680;
            arg2.field3646 = class36.field890.method98(arg0 + 11110);
            arg2.field3608 = 1;
            arg2.field3661 = 0;
        }
        if (arg0 != -10993) {
            field3447 = 124;
        }
        if ((arg3 & 0x1) != 0) {
            int var8 = class36.field890.method104(-1);
            int var9 = class36.field890.method86(-107);
            int var10 = class36.field890.method62((byte) 76);
            int var11 = class36.field890.field182;
            if (arg2.field1212 != null && arg2.field1219 != null) {
                boolean var12 = false;
                long var13 = arg2.field1212.method809(0);
                if (var9 <= 1) {
                    for (int var15 = 0; var15 < class77.field1697; var15++) {
                        if (class102.field2345[var15] == var13) {
                            var12 = true;
                            break;
                        }
                    }
                }
                if (!var12 && class5.field84 == 0) {
                    class65.field1378.field182 = 0;
                    class36.field890.method71(0, var10, 4570, class65.field1378.field132);
                    class65.field1378.field182 = 0;
                    class98 var16 = class74.method604(class65.field1378, 92).method783(255);
                    arg2.field3606 = var16.method789(true);
                    arg2.field3618 = var8 >> 8;
                    arg2.field3643 = var8 & 0xFF;
                    arg2.field3613 = 150;
                    if (var9 == 2 || var9 == 3) {
                        class90.method736(1, var16, true, class102.method840(new class98[] { class52.field1165, arg2.field1212 }, 10));
                    } else if (var9 == 1) {
                        class90.method736(1, var16, true, class102.method840(new class98[] { class48.field1093, arg2.field1212 }, 10));
                    } else {
                        class90.method736(2, var16, true, arg2.field1212);
                    }
                }
            }
            class36.field890.field182 = var11 + var10;
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field3663 = class36.field890.method68(-2);
            arg2.field3629 = class36.field890.method76(-5546);
        }
        if ((arg3 & 0x80) != 0) {
            int var17 = class36.field890.method62((byte) 117);
            int var18 = class36.field890.method75(true);
            arg2.method1183(var17, (byte) -51, class119.field2680, var18);
            arg2.field3632 = class119.field2680 + 300;
            arg2.field3634 = class36.field890.method86(69);
            arg2.field3611 = class36.field890.method62((byte) 121);
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field3668 = class36.field890.method68(-2);
            if (arg2.field3668 == 65535) {
                arg2.field3668 = -1;
            }
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field3669 = class36.field890.method91(128);
            int var19 = class36.field890.method70(false);
            if (arg2.field3669 == 65535) {
                arg2.field3669 = -1;
            }
            arg2.field3627 = 0;
            arg2.field3614 = (var19 & 0xFFFF) + class119.field2680;
            if (arg2.field3614 > class119.field2680) {
                arg2.field3627 = -1;
            }
            arg2.field3659 = 0;
            arg2.field3645 = var19 >> 16;
        }
        if ((arg3 & 0x20) == 0) {
            return;
        }
        int var20 = class36.field890.method98(109);
        byte[] var21 = new byte[var20];
        class8 var22 = new class8(var21);
        class36.field890.method80(var20, 0, var21, (byte) -122);
        class114.field2578[arg1] = var22;
        arg2.method451(0, var22);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ltb;Ltb;)V")
    public class141(class130 arg0, class130 arg1) {
        this.field3442 = arg1;
        this.field3440 = arg0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static void method1136(byte arg0) {
        field3445 = null;
        field3444 = null;
        field3449 = null;
        int var1 = 5 / ((-arg0 - 70) / 46);
        field3454 = null;
        field3450 = null;
        field3436 = null;
        field3446 = null;
    }
}

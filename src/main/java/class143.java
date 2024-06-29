import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class143 {

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field3430 = 0;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lmb;")
    public static class84 field3428 = class79.method672(true, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field3432 = -1;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lmb;")
    private static class84 field3429 = class79.method672(true, "Please remove ");

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "[Lr;")
    public static class112[] field3439 = new class112[1000];

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field3441 = 0;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field3431 = 0;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "Lmb;")
    public static class84 field3447 = field3429;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lmb;")
    public static class84 field3434 = class79.method672(true, "Versteckt");

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "Lmb;")
    public static class84 field3449 = class79.method672(true, "rot:");

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lmb;")
    public static class84 field3435 = field3429;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Lmb;")
    private static class84 field3436 = class79.method672(true, "Connecting to update server");

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "Lmb;")
    public static class84 field3443 = field3436;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "[I")
    public static int[] field3448;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lwc;I)V")
    public static final void method1166(class145 arg0, int arg1) {
        arg0.field3544 = false;
        if (arg0.field3537 != -1) {
            class70 var2 = class79.method673(arg0.field3537, false);
            if (var2 == null || var2.field1706 == null) {
                arg0.field3537 = -1;
            } else {
                arg0.field3498++;
                if (arg0.field3545 < var2.field1706.length && arg0.field3498 > var2.field1716[arg0.field3545]) {
                    arg0.field3498 = 1;
                    arg0.field3545++;
                    class138.method1126(arg0.field3549, arg0.field3545, var2, arg0.field3535, (byte) 10);
                }
                if (arg0.field3545 >= var2.field1706.length) {
                    arg0.field3545 = 0;
                    arg0.field3498 = 0;
                    class138.method1126(arg0.field3549, arg0.field3545, var2, arg0.field3535, (byte) 10);
                }
            }
        }
        if (arg0.field3556 != -1 && arg0.field3496 <= class5.field100) {
            if (arg0.field3532 < 0) {
                arg0.field3532 = 0;
            }
            int var3 = class109.method894(arg0.field3556, (byte) 112).field3142;
            if (var3 == -1) {
                arg0.field3556 = -1;
            } else {
                class70 var4 = class79.method673(var3, false);
                if (var4 == null || var4.field1706 == null) {
                    arg0.field3556 = -1;
                } else {
                    arg0.field3561++;
                    if (arg0.field3532 < var4.field1706.length && arg0.field3561 > var4.field1716[arg0.field3532]) {
                        arg0.field3532++;
                        arg0.field3561 = 1;
                        class138.method1126(arg0.field3549, arg0.field3532, var4, arg0.field3535, (byte) 10);
                    }
                    if (arg0.field3532 >= var4.field1706.length && (arg0.field3532 < 0 || arg0.field3532 >= var4.field1706.length)) {
                        arg0.field3556 = -1;
                    }
                }
            }
        }
        field3450++;
        if (arg0.field3558 != -1 && arg0.field3497 <= 1) {
            class70 var5 = class79.method673(arg0.field3558, false);
            if (var5.field1696 == 1 && arg0.field3518 > 0 && arg0.field3563 <= class5.field100 && arg0.field3514 < class5.field100) {
                arg0.field3497 = 1;
                return;
            }
        }
        if (arg1 != 10618) {
            return;
        }
        if (arg0.field3558 != -1 && arg0.field3497 == 0) {
            class70 var6 = class79.method673(arg0.field3558, false);
            if (var6 == null || var6.field1706 == null) {
                arg0.field3558 = -1;
            } else {
                arg0.field3500++;
                if (var6.field1706.length > arg0.field3538 && var6.field1716[arg0.field3538] < arg0.field3500) {
                    arg0.field3500 = 1;
                    arg0.field3538++;
                    class138.method1126(arg0.field3549, arg0.field3538, var6, arg0.field3535, (byte) 10);
                }
                if (var6.field1706.length <= arg0.field3538) {
                    arg0.field3538 -= var6.field1724;
                    arg0.field3543++;
                    if (arg0.field3543 >= var6.field1719) {
                        arg0.field3558 = -1;
                    } else if (arg0.field3538 >= 0 && var6.field1706.length > arg0.field3538) {
                        class138.method1126(arg0.field3549, arg0.field3538, var6, arg0.field3535, (byte) 10);
                    } else {
                        arg0.field3558 = -1;
                    }
                }
                arg0.field3544 = var6.field1698;
            }
        }
        if (arg0.field3497 > 0) {
            arg0.field3497--;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BII)I")
    public static final int method1167(byte arg0, int arg1, int arg2) {
        int var3 = 0;
        if (arg0 > -10) {
            return -32;
        }
        while (arg2 > 0) {
            arg2--;
            var3 = var3 << 1 | arg1 & 0x1;
            arg1 >>>= 0x1;
        }
        field3427++;
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public static final void method1168(byte arg0) {
        field3453++;
        while (class87.field2148.method762(class86.field2128, (byte) 99) >= 11) {
            int var1 = class87.field2148.method759(26024, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class44.field978[var1] == null) {
                class44.field978[var1] = new class62();
                var2 = true;
                if (class70.field1722[var1] != null) {
                    class44.field978[var1].method568(class70.field1722[var1], (byte) -58);
                }
            }
            class80.field1990[class71.field1746++] = var1;
            class62 var3 = class44.field978[var1];
            var3.field3519 = class5.field100;
            int var4 = class5.field71[class87.field2148.method759(26024, 3)];
            if (var2) {
                var3.field3521 = var4;
            }
            int var5 = class87.field2148.method759(26024, 1);
            int var6 = class87.field2148.method759(26024, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class87.field2148.method759(26024, 1);
            if (var7 == 1) {
                class125.field3033[class96.field2385++] = var1;
            }
            int var8 = class87.field2148.method759(26024, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1184(class40.field925.field3489[0] + var6, class40.field925.field3490[0] + var8, var5 == 1, -25859);
        }
        class87.field2148.method767(7);
        int var9 = 18 / ((arg0 - 33) / 43);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)I")
    public static final int method1169(byte arg0) {
        field3454++;
        int var1 = 3;
        if (class50.field1072 < 310) {
            int var2 = class59.field1463 >> 7;
            int var3 = class33.field733 >> 7;
            if ((class62.field1540[class13.field251][var3][var2] & 0x4) != 0) {
                var1 = class13.field251;
            }
            int var4 = class40.field925.field3549 >> 7;
            int var5 = class40.field925.field3535 >> 7;
            int var6;
            if (var3 >= var4) {
                var6 = var3 - var4;
            } else {
                var6 = var4 - var3;
            }
            int var7;
            if (var5 <= var2) {
                var7 = var2 - var5;
            } else {
                var7 = var5 - var2;
            }
            if (var7 >= var6) {
                int var8 = var6 * 65536 / var7;
                int var9 = 32768;
                while (var2 != var5) {
                    if (var2 < var5) {
                        var2++;
                    } else if (var2 > var5) {
                        var2--;
                    }
                    var9 += var8;
                    if ((class62.field1540[class13.field251][var3][var2] & 0x4) != 0) {
                        var1 = class13.field251;
                    }
                    if (var9 >= 65536) {
                        if (var4 > var3) {
                            var3++;
                        } else if (var3 > var4) {
                            var3--;
                        }
                        var9 -= 65536;
                        if ((class62.field1540[class13.field251][var3][var2] & 0x4) != 0) {
                            var1 = class13.field251;
                        }
                    }
                }
            } else {
                int var10 = var7 * 65536 / var6;
                int var11 = 32768;
                while (var3 != var4) {
                    if (var3 < var4) {
                        var3++;
                    } else if (var4 < var3) {
                        var3--;
                    }
                    if ((class62.field1540[class13.field251][var3][var2] & 0x4) != 0) {
                        var1 = class13.field251;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        if (var2 < var5) {
                            var2++;
                        } else if (var5 < var2) {
                            var2--;
                        }
                        var11 -= 65536;
                        if ((class62.field1540[class13.field251][var3][var2] & 0x4) != 0) {
                            var1 = class13.field251;
                        }
                    }
                }
            }
        }
        int var12 = 32 / ((arg0 - 4) / 59);
        if ((class62.field1540[class13.field251][class40.field925.field3549 >> 7][class40.field925.field3535 >> 7] & 0x4) != 0) {
            var1 = class13.field251;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Z")
    public static final boolean method1170(byte arg0, int arg1) {
        if (arg0 <= 22) {
            field3441 = 0;
        }
        field3452++;
        return (arg1 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method1171(int arg0) {
        field3449 = null;
        field3436 = null;
        field3429 = null;
        field3448 = null;
        field3443 = null;
        field3434 = null;
        field3447 = null;
        if (arg0 > 117) {
            field3435 = null;
            field3428 = null;
            field3439 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public static final void method1172(int arg0) {
        class16.field345.method966(false);
        if (arg0 != -13604) {
            field3448 = null;
        }
        field3445++;
        class144.field3480.method966(false);
        class30.field702.method966(false);
        class50.field1062.method966(false);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lj;ZII)V")
    public static final void method1173(class62 arg0, boolean arg1, int arg2, int arg3) {
        field3444++;
        if ((arg2 & 0x400) != 0) {
            arg0.field3556 = class87.field2148.method400((byte) -118);
            int var4 = class87.field2148.method392(-25304);
            arg0.field3532 = 0;
            if (arg0.field3556 == 65535) {
                arg0.field3556 = -1;
            }
            arg0.field3496 = class5.field100 + (var4 & 0xFFFF);
            if (arg0.field3496 > class5.field100) {
                arg0.field3532 = -1;
            }
            arg0.field3561 = 0;
            arg0.field3553 = var4 >> 16;
        }
        if ((arg2 & 0x10) != 0) {
            int var5 = class87.field2148.method400((byte) -120);
            int var6 = class87.field2148.method373(25094);
            int var7 = class87.field2148.method365(-116);
            int var8 = class87.field2148.field1128;
            if (arg0.field1535 != null && arg0.field1528 != null) {
                long var9 = arg0.field1535.method700((byte) 25);
                boolean var11 = false;
                if (var6 <= 1) {
                    for (int var12 = 0; var12 < class86.field2133; var12++) {
                        if (class71.field1747[var12] == var9) {
                            var11 = true;
                            break;
                        }
                    }
                }
                if (!var11 && class70.field1700 == 0) {
                    class84.field2092.field1128 = 0;
                    class87.field2148.method398((byte) 51, class84.field2092.field1084, var7, 0);
                    class84.field2092.field1128 = 0;
                    class84 var13 = class115.method947(32767, class84.field2092).method711(48);
                    arg0.field3520 = var13.method698(104);
                    arg0.field3512 = var5 & 0xFF;
                    arg0.field3507 = 150;
                    arg0.field3508 = var5 >> 8;
                    if (var6 == 2 || var6 == 3) {
                        class11.method64(var13, class51.method408(new class84[] { class24.field566, arg0.field1535 }, -42), -68, 1);
                    } else if (var6 == 1) {
                        class11.method64(var13, class51.method408(new class84[] { class75.field1857, arg0.field1535 }, 102), -67, 1);
                    } else {
                        class11.method64(var13, arg0.field1535, -76, 2);
                    }
                }
            }
            class87.field2148.field1128 = var7 + var8;
        }
        if (!arg1) {
            field3431 = -72;
        }
        if ((arg2 & 0x20) != 0) {
            arg0.field3494 = class87.field2148.method400((byte) 126);
            arg0.field3551 = class87.field2148.method383(-2056200760);
        }
        if ((arg2 & 0x2) != 0) {
            int var14 = class87.field2148.method366((byte) -31);
            int var15 = class87.field2148.method373(25094);
            arg0.method1183(var15, 0, class5.field100, var14);
            arg0.field3515 = class5.field100 + 300;
            arg0.field3522 = class87.field2148.method366((byte) -31);
            arg0.field3536 = class87.field2148.method366((byte) -31);
        }
        if ((arg2 & 0x80) != 0) {
            int var16 = class87.field2148.method383(-2056200760);
            if (var16 == 65535) {
                var16 = -1;
            }
            int var17 = class87.field2148.method373(25094);
            class88.method754(var17, (byte) 108, arg0, var16);
        }
        if ((arg2 & 0x200) != 0) {
            int var18 = class87.field2148.method411((byte) -101);
            int var19 = class87.field2148.method411((byte) -88);
            arg0.method1183(var19, 0, class5.field100, var18);
            arg0.field3515 = class5.field100 + 300;
            arg0.field3522 = class87.field2148.method365(-45);
            arg0.field3536 = class87.field2148.method365(-72);
        }
        if ((arg2 & 0x100) != 0) {
            arg0.field3547 = class87.field2148.method411((byte) 30);
            arg0.field3550 = class87.field2148.method373(25094);
            arg0.field3517 = class87.field2148.method365(-50);
            arg0.field3504 = class87.field2148.method365(-126);
            arg0.field3563 = class87.field2148.method409((byte) 27) + class5.field100;
            arg0.field3514 = class87.field2148.method383(-2056200760) + class5.field100;
            arg0.field3493 = class87.field2148.method366((byte) -31);
            arg0.field3518 = 0;
            arg0.field3555 = 1;
        }
        if ((arg2 & 0x1) != 0) {
            int var20 = class87.field2148.method411((byte) -91);
            byte[] var21 = new byte[var20];
            class51 var22 = new class51(var21);
            class87.field2148.method384(var21, 0, arg1, var20);
            class70.field1722[arg3] = var22;
            arg0.method568(var22, (byte) -21);
        }
        if ((arg2 & 0x4) != 0) {
            arg0.field3529 = class87.field2148.method417(65280);
            if (arg0.field3529 == 65535) {
                arg0.field3529 = -1;
            }
        }
        if ((arg2 & 0x40) == 0) {
            return;
        }
        arg0.field3520 = class87.field2148.method413(0);
        if (arg0.field3520.method725(0, -123) == 126) {
            arg0.field3520 = arg0.field3520.method697(104, 1);
            class11.method64(arg0.field3520, arg0.field1535, -118, 2);
        } else if (class40.field925 == arg0) {
            class11.method64(arg0.field3520, arg0.field1535, -79, 2);
        }
        arg0.field3508 = 0;
        arg0.field3512 = 0;
        arg0.field3507 = 150;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[Lmb;)[Lmb;")
    public static final class84[] method1174(int arg0, class84[] arg1) {
        class84[] var2 = new class84[arg0];
        field3437++;
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class51.method408(new class84[] { class93.method787(arg0 + 22240, var3), class66.field1621 }, 109);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class51.method408(new class84[] { var2[var3], arg1[var3] }, 105);
            }
        }
        return var2;
    }
}

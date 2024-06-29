import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class85 extends class88 {

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    public int field2002;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public static int field1997 = -1;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "Ltd;")
    private static class136 field1999 = class145.method1172("Try again in 60 secs)3)3)3", 45);

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "Ltd;")
    public static class136 field1998 = field1999;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "Ltd;")
    public static class136 field1996 = class145.method1172("Begeben Sie sich in ein freies Gebiet)1 um", 45);

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "Ltd;")
    public static class136 field2004 = class145.method1172("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", 45);

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "Ltd;")
    public static class136 field2003 = class145.method1172("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 45);

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
    public static final void method632(int arg0) {
        class65.field1399 = true;
        field1994++;
        class97.field2322 = true;
        if (arg0 > -26) {
            method635(false, 78, 26, 30);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lwe;B)V")
    public static final void method633(class155 arg0, byte arg1) {
        field2000++;
        if (arg0.field3595 == 0) {
            return;
        }
        if (arg0.field3587 != -1 && arg0.field3587 < 32768) {
            class67 var2 = class122.field2846[arg0.field3587];
            if (var2 != null) {
                int var3 = arg0.field3580 - var2.field3580;
                int var4 = arg0.field3578 - var2.field3578;
                if (var3 != 0 || var4 != 0) {
                    arg0.field3538 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field3587 >= 32768) {
            int var5 = arg0.field3587 - 32768;
            if (class113.field2618 == var5) {
                var5 = 2047;
            }
            class13 var6 = class154.field3518[var5];
            if (var6 != null) {
                int var7 = arg0.field3580 - var6.field3580;
                int var8 = arg0.field3578 - var6.field3578;
                if (var7 != 0 || var8 != 0) {
                    arg0.field3538 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field3566 != 0 || arg0.field3597 != 0) && (arg0.field3564 == 0 || arg0.field3582 > 0)) {
            int var9 = arg0.field3578 - (arg0.field3597 - class52.field1176 - class52.field1176) * 64;
            int var10 = arg0.field3580 - (arg0.field3566 - class91.field2145 - class91.field2145) * 64;
            if (var10 != 0 || var9 != 0) {
                arg0.field3538 = (int) (Math.atan2((double) var10, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field3597 = 0;
            arg0.field3566 = 0;
        }
        int var11 = -65 % ((31 - arg1) / 51);
        int var12 = arg0.field3538 - arg0.field3610 & 0x7FF;
        if (var12 == 0) {
            arg0.field3589 = 0;
            return;
        }
        arg0.field3589++;
        if (var12 <= 1024) {
            arg0.field3610 += arg0.field3595;
            boolean var13 = true;
            if (var12 < arg0.field3595 || var12 > 2048 - arg0.field3595) {
                var13 = false;
                arg0.field3610 = arg0.field3538;
            }
            if (arg0.field3594 == arg0.field3556 && (arg0.field3589 > 25 || var13)) {
                if (arg0.field3592 == -1) {
                    arg0.field3594 = arg0.field3575;
                } else {
                    arg0.field3594 = arg0.field3592;
                }
            }
        } else {
            arg0.field3610 -= arg0.field3595;
            boolean var14 = true;
            if (arg0.field3595 > var12 || var12 > 2048 - arg0.field3595) {
                arg0.field3610 = arg0.field3538;
                var14 = false;
            }
            if (arg0.field3594 == arg0.field3556 && (arg0.field3589 > 25 || var14)) {
                if (arg0.field3573 == -1) {
                    arg0.field3594 = arg0.field3575;
                } else {
                    arg0.field3594 = arg0.field3573;
                }
            }
        }
        arg0.field3610 &= 0x7FF;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILbe;BI)V")
    public static final void method634(int arg0, int arg1, class13 arg2, byte arg3, int arg4) {
        if (arg3 <= 1) {
            method638(64);
        }
        field2005++;
        if (class24.field555 == arg2 || class14.field274 >= 400) {
            return;
        }
        class136 var5;
        if (arg2.field235 == 0) {
            var5 = class79.method570(0, new class136[] { arg2.field249, class63.method473(8374, class24.field555.field255, arg2.field255), class39.field922, class96.field2276, class19.method140(arg2.field255, -77), class106.field2492 });
        } else {
            var5 = class79.method570(0, new class136[] { arg2.field249, class39.field922, class73.field1528, class19.method140(arg2.field235, -88), class106.field2492 });
        }
        if (class147.field3410 == 1) {
            class19.field407++;
            class19.method134(-126, 14, arg0, class152.field3483, class79.method570(0, new class136[] { class49.field1126, class119.field2709, var5 }), arg1, arg4);
        } else if (!class40.field933) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (class4.field87[var6] != null) {
                    class41.field957++;
                    int var8 = 0;
                    short var9 = 0;
                    if (class4.field87[var6].method1092(1853, class125.field2899)) {
                        if (arg2.field255 > class24.field555.field255) {
                            var9 = 2000;
                        }
                        if (class24.field555.field252 != 0 && arg2.field252 != 0) {
                            if (class24.field555.field252 == arg2.field252) {
                                var9 = 2000;
                            } else {
                                var9 = 0;
                            }
                        }
                    } else if (class19.field386[var6]) {
                        var9 = 2000;
                    }
                    if (var6 == 0) {
                        var8 = var9 + 32;
                    }
                    if (var6 == 1) {
                        var8 = var9 + 1;
                    }
                    if (var6 == 2) {
                        var8 = var9 + 36;
                    }
                    if (var6 == 3) {
                        var8 = var9 + 21;
                    }
                    if (var6 == 4) {
                        var8 = var9 + 44;
                    }
                    class19.method134(-111, var8, arg0, class4.field87[var6], class79.method570(0, new class136[] { class16.field330, var5 }), arg1, arg4);
                }
            }
        } else if ((class5.field97 & 0x8) == 8) {
            class35.field827++;
            class19.method134(-124, 20, arg0, class27.field602, class79.method570(0, new class136[] { class28.field620, class119.field2709, var5 }), arg1, arg4);
        }
        for (int var7 = 0; var7 < class14.field274; var7++) {
            if (class27.field600[var7] == 12) {
                class65.field1407[var7] = class79.method570(0, new class136[] { class16.field330, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZIII)Ltd;")
    public static final class136 method635(boolean arg0, int arg1, int arg2, int arg3) {
        field2006++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var4 = 1;
        for (int var5 = arg2 / arg1; var5 != 0; var5 /= arg1) {
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        if (arg3 < 7) {
            method636(76, (byte) 66, null, -114, -83, -49, 44, 94);
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg2 % arg1;
            arg2 /= arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class136 var9 = new class136();
        var9.field3183 = var6;
        var9.field3182 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBLsb;IIIII)V")
    public static final void method636(int arg0, byte arg1, class127 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -30 / ((arg1 + 5) / 44);
        field2001++;
        if (arg4 < 0 || arg4 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var11 = arg2.method1011(16);
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg2.method1011(45);
                    return;
                }
                if (var11 <= 49) {
                    arg2.method1011(77);
                }
            }
        }
        class125.field2895[arg5][arg4][arg3] = 0;
        while (true) {
            int var9 = arg2.method1011(35);
            if (var9 == 0) {
                if (arg5 == 0) {
                    class78.field1804[0][arg4][arg3] = -class91.method683(arg3 + arg0 + 556238, arg4 + 932731 + arg7, (byte) 108) * 8;
                    return;
                } else {
                    class78.field1804[arg5][arg4][arg3] = class78.field1804[arg5 - 1][arg4][arg3] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg2.method1011(99);
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg5 != 0) {
                    class78.field1804[arg5][arg4][arg3] = class78.field1804[arg5 - 1][arg4][arg3] - var10 * 8;
                    return;
                }
                class78.field1804[0][arg4][arg3] = -var10 * 8;
                return;
            }
            if (var9 <= 49) {
                class40.field941[arg5][arg4][arg3] = arg2.method996(4);
                class35.field832[arg5][arg4][arg3] = (byte) ((var9 - 2) / 4);
                class15.field300[arg5][arg4][arg3] = (byte) class154.method1207(3, arg6 + var9 - 2);
            } else if (var9 <= 81) {
                class125.field2895[arg5][arg4][arg3] = (byte) (var9 - 49);
            } else {
                class4.field84[arg5][arg4][arg3] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lwe;Z)V")
    public static final void method637(class155 arg0, boolean arg1) {
        field1995++;
        if (!arg1) {
            field2004 = null;
        }
        arg0.field3582 = 0;
        if (arg0.field3563 == 0) {
            arg0.field3538 = 1024;
        }
        int var2 = arg0.field3576 - class44.field1013;
        int var3 = arg0.field3537 * 128 + arg0.field3565 * 64;
        if (arg0.field3563 == 1) {
            arg0.field3538 = 1536;
        }
        if (arg0.field3563 == 2) {
            arg0.field3538 = 0;
        }
        int var4 = arg0.field3571 * 128 + arg0.field3565 * 64;
        if (arg0.field3563 == 3) {
            arg0.field3538 = 512;
        }
        arg0.field3578 += (var4 - arg0.field3578) / var2;
        arg0.field3580 += (var3 - arg0.field3580) / var2;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class85() {
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
    public static void method638(int arg0) {
        field2003 = null;
        field2004 = null;
        if (arg0 == -5631) {
            field1999 = null;
            field1998 = null;
            field1996 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V")
    public class85(int arg0) {
        this.field2002 = arg0;
    }
}

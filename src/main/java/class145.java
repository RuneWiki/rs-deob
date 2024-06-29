import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class145 extends class121 {

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
    private int field3612 = 0;

    @OriginalMember(owner = "client!wa", name = "db", descriptor = "Loc;")
    public static class99 field3622 = class48.method402((byte) -104, "@gre@");

    @OriginalMember(owner = "client!wa", name = "ib", descriptor = "[Lef;")
    public static class35[] field3627 = new class35[256];

    @OriginalMember(owner = "client!wa", name = "gb", descriptor = "Loc;")
    public static class99 field3625 = class48.method402((byte) -104, "Entfernen");

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "Loc;")
    private static class99 field3616 = class48.method402((byte) -104, "Error loading your profile)3");

    @OriginalMember(owner = "client!wa", name = "jb", descriptor = "Loc;")
    public static class99 field3628 = field3616;

    @OriginalMember(owner = "client!wa", name = "mb", descriptor = "Loc;")
    public static class99 field3631 = class48.method402((byte) -104, "Welt");

    @OriginalMember(owner = "client!wa", name = "ab", descriptor = "[Loc;")
    public static class99[] field3619 = new class99[500];

    @OriginalMember(owner = "client!wa", name = "rb", descriptor = "Loc;")
    private static class99 field3636 = class48.method402((byte) -104, "Loaded title screen");

    @OriginalMember(owner = "client!wa", name = "pb", descriptor = "Loc;")
    public static class99 field3634 = field3636;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "I")
    public int field3615;

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!wa", name = "cb", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!wa", name = "eb", descriptor = "I")
    public int field3623;

    @OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!wa", name = "kb", descriptor = "I")
    public int field3629;

    @OriginalMember(owner = "client!wa", name = "lb", descriptor = "I")
    public int field3630;

    @OriginalMember(owner = "client!wa", name = "nb", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!wa", name = "ob", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!wa", name = "qb", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!wa", name = "sb", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!wa", name = "tb", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "Ldc;")
    public static class24 field3617;

    @OriginalMember(owner = "client!wa", name = "hb", descriptor = "Z")
    public static boolean field3626;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lib;BII)V")
    private final void method1187(class57 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 > 51) {
            if (arg2 == 1) {
                this.field3612 = arg0.method483(false);
            }
            field3637++;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Loc;")
    public static final class99 method1188(int arg0, int arg1) {
        if (arg1 < 90) {
            return null;
        }
        field3632++;
        if (arg0 < 100000) {
            return class5.method31(arg0, 10);
        } else if (arg0 < 10000000) {
            return class20.method189(new class99[] { class5.method31(arg0 / 1000, 10), class60.field1601 }, 35);
        } else {
            return class20.method189(new class99[] { class5.method31(arg0 / 1000000, 10), class110.field2716 }, 48);
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)V")
    private final void method1189(int arg0, int arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        field3620++;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var13 = 0.0D;
        if (var7 > var11) {
            var11 = var7;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        this.field3623 = (int) (var17 * 256.0D);
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (-var9 + var11) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        if (var17 > 0.5D) {
            this.field3629 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3629 = (int) (var15 * var17 * 512.0D);
        }
        if (arg1 < 49) {
            this.field3615 = 17;
        }
        if (this.field3629 < 1) {
            this.field3629 = 1;
        }
        if (this.field3623 < 0) {
            this.field3623 = 0;
        } else if (this.field3623 > 255) {
            this.field3623 = 255;
        }
        this.field3615 = (int) ((double) this.field3629 * var19);
        this.field3630 = (int) (var15 * 256.0D);
        if (this.field3630 < 0) {
            this.field3630 = 0;
        } else if (this.field3630 > 255) {
            this.field3630 = 255;
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    public static void method1190(int arg0) {
        field3631 = null;
        field3628 = null;
        field3625 = null;
        field3622 = null;
        field3619 = null;
        field3617 = null;
        field3616 = null;
        if (arg0 != -29741) {
            method1190(70);
        }
        field3634 = null;
        field3627 = null;
        field3636 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZLib;)V")
    public final void method1191(int arg0, boolean arg1, class57 arg2) {
        field3633++;
        while (true) {
            int var4 = arg2.method510(-118);
            if (var4 == 0) {
                if (arg1) {
                    return;
                } else {
                    method1192(null, 95, 119, -67);
                    return;
                }
            }
            this.method1187(arg2, (byte) 94, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lse;III)V")
    public static final void method1192(class126 arg0, int arg1, int arg2, int arg3) {
        field3638++;
        if ((arg2 & 0x20) != 0) {
            int var4 = class39.field965.method479(106);
            byte[] var5 = new byte[var4];
            class57 var6 = new class57(var5);
            class39.field965.method496((byte) -74, 0, var5, var4);
            class58.field1524[arg1] = var6;
            arg0.method1031(var6, 1);
        }
        if ((arg2 & 0x10) != 0) {
            arg0.field3121 = class39.field965.method518(261);
            if (arg0.field3121.method825(0, (byte) -70) == 126) {
                arg0.field3121 = arg0.field3121.method813(1, (byte) 98);
                class48.method400(2, arg0.field3121, 127, arg0.field3034);
            } else if (class69.field1770 == arg0) {
                class48.method400(2, arg0.field3121, -108, arg0.field3034);
            }
            arg0.field3072 = 0;
            arg0.field3067 = 0;
            arg0.field3105 = 150;
        }
        if ((arg2 & 0x8) != 0) {
            arg0.field3129 = class39.field965.method504((byte) 63);
            if (arg0.field3129 == 65535) {
                arg0.field3129 = -1;
            }
        }
        if ((arg2 & 0x200) != 0) {
            int var7 = class39.field965.method475(2);
            int var8 = class39.field965.method510(-111);
            arg0.method1036((byte) 105, class101.field2444, var7, var8);
            arg0.field3085 = class101.field2444 + 300;
            arg0.field3080 = class39.field965.method475(2);
            arg0.field3094 = class39.field965.method510(-111);
        }
        if ((arg2 & 0x1) != 0) {
            arg0.field3131 = class39.field965.method506(-1);
            arg0.field3071 = class39.field965.method478(false);
        }
        if ((arg2 & 0x400) != 0) {
            arg0.field3063 = class39.field965.method489(0);
            arg0.field3095 = class39.field965.method510(-120);
            arg0.field3097 = class39.field965.method475(2);
            arg0.field3066 = class39.field965.method489(0);
            arg0.field3074 = class39.field965.method497(29) + class101.field2444;
            arg0.field3101 = class39.field965.method497(29) + class101.field2444;
            arg0.field3102 = class39.field965.method489(0);
            arg0.field3113 = 0;
            arg0.field3070 = 1;
        }
        if ((arg2 & 0x4) != 0) {
            int var9 = class39.field965.method510(-113);
            int var10 = class39.field965.method475(2);
            arg0.method1036((byte) 105, class101.field2444, var9, var10);
            arg0.field3085 = class101.field2444 + 300;
            arg0.field3080 = class39.field965.method479(113);
            arg0.field3094 = class39.field965.method479(105);
        }
        if ((arg2 & 0x80) != 0) {
            int var11 = class39.field965.method504((byte) 89);
            int var12 = class39.field965.method475(2);
            int var13 = class39.field965.method475(2);
            int var14 = class39.field965.field1477;
            if (arg0.field3034 != null && arg0.field3020 != null) {
                long var15 = arg0.field3034.method834(-97);
                boolean var17 = false;
                if (var12 <= 1) {
                    for (int var18 = 0; var18 < class36.field922; var18++) {
                        if (class9.field229[var18] == var15) {
                            var17 = true;
                            break;
                        }
                    }
                }
                if (!var17 && class121.field2954 == 0) {
                    class46.field1094.field1477 = 0;
                    class39.field965.method469(var13, 0, 120, class46.field1094.field1469);
                    class46.field1094.field1477 = 0;
                    class99 var19 = class60.method534(true, class46.field1094).method820(false);
                    arg0.field3121 = var19.method846(-1);
                    arg0.field3105 = 150;
                    arg0.field3067 = var11 & 0xFF;
                    arg0.field3072 = var11 >> 8;
                    if (var12 == 2 || var12 == 3) {
                        class48.method400(1, var19, -117, class20.method189(new class99[] { class95.field2311, arg0.field3034 }, 34));
                    } else if (var12 == 1) {
                        class48.method400(1, var19, -16, class20.method189(new class99[] { class33.field801, arg0.field3034 }, 56));
                    } else {
                        class48.method400(2, var19, -9, arg0.field3034);
                    }
                }
            }
            class39.field965.field1477 = var13 + var14;
        }
        if ((arg2 & 0x40) != 0) {
            int var20 = class39.field965.method497(29);
            if (var20 == 65535) {
                var20 = -1;
            }
            int var21 = class39.field965.method510(-121);
            class27.method254(arg0, var20, -30014, var21);
        }
        int var22 = -46 / ((22 - arg3) / 58);
        if ((arg2 & 0x100) == 0) {
            return;
        }
        arg0.field3088 = class39.field965.method504((byte) 37);
        int var23 = class39.field965.method482(-1);
        if (arg0.field3088 == 65535) {
            arg0.field3088 = -1;
        }
        arg0.field3083 = (var23 & 0xFFFF) + class101.field2444;
        arg0.field3106 = var23 >> 16;
        arg0.field3062 = 0;
        if (class101.field2444 < arg0.field3083) {
            arg0.field3062 = -1;
        }
        arg0.field3091 = 0;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lta;B)V")
    public static final void method1193(class127 arg0, byte arg1) {
        field3624++;
        arg0.field3089 = false;
        if (arg0.field3092 != -1) {
            class81 var2 = class142.method1163(-126, arg0.field3092);
            if (var2 == null || var2.field2026 == null) {
                arg0.field3092 = -1;
            } else {
                arg0.field3103++;
                if (var2.field2026.length > arg0.field3108 && var2.field2016[arg0.field3108] < arg0.field3103) {
                    arg0.field3103 = 1;
                    arg0.field3108++;
                    class73.method665(arg0.field3115, arg0.field3077, arg0.field3108, 0, var2);
                }
                if (var2.field2026.length <= arg0.field3108) {
                    arg0.field3108 = 0;
                    arg0.field3103 = 0;
                    class73.method665(arg0.field3115, arg0.field3077, arg0.field3108, 0, var2);
                }
            }
        }
        int var3 = 29 / ((68 - arg1) / 36);
        if (arg0.field3088 != -1 && class101.field2444 >= arg0.field3083) {
            if (arg0.field3062 < 0) {
                arg0.field3062 = 0;
            }
            int var4 = class52.method434(arg0.field3088, 25138).field325;
            if (var4 == -1) {
                arg0.field3088 = -1;
            } else {
                class81 var5 = class142.method1163(-122, var4);
                if (var5 == null || var5.field2026 == null) {
                    arg0.field3088 = -1;
                } else {
                    arg0.field3091++;
                    if (arg0.field3062 < var5.field2026.length && arg0.field3091 > var5.field2016[arg0.field3062]) {
                        arg0.field3062++;
                        arg0.field3091 = 1;
                        class73.method665(arg0.field3115, arg0.field3077, arg0.field3062, 0, var5);
                    }
                    if (var5.field2026.length <= arg0.field3062 && (arg0.field3062 < 0 || var5.field2026.length <= arg0.field3062)) {
                        arg0.field3088 = -1;
                    }
                }
            }
        }
        if (arg0.field3132 != -1 && arg0.field3128 <= 1) {
            class81 var6 = class142.method1163(-127, arg0.field3132);
            if (var6.field2005 == 1 && arg0.field3113 > 0 && arg0.field3074 <= class101.field2444 && class101.field2444 > arg0.field3101) {
                arg0.field3128 = 1;
                return;
            }
        }
        if (arg0.field3132 != -1 && arg0.field3128 == 0) {
            class81 var7 = class142.method1163(-108, arg0.field3132);
            if (var7 == null || var7.field2026 == null) {
                arg0.field3132 = -1;
            } else {
                arg0.field3104++;
                if (var7.field2026.length > arg0.field3081 && arg0.field3104 > var7.field2016[arg0.field3081]) {
                    arg0.field3081++;
                    arg0.field3104 = 1;
                    class73.method665(arg0.field3115, arg0.field3077, arg0.field3081, 0, var7);
                }
                if (arg0.field3081 >= var7.field2026.length) {
                    arg0.field3060++;
                    arg0.field3081 -= var7.field2008;
                    if (var7.field2023 <= arg0.field3060) {
                        arg0.field3132 = -1;
                    } else if (arg0.field3081 >= 0 && var7.field2026.length > arg0.field3081) {
                        class73.method665(arg0.field3115, arg0.field3077, arg0.field3081, 0, var7);
                    } else {
                        arg0.field3132 = -1;
                    }
                }
                arg0.field3089 = var7.field2010;
            }
        }
        if (arg0.field3128 > 0) {
            arg0.field3128--;
        }
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
    public final void method1194(int arg0) {
        if (arg0 == -28127) {
            this.method1189(this.field3612, arg0 ^ 0xFFFF926E);
            field3635++;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1195(int arg0, boolean arg1) {
        if (arg1) {
            field3621++;
            return (arg0 >> 30 & 0x1) != 0;
        } else {
            return false;
        }
    }
}

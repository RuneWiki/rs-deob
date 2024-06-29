import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class29 extends class145 {

    @OriginalMember(owner = "client!e", name = "X", descriptor = "[S")
    private short[] field631 = new short[6];

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
    private int field638 = 0;

    @OriginalMember(owner = "client!e", name = "jb", descriptor = "I")
    private int field643 = 0;

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
    public int field639 = -1;

    @OriginalMember(owner = "client!e", name = "pb", descriptor = "I")
    private int field649 = 128;

    @OriginalMember(owner = "client!e", name = "sb", descriptor = "I")
    private int field652 = 128;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "[S")
    private short[] field637 = new short[6];

    @OriginalMember(owner = "client!e", name = "ub", descriptor = "I")
    private int field654 = 0;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "Ltd;")
    public static class136 field630 = class145.method1172("Hier wechseln", 45);

    @OriginalMember(owner = "client!e", name = "gb", descriptor = "I")
    public static int field640 = 0;

    @OriginalMember(owner = "client!e", name = "ib", descriptor = "Ltd;")
    private static class136 field642 = class145.method1172("Prepared sound engine", 45);

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "Ltd;")
    public static class136 field636 = class145.method1172(" <col=ffffff>", 45);

    @OriginalMember(owner = "client!e", name = "lb", descriptor = "Ltd;")
    public static class136 field645 = class145.method1172("<col=c0ff00>", 45);

    @OriginalMember(owner = "client!e", name = "nb", descriptor = "Ltd;")
    private static class136 field647 = class145.method1172("glow3:", 45);

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "Ltd;")
    public static class136 field633 = class145.method1172("Einloggen", 45);

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "Ltd;")
    public static class136 field632 = field647;

    @OriginalMember(owner = "client!e", name = "vb", descriptor = "Ltd;")
    public static class136 field655 = class145.method1172("Verbinde mit Server)3)3)3", 45);

    @OriginalMember(owner = "client!e", name = "qb", descriptor = "Ltd;")
    public static class136 field650 = field642;

    @OriginalMember(owner = "client!e", name = "rb", descriptor = "Ltd;")
    public static class136 field651 = field647;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "I")
    private int field628;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!e", name = "hb", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!e", name = "kb", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!e", name = "mb", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!e", name = "ob", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "client!e", name = "tb", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "Z")
    public static boolean field635;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Lda;")
    public final class23 method246(int arg0, int arg1) {
        class23 var3 = (class23) class122.field2832.method1162((long) this.field648, true);
        field646++;
        if (var3 == null) {
            class126 var4 = class126.method974(class69.field1466, this.field628, 0);
            if (var4 == null) {
                return null;
            }
            for (int var5 = 0; var5 < 6; var5++) {
                if (this.field631[0] != 0) {
                    var4.method973(this.field631[var5], this.field637[var5]);
                }
            }
            var3 = var4.method984(this.field654 + 64, 850 - -this.field638, -30, -50, -30);
            class122.field2832.method1164((long) this.field648, var3, (byte) 127);
        }
        class23 var6;
        if (this.field639 == -1 || arg1 == -1) {
            var6 = var3.method198(true);
        } else {
            var6 = method252(true, this.field639).method919(-7, var3, arg1);
        }
        if (~this.field649 != arg0 || this.field652 != 128) {
            var6.method199(this.field649, this.field652, this.field649);
        }
        if (this.field643 != 0) {
            if (this.field643 == 90) {
                var6.method202();
            }
            if (this.field643 == 180) {
                var6.method202();
                var6.method202();
            }
            if (this.field643 == 270) {
                var6.method202();
                var6.method202();
                var6.method202();
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(B)V")
    public static void method247(byte arg0) {
        field655 = null;
        field647 = null;
        field650 = null;
        field633 = null;
        if (arg0 != 90) {
            field655 = null;
        }
        field636 = null;
        field645 = null;
        field642 = null;
        field632 = null;
        field630 = null;
        field651 = null;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)V")
    public static final void method248(int arg0, int arg1) {
        class41.field969 += arg1 * 128;
        short var2 = 256;
        field634++;
        if (class105.field2489.length < class41.field969) {
            class41.field969 -= class105.field2489.length;
            int var3 = (int) (Math.random() * 12.0D);
            class67.method495((byte) 122, class99.field2401[var3]);
        }
        if (arg0 >= -37) {
            field635 = false;
        }
        int var4 = (var2 - arg1) * 128;
        int var5 = arg1 * 128;
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            int var27 = class41.field965[var5 + var6] - class105.field2489[var6 + class41.field969 & class105.field2489.length + -1] * arg1 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class41.field965[var6++] = var27;
        }
        for (int var8 = var2 - arg1; var8 < var2; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class41.field965[var24 + var25] = 255;
                } else {
                    class41.field965[var25 + var24] = 0;
                }
            }
        }
        if (class104.field2464 > 0) {
            class104.field2464 -= arg1 * 4;
        }
        if (class140.field3258 > 0) {
            class140.field3258 -= arg1 * 4;
        }
        if (class140.field3258 == 0 && class104.field2464 == 0) {
            int var9 = (int) ((double) (2000 / arg1) * Math.random());
            if (var9 == 1) {
                class104.field2464 = 1024;
            }
            if (var9 == 0) {
                class140.field3258 = 1024;
            }
        }
        for (int var10 = 0; var10 < var2 - arg1; var10++) {
            class145.field3347[var10] = class145.field3347[arg1 + var10];
        }
        for (int var11 = var2 - arg1; var11 < var2; var11++) {
            class145.field3347[var11] = (int) (Math.sin((double) class83.field1977 / 14.0D) * 16.0D + Math.sin((double) class83.field1977 / 15.0D) * 14.0D + Math.sin((double) class83.field1977 / 16.0D) * 12.0D);
            class83.field1977++;
        }
        class154.field3530 += arg1;
        int var12 = ((class44.field1013 & 0x1) + arg1) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class154.field3530 * 100; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class41.field965[(var23 << 7) + var22] = 192;
        }
        class154.field3530 = 0;
        for (int var14 = 0; var14 < var2; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var19 += class41.field965[var20 + var21 + var12];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class41.field965[var20 + var21 - var12 - 1];
                }
                if (var21 >= 0) {
                    class15.field310[var20 + var21] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var2; var17++) {
                int var18 = var17 * 128;
                if (var12 + var17 < var2) {
                    var16 += class15.field310[var15 + var18 + var12 * 128];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class15.field310[var15 + var18 - (var12 + 1) * 128];
                }
                if (var17 >= 0) {
                    class41.field965[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lsb;II)V")
    private final void method249(class127 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field628 = arg0.method1020(false);
        } else if (arg2 == 2) {
            this.field639 = arg0.method1020(false);
        } else if (arg2 == 4) {
            this.field649 = arg0.method1020(false);
        } else if (arg2 == 5) {
            this.field652 = arg0.method1020(false);
        } else if (arg2 == 6) {
            this.field643 = arg0.method1020(false);
        } else if (arg2 == 7) {
            this.field654 = arg0.method1011(40);
        } else if (arg2 == 8) {
            this.field638 = arg0.method1011(arg1 ^ 0xFFFFFF8E);
        } else if (arg2 >= 40 && arg2 < 50) {
            this.field631[arg2 - 40] = (short) arg0.method1020(false);
        } else if (arg2 >= 50 && arg2 < 60) {
            this.field637[arg2 - 50] = (short) arg0.method1020(false);
        }
        if (arg1 != -50) {
            method251(null, 4, -2, 46, -101, false, 49, 84, null);
        }
        field641++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lsb;B)V")
    public final void method250(class127 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1011(73);
            if (var3 == 0) {
                if (arg1 >= -82) {
                    field642 = null;
                }
                field644++;
                return;
            }
            this.method249(arg0, -50, var3);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lm;IIIIZIILo;)V")
    public static final void method251(class83 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, class97 arg8) {
        field653++;
        if (class65.field1399 && (class125.field2895[0][arg4][arg2] & 0x2) == 0) {
            if ((class125.field2895[arg1][arg4][arg2] & 0x10) != 0) {
                return;
            }
            if (client.method177(arg1, 2, arg4, arg2) != class107.field2520) {
                return;
            }
        }
        if (class76.field1714 > arg1) {
            class76.field1714 = arg1;
        }
        int var9 = class78.field1804[arg1][arg4 + 1][arg2 + 1];
        int var10 = class78.field1804[arg1][arg4][arg2];
        int var11 = class78.field1804[arg1][arg4 + 1][arg2];
        int var12 = class78.field1804[arg1][arg4][arg2 + 1];
        int var13 = var9 + var10 + var11 + var12 >> 2;
        class128 var14 = class142.method1154(arg6, -72);
        int var15 = (arg3 << 6) + arg7;
        if (var14.field3064 == 1) {
            var15 += 256;
        }
        int var16 = (arg2 << 7) + (arg6 << 14) + arg4 + 1073741824;
        if (!arg5) {
            field633 = null;
        }
        if (var14.field3037 == 0) {
            var16 += Integer.MIN_VALUE;
        }
        if (var14.method1045(0)) {
            class116.method916(arg3, false, var14, arg4, arg1, arg2);
        }
        if (arg7 == 22) {
            if (!class65.field1399 || var14.field3037 != 0 || var14.field3026 == 1 || var14.field3028) {
                class112 var17;
                if (var14.field3032 == -1 && var14.field3065 == null) {
                    var17 = var14.method1048(22, var9, var11, var10, arg3, (byte) -114, var12);
                } else {
                    var17 = new class47(arg6, 22, arg3, var10, var11, var9, var12, var14.field3032, true, null);
                }
                arg8.method744(arg1, arg4, arg2, var13, var17, var16, var15);
                if (var14.field3026 == 1 && arg0 != null) {
                    arg0.method619(arg2, (byte) -126, arg4);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class112 var37;
            if (var14.field3032 == -1 && var14.field3065 == null) {
                var37 = var14.method1048(10, var9, var11, var10, arg3, (byte) 123, var12);
            } else {
                var37 = new class47(arg6, 10, arg3, var10, var11, var9, var12, var14.field3032, true, null);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg3 == 1 || arg3 == 3) {
                    var38 = var14.field3071;
                    var39 = var14.field3076;
                } else {
                    var38 = var14.field3076;
                    var39 = var14.field3071;
                }
                int var40 = 0;
                if (arg7 == 11) {
                    var40 += 256;
                }
                if (arg8.method753(arg1, arg4, arg2, var13, var38, var39, var37, var40, var16, var15) && var14.field3072) {
                    int var41 = 15;
                    if (var37 instanceof class23) {
                        var41 = ((class23) var37).method208() / 4;
                        if (var41 > 30) {
                            var41 = 30;
                        }
                    }
                    for (int var42 = 0; var42 <= var38; var42++) {
                        for (int var43 = 0; var43 <= var39; var43++) {
                            if (var41 > class133.field3141[arg1][arg4 + var42][arg2 + var43]) {
                                class133.field3141[arg1][arg4 + var42][arg2 + var43] = (byte) var41;
                            }
                        }
                    }
                }
            }
            if (var14.field3026 != 0 && arg0 != null) {
                arg0.method624(var14.field3076, arg3, arg2, var14.field3033, arg4, var14.field3071, 127);
            }
        } else if (arg7 >= 12) {
            class112 var18;
            if (var14.field3032 == -1 && var14.field3065 == null) {
                var18 = var14.method1048(arg7, var9, var11, var10, arg3, (byte) -27, var12);
            } else {
                var18 = new class47(arg6, arg7, arg3, var10, var11, var9, var12, var14.field3032, true, null);
            }
            arg8.method753(arg1, arg4, arg2, var13, 1, 1, var18, 0, var16, var15);
            if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg1 > 0) {
                class16.field322[arg1][arg4][arg2] = class2.method13(class16.field322[arg1][arg4][arg2], 2340);
            }
            if (var14.field3026 != 0 && arg0 != null) {
                arg0.method624(var14.field3076, arg3, arg2, var14.field3033, arg4, var14.field3071, 127);
            }
        } else if (arg7 == 0) {
            class112 var19;
            if (var14.field3032 == -1 && var14.field3065 == null) {
                var19 = var14.method1048(0, var9, var11, var10, arg3, (byte) -116, var12);
            } else {
                var19 = new class47(arg6, 0, arg3, var10, var11, var9, var12, var14.field3032, true, null);
            }
            arg8.method781(arg1, arg4, arg2, var13, var19, null, class15.field290[arg3], 0, var16, var15);
            if (arg3 == 0) {
                if (var14.field3072) {
                    class133.field3141[arg1][arg4][arg2] = 50;
                    class133.field3141[arg1][arg4][arg2 + 1] = 50;
                }
                if (var14.field3041) {
                    class16.field322[arg1][arg4][arg2] = class2.method13(class16.field322[arg1][arg4][arg2], 585);
                }
            } else if (arg3 == 1) {
                if (var14.field3072) {
                    class133.field3141[arg1][arg4][arg2 + 1] = 50;
                    class133.field3141[arg1][arg4 + 1][arg2 + 1] = 50;
                }
                if (var14.field3041) {
                    class16.field322[arg1][arg4][arg2 + 1] = class2.method13(class16.field322[arg1][arg4][arg2 + 1], 1170);
                }
            } else if (arg3 == 2) {
                if (var14.field3072) {
                    class133.field3141[arg1][arg4 + 1][arg2] = 50;
                    class133.field3141[arg1][arg4 + 1][arg2 + 1] = 50;
                }
                if (var14.field3041) {
                    class16.field322[arg1][arg4 + 1][arg2] = class2.method13(class16.field322[arg1][arg4 + 1][arg2], 585);
                }
            } else if (arg3 == 3) {
                if (var14.field3072) {
                    class133.field3141[arg1][arg4][arg2] = 50;
                    class133.field3141[arg1][arg4 + 1][arg2] = 50;
                }
                if (var14.field3041) {
                    class16.field322[arg1][arg4][arg2] = class2.method13(class16.field322[arg1][arg4][arg2], 1170);
                }
            }
            if (var14.field3026 != 0 && arg0 != null) {
                arg0.method625(arg4, arg7, -101, arg2, var14.field3033, arg3);
            }
            if (var14.field3036 != 16) {
                arg8.method766(arg1, arg4, arg2, var14.field3036);
            }
        } else if (arg7 == 1) {
            class112 var20;
            if (var14.field3032 == -1 && var14.field3065 == null) {
                var20 = var14.method1048(1, var9, var11, var10, arg3, (byte) -31, var12);
            } else {
                var20 = new class47(arg6, 1, arg3, var10, var11, var9, var12, var14.field3032, true, null);
            }
            arg8.method781(arg1, arg4, arg2, var13, var20, null, client.field455[arg3], 0, var16, var15);
            if (var14.field3072) {
                if (arg3 == 0) {
                    class133.field3141[arg1][arg4][arg2 + 1] = 50;
                } else if (arg3 == 1) {
                    class133.field3141[arg1][arg4 + 1][arg2 + 1] = 50;
                } else if (arg3 == 2) {
                    class133.field3141[arg1][arg4 + 1][arg2] = 50;
                } else if (arg3 == 3) {
                    class133.field3141[arg1][arg4][arg2] = 50;
                }
            }
            if (var14.field3026 != 0 && arg0 != null) {
                arg0.method625(arg4, arg7, 88, arg2, var14.field3033, arg3);
            }
        } else if (arg7 == 2) {
            int var21 = arg3 + 1 & 0x3;
            class112 var22;
            class112 var23;
            if (var14.field3032 == -1 && var14.field3065 == null) {
                var22 = var14.method1048(2, var9, var11, var10, arg3 + 4, (byte) -120, var12);
                var23 = var14.method1048(2, var9, var11, var10, var21, (byte) -110, var12);
            } else {
                var22 = new class47(arg6, 2, arg3 + 4, var10, var11, var9, var12, var14.field3032, true, null);
                var23 = new class47(arg6, 2, var21, var10, var11, var9, var12, var14.field3032, true, null);
            }
            arg8.method781(arg1, arg4, arg2, var13, var22, var23, class15.field290[arg3], class15.field290[var21], var16, var15);
            if (var14.field3041) {
                if (arg3 == 0) {
                    class16.field322[arg1][arg4][arg2] = class2.method13(class16.field322[arg1][arg4][arg2], 585);
                    class16.field322[arg1][arg4][arg2 + 1] = class2.method13(class16.field322[arg1][arg4][arg2 + 1], 1170);
                } else if (arg3 == 1) {
                    class16.field322[arg1][arg4][arg2 + 1] = class2.method13(class16.field322[arg1][arg4][arg2 + 1], 1170);
                    class16.field322[arg1][arg4 + 1][arg2] = class2.method13(class16.field322[arg1][arg4 + 1][arg2], 585);
                } else if (arg3 == 2) {
                    class16.field322[arg1][arg4 + 1][arg2] = class2.method13(class16.field322[arg1][arg4 + 1][arg2], 585);
                    class16.field322[arg1][arg4][arg2] = class2.method13(class16.field322[arg1][arg4][arg2], 1170);
                } else if (arg3 == 3) {
                    class16.field322[arg1][arg4][arg2] = class2.method13(class16.field322[arg1][arg4][arg2], 1170);
                    class16.field322[arg1][arg4][arg2] = class2.method13(class16.field322[arg1][arg4][arg2], 585);
                }
            }
            if (var14.field3026 != 0 && arg0 != null) {
                arg0.method625(arg4, arg7, -104, arg2, var14.field3033, arg3);
            }
            if (var14.field3036 != 16) {
                arg8.method766(arg1, arg4, arg2, var14.field3036);
            }
        } else if (arg7 == 3) {
            class112 var24;
            if (var14.field3032 == -1 && var14.field3065 == null) {
                var24 = var14.method1048(3, var9, var11, var10, arg3, (byte) -115, var12);
            } else {
                var24 = new class47(arg6, 3, arg3, var10, var11, var9, var12, var14.field3032, true, null);
            }
            arg8.method781(arg1, arg4, arg2, var13, var24, null, client.field455[arg3], 0, var16, var15);
            if (var14.field3072) {
                if (arg3 == 0) {
                    class133.field3141[arg1][arg4][arg2 + 1] = 50;
                } else if (arg3 == 1) {
                    class133.field3141[arg1][arg4 + 1][arg2 + 1] = 50;
                } else if (arg3 == 2) {
                    class133.field3141[arg1][arg4 + 1][arg2] = 50;
                } else if (arg3 == 3) {
                    class133.field3141[arg1][arg4][arg2] = 50;
                }
            }
            if (var14.field3026 != 0 && arg0 != null) {
                arg0.method625(arg4, arg7, -119, arg2, var14.field3033, arg3);
            }
        } else if (arg7 == 9) {
            class112 var25;
            if (var14.field3032 == -1 && var14.field3065 == null) {
                var25 = var14.method1048(arg7, var9, var11, var10, arg3, (byte) 120, var12);
            } else {
                var25 = new class47(arg6, arg7, arg3, var10, var11, var9, var12, var14.field3032, true, null);
            }
            arg8.method753(arg1, arg4, arg2, var13, 1, 1, var25, 0, var16, var15);
            if (var14.field3026 != 0 && arg0 != null) {
                arg0.method624(var14.field3076, arg3, arg2, var14.field3033, arg4, var14.field3071, 127);
            }
        } else {
            if (var14.field3057) {
                if (arg3 == 1) {
                    int var29 = var12;
                    var12 = var9;
                    var9 = var11;
                    var11 = var10;
                    var10 = var29;
                } else if (arg3 == 2) {
                    int var26 = var12;
                    var12 = var11;
                    var11 = var26;
                    int var27 = var9;
                    var9 = var10;
                    var10 = var27;
                } else if (arg3 == 3) {
                    int var28 = var12;
                    var12 = var10;
                    var10 = var11;
                    var11 = var9;
                    var9 = var28;
                }
            }
            if (arg7 == 4) {
                class112 var30;
                if (var14.field3032 == -1 && var14.field3065 == null) {
                    var30 = var14.method1048(4, var9, var11, var10, 0, (byte) -114, var12);
                } else {
                    var30 = new class47(arg6, 4, 0, var10, var11, var9, var12, var14.field3032, true, null);
                }
                arg8.method756(arg1, arg4, arg2, var13, var30, class15.field290[arg3], arg3 * 512, 0, 0, var16, var15);
            } else if (arg7 == 5) {
                int var31 = arg8.method739(arg1, arg4, arg2);
                int var32 = 16;
                if (var31 != 0) {
                    var32 = class142.method1154(var31 >> 14 & 0x7FFF, 102).field3036;
                }
                class112 var33;
                if (var14.field3032 == -1 && var14.field3065 == null) {
                    var33 = var14.method1048(4, var9, var11, var10, 0, (byte) 60, var12);
                } else {
                    var33 = new class47(arg6, 4, 0, var10, var11, var9, var12, var14.field3032, true, null);
                }
                arg8.method756(arg1, arg4, arg2, var13, var33, class15.field290[arg3], arg3 * 512, class153.field3502[arg3] * var32, class151.field3453[arg3] * var32, var16, var15);
            } else if (arg7 == 6) {
                class112 var34;
                if (var14.field3032 == -1 && var14.field3065 == null) {
                    var34 = var14.method1048(4, var9, var11, var10, 0, (byte) 35, var12);
                } else {
                    var34 = new class47(arg6, 4, 0, var10, var11, var9, var12, var14.field3032, true, null);
                }
                arg8.method756(arg1, arg4, arg2, var13, var34, 256, arg3, 0, 0, var16, var15);
            } else if (arg7 == 7) {
                class112 var35;
                if (var14.field3032 == -1 && var14.field3065 == null) {
                    var35 = var14.method1048(4, var9, var11, var10, 0, (byte) -18, var12);
                } else {
                    var35 = new class47(arg6, 4, 0, var10, var11, var9, var12, var14.field3032, true, null);
                }
                arg8.method756(arg1, arg4, arg2, var13, var35, 512, arg3, 0, 0, var16, var15);
            } else if (arg7 == 8) {
                class112 var36;
                if (var14.field3032 == -1 && var14.field3065 == null) {
                    var36 = var14.method1048(4, var9, var11, var10, 0, (byte) -118, var12);
                } else {
                    var36 = new class47(arg6, 4, 0, var10, var11, var9, var12, var14.field3032, true, null);
                }
                arg8.method756(arg1, arg4, arg2, var13, var36, 768, arg3, 0, 0, var16, var15);
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZI)Lqe;")
    public static final class116 method252(boolean arg0, int arg1) {
        field629++;
        class116 var2 = (class116) class142.field3301.method1162((long) arg1, arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class93.field2178.method669(arg1, 12, -39);
        class116 var4 = new class116();
        if (var3 != null) {
            var4.method917(new class127(var3), 0);
        }
        var4.method912(106);
        class142.field3301.method1164((long) arg1, var4, (byte) 127);
        return var4;
    }
}

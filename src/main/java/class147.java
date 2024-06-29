import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class147 extends class12 {

    @OriginalMember(owner = "client!va", name = "D", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3207 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!va", name = "I", descriptor = "Lpe;")
    public static class109 field3212 = class141.method1120("Gegenstand f-Ur Mitglieder", 0);

    @OriginalMember(owner = "client!va", name = "F", descriptor = "Lcd;")
    public static class19 field3209 = new class19();

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public static volatile int field3214 = 0;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "Lpe;")
    private static class109 field3215 = class141.method1120("Prepared sound engine", 0);

    @OriginalMember(owner = "client!va", name = "M", descriptor = "Lpe;")
    public static class109 field3216 = class141.method1120("null", 0);

    @OriginalMember(owner = "client!va", name = "N", descriptor = "Lpe;")
    public static class109 field3217 = field3215;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public int field3197;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public int field3206;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "Lfb;")
    public static class38 field3213;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "Lac;")
    public static class4 field3210;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "Lle;")
    public static class81 field3201;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "[I")
    public int[] field3198;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "[I")
    public int[] field3199;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "[I")
    public int[] field3202;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "[Lcf;")
    public class21[] field3196;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "[Lcf;")
    public class21[] field3205;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "[[[B")
    public byte[][][] field3200;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public static final void method1145(int arg0) {
        field3208++;
        class138.method1092(arg0 ^ arg0, class66.field1334);
        class27.field631++;
        if (class113.field2482 && class82.field1731) {
            int var1 = class48.field992;
            int var2 = class82.field1754;
            int var3 = var2 - class62.field1282;
            int var4 = var1 - class76.field1579;
            if (class20.field509 > var4) {
                var4 = class20.field509;
            }
            if (class110.field2327 > var3) {
                var3 = class110.field2327;
            }
            if (var4 + class66.field1334.field3382 > class20.field509 + class100.field2100.field3382) {
                var4 = class20.field509 + class100.field2100.field3382 - class66.field1334.field3382;
            }
            if (class66.field1334.field3427 + var3 > class110.field2327 + class100.field2100.field3427) {
                var3 = class100.field2100.field3427 + class110.field2327 - class66.field1334.field3427;
            }
            int var5 = var3 - class23.field540;
            int var6 = class66.field1334.field3400;
            int var7 = var3 + class100.field2100.field3481 - class110.field2327;
            int var8 = var4 - class20.field507;
            int var9 = var4 + class100.field2100.field3417 - class20.field509;
            if (class66.field1334.field3495 < class27.field631 && (var6 < var5 || var5 < -var6 || var8 > var6 || -var6 > var8)) {
                class32.field690 = true;
            }
            if (class66.field1334.field3454 != null && class32.field690) {
                class93 var10 = new class93();
                var10.field2001 = class66.field1334.field3454;
                var10.field2009 = var9;
                var10.field2016 = var7;
                var10.field2014 = class66.field1334;
                class123.method1003(var10, (byte) 97);
            }
            if (class19.field467 == 0) {
                if (class32.field690) {
                    if (class66.field1334.field3482 != null) {
                        class93 var11 = new class93();
                        var11.field2014 = class66.field1334;
                        var11.field2009 = var9;
                        var11.field2001 = class66.field1334.field3482;
                        var11.field2018 = class19.field470;
                        var11.field2016 = var7;
                        class123.method1003(var11, (byte) 62);
                    }
                    if (class19.field470 != null && class114.method943((byte) 123, class66.field1334) != null) {
                        class131.field2872++;
                        class63.field1299.method535(151, -25013);
                        class63.field1299.method134(class19.field470.field3478, (byte) 113);
                        class63.field1299.method129(false, class66.field1334.field3478);
                        class63.field1299.method156(false, class19.field470.field3514);
                        class63.field1299.method118(class66.field1334.field3514, arg0 + 675280428);
                    }
                } else if ((class127.field2827 == 1 || class23.method221(2000, class63.field1302 - 1)) && class63.field1302 > 2) {
                    class42.method389(0);
                } else if (class63.field1302 > 0) {
                    class92.method767((byte) -117, class63.field1302 - 1);
                }
                class66.field1334 = null;
            }
        } else if (class27.field631 > 1) {
            class66.field1334 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)I")
    public static final int method1146(int arg0) {
        int var1 = 3;
        field3204++;
        if (class116.field2591 < 310) {
            int var2 = class136.field2975.field3106 >> 7;
            int var3 = class154.field3518 >> 7;
            int var4 = class85.field1795 >> 7;
            int var5 = class136.field2975.field3094 >> 7;
            if ((class107.field2249[class75.field1513][var4][var3] & 0x4) != 0) {
                var1 = class75.field1513;
            }
            int var6;
            if (var5 > var4) {
                var6 = var5 - var4;
            } else {
                var6 = var4 - var5;
            }
            int var7;
            if (var2 > var3) {
                var7 = var2 - var3;
            } else {
                var7 = var3 - var2;
            }
            if (var6 <= var7) {
                int var8 = var6 * 65536 / var7;
                int var9 = 32768;
                while (var2 != var3) {
                    if (var2 > var3) {
                        var3++;
                    } else if (var2 < var3) {
                        var3--;
                    }
                    if ((class107.field2249[class75.field1513][var4][var3] & 0x4) != 0) {
                        var1 = class75.field1513;
                    }
                    var9 += var8;
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var4 < var5) {
                            var4++;
                        } else if (var4 > var5) {
                            var4--;
                        }
                        if ((class107.field2249[class75.field1513][var4][var3] & 0x4) != 0) {
                            var1 = class75.field1513;
                        }
                    }
                }
            } else {
                int var10 = var7 * 65536 / var6;
                int var11 = 32768;
                while (var4 != var5) {
                    var11 += var10;
                    if (var4 < var5) {
                        var4++;
                    } else if (var5 < var4) {
                        var4--;
                    }
                    if ((class107.field2249[class75.field1513][var4][var3] & 0x4) != 0) {
                        var1 = class75.field1513;
                    }
                    if (var11 >= 65536) {
                        if (var2 > var3) {
                            var3++;
                        } else if (var2 < var3) {
                            var3--;
                        }
                        var11 -= 65536;
                        if ((class107.field2249[class75.field1513][var4][var3] & 0x4) != 0) {
                            var1 = class75.field1513;
                        }
                    }
                }
            }
        }
        if (arg0 == 19203) {
            if ((class107.field2249[class75.field1513][class136.field2975.field3094 >> 7][class136.field2975.field3106 >> 7] & 0x4) != 0) {
                var1 = class75.field1513;
            }
            return var1;
        } else {
            return -60;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)V")
    public static void method1147(byte arg0) {
        field3212 = null;
        field3209 = null;
        field3213 = null;
        field3207 = null;
        field3201 = null;
        field3217 = null;
        field3210 = null;
        field3216 = null;
        field3215 = null;
        if (arg0 >= -58) {
            field3201 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
    public static final void method1148(boolean arg0) {
        if (field3210 != null) {
            field3210.method28(1);
        }
        if (class49.field1013 != null) {
            class49.field1013.method28(1);
        }
        if (!arg0) {
            field3211++;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)V")
    public static final void method1149(boolean arg0) {
        class6.field133 = new int[4][105][105];
        class153.field3374 = new byte[4][104][104];
        class112.field2400 = new int[104];
        class126.field2796 = new byte[4][105][105];
        class101.field2108 = new int[104];
        class82.field1765 = new byte[4][104][104];
        class135.field2939 = new byte[4][104][104];
        class131.field2883 = new int[105][105];
        field3203++;
        class12.field273 = new int[104];
        class16.field407 = 99;
        class14.field377 = new int[104];
        if (arg0) {
            method1148(true);
        }
        class89.field1885 = new int[104];
        class67.field1359 = new byte[4][104][104];
    }
}

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class149 {

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Ltd;")
    private static class136 field3425 = class145.method1172("Welcome to RuneScape", 45);

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Ltd;")
    public static class136 field3431 = field3425;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Ltd;")
    public static class136 field3430 = class145.method1172("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", 45);

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field3429 = 0;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field3426 = 0;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Ltd;")
    public static class136 field3434 = class145.method1172("Untersuchen", 45);

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field3433 = 0;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Ltd;")
    public static class136 field3436 = class145.method1172("::fpson", 45);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Lmd;")
    public static class87 field3424;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "[Lbb;")
    public static class10[] field3427;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)Z")
    public static final boolean method1186(int arg0) {
        field3432++;
        long var1 = class27.method233((byte) -39);
        int var3 = (int) (var1 - class63.field1352);
        class63.field1352 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class16.field333 += var3;
        if (field3429 == 0 && class63.field1334 == 0 && class77.field1769 == 0 && class80.field1828 == 0) {
            return true;
        } else if (class3.field60 == null) {
            return false;
        } else {
            try {
                if (class16.field333 > 30000) {
                    throw new IOException();
                }
                while (class63.field1334 < 20 && class80.field1828 > 0) {
                    class77 var4 = (class77) class80.field1870.method107((byte) -117);
                    class127 var5 = new class127(4);
                    var5.method1026(1, (byte) 127);
                    var5.method1001(65, (int) var4.field2090);
                    class3.field60.method145(4, arg0 - 6680, var5.field2960, 0);
                    class128.field3085.method112(var4, (byte) 3, var4.field2090);
                    class63.field1334++;
                    class80.field1828--;
                }
                while (field3429 < 20 && class77.field1769 > 0) {
                    class77 var6 = (class77) class54.field1199.method160(-101);
                    class127 var7 = new class127(4);
                    var7.method1026(0, (byte) 127);
                    var7.method1001(92, (int) var6.field2090);
                    class3.field60.method145(4, -6660, var7.field2960, 0);
                    var6.method1171(true);
                    class13.field250.method112(var6, (byte) 3, var6.field2090);
                    field3429++;
                    class77.field1769--;
                }
                if (arg0 != 20) {
                    return false;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class3.field60.method142((byte) 102);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class16.field333 = 0;
                    byte var10 = 0;
                    if (class1.field1 == null) {
                        var10 = 8;
                    } else if (class77.field1737 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = 512 - class77.field1737;
                        int var12 = class79.field1815.field2960.length - class1.field1.field1773;
                        if (var11 > var12 - class79.field1815.field2995) {
                            var11 = var12 - class79.field1815.field2995;
                        }
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        class3.field60.method136(16, class79.field1815.field2960, class79.field1815.field2995, var11);
                        if (class145.field3335 != 0) {
                            for (int var13 = 0; var13 < var11; var13++) {
                                class79.field1815.field2960[class79.field1815.field2995 + var13] = (byte) class19.method146(class79.field1815.field2960[class79.field1815.field2995 + var13], class145.field3335);
                            }
                        }
                        class77.field1737 += var11;
                        class79.field1815.field2995 += var11;
                        if (class79.field1815.field2995 == var12) {
                            if (class1.field1.field2090 == 16711935L) {
                                class125.field2900 = class79.field1815;
                                for (int var14 = 0; var14 < 256; var14++) {
                                    class108 var15 = class65.field1398[var14];
                                    if (var15 != null) {
                                        class125.field2900.field2995 = var14 * 8 + 5;
                                        int var16 = class125.field2900.method986(83);
                                        int var17 = class125.field2900.method986(-66);
                                        var15.method852(var16, var17, arg0 - 140);
                                    }
                                }
                            } else {
                                class8.field137.reset();
                                class8.field137.update(class79.field1815.field2960, 0, var12);
                                int var18 = (int) class8.field137.getValue();
                                if (class1.field1.field1738 != var18) {
                                    try {
                                        class3.field60.method144(arg0 ^ 0x15);
                                    } catch (Exception var30) {
                                    }
                                    class3.field60 = null;
                                    class145.field3335 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class153.field3497++;
                                    return false;
                                }
                                class143.field3311 = 0;
                                class153.field3497 = 0;
                                class1.field1.field1749.method853((int) (class1.field1.field2090 & 0xFFFFL), class79.field1815.field2960, class18.field350, (class1.field1.field2090 & 0xFF0000L) == 16711680L, (byte) 0);
                            }
                            class1.field1.method674(32);
                            if (class18.field350) {
                                class63.field1334--;
                            } else {
                                field3429--;
                            }
                            class79.field1815 = null;
                            class1.field1 = null;
                            class77.field1737 = 0;
                        } else {
                            if (class77.field1737 != 512) {
                                break;
                            }
                            class77.field1737 = 0;
                        }
                    } else {
                        int var19 = var10 - class132.field3113.field2995;
                        if (var9 < var19) {
                            var19 = var9;
                        }
                        class3.field60.method136(arg0 ^ 0x7, class132.field3113.field2960, class132.field3113.field2995, var19);
                        if (class145.field3335 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class132.field3113.field2960[class132.field3113.field2995 + var20] = (byte) class19.method146(class132.field3113.field2960[class132.field3113.field2995 + var20], class145.field3335);
                            }
                        }
                        class132.field3113.field2995 += var19;
                        if (var10 > class132.field3113.field2995) {
                            break;
                        }
                        if (class1.field1 == null) {
                            class132.field3113.field2995 = 0;
                            int var21 = class132.field3113.method1011(38);
                            int var22 = class132.field3113.method1020(false);
                            long var23 = (long) ((var21 << 16) + var22);
                            int var25 = class132.field3113.method1011(53);
                            int var26 = class132.field3113.method986(71);
                            class77 var27 = (class77) class128.field3085.method109(127, var23);
                            class18.field350 = true;
                            if (var27 == null) {
                                var27 = (class77) class13.field250.method109(75, var23);
                                class18.field350 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            class1.field1 = var27;
                            int var28 = var25 == 0 ? 5 : 9;
                            class79.field1815 = new class127(class1.field1.field1773 + var28 + var26);
                            class79.field1815.method1026(var25, (byte) 127);
                            class79.field1815.method989(var26, (byte) 43);
                            class77.field1737 = 8;
                            class132.field3113.field2995 = 0;
                        } else if (class77.field1737 == 0) {
                            if (class132.field3113.field2960[0] == -1) {
                                class132.field3113.field2995 = 0;
                                class77.field1737 = 1;
                            } else {
                                class1.field1 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class3.field60.method144(1);
                } catch (Exception var29) {
                }
                class3.field60 = null;
                class143.field3311++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BII)I")
    public static final int method1187(byte arg0, int arg1, int arg2) {
        field3435++;
        if (arg0 >= -105) {
            return 3;
        } else if (arg2 >= 2) {
            int var3 = method1187((byte) -106, arg1 * arg1, arg2 >> 1);
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            return var3;
        } else if (arg2 == 1) {
            return arg1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)V")
    public static final void method1188(int arg0, byte arg1) {
        field3423++;
        if (class141.field3279 != null && arg0 >= 0 && class141.field3279.length > arg0 && class141.field3279[arg0] != null) {
            class96.field2291++;
            class15.field304.method867(145, true);
            int var2 = 26 / ((arg1 - 16) / 42);
            class15.field304.method990(class141.field3279[arg0].field2090, (byte) 91);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static void method1189(int arg0) {
        field3430 = null;
        field3434 = null;
        field3425 = null;
        field3427 = null;
        field3431 = null;
        field3436 = null;
        if (arg0 != 5) {
            field3426 = 49;
        }
        field3424 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILwe;)V")
    public static final void method1190(int arg0, int arg1, class155 arg2) {
        field3428++;
        if (class44.field1013 < arg2.field3576) {
            class85.method637(arg2, true);
        } else if (arg2.field3539 >= class44.field1013) {
            class37.method312(arg2, false);
        } else {
            class91.method687(false, arg2);
        }
        if (arg2.field3580 < 128 || arg2.field3578 < 128 || arg2.field3580 >= 13184 || arg2.field3578 >= 13184) {
            arg2.field3576 = 0;
            arg2.field3580 = arg2.field3560[0] * 128 + arg2.field3565 * 64;
            arg2.field3585 = -1;
            arg2.field3579 = -1;
            arg2.field3578 = arg2.field3581[0] * 128 + arg2.field3565 * 64;
            arg2.field3539 = 0;
            arg2.method1210((byte) 84);
        }
        if (class24.field555 == arg2 && (arg2.field3580 < 1536 || arg2.field3578 < 1536 || arg2.field3580 >= 11776 || arg2.field3578 >= 11776)) {
            arg2.field3585 = -1;
            arg2.field3576 = 0;
            arg2.field3579 = -1;
            arg2.field3578 = arg2.field3581[0] * 128 + arg2.field3565 * 64;
            arg2.field3539 = 0;
            arg2.field3580 = arg2.field3560[0] * 128 + arg2.field3565 * 64;
            arg2.method1210((byte) 93);
        }
        class85.method633(arg2, (byte) 106);
        if (arg0 != 0) {
            field3436 = null;
        }
        class21.method164(~arg0, arg2);
    }
}

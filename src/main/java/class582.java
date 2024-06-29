import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class class582 {

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field8558 = -1;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Z")
    public static boolean field8560 = false;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field8563;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field8564;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Lwu;")
    public static class500 field8561;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3395(int arg0) {
        if (arg0 != -28900) {
            method3400((byte) 17, 6);
        }
        if (class379.field5558 != null) {
            class147.field1903.method778((byte) -5);
            class78.method454();
            class10.method49(true);
            class339.method2109(-30415);
            class497.method3001((byte) -28);
            class239.method1538((byte) 48);
            if (class477.field7267 != null) {
                class477.field7267.method188(25554);
            }
            class198.method1276((byte) -67);
            class151.method883((byte) 36);
            class328.method2047(-92);
            class186.method1221(-1, false);
            class130.method807((byte) 18);
            for (int var1 = 0; var1 < 2048; var1++) {
                class179 var5 = class383.field5604[var1];
                if (var5 != null) {
                    var5.field1095 = null;
                    for (int var6 = 0; var6 < var5.field1099.length; var6++) {
                        var5.field1099[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class350.field5086; var2++) {
                class383 var3 = class579.field8530[var2].field3443;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1099.length; var4++) {
                        var3.field1099[var4] = null;
                    }
                }
            }
            class237.field3470 = null;
            class385.field5628 = null;
            class379.field5558.method1061(127);
            class379.field5558 = null;
        }
        field8564++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[B)Ljava/lang/String;", line = 82)
    public static final String method3396(int arg0, byte[] arg1) {
        field8562++;
        int var2 = -74 / ((65 - arg0) / 32);
        int var3 = arg1.length;
        char[] var4 = new char[var3];
        int var5 = 0;
        for (int var6 = 0; var6 < var3; var6++) {
            int var7 = arg1[var6] & 0xFF;
            if (var7 >= 128) {
                if (var7 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var7);
                }
                if (var7 < 224) {
                    if (var6 + 1 >= var3) {
                        throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                    }
                    var6++;
                    int var8 = arg1[var6] & 0xFF;
                    if (var8 < 128 || var8 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var4[var5++] = (char) class313.method1926(class637.method3693(-129, var8), class637.method3693(var7 << 6, -12352));
                } else if (var7 < 240) {
                    if (var3 <= var6 + 2) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    var6++;
                    int var9 = arg1[var6] & 0xFF;
                    if (var9 < 128 || var9 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                    }
                    var6++;
                    int var10 = arg1[var6] & 0xFF;
                    if (var10 < 128 || var10 > 191) {
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    var4[var5++] = (char) class313.method1926(class313.method1926(class637.method3693(-225, var7) << 12, class637.method3693(var9, -129) << 6), class637.method3693(var10, -129));
                } else if (var7 >= 244) {
                    throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var7);
                } else {
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                }
            } else {
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V", line = 158)
    public static final void method3397(int arg0) {
        field8557++;
        for (int var1 = 0; var1 < class68.field779; var1++) {
            class585 var2 = class10.field94[var1];
            boolean var3 = false;
            if (var2.field8696 == null) {
                var2.field8694--;
                if (var2.field8694 < (var2.field8695 == 2 ? -1500 : -10)) {
                    var3 = true;
                } else {
                    if (var2.field8695 == 1 && var2.field8698 == null) {
                        var2.field8698 = class48.method248(class197.field2968, var2.field8693, 0);
                        if (var2.field8698 == null) {
                            continue;
                        }
                        var2.field8694 += var2.field8698.method245();
                    } else if (var2.field8695 == 2 && (var2.field8697 == null || var2.field8687 == null)) {
                        if (var2.field8697 == null) {
                            var2.field8697 = class299.method1846(class577.field8509, var2.field8693);
                        }
                        if (var2.field8697 == null) {
                            continue;
                        }
                        if (var2.field8687 == null) {
                            var2.field8687 = var2.field8697.method1849(new int[] { 22050 });
                            if (var2.field8687 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field8694 < 0) {
                        int var5;
                        if (var2.field8700 == 0) {
                            var5 = class94.field1158.field276 * var2.field8692 >> 8;
                        } else {
                            int var4 = var2.field8700 >> 24 & 0x3;
                            if (class239.field3493.field3457 == var4) {
                                int var6 = var2.field8700 & 0xFF << 7;
                                int var7 = var2.field8700 >> 16 & 0xFF;
                                int var8 = (var7 << 7) + 64 - class239.field3493.field3464;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var2.field8700 >> 8 & 0xFF;
                                int var10 = (var9 << 7) + 64 - class239.field3493.field3463;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 - (128 - var10);
                                if (var6 < var11) {
                                    var2.field8694 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var5 = class94.field1158.field303 * var2.field8692 * (var6 - var11) / var6 >> 8;
                            } else {
                                var5 = 0;
                            }
                        }
                        if (var5 > 0) {
                            class5 var12 = null;
                            if (var2.field8695 == 1) {
                                var12 = var2.field8698.method246().method23(class371.field5359);
                            } else if (var2.field8695 == 2) {
                                var12 = var2.field8687;
                            }
                            class217 var13 = var2.field8696 = class217.method1408(var12, 100, var5);
                            var13.method1417(var2.field8703 - 1);
                            class105.field1321.method2083(var13);
                        }
                    }
                }
            } else if (!var2.field8696.method2994(8)) {
                var3 = true;
            }
            if (var3) {
                class68.field779--;
                for (int var14 = var1; var14 < class68.field779; var14++) {
                    class10.field94[var14] = class10.field94[var14 + 1];
                }
                var1--;
            }
        }
        if (class579.field8531 && !class188.method1229((byte) -98)) {
            if (class94.field1158.field280 != 0 && class17.field155 != -1) {
                class255.method1610(false, class94.field1158.field280, 0, class17.field155, 0, class524.field7765);
            }
            class579.field8531 = false;
        } else if (class94.field1158.field280 != 0 && class17.field155 != -1 && !class188.method1229((byte) -80)) {
            class34.field390++;
            class165.method1046(arg0 - 3463, class281.field4176);
            class221.field3268.method2576(true, class17.field155);
            class17.field155 = -1;
        }
        if (arg0 != -3) {
            field8560 = true;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)Z", line = 331)
    public final boolean method3398(byte arg0) {
        if (arg0 > -108) {
            method3400((byte) -95, -93);
        }
        field8563++;
        return this.method645((byte) 35) || this.method634(127) || this.method638((byte) -71);
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(B)V", line = 353)
    public static void method3399(byte arg0) {
        int var1 = 14 / ((20 - arg0) / 55);
        field8561 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)V", line = 364)
    public static final void method3400(byte arg0, int arg1) {
        field8559++;
        class190.field2886 = new int[arg1];
        class109.field1384 = new int[arg1];
        class89.field1133 = new int[arg1];
        class426.field6079 = new int[arg1];
        class200.field3004 = new int[arg1];
        if (arg0 != 106) {
            field8560 = false;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)I", line = 384)
    public static final int method3401(int arg0, int arg1) {
        return class642.field9324 == null ? 0 : class642.field9324[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Z")
    public abstract boolean method638(byte arg0);

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)I")
    public abstract int method633(byte arg0);

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)I")
    public abstract int method635(int arg0);

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(B)Lwi;")
    public abstract class497 method632(byte arg0);

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(B)Z")
    public abstract boolean method645(byte arg0);

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
    public abstract void method641(int arg0);

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(B)V")
    public abstract void method637(byte arg0);

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)Z")
    public abstract boolean method634(int arg0);
}

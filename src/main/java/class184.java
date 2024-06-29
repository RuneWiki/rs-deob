import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class184 {

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Lub;")
    public static class227 field3127 = class257.method1749("", 17263);

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "J")
    public static long field3129 = 0L;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Z")
    public static boolean field3125 = false;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Lub;")
    public static class227 field3130 = null;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Lub;")
    public static class227 field3131 = class257.method1749("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 17263);

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field3134 = 0;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "Lbc;")
    public static class201 field3133 = new class201(512);

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field3139 = 0;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "Lub;")
    public static class227 field3138 = class257.method1749("Verbindung mit Update)2Server)3)3)3", 17263);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "Lnh;")
    public static class57 field3137;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)Lug;")
    public static final class171 method1170(int arg0, int arg1, int arg2) {
        field3120++;
        if (arg2 != -198247328) {
            return null;
        }
        class171 var3 = (class171) class145.field2503.method1298(-122, (long) arg0 | (long) arg1 << 32);
        if (var3 == null) {
            var3 = new class171(arg1, arg0);
            class145.field2503.method1300(var3, var3.field1113, -2875);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Ldk;")
    public static final class123 method1171(int arg0, int arg1) {
        field3132++;
        class123 var2 = (class123) class31.field491.method1037(100, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class92.field1573.method884(arg0, 111, arg1);
        class123 var4 = new class123();
        if (var3 != null) {
            var4.method759(true, new class226(var3));
        }
        class31.field491.method1032(-810, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method1172(int arg0) {
        field3131 = null;
        field3130 = null;
        field3137 = null;
        field3138 = null;
        field3133 = null;
        field3127 = null;
        if (arg0 != 554) {
            field3139 = -12;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lta;BI)I")
    public static final int method1173(class105 arg0, byte arg1, int arg2) {
        field3123++;
        if (arg0.field1979 == null || arg0.field1979.length <= arg2) {
            return -2;
        }
        try {
            int[] var3 = arg0.field1979[arg2];
            if (arg1 > -110) {
                return 42;
            }
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class105.field1913[var3[var5++]];
                }
                if (var7 == 2) {
                    var8 = class240.field4170[var3[var5++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 3) {
                    var8 = class260.field4522[var3[var5++]];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class105 var12 = class27.method137(var11, -954490064);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class133.method815(var13, (byte) -70).field3035 || class58.field1072)) {
                        for (int var14 = 0; var14 < var12.field1865.length; var14++) {
                            if (var13 + 1 == var12.field1865[var14]) {
                                var8 += var12.field1921[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class139.field2416[var3[var5++]];
                }
                if (var7 == 6) {
                    var8 = class228.field3975[class240.field4170[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class139.field2416[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class216.field3639.field3802;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class54.field944[var15]) {
                            var8 += class240.field4170[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class105 var18 = class27.method137(var17, -954490064);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class133.method815(var19, (byte) -70).field3035 || class58.field1072)) {
                        for (int var20 = 0; var20 < var18.field1865.length; var20++) {
                            if ((var19 + 1) == var18.field1865[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = client.field1439;
                }
                if (var7 == 12) {
                    var8 = class153.field2656;
                }
                if (var7 == 13) {
                    int var21 = class139.field2416[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = client.method493(var23, true);
                }
                if (var7 == 18) {
                    var8 = (class216.field3639.field50 >> 7) + class192.field3267;
                }
                if (var7 == 19) {
                    var8 = (class216.field3639.field99 >> 7) + class78.field1367;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(III)J")
    public static final long method1174(int arg0, int arg1, int arg2) {
        class108 var3 = class261.field4539[arg0][arg1][arg2];
        return var3 == null || var3.field2024 == null ? 0L : var3.field2024.field879;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public static final void method1175(int arg0) {
        field3121++;
        for (int var1 = 0; var1 < class71.field1254; var1++) {
            int var2 = class146.field2517[var1];
            class195 var3 = class220.field3715[var2];
            if (var3 != null) {
                class116.method733(-18677585, var3, var3.field3315.field2542);
            }
        }
        if (arg0 < 17) {
            method1171(-32, 100);
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V")
    public static final void method1176(int arg0) {
        class73.field1272 = null;
        class25.field424 = null;
        class25.field417 = null;
        class240.field4182 = null;
        class9.field166 = null;
        class64.field1167 = null;
        class75.field1306 = null;
        class255.field4478 = null;
        class197.field3383 = null;
        field3128++;
        class178.field3029 = null;
        class5.field120 = 0;
        class36.field593.method1274((byte) 109);
        class30.field482.method1274((byte) 109);
        class81.field1411 = null;
        class210.field3560 = null;
        class235.field4069 = null;
        class201.field3445 = null;
        class89.field1543 = null;
        class80.field1393 = null;
        if (arg0 != 1) {
            field3133 = null;
        }
        class75.field1315 = null;
        class114.field2095 = null;
        class75.field1307 = null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class187 extends class460 {

    @OriginalMember(owner = "client!uu", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2779 = null;

    @OriginalMember(owner = "client!uu", name = "P", descriptor = "Llt;")
    public static class475 field2775 = new class475("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!uu", name = "W", descriptor = "Llt;")
    public static class475 field2782 = new class475("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!uu", name = "X", descriptor = "Z")
    public static boolean field2783 = false;

    @OriginalMember(owner = "client!uu", name = "Q", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!uu", name = "R", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!uu", name = "S", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!uu", name = "U", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!uu", name = "V", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!uu", name = "Y", descriptor = "[I")
    public static int[] field2784;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Z)V")
    public static final void method1284(boolean arg0) {
        field2778++;
        if (class77.field1152 > 0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class285.field4100.length; var2++) {
                if (class285.field4100[var2].startsWith("--> ")) {
                    var1++;
                    if (class77.field1152 == var1) {
                        class402.field6037 = class285.field4100[var2].substring(4);
                        break;
                    }
                }
            }
        } else {
            class402.field6037 = "";
        }
        if (arg0) {
            method1284(false);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method1285(int arg0, String arg1) {
        field2780++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        if (arg0 != -129) {
            field2784 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(Z)Lid;")
    public static final class412 method1286(boolean arg0) {
        if (!arg0) {
            method1287(77);
        }
        class37.field387 = 0;
        field2777++;
        return class185.method1272((byte) -70);
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)V")
    public static final void method1287(int arg0) {
        field2781++;
        int var1 = class526.field7785 * 128 + 64;
        int var2 = class5.field74 * 128 + 64;
        int var3 = class377.method2316(var2, false, var1, class79.field1192) - class90.field1363;
        if (class509.field7427 >= 100) {
            class24.field258 = class526.field7785 * 128 + 64;
            class260.field3827 = class5.field74 * 128 + 64;
            class291.field4175 = class377.method2316(class260.field3827, false, class24.field258, class79.field1192) - class90.field1363;
        } else {
            if (class24.field258 < var1) {
                class24.field258 += (var1 - class24.field258) * class509.field7427 / 1000 + class385.field5841;
                if (var1 < class24.field258) {
                    class24.field258 = var1;
                }
            }
            if (var1 < class24.field258) {
                class24.field258 -= (class24.field258 - var1) * class509.field7427 / 1000 + class385.field5841;
                if (class24.field258 < var1) {
                    class24.field258 = var1;
                }
            }
            if (var3 > class291.field4175) {
                class291.field4175 += class385.field5841 + ((var3 - class291.field4175) * class509.field7427 / 1000);
                if (class291.field4175 > var3) {
                    class291.field4175 = var3;
                }
            }
            if (class260.field3827 < var2) {
                class260.field3827 += (var2 - class260.field3827) * class509.field7427 / 1000 + class385.field5841;
                if (var2 < class260.field3827) {
                    class260.field3827 = var2;
                }
            }
            if (class291.field4175 > var3) {
                class291.field4175 -= (class291.field4175 - var3) * class509.field7427 / 1000 + class385.field5841;
                if (class291.field4175 < var3) {
                    class291.field4175 = var3;
                }
            }
            if (var2 < class260.field3827) {
                class260.field3827 -= (class260.field3827 - var2) * class509.field7427 / 1000 + class385.field5841;
                if (var2 > class260.field3827) {
                    class260.field3827 = var2;
                }
            }
        }
        int var4 = class267.field3906 * 128 + 64;
        int var5 = class38.field558 * 128 + 64;
        int var6 = class377.method2316(var5, false, var4, class79.field1192) - class390.field5876;
        int var7 = var4 - class24.field258;
        int var8 = var6 - class291.field4175;
        int var9 = var5 - class260.field3827;
        if (arg0 != 16384) {
            field2775 = null;
        }
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class18.field195) {
            class18.field195 += (var11 - class18.field195 >> 3) * class228.field3379 / 1000 + class227.field3328 << 3;
            if (class18.field195 > var11) {
                class18.field195 = var11;
            }
        }
        if (class18.field195 > var11) {
            class18.field195 -= class227.field3328 + ((class18.field195 - var11 >> 3) * class228.field3379 / 1000) << 3;
            if (var11 > class18.field195) {
                class18.field195 = var11;
            }
        }
        int var13 = var12 - class259.field3812;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class259.field3812 += class228.field3379 * var14 / 1000 + class227.field3328 << 3;
            class259.field3812 &= 0x3FFF;
        }
        if (var14 < 0) {
            class259.field3812 -= -var14 * class228.field3379 / 1000 + class227.field3328 << 3;
            class259.field3812 &= 0x3FFF;
        }
        int var15 = var12 - class259.field3812;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class259.field3812 = var12;
        }
        class296.field4216 = 0;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V")
    public static void method1288(byte arg0) {
        field2779 = null;
        int var1 = 108 / ((21 - arg0) / 55);
        field2775 = null;
        field2782 = null;
        field2784 = null;
    }
}

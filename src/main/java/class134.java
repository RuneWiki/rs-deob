import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class134 {

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public int field3100 = 0;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public int field3124 = 0;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Z")
    public static boolean field3106 = false;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "Lvc;")
    public static class137 field3118 = class45.method325("Wen m-Ochten Sie hinzuf-Ugen?", -46);

    @OriginalMember(owner = "client!v", name = "x", descriptor = "Lvc;")
    private static class137 field3122 = class45.method325("Press (Wchange your password(W on front page)3", -46);

    @OriginalMember(owner = "client!v", name = "s", descriptor = "Lvc;")
    public static class137 field3117 = field3122;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public int field3099;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public int field3104;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public int field3110;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public int field3111;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public int field3112;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public int field3115;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public int field3119;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public int field3123;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "Lpe;")
    public class103 field3121;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Loa;")
    public static class93 field3109;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "[I")
    public static int[] field3113;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "[I")
    public static int[] field3114;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "[Lia;")
    public static class57[] field3107;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "[[[B")
    public static byte[][][] field3108;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static void method992(byte arg0) {
        field3108 = null;
        field3117 = null;
        if (arg0 < 75) {
            return;
        }
        field3118 = null;
        field3114 = null;
        field3107 = null;
        field3109 = null;
        field3122 = null;
        field3113 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILme;)I")
    public static final int method993(int arg0, int arg1, class85 arg2) {
        field3101++;
        if (arg2.field1969 == null || arg2.field1969.length <= arg0) {
            return -2;
        }
        try {
            int var3 = 0;
            if (arg1 != -12) {
                method992((byte) 5);
            }
            int var4 = 0;
            byte var5 = 0;
            int[] var6 = arg2.field1969[arg0];
            while (true) {
                int var7 = var6[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var3;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 1) {
                    var8 = class73.field1560[var6[var4++]];
                }
                if (var7 == 2) {
                    var8 = class32.field696[var6[var4++]];
                }
                if (var7 == 3) {
                    var8 = class7.field143[var6[var4++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 4) {
                    int var10 = var6[var4++] << 16;
                    int var11 = var10 + var6[var4++];
                    class85 var12 = class142.method1093(arg1 + 268, var11);
                    int var13 = var6[var4++];
                    if (var13 != -1 && (!class39.method286((byte) 127, var13).field3314 || class73.field1559)) {
                        for (int var14 = 0; var14 < var12.field2008.length; var14++) {
                            if (var13 + 1 == var12.field2008[var14]) {
                                var8 += var12.field1921[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class28.field631[var6[var4++]];
                }
                if (var7 == 6) {
                    var8 = class24.field584[class32.field696[var6[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class28.field631[var6[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class104.field2412.field2877;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class47.field1053[var15]) {
                            var8 += class32.field696[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var6[var4++] << 16;
                    int var17 = var16 + var6[var4++];
                    class85 var18 = class142.method1093(256, var17);
                    int var19 = var6[var4++];
                    if (var19 != -1 && (!class39.method286((byte) 115, var19).field3314 || class73.field1559)) {
                        for (int var20 = 0; var20 < var18.field2008.length; var20++) {
                            if (var19 + 1 == var18.field2008[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class141.field3321;
                }
                if (var7 == 12) {
                    var8 = class21.field445;
                }
                if (var7 == 13) {
                    int var21 = class28.field631[var6[var4++]];
                    int var22 = var6[var4++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var6[var4++];
                    var8 = class123.method921(var23, arg1 + 128);
                }
                if (var7 == 18) {
                    var8 = (class104.field2412.field1672 >> 7) + class58.field1227;
                }
                if (var7 == 19) {
                    var8 = (class104.field2412.field1646 >> 7) + class91.field2163;
                }
                if (var7 == 20) {
                    var8 = var6[var4++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var3 += var8;
                    }
                    if (var5 == 1) {
                        var3 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var3 /= var8;
                    }
                    if (var5 == 3) {
                        var3 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }
}

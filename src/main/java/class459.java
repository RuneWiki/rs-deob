import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class459 {

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "[I")
    public static int[] field6797 = new int[4096];

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "[[B")
    public static byte[][] field6800;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
    public static void method2845(byte arg0) {
        field6800 = null;
        field6797 = null;
        if (arg0 < 30) {
            field6800 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method2846(byte arg0, String arg1) {
        field6798++;
        if (arg0 <= 102) {
            field6797 = null;
        }
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
        return var3;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method2847(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class68.field892++;
        class165.field2299 = 0;
        for (int var6 = class382.field5579; var6 < class56.field750; var6++) {
            class13[][] var17 = class277.field4216[var6];
            for (int var18 = class452.field6686; var18 < class44.field553; var18++) {
                for (int var19 = class337.field5008; var19 < class196.field2958; var19++) {
                    class13 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class423.field6230[var18 + class246.field3690 - class319.field4825][var19 + class246.field3690 - class426.field6265] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field162 = true;
                            var20.field144 = true;
                            if (var20.field151 == null) {
                                var20.field142 = false;
                            } else {
                                var20.field142 = true;
                            }
                            class165.field2299++;
                        } else {
                            var20.field162 = false;
                            var20.field144 = false;
                            var20.field158 = 0;
                            if (var18 >= class319.field4825 - 16 && var18 <= class319.field4825 + 16 && var19 >= class426.field6265 - 16 && var19 <= class426.field6265 + 16 && (var20.field167 != null || var20.field163 != null || var20.field164 != null || var20.field149 != null || var20.field166 != null || var20.field151 != null)) {
                                class426.field6271.method1472(var20, (byte) 51);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class307.field4638 == class154.field2118;
        for (int var8 = class382.field5579; var8 < class56.field750; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class1.field14.method398() && var8 >= arg2 && arg1 != null) {
                int var10 = class423.field6230.length;
                if (class423.field6230.length + class452.field6686 > class275.field4206) {
                    var10 -= class423.field6230.length + class452.field6686 - class275.field4206;
                }
                int var11 = class423.field6230[0].length;
                if (class423.field6230[0].length + class337.field5008 > class265.field4044) {
                    var11 -= class423.field6230[0].length + class337.field5008 - class265.field4044;
                }
                int var12 = class168.field2416;
                while (true) {
                    if (var12 >= var10) {
                        class426.field6271.method1473(var8, false, true, class307.field4638[var8], var9);
                        break;
                    }
                    int var13 = class452.field6686 + var12 - class168.field2416;
                    for (int var14 = class238.field3551; var14 < var11; var14++) {
                        class60.field774[var12][var14] = false;
                        if (class423.field6230[var12][var14]) {
                            int var15 = class337.field5008 + var14 - class238.field3551;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class277.field4216[var16][var13][var15] != null && class277.field4216[var16][var13][var15].field150 == var8) {
                                    class60.field774[var12][var14] = class277.field4216[var16][var13][var15].field162;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class426.field6271.method1473(var8, false, false, class307.field4638[var8], var9);
            }
            class426.field6271.method1475(true);
        }
        if (!class105.method656(true)) {
            class105.method656(false);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIZIIIIF)[[I")
    public static final int[][] method2848(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, float arg8) {
        field6796++;
        int[][] var9 = new int[arg5][arg1];
        class407 var10 = new class407();
        var10.field6055 = arg7;
        var10.field6056 = arg0;
        var10.field6054 = arg4;
        var10.field6047 = (int) (arg8 * 4096.0F);
        var10.field6058 = arg3;
        if (arg6 != 31128) {
            return null;
        }
        var10.method306(arg6 ^ 0x79F7);
        class377.method2271(arg5, 2016454732, arg1);
        for (int var11 = 0; var11 < arg5; var11++) {
            var10.method2559(var11, 113, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
    public static final void method2849(int arg0) {
        int var1 = 88 / ((arg0 + 23) / 60);
        class126.field1613 = new class306(class337.field5018.method937((byte) 100, class27.field356), "", class1.field5, 1004, 0L, 0, 0, true, false);
        field6799++;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field6797[var0] = class210.method1239(true, var0);
        }
        field6800 = new byte[50][];
    }
}

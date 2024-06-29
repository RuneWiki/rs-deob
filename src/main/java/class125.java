import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class125 extends class32 {

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field2190 = 0;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Lij;")
    private static class50 field2188 = class78.method578(123, "glow1:");

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "Lij;")
    public static class50 field2192 = field2188;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field2186 = 2;

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "Lij;")
    public static class50 field2204 = field2188;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public int field2183;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "[I")
    public int[] field2194;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "[I")
    public int[] field2195;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "[I")
    public int[] field2196;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "[I")
    public static int[] field2199;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "[Ljd;")
    public static class85[] field2187;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "[Lfb;")
    public class9[] field2189;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "[Lfb;")
    public class9[] field2191;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "[[[B")
    public byte[][][] field2201;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
    public static final void method899(int arg0) {
        field2203++;
        int var1 = class215.field3559 - ((int) ((double) class19.field398.field243 / class2.field20));
        int var2 = class215.field3559 + ((int) ((double) class19.field398.field243 / class2.field20));
        int var3 = class222.field3744 - ((int) ((double) class19.field398.field242 / class2.field20));
        if (var1 < 0) {
            class142.field2484 = -1;
            class254.field4393 = -1;
            class215.field3559 = (int) ((double) class19.field398.field243 / class2.field20);
        }
        if (class155.field2701 < var2) {
            class254.field4393 = -1;
            class215.field3559 = class155.field2701 - (int) ((double) class19.field398.field243 / class2.field20);
            class142.field2484 = -1;
        }
        int var4 = class222.field3744 + ((int) ((double) class19.field398.field242 / class2.field20));
        if (arg0 < ~var3) {
            class222.field3744 = (int) ((double) class19.field398.field242 / class2.field20);
            class254.field4393 = -1;
            class142.field2484 = -1;
        }
        if (class140.field2460 < var4) {
            class222.field3744 = class140.field2460 - ((int) ((double) class19.field398.field242 / class2.field20));
            class254.field4393 = -1;
            class142.field2484 = -1;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)I")
    public static final int method900(int arg0, int arg1) {
        if (arg0 != 255) {
            field2199 = null;
        }
        field2200++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static final void method901(byte arg0) {
        int var1 = class47.field858.length;
        if (arg0 >= -79) {
            return;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class47.field858[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class51.field940; var4++) {
                    if (class252.field4371[var2] == class250.field4335[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                int var5 = 0;
                if (var3 == -1) {
                    class250.field4335[class51.field940] = class252.field4371[var2];
                    var3 = class51.field940++;
                }
                class217 var6 = new class217(class47.field858[var2]);
                while (var6.field3581 < class47.field858[var2].length && var5 < 511) {
                    int var7 = var5++ << 6 | var3;
                    int var8 = var6.method1441(67);
                    int var9 = (var8 & 0x1FF0) >> 7;
                    int var10 = (class252.field4371[var2] >> 8) * 64 + var9 - class61.field1124;
                    int var11 = var8 & 0x3F;
                    int var12 = var8 >> 14;
                    int var13 = (class252.field4371[var2] & 0xFF) * 64 + var11 - class254.field4394;
                    class62 var14 = class8.method48(-21178, var6.method1441(-100));
                    if (class41.field764[var7] == null && (var14.field1198 & 0x1) > 0 && class93.field1746 == var12 && var10 >= 0 && (var14.field1138 + var10) < 104 && var13 >= 0 && var14.field1138 + var13 < 104) {
                        class41.field764[var7] = new class53();
                        class53 var15 = class41.field764[var7];
                        class153.field2678[class6.field77++] = var7;
                        var15.field3981 = class244.field4245;
                        var15.field959 = var14;
                        var15.field3965 = var15.field959.field1193;
                        var15.field4010 = var15.field959.field1197;
                        var15.field3977 = var15.field959.field1133;
                        var15.field3975 = var15.field959.field1140;
                        var15.field3974 = var15.field959.field1166;
                        var15.field3968 = var15.field959.field1174;
                        if (var15.field3968 == 0) {
                            var15.field3993 = 0;
                        }
                        var15.field4000 = var15.field959.field1192;
                        var15.field3986 = var15.field959.field1159;
                        var15.field3976 = var15.field959.field1138;
                        var15.method1609(true, -111, var10, var13);
                    }
                }
            }
        }
        field2198++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method902(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 != 0) {
            method903((byte) 36);
        }
        field2185++;
        if (class10.method67(arg2, (byte) 126)) {
            class238.field4042 = null;
            class68.method518(arg3, -1, arg4, class137.field2380[arg2], (byte) -113, arg7, arg5, arg6, arg8, arg1);
            if (class238.field4042 != null) {
                class68.method518(arg3, -1412584499, arg4, class238.field4042, (byte) -78, arg7, arg5, class59.field1087, arg8, class209.field3472);
                class238.field4042 = null;
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class210.field3492[var9] = true;
            }
        } else {
            class210.field3492[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V")
    public static final void method903(byte arg0) {
        field2197++;
        int var1 = 108 / ((arg0 + 22) / 34);
        if (class112.field1978 != null) {
            class33 var2 = class112.field1978;
            synchronized (class112.field1978) {
                class112.field1978 = null;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
    public static void method904(byte arg0) {
        field2188 = null;
        field2187 = null;
        field2192 = null;
        field2199 = null;
        field2204 = null;
        if (arg0 != 127) {
            field2186 = -126;
        }
    }
}

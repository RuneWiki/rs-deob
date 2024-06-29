import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class146 extends class31 {

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
    public static int field3282 = 0;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "[I")
    public static int[] field3275 = new int[4000];

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "I")
    public static int field3284 = -1;

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "Lid;")
    private static class60 field3289 = class11.method72("flash2:", (byte) 101);

    @OriginalMember(owner = "client!v", name = "S", descriptor = "Lid;")
    public static class60 field3276 = class11.method72("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", (byte) 118);

    @OriginalMember(owner = "client!v", name = "W", descriptor = "Lid;")
    public static class60 field3280 = class11.method72(" )2> <col=ff9040>", (byte) -6);

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "Lid;")
    public static class60 field3292 = field3289;

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "Lid;")
    public static class60 field3291 = field3289;

    @OriginalMember(owner = "client!v", name = "lb", descriptor = "Lid;")
    private static class60 field3295 = class11.method72("Please wait)3)3)3", (byte) 95);

    @OriginalMember(owner = "client!v", name = "T", descriptor = "Lid;")
    public static class60 field3277 = field3295;

    @OriginalMember(owner = "client!v", name = "nb", descriptor = "Lid;")
    public static class60 field3297 = class11.method72("Sie haben gerade eine andere Welt verlassen)3", (byte) 114);

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "I")
    public int field3287;

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!v", name = "jb", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!v", name = "mb", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!v", name = "ob", descriptor = "I")
    public int field3298;

    @OriginalMember(owner = "client!v", name = "pb", descriptor = "I")
    public int field3299;

    @OriginalMember(owner = "client!v", name = "kb", descriptor = "Lid;")
    public class60 field3294;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "[I")
    public int[] field3278;

    @OriginalMember(owner = "client!v", name = "qb", descriptor = "[I")
    public int[] field3300;

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "[Le;")
    public static class29[] field3288;

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "[Lid;")
    public class60[] field3285;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)I")
    public static final int method1114(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3283++;
        int var5 = arg3 - class127.field2899[arg2 * 1024 / arg1] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
    public static final void method1115(int arg0) {
        field3293++;
        short var1 = 256;
        if (class43.field1157 > 0) {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class43.field1157 > 768) {
                    class94.field2312[var4] = class35.method260(client.field509[var4], 1024 - class43.field1157, (byte) -114, class24.field581[var4]);
                } else if (class43.field1157 <= 256) {
                    class94.field2312[var4] = class35.method260(class24.field581[var4], 256 - class43.field1157, (byte) 20, client.field509[var4]);
                } else {
                    class94.field2312[var4] = class24.field581[var4];
                }
            }
        } else if (class128.field2921 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class128.field2921 > 768) {
                    class94.field2312[var2] = class35.method260(client.field509[var2], 1024 - class128.field2921, (byte) 124, class52.field1335[var2]);
                } else if (class128.field2921 <= 256) {
                    class94.field2312[var2] = class35.method260(class52.field1335[var2], 256 - class128.field2921, (byte) 91, client.field509[var2]);
                } else {
                    class94.field2312[var2] = class52.field1335[var2];
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                class94.field2312[var3] = client.field509[var3];
            }
        }
        class130.method1021(0, 9, 128, var1 + 7);
        int var5 = 0;
        class22.field551.method39(0, 0);
        int var6 = 6885;
        class130.method1016();
        int var7 = 1;
        if (arg0 > -26) {
            field3275 = null;
        }
        while (var7 < var1 - 1) {
            int var20 = (var1 - var7) * class109.field2657[var7] / var1;
            int var21 = var20 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var23 = class54.field1357[var5++];
                if (var23 == 0) {
                    var6++;
                } else {
                    int var25 = 256 - var23;
                    int var26 = class69.field1660.field3407[var6];
                    int var27 = class94.field2312[var23];
                    class69.field1660.field3407[var6++] = class80.method680(var23 * class80.method680(65280, var27) + var25 * class80.method680(var26, 65280), 16711680) + class80.method680(-16711936, var25 * class80.method680(16711935, var26) + var23 * class80.method680(var27, 16711935)) >> 8;
                }
            }
            var6 += var21 + 765 - 128;
            var7++;
        }
        int var8 = 0;
        class130.method1021(637, 9, 765, var1 + 7);
        int var9 = 7546;
        class86.field2140.method39(382, 0);
        class130.method1016();
        for (int var10 = 1; var10 < var1 - 1; var10++) {
            int var11 = (var1 - var10) * class109.field2657[var10] / var1;
            int var12 = var9 + var11;
            int var13 = 103 - var11;
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = class54.field1357[var8++];
                if (var15 == 0) {
                    var12++;
                } else {
                    int var17 = 256 - var15;
                    int var18 = class94.field2312[var15];
                    int var19 = class69.field1660.field3407[var12];
                    class69.field1660.field3407[var12++] = class80.method680(var15 * class80.method680(var18, 16711935) + class80.method680(16711935, var19) * var17, -16711936) + class80.method680(16711680, var17 * class80.method680(65280, var19) + class80.method680(var18, 65280) * var15) >> 8;
                }
            }
            var8 += 128 - var13;
            var9 = var12 + 765 - var11 - var13;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBII)Lle;")
    public static final class81 method1116(int arg0, byte arg1, int arg2, int arg3) {
        field3279++;
        class81 var4 = new class81();
        var4.field2012 = arg3;
        var4.field2026 = arg0;
        class39.field929.method712((long) arg2, var4, (byte) 66);
        class35.method270(arg3, (byte) 116);
        class8.method51(arg3, (byte) 2);
        class40 var5 = class132.method1041(true, arg2);
        if (var5 != null) {
            class12.method79(-30833, var5);
        }
        if (class124.field2864 != null) {
            class12.method79(-30833, class124.field2864);
            class124.field2864 = null;
        }
        class80.field1956 = 0;
        if (arg1 != 26) {
            field3275 = null;
        }
        class135.field3067 = false;
        class10.method65(87, class2.field54, class101.field2465, class17.field416, class63.field1576);
        if (class11.field187 != -1) {
            class16.method129(-29873, class11.field187, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)I")
    public static final int method1117(boolean arg0, int arg1) {
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0x33333333);
        field3290++;
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (arg0) {
            field3297 = null;
        }
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
    public static void method1118(int arg0) {
        field3276 = null;
        field3291 = null;
        field3277 = null;
        if (arg0 != 768) {
            method1116(-12, (byte) -1, -24, 21);
        }
        field3289 = null;
        field3295 = null;
        field3280 = null;
        field3292 = null;
        field3275 = null;
        field3297 = null;
        field3288 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lie;III)[Lae;")
    public static final class6[] method1119(class61 arg0, int arg1, int arg2, int arg3) {
        field3296++;
        if (class77.method628(arg3, arg1, arg0, -124)) {
            if (arg2 != 16091) {
                field3295 = null;
            }
            return class75.method571(true);
        } else {
            return null;
        }
    }
}

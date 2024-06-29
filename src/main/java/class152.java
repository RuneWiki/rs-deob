import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class152 extends class44 {

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "[B")
    public byte[] field2940;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "Lkb;")
    public static class93 field2941 = class76.method390("Fertigkeit)2", 0);

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "Lkb;")
    public static class93 field2943 = class76.method390("Musik)2Engine vorbereitet)3", 0);

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "Lkb;")
    public static class93 field2942 = class76.method390("(U0a )2 via: ", 0);

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "[I")
    public static int[] field2936 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "Lkb;")
    private static class93 field2945 = class76.method390("Loading interfaces )2 ", 0);

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "[I")
    public static int[] field2944 = new int[500];

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "Lkb;")
    public static class93 field2947 = field2945;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "Lnb;")
    public static class120 field2938 = new class120(50);

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "Lkb;")
    private static class93 field2949 = class76.method390("Attack", 0);

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "Lkb;")
    public static class93 field2948 = field2949;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZII)V")
    public static final void method951(int arg0, boolean arg1, int arg2, int arg3) {
        class201.method1316(0);
        field2946++;
        class118.method656(arg3, arg0, class64.field1036.field2211 + arg3, class64.field1036.field2212 + arg0);
        if (class112.field2085 == 2 || class112.field2085 == 5) {
            class118.method655(arg3 + 25, arg0 + 5, 0, class97.field1818, class138.field2668);
        } else {
            int var4 = class93.field1707 + class30.field510 & 0x7FF;
            int var5 = class106.field1940.field2032 / 32 + 48;
            int var6 = 464 - class106.field1940.field2045 / 32;
            class12.field204.method750(arg3 + 25, arg0 + 5, 146, 151, var5, var6, var4, class193.field3749 + 256, class97.field1818, class138.field2668);
            for (int var7 = 0; var7 < class182.field3597; var7++) {
                int var37 = class120.field2220[var7] * 4 + 2 - class106.field1940.field2045 / 32;
                int var38 = class135.field2628[var7] * 4 + 2 - class106.field1940.field2032 / 32;
                class183.method1191(class101.field1857[var7], (byte) 61, var38, arg0, arg3, var37);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class122 var34 = class169.field3358[class114.field2145][var8][var33];
                    if (var34 != null) {
                        int var35 = var8 * 4 + 2 - class106.field1940.field2032 / 32;
                        int var36 = var33 * 4 + 2 - class106.field1940.field2045 / 32;
                        class183.method1191(class63.field1006[0], (byte) 61, var35, arg0, arg3, var36);
                    }
                }
            }
            for (int var9 = 0; var9 < class195.field3788; var9++) {
                class76 var29 = class143.field2791[class49.field794[var9]];
                if (var29 != null && var29.method190((byte) -123)) {
                    class195 var30 = var29.field1364;
                    if (var30 != null && var30.field3815 != null) {
                        var30 = var30.method1256(0);
                    }
                    if (var30 != null && var30.field3795 && var30.field3796) {
                        int var31 = var29.field2045 / 32 - class106.field1940.field2045 / 32;
                        int var32 = var29.field2032 / 32 - class106.field1940.field2032 / 32;
                        class183.method1191(class63.field1006[1], (byte) 61, var32, arg0, arg3, var31);
                    }
                }
            }
            for (int var10 = 0; var10 < class205.field3966; var10++) {
                class34 var21 = class206.field4035[class144.field2818[var10]];
                if (var21 != null && var21.method190((byte) -109)) {
                    int var22 = var21.field2032 / 32 - class106.field1940.field2032 / 32;
                    boolean var23 = false;
                    int var24 = var21.field2045 / 32 - class106.field1940.field2045 / 32;
                    long var25 = var21.field550.method482(64);
                    for (int var27 = 0; var27 < class62.field991; var27++) {
                        if (class151.field2910[var27] == var25 && class114.field2119[var27] != 0) {
                            var23 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class106.field1940.field537 != 0 && var21.field537 != 0 && class106.field1940.field537 == var21.field537) {
                        var28 = true;
                    }
                    if (var23) {
                        class183.method1191(class63.field1006[3], (byte) 61, var22, arg0, arg3, var24);
                    } else if (var28) {
                        class183.method1191(class63.field1006[4], (byte) 61, var22, arg0, arg3, var24);
                    } else {
                        class183.method1191(class63.field1006[2], (byte) 61, var22, arg0, arg3, var24);
                    }
                }
            }
            if (class37.field629 != 0 && class21.field338 % 20 < 10) {
                if (class37.field629 == 1 && class151.field2932 >= 0 && class143.field2791.length > class151.field2932) {
                    class76 var11 = class143.field2791[class151.field2932];
                    if (var11 != null) {
                        int var12 = var11.field2032 / 32 - class106.field1940.field2032 / 32;
                        int var13 = var11.field2045 / 32 - class106.field1940.field2045 / 32;
                        class55.method299(arg3, var13, var12, false, arg0, class18.field306[1]);
                    }
                }
                if (class37.field629 == 2) {
                    int var14 = (class18.field311 - class49.field787) * 4 + 2 - class106.field1940.field2032 / 32;
                    int var15 = (class39.field642 - class68.field1242) * 4 + 2 - class106.field1940.field2045 / 32;
                    class55.method299(arg3, var15, var14, false, arg0, class18.field306[1]);
                }
                if (class37.field629 == 10 && class66.field1204 >= 0 && class66.field1204 < class206.field4035.length) {
                    class34 var16 = class206.field4035[class66.field1204];
                    if (var16 != null) {
                        int var17 = var16.field2045 / 32 - class106.field1940.field2045 / 32;
                        int var18 = var16.field2032 / 32 - class106.field1940.field2032 / 32;
                        class55.method299(arg3, var17, var18, !arg1, arg0, class18.field306[1]);
                    }
                }
            }
            if (class35.field574 != 0) {
                int var19 = class18.field297 * 4 + 2 - class106.field1940.field2045 / 32;
                int var20 = class35.field574 * 4 + 2 - class106.field1940.field2032 / 32;
                class183.method1191(class18.field306[0], (byte) 61, var20, arg0, arg3, var19);
            }
            class118.method651(arg3 + 93 + 4, arg0 + -4 + 82, 3, 3, 16777215);
        }
        if (class112.field2085 < 3) {
            class167.field3344.method750(arg3, arg0, 33, 33, 25, 25, class30.field510, 256, class205.field3978, class25.field391);
        } else {
            class118.method655(arg3, arg0, 0, class205.field3978, class25.field391);
        }
        if (class151.field2934[arg2]) {
            class64.field1036.method674(arg3, arg0);
        }
        class88.field1600[arg2] = arg1;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    public static void method952(int arg0) {
        field2942 = null;
        field2938 = null;
        field2949 = null;
        field2941 = null;
        field2944 = null;
        field2947 = null;
        if (arg0 == 32) {
            field2948 = null;
            field2943 = null;
            field2936 = null;
            field2945 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjg;ZLjg;)V")
    public static final void method953(int arg0, class89 arg1, boolean arg2, class89 arg3) {
        class144.field2795 = arg3;
        if (arg0 >= -55) {
            field2938 = null;
        }
        field2937++;
        class131.field2471 = arg2;
        class117.field2182 = arg1;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "([B)V")
    public class152(byte[] arg0) {
        this.field2940 = arg0;
    }
}

import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class85 {

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Lja;")
    private class55 field1932 = new class55();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Lo;")
    public static class84 field1924 = class15.method124("Earlier today", 255);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[Z")
    public static boolean[] field1925 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false };

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field1935 = 0;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Lo;")
    public static class84 field1934 = class15.method124("earlier today", 255);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Z")
    public static boolean field1927 = false;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lo;")
    public static class84 field1926 = class15.method124("Loaded textures", 255);

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field1933 = 0;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Lo;")
    public static class84 field1938 = class15.method124("Loaded title screen", 255);

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Lo;")
    public static class84 field1943 = class15.method124("Loaded interfaces", 255);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Lo;")
    public static class84 field1930 = class15.method124("@yel@Classic", 255);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lo;")
    public static class84 field1923 = class15.method124("*6nin your message centre)3", 255);

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Lo;")
    public static class84 field1944 = class15.method124("Please wait 1 minute and try again)3", 255);

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "Lo;")
    public static class84 field1947 = class15.method124("slide:", 255);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Lka;")
    public static class61 field1929 = new class61();

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "Lo;")
    public static class84 field1948 = class15.method124("mapscene", 255);

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "Lo;")
    public static class84 field1950 = class15.method124("logo", 255);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[I")
    public static int[] field1949 = new int[2048];

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Lud;")
    public static class118 field1941;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "[I")
    public static int[] field1936;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lja;B)V", line = 3)
    public final void method672(class55 arg0, byte arg1) {
        if (arg1 != 98) {
            this.method675((byte) 115, null);
        }
        if (arg0.field1155 != null) {
            arg0.method461(109);
        }
        arg0.field1139 = this.field1932;
        arg0.field1155 = this.field1932.field1155;
        arg0.field1155.field1139 = arg0;
        arg0.field1139.field1155 = arg0;
        field1928++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)Lja;", line = 22)
    public final class55 method673(int arg0) {
        field1945++;
        class55 var2 = this.field1932.field1139;
        if (arg0 != 26435) {
            this.method674(-113);
        }
        if (this.field1932 == var2) {
            return null;
        } else {
            var2.method461(-64);
            return var2;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Lja;", line = 59)
    public final class55 method674(int arg0) {
        field1931++;
        if (arg0 != -1) {
            field1930 = null;
        }
        class55 var2 = this.field1932.field1139;
        return this.field1932 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 129)
    public class85() {
        this.field1932.field1139 = this.field1932;
        this.field1932.field1155 = this.field1932;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLja;)V", line = 113)
    public final void method675(byte arg0, class55 arg1) {
        field1942++;
        if (arg1.field1155 != null) {
            arg1.method461(-112);
        }
        arg1.field1155 = this.field1932;
        if (arg0 >= -100) {
            field1924 = null;
        }
        arg1.field1139 = this.field1932.field1139;
        arg1.field1155.field1139 = arg1;
        arg1.field1139.field1155 = arg1;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 142)
    public static final void method676(int arg0) {
        class79.method579(false, 50);
        field1937++;
        boolean var1 = true;
        class51.field1099 = 0;
        for (int var2 = 0; var2 < class126.field2794.length; var2++) {
            if (class64.field1364[var2] != -1 && class126.field2794[var2] == null) {
                class126.field2794[var2] = class42.field867.method909((byte) -127, 0, class64.field1364[var2]);
                if (class126.field2794[var2] == null) {
                    var1 = false;
                    class51.field1099++;
                }
            }
            if (class60.field1257[var2] != -1 && class30.field589[var2] == null) {
                class30.field589[var2] = class42.field867.method923(0, class60.field1257[var2], class105.field2222[var2], 123);
                if (class30.field589[var2] == null) {
                    class51.field1099++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class80.field1698 = 1;
            return;
        }
        boolean var3 = true;
        class79.field1675 = 0;
        for (int var4 = 0; var4 < class126.field2794.length; var4++) {
            byte[] var56 = class30.field589[var4];
            if (var56 != null) {
                int var57 = (class67.field1470[var4] & 0xFF) * 64 - class36.field714;
                int var58 = (class67.field1470[var4] >> 8) * 64 - class106.field2242;
                if (class54.field1124) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class58.method470(var56, var58, 0, var57);
            }
        }
        if (!var3) {
            class80.field1698 = 2;
        } else if (arg0 <= -58) {
            if (class80.field1698 != 0) {
                class78.method576(true, class58.field1202, class117.field2545, -32266);
            }
            class57.method464(33554431);
            class112.field2427.method800();
            System.gc();
            for (int var5 = 0; var5 < 4; var5++) {
                class93.field2034[var5].method301(true);
            }
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var54 = 0; var54 < 104; var54++) {
                    for (int var55 = 0; var55 < 104; var55++) {
                        class73.field1544[var6][var54][var55] = 0;
                    }
                }
            }
            class41.method359(-25155);
            int var7 = class126.field2794.length;
            class79.method579(true, 50);
            if (!class54.field1124) {
                for (int var8 = 0; var8 < var7; var8++) {
                    int var17 = (class67.field1470[var8] >> 8) * 64 - class106.field2242;
                    int var18 = (class67.field1470[var8] & 0xFF) * 64 - class36.field714;
                    byte[] var19 = class126.field2794[var8];
                    if (var19 != null) {
                        class109.method846((byte) -106, var18, (class65.field1445 - 6) * 8, class93.field2034, var19, var17, (class58.field1204 - 6) * 8);
                    }
                }
                for (int var9 = 0; var9 < var7; var9++) {
                    int var14 = (class67.field1470[var9] >> 8) * 64 - class106.field2242;
                    byte[] var15 = class126.field2794[var9];
                    int var16 = (class67.field1470[var9] & 0xFF) * 64 - class36.field714;
                    if (var15 == null && class58.field1204 < 800) {
                        class8.method72(64, 64, 20318, var16, var14);
                    }
                }
                class79.method579(true, 50);
                for (int var10 = 0; var10 < var7; var10++) {
                    byte[] var11 = class30.field589[var10];
                    if (var11 != null) {
                        int var12 = (class67.field1470[var10] >> 8) * 64 - class106.field2242;
                        int var13 = (class67.field1470[var10] & 0xFF) * 64 - class36.field714;
                        class116.method894(var13, var12, class112.field2427, var11, -116, class93.field2034);
                    }
                }
            }
            if (class54.field1124) {
                for (int var20 = 0; var20 < 4; var20++) {
                    for (int var34 = 0; var34 < 13; var34++) {
                        for (int var35 = 0; var35 < 13; var35++) {
                            int var36 = class118.field2578[var20][var34][var35];
                            boolean var37 = false;
                            if (var36 != -1) {
                                int var38 = var36 >> 24 & 0x3;
                                int var39 = var36 >> 14 & 0x3FF;
                                int var40 = var36 >> 3 & 0x7FF;
                                int var41 = (var39 / 8 << 8) + var40 / 8;
                                int var42 = var36 >> 1 & 0x3;
                                for (int var43 = 0; var43 < class67.field1470.length; var43++) {
                                    if (class67.field1470[var43] == var41 && class126.field2794[var43] != null) {
                                        class63.method495(class126.field2794[var43], var35 * 8, (var39 & 0x7) * 8, var42, var34 * 8, var38, (var40 & 0x7) * 8, class93.field2034, var20, (byte) 108);
                                        var37 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var37) {
                                class39.method345(var34 * 8, 0, var20, var35 * 8);
                            }
                        }
                    }
                }
                for (int var21 = 0; var21 < 13; var21++) {
                    for (int var32 = 0; var32 < 13; var32++) {
                        int var33 = class118.field2578[0][var21][var32];
                        if (var33 == -1) {
                            class8.method72(8, 8, 20318, var32 * 8, var21 * 8);
                        }
                    }
                }
                class79.method579(true, 50);
                for (int var22 = 0; var22 < 4; var22++) {
                    for (int var23 = 0; var23 < 13; var23++) {
                        for (int var24 = 0; var24 < 13; var24++) {
                            int var25 = class118.field2578[var22][var23][var24];
                            if (var25 != -1) {
                                int var26 = var25 >> 24 & 0x3;
                                int var27 = var25 >> 1 & 0x3;
                                int var28 = var25 >> 14 & 0x3FF;
                                int var29 = var25 >> 3 & 0x7FF;
                                int var30 = (var28 / 8 << 8) + var29 / 8;
                                for (int var31 = 0; var31 < class67.field1470.length; var31++) {
                                    if (class67.field1470[var31] == var30 && class30.field589[var31] != null) {
                                        class26.method194(var27, var26, (var28 & 0x7) * 8, var23 * 8, class93.field2034, (byte) 109, var24 * 8, (var29 & 0x7) * 8, class112.field2427, var22, class30.field589[var31]);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class79.method579(true, 50);
            class57.method464(33554431);
            class30.method266(class93.field2034, class112.field2427, 122);
            class79.method579(true, 50);
            int var44 = class40.field818;
            if (var44 > class1.field11) {
                var44 = class1.field11;
            }
            if (class1.field11 - 1 > var44) {
                int var45 = class1.field11 - 1;
            }
            if (class1.field23) {
                class112.field2427.method807(class40.field818);
            } else {
                class112.field2427.method807(0);
            }
            for (int var46 = 0; var46 < 104; var46++) {
                for (int var53 = 0; var53 < 104; var53++) {
                    class101.method768(var53, var46, 100);
                }
            }
            class15.method122(-126);
            class111.field2391.method742(4);
            if (class126.field2795 != null) {
                class97.field2070.method979(1, 153);
                class3.field41++;
                class97.field2070.method248(1057001181, -2147393384);
            }
            if (!class54.field1124) {
                int var47 = (class65.field1445 - 6) / 8;
                int var48 = (class65.field1445 + 6) / 8;
                int var49 = (class58.field1204 - 6) / 8;
                int var50 = (class58.field1204 + 6) / 8;
                for (int var51 = var47 - 1; var51 <= var48 + 1; var51++) {
                    for (int var52 = var49 - 1; var52 <= var50 + 1; var52++) {
                        if (var47 > var51 || var51 > var48 || var52 < var49 || var50 < var52) {
                            class42.field867.method904(true, class97.method746(0, new class84[] { class125.field2770, class62.method489(var51, (byte) -128), class110.field2387, class62.method489(var52, (byte) -126) }));
                            class42.field867.method904(true, class97.method746(0, new class84[] { class60.field1255, class62.method489(var51, (byte) -128), class110.field2387, class62.method489(var52, (byte) -125) }));
                        }
                    }
                }
            }
            if (class103.field2165 == -1) {
                class8.method63(30, false);
            } else {
                class8.method63(35, false);
            }
            class37.method334(-25457);
            class97.field2070.method979(1, 91);
            class128.method992((byte) 113);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 601)
    public static void method677(byte arg0) {
        field1947 = null;
        field1938 = null;
        field1926 = null;
        field1934 = null;
        field1924 = null;
        field1943 = null;
        field1925 = null;
        field1949 = null;
        field1950 = null;
        field1929 = null;
        field1923 = null;
        field1941 = null;
        field1944 = null;
        field1948 = null;
        field1936 = null;
        int var1 = 102 % ((arg0 - 33) / 45);
        field1930 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/awt/Graphics;)V", line = 630)
    public static final void method678(int arg0, Graphics arg1) {
        field1940++;
        class8.field147.method705(0, arg1, 553, 205);
        int var2 = 99 % ((arg0 + 43) / 63);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZII[B)V", line = 655)
    public static final void method679(boolean arg0, int arg1, int arg2, byte[] arg3) {
        field1939++;
        if (class127.field2813 == null) {
            return;
        }
        if (class73.field1533 >= 0) {
            class127.field2813.method429((byte) -91);
            class21.field387 = 20;
            class122.field2731 = 0;
            class30.field600 = null;
            class73.field1533 = -1;
        }
        if (arg1 != 0) {
            method678(25, null);
        }
        if (arg3 == null) {
            return;
        }
        if (class21.field387 > 0) {
            class127.field2813.method439(arg1 + 1);
            class21.field387 = 0;
        }
        class73.field1533 = arg2;
        class127.field2813.method438(arg0, (byte) 2, arg3, arg2);
    }
}

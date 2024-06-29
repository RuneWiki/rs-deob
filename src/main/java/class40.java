import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class40 extends class15 {

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "[[I")
    public static int[][] field633 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "Lce;")
    private static class126 field635 = class206.method1445(-7923, "Created gameworld");

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "Z")
    public static boolean field640 = true;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "Lce;")
    public static class126 field641 = field635;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "Lce;")
    public static class126 field634 = class206.method1445(-7923, "");

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "Lce;")
    public static class126 field639 = class206.method1445(-7923, ":trade:");

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    public static int field637 = -1;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "Lce;")
    public static class126 field644 = class206.method1445(-7923, ":tradereq:");

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "Lsi;")
    private class237 field649;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "Lcc;")
    public static class313 field638;

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "Lcc;")
    public static class313 field646;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILce;I)Lce;", line = 11)
    public final class126 method250(int arg0, class126 arg1, int arg2) {
        field636++;
        if (this.field649 == null) {
            return arg1;
        }
        class305 var4 = (class305) this.field649.method1631(false, (long) arg2);
        if (var4 == null) {
            return arg1;
        } else {
            if (arg0 != 27015) {
                field641 = (class126) null;
            }
            return var4.field5125;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BII)I", line = 50)
    public final int method251(byte arg0, int arg1, int arg2) {
        field643++;
        if (arg0 < 20) {
            field640 = false;
        }
        if (this.field649 == null) {
            return arg1;
        } else {
            class27 var4 = (class27) this.field649.method1631(false, (long) arg2);
            return var4 == null ? arg1 : var4.field383;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILbb;)V", line = 71)
    public final void method252(int arg0, class134 arg1) {
        field647++;
        while (true) {
            int var3 = arg1.method948(-128);
            if (var3 == 0) {
                if (arg0 != 128) {
                    method256(2);
                }
                return;
            }
            this.method255(var3, arg1, -26809);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILwd;I)I", line = 94)
    public static final int method253(int arg0, class112 arg1, int arg2) {
        field632++;
        if (arg1.field1807 == null || arg0 >= arg1.field1807.length) {
            return -2;
        }
        try {
            int var3 = 8 % ((arg2 + 7) / 35);
            int var4 = 0;
            int var5 = 0;
            int[] var6 = arg1.field1807[arg0];
            byte var7 = 0;
            while (true) {
                int var8 = var6[var5++];
                int var9 = 0;
                byte var10 = 0;
                if (var8 == 0) {
                    return var4;
                }
                if (var8 == 15) {
                    var10 = 1;
                }
                if (var8 == 16) {
                    var10 = 2;
                }
                if (var8 == 17) {
                    var10 = 3;
                }
                if (var8 == 1) {
                    var9 = class116.field1956[var6[var5++]];
                }
                if (var8 == 2) {
                    var9 = class231.field3882[var6[var5++]];
                }
                if (var8 == 3) {
                    var9 = class182.field3174[var6[var5++]];
                }
                if (var8 == 4) {
                    int var11 = var6[var5++] << 16;
                    int var12 = var11 + var6[var5++];
                    class112 var13 = class252.method1706(5157, var12);
                    int var14 = var6[var5++];
                    if (var14 != -1 && (!class68.method498(114, var14).field2387 || class107.field1686)) {
                        for (int var15 = 0; var15 < var13.field1849.length; var15++) {
                            if (var14 + 1 == var13.field1849[var15]) {
                                var9 += var13.field1899[var15];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var9 = class138.field2462[var6[var5++]];
                }
                if (var8 == 6) {
                    var9 = class287.field4777[class231.field3882[var6[var5++]] - 1];
                }
                if (var8 == 7) {
                    var9 = class138.field2462[var6[var5++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var9 = class286.field4744.field5020;
                }
                if (var8 == 9) {
                    for (int var16 = 0; var16 < 25; var16++) {
                        if (class59.field937[var16]) {
                            var9 += class231.field3882[var16];
                        }
                    }
                }
                if (var8 == 10) {
                    int var17 = var6[var5++] << 16;
                    int var18 = var17 + var6[var5++];
                    class112 var19 = class252.method1706(5157, var18);
                    int var20 = var6[var5++];
                    if (var20 != -1 && (!class68.method498(18, var20).field2387 || class107.field1686)) {
                        for (int var21 = 0; var21 < var19.field1849.length; var21++) {
                            if ((var20 + 1) == var19.field1849[var21]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var9 = class297.field4945;
                }
                if (var8 == 12) {
                    var9 = class189.field3246;
                }
                if (var8 == 13) {
                    int var22 = class138.field2462[var6[var5++]];
                    int var23 = var6[var5++];
                    var9 = (var22 & 0x1 << var23) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var24 = var6[var5++];
                    var9 = class64.method468((byte) -100, var24);
                }
                if (var8 == 18) {
                    var9 = (class286.field4744.field2461 >> 7) + class58.field914;
                }
                if (var8 == 19) {
                    var9 = (class286.field4744.field2487 >> 7) + class138.field2473;
                }
                if (var8 == 20) {
                    var9 = var6[var5++];
                }
                if (var10 == 0) {
                    if (var7 == 0) {
                        var4 += var9;
                    }
                    if (var7 == 1) {
                        var4 -= var9;
                    }
                    if (var7 == 2 && var9 != 0) {
                        var4 /= var9;
                    }
                    if (var7 == 3) {
                        var4 *= var9;
                    }
                    var7 = 0;
                } else {
                    var7 = var10;
                }
            }
        } catch (Exception var26) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)Ltl;", line = 314)
    public static final class267 method254(int arg0, byte arg1) {
        field642++;
        class267 var2 = (class267) class170.field3028.method303((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class70.field1148.method2173(arg0, 0, (byte) -33);
        if (var3 == null) {
            return null;
        }
        class267 var4 = new class267();
        class134 var5 = new class134(var3);
        var5.field2299 = var5.field2282.length - 2;
        int var6 = 73 / ((arg1 - 66) / 49);
        int var7 = var5.method942(true);
        int var8 = var5.field2282.length - var7 - 14;
        var5.field2299 = var8;
        int var9 = var5.method957(496113200);
        var4.field4524 = var5.method942(true);
        var4.field4520 = var5.method942(true);
        var4.field4532 = var5.method942(true);
        var4.field4528 = var5.method942(true);
        int var10 = var5.method948(-124);
        if (var10 > 0) {
            var4.field4531 = new class237[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = var5.method942(true);
                class237 var13 = new class237(class301.method2026(var12, false));
                var4.field4531[var11] = var13;
                while (var12-- > 0) {
                    int var14 = var5.method957(496113200);
                    int var15 = var5.method957(496113200);
                    var13.method1636(11311, new class27(var15), (long) var14);
                }
            }
        }
        var5.field2299 = 0;
        var4.field4523 = var5.method927(-1165426824);
        var4.field4525 = new class126[var9];
        var4.field4527 = new int[var9];
        var4.field4521 = new int[var9];
        int var16 = 0;
        while (var5.field2299 < var8) {
            int var17 = var5.method942(true);
            if (var17 == 3) {
                var4.field4525[var16] = var5.method970(1);
            } else if (var17 >= 100 || var17 == 21 || var17 == 38 || var17 == 39) {
                var4.field4527[var16] = var5.method948(-124);
            } else {
                var4.field4527[var16] = var5.method957(496113200);
            }
            var4.field4521[var16++] = var17;
        }
        class170.field3028.method308(var4, (long) arg0, (byte) 109);
        return var4;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILbb;I)V", line = 402)
    private final void method255(int arg0, class134 arg1, int arg2) {
        if (arg0 == 249) {
            int var4 = arg1.method948(-128);
            if (this.field649 == null) {
                int var5 = class301.method2026(var4, false);
                this.field649 = new class237(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method948(-128) == 1;
                int var8 = arg1.method949(arg2 ^ 0xFFFFC7BB);
                class68 var9;
                if (var7) {
                    var9 = new class305(arg1.method970(arg2 + 26810));
                } else {
                    var9 = new class27(arg1.method957(496113200));
                }
                this.field649.method1636(11311, var9, (long) var8);
            }
        }
        if (arg2 != -26809) {
            this.method250(-73, (class126) null, 108);
        }
        field645++;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V", line = 454)
    public static void method256(int arg0) {
        field635 = null;
        field638 = null;
        field639 = null;
        field641 = null;
        if (arg0 > -65) {
            field633 = (int[][]) ((int[][]) null);
        }
        field644 = null;
        field634 = null;
        field633 = (int[][]) null;
        field646 = null;
    }
}

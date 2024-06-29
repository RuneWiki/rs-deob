import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class136 extends class141 {

    @OriginalMember(owner = "client!u", name = "E", descriptor = "[B")
    public byte[] field3385;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "Lkd;")
    private static class73 field3383 = class126.method1070((byte) -66, "Your account has been disabled)3");

    @OriginalMember(owner = "client!u", name = "A", descriptor = "Lkd;")
    public static class73 field3381 = field3383;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "Lkd;")
    private static class73 field3391 = class126.method1070((byte) -66, " ");

    @OriginalMember(owner = "client!u", name = "G", descriptor = "Lkd;")
    public static class73 field3387 = class126.method1070((byte) -66, "Schlie-8en");

    @OriginalMember(owner = "client!u", name = "O", descriptor = "Lkd;")
    public static class73 field3395 = class126.method1070((byte) -66, "huffman");

    @OriginalMember(owner = "client!u", name = "R", descriptor = "Lkd;")
    public static class73 field3397 = class126.method1070((byte) -66, "");

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "Lkd;")
    private static class73 field3396 = class126.method1070((byte) -66, "Enter your username (V password)3");

    @OriginalMember(owner = "client!u", name = "L", descriptor = "Lkd;")
    public static class73 field3392 = field3396;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "Lkd;")
    public static class73 field3393 = class126.method1070((byte) -66, ")4lang)4de");

    @OriginalMember(owner = "client!u", name = "B", descriptor = "Lkd;")
    public static class73 field3382 = field3391;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "Lkd;")
    public static class73 field3386 = class126.method1070((byte) -66, "::noclip");

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "Lq;")
    public static class111 field3390;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "Lbc;")
    public static class11 field3399;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "Ljava/awt/Font;")
    public static Font field3400;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)V")
    public static final void method1110(boolean arg0) {
        field3398++;
        for (int var1 = 0; var1 < class62.field1635; var1++) {
            int var10002 = class38.field1032[var1]--;
            if (class38.field1032[var1] >= -10) {
                class93 var3 = class2.field154[var1];
                if (var3 == null) {
                    var3 = class93.method777(class121.field3101, class20.field572[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class38.field1032[var1] += var3.method775();
                    class2.field154[var1] = var3;
                }
                if (class38.field1032[var1] < 0) {
                    int var10;
                    if (class42.field1123[var1] == 0) {
                        var10 = class37.field1024;
                    } else {
                        int var4 = (class42.field1123[var1] & 0xFF) * 128;
                        int var5 = class42.field1123[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class73.field1901.field2277;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = class42.field1123[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class73.field1901.field2264;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + var6 - 128;
                        if (var9 > var4) {
                            class38.field1032[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class99.field2492 / var4;
                    }
                    if (var10 > 0) {
                        class108 var11 = var3.method776().method869(class109.field2672);
                        class56 var12 = class56.method483(var11, 100, var10);
                        var12.method455(class150.field3708[var1] - 1);
                        class21.field575.method922(var12);
                    }
                    class38.field1032[var1] = -100;
                }
            } else {
                class62.field1635--;
                for (int var2 = var1; var2 < class62.field1635; var2++) {
                    class20.field572[var2] = class20.field572[var2 + 1];
                    class2.field154[var2] = class2.field154[var2 + 1];
                    class150.field3708[var2] = class150.field3708[var2 + 1];
                    class38.field1032[var2] = class38.field1032[var2 + 1];
                    class42.field1123[var2] = class42.field1123[var2 + 1];
                }
                var1--;
            }
        }
        if (!arg0) {
            field3390 = null;
        }
        if (class12.field402 && !class121.method1036(-1)) {
            if (class104.field2600 != 0 && class111.field2720 != -1) {
                class41.method310(0, false, -108, class111.field2720, class104.field2600, class87.field2193);
            }
            class12.field402 = false;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B[B)V")
    public static final void method1111(byte arg0, byte[] arg1) {
        field3389++;
        class114 var2 = new class114(arg1);
        if (arg0 > -36) {
            return;
        }
        var2.field2816 = arg1.length - 2;
        class5.field182 = var2.method944((byte) 121);
        class72.field1819 = new int[class5.field182];
        class22.field641 = new int[class5.field182];
        class2.field150 = new int[class5.field182];
        class132.field3315 = new int[class5.field182];
        class92.field2382 = new byte[class5.field182][];
        var2.field2816 = arg1.length - class5.field182 * 8 - 7;
        class45.field1192 = var2.method944((byte) 121);
        class111.field2723 = var2.method944((byte) 124);
        int var3 = (var2.method957((byte) 81) & 0xFF) + 1;
        for (int var4 = 0; var4 < class5.field182; var4++) {
            class22.field641[var4] = var2.method944((byte) 120);
        }
        for (int var5 = 0; var5 < class5.field182; var5++) {
            class132.field3315[var5] = var2.method944((byte) 127);
        }
        for (int var6 = 0; var6 < class5.field182; var6++) {
            class72.field1819[var6] = var2.method944((byte) 111);
        }
        for (int var7 = 0; var7 < class5.field182; var7++) {
            class2.field150[var7] = var2.method944((byte) 118);
        }
        var2.field2816 = arg1.length + 3 - class5.field182 * 8 - var3 * 3 - 7;
        class24.field682 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class24.field682[var8] = var2.method933(-68);
            if (class24.field682[var8] == 0) {
                class24.field682[var8] = 1;
            }
        }
        var2.field2816 = 0;
        for (int var9 = 0; var9 < class5.field182; var9++) {
            int var10 = class72.field1819[var9];
            int var11 = class2.field150[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class92.field2382[var9] = var13;
            int var14 = var2.method957((byte) 94);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method966((byte) 111);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var10 * var16 + var15] = var2.method966((byte) 38);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZIZI)V")
    public static final void method1112(boolean arg0, int arg1, boolean arg2, int arg3) {
        field3394++;
        if (!arg2) {
            method1112(false, -82, false, -94);
        }
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class62.field1623 = arg3;
        class48.field1282 = arg1;
        class20.field568 = arg0;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static final void method1113(int arg0) {
        field3384++;
        class133 var1 = class115.field2903;
        synchronized (class115.field2903) {
            class80.field2031 = class25.field729;
            if (class39.field1068 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class73.field1895[var2] = false;
                }
                class39.field1068 = class137.field3416;
            } else {
                while (class39.field1068 != class137.field3416) {
                    int var3 = class107.field2654[class137.field3416];
                    class137.field3416 = class137.field3416 + 1 & 0x7F;
                    if (var3 < 0) {
                        class73.field1895[~var3] = false;
                    } else {
                        class73.field1895[var3] = true;
                    }
                }
            }
            class25.field729 = class78.field1994;
            if (arg0 != 0) {
                field3386 = null;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V")
    public static void method1114(byte arg0) {
        field3383 = null;
        field3396 = null;
        if (arg0 >= -8) {
            field3392 = null;
        }
        field3387 = null;
        field3391 = null;
        field3382 = null;
        field3400 = null;
        field3381 = null;
        field3397 = null;
        field3386 = null;
        field3395 = null;
        field3399 = null;
        field3392 = null;
        field3390 = null;
        field3393 = null;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
    public static final void method1115(int arg0) {
        class89.field2294.method100(true);
        if (arg0 != 8) {
            field3392 = null;
        }
        field3388++;
        class29.method237();
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "([B)V")
    public class136(byte[] arg0) {
        this.field3385 = arg0;
    }
}

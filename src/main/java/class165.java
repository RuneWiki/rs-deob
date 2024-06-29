import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class165 extends class103 {

    @OriginalMember(owner = "client!mf", name = "Ab", descriptor = "[I")
    public static int[] field2519 = new int[1000];

    @OriginalMember(owner = "client!mf", name = "zb", descriptor = "[[I")
    public static int[][] field2518 = new int[104][104];

    @OriginalMember(owner = "client!mf", name = "Eb", descriptor = "[[I")
    public static int[][] field2523 = new int[104][104];

    @OriginalMember(owner = "client!mf", name = "Gb", descriptor = "Lma;")
    public static class5 field2525 = class12.method119("(U1", (byte) 78);

    @OriginalMember(owner = "client!mf", name = "Db", descriptor = "I")
    public static int field2522 = 3353893;

    @OriginalMember(owner = "client!mf", name = "yb", descriptor = "Lma;")
    public static class5 field2517 = class12.method119("::fpsoff", (byte) 102);

    @OriginalMember(owner = "client!mf", name = "Bb", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!mf", name = "Cb", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!mf", name = "Fb", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!mf", name = "Hb", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!mf", name = "Ib", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V", line = 6)
    public static final void method1104(boolean arg0, int arg1) {
        field2520++;
        int var2 = class111.field1657.length;
        byte[][] var3;
        if (arg0) {
            var3 = class161.field2465;
        } else {
            var3 = class288.field4877;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class294.field4958[var4] >> 8) * 64 - class193.field3017;
                int var7 = (class294.field4958[var4] & 0xFF) * 64 - class74.field1158;
                class177.method1155((byte) 96);
                class297.method2006(var6, arg0, 127, var7, class242.field4031, var5);
            }
        }
        if (arg1 > -39) {
            method1104(false, -121);
        }
    }

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "(I)V", line = 54)
    public static final void method1105(int arg0) {
        field2526++;
        class206 var1 = (class206) class77.field1203.method1475(14);
        if (arg0 != -1) {
            method1104(false, -64);
        }
        while (var1 != null) {
            class267 var2 = var1.field3283;
            if (class276.field4701 != var2.field4555 || class50.field784 > var2.field4569) {
                var1.method1997(-27381);
            } else if (class50.field784 >= var2.field4580) {
                if (var2.field4574 > 0) {
                    class177 var3 = class119.field1804[var2.field4574 - 1];
                    if (var3 != null && var3.field178 >= 0 && var3.field178 < 13312 && var3.field211 >= 0 && var3.field211 < 13312) {
                        var2.method1840(var3.field211, class50.field784, 8, class20.method161(var3.field211, var3.field178, 1, var2.field4555) - var2.field4584, var3.field178);
                    }
                }
                if (var2.field4574 < 0) {
                    int var4 = -var2.field4574 - 1;
                    class91 var5;
                    if (class161.field2460 == var4) {
                        var5 = class151.field2183;
                    } else {
                        var5 = class267.field4593[var4];
                    }
                    if (var5 != null && var5.field178 >= 0 && var5.field178 < 13312 && var5.field211 >= 0 && var5.field211 < 13312) {
                        var2.method1840(var5.field211, class50.field784, arg0 ^ 0x3B, class20.method161(var5.field211, var5.field178, 1, var2.field4555) - var2.field4584, var5.field178);
                    }
                }
                var2.method1841(class282.field4788, arg0 ^ 0xFFFFF800);
                class11.method114(class276.field4701, (int) var2.field4575, (int) var2.field4561, (int) var2.field4563, 60, var2, var2.field4568, -1L, false);
            }
            var1 = (class206) class77.field1203.method1486(38);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(BI)[[I", line = 118)
    public final int[][] method138(byte arg0, int arg1) {
        int[][] var3 = this.field4524.method1462(-15077, arg1);
        field2527++;
        if (this.field4524.field3506 && this.method654((byte) 111)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % this.field1529 * this.field1529;
            for (int var8 = 0; var8 < class226.field3716; var8++) {
                int var9 = this.field1525[var8 % this.field1536 + var7];
                var6[var8] = class204.method1354(4080, var9 << 4);
                var5[var8] = class204.method1354(var9 >> 4, 4080);
                var4[var8] = class204.method1354(4080, var9 >> 12);
            }
        }
        int var10 = 77 / ((-arg0 - 43) / 55);
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 160)
    public static final void method1106(byte arg0, Component arg1) {
        field2524++;
        arg1.removeMouseListener(class265.field4536);
        arg1.removeMouseMotionListener(class265.field4536);
        arg1.removeFocusListener(class265.field4536);
        class133.field1982 = 0;
        int var2 = 80 / ((arg0 + 21) / 34);
    }

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "(I)V", line = 178)
    public static void method1107(int arg0) {
        field2517 = null;
        field2519 = null;
        field2518 = (int[][]) null;
        field2525 = null;
        if (arg0 == 0) {
            field2523 = (int[][]) null;
        }
    }
}

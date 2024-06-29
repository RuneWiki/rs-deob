import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class314 {

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Loh;")
    public static class258 field5328 = class153.method1046("Lade Texturen )2 ", 93);

    @OriginalMember(owner = "client!e", name = "i", descriptor = "Z")
    public static boolean field5330 = true;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "[I")
    public static int[] field5329 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field5322 = 0;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V", line = 25)
    public static final void method2172(byte arg0) {
        if (arg0 < 1) {
            field5330 = false;
        }
        class68.field1177 &= 0x7FF;
        field5327++;
        if (class101.field1815 < 128) {
            class101.field1815 = 128;
        }
        if (class101.field1815 > 383) {
            class101.field1815 = 383;
        }
        int var1 = class71.field1240 >> 7;
        int var2 = class147.field2500 >> 7;
        int var3 = class228.method1525(true, class272.field4704, class147.field2500, class71.field1240);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class272.field4704;
                    if (var7 < 3 && (class94.field1653[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 - class201.field3482[var7][var5][var6];
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class42.field582 < var9) {
            class42.field582 += (var9 - class42.field582) / 24;
        } else if (var9 < class42.field582) {
            class42.field582 += (var9 - class42.field582) / 80;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Loh;Lva;I)I", line = 105)
    public static final int method2173(class258 arg0, class235 arg1, int arg2) {
        int var3 = arg1.field4051;
        int var4 = -71 / ((arg2 - 66) / 60);
        arg1.method1586(arg0.field4478, (byte) 109);
        field5323++;
        arg1.field4051 += class247.field4281.method614(arg0.field4478, arg0.field4490, 0, arg1.field4066, arg1.field4051, 255);
        return arg1.field4051 - var3;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 124)
    public static final void method2174(int arg0) {
        class251.field4322 = null;
        class31.field372 = null;
        class74.field1298 = null;
        class303.field5175 = null;
        class317.field5351 = null;
        class263.field4577 = null;
        class241.field4182 = null;
        class210.field3619 = null;
        class249.field4296 = null;
        class168.field2844 = null;
        class239.field4170 = null;
        class117.field2070 = null;
        class281.field4839 = null;
        class44.field662 = null;
        class184.field3281 = null;
        class282.field4848 = null;
        class32.field385 = null;
        class250.field4311 = null;
        if (arg0 >= -115) {
            return;
        }
        class56.field887 = null;
        field5325++;
        class44.field668 = null;
        class123.field2180 = null;
        class79.field1355 = null;
        class120.field2122 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZLwj;)V", line = 158)
    public static final void method2175(int arg0, boolean arg1, class247 arg2) {
        field5331++;
        int var3 = arg2.field4283;
        int var4 = (int) arg2.field2642;
        arg2.method1054((byte) 102);
        if (arg1) {
            class162.method1089(var3, 0);
        }
        class282.method1977(var3, -501);
        class171 var5 = class263.method1844(var4, (byte) -70);
        if (var5 != null) {
            class165.method1099((byte) 127, var5);
        }
        int var6 = class69.field1195;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class164.method1096(class227.field3910[var7], (byte) 88)) {
                class191.method1288(var7, true);
            }
        }
        if (class69.field1195 == 1) {
            class252.field4342 = false;
            class93.method691(-120, class84.field1414, class224.field3845, class218.field3766, class201.field3490);
        } else {
            class93.method691(-121, class84.field1414, class224.field3845, class218.field3766, class201.field3490);
            int var8 = class123.field2180.method252(class16.field204);
            for (int var9 = 0; var9 < class69.field1195; var9++) {
                int var10 = class123.field2180.method252(class63.method488(true, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class84.field1414 = var8 + 8;
            class224.field3845 = class69.field1195 * 15 + 22;
        }
        int var11 = -44 / ((arg0 - 59) / 47);
        if (class170.field2901 != -1) {
            class20.method134(class170.field2901, -29750, 1);
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V", line = 233)
    public static void method2176(byte arg0) {
        field5328 = null;
        field5329 = null;
        if (arg0 <= 0) {
            field5330 = false;
        }
    }
}

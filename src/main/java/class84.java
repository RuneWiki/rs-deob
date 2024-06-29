import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class84 extends class65 {

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public static int field1883 = 1;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "Lrc;")
    public static class105 field1887 = class43.method374("Lade Sprites )2 ", 0);

    @OriginalMember(owner = "client!o", name = "H", descriptor = "[Z")
    public static boolean[] field1889 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false };

    @OriginalMember(owner = "client!o", name = "B", descriptor = "Lrc;")
    public static class105 field1884 = null;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "Lrc;")
    public static class105 field1890 = class43.method374("backleft1", 0);

    @OriginalMember(owner = "client!o", name = "y", descriptor = "Lrc;")
    private static class105 field1881 = class43.method374("The server is being updated)3", 0);

    @OriginalMember(owner = "client!o", name = "D", descriptor = "Lrc;")
    public static class105 field1885 = field1881;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "Lrc;")
    public class105 field1891;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V", line = 5)
    public static final void method703(byte arg0) {
        field1888++;
        if (!class3.field56) {
            return;
        }
        class12.field242 = null;
        class9.field154 = null;
        class95.field2190 = null;
        class133.field3232 = null;
        class130.field3168 = null;
        class118.field2760 = null;
        class58.field1302 = null;
        class42.field967 = null;
        class116.field2695 = null;
        class119.field2880 = null;
        class43.field994 = null;
        class29.field660 = null;
        class123.field3031 = null;
        class28.field637 = null;
        class85.field1927 = null;
        class128.field3103 = null;
        class30.field684 = null;
        if (arg0 != 53) {
            method706(true);
        }
        class75.field1676 = null;
        class3.field56 = false;
        class34.field793 = null;
        class130.field3154 = null;
        class104.field2364 = null;
        client.field436 = null;
        class16.field330 = null;
        class100.field2283 = null;
        class3.field55 = null;
        class83.field1865 = null;
        class83.field1845 = null;
        class7.field84 = null;
        class9.field152 = null;
        class57.field1191 = null;
        class22.field539 = null;
        class117.field2743 = null;
        class55.field1102 = null;
        class81.field1838 = null;
        class122.field2983 = null;
        class105.field2409 = null;
        class104.field2361 = null;
        class34.field791 = null;
        class72.field1587 = null;
        class92.field2134 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIZ)Lrc;", line = 69)
    public static final class105 method704(int arg0, int arg1, int arg2, boolean arg3) {
        field1892++;
        if (arg2 < 1 || arg2 > 36) {
            arg2 = 10;
        }
        int var4 = arg0 / arg2;
        int var5 = 1;
        while (var4 != 0) {
            var5++;
            var4 /= arg2;
        }
        int var6 = var5;
        if (arg0 < 0 || arg3) {
            var6 = var5 + 1;
        }
        if (arg1 > -89) {
            field1886 = 21;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = arg0 % arg2;
            arg0 /= arg2;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class105 var9 = new class105();
        var9.field2417 = var7;
        var9.field2383 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V", line = 175)
    public static final void method705(boolean arg0) {
        try {
            if (!arg0) {
                method704(-40, -34, -127, true);
            }
            Graphics var1 = class41.field935.getGraphics();
            client.field436.method320(4, var1, (byte) -89, 4);
        } catch (Exception var2) {
            class41.field935.repaint();
        }
        field1893++;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V", line = 195)
    public static void method706(boolean arg0) {
        field1884 = null;
        if (!arg0) {
            field1887 = null;
        }
        field1881 = null;
        field1890 = null;
        field1887 = null;
        field1885 = null;
        field1889 = null;
    }
}

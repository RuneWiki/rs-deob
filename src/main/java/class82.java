import java.awt.Container;
import java.awt.Insets;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class82 extends class68 {

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "Lvc;")
    public static class129 field1322 = new class129();

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "Lwd;")
    public static class112 field1324 = null;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "Lce;")
    public static class126 field1325 = class206.method1445(-7923, "niveau ");

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "B")
    public byte field1316;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public int field1317;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "J")
    public static long field1328;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "Lwd;")
    public static class112 field1326;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "Lce;")
    public class126 field1321;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "Lce;")
    public class126 field1323;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "Ld;")
    public static class60 field1327;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILie;)V", line = 8)
    public static final void method581(int arg0, class2 arg1) {
        field1319++;
        for (int var2 = 0; var2 < class317.field5439.length; var2++) {
            class317.field5439[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) ((double) var3 * 128.0D * Math.random());
            class317.field5439[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < var3 - 1; var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class181.field3146[var9] = (class317.field5439[var9 + 1] + class317.field5439[var9 - 128] + class317.field5439[var9 + -1] + class317.field5439[var9 + 128]) / 4;
                }
            }
            int[] var10 = class317.field5439;
            class317.field5439 = class181.field3146;
            class181.field3146 = var10;
        }
        if (arg0 != 5672) {
            method582(96);
        }
        if (arg1 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1.field375; var12++) {
            for (int var13 = 0; var13 < arg1.field376; var13++) {
                if (arg1.field14[var11++] != 0) {
                    int var14 = arg1.field368 + var13 + 16;
                    int var15 = var12 + arg1.field363 + 16;
                    int var16 = (var15 << 7) + var14;
                    class317.field5439[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V", line = 108)
    public static final void method582(int arg0) {
        field1320++;
        Container var1;
        if (class45.field693 != null) {
            var1 = class45.field693;
        } else if (class253.field4250 == null) {
            var1 = class161.field2907.field2705;
        } else {
            var1 = class253.field4250;
        }
        class9.field117 = var1.getSize().width;
        class22.field307 = var1.getSize().height;
        if (class253.field4250 == var1) {
            Insets var2 = class253.field4250.getInsets();
            class22.field307 -= var2.top + var2.bottom;
            class9.field117 -= var2.right + var2.left;
        }
        if (class45.method282(88) < 2) {
            class134.field2292 = (class9.field117 - 765) / 2;
            class7.field87 = 765;
            class70.field1154 = 0;
            class1.field6 = 503;
        } else {
            class134.field2292 = 0;
            class7.field87 = class9.field117;
            class1.field6 = class22.field307;
            class70.field1154 = 0;
        }
        if (class56.field846) {
            class56.method365(class7.field87, class1.field6);
        }
        class24.field342.setSize(class7.field87, class1.field6);
        int var3 = -128 % ((63 - arg0) / 49);
        if (class253.field4250 == var1) {
            Insets var4 = class253.field4250.getInsets();
            class24.field342.setLocation(class134.field2292 + var4.left, var4.top - -class70.field1154);
        } else {
            class24.field342.setLocation(class134.field2292, class70.field1154);
        }
        if (class182.field3162 != -1) {
            class100.method679(true, -14575);
        }
        class14.method82(500);
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V", line = 175)
    public static void method583(int arg0) {
        field1322 = null;
        field1327 = null;
        if (arg0 <= 125) {
            field1328 = -18L;
        }
        field1325 = null;
        field1324 = null;
        field1326 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/lang/String;)Lce;", line = 208)
    public static final class126 method584(byte arg0, String arg1) {
        field1329++;
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var2 = arg1.getBytes();
        }
        class126 var4 = new class126();
        var4.field2158 = var2;
        var4.field2140 = 0;
        int var5 = -34 % ((arg0 + 8) / 62);
        for (int var6 = 0; var6 < var2.length; var6++) {
            if (var2[var6] != 0) {
                var2[var4.field2140++] = var2[var6];
            }
        }
        return var4;
    }
}

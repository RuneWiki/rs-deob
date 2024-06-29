import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class96 extends class110 {

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "Lmb;")
    public static class84 field2373 = class79.method672(true, "backright1");

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "[I")
    public static int[] field2379 = new int[1000];

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "Lmb;")
    public static class84 field2382 = class79.method672(true, "@yel@");

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "Lmb;")
    public static class84 field2380 = class79.method672(true, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "Lmb;")
    private static class84 field2384 = class79.method672(true, " is already on your ignore list");

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "Lmb;")
    public static class84 field2376 = field2384;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "Lsa;")
    public static class119 field2378 = new class119(50);

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "I")
    public static int field2385 = 0;

    @OriginalMember(owner = "client!ob", name = "ib", descriptor = "Lmb;")
    private static class84 field2388 = class79.method672(true, "Password: ");

    @OriginalMember(owner = "client!ob", name = "jb", descriptor = "Lmb;")
    public static class84 field2389 = class79.method672(true, "Angreifen");

    @OriginalMember(owner = "client!ob", name = "hb", descriptor = "Lmb;")
    public static class84 field2387 = class79.method672(true, "(U4");

    @OriginalMember(owner = "client!ob", name = "kb", descriptor = "Lmb;")
    public static class84 field2390 = field2388;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "B")
    public byte field2381;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    public int field2377;

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "Lge;")
    public class47 field2372;

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "[I")
    public static int[] field2386;

    @OriginalMember(owner = "client!ob", name = "lb", descriptor = "[[B")
    public static byte[][] field2391;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)V")
    public static final void method799(byte arg0) {
        int var1 = -67 / ((arg0 - 19) / 55);
        field2374++;
        try {
            Graphics var2 = class92.field2296.getGraphics();
            class17.field378.method122(var2, 550, 4, 0);
        } catch (Exception var3) {
            class92.field2296.repaint();
        }
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
    public static void method800(int arg0) {
        field2390 = null;
        field2384 = null;
        field2388 = null;
        field2389 = null;
        field2373 = null;
        field2379 = null;
        field2387 = null;
        field2391 = null;
        field2386 = null;
        field2378 = null;
        field2382 = null;
        if (arg0 < -90) {
            field2376 = null;
            field2380 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(B)V")
    public static final void method801(byte arg0) {
        class56.field1282 = false;
        if (arg0 != 89) {
            method800(-9);
        }
        field2383++;
        class124.field3012 = false;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILia;)Lia;")
    public static final class57 method802(int arg0, class57 arg1) {
        field2375++;
        if (arg0 != 1000) {
            field2389 = null;
        }
        class57 var2 = class146.method1188(arg1, true);
        if (var2 == null) {
            var2 = arg1.field1333;
        }
        return var2;
    }
}

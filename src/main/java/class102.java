import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class102 extends class73 {

    @OriginalMember(owner = "client!pa", name = "fb", descriptor = "Lmb;")
    public static class85 field2570 = new class85(50);

    @OriginalMember(owner = "client!pa", name = "lb", descriptor = "I")
    public static int field2576 = 0;

    @OriginalMember(owner = "client!pa", name = "nb", descriptor = "[Z")
    public static boolean[] field2578 = new boolean[5];

    @OriginalMember(owner = "client!pa", name = "qb", descriptor = "I")
    public static int field2581 = -1;

    @OriginalMember(owner = "client!pa", name = "gb", descriptor = "Lrd;")
    public static class117 field2571 = class95.method812("Suche nach Updates )2 ", (byte) 8);

    @OriginalMember(owner = "client!pa", name = "ob", descriptor = "Lrd;")
    public static class117 field2579 = class95.method812("p12_full", (byte) 8);

    @OriginalMember(owner = "client!pa", name = "pb", descriptor = "I")
    public static int field2580 = 0;

    @OriginalMember(owner = "client!pa", name = "tb", descriptor = "Lrd;")
    public static class117 field2584 = class95.method812("Bitte entfernen Sie ", (byte) 8);

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    public int field2547;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
    public int field2548;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
    public int field2549;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
    public int field2550;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "I")
    public int field2551;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
    public int field2552;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public int field2553;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
    public int field2554;

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "I")
    public int field2557;

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
    public int field2558;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
    public int field2560;

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "I")
    public int field2562;

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "I")
    public int field2563;

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!pa", name = "bb", descriptor = "I")
    public int field2566;

    @OriginalMember(owner = "client!pa", name = "db", descriptor = "I")
    public int field2568;

    @OriginalMember(owner = "client!pa", name = "eb", descriptor = "I")
    public int field2569;

    @OriginalMember(owner = "client!pa", name = "hb", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!pa", name = "jb", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!pa", name = "kb", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!pa", name = "sb", descriptor = "I")
    public int field2583;

    @OriginalMember(owner = "client!pa", name = "cb", descriptor = "Lta;")
    public class126 field2567;

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "Lee;")
    public class34 field2565;

    @OriginalMember(owner = "client!pa", name = "rb", descriptor = "Lga;")
    public static class44 field2582;

    @OriginalMember(owner = "client!pa", name = "ib", descriptor = "Ljf;")
    public class68 field2573;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "Lkc;")
    public class72 field2555;

    @OriginalMember(owner = "client!pa", name = "mb", descriptor = "Z")
    public static boolean field2577;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
    public static void method854(int arg0) {
        field2578 = null;
        field2582 = null;
        if (arg0 == 0) {
            field2584 = null;
            field2579 = null;
            field2571 = null;
            field2570 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Ljd;")
    public static final class66 method855(int arg0, int arg1) {
        field2564++;
        class66 var2 = (class66) class58.field1596.method774((long) arg0, 329);
        if (var2 != null) {
            return var2;
        }
        class66 var3 = class66.method657(arg0, class138.field3316, class93.field2341, -109, false);
        if (var3 != null) {
            class58.field1596.method773((long) arg0, (byte) -17, var3);
        }
        if (arg1 < 22) {
            method857(true, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lrd;ILge;Lrd;)Ll;")
    public static final class76 method856(class117 arg0, int arg1, class47 arg2, class117 arg3) {
        field2556++;
        int var4 = arg2.method509(arg3, 0);
        int var5 = arg2.method523(var4, arg0, -1);
        int var6 = 108 % ((84 - arg1) / 38);
        return class38.method456((byte) -110, var5, var4, arg2);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZZ)V")
    public static final void method857(boolean arg0, boolean arg1) {
        field2561++;
        class49.method544((byte) 95);
        class63.field1803++;
        if (class63.field1803 < 50 && !arg0 || arg1) {
            return;
        }
        class63.field1803 = 0;
        if (class85.field2227 || class119.field2923 == null) {
            return;
        }
        class25.field754.method739(false, 147);
        class37.field1073++;
        try {
            class119.field2923.method754(0, (byte) 53, class25.field754.field314, class25.field754.field326);
            class25.field754.field314 = 0;
        } catch (IOException var2) {
            class85.field2227 = true;
        }
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
    public final void method858(int arg0) {
        this.field2567 = null;
        this.field2565 = null;
        field2559++;
        this.field2555 = null;
        this.field2573 = null;
        int var2 = 123 / ((-arg0 - 75) / 48);
    }
}

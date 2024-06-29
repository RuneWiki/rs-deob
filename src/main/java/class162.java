import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class162 extends class134 {

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field2546 = 0;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "[[B")
    public static byte[][] field2550 = new byte[250][];

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public static int field2558 = 0;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "J")
    public long field2552;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "Lib;")
    public class162 field2547;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "Lib;")
    public class162 field2551;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "Lfa;")
    public static class273 field2555;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "Lfa;")
    public static class273 field2557;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "Lai;")
    public static class90 field2549;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public static final void method1073(int arg0) {
        field2545++;
        if (class187.field2897 < 0) {
            class187.field2897 = 0;
            class184.field2862 = -1;
            class120.field1849 = -1;
        }
        if (class13.field175 < class187.field2897) {
            class184.field2862 = -1;
            class120.field1849 = -1;
            class187.field2897 = class13.field175;
        }
        int var1 = 121 % ((arg0 + 50) / 61);
        if (class44.field606 < 0) {
            class44.field606 = 0;
            class120.field1849 = -1;
            class184.field2862 = -1;
        }
        if (class44.field606 > class13.field165) {
            class184.field2862 = -1;
            class44.field606 = class13.field165;
            class120.field1849 = -1;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)V")
    public static final void method1074(byte arg0, int arg1) {
        field2548++;
        if (class219.field3506 == null) {
            class219.field3506 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class219.field3506[var2][var3][var4] = arg0;
                }
            }
        }
        if (arg1 != 9605) {
            field2558 = -3;
        }
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
    public final void method1075(int arg0) {
        field2556++;
        if (this.field2547 == null) {
            return;
        }
        if (arg0 != 7596) {
            field2555 = null;
        }
        this.field2547.field2551 = this.field2551;
        this.field2551.field2547 = this.field2547;
        this.field2551 = null;
        this.field2547 = null;
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V")
    public static void method1076(int arg0) {
        field2557 = null;
        field2555 = null;
        field2549 = null;
        field2550 = null;
        if (arg0 != -6449) {
            field2558 = 32;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)Z")
    public final boolean method1077(byte arg0) {
        field2554++;
        if (this.field2547 == null) {
            return false;
        } else if (arg0 >= -68) {
            return true;
        } else {
            return true;
        }
    }
}

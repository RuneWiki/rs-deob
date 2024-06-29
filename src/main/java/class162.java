import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class class162 {

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field2633 = new String[500];

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field2626 = 0;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public int field2629;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public int field2634;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public int field2635;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "Ljj;")
    public static class134 field2631;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Ljg;")
    public static class271 field2630;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "Ljg;")
    public static class271 field2639;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "[I")
    public static int[] field2636;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static final void method1109(int arg0) {
        field2625++;
        if (class263.field4160) {
            return;
        }
        class196.field3163 = true;
        class263.field4160 = true;
        if (arg0 != 16249) {
            method1109(54);
        }
        if (class107.field1867) {
            client.field3605 = (float) ((int) client.field3605 + 47 & 0xFFFFFFF0);
        } else {
            class130.field2175 += (12.0F - class130.field2175) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)Z")
    public final boolean method1110(int arg0) {
        if (arg0 > -74) {
            this.field2629 = -2;
        }
        field2638++;
        return (this.field2634 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V")
    public static void method1111(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2630 = null;
        field2636 = null;
        field2633 = null;
        field2639 = null;
        field2631 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)V")
    public static final void method1112(int arg0, boolean arg1) {
        field2640++;
        if (arg1 == class117.field1992) {
            return;
        }
        class117.field1992 = arg1;
        class94.method663(92);
        if (arg0 != 47) {
            method1112(112, false);
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)Z")
    public final boolean method1113(int arg0) {
        field2632++;
        int var2 = 109 % ((arg0 - 38) / 54);
        return (this.field2634 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)Z")
    public final boolean method1114(int arg0) {
        field2627++;
        int var2 = 15 / ((arg0 - 61) / 56);
        return (this.field2634 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)Z")
    public final boolean method1115(byte arg0) {
        int var2 = -91 / ((14 - arg0) / 49);
        field2637++;
        return (this.field2634 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V")
    public static final void method1116(int arg0, int arg1) {
        field2628++;
        if (arg1 != 1061 || arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class230.method1528(0);
        } else if (arg0 == 2) {
            class264.method1751(73);
        } else if (arg0 == 3) {
            class125.method875(arg1 ^ 0x425);
        } else {
            throw new RuntimeException();
        }
    }
}

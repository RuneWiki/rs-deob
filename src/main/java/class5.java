import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class5 extends class236 {

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    public int field70;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public int field67;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "S")
    public static short field68 = 32767;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "[S")
    public static short[] field64 = new short[256];

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "[S")
    public static short[] field66 = new short[] { 18, 8, 40, 46, 28, 15, 59, 29 };

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "Lsg;")
    public static class30 field72 = class167.method1221((byte) 33, "Loaded world list data");

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "[Lmg;")
    public static class128[] field76 = new class128[4];

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "Lmc;")
    public static class151 field71;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lmc;Lmc;Lmc;I)V")
    public static final void method27(class151 arg0, class151 arg1, class151 arg2, int arg3) {
        if (arg3 != 46) {
            field72 = null;
        }
        class30.field596 = arg2;
        class106.field2132 = arg1;
        field73++;
        class1.field16 = arg0;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
    public static void method28(byte arg0) {
        field64 = null;
        field72 = null;
        field66 = null;
        field71 = null;
        if (arg0 == -19) {
            field76 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(II)V")
    public class5(int arg0, int arg1) {
        this.field70 = arg1;
        this.field67 = arg0;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(JI)V")
    public static final void method29(long arg0, int arg1) {
        field69++;
        if (arg0 == 0L || arg1 != 127) {
            return;
        }
        for (int var3 = 0; var3 < class117.field2307; var3++) {
            if (class103.field2083[var3] == arg0) {
                class190.field3458++;
                class117.field2307--;
                for (int var4 = var3; var4 < class117.field2307; var4++) {
                    class204.field3661[var4] = class204.field3661[var4 + 1];
                    class90.field1807[var4] = class90.field1807[var4 + 1];
                    class145.field2785[var4] = class145.field2785[var4 + 1];
                    class103.field2083[var4] = class103.field2083[var4 + 1];
                    class130.field2569[var4] = class130.field2569[var4 + 1];
                    class123.field2417[var4] = class123.field2417[var4 + 1];
                }
                class210.field3781 = class14.field308;
                class196.field3553.method1267(127, -9);
                class196.field3553.method72(-1033389592, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BI)V")
    public static final void method30(byte arg0, int arg1) {
        field74++;
        int var2 = 102 % ((61 - arg0) / 51);
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class124.method939(-126);
        } else if (arg1 == 2) {
            class154.method1157(22969);
        } else {
            throw new RuntimeException();
        }
    }
}

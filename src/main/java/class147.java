import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class147 {

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "[I")
    private int[] field2503;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "Leg;")
    private static class37 field2491 = class174.method1167("Loaded input handler", -112);

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "Leg;")
    private static class37 field2494 = class174.method1167(" more options", -77);

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "Leg;")
    public static class37 field2497 = null;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "[Lhd;")
    public static class288[] field2492 = new class288[28];

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Leg;")
    private static class37 field2496 = class174.method1167("You can(Wt add yourself to your own friend list)3", 74);

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "Leg;")
    public static class37 field2499 = field2491;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field2495 = 0;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Leg;")
    public static class37 field2498 = field2494;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "Leg;")
    public static class37 field2500 = field2496;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "Leg;")
    public static class37 field2504 = class174.method1167("Moteur son pr-Bpar-B", 77);

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V")
    public static void method1015(boolean arg0) {
        field2497 = null;
        field2504 = null;
        field2498 = null;
        field2491 = null;
        if (arg0) {
            field2497 = null;
        }
        field2494 = null;
        field2499 = null;
        field2492 = null;
        field2500 = null;
        field2496 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILva;)V")
    public static final void method1016(int arg0, class187 arg1) {
        field2502++;
        int var2 = arg1.method1246(true);
        class78.field1209 = new class64[var2];
        for (int var3 = arg0; var3 < var2; var3++) {
            class78.field1209[var3] = new class64();
            class78.field1209[var3].field1044 = arg1.method1246(true);
            class78.field1209[var3].field1047 = arg1.method1254(false);
        }
        class230.field3936 = arg1.method1246(true);
        class44.field682 = arg1.method1246(true);
        class218.field3752 = arg1.method1246(true);
        class29.field417 = new class17[class44.field682 - (class230.field3936 - 1)];
        for (int var4 = 0; var4 < class218.field3752; var4++) {
            int var5 = arg1.method1246(true);
            class17 var6 = class29.field417[var5] = new class17();
            var6.field4610 = arg1.method1268(255);
            var6.field4609 = arg1.method1290((byte) 90);
            var6.field241 = var5 + class230.field3936;
            var6.field240 = arg1.method1254(false);
            var6.field239 = arg1.method1254(false);
        }
        class169.field2826 = arg1.method1290((byte) 90);
        class80.field1258 = true;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(Z)V")
    public static final void method1017(boolean arg0) {
        field2501++;
        if (arg0) {
            class166.field2750 = new class140(32);
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "([I)V")
    public class147(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field2503 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2503[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2503[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field2503[var5 + var5] = arg0[var4];
            this.field2503[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IB)I")
    public final int method1018(int arg0, byte arg1) {
        field2493++;
        int var3 = (this.field2503.length >> 1) - 1;
        int var4 = var3 & arg0;
        if (arg1 < 72) {
            field2504 = null;
        }
        while (true) {
            int var5 = this.field2503[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2503[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class class6 extends class426 {

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    public int field74;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
    public static int field67 = 0;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
    public static int field69 = -1;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    public static int field72 = 0;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "[Z")
    public static boolean[] field71 = new boolean[100];

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "[I")
    public static int[] field73;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "[Lhq;")
    public static class370[] field66;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIII)V")
    public static final void method49(int arg0, int arg1, int arg2, int arg3) {
        class13 var4 = class277.field4216[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class337 var5 = var4.field164;
        class337 var6 = var4.field149;
        if (var5 != null) {
            var5.field5010 = var5.field5010 * arg3 / 16;
            var5.field5014 = var5.field5014 * arg3 / 16;
        }
        if (var6 != null) {
            var6.field5010 = var6.field5010 * arg3 / 16;
            var6.field5014 = var6.field5014 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "(I)V")
    public static void method50(int arg0) {
        field66 = null;
        field73 = null;
        if (arg0 == 0) {
            field71 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLiq;Ldr;)V")
    public static final void method51(byte arg0, class134 arg1, class261 arg2) {
        field68++;
        if (class173.field2653) {
            return;
        }
        arg2.method437(0);
        class298.field4515 = arg2.method378(class4.method27(arg1, class169.field2424), true);
        class298.field4515.method1408((class221.field3368 - class298.field4515.method1226()) / 2, (class161.field2232 - class298.field4515.method1219()) / 2);
        class409.field6100 = arg2.method378(class4.method27(arg1, class338.field5047), true);
        class409.field6100.method1408((class221.field3368 - class409.field6100.method1226()) / 2, 18);
        class173.field2653 = true;
        if (arg0 >= -79) {
            field69 = -61;
        }
    }

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "(I)V")
    public static final void method52(int arg0) {
        if (arg0 == 16) {
            for (class336 var1 = (class336) class261.field3979.method2127(-1489721243); var1 != null; var1 = (class336) class261.field3979.method2126(arg0 - 102)) {
                var1.method2055();
            }
            field70++;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)Z")
    public abstract boolean method53(boolean arg0);

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method54(int arg0);

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(B)V")
    public static final void method55(byte arg0) {
        field65++;
        class429.field6307 = null;
        class267.method1660(-1, class161.field2232, 1, 0, field69, 0, 0, class221.field3368, 0);
        if (arg0 != -62) {
            field66 = null;
        }
        if (class429.field6307 != null) {
            class191.method1154(class402.field6011.field2490, class228.field3491, class221.field3368, -1412584499, class161.field2232, 0, class429.field6307, -1, class367.field5388, 0);
            class429.field6307 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(I)V")
    public class6(int arg0) {
        this.field74 = arg0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class178 extends class15 {

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "[I")
    public static int[] field2633 = new int[500];

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "Z")
    public static boolean field2630 = true;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public static int field2641 = 0;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "Ljava/lang/String;")
    public static String field2640 = "";

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "F")
    public static float field2632;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "Ljava/lang/String;")
    public String field2635;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "Ljava/lang/String;")
    public String field2639;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "[S")
    public static short[] field2634;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V", line = 16)
    public static void method1229(int arg0) {
        field2640 = null;
        field2633 = null;
        field2634 = null;
        int var1 = -109 % ((-arg0 - 47) / 52);
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)Ltc;", line = 36)
    public final class146 method1230(int arg0) {
        if (arg0 != -1) {
            method1231((String) null, (byte) -127);
        }
        field2631++;
        return class226.field3437[this.field170];
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 47)
    public static final void method1231(String arg0, byte arg1) {
        if (arg1 != 15) {
            method1233((class195) null, true);
        }
        field2638++;
        int var2 = class5.method13(arg0, 128);
        if (var2 != -1) {
            class243.method1651(true, class155.field2325.field2004[var2], class155.field2325.field2006[var2]);
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)I", line = 64)
    public static final int method1232(byte arg0) {
        field2642++;
        if (arg0 > -7) {
            method1229(-128);
        }
        return class252.field3757 == 0 ? 0 : class168.field2521[class252.field3757].method2();
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lqg;Z)V", line = 82)
    public static final void method1233(class195 arg0, boolean arg1) {
        field2637++;
        class252 var2 = (class252) class141.field2129.method1320(class242.method1638(arg0.field2934, -14393), 13002);
        if (var2 == null) {
            class5.method10(0, (byte) -128, arg0.field1541[0], arg0, arg0.field1516[0], class180.field2697, (class22) null, (class69) null);
        } else {
            var2.method1701((byte) -20);
        }
        if (!arg1) {
            field2634 = (short[]) null;
        }
    }
}

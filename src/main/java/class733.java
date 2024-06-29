import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class733 {

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "Ljw;")
    public static class581 field10164 = new class581(104, 5);

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "[I")
    public static int[] field10171 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!waa", name = "i", descriptor = "Z")
    public static boolean field10172 = false;

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "I")
    public static int field10170 = 1;

    @OriginalMember(owner = "client!waa", name = "j", descriptor = "I")
    public static int field10173 = -1;

    @OriginalMember(owner = "client!waa", name = "k", descriptor = "I")
    public static int field10174 = 0;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "F")
    public static float field10167;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
    public static int field10165;

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "I")
    public static int field10166;

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "I")
    public static int field10168;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "I")
    public static int field10169;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public static final void method4068(Canvas arg0, byte arg1) {
        field10168++;
        Dimension var2 = arg0.getSize();
        if (arg1 >= -13) {
            method4070(-114, -32, -117);
        }
        class403.method2515(var2.height, (byte) 122, var2.width);
        if (class669.field9399 == 1) {
            class86.field1200.method448(arg0, class688.field9675, class756.field10491);
        } else {
            class86.field1200.method448(arg0, class564.field7561, class670.field9427);
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(III)Z")
    public static final boolean method4069(int arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            method4071(false);
        }
        field10166++;
        return class682.method3785(arg0, (byte) -11, arg2) & class39.method272(0, arg0, arg2);
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(III)Z")
    public static final boolean method4070(int arg0, int arg1, int arg2) {
        field10165++;
        if (arg1 == 1222) {
            return class554.method3131(arg0, arg2, false) || class92.method742(arg0, (byte) 0, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)V")
    public static void method4071(boolean arg0) {
        field10164 = null;
        if (arg0) {
            field10167 = 0.11641879F;
        }
        field10171 = null;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)V")
    public static final void method4072(byte arg0) {
        if (arg0 == 9) {
            for (class150 var1 = (class150) class507.field7007.method3960(arg0 ^ 0x9); var1 != null; var1 = (class150) class507.field7007.method3955((byte) -92)) {
                class379.method2423(101, var1.field2086);
            }
            field10169++;
        }
    }
}

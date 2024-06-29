import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class477 {

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "Ljr;")
    public static class112 field6656 = new class112(260);

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "[[B")
    public static byte[][] field6659 = new byte[1000][];

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "[Ljb;")
    public static class494[] field6658;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V")
    public static void method2799(byte arg0) {
        if (arg0 != -99) {
            method2801(false, 24, -128, 22, -7);
        }
        field6656 = null;
        field6659 = null;
        field6658 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V")
    public static final void method2800(boolean arg0) {
        if (arg0) {
            field6656 = null;
        }
        class600.field8229.method999(0);
        field6657++;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZIIII)V")
    public static final void method2801(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field6655++;
        if (class693.field9368.field4468.method1099(-32350) == 0) {
            class587.method3353(-98, false);
        } else {
            class398.field5839 = class693.field9368.field4468.method1099(-32350);
            class171.method1284(true, (byte) 103, 0);
        }
        class526.field7284 = arg0;
        class501.field6993 = arg1;
        class31.field802 = arg2;
        class489.method2882(arg3);
        if (arg4 > -41) {
            method2800(true);
        }
    }
}

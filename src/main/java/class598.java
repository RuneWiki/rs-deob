import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public abstract class class598 {

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "Lqp;")
    public static class586 field8829 = new class586(103, 11);

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "Lqu;")
    public static class364 field8830 = new class364(7, 7);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public static int field8826;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)I")
    public abstract int method1559(int arg0, int arg1);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IBLjava/lang/String;)I")
    public static final int method3493(int arg0, byte arg1, String arg2) {
        int var3 = -128 % ((arg1 - 45) / 57);
        field8828++;
        return class640.method3705(arg2, -91, true, arg0);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)[B")
    public abstract byte[] method1557(int arg0, int arg1);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIBII)V")
    public static final void method3494(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 > -87) {
            return;
        }
        for (int var5 = 0; var5 < class395.field5741; var5++) {
            Rectangle var6 = class280.field4162[var5];
            if (arg1 < var6.x + var6.width && (arg1 + arg3) > var6.x && arg4 < var6.y + var6.height && var6.y < (arg0 + arg4)) {
                class587.field8718[var5] = true;
            }
        }
        field8826++;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Lvm;")
    public abstract class386 method1549(int arg0);

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(II)V")
    public abstract void method1551(int arg0, int arg1);

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
    public static void method3495(int arg0) {
        field8829 = null;
        field8830 = null;
        if (arg0 <= 64) {
            method3496(-18);
        }
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
    public static final void method3496(int arg0) {
        field8827++;
        if (arg0 > 107) {
            class171.field2317 = true;
        }
    }
}

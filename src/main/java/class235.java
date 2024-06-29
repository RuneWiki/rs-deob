import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public abstract class class235 extends class645 {

    @OriginalMember(owner = "client!rha", name = "i", descriptor = "I")
    public static int field2787 = 0;

    @OriginalMember(owner = "client!rha", name = "k", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!rha", name = "j", descriptor = "Lbt;")
    public static class48 field2788;

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "(I)Lhfa;")
    public abstract class331 method483(int arg0);

    @OriginalMember(owner = "client!rha", name = "c", descriptor = "(I)V")
    public static void method1441(int arg0) {
        if (arg0 == 29095) {
            field2788 = null;
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(ILkq;)Lkq;")
    public static final class620 method1442(int arg0, class620 arg1) {
        field2789++;
        if (arg1.field8400 != -1) {
            return class479.method2848(arg1.field8400, (byte) 107);
        } else if (arg0 == 14939) {
            int var2 = arg1.field8515 >>> 16;
            class120 var3 = new class120(class728.field10205);
            for (class52 var4 = (class52) var3.method938(arg0 - 14923); var4 != null; var4 = (class52) var3.method937(arg0 - 14940)) {
                if (var4.field713 == var2) {
                    return class479.method2848((int) var4.field4809, (byte) 110);
                }
            }
            return null;
        } else {
            return null;
        }
    }
}

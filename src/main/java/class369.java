import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public abstract class class369 {

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "Lqo;")
    public class22 field5255;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "Ldl;")
    public static class63 field5254;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V", line = 8)
    public static void method2345(int arg0) {
        if (arg0 == 0) {
            field5254 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)Z", line = 21)
    public static final boolean method2346(int arg0) {
        field5252++;
        class688 var1 = (class688) class113.field1947.method1269(4);
        if (var1 == null) {
            return false;
        }
        int var2 = 118 % ((-arg0 - 40) / 50);
        for (int var3 = 0; var3 < var1.field9285; var3++) {
            if (var1.field9294[var3] != null && var1.field9294[var3].field8462 == 0) {
                return false;
            }
            if (var1.field9286[var3] != null && var1.field9286[var3].field8462 == 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lqo;)V", line = 65)
    public class369(class22 arg0) {
        this.field5255 = arg0;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public abstract void method371(int arg0);

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZZ)V")
    public abstract void method369(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIB)V")
    public abstract void method372(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)Z")
    public abstract boolean method368(int arg0);

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZB)V")
    public abstract void method366(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lud;BI)V")
    public abstract void method373(class36 arg0, byte arg1, int arg2);
}

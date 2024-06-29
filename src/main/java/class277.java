import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public abstract class class277 implements class415 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lafa;")
    public class550 field3746;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field3749 = 0;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Ljj;")
    public static class398 field3747 = new class398(63, 3);

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Loa;")
    public static class689 field3750;

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lafa;)V", line = 3)
    public class277(class550 arg0) {
        this.field3746 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 14)
    public static void method1683(int arg0) {
        int var1 = 2 / ((arg0 + 50) / 34);
        field3747 = null;
        field3750 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZB)V", line = 25)
    public final void method277(boolean arg0, byte arg1) {
        field3748++;
        int var3 = this.field3746.field7522.method2304(class432.field5995, this.field3746.field7517, 65535) + this.field3746.field7518;
        int var4 = this.field3746.field7524.method536(class384.field5582, -26620, this.field3746.field7519) + this.field3746.field7525;
        this.method190(127, var3, var4, arg0);
        if (arg1 > -13) {
            this.field3746 = null;
        }
        this.method192(-86, arg0, var3, var4);
        class622.field8452.method1802(this.field3746.field7517 / 2 + var3, -1, class75.field953, this.field3746.field7519 / 2 + (var4 + 4), this.field3746.field7520, -28812);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZII)V")
    public abstract void method192(int arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIZ)V")
    public abstract void method190(int arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)Z")
    public abstract boolean method193(int arg0);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public abstract void method191(byte arg0);
}

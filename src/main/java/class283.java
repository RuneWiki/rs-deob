import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class class283 {

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Lac;")
    public class541 field3749;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field3747 = 0;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lee;")
    public static class676 field3751;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method1698(int arg0) {
        if (arg0 != -24883) {
            method1698(14);
        }
        field3751 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Z")
    public abstract boolean method138(int arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZ)V")
    public abstract void method141(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lac;)V")
    public class283(class541 arg0) {
        this.field3749 = arg0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
    public abstract void method137(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lcu;ZI)V")
    public abstract void method140(class221 arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V")
    public abstract void method142(boolean arg0, int arg1);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
    public static final int method1699(int arg0, int arg1) {
        int var2 = 109 % ((-arg1 - 53) / 60);
        field3750++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public abstract void method144(byte arg0);
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class229 extends class200 {

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Z")
    public boolean field3955 = true;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public int field3956 = 12800;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public int field3962 = 12800;

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
    public int field3964 = -1;

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "I")
    public int field3965 = 0;

    @OriginalMember(owner = "client!rg", name = "W", descriptor = "I")
    public int field3967 = 0;

    @OriginalMember(owner = "client!rg", name = "X", descriptor = "Loa;")
    public class99 field3968;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
    public int field3960;

    @OriginalMember(owner = "client!rg", name = "V", descriptor = "Loa;")
    public class99 field3966;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public int field3957;

    @OriginalMember(owner = "client!rg", name = "Y", descriptor = "Lng;")
    public class76 field3969;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field3953 = 0;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
    public static int field3963 = 0;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "Z")
    public static boolean field3961 = false;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!rg", name = "Z", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "Ltg;")
    public static class182 field3954;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V")
    public final void method1503(int arg0) {
        this.field3962 = 12800;
        this.field3956 = 12800;
        field3959++;
        this.field3965 = 0;
        int var2 = 119 % ((45 - arg0) / 37);
        this.field3967 = 0;
        for (class123 var3 = (class123) this.field3969.method529(10); var3 != null; var3 = (class123) this.field3969.method533(-92)) {
            if (var3.field2150 > this.field3965) {
                this.field3965 = var3.field2150;
            }
            if (this.field3956 > var3.field2162) {
                this.field3956 = var3.field2162;
            }
            if (var3.field2160 < this.field3962) {
                this.field3962 = var3.field2160;
            }
            if (this.field3967 < var3.field2148) {
                this.field3967 = var3.field2148;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Lra;")
    public static final class234 method1504(int arg0, int arg1) {
        field3970++;
        class234 var2 = (class234) class118.field2095.method512((byte) 95, (long) arg1);
        if (arg0 != -1) {
            field3961 = true;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class248.field4278.method1242(class1.method2(true, arg1), class288.method1936(0, arg1), 6801);
        class234 var4 = new class234();
        if (var3 != null) {
            var4.method1529(new class261(var3), -1);
        }
        class118.field2095.method511(121, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V")
    public static void method1505(int arg0) {
        field3954 = null;
        int var1 = -13 / ((8 - arg0) / 35);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIZ)Z")
    public final boolean method1506(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field3963 = -49;
        }
        field3958++;
        if (arg1 < this.field3956 || arg1 > this.field3967 || arg0 < this.field3962 || arg0 > this.field3965) {
            return false;
        }
        for (class123 var4 = (class123) this.field3969.method529(10); var4 != null; var4 = (class123) this.field3969.method533(84)) {
            if (var4.method812(true, arg0, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Loa;Loa;IIIZ)V")
    public class229(class99 arg0, class99 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3968 = arg0;
        this.field3960 = arg2;
        this.field3966 = arg1;
        this.field3957 = arg3;
        this.field3964 = arg4;
        this.field3955 = arg5;
        this.field3969 = new class76();
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class271 {

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "Ljda;")
    private class91 field3807 = new class91();

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    public static int field3814 = 0;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "F")
    public static float field3810;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "Lkp;")
    public static class428 field3808;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "Ljda;")
    private class91 field3817;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
    public static void method1727(int arg0) {
        field3808 = null;
        if (arg0 != -25669) {
            field3814 = 88;
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)Ljda;")
    public final class91 method1728(int arg0) {
        field3806++;
        class91 var2 = this.field3807.field1311;
        if (this.field3807 == var2) {
            this.field3817 = null;
            return null;
        }
        this.field3817 = var2.field1311;
        if (arg0 >= -102) {
            this.method1733(-57);
        }
        return var2;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)Ljda;")
    public final class91 method1729(byte arg0) {
        field3816++;
        if (arg0 != 100) {
            this.field3817 = null;
        }
        class91 var2 = this.field3817;
        if (this.field3807 == var2) {
            this.field3817 = null;
            return null;
        } else {
            this.field3817 = var2.field1313;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)Ljda;")
    public final class91 method1730(byte arg0) {
        field3812++;
        class91 var2 = this.field3807.field1313;
        if (arg0 <= 31) {
            this.field3807 = null;
        }
        if (this.field3807 == var2) {
            this.field3817 = null;
            return null;
        } else {
            this.field3817 = var2.field1313;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)V")
    public final void method1731(int arg0) {
        int var2 = 119 / ((-arg0 - 66) / 58);
        while (true) {
            class91 var3 = this.field3807.field1313;
            if (this.field3807 == var3) {
                field3809++;
                this.field3817 = null;
                return;
            }
            var3.method781(5555);
        }
    }

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "(I)I")
    public final int method1732(int arg0) {
        field3805++;
        int var2 = 60 / ((arg0 + 57) / 59);
        int var3 = 0;
        class91 var4 = this.field3807.field1313;
        while (this.field3807 != var4) {
            var4 = var4.field1313;
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "(I)Z")
    public final boolean method1733(int arg0) {
        field3813++;
        if (arg0 != -11523) {
            this.method1731(-109);
        }
        return this.field3807.field1313 == this.field3807;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljda;I)V")
    public final void method1734(class91 arg0, int arg1) {
        if (arg0.field1311 != null) {
            arg0.method781(5555);
        }
        field3815++;
        arg0.field1311 = this.field3807.field1311;
        arg0.field1313 = this.field3807;
        if (arg1 == 0) {
            arg0.field1311.field1313 = arg0;
            arg0.field1313.field1311 = arg0;
        }
    }

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "(I)Ljda;")
    public final class91 method1735(int arg0) {
        field3811++;
        class91 var2 = this.field3807.field1313;
        if (this.field3807 == var2) {
            return null;
        } else {
            var2.method781(5555);
            return arg0 == -17801 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
    public class271() {
        this.field3807.field1311 = this.field3807;
        this.field3807.field1313 = this.field3807;
    }
}

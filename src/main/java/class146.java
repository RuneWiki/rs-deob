import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class146 {

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "Lsa;")
    public class214 field1864 = new class214();

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "[I")
    public static int[] field1861 = new int[200];

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "Lke;")
    public static class622 field1865 = new class622(18, -2);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "Lsa;")
    private class214 field1868;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "[I")
    public static int[] field1866;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILsa;)V")
    public final void method1002(int arg0, class214 arg1) {
        if (arg1.field3088 != null) {
            arg1.method1495((byte) -104);
        }
        field1857++;
        arg1.field3088 = this.field1864.field3088;
        arg1.field3084 = this.field1864;
        arg1.field3088.field3084 = arg1;
        arg1.field3084.field3088 = arg1;
        if (arg0 != -2) {
            field1865 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)Lsa;")
    public final class214 method1003(boolean arg0) {
        field1858++;
        class214 var2 = this.field1868;
        if (this.field1864 == var2) {
            this.field1868 = null;
            return null;
        } else {
            this.field1868 = var2.field3084;
            return arg0 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)Lcm;")
    public static final class758 method1004(byte arg0) {
        field1863++;
        class758 var1 = (class758) class314.field4654.method2029(13);
        if (arg0 > -9) {
            method1004((byte) 46);
        }
        if (var1 == null) {
            return new class758();
        } else {
            class488.field6907--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(Z)V")
    public final void method1005(boolean arg0) {
        while (true) {
            class214 var2 = this.field1864.field3084;
            if (this.field1864 == var2) {
                if (!arg0) {
                    method1009(-67, -9, (byte) 101, 112, 57, null, -25, -112);
                }
                field1859++;
                this.field1868 = null;
                return;
            }
            var2.method1495((byte) -110);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)Lsa;")
    public final class214 method1006(int arg0) {
        field1862++;
        if (arg0 != 8573) {
            method1009(75, -17, (byte) -77, 88, -9, null, -57, 86);
        }
        class214 var2 = this.field1864.field3084;
        if (this.field1864 == var2) {
            this.field1868 = null;
            return null;
        } else {
            this.field1868 = var2.field3084;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)I")
    public final int method1007(int arg0) {
        if (arg0 >= -61) {
            return 102;
        }
        field1856++;
        int var2 = 0;
        class214 var3 = this.field1864.field3084;
        while (this.field1864 != var3) {
            var3 = var3.field3084;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)V")
    public static void method1008(int arg0) {
        if (arg0 == 200) {
            field1861 = null;
            field1866 = null;
            field1865 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIBIILha;II)V")
    public static final void method1009(int arg0, int arg1, byte arg2, int arg3, int arg4, class66 arg5, int arg6, int arg7) {
        class438.field6281 = arg5;
        int var8 = -124 % ((-arg2 - 58) / 40);
        field1860++;
        class754.field10433 = class438.field6281.method462();
        class599.field8453 = class438.field6281.method462();
        class638.field8978 = class438.field6281.method462();
        class463.field6612 = 1;
        class410.field5795 = arg7;
        class596.field8414 = 0;
        class27.field393 = null;
        class637.field8968 = arg4;
        class37.field556 = 0;
        class457.field6550 = arg0;
        class692.field9768 = arg3;
        class578.method3357(1, arg6, arg1);
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
    public class146() {
        this.field1864.field3088 = this.field1864;
        this.field1864.field3084 = this.field1864;
    }
}

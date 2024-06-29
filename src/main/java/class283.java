import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class283 extends class223 {

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
    private final int field4869;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
    private final int field4867;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "I")
    private final int field4876;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    private final int field4870;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "Ltl;")
    public static class59 field4873 = class85.method639("welle:", 9588);

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "Ltl;")
    public static class59 field4877 = class85.method639("blinken1:", 9588);

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "Lme;")
    public static class295 field4865;

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "[Lgg;")
    public static class47[] field4878;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(III)V", line = 10)
    public final void method1149(int arg0, int arg1, int arg2) {
        int var4 = 75 / ((75 - arg1) / 43);
        field4874++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V", line = 21)
    public final void method1148(int arg0, int arg1, int arg2) {
        field4875++;
        if (arg2 >= -54) {
            field4873 = (class59) null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V", line = 31)
    public static void method1983(int arg0) {
        field4878 = null;
        field4865 = null;
        field4877 = null;
        field4873 = null;
        if (arg0 != 0) {
            method1983(8);
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(III)V", line = 55)
    public final void method1144(int arg0, int arg1, int arg2) {
        field4872++;
        int var4 = this.field4869 * arg1 >> 12;
        int var5 = this.field4867 * arg1 >> 12;
        int var6 = this.field4870 * arg0 >> 12;
        int var7 = this.field4876 * arg0 >> 12;
        if (arg2 != -19486) {
            field4866 = -89;
        }
        class94.method687(1112685644, var6, this.field3608, var5, var4, var7);
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIIII)V", line = 73)
    public class283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4869 = arg0;
        this.field4867 = arg2;
        this.field4876 = arg3;
        this.field4870 = arg1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILqd;Lqd;IZZ)I", line = 87)
    public static final int method1984(int arg0, int arg1, class231 arg2, class231 arg3, int arg4, boolean arg5, boolean arg6) {
        int var7 = class233.method1626(arg5, arg2, arg3, (byte) 11, arg0);
        field4871++;
        if (var7 != 0) {
            return arg5 ? -var7 : var7;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var8 = class233.method1626(arg6, arg2, arg3, (byte) 53, arg4);
            if (arg1 < 11) {
                field4873 = (class59) null;
            }
            return arg6 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII)V", line = 122)
    public static final void method1985(int arg0, int arg1, int arg2, int arg3) {
        class263 var4 = class297.method2067(arg0, 113, arg1);
        if (var4 != null && var4.field4476 != null) {
            class128 var5 = new class128();
            var5.field2103 = var4.field4476;
            var5.field2110 = var4;
            class299.method2093((byte) 87, var5);
        }
        if (arg2 >= -2) {
            return;
        }
        class27.field362 = arg0;
        class59.field908 = arg3;
        class39.field588 = arg1;
        field4868++;
        class219.field3556 = true;
        class140.method1019(var4, (byte) 102);
    }
}

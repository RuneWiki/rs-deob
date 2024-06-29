import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 {

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field2 = 0;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field12 = 0;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field5 = 0;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "B")
    public static byte field14;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public int field4;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    private int field9;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Ldl;")
    public static class123 field1;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "[I")
    public static int[] field13;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Llj;IZI)V")
    private final void method1(class25 arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            method3(111, 116, 29, -38, 67, -118);
        }
        field3++;
        if (arg3 == 1) {
            this.field9 = arg0.method190(-3);
        } else if (arg3 == 2) {
            this.field7 = arg0.method201(255);
            this.field4 = arg0.method201(255);
            return;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILlj;I)V")
    public final void method2(int arg0, class25 arg1, int arg2) {
        if (arg2 >= -37) {
            return;
        }
        while (true) {
            int var4 = arg1.method201(255);
            if (var4 == 0) {
                field6++;
                return;
            }
            this.method1(arg1, arg0, false, var4);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIII)V")
    public static final void method3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class229.field3715[0].method106(arg4, arg2);
        class229.field3715[1].method106(arg4, arg2 + arg0 - 16);
        field8++;
        int var6 = (arg0 - 32) * arg0 / arg3;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg0 - var6 - 32) * arg1 / (arg3 - arg0);
        class127.method876(arg4, arg2 + 16, 16, arg0 - 32, class168.field2644);
        class127.method876(arg4, arg2 + var7 + 16, 16, var6, class53.field735);
        class127.method874(arg4, arg2 + var7 + 16, var6, class21.field255);
        class127.method874(arg4 + 1, arg2 + var7 - -16, var6, class21.field255);
        class127.method862(arg4, arg2 + var7 + 16, 16, class21.field255);
        int var8 = -116 % ((-arg5 - 22) / 54);
        class127.method862(arg4, arg2 + var7 + 17, 16, class21.field255);
        class127.method874(arg4 + 15, 16 - -var7 + arg2, var6, class290.field4579);
        class127.method874(arg4 + 14, arg2 - -17 + var7, var6 - 1, class290.field4579);
        class127.method862(arg4, arg2 + var6 + var7 + 15, 16, class290.field4579);
        class127.method862(arg4 + 1, arg2 - -var7 - -var6 + 14, 15, class290.field4579);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method4(int arg0) {
        if (arg0 == 30651) {
            field1 = null;
            field13 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)Lfg;")
    public final class12 method5(int arg0) {
        class12 var2 = (class12) class28.field384.method1428((long) this.field9, (byte) -105);
        field10++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 < 63) {
            field2 = -72;
        }
        class12 var3 = class85.method592(true, class236.field3775, this.field9, 0);
        if (var3 != null) {
            class28.field384.method1424((long) this.field9, var3, -2003648287);
        }
        return var3;
    }
}

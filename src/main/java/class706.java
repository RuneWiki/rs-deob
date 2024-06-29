import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class706 extends class363 {

    @OriginalMember(owner = "client!sw", name = "y", descriptor = "I")
    public int field9875 = 0;

    @OriginalMember(owner = "client!sw", name = "s", descriptor = "Luc;")
    public static class27 field9869 = new class27(15, -1);

    @OriginalMember(owner = "client!sw", name = "t", descriptor = "I")
    public static int field9870;

    @OriginalMember(owner = "client!sw", name = "u", descriptor = "I")
    public static int field9871;

    @OriginalMember(owner = "client!sw", name = "w", descriptor = "I")
    public static int field9873;

    @OriginalMember(owner = "client!sw", name = "x", descriptor = "I")
    public static int field9874;

    @OriginalMember(owner = "client!sw", name = "z", descriptor = "I")
    public static int field9876;

    @OriginalMember(owner = "client!sw", name = "v", descriptor = "Ljava/lang/Object;")
    public static Object field9872;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IILji;)V")
    private final void method3894(int arg0, int arg1, class572 arg2) {
        if (arg1 == 2) {
            this.field9875 = arg2.method3031(arg0 - 4);
        }
        field9871++;
        if (arg0 != 3) {
            field9872 = null;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(III)Z")
    public static final boolean method3895(int arg0, int arg1, int arg2) {
        if (arg2 != 14502) {
            method3895(54, -46, 94);
        }
        field9874++;
        return class242.method1446((byte) -72, arg1, arg0) || class700.method3870(arg0, 65280, arg1);
    }

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "(I)V")
    public static final void method3896(int arg0) {
        if (arg0 != 1) {
            field9869 = null;
        }
        field9873++;
        class243 var1 = class546.method2926(0, 15, true);
        var1.method1455(true);
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(BLji;)V")
    public final void method3897(byte arg0, class572 arg1) {
        field9876++;
        while (true) {
            int var3 = arg1.method3097((byte) 12);
            if (var3 == 0) {
                int var4 = 48 % ((arg0 + 41) / 60);
                return;
            }
            this.method3894(3, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIIIII)V")
    public static final void method3898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var10 = arg4 + 1;
        class390.method2223(arg0, arg5, class30.field364[arg4], (byte) -106, arg3);
        field9870++;
        int var9 = arg2 - 1;
        class390.method2223(arg0, arg5, class30.field364[arg2], (byte) -92, arg3);
        for (int var6 = var10; var6 <= var9; var6++) {
            int[] var8 = class30.field364[var6];
            var8[arg0] = var8[arg3] = arg5;
        }
        int var7 = -56 % ((arg1 - 48) / 54);
    }

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "(II)V")
    public static final void method3899(int arg0, int arg1) {
        class565 var2 = class407.field5237[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class565 var4 = class407.field5237[var3][arg0][arg1] = class407.field5237[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field7094--;
                for (class436 var5 = var4.field7074; var5 != null; var5 = var5.field5485) {
                    class597 var6 = var5.field5486;
                    if (var6.field8017 == arg0 && var6.field8014 == arg1) {
                        var6.field8010--;
                    }
                }
            }
        }
        if (class407.field5237[0][arg0][arg1] == null) {
            class407.field5237[0][arg0][arg1] = new class565(0, arg0, arg1);
            class407.field5237[0][arg0][arg1].field7083 = 1;
        }
        class407.field5237[0][arg0][arg1].field7075 = var2;
        class407.field5237[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "(I)V")
    public static void method3900(int arg0) {
        field9872 = null;
        field9869 = null;
        if (arg0 != -5546) {
            method3895(116, 92, -55);
        }
    }
}

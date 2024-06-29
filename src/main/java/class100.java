import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class100 {

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1501 = 0;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Z")
    public static boolean field1498 = false;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIILdk;Ldk;)V")
    public static final void method764(int arg0, int arg1, int arg2, class477 arg3, class477 arg4) {
        class24 var5 = class457.method2610(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field411 = arg3;
            var5.field406 = arg4;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZIZIIII)V")
    public static final void method765(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 > arg6) {
            int var7 = (arg1 + arg6) / 2;
            int var8 = arg6;
            class233 var9 = class471.field6307[var7];
            class471.field6307[var7] = class471.field6307[arg1];
            class471.field6307[arg1] = var9;
            for (int var10 = arg6; var10 < arg1; var10++) {
                if (class701.method3881(class471.field6307[var10], arg4, arg5 ^ 0x2, arg0, arg3, var9, arg2) <= 0) {
                    class233 var11 = class471.field6307[var10];
                    class471.field6307[var10] = class471.field6307[var8];
                    class471.field6307[var8++] = var11;
                }
            }
            class471.field6307[arg1] = class471.field6307[var8];
            class471.field6307[var8] = var9;
            method765(arg0, var8 - 1, arg2, arg3, arg4, 2, arg6);
            method765(arg0, arg1, arg2, arg3, arg4, 2, var8 + 1);
        }
        if (arg5 != 2) {
            method768(true, null, null);
        }
        field1502++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static final void method766(int arg0) {
        field1499++;
        class126.field2096 = -1;
        class173.field2675 = 1;
        if (arg0 != 35) {
            return;
        }
        long var1 = 0L;
        if (class592.field7831 == null) {
            class218.method1384((byte) -128, 35);
        } else {
            class335 var3 = new class335(class346.method2076(-50, class174.method1176(class592.field7831, -1)));
            long var4 = var3.method2016((byte) -60);
            class605.field8023 = var3.method2016((byte) -60);
            class512.method2848(class170.method1158((byte) -8, var4), (byte) -115, true, "");
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZB)V")
    public static final void method767(boolean arg0, byte arg1) {
        field1500++;
        class618.field8201++;
        if (arg1 != 86) {
            method764(-99, 2, -123, null, null);
        }
        class402 var2 = class390.method2252(class338.field4681, arg1 ^ 0xFFFFFFC8, class262.field3644);
        class36.method278(0, var2);
        for (class140 var3 = (class140) class264.field3667.method2915(87); var3 != null; var3 = (class140) class264.field3667.method2912((byte) 118)) {
            if (!var3.method2798(-1)) {
                var3 = (class140) class264.field3667.method2915(101);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field2253 == 0) {
                class345.method2074(arg1 - 85, var3, arg0, true);
            }
        }
        if (class436.field5966 != null) {
            class463.method2624(false, class436.field5966);
            class436.field5966 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLe;Ljava/awt/Canvas;)Loa;")
    public static final class651 method768(boolean arg0, class498 arg1, Canvas arg2) {
        field1497++;
        if (arg0) {
            field1501 = -53;
        }
        return new class57(arg2, arg1);
    }
}

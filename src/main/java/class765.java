import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public abstract class class765 {

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "Lin;")
    public static class380 field10579 = new class380(128, -1);

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "Z")
    public static boolean field10581 = false;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field10580;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field10582;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static void method4228(byte arg0) {
        field10579 = null;
        if (arg0 != 99) {
            method4230(-51, 8L);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public abstract void method1551(int arg0);

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ldm;)V")
    public abstract void method1552(class765 arg0);

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
    public abstract void method1553(int arg0);

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "()V")
    public abstract void method1569();

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V")
    public abstract void method1560(int arg0);

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V")
    public abstract void method1561(int arg0);

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V")
    public abstract void method1566(int arg0);

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III[I)V")
    public abstract void method1549(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZIIIIILha;)Lka;")
    public static final class233 method4229(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class475 arg6) {
        field10580++;
        long var7 = (long) arg2;
        if (arg0) {
            field10579 = null;
        }
        class233 var9 = (class233) class580.field8354.method2882(var7, (byte) -113);
        short var10 = 2055;
        if (var9 == null) {
            class678 var11 = class157.method1211(-5, class762.field10561, 0, arg2);
            if (var11 == null) {
                return null;
            }
            if (var11.field9567 < 13) {
                var11.method3805(1, 2);
            }
            var9 = arg6.method514(var11, var10, class438.field6084, 64, 768);
            class580.field8354.method2890(-7307, var7, var9);
        }
        class233 var12 = var9.method585((byte) 2, var10, true);
        if (arg3 != 0) {
            var12.method599(arg3);
        }
        if (arg1 != 0) {
            var12.method550(arg1);
        }
        if (arg5 != 0) {
            var12.method543(arg5);
        }
        if (arg4 != 0) {
            var12.method568(0, arg4, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)V")
    public abstract void method1562(int arg0);

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([I)V")
    public abstract void method1555(int[] arg0);

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)V")
    public abstract void method1568(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(III)V")
    public abstract void method1558(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IJ)V")
    public static final void method4230(int arg0, long arg1) {
        if (arg0 != 2) {
            method4230(15, -92L);
        }
        field10582++;
        class99.field1438.setTime(new Date(arg1));
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(III[I)V")
    public abstract void method1571(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "()Ldm;")
    public abstract class765 method1556();

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(III[I)V")
    public abstract void method1559(int arg0, int arg1, int arg2, int[] arg3);
}

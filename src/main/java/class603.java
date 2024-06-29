import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class603 extends class757 {

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "[[I")
    public static int[][] field8623 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "Ljava/lang/Object;")
    public static volatile Object field8617 = null;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
    public static int field8620;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "[Lig;")
    public static class674[] field8622;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(B)V")
    public static void method3538(byte arg0) {
        if (arg0 > -101) {
            field8617 = null;
        }
        field8617 = null;
        field8622 = null;
        field8623 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBII)V")
    public final void method2618(int arg0, byte arg1, int arg2, int arg3) {
        ++field8620;
        super.field10515 = arg2;
        if (arg1 == -108) {
            super.field10513 = arg3;
            super.field10528 = arg0;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([BI)Z")
    public static final boolean method3539(byte[] arg0, int arg1) {
        ++field8618;
        class26 var2 = new class26(arg0);
        int var3 = var2.method194((byte) 119);
        if (~var3 != arg1) {
            return false;
        } else {
            boolean var4 = ~var2.method194((byte) 119) == -2;
            if (var4) {
                class390.method2367((byte) -41, var2);
            }
            class756.method4194(var2, (byte) 5);
            return true;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Z")
    public static final boolean method3540(int arg0, int arg1) {
        ++field8621;
        if (arg1 != -5) {
            method3540(-128, -112);
        }
        return ~arg0 == -5 || ~arg0 == -9 || ~arg0 == -12;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IF)V")
    public final void method2616(int arg0, float arg1) {
        if (arg0 == 0) {
            super.field10523 = arg1;
            ++field8619;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(IIIIIF)V")
    public class603(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class239 {

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "J")
    public long field3372;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Llaa;")
    private class122 field3367;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Lkaa;")
    public static class47 field3371 = new class47(62, 8);

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Ljava/lang/Object;")
    public static volatile Object field3373 = null;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "[I")
    public static int[] field3374 = null;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3375;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)Z")
    public static final boolean method1501(byte arg0, int arg1) {
        if (arg0 == -14) {
            field3368++;
            return arg1 == 7 || arg1 == 8 || arg1 == 9;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3366++;
        this.field3367.method981((byte) -100, this.field3372);
        super.finalize();
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method1502(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (!arg6) {
            method1503(2, -30, -72);
        }
        field3370++;
        if (arg1 != 8 && arg1 != 16) {
            class701 var7 = class660.field8718[arg5][arg2][arg3];
            if (var7 == null) {
                var7 = new class701(arg5);
            }
            if (arg1 == 1) {
                var7.field9743 = (short) arg0;
                var7.field9731 = (short) arg4;
            } else if (arg1 == 2) {
                var7.field9732 = (short) arg4;
                var7.field9733 = (short) arg0;
            }
            if (class37.field525) {
                class485.method2737(true);
                return;
            }
            return;
        }
        if (arg1 == 8) {
            int var8 = arg2 << class140.field2224;
            int var9 = class384.field5377 + var8;
            int var10 = arg3 << class140.field2224;
            int var11 = var10 + class384.field5377;
            int var12 = class113.field1866[arg5].method1742(arg2, 103, arg3);
            int var13 = class113.field1866[arg5].method1742(arg2 + 1, 110, arg3 + 1);
            class247.field3434[class383.field5368++] = new class177(arg1, arg5, var8, var9, var9, var8, var12, var13, var13 - arg4, -arg4 + var12, var10, var11, var11, var10);
            return;
        }
        int var14 = (arg2 << class140.field2224) + class384.field5377;
        int var15 = var14 - class384.field5377;
        int var16 = arg3 << class140.field2224;
        int var17 = var16 + class384.field5377;
        int var18 = class113.field1866[arg5].method1742(arg2 + 1, 48, arg3);
        int var19 = class113.field1866[arg5].method1742(arg2, 50, arg3 + 1);
        class247.field3434[class383.field5368++] = new class177(arg1, arg5, var14, var15, var15, var14, var18, var19, var19 - arg4, -arg4 + var18, var16, var17, var17, var16);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Lvfa;")
    public static final class672 method1503(int arg0, int arg1, int arg2) {
        field3369++;
        class672 var3 = class21.method225(65535, arg0);
        if (~arg1 == arg2) {
            return var3;
        } else if (var3 == null || var3.field9240 == null || var3.field9240.length <= arg1) {
            return null;
        } else {
            return var3.field9240[arg1];
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    public static void method1504(boolean arg0) {
        field3373 = null;
        field3371 = null;
        if (arg0) {
            field3374 = null;
            field3375 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Llaa;JI)V")
    public class239(class122 arg0, long arg1, int arg2) {
        this.field3372 = arg1;
        this.field3367 = arg0;
    }
}

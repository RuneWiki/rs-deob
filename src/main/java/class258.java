import jaclib.memory.Buffer;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class258 extends class18 implements class511 {

    @OriginalMember(owner = "client!daa", name = "k", descriptor = "I")
    private int field3370;

    @OriginalMember(owner = "client!daa", name = "n", descriptor = "J")
    public static long field3373 = 0L;

    @OriginalMember(owner = "client!daa", name = "m", descriptor = "Ltt;")
    public static class338 field3372 = new class338(66, 2);

    @OriginalMember(owner = "client!daa", name = "w", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3382 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!daa", name = "y", descriptor = "[I")
    public static int[] field3384 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!daa", name = "l", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!daa", name = "o", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!daa", name = "p", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!daa", name = "q", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!daa", name = "r", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!daa", name = "s", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!daa", name = "t", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!daa", name = "u", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!daa", name = "v", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!daa", name = "x", descriptor = "Lph;")
    public static class481 field3383;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)V")
    public static void method1555(int arg0) {
        field3384 = null;
        if (arg0 != -52) {
            field3383 = null;
        }
        field3383 = null;
        field3382 = null;
        field3372 = null;
    }

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "(B)V")
    public final void method110(byte arg0) {
        ++field3380;
        if (arg0 != -122) {
            method1555(124);
        }
        super.field225.method2657((byte) 71, this);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)V")
    public static final void method1556(int arg0, int arg1) {
        ++field3371;
        if (arg0 != 9179409) {
            field3373 = -17L;
        }
        for (class45 var2 = class608.field8455.method3053((byte) 63); var2 != null; var2 = class608.field8455.method3056(arg0 + -9161296)) {
            if (~((long) arg1) == ~(65535L & var2.field545 >> 48)) {
                var2.method242(true);
            }
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BI[BI)V")
    public final void method1557(byte arg0, int arg1, byte[] arg2, int arg3) {
        ++field3374;
        this.method109(arg2, arg1, 123);
        if (arg0 != 46) {
            field3382 = null;
        }
        this.field3370 = arg3;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)I")
    public final int method1558(byte arg0) {
        int var2 = 40 % ((arg0 - 14) / 41);
        ++field3376;
        return super.field228;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)J")
    public final long method1559(boolean arg0) {
        if (arg0) {
            field3382 = null;
        }
        ++field3375;
        return 0L;
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lag;ILjaclib/memory/Buffer;IZ)V")
    public class258(class469 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field3370 = arg1;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)I")
    public final int method1560(int arg0) {
        ++field3378;
        if (arg0 != -4696) {
            method1555(-26);
        }
        return this.field3370;
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(II)Z")
    public static final boolean method1561(int arg0, int arg1) {
        if (arg1 > -97) {
            return true;
        } else {
            ++field3377;
            if (~arg0 != -18 && arg0 != 49 && ~arg0 != -52 && arg0 != 58 && arg0 != 47) {
                return ~arg0 == -20 || arg0 == 1010;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lag;I[BIZ)V")
    public class258(class469 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field3370 = arg1;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IBILda;I)Lcu;")
    public static final class475 method1562(int arg0, byte arg1, int arg2, class470 arg3, int arg4) {
        ++field3381;
        if (arg3 == null) {
            return null;
        } else {
            return arg1 != -47 ? null : new class475(arg0, arg4, arg2, arg3.method636(), arg3.method650(), arg3.method647(), arg3.method613(), arg3.method627(), arg3.method656(), arg3.method660());
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILga;II)Lcca;")
    public static final class250 method1563(int arg0, class332 arg1, int arg2, int arg3) {
        ++field3379;
        byte[] var4 = arg1.method1938(arg0, arg2, arg3 + -65552);
        if (var4 == null) {
            return null;
        } else {
            if (arg3 != 65535) {
                method1561(-119, -75);
            }
            return new class250(var4);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class275 {

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public int field3824;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public int field3820;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public int field3818;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public int field3817;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "[I")
    public static int[] field3827 = new int[8];

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "J")
    public static long field3826 = 0L;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Ljo;")
    public static class351 field3819 = new class351(58, 6);

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "B")
    public static byte field3821;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!rh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3822++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)I")
    public static final int method1778(int arg0, boolean arg1) {
        field3823++;
        if (arg0 != 0) {
            return 78;
        }
        int var2 = class463.field6612;
        if (var2 == 0) {
            return arg1 ? 0 : class364.field5265;
        } else if (var2 == 1) {
            return class364.field5265;
        } else if (var2 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)Ldda;")
    public static final class399 method1779(byte arg0, int arg1) {
        field3825++;
        class399 var2 = (class399) class356.field5190.method2373((long) arg1, 103);
        if (var2 != null) {
            return var2;
        }
        if (arg0 > -115) {
            method1778(-89, false);
        }
        byte[] var3 = class484.field6865.method3150(arg1, -111, 0);
        class399 var4 = new class399();
        if (var3 != null) {
            var4.method2426((byte) -24, arg1, new class120(var3));
        }
        class356.field5190.method2362(var4, 0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method1780(int arg0) {
        field3819 = null;
        int var1 = 119 / ((arg0 - 47) / 52);
        field3827 = null;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIII)V")
    public class275(int arg0, int arg1, int arg2, int arg3) {
        this.field3824 = arg2;
        this.field3820 = arg3;
        this.field3818 = arg0;
        this.field3817 = arg1;
    }
}

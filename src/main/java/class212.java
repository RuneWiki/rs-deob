import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class212 extends class337 {

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public int field2914 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public int field2907 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public int field2905 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    public int field2916 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    public int field2915 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public int field2912 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
    public int field2919 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
    public int field2920 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "Lkj;")
    public class307 field2909;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "[Lis;")
    public static class350[] field2908 = new class350[14];

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "Lqt;")
    public static class525 field2911 = new class525();

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "Ljava/lang/String;")
    public static String field2922 = null;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "[I")
    public static int[] field2921;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIB)Z")
    public final boolean method1411(int arg0, int arg1, byte arg2) {
        field2910++;
        if (arg1 >= this.field2912 && arg1 <= this.field2916 && arg0 >= this.field2920 && arg0 <= this.field2907) {
            return true;
        } else if (arg2 > -96) {
            return true;
        } else {
            return arg1 >= this.field2905 && this.field2914 >= arg1 && this.field2915 <= arg0 && arg0 <= this.field2919;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILuaa;IIILha;)V")
    public static final void method1412(int arg0, class391 arg1, int arg2, int arg3, int arg4, class570 arg5) {
        for (int var6 = arg0; var6 >= 0; var6--) {
            for (int var7 = 127; var7 >= 0; var7--) {
                int var8 = var7 & 0x7F | var6 & 0x7 << 7 | (arg4 & 0x3F) << 10;
                class385.method2206(arg0 + 1701, true, false);
                int var9 = class594.field7542[var8];
                class497.method2760(true, true, false);
                arg5.method921((arg1.field5117 * var7 >> 7) + arg2, ((7 - var6) * arg1.field5031 >> 3) + arg3, (arg1.field5117 >> 7) + 1, (arg1.field5031 >> 3) - -1, var9, 0);
            }
        }
        field2906++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static void method1413(int arg0) {
        field2911 = null;
        field2921 = null;
        field2908 = null;
        if (arg0 == -963144989) {
            field2922 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I[BB)[B")
    public static final byte[] method1414(int arg0, byte[] arg1, byte arg2) {
        field2918++;
        if (arg2 == 39) {
            byte[] var3 = new byte[arg0];
            class642.method3480(arg1, 0, var3, 0, arg0);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lkj;)V")
    public class212(class307 arg0) {
        this.field2909 = arg0;
    }
}

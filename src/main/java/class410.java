import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class410 extends class34 {

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    private int field6060;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    private int field6067;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    private int field6068;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    private int field6053;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "F")
    public static float field6065;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "Lcl;")
    public static class313 field6062;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "[S")
    public static short[] field6054;

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIIIII)V")
    public class410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field6060 = arg2;
        this.field6067 = arg1;
        this.field6068 = arg0;
        this.field6053 = arg3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
    public final void method224(int arg0, int arg1, int arg2) {
        ++field6057;
        if (arg1 != 512) {
            method2630((byte) 6);
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(III)V")
    public final void method227(int arg0, int arg1, int arg2) {
        ++field6056;
        int var4 = this.field6068 * arg1 >> 12;
        int var5 = this.field6060 * arg1 >> 12;
        if (arg0 > 26) {
            int var6 = this.field6067 * arg2 >> 12;
            int var7 = this.field6053 * arg2 >> 12;
            class315.method2132(var6, super.field480, var4, super.field479, var7, var5, 57, super.field481);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZZ)Z")
    public static boolean method2629(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static void method2630(byte arg0) {
        field6062 = null;
        if (arg0 != 28) {
            method2632((int[]) null, 55, 38, 110L);
        }
        field6054 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([J[Ljava/lang/Object;I)V")
    public static final void method2631(long[] arg0, Object[] arg1, int arg2) {
        class223.method1297(arg1, 0, arg0, (byte) 109, arg0.length + arg2);
        ++field6061;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([IIIJ)Ljava/lang/String;")
    public static final String method2632(int[] arg0, int arg1, int arg2, long arg3) {
        if (arg1 != -14998) {
            return null;
        } else {
            ++field6066;
            if (class396.field5851 != null) {
                String var5 = class396.field5851.method1983(arg0, -24810, arg3, arg2);
                if (var5 != null) {
                    return var5;
                }
            }
            return Long.toString(arg3);
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(III)V")
    public final void method228(int arg0, int arg1, int arg2) {
        ++field6058;
        int var4 = this.field6068 * arg1 >> 12;
        int var5 = this.field6060 * arg1 >> 12;
        int var6 = this.field6067 * arg2 >> 12;
        int var7 = this.field6053 * arg2 >> 12;
        class343.method2242(var4, var7, super.field481, var5, (byte) -80, var6);
        if (arg0 != 0) {
            field6064 = 27;
        }
    }
}

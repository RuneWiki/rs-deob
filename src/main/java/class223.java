import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class223 {

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "J")
    public long field3200;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Lkv;")
    private class280 field3198;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field3199 = -1;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3204 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "[[Z")
    public static boolean[][] field3202 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "F")
    public static float field3205;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "[Lqda;")
    public static class112[] field3206;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 14)
    public static final String method1544(int arg0, byte arg1) {
        field3203++;
        class542 var2 = (class542) class622.field8773.method380((byte) -3, (long) arg0);
        if (var2 != null) {
            class1 var3 = var2.field7597.method4261(-2);
            if (var3 != null) {
                double var4 = var2.field7597.method4255(0);
                if (var4 >= (double) var3.method6((byte) -34) && var4 <= (double) var3.method5(false)) {
                    return var3.method7((byte) 45);
                }
            }
        }
        return arg1 <= 98 ? null : null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 50)
    public static void method1545(int arg0) {
        if (arg0 == 0) {
            field3202 = null;
            field3206 = null;
            field3204 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "finalize", descriptor = "()V", line = 62)
    protected final void finalize() throws Throwable {
        this.field3198.method1857(this.field3200, (byte) -56);
        field3207++;
        super.finalize();
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lkv;J[Llv;)V", line = 71)
    public class223(class280 arg0, long arg1, class466[] arg2) {
        this.field3200 = arg1;
        this.field3198 = arg0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIBII)V", line = 83)
    public static final void method1546(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class351.field5115; var5++) {
            Rectangle var6 = class667.field9385[var5];
            if (arg1 < var6.x + var6.width && var6.x < arg0 + arg1 && var6.y + var6.height > arg4 && (arg3 + arg4) > var6.y) {
                class397.field5653[var5] = true;
            }
        }
        if (arg2 > 114) {
            field3208++;
            class651.method3726(arg4, 20, arg3 + arg4, arg1, arg0 + arg1);
        }
    }
}

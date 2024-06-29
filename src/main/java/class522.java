import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public abstract class class522 extends class68 {

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
    public int field7737;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "I")
    public int field7729;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
    public int field7731;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    public int field7726;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
    public int field7735;

    @OriginalMember(owner = "client!wo", name = "x", descriptor = "I")
    public int field7738;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
    public int field7734;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
    public static int field7727 = 1;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
    public static int field7732 = -1;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "[I")
    public static int[] field7722 = new int[8];

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "F")
    public static float field7736;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public static int field7725;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
    public static int field7728;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "I")
    public static int field7733;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIIII)Ltl;", line = 3)
    public static final class436 method3095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7725++;
        long var7 = (long) arg0 * 986053L ^ (long) arg1 * 67481L ^ (long) arg4 * 97549L ^ (long) arg3 * 475427L ^ (long) arg5 * 32147369L ^ (long) arg6 * 76724863L;
        class436 var9 = (class436) class33.field346.method1536(var7, 0);
        if (var9 != null) {
            return var9;
        }
        class436 var10 = class33.field345.method1065(arg1, arg4, arg3, arg0, arg5, arg6);
        class33.field346.method1542(var10, (byte) 112, var7);
        if (arg2 >= -26) {
            method3095(-33, -9, 100, -11, -11, 62, 50);
        }
        return var10;
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(B)V", line = 28)
    public final void method13(byte arg0) {
        if (arg0 == -89) {
            field7730++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)Z", line = 41)
    public final boolean method18(int arg0) {
        if (arg0 < 72) {
            return true;
        } else {
            field7723++;
            return false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)V", line = 57)
    public static void method3096(boolean arg0) {
        if (!arg0) {
            field7722 = null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BIZ)V", line = 70)
    public static final void method3097(byte arg0, int arg1, boolean arg2) {
        field7728++;
        if (arg0 == -45) {
            class138 var3 = class307.method1936((byte) 105, arg2, arg1);
            if (var3 != null) {
                var3.method2049(-127);
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZIILer;Lqa;IB)V", line = 91)
    public final void method19(boolean arg0, int arg1, int arg2, class68 arg3, class162 arg4, int arg5, byte arg6) {
        field7733++;
        if (arg6 <= -105) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(IIIIIII)V", line = 112)
    public class522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7737 = arg3;
        this.field7729 = arg6;
        this.field7731 = arg0;
        this.field7726 = arg4;
        this.field7735 = arg5;
        this.field7738 = arg1;
        this.field7734 = arg2;
    }

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "(B)I")
    public abstract int method1177(byte arg0);
}

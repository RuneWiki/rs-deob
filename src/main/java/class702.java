import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class702 extends class406 {

    @OriginalMember(owner = "client!hu", name = "u", descriptor = "I")
    public int field9788;

    @OriginalMember(owner = "client!hu", name = "s", descriptor = "I")
    public int field9786;

    @OriginalMember(owner = "client!hu", name = "r", descriptor = "I")
    public static int field9785 = -1;

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "Z")
    public static boolean field9782 = false;

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "I")
    public static int field9784 = 0;

    @OriginalMember(owner = "client!hu", name = "w", descriptor = "F")
    public static float field9790 = 0.0F;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "[F")
    public static float[] field9781 = new float[4];

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "I")
    public static int field9783;

    @OriginalMember(owner = "client!hu", name = "t", descriptor = "I")
    public static int field9787;

    @OriginalMember(owner = "client!hu", name = "v", descriptor = "I")
    public static int field9789;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)V")
    public static void method3970(byte arg0) {
        int var1 = 8 / ((arg0 - 68) / 47);
        field9781 = null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lgca;)V")
    public static final void method3971(class705 arg0) {
        class539.field7444 = arg0;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)Lof;")
    public final class475 method473(int arg0) {
        field9783++;
        return arg0 == 6 ? class656.field9257 : null;
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lada;Loe;IIIIIIIII)V")
    public class702(class267 arg0, class15 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field9788 = arg9;
        this.field9786 = arg10;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIII)V")
    public static final void method3972(int arg0, int arg1, int arg2, int arg3) {
        field9789++;
        int var4 = class688.field9602.field8505.method1981((byte) -98) * arg0 >> 8;
        if (~var4 == arg1 || arg2 == -1) {
            return;
        }
        if (!class15.field90 && class4.field22 != -1 && class637.method3659(arg1 ^ 0xFFFFFFFE) && !class444.method2670((byte) -100)) {
            class278.field3998 = class213.method1338((byte) 104);
            class82 var5 = class266.method1742((byte) -68, class278.field3998);
            class144.method957(var5, (byte) -103, true);
        }
        class707.method3988(0, (byte) -98, var4, arg2, false, class456.field6376);
        class373.method2319(-1, 255, 14351);
        class15.field90 = true;
    }
}

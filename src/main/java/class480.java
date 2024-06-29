import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class480 {

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "[I")
    public static int[] field7057 = new int[32];

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Lbg;")
    public static class324 field7062 = new class324(82, 12);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public int field7061;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Lpe;")
    public class431 field7054;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Lag;")
    public class480 field7058;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public final void method2894(int arg0) {
        field7056++;
        if (class215.field3098 >= 500 || arg0 < 24) {
            return;
        }
        this.field7058 = class75.field1018;
        this.field7061 = 0;
        this.field7054 = null;
        class215.field3098++;
        class75.field1018 = this;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILet;III)Ljava/awt/Frame;")
    public static final Frame method2895(int arg0, int arg1, class419 arg2, int arg3, int arg4, int arg5) {
        field7060++;
        if (!arg2.method2577((byte) -100)) {
            return null;
        }
        if (arg4 == 0) {
            class491[] var6 = class178.method1248(arg2, 1034647426);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field7197 == arg0 && var6[var8].field7198 == arg3 && (arg5 == 0 || var6[var8].field7200 == arg5) && (!var7 || var6[var8].field7201 > arg4)) {
                    var7 = true;
                    arg4 = var6[var8].field7201;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class449 var9 = arg2.method2549(arg3, arg5, arg4, true, arg0);
        if (arg1 != -8390) {
            field7059 = -104;
        }
        while (var9.field6617 == 0) {
            class213.method1462(10L, arg1 ^ 0x34FA);
        }
        Frame var10 = (Frame) var9.field6613;
        if (var10 == null) {
            return null;
        } else if (var9.field6617 == 2) {
            class280.method1795(arg2, (byte) -62, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Z")
    public static final boolean method2896(int arg0, int arg1, int arg2) {
        field7053++;
        if (arg2 >= -122) {
            return false;
        } else {
            return (arg0 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public static void method2897(int arg0) {
        field7062 = null;
        if (arg0 != -26007) {
            method2895(49, -58, null, -48, 1, 49);
        }
        field7057 = null;
    }
}

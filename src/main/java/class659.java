import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class659 extends class379 {

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public int field9064;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public int field9062;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "Lkq;")
    public static class620 field9061 = null;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field9063;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIBLlc;I)Ljava/awt/Frame;")
    public static final Frame method3709(int arg0, int arg1, int arg2, byte arg3, class675 arg4, int arg5) {
        if (arg3 > -103) {
            return null;
        }
        field9063++;
        if (!arg4.method3791(-109)) {
            return null;
        }
        if (arg2 == 0) {
            class540[] var6 = class458.method2772(4095, arg4);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field7593 == arg0 && var6[var8].field7597 == arg5 && (arg1 == 0 || var6[var8].field7599 == arg1) && (!var7 || var6[var8].field7596 > arg2)) {
                    var7 = true;
                    arg2 = var6[var8].field7596;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class561 var9 = arg4.method3799(arg2, -10013, arg0, arg1, arg5);
        while (var9.field7769 == 0) {
            class594.method3405(10L, 16711680);
        }
        Frame var10 = (Frame) var9.field7768;
        if (var10 == null) {
            return null;
        } else if (var9.field7769 == 2) {
            class328.method1947(arg4, -97, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public static void method3710(byte arg0) {
        field9061 = null;
        if (arg0 < 76) {
            field9061 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lbt;Lbt;I[I)V")
    public static final void method3711(class48 arg0, class48 arg1, int arg2, int[] arg3) {
        field9059++;
        class459.field6468 = arg1;
        if (arg3 != null) {
            class208.field2473 = arg3;
        }
        if (arg2 == 10) {
            class755.field10461 = arg0;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(II)V")
    public class659(int arg0, int arg1) {
        this.field9064 = arg1;
        this.field9062 = arg0;
    }
}

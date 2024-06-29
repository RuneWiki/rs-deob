import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class503 extends class426 {

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public int field7018;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ[S)[S")
    public static final short[] method2915(int arg0, boolean arg1, short[] arg2) {
        field7017++;
        if (arg1) {
            return null;
        } else {
            short[] var3 = new short[arg0];
            class252.method1543(arg2, 0, var3, 0, arg0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)I")
    public static final int method2916(byte arg0) {
        if (arg0 > -75) {
            return 69;
        } else {
            field7019++;
            return class232.field3063;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZII[Ln;)V")
    public static final void method2917(int arg0, int arg1, boolean arg2, int arg3, int arg4, class17[] arg5) {
        field7016++;
        for (int var6 = arg3; var6 < arg5.length; var6++) {
            class17 var7 = arg5[var6];
            if (var7 != null && var7.field469 == arg1) {
                class626.method3599((byte) -69, arg4, arg0, arg2, var7);
                class160.method1015(arg0, arg4, arg3 ^ 0xFFFFFF0C, var7);
                if ((var7.field375 - var7.field414) < var7.field332) {
                    var7.field332 = var7.field375 - var7.field414;
                }
                if (var7.field332 < 0) {
                    var7.field332 = 0;
                }
                if (var7.field480 > (var7.field343 - var7.field402)) {
                    var7.field480 = var7.field343 - var7.field402;
                }
                if (var7.field480 < 0) {
                    var7.field480 = 0;
                }
                if (var7.field379 == 0) {
                    class431.method2592(arg2, var7, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I)V")
    public class503(int arg0) {
        this.field7018 = arg0;
    }
}

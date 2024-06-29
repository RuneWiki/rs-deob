import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class254 extends class687 {

    @OriginalMember(owner = "client!iaa", name = "E", descriptor = "Z")
    public static boolean field3719 = true;

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "Lst;")
    public static class335 field3714 = new class335(23, 7);

    @OriginalMember(owner = "client!iaa", name = "A", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!iaa", name = "B", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!iaa", name = "C", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!iaa", name = "D", descriptor = "Luu;")
    public static class237 field3718;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(FB)V")
    public final void method1730(float arg0, byte arg1) {
        if (arg1 == -111) {
            super.field9556 = arg0;
            ++field3717;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "f", descriptor = "(I)V")
    public static void method1731(int arg0) {
        if (arg0 < -62) {
            field3714 = null;
            field3718 = null;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1732(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 1) {
            field3719 = true;
        }
        if (~arg1 != -9 && arg1 != 16) {
            class262 var7 = class137.field1948[arg3][arg6][arg0];
            if (var7 == null) {
                var7 = new class262(arg3);
            }
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    var7.field3849 = (short) arg5;
                    var7.field3851 = (short) arg2;
                }
            } else {
                var7.field3840 = (short) arg2;
                var7.field3843 = (short) arg5;
            }
            if (class491.field6907) {
                class685.method3859(21538);
            }
        } else if (arg1 != 8) {
            int var8 = (arg6 << class371.field5241) + class368.field5213;
            int var9 = -class368.field5213 + var8;
            int var10 = arg0 << class371.field5241;
            int var11 = var10 - -class368.field5213;
            int var12 = class550.field7649[arg3].method2171(arg0, arg6 + 1, 31);
            int var13 = class550.field7649[arg3].method2171(arg0 + 1, arg6, 31);
            class166.field2285[class312.field4339++] = new class616(arg1, arg3, var8, var9, var9, var8, var12, var13, -arg2 + var13, -arg2 + var12, var10, var11, var11, var10);
        } else {
            int var14 = arg6 << class371.field5241;
            int var15 = class368.field5213 + var14;
            int var16 = arg0 << class371.field5241;
            int var17 = class368.field5213 + var16;
            int var18 = class550.field7649[arg3].method2171(arg0, arg6, 31);
            int var19 = class550.field7649[arg3].method2171(arg0 - -1, arg6 - -1, arg4 + 30);
            class166.field2285[class312.field4339++] = new class616(arg1, arg3, var14, var15, var15, var14, var18, var19, -arg2 + var19, -arg2 + var18, var16, var17, var17, var16);
        }
        ++field3716;
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(IIIIIF)V")
    public class254(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIII)V")
    public final void method1733(int arg0, int arg1, int arg2, int arg3) {
        ++field3715;
        super.field9555 = arg3;
        super.field9558 = arg0;
        super.field9554 = arg2;
        if (arg1 != -10672) {
            field3718 = null;
        }
    }
}

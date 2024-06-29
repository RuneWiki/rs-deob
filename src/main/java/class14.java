import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 extends class8 {

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "J")
    public static long field246 = 0L;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "Ljava/lang/String;")
    public static String field247 = "Loaded interfaces";

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "Z")
    public static boolean field250 = false;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    public class14() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V")
    public static void method111(int arg0) {
        field247 = null;
        if (arg0 != 64) {
            field246 = -121L;
        }
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V")
    public static final void method112(int arg0) {
        ++field252;
        if (class176.field2780 > 0) {
            class72.method514(104);
        } else {
            class43.field800 = class5.field69;
            class5.field69 = null;
            class1.method5(arg0, 126);
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field251;
        int[] var3 = super.field110.method1585(arg0 ^ arg0, arg1);
        if (super.field110.field3734) {
            class140.method970(var3, 0, class231.field3798, class182.field2864[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method113(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class256.field4071 = arg6;
        class213.field3476 = arg1;
        if (arg5 == 100) {
            class182.field2865 = arg2;
            class1.field29 = arg4;
            ++field249;
            class73.field1192 = arg3;
            if (arg0 && class256.field4071 >= 100) {
                class54.field925 = class1.field29 * 128 + 64;
                class99.field1625 = class73.field1192 * 128 - -64;
                class17.field301 = class225.method1583(class99.field1625, class54.field925, class250.field3980, 0) - class182.field2865;
            }
            class229.field3786 = 2;
        }
    }
}

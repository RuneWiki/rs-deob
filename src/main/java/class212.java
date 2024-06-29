import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class212 extends class324 {

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public int field2996 = -1;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Lcba;")
    public static class471 field2993 = new class471(112, 0);

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field2998 = -1;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "Z")
    public static boolean field2999 = false;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "[I")
    public static int[] field2997 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public int field2994;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Lan;")
    public static class21 field2988;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "Ljava/lang/String;")
    public String field2992;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "Ljava/lang/String;")
    public String field2995;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2990;
        if (arg2 >= 1 && ~arg3 <= -2 && ~(class32.field513 + -2) <= ~arg2 && arg3 <= class611.field8786 + -2) {
            int var9 = arg1;
            if (arg1 < 3 && class414.method2493(arg3, false, arg2)) {
                var9 = arg1 + 1;
            }
            if (!class491.field6875.method2608(class103.field1570, (byte) -127) && !class454.method2667(arg2, true, class67.field1116, arg3, var9)) {
                return;
            }
            if (class356.field4807 == null) {
                return;
            }
            class90.field1398.method3536(arg5 + 52484, arg3, class69.field1165, arg4, class428.field6075[arg1], arg1, arg2);
            if (arg7 >= 0) {
                boolean var10 = class491.field6875.field3367;
                class491.field6875.field3367 = true;
                class90.field1398.method3534(class69.field1165, arg1, arg6, class428.field6075[arg1], arg8, var9, 24486, arg2, arg7, arg3, arg0);
                class491.field6875.field3367 = var10;
            }
        }
        if (arg5 != -23807) {
            method1389((byte) -12);
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)Llp;")
    public final class329 method1387(int arg0) {
        ++field2991;
        if (arg0 != -17730) {
            this.field2994 = 105;
        }
        return class246.field3443[super.field4364];
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZ)I")
    public static final int method1388(int arg0, int arg1, boolean arg2) {
        ++field2989;
        if (arg2) {
            return 0;
        } else {
            class133 var3 = class568.method3229(arg0, (byte) -88, arg2);
            if (var3 == null) {
                return class154.field2312.method3522(arg0, (byte) 14).field4399;
            } else {
                int var4 = 0;
                for (int var5 = arg1; ~var3.field2115.length < ~var5; ++var5) {
                    if (var3.field2115[var5] == -1) {
                        ++var4;
                    }
                }
                return var4 + class154.field2312.method3522(arg0, (byte) 14).field4399 + -var3.field2115.length;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
    public static void method1389(byte arg0) {
        if (arg0 >= -26) {
            field2997 = null;
        }
        field2988 = null;
        field2993 = null;
        field2997 = null;
    }
}

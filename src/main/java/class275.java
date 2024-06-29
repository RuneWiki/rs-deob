import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class275 {

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field4271 = 0;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lrc;")
    public static class327 field4269;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lrg;")
    public static class96 field4276;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field4274;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IBIIII)V", line = 8)
    public static final void method1975(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < 52) {
            field4269 = (class327) null;
        }
        if (class195.field3108 >= arg3 && class188.field2995 <= arg5) {
            boolean var6;
            if (class319.field4965 > arg0) {
                arg0 = class319.field4965;
                var6 = false;
            } else if (arg0 > class116.field1888) {
                var6 = false;
                arg0 = class116.field1888;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg2 < class319.field4965) {
                arg2 = class319.field4965;
                var7 = false;
            } else if (class116.field1888 >= arg2) {
                var7 = true;
            } else {
                arg2 = class116.field1888;
                var7 = false;
            }
            if (class188.field2995 > arg3) {
                arg3 = class188.field2995;
            } else {
                class86.method614(arg4, -24891, arg2, arg0, class102.field1729[arg3++]);
            }
            if (class195.field3108 < arg5) {
                arg5 = class195.field3108;
            } else {
                class86.method614(arg4, -24891, arg2, arg0, class102.field1729[arg5--]);
            }
            if (var6 && var7) {
                for (int var8 = arg3; var8 <= arg5; var8++) {
                    int[] var9 = class102.field1729[var8];
                    var9[arg0] = var9[arg2] = arg4;
                }
            } else if (var6) {
                for (int var11 = arg3; var11 <= arg5; var11++) {
                    class102.field1729[var11][arg0] = arg4;
                }
            } else if (var7) {
                for (int var10 = arg3; var10 <= arg5; var10++) {
                    class102.field1729[var10][arg2] = arg4;
                }
            }
        }
        field4273++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 111)
    public static void method1976(int arg0) {
        if (arg0 < -79) {
            field4274 = null;
            field4276 = null;
            field4269 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)V", line = 142)
    public static final void method1977(boolean arg0, int arg1) {
        class219.field3506 = arg1;
        class247.method1753(3, arg0);
        class247.method1753(4, false);
        field4275++;
    }
}

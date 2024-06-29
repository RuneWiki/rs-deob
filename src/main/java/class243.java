import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class243 {

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "J")
    public static long field3624 = 0L;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Lwia;")
    public static class791 field3621;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Z")
    public static boolean field3620;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "[I")
    public static int[] field3622;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static void method1617(byte arg0) {
        field3621 = null;
        field3622 = null;
        if (arg0 != 98) {
            field3620 = false;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILqfa;ZI[BIII)Lcw;")
    public static final class192 method1618(int arg0, class106 arg1, boolean arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        field3623++;
        if (arg5 != 3361) {
            field3622 = null;
        }
        if (!arg1.field1515 && (!class262.method1704(arg0, 3) || !class262.method1704(arg3, arg5 - 3358))) {
            return arg1.field1517 ? new class192(arg1, 34037, arg6, arg0, arg3, arg2, arg4, arg7) : new class192(arg1, arg6, arg0, arg3, class433.method2595(arg0, (byte) -82), class433.method2595(arg3, (byte) -82), arg4, arg7);
        } else {
            return new class192(arg1, 3553, arg6, arg0, arg3, arg2, arg4, arg7);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lje;III)V")
    public static final void method1619(class421 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class81.field902) {
            class46 var4 = class767.field10562[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field587 != null && var4.field587.method910(true)) {
                arg0.method905(true, var4.field587, 0, 0, class109.field1611, class228.field3494, 0);
            }
        }
        if (arg3 < class81.field902) {
            class46 var5 = class767.field10562[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field587 != null && var5.field587.method910(true)) {
                arg0.method905(true, var5.field587, 0, class109.field1611, 0, class228.field3494, 0);
            }
        }
        if (arg2 < class81.field902 && arg3 < class48.field615) {
            class46 var6 = class767.field10562[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field587 != null && var6.field587.method910(true)) {
                arg0.method905(true, var6.field587, 0, class109.field1611, class109.field1611, class228.field3494, 0);
            }
        }
        if (arg2 < class81.field902 && arg3 > 0) {
            class46 var7 = class767.field10562[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field587 != null && var7.field587.method910(true)) {
                arg0.method905(true, var7.field587, 0, -class109.field1611, class109.field1611, class228.field3494, 0);
            }
        }
    }
}

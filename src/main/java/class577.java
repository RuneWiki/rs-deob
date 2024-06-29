import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class577 {

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field8261 = 0;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field8262 = 0;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Ljava/lang/String;")
    public static String field8263 = "";

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field8259;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field8260;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Lfl;")
    public static class520 field8265;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 3)
    public static final void method3446(byte arg0) {
        if (class538.field7524 < 0) {
            class538.field7524 = 0;
            class313.field4031 = -1;
            class429.field5920 = -1;
        }
        int var1 = -74 % ((20 - arg0) / 54);
        field8259++;
        if (class538.field7524 > class531.field7442) {
            class538.field7524 = class531.field7442;
            class313.field4031 = -1;
            class429.field5920 = -1;
        }
        if (class29.field372 < 0) {
            class429.field5920 = -1;
            class313.field4031 = -1;
            class29.field372 = 0;
        }
        if (class531.field7449 < class29.field372) {
            class313.field4031 = -1;
            class429.field5920 = -1;
            class29.field372 = class531.field7449;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 41)
    public static void method3447(int arg0) {
        field8263 = null;
        if (arg0 >= 83) {
            field8265 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)Lhg;", line = 66)
    public static final class584 method3448(int arg0, int arg1, int arg2, int arg3) {
        field8264++;
        if (arg3 != -18721) {
            method3448(-102, -29, -38, -121);
        }
        class38 var4 = class352.field4549[arg2][arg1][arg0];
        if (var4 == null) {
            return null;
        }
        class584 var5 = null;
        int var6 = -1;
        for (class590 var7 = var4.field538; var7 != null; var7 = var7.field8467) {
            class743 var8 = var7.field8468;
            if (var8 instanceof class584) {
                class584 var9 = (class584) var8;
                int var10 = var9.method3470(arg3 ^ 0x4920) * 256 - 4;
                int var11 = var9.field9490 - var10 >> 9;
                int var12 = var9.field9489 - var10 >> 9;
                int var13 = var9.field9490 + var10 >> 9;
                int var14 = var9.field9489 + var10 >> 9;
                if (arg1 >= var11 && var12 <= arg0 && arg1 <= var13 && var14 >= arg0) {
                    int var15 = (var13 + 1 - arg1) * (var14 + 1 - arg0);
                    if (var15 > var6) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }
}

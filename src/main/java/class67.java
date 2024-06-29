import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class67 {

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field960 = 0;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field961 = -1;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Lrg;")
    public class326 field959;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Lj;")
    public class7 field964;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILjj;)V", line = 11)
    public static final void method446(int arg0, int arg1, class44 arg2) {
        if (arg1 >= -84) {
            field962 = 52;
        }
        if (class316.field4901 != null) {
            try {
                class316.field4901.method528(0L, -116);
                class316.field4901.method529(arg2.field573, arg0, -1, 24);
            } catch (Exception var4) {
            }
        }
        field966++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILak;Z)[Lem;", line = 31)
    public static final class260[] method447(int arg0, int arg1, class172 arg2, boolean arg3) {
        field963++;
        if (!arg3) {
            field962 = 39;
        }
        return class55.method353(arg2, arg1, (byte) -5, arg0) ? class85.method575(63) : null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIILj;IJZ)Z", line = 45)
    public static final boolean method448(int arg0, int arg1, int arg2, int arg3, int arg4, class7 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class126.method915(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)Ljava/lang/String;", line = 80)
    public static final String method449(byte arg0) {
        field965++;
        if (arg0 != 127) {
            method447(65, 30, (class172) null, true);
        }
        String var1 = "www";
        if (class122.field1909 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class13.field154 != null) {
            var2 = "/p=" + class13.field154;
        }
        return "http://" + var1 + ".runescape.com/l=" + class8.field121 + "/a=" + class44.field594 + var2 + "/";
    }
}

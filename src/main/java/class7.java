import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class7 {

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Z")
    public static boolean field90 = false;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field91 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "Lcg;")
    public static class49 field89;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lcg;B)V", line = 9)
    public static final void method44(class49 arg0, byte arg1) {
        if (arg1 != -51) {
            method45(-100, 104, -15, 119, 124);
        }
        class21.field328 = arg0;
        field88++;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIII)Z", line = 23)
    public static final boolean method45(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class30.field434 * arg3 + class205.field3482 * arg0 >> 16;
        int var6 = class205.field3482 * arg3 - class30.field434 * arg0 >> 16;
        int var7 = class191.field3192 * var6 + class134.field2313 * arg1 >> 16;
        int var8 = class191.field3192 * arg1 - class134.field2313 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class191.field3192 * var6 + class134.field2313 * arg2 >> 16;
        int var12 = class191.field3192 * arg2 - class134.field2313 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class317.field5033 && var13 < class317.field5033) {
            return false;
        } else if (var9 > class321.field5096 && var13 > class321.field5096) {
            return false;
        } else if (var10 < class298.field4753 && var14 < class298.field4753) {
            return false;
        } else {
            return var10 <= class58.field901 || var14 <= class58.field901;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V", line = 72)
    public static void method46(byte arg0) {
        int var1 = -85 / ((48 - arg0) / 36);
        field89 = null;
        field91 = null;
    }
}

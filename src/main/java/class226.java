import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class226 extends class213 {

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "Lo;")
    public class347 field3253;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "Z")
    public static boolean field3249 = false;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field3251 = 0;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "Lnf;")
    public static class307 field3250 = new class307();

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "[Z")
    public static boolean[] field3255 = new boolean[100];

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    public static int field3256 = 0;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "Z")
    public static boolean field3257 = false;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V", line = 4)
    public static void method1631(int arg0) {
        field3255 = null;
        int var1 = 88 / ((-arg0 - 23) / 35);
        field3250 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IJII)Z", line = 16)
    public static final boolean method1632(int arg0, long arg1, int arg2, int arg3) {
        field3254++;
        int var5 = ((int) arg1 & 0x35960C) >> 20;
        if (arg2 != 0) {
            return true;
        }
        int var6 = (int) arg1 >> 14 & 0x1F;
        int var7 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class219 var8 = class345.method2392(var7, 0);
            int var9 = var8.field3130;
            int var10;
            int var11;
            if (var5 == 0 || var5 == 2) {
                var11 = var8.field3096;
                var10 = var8.field3112;
            } else {
                var10 = var8.field3096;
                var11 = var8.field3112;
            }
            if (var5 != 0) {
                var9 = (var9 >> 4 - var5) + (var9 << var5 & 0xF);
            }
            class352.method2450(class359.field5616.field4842[0], 0, var9, true, var10, arg0, class359.field5616.field4936[0], 0, (byte) -101, var11, arg3);
        } else {
            class352.method2450(class359.field5616.field4842[0], var5, 0, true, 0, arg0, class359.field5616.field4936[0], var6 + 1, (byte) -111, 0, arg3);
        }
        return true;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lo;)V", line = 66)
    public class226(class347 arg0) {
        this.field3253 = arg0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Z", line = 75)
    public static final boolean method1633(int arg0, int arg1) {
        field3252++;
        if (arg1 < arg0) {
            return false;
        }
        int var2 = class156.field2169[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1009;
    }
}

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class181 {

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lia;")
    public static class257 field3142 = null;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Lia;")
    public static class257 field3143 = null;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Lw;")
    public static class82 field3145 = new class82(16);

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "Lia;")
    public static class257 field3148 = class28.method234(116, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Lia;")
    public static class257 field3151 = class28.method234(103, "hitmarks");

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIBI)I")
    public static final int method1239(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3147++;
        if (arg3 != 72) {
            field3151 = null;
        }
        int var5 = 65536 - class101.field1871[arg0 * 1024 / arg2] >> 1;
        return ((65536 - var5) * arg1 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)Z")
    public static final boolean method1240(boolean arg0) {
        if (!arg0) {
            return false;
        }
        field3144++;
        try {
            return class53.method406((byte) -112);
        } catch (IOException var4) {
            class44.method345(-125);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class115.field2066 + "," + class45.field1043 + "," + class71.field1400 + " - " + class209.field3582 + "," + (class137.field2441.field4182[0] + class244.field4232) + "," + (class137.field2441.field4119[0] + class231.field3878) + " - ";
            for (int var3 = 0; var3 < class209.field3582 && var3 < 50; var3++) {
                var2 = var2 + class40.field827.field2638[var3] + ",";
            }
            class198.method1325(var2, var5, -72);
            class43.method334(-16777217);
            return true;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method1241(int arg0) {
        field3142 = null;
        field3148 = null;
        if (arg0 != 6691) {
            method1243(103, 35, (byte) -113, 105, 67, 76, -111, -50);
        }
        field3151 = null;
        field3143 = null;
        field3145 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V")
    public static final void method1242(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 > -80) {
            method1240(true);
        }
        if (arg1 >= class123.field2211 && arg1 <= class145.field2540) {
            int var5 = class34.method290(class255.field4371, arg4, class40.field834, -256);
            int var6 = class34.method290(class255.field4371, arg0, class40.field834, -256);
            class252.method1647(arg1, var5, 0, arg2, var6);
        }
        field3141++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1243(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3150++;
        if (arg6 == arg7) {
            class183.method1253(arg7, arg4, arg3, (byte) -68, arg1, arg0, arg5);
        } else if (arg2 > 22) {
            if ((arg5 - arg7) >= class123.field2211 && arg5 + arg7 <= class145.field2540 && class40.field834 <= arg3 - arg6 && (arg3 + arg6) <= class255.field4371) {
                class224.method1471(arg6, arg5, arg4, arg3, arg1, arg7, (byte) -125, arg0);
            } else {
                class87.method652(true, arg5, arg6, arg1, arg4, arg0, arg3, arg7);
            }
        }
    }
}

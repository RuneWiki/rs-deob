import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class201 {

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3909 = 0;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field3917 = -1;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Leh;")
    public static class47 field3914 = class195.method1282((byte) -4, "blinken2:");

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field3907 = 0;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Leh;")
    private static class47 field3916 = class195.method1282((byte) -4, "Unexpected server response)3");

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Z")
    public static boolean field3908 = false;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Leh;")
    public static class47 field3911 = field3916;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Leh;")
    private static class47 field3913 = class195.method1282((byte) -4, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Leh;")
    public static class47 field3910 = field3913;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Ldh;")
    public static class38 field3912;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)J")
    public static final synchronized long method1313(int arg0) {
        field3915++;
        if (arg0 != 29) {
            method1313(111);
        }
        long var1 = System.currentTimeMillis();
        if (class22.field436 > var1) {
            class108.field2247 += class22.field436 - var1;
        }
        class22.field436 = var1;
        return var1 + class108.field2247;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Lgd;")
    public static final class60 method1314(int arg0, int arg1, int arg2) {
        class152 var3 = class173.field3351[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2975; var4++) {
            class60 var5 = var3.field2979[var4];
            if ((var5.field1157 >> 29 & 0x3L) == 2L && var5.field1172 == arg1 && var5.field1170 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public static void method1315(int arg0) {
        field3911 = null;
        field3914 = null;
        field3916 = null;
        field3910 = null;
        if (arg0 != 29) {
            field3913 = null;
        }
        field3913 = null;
        field3912 = null;
    }
}

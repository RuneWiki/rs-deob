import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class182 extends class138 {

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "Lck;")
    private static class119 field2893 = class298.method1987((byte) 101, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "Lck;")
    public static class119 field2891 = field2893;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "F")
    public static float field2887;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "Lcg;")
    public static class131 field2889;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "Lvh;")
    private class212 field2888;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "Lwi;")
    public static class23 field2885;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "Ljava/awt/Frame;")
    public static Frame field2880;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "[I")
    public static int[] field2886;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLfj;I)V", line = 20)
    private final void method1159(byte arg0, class3 arg1, int arg2) {
        int var4 = -2 / ((49 - arg0) / 56);
        if (arg2 == 249) {
            int var5 = arg1.method64((byte) 50);
            if (this.field2888 == null) {
                int var6 = class140.method925(var5, (byte) 118);
                this.field2888 = new class212(var6);
            }
            for (int var7 = 0; var7 < var5; var7++) {
                boolean var8 = arg1.method64((byte) -82) == 1;
                int var9 = arg1.method48(64);
                class79 var10;
                if (var8) {
                    var10 = new class99(arg1.method41((byte) -119));
                } else {
                    var10 = new class204(arg1.method71(-668527048));
                }
                this.field2888.method1326((long) var9, (byte) -116, var10);
            }
        }
        field2879++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLfj;)V", line = 66)
    public final void method1160(byte arg0, class3 arg1) {
        if (arg0 > -92) {
            method1163(13, false, -12, -16, -114, -98, 93, -89, -105);
        }
        while (true) {
            int var3 = arg1.method64((byte) 123);
            if (var3 == 0) {
                field2884++;
                return;
            }
            this.method1159((byte) -115, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V", line = 88)
    public static void method1161(int arg0) {
        field2889 = null;
        field2891 = null;
        field2886 = null;
        field2885 = null;
        field2893 = null;
        field2880 = null;
        if (arg0 <= 123) {
            field2892 = -19;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lck;II)Lck;", line = 105)
    public final class119 method1162(class119 arg0, int arg1, int arg2) {
        field2883++;
        if (this.field2888 == null) {
            return arg0;
        }
        if (arg2 != 100) {
            this.field2888 = (class212) null;
        }
        class99 var4 = (class99) this.field2888.method1329((byte) 90, (long) arg1);
        return var4 == null ? arg0 : var4.field1510;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZIIIIIII)V", line = 130)
    public static final void method1163(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2882++;
        if (class247.method1609(30881, arg3)) {
            class185.field2926 = null;
            if (!arg1) {
                class167.method1059(class135.field2189[arg3], arg5, arg8, 18515, arg0, arg6, arg2, arg7, -1, arg4);
                if (class185.field2926 != null) {
                    class167.method1059(class185.field2926, arg5, class283.field4676, 18515, arg0, class6.field141, arg2, arg7, -1412584499, arg4);
                    class185.field2926 = null;
                }
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class212.field3379[var9] = true;
            }
        } else {
            class212.field3379[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)I", line = 172)
    public final int method1164(int arg0, int arg1, int arg2) {
        field2890++;
        if (this.field2888 == null) {
            return arg2;
        }
        class204 var4 = (class204) this.field2888.method1329((byte) 90, (long) arg1);
        if (var4 == null) {
            return arg2;
        } else {
            if (arg0 != 100) {
                field2891 = (class119) null;
            }
            return var4.field3230;
        }
    }
}

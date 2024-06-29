import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class142 {

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Z")
    public static boolean field3238 = false;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Lv;")
    public static class146 field3243 = class159.method1226((byte) -37, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Lv;")
    public static class146 field3244 = class159.method1226((byte) -37, "sl_back");

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field3246 = 0;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lua;")
    public static class140 field3239 = new class140(64);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Ldb;")
    public static class24 field3247;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method1056(int arg0) {
        field3244 = null;
        field3247 = null;
        field3243 = null;
        field3239 = null;
        if (arg0 != 16305) {
            field3241 = 50;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static final void method1057(boolean arg0) {
        field3237++;
        class37.field837.method1050(arg0);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIB)I")
    public static final int method1058(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -109) {
            return 55;
        } else {
            field3240++;
            int var4 = 256 - arg2;
            return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)Lnd;")
    public static final class94 method1059(int arg0, int arg1, int arg2, int arg3) {
        field3245++;
        if (arg2 != 65280) {
            method1058(71, 72, 101, (byte) -10);
        }
        class94 var4 = new class94();
        var4.field2225 = arg3;
        var4.field2233 = arg0;
        class51.field1159.method336((long) arg1, var4, arg2 ^ 0xFFFF223D);
        class95.method750(false, arg3);
        class116.method889((byte) -119, arg3);
        class26 var5 = class64.method466(-1922515024, arg1);
        if (var5 != null) {
            class75.method567((byte) 114, var5);
        }
        if (class77.field1874 != null) {
            class75.method567((byte) 127, class77.field1874);
            class77.field1874 = null;
        }
        class13.field208 = 0;
        class38.field842 = false;
        class3.method25(0, class44.field1024, class12.field192, class17.field277, class51.field1158);
        if (class6.field136 != -1) {
            class6.method52((byte) -11, 1, class6.field136);
        }
        return var4;
    }
}

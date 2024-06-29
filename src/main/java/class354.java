import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class354 {

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5450 = "Attack";

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field5449 = 999999;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "[I")
    public static int[] field5453 = new int[4096];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Lmo;")
    public static class447 field5452;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method2304(byte arg0) {
        field5452 = null;
        int var1 = 85 % ((arg0 - 18) / 53);
        field5450 = null;
        field5453 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(CB)Z")
    public static final boolean method2305(char arg0, byte arg1) {
        if (arg1 > -108) {
            method2304((byte) -127);
        }
        field5448++;
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BILjg;)V")
    public static final void method2306(byte arg0, int arg1, class186 arg2) {
        if (arg0 > -20) {
            method2305((char) 65416, (byte) 76);
        }
        field5451++;
        if (class212.field3404 == null) {
            return;
        }
        try {
            class212.field3404.method2564(0L, 0);
            class212.field3404.method2560(-1, arg1, 24, arg2.field3066);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)V")
    public static final void method2307(int arg0, boolean arg1) {
        if (arg0 < 91) {
            field5453 = null;
        }
        class281.method1919(class369.field5615, -1, class306.field4847, arg1, class430.field6324);
        field5447++;
    }
}

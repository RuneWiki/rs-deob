import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class122 {

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "Lwm;")
    private class399 field2123 = new class399(256);

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "Lph;")
    private class459 field2121;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "[Z")
    public static boolean[] field2128 = new boolean[5];

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(BI)Lsk;")
    public final class443 method975(byte arg0, int arg1) {
        field2124++;
        class399 var3 = this.field2123;
        class443 var4;
        synchronized (this.field2123) {
            var4 = (class443) this.field2123.method2478(arg0 ^ 0xFFFFFFB4, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field2121;
        byte[] var6;
        synchronized (this.field2121) {
            var6 = this.field2121.method2757(26, arg1, (byte) -125);
        }
        if (arg0 != -75) {
            this.method977(-49);
        }
        class443 var7 = new class443();
        if (var6 != null) {
            var7.method2640((byte) 45, new class289(var6));
        }
        class399 var8 = this.field2123;
        synchronized (this.field2123) {
            this.field2123.method2472(66, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IBI)Z")
    public static final boolean method976(int arg0, byte arg1, int arg2) {
        if (arg1 != 19) {
            field2125 = 85;
        }
        field2126++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        class306 var3 = class123.field2142.method1530((byte) -42, arg2);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method1959(0, arg0);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
    public final void method977(int arg0) {
        field2127++;
        class399 var2 = this.field2123;
        synchronized (this.field2123) {
            if (arg0 != -24583) {
                method976(-13, (byte) 22, 37);
            }
            this.field2123.method2475((byte) 67);
        }
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V")
    public final void method978(int arg0) {
        field2122++;
        if (arg0 != 8857) {
            method981(106, null);
        }
        class399 var2 = this.field2123;
        synchronized (this.field2123) {
            this.field2123.method2477(-123);
        }
    }

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(I)V")
    public static void method979(int arg0) {
        int var1 = -105 / ((-arg0 - 15) / 46);
        field2128 = null;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "([BI)Z")
    public static final boolean method980(byte[] arg0, int arg1) {
        field2129++;
        class289 var2 = new class289(arg0);
        int var3 = var2.method1858(-3256);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method1858(-3256) == 1;
        int var5 = 119 % ((arg1 + 50) / 34);
        if (var4) {
            class390.method2407(var2, -31752);
        }
        class187.method1274(var2, (byte) -85);
        return true;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method981(int arg0, String arg1) {
        field2130++;
        String var2 = class304.method1943((byte) 116, class410.method2539((byte) 12, arg1));
        if (arg0 > -62) {
            field2125 = 118;
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)V")
    public final void method982(int arg0, int arg1) {
        class399 var3 = this.field2123;
        synchronized (this.field2123) {
            if (arg1 != 20703) {
                method981(21, null);
            }
            this.field2123.method2471((byte) 98, arg0);
        }
        field2120++;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lkp;ILph;)V")
    public class122(class341 arg0, int arg1, class459 arg2) {
        this.field2121 = arg2;
        this.field2121.method2763(26, -3);
    }
}

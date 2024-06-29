import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class146 extends class155 {

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "Ljava/lang/String;")
    private String field2400 = "null";

    @OriginalMember(owner = "client!hm", name = "S", descriptor = "I")
    public static int field2409 = 0;

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "Z")
    public static boolean field2402 = false;

    @OriginalMember(owner = "client!hm", name = "R", descriptor = "C")
    public char field2408;

    @OriginalMember(owner = "client!hm", name = "Z", descriptor = "C")
    public char field2416;

    @OriginalMember(owner = "client!hm", name = "A", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!hm", name = "B", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!hm", name = "C", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!hm", name = "D", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!hm", name = "O", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!hm", name = "T", descriptor = "I")
    private int field2410;

    @OriginalMember(owner = "client!hm", name = "U", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!hm", name = "V", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!hm", name = "W", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!hm", name = "X", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!hm", name = "Y", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!hm", name = "ab", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!hm", name = "P", descriptor = "Luj;")
    public class132 field2406;

    @OriginalMember(owner = "client!hm", name = "Q", descriptor = "Luj;")
    private class132 field2407;

    @OriginalMember(owner = "client!hm", name = "E", descriptor = "Lpb;")
    public static class141 field2397;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "(I)V")
    private final void method1075(int arg0) {
        this.field2407 = new class132(this.field2406.method989(false));
        for (class280 var2 = (class280) this.field2406.method982(-9570); var2 != null; var2 = (class280) this.field2406.method981(-1)) {
            class124 var3 = new class124(var2.field4651, (int) var2.field2213);
            this.field2407.method986(class154.method1172(var2.field4651, (byte) -104), true, var3);
        }
        field2405++;
        if (arg0 != -25285) {
            method1076(false);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V")
    public static void method1076(boolean arg0) {
        if (!arg0) {
            field2397 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1077(String arg0, int arg1) {
        field2415++;
        if (this.field2406 == null) {
            return false;
        }
        if (this.field2407 == null) {
            this.method1075(arg1 - 25413);
        }
        for (class124 var3 = (class124) this.field2407.method987(-120, class154.method1172(arg0, (byte) -103)); var3 != null; var3 = (class124) this.field2407.method985(80)) {
            if (var3.field2099.equals(arg0)) {
                return true;
            }
        }
        if (arg1 != 128) {
            field2411 = 66;
        }
        return false;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IB)Z")
    public final boolean method1078(int arg0, byte arg1) {
        field2395++;
        if (this.field2406 == null) {
            return false;
        }
        if (this.field2407 == null) {
            this.method1085(true);
        }
        class113 var3 = (class113) this.field2407.method987(-99, (long) arg0);
        if (arg1 != 56) {
            field2413 = -85;
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Luf;B)V")
    public static final void method1079(class46 arg0, byte arg1) {
        field2403++;
        int var2 = -40 % ((arg1 + 38) / 42);
        int var3 = arg0.field765 - class275.field4598;
        int var4 = arg0.field778 * 128 + (arg0.method294((byte) -113) * 64);
        int var5 = arg0.field734 * 128 + (arg0.method294((byte) -117) * 64);
        if (arg0.field812 == 0) {
            arg0.field776 = 1024;
        }
        arg0.field771 += (var5 - arg0.field771) / var3;
        arg0.field715 += (var4 - arg0.field715) / var3;
        if (arg0.field812 == 1) {
            arg0.field776 = 1536;
        }
        arg0.field725 = 0;
        if (arg0.field812 == 2) {
            arg0.field776 = 0;
        }
        if (arg0.field812 == 3) {
            arg0.field776 = 512;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILab;)V")
    public final void method1080(int arg0, class249 arg1) {
        field2393++;
        if (arg0 <= 126) {
            return;
        }
        while (true) {
            int var3 = arg1.method1802((byte) 48);
            if (var3 == 0) {
                return;
            }
            this.method1081(var3, arg1, 37);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILab;I)V")
    private final void method1081(int arg0, class249 arg1, int arg2) {
        field2399++;
        if (arg0 == 1) {
            this.field2416 = class1.method12(true, arg1.method1768(127));
        } else if (arg0 == 2) {
            this.field2408 = class1.method12(true, arg1.method1768(78));
        } else if (arg0 == 3) {
            this.field2400 = arg1.method1769(1);
        } else if (arg0 == 4) {
            this.field2410 = arg1.method1800(-108);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method1821((byte) 51);
            this.field2406 = new class132(class91.method633(var4, (byte) 52));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1800(-100);
                class134 var7;
                if (arg0 == 5) {
                    var7 = new class280(arg1.method1769(1));
                } else {
                    var7 = new class113(arg1.method1800(-76));
                }
                this.field2406.method986((long) var6, true, var7);
            }
        }
        int var8 = -55 / ((-arg2 - 12) / 38);
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(II)V")
    public static final void method1082(int arg0, int arg1) {
        if (arg0 >= -53) {
            field2397 = null;
        }
        field2394++;
        if (class301.method2056(-1, arg1)) {
            class314.method2127(class208.field3515[arg1], -1, (byte) 94);
        }
    }

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "(I)V")
    public static final void method1083(int arg0) {
        field2414++;
        class137.field2255.method419(true);
        if (arg0 != -16011) {
            method1082(-51, -89);
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class45.field705[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class158.field2589[var2] = 0L;
        }
        class174.field2797 = 0;
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(II)Ljava/lang/String;")
    public final String method1084(int arg0, int arg1) {
        field2396++;
        if (this.field2406 == null) {
            return this.field2400;
        } else {
            int var3 = -72 / ((arg0 - 82) / 44);
            class280 var4 = (class280) this.field2406.method987(-128, (long) arg1);
            return var4 == null ? this.field2400 : var4.field4651;
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(Z)V")
    private final void method1085(boolean arg0) {
        this.field2407 = new class132(this.field2406.method989(false));
        field2404++;
        for (class113 var2 = (class113) this.field2406.method982(-9570); var2 != null; var2 = (class113) this.field2406.method981(-1)) {
            class113 var3 = new class113((int) var2.field2213);
            this.field2407.method986((long) var2.field1929, true, var3);
        }
        if (!arg0) {
            field2397 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZI)I")
    public final int method1086(boolean arg0, int arg1) {
        field2398++;
        if (this.field2406 == null) {
            return this.field2410;
        }
        if (!arg0) {
            this.method1080(36, (class249) null);
        }
        class113 var3 = (class113) this.field2406.method987(-124, (long) arg1);
        return var3 == null ? this.field2410 : var3.field1929;
    }
}

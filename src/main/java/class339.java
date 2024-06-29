import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class339 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lwm;")
    private class399 field5097 = new class399(64);

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "Lwm;")
    public class399 field5111 = new class399(64);

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "Lph;")
    public class459 field5110;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Lph;")
    private class459 field5103;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5106;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "[I")
    public static int[] field5107;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILph;Lrv;Lph;Lph;)Z")
    public static final boolean method2126(int arg0, class459 arg1, class73 arg2, class459 arg3, class459 arg4) {
        field5104++;
        class383.field5597 = arg3;
        class119.field2095 = arg4;
        if (arg0 == 34) {
            class470.field6983 = arg2;
            class80.field1588 = arg1;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static void method2127(byte arg0) {
        int var1 = -120 % ((arg0 - 20) / 46);
        field5107 = null;
        field5106 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lms;B)V")
    public static final void method2128(class535 arg0, byte arg1) {
        field5108++;
        int var2 = arg0.field7856 - class62.field1268;
        int var3 = arg0.field7854 * 128 + arg0.method2241(-65) * 64;
        int var4 = arg0.field7810 * 128 + arg0.method2241(-30) * 64;
        arg0.field6073 += (var3 - arg0.field6073) / var2;
        arg0.field7872 = 0;
        arg0.field6078 += (var4 - arg0.field6078) / var2;
        if (arg0.field7821 == 0) {
            arg0.method3166(0, 8192);
        }
        if (arg0.field7821 == 1) {
            arg0.method3166(0, 12288);
        }
        if (arg0.field7821 == 2) {
            arg0.method3166(0, 0);
        }
        if (arg1 >= -48) {
            field5106 = null;
        }
        if (arg0.field7821 == 3) {
            arg0.method3166(0, 4096);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
    public final void method2129(int arg0, int arg1) {
        if (arg1 != -13631) {
            this.method2131((byte) 68);
        }
        class399 var3 = this.field5097;
        synchronized (this.field5097) {
            this.field5097.method2471((byte) 98, arg0);
        }
        field5109++;
        class399 var4 = this.field5111;
        synchronized (this.field5111) {
            this.field5111.method2471((byte) 98, arg0);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIB)B")
    public static final byte method2130(int arg0, int arg1, byte arg2) {
        if (arg2 <= 111) {
            return -93;
        }
        field5102++;
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
    public final void method2131(byte arg0) {
        class399 var2 = this.field5097;
        synchronized (this.field5097) {
            if (arg0 <= 109) {
                field5099 = -24;
            }
            this.field5097.method2475((byte) 67);
        }
        field5098++;
        class399 var3 = this.field5111;
        synchronized (this.field5111) {
            this.field5111.method2475((byte) 67);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIZ)V")
    public final void method2132(int arg0, int arg1, boolean arg2) {
        this.field5097 = new class399(arg0);
        if (!arg2) {
            this.method2133((byte) -58);
        }
        field5096++;
        this.field5111 = new class399(arg1);
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
    public final void method2133(byte arg0) {
        class399 var2 = this.field5097;
        synchronized (this.field5097) {
            this.field5097.method2477(89);
        }
        field5100++;
        class399 var3 = this.field5111;
        synchronized (this.field5111) {
            this.field5111.method2477(-128);
        }
        if (arg0 > -73) {
            field5106 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Laq;")
    public final class113 method2134(int arg0, byte arg1) {
        field5101++;
        class399 var3 = this.field5097;
        class113 var4;
        synchronized (this.field5097) {
            var4 = (class113) this.field5097.method2478(1, (long) arg0);
        }
        if (arg1 != 84) {
            this.method2132(123, -75, true);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field5103;
        byte[] var6;
        synchronized (this.field5103) {
            var6 = this.field5103.method2757(34, arg0, (byte) -123);
        }
        class113 var7 = new class113();
        var7.field2050 = this;
        if (var6 != null) {
            var7.method939((byte) 127, new class289(var6));
        }
        class399 var8 = this.field5097;
        synchronized (this.field5097) {
            this.field5097.method2472(116, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lkp;ILph;Lph;)V")
    public class339(class341 arg0, int arg1, class459 arg2, class459 arg3) {
        this.field5110 = arg3;
        this.field5103 = arg2;
        this.field5103.method2763(34, -3);
    }

    static {
        new class309("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field5099 = 104;
        field5106 = "";
        field5105 = 0;
        field5107 = new int[4096];
    }
}

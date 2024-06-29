import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class134 {

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public int field2154 = class268.method1779((byte) 55);

    @OriginalMember(owner = "client!an", name = "e", descriptor = "Ljava/lang/String;")
    public String field2147;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public int field2151;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public int field2149;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "Ljava/lang/String;")
    public String field2152;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Ljava/lang/String;")
    public String field2144;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "Ljava/lang/String;")
    public String field2150;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public int field2146;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "Ljava/lang/String;")
    public String field2145;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public int field2153;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IB)V")
    public final void method1082(String arg0, String arg1, String arg2, int arg3, String arg4, int arg5, String arg6, int arg7, byte arg8) {
        this.field2154 = class268.method1779((byte) 55);
        field2143++;
        this.field2144 = arg1;
        this.field2145 = arg4;
        if (arg8 > -44) {
            method1083(true, (byte) 81, null);
        }
        this.field2152 = arg6;
        this.field2153 = arg3;
        this.field2150 = arg0;
        this.field2146 = arg5;
        this.field2149 = class199.field3403;
        this.field2147 = arg2;
        this.field2151 = arg7;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class134(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field2147 = arg7;
        this.field2151 = arg0;
        this.field2149 = class199.field3403;
        this.field2152 = arg5;
        this.field2144 = arg3;
        this.field2150 = arg2;
        this.field2146 = arg1;
        this.field2145 = arg4;
        this.field2153 = arg6;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZBLraa;)V")
    public static final void method1083(boolean arg0, byte arg1, class353 arg2) {
        field2148++;
        int var3 = arg2.field5351 == 0 ? arg2.field5230 : arg2.field5351;
        int var4 = arg2.field5358 == 0 ? arg2.field5280 : arg2.field5358;
        if (arg1 <= 51) {
            return;
        }
        class488.method2968(arg0, arg2.field5349, class158.field2453[arg2.field5349 >> 16], var3, (byte) -76, var4);
        if (arg2.field5335 != null) {
            class488.method2968(arg0, arg2.field5349, arg2.field5335, var3, (byte) -76, var4);
        }
        class520 var5 = (class520) class36.field340.method3512(true, (long) arg2.field5349);
        if (var5 != null) {
            class382.method2404(-125, arg0, var5.field7511, var4, var3);
        }
    }
}

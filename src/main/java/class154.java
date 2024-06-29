import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class154 {

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public int field2181 = class85.method481((byte) -110);

    @OriginalMember(owner = "client!np", name = "m", descriptor = "Ljava/lang/String;")
    public String field2187;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "Ljava/lang/String;")
    public String field2182;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "Ljava/lang/String;")
    public String field2184;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "I")
    public int field2186;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    public int field2185;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "Ljava/lang/String;")
    public String field2178;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "Ljava/lang/String;")
    public String field2180;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public int field2183;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "I")
    public int field2188;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field2179 = 0;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "[[[I")
    public static int[][][] field2177;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIBLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 12)
    public final void method1097(int arg0, int arg1, byte arg2, String arg3, String arg4, String arg5, String arg6, String arg7, int arg8) {
        if (arg2 != -2) {
            this.method1097(63, 103, (byte) -10, null, null, null, null, null, -121);
        }
        field2175++;
        this.field2181 = class85.method481((byte) -77);
        this.field2178 = arg3;
        this.field2183 = arg8;
        this.field2187 = arg7;
        this.field2185 = class45.field685;
        this.field2186 = arg0;
        this.field2188 = arg1;
        this.field2184 = arg6;
        this.field2182 = arg4;
        this.field2180 = arg5;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILrg;B)V", line = 36)
    public static final void method1098(int arg0, class523 arg1, byte arg2) {
        field2176++;
        if (arg2 != 51) {
            return;
        }
        int var3 = -1;
        int var4 = 0;
        if (class45.field685 < arg1.field7359) {
            class507.method2881(arg1, (byte) -66);
        } else if (arg1.field7411 >= class45.field685) {
            class398.method2473(arg1, (byte) 73);
        } else {
            client.method561(arg1, (byte) 123, false);
            var3 = class309.field4559;
            var4 = class391.field5909;
        }
        if (arg1.field7895 < 512 || arg1.field7896 < 512 || arg1.field7895 >= (class72.field1144 - 1) * 512 || (class668.field9444 * 512 - 512) <= arg1.field7896) {
            var3 = -1;
            var4 = 0;
            arg1.field7389 = -1;
            arg1.field7353 = -1;
            arg1.field7328 = null;
            arg1.field7360 = -1;
            arg1.field7411 = 0;
            arg1.field7359 = 0;
            arg1.field7895 = arg1.field7430[0] * 512 + arg1.method422((byte) -49) * 256;
            arg1.field7896 = arg1.field7429[0] * 512 + (arg1.method422((byte) 53) * 256);
            arg1.method2963(false);
        }
        if (class321.field4681 == arg1 && (arg1.field7895 < 6144 || arg1.field7896 < 6144 || arg1.field7895 >= (class72.field1144 - 12) * 512 || (class668.field9444 - 12) * 512 <= arg1.field7896)) {
            var4 = 0;
            arg1.field7328 = null;
            var3 = -1;
            arg1.field7389 = -1;
            arg1.field7411 = 0;
            arg1.field7359 = 0;
            arg1.field7353 = -1;
            arg1.field7360 = -1;
            arg1.field7895 = arg1.field7430[0] * 512 + (arg1.method422((byte) -45) * 256);
            arg1.field7896 = arg1.field7429[0] * 512 + arg1.method422((byte) -113) * 256;
            arg1.method2963(false);
        }
        int var5 = class221.method1386(arg1, (byte) -109);
        class261.method1571(arg2 - 44, arg1);
        class704.method3941((byte) 61, arg1, var3, var4, var5);
        class582.method3339(var3, (byte) -57, arg1);
        class202.method1309(83, arg1);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V", line = 107)
    public static void method1099(int arg0) {
        field2177 = null;
        if (arg0 != -1) {
            method1098(122, null, (byte) 78);
        }
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 119)
    public class154(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field2187 = arg3;
        this.field2182 = arg7;
        this.field2184 = arg5;
        this.field2186 = arg6;
        this.field2185 = class45.field685;
        this.field2178 = arg2;
        this.field2180 = arg4;
        this.field2183 = arg1;
        this.field2188 = arg0;
    }
}

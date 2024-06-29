import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class286 implements class316 {

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "Lur;")
    public class564 field4223;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public int field4210;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public int field4214;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public int field4225;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "Lcf;")
    public class631 field4224;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public int field4211;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public int field4215;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Ljava/lang/String;")
    public String field4216;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public int field4227;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public int field4217;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public int field4226;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public int field4222;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public int field4220;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "[I")
    public static int[] field4219 = new int[25];

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "[I")
    public static int[] field4212;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)Lhv;", line = 7)
    public final class546 method1557(byte arg0) {
        field4213++;
        if (arg0 >= -35) {
            this.field4216 = null;
        }
        return class537.field7304;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 28)
    public static void method1825(int arg0) {
        field4219 = null;
        if (arg0 == -17122) {
            field4212 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BII)Z", line = 43)
    public static final boolean method1826(byte arg0, int arg1, int arg2) {
        field4221++;
        if (arg0 != -9) {
            method1825(-1);
        }
        return (arg2 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)V", line = 59)
    public static final void method1827(int arg0, int arg1, int arg2) {
        field4218++;
        if (arg2 > -20) {
            return;
        }
        int var3 = class548.field7413.method1696(class474.field6563.method2780(120, class38.field589), 0);
        int var5;
        if (class668.field9373) {
            for (class81 var4 = (class81) class57.field805.method697(0); var4 != null; var4 = (class81) class57.field805.method699(true)) {
                int var6;
                if (var4.field1151 == 1) {
                    var6 = class244.method1574((class275) var4.field1155.field1176.field4146, (byte) -93);
                } else {
                    var6 = class300.method1900(var4, 2);
                }
                if (var6 > var3) {
                    var3 = var6;
                }
            }
            var5 = class491.field6811 * 16 + 21;
            var3 += 8;
            class337.field4890 = (class38.field591 ? 26 : 22) + class491.field6811 * 16;
        } else {
            for (class275 var7 = (class275) class280.field4138.method2551((byte) -108); var7 != null; var7 = (class275) class280.field4138.method2542(-110)) {
                int var10 = class244.method1574(var7, (byte) -58);
                if (var10 > var3) {
                    var3 = var10;
                }
            }
            var3 += 8;
            class337.field4890 = class746.field10297 * 16 + (class38.field591 ? 26 : 22);
            var5 = class746.field10297 * 16 + 21;
        }
        int var8 = arg1 - var3 / 2;
        if (class593.field8019 < var3 + var8) {
            var8 = class593.field8019 - var3;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        if (class140.field2048 < (var5 + arg0)) {
            var9 = class140.field2048 - var5;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        class245.field3317 = var8;
        class356.field5213 = var9;
        class442.field6220 = var3;
        class526.field7216 = true;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Ljava/lang/String;Lur;Lcf;IIIIIIIIII)V", line = 145)
    public class286(String arg0, class564 arg1, class631 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field4223 = arg1;
        this.field4210 = arg4;
        this.field4214 = arg3;
        this.field4225 = arg9;
        this.field4224 = arg2;
        this.field4211 = arg12;
        this.field4215 = arg5;
        this.field4216 = arg0;
        this.field4227 = arg6;
        this.field4217 = arg10;
        this.field4226 = arg7;
        this.field4222 = arg11;
        this.field4220 = arg8;
    }
}

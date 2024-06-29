import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class45 {

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "J")
    public long field776 = 0L;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field779 = 0;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "Ljava/lang/String;")
    public static String field780 = " has logged out.";

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public int field768;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public int field770;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public int field772;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public int field773;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public int field774;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public int field781;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public int field784;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "Ldg;")
    public class320 field782;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Lkc;")
    public static class36 field769;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)I", line = 6)
    public static final int method360(int arg0, int arg1) {
        field778++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1 >= -47) {
            field780 = (String) null;
        }
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V", line = 35)
    public static void method361(byte arg0) {
        field769 = null;
        field780 = null;
        if (arg0 != -91) {
            field780 = (String) null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)V", line = 46)
    public static final void method362(int arg0, int arg1) {
        field777++;
        class4 var2 = class67.method510(arg0 ^ 0x6, arg0, arg1);
        var2.method6(255);
    }
}

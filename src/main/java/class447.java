import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class447 extends class264 {

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "Leb;")
    public class395 field6542 = new class395();

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field6538 = -1;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "Lnr;")
    public static class450 field6539;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "[I")
    public static int[] field6540;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B[I)Ljava/lang/String;")
    public static final String method2750(byte arg0, int[] arg1) {
        field6543++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class252.field3706;
        int var4 = 0;
        if (arg0 != -72) {
            method2752(45);
        }
        while (arg1.length > var4) {
            class129 var5 = class38.method340((byte) -105, arg1[var4]);
            if (var5.field1715 != -1) {
                class285 var6 = (class285) class322.field4751.method2310((byte) -125, (long) var5.field1715);
                if (var6 == null) {
                    class144 var7 = class144.method991(class257.field3813, var5.field1715, 0);
                    if (var7 != null) {
                        var6 = class74.field942.method100(var7, true);
                        class322.field4751.method2299(true, var6, (long) var5.field1715);
                    }
                }
                if (var6 != null) {
                    class214.field3022[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
            var4++;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public static void method2751(boolean arg0) {
        field6540 = null;
        if (arg0) {
            field6539 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
    public static final void method2752(int arg0) {
        class44.field588.method2313(97);
        field6541++;
        if (arg0 >= -125) {
            field6538 = -100;
        }
    }
}

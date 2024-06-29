import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class238 {

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Li;")
    private class181 field4256 = new class181();

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "Lwd;")
    private class65 field4260 = new class65();

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    private int field4258;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    private int field4261;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Ldl;")
    private class31 field4259;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Lli;")
    public static class185 field4249 = class245.method1649("(U0a )2 via: ", -122);

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "[B")
    public static byte[] field4250 = new byte[520];

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Llc;")
    public static class138 field4246;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "[Lp;")
    public static class82[] field4247;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)Lua;")
    public final class73 method1614(int arg0) {
        field4253++;
        if (arg0 != 1) {
            this.method1619(-124);
        }
        return this.field4259.method189(0);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IJ)Li;")
    public final class181 method1615(int arg0, long arg1) {
        field4255++;
        class181 var4 = (class181) this.field4259.method195(arg0 + 28277, arg1);
        if (var4 != null) {
            this.field4260.method436((byte) -86, var4);
        }
        if (arg0 != -28166) {
            field4251 = -75;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    public static void method1616(int arg0) {
        field4247 = null;
        field4246 = null;
        field4250 = null;
        field4249 = null;
        if (arg0 != 14344) {
            field4246 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lti;III)V")
    public static final void method1617(class188 arg0, int arg1, int arg2, int arg3) {
        field4254++;
        if (arg2 != 4125) {
            field4251 = -9;
        }
        if (arg0.field2655 == arg1 && arg1 != -1) {
            class2 var4 = class253.method1712(arg1, -121);
            int var5 = var4.field58;
            if (var5 == 1) {
                arg0.field2658 = 0;
                arg0.field2691 = arg3;
                arg0.field2663 = 0;
                arg0.field2673 = 0;
                class31.method188(-1, var4, arg0.field2687, class241.field4310 == arg0, arg0.field2663, arg0.field2694);
            }
            if (var5 == 2) {
                arg0.field2673 = 0;
                return;
            }
        } else if (arg1 == -1 || arg0.field2655 == -1 || class253.method1712(arg1, -126).field32 >= class253.method1712(arg0.field2655, -128).field32) {
            arg0.field2673 = 0;
            arg0.field2658 = 0;
            arg0.field2663 = 0;
            arg0.field2691 = arg3;
            arg0.field2655 = arg1;
            arg0.field2661 = arg0.field2686;
            if (arg0.field2655 == -1) {
                return;
            }
            class31.method188(-1, class253.method1712(arg0.field2655, -121), arg0.field2687, class241.field4310 == arg0, arg0.field2663, arg0.field2694);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)Lua;")
    public final class73 method1618(byte arg0) {
        if (arg0 == -67) {
            field4252++;
            return this.field4259.method192(115);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
    public final void method1619(int arg0) {
        field4248++;
        this.field4260.method442((byte) 109);
        if (arg0 != -18576) {
            this.field4261 = -104;
        }
        this.field4259.method194(arg0 + 19699);
        this.field4256 = new class181();
        this.field4261 = this.field4258;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
    public class238(int arg0) {
        this.field4258 = arg0;
        int var2 = 1;
        this.field4261 = arg0;
        while (var2 + var2 < arg0) {
            var2 += var2;
        }
        this.field4259 = new class31(var2);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Li;BJ)V")
    public final void method1620(class181 arg0, byte arg1, long arg2) {
        field4257++;
        if (this.field4261 == 0) {
            class181 var5 = this.field4260.method441((byte) 113);
            var5.method476(105);
            var5.method1276((byte) 82);
            if (this.field4256 == var5) {
                class181 var6 = this.field4260.method441((byte) -91);
                var6.method476(-114);
                var6.method1276((byte) 82);
            }
        } else {
            this.field4261--;
        }
        this.field4259.method190(arg0, (byte) -95, arg2);
        if (arg1 != 49) {
            this.method1619(-51);
        }
        this.field4260.method436((byte) -86, arg0);
    }
}

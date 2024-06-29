import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public abstract class class380 extends class404 {

    @OriginalMember(owner = "client!fha", name = "C", descriptor = "Ljr;")
    public static class112 field5523 = new class112(64);

    @OriginalMember(owner = "client!fha", name = "H", descriptor = "Lkf;")
    public static class255 field5528 = new class255();

    @OriginalMember(owner = "client!fha", name = "z", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!fha", name = "A", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!fha", name = "B", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!fha", name = "D", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!fha", name = "E", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!fha", name = "F", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!fha", name = "G", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!fha", name = "I", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2405(int arg0) {
        ++field5520;
        class470 var1 = null;
        try {
            var1 = class158.method1205("2", -1141472112);
            class215 var2 = new class215(class14.field245 * 6 + 3);
            var2.method1526(false, 1);
            var2.method1485((byte) 107, class14.field245);
            int var3 = -4 % ((-12 - arg0) / 38);
            for (int var4 = 0; ~class377.field5346.length < ~var4; ++var4) {
                if (class269.field3797[var4]) {
                    var2.method1485((byte) 107, var4);
                    var2.method1539((byte) 124, class377.field5346[var4]);
                }
            }
            var1.method2770((byte) 117, 0, var2.field3109, var2.field3066);
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method2769(false);
            }
        } catch (Exception var5) {
        }
        class699.field9461 = class554.method3190(-117);
        class129.field2172 = false;
    }

    @OriginalMember(owner = "client!fha", name = "c", descriptor = "(B)Z", line = 49)
    public final boolean method937(byte arg0) {
        if (arg0 > -51) {
            return false;
        } else {
            ++field5524;
            class474 var2 = class637.method3623(super.field5926, super.field5922 >> class130.field2185, super.field5933 >> class130.field2185);
            return var2 != null && var2.field6623.field6829 ? class323.method2069(super.field5933 >> class130.field2185, var2.field6623.method38(true) + this.method38(true), super.field5926, (byte) -79, super.field5922 >> class130.field2185) : class393.method2471(super.field5926, super.field5922 >> class130.field2185, (byte) -97, super.field5933 >> class130.field2185);
        }
    }

    @OriginalMember(owner = "client!fha", name = "h", descriptor = "(I)Z", line = 68)
    public final boolean method939(int arg0) {
        if (arg0 != 0) {
            method2406(79);
        }
        ++field5525;
        return class196.field2890[(super.field5922 >> class130.field2185) + -class134.field2256 + class708.field9611][(super.field5933 >> class130.field2185) + -class492.field6813 + class708.field9611];
    }

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "(Z)V", line = 79)
    public final void method44(boolean arg0) {
        if (!arg0) {
            field5522 = 119;
        }
        ++field5521;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "(I)V", line = 94)
    public static void method2406(int arg0) {
        if (arg0 > -126) {
            field5522 = 118;
        }
        field5523 = null;
        field5528 = null;
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "([Lab;I)I", line = 105)
    public final int method935(class669[] arg0, int arg1) {
        ++field5526;
        int var3 = -79 % ((-14 - arg1) / 61);
        return this.method2523(arg0, super.field5922 >> class130.field2185, -2, super.field5933 >> class130.field2185);
    }

    @OriginalMember(owner = "client!fha", name = "j", descriptor = "(I)Z", line = 117)
    public final boolean method35(int arg0) {
        if (arg0 > -65) {
            field5522 = -84;
        }
        ++field5529;
        return false;
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lha;IZLga;IBI)V", line = 130)
    public final void method33(class59 arg0, int arg1, boolean arg2, class404 arg3, int arg4, byte arg5, int arg6) {
        if (arg5 > -106) {
            method2405(-8);
        }
        ++field5527;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(IIIII)V", line = 142)
    public class380(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field5922 = arg0;
        super.field5926 = (byte) arg3;
        super.field5927 = arg1;
        super.field5921 = (byte) arg4;
        super.field5933 = arg2;
    }
}

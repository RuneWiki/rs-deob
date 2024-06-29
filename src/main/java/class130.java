import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class130 {

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public int field1608 = -1;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public int field1613 = -1;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "Lifa;")
    public static class450 field1611 = new class450();

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "[I")
    public static int[] field1614 = new int[3];

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "[I")
    public int[] field1612;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIFZI)[I", line = 4)
    public static final int[] method973(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, boolean arg6, int arg7) {
        field1610++;
        int[] var8 = new int[arg0];
        class337 var9 = new class337();
        var9.field4159 = arg2;
        var9.field4167 = arg6;
        var9.field4172 = arg3;
        var9.field4162 = arg1;
        var9.field4170 = (int) (arg5 * 4096.0F);
        var9.field4173 = arg7;
        var9.method493((byte) -62);
        class216.method1349(false, arg4, arg0);
        var9.method1996(0, (byte) 123, var8);
        return var8;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Les;B)V", line = 25)
    public final void method974(class403 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2396((byte) 27);
            if (var3 == 0) {
                field1607++;
                int var4 = 121 / ((arg1 + 46) / 60);
                return;
            }
            this.method975(arg0, var3, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Les;IB)V", line = 46)
    private final void method975(class403 arg0, int arg1, byte arg2) {
        if (arg2 != -123) {
            this.method975(null, 3, (byte) -72);
        }
        if (arg1 == 1) {
            this.field1608 = arg0.method2390((byte) 33);
        } else if (arg1 == 2) {
            this.field1612 = new int[arg0.method2396((byte) -98)];
            for (int var4 = 0; var4 < this.field1612.length; var4++) {
                this.field1612[var4] = arg0.method2390((byte) 1);
            }
        } else if (arg1 == 3) {
            this.field1613 = arg0.method2396((byte) 107);
        }
        field1609++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V", line = 94)
    public static void method976(byte arg0) {
        field1614 = null;
        field1611 = null;
        if (arg0 != -19) {
            field1614 = null;
        }
    }
}

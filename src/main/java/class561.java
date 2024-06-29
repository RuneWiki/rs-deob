import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class561 {

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "S")
    public short field7322;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "I")
    public int field7326;

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
    public int field7323;

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "S")
    public short field7330;

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "Z")
    public boolean field7320;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "B")
    public byte field7324;

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "I")
    public int field7333;

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "I")
    public int field7321;

    @OriginalMember(owner = "client!fba", name = "m", descriptor = "S")
    public short field7331;

    @OriginalMember(owner = "client!fba", name = "n", descriptor = "I")
    public int field7332;

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
    public static int field7329 = 0;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIBIIIIIII)V")
    public static final void method3001(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7325++;
        class549 var10 = null;
        if (arg2 != 8) {
            method3001(118, -97, (byte) 29, -50, -30, 28, -69, -28, -30, -71);
        }
        for (class549 var11 = (class549) class354.field4574.method2090(true); var11 != null; var11 = (class549) class354.field4574.method2088(-152)) {
            if (var11.field7123 == arg4 && var11.field7116 == arg7 && var11.field7125 == arg3 && var11.field7126 == arg5) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class549();
            var10.field7116 = arg7;
            var10.field7125 = arg3;
            var10.field7123 = arg4;
            var10.field7126 = arg5;
            if (arg7 >= 0 && arg3 >= 0 && class611.field8258 > arg7 && arg3 < class656.field9155) {
                class258.method1615(true, var10);
            }
            class354.field4574.method2087(var10, 2);
        }
        var10.field7114 = arg6;
        var10.field7121 = arg0;
        var10.field7120 = arg1;
        var10.field7124 = arg9;
        var10.field7117 = arg8;
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field7322 = (short) arg6;
        this.field7326 = arg11;
        this.field7323 = arg3;
        this.field7330 = (short) arg4;
        this.field7320 = arg10;
        this.field7324 = (byte) arg8;
        this.field7333 = arg2;
        this.field7321 = arg0;
        this.field7331 = (short) arg5;
        this.field7332 = arg1;
    }
}

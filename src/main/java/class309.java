import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class309 extends class467 {

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public int field4626 = -1;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public int field4631 = 0;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public int field4623;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public int field4624;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public int field4628;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public int field4629;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    public int field4633;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public int field4634;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public int field4636;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
    public int field4637;

    static {
        new class375("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIII)V", line = 9)
    public static final void method1991(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4625++;
        if (arg7 >= 1 && arg1 >= 1 && (class96.field1403 - 2) >= arg7 && (class485.field7122 - 2) >= arg1) {
            int var9 = arg6;
            if (arg6 < 3 && class42.method333(arg1, arg7, 0)) {
                var9 = arg6 + 1;
            }
            if (!class96.field1399.method1734(120, class441.field6563) && !class411.method2500(var9, class430.field6399, arg7, arg1, (byte) 85)) {
                return;
            }
            if (class380.field5802 == null) {
                return;
            }
            class110.field1550.method1171(class444.field6605[arg6], class337.field5242, arg3, arg7, arg6, arg1, true);
            if (arg4 >= 0) {
                boolean var10 = class96.field1399.field5196;
                class96.field1399.field5196 = true;
                class110.field1550.method1179(class337.field5242, arg6, arg7, var9, (byte) -48, arg2, arg5, arg1, arg4, class444.field6605[arg6], arg0);
                class96.field1399.field5196 = var10;
            }
        }
        if (arg8 != -29070) {
            field4630 = 126;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V", line = 66)
    public static final void method1992(byte arg0) {
        field4627++;
        class1.field16 = null;
        int var1 = 124 % ((-arg0 - 65) / 48);
        class369.method2302(class7.field112, 0, class486.field7136, 0, -1, class329.field5062, 0, 0, -111);
        if (class1.field16 != null) {
            class169.method1192(class7.field112, class152.field2205, 0, -1412584499, 0, class1.field16, (byte) -35, class439.field6543.field7383, class486.field7136, class444.field6604);
            class1.field16 = null;
        }
    }
}

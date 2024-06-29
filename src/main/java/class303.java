import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class303 extends class91 {

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    private int field4131;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
    private int field4138;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    private int field4128;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    private int field4133;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
    public static int field4137;

    static {
        new class368("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V", line = 10)
    public final void method363(int arg0, int arg1, int arg2) {
        ++field4129;
        int var4 = this.field4128 * arg2 >> 12;
        int var5 = this.field4133 * arg2 >> 12;
        int var6 = this.field4131 * arg1 >> 12;
        if (arg0 != 4) {
            this.method367(-46, 60, -61);
        }
        int var7 = this.field4138 * arg1 >> 12;
        class188.method1309(var6, var5, super.field1271, super.field1270, var7, var4, (byte) 62);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ)V", line = 29)
    public static final void method1836(int arg0, boolean arg1) {
        class260.field3592.method2531(arg0, 112);
        if (arg1) {
            field4135 = 49;
        }
        ++field4137;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([II)Ljava/lang/String;", line = 42)
    public static final String method1837(int[] arg0, int arg1) {
        ++field4130;
        StringBuffer var2 = new StringBuffer();
        int var3 = class66.field917;
        for (int var4 = 0; ~var4 > ~arg0.length; ++var4) {
            class11 var5 = class75.method584(arg0[var4], arg1 + 3686);
            if (~var5.field87 != 0) {
                class77 var6 = (class77) class412.field5729.method2529(arg1 + 3560, (long) var5.field87);
                if (var6 == null) {
                    class96 var7 = class96.method739(class112.field1726, var5.field87, 0);
                    if (var7 != null) {
                        var6 = class354.field4765.method199(var7, true);
                        class412.field5729.method2527(arg1 ^ 3501, (long) var5.field87, var6);
                    }
                }
                if (var6 != null) {
                    class406.field5627[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    ++var3;
                }
            }
        }
        if (arg1 != -3560) {
            field4135 = -49;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZBZ)V", line = 94)
    public static final void method1838(boolean arg0, byte arg1, boolean arg2) {
        if (arg0) {
            --class5.field49;
            if (class5.field49 == 0) {
                class21.field273 = null;
            }
        }
        ++field4134;
        int var3 = -8 / ((-33 - arg1) / 37);
        if (arg2) {
            --class80.field1117;
            if (class80.field1117 == 0) {
                class119.field1810 = null;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)V", line = 130)
    public final void method367(int arg0, int arg1, int arg2) {
        if (arg1 > 59) {
            ++field4132;
            int var4 = this.field4128 * arg2 >> 12;
            int var5 = this.field4133 * arg2 >> 12;
            int var6 = this.field4131 * arg0 >> 12;
            int var7 = this.field4138 * arg0 >> 12;
            class341.method2081(var4, var5, var7, super.field1275, 9943, var6);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", line = 150)
    public static final void method1839(String arg0, int arg1, int arg2, int arg3, String arg4, int arg5, String arg6, String arg7) {
        for (int var8 = 99; var8 > 0; --var8) {
            class259.field3589[var8] = class259.field3589[var8 - 1];
            class432.field6060[var8] = class432.field6060[var8 - 1];
            class320.field4362[var8] = class320.field4362[var8 + -1];
            class430.field5989[var8] = class430.field5989[var8 + -1];
            class100.field1389[var8] = class100.field1389[var8 + -1];
            class403.field5566[var8] = class403.field5566[var8 - 1];
            class68.field950[var8] = class68.field950[var8 - 1];
        }
        ++field4127;
        class259.field3589[0] = arg5;
        class432.field6060[0] = arg3;
        class320.field4362[0] = arg0;
        class430.field5989[0] = arg7;
        class100.field1389[0] = arg6;
        class403.field5566[0] = arg4;
        class68.field950[0] = arg2;
        class405.field5606 = class260.field3595;
        ++class5.field57;
        if (arg1 != -1) {
            field4135 = -112;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZII)V", line = 185)
    public final void method362(boolean arg0, int arg1, int arg2) {
        ++field4136;
        int var4 = this.field4128 * arg1 >> 12;
        int var5 = this.field4133 * arg1 >> 12;
        int var6 = this.field4131 * arg2 >> 12;
        int var7 = this.field4138 * arg2 >> 12;
        class442.method2738(var5, super.field1270, super.field1271, var6, (byte) -91, var4, super.field1275, var7);
        if (arg0) {
            this.method363(48, 97, 20);
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(IIIIIII)V", line = 204)
    public class303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4131 = arg1;
        this.field4138 = arg3;
        this.field4128 = arg0;
        this.field4133 = arg2;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class182 {

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field2750 = 0;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field2748 = 0;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1302(int arg0, String arg1, int arg2) {
        field2749++;
        int var3 = class143.field1996;
        int[] var4 = class464.field6536;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class39 var7 = class112.field1570[var4[var6]];
            if (var7 != null && class262.field3781 != var7 && var7.field485 != null && var7.field485.equalsIgnoreCase(arg1)) {
                if (arg2 == 1) {
                    class336.method2111(class137.field1904, 102);
                    class257.field3677++;
                    class311.field4403.method1187(var4[var6], (byte) -18);
                    class311.field4403.method1155(-3355, 0);
                } else if (arg2 == 4) {
                    class336.method2111(class108.field1509, arg0 ^ 0xFFFFFDDF);
                    class238.field3474++;
                    class311.field4403.method1150(-123, var4[var6]);
                    class311.field4403.method1135(4, 0);
                } else if (arg2 == 5) {
                    class336.method2111(class137.field1911, 108);
                    class490.field6919++;
                    class311.field4403.method1140(var4[var6], 6293);
                    class311.field4403.method1135(arg0 ^ 0xFFFFFDBA, 0);
                } else if (arg2 == 6) {
                    class223.field3220++;
                    class336.method2111(class370.field5098, arg0 ^ 0xFFFFFDC7);
                    class311.field4403.method1187(var4[var6], (byte) -18);
                    class311.field4403.method1180((byte) -110, 0);
                } else if (arg2 == 7) {
                    class336.method2111(class304.field4322, 108);
                    class117.field1626++;
                    class311.field4403.method1180((byte) -110, 0);
                    class311.field4403.method1173(var4[var6], (byte) 125);
                }
                var5 = true;
                break;
            }
        }
        if (arg0 != -578) {
            field2752 = -81;
        }
        if (!var5) {
            class316.method2006(arg0 ^ 0xFFFFFDF3, class334.field4647.method1078(class66.field967, 100) + arg1);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BII[I[I)V")
    public static final void method1303(byte arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        field2753++;
        if (arg0 != 102) {
            field2751 = 76;
        }
        if (arg1 >= arg2) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        int var6 = arg1;
        int var7 = arg3[var5];
        arg3[var5] = arg3[arg2];
        arg3[arg2] = var7;
        int var8 = arg4[var5];
        arg4[var5] = arg4[arg2];
        arg4[arg2] = var8;
        for (int var9 = arg1; var9 < arg2; var9++) {
            if (arg3[var9] < ((var9 & 0x1) + var7)) {
                int var10 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6] = var10;
                int var11 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6++] = var11;
            }
        }
        arg3[arg2] = arg3[var6];
        arg3[var6] = var7;
        arg4[arg2] = arg4[var6];
        arg4[var6] = var8;
        method1303((byte) 102, arg1, var6 - 1, arg3, arg4);
        method1303((byte) 102, var6 + 1, arg2, arg3, arg4);
    }

    static {
        new class151("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
    }
}

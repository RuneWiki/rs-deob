import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class523 extends class217 {

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public static int field7481 = 0;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "[[I")
    public static int[][] field7482 = new int[6][];

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public int field7476;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "Lcw;")
    public class157 field7478;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "[B")
    public byte[] field7480;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method3082(byte arg0, String arg1) {
        ++field7477;
        if (class606.field9002) {
            boolean var2 = false;
            int var3 = class551.field8224;
            int[] var4 = class314.field4332;
            for (int var5 = 0; ~var5 > ~var3; ++var5) {
                class373 var6 = class293.field4036[var4[var5]];
                if (var6 != null && class541.field8119 != var6 && var6.field5138 != null && var6.field5138.equalsIgnoreCase(arg1)) {
                    ++class317.field4357;
                    class402.method2367(class111.field1572, (byte) 79);
                    class112.field1589.method1027(255, class193.field2865);
                    class112.field1589.method1058(602643080, class205.field3027);
                    class112.field1589.method1012(976668456, var4[var5]);
                    class112.field1589.method1054(0, true);
                    class112.field1589.method1017(class626.field9224, 428082024);
                    class11.method50(var6.field1957[0], var6.method940(-1), true, (byte) 121, var6.field1955[0], var6.method940(-1), -2, 0, 0);
                    var2 = true;
                    break;
                }
            }
            if (!var2) {
                class568.method3389(67, class536.field7980.method3408(90, class63.field795) + arg1);
            }
            if (class606.field9002) {
                class429.method2511(true);
            }
            if (arg0 != 24) {
                method3085(25);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)Z")
    public static final boolean method3083(byte arg0) {
        if (arg0 != -115) {
            field7481 = -93;
        }
        ++field7483;
        return class219.field3190 != 0 ? true : class129.field1796.method1082(false);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)I")
    public final int method209(byte arg0) {
        ++field7475;
        if (super.field3178) {
            return 0;
        } else {
            return arg0 != 40 ? 4 : 100;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)[B")
    public final byte[] method207(int arg0) {
        ++field7479;
        if (super.field3178) {
            throw new RuntimeException();
        } else {
            return arg0 != 192 ? null : this.field7480;
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)V")
    public static final void method3084(byte arg0) {
        if (arg0 > 0) {
            method3083((byte) -59);
        }
        if (~class331.field4572.toLowerCase().indexOf("microsoft") != 0) {
            class303.field4178[187] = 27;
            class303.field4178[186] = 57;
            class303.field4178[188] = 71;
            class303.field4178[191] = 73;
            class303.field4178[192] = 58;
            class303.field4178[220] = 74;
            class303.field4178[222] = 59;
            class303.field4178[190] = 72;
            class303.field4178[219] = 42;
            class303.field4178[189] = 26;
            class303.field4178[223] = 28;
            class303.field4178[221] = 43;
        } else {
            class303.field4178[47] = 73;
            class303.field4178[44] = 71;
            class303.field4178[93] = 43;
            class303.field4178[92] = 74;
            if (class331.field4580 == null) {
                class303.field4178[192] = 58;
                class303.field4178[222] = 59;
            } else {
                class303.field4178[222] = 58;
                class303.field4178[520] = 59;
                class303.field4178[192] = 28;
            }
            class303.field4178[45] = 26;
            class303.field4178[91] = 42;
            class303.field4178[46] = 72;
            class303.field4178[59] = 57;
            class303.field4178[61] = 27;
        }
        ++field7484;
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)V")
    public static void method3085(int arg0) {
        if (arg0 == 2206) {
            field7482 = null;
        }
    }
}

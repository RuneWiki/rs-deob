import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class318 extends class499 {

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    public static int field4166 = -1;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
    public static int field4172 = 0;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "[I")
    public static int[] field4174 = new int[2];

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public int field4164;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    public int field4167;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
    public int field4173;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "I")
    public int field4178;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "Lsl;")
    public class317 field4168;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "Lqc;")
    public static class521 field4175;

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "Ljava/lang/String;")
    public String field4176;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "[I")
    public int[] field4163;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "[I")
    public int[] field4171;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "[Lub;")
    public class18[] field4169;

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "[Ljava/lang/String;")
    public String[] field4177;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BI)V")
    public static final void method1839(byte arg0, int arg1) {
        if (arg0 < 61) {
            method1839((byte) -87, 85);
        }
        field4165++;
        class253 var2 = class332.method1911(arg1, (byte) -121, 8);
        var2.method1523((byte) -114);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static void method1840(int arg0) {
        if (arg0 != 2) {
            field4166 = -108;
        }
        field4175 = null;
        field4174 = null;
    }
}

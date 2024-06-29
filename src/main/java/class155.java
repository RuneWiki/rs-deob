import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class155 {

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lcf;")
    public static class93 field2708 = class147.method1066("::errortest", -48);

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Lcf;")
    public static class93 field2706 = class147.method1066(")1o", -48);

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "[Lui;")
    public static class227[] field2709 = new class227[32768];

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "Lcf;")
    public static class93 field2712 = class147.method1066("Chargement des textures )2 ", -48);

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2707 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "Lcf;")
    public static class93 field2713 = class147.method1066("compass", -48);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1103(byte arg0, Component arg1) {
        arg1.removeMouseListener(class272.field4835);
        arg1.removeMouseMotionListener(class272.field4835);
        arg1.removeFocusListener(class272.field4835);
        class124.field2204 = 0;
        field2710++;
        int var2 = 53 / ((arg0 + 10) / 53);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method1104(int arg0) {
        field2706 = null;
        field2709 = null;
        field2707 = null;
        field2713 = null;
        field2712 = null;
        field2708 = null;
        if (arg0 != 32768) {
            method1104(-15);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)V")
    public static final void method1105(int arg0, byte arg1) {
        field2711++;
        if (arg1 <= 79) {
            method1105(-43, (byte) 14);
        }
        class63.field1128.method298(true, arg0);
    }
}

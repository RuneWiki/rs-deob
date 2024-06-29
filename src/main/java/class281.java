import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class281 {

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4136 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Ll;")
    public static class315 field4135;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I[Ll;)V")
    public static final void method1857(int arg0, class315[] arg1) {
        field4134++;
        class348.field5182 = arg1.length;
        class424.field6180 = new int[class348.field5182 + 10];
        class407.field5923 = new class315[class348.field5182 + 10];
        class206.method1361(arg1, 0, class407.field5923, arg0, class348.field5182);
        for (int var2 = 0; var2 < class348.field5182; var2++) {
            class424.field6180[var2] = class407.field5923[var2].method207();
        }
        for (int var3 = class348.field5182; var3 < class407.field5923.length; var3++) {
            class424.field6180[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method1858(int arg0) {
        field4136 = null;
        if (arg0 != 3439) {
            method1858(87);
        }
        field4135 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILir;Lir;)V")
    public static final void method1859(int arg0, class185 arg1, class185 arg2) {
        class247.field3480 = arg1;
        class425.field6206 = arg2;
        field4137++;
        class247.field3480.method1225(34, (byte) 27);
        if (arg0 != 0) {
            method1859(12, (class185) null, (class185) null);
        }
    }
}

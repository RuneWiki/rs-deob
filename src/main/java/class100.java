import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class100 {

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field1587 = -1;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "[I")
    public static int[] field1588 = new int[500];

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "D")
    public static double field1594 = -1.0D;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1585 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "[I")
    public static int[] field1596 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1595;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static final void method708(int arg0) {
        field1586++;
        if (arg0 != -8660) {
            field1592 = -41;
        }
        class185.field2958.method94(arg0 ^ 0xFFFFDE0E);
        class90.field1486.method94(34);
        class260.field4373.method94(arg0 + 8694);
        class97.field1574.method94(34);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public static void method709(int arg0) {
        field1595 = null;
        if (arg0 > 125) {
            field1588 = null;
            field1596 = null;
            field1585 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBIIII)V")
    public static final void method710(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 > -48) {
            return;
        }
        if (class23.field423 <= arg3 && arg4 <= class272.field4552 && class55.field972 <= arg5 && class240.field4053 >= arg0) {
            class122.method917(arg3, arg4, arg2, arg5, -19325, arg0);
        } else {
            class67.method460(arg3, arg5, -23872, arg0, arg2, arg4);
        }
        field1593++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method711(int arg0, String arg1, int arg2) {
        field1590++;
        class36 var3 = class136.method1013(3, arg0, (byte) -90);
        var3.method224(false);
        if (arg2 != 16467) {
            method711(-27, (String) null, 20);
        }
        var3.field583 = arg1;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static final void method712(byte arg0) {
        class260.field4375.method94(34);
        field1589++;
        class65.field1091.method94(34);
        if (arg0 <= 64) {
            field1585 = null;
        }
    }
}

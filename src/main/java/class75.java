import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class75 {

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1117 = 0;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1123 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public int field1118;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public int field1119;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public int field1120;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILhw;)Lsd;")
    public static final class202 method542(int arg0, class208 arg1) {
        field1115++;
        arg1.method1445(arg0 - 79);
        int var2 = arg1.method1445(arg0 - 118);
        class202 var3 = class166.method1045(var2, (byte) -113);
        var3.field3066 = arg1.method1445(arg0 ^ 0x65);
        int var4 = arg1.method1445(27);
        for (int var5 = arg0; var5 < var4; var5++) {
            int var6 = arg1.method1445(86);
            var3.method40(arg1, (byte) -118, var6);
        }
        var3.method51(-102);
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static void method543(byte arg0) {
        if (arg0 <= 74) {
            method542(35, null);
        }
        field1123 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Lor;")
    public static final class304 method544(int arg0, int arg1, int arg2) {
        class409 var3 = class217.field3699[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6189;
    }
}

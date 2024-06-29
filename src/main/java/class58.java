import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class58 extends class88 {

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1054 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
    public static int field1057 = -1;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "Lnb;")
    public static class199 field1056 = new class199(128);

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Ltk;")
    public class50 field1048;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "Ltk;")
    public class50 field1051;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "Lhj;")
    public class69 field1052;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "Lnc;")
    public static class83 field1045;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "Z")
    public boolean field1046;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "[Lqb;")
    public static class56[] field1043;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "[Ljava/lang/Object;")
    public Object[] field1050;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
    public static void method352(int arg0) {
        int var1 = 93 % ((18 - arg0) / 55);
        field1054 = null;
        field1045 = null;
        field1043 = null;
        field1056 = null;
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)Z")
    public static final boolean method353(int arg0) {
        field1049++;
        try {
            if (class194.field3534 == 2) {
                if (class268.field4766 == null) {
                    class268.field4766 = class183.method1332(class98.field1863, class9.field71, class253.field4577);
                    if (class268.field4766 == null) {
                        return false;
                    }
                }
                if (class252.field4552 == null) {
                    class252.field4552 = new class271(class78.field1502, class239.field4377);
                }
                if (class49.field724.method374(class268.field4766, 2484, class80.field1533, class252.field4552, 22050)) {
                    class49.field724.method397(-119);
                    class49.field724.method379((byte) -117, class38.field534);
                    class49.field724.method387(class268.field4766, 8, class33.field453);
                    class252.field4552 = null;
                    class268.field4766 = null;
                    class98.field1863 = null;
                    class194.field3534 = 0;
                    return true;
                }
            }
            if (arg0 != 0) {
                field1054 = null;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class49.field724.method383(-70);
            class98.field1863 = null;
            class252.field4552 = null;
            class194.field3534 = 0;
            class268.field4766 = null;
        }
        return false;
    }
}

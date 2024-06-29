import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class617 implements class15 {

    @OriginalMember(owner = "client!jia", name = "d", descriptor = "Lgda;")
    public static class53 field8624 = new class53(22, 3);

    @OriginalMember(owner = "client!jia", name = "f", descriptor = "Lrb;")
    public static class352 field8626 = new class352("", 13);

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "F")
    public static float field8621;

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "I")
    public static int field8623;

    @OriginalMember(owner = "client!jia", name = "e", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)V")
    public static void method3447(byte arg0) {
        field8626 = null;
        if (arg0 == -63) {
            field8624 = null;
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(Lvfa;ILvfa;)V")
    public static final void method3448(class670 arg0, int arg1, class670 arg2) {
        if (arg2.field9094 != null) {
            arg2.method3646((byte) -111);
        }
        field8623++;
        int var3 = 119 / ((-arg1 - 36) / 37);
        arg2.field9093 = arg0;
        arg2.field9094 = arg0.field9094;
        arg2.field9094.field9093 = arg2;
        arg2.field9093.field9094 = arg2;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(IB)I")
    public static final int method3449(int arg0, byte arg1) {
        if (arg1 <= 83) {
            field8624 = null;
        }
        field8622++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "([ILas;JZ)Ljava/lang/String;")
    public final String method99(int[] arg0, class151 arg1, long arg2, boolean arg3) {
        field8625++;
        if (class131.field1630 == arg1) {
            class331 var6 = class116.field1416.method1900(arg0[0], 115);
            return var6.method2163(-27058, (int) arg2);
        } else if (arg3) {
            return null;
        } else if (class414.field5839 == arg1 || class341.field4744 == arg1) {
            class551 var7 = class682.field9361.method3424((int) arg2, false);
            return var7.field7677;
        } else if (class285.field4054 == arg1 || class540.field7562 == arg1 || class476.field6749 == arg1) {
            return class116.field1416.method1900(arg0[0], 118).method2163(-27058, (int) arg2);
        } else {
            return null;
        }
    }
}

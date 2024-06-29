import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class59 extends class42 {

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field1232 = new String[200];

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "Lfq;")
    public class137 field1237;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "Lph;")
    public static class459 field1234;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "[B")
    public byte[] field1230;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
    public static final void method527(int arg0) {
        ++field1233;
        if (arg0 != 4) {
            method529(-105, 89, (class535) null, -103, (byte) -49, 34, 57, -46, 94, (class535) null);
        }
        if (class466.field6932 == 8) {
            class253.method1639(4, -16646);
        } else if (~class466.field6932 != -5 && class466.field6932 != 5) {
            if (~class466.field6932 == -12) {
                class253.method1639(2, arg0 + -16650);
            }
        } else {
            class253.method1639(2, -16646);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lrk;B)Z")
    public static final boolean method528(class25 arg0, byte arg1) {
        ++field1231;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field345) {
            return false;
        } else if (!arg0.method175(-2871, class319.field4849)) {
            return false;
        } else if (class427.field6393.method1622((long) arg0.field357, -106) != null) {
            return false;
        } else if (arg1 >= -35) {
            return false;
        } else {
            return class370.field5431.method1622((long) arg0.field359, -121) == null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILms;IBIIIILms;)V")
    public static final void method529(int arg0, int arg1, class535 arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, class535 arg9) {
        ++field1229;
        int var10 = arg9.method1155(-111);
        if (~var10 != 0) {
            Object var11 = null;
            class24 var12 = (class24) class130.field2208.method2478(arg4 + -39, (long) var10);
            if (var12 == null) {
                class340[] var13 = class340.method2146(class455.field6758, var10, 0);
                if (var13 == null) {
                    return;
                }
                var12 = class262.field4006.method374(var13[0], true);
                class130.field2208.method2472(97, var12, (long) var10);
            }
            class387.method2372(arg2.field6078, 64 * arg2.method2241(arg4 + -112), 0, arg3 >> 1, arg2.field6084, arg1, true, arg0 >> 1, arg2.field6073, arg7);
            int var14 = class60.field1240[0] + arg5 + -18;
            int var15 = arg6 / 4 * 18 + var14;
            if (arg4 != 40) {
                method527(125);
            }
            int var16 = class60.field1240[1] + -16 + -54 + arg8;
            int var17 = arg6 % 4 * 18 + var16;
            var12.method159(var15, var17);
            if (arg2 == arg9) {
                class262.field4006.method1806(1, 18, var15 - 1, -256, 18, var17 + -1);
            }
            class504 var18 = class375.method2305(true);
            var18.field7363 = var15 + 16;
            var18.field7362 = var17;
            var18.field7365 = arg9;
            var18.field7367 = var17 - -16;
            var18.field7364 = var15;
            class243.field3768.method531((byte) -21, var18);
        }
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)I")
    public final int method258(int arg0) {
        ++field1236;
        if (super.field582) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.field1237 = null;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(B)V")
    public static void method530(byte arg0) {
        field1234 = null;
        field1232 = null;
        if (arg0 < 126) {
            field1232 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)[B")
    public final byte[] method259(int arg0) {
        int var2 = -73 / ((arg0 - 63) / 34);
        ++field1238;
        if (super.field582) {
            throw new RuntimeException();
        } else {
            return this.field1230;
        }
    }
}

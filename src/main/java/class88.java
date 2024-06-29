import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class88 implements class104 {

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "Lhfa;")
    public class282 field1272;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "Lsea;")
    private class648 field1277;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1264 = 0;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "[S")
    private static short[] field1271 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "[S")
    private static short[] field1273 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "[S")
    private static short[] field1276 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "[[S")
    public static short[][] field1275 = new short[][] { field1273, field1271, field1276 };

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Lem;")
    public static class206 field1265 = new class206(112, -2);

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "[I")
    public static int[] field1279 = new int[4];

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "Lar;")
    public static class635 field1278 = new class635(16);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "Lf;")
    public class702 field1268;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZIIII)V", line = 4)
    public static final void method644(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 100) {
            method648(-101);
        }
        class164.field2359 = arg3;
        class290.field3995 = arg6;
        class289.field3987 = arg5;
        class506.field6939 = arg4;
        class65.field854 = arg1;
        field1274++;
        if (arg2 && class164.field2359 >= 100) {
            class666.field9335 = class65.field854 * 512 + 256;
            class11.field114 = class290.field3995 * 512 + 256;
            class441.field6102 = class249.method1533(class367.field4944, class11.field114, class666.field9335, arg0 ^ 0xFFFFFFFC) - class289.field3987;
        }
        class203.field2863 = 2;
        class560.field7547 = -1;
        class199.field2832 = -1;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 41)
    public final void method476(int arg0) {
        field1267++;
        this.field1268 = class65.method554(this.field1272.field3853, this.field1277, arg0 ^ 0xFFFFCD7A);
        if (arg0 != -12935) {
            method645(116, -66, (byte) -125, 5, -77, 65);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIBIII)V", line = 53)
    public static final void method645(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var6 = -117 % ((arg2 + 59) / 54);
        if (arg3 >= class128.field1831 && class529.field7169 >= arg4 && class469.field6466 <= arg5 && class533.field7200 >= arg1) {
            class506.method2888(arg0, arg1, arg4, arg3, true, arg5);
        } else {
            class344.method2005((byte) 0, arg5, arg4, arg3, arg0, arg1);
        }
        field1263++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)Z", line = 71)
    public final boolean method475(byte arg0) {
        if (arg0 != -90) {
            field1264 = 21;
        }
        field1266++;
        return this.field1277.method3623(arg0 + 16, this.field1272.field3853);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)Z", line = 84)
    public static final boolean method646(byte arg0, int arg1) {
        field1269++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            if (arg1 >= -16) {
                field1265 = null;
            }
            return var2 < 128 || var2 >= 160 || class664.field9319[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZZ)V", line = 109)
    public void method647(boolean arg0, boolean arg1) {
        if (arg0) {
            int var3 = this.field1272.field3851.method3361((byte) -114, this.field1268.method1660(), class178.field2581) + this.field1272.field3849;
            int var4 = this.field1272.field3850.method59(1, this.field1268.method1661(), class157.field2277) + this.field1272.field3857;
            this.field1268.method3927(var3, var4);
        }
        field1270++;
        if (!arg1) {
            field1276 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V", line = 133)
    public static void method648(int arg0) {
        field1279 = null;
        field1265 = null;
        field1271 = null;
        field1273 = null;
        field1278 = null;
        if (arg0 == 4550) {
            field1276 = null;
            field1275 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lsea;Lhfa;)V", line = 154)
    public class88(class648 arg0, class282 arg1) {
        this.field1272 = arg1;
        this.field1277 = arg0;
    }
}

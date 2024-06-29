import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class342 {

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field4848 = 0;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "[B")
    public static byte[] field4849 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "Z")
    public static boolean field4850 = false;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V", line = 6)
    public static void method2205(byte arg0) {
        int var1 = -99 % ((18 - arg0) / 45);
        field4849 = null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIILpe;IBILpe;)V", line = 16)
    public static final void method2206(int arg0, int arg1, int arg2, int arg3, int arg4, class390 arg5, int arg6, byte arg7, int arg8, class390 arg9) {
        field4851++;
        int var10 = arg9.method814((byte) -14);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class421 var12 = (class421) class441.field6403.method103(0, (long) var10);
        if (var12 == null) {
            class344[] var13 = class344.method2211(class100.field1561, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class73.field1235.method734(var13[0], true);
            class441.field6403.method113(var12, 0, (long) var10);
        }
        class425.method2665(arg4 >> 1, arg5.method1070((byte) -50) * 64, arg1, arg2 >> 1, arg5.field6519, 4227, arg0, arg5.field6520, 0);
        int var14 = arg3 + class435.field6340[0] - 18;
        int var15 = arg6 / 4 * 18 + var14;
        int var16 = class435.field6340[1] + arg8 - 70;
        int var17 = arg6 % 4 * 18 + var16;
        var12.method2645(var15, var17);
        int var18 = 38 / ((arg7 - 20) / 62);
        if (arg5 == arg9) {
            class73.field1235.method721(var17 - 1, -256, var15 - 1, 18, (byte) -69, 18);
        }
        class39 var19 = class51.method406(true);
        var19.field607 = var15 + 16;
        var19.field605 = var17;
        var19.field602 = var17 + 16;
        var19.field603 = var15;
        var19.field604 = arg9;
        class83.field1358.method2483(120, var19);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IB)Lmb;", line = 80)
    public static final class258 method2207(int arg0, byte arg1) {
        field4852++;
        int var2 = arg0 >> 16;
        if (arg1 != 14) {
            return null;
        }
        int var3 = arg0 & 0xFFFF;
        if (class45.field710[var2] == null || class45.field710[var2][var3] == null) {
            boolean var4 = class51.method407(var2, 4);
            if (!var4) {
                return null;
            }
        }
        return class45.field710[var2][var3];
    }
}

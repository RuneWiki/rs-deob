import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class81 extends class62 {

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    public int field1263 = -1;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "I")
    public int field1279 = 0;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "Leg;")
    public static class37 field1265 = class174.method1167("::breakcon", 91);

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "Leg;")
    public static class37 field1278 = null;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public int field1260;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
    public int field1261;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public int field1264;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    public int field1270;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
    public int field1273;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    public int field1274;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "I")
    public int field1275;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)I")
    public static final int method546(boolean arg0) {
        field1277++;
        if (arg0) {
            field1278 = null;
        }
        try {
            if (class178.field2979 == 0) {
                if (class259.field4584 > (class149.method1024(-14898) - 5000L)) {
                    return 0;
                }
                class163.field2689 = class177.field2957.method1435(class272.field4774, 104, class138.field2359);
                class4.field80 = class149.method1024(-14898);
                class178.field2979 = 1;
            }
            if (class4.field80 + 30000L < class149.method1024(-14898)) {
                return class110.method776(-62, 1000);
            }
            if (class178.field2979 == 1) {
                if (class163.field2689.field4488 == 2) {
                    return class110.method776(102, 1001);
                }
                if (class163.field2689.field4488 != 1) {
                    return -1;
                }
                class187.field3190 = new class59((Socket) class163.field2689.field4483, class177.field2957);
                int var1 = 0;
                class163.field2689 = null;
                if (class80.field1258) {
                    var1 = class169.field2826;
                }
                class273.field4778.field3169 = 0;
                class273.field4778.method1292(131, (byte) -64);
                class273.field4778.method1272(27862, var1);
                class187.field3190.method420(class273.field4778.field3175, 0, class273.field4778.field3169, -13789);
                if (class36.field529 != null) {
                    class36.field529.method933(127);
                }
                if (class61.field1000 != null) {
                    class61.field1000.method933(-114);
                }
                int var2 = class187.field3190.method426((byte) 41);
                if (class36.field529 != null) {
                    class36.field529.method933(78);
                }
                if (class61.field1000 != null) {
                    class61.field1000.method933(-101);
                }
                if (var2 != 0) {
                    return class110.method776(99, var2);
                }
                class178.field2979 = 2;
            }
            if (class178.field2979 == 2) {
                if (class187.field3190.method430(arg0) < 2) {
                    return -1;
                }
                class248.field4457 = class187.field3190.method426((byte) 41);
                class248.field4457 <<= 0x8;
                class248.field4457 += class187.field3190.method426((byte) 41);
                class178.field2979 = 3;
                class267.field4673 = new byte[class248.field4457];
                class102.field1608 = 0;
            }
            if (class178.field2979 != 3) {
                return -1;
            }
            int var3 = class187.field3190.method430(false);
            if (var3 < 1) {
                return -1;
            }
            if ((class248.field4457 - class102.field1608) < var3) {
                var3 = class248.field4457 - class102.field1608;
            }
            class187.field3190.method425(var3, 3714, class267.field4673, class102.field1608);
            class102.field1608 += var3;
            if (class102.field1608 < class248.field4457) {
                return -1;
            } else if (class262.method1770(19860, class267.field4673)) {
                class69.field1103 = new class17[class218.field3752];
                int var4 = 0;
                for (int var5 = class230.field3936; var5 <= class44.field682; var5++) {
                    class17 var6 = class64.method449(var5, -1428);
                    if (var6 != null) {
                        class69.field1103[var4++] = var6;
                    }
                }
                class187.field3190.method419((byte) -66);
                class267.field4673 = null;
                class178.field2979 = 0;
                class83.field1300 = 0;
                class187.field3190 = null;
                class259.field4584 = class149.method1024(-14898);
                return 0;
            } else {
                return class110.method776(108, 1002);
            }
        } catch (IOException var7) {
            return class110.method776(-96, 1003);
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public static void method547(int arg0) {
        field1265 = null;
        field1278 = null;
        if (arg0 != -4) {
            method548(-106, 98, -60, (class101) null);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIILjl;)[Lja;")
    public static final class105[] method548(int arg0, int arg1, int arg2, class101 arg3) {
        field1266++;
        if (arg0 == 3) {
            return class131.method941(arg1, arg3, arg2, arg0 - 81) ? class132.method943(79) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIZ)V")
    public static final void method549(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1267++;
        if (class262.method1772(0, arg2)) {
            class254.method1737(arg3, arg4, -5260, class232.field4000[arg2], arg0, arg1);
        }
    }
}

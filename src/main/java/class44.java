import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class44 {

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field1161 = 0;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Lkd;")
    public static class73 field1167 = class126.method1070((byte) -66, "Freunde)2Server)3)3)3");

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "Ljb;")
    public static class64 field1171 = new class64(50);

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field1175 = 0;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Lkd;")
    public static class73 field1176 = class126.method1070((byte) -66, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field1173 = 0;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "Lkd;")
    private static class73 field1177 = class126.method1070((byte) -66, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Lkd;")
    public static class73 field1174 = field1177;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lua;")
    public static class137 field1172;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIILwa;I)V")
    public static final void method327(int arg0, int arg1, int arg2, int arg3, class149 arg4, int arg5) {
        class23 var6 = new class23();
        var6.field659 = arg2 * 128;
        var6.field651 = arg4.field3668;
        field1162++;
        var6.field656 = arg4.field3651;
        int var7 = arg4.field3660;
        var6.field648 = arg4.field3670 * 128;
        var6.field657 = arg4.field3653;
        var6.field661 = arg5 * 128;
        var6.field645 = arg4.field3669;
        int var8 = arg4.field3643;
        if (arg0 == 1 || arg0 == 3) {
            var8 = arg4.field3660;
            var7 = arg4.field3643;
        }
        var6.field646 = (arg2 + var8) * arg1;
        var6.field663 = arg3;
        var6.field678 = (arg5 + var7) * 128;
        if (arg4.field3691 != null) {
            var6.field649 = arg4;
            var6.method191((byte) 63);
        }
        class141.field3505.method519(var6, 13017);
        if (var6.field657 != null) {
            var6.field681 = var6.field645 + (int) ((double) (var6.field656 - var6.field645) * Math.random());
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)[B")
    public static final synchronized byte[] method328(int arg0, byte arg1) {
        if (arg1 != -34) {
            return null;
        }
        field1169++;
        if (arg0 == 100 && class151.field3743 > 0) {
            byte[] var2 = class86.field2187[--class151.field3743];
            class86.field2187[class151.field3743] = null;
            return var2;
        } else if (arg0 == 5000 && class48.field1269 > 0) {
            byte[] var3 = class52.field1384[--class48.field1269];
            class52.field1384[class48.field1269] = null;
            return var3;
        } else if (arg0 == 30000 && class41.field1104 > 0) {
            byte[] var4 = class73.field1898[--class41.field1104];
            class73.field1898[class41.field1104] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static final void method329(byte arg0) {
        field1166++;
        int var1 = 5 / ((14 - arg0) / 47);
        try {
            if (class26.field754 == 1) {
                int var2 = class86.field2181.method988((byte) -103);
                if (var2 > 0 && class86.field2181.method1003(true)) {
                    int var3 = var2 - class53.field1416;
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    class86.field2181.method1013((byte) -36, var3);
                } else {
                    class86.field2181.method995(115);
                    class86.field2181.method998(-103);
                    class133.field3335 = null;
                    if (class104.field2591 == null) {
                        class26.field754 = 0;
                    } else {
                        class26.field754 = 2;
                    }
                    class150.field3716 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class86.field2181.method995(111);
            class104.field2591 = null;
            class133.field3335 = null;
            class26.field754 = 0;
            class150.field3716 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static final void method330(int arg0) {
        class18.field508.method534((byte) 92);
        field1164++;
        class125.field3171.method534((byte) 127);
        int var1 = 51 / ((arg0 + 74) / 39);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
    public static final void method331(byte arg0) {
        field1168++;
        if (!class116.field2972) {
            return;
        }
        class89.field2297 = null;
        class52.field1389 = null;
        class125.field3181 = null;
        class111.field2760 = null;
        class14.field426 = null;
        class77.field1964 = null;
        class87.field2211 = null;
        class58.field1546 = null;
        class79.field2012 = null;
        class53.field1404 = null;
        class119.field3057 = null;
        class34.field955 = null;
        class55.field1487 = null;
        class119.field3031 = null;
        class82.field2061 = null;
        class45.field1186 = null;
        class33.field907 = null;
        class70.field1779 = null;
        class119.field3056 = null;
        if (arg0 < 120) {
            field1161 = 74;
        }
        class57.field1531 = null;
        class63.field1656 = null;
        class115.method980(2, (byte) -45);
        class111.method892(-2, true);
        class116.field2972 = false;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public static void method332(int arg0) {
        field1174 = null;
        field1171 = null;
        field1177 = null;
        field1167 = null;
        field1176 = null;
        if (arg0 != 2) {
            field1177 = null;
        }
        field1172 = null;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)Z")
    public static final boolean method333(byte arg0) {
        field1165++;
        try {
            if (class26.field754 == 2) {
                if (class133.field3335 == null) {
                    class133.field3335 = class68.method572(class104.field2591, class31.field870, class38.field1041);
                    if (class133.field3335 == null) {
                        return false;
                    }
                }
                if (class150.field3716 == null) {
                    class150.field3716 = new class43(class76.field1941, class23.field670);
                }
                if (class86.field2181.method1016(22050, (byte) 126, class150.field3716, class133.field3335, class136.field3390)) {
                    class86.field2181.method991(0);
                    class86.field2181.method1013((byte) -36, class142.field3548);
                    class86.field2181.method1019((byte) -48, class133.field3335, class15.field474);
                    class133.field3335 = null;
                    class26.field754 = 0;
                    class104.field2591 = null;
                    class150.field3716 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class86.field2181.method995(100);
            class104.field2591 = null;
            class26.field754 = 0;
            class133.field3335 = null;
            class150.field3716 = null;
        }
        if (arg0 > -46) {
            method328(52, (byte) -56);
        }
        return false;
    }
}

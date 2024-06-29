import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public abstract class class174 {

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "I")
    public static int field2769 = 1;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field2766 = new String[100];

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IZI)Lhga;", line = 6)
    public static final class186 method1320(int arg0, boolean arg1, int arg2) {
        if (arg2 != 17832) {
            field2769 = -54;
        }
        field2771++;
        class239[] var3 = class485.field6557;
        synchronized (class485.field6557) {
            class186 var4;
            if (class485.field6557.length <= arg0 || class485.field6557[arg0].method1593((byte) 36)) {
                var4 = new class186();
                var4.field2877 = new class144[arg0];
                for (int var5 = 0; var5 < arg0; var5++) {
                    var4.field2877[var5] = new class144();
                }
            } else {
                var4 = (class186) class485.field6557[arg0].method1594((byte) 31);
                var4.method731((byte) 39);
                int var10002 = class215.field3193[arg0]--;
            }
            var4.field2880 = arg1;
            return var4;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(III)B", line = 48)
    public static final byte method1324(int arg0, int arg1, int arg2) {
        field2770++;
        if (arg2 > -60) {
            return 92;
        } else if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "(B)Z", line = 75)
    public final boolean method1327(byte arg0) {
        field2767++;
        if (arg0 >= -81) {
            field2766 = null;
        }
        return this.method1322(true) || this.method1317(-117063712) || this.method1323(4);
    }

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "(I)V", line = 88)
    public static void method1328(int arg0) {
        field2766 = null;
        int var1 = -46 / (arg0 / 40);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIILkh;)V", line = 98)
    public static final void method1329(int arg0, int arg1, int arg2, class17 arg3) {
        field2768++;
        if (class675.field9384) {
            class485 var4 = class220.field3234 == -1 ? null : class117.field2153.method1159((byte) -96, class220.field3234);
            if (client.method2010(arg3).method3886(arg1 + 22597) && (class448.field6148 & 0x20) != 0 && (var4 == null || arg3.method114(class220.field3234, arg1 - 4867, var4.field6560) != var4.field6560)) {
                class596.method3396(true, false, arg3.field355, class340.field4584, arg3.field372, 0L, class420.field5726 + " -> " + arg3.field328, 2, class508.field6980, (long) (arg3.field282 << 0 | arg3.field372), (byte) 34, false, arg3.field282);
                class582.field8234++;
            }
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class62.method430(65532, var5, arg3);
            if (var9 != null) {
                class596.method3396(true, false, arg3.field355, class791.method4315(16, var5, arg3), arg3.field372, (long) (var5 + 1), arg3.field328, 1001, var9, (long) (arg3.field372 | arg3.field282 << 0), (byte) 34, false, arg3.field282);
                class295.field4025++;
            }
        }
        String var6 = class195.method1413((byte) 79, arg3);
        if (arg1 != 4873) {
            return;
        }
        if (var6 != null) {
            class596.method3396(true, false, arg3.field355, arg3.field391, arg3.field372, 0L, arg3.field328, 8, var6, (long) (arg3.field282 << 0 | arg3.field372), (byte) 34, false, arg3.field282);
            class33.field561++;
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class62.method430(arg1 ^ 0xECF5, var7, arg3);
            if (var8 != null) {
                class596.method3396(true, false, arg3.field355, class791.method4315(arg1 - 4857, var7, arg3), arg3.field372, (long) (var7 + 1), arg3.field328, 23, var8, (long) (arg3.field282 << 0 | arg3.field372), (byte) 34, false, arg3.field282);
                class295.field4025++;
            }
        }
        if (!client.method2010(arg3).method3884(arg1 - 4829)) {
            return;
        }
        class412.field5638++;
        if (arg3.field284 == null) {
            class596.method3396(true, false, arg3.field355, -1, arg3.field372, 0L, "", 6, class641.field8827.method3566((byte) 95, class464.field6309), (long) (arg3.field372 | arg3.field282 << 0), (byte) 34, false, arg3.field282);
        } else {
            class596.method3396(true, false, arg3.field355, -1, arg3.field372, 0L, "", 6, arg3.field284, (long) (arg3.field282 << 0 | arg3.field372), (byte) 34, false, arg3.field282);
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)Z")
    public abstract boolean method1317(int arg0);

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)V")
    public abstract void method1318(byte arg0);

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(B)I")
    public abstract int method1319(byte arg0);

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "(B)V")
    public abstract void method1321(byte arg0);

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z)Z")
    public abstract boolean method1322(boolean arg0);

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)Z")
    public abstract boolean method1323(int arg0);

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(Z)Lhl;")
    public abstract class556 method1325(boolean arg0);

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "(B)I")
    public abstract int method1326(byte arg0);
}

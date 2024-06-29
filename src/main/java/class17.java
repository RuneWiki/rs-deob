import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class17 {

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Llj;")
    private class565 field175;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "J")
    public long field173;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Z")
    public static boolean field174 = false;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Lem;")
    public static class206 field170 = new class206(88, 7);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static void method82(int arg0) {
        if (arg0 == 187) {
            field170 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZLql;IZ)V")
    public static final void method83(boolean arg0, class685 arg1, int arg2, boolean arg3) {
        field169++;
        int var4 = arg1.field9776;
        int var5 = (int) arg1.field5623;
        arg1.method2340(-109);
        if (arg0) {
            class515.method2941((byte) 64, var4);
        }
        class282.method1730(var4, arg2 + 33732);
        if (arg2 != -8501) {
            return;
        }
        class78 var6 = class582.method3319((byte) -99, var5);
        if (var6 != null) {
            class26.method255(var6, -20229);
        }
        class32.method304(8);
        if (!arg3 && class631.field8758 != -1) {
            class295.method1799((byte) -68, class631.field8758, 1);
        }
        class325 var7 = new class325(class4.field26);
        for (class685 var8 = (class685) var7.method1950(0); var8 != null; var8 = (class685) var7.method1947((byte) 52)) {
            if (!var8.method2339(arg2 ^ 0xFFFFDEBF)) {
                var8 = (class685) var7.method1950(arg2 + 8501);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field9774 == 3) {
                int var9 = (int) var8.field5623;
                if ((var9 >>> 16) == var4) {
                    method83(true, var8, -8501, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field175.method3185(this.field173, 2);
        field172++;
        super.finalize();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lpaa;Lpaa;I)V")
    public static final void method84(class578 arg0, class578 arg1, int arg2) {
        if (arg1.field8159 != null) {
            arg1.method3301(121);
        }
        field171++;
        arg1.field8163 = arg0.field8163;
        if (arg2 != 26180) {
            method83(false, null, -28, true);
        }
        arg1.field8159 = arg0;
        arg1.field8159.field8163 = arg1;
        arg1.field8163.field8159 = arg1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public static final void method85(boolean arg0) {
        field176++;
        if (class105.field1477.toLowerCase().indexOf("microsoft") == -1) {
            if (class105.field1458 == null) {
                class652.field9062[192] = 58;
                class652.field9062[222] = 59;
            } else {
                class652.field9062[192] = 28;
                class652.field9062[520] = 59;
                class652.field9062[222] = 58;
            }
            class652.field9062[61] = 27;
            class652.field9062[91] = 42;
            class652.field9062[92] = 74;
            class652.field9062[46] = 72;
            class652.field9062[93] = 43;
            class652.field9062[44] = 71;
            class652.field9062[45] = 26;
            class652.field9062[59] = 57;
            class652.field9062[47] = 73;
        } else {
            class652.field9062[191] = 73;
            class652.field9062[219] = 42;
            class652.field9062[223] = 28;
            class652.field9062[192] = 58;
            class652.field9062[190] = 72;
            class652.field9062[186] = 57;
            class652.field9062[221] = 43;
            class652.field9062[222] = 59;
            class652.field9062[188] = 71;
            class652.field9062[220] = 74;
            class652.field9062[187] = 27;
            class652.field9062[189] = 26;
        }
        if (arg0) {
            method85(true);
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Llj;JI)V")
    public class17(class565 arg0, long arg1, int arg2) {
        this.field175 = arg0;
        this.field173 = arg1;
    }
}

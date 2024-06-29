import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class383 {

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "[I")
    public static int[] field5265 = new int[14];

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "[Z")
    public static boolean[] field5272 = new boolean[8];

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Ljh;")
    public static class446 field5269;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZII)V", line = 4)
    public static final void method2365(boolean arg0, int arg1, int arg2) {
        field5266++;
        class26 var3 = class217.method1445(true, arg2, 6);
        var3.method158(28194);
        var3.field341 = arg1;
        if (arg0) {
            method2365(true, -112, -36);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 18)
    public static void method2366(byte arg0) {
        field5265 = null;
        if (arg0 == 66) {
            field5272 = null;
            field5269 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V", line = 39)
    public static final void method2367(boolean arg0) {
        if (arg0) {
            field5272 = null;
        }
        field5270++;
        if (class76.field1074.toLowerCase().indexOf("microsoft") != -1) {
            class294.field3993[192] = 58;
            class294.field3993[186] = 57;
            class294.field3993[187] = 27;
            class294.field3993[222] = 59;
            class294.field3993[191] = 73;
            class294.field3993[220] = 74;
            class294.field3993[219] = 42;
            class294.field3993[188] = 71;
            class294.field3993[221] = 43;
            class294.field3993[223] = 28;
            class294.field3993[190] = 72;
            class294.field3993[189] = 26;
            return;
        }
        class294.field3993[46] = 72;
        class294.field3993[91] = 42;
        class294.field3993[44] = 71;
        class294.field3993[45] = 26;
        class294.field3993[47] = 73;
        if (class76.field1095 == null) {
            class294.field3993[222] = 59;
            class294.field3993[192] = 58;
        } else {
            class294.field3993[192] = 28;
            class294.field3993[520] = 59;
            class294.field3993[222] = 58;
        }
        class294.field3993[59] = 57;
        class294.field3993[61] = 27;
        class294.field3993[93] = 43;
        class294.field3993[92] = 74;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V", line = 89)
    public static final void method2368(int arg0, int arg1) {
        class160.field2278 = arg0;
        field5267++;
        class408 var2 = class269.field3683;
        synchronized (class269.field3683) {
            class269.field3683.method2530((byte) -52);
        }
        if (arg1 <= 101) {
            method2369((class210) null, 35, 19, -60, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Llb;III[Z)V", line = 108)
    public static final void method2369(class210 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class436.field6160 == class125.field1879) {
            return;
        }
        int var5 = class82.field1130[arg1].method331(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class323 var7 = class82.field1130[var6];
                if (var7 != null) {
                    var7.method332(arg0, arg2, var5 - var7.method331(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }
}

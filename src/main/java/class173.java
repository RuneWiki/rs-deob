import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class173 extends class137 {

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public int field2841 = 0;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Lkl;")
    public static class64 field2839 = new class64();

    @OriginalMember(owner = "client!id", name = "G", descriptor = "Ltl;")
    public static class59 field2848 = class85.method639("leuchten1:", 9588);

    @OriginalMember(owner = "client!id", name = "C", descriptor = "F")
    public static float field2844;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "Luk;")
    public static class125 field2842;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "La;")
    public static class270 field2840;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ls;I)V", line = 10)
    public final void method1272(class170 arg0, int arg1) {
        if (arg1 != 0) {
            field2842 = (class125) null;
        }
        field2847++;
        while (true) {
            int var3 = arg0.method1221(arg1 + 71);
            if (var3 == 0) {
                return;
            }
            this.method1278((byte) -60, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lma;IZ)V", line = 34)
    public static final void method1273(class263 arg0, int arg1, boolean arg2) {
        if (arg1 != -20833) {
            return;
        }
        field2843++;
        int var3 = arg0.field4479 == 0 ? arg0.field4467 : arg0.field4479;
        int var4 = arg0.field4449 == 0 ? arg0.field4420 : arg0.field4449;
        class13.method88(true, arg2, class239.field3986[arg0.field4392 >> 16], arg0.field4392, var3, var4);
        if (arg0.field4377 != null) {
            class13.method88(true, arg2, arg0.field4377, arg0.field4392, var3, var4);
        }
        class297 var5 = (class297) class190.field3181.method685((long) arg0.field4392, arg1 + 20961);
        if (var5 != null) {
            class100.method757(116, var5.field5089, arg2, var4, var3);
        }
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V", line = 73)
    public static final void method1274(int arg0) {
        field2846++;
        int var1 = -88 / ((57 - arg0) / 45);
        if (class175.field2872.toLowerCase().indexOf("microsoft") != -1) {
            class285.field4901[220] = 74;
            class285.field4901[189] = 26;
            class285.field4901[221] = 43;
            class285.field4901[222] = 59;
            class285.field4901[223] = 28;
            class285.field4901[191] = 73;
            class285.field4901[188] = 71;
            class285.field4901[187] = 27;
            class285.field4901[192] = 58;
            class285.field4901[186] = 57;
            class285.field4901[190] = 72;
            class285.field4901[219] = 42;
            return;
        }
        class285.field4901[59] = 57;
        if (class175.field2879 == null) {
            class285.field4901[192] = 58;
            class285.field4901[222] = 59;
        } else {
            class285.field4901[222] = 58;
            class285.field4901[192] = 28;
            class285.field4901[520] = 59;
        }
        class285.field4901[46] = 72;
        class285.field4901[44] = 71;
        class285.field4901[45] = 26;
        class285.field4901[91] = 42;
        class285.field4901[92] = 74;
        class285.field4901[61] = 27;
        class285.field4901[93] = 43;
        class285.field4901[47] = 73;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)Lqd;", line = 123)
    public static final class231 method1275(byte arg0) {
        field2837++;
        int var1 = -27 % ((arg0 + 42) / 62);
        return class29.field379 < class53.field782.length ? class53.field782[class29.field379++] : null;
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(I)V", line = 136)
    public static final void method1276(int arg0) {
        if (arg0 != -654049200) {
            method1277(6);
        }
        class224.field3629.method1482((byte) 30);
        field2845++;
    }

    @OriginalMember(owner = "client!id", name = "g", descriptor = "(I)V", line = 154)
    public static void method1277(int arg0) {
        field2839 = null;
        field2840 = null;
        field2848 = null;
        if (arg0 != 192) {
            field2839 = (class64) null;
        }
        field2842 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BILs;)V", line = 173)
    private final void method1278(byte arg0, int arg1, class170 arg2) {
        if (arg1 == 2) {
            this.field2841 = arg2.method1214(-18254);
        }
        if (arg0 != -60) {
            field2844 = -0.43625084F;
        }
        field2838++;
    }
}

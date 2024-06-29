import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class291 extends class172 {

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "Lbl;")
    public class181 field4706;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    public static int field4702 = 0;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "Ljl;")
    public static class332 field4704 = new class332(4);

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!pk", name = "U", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V", line = 5)
    public static final void method2101(int arg0, int arg1) {
        class87.field1490.method2334(4, arg1);
        if (arg0 > 15) {
            field4705++;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(Z)V", line = 16)
    public static final void method2102(boolean arg0) {
        field4707++;
        if (class264.field4432 != -1) {
            class307.method2188(23881, false, class264.field4432, -1, -1);
            class264.field4432 = -1;
        }
        if (arg0) {
            method2108(110, (byte) -66);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)V", line = 33)
    public static final void method2103(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4711++;
        if (class223.field3709 == 1) {
            class205.field3240[class169.field2692 / 100].method89(class221.field3607 - 8, class162.field2571 - 8);
        }
        if (arg2 != -1) {
            method2103(81, -41, -116, -69, 91);
        }
        if (class223.field3709 == 2) {
            class205.field3240[(class169.field2692 / 100) + 4].method89(class221.field3607 - 8, class162.field2571 + -8);
        }
        class77.method638(3118);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V", line = 58)
    public static final void method2104(String arg0, int arg1, String arg2, String arg3, String arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 99; var8 > 0; var8--) {
            class57.field962[var8] = class57.field962[var8 - 1];
            class277.field4568[var8] = class277.field4568[var8 - 1];
            client.field728[var8] = client.field728[var8 - 1];
            class20.field229[var8] = class20.field229[var8 - 1];
            class98.field1604[var8] = class98.field1604[var8 - 1];
            class342.field5445[var8] = class342.field5445[var8 - 1];
            class128.field2166[var8] = class128.field2166[var8 - 1];
        }
        class194.field3097 = class55.field908;
        class57.field962[0] = arg5;
        client.field728[0] = arg0;
        field4709++;
        if (arg1 >= -88) {
            field4703 = 55;
        }
        class274.field4537++;
        class277.field4568[0] = arg7;
        class20.field229[0] = arg4;
        class98.field1604[0] = arg2;
        class128.field2166[0] = arg6;
        class342.field5445[0] = arg3;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(B)V", line = 100)
    public static void method2105(byte arg0) {
        if (arg0 != 106) {
            field4704 = (class332) null;
        }
        field4704 = null;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)V", line = 115)
    public static final void method2106(int arg0, int arg1) {
        field4712++;
        class321 var2 = class46.method370(9, (byte) -106, arg1);
        var2.method2261(-129);
        if (arg0 != 7047) {
            method2104((String) null, 77, (String) null, (String) null, (String) null, 91, 44, 127);
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lbl;)V", line = 125)
    public class291(class181 arg0) {
        this.field4706 = arg0;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZZ)V", line = 135)
    public static final void method2107(boolean arg0, boolean arg1) {
        class195.method1506(arg0);
        field4708++;
        if (class259.field4362 != 30 && class259.field4362 != 25) {
            return;
        }
        class10.field80++;
        if (class10.field80 < 50 && !arg1) {
            return;
        }
        class10.field80 = 0;
        if (!class231.field3834 && class342.field5449 != null) {
            class36.field520.method2228(218, 16547);
            try {
                class342.field5449.method924(0, class36.field520.field3793, class36.field520.field3760, 55);
                class36.field520.field3760 = 0;
            } catch (IOException var3) {
                class231.field3834 = true;
            }
            class198.field3168++;
        }
        class195.method1506(arg0);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)Lim;", line = 165)
    public static final class201 method2108(int arg0, byte arg1) {
        if (arg1 <= 45) {
            return (class201) null;
        } else {
            field4710++;
            return class56.field919 && class209.field3300 <= arg0 && arg0 <= class172.field2756 ? class335.field5304[arg0 - class209.field3300] : null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(III)Lob;", line = 185)
    public static final class184 method2109(int arg0, int arg1, int arg2) {
        class36 var3 = class129.field2184[arg0][arg1][arg2];
        return var3 == null || var3.field537 == null ? null : var3.field537;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class394 extends class557 {

    @OriginalMember(owner = "client!mv", name = "v", descriptor = "I")
    private int field5679 = -1;

    @OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
    private int field5670;

    @OriginalMember(owner = "client!mv", name = "n", descriptor = "I")
    private int field5671;

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!mv", name = "p", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!mv", name = "q", descriptor = "I")
    private int field5674;

    @OriginalMember(owner = "client!mv", name = "s", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!mv", name = "t", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!mv", name = "u", descriptor = "Lpb;")
    public static class680 field5678;

    @OriginalMember(owner = "client!mv", name = "r", descriptor = "[S")
    public static short[] field5675;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)V")
    public static void method2421(boolean arg0) {
        if (!arg0) {
            method2421(false);
        }
        field5675 = null;
        field5678 = null;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ltn;I)V")
    public final void method32(class95 arg0, int arg1) {
        arg0.method745(this.field5674, (byte) -96, this.field5679, this.field5670, this.field5671);
        field5673++;
        if (arg1 != -29265) {
            this.field5674 = 40;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)V")
    public static final void method2422(int arg0, int arg1) {
        field5677++;
        if (class114.field1544 == arg0) {
            return;
        }
        class102.field1467 = class393.field5663 = class572.field7793[arg0];
        class539.method3122(-70);
        class199.field2587 = new int[4][class102.field1467 >> 3][class393.field5663 >> 3];
        if (arg1 != -2) {
            field5678 = null;
        }
        class227.field2932 = new int[class102.field1467][class393.field5663];
        class689.field9214 = new int[class102.field1467][class393.field5663];
        for (int var2 = 0; var2 < 4; var2++) {
            class257.field3830[var2] = class359.method2275(class393.field5663, class102.field1467, 116);
        }
        class641.field8644 = new byte[4][class102.field1467][class393.field5663];
        class617.method3422(4, class102.field1467, (byte) -60, class393.field5663);
        class714.method3958(class393.field5663 >> 3, class375.field5490, 1, class102.field1467 >> 3);
        class114.field1544 = arg0;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BLdt;)V")
    public final void method30(byte arg0, class254 arg1) {
        this.field5679 = arg1.method1728((byte) 63);
        field5672++;
        if (arg0 != 110) {
            method2422(-56, 120);
        }
        this.field5670 = arg1.method1672(-16516);
        this.field5671 = arg1.method1731((byte) 64);
        this.field5674 = arg1.method1731((byte) 64);
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(Z)V")
    public static final void method2423(boolean arg0) {
        field5676++;
        if (class170.field2232 == null) {
            class170.field2232 = class249.method1557((byte) -23);
            class574.field7827 = class170.field2232[0];
            class372.field5420 = class401.method2440(false);
        }
        if (class180.field2361 == null) {
            class45.method298(96);
        }
        class249 var1 = class574.field7827;
        if (!arg0) {
            field5678 = null;
        }
        int var2 = class125.method893(0);
        if (class574.field7827 == var1) {
            class469.field6632 = class574.field7827.field3266.method365(class55.field647, (byte) 127);
            if (class574.field7827.field3271) {
                class597.field8133 = (class574.field7827.field3264 - class574.field7827.field3269) * var2 / 100 + class574.field7827.field3269;
            }
            if (class574.field7827.field3272) {
                class469.field6632 = class469.field6632 + class597.field8133 + "%";
            }
        } else if (class574.field7827 == class249.field3293) {
            class180.field2361 = null;
            class170.method1148(3, -11239);
        } else {
            class469.field6632 = var1.field3268.method365(class55.field647, (byte) 77);
            class597.field8133 = var1.field3264;
            if (class574.field7827.field3272) {
                class469.field6632 = class469.field6632 + var1.field3264 + "%";
            }
            if (class574.field7827.field3271 || var1.field3271) {
                class372.field5420 = class401.method2440(false);
            }
        }
        if (class180.field2361 == null) {
            return;
        }
        class180.field2361.method1010((byte) -127, class597.field8133, class469.field6632, class372.field5420, class574.field7827);
        if (class41.field425 == null) {
            return;
        }
        for (int var3 = class382.field5559 + 1; var3 < class41.field425.length; var3++) {
            if (class41.field425[var3].method305(-125) >= 100 && var3 - 1 == class382.field5559 && class780.field10712 >= 1 && class180.field2361.method1000((byte) -100)) {
                try {
                    class41.field425[var3].method306(11133);
                } catch (Exception var4) {
                    class41.field425 = null;
                    return;
                }
                class180.field2361.method1003(-116, class41.field425[var3]);
                class382.field5559++;
                if (class382.field5559 >= class41.field425.length - 1 && class41.field425.length > 1) {
                    class382.field5559 = class318.field4521.method2640((byte) -66) ? 0 : -1;
                }
            }
        }
        return;
    }
}

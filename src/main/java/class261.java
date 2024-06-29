import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class261 {

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Lcb;")
    public static class318 field3602 = new class318(76, 4);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public int field3596;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "Lum;")
    public static class169 field3604;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "Lxa;")
    public static class424 field3605;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "[Lgca;")
    public class126[] field3597;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILpq;B)Lil;")
    public static final class598 method1631(int arg0, class159 arg1, byte arg2) {
        if (arg2 <= 26) {
            field3602 = null;
        }
        field3601++;
        byte[] var3 = arg1.method1082((byte) 33, arg0);
        return var3 == null ? null : new class598(var3);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V")
    public static final void method1632(int arg0, int arg1) {
        field3595++;
        if (arg1 > -109) {
            field3602 = null;
        }
        class422.field5878 = arg0;
        class403.field5708.method3142(false);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method1633(int arg0) {
        field3604 = null;
        field3605 = null;
        field3602 = null;
        if (arg0 != 32) {
            field3603 = -39;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ldga;Ljv;I)Lgca;")
    private final class126 method1634(class138 arg0, class606 arg1, int arg2) {
        field3600++;
        if (class45.field601 == arg1) {
            return class82.method462(arg0, (byte) 82);
        }
        int var4 = 24 % (-arg2 / 37);
        if (class225.field2928 == arg1) {
            return class427.method2459((byte) -126, arg0);
        } else if (class210.field2753 == arg1) {
            return class485.method2704(arg0, (byte) -2);
        } else if (class226.field2935 == arg1) {
            return class132.method864(arg0, (byte) 72);
        } else if (class167.field2085 == arg1) {
            return class411.method2411(arg0, (byte) 59);
        } else if (class56.field787 == arg1) {
            return class301.method1809(arg0, -92);
        } else if (class428.field5943 == arg1) {
            return class252.method1570(arg0, (byte) 98);
        } else if (class689.field9732 == arg1) {
            return class638.method3474(14049, arg0);
        } else if (class106.field1273 == arg1) {
            return class249.method1553(arg0, 44);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V")
    public static final void method1635(int arg0, int arg1, int arg2) {
        if (arg0 > -19) {
            return;
        }
        field3598++;
        if (class39.field497 != arg1) {
            class29.field283 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class29.field283[var3] = (var3 << 12) / arg1;
            }
            class39.field497 = arg1;
            class604.field8267 = arg1 * 32;
            class144.field1839 = arg1 - 1;
        }
        if (class442.field6080 == arg2) {
            return;
        }
        if (class39.field497 == arg2) {
            class54.field709 = class29.field283;
        } else {
            class54.field709 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class54.field709[var4] = (var4 << 12) / arg2;
            }
        }
        class4.field38 = arg2 - 1;
        class442.field6080 = arg2;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLdga;)V")
    public final void method1636(byte arg0, class138 arg1) {
        field3599++;
        this.field3596 = arg1.method957((byte) -107);
        this.field3597 = new class126[arg1.method957((byte) -124)];
        if (arg0 <= -31) {
            class606[] var3 = class377.method2291((byte) -121);
            for (int var4 = 0; var4 < this.field3597.length; var4++) {
                this.field3597[var4] = this.method1634(arg1, var3[arg1.method957((byte) -65)], 39);
            }
        }
    }
}

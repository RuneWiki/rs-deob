import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class15 extends class426 {

    @OriginalMember(owner = "client!mm", name = "S", descriptor = "Z")
    public boolean field187 = true;

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "Ljg;")
    public static class241 field179 = new class241(200);

    @OriginalMember(owner = "client!mm", name = "T", descriptor = "Z")
    public static boolean field188 = true;

    @OriginalMember(owner = "client!mm", name = "V", descriptor = "I")
    public static int field190 = 0;

    @OriginalMember(owner = "client!mm", name = "W", descriptor = "Lae;")
    public static class26 field191 = null;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "C")
    private char field184;

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "client!mm", name = "U", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!mm", name = "X", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "Ljava/lang/String;")
    public String field182;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "(I)V")
    public static final void method85(int arg0) {
        field192++;
        if (!class173.field2653) {
            return;
        }
        class409.field6100 = null;
        class298.field4515 = null;
        class173.field2653 = false;
        if (arg0 < 112) {
            method86(false, false, 67);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZZI)V")
    public static final void method86(boolean arg0, boolean arg1, int arg2) {
        field189++;
        if (arg1) {
            class44.field548++;
            class138.method877(-128);
        }
        if (arg0) {
            class387.field5727++;
            class81.method525((byte) -126);
        }
        if (arg2 <= 89) {
            method88((byte) 106, -78);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lef;II)V")
    private final void method87(class385 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field184 = class398.method2517(arg0.method2341((byte) 54), (byte) -108);
        } else if (arg1 == 2) {
            this.field186 = arg0.method2354(255);
        } else if (arg1 == 4) {
            this.field187 = false;
        } else if (arg1 == 5) {
            this.field182 = arg0.method2332(57);
        }
        if (arg2 < 126) {
            this.method91((byte) 78);
        }
        field180++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI)I")
    public static final int method88(byte arg0, int arg1) {
        field181++;
        if (arg0 != -27) {
            field179 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLef;)V")
    public final void method89(boolean arg0, class385 arg1) {
        while (true) {
            int var3 = arg1.method2343(255);
            if (var3 == 0) {
                if (arg0) {
                    return;
                }
                field185++;
                return;
            }
            this.method87(arg1, var3, 127);
        }
    }

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "(I)V")
    public static void method90(int arg0) {
        field179 = null;
        field191 = null;
        if (arg0 >= -44) {
            field190 = -3;
        }
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(B)Z")
    public final boolean method91(byte arg0) {
        if (arg0 < 93) {
            field188 = false;
        }
        field183++;
        return this.field184 == 's';
    }
}

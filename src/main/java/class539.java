import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class539 {

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "I")
    public int field7507;

    @OriginalMember(owner = "client!qba", name = "f", descriptor = "Lhca;")
    public static class179 field7510 = new class179("RC", 1);

    @OriginalMember(owner = "client!qba", name = "i", descriptor = "Z")
    public static boolean field7513 = true;

    @OriginalMember(owner = "client!qba", name = "h", descriptor = "Luaa;")
    public static class395 field7512 = new class395(64);

    @OriginalMember(owner = "client!qba", name = "j", descriptor = "I")
    public static int field7514 = 0;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!qba", name = "e", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!qba", name = "g", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "Lgp;")
    public static class561 field7506;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V", line = 3)
    public static final void method3030(byte arg0) {
        class544.field7579 = null;
        field7508++;
        class78.field1416 = null;
        class98.field1706 = null;
        class66.field1011 = null;
        class144.field2231 = null;
        class524.field7283 = null;
        class430.field6278 = null;
        class631.field8866 = null;
        class574.field8177 = null;
        if (arg0 > -36) {
            field7514 = 81;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IB)V", line = 30)
    public static final void method3031(int arg0, byte arg1) {
        field7509++;
        if (class338.field4854 == null) {
            class338.field4854 = new byte[4][class146.field2247][class66.field990];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class146.field2247; var3++) {
                for (int var4 = 0; var4 < class66.field990; var4++) {
                    class338.field4854[var2][var3][var4] = arg1;
                }
            }
        }
        if (arg0 < 94) {
            method3033(48, -79, false, 77, 111);
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V", line = 66)
    public static void method3032(int arg0) {
        int var1 = -103 % ((-arg0 - 44) / 63);
        field7512 = null;
        field7506 = null;
        field7510 = null;
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(II)V", line = 79)
    public class539(int arg0, int arg1) {
        this.field7507 = arg0;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIZII)V", line = 92)
    public static final void method3033(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg1 == 0) {
            field7505++;
            if (class543.method3045(arg3, -29039)) {
                class496.method2827(true, -1, arg2, arg4, class177.field2593[arg3], arg0);
            }
        }
    }

    @OriginalMember(owner = "client!qba", name = "toString", descriptor = "()Ljava/lang/String;", line = 112)
    public final String toString() {
        field7511++;
        throw new IllegalStateException();
    }
}

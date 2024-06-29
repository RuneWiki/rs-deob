import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class14 extends RuntimeException {

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Ljava/lang/String;")
    public String field214;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field212;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field209 = 0;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static volatile int field210 = 0;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field211 = -1;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field219 = 0;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Lha;")
    private static class46 field217 = class271.method1828("Discard", -46);

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Lha;")
    public static class46 field215 = field217;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "[B")
    public static byte[] field213 = new byte[32896];

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "Lij;")
    public static class242 field220;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class14(Throwable arg0, String arg1) {
        this.field214 = arg1;
        this.field212 = arg0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static final void method74(int arg0) {
        class150.field2684.method84(-32377);
        field218++;
        if (arg0 != 28924) {
            method75((byte) 36);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static final void method75(byte arg0) {
        if (class9.field152.toLowerCase().indexOf("microsoft") == -1) {
            class33.field611[59] = 57;
            class33.field611[46] = 72;
            class33.field611[93] = 43;
            if (class9.field161 == null) {
                class33.field611[222] = 59;
                class33.field611[192] = 58;
            } else {
                class33.field611[222] = 58;
                class33.field611[192] = 28;
                class33.field611[520] = 59;
            }
            class33.field611[45] = 26;
            class33.field611[61] = 27;
            class33.field611[91] = 42;
            class33.field611[44] = 71;
            class33.field611[47] = 73;
            class33.field611[92] = 74;
        } else {
            class33.field611[191] = 73;
            class33.field611[189] = 26;
            class33.field611[221] = 43;
            class33.field611[188] = 71;
            class33.field611[190] = 72;
            class33.field611[192] = 58;
            class33.field611[220] = 74;
            class33.field611[223] = 28;
            class33.field611[186] = 57;
            class33.field611[222] = 59;
            class33.field611[219] = 42;
            class33.field611[187] = 27;
        }
        if (arg0 != -119) {
            field210 = 117;
        }
        field208++;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    public static void method76(int arg0) {
        if (arg0 != -257) {
            method75((byte) 9);
        }
        field215 = null;
        field217 = null;
        field213 = null;
        field220 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field213[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field220 = new class242();
    }
}

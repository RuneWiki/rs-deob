import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class125 extends class179 {

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public int field1397 = 1;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public static int field1398 = 0;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "[B")
    public static byte[] field1400 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "C")
    public char field1401;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(Z)V")
    public static void method810(boolean arg0) {
        field1400 = null;
        if (!arg0) {
            field1398 = 16;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lbg;I)V")
    public final void method811(class242 arg0, int arg1) {
        field1399++;
        while (true) {
            int var3 = arg0.method1563(-128);
            if (var3 == 0) {
                if (arg1 == -1) {
                    return;
                } else {
                    field1400 = null;
                    return;
                }
            }
            this.method812(var3, arg0, (byte) 104);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILbg;B)V")
    private final void method812(int arg0, class242 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field1401 = class156.method996(arg1.method1589(false), 10);
        } else if (arg0 == 2) {
            this.field1397 = 0;
        }
        field1396++;
        if (arg2 != 104) {
            method810(true);
        }
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(Z)V")
    public static final void method813(boolean arg0) {
        field1395++;
        class424.field5810.method2298(0);
        if (arg0) {
            method810(true);
        }
    }

    static {
        new class72("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
    }
}

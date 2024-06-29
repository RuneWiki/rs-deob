import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class751 extends class172 {

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Ljn;")
    public static class134 field10367 = new class134(28, -1);

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "[Ljava/awt/Color;")
    public static Color[] field10368 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field10363;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field10364;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field10365;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    private int field10366;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "J")
    private long field10362;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static final void method4155(byte arg0) {
        if (arg0 <= 74) {
            field10367 = null;
        }
        class650.method3721(0);
        field10364++;
        class482.method2865(23105);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILgga;)V")
    public final void method102(int arg0, class511 arg1) {
        field10363++;
        this.field10366 = arg1.method3008(64);
        this.field10362 = arg1.method3020(true);
        if (arg0 != 2048) {
            field10368 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
    public static void method4156(byte arg0) {
        field10367 = null;
        if (arg0 == 66) {
            field10368 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLhia;)V")
    public final void method100(byte arg0, class48 arg1) {
        arg1.method397(false, this.field10366, this.field10362);
        if (arg0 != 71) {
            this.method100((byte) 41, null);
        }
        field10365++;
    }
}

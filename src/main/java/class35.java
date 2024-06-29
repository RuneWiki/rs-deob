import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class35 extends class108 {

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "[Ljava/awt/Color;")
    public static Color[] field464 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public int field488;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "Ldba;")
    public class221 field486;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "Lfc;")
    public class320 field471;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "Lew;")
    public class336 field487;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "Lar;")
    public class4 field478;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "Llq;")
    public static class9 field485;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)B", line = 10)
    public static final byte method312(int arg0, int arg1, int arg2) {
        if (arg1 < 107) {
            field464 = null;
        }
        field473++;
        if (arg0 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 35)
    public final void method313(byte arg0) {
        this.field487 = null;
        this.field486 = null;
        this.field478 = null;
        if (arg0 >= 24) {
            field462++;
            this.field471 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 55)
    public static void method314(int arg0) {
        if (arg0 > -6) {
            method314(-86);
        }
        field485 = null;
        field464 = null;
    }
}

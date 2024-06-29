import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class117 {

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public int field1837 = 2048;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public int field1833 = 0;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public int field1845 = 0;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public int field1846 = 2048;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field1840 = 100;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lna;")
    public static class26 field1834 = class69.method505("Liste des mises -9 jour charg-Be", (byte) -121);

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Lna;")
    public static class26 field1843 = class69.method505("Sprites charg-Bs", (byte) -118);

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "[I")
    public static int[] field1842 = new int[200];

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[I")
    public static int[] field1835 = new int[2500];

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Lna;")
    public static class26 field1839 = class69.method505("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", (byte) -125);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Lqf;")
    public static class148 field1831;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILwa;I)V", line = 27)
    public final void method810(int arg0, class82 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method642((byte) -88);
            if (var4 == 0) {
                if (arg0 != 2) {
                    field1843 = (class26) null;
                }
                field1836++;
                return;
            }
            this.method811(var4, arg1, arg2, true);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILwa;IZ)V", line = 50)
    private final void method811(int arg0, class82 arg1, int arg2, boolean arg3) {
        field1832++;
        if (arg0 == 1) {
            this.field1833 = arg1.method642((byte) -78);
        } else if (arg0 == 2) {
            this.field1846 = arg1.method576(1);
        } else if (arg0 == 3) {
            this.field1837 = arg1.method576(1);
        } else if (arg0 == 4) {
            this.field1845 = arg1.method626((byte) 46);
        }
        if (!arg3) {
            method812((byte) 123);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 100)
    public static void method812(byte arg0) {
        field1834 = null;
        field1835 = null;
        field1839 = null;
        field1842 = null;
        field1843 = null;
        if (arg0 == -86) {
            field1831 = null;
        }
    }
}

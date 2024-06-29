import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class405 extends class189 {

    @OriginalMember(owner = "client!qba", name = "v", descriptor = "I")
    public static int field5736 = -1;

    @OriginalMember(owner = "client!qba", name = "x", descriptor = "I")
    public static int field5738 = -1;

    @OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
    public int field5726;

    @OriginalMember(owner = "client!qba", name = "m", descriptor = "I")
    public int field5727;

    @OriginalMember(owner = "client!qba", name = "o", descriptor = "I")
    public int field5729;

    @OriginalMember(owner = "client!qba", name = "p", descriptor = "I")
    public int field5730;

    @OriginalMember(owner = "client!qba", name = "q", descriptor = "I")
    public int field5731;

    @OriginalMember(owner = "client!qba", name = "r", descriptor = "I")
    public int field5732;

    @OriginalMember(owner = "client!qba", name = "s", descriptor = "I")
    public int field5733;

    @OriginalMember(owner = "client!qba", name = "t", descriptor = "I")
    public int field5734;

    @OriginalMember(owner = "client!qba", name = "w", descriptor = "I")
    public int field5737;

    @OriginalMember(owner = "client!qba", name = "y", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "I")
    public int field5740;

    @OriginalMember(owner = "client!qba", name = "A", descriptor = "I")
    public int field5741;

    @OriginalMember(owner = "client!qba", name = "B", descriptor = "I")
    public int field5742;

    @OriginalMember(owner = "client!qba", name = "E", descriptor = "I")
    public int field5744;

    @OriginalMember(owner = "client!qba", name = "F", descriptor = "I")
    public int field5745;

    @OriginalMember(owner = "client!qba", name = "G", descriptor = "I")
    public int field5746;

    @OriginalMember(owner = "client!qba", name = "H", descriptor = "I")
    public int field5747;

    @OriginalMember(owner = "client!qba", name = "I", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!qba", name = "J", descriptor = "I")
    public int field5749;

    @OriginalMember(owner = "client!qba", name = "K", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!qba", name = "n", descriptor = "Lvf;")
    public class150 field5728;

    @OriginalMember(owner = "client!qba", name = "u", descriptor = "Lsq;")
    public class176 field5735;

    @OriginalMember(owner = "client!qba", name = "k", descriptor = "Lfp;")
    public static class323 field5725;

    @OriginalMember(owner = "client!qba", name = "j", descriptor = "Loj;")
    public class379 field5724;

    @OriginalMember(owner = "client!qba", name = "D", descriptor = "Lnp;")
    public class490 field5743;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
    public static final void method2515(int arg0) {
        field5750++;
        if (arg0 > -84) {
            return;
        }
        int var1 = class557.field7812.field6509.method3516(false);
        if (var1 == 0) {
            class741.field10305 = null;
            class66.method549(0, 3721);
        } else if (var1 == 1) {
            class508.method3001(-123, (byte) 0);
            class66.method549(512, 3721);
            if (class651.field8948 != null) {
                class318.method2064((byte) -94);
            }
        } else {
            class508.method3001(-88, (byte) (class82.field1033 - 4 & 0xFF));
            class66.method549(2, 3721);
        }
        class67.field825 = class526.field7430;
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)V")
    public static final void method2516(byte arg0) {
        class492.method2929(1);
        if (arg0 <= 42) {
            method2515(-110);
        }
        field5748++;
        class436.field6192 = false;
        class721.method4050(class470.field6668, class225.field3039, -17012, class652.field8959, class208.field2732);
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)V")
    public static void method2517(int arg0) {
        if (arg0 != 4) {
            method2517(116);
        }
        field5725 = null;
    }

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "(B)V")
    public final void method2518(byte arg0) {
        field5739++;
        this.field5743 = null;
        this.field5728 = null;
        this.field5724 = null;
        if (arg0 < 84) {
            this.method2518((byte) -122);
        }
        this.field5735 = null;
    }
}

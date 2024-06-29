import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class101 {

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    private int field1489 = 0;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    private int field1491 = 0;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "Lnk;")
    private class501 field1497 = null;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    private int field1494 = 0;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "Lbo;")
    private class511 field1493;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "Lri;")
    private class73 field1492;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "[Lgr;")
    private class297[] field1490;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "Lwe;")
    public class279 field1495;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "Lpn;")
    public static class523 field1498 = class42.method301(2515);

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "Lvj;")
    public static class304 field1502 = new class304("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "Lpc;")
    public static class473 field1499;

    static {
        new class304("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V", line = 4)
    public static void method711(boolean arg0) {
        field1502 = null;
        if (arg0) {
            method711(false);
        }
        field1498 = null;
        field1499 = null;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lbo;)V", line = 129)
    public class101(class511 arg0) {
        this.field1493 = arg0;
        this.field1492 = new class73(arg0);
        this.field1490 = new class297[10];
        this.field1490[1] = new class329(arg0);
        this.field1490[2] = new class394(arg0, this.field1492);
        this.field1490[4] = new class30(arg0, this.field1492);
        this.field1490[5] = new class226(arg0, this.field1492);
        this.field1490[6] = new class296(arg0);
        this.field1490[7] = new class505(arg0);
        this.field1490[3] = this.field1495 = new class279(arg0);
        this.field1490[8] = new class242(arg0, this.field1492);
        this.field1490[9] = new class452(arg0, this.field1492);
        if (!this.field1490[8].method240(false)) {
            this.field1490[8] = this.field1490[4];
        }
        if (!this.field1490[9].method240(false)) {
            this.field1490[9] = this.field1490[8];
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZI)Z", line = 21)
    public final boolean method712(boolean arg0, int arg1) {
        field1496++;
        return arg0 ? this.field1490[arg1].method240(!arg0) : false;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILnk;B)Z", line = 34)
    public final boolean method713(int arg0, class501 arg1, byte arg2) {
        field1488++;
        if (this.field1491 == 0) {
            return false;
        } else if (arg2 == 97) {
            if (this.field1497 != arg1) {
                this.field1490[Integer.MAX_VALUE & this.field1491].method248(arg1, 0, arg0);
                this.field1497 = arg1;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V", line = 63)
    public final void method714(int arg0, int arg1, int arg2) {
        int var4 = 80 % ((25 - arg0) / 61);
        if ((this.field1494 != arg2 | this.field1489 != arg1) & this.field1491 != 0) {
            this.field1490[Integer.MAX_VALUE & this.field1491].method245(true, arg2, arg1);
            this.field1494 = arg2;
            this.field1489 = arg1;
        }
        field1501++;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZZZI)V", line = 79)
    public final void method715(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        field1500++;
        boolean var5 = arg1 & this.field1493.method558();
        if (!var5 && (arg3 == 4 || arg3 == 8)) {
            arg3 = 2;
        }
        if (arg3 != 0 && arg2) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (arg0) {
            this.field1489 = 43;
        }
        if (this.field1491 != arg3) {
            if (this.field1491 != 0) {
                this.field1490[Integer.MAX_VALUE & this.field1491].method246(6);
            }
            if (arg3 != 0) {
                this.field1490[arg3 & Integer.MAX_VALUE].method244(0, arg2);
                this.field1490[Integer.MAX_VALUE & arg3].method241(arg2, -30965);
            }
            this.field1497 = null;
            this.field1491 = arg3;
            this.field1494 = Integer.MIN_VALUE;
            this.field1489 = Integer.MIN_VALUE;
        } else if (this.field1491 != 0) {
            this.field1490[this.field1491 & Integer.MAX_VALUE].method241(arg2, -30965);
            return;
        }
    }
}

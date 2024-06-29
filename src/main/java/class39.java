import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class39 extends class101 {

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    public int field605 = 0;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "Ljw;")
    public static class581 field601 = new class581(21, 3);

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public static int field623 = -1;

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "Ltja;")
    public static class288 field628 = new class288(12, 3);

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "F")
    public static float field622;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public int field597;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public int field599;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public int field602;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
    public int field626;

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "I")
    public int field627;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "Lwp;")
    public class192 field619;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "Lks;")
    public class465 field600;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "Lks;")
    public class465 field621;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "Lpu;")
    public class589 field593;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "Lmk;")
    public class61 field596;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "Lmk;")
    public class61 field609;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "Lab;")
    public class699 field611;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "Lab;")
    public class699 field616;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "Lwc;")
    public class73 field610;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "Z")
    public boolean field595;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "Z")
    public boolean field603;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "Z")
    public boolean field624;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "[I")
    public int[] field620;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "[Lkha;")
    public static class610[] field598;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static void method271(byte arg0) {
        field628 = null;
        field601 = null;
        field598 = null;
        int var1 = 5 / ((91 - arg0) / 32);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(III)Z")
    public static final boolean method272(int arg0, int arg1, int arg2) {
        field606++;
        if (arg0 == 0) {
            return (arg1 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIII)V")
    public static final void method273(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field625++;
        int var5 = 0;
        if (arg3 != -1) {
            field622 = 0.8603539F;
        }
        while (var5 < class131.field1940) {
            Rectangle var6 = class296.field4291[var5];
            if ((var6.x + var6.width) > arg4 && (arg1 + arg4) > var6.x && arg2 < var6.y + var6.height && (arg2 + arg0) > var6.y) {
                class756.field10500[var5] = true;
            }
            var5++;
        }
        class716.method4001(arg4 + arg1, (byte) -102, arg2 + arg0, arg2, arg4);
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)V")
    public final void method274(byte arg0) {
        field615++;
        int var2 = this.field592;
        if (arg0 != 31) {
            this.field605 = -51;
        }
        boolean var3 = this.field595;
        if (this.field593 != null) {
            class589 var6 = this.field593.method3290(1, class382.field5602);
            if (var6 == null) {
                this.field602 = 0;
                this.field626 = 0;
                this.field620 = null;
                this.field594 = 0;
                this.field607 = 0;
                this.field608 = 256;
                this.field613 = 256;
                this.field592 = -1;
                this.field617 = 0;
                this.field603 = false;
                this.field595 = false;
            } else {
                this.field620 = var6.field7916;
                this.field603 = var6.field7926;
                this.field626 = var6.field7922;
                this.field608 = var6.field7921;
                this.field602 = var6.field7902;
                this.field594 = var6.field7900;
                this.field595 = var6.field7882;
                this.field617 = var6.field7945 << 9;
                this.field613 = var6.field7917;
                this.field592 = var6.field7918;
            }
        } else if (this.field619 != null) {
            int var4 = class467.method2759(this.field619, 126);
            if (var2 != var4) {
                this.field592 = var4;
                class220 var5 = this.field619.field2577;
                if (var5.field2995 != null) {
                    var5 = var5.method1449(class382.field5602, -1);
                }
                if (var5 == null) {
                    this.field608 = 256;
                    this.field594 = this.field617 = this.field607 = 0;
                    this.field595 = this.field619.field2577.field2985;
                    this.field613 = 256;
                } else {
                    this.field613 = var5.field2976;
                    this.field608 = var5.field2950;
                    this.field617 = var5.field2962 << 9;
                    this.field607 = var5.field2978 << 9;
                    this.field595 = var5.field2985;
                    this.field594 = var5.field2946;
                }
            }
        } else if (this.field610 != null) {
            this.field592 = class720.method4019((byte) -109, this.field610);
            this.field613 = 256;
            this.field617 = this.field610.field1062 << 9;
            this.field594 = this.field610.field1077;
            this.field595 = this.field610.field1053;
            this.field607 = 0;
            this.field608 = 256;
        }
        if (this.field592 == var2 && var3 == this.field595) {
            return;
        }
        if (this.field611 == null) {
            return;
        }
        class686.field9647.method590(this.field611);
        this.field596 = null;
        this.field600 = null;
        this.field611 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
    public static final void method275(int arg0, int arg1) {
        class64.method446((byte) -50);
        field614++;
        int var2 = class488.field6763.method2178(arg1, (byte) -127).field6835;
        if (var2 == 0) {
            return;
        }
        int var3 = class382.field5602.field5274[arg1];
        if (arg0 == var2) {
            class601.field8182 = var3;
        }
        if (var2 == 5) {
            class752.field10419 = var3;
        }
    }
}

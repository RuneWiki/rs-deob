import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class29 {

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    private int field463 = -1;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    private int field464 = 0;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lpu;")
    private class411 field466 = new class411();

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Z")
    public boolean field474 = false;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "[Lev;")
    private class107[] field465;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "[[I")
    private int[][] field473;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field471 = 0;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field460 = 0;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field467 = 0;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "[I")
    public static int[] field476;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lqs;")
    public static class496 field472;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public final void method230(boolean arg0) {
        if (arg0) {
            this.method230(true);
        }
        field468++;
        for (int var2 = 0; var2 < this.field461; var2++) {
            this.field473[var2] = null;
        }
        this.field465 = null;
        this.field473 = null;
        this.field466.method2543(7655);
        this.field466 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static void method231(byte arg0) {
        field476 = null;
        field472 = null;
        int var1 = 11 % ((arg0 + 70) / 52);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)[I")
    public final int[] method232(int arg0, boolean arg1) {
        if (!arg1) {
            field472 = null;
        }
        field469++;
        if (this.field470 == this.field461) {
            this.field474 = this.field465[arg0] == null;
            this.field465[arg0] = class466.field6923;
            return this.field473[arg0];
        } else if (this.field461 == 1) {
            this.field474 = this.field463 != arg0;
            this.field463 = arg0;
            return this.field473[0];
        } else {
            class107 var3 = this.field465[arg0];
            if (var3 == null) {
                this.field474 = true;
                if (this.field461 <= this.field464) {
                    class107 var4 = (class107) this.field466.method2546((byte) -121);
                    var3 = new class107(arg0, var4.field1907);
                    this.field465[var4.field1904] = null;
                    var4.method1821((byte) -102);
                } else {
                    var3 = new class107(arg0, this.field464);
                    this.field464++;
                }
                this.field465[arg0] = var3;
            } else {
                this.field474 = false;
            }
            this.field466.method2545(var3, 4009);
            return this.field473[var3.field1907];
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)[[I")
    public final int[][] method233(int arg0) {
        field462++;
        if (this.field470 != this.field461) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field461; var2++) {
            this.field465[var2] = class466.field6923;
        }
        if (arg0 != -7777) {
            this.method232(-57, true);
        }
        return this.field473;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(III)V")
    public class29(int arg0, int arg1, int arg2) {
        this.field470 = arg1;
        this.field461 = arg0;
        this.field465 = new class107[this.field470];
        this.field473 = new int[this.field461][arg2];
    }

    static {
        new class306("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field476 = new int[1000];
    }
}

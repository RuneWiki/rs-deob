import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class25 {

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    private int field464 = 2;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "[I")
    private int[] field467 = new int[2];

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "[I")
    private int[] field463 = new int[2];

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    private int field469;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    private int field471;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    private int field472;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljg;)V")
    public final void method123(class89 arg0) {
        this.field466 = arg0.method538((byte) -70);
        this.field465 = arg0.method545(-7436);
        this.field462 = arg0.method545(-7436);
        this.method126(arg0);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)I")
    public final int method124(int arg0) {
        if (this.field470 >= this.field469) {
            this.field472 = this.field463[this.field468++] << 15;
            if (this.field468 >= this.field464) {
                this.field468 = this.field464 - 1;
            }
            this.field469 = (int) ((double) this.field467[this.field468] / 65536.0D * (double) arg0);
            if (this.field469 > this.field470) {
                this.field471 = ((this.field463[this.field468] << 15) - this.field472) / (this.field469 - this.field470);
            }
        }
        this.field472 += this.field471;
        this.field470++;
        return this.field472 - this.field471 >> 15;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()V")
    public final void method125() {
        this.field469 = 0;
        this.field468 = 0;
        this.field471 = 0;
        this.field472 = 0;
        this.field470 = 0;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Ljg;)V")
    public final void method126(class89 arg0) {
        this.field464 = arg0.method538((byte) 76);
        this.field467 = new int[this.field464];
        this.field463 = new int[this.field464];
        for (int var2 = 0; var2 < this.field464; var2++) {
            this.field467[var2] = arg0.method555(-1113627096);
            this.field463[var2] = arg0.method555(-1113627096);
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class25() {
        this.field467[0] = 0;
        this.field467[1] = 65535;
        this.field463[0] = 0;
        this.field463[1] = 65535;
    }
}

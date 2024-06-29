import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class13 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    private int field439 = 2;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "[I")
    private int[] field440 = new int[2];

    @OriginalMember(owner = "client!c", name = "f", descriptor = "[I")
    private int[] field444 = new int[2];

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()V", line = 5)
    public final void method249() {
        this.field447 = 0;
        this.field448 = 0;
        this.field446 = 0;
        this.field449 = 0;
        this.field445 = 0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lba;)V", line = 14)
    public final void method250(class8 arg0) {
        this.field442 = arg0.method145(false);
        this.field441 = arg0.method168(-4750);
        this.field443 = arg0.method168(-4750);
        this.method251(arg0);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Lba;)V", line = 22)
    public final void method251(class8 arg0) {
        this.field439 = arg0.method145(false);
        this.field440 = new int[this.field439];
        this.field444 = new int[this.field439];
        for (int var2 = 0; var2 < this.field439; var2++) {
            this.field440[var2] = arg0.method146(65280);
            this.field444[var2] = arg0.method146(65280);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)I", line = 37)
    public final int method252(int arg0) {
        if (this.field445 >= this.field447) {
            this.field449 = this.field444[this.field448++] << 15;
            if (this.field448 >= this.field439) {
                this.field448 = this.field439 - 1;
            }
            this.field447 = (int) ((double) this.field440[this.field448] / 65536.0D * (double) arg0);
            if (this.field447 > this.field445) {
                this.field446 = ((this.field444[this.field448] << 15) - this.field449) / (this.field447 - this.field445);
            }
        }
        this.field449 += this.field446;
        this.field445++;
        return this.field449 - this.field446 >> 15;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V", line = 56)
    public class13() {
        this.field440[0] = 0;
        this.field440[1] = 65535;
        this.field444[0] = 0;
        this.field444[1] = 65535;
    }
}

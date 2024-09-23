import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TMVRZUVH")
public class class49 {

    @OriginalMember(owner = "TMVRZUVH", name = "a", descriptor = "I")
    private int field1469 = 5;

    @OriginalMember(owner = "TMVRZUVH", name = "b", descriptor = "Z")
    private boolean field1470 = true;

    @OriginalMember(owner = "TMVRZUVH", name = "c", descriptor = "I")
    private int field1471;

    @OriginalMember(owner = "TMVRZUVH", name = "f", descriptor = "I")
    public int field1474;

    @OriginalMember(owner = "TMVRZUVH", name = "g", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "TMVRZUVH", name = "h", descriptor = "I")
    public int field1476;

    @OriginalMember(owner = "TMVRZUVH", name = "i", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "TMVRZUVH", name = "j", descriptor = "I")
    private int field1478;

    @OriginalMember(owner = "TMVRZUVH", name = "k", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "TMVRZUVH", name = "l", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "TMVRZUVH", name = "m", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "TMVRZUVH", name = "n", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "TMVRZUVH", name = "d", descriptor = "[I")
    private int[] field1472;

    @OriginalMember(owner = "TMVRZUVH", name = "e", descriptor = "[I")
    private int[] field1473;

    @OriginalMember(owner = "TMVRZUVH", name = "a", descriptor = "(LGHHPHSRU;I)V")
    public final void method488(class14 arg0, int arg1) {
        this.field1476 = arg0.method202();
        this.field1474 = arg0.method207();
        this.field1475 = arg0.method207();
        this.method489(arg0, (byte) 8);
        if (arg1 != 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "TMVRZUVH", name = "a", descriptor = "(LGHHPHSRU;B)V")
    public final void method489(class14 arg0, byte arg1) {
        this.field1471 = arg0.method202();
        this.field1472 = new int[this.field1471];
        this.field1473 = new int[this.field1471];
        if (arg1 == 8) {
            boolean var3 = false;
        } else {
            this.field1469 = 220;
        }
        for (int var4 = 0; var4 < this.field1471; var4++) {
            this.field1472[var4] = arg0.method204();
            this.field1473[var4] = arg0.method204();
        }
    }

    @OriginalMember(owner = "TMVRZUVH", name = "a", descriptor = "(Z)V")
    public final void method490(boolean arg0) {
        this.field1477 = 0;
        this.field1478 = 0;
        this.field1479 = 0;
        this.field1480 = 0;
        this.field1481 = 0;
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "TMVRZUVH", name = "a", descriptor = "(ZI)I")
    public final int method491(boolean arg0, int arg1) {
        if (this.field1481 >= this.field1477) {
            this.field1480 = this.field1473[this.field1478++] << 15;
            if (this.field1478 >= this.field1471) {
                this.field1478 = this.field1471 - 1;
            }
            this.field1477 = (int) ((double) this.field1472[this.field1478] / 65536.0D * (double) arg1);
            if (this.field1477 > this.field1481) {
                this.field1479 = ((this.field1473[this.field1478] << 15) - this.field1480) / (this.field1477 - this.field1481);
            }
        }
        this.field1480 += this.field1479;
        this.field1481++;
        if (!arg0) {
            this.field1470 = !this.field1470;
        }
        return this.field1480 - this.field1479 >> 15;
    }
}

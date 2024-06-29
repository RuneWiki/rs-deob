import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SSKEPHYP")
public class class60 {

    @OriginalMember(owner = "client!SSKEPHYP", name = "a", descriptor = "Z")
    private boolean field1371 = true;

    @OriginalMember(owner = "client!SSKEPHYP", name = "b", descriptor = "I")
    private int field1372 = 21057;

    @OriginalMember(owner = "client!SSKEPHYP", name = "c", descriptor = "I")
    private int field1373;

    @OriginalMember(owner = "client!SSKEPHYP", name = "f", descriptor = "I")
    public int field1376;

    @OriginalMember(owner = "client!SSKEPHYP", name = "g", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "client!SSKEPHYP", name = "h", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "client!SSKEPHYP", name = "i", descriptor = "I")
    private int field1379;

    @OriginalMember(owner = "client!SSKEPHYP", name = "j", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client!SSKEPHYP", name = "k", descriptor = "I")
    private int field1381;

    @OriginalMember(owner = "client!SSKEPHYP", name = "l", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client!SSKEPHYP", name = "m", descriptor = "I")
    private int field1383;

    @OriginalMember(owner = "client!SSKEPHYP", name = "n", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!SSKEPHYP", name = "d", descriptor = "[I")
    private int[] field1374;

    @OriginalMember(owner = "client!SSKEPHYP", name = "e", descriptor = "[I")
    private int[] field1375;

    @OriginalMember(owner = "client!SSKEPHYP", name = "a", descriptor = "(LJHKSAGUC;I)V")
    public final void method479(class31 arg0, int arg1) {
        this.field1378 = arg0.method306();
        this.field1376 = arg0.method311();
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1377 = arg0.method311();
        this.method480(arg0, 8);
    }

    @OriginalMember(owner = "client!SSKEPHYP", name = "b", descriptor = "(LJHKSAGUC;I)V")
    public final void method480(class31 arg0, int arg1) {
        this.field1373 = arg0.method306();
        this.field1374 = new int[this.field1373];
        this.field1375 = new int[this.field1373];
        int var3 = 46 / arg1;
        for (int var4 = 0; var4 < this.field1373; var4++) {
            this.field1374[var4] = arg0.method308();
            this.field1375[var4] = arg0.method308();
        }
    }

    @OriginalMember(owner = "client!SSKEPHYP", name = "a", descriptor = "(I)V")
    public final void method481(int arg0) {
        this.field1379 = 0;
        this.field1380 = 0;
        this.field1381 = 0;
        while (arg0 >= 0) {
            this.field1372 = -256;
        }
        this.field1382 = 0;
        this.field1383 = 0;
    }

    @OriginalMember(owner = "client!SSKEPHYP", name = "a", descriptor = "(IZ)I")
    public final int method482(int arg0, boolean arg1) {
        if (this.field1383 >= this.field1379) {
            this.field1382 = this.field1375[this.field1380++] << 15;
            if (this.field1380 >= this.field1373) {
                this.field1380 = this.field1373 - 1;
            }
            this.field1379 = (int) ((double) this.field1374[this.field1380] / 65536.0D * (double) arg0);
            if (this.field1379 > this.field1383) {
                this.field1381 = ((this.field1375[this.field1380] << 15) - this.field1382) / (this.field1379 - this.field1383);
            }
        }
        this.field1382 += this.field1381;
        this.field1383++;
        return arg1 ? this.field1382 - this.field1381 >> 15 : this.field1372;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class106 {

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    private int field1396 = 2;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[I")
    private int[] field1395 = new int[2];

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "[I")
    private int[] field1394 = new int[2];

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    private int field1402;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lvl;)V", line = 4)
    public final void method726(class6 arg0) {
        this.field1397 = arg0.method58(-288140008);
        this.field1398 = arg0.method73((byte) 19);
        this.field1399 = arg0.method73((byte) 19);
        this.method728(arg0);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V", line = 10)
    public final void method727() {
        this.field1404 = 0;
        this.field1400 = 0;
        this.field1402 = 0;
        this.field1401 = 0;
        this.field1403 = 0;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Lvl;)V", line = 21)
    public final void method728(class6 arg0) {
        this.field1396 = arg0.method58(-288140008);
        this.field1395 = new int[this.field1396];
        this.field1394 = new int[this.field1396];
        for (int var2 = 0; var2 < this.field1396; var2++) {
            this.field1395[var2] = arg0.method39((byte) 39);
            this.field1394[var2] = arg0.method39((byte) 48);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I", line = 37)
    public final int method729(int arg0) {
        if (this.field1403 >= this.field1404) {
            this.field1401 = this.field1394[this.field1400++] << 15;
            if (this.field1400 >= this.field1396) {
                this.field1400 = this.field1396 - 1;
            }
            this.field1404 = (int) ((double) this.field1395[this.field1400] / 65536.0D * (double) arg0);
            if (this.field1404 > this.field1403) {
                this.field1402 = ((this.field1394[this.field1400] << 15) - this.field1401) / (this.field1404 - this.field1403);
            }
        }
        this.field1401 += this.field1402;
        this.field1403++;
        return this.field1401 - this.field1402 >> 15;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 56)
    public class106() {
        this.field1395[0] = 0;
        this.field1395[1] = 65535;
        this.field1394[0] = 0;
        this.field1394[1] = 65535;
    }
}

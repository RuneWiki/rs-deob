import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class88 {

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    private int field1396 = 2;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "[I")
    private int[] field1399 = new int[2];

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "[I")
    private int[] field1395 = new int[2];

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    private int field1402;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
    public final void method635() {
        this.field1402 = 0;
        this.field1401 = 0;
        this.field1405 = 0;
        this.field1403 = 0;
        this.field1404 = 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Log;)V")
    public final void method636(class221 arg0) {
        this.field1396 = arg0.method1517((byte) -96);
        this.field1399 = new int[this.field1396];
        this.field1395 = new int[this.field1396];
        for (int var2 = 0; var2 < this.field1396; var2++) {
            this.field1399[var2] = arg0.method1521((byte) 113);
            this.field1395[var2] = arg0.method1521((byte) 113);
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Log;)V")
    public final void method637(class221 arg0) {
        this.field1398 = arg0.method1517((byte) -96);
        this.field1400 = arg0.method1526(-16777216);
        this.field1397 = arg0.method1526(-16777216);
        this.method636(arg0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)I")
    public final int method638(int arg0) {
        if (this.field1404 >= this.field1402) {
            this.field1403 = this.field1395[this.field1401++] << 15;
            if (this.field1401 >= this.field1396) {
                this.field1401 = this.field1396 - 1;
            }
            this.field1402 = (int) ((double) this.field1399[this.field1401] / 65536.0D * (double) arg0);
            if (this.field1402 > this.field1404) {
                this.field1405 = ((this.field1395[this.field1401] << 15) - this.field1403) / (this.field1402 - this.field1404);
            }
        }
        this.field1403 += this.field1405;
        this.field1404++;
        return this.field1403 - this.field1405 >> 15;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class88() {
        this.field1399[0] = 0;
        this.field1399[1] = 65535;
        this.field1395[0] = 0;
        this.field1395[1] = 65535;
    }
}

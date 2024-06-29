import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class49 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    private int field1187 = 2;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "[I")
    private int[] field1190 = new int[2];

    @OriginalMember(owner = "client!h", name = "e", descriptor = "[I")
    private int[] field1191 = new int[2];

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public int field1192;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    private int field1193;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    private int field1194;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    private int field1195;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    private int field1196;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    private int field1197;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)I")
    public final int method410(int arg0) {
        if (this.field1194 >= this.field1193) {
            this.field1196 = this.field1191[this.field1197++] << 15;
            if (this.field1197 >= this.field1187) {
                this.field1197 = this.field1187 - 1;
            }
            this.field1193 = (int) ((double) this.field1190[this.field1197] / 65536.0D * (double) arg0);
            if (this.field1193 > this.field1194) {
                this.field1195 = ((this.field1191[this.field1197] << 15) - this.field1196) / (this.field1193 - this.field1194);
            }
        }
        this.field1196 += this.field1195;
        this.field1194++;
        return this.field1196 - this.field1195 >> 15;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lpa;)V")
    public final void method411(class105 arg0) {
        this.field1187 = arg0.method831((byte) 76);
        this.field1190 = new int[this.field1187];
        this.field1191 = new int[this.field1187];
        for (int var2 = 0; var2 < this.field1187; var2++) {
            this.field1190[var2] = arg0.method838((byte) 5);
            this.field1191[var2] = arg0.method838((byte) 5);
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Lpa;)V")
    public final void method412(class105 arg0) {
        this.field1189 = arg0.method831((byte) 76);
        this.field1188 = arg0.method821((byte) 82);
        this.field1192 = arg0.method821((byte) 84);
        this.method411(arg0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()V")
    public final void method413() {
        this.field1193 = 0;
        this.field1197 = 0;
        this.field1195 = 0;
        this.field1196 = 0;
        this.field1194 = 0;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
    public class49() {
        this.field1190[0] = 0;
        this.field1190[1] = 65535;
        this.field1191[0] = 0;
        this.field1191[1] = 65535;
    }
}

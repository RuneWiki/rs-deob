import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class71 {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    private int field1205 = 2;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[I")
    private int[] field1204 = new int[2];

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "[I")
    private int[] field1202 = new int[2];

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    private int field1208;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    private int field1209;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    private int field1210;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    private int field1211;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lja;)V", line = 7)
    public final void method592(class60 arg0) {
        this.field1207 = arg0.method501(0);
        this.field1206 = arg0.method505(255);
        this.field1203 = arg0.method505(255);
        this.method593(arg0);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Lja;)V", line = 16)
    public final void method593(class60 arg0) {
        this.field1205 = arg0.method501(0);
        this.field1204 = new int[this.field1205];
        this.field1202 = new int[this.field1205];
        for (int var2 = 0; var2 < this.field1205; var2++) {
            this.field1204[var2] = arg0.method485((byte) -2);
            this.field1202[var2] = arg0.method485((byte) -2);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)I", line = 32)
    public final int method594(int arg0) {
        if (this.field1212 >= this.field1211) {
            this.field1209 = this.field1202[this.field1210++] << 15;
            if (this.field1210 >= this.field1205) {
                this.field1210 = this.field1205 - 1;
            }
            this.field1211 = (int) ((double) this.field1204[this.field1210] / 65536.0D * (double) arg0);
            if (this.field1211 > this.field1212) {
                this.field1208 = ((this.field1202[this.field1210] << 15) - this.field1209) / (this.field1211 - this.field1212);
            }
        }
        this.field1209 += this.field1208;
        this.field1212++;
        return this.field1209 - this.field1208 >> 15;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 49)
    public class71() {
        this.field1204[0] = 0;
        this.field1204[1] = 65535;
        this.field1202[0] = 0;
        this.field1202[1] = 65535;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()V", line = 60)
    public final void method595() {
        this.field1211 = 0;
        this.field1210 = 0;
        this.field1208 = 0;
        this.field1209 = 0;
        this.field1212 = 0;
    }
}

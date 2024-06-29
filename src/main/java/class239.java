import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class239 {

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    private int field4179 = 2;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "[I")
    private int[] field4180 = new int[2];

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "[I")
    private int[] field4178 = new int[2];

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public int field4175;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public int field4176;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public int field4177;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    private int field4181;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    private int field4182;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    private int field4183;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    private int field4184;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    private int field4185;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()V")
    public final void method1646() {
        this.field4182 = 0;
        this.field4184 = 0;
        this.field4183 = 0;
        this.field4181 = 0;
        this.field4185 = 0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lgd;)V")
    public final void method1647(class74 arg0) {
        this.field4176 = arg0.method489((byte) -47);
        this.field4175 = arg0.method498((byte) 126);
        this.field4177 = arg0.method498((byte) 127);
        this.method1648(arg0);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class239() {
        this.field4180[0] = 0;
        this.field4180[1] = 65535;
        this.field4178[0] = 0;
        this.field4178[1] = 65535;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Lgd;)V")
    public final void method1648(class74 arg0) {
        this.field4179 = arg0.method489((byte) 89);
        this.field4180 = new int[this.field4179];
        this.field4178 = new int[this.field4179];
        for (int var2 = 0; var2 < this.field4179; var2++) {
            this.field4180[var2] = arg0.method485(-2386);
            this.field4178[var2] = arg0.method485(-2386);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)I")
    public final int method1649(int arg0) {
        if (this.field4185 >= this.field4182) {
            this.field4181 = this.field4178[this.field4184++] << 15;
            if (this.field4184 >= this.field4179) {
                this.field4184 = this.field4179 - 1;
            }
            this.field4182 = (int) ((double) this.field4180[this.field4184] / 65536.0D * (double) arg0);
            if (this.field4182 > this.field4185) {
                this.field4183 = ((this.field4178[this.field4184] << 15) - this.field4181) / (this.field4182 - this.field4185);
            }
        }
        this.field4181 += this.field4183;
        this.field4185++;
        return this.field4181 - this.field4183 >> 15;
    }
}

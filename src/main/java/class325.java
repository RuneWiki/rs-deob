import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class325 {

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "I")
    private int field4175 = 2;

    @OriginalMember(owner = "client!nha", name = "f", descriptor = "[I")
    private int[] field4177 = new int[2];

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "[I")
    private int[] field4172 = new int[2];

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "I")
    public int field4173;

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "I")
    public int field4174;

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
    public int field4176;

    @OriginalMember(owner = "client!nha", name = "g", descriptor = "I")
    private int field4178;

    @OriginalMember(owner = "client!nha", name = "h", descriptor = "I")
    private int field4179;

    @OriginalMember(owner = "client!nha", name = "i", descriptor = "I")
    private int field4180;

    @OriginalMember(owner = "client!nha", name = "j", descriptor = "I")
    private int field4181;

    @OriginalMember(owner = "client!nha", name = "k", descriptor = "I")
    private int field4182;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)I", line = 5)
    public final int method1897(int arg0) {
        if (this.field4182 >= this.field4179) {
            this.field4181 = this.field4172[this.field4180++] << 15;
            if (this.field4180 >= this.field4175) {
                this.field4180 = this.field4175 - 1;
            }
            this.field4179 = (int) ((double) this.field4177[this.field4180] / 65536.0D * (double) arg0);
            if (this.field4179 > this.field4182) {
                this.field4178 = ((this.field4172[this.field4180] << 15) - this.field4181) / (this.field4179 - this.field4182);
            }
        }
        this.field4181 += this.field4178;
        this.field4182++;
        return this.field4181 - this.field4178 >> 15;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lsl;)V", line = 22)
    public final void method1898(class461 arg0) {
        this.field4176 = arg0.method2600((byte) -124);
        this.field4174 = arg0.method2622(-539564808);
        this.field4173 = arg0.method2622(-539564808);
        this.method1900(arg0);
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "()V", line = 31)
    public final void method1899() {
        this.field4179 = 0;
        this.field4180 = 0;
        this.field4178 = 0;
        this.field4181 = 0;
        this.field4182 = 0;
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(Lsl;)V", line = 41)
    public final void method1900(class461 arg0) {
        this.field4175 = arg0.method2600((byte) -125);
        this.field4177 = new int[this.field4175];
        this.field4172 = new int[this.field4175];
        for (int var2 = 0; var2 < this.field4175; var2++) {
            this.field4177[var2] = arg0.method2566(-2);
            this.field4172[var2] = arg0.method2566(-2);
        }
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "()V", line = 56)
    public class325() {
        this.field4177[0] = 0;
        this.field4177[1] = 65535;
        this.field4172[0] = 0;
        this.field4172[1] = 65535;
    }
}

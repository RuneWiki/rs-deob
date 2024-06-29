import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class7 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    private int field103 = 2;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "[I")
    private int[] field107 = new int[2];

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "[I")
    private int[] field104 = new int[2];

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public int field105;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public int field108;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    private int field109;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    private int field110;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    private int field111;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    private int field112;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    private int field113;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()V", line = 3)
    public final void method85() {
        this.field111 = 0;
        this.field113 = 0;
        this.field112 = 0;
        this.field110 = 0;
        this.field109 = 0;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lii;)V", line = 17)
    public final void method86(class221 arg0) {
        this.field108 = arg0.method1509(true);
        this.field105 = arg0.method1517((byte) -120);
        this.field106 = arg0.method1517((byte) -123);
        this.method87(arg0);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(Lii;)V", line = 23)
    public final void method87(class221 arg0) {
        this.field103 = arg0.method1509(true);
        this.field107 = new int[this.field103];
        this.field104 = new int[this.field103];
        for (int var2 = 0; var2 < this.field103; var2++) {
            this.field107[var2] = arg0.method1524((byte) 66);
            this.field104[var2] = arg0.method1524((byte) 91);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I", line = 38)
    public final int method88(int arg0) {
        if (this.field109 >= this.field111) {
            this.field110 = this.field104[this.field113++] << 15;
            if (this.field113 >= this.field103) {
                this.field113 = this.field103 - 1;
            }
            this.field111 = (int) ((double) this.field107[this.field113] / 65536.0D * (double) arg0);
            if (this.field111 > this.field109) {
                this.field112 = ((this.field104[this.field113] << 15) - this.field110) / (this.field111 - this.field109);
            }
        }
        this.field110 += this.field112;
        this.field109++;
        return this.field110 - this.field112 >> 15;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V", line = 56)
    public class7() {
        this.field107[0] = 0;
        this.field107[1] = 65535;
        this.field104[0] = 0;
        this.field104[1] = 65535;
    }
}

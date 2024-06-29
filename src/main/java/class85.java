import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class85 {

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    private int field2153 = 2;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "[I")
    private int[] field2154 = new int[2];

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "[I")
    private int[] field2155 = new int[2];

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public int field2151;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public int field2152;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public int field2156;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    private int field2157;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    private int field2158;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    private int field2159;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    private int field2160;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    private int field2161;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I")
    public final int method714(int arg0) {
        if (this.field2157 >= this.field2158) {
            this.field2160 = this.field2155[this.field2161++] << 15;
            if (this.field2161 >= this.field2153) {
                this.field2161 = this.field2153 - 1;
            }
            this.field2158 = (int) ((double) this.field2154[this.field2161] / 65536.0D * (double) arg0);
            if (this.field2158 > this.field2157) {
                this.field2159 = ((this.field2155[this.field2161] << 15) - this.field2160) / (this.field2158 - this.field2157);
            }
        }
        this.field2160 += this.field2159;
        this.field2157++;
        return this.field2160 - this.field2159 >> 15;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lqc;)V")
    public final void method715(class114 arg0) {
        this.field2153 = arg0.method957((byte) 99);
        this.field2154 = new int[this.field2153];
        this.field2155 = new int[this.field2153];
        for (int var2 = 0; var2 < this.field2153; var2++) {
            this.field2154[var2] = arg0.method944((byte) 125);
            this.field2155[var2] = arg0.method944((byte) 113);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lqc;)V")
    public final void method716(class114 arg0) {
        this.field2152 = arg0.method957((byte) 21);
        this.field2151 = arg0.method973(-126);
        this.field2156 = arg0.method973(-122);
        this.method715(arg0);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class85() {
        this.field2154[0] = 0;
        this.field2154[1] = 65535;
        this.field2155[0] = 0;
        this.field2155[1] = 65535;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()V")
    public final void method717() {
        this.field2158 = 0;
        this.field2161 = 0;
        this.field2159 = 0;
        this.field2160 = 0;
        this.field2157 = 0;
    }
}

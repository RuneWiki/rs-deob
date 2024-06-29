import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class482 {

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    private int field6860 = 2;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "[I")
    private int[] field6855 = new int[2];

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "[I")
    private int[] field6859 = new int[2];

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public int field6856;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
    public int field6857;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    public int field6858;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
    private int field6861;

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
    private int field6862;

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
    private int field6863;

    @OriginalMember(owner = "client!baa", name = "j", descriptor = "I")
    private int field6864;

    @OriginalMember(owner = "client!baa", name = "k", descriptor = "I")
    private int field6865;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "()V", line = 4)
    public final void method2809() {
        this.field6861 = 0;
        this.field6863 = 0;
        this.field6865 = 0;
        this.field6864 = 0;
        this.field6862 = 0;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lmo;)V", line = 14)
    public final void method2810(class695 arg0) {
        this.field6860 = arg0.method3826(false);
        this.field6855 = new int[this.field6860];
        this.field6859 = new int[this.field6860];
        for (int var2 = 0; var2 < this.field6860; var2++) {
            this.field6855[var2] = arg0.method3847((byte) 118);
            this.field6859[var2] = arg0.method3847((byte) 118);
        }
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "()V", line = 33)
    public class482() {
        this.field6855[0] = 0;
        this.field6855[1] = 65535;
        this.field6859[0] = 0;
        this.field6859[1] = 65535;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)I", line = 47)
    public final int method2811(int arg0) {
        if (this.field6862 >= this.field6861) {
            this.field6864 = this.field6859[this.field6863++] << 15;
            if (this.field6863 >= this.field6860) {
                this.field6863 = this.field6860 - 1;
            }
            this.field6861 = (int) ((double) this.field6855[this.field6863] / 65536.0D * (double) arg0);
            if (this.field6861 > this.field6862) {
                this.field6865 = ((this.field6859[this.field6863] << 15) - this.field6864) / (this.field6861 - this.field6862);
            }
        }
        this.field6864 += this.field6865;
        this.field6862++;
        return this.field6864 - this.field6865 >> 15;
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(Lmo;)V", line = 64)
    public final void method2812(class695 arg0) {
        this.field6858 = arg0.method3826(false);
        this.field6857 = arg0.method3880(8);
        this.field6856 = arg0.method3880(8);
        this.method2810(arg0);
    }
}

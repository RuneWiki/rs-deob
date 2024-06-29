import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class258 {

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    private int field3293 = 2;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "[I")
    private int[] field3295 = new int[2];

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "[I")
    private int[] field3294 = new int[2];

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public int field3296;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public int field3297;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public int field3298;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    private int field3299;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    private int field3300;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    private int field3301;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    private int field3302;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    private int field3303;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I", line = 3)
    public final int method1538(int arg0) {
        if (this.field3300 >= this.field3303) {
            this.field3299 = this.field3294[this.field3301++] << 15;
            if (this.field3301 >= this.field3293) {
                this.field3301 = this.field3293 - 1;
            }
            this.field3303 = (int) ((double) this.field3295[this.field3301] / 65536.0D * (double) arg0);
            if (this.field3303 > this.field3300) {
                this.field3302 = ((this.field3294[this.field3301] << 15) - this.field3299) / (this.field3303 - this.field3300);
            }
        }
        this.field3299 += this.field3302;
        this.field3300++;
        return this.field3299 - this.field3302 >> 15;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "()V", line = 20)
    public final void method1539() {
        this.field3303 = 0;
        this.field3301 = 0;
        this.field3302 = 0;
        this.field3299 = 0;
        this.field3300 = 0;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lji;)V", line = 28)
    public final void method1540(class572 arg0) {
        this.field3293 = arg0.method3097((byte) 12);
        this.field3295 = new int[this.field3293];
        this.field3294 = new int[this.field3293];
        for (int var2 = 0; var2 < this.field3293; var2++) {
            this.field3295[var2] = arg0.method3031(-1);
            this.field3294[var2] = arg0.method3031(-1);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Lji;)V", line = 49)
    public final void method1541(class572 arg0) {
        this.field3296 = arg0.method3097((byte) 12);
        this.field3297 = arg0.method3064(-2031091464);
        this.field3298 = arg0.method3064(-2031091464);
        this.method1540(arg0);
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V", line = 56)
    public class258() {
        this.field3295[0] = 0;
        this.field3295[1] = 65535;
        this.field3294[0] = 0;
        this.field3294[1] = 65535;
    }
}

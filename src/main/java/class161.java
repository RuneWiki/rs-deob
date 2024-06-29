import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class161 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    private int field3088 = 2;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "[I")
    private int[] field3092 = new int[2];

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "[I")
    private int[] field3089 = new int[2];

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public int field3093;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    private int field3094;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    private int field3095;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    private int field3096;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    private int field3097;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    private int field3098;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I")
    public final int method1067(int arg0) {
        if (this.field3096 >= this.field3094) {
            this.field3098 = this.field3089[this.field3097++] << 15;
            if (this.field3097 >= this.field3088) {
                this.field3097 = this.field3088 - 1;
            }
            this.field3094 = (int) ((double) this.field3092[this.field3097] / 65536.0D * (double) arg0);
            if (this.field3094 > this.field3096) {
                this.field3095 = ((this.field3089[this.field3097] << 15) - this.field3098) / (this.field3094 - this.field3096);
            }
        }
        this.field3098 += this.field3095;
        this.field3096++;
        return this.field3098 - this.field3095 >> 15;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lme;)V")
    public final void method1068(class114 arg0) {
        this.field3093 = arg0.method767(true);
        this.field3090 = arg0.method761(255);
        this.field3091 = arg0.method761(255);
        this.method1070(arg0);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "()V")
    public final void method1069() {
        this.field3094 = 0;
        this.field3097 = 0;
        this.field3095 = 0;
        this.field3098 = 0;
        this.field3096 = 0;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Lme;)V")
    public final void method1070(class114 arg0) {
        this.field3088 = arg0.method767(true);
        this.field3092 = new int[this.field3088];
        this.field3089 = new int[this.field3088];
        for (int var2 = 0; var2 < this.field3088; var2++) {
            this.field3092[var2] = arg0.method762((byte) 115);
            this.field3089[var2] = arg0.method762((byte) 105);
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class161() {
        this.field3092[0] = 0;
        this.field3092[1] = 65535;
        this.field3089[0] = 0;
        this.field3089[1] = 65535;
    }
}

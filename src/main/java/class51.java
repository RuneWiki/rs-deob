import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class51 {

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    private int field839 = 2;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
    private int[] field840 = new int[2];

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
    private int[] field841 = new int[2];

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public int field842;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public int field843;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    private int field844;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    private int field846;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    private int field847;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    private int field848;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lfj;)V", line = 6)
    public final void method391(class3 arg0) {
        this.field843 = arg0.method64((byte) -125);
        this.field842 = arg0.method71(-668527048);
        this.field838 = arg0.method71(-668527048);
        this.method392(arg0);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Lfj;)V", line = 14)
    public final void method392(class3 arg0) {
        this.field839 = arg0.method64((byte) -95);
        this.field840 = new int[this.field839];
        this.field841 = new int[this.field839];
        for (int var2 = 0; var2 < this.field839; var2++) {
            this.field840[var2] = arg0.method63((byte) 1);
            this.field841[var2] = arg0.method63((byte) 1);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()V", line = 29)
    public final void method393() {
        this.field848 = 0;
        this.field845 = 0;
        this.field846 = 0;
        this.field847 = 0;
        this.field844 = 0;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V", line = 38)
    public class51() {
        this.field840[0] = 0;
        this.field840[1] = 65535;
        this.field841[0] = 0;
        this.field841[1] = 65535;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)I", line = 48)
    public final int method394(int arg0) {
        if (this.field844 >= this.field848) {
            this.field847 = this.field841[this.field845++] << 15;
            if (this.field845 >= this.field839) {
                this.field845 = this.field839 - 1;
            }
            this.field848 = (int) ((double) this.field840[this.field845] / 65536.0D * (double) arg0);
            if (this.field848 > this.field844) {
                this.field846 = ((this.field841[this.field845] << 15) - this.field847) / (this.field848 - this.field844);
            }
        }
        this.field847 += this.field846;
        this.field844++;
        return this.field847 - this.field846 >> 15;
    }
}

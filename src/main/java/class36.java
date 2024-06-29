import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 {

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    private int field914 = 2;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "[I")
    private int[] field909 = new int[2];

    @OriginalMember(owner = "client!f", name = "b", descriptor = "[I")
    private int[] field910 = new int[2];

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public int field912;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    private int field915;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    private int field916;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    private int field917;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    private int field918;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    private int field919;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lm;)V")
    public final void method279(class83 arg0) {
        this.field911 = arg0.method638(0);
        this.field912 = arg0.method641((byte) 73);
        this.field913 = arg0.method641((byte) 73);
        this.method282(arg0);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)I")
    public final int method280(int arg0) {
        if (this.field915 >= this.field917) {
            this.field916 = this.field910[this.field918++] << 15;
            if (this.field918 >= this.field914) {
                this.field918 = this.field914 - 1;
            }
            this.field917 = (int) ((double) this.field909[this.field918] / 65536.0D * (double) arg0);
            if (this.field917 > this.field915) {
                this.field919 = ((this.field910[this.field918] << 15) - this.field916) / (this.field917 - this.field915);
            }
        }
        this.field916 += this.field919;
        this.field915++;
        return this.field916 - this.field919 >> 15;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
    public final void method281() {
        this.field917 = 0;
        this.field918 = 0;
        this.field919 = 0;
        this.field916 = 0;
        this.field915 = 0;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Lm;)V")
    public final void method282(class83 arg0) {
        this.field914 = arg0.method638(0);
        this.field909 = new int[this.field914];
        this.field910 = new int[this.field914];
        for (int var2 = 0; var2 < this.field914; var2++) {
            this.field909[var2] = arg0.method631((byte) -108);
            this.field910[var2] = arg0.method631((byte) -109);
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    public class36() {
        this.field909[0] = 0;
        this.field909[1] = 65535;
        this.field910[0] = 0;
        this.field910[1] = 65535;
    }
}

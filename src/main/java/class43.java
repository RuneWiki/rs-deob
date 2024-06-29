import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class43 {

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    private int field976 = 2;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "[I")
    private int[] field977 = new int[2];

    @OriginalMember(owner = "client!g", name = "c", descriptor = "[I")
    private int[] field975 = new int[2];

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    private int field979;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    private int field980;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    private int field981;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    private int field982;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    private int field983;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "()V")
    public final void method289() {
        this.field980 = 0;
        this.field981 = 0;
        this.field979 = 0;
        this.field982 = 0;
        this.field983 = 0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lne;)V")
    public final void method290(class95 arg0) {
        this.field976 = arg0.method790((byte) 73);
        this.field977 = new int[this.field976];
        this.field975 = new int[this.field976];
        for (int var2 = 0; var2 < this.field976; var2++) {
            this.field977[var2] = arg0.method795(1);
            this.field975[var2] = arg0.method795(1);
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(Lne;)V")
    public final void method291(class95 arg0) {
        this.field974 = arg0.method790((byte) 73);
        this.field978 = arg0.method740((byte) 52);
        this.field973 = arg0.method740((byte) -110);
        this.method290(arg0);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)I")
    public final int method292(int arg0) {
        if (this.field983 >= this.field980) {
            this.field982 = this.field975[this.field981++] << 15;
            if (this.field981 >= this.field976) {
                this.field981 = this.field976 - 1;
            }
            this.field980 = (int) ((double) this.field977[this.field981] / 65536.0D * (double) arg0);
            if (this.field980 > this.field983) {
                this.field979 = ((this.field975[this.field981] << 15) - this.field982) / (this.field980 - this.field983);
            }
        }
        this.field982 += this.field979;
        this.field983++;
        return this.field982 - this.field979 >> 15;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class43() {
        this.field977[0] = 0;
        this.field977[1] = 65535;
        this.field975[0] = 0;
        this.field975[1] = 65535;
    }
}

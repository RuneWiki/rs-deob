import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class56 {

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    private int field994 = 2;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "[I")
    private int[] field990 = new int[2];

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "[I")
    private int[] field989 = new int[2];

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public int field991;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    private int field995;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    private int field996;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    private int field997;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    private int field998;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    private int field999;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
    public final void method299() {
        this.field999 = 0;
        this.field998 = 0;
        this.field997 = 0;
        this.field996 = 0;
        this.field995 = 0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I")
    public final int method300(int arg0) {
        if (this.field995 >= this.field999) {
            this.field996 = this.field989[this.field998++] << 15;
            if (this.field998 >= this.field994) {
                this.field998 = this.field994 - 1;
            }
            this.field999 = (int) ((double) this.field990[this.field998] / 65536.0D * (double) arg0);
            if (this.field999 > this.field995) {
                this.field997 = ((this.field989[this.field998] << 15) - this.field996) / (this.field999 - this.field995);
            }
        }
        this.field996 += this.field997;
        this.field995++;
        return this.field996 - this.field997 >> 15;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lka;)V")
    public final void method301(class97 arg0) {
        this.field991 = arg0.method588((byte) -116);
        this.field993 = arg0.method599(-16003);
        this.field992 = arg0.method599(-16003);
        this.method302(arg0);
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class56() {
        this.field990[0] = 0;
        this.field990[1] = 65535;
        this.field989[0] = 0;
        this.field989[1] = 65535;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lka;)V")
    public final void method302(class97 arg0) {
        this.field994 = arg0.method588((byte) -102);
        this.field990 = new int[this.field994];
        this.field989 = new int[this.field994];
        for (int var2 = 0; var2 < this.field994; var2++) {
            this.field990[var2] = arg0.method611(false);
            this.field989[var2] = arg0.method611(false);
        }
    }
}

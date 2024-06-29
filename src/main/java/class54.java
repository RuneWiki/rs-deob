import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class54 {

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
    private int field989 = 2;

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "[I")
    private int[] field994 = new int[2];

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "[I")
    private int[] field992 = new int[2];

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
    public int field990;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
    public int field991;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "I")
    private int field995;

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "I")
    private int field996;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
    private int field997;

    @OriginalMember(owner = "client!aw", name = "j", descriptor = "I")
    private int field998;

    @OriginalMember(owner = "client!aw", name = "k", descriptor = "I")
    private int field999;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "()V", line = 4)
    public final void method471() {
        this.field995 = 0;
        this.field999 = 0;
        this.field998 = 0;
        this.field997 = 0;
        this.field996 = 0;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lwn;)V", line = 15)
    public final void method472(class519 arg0) {
        this.field989 = arg0.method3072((byte) -125);
        this.field994 = new int[this.field989];
        this.field992 = new int[this.field989];
        for (int var2 = 0; var2 < this.field989; var2++) {
            this.field994[var2] = arg0.method3018(566990904);
            this.field992[var2] = arg0.method3018(566990904);
        }
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V", line = 32)
    public class54() {
        this.field994[0] = 0;
        this.field994[1] = 65535;
        this.field992[0] = 0;
        this.field992[1] = 65535;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(Lwn;)V", line = 46)
    public final void method473(class519 arg0) {
        this.field991 = arg0.method3072((byte) -122);
        this.field990 = arg0.method3053(-129);
        this.field993 = arg0.method3053(-129);
        this.method472(arg0);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)I", line = 53)
    public final int method474(int arg0) {
        if (this.field996 >= this.field995) {
            this.field997 = this.field992[this.field999++] << 15;
            if (this.field999 >= this.field989) {
                this.field999 = this.field989 - 1;
            }
            this.field995 = (int) ((double) this.field994[this.field999] / 65536.0D * (double) arg0);
            if (this.field995 > this.field996) {
                this.field998 = ((this.field992[this.field999] << 15) - this.field997) / (this.field995 - this.field996);
            }
        }
        this.field997 += this.field998;
        this.field996++;
        return this.field997 - this.field998 >> 15;
    }
}

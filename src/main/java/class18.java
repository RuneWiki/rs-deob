import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class18 {

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    private int field369 = 2;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "[I")
    private int[] field368 = new int[2];

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "[I")
    private int[] field372 = new int[2];

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    private int field375;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I", line = 6)
    public final int method135(int arg0) {
        if (this.field377 >= this.field375) {
            this.field376 = this.field372[this.field373++] << 15;
            if (this.field373 >= this.field369) {
                this.field373 = this.field369 - 1;
            }
            this.field375 = (int) ((double) this.field368[this.field373] / 65536.0D * (double) arg0);
            if (this.field375 > this.field377) {
                this.field374 = ((this.field372[this.field373] << 15) - this.field376) / (this.field375 - this.field377);
            }
        }
        this.field376 += this.field374;
        this.field377++;
        return this.field376 - this.field374 >> 15;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()V", line = 23)
    public final void method136() {
        this.field375 = 0;
        this.field373 = 0;
        this.field374 = 0;
        this.field376 = 0;
        this.field377 = 0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lg;)V", line = 31)
    public final void method137(class39 arg0) {
        this.field369 = arg0.method334(118);
        this.field368 = new int[this.field369];
        this.field372 = new int[this.field369];
        for (int var2 = 0; var2 < this.field369; var2++) {
            this.field368[var2] = arg0.method326(255);
            this.field372[var2] = arg0.method326(255);
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Lg;)V", line = 48)
    public final void method138(class39 arg0) {
        this.field370 = arg0.method334(120);
        this.field371 = arg0.method329(144752608);
        this.field367 = arg0.method329(144752608);
        this.method137(arg0);
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 55)
    public class18() {
        this.field368[0] = 0;
        this.field368[1] = 65535;
        this.field372[0] = 0;
        this.field372[1] = 65535;
    }
}

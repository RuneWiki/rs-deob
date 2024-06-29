import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class135 {

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    private int field2359 = 2;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "[I")
    private int[] field2355 = new int[2];

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "[I")
    private int[] field2360 = new int[2];

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public int field2356;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public int field2357;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public int field2358;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    private int field2361;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    private int field2362;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    private int field2363;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    private int field2364;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    private int field2365;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lkh;)V", line = 8)
    public final void method926(class14 arg0) {
        this.field2359 = arg0.method93(false);
        this.field2355 = new int[this.field2359];
        this.field2360 = new int[this.field2359];
        for (int var2 = 0; var2 < this.field2359; var2++) {
            this.field2355[var2] = arg0.method116(-1);
            this.field2360[var2] = arg0.method116(-1);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)I", line = 24)
    public final int method927(int arg0) {
        if (this.field2362 >= this.field2361) {
            this.field2365 = this.field2360[this.field2364++] << 15;
            if (this.field2364 >= this.field2359) {
                this.field2364 = this.field2359 - 1;
            }
            this.field2361 = (int) ((double) this.field2355[this.field2364] / 65536.0D * (double) arg0);
            if (this.field2361 > this.field2362) {
                this.field2363 = ((this.field2360[this.field2364] << 15) - this.field2365) / (this.field2361 - this.field2362);
            }
        }
        this.field2365 += this.field2363;
        this.field2362++;
        return this.field2365 - this.field2363 >> 15;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()V", line = 41)
    public final void method928() {
        this.field2361 = 0;
        this.field2364 = 0;
        this.field2363 = 0;
        this.field2365 = 0;
        this.field2362 = 0;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Lkh;)V", line = 48)
    public final void method929(class14 arg0) {
        this.field2356 = arg0.method93(false);
        this.field2358 = arg0.method128((byte) 4);
        this.field2357 = arg0.method128((byte) 4);
        this.method926(arg0);
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 56)
    public class135() {
        this.field2355[0] = 0;
        this.field2355[1] = 65535;
        this.field2360[0] = 0;
        this.field2360[1] = 65535;
    }
}

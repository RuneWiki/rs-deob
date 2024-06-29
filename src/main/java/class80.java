import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class80 {

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    private int field1375 = 2;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[I")
    private int[] field1376 = new int[2];

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "[I")
    private int[] field1379 = new int[2];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public int field1374;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    private int field1381;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    private int field1383;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    private int field1384;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lqm;)V", line = 7)
    public final void method655(class227 arg0) {
        this.field1375 = arg0.method1720((byte) -61);
        this.field1376 = new int[this.field1375];
        this.field1379 = new int[this.field1375];
        for (int var2 = 0; var2 < this.field1375; var2++) {
            this.field1376[var2] = arg0.method1765(true);
            this.field1379[var2] = arg0.method1765(true);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()V", line = 24)
    public final void method656() {
        this.field1384 = 0;
        this.field1383 = 0;
        this.field1380 = 0;
        this.field1381 = 0;
        this.field1382 = 0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)I", line = 34)
    public final int method657(int arg0) {
        if (this.field1382 >= this.field1384) {
            this.field1381 = this.field1379[this.field1383++] << 15;
            if (this.field1383 >= this.field1375) {
                this.field1383 = this.field1375 - 1;
            }
            this.field1384 = (int) ((double) this.field1376[this.field1383] / 65536.0D * (double) arg0);
            if (this.field1384 > this.field1382) {
                this.field1380 = ((this.field1379[this.field1383] << 15) - this.field1381) / (this.field1384 - this.field1382);
            }
        }
        this.field1381 += this.field1380;
        this.field1382++;
        return this.field1381 - this.field1380 >> 15;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Lqm;)V", line = 51)
    public final void method658(class227 arg0) {
        this.field1378 = arg0.method1720((byte) -49);
        this.field1374 = arg0.method1715((byte) -108);
        this.field1377 = arg0.method1715((byte) -95);
        this.method655(arg0);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V", line = 56)
    public class80() {
        this.field1376[0] = 0;
        this.field1376[1] = 65535;
        this.field1379[0] = 0;
        this.field1379[1] = 65535;
    }
}

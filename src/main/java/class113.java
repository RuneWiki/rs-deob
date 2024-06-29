import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class113 {

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
    private int field1718 = 2;

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "[I")
    private int[] field1719 = new int[2];

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "[I")
    private int[] field1723 = new int[2];

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
    public int field1720;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
    public int field1721;

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "I")
    private int field1724;

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "I")
    private int field1725;

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
    private int field1726;

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "I")
    private int field1727;

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "I")
    private int field1728;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "()V", line = 3)
    public final void method853() {
        this.field1728 = 0;
        this.field1726 = 0;
        this.field1725 = 0;
        this.field1727 = 0;
        this.field1724 = 0;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lso;)V", line = 11)
    public final void method854(class494 arg0) {
        this.field1720 = arg0.method2964((byte) 43);
        this.field1721 = arg0.method2976(-124);
        this.field1722 = arg0.method2976(-127);
        this.method856(arg0);
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)I", line = 18)
    public final int method855(int arg0) {
        if (this.field1724 >= this.field1728) {
            this.field1727 = this.field1723[this.field1726++] << 15;
            if (this.field1726 >= this.field1718) {
                this.field1726 = this.field1718 - 1;
            }
            this.field1728 = (int) ((double) this.field1719[this.field1726] / 65536.0D * (double) arg0);
            if (this.field1728 > this.field1724) {
                this.field1725 = ((this.field1723[this.field1726] << 15) - this.field1727) / (this.field1728 - this.field1724);
            }
        }
        this.field1727 += this.field1725;
        this.field1724++;
        return this.field1727 - this.field1725 >> 15;
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(Lso;)V", line = 40)
    public final void method856(class494 arg0) {
        this.field1718 = arg0.method2964((byte) 109);
        this.field1719 = new int[this.field1718];
        this.field1723 = new int[this.field1718];
        for (int var2 = 0; var2 < this.field1718; var2++) {
            this.field1719[var2] = arg0.method2998(true);
            this.field1723[var2] = arg0.method2998(true);
        }
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "()V", line = 56)
    public class113() {
        this.field1719[0] = 0;
        this.field1719[1] = 65535;
        this.field1723[0] = 0;
        this.field1723[1] = 65535;
    }
}

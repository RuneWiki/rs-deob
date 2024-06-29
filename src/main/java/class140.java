import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class140 {

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    private int field2000 = 2;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "[I")
    private int[] field2002 = new int[2];

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "[I")
    private int[] field1998 = new int[2];

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public int field2001;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    private int field2004;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    private int field2005;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    private int field2006;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    private int field2007;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    private int field2008;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lkh;)V", line = 6)
    public final void method961(class11 arg0) {
        this.field2003 = arg0.method172((byte) 52);
        this.field1999 = arg0.method185(25239);
        this.field2001 = arg0.method185(25239);
        this.method962(arg0);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Lkh;)V", line = 13)
    public final void method962(class11 arg0) {
        this.field2000 = arg0.method172((byte) 52);
        this.field2002 = new int[this.field2000];
        this.field1998 = new int[this.field2000];
        for (int var2 = 0; var2 < this.field2000; var2++) {
            this.field2002[var2] = arg0.method174(255);
            this.field1998[var2] = arg0.method174(255);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)I", line = 29)
    public final int method963(int arg0) {
        if (this.field2006 >= this.field2005) {
            this.field2004 = this.field1998[this.field2007++] << 15;
            if (this.field2007 >= this.field2000) {
                this.field2007 = this.field2000 - 1;
            }
            this.field2005 = (int) ((double) this.field2002[this.field2007] / 65536.0D * (double) arg0);
            if (this.field2005 > this.field2006) {
                this.field2008 = ((this.field1998[this.field2007] << 15) - this.field2004) / (this.field2005 - this.field2006);
            }
        }
        this.field2004 += this.field2008;
        this.field2006++;
        return this.field2004 - this.field2008 >> 15;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()V", line = 48)
    public final void method964() {
        this.field2005 = 0;
        this.field2007 = 0;
        this.field2008 = 0;
        this.field2004 = 0;
        this.field2006 = 0;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V", line = 56)
    public class140() {
        this.field2002[0] = 0;
        this.field2002[1] = 65535;
        this.field1998[0] = 0;
        this.field1998[1] = 65535;
    }
}

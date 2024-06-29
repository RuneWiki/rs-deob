import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class116 implements class101 {

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    private int field1728 = -1;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "Lbf;")
    private class344 field1723;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    private int field1724;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    private int field1726;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    private int field1721;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "[I")
    private static int[] field1727 = new int[1];

    @OriginalMember(owner = "client!pq", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        this.method734();
        super.finalize();
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V", line = 7)
    public final void method733(int arg0) {
        this.field1723.field4604.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field1726);
        this.field1728 = arg0;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "()V", line = 17)
    public final void method411() {
        this.field1723.field4604.glFramebufferRenderbufferEXT(36160, this.field1728, 36161, 0);
        this.field1728 = -1;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "()V", line = 23)
    public final void method734() {
        if (this.field1726 > 0) {
            this.field1723.method1967(this.field1726, this.field1721);
            this.field1726 = 0;
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lbf;III)V", line = 39)
    public class116(class344 arg0, int arg1, int arg2, int arg3) {
        this.field1723 = arg0;
        this.field1725 = arg2;
        this.field1722 = arg3;
        this.field1724 = arg1;
        opengl var5 = this.field1723.field4604;
        var5.glGenRenderbuffersEXT(1, field1727, 0);
        this.field1726 = field1727[0];
        var5.glBindRenderbufferEXT(36161, this.field1726);
        var5.glRenderbufferStorageEXT(36161, this.field1724, this.field1725, this.field1722);
        this.field1721 = this.field1725 * this.field1722 * this.field1723.method1955(this.field1724);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class629 extends class709 {

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public int field9030;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public int field9031;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public int field9032;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public int field9034;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "J")
    public long field9033;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)I")
    public final int method2003(int arg0) {
        if (arg0 != -4) {
            this.method2003(103);
        }
        return this.field9034;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)I")
    public final int method2007(int arg0) {
        return arg0 == -24956 ? this.field9030 : 87;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)I")
    public final int method2002(byte arg0) {
        if (arg0 > -66) {
            this.method2003(115);
        }
        return this.field9031;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)J")
    public final long method2006(boolean arg0) {
        return arg0 ? 101L : this.field9033;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)I")
    public final int method2004(int arg0) {
        if (arg0 != 5) {
            this.method2006(true);
        }
        return this.field9032;
    }
}

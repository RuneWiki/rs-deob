import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class241 extends class793 {

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public int field3329;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public int field3331;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public int field3332;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public int field3333;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "J")
    public long field3330;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "(I)J")
    public final long method1589(int arg0) {
        if (arg0 != 14972) {
            this.method1591(-49);
        }
        return this.field3330;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)I")
    public final int method1590(byte arg0) {
        if (arg0 != -3) {
            this.method1591(-110);
        }
        return this.field3331;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)I")
    public final int method1591(int arg0) {
        int var2 = 37 % ((arg0 - 41) / 41);
        return this.field3329;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)I")
    public final int method1592(int arg0) {
        if (arg0 != -19898) {
            this.field3330 = -124L;
        }
        return this.field3332;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)I")
    public final int method1593(int arg0) {
        return arg0 == 20259 ? this.field3333 : 117;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class331 extends class401 implements class305 {

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "C")
    public char field4467;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
    public int field4464;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
    public int field4470;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    public int field4471;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "J")
    public long field4472;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)I")
    public final int method1852(int arg0) {
        field4473++;
        if (arg0 != 27648) {
            this.method1855(78);
        }
        return this.field4471;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)J")
    public final long method1851(int arg0) {
        if (arg0 != 30371) {
            this.method1851(96);
        }
        field4468++;
        return this.field4472;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)I")
    public final int method1854(byte arg0) {
        field4465++;
        if (arg0 < 49) {
            this.field4464 = 98;
        }
        return this.field4464;
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)I")
    public final int method1855(int arg0) {
        if (arg0 != -5972) {
            this.field4464 = -114;
        }
        field4466++;
        return this.field4470;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)C")
    public final char method1853(int arg0) {
        field4469++;
        if (arg0 != -29475) {
            this.field4470 = 35;
        }
        return this.field4467;
    }
}

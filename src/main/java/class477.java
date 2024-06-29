import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class477 extends class556 {

    @OriginalMember(owner = "client!uda", name = "n", descriptor = "I")
    public int field6449;

    @OriginalMember(owner = "client!uda", name = "o", descriptor = "I")
    public int field6450;

    @OriginalMember(owner = "client!uda", name = "q", descriptor = "I")
    public int field6452;

    @OriginalMember(owner = "client!uda", name = "r", descriptor = "I")
    public int field6453;

    @OriginalMember(owner = "client!uda", name = "p", descriptor = "J")
    public long field6451;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)I")
    public final int method2731(int arg0) {
        if (arg0 != 125) {
            this.field6450 = 80;
        }
        return this.field6450;
    }

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "(I)I")
    public final int method2732(int arg0) {
        if (arg0 >= -72) {
            this.field6452 = 110;
        }
        return this.field6453;
    }

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "(I)I")
    public final int method2733(int arg0) {
        if (arg0 != 0) {
            this.method2732(-33);
        }
        return this.field6452;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Z)I")
    public final int method2734(boolean arg0) {
        if (arg0) {
            this.field6450 = 21;
        }
        return this.field6449;
    }

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "(I)J")
    public final long method2735(int arg0) {
        if (arg0 != -2) {
            this.method2733(-123);
        }
        return this.field6451;
    }
}

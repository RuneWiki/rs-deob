import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class143 extends class435 {

    @OriginalMember(owner = "client!jga", name = "r", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!jga", name = "s", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!jga", name = "t", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!jga", name = "v", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!jga", name = "x", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!jga", name = "z", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!jga", name = "q", descriptor = "J")
    public static long field2465;

    @OriginalMember(owner = "client!jga", name = "u", descriptor = "J")
    public long field2469;

    @OriginalMember(owner = "client!jga", name = "w", descriptor = "Ljga;")
    public class143 field2471;

    @OriginalMember(owner = "client!jga", name = "y", descriptor = "Ljga;")
    public class143 field2473;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(III)V")
    public static final void method1112(int arg0, int arg1, int arg2) {
        class29.method273(arg2, arg0, -9873);
        field2467++;
        if (arg1 != 20) {
            method1115((byte) 92, null);
        }
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)V")
    public final void method1113(int arg0) {
        if (arg0 != 32730) {
            return;
        }
        field2470++;
        if (this.field2471 != null) {
            this.field2471.field2473 = this.field2473;
            this.field2473.field2471 = this.field2471;
            this.field2473 = null;
            this.field2471 = null;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)Z")
    public final boolean method1114(byte arg0) {
        field2466++;
        if (this.field2471 == null) {
            return false;
        } else {
            int var2 = -10 % ((arg0 - 62) / 58);
            return true;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(BLqe;)V")
    public static final void method1115(byte arg0, class80 arg1) {
        field2468++;
        if (arg0 != -58) {
            return;
        }
        arg1.field1206 = null;
        if (class437.field6285 < 20) {
            class377.field5226.method3307(arg0 + 58, arg1);
            class437.field6285++;
        }
    }
}

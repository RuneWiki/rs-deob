import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class357 {

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field5124 = 0;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public int field5118;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public int field5120;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public int field5123;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "Z")
    public boolean field5126;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "[Lo;")
    public static class24[] field5119;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static final void method2111(int arg0) {
        field5122++;
        if (arg0 != 4386) {
            method2111(4);
        }
        class197.field2802.method2408(108);
        class408.field5775.method2120((byte) 57);
        class156.field2349.method2120((byte) 87);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)I")
    public static final int method2112(int arg0, byte arg1) {
        field5125++;
        if (arg1 <= 49) {
            method2114(-40);
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public static final void method2113(int arg0) {
        field5121++;
        class306.field4451 = null;
        class172.field2490 = null;
        if (arg0 > -100) {
            field5124 = -12;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
    public static void method2114(int arg0) {
        field5119 = null;
        if (arg0 != 27963) {
            field5124 = -14;
        }
    }
}

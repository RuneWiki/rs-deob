import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class157 extends class257 {

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field2472 = 0;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "[Lcq;")
    public static class312[] field2466 = new class312[14];

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field2471 = 205;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    public static int field2480 = 0;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "Z")
    public static boolean field2470 = false;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "S")
    public static short field2475 = 256;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "B")
    public byte field2478;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public int field2477;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "Lha;")
    public class40 field2467;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)Lkh;", line = 3)
    public static final class13 method1004(boolean arg0) {
        if (!arg0) {
            return null;
        } else {
            ++field2469;
            try {
                return new class342();
            } catch (Throwable var2) {
                try {
                    return (class13) Class.forName("qj").newInstance();
                } catch (Throwable var1) {
                    return new class364();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)[B", line = 26)
    public final byte[] method1005(int arg0) {
        ++field2474;
        if (!super.field3923 && ~this.field2467.field585 <= ~(this.field2467.field536.length - this.field2478)) {
            return arg0 <= 76 ? null : this.field2467.field536;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(Z)Lod;", line = 49)
    public static final class334 method1006(boolean arg0) {
        ++field2479;
        if (class492.field7477 != null && class292.field4451 != null) {
            class292.field4451.method1526(class492.field7477, -122);
            if (!arg0) {
                method1004(true);
            }
            class334 var1 = (class334) class292.field4451.method1527(-2);
            if (var1 == null) {
                return null;
            } else {
                class173 var2 = class492.field7472.method1840((byte) 94, var1.field4985);
                return var2 != null && var2.field2678 && var2.method1082(class492.field7466, 18358) ? var1 : class113.method809(5722);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "(I)V", line = 80)
    public static void method1007(int arg0) {
        if (arg0 > -85) {
            field2466 = null;
        }
        field2466 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I", line = 100)
    public static final int method1008(int arg0, int arg1) {
        ++field2476;
        return arg0 != 28644 ? -44 : arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)I", line = 126)
    public final int method1009(int arg0) {
        ++field2468;
        if (this.field2467 == null) {
            return 0;
        } else {
            return arg0 >= -21 ? -47 : this.field2467.field585 * 100 / (this.field2467.field536.length + -this.field2478);
        }
    }
}

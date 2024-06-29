import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class498 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public int field6727 = 0;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public int field6730 = 0;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Lvi;")
    private class560 field6731 = new class560(64);

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Lag;")
    private class493 field6736 = null;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Lpq;")
    private class159 field6729;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Lpq;")
    private class159 field6733;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Z")
    public static boolean field6735 = false;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Lak;", line = 6)
    public final class572 method2804(int arg0, int arg1) {
        field6728++;
        class572 var3 = (class572) this.field6731.method3134((long) arg1, -85);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field6729.method1087(1, arg1, 1);
        } else {
            var4 = this.field6733.method1087(1, arg1 & 0x7FFF, arg0 ^ 0x6D58);
        }
        if (arg0 != 27993) {
            method2805(-99, -49, (byte) 11);
        }
        class572 var5 = new class572();
        var5.field7936 = this;
        if (var4 != null) {
            var5.method3228((byte) 4, new class138(var4));
        }
        if (arg1 >= 32768) {
            var5.method3238(32768);
        }
        this.field6731.method3130((long) arg1, true, var5);
        return var5;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIB)Z", line = 40)
    public static final boolean method2805(int arg0, int arg1, byte arg2) {
        field6732++;
        if (arg2 != -46) {
            method2805(-48, 91, (byte) 101);
        }
        return (arg0 & 0x70000) != 0 | class660.method3654(arg0, arg1, 52) || class629.method3441(arg0, arg1, (byte) -98);
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(ILpq;Lpq;Lag;)V", line = 95)
    public class498(int arg0, class159 arg1, class159 arg2, class493 arg3) {
        this.field6729 = arg1;
        this.field6736 = arg3;
        this.field6733 = arg2;
        if (this.field6729 != null) {
            this.field6730 = this.field6729.method1076(1, 0);
        }
        if (this.field6733 != null) {
            this.field6727 = this.field6733.method1076(1, 0);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([IJLlp;Z)Ljava/lang/String;", line = 71)
    public final String method2806(int[] arg0, long arg1, class270 arg2, boolean arg3) {
        if (!arg3) {
            this.method2806(null, -33L, null, true);
        }
        field6734++;
        if (this.field6736 != null) {
            String var6 = this.field6736.method2292(0, arg0, arg1, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg1);
    }
}

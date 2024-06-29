import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class376 {

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public int field5057 = 0;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public int field5061 = 2048;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public int field5060 = 0;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public int field5063 = 2048;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "Lvaa;")
    public static class399 field5056 = new class399();

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field5059 = 0;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "[I")
    public static int[] field5055;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public static void method2225(int arg0) {
        field5055 = null;
        field5056 = null;
        if (arg0 != -23166) {
            method2225(-18);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILdaa;)V")
    public final void method2226(int arg0, class11 arg1) {
        if (arg0 != 0) {
            return;
        }
        field5054++;
        while (true) {
            int var3 = arg1.method110((byte) 28);
            if (var3 == 0) {
                return;
            }
            this.method2227(true, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZLdaa;I)V")
    private final void method2227(boolean arg0, class11 arg1, int arg2) {
        if (!arg0) {
            return;
        }
        if (arg2 == 1) {
            this.field5057 = arg1.method110((byte) 75);
        } else if (arg2 == 2) {
            this.field5063 = arg1.method93((byte) 91);
        } else if (arg2 == 3) {
            this.field5061 = arg1.method93((byte) 122);
        } else if (arg2 == 4) {
            this.field5060 = arg1.method111(-119);
        }
        field5058++;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Z")
    public static final boolean method2228(int arg0, int arg1, int arg2) {
        if (arg0 != 16024) {
            field5056 = null;
        }
        field5062++;
        return (class320.method1993(arg1, (byte) 5, arg2) | class645.method3720((byte) -73, arg2, arg1) | class524.method3023(arg2, arg1, 1)) & class15.method178(arg1, arg0 ^ 0x3E98, arg2);
    }
}

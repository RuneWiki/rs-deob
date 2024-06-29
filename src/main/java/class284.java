import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class284 {

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field4433 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "[I")
    public static int[] field4432 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field4424 = 0;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "[I")
    public static int[] field4437 = new int[25];

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "[I")
    public static int[] field4438 = new int[128];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public int field4423;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public int field4428;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public int field4429;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public int field4430;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public int field4435;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public int field4439;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "[B")
    public byte[] field4426;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "[B")
    public byte[] field4434;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V", line = 6)
    public static final void method1987(byte arg0) {
        field4425++;
        class136.field2221 = null;
        class252.method1745();
        if (arg0 != 126) {
            field4433 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)Z", line = 27)
    public static final boolean method1988(int arg0, int arg1, int arg2) {
        int var3 = class5.field124[arg0][arg1][arg2];
        if (-class266.field4024 == var3) {
            return false;
        } else if (class266.field4024 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class316.method2230(var4 + 1, class85.field1374[arg0][arg1][arg2], var5 + 1) && class316.method2230(var4 + 128 - 1, class85.field1374[arg0][arg1 + 1][arg2], var5 + 1) && class316.method2230(var4 + 128 - 1, class85.field1374[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class316.method2230(var4 + 1, class85.field1374[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class5.field124[arg0][arg1][arg2] = class266.field4024;
                return true;
            } else {
                class5.field124[arg0][arg1][arg2] = -class266.field4024;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V", line = 64)
    public static void method1989(byte arg0) {
        field4438 = null;
        field4437 = null;
        if (arg0 < -76) {
            field4433 = null;
            field4432 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)I", line = 84)
    public static final int method1990(boolean arg0, int arg1) {
        field4436++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        if (!arg0) {
            method1989((byte) -121);
        }
        return arg1 & ~var7;
    }
}

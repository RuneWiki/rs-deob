import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class277 extends class43 {

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[B")
    public byte[] field3582;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field3584 = 0;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "F")
    public static float field3590;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "[I")
    public static int[] field3585;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)V")
    public static void method1740(boolean arg0) {
        field3585 = null;
        if (arg0) {
            field3584 = -80;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZZLup;I)V")
    public static final void method1741(boolean arg0, boolean arg1, class244 arg2, int arg3) {
        if (arg3 != 1) {
            field3585 = null;
        }
        field3587++;
        int var4 = arg2.field3245;
        int var5 = (int) arg2.field505;
        arg2.method263(false);
        if (arg0) {
            class244.method1604(var4, 2);
        }
        class234.method1508((byte) -119, var4);
        class453 var6 = class195.method1212(var5, (byte) 49);
        if (var6 != null) {
            class303.method1923(var6, 10240);
        }
        class210.method1286(-63);
        if (!arg1 && class366.field4983 != -1) {
            class430.method2623(class366.field4983, true, 1);
        }
        class196 var7 = new class196(class282.field3678);
        for (class244 var8 = (class244) var7.method1216(-126); var8 != null; var8 = (class244) var7.method1217((byte) 49)) {
            if (!var8.method262((byte) 61)) {
                var8 = (class244) var7.method1216(arg3 ^ 0xFFFFFF8E);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field3240 == 3) {
                int var9 = (int) var8.field505;
                if (var9 >>> 16 == var4) {
                    method1741(true, arg1, var8, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([B)V")
    public class277(byte[] arg0) {
        this.field3582 = arg0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BC)Z")
    public static final boolean method1742(byte arg0, char arg1) {
        if (arg0 > -58) {
            return false;
        } else {
            field3591++;
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        }
    }
}

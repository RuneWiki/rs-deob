import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class460 {

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public int field6232 = 1;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "Z")
    public boolean field6238 = false;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
    public int field6241 = 2;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
    public int field6239 = 64;

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "I")
    public int field6240 = -1;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public int field6234 = 64;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "Z")
    public boolean field6242 = false;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "Ldb;")
    public static class298 field6236 = new class298(35, 0);

    @OriginalMember(owner = "client!ew", name = "l", descriptor = "[I")
    public static int[] field6243 = new int[5];

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V", line = 6)
    public static void method2615(int arg0) {
        field6243 = null;
        field6236 = null;
        if (arg0 < 116) {
            method2618((byte) -30, null);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BILeh;I)V", line = 17)
    private final void method2616(byte arg0, int arg1, class335 arg2, int arg3) {
        field6233++;
        if (arg1 == 1) {
            this.field6240 = arg2.method2001((byte) -83);
            if (this.field6240 == 65535) {
                this.field6240 = -1;
            }
        } else if (arg1 == 2) {
            this.field6239 = arg2.method2001((byte) -83) + 1;
            this.field6234 = arg2.method2001((byte) -83) + 1;
        } else if (arg1 == 3) {
            arg2.method2040(-49);
        } else if (arg1 == 4) {
            this.field6241 = arg2.method2034(255);
        } else if (arg1 == 5) {
            this.field6232 = arg2.method2034(255);
        } else if (arg1 == 6) {
            this.field6238 = true;
        } else if (arg1 == 7) {
            this.field6242 = true;
        }
        if (arg0 >= -99) {
            method2615(-40);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILeh;I)V", line = 72)
    public final void method2617(int arg0, class335 arg1, int arg2) {
        field6237++;
        if (arg2 > -67) {
            method2615(45);
        }
        while (true) {
            int var4 = arg1.method2034(255);
            if (var4 == 0) {
                return;
            }
            this.method2616((byte) -117, var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BLjava/lang/String;)V", line = 102)
    public static final void method2618(byte arg0, String arg1) {
        if (arg0 < 98) {
            method2615(5);
        }
        field6235++;
        if (class636.field8571 == null) {
            return;
        }
        class225.field3168++;
        class402 var2 = class390.method2252(class558.field7400, -122, class262.field3644);
        var2.field5354.method1980(-345277664, class580.method3186(122, arg1));
        var2.field5354.method2019(-118, arg1);
        class36.method278(0, var2);
    }
}

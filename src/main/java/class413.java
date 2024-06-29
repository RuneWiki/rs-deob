import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class413 {

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "Z")
    public boolean field5669 = false;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public int field5659;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public int field5662;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "Lkd;")
    public class261 field5668;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)I", line = 3)
    public static final int method2366(int arg0, int arg1) {
        if (arg1 < 120) {
            method2367(-16);
        }
        field5660++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)I", line = 20)
    public static final int method2367(int arg0) {
        field5658++;
        if (arg0 > -107) {
            field5664 = -75;
        }
        return class2.field11.method1438(-1);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Leh;I)V", line = 32)
    public final void method2368(class335 arg0, int arg1) {
        int var3 = -28 % ((-arg1 - 30) / 59);
        while (true) {
            int var4 = arg0.method2034(255);
            if (var4 == 0) {
                field5667++;
                return;
            }
            this.method2369(arg0, var4, 99);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Leh;II)V", line = 56)
    private final void method2369(class335 arg0, int arg1, int arg2) {
        field5666++;
        if (arg1 == 1) {
            this.field5659 = arg0.method2001((byte) -83);
        } else if (arg1 == 2) {
            this.field5662 = arg0.method2042((byte) 53);
        } else if (arg1 == 3) {
            this.field5669 = true;
        } else if (arg1 == 4) {
            this.field5659 = -1;
        }
        if (arg2 <= 98) {
            method2367(2);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBZLoa;)Lxa;", line = 86)
    public final class468 method2370(int arg0, byte arg1, boolean arg2, class651 arg3) {
        field5665++;
        long var5 = (long) ((arg2 ? 262144 : 0) | this.field5659 | arg0 << 16 | arg3.field8804 << 19);
        class468 var7 = (class468) this.field5668.field3591.method3750(var5, false);
        if (var7 != null) {
            return var7;
        } else if (this.field5668.field3579.method2549(this.field5659, 3015)) {
            if (arg1 != 115) {
                this.field5659 = 79;
            }
            class500 var8 = class500.method2770(this.field5668.field3579, this.field5659, 0);
            if (var8 != null) {
                var8.field6701 = var8.field6695 = var8.field6694 = var8.field6699 = 0;
                if (arg2) {
                    var8.method2778();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method2774();
                }
            }
            class468 var10 = arg3.method440(var8, true);
            if (var10 != null) {
                this.field5668.field3591.method3745(arg1 - 114, var5, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)Z", line = 131)
    public final boolean method2371(int arg0) {
        field5661++;
        if (arg0 != 0) {
            this.method2371(25);
        }
        return this.field5668.field3579.method2549(this.field5659, arg0 + 3015);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILgba;II)V", line = 144)
    public static final void method2372(int arg0, class625 arg1, int arg2, int arg3) {
        field5663++;
        if (class109.field1591 != null || class388.field5142 || arg1 == null || class467.method2635(0, arg1) == null) {
            return;
        }
        class109.field1591 = arg1;
        class673.field9525 = class467.method2635(-114, arg1);
        class643.field8627 = arg2;
        int var4 = 64 / ((arg3 - 75) / 46);
        class549.field7326 = 0;
        class628.field8468 = arg0;
        class29.field477 = false;
    }
}

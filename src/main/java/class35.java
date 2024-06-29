import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class35 extends class328 {

    @OriginalMember(owner = "client!wq", name = "z", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client!wq", name = "x", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
    public static int field496 = 0;

    @OriginalMember(owner = "client!wq", name = "v", descriptor = "Lvq;")
    public static class24 field502 = new class24(2, -1);

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!wq", name = "t", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!wq", name = "u", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!wq", name = "w", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!wq", name = "y", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!wq", name = "A", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(III)I")
    public static final int method324(int arg0, int arg1, int arg2) {
        ++field498;
        if (~arg0 > ~arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        if (arg2 != 0) {
            return -94;
        } else {
            while (arg1 != 0) {
                int var4 = arg0 % arg1;
                arg0 = arg1;
                arg1 = var4;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)V")
    public final void method325(int arg0, int arg1, int arg2) {
        ++field503;
        int var4 = this.field504 * arg2 >> 12;
        int var5 = this.field506 * arg2 >> 12;
        int var6 = this.field495 * arg1 >> 12;
        int var7 = this.field497 * arg1 >> 12;
        class299.method1984(var4, super.field4880, super.field4883, var5, var7, arg0 + arg0, super.field4884, var6);
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(IIIIIII)V")
    public class35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field506 = arg2;
        this.field495 = arg1;
        this.field497 = arg3;
        this.field504 = arg0;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILct;)V")
    public static final void method326(int arg0, class104 arg1) {
        ++field505;
        class446.field6487 = arg1;
        if (arg0 != -2) {
            method324(-87, -41, 45);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
    public static final void method327(byte arg0) {
        class363 var1 = class165.field2180;
        synchronized (class165.field2180) {
            int var2 = -31 % ((53 - arg0) / 50);
            class165.field2180.method2313(92);
        }
        ++field499;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BII)V")
    public final void method328(byte arg0, int arg1, int arg2) {
        ++field507;
        int var4 = this.field504 * arg2 >> 12;
        int var5 = this.field506 * arg2 >> 12;
        if (arg0 != 20) {
            field502 = null;
        }
        int var6 = this.field495 * arg1 >> 12;
        int var7 = this.field497 * arg1 >> 12;
        class371.method2361(super.field4883, -19520, var4, var6, var7, var5);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIZIIIIII)Z")
    public static final boolean method329(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg10 <= 12) {
            return true;
        } else {
            ++field501;
            int var11 = class139.method924(arg2, arg3, arg0, arg4, arg5, arg7, arg8, arg6, class15.field241, class382.field5610[class187.field2619.field4960], arg9, arg1, class187.field2619.method446(10), 2, class240.field3565);
            if (~var11 > -2) {
                return false;
            } else {
                class36.field516 = class15.field241[var11 + -1];
                class247.field3647 = class240.field3565[var11 + -1];
                class441.field6418 = false;
                class294.method1955((byte) -60);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(III)V")
    public final void method330(int arg0, int arg1, int arg2) {
        ++field500;
        if (arg2 != 0) {
            this.field504 = -61;
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)V")
    public static void method331(byte arg0) {
        field502 = null;
        if (arg0 > -99) {
            field502 = null;
        }
    }
}

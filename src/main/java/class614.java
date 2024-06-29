import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class614 extends class173 {

    @OriginalMember(owner = "client!rha", name = "z", descriptor = "Lbt;")
    public static class437 field7744 = new class437(1, 3);

    @OriginalMember(owner = "client!rha", name = "D", descriptor = "Z")
    public static boolean field7748 = false;

    @OriginalMember(owner = "client!rha", name = "E", descriptor = "Z")
    public static boolean field7749 = false;

    @OriginalMember(owner = "client!rha", name = "F", descriptor = "Ljava/lang/String;")
    public static String field7750 = "";

    @OriginalMember(owner = "client!rha", name = "G", descriptor = "[I")
    public static int[] field7751 = null;

    @OriginalMember(owner = "client!rha", name = "r", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!rha", name = "t", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!rha", name = "u", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!rha", name = "v", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!rha", name = "w", descriptor = "I")
    public int field7741;

    @OriginalMember(owner = "client!rha", name = "x", descriptor = "I")
    public int field7742;

    @OriginalMember(owner = "client!rha", name = "y", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!rha", name = "A", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!rha", name = "B", descriptor = "I")
    public int field7746;

    @OriginalMember(owner = "client!rha", name = "C", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!rha", name = "s", descriptor = "Ljava/lang/String;")
    public String field7737;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)V")
    public final void method3277(int arg0) {
        ++field7736;
        super.field2278 |= Long.MIN_VALUE;
        if (arg0 != 639) {
            this.method3283(73);
        }
        if (~this.method3281(21112) == -1L) {
            class401.field5305.method3862(this, false);
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(IILjava/lang/String;)Ljm;")
    public static final class6 method3278(int arg0, int arg1, String arg2) {
        ++field7738;
        class6 var3;
        try {
            var3 = (class6) Class.forName("bca").newInstance();
        } catch (Throwable var4) {
            var3 = new class312();
        }
        var3.field65 = arg2;
        var3.field63 = arg1;
        if (arg0 >= 0) {
            field7751 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(Z)V")
    public final void method3279(boolean arg0) {
        ++field7739;
        super.field2278 = 500L + class502.method2786(-7114) | Long.MIN_VALUE & super.field2278;
        class41.field473.method3862(this, arg0);
    }

    @OriginalMember(owner = "client!rha", name = "c", descriptor = "(Z)V")
    public static void method3280(boolean arg0) {
        field7744 = null;
        field7750 = null;
        if (arg0) {
            field7748 = false;
        }
        field7751 = null;
    }

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "(I)J")
    public final long method3281(int arg0) {
        ++field7743;
        if (arg0 != 21112) {
            this.method3281(-53);
        }
        return super.field2278 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method3282(boolean arg0, int arg1, String arg2) {
        ++field7747;
        if (arg2 != null) {
            if (class738.field9988 >= 100) {
                class648.method3504(-123, 4, class659.field8583.method3589(class496.field6338, -22395));
            } else {
                String var3 = class463.method2604(arg2, (byte) -127);
                if (var3 != null) {
                    int var4 = 0;
                    if (arg1 > -44) {
                        field7751 = null;
                    }
                    while (~class738.field9988 < ~var4) {
                        String var9 = class463.method2604(class202.field2803[var4], (byte) -128);
                        if (var9 != null && var9.equals(var3)) {
                            class648.method3504(-81, 4, arg2 + class659.field8584.method3589(class496.field6338, -22395));
                            return;
                        }
                        if (class281.field3634[var4] != null) {
                            String var10 = class463.method2604(class281.field3634[var4], (byte) -125);
                            if (var10 != null && var10.equals(var3)) {
                                class648.method3504(-83, 4, arg2 + class659.field8584.method3589(class496.field6338, -22395));
                                return;
                            }
                        }
                        ++var4;
                    }
                    for (int var5 = 0; ~var5 > ~class703.field9297; ++var5) {
                        String var7 = class463.method2604(class176.field2319[var5], (byte) -123);
                        if (var7 != null && var7.equals(var3)) {
                            class648.method3504(-84, 4, class659.field8589.method3589(class496.field6338, -22395) + arg2 + class659.field8590.method3589(class496.field6338, -22395));
                            return;
                        }
                        if (class686.field8837[var5] != null) {
                            String var8 = class463.method2604(class686.field8837[var5], (byte) 76);
                            if (var8 != null && var8.equals(var3)) {
                                class648.method3504(-120, 4, class659.field8589.method3589(class496.field6338, -22395) + arg2 + class659.field8590.method3589(class496.field6338, -22395));
                                return;
                            }
                        }
                    }
                    if (class463.method2604(class422.field5564.field375, (byte) -124).equals(var3)) {
                        class648.method3504(-97, 4, class659.field8586.method3589(class496.field6338, -22395));
                    } else {
                        ++class235.field3204;
                        class13 var6 = class659.method3587(class68.field909, 98, class63.field827);
                        var6.field130.method1491(-129, 1 + class32.method168(arg2, 66));
                        var6.field130.method1547(arg2, -6457);
                        var6.field130.method1491(-129, !arg0 ? 0 : 1);
                        class116.method679(var6, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rha", name = "e", descriptor = "(I)J")
    public final long method3283(int arg0) {
        if (arg0 != 1) {
            this.field7742 = 85;
        }
        ++field7745;
        return 72057594037927935L & super.field4108;
    }

    @OriginalMember(owner = "client!rha", name = "f", descriptor = "(I)I")
    public final int method3284(int arg0) {
        if (arg0 != 0) {
            return 40;
        } else {
            ++field7740;
            return (int) (255L & super.field4108 >>> 56);
        }
    }

    @OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(IJ)V")
    public class614(int arg0, long arg1) {
        super.field4108 = arg1 | (long) arg0 << 56;
    }
}

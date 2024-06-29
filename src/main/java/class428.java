import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class428 extends class263 {

    @OriginalMember(owner = "client!eo", name = "E", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!eo", name = "F", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!eo", name = "G", descriptor = "I")
    private int field6372;

    @OriginalMember(owner = "client!eo", name = "H", descriptor = "I")
    private int field6373;

    @OriginalMember(owner = "client!eo", name = "I", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!eo", name = "J", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!eo", name = "K", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!eo", name = "L", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!eo", name = "M", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!eo", name = "N", descriptor = "I")
    private int field6379;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)V")
    private final void method2534(int arg0, int arg1) {
        this.field6379 = (65280 & arg1) >> 4;
        this.field6373 = (arg1 & 16711680) >> 12;
        this.field6372 = (arg0 & arg1) << 4;
        ++field6371;
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(II)V")
    public static final void method2535(int arg0, int arg1) {
        ++field6378;
        class506 var2 = class14.method185(-1304589728, arg1, 14);
        var2.method2986(-101);
        if (arg0 != -14381) {
            method2536(-48, -62, -94, 101, -23, -99, 112, -34);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZLgk;)V")
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        ++field6376;
        if (~arg0 == -1) {
            this.method2534(255, arg2.method2759(1919914864));
        }
        if (!arg1) {
            this.field6373 = 115;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6370;
        if (~arg1 == ~arg4) {
            class346.method2100(arg6, arg0, -128, arg5, arg4, arg2, arg3);
        } else if (arg7 == 65280) {
            if (-arg4 + arg5 >= class297.field4427 && class102.field1544 >= arg4 + arg5 && ~class305.field4555 >= ~(-arg1 + arg6) && ~class286.field4290 <= ~(arg6 - -arg1)) {
                class24.method243(arg7 ^ -65391, arg0, arg2, arg1, arg3, arg6, arg5, arg4);
            } else {
                class264.method1649(arg4, arg3, arg5, arg0, arg1, arg2, arg6, false);
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V")
    public class428() {
        this(0);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BIILok;ZI)V")
    public static final void method2537(byte arg0, int arg1, int arg2, class74 arg3, boolean arg4, int arg5) {
        class509.field7487 = arg1;
        class274.field4095 = 1;
        class210.field3032 = arg5;
        class531.field7825 = arg2;
        class148.field2242 = 10000;
        class413.field6239 = arg4;
        class525.field7766 = arg3;
        if (arg0 != -77) {
            method2535(54, 40);
        }
        ++field6375;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(I)V")
    private class428(int arg0) {
        super(0, false);
        this.method2534(255, arg0);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[I)Ljava/lang/String;")
    public static final String method2538(int arg0, int[] arg1) {
        ++field6374;
        StringBuffer var2 = new StringBuffer();
        int var3 = class201.field2924;
        if (arg0 != -1) {
            method2536(-9, -109, 2, -55, 14, 115, -110, -93);
        }
        for (int var4 = 0; var4 < arg1.length; ++var4) {
            class363 var5 = class526.field7776.method2482(arg1[var4], false);
            if (~var5.field5555 != 0) {
                class127 var6 = (class127) class309.field4635.method2288((long) var5.field5555, ~arg0);
                if (var6 == null) {
                    class319 var7 = class319.method1994(class142.field2146, var5.field5555, 0);
                    if (var7 != null) {
                        var6 = class407.field6147.method98(var7, true);
                        class309.field4635.method2290((long) var5.field5555, var6, 107);
                    }
                }
                if (var6 != null) {
                    class184.field2715[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    ++var3;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(IB)[[I")
    public final int[][] method34(int arg0, byte arg1) {
        ++field6377;
        int[][] var3 = super.field3912.method2649(arg0, false);
        if (arg1 > -45) {
            return null;
        } else {
            if (super.field3912.field6681) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~var7 > ~class367.field5597; ++var7) {
                    var4[var7] = this.field6373;
                    var5[var7] = this.field6379;
                    var6[var7] = this.field6372;
                }
            }
            return var3;
        }
    }
}

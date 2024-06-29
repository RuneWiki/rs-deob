import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class208 extends class205 {

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "Ljava/lang/String;")
    public String field3483;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public int field3478;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "J")
    public long field3473;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "J")
    public long field3476;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    public int field3489;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "I")
    public int field3488;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "Ljava/lang/String;")
    public String field3485;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "Z")
    public boolean field3479;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "Z")
    public boolean field3484;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
    public int field3487;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "Z")
    public boolean field3481;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "Lul;")
    public static class363 field3480;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "Ljava/lang/String;")
    public String field3482;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 10)
    public static void method1516(int arg0) {
        field3480 = null;
        if (arg0 != -21646) {
            method1518(102);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lraa;I)V", line = 24)
    public static final void method1517(class353 arg0, int arg1) {
        field3475++;
        class353 var2 = class69.method652(arg0, 0);
        if (arg1 != -1) {
            method1517(null, 43);
        }
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class660.field9408;
            var3 = class412.field6066;
        } else {
            var3 = var2.field5280;
            var4 = var2.field5230;
        }
        class274.method1799((byte) 76, false, var4, arg0, var3);
        class530.method3139(4, var3, var4, arg0);
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)I", line = 52)
    public static final int method1518(int arg0) {
        field3490++;
        if (arg0 > -50) {
            field3480 = null;
        }
        int var1 = class159.field2475.method2683((byte) 66);
        if (class612.field8628.length - 1 > var1) {
            class159.field2475 = class612.field8628[var1 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V", line = 76)
    public class208(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field3483 = arg1;
        this.field3478 = arg6;
        this.field3473 = arg5;
        this.field3476 = arg10;
        this.field3489 = arg4;
        this.field3488 = arg3;
        this.field3485 = arg0;
        this.field3479 = arg8;
        this.field3484 = arg11;
        this.field3487 = arg2;
        this.field3481 = arg9;
        this.field3474 = arg7;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZLoj;)Ljava/lang/String;", line = 96)
    public static final String method1519(boolean arg0, class208 arg1) {
        field3486++;
        if (arg0) {
            field3477 = 78;
        }
        if (arg1.field3482 == null || arg1.field3482.length() == 0) {
            return arg1.field3483 == null || arg1.field3483.length() <= 0 ? arg1.field3485 : arg1.field3485 + class641.field9025.method3621(101, class467.field6804) + arg1.field3483;
        } else if (arg1.field3483 == null || arg1.field3483.length() <= 0) {
            return arg1.field3485 + class641.field9025.method3621(90, class467.field6804) + arg1.field3482;
        } else {
            return arg1.field3485 + class641.field9025.method3621(104, class467.field6804) + arg1.field3483 + class641.field9025.method3621(120, class467.field6804) + arg1.field3482;
        }
    }
}

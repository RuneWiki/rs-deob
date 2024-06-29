import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class328 extends class361 {

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "Lsd;")
    public class63 field4782;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "Lki;")
    public class509 field4776;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "Ltn;")
    public static class60 field4778 = new class60(63, 2);

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "Z")
    public static boolean field4784 = false;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public int field4774;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public int field4775;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public int field4777;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
    public int field4780;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    public int field4786;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "Lo;")
    public static class24 field4785;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IJ)V")
    public static final void method1973(int arg0, long arg1) {
        if (class268.field3910 != null) {
            if (class504.field7461 == 1 || class504.field7461 == 5) {
                class146.method902(arg0 + 22135, arg1);
            } else if (class504.field7461 == 4) {
                class160.method1022(arg1, (byte) -50);
            }
        }
        field4781++;
        class538.method3164((byte) -120, (long) class390.field5481, class385.field5414);
        if (class472.field6578 != arg0) {
            class211.method1334(class472.field6578, arg0);
        }
        for (int var3 = 0; var3 < class449.field6257; var3++) {
            if (class306.field4450[var3]) {
                class531.field7773[var3] = true;
            }
            class498.field7053[var3] = class306.field4450[var3];
            class306.field4450[var3] = false;
        }
        class323.field4722 = class390.field5481;
        if (class385.field5414.method317()) {
            class307.field4466 = true;
        }
        if (class472.field6578 != -1) {
            class449.field6257 = 0;
            class110.method753(1);
        }
        class385.field5414.method295();
        class408.method2419(class385.field5414, (byte) -27);
        int var4 = class162.method1030(true);
        if (var4 == -1) {
            var4 = class432.field6097;
        }
        if (var4 == -1) {
            var4 = class190.field2719;
        }
        class255.method1645(4096, var4);
        class396.method2302(class288.field4213, -42, class246.field3587.field1896, class246.field3587.field1899, class246.field3587.field1904);
        class288.field4213 = 0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBI)I")
    public static final int method1974(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = -22 % ((arg2 + 63) / 57);
        field4783++;
        if ((class368.field5253[arg3][arg1][arg0] & 0x8) == 0) {
            return arg3 <= 0 || (class368.field5253[1][arg1][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V")
    public final void method1975(boolean arg0) {
        this.field4774 = this.field4782.field785;
        if (arg0) {
            method1977(false);
        }
        this.field4786 = this.field4782.field787;
        field4779++;
        this.field4780 = this.field4782.field798;
        if (this.field4782.field800 != null) {
            this.field4782.field800.method818(this.field4776.field7534, this.field4776.field7539, this.field4776.field7541, class61.field767);
        }
        this.field4777 = class61.field767[2];
        this.field4775 = class61.field767[0];
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1976(String arg0, int arg1, int arg2) {
        field4773++;
        class45 var3 = class354.method2094(arg2, (byte) -17, 3);
        var3.method260(9188);
        var3.field503 = arg0;
        if (arg1 != -21322) {
            method1976(null, -67, 62);
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(Z)V")
    public static void method1977(boolean arg0) {
        field4778 = null;
        field4785 = null;
        if (arg0) {
            field4785 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lsd;Llm;)V")
    public class328(class63 arg0, class351 arg1) {
        this.field4782 = arg0;
        this.field4776 = this.field4782.method504((byte) 93);
        this.method1975(false);
    }
}

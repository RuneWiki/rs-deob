import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class665 extends class331 {

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "[I")
    public static int[] field9102 = new int[1];

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    public static int field9105;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
    public static int field9107;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
    public static int field9112;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "[Z")
    public static boolean[] field9111;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/String;Ltn;I)I", line = 4)
    public static final int method3600(String arg0, class179 arg1, int arg2) {
        ++field9104;
        int var3 = arg1.field2354;
        byte[] var4 = class589.method3271(arg0, true);
        arg1.method1100(-24938, var4.length);
        arg1.field2354 += class704.field9937.method3456(1, arg1.field2325, var4.length, arg1.field2354, var4, arg2);
        return -var3 + arg1.field2354;
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(II)V", line = 20)
    public final void method227(int arg0, int arg1) {
        ++field9103;
        super.field4202 = arg1;
        if (arg0 <= 113) {
            field9109 = 36;
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lts;)V", line = 31)
    public class665(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)I", line = 34)
    public final int method226(byte arg0) {
        ++field9105;
        return arg0 != 13 ? -91 : 127;
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(B)I", line = 46)
    public final int method3601(byte arg0) {
        ++field9110;
        return arg0 > -119 ? -30 : super.field4202;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIII)I", line = 57)
    public static final int method3602(int arg0, int arg1, int arg2, int arg3) {
        ++field9112;
        int var4 = arg1 & arg3;
        if (var4 == 0) {
            return arg2;
        } else if (~var4 == -2) {
            return -arg0 + 7;
        } else {
            return ~var4 == -3 ? -arg2 + 7 : arg0;
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(ILts;)V", line = 78)
    public class665(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(II)I", line = 83)
    public final int method222(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method222(-108, 118);
        }
        ++field9106;
        return 1;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V", line = 101)
    public static void method3603(int arg0) {
        field9102 = null;
        field9111 = null;
        int var1 = 51 / ((-57 - arg0) / 47);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 115)
    public final void method224(int arg0) {
        ++field9108;
        if (~super.field4202 > -1 && ~super.field4202 < -128) {
            super.field4202 = this.method226((byte) 13);
        }
        if (arg0 != -1959) {
            field9111 = null;
        }
    }
}

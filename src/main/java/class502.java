import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class502 extends class264 {

    @OriginalMember(owner = "client!iea", name = "m", descriptor = "I")
    public static int field7180 = 0;

    @OriginalMember(owner = "client!iea", name = "x", descriptor = "I")
    public static int field7191 = 1;

    @OriginalMember(owner = "client!iea", name = "p", descriptor = "[I")
    public static int[] field7183 = new int[32];

    @OriginalMember(owner = "client!iea", name = "q", descriptor = "Lke;")
    public static class622 field7184 = new class622(16, 2);

    @OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!iea", name = "l", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!iea", name = "n", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!iea", name = "o", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!iea", name = "s", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!iea", name = "t", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!iea", name = "u", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!iea", name = "v", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!iea", name = "w", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!iea", name = "r", descriptor = "[[I")
    public static int[][] field7185;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        if (arg0 != 112) {
            this.method663((byte) -29);
        }
        ++field7189;
        return 1;
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lmfa;)V")
    public class502(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        super.field3733 = arg1;
        if (arg0 <= -114) {
            ++field7186;
        }
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(B)I")
    public final int method2930(byte arg0) {
        if (arg0 > -31) {
            this.method659((byte) -6, 24);
        }
        ++field7187;
        return super.field3733;
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(ILmfa;)V")
    public class502(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        ++field7181;
        return arg0 != -38 ? -117 : 3;
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        if (super.field3733 < 0 || super.field3733 > 4) {
            super.field3733 = this.method663((byte) -38);
        }
        ++field7190;
        int var2 = -104 % ((1 - arg0) / 41);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IZII)I")
    public static final int method2931(int arg0, boolean arg1, int arg2, int arg3) {
        ++field7182;
        if (!arg1) {
            field7191 = -104;
        }
        if (arg2 > 243) {
            arg3 >>= 4;
        } else if (~arg2 >= -218) {
            if (arg2 > 192) {
                arg3 >>= 2;
            } else if (~arg2 < -180) {
                arg3 >>= 1;
            }
        } else {
            arg3 >>= 3;
        }
        return (arg3 >> 5 << 7) + ((255 & arg0) >> 2 << 10) + (arg2 >> 1);
    }

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "(I)V")
    public static void method2932(int arg0) {
        if (arg0 == 25746) {
            field7184 = null;
            field7185 = null;
            field7183 = null;
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILjava/lang/String;ZIILjava/lang/String;IJZZIIJ)V")
    public static final void method2933(int arg0, String arg1, boolean arg2, int arg3, int arg4, String arg5, int arg6, long arg7, boolean arg8, boolean arg9, int arg10, int arg11, long arg12) {
        ++field7178;
        if (!class422.field5962 && class543.field7608 < 500) {
            int var15 = arg6 == -1 ? class303.field4540 : arg6;
            if (arg4 != 6947) {
                method2933(-32, (String) null, false, -99, 88, (String) null, -110, 69L, false, false, 95, -60, 32L);
            }
            class312 var16 = new class312(arg5, arg1, var15, arg0, arg3, arg12, arg10, arg11, arg2, arg8, arg7, arg9);
            class235.method1620(-95, var16);
        }
    }
}

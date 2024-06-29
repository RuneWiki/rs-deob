import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class499 extends class222 implements class438 {

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    private int field7561;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "Loe;")
    public static class127 field7566 = new class127(91, 7);

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V", line = 5)
    public static void method2999(int arg0) {
        field7566 = null;
        if (arg0 != -17000) {
            field7566 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[BIB)V", line = 16)
    public final void method353(int arg0, byte[] arg1, int arg2, byte arg3) {
        ++field7568;
        if (arg3 != -27) {
            field7566 = null;
        }
        this.method1350(arg2, (byte) 83, arg1);
        this.field7561 = arg0;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLjava/lang/String;)V", line = 28)
    public static final void method3000(byte arg0, String arg1) {
        class150.method976(arg1, 0, "", 0, "", (byte) -113);
        if (arg0 != -48) {
            method2999(95);
        }
        ++field7564;
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V", line = 42)
    public static final void method3001(int arg0) {
        ++field7569;
        if (~class39.field524 < -1) {
            class345.method2114(0);
        } else {
            class332.field4975 = class163.field2534;
            class163.field2534 = null;
            class189.method1196(40, -12254);
            if (arg0 >= -67) {
                method3002((byte) -127, (String) null);
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)J", line = 62)
    public final long method352(int arg0) {
        int var2 = -74 / ((arg0 - 21) / 57);
        ++field7567;
        return 0L;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)I", line = 80)
    public final int method350(int arg0) {
        if (arg0 != 12399) {
            field7566 = null;
        }
        ++field7562;
        return super.field3430;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lbl;I[BIZ)V", line = 93)
    public class499(class442 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field7561 = arg1;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(BLjava/lang/String;)I", line = 101)
    public static final int method3002(byte arg0, String arg1) {
        ++field7570;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            var3 = (var3 << 5) + -var3 + arg1.charAt(var4);
        }
        if (arg0 != -51) {
            field7566 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V", line = 124)
    public final void method1352(byte arg0) {
        if (arg0 != 93) {
            this.method353(47, (byte[]) null, -21, (byte) -11);
        }
        ++field7565;
        super.field3425.method2587(this, 1);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)I", line = 135)
    public final int method351(boolean arg0) {
        if (arg0) {
            return -89;
        } else {
            ++field7563;
            return this.field7561;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;", line = 147)
    public static final String[] method3003(char arg0, int arg1, String arg2) {
        ++field7571;
        int var3 = class121.method840(arg2, arg1 ^ 14920, arg0);
        String[] var4 = new String[arg1 + var3];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var3 > var7; ++var7) {
            int var8;
            for (var8 = var6; arg0 != arg2.charAt(var8); ++var8) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }
}

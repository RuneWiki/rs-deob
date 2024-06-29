import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class326 extends class103 implements class381 {

    @OriginalMember(owner = "client!kda", name = "w", descriptor = "I")
    private int field4385;

    @OriginalMember(owner = "client!kda", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field4381 = new String[200];

    @OriginalMember(owner = "client!kda", name = "p", descriptor = "Lcba;")
    public static class471 field4378 = new class471(83, -1);

    @OriginalMember(owner = "client!kda", name = "y", descriptor = "I")
    public static int field4387 = 0;

    @OriginalMember(owner = "client!kda", name = "q", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!kda", name = "r", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!kda", name = "t", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!kda", name = "u", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!kda", name = "v", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!kda", name = "x", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ILjava/lang/String;Lpu;IIIILmc;Lra;BILpa;)V")
    public static final void method2014(int arg0, String arg1, class483 arg2, int arg3, int arg4, int arg5, int arg6, class114 arg7, class91 arg8, byte arg9, int arg10, class310 arg11) {
        ++field4382;
        int var12;
        if (class107.field1653 != 4) {
            var12 = (int) class1.field13 - -class2.field27 & 16383;
        } else {
            var12 = (int) class1.field13 & 16383;
        }
        int var13 = Math.max(arg7.field1853 / 2, arg7.field1769 / 2) - -10;
        int var14 = arg5 * arg5 + arg10 * arg10;
        if (~(var13 * var13) <= ~var14) {
            int var15 = class1.field2[var12];
            int var16 = class1.field7[var12];
            if (~class107.field1653 != -5) {
                var15 = var15 * 256 / (class353.field4779 + 256);
                var16 = var16 * 256 / (class353.field4779 - -256);
            }
            int var17 = arg5 * var15 + arg10 * var16 >> 15;
            if (arg9 != -43) {
                method2018(-80);
            }
            int var18 = arg5 * var16 + -(arg10 * var15) >> 15;
            int var19 = arg2.method2822((class52[]) null, arg9 ^ -28396, arg1, 100);
            int var20 = arg2.method2820((class52[]) null, -13791, arg1, 100, 0);
            int var21 = var17 - var19 / 2;
            if (-arg7.field1853 <= var21 && ~var21 >= ~arg7.field1853 && var18 >= -arg7.field1769 && arg7.field1769 >= var18) {
                arg8.method673(-1, 1, arg0, arg7.field1769 / 2 + -arg6 + arg4 + -var18 + -var20, 0, arg4, arg1, arg3, arg11, (class52[]) null, 0, arg7.field1853 / 2 + arg3 + var21, 50, var19, 0, (int[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)I")
    public final int method2015(int arg0) {
        if (arg0 != 11070) {
            method2018(-94);
        }
        ++field4384;
        return this.field4385;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)J")
    public final long method2016(boolean arg0) {
        ++field4380;
        return !arg0 ? -17L : 0L;
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lgi;I[BIZ)V")
    public class326(class583 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field4385 = arg1;
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lgi;ILjaclib/memory/Buffer;IZ)V")
    public class326(class583 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field4385 = arg1;
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)I")
    public final int method2017(int arg0) {
        if (arg0 != 18322) {
            method2014(-34, (String) null, (class483) null, 55, 65, 37, 67, (class114) null, (class91) null, (byte) 48, -92, (class310) null);
        }
        ++field4383;
        return super.field1565;
    }

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)V")
    public static void method2018(int arg0) {
        field4381 = null;
        field4378 = null;
        if (arg0 != 2) {
            field4381 = null;
        }
    }

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "(I)V")
    public final void method730(int arg0) {
        super.field1561.method3406(true, this);
        ++field4386;
        if (arg0 != 255) {
            field4378 = null;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I[BII)V")
    public final void method2019(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 != 12766) {
            this.field4385 = -36;
        }
        this.method733(arg1, arg0, 0);
        ++field4379;
        this.field4385 = arg2;
    }
}

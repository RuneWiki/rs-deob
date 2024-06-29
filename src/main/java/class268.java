import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class268 extends class72 {

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (arg0 <= 30) {
            field3874 = -112;
        }
        if (super.field1286.method2815(-120) == class696.field9784) {
            super.field1282 = 2;
        }
        ++field3873;
        if (super.field1282 < 0 || super.field1282 > 2) {
            super.field1282 = this.method60(-3271);
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        if (arg1 != 11260) {
            this.method60(-72);
        }
        ++field3867;
        return 1;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I[BIIII[BII)V")
    public static final void method1790(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field3871;
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 3);
        if (arg8 != -1259003102) {
            method1793((class58) null, (byte) 22, -100);
        }
        for (int var11 = -arg7; ~var11 > -1; ++var11) {
            int var10001;
            for (int var12 = var9; ~var12 > -1; ++var12) {
                var10001 = arg3++;
                arg1[var10001] += arg6[arg5++];
                int var14 = arg3++;
                arg1[var14] += arg6[arg5++];
                int var15 = arg3++;
                arg1[var15] += arg6[arg5++];
                int var16 = arg3++;
                arg1[var16] += arg6[arg5++];
            }
            for (int var13 = var10; ~var13 > -1; ++var13) {
                var10001 = arg3++;
                arg1[var10001] += arg6[arg5++];
            }
            arg5 += arg0;
            arg3 += arg2;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
    public static final String method1791(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field3868;
        char[] var4 = new char[arg2];
        int var5 = 0;
        for (int var6 = arg0; ~var6 > ~arg2; ++var6) {
            int var7 = 255 & arg1[arg3 + var6];
            if (~var7 != -1) {
                if (~var7 <= -129 && ~var7 > -161) {
                    char var8 = class740.field10391[var7 + -128];
                    if (var8 == 0) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(ILcq;)V")
    public class268(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)V")
    public final void method59(int arg0, int arg1) {
        super.field1282 = arg0;
        ++field3870;
        if (arg1 != 3) {
            method1790(-7, (byte[]) null, 7, -107, 92, 22, (byte[]) null, 1, -39);
        }
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "(I)I")
    public final int method1792(int arg0) {
        ++field3872;
        return arg0 != 27669 ? -4 : super.field1282;
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lcq;)V")
    public class268(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lha;BI)Lfp;")
    public static final class323 method1793(class58 arg0, byte arg1, int arg2) {
        ++field3869;
        int var3 = -39 / ((arg1 - 2) / 48);
        class435 var4 = class701.method3939((byte) -21, arg0, arg2, true);
        return var4 == null ? null : var4.field6085;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        ++field3875;
        if (arg0 != -3271) {
            field3874 = -76;
        }
        return 1;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)V")
    public static final void method1794(int arg0, int arg1, int arg2) {
        class416 var3 = class390.field5454[arg0][arg1][arg2];
        if (var3 != null) {
            class260.method1768(var3.field5845);
            class260.method1768(var3.field5847);
            if (var3.field5845 != null) {
                var3.field5845 = null;
            }
            if (var3.field5847 != null) {
                var3.field5847 = null;
            }
        }
    }
}

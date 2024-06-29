import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class413 extends class125 {

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field5881 = 100;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "J")
    public static long field5888;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Lcga;")
    public static class141 field5882;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIFZIZ)[I")
    public static final int[] method2494(int arg0, int arg1, int arg2, int arg3, float arg4, boolean arg5, int arg6, boolean arg7) {
        ++field5879;
        int[] var8 = new int[arg2];
        class511 var9 = new class511();
        var9.field7413 = arg1;
        var9.field7406 = arg0;
        if (arg7) {
            return null;
        } else {
            var9.field7410 = arg6;
            var9.field7409 = arg5;
            var9.field7401 = (int) (arg4 * 4096.0F);
            var9.field7408 = arg3;
            var9.method628(73);
            class148.method1039(arg2, 1, -8540);
            var9.method3105(var8, 0, -11110);
            return var8;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lgp;)V")
    public class413(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(Z)V")
    public static void method2495(boolean arg0) {
        if (arg0) {
            field5882 = null;
        }
        field5882 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        ++field5885;
        if (!arg0) {
            return 116;
        } else {
            return !class71.method625(super.field1733.field7975.method3775(false), 0) ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
    public static final void method2496(byte arg0) {
        ++field5884;
        if (arg0 <= -54) {
            class322 var1 = null;
            try {
                class432 var2 = class345.field4749.method1876(-13918, true, "2");
                while (~var2.field6198 == -1) {
                    class363.method2283(1L, -24244);
                }
                if (~var2.field6198 == -2) {
                    var1 = (class322) var2.field6200;
                    byte[] var3 = new byte[(int) var1.method1996(-13)];
                    int var5;
                    for (int var4 = 0; ~var4 > ~var3.length; var4 += var5) {
                        var5 = var1.method2004(-20708, var3.length + -var4, var4, var3);
                        if (~var5 == 0) {
                            throw new IOException("EOF");
                        }
                    }
                    class565.method3382(-103, new class479(var3));
                }
            } catch (Exception var7) {
            }
            try {
                if (var1 != null) {
                    var1.method2000((byte) 33);
                }
            } catch (Exception var6) {
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)Z")
    public final boolean method2497(int arg0) {
        ++field5886;
        if (arg0 != -7558) {
            this.method155(false, -114);
        }
        return class71.method625(super.field1733.field7975.method3775(false), 0);
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(ILgp;)V")
    public class413(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        int var2 = -107 / ((-63 - arg0) / 49);
        ++field5880;
        return 0;
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(Z)I")
    public final int method2498(boolean arg0) {
        ++field5883;
        if (arg0) {
            field5882 = null;
        }
        return super.field1732;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        if (super.field1733.field7975.method3773(-106) && !class71.method625(super.field1733.field7975.method3775(false), 0)) {
            super.field1732 = 0;
        }
        ++field5878;
        if (~super.field1732 > -1 || ~super.field1732 < -3) {
            super.field1732 = this.method158((byte) -126);
        }
        if (!arg0) {
            field5882 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        if (arg0 >= -32) {
            field5881 = -106;
        }
        ++field5887;
        super.field1732 = arg1;
    }
}

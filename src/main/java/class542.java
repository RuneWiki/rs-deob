import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class542 {

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public static int field7582 = 0;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "Lbh;")
    public static class538 field7584 = new class538(8);

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "F")
    public static float field7581;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
    public static final void method3223(byte arg0) {
        field7580++;
        if (arg0 < 50) {
            method3224(-36, -112);
        }
        class136.field1828 = new class522();
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)I")
    public static final int method3224(int arg0, int arg1) {
        field7586++;
        if (arg0 != -1) {
            method3223((byte) -112);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lhg;B)V")
    public static final void method3225(class584 arg0, byte arg1) {
        field7583++;
        boolean var2 = false;
        if (class245.field3409 == arg0.field8402 || arg0.field8317 == -1 || arg0.field8391 != 0) {
            var2 = true;
        } else {
            class103 var3 = class274.field3684.method1881((byte) -80, arg0.field8317);
            if (var3.field1480 || var3.field1493[arg0.field8357] < arg0.field8323 + 1) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field8402 - arg0.field8388;
            int var5 = class245.field3409 - arg0.field8388;
            int var6 = arg0.field8360 * 512 + arg0.method3470(-1) * 256;
            int var7 = arg0.field8356 * 512 + (arg0.method3470(-1) * 256);
            int var8 = arg0.field8363 * 512 + arg0.method3470(-1) * 256;
            int var9 = arg0.field8334 * 512 + (arg0.method3470(-1) * 256);
            arg0.field9490 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg0.field9489 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg0.field8422 = 0;
        if (arg0.field8333 == 0) {
            arg0.method3471(8192, (byte) -122, false);
        }
        if (arg0.field8333 == 1) {
            arg0.method3471(12288, (byte) -117, false);
        }
        if (arg1 >= -96) {
            field7584 = null;
        }
        if (arg0.field8333 == 2) {
            arg0.method3471(0, (byte) -110, false);
        }
        if (arg0.field8333 == 3) {
            arg0.method3471(4096, (byte) -75, false);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZILha;I)Lek;")
    public static final class599 method3226(boolean arg0, int arg1, class545 arg2, int arg3) {
        field7585++;
        if (arg3 == -1) {
            return null;
        }
        if (class586.field8431 != null) {
            for (int var4 = 0; var4 < class586.field8431.length; var4++) {
                if (class586.field8431[var4] == arg3) {
                    return class714.field10131[var4];
                }
            }
        }
        class599 var5 = (class599) class501.field7010.method3200((long) arg3, -19983);
        if (var5 != null) {
            if (arg0 && var5.field8594 == null) {
                class742 var6 = class216.method1415(class673.field9469, (byte) 101, arg3);
                if (var6 == null) {
                    return null;
                }
                var5.field8594 = var6;
            }
            return var5;
        }
        class320[] var7 = class320.method1869(class565.field8032, arg3);
        if (var7 == null) {
            return null;
        }
        if (arg1 >= -119) {
            method3224(-24, -29);
        }
        class742 var8 = class216.method1415(class673.field9469, (byte) 88, arg3);
        if (var8 == null) {
            return null;
        }
        class599 var9;
        if (arg0) {
            var9 = new class599(arg2.method2085(var8, var7, true), var8);
        } else {
            var9 = new class599(arg2.method2085(var8, var7, true));
        }
        class501.field7010.method3199((byte) 78, var9, (long) arg3);
        return var9;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
    public static void method3227(int arg0) {
        if (arg0 == 28529) {
            field7584 = null;
        }
    }
}

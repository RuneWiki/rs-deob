import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public abstract class class509 {

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "F")
    public static float field6871;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lrq;B)V", line = 4)
    public static final void method2878(class39 arg0, byte arg1) {
        field6874++;
        boolean var2 = false;
        if (class430.field5984 == arg0.field496 || arg0.field459 == -1 || arg0.field492 != 0) {
            var2 = true;
        } else {
            class463 var3 = class77.field971.method776(arg0.field459, (byte) 83);
            if (var3.field6327 || (arg0.field507 + 1) > var3.field6319[arg0.field457]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field496 - arg0.field424;
            int var5 = class430.field5984 - arg0.field424;
            int var6 = arg0.field423 * 512 + (arg0.method241(-25747) * 256);
            int var7 = arg0.field472 * 512 + (arg0.method241(-25747) * 256);
            int var8 = arg0.field499 * 512 + (arg0.method241(-25747) * 256);
            int var9 = arg0.field486 * 512 + (arg0.method241(-25747) * 256);
            arg0.field3917 = ((var4 - var5) * var7 + (var5 * var9)) / var4;
            arg0.field3929 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
        }
        arg0.field523 = 0;
        if (arg0.field478 == 0) {
            arg0.method240(8192, 0, false);
        }
        if (arg0.field478 == 1) {
            arg0.method240(12288, 0, false);
        }
        if (arg0.field478 == 2) {
            arg0.method240(0, 0, false);
        }
        if (arg1 < 104) {
            field6871 = 0.08616667F;
        }
        if (arg0.field478 == 3) {
            arg0.method240(4096, 0, false);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILdw;)V", line = 60)
    public static final void method2879(int arg0, class676 arg1) {
        if (arg0 > -18) {
            method2878(null, (byte) 66);
        }
        field6876++;
        for (class9 var2 = (class9) class612.field8352.method374((byte) 82); var2 != null; var2 = (class9) class612.field8352.method372(-20740)) {
            if (var2.field84 == arg1) {
                if (var2.field106 != null) {
                    class285.field3866.method3203(var2.field106);
                    var2.field106 = null;
                }
                var2.method175(30604);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lcr;ZLjava/lang/String;ZI)V", line = 94)
    public static final void method2880(class112 arg0, boolean arg1, String arg2, boolean arg3, int arg4) {
        field6873++;
        if (arg3) {
            if (class112.field1360.startsWith("win") && arg0.field1356) {
                String var5 = null;
                if (class372.field5359 != null) {
                    var5 = class372.field5359.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class280 var6 = class139.method961(arg2, 126, 0, arg0);
                    class159.field2006 = arg2;
                    class241.field3154 = var6;
                    class677.field9607 = arg0;
                    return;
                }
            }
            if (class112.field1360.startsWith("mac")) {
                String var7 = null;
                if (class372.field5359 != null) {
                    var7 = class372.field5359.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg1) {
                    class139.method961(arg2, 126, 1, arg0);
                    return;
                }
            }
            class139.method961(arg2, 127, 2, arg0);
        } else {
            class139.method961(arg2, 126, 3, arg0);
        }
        if (arg4 < 53) {
            method2879(61, null);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IFZFF)F", line = 162)
    public static final float method2881(int arg0, float arg1, boolean arg2, float arg3, float arg4) {
        field6872++;
        if (arg2) {
            method2881(-100, 0.3085077F, true, 0.18710095F, -1.1461229F);
        }
        float[] var5 = class129.field1641[arg0];
        return var5[2] * arg3 + var5[0] * arg4 + var5[1] * arg1;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(BLlfa;)Llfa;")
    public abstract class673 method2882(byte arg0, class673 arg1);
}

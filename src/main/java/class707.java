import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class707 extends class112 {

    @OriginalMember(owner = "client!wca", name = "w", descriptor = "I")
    public static int field9936 = 0;

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "I")
    public int field9925;

    @OriginalMember(owner = "client!wca", name = "m", descriptor = "I")
    public static int field9926;

    @OriginalMember(owner = "client!wca", name = "p", descriptor = "I")
    public int field9929;

    @OriginalMember(owner = "client!wca", name = "q", descriptor = "I")
    public static int field9930;

    @OriginalMember(owner = "client!wca", name = "r", descriptor = "I")
    public int field9931;

    @OriginalMember(owner = "client!wca", name = "s", descriptor = "I")
    public static int field9932;

    @OriginalMember(owner = "client!wca", name = "u", descriptor = "I")
    public int field9934;

    @OriginalMember(owner = "client!wca", name = "v", descriptor = "I")
    public static int field9935;

    @OriginalMember(owner = "client!wca", name = "x", descriptor = "I")
    public int field9937;

    @OriginalMember(owner = "client!wca", name = "y", descriptor = "I")
    public int field9938;

    @OriginalMember(owner = "client!wca", name = "o", descriptor = "Ljava/lang/String;")
    public String field9928;

    @OriginalMember(owner = "client!wca", name = "n", descriptor = "[J")
    public static long[] field9927;

    @OriginalMember(owner = "client!wca", name = "t", descriptor = "[Ls;")
    public static class296[] field9933;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIZ[Lkq;)V")
    public static final void method4012(int arg0, int arg1, int arg2, int arg3, boolean arg4, class620[] arg5) {
        field9930++;
        for (int var6 = arg1; var6 < arg5.length; var6++) {
            class620 var7 = arg5[var6];
            if (var7 != null && var7.field8400 == arg3) {
                class523.method3139(arg0, var7, 13, arg2, arg4);
                class390.method2283(arg0, var7, arg1 + 4743, arg2);
                if ((var7.field8482 - var7.field8506) < var7.field8496) {
                    var7.field8496 = var7.field8482 - var7.field8506;
                }
                if (var7.field8496 < 0) {
                    var7.field8496 = 0;
                }
                if (var7.field8392 > (var7.field8399 - var7.field8416)) {
                    var7.field8392 = var7.field8399 - var7.field8416;
                }
                if (var7.field8392 < 0) {
                    var7.field8392 = 0;
                }
                if (var7.field8371 == 0) {
                    class690.method3851(arg4, 17959, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(II)Lpn;")
    public static final class776 method4013(int arg0, int arg1) {
        field9926++;
        class776[] var2 = class552.method3235(3879);
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class776 var4 = var2[var3];
            if (var4.field10715 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V")
    public static final void method4014(byte arg0) {
        int var1 = 36 / ((27 - arg0) / 54);
        field9932++;
        if (!class372.field4675) {
            class174.field2108 += (12.0F - class174.field2108) / 2.0F;
            class197.field2345 = true;
            class372.field4675 = true;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V")
    public static void method4015(int arg0) {
        if (arg0 <= 5) {
            method4015(-34);
        }
        field9933 = null;
        field9927 = null;
    }
}

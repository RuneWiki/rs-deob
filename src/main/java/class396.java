import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class396 {

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field5779 = 0;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "[[I")
    public static int[][] field5777 = new int[6][];

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Ln;")
    public static class17 field5776;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "[Lts;")
    public static class498[] field5780;

    @OriginalMember(owner = "client!q", name = "wa", descriptor = "(III[I)V")
    public abstract void method899(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "YA", descriptor = "([I)V")
    public abstract void method898(int[] arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public abstract void method906(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
    public static final void method2441(boolean arg0) {
        class508.field7190.method1913(arg0);
        field5778++;
    }

    @OriginalMember(owner = "client!q", name = "w", descriptor = "(I)V")
    public abstract void method894(int arg0);

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(Z)V")
    public static void method2442(boolean arg0) {
        field5776 = null;
        field5777 = null;
        field5780 = null;
        if (!arg0) {
            method2442(true);
        }
    }

    @OriginalMember(owner = "client!q", name = "NA", descriptor = "(III)V")
    public abstract void method905(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)Z")
    public static final boolean method2443(int arg0, int arg1) {
        field5775++;
        if (arg0 == -10) {
            return arg1 == 7 || arg1 == 8 || arg1 == 9;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!q", name = "o", descriptor = "(I)V")
    public abstract void method900(int arg0);

    @OriginalMember(owner = "client!q", name = "ZA", descriptor = "(I)V")
    public abstract void method901(int arg0);

    @OriginalMember(owner = "client!q", name = "J", descriptor = "(I)V")
    public abstract void method903(int arg0);

    @OriginalMember(owner = "client!q", name = "AA", descriptor = "(I)V")
    public abstract void method897(int arg0);

    @OriginalMember(owner = "client!q", name = "U", descriptor = "(III)V")
    public abstract void method891(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(I)V")
    public abstract void method893(int arg0);

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "()V")
    public abstract void method895();

    @OriginalMember(owner = "client!q", name = "na", descriptor = "(IIIIII)V")
    public abstract void method907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "M", descriptor = "(Lq;)V")
    public abstract void method896(class396 arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZLqj;Lr;Lcd;IIILfu;)V")
    public static final void method2444(boolean arg0, class473 arg1, class167 arg2, class288 arg3, int arg4, int arg5, int arg6, class360 arg7) {
        field5781++;
        int var8 = arg1.field6701 - (arg6 / 2) - 5;
        if (arg0) {
            method2443(-17, -21);
        }
        int var9 = arg4 + 2;
        if (arg3.field4309 != 0) {
            arg2.method1267(var9, arg4 + arg7.method2298() * arg5 + 1 - var9, 1, arg6 + 10, var8, arg3.field4309);
        }
        if (arg3.field4305 != 0) {
            arg2.method1261(arg4 - var9 - (-(arg7.method2298() * arg5) + -1), 25552, arg3.field4305, arg6 + 10, var8, var9);
        }
        int var10 = arg3.field4314;
        if (arg1.field6707 && arg3.field4298 != -1) {
            var10 = arg3.field4298;
        }
        for (int var11 = 0; var11 < arg5; var11++) {
            String var12 = class509.field7225[var11];
            if (var11 < arg5 - 1) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg7.method2300(arg2, var12, arg1.field6701, arg4, var10, true);
            arg4 += arg7.method2298();
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lq;")
    public abstract class396 method904();
}

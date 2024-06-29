import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class class360 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Ltca;")
    public static class141 field4775 = new class141(9, 2);

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Leba;")
    public static class550 field4777 = new class550(51, 12);

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4780 = 0;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4779 = 0;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public abstract void method2105(int arg0);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Z")
    public abstract boolean method2106(byte arg0, int arg1);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2107(int arg0, String arg1) {
        field4774++;
        int var2 = arg1.length();
        int var3 = 0;
        int var4 = 0;
        if (arg0 != 2) {
            method2107(13, null);
        }
        while (var4 < var2) {
            char var5 = arg1.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 > '߿') {
                var3 += 3;
            } else {
                var3 += 2;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static void method2108(byte arg0) {
        field4775 = null;
        if (arg0 == -61) {
            field4777 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(FIIIIIZII)[[I")
    public static final int[][] method2109(float arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field4776++;
        int[][] var9 = new int[arg7][arg8];
        if (arg3 >= -41) {
            method2109(-0.71805406F, -104, -22, -35, -101, 81, false, -126, 15);
        }
        class693 var10 = new class693();
        var10.field9770 = arg6;
        var10.field9775 = arg2;
        var10.field9762 = arg5;
        var10.field9773 = (int) (arg0 * 4096.0F);
        var10.field9776 = arg4;
        var10.method317((byte) 127);
        class239.method1483(arg7, 0, arg8);
        for (int var11 = 0; var11 < arg7; var11++) {
            var10.method3912(var9[var11], -1, var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public abstract void method2110(int arg0);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Ltea;")
    public abstract class477 method2111(byte arg0);
}

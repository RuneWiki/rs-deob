import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class250 {

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "[I")
    public static int[] field3900 = new int[32];

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "[I")
    public static int[] field3910;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Z")
    public static boolean field3907;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3913;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public int field3903;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "Lnh;")
    public static class305 field3904;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Lam;")
    public static class314 field3905;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Ljava/lang/String;")
    public String field3902;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "[Lqj;")
    public static class248[] field3912;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIII)V")
    public static final void method1625(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class205 var5 = (class205) class278.field4412.method1453(true, (long) arg4);
        if (arg3 != -1) {
            return;
        }
        field3909++;
        if (var5 == null) {
            var5 = new class205();
            class278.field4412.method1452((long) arg4, var5, 0);
        }
        if (var5.field3069.length <= arg2) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field3069.length; var8++) {
                var6[var8] = var5.field3069[var8];
                var7[var8] = var5.field3061[var8];
            }
            for (int var9 = var5.field3069.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3069 = var6;
            var5.field3061 = var7;
        }
        var5.field3069[arg2] = arg1;
        var5.field3061[arg2] = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)V")
    public static final void method1626(int arg0, byte arg1) {
        class167.field2392.method943(arg0, true);
        int var2 = 80 / ((-arg1 - 28) / 59);
        class106.field1520.method943(arg0, true);
        field3908++;
        class260.field4192.method943(arg0, true);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method1627(int arg0) {
        field3912 = null;
        field3904 = null;
        if (arg0 != 1) {
            method1627(-79);
        }
        field3900 = null;
        field3905 = null;
        field3910 = null;
        field3913 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILim;)Z")
    public static final boolean method1628(int arg0, class178 arg1) {
        field3899++;
        if (arg1.field2541 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field2541.length; var2++) {
            int var3 = class34.method231(var2, arg1, false);
            int var4 = arg1.field2594[var2];
            if (arg1.field2541[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field2541[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field2541[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0 != -33) {
            method1629(true, 97, (class248) null, 44, false, (byte) 35, (class248) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZILqj;IZBLqj;)I")
    public static final int method1629(boolean arg0, int arg1, class248 arg2, int arg3, boolean arg4, byte arg5, class248 arg6) {
        int var7 = class115.method737(-18339, arg2, arg3, arg6, arg4);
        field3901++;
        if (var7 != 0) {
            return arg4 ? -var7 : var7;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var8 = class115.method737(-18339, arg2, arg1, arg6, arg0);
            if (arg5 != -3) {
                field3907 = false;
            }
            return arg0 ? -var8 : var8;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3900[var1] = var0 - 1;
            var0 += var0;
        }
        field3910 = new int[500];
        field3914 = 3353893;
        field3907 = false;
        field3913 = "slide:";
    }
}

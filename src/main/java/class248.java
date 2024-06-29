import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class248 {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field4127 = 0;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field4129 = 0;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "[I")
    public static int[] field4128 = new int[1000];

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1742(byte arg0) {
        if (class103.field1767 < 0) {
            class61.field870 = -1;
            class205.field3380 = -1;
            class103.field1767 = 0;
        }
        int var1 = 104 / ((-arg0 - 69) / 46);
        field4132++;
        if (class103.field1767 > class50.field716) {
            class61.field870 = -1;
            class205.field3380 = -1;
            class103.field1767 = class50.field716;
        }
        if (class324.field5534 < 0) {
            class205.field3380 = -1;
            class324.field5534 = 0;
            class61.field870 = -1;
        }
        if (class324.field5534 > class214.field3537) {
            class205.field3380 = -1;
            class324.field5534 = class214.field3537;
            class61.field870 = -1;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIILrk;Lrk;IIIIJ)V", line = 46)
    public static final void method1743(int arg0, int arg1, int arg2, int arg3, class216 arg4, class216 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class88 var12 = new class88();
        var12.field1502 = arg10;
        var12.field1501 = arg1 * 128 + 64;
        var12.field1482 = arg2 * 128 + 64;
        var12.field1488 = arg3;
        var12.field1494 = arg4;
        var12.field1489 = arg5;
        var12.field1484 = arg6;
        var12.field1496 = arg7;
        var12.field1487 = arg8;
        var12.field1503 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class225.field3705[var13][arg1][arg2] == null) {
                class225.field3705[var13][arg1][arg2] = new class72(var13, arg1, arg2);
            }
        }
        class225.field3705[arg0][arg1][arg2].field1214 = var12;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 80)
    public static void method1744(int arg0) {
        field4128 = null;
        if (arg0 > -23) {
            field4129 = 9;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZIIZ)I", line = 110)
    public static final int method1745(boolean arg0, int arg1, int arg2, boolean arg3) {
        field4131++;
        class285 var4 = (class285) class243.field4004.method713(3365, (long) arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        if (!arg0) {
            method1746(8, (class229[]) null);
        }
        for (int var6 = 0; var6 < var4.field4696.length; var6++) {
            if (var4.field4696[var6] >= 0 && var4.field4696[var6] < class154.field2507) {
                class191 var7 = class124.method920(-84, var4.field4696[var6]);
                if (var7.field3128 != null) {
                    class295 var8 = (class295) var7.field3128.method713(3365, (long) arg2);
                    if (var8 != null) {
                        if (arg3) {
                            var5 += var4.field4707[var6] * var8.field4829;
                        } else {
                            var5 += var8.field4829;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[Lph;)Lph;", line = 164)
    public static final class229 method1746(int arg0, class229[] arg1) {
        if (arg0 != 8528) {
            return (class229) null;
        }
        field4130++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class295.method2001((byte) -106, arg1, 0, arg1.length);
    }
}

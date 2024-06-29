import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public abstract class class276 extends class381 {

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "Luca;")
    public class287 field3601;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Lnb;")
    public static class318 field3594 = new class318("WTI", 5);

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Z")
    public boolean field3598;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)I", line = 3)
    public final int method1634(byte arg0) {
        field3595++;
        if (arg0 <= 118) {
            this.method1645(true);
        }
        return 1;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 14)
    public static void method1635(int arg0) {
        if (arg0 == -595) {
            field3594 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)I", line = 30)
    public static final int method1637(int arg0, int arg1, int arg2) {
        field3596++;
        int var3 = class541.method3179(arg2 + 91923, arg0 - -45365, 4, 118) - (-(class541.method3179(arg2 + 37821, arg0 + 10294, 2, 103) + -128 >> 1) - (class541.method3179(arg2, arg0, 1, 124) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (~var4 > arg1) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)Z", line = 58)
    public final boolean method1640(byte arg0) {
        int var2 = 95 % ((-arg0 - 6) / 59);
        field3600++;
        return false;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lcaa;IIIII)V", line = 71)
    public static final void method1641(class538 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class555.field8157 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class91.field1390) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class575.field8372 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class44 var14 = class603.field8695[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class178.field2480[var11].method3822(var13, var12, 0) + class178.field2480[var11].method3822(var13, var12 + 1, 0) + class178.field2480[var11].method3822(var13 + 1, var12, 0) + class178.field2480[var11].method3822(var13 + 1, var12 + 1, 0)) / 4 - (class178.field2480[arg1].method3822(arg3, arg2, 0) + class178.field2480[arg1].method3822(arg3, arg2 + 1, 0) + class178.field2480[arg1].method3822(arg3 + 1, arg2, 0) + class178.field2480[arg1].method3822(arg3 + 1, arg2 + 1, 0)) / 4;
                                    class332 var16 = var14.field668;
                                    class332 var17 = var14.field670;
                                    if (var16 != null && var16.method309(true)) {
                                        arg0.method311(var15, class503.field7110, (var12 - arg2) * class263.field3412 + (1 - arg4) * class41.field615, var16, var6, 90, (var13 - arg3) * class263.field3412 + (1 - arg5) * class41.field615);
                                    }
                                    if (var17 != null && var17.method309(true)) {
                                        arg0.method311(var15, class503.field7110, (var12 - arg2) * class263.field3412 + (1 - arg4) * class41.field615, var17, var6, 49, (var13 - arg3) * class263.field3412 + (1 - arg5) * class41.field615);
                                    }
                                    for (class361 var18 = var14.field667; var18 != null; var18 = var18.field5299) {
                                        class293 var19 = var18.field5301;
                                        if (var19 != null && var19.method309(true) && (var19.field4299 == var12 || var7 == var12) && (var19.field4300 == var13 || var9 == var13)) {
                                            int var20 = var19.field4294 + 1 - var19.field4299;
                                            int var21 = var19.field4305 + 1 - var19.field4300;
                                            arg0.method311(var15, class503.field7110, (var19.field4299 - arg2) * class263.field3412 + (var20 - arg4) * class41.field615, var19, var6, 43, (var19.field4300 - arg3) * class263.field3412 + (var21 - arg5) * class41.field615);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)I", line = 159)
    public int method1642(int arg0) {
        field3602++;
        return arg0 == 1 ? 0 : 30;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Z", line = 173)
    public final boolean method1644(boolean arg0) {
        field3599++;
        if (arg0) {
            field3597 = 58;
        }
        return this.field3598;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Luca;)V", line = 184)
    public class276(class287 arg0) {
        this.field3601 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)Z")
    public abstract boolean method1636(int arg0);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)V")
    public abstract void method1638(byte arg0, int arg1);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BII)V")
    public abstract void method1639(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)Z")
    public abstract boolean method1643(byte arg0);

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)V")
    public abstract void method1645(boolean arg0);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Laaa;Laaa;II)V")
    public abstract void method1646(class227 arg0, class227 arg1, int arg2, int arg3);
}

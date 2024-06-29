import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class487 {

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "Lgg;")
    private class114 field6923 = new class114(64);

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "Lkha;")
    private class687 field6927;

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "Lmq;")
    public static class78 field6930 = new class78(85, -1);

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!raa", name = "l", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "Lkha;")
    public static class687 field6937;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "[I")
    public static int[] field6932;

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "[Lac;")
    public static class712[] field6935;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIBIIZI)V")
    public static final void method2846(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var7 = 30 / ((18 - arg2) / 33);
        if ((arg5 ? class223.field2944.field632.method3601((byte) -121) : class223.field2944.field600.method3601((byte) -121)) != 0 && arg6 != 0 && class111.field1370 < 50 && arg3 != -1) {
            class552.field7756[class111.field1370++] = new class310((byte) (arg5 ? 3 : 2), arg3, arg6, arg0, arg1, 0, arg4, null);
        }
        field6933++;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(BLida;)[I")
    public static final int[] method2847(byte arg0, class650 arg1) {
        field6929++;
        class179 var2 = new class179(518);
        int[] var3 = new int[4];
        for (int var4 = 0; var4 < 4; var4++) {
            var3[var4] = (int) (Math.random() * 9.9999999E7D);
        }
        var2.method1141(10, -87);
        var2.method1112(var3[0], -118);
        var2.method1112(var3[1], -126);
        var2.method1112(var3[2], -117);
        int var5 = 55 / ((-arg0 - 48) / 46);
        var2.method1112(var3[3], -123);
        for (int var6 = 0; var6 < 10; var6++) {
            var2.method1112((int) (Math.random() * 9.9999999E7D), -128);
        }
        var2.method1157((int) (Math.random() * 9.9999999E7D), (byte) 111);
        var2.method1146(class638.field8823, 7746, class402.field5568);
        arg1.field8928.method1123(var2.field2354, (byte) 57, 0, var2.field2325);
        return var3;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)Lnk;")
    public final class459 method2848(int arg0, int arg1) {
        field6922++;
        int var3 = 63 % ((arg0 - 75) / 39);
        class114 var4 = this.field6923;
        class459 var5;
        synchronized (this.field6923) {
            var5 = (class459) this.field6923.method778((long) arg1, -91);
        }
        if (var5 != null) {
            return var5;
        }
        class687 var6 = this.field6927;
        byte[] var7;
        synchronized (this.field6927) {
            var7 = this.field6927.method3810(32, -23360, arg1);
        }
        class459 var8 = new class459();
        if (var7 != null) {
            var8.method2688((byte) 116, new class179(var7));
        }
        class114 var9 = this.field6923;
        synchronized (this.field6923) {
            this.field6923.method774((long) arg1, 84, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V")
    public final void method2849(int arg0) {
        class114 var2 = this.field6923;
        synchronized (this.field6923) {
            if (arg0 <= 77) {
                return;
            }
            this.field6923.method781((byte) 47);
        }
        field6936++;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(BI)Z")
    public static final boolean method2850(byte arg0, int arg1) {
        int var2 = -7 % ((arg0 + 11) / 48);
        field6931++;
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)V")
    public static void method2851(boolean arg0) {
        field6937 = null;
        field6930 = null;
        field6932 = null;
        if (arg0) {
            field6935 = null;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIIII)V")
    public static final void method2852(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6925++;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = arg2;
        int var9 = class711.method3927(arg1 + arg3, arg2 ^ 0x79, class592.field8242, class108.field1334);
        int var10 = class711.method3927(arg1 - arg3, -113, class592.field8242, class108.field1334);
        class284.method1709(class15.field220[arg0], var9, -8251, var10, arg4);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg0 - var6;
                int var12 = arg0 + var6;
                if (class112.field1386 <= var12 && var11 <= class328.field4190) {
                    int var13 = class711.method3927(arg1 + var5, -119, class592.field8242, class108.field1334);
                    int var14 = class711.method3927(arg1 - var5, arg2 ^ 0x7A, class592.field8242, class108.field1334);
                    if (var12 <= class328.field4190) {
                        class284.method1709(class15.field220[var12], var13, -8251, var14, arg4);
                    }
                    if (var11 >= class112.field1386) {
                        class284.method1709(class15.field220[var11], var13, -8251, var14, arg4);
                    }
                }
            }
            var5++;
            int var15 = arg0 - var5;
            int var16 = arg0 + var5;
            if (var16 >= class112.field1386 && class328.field4190 >= var15) {
                int var17 = class711.method3927(arg1 + var6, -122, class592.field8242, class108.field1334);
                int var18 = class711.method3927(arg1 - var6, arg2 ^ 0x6F, class592.field8242, class108.field1334);
                if (class328.field4190 >= var16) {
                    class284.method1709(class15.field220[var16], var17, -8251, var18, arg4);
                }
                if (var15 >= class112.field1386) {
                    class284.method1709(class15.field220[var15], var17, -8251, var18, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
    public final void method2853(byte arg0) {
        class114 var2 = this.field6923;
        synchronized (this.field6923) {
            this.field6923.method776((byte) -78);
        }
        field6926++;
        int var3 = 106 / ((-arg0 - 56) / 49);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(III)Z")
    public static final boolean method2854(int arg0, int arg1, int arg2) {
        if (arg1 == 4) {
            field6924++;
            return (arg2 & 0x800) != 0 | class141.method875(arg2, arg0, 32768) || class407.method2411(arg0, arg2, arg1 ^ 0x4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Ldh;ILkha;)V")
    public class487(class286 arg0, int arg1, class687 arg2) {
        this.field6927 = arg2;
        this.field6927.method3812(0, 32);
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(BI)V")
    public final void method2855(byte arg0, int arg1) {
        class114 var3 = this.field6923;
        synchronized (this.field6923) {
            if (arg0 != -81) {
                return;
            }
            this.field6923.method775(1, arg1);
        }
        field6928++;
    }
}

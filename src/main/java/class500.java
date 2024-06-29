import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class500 {

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "Lfr;")
    private class231 field7320 = new class231(128);

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "Lqs;")
    private class496 field7318;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BI)Lrl;")
    public final class479 method2957(byte arg0, int arg1) {
        field7324++;
        class231 var3 = this.field7320;
        class479 var4;
        synchronized (this.field7320) {
            var4 = (class479) this.field7320.method1593((byte) 114, (long) arg1);
        }
        if (arg0 <= 65) {
            this.field7318 = null;
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field7318;
        byte[] var6;
        synchronized (this.field7318) {
            var6 = this.field7318.method2926(arg1, -89, 1);
        }
        class479 var7 = new class479();
        if (var6 != null) {
            var7.method2822(new class23(var6), -127);
        }
        class231 var8 = this.field7320;
        synchronized (this.field7320) {
            this.field7320.method1595(var7, (long) arg1, (byte) -103);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
    public final void method2958(int arg0) {
        field7322++;
        class231 var2 = this.field7320;
        synchronized (this.field7320) {
            this.field7320.method1598(106);
            if (arg0 > -95) {
                this.field7320 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
    public final void method2959(byte arg0) {
        class231 var2 = this.field7320;
        synchronized (this.field7320) {
            this.field7320.method1604(4);
        }
        if (arg0 == 56) {
            field7317++;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)V")
    public final void method2960(int arg0, int arg1) {
        field7321++;
        class231 var3 = this.field7320;
        synchronized (this.field7320) {
            this.field7320.method1603((byte) -126, arg0);
        }
        int var4 = -55 % ((-arg1 - 66) / 58);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IB[J[II)V")
    public static final void method2961(int arg0, byte arg1, long[] arg2, int[] arg3, int arg4) {
        if (arg1 <= 37) {
            return;
        }
        field7326++;
        if (arg4 >= arg0) {
            return;
        }
        int var5 = (arg0 + arg4) / 2;
        int var6 = arg4;
        long var7 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var7;
        int var9 = arg3[var5];
        arg3[var5] = arg3[arg0];
        arg3[arg0] = var9;
        int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
        for (int var11 = arg4; var11 < arg0; var11++) {
            if (arg2[var11] < var7 + ((long) (var11 & var10))) {
                long var12 = arg2[var11];
                arg2[var11] = arg2[var6];
                arg2[var6] = var12;
                int var14 = arg3[var11];
                arg3[var11] = arg3[var6];
                arg3[var6++] = var14;
            }
        }
        arg2[arg0] = arg2[var6];
        arg2[var6] = var7;
        arg3[arg0] = arg3[var6];
        arg3[var6] = var9;
        method2961(var6 - 1, (byte) 57, arg2, arg3, arg4);
        method2961(arg0, (byte) 45, arg2, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIII)V")
    public static final void method2962(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 122) {
            method2961(-113, (byte) -75, null, null, -95);
        }
        field7323++;
        if (class510.field7403.field5119 != 0 && arg3 != 0 && class238.field4104 < 50 && arg0 != -1) {
            class241.field4163[class238.field4104++] = new class452((byte) 1, arg0, arg3, arg4, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V")
    public static final void method2963(int arg0) {
        field7325++;
        int var1 = class151.field2425;
        int[] var2 = class45.field734;
        for (int var3 = 0; var3 < var1; var3++) {
            class166 var9 = class435.field6489[var2[var3]];
            if (var9 != null && var9.field3057 > 0) {
                var9.field3057--;
                if (var9.field3057 == 0) {
                    var9.field3062 = null;
                }
            }
        }
        for (int var4 = arg0; var4 < class86.field1471; var4++) {
            long var5 = (long) class371.field5734[var4];
            class505 var7 = (class505) class147.field2396.method2516(var5, -1);
            if (var7 != null) {
                class265 var8 = var7.field7355;
                if (var8.field3057 > 0) {
                    var8.field3057--;
                    if (var8.field3057 == 0) {
                        var8.field3062 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lwv;ILqs;)V")
    public class500(class535 arg0, int arg1, class496 arg2) {
        this.field7318 = arg2;
        this.field7318.method2940(1, -10511);
    }
}

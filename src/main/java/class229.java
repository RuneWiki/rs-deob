import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class229 {

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Z")
    private boolean field3454 = true;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    private int field3445 = -1;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "[Lfn;")
    private class82[] field3448;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    private int field3450;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    private int field3446;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    private int field3443;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    private int field3458;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[Lfn;")
    private class82[] field3447;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lfn;")
    private class82 field3442;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Lus;")
    public static class1 field3455 = new class1(70, -2);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    private int field3440;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    private int field3456;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "Ltr;")
    private class176 field3453;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Lb;")
    public static class201 field3449;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "Lpj;")
    public static class89 field3460;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lnp;II)Z")
    public final boolean method1457(class313 arg0, int arg1, int arg2) {
        if (this.field3445 != arg2) {
            this.field3445 = arg2;
            int var4 = class276.method1708(1256978000, arg2);
            if (var4 > arg2) {
                var4 = class8.method30(arg2, 2094643329);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field3456 != var4) {
                this.field3456 = var4;
                this.field3453 = null;
            }
            if (this.field3448 != null) {
                this.field3440 = 0;
                int[] var5 = new int[this.field3448.length];
                for (int var6 = 0; var6 < this.field3448.length; var6++) {
                    class82 var7 = this.field3448[var6];
                    if (var7.method461(this.field3450, this.field3443, this.field3446, this.field3445)) {
                        var5[this.field3440] = var7.field1002;
                        this.field3447[this.field3440++] = var7;
                    }
                }
                class104.method586(0, this.field3440 - 1, 128, this.field3447, var5);
            }
            this.field3454 = true;
        }
        field3457++;
        int var8 = -22 / ((arg1 + 25) / 34);
        boolean var9 = false;
        if (this.field3454) {
            this.field3454 = false;
            for (int var10 = this.field3440 - 1; var10 >= 0; var10--) {
                boolean var11 = this.field3447[var10].method463(arg0, this.field3442);
                var9 |= var11;
                this.field3454 |= !var11;
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lb;Lb;B)I")
    public static final int method1458(class201 arg0, class201 arg1, byte arg2) {
        field3444++;
        if (arg2 != 50) {
            return 8;
        }
        int var3 = 0;
        if (arg1.method1230(81, class434.field6054)) {
            var3++;
        }
        if (arg1.method1230(100, class338.field4914)) {
            var3++;
        }
        if (arg1.method1230(arg2 ^ 0xFFFFFFEC, class70.field878)) {
            var3++;
        }
        if (arg0.method1230(-73, class434.field6054)) {
            var3++;
        }
        if (arg0.method1230(arg2 - 159, class338.field4914)) {
            var3++;
        }
        if (arg0.method1230(arg2 + 41, class70.field878)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public final void method1459(byte arg0) {
        field3459++;
        if (this.field3448 != null) {
            for (int var2 = 0; var2 < this.field3448.length; var2++) {
                this.field3448[var2].method470();
            }
        }
        this.field3453 = null;
        int var3 = 33 % ((arg0 - 81) / 32);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
    public static final void method1460() {
        for (int var0 = 0; var0 < class231.field3493; var0++) {
            class304 var1 = class293.field4249[var0];
            class363.method2244(var1);
            class293.field4249[var0] = null;
        }
        class231.field3493 = 0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static final void method1461(int arg0) {
        class232 var1 = class458.field6420;
        synchronized (class458.field6420) {
            if (arg0 >= -72) {
                return;
            }
            class458.field6420.method1478((byte) -95);
        }
        field3451++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([IB)Ljava/lang/String;")
    public static final String method1462(int[] arg0, byte arg1) {
        field3452++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class255.field3729;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class11 var6 = class177.field2544.method194(arg0[var4], 1);
            if (var6.field125 != -1) {
                class176 var7 = (class176) class489.field6886.method1479(0, (long) var6.field125);
                if (var7 == null) {
                    class72 var8 = class72.method423(class407.field5716, var6.field125, 0);
                    if (var8 != null) {
                        var7 = class141.field1878.method644(var8, true);
                        class489.field6886.method1473(var7, (long) var6.field125, 112);
                    }
                }
                if (var7 != null) {
                    class11.field120[var3] = var7;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        int var5 = 80 % ((-arg1 - 4) / 61);
        return var2.toString();
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public static void method1463(int arg0) {
        field3455 = null;
        field3449 = null;
        field3460 = null;
        if (arg0 != 1) {
            method1463(69);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILnp;IIIIIII)V")
    public final void method1464(int arg0, int arg1, class313 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg0 + arg9 & 0x3FFF;
        field3441++;
        if (this.field3458 == -1) {
            arg2.method650(arg3, arg5, arg7, arg1, arg6, 0);
        } else {
            class279 var12 = class250.field3693.method703(12095, this.field3458);
            if (this.field3453 == null && class250.field3693.method702(this.field3458, 124)) {
                int[] var13 = var12.field4097 ? class250.field3693.method705(this.field3456, 0.7F, false, this.field3456, this.field3458, -30470) : class250.field3693.method704(false, 0.7F, this.field3456, true, this.field3458, this.field3456);
                this.field3453 = arg2.method651(var13, 0, this.field3456, this.field3456, this.field3456);
            }
            if (!var12.field4097) {
                arg2.method650(arg3, arg5, arg7, arg1, arg6, 0);
            }
            if (this.field3453 != null) {
                int var14 = var12.field4097 ? 0 : 1;
                int var15 = arg1 * arg8 / -4096;
                int var16;
                for (var16 = (arg7 - arg1) / 2 + (arg1 * var11 / 4096); var16 > arg1; var16 -= arg1) {
                }
                while (arg1 < var15) {
                    var15 -= arg1;
                }
                while (var16 < 0) {
                    var16 += arg1;
                }
                while (var15 < 0) {
                    var15 += arg1;
                }
                for (int var17 = var16 - arg1; var17 < arg7; var17 += arg1) {
                    for (int var18 = var15 - arg1; var18 < arg1; var18 += arg1) {
                        this.field3453.method140(arg3 + var17, var18 - -arg5, arg1, arg1, 0, 0, var14);
                    }
                }
            }
        }
        if (arg4 <= 118) {
            method1458((class201) null, (class201) null, (byte) 3);
        }
        for (int var19 = this.field3440 - 1; var19 >= 0; var19--) {
            this.field3447[var19].method469(arg2, arg3, arg5, arg7, arg1, arg8, var11);
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I[Lfn;IIII)V")
    public class229(int arg0, class82[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3448 = arg1;
        this.field3450 = arg3;
        this.field3446 = arg5;
        this.field3443 = arg4;
        this.field3458 = arg0;
        if (arg1 == null) {
            this.field3442 = null;
            this.field3447 = null;
        } else {
            this.field3447 = new class82[arg1.length];
            this.field3442 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}

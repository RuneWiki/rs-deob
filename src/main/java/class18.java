import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class18 {

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "Lfda;")
    public class324 field232 = new class324();

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "Z")
    public static boolean field237 = false;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field241 = new Hashtable();

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
    public static int field243 = 0;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "Lfda;")
    private class324 field242;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)I", line = 7)
    public final int method135(int arg0) {
        field234++;
        int var2 = arg0;
        class324 var3 = this.field232.field4601;
        while (this.field232 != var3) {
            var3 = var3.field4601;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)Lfda;", line = 29)
    public final class324 method136(byte arg0) {
        field236++;
        class324 var2 = this.field232.field4601;
        if (this.field232 == var2) {
            this.field242 = null;
            return null;
        }
        this.field242 = var2.field4601;
        if (arg0 <= 111) {
            method141(true);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)Lfda;", line = 51)
    public final class324 method137(int arg0) {
        field238++;
        class324 var2 = this.field242;
        if (this.field232 == var2) {
            this.field242 = null;
            return null;
        }
        this.field242 = var2.field4601;
        if (arg0 > -123) {
            this.field232 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Ldh;IIILha;Lpda;)Z", line = 72)
    public static final boolean method138(class325 arg0, int arg1, int arg2, int arg3, class59 arg4, class630 arg5) {
        field239++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg0.field4625 != null) {
            var7 = (arg0.field4649 + arg5.field8396 - class744.field10362) * (class744.field10368 - class744.field10366) / (class744.field10363 - class744.field10362) + class744.field10366;
            var8 = class744.field10358 - ((arg0.field4607 + arg5.field8390 - class744.field10351) * (class744.field10358 - class744.field10372) / (class744.field10356 - class744.field10351));
            var6 = class744.field10366 + ((class744.field10368 - class744.field10366) * (arg0.field4640 + arg5.field8396 - class744.field10362) / (class744.field10363 - class744.field10362));
            var9 = class744.field10358 - ((class744.field10358 - class744.field10372) * (arg5.field8390 + arg0.field4641 - class744.field10351) / (class744.field10356 - class744.field10351));
        }
        if (arg3 != -1789756095) {
            field237 = false;
        }
        class133 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg0.field4615 != -1) {
            if (arg5.field8386 && arg0.field4628 != -1) {
                var10 = arg0.method1971(true, arg4, (byte) 72);
            } else {
                var10 = arg0.method1971(false, arg4, (byte) 72);
            }
            if (var10 != null) {
                var11 = arg5.field8389 - (var10.method1036() + 1 >> 1);
                var12 = arg5.field8389 + (var10.method1036() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var13 = arg5.field8393 - (var10.method1048() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var14 = arg5.field8393 + (var10.method1048() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class340 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg0.field4657 != null) {
            var15 = class164.method1183(arg0.field4634, 102);
            if (var15 != null) {
                var16 = class304.field4337.method3006(arg0.field4657, 174, null, class557.field7343, null);
                int var24 = arg5.field8393 - ((class744.field10358 - class744.field10372) * arg0.field4645 / (class744.field10356 - class744.field10351));
                var17 = arg5.field8389 + ((class744.field10368 - class744.field10366) * arg0.field4624 / (class744.field10363 - class744.field10362));
                if (var10 == null) {
                    var18 = var24 - var16 * var15.method2040() / 2;
                } else {
                    var18 = var24 - ((var10.method1048() >> 1) + (var15.method2041() * var16));
                }
                for (int var25 = 0; var25 < var16; var25++) {
                    String var26 = class557.field7343[var25];
                    if (var16 - 1 > var25) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method2042(var26);
                    if (var27 > var19) {
                        var19 = var27;
                    }
                }
                var20 = var17 + arg2 - (var19 / 2);
                if (var6 > var20) {
                    var6 = var20;
                }
                var21 = var19 / 2 + var17 + arg2;
                if (var7 < var21) {
                    var7 = var21;
                }
                var22 = arg1 + var18;
                var23 = var16 * var15.method2041() + var18 + arg1;
                if (var8 > var22) {
                    var8 = var22;
                }
                if (var9 < var23) {
                    var9 = var23;
                }
            }
        }
        if (class744.field10366 > var7 || class744.field10368 < var6 || class744.field10372 > var9 || var8 > class744.field10358) {
            return true;
        }
        class744.method4162(arg4, arg5, arg0);
        if (var10 != null) {
            if (class11.field181 > 0 && (class507.field6768 != -1 && class507.field6768 == arg5.field8387 || class208.field3086 != -1 && class208.field3086 == arg0.field4622)) {
                int var28;
                if (class440.field6076 <= 50) {
                    var28 = class440.field6076 * 2;
                } else {
                    var28 = 200 - class440.field6076 * 2;
                }
                int var29 = var28 << 24 | 0xFFFF00;
                arg4.method453(var29, arg5.field8393, var10.method1042() / 2 + 7, true, arg5.field8389);
                arg4.method453(var29, arg5.field8393, var10.method1042() / 2 + 5, true, arg5.field8389);
                arg4.method453(var29, arg5.field8393, var10.method1042() / 2 + 3, true, arg5.field8389);
                arg4.method453(var29, arg5.field8393, var10.method1042() / 2 + 1, true, arg5.field8389);
                arg4.method453(var29, arg5.field8393, var10.method1042() / 2, true, arg5.field8389);
            }
            var10.method1035(arg5.field8389 - (var10.method1036() >> 1), arg5.field8393 + -(var10.method1048() >> 1));
        }
        if (arg0.field4657 != null && var15 != null) {
            class140.method1071(var19, arg0, 9997, arg4, var17, arg5, var18, var16, var15);
        }
        if (arg0.field4615 != -1 || arg0.field4657 != null) {
            class621 var30 = new class621(arg5);
            var30.field8277 = var14;
            var30.field8281 = var23;
            var30.field8271 = var13;
            var30.field8272 = var22;
            var30.field8279 = var20;
            var30.field8270 = var11;
            var30.field8274 = var12;
            var30.field8278 = var21;
            class668.field9127.method11(var30, -95);
        }
        return false;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILfda;)V", line = 263)
    public final void method139(int arg0, class324 arg1) {
        if (arg1.field4603 != null) {
            arg1.method1961(-11364);
        }
        field235++;
        arg1.field4603 = this.field232.field4603;
        arg1.field4601 = this.field232;
        int var3 = 18 % ((30 - arg0) / 51);
        arg1.field4603.field4601 = arg1;
        arg1.field4601.field4603 = arg1;
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)V", line = 287)
    public final void method140(int arg0) {
        field233++;
        while (true) {
            class324 var2 = this.field232.field4601;
            if (this.field232 == var2) {
                if (arg0 == -10538) {
                    this.field242 = null;
                    return;
                } else {
                    return;
                }
            }
            var2.method1961(-11364);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)V", line = 310)
    public static void method141(boolean arg0) {
        if (!arg0) {
            field241 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "(I)Lrs;", line = 320)
    public static final class653 method142(int arg0) {
        field240++;
        if (class660.field8710 < class721.field10045.length) {
            return class721.field10045[class660.field8710++];
        } else {
            if (arg0 != -144254536) {
                field241 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V", line = 340)
    public class18() {
        this.field232.field4603 = this.field232;
        this.field232.field4601 = this.field232;
    }
}

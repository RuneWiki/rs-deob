import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class339 {

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    private int field4294;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "[Lrg;")
    private class644[] field4285;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "Lfia;")
    public static class577 field4290 = new class577(7, 0, 1, 1);

    @OriginalMember(owner = "client!on", name = "g", descriptor = "Lkg;")
    public static class275 field4291 = new class275(92, -2);

    @OriginalMember(owner = "client!on", name = "l", descriptor = "[B")
    public static byte[] field4296 = new byte[32896];

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "J")
    private long field4292;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "Lrg;")
    private class644 field4287;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field4296[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(JILrg;)V", line = 5)
    public final void method1947(long arg0, int arg1, class644 arg2) {
        if (arg1 != 23882) {
            this.field4287 = null;
        }
        field4289++;
        if (arg2.field8926 != null) {
            arg2.method3615(arg1 ^ 0x5D20);
        }
        class644 var5 = this.field4285[(int) ((long) (this.field4294 - 1) & arg0)];
        arg2.field8921 = var5;
        arg2.field8926 = var5.field8926;
        arg2.field8926.field8921 = arg2;
        arg2.field8921.field8926 = arg2;
        arg2.field8924 = arg0;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(JI)V", line = 29)
    public static final void method1948(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 != 0) {
            method1948(90L, -3);
        }
        field4288++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I[I)Ljava/lang/String;", line = 46)
    public static final String method1949(int arg0, int[] arg1) {
        field4293++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class448.field5938;
        int var4 = 0;
        if (arg0 >= -53) {
            return null;
        }
        while (arg1.length > var4) {
            class173 var5 = class639.field8832.method1501(arg1[var4], 35);
            if (var5.field2388 != -1) {
                class481 var6 = (class481) class736.field10231.method3079((long) var5.field2388, 0);
                if (var6 == null) {
                    class728 var7 = class728.method4059(class268.field3369, var5.field2388, 0);
                    if (var7 != null) {
                        var6 = class386.field4930.method508(var7, true);
                        class736.field10231.method3077((byte) -16, (long) var5.field2388, var6);
                    }
                }
                if (var6 != null) {
                    class120.field1751[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
            var4++;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V", line = 96)
    public static void method1950(byte arg0) {
        field4296 = null;
        field4290 = null;
        field4291 = null;
        if (arg0 != 114) {
            method1951(57, 36, -87, 107, 79, -20);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIII)V", line = 108)
    public static final void method1951(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4295++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg3 * arg3;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        if (arg0 != -2002199167) {
            field4290 = null;
        }
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg1 >= class546.field7619 && class760.field10606 >= arg1) {
            int var20 = class720.method4025(class667.field9373, arg3 + arg4, class225.field2994, 0);
            int var21 = class720.method4025(class667.field9373, arg4 - arg3, class225.field2994, arg0 + 2002199167);
            class636.method3569(var20, arg2, var21, 347845800, class432.field5765[arg1]);
        }
        int var22 = (arg5 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var17 += var16;
                var6++;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var22;
            var18 -= var15;
            var7--;
            var22 -= var15;
            int var23 = arg1 - var7;
            int var24 = arg1 + var7;
            if (class546.field7619 <= var24 && var23 <= class760.field10606) {
                int var25 = class720.method4025(class667.field9373, arg4 + var6, class225.field2994, arg0 ^ 0x88A8DD81);
                int var26 = class720.method4025(class667.field9373, arg4 - var6, class225.field2994, 0);
                if (var23 >= class546.field7619) {
                    class636.method3569(var25, arg2, var26, 347845800, class432.field5765[var23]);
                }
                if (class760.field10606 >= var24) {
                    class636.method3569(var25, arg2, var26, arg0 - 1944922329, class432.field5765[var24]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)Lrg;", line = 218)
    public final class644 method1952(int arg0) {
        field4297++;
        if (arg0 != -3) {
            this.field4287 = null;
        }
        if (this.field4287 == null) {
            return null;
        }
        class644 var2 = this.field4285[(int) (this.field4292 & (long) (this.field4294 - 1))];
        while (this.field4287 != var2) {
            if (this.field4287.field8924 == this.field4292) {
                class644 var3 = this.field4287;
                this.field4287 = this.field4287.field8921;
                return var3;
            }
            this.field4287 = this.field4287.field8921;
        }
        this.field4287 = null;
        return null;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(JI)Lrg;", line = 259)
    public final class644 method1953(long arg0, int arg1) {
        this.field4292 = arg0;
        field4286++;
        class644 var4 = this.field4285[(int) ((long) (this.field4294 - 1) & arg0)];
        for (this.field4287 = var4.field8921; this.field4287 != var4; this.field4287 = this.field4287.field8921) {
            if (this.field4287.field8924 == arg0) {
                class644 var5 = this.field4287;
                this.field4287 = this.field4287.field8921;
                return var5;
            }
        }
        this.field4287 = null;
        if (arg1 != -3462) {
            this.method1952(4);
        }
        return null;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(I)V", line = 293)
    public class339(int arg0) {
        this.field4294 = arg0;
        this.field4285 = new class644[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class644 var3 = this.field4285[var2] = new class644();
            var3.field8926 = var3;
            var3.field8921 = var3;
        }
    }
}

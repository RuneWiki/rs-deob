import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class357 extends class245 {

    @OriginalMember(owner = "client!du", name = "r", descriptor = "I")
    private int field5186;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    private int field5183;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    private int field5184;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "I")
    private int field5180;

    @OriginalMember(owner = "client!du", name = "x", descriptor = "[I")
    public static int[] field5192 = new int[5];

    @OriginalMember(owner = "client!du", name = "u", descriptor = "I")
    public static int field5189 = 0;

    @OriginalMember(owner = "client!du", name = "y", descriptor = "I")
    public static int field5193 = 0;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!du", name = "s", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!du", name = "t", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!du", name = "v", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!du", name = "w", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V", line = 6)
    public static final void method2231(int arg0) {
        ++field5181;
        if (!class132.field1780) {
            if (arg0 != 1) {
                field5182 = 123;
            }
            class132.field1780 = true;
            class504.field7168 = true;
            class724.field10112 += (12.0F - class724.field10112) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(I)V", line = 22)
    public static void method2232(int arg0) {
        field5192 = null;
        int var1 = -48 % ((26 - arg0) / 52);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(DB)V", line = 31)
    public static final void method2233(double arg0, byte arg1) {
        if (arg1 >= 47) {
            if (class332.field4771 != arg0) {
                for (int var3 = 0; var3 < 256; ++var3) {
                    int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                    class239.field3474[var3] = ~var4 >= -256 ? var4 : 255;
                }
                class332.field4771 = arg0;
            }
            ++field5190;
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIIII)V", line = 59)
    public class357(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field5186 = arg1;
        this.field5183 = arg2;
        this.field5184 = arg0;
        this.field5180 = arg3;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lvs;IIIII)V", line = 74)
    public static final void method2234(class593 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class409.field6165 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class34.field356) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class565.field8040 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class186 var14 = class80.field1136[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class582.field8287[var11].method1787(var12, 19646, var13) + class582.field8287[var11].method1787(var12 + 1, 19646, var13) + class582.field8287[var11].method1787(var12, 19646, var13 + 1) + class582.field8287[var11].method1787(var12 + 1, 19646, var13 + 1)) / 4 - (class582.field8287[arg1].method1787(arg2, 19646, arg3) + class582.field8287[arg1].method1787(arg2 + 1, 19646, arg3) + class582.field8287[arg1].method1787(arg2, 19646, arg3 + 1) + class582.field8287[arg1].method1787(arg2 + 1, 19646, arg3 + 1)) / 4;
                                    class12 var16 = var14.field2834;
                                    class12 var17 = var14.field2841;
                                    if (var16 != null && var16.method738((byte) 88)) {
                                        arg0.method737(8616, var16, var6, var15, class118.field1620, (var13 - arg3) * class504.field7164 + (1 - arg5) * class631.field8819, (var12 - arg2) * class504.field7164 + (1 - arg4) * class631.field8819);
                                    }
                                    if (var17 != null && var17.method738((byte) 88)) {
                                        arg0.method737(8616, var17, var6, var15, class118.field1620, (var13 - arg3) * class504.field7164 + (1 - arg5) * class631.field8819, (var12 - arg2) * class504.field7164 + (1 - arg4) * class631.field8819);
                                    }
                                    for (class754 var18 = var14.field2830; var18 != null; var18 = var18.field10537) {
                                        class119 var19 = var18.field10542;
                                        if (var19 != null && var19.method738((byte) 88) && (var19.field1628 == var12 || var7 == var12) && (var19.field1626 == var13 || var9 == var13)) {
                                            int var20 = var19.field1632 - var19.field1628 + 1;
                                            int var21 = var19.field1624 - var19.field1626 + 1;
                                            arg0.method737(8616, var19, var6, var15, class118.field1620, (var19.field1626 - arg3) * class504.field7164 + (var21 - arg5) * class631.field8819, (var19.field1628 - arg2) * class504.field7164 + (var20 - arg4) * class631.field8819);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var7;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "d", descriptor = "(I)Lgt;", line = 164)
    public static final class457 method2235(int arg0) {
        ++field5187;
        class457 var1 = (class457) class475.field6903.method1624(62);
        if (var1 != null) {
            --class505.field7181;
            return var1;
        } else {
            if (arg0 != 1) {
                method2235(-75);
            }
            return new class457();
        }
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(III)V", line = 185)
    public final void method159(int arg0, int arg1, int arg2) {
        ++field5188;
        int var4 = this.field5184 * arg1 >> 12;
        int var5 = this.field5183 * arg1 >> 12;
        int var6 = this.field5186 * arg2 >> 12;
        if (arg0 != 521) {
            this.method159(120, 49, 17);
        }
        int var7 = this.field5180 * arg2 >> 12;
        class4.method28(var7, super.field3574, var4, var5, var6, 1532682220);
    }

    @OriginalMember(owner = "client!du", name = "e", descriptor = "(III)V", line = 206)
    public final void method158(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field5182 = -25;
        }
        ++field5191;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(III)V", line = 216)
    public final void method161(int arg0, int arg1, int arg2) {
        ++field5185;
        int var4 = -9 % ((arg1 - -27) / 62);
    }
}

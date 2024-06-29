import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class96 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Lsb;")
    public static class221 field1532 = new class221(4);

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "[Lud;")
    public static class2[] field1534 = new class2[0];

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lp;")
    public static class280 field1537 = class18.method140((byte) -128, "weiss:");

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "[I")
    public static int[] field1535 = new int[4096];

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "[[B")
    public static byte[][] field1538;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method672(Component arg0, byte arg1) {
        field1531++;
        Method var2 = class198.field3476;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class182.field3192);
        arg0.addFocusListener(class182.field3192);
        if (arg1 != 17) {
            method675(-73, (class25) null);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIIIIBI)V")
    public static final void method673(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        field1533++;
        boolean var11;
        if (class108.field1787 > 0 && (class108.field1787 % 10) < 5) {
            var11 = true;
        } else {
            var11 = false;
        }
        int var12 = arg0 - arg1;
        int var13 = 983040 / arg4;
        int var14 = arg6 - arg8;
        int var15 = 983040 / arg2;
        for (int var16 = -var15; var16 < var14 + var15; var16++) {
            int var18 = arg2 * var16 + arg3 >> 16;
            int var19 = (var16 + 1) * arg2 + arg3 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var21 = arg5 + var18;
                int var10000 = arg5 + var19;
                int var23 = arg8 + var16 >> 6;
                if (var23 >= 0 && var23 <= (class280.field4944.length - 1)) {
                    int[][] var24 = class280.field4944[var23];
                    for (int var25 = -var13; var25 < (var12 + var13); var25++) {
                        int var26 = arg4 * var25 + arg7 >> 16;
                        int var27 = arg7 + ((var25 + 1) * arg4) >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            var10000 = arg10 + var27;
                            int var30 = arg10 + var26;
                            int var31 = var25 + arg1 >> 6;
                            if (var31 >= 0 && var31 <= (var24.length - 1) && var24[var31] != null) {
                                int var32 = ((arg1 + var25 & 0x3F) << 6) + (arg8 + var16 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class130 var34 = class32.method277((byte) -119, var33 - 1);
                                    if (!class101.field1647[var34.field2266]) {
                                        if (var11 && class73.field1194 == var34.field2266) {
                                            class68 var35 = new class68();
                                            var35.field1129 = var34.field2266;
                                            var35.field1123 = var30;
                                            var35.field1127 = var21;
                                            class37.field659.method649(var35, (byte) 87);
                                        } else {
                                            class136.field2403[var34.field2266].method758(var21 - 7, var30 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class68 var17 = (class68) class37.field659.method651(arg9 + 12801); var17 != null; var17 = (class68) class37.field659.method643(arg9 + 10951)) {
            class136.field2403[var17.field1129].method758(var17.field1127 - 7, var17.field1123 + -7);
            class151.method1055(var17.field1127, var17.field1123, 15, 16776960, 128);
            class151.method1055(var17.field1127, var17.field1123, 7, 16777215, 256);
        }
        if (arg9 != 115) {
            method673(45, 77, 123, -34, -95, 73, 99, 72, 49, (byte) 103, -81);
        }
        class37.field659.method639(82);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static void method674(byte arg0) {
        field1532 = null;
        field1534 = null;
        field1537 = null;
        field1538 = null;
        field1535 = null;
        if (arg0 < 51) {
            method674((byte) -77);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILlj;)Lbi;")
    public static final class92 method675(int arg0, class25 arg1) {
        field1536++;
        int var2 = 88 / ((-arg0 - 43) / 54);
        return new class92(arg1.method191(-100), arg1.method191(102), arg1.method191(91), arg1.method191(-109), arg1.method230(15046), arg1.method189((byte) -103));
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1535[var0] = class48.method355((byte) -127, var0);
        }
        field1538 = new byte[1000][];
    }
}

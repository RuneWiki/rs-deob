import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class398 {

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
    public int field5969;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "Z")
    public static boolean field5967 = false;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "Lnn;")
    public static class285 field5965 = new class285();

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "Lri;")
    public static class73 field5970 = new class73(102, 7);

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method2403(int arg0, int arg1, int arg2, int arg3) {
        class518 var4 = class108.field1553[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class522 var5 = var4.field7551;
        class522 var6 = var4.field7552;
        if (var5 != null) {
            var5.field7726 = var5.field7726 * arg3 / (0x10 << class192.field2815 - 7);
            var5.field7735 = var5.field7735 * arg3 / (0x10 << class192.field2815 - 7);
        }
        if (var6 != null) {
            var6.field7726 = var6.field7726 * arg3 / (0x10 << class192.field2815 - 7);
            var6.field7735 = var6.field7735 * arg3 / (0x10 << class192.field2815 - 7);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)I", line = 33)
    public final int method2404(byte arg0) {
        field5966++;
        return arg0 == 65 ? this.field5969 : 77;
    }

    @OriginalMember(owner = "client!cv", name = "toString", descriptor = "()Ljava/lang/String;", line = 44)
    public final String toString() {
        field5964++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lvg;IIILqa;)V", line = 52)
    public static final void method2405(class38 arg0, int arg1, int arg2, int arg3, class162 arg4) {
        if (arg1 != 25055) {
            method2405(null, -106, 99, -111, null);
        }
        field5968++;
        class381 var5 = arg0.method225(-1, arg4);
        if (var5 == null) {
            return;
        }
        arg4.method1098(arg2, arg3, arg0.field553 + arg2, arg0.field472 + arg3);
        if (class425.field6375 == 2 || class425.field6375 == 5 || class149.field2205 == null) {
            arg4.method1034(-16777216, var5, arg2, arg3);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class140.field2103 == 4) {
            var7 = class367.field5612;
            var6 = (int) (-class382.field5792) & 0x3FFF;
            var9 = 4096;
            var8 = class94.field1398;
        } else {
            var6 = (int) (-class382.field5792) + class289.field4132 & 0x3FFF;
            var7 = class500.field7365.field1769;
            var8 = class500.field7365.field1763;
            var9 = 4096 - (class410.field6171 * 16);
        }
        int var10 = var8 / 32 + 48 - ((class30.field323 - 104) * 2);
        int var11 = (class182.field2661 * 4) + 48 + 208 - (var7 / 32) - (class182.field2661 * 2);
        class149.field2205.method3127((float) arg0.field553 / 2.0F + (float) arg2, (float) arg0.field472 / 2.0F + (float) arg3, (float) var10, (float) var11, var9, var6 << 2, var5, arg2, arg3);
        for (class427 var12 = (class427) class133.field2042.method816(106); var12 != null; var12 = (class427) class133.field2042.method812(120)) {
            int var54 = var12.field6402;
            int var55 = ((class27.field284.field295[var54] & 0xFFFDB6C) >> 14) - class68.field1038;
            int var56 = (class27.field284.field295[var54] & 0x3FFF) - class24.field259;
            int var57 = var55 * 4 + (2 - var8 / 32);
            int var58 = var56 * 4 + 2 - var7 / 32;
            class138.method921(var58, arg3, var57, arg0, var5, -14117, arg2, class27.field284.field290[var54], arg4);
        }
        for (int var13 = 0; var13 < class405.field6118; var13++) {
            int var51 = class139.field2091[var13] * 4 + 2 - (var8 / 32);
            int var52 = class172.field2542[var13] * 4 + 2 - (var7 / 32);
            class519 var53 = class252.field3743.method2686(class154.field2279[var13], (byte) 117);
            if (var53.field7596 != null) {
                var53 = var53.method3067(class49.field796, -13012);
                if (var53 == null || var53.field7637 == -1) {
                    continue;
                }
            }
            class138.method921(var52, arg3, var51, arg0, var5, -14117, arg2, var53.field7637, arg4);
        }
        for (class84 var14 = (class84) class176.field2591.method2608(true); var14 != null; var14 = (class84) class176.field2591.method2603(104)) {
            int var48 = (int) (var14.field4736 >> 28 & 0x3L);
            if (class523.field7744 == var48) {
                int var49 = (int) (var14.field4736 & 0x3FFFL) * 4 + 2 - (var8 / 32);
                int var50 = (int) (var14.field4736 >> 14 & 0x3FFFL) * 4 + 2 - var7 / 32;
                class496.method2975((byte) -26, var5, var49, arg3, var50, arg2, arg0, class115.field1730[0]);
            }
        }
        for (int var15 = 0; var15 < class402.field6044; var15++) {
            class167 var44 = class193.field2821[class378.field5766[var15]];
            if (var44 != null && var44.method1158(-1) && class500.field7365.field1768 == var44.field1768) {
                class342 var45 = var44.field2472;
                if (var45 != null && var45.field4938 != null) {
                    var45 = var45.method2094(-122, class49.field796);
                }
                if (var45 != null && var45.field4909 && var45.field4927) {
                    int var46 = var44.field1763 / 32 - var8 / 32;
                    int var47 = var44.field1769 / 32 - var7 / 32;
                    if (var45.field4867 == -1) {
                        class496.method2975((byte) -26, var5, var46, arg3, var47, arg2, arg0, class115.field1730[1]);
                    } else {
                        class138.method921(var47, arg3, var46, arg0, var5, -14117, arg2, var45.field4867, arg4);
                    }
                }
            }
        }
        int var16 = class74.field1105;
        int[] var17 = class272.field3948;
        for (int var18 = 0; var18 < var16; var18++) {
            class239 var36 = class44.field707[var17[var18]];
            if (var36 != null && var36.method1618(-1) && class500.field7365 != var36 && class500.field7365.field1768 == var36.field1768) {
                int var37 = var36.field1763 / 32 - (var8 / 32);
                int var38 = var36.field1769 / 32 - (var7 / 32);
                boolean var39 = false;
                for (int var40 = 0; var40 < class315.field4496; var40++) {
                    if (var36.field3548.equals(class474.field6980[var40]) && class85.field1296[var40] != 0) {
                        var39 = true;
                        break;
                    }
                }
                boolean var41 = false;
                for (int var42 = 0; var42 < class44.field690; var42++) {
                    if (var36.field3548.equals(class18.field194[var42].field2497)) {
                        var41 = true;
                        break;
                    }
                }
                boolean var43 = false;
                if (class500.field7365.field3518 != 0 && var36.field3518 != 0 && class500.field7365.field3518 == var36.field3518) {
                    var43 = true;
                }
                if (var36.field3525) {
                    class496.method2975((byte) -26, var5, var37, arg3, var38, arg2, arg0, class115.field1730[6]);
                } else if (var39) {
                    class496.method2975((byte) -26, var5, var37, arg3, var38, arg2, arg0, class115.field1730[3]);
                } else if (var41) {
                    class496.method2975((byte) -26, var5, var37, arg3, var38, arg2, arg0, class115.field1730[5]);
                } else if (var43) {
                    class496.method2975((byte) -26, var5, var37, arg3, var38, arg2, arg0, class115.field1730[4]);
                } else {
                    class496.method2975((byte) -26, var5, var37, arg3, var38, arg2, arg0, class115.field1730[2]);
                }
            }
        }
        class308[] var19 = class409.field6169;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class308 var23 = var19[var20];
            if (var23 != null && var23.field4436 != 0 && class317.field4559 % 20 < 10) {
                if (var23.field4436 == 1 && var23.field4443 >= 0 && var23.field4443 < class193.field2821.length) {
                    class167 var24 = class193.field2821[var23.field4443];
                    if (var24 != null) {
                        int var25 = var24.field1763 / 32 - (var8 / 32);
                        int var26 = var24.field1769 / 32 - (var7 / 32);
                        class229.method1568(var5, arg3, 360000L, var25, arg2, arg0, 48, var23.field4434, var26);
                    }
                }
                if (var23.field4436 == 2) {
                    int var27 = var23.field4424 / 32 - (var8 / 32);
                    int var28 = var23.field4431 / 32 - (var7 / 32);
                    long var29 = (long) (var23.field4427 << 5);
                    long var31 = var29 * var29;
                    class229.method1568(var5, arg3, var31, var27, arg2, arg0, 110, var23.field4434, var28);
                }
                if (var23.field4436 == 10 && var23.field4443 >= 0 && var23.field4443 < class44.field707.length) {
                    class239 var33 = class44.field707[var23.field4443];
                    if (var33 != null) {
                        int var34 = var33.field1763 / 32 - (var8 / 32);
                        int var35 = var33.field1769 / 32 - (var7 / 32);
                        class229.method1568(var5, arg3, 360000L, var34, arg2, arg0, 111, var23.field4434, var35);
                    }
                }
            }
        }
        if (class140.field2103 == 4) {
            return;
        }
        if (class401.field6030 != 0) {
            int var21 = class401.field6030 * 4 + 2 - (var8 / 32) - (-(class500.field7365.method847(-1) * 2) + 2);
            int var22 = class523.field7749 * 4 + class500.field7365.method847(-1) * 2 + 2 - (var7 / 32) - 2;
            class496.method2975((byte) -26, var5, var21, arg3, var22, arg2, arg0, class451.field6710[class255.field3778 ? 1 : 0]);
        }
        arg4.method1087(arg0.field472 / 2 + arg3 - 1, arg0.field553 / 2 + -1 + arg2, arg1 ^ 0x61A8, 3, -1, 3);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V", line = 358)
    public static void method2406(int arg0) {
        field5965 = null;
        if (arg0 != 48) {
            method2406(72);
        }
        field5970 = null;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 373)
    public class398(String arg0, int arg1) {
        this.field5969 = arg1;
    }
}

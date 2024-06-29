import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class585 extends class578 {

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "Ljf;")
    public class198 field8246;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    public static int field8245;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
    public static int field8247;

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Ljf;)V", line = 7)
    public class585(class198 arg0) {
        this.field8246 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII)V", line = 16)
    public static final void method3330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8244++;
        class409.method2386(arg1, (byte) 102);
        int var7 = 0;
        int var8 = arg1 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg5 >= class469.field6466 && arg5 <= class533.field7200) {
            int[] var14 = class344.field4599[arg5];
            int var15 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg3 - arg1);
            int var16 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg1 + arg3);
            int var17 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg3 - var8);
            int var18 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg3 + var8);
            class470.method2660(var15, var17, var14, (byte) 11, arg6);
            class470.method2660(var17, var18, var14, (byte) 11, arg2);
            class470.method2660(var18, var16, var14, (byte) 11, arg6);
        }
        int var19 = arg4;
        while (var7 < var9) {
            var19 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class95.field1336[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg5 - var9;
                int var21 = arg5 + var9;
                if (var21 >= class469.field6466 && class533.field7200 >= var20) {
                    if (var8 <= var9) {
                        int var22 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg3 + var7);
                        int var23 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg3 - var7);
                        if (class533.field7200 >= var21) {
                            class470.method2660(var23, var22, class344.field4599[var21], (byte) 11, arg6);
                        }
                        if (class469.field6466 <= var20) {
                            class470.method2660(var23, var22, class344.field4599[var20], (byte) 11, arg6);
                        }
                    } else {
                        int var24 = class95.field1336[var9];
                        int var25 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg3 + var7);
                        int var26 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg3 - var7);
                        int var27 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg3 + var24);
                        int var28 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg3 - var24);
                        if (class533.field7200 >= var21) {
                            int[] var29 = class344.field4599[var21];
                            class470.method2660(var26, var28, var29, (byte) 11, arg6);
                            class470.method2660(var28, var27, var29, (byte) 11, arg2);
                            class470.method2660(var27, var25, var29, (byte) 11, arg6);
                        }
                        if (class469.field6466 <= var20) {
                            int[] var30 = class344.field4599[var20];
                            class470.method2660(var26, var28, var30, (byte) 11, arg6);
                            class470.method2660(var28, var27, var30, (byte) 11, arg2);
                            class470.method2660(var27, var25, var30, (byte) 11, arg6);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (var32 >= class469.field6466 && var31 <= class533.field7200) {
                int var33 = arg3 + var9;
                int var34 = arg3 - var9;
                if (class128.field1831 <= var33 && class529.field7169 >= var34) {
                    int var35 = class280.method1727((byte) 94, class529.field7169, class128.field1831, var33);
                    int var36 = class280.method1727((byte) 94, class529.field7169, class128.field1831, var34);
                    if (var8 <= var7) {
                        if (class533.field7200 >= var32) {
                            class470.method2660(var36, var35, class344.field4599[var32], (byte) 11, arg6);
                        }
                        if (class469.field6466 <= var31) {
                            class470.method2660(var36, var35, class344.field4599[var31], (byte) 11, arg6);
                        }
                    } else {
                        int var37 = var11 >= var7 ? var11 : class95.field1336[var7];
                        int var38 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg3 + var37);
                        int var39 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg3 - var37);
                        if (class533.field7200 >= var32) {
                            int[] var40 = class344.field4599[var32];
                            class470.method2660(var36, var39, var40, (byte) 11, arg6);
                            class470.method2660(var39, var38, var40, (byte) 11, arg2);
                            class470.method2660(var38, var35, var40, (byte) 11, arg6);
                        }
                        if (class469.field6466 <= var31) {
                            int[] var41 = class344.field4599[var31];
                            class470.method2660(var36, var39, var41, (byte) 11, arg6);
                            class470.method2660(var39, var38, var41, (byte) 11, arg2);
                            class470.method2660(var38, var35, var41, (byte) 11, arg6);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V", line = 197)
    public static final void method3331(byte arg0) {
        field8245++;
        if (class618.field8608 != null) {
            class618.field8608.method265((byte) -127);
        }
        if (class308.field4258 != null) {
            while (true) {
                try {
                    class308.field4258.join();
                    break;
                } catch (InterruptedException var1) {
                }
            }
        }
        if (arg0 != -15) {
            method3332(3, true, null, 59);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZLjava/lang/String;I)I", line = 226)
    public static final int method3332(int arg0, boolean arg1, String arg2, int arg3) {
        field8247++;
        if (arg3 > arg0 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg0) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if ((var10 / arg0) != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }
}

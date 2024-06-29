import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class310 extends class60 {

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public static int field4900 = 0;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field4897 = 0;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public int field4904;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public int field4907;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "Lpm;")
    public static class111 field4906;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "[I")
    public int[] field4896;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "[I")
    public int[] field4902;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "[I")
    public int[] field4908;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "[Lub;")
    public class23[] field4905;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "[Lub;")
    public class23[] field4909;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "[[[B")
    public byte[][][] field4903;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V", line = 5)
    public static final void method2188(byte arg0) {
        field4911++;
        class174.field2777.method2283((byte) 77);
        class77.field1196.method2283((byte) 77);
        if (arg0 != 99) {
            method2189(71, 114, 97, -78, 5, -115, 125);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIII)V", line = 20)
    public static final void method2189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class197.method1394(arg5, arg4 - 1438);
        int var7 = 0;
        field4910++;
        int var8 = arg5;
        int var9 = -arg5;
        int var10 = arg5 - arg2;
        int var11 = -1;
        if (var10 < 0) {
            var10 = 0;
        }
        if (class104.field1719 <= arg3 && class333.field5188 >= arg3) {
            int[] var12 = class221.field3443[arg3];
            int var13 = class10.method151(class180.field2862, arg0 - arg5, 114, field4897);
            int var14 = class10.method151(class180.field2862, arg0 + arg5, arg4 + -1313, field4897);
            int var15 = class10.method151(class180.field2862, arg0 - var10, 111, field4897);
            int var16 = class10.method151(class180.field2862, arg0 + var10, arg4 ^ 0x5EC, field4897);
            class323.method2273(var13, arg6, var12, var15, 93);
            class323.method2273(var15, arg1, var12, var16, arg4 ^ 0x5EE);
            class323.method2273(var16, arg6, var12, var14, 51);
        }
        int var17 = -1;
        int var18 = var10;
        int var19 = -var10;
        while (var7 < var8) {
            var11 += 2;
            var19 += var11;
            if (var19 >= 0 && var18 >= 1) {
                var18--;
                var19 -= var18 << 1;
                class79.field1238[var18] = var7;
            }
            var7++;
            var17 += 2;
            var9 += var17;
            if (var9 >= 0) {
                var8--;
                int var20 = arg3 - var8;
                int var21 = arg3 + var8;
                if (var21 >= class104.field1719 && var20 <= class333.field5188) {
                    if (var10 > var8) {
                        int var22 = class79.field1238[var8];
                        int var23 = class10.method151(class180.field2862, arg0 + var7, arg4 ^ 0x5E7, field4897);
                        int var24 = class10.method151(class180.field2862, arg0 - var7, 124, field4897);
                        int var25 = class10.method151(class180.field2862, arg0 + var22, arg4 ^ 0x5EE, field4897);
                        int var26 = class10.method151(class180.field2862, arg0 - var22, 126, field4897);
                        if (var21 <= class333.field5188) {
                            int[] var27 = class221.field3443[var21];
                            class323.method2273(var24, arg6, var27, var26, arg4 ^ 0x5BD);
                            class323.method2273(var26, arg1, var27, var25, 80);
                            class323.method2273(var25, arg6, var27, var23, 127);
                        }
                        if (var20 >= class104.field1719) {
                            int[] var28 = class221.field3443[var20];
                            class323.method2273(var24, arg6, var28, var26, arg4 ^ 0x5E8);
                            class323.method2273(var26, arg1, var28, var25, 61);
                            class323.method2273(var25, arg6, var28, var23, arg4 - 1390);
                        }
                    } else {
                        int var29 = class10.method151(class180.field2862, arg0 + var7, 113, field4897);
                        int var30 = class10.method151(class180.field2862, arg0 - var7, 116, field4897);
                        if (var21 <= class333.field5188) {
                            class323.method2273(var30, arg6, class221.field3443[var21], var29, 112);
                        }
                        if (class104.field1719 <= var20) {
                            class323.method2273(var30, arg6, class221.field3443[var20], var29, 112);
                        }
                    }
                }
                var9 -= var8 << 1;
            }
            int var31 = arg3 - var7;
            int var32 = arg3 + var7;
            if (class104.field1719 <= var32 && var31 <= class333.field5188) {
                int var33 = arg0 + var8;
                int var34 = arg0 - var8;
                if (field4897 <= var33 && class180.field2862 >= var34) {
                    int var35 = class10.method151(class180.field2862, var33, 121, field4897);
                    int var36 = class10.method151(class180.field2862, var34, 124, field4897);
                    if (var10 <= var7) {
                        if (var32 <= class333.field5188) {
                            class323.method2273(var36, arg6, class221.field3443[var32], var35, 37);
                        }
                        if (var31 >= class104.field1719) {
                            class323.method2273(var36, arg6, class221.field3443[var31], var35, 123);
                        }
                    } else {
                        int var37 = var7 <= var18 ? var18 : class79.field1238[var7];
                        int var38 = class10.method151(class180.field2862, arg0 + var37, 120, field4897);
                        int var39 = class10.method151(class180.field2862, arg0 - var37, 116, field4897);
                        if (var32 <= class333.field5188) {
                            int[] var40 = class221.field3443[var32];
                            class323.method2273(var36, arg6, var40, var39, 87);
                            class323.method2273(var39, arg1, var40, var38, 94);
                            class323.method2273(var38, arg6, var40, var35, 100);
                        }
                        if (var31 >= class104.field1719) {
                            int[] var41 = class221.field3443[var31];
                            class323.method2273(var36, arg6, var41, var39, 80);
                            class323.method2273(var39, arg1, var41, var38, 34);
                            class323.method2273(var38, arg6, var41, var35, arg4 - 1374);
                        }
                    }
                }
            }
        }
        if (arg4 != 1438) {
            method2188((byte) -82);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 212)
    public static void method2190(int arg0) {
        field4906 = null;
        if (arg0 != -1) {
            method2188((byte) 20);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Lvm;", line = 223)
    public static final class84 method2191(int arg0, int arg1) {
        field4898++;
        class84 var2 = (class84) class145.field2348.method2288((long) arg0, (byte) 122);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class178.field2831.method967(class340.method2360(arg0, -8449), class14.method185(127, arg0), 65280);
        class84 var4 = new class84();
        var4.field1361 = arg0;
        if (var3 != null) {
            var4.method668(new class1(var3), 31370);
        }
        var4.method660(128);
        if (arg1 <= 54) {
            field4900 = -47;
        }
        class145.field2348.method2281(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V", line = 252)
    public static final void method2192(int arg0) {
        field4899++;
        int var1 = class142.field2301;
        int var2 = class294.field4625 - class338.field5219 - var1;
        if (arg0 > -69) {
            field4906 = (class111) null;
        }
        int var3 = class299.field4789;
        int var4 = class1.field46 - class211.field3314 - var3;
        if (var3 <= 0 && var4 <= 0 && var1 <= 0 && var2 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class244.field3646 != null) {
                var5 = class244.field3646;
            } else if (class139.field2247 == null) {
                var5 = class92.field1484.field1037;
            } else {
                var5 = class139.field2247;
            }
            int var6 = 0;
            int var7 = 0;
            if (class139.field2247 == var5) {
                Insets var8 = class139.field2247.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var3 > 0) {
                var9.fillRect(var6, var7, var3, class294.field4625);
            }
            if (var1 > 0) {
                var9.fillRect(var6, var7, class1.field46, var1);
            }
            if (var4 > 0) {
                var9.fillRect(class1.field46 + var6 - var4, var7, var4, class294.field4625);
            }
            if (var2 > 0) {
                var9.fillRect(var6, class294.field4625 + var7 - var2, class1.field46, var2);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIBII)I", line = 319)
    public static final int method2193(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4912++;
        int var5 = arg0 & 0xF;
        if (arg2 < 117) {
            return -74;
        } else {
            int var6 = var5 < 4 ? arg1 : (var5 == 12 || var5 == 14 ? arg4 : arg3);
            int var7 = var5 >= 8 ? arg1 : arg4;
            return ((var5 & 0x1) == 0 ? var7 : -var7) + ((var5 & 0x2) == 0 ? var6 : -var6);
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)I", line = 338)
    public static final int method2194(int arg0, int arg1) {
        if (arg1 >= -32) {
            field4897 = -100;
        }
        field4901++;
        return (arg0 & 0x3F840) >> 11;
    }
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class290 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Lui;")
    public static class98 field4817 = new class98(64);

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field4818 = 0;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field4819 = -1;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)[B", line = 5)
    public static final byte[] method2052(int arg0, byte arg1) {
        class47 var2 = (class47) class258.field4074.method1539(-74, (long) arg0);
        if (arg1 != 126) {
            return (byte[]) null;
        }
        field4815++;
        if (var2 == null) {
            Random var3 = new Random((long) arg0);
            byte[] var4 = new byte[512];
            for (int var5 = 0; var5 < 255; var5++) {
                var4[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class4.method33(false, var3, var7);
                byte var9 = var4[var8];
                var4[var8] = var4[var7];
                var4[var7] = var4[511 - var6] = var9;
            }
            var2 = new class47(var4);
            class258.field4074.method1538(-91, (long) arg0, var2);
        }
        return var2.field684;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Lrf;", line = 54)
    public static final class40 method2053(int arg0, int arg1) {
        field4816++;
        class40 var2 = (class40) class143.field2302.method652((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        if (arg1 < 9) {
            method2057(-24, 39, -87);
        }
        byte[] var3 = class287.field4706.method1504(arg0, true, 29);
        class40 var4 = new class40();
        if (var3 != null) {
            var4.method320(358, new class313(var3), arg0);
        }
        class143.field2302.method642(var4, (long) arg0, -101);
        return var4;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lpb;IIIIIIZ)V", line = 80)
    public static final void method2054(class316 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field5206.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field5206[var9] - class244.field3847;
            int var11 = arg0.field5209[var9] - class65.field959;
            int var12 = arg0.field5211[var9] - class228.field3584;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field5220 != null) {
                class316.field5221[var9] = var13;
                class316.field5212[var9] = var16;
                class316.field5205[var9] = var17;
            }
            class316.field5210[var9] = (var13 << 9) / var17 + class272.field4466;
            class316.field5225[var9] = (var16 << 9) / var17 + class272.field4481;
        }
        class272.field4477 = 0;
        int var19 = arg0.field5208.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field5208[var20];
            int var22 = arg0.field5213[var20];
            int var23 = arg0.field5226[var20];
            int var24 = class316.field5210[var21];
            int var25 = class316.field5210[var22];
            int var26 = class316.field5210[var23];
            int var27 = class316.field5225[var21];
            int var28 = class316.field5225[var22];
            int var29 = class316.field5225[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class146.field2361 && class203.method1388(class272.field4466 + class213.field3235, class272.field4481 + class109.field1611, var27, var28, var29, var24, var25, var26)) {
                    class196.field3019 = arg5;
                    class196.field3009 = arg6;
                }
                if (!class245.field3886 && !arg7) {
                    class272.field4469 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class272.field4476 || var25 > class272.field4476 || var26 > class272.field4476) {
                        class272.field4469 = true;
                    }
                    if (arg0.field5220 == null || arg0.field5220[var20] == -1) {
                        if (arg0.field5222[var20] != 12345678) {
                            class272.method1925(var27, var28, var29, var24, var25, var26, arg0.field5222[var20], arg0.field5224[var20], arg0.field5214[var20]);
                        }
                    } else if (!class121.field1814) {
                        int var30 = class272.field4467.method405(arg0.field5220[var20], -8237);
                        class272.method1925(var27, var28, var29, var24, var25, var26, class148.method1051(var30, arg0.field5222[var20]), class148.method1051(var30, arg0.field5224[var20]), class148.method1051(var30, arg0.field5214[var20]));
                    } else if (arg0.field5215) {
                        class272.method1913(var27, var28, var29, var24, var25, var26, arg0.field5222[var20], arg0.field5224[var20], arg0.field5214[var20], class316.field5221[0], class316.field5221[1], class316.field5221[3], class316.field5212[0], class316.field5212[1], class316.field5212[3], class316.field5205[0], class316.field5205[1], class316.field5205[3], arg0.field5220[var20]);
                    } else {
                        class272.method1913(var27, var28, var29, var24, var25, var26, arg0.field5222[var20], arg0.field5224[var20], arg0.field5214[var20], class316.field5221[var21], class316.field5221[var22], class316.field5221[var23], class316.field5212[var21], class316.field5212[var22], class316.field5212[var23], class316.field5205[var21], class316.field5205[var22], class316.field5205[var23], arg0.field5220[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V", line = 195)
    public static void method2055(byte arg0) {
        if (arg0 == -73) {
            field4817 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)I", line = 206)
    public static final int method2056(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > -24) {
            method2057(-47, 70, -43);
        }
        field4814++;
        int var4 = arg1 / arg0;
        int var5 = arg1 & arg0 - 1;
        int var6 = arg0 - 1 & arg2;
        int var7 = arg2 / arg0;
        int var8 = class170.method1174(false, var7, var4);
        int var9 = class170.method1174(false, var7, var4 + 1);
        int var10 = class170.method1174(false, var7 + 1, var4);
        int var11 = class170.method1174(false, var7 + 1, var4 - -1);
        int var12 = class109.method715(var5, var9, var8, 122, arg0);
        int var13 = class109.method715(var5, var11, var10, -25, arg0);
        return class109.method715(var6, var13, var12, 121, arg0);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V", line = 236)
    public static final void method2057(int arg0, int arg1, int arg2) {
        class146.field2361 = true;
        class41.field623 = arg0;
        class213.field3235 = arg1;
        class109.field1611 = arg2;
        class196.field3019 = -1;
        class196.field3009 = -1;
    }
}

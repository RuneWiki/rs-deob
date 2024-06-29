import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public abstract class class448 {

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BLgr;Lnha;)Ldk;", line = 3)
    public static final class88 method2741(byte arg0, class530 arg1, class684 arg2) {
        field6423++;
        class88 var3 = class482.method2938(67783);
        if (arg0 <= 26) {
            return null;
        }
        var3.field1258 = arg1;
        var3.field1257 = arg1.field7716;
        if (var3.field1257 == -1) {
            var3.field1260 = new class168(260);
        } else if (var3.field1257 == -2) {
            var3.field1260 = new class168(10000);
        } else if (var3.field1257 <= 18) {
            var3.field1260 = new class168(20);
        } else if (var3.field1257 > 98) {
            var3.field1260 = new class168(260);
        } else {
            var3.field1260 = new class168(100);
        }
        var3.field1260.method1204(arg2, 61419942);
        var3.field1260.method1200(var3.field1258.method3217(98), -22676);
        var3.field1259 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V", line = 40)
    public static final void method2742(int arg0) {
        field6421++;
        int var1 = 0;
        for (int var2 = arg0; var2 < class184.field2546; var2++) {
            for (int var3 = 0; var3 < class240.field3555; var3++) {
                if (class716.method4025(class565.field8185, var2, true, var3, var1, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILsia;BLha;)V", line = 74)
    public static final void method2743(int arg0, class151 arg1, byte arg2, class543 arg3) {
        field6422++;
        if (class140.field1911 != null && arg0 <= arg1.field2199) {
            for (int var4 = 0; var4 < class140.field1911.length; var4++) {
                if (class140.field1911[var4] != -1000000 && (arg1.field2207[0] <= class140.field1911[var4] || arg1.field2207[1] <= class140.field1911[var4] || arg1.field2207[2] <= class140.field1911[var4] || class140.field1911[var4] >= arg1.field2207[3]) && (arg1.field2206[0] <= class126.field1747[var4] || class126.field1747[var4] >= arg1.field2206[1] || arg1.field2206[2] <= class126.field1747[var4] || arg1.field2206[3] <= class126.field1747[var4]) && (arg1.field2206[0] >= class224.field3309[var4] || class224.field3309[var4] <= arg1.field2206[1] || arg1.field2206[2] >= class224.field3309[var4] || class224.field3309[var4] <= arg1.field2206[3]) && (arg1.field2203[0] <= class398.field5699[var4] || class398.field5699[var4] >= arg1.field2203[1] || arg1.field2203[2] <= class398.field5699[var4] || arg1.field2203[3] <= class398.field5699[var4]) && (class674.field9595[var4] <= arg1.field2203[0] || class674.field9595[var4] <= arg1.field2203[1] || class674.field9595[var4] <= arg1.field2203[2] || class674.field9595[var4] <= arg1.field2203[3])) {
                    return;
                }
            }
        }
        int var5 = 60 / ((arg2 + 31) / 56);
        if (arg1.field2197 == 1) {
            int var6 = arg1.field2200 - (class613.field8757 - class430.field6190);
            if (var6 >= 0 && var6 <= class430.field6190 + class430.field6190) {
                int var7 = class430.field6190 + arg1.field2205 - class140.field1915;
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > (class430.field6190 + class430.field6190)) {
                    return;
                }
                int var8 = arg1.field2208 + class430.field6190 - class140.field1915;
                if (var8 > (class430.field6190 + class430.field6190)) {
                    var8 = class430.field6190 + class430.field6190;
                } else if (var8 < 0) {
                    return;
                }
                boolean var9 = false;
                while (var8 >= var7) {
                    if (class437.field6237[var6][var7++]) {
                        var9 = true;
                        break;
                    }
                }
                if (var9) {
                    float var10 = (float) (class647.field9329 - arg1.field2206[0]);
                    if (var10 < 0.0F) {
                        var10 *= -1.0F;
                    }
                    if (!((float) class15.field156 > var10) && class500.method3037(0, (byte) -112, arg1) && class500.method3037(1, (byte) -117, arg1) && class500.method3037(2, (byte) -114, arg1) && class500.method3037(3, (byte) -128, arg1)) {
                        class755.field10518[class618.field8798++] = arg1;
                    }
                }
            }
        } else if (arg1.field2197 == 2) {
            int var11 = class430.field6190 + arg1.field2205 - class140.field1915;
            if (var11 >= 0 && class430.field6190 + class430.field6190 >= var11) {
                int var12 = arg1.field2200 + class430.field6190 - class613.field8757;
                if (var12 < 0) {
                    var12 = 0;
                } else if (class430.field6190 + class430.field6190 < var12) {
                    return;
                }
                int var13 = class430.field6190 + arg1.field2202 - class613.field8757;
                if (var13 > (class430.field6190 + class430.field6190)) {
                    var13 = class430.field6190 + class430.field6190;
                } else if (var13 < 0) {
                    return;
                }
                boolean var14 = false;
                while (var12 <= var13) {
                    if (class437.field6237[var12++][var11]) {
                        var14 = true;
                        break;
                    }
                }
                if (var14) {
                    float var15 = (float) (class692.field9807 - arg1.field2203[0]);
                    if (var15 < 0.0F) {
                        var15 *= -1.0F;
                    }
                    if (!((float) class15.field156 > var15) && class500.method3037(0, (byte) -127, arg1) && class500.method3037(1, (byte) -125, arg1) && class500.method3037(2, (byte) -125, arg1) && class500.method3037(3, (byte) -128, arg1)) {
                        class755.field10518[class618.field8798++] = arg1;
                    }
                }
            }
        } else if (arg1.field2197 == 16 || arg1.field2197 == 8) {
            int var24 = class430.field6190 + arg1.field2200 - class613.field8757;
            if (var24 >= 0 && var24 <= (class430.field6190 + class430.field6190)) {
                int var25 = class430.field6190 + arg1.field2205 - class140.field1915;
                if (var25 >= 0 && var25 <= class430.field6190 + class430.field6190 && class437.field6237[var24][var25]) {
                    float var26 = (float) (class647.field9329 - arg1.field2206[0]);
                    if (var26 < 0.0F) {
                        var26 *= -1.0F;
                    }
                    float var27 = (float) (class692.field9807 - arg1.field2203[0]);
                    if (var27 < 0.0F) {
                        var27 *= -1.0F;
                    }
                    if (!(var26 < (float) class15.field156) || !((float) class15.field156 > var27) && class500.method3037(0, (byte) -125, arg1) && class500.method3037(1, (byte) -127, arg1) && class500.method3037(2, (byte) -118, arg1) && class500.method3037(3, (byte) -127, arg1)) {
                        class755.field10518[class618.field8798++] = arg1;
                    }
                }
            }
        } else if (arg1.field2197 == 4) {
            float var16 = (float) (arg1.field2207[0] - class271.field3847);
            if (!((float) class367.field5373 >= var16)) {
                int var17 = class430.field6190 + arg1.field2205 - class140.field1915;
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > (class430.field6190 + class430.field6190)) {
                    return;
                }
                int var18 = arg1.field2208 + class430.field6190 - class140.field1915;
                if (var18 > (class430.field6190 + class430.field6190)) {
                    var18 = class430.field6190 + class430.field6190;
                } else if (var18 < 0) {
                    return;
                }
                int var19 = arg1.field2200 + class430.field6190 - class613.field8757;
                if (var19 < 0) {
                    var19 = 0;
                } else if (var19 > (class430.field6190 + class430.field6190)) {
                    return;
                }
                int var20 = class430.field6190 + arg1.field2202 - class613.field8757;
                if (var20 > class430.field6190 + class430.field6190) {
                    var20 = class430.field6190 + class430.field6190;
                } else if (var20 < 0) {
                    return;
                }
                boolean var21 = false;
                label292: for (int var22 = var19; var22 <= var20; var22++) {
                    for (int var23 = var17; var23 <= var18; var23++) {
                        if (class437.field6237[var22][var23]) {
                            var21 = true;
                            break label292;
                        }
                    }
                }
                if (var21 && class500.method3037(0, (byte) -114, arg1) && class500.method3037(1, (byte) -115, arg1) && class500.method3037(2, (byte) -112, arg1) && class500.method3037(3, (byte) -118, arg1)) {
                    class755.field10518[class618.field8798++] = arg1;
                }
            }
        }
    }
}

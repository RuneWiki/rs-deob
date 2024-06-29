import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class293 extends class172 {

    @OriginalMember(owner = "client!co", name = "u", descriptor = "I")
    public int field4552;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public int field4545;

    @OriginalMember(owner = "client!co", name = "s", descriptor = "[Z")
    public boolean[] field4550;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "[[I")
    public int[][] field4556;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "[I")
    public int[] field4546;

    @OriginalMember(owner = "client!co", name = "A", descriptor = "[I")
    public int[] field4558;

    @OriginalMember(owner = "client!co", name = "x", descriptor = "Z")
    public static boolean field4555 = false;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "[I")
    public static int[] field4549 = new int[100];

    @OriginalMember(owner = "client!co", name = "D", descriptor = "S")
    public static short field4561 = 205;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!co", name = "v", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!co", name = "z", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!co", name = "C", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!co", name = "B", descriptor = "Lie;")
    public static class330 field4559;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V", line = 4)
    public static void method2116(byte arg0) {
        field4559 = null;
        if (arg0 < -124) {
            field4549 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/lang/String;BIZ)I", line = 16)
    public static final int method2117(String arg0, byte arg1, int arg2, boolean arg3) {
        field4551++;
        if (arg1 < 73) {
            return 11;
        } else if (arg2 >= 2 && arg2 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg0.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg0.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg3) {
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
                if (arg2 <= var11) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg2 * var6 + var11;
                if ((var10 / arg2) != var6) {
                    throw new NumberFormatException();
                }
                var5 = true;
                var6 = var10;
            }
            if (!var5) {
                throw new NumberFormatException();
            }
            return var6;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V", line = 104)
    public static final void method2118(int arg0) {
        field4553++;
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class45.method453(true, var1, var2, class170.field2689, var3, 1179648)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 != 1074291745) {
            field4561 = 84;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIBIII)V", line = 149)
    public static final void method2119(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class6.method42(arg1, 2);
        field4554++;
        int var7 = arg1 - arg5;
        int var8 = arg1;
        int var9 = -arg1;
        if (var7 < 0) {
            var7 = 0;
        }
        int var10 = var7;
        int var11 = -var7;
        int var12 = -1;
        int var13 = 0;
        int var14 = -1;
        int var15 = arg2 + var7;
        int[] var16 = class133.field2235[arg0];
        int var17 = arg2 - var7;
        int var18 = 29 / ((arg3 + 7) / 55);
        class283.method2059(arg4, var16, (byte) 112, var17, arg2 - arg1);
        class283.method2059(arg6, var16, (byte) 105, var15, var17);
        class283.method2059(arg4, var16, (byte) 114, arg1 + arg2, var15);
        while (var8 > var13) {
            var14 += 2;
            var12 += 2;
            var11 += var14;
            var9 += var12;
            if (var11 >= 0 && var10 >= 1) {
                class104.field1571[var10] = var13;
                var10--;
                var11 -= var10 << 1;
            }
            var13++;
            if (var9 >= 0) {
                var8--;
                if (var8 < var7) {
                    int[] var19 = class133.field2235[arg0 + var8];
                    int var20 = class104.field1571[var8];
                    int[] var21 = class133.field2235[arg0 - var8];
                    int var22 = arg2 + var13;
                    int var23 = arg2 - var13;
                    int var24 = arg2 + var20;
                    int var25 = arg2 - var20;
                    class283.method2059(arg4, var19, (byte) 119, var25, var23);
                    class283.method2059(arg6, var19, (byte) 109, var24, var25);
                    class283.method2059(arg4, var19, (byte) 102, var22, var24);
                    class283.method2059(arg4, var21, (byte) 124, var25, var23);
                    class283.method2059(arg6, var21, (byte) 111, var24, var25);
                    class283.method2059(arg4, var21, (byte) 102, var22, var24);
                } else {
                    int[] var26 = class133.field2235[arg0 + var8];
                    int[] var27 = class133.field2235[arg0 - var8];
                    int var28 = arg2 + var13;
                    int var29 = arg2 - var13;
                    class283.method2059(arg4, var26, (byte) 119, var28, var29);
                    class283.method2059(arg4, var27, (byte) 125, var28, var29);
                }
                var9 -= var8 << 1;
            }
            int var30 = arg2 - var8;
            int[] var31 = class133.field2235[arg0 - var13];
            int var32 = arg2 + var8;
            int[] var33 = class133.field2235[arg0 + var13];
            if (var7 <= var13) {
                class283.method2059(arg4, var33, (byte) 98, var32, var30);
                class283.method2059(arg4, var31, (byte) 120, var32, var30);
            } else {
                int var34 = var10 >= var13 ? var10 : class104.field1571[var13];
                int var35 = arg2 + var34;
                int var36 = arg2 - var34;
                class283.method2059(arg4, var33, (byte) 110, var36, var30);
                class283.method2059(arg6, var33, (byte) 103, var35, var36);
                class283.method2059(arg4, var33, (byte) 124, var32, var35);
                class283.method2059(arg4, var31, (byte) 92, var36, var30);
                class283.method2059(arg6, var31, (byte) 122, var35, var36);
                class283.method2059(arg4, var31, (byte) 97, var32, var35);
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "e", descriptor = "(I)V", line = 281)
    public static final void method2120(int arg0) {
        field4547++;
        int var1 = class138.field2290;
        int var2 = class166.field2645;
        if (arg0 != 5447) {
            method2118(-23);
        }
        int var3 = class101.field1528 - class126.field2113 - var1;
        int var4 = class277.field4283 - var2 - class362.field5740;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class212.field3321 != null) {
                var5 = class212.field3321;
            } else if (class67.field1028 == null) {
                var5 = class340.field5234.field4975;
            } else {
                var5 = class67.field1028;
            }
            int var6 = 0;
            int var7 = 0;
            if (class67.field1028 == var5) {
                Insets var8 = class67.field1028.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class277.field4283);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class101.field1528, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class101.field1528 + var6 - var3, var7, var3, class277.field4283);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class277.field4283 - var4, class101.field1528, var4);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(II)I", line = 351)
    public static final int method2121(int arg0, int arg1) {
        field4557++;
        if (arg0 != 0) {
            method2117((String) null, (byte) 100, -47, false);
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(II)V", line = 362)
    public static final void method2122(int arg0, int arg1) {
        field4560++;
        if (!class321.field4946) {
            arg0 = -1;
        }
        if (class261.field4009 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class321 var2 = class255.method1887(arg0, (byte) -111);
            class361 var3 = var2.method2266(126);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class340.field5234.method2292(var3.method523(), var3.field3369, var3.field3360, class64.field974, new Point(var2.field4952, var2.field4948), arg1 ^ 0xFFFFFFEE);
                class261.field4009 = arg0;
            }
        }
        if (arg0 == arg1 && class261.field4009 != -1) {
            class340.field5234.method2292((int[]) null, -1, -1, class64.field974, new Point(), 17);
            class261.field4009 = -1;
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(I[B)V", line = 400)
    public class293(int arg0, byte[] arg1) {
        this.field4552 = arg0;
        class25 var3 = new class25(arg1);
        this.field4545 = var3.method281(57);
        this.field4550 = new boolean[this.field4545];
        this.field4556 = new int[this.field4545][];
        this.field4546 = new int[this.field4545];
        this.field4558 = new int[this.field4545];
        for (int var4 = 0; var4 < this.field4545; var4++) {
            this.field4546[var4] = var3.method281(68);
        }
        for (int var5 = 0; var5 < this.field4545; var5++) {
            this.field4550[var5] = var3.method281(-124) == 1;
        }
        for (int var6 = 0; var6 < this.field4545; var6++) {
            this.field4558[var6] = var3.method314((byte) 49);
        }
        for (int var7 = 0; var7 < this.field4545; var7++) {
            this.field4556[var7] = new int[var3.method281(59)];
        }
        for (int var8 = 0; var8 < this.field4545; var8++) {
            for (int var9 = 0; var9 < this.field4556[var8].length; var9++) {
                this.field4556[var8][var9] = var3.method281(-127);
            }
        }
    }
}

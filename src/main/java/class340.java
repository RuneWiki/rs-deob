import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class340 extends class71 {

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "Ljava/lang/String;")
    public static String field5275 = "purple:";

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "I")
    public static int field5297 = -1;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "[I")
    public static int[] field5287 = new int[14];

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public int field5276;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public int field5278;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public int field5280;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public int field5281;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    public int field5283;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    public int field5284;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    public int field5286;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    public int field5288;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "I")
    public int field5289;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "I")
    public int field5291;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    public int field5292;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "I")
    public int field5293;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public int field5295;

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "I")
    public int field5298;

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "I")
    public int field5299;

    @OriginalMember(owner = "client!oj", name = "T", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!oj", name = "U", descriptor = "I")
    public int field5301;

    @OriginalMember(owner = "client!oj", name = "V", descriptor = "I")
    public int field5302;

    @OriginalMember(owner = "client!oj", name = "X", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!oj", name = "W", descriptor = "Lq;")
    public class105 field5303;

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "Lkl;")
    public class141 field5296;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "Lqj;")
    public class267 field5290;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "Ljc;")
    public class312 field5294;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Lkb;")
    public static class39 field5277;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(B)V", line = 6)
    public static void method2342(byte arg0) {
        if (arg0 == -100) {
            field5277 = null;
            field5287 = null;
            field5275 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 18)
    public static final void method2343(int arg0) {
        if (arg0 != 2047) {
            return;
        }
        field5300++;
        while (class336.field5213.method1533((byte) -50, class138.field2063) >= 11) {
            int var1 = class336.field5213.method1535((byte) 85, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class100.field1523[var1] == null) {
                class100.field1523[var1] = new class320();
                if (class26.field379[var1] != null) {
                    class100.field1523[var1].method2238(class26.field379[var1], -85);
                }
                var2 = true;
            }
            class103.field1575[class24.field350++] = var1;
            class320 var3 = class100.field1523[var1];
            var3.field2008 = class48.field648;
            int var4 = class168.field2700[class336.field5213.method1535((byte) 80, 3)];
            if (var2) {
                var3.field1973 = var3.field2037 = var4;
            }
            int var5 = class336.field5213.method1535((byte) 25, 1);
            int var6 = class336.field5213.method1535((byte) 108, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class336.field5213.method1535((byte) 6, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class336.field5213.method1535((byte) 52, 1);
            if (var8 == 1) {
                class318.field4946[class126.field1877++] = var1;
            }
            var3.method2236(class13.field159.field1969[0] + var7, class13.field159.field2006[0] + var6, 18675, var5 == 1);
        }
        class336.field5213.method1531((byte) -39);
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V", line = 88)
    public static final void method2344(int arg0) {
        if (class329.field5112 < 128.0F) {
            class329.field5112 = 128.0F;
        }
        field5279++;
        while (class312.field4862 >= 2048.0F) {
            class312.field4862 -= 2048.0F;
        }
        if (class329.field5112 > 383.0F) {
            class329.field5112 = 383.0F;
        }
        int var1 = class131.field1935 >> 7;
        int var2 = class255.field4045 >> 7;
        int var3 = 0;
        while (class312.field4862 < 0.0F) {
            class312.field4862 += 2048.0F;
        }
        int var4 = class227.method1653(class131.field1935, class255.field4045, -12282, class148.field2209);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class148.field2209;
                    if (var7 < 3 && (class81.field1229[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class276.field4374[var7][var5][var6] & 0xFF) * 8 + var4 - class84.field1282[var7][var5][var6];
                    if (var3 < var8) {
                        var3 = var8;
                    }
                }
            }
        }
        if (arg0 > -45) {
            field5297 = 18;
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class114.field1717 < var9) {
            class114.field1717 += (var9 - class114.field1717) / 24;
        } else if (class114.field1717 > var9) {
            class114.field1717 += (var9 - class114.field1717) / 80;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)V", line = 188)
    public static final void method2345(int arg0, byte arg1) {
        if (arg1 > -87) {
            method2347((byte) -43, (class320) null);
        }
        field5285++;
        class101.field1543.method1625(arg0, (byte) 76);
        class182.field2939.method1625(arg0, (byte) 111);
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(B)V", line = 201)
    public final void method2346(byte arg0) {
        this.field5296 = null;
        this.field5294 = null;
        this.field5303 = null;
        this.field5290 = null;
        if (arg0 <= 107) {
            this.field5283 = 8;
        }
        field5304++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLc;)I", line = 227)
    public static final int method2347(byte arg0, class320 arg1) {
        field5282++;
        int var2 = arg1.field4999;
        if (arg0 != 87) {
            method2343(-67);
        }
        class206 var3 = arg1.method899(true);
        if (arg1.field1994 == var3.field3354) {
            var2 = arg1.field5017;
        } else if (arg1.field1994 == var3.field3347 || arg1.field1994 == var3.field3351 || arg1.field1994 == var3.field3374 || arg1.field1994 == var3.field3377) {
            var2 = arg1.field5011;
        } else if (arg1.field1994 == var3.field3380 || arg1.field1994 == var3.field3356 || arg1.field1994 == var3.field3360 || arg1.field1994 == var3.field3349) {
            var2 = arg1.field5006;
        }
        return var2;
    }
}

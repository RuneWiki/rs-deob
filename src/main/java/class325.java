import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class325 extends class128 {

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public int field5180 = 0;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
    public int field5170 = 12800;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    public int field5169 = -1;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    public int field5179 = 12800;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "I")
    public int field5167 = 0;

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "I")
    public int field5185 = -1;

    @OriginalMember(owner = "client!qh", name = "W", descriptor = "Z")
    public boolean field5189 = true;

    @OriginalMember(owner = "client!qh", name = "V", descriptor = "I")
    public int field5188;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "Ljava/lang/String;")
    public String field5174;

    @OriginalMember(owner = "client!qh", name = "T", descriptor = "Ljava/lang/String;")
    public String field5186;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    public int field5172;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "Lc;")
    public class331 field5176;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
    public static int field5181 = 0;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public static int field5178 = 0;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(IIII)[I", line = 4)
    public final int[] method2253(int arg0, int arg1, int arg2, int arg3) {
        field5171++;
        if (arg3 <= 48) {
            return (int[]) null;
        }
        for (class254 var5 = (class254) this.field5176.method2297(14204); var5 != null; var5 = (class254) this.field5176.method2291(-121)) {
            if (var5.method1774(9, arg0, arg1, arg2)) {
                return var5.method1770(arg1, 27, arg0);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)[I", line = 28)
    public final int[] method2254(int arg0, int arg1, int arg2) {
        field5183++;
        if (arg1 != 3) {
            return (int[]) null;
        }
        for (class254 var4 = (class254) this.field5176.method2297(14204); var4 != null; var4 = (class254) this.field5176.method2291(-95)) {
            if (var4.method1773(arg0, (byte) -125, arg2)) {
                return var4.method1771(arg2, arg1 + 94, arg0);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLcg;Lcg;II)Ljc;", line = 57)
    public static final class323 method2255(boolean arg0, class49 arg1, class49 arg2, int arg3, int arg4) {
        field5184++;
        if (method2262(arg3, (byte) 99, arg2, arg4)) {
            return arg0 ? class262.method1813(arg1.method441(!arg0, arg4, arg3), (byte) 17) : (class323) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZI)Z", line = 71)
    public final boolean method2256(int arg0, boolean arg1, int arg2) {
        field5175++;
        class254 var4 = (class254) this.field5176.method2297(14204);
        if (!arg1) {
            this.method2254(64, 8, 4);
        }
        while (var4 != null) {
            if (var4.method1772(arg0, (byte) 97, arg2)) {
                return true;
            }
            var4 = (class254) this.field5176.method2291(-98);
        }
        return false;
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)V", line = 97)
    public final void method2257(int arg0) {
        this.field5180 = 0;
        this.field5167 = 0;
        this.field5179 = 12800;
        this.field5170 = 12800;
        field5182++;
        for (class254 var2 = (class254) this.field5176.method2297(14204); var2 != null; var2 = (class254) this.field5176.method2291(65)) {
            if (var2.field4082 > this.field5167) {
                this.field5167 = var2.field4082;
            }
            if (this.field5180 < var2.field4084) {
                this.field5180 = var2.field4084;
            }
            if (var2.field4085 < this.field5170) {
                this.field5170 = var2.field4085;
            }
            if (var2.field4083 < this.field5179) {
                this.field5179 = var2.field4083;
            }
        }
        if (arg0 < 103) {
            this.field5174 = (String) null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIII)V", line = 136)
    public static final void method2258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5168++;
        int var6 = 0;
        if (arg4 != -1036573887) {
            field5178 = -25;
        }
        int var7 = arg3;
        int var8 = arg0 * arg0;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = ((var6 << 1) + 3) * var10;
        int var16 = var8 << 2;
        int var17 = var9 << 2;
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var17;
        if (class90.field1428 <= arg5 && class135.field2358 >= arg5) {
            int var20 = class105.method899(false, class310.field4916, class170.field2944, arg0 + arg1);
            int var21 = class105.method899(false, class310.field4916, class170.field2944, arg1 - arg0);
            class317.method2184(var20, (byte) -64, class64.field1007[arg5], arg2, var21);
        }
        int var22 = (arg3 - 1) * var16;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var15;
                    var15 += var17;
                    var19 += var17;
                    var6++;
                }
            }
            var7--;
            if (var14 < 0) {
                var13 += var15;
                var6++;
                var15 += var17;
                var14 += var19;
                var19 += var17;
            }
            var14 += -var18;
            var13 += -var22;
            var22 -= var16;
            var18 -= var16;
            int var23 = arg5 + var7;
            int var24 = arg5 - var7;
            if (class90.field1428 <= var23 && class135.field2358 >= var24) {
                int var25 = class105.method899(false, class310.field4916, class170.field2944, arg1 + var6);
                int var26 = class105.method899(false, class310.field4916, class170.field2944, arg1 - var6);
                if (class90.field1428 <= var24) {
                    class317.method2184(var25, (byte) 94, class64.field1007[var24], arg2, var26);
                }
                if (var23 <= class135.field2358) {
                    class317.method2184(var25, (byte) -8, class64.field1007[var23], arg2, var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)Ln;", line = 241)
    public static final class309 method2259(byte arg0) {
        field5173++;
        int var1 = class39.field585[0] * class123.field2138[0];
        byte[] var2 = class191.field3205[0];
        int[] var3 = new int[var1];
        if (arg0 <= 48) {
            return (class309) null;
        }
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class40.field600[class36.method319(255, var2[var4])];
        }
        class309 var5 = new class309(class308.field4901, class4.field58, class352.field5575[0], class104.field1743[0], class39.field585[0], class123.field2138[0], var3);
        class15.method151(0);
        return var5;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZ)[I", line = 270)
    public final int[] method2260(int arg0, int arg1, boolean arg2) {
        field5187++;
        for (class254 var4 = (class254) this.field5176.method2297(14204); var4 != null; var4 = (class254) this.field5176.method2291(-95)) {
            if (var4.method1772(arg0, (byte) 97, arg1)) {
                return var4.method1770(arg0, 27, arg1);
            }
        }
        if (!arg2) {
            field5178 = -72;
        }
        return null;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 431)
    public class325(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field5188 = arg0;
        this.field5174 = arg1;
        this.field5169 = arg4;
        this.field5186 = arg2;
        this.field5189 = arg5;
        this.field5172 = arg3;
        this.field5185 = arg6;
        if (this.field5185 == 255) {
            this.field5185 = 0;
        }
        this.field5176 = new class331();
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLcg;)V", line = 301)
    public static final void method2261(byte arg0, class49 arg1) {
        field5177++;
        class185.field3134 = arg1;
        if (arg0 != -46) {
            field5181 = -56;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBLcg;I)Z", line = 328)
    public static final boolean method2262(int arg0, byte arg1, class49 arg2, int arg3) {
        field5165++;
        byte[] var4 = arg2.method441(false, arg3, arg0);
        if (var4 == null) {
            return false;
        } else {
            class285.method1948(-126, var4);
            int var5 = -20 % ((arg1 - 18) / 58);
            return true;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([Llg;ZI)V", line = 351)
    public static final void method2263(class137[] arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field5178 = 20;
        }
        field5166++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class137 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field2490 == 0) {
                    if (var4.field2453 != null) {
                        method2263(var4.field2453, true, arg2);
                    }
                    class228 var5 = (class228) class172.field2972.method732((long) var4.field2462, arg1);
                    if (var5 != null) {
                        class291.method1991(var5.field3833, -28554, arg2);
                    }
                }
                if (arg2 == 0 && var4.field2395 != null) {
                    class258 var6 = new class258();
                    var6.field4168 = var4;
                    var6.field4173 = var4.field2395;
                    class179.method1376(var6, false);
                }
                if (arg2 == 1 && var4.field2534 != null) {
                    if (var4.field2434 >= 0) {
                        class137 var7 = class146.method1167(1169843632, var4.field2462);
                        if (var7 == null || var7.field2453 == null || var7.field2453.length <= var4.field2434 || var7.field2453[var4.field2434] != var4) {
                            continue;
                        }
                    }
                    class258 var8 = new class258();
                    var8.field4173 = var4.field2534;
                    var8.field4168 = var4;
                    class179.method1376(var8, false);
                }
            }
        }
    }
}

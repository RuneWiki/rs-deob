import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class377 extends class623 {

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "Z")
    public boolean field5274 = true;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    public int field5282 = -1;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public int field5281 = -1;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public int field5287 = 0;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public int field5278 = 12800;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public int field5283 = 0;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    public int field5288 = 12800;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public int field5279;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    public int field5285;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "Ljava/lang/String;")
    public String field5291;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "Ljava/lang/String;")
    public String field5286;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "Lqia;")
    public class547 field5272;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
    public static final void method2285(int arg0) {
        class569.method3202();
        field5277++;
        for (int var1 = 0; var1 < 4; var1++) {
            class410.field5786[var1].method3794(arg0 - 23);
        }
        class289.method1730((byte) -108);
        class326.method1932(0);
        class641.method3487(arg0 ^ 0xFFFFFF97);
        System.gc();
        class458.field6407.method99();
        if (arg0 == -37) {
            ;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIB)Z")
    public final boolean method2286(int arg0, int arg1, byte arg2) {
        field5273++;
        for (class477 var4 = (class477) this.field5272.method3111(88); var4 != null; var4 = (class477) this.field5272.method3116(-70)) {
            if (var4.method2791(arg0, (byte) -69, arg1)) {
                return true;
            }
        }
        if (arg2 <= 35) {
            this.field5278 = 107;
        }
        return false;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II[IB)Z")
    public final boolean method2287(int arg0, int arg1, int[] arg2, byte arg3) {
        if (arg3 != -60) {
            return true;
        }
        field5280++;
        for (class477 var5 = (class477) this.field5272.method3111(74); var5 != null; var5 = (class477) this.field5272.method3116(-45)) {
            if (var5.method2790(arg0, true, arg1)) {
                var5.method2793(2, arg0, arg2, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 >= -127) {
            return;
        }
        if (arg8 == arg9 && arg3 == arg6 && arg0 == arg7 && arg1 == arg2) {
            class45.method371(arg6, arg0, arg2, arg9, (byte) 44, arg5);
        } else {
            int var10 = arg9;
            int var11 = arg6;
            int var12 = arg9 * 3;
            int var13 = arg6 * 3;
            int var14 = arg8 * 3;
            int var15 = arg3 * 3;
            int var16 = arg7 * 3;
            int var17 = arg1 * 3;
            int var18 = arg0 - (arg9 + var16 - var14);
            int var19 = var15 + arg2 - arg6 - var17;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg9;
                int var34 = (var30 + var32 + var28 >> 12) + arg6;
                class45.method371(var11, var33, var34, var10, (byte) 44, arg5);
                var10 = var33;
                var11 = var34;
            }
        }
        field5276++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ[II)Z")
    public final boolean method2289(int arg0, boolean arg1, int[] arg2, int arg3) {
        field5290++;
        if (!arg1) {
            this.method2292((byte) -72);
        }
        for (class477 var5 = (class477) this.field5272.method3111(52); var5 != null; var5 = (class477) this.field5272.method3116(-65)) {
            if (var5.method2791(arg0, (byte) -79, arg3)) {
                var5.method2789(arg0, arg2, arg3, (byte) 127);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([IIIII)Z")
    public final boolean method2290(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field5289++;
        for (class477 var6 = (class477) this.field5272.method3111(86); var6 != null; var6 = (class477) this.field5272.method3116(-83)) {
            if (var6.method2788((byte) 17, arg1, arg2, arg3)) {
                var6.method2789(arg2, arg0, arg3, (byte) 111);
                return true;
            }
        }
        if (arg4 != 28512) {
            method2291(null, (byte) 17, -26, true);
        }
        return false;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;BIZ)Z")
    public static final boolean method2291(String arg0, byte arg1, int arg2, boolean arg3) {
        field5275++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        if (arg1 > -34) {
            method2291(null, (byte) -26, 111, false);
        }
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
                return false;
            }
            if (arg2 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
    public final void method2292(byte arg0) {
        if (arg0 >= -69) {
            this.field5274 = true;
        }
        this.field5288 = 12800;
        this.field5278 = 12800;
        this.field5283 = 0;
        field5284++;
        this.field5287 = 0;
        for (class477 var2 = (class477) this.field5272.method3111(57); var2 != null; var2 = (class477) this.field5272.method3116(-101)) {
            if (this.field5283 < var2.field6805) {
                this.field5283 = var2.field6805;
            }
            if (var2.field6807 < this.field5278) {
                this.field5278 = var2.field6807;
            }
            if (var2.field6812 > this.field5287) {
                this.field5287 = var2.field6812;
            }
            if (this.field5288 > var2.field6811) {
                this.field5288 = var2.field6811;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class377(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field5279 = arg3;
        this.field5281 = arg4;
        this.field5282 = arg6;
        this.field5285 = arg0;
        this.field5291 = arg1;
        this.field5274 = arg5;
        this.field5286 = arg2;
        if (this.field5282 == 255) {
            this.field5282 = 0;
        }
        this.field5272 = new class547();
    }
}

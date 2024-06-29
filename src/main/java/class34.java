import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class34 {

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    private int field335 = -1;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "Z")
    private boolean field337 = true;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "[Lsi;")
    private class333[] field324;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "[Lsi;")
    private class333[] field327;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Lsi;")
    private class333 field322;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field317 = 0;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "Ljava/lang/String;")
    public static String field331 = "Created gameworld";

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public static int field336 = 0;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "Lkh;")
    private class11 field323;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Len;II)Z")
    public final boolean method195(class174 arg0, int arg1, int arg2) {
        field333++;
        if (this.field335 != arg2) {
            this.field335 = arg2;
            int var4 = class279.method1761(false, arg2);
            if (var4 > arg2) {
                var4 = class406.method2564(-56, arg2);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field320 != var4) {
                this.field320 = var4;
                this.field323 = null;
            }
            if (this.field324 != null) {
                this.field318 = 0;
                int[] var5 = new int[this.field324.length];
                for (int var6 = 0; var6 < this.field324.length; var6++) {
                    class333 var7 = this.field324[var6];
                    if (var7.method2140(this.field329, this.field334, this.field319, this.field335)) {
                        var5[this.field318] = var7.field4888;
                        this.field327[this.field318++] = var7;
                    }
                }
                class115.method633(this.field327, false, this.field318 - 1, 0, var5);
            }
            this.field337 = true;
        }
        boolean var8 = false;
        if (arg1 != 1) {
            method196(42, 94, 111, true, -92, -127, -76, -128, 114, -95, -97, -11, 126);
        }
        if (this.field337) {
            this.field337 = false;
            for (int var9 = this.field318 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field327[var9].method2141(arg0, this.field322);
                var8 |= var10;
                this.field337 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIZIIIIIIIII)V")
    public static final void method196(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field326++;
        class418 var13 = new class418();
        var13.field5996 = arg8;
        var13.field6005 = arg6;
        var13.field5997 = arg0;
        var13.field6002 = arg5;
        var13.field6004 = arg1;
        var13.field6012 = arg11;
        var13.field6001 = arg9;
        var13.field5998 = arg4;
        var13.field5999 = arg2;
        var13.field6000 = arg10;
        var13.field6007 = arg12;
        var13.field6003 = arg7;
        class364.field5292.method1125(-1, var13);
        if (!arg3) {
            field332 = -19;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILen;IIIIIIII)V")
    public final void method197(int arg0, class174 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg4 + arg7 & 0x3FFF;
        field321++;
        if (this.field325 == -1) {
            arg1.method995(arg5, arg8, arg2, arg3, arg6, 0);
        } else {
            class311 var12 = class3.field46.method371(this.field325, (byte) 96);
            if (this.field323 == null && class3.field46.method369(this.field325, (byte) -100)) {
                int[] var13 = var12.field4450 ? class3.field46.method373(this.field320, this.field325, 0.7F, this.field320, 8125, false) : class3.field46.method372(this.field320, 110, false, this.field325, 0.7F, this.field320);
                this.field323 = arg1.method1008(var13, 0, this.field320, this.field320, this.field320);
            }
            if (!var12.field4450) {
                arg1.method995(arg5, arg8, arg2, arg3, arg6, 0);
            }
            if (this.field323 != null) {
                int var14 = var12.field4450 ? 0 : 1;
                int var15 = arg3 * arg9 / -4096;
                int var16;
                for (var16 = arg3 * var11 / 4096 + (arg2 - arg3) / 2; var16 > arg3; var16 -= arg3) {
                }
                while (var15 > arg3) {
                    var15 -= arg3;
                }
                while (var16 < 0) {
                    var16 += arg3;
                }
                while (var15 < 0) {
                    var15 += arg3;
                }
                for (int var17 = var16 - arg3; var17 < arg2; var17 += arg3) {
                    for (int var18 = var15 - arg3; var18 < arg3; var18 += arg3) {
                        this.field323.method46(var17 + arg5, arg8 + var18, arg3, arg3, 0, 0, var14);
                    }
                }
            }
        }
        int var19 = this.field318 - 1;
        if (arg0 != 0) {
            this.field335 = 53;
        }
        while (var19 >= 0) {
            this.field327[var19].method2135(arg1, arg5, arg8, arg2, arg3, arg9, var11);
            var19--;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)V")
    public static final void method198(int arg0, byte arg1) {
        field328++;
        class219.field3009 = arg0;
        class383.field5621.method2043(-47);
        if (arg1 < 51) {
            field332 = 74;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static void method199(int arg0) {
        field331 = null;
        if (arg0 != 24913) {
            method198(-61, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public final void method200(byte arg0) {
        int var2 = -90 / ((arg0 + 56) / 32);
        if (this.field324 != null) {
            for (int var3 = 0; var3 < this.field324.length; var3++) {
                this.field324[var3].method2134();
            }
        }
        field330++;
        this.field323 = null;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(I[Lsi;IIII)V")
    public class34(int arg0, class333[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field325 = arg0;
        this.field329 = arg3;
        this.field319 = arg5;
        this.field324 = arg1;
        this.field334 = arg4;
        if (arg1 == null) {
            this.field322 = null;
            this.field327 = null;
        } else {
            this.field327 = new class333[arg1.length];
            this.field322 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}

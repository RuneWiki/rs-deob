import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public abstract class class351 {

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public int field5085;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public int field5084;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field5088 = 0;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field5090 = 0;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 12)
    public static final void method2310(int arg0) {
        field5087++;
        for (int var1 = 0; var1 < class321.field4730; var1++) {
            int var10002 = class245.field3284[var1]--;
            if (class245.field3284[var1] >= -10) {
                class285 var4 = class56.field766[var1];
                if (var4 == null) {
                    var4 = class285.method1959(class309.field4551, class240.field3218[var1], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class245.field3284[var1] += var4.method1961();
                    class56.field766[var1] = var4;
                }
                if (class245.field3284[var1] < 0) {
                    int var5;
                    if (class161.field2160[var1] == 0) {
                        var5 = class164.field2209[var1] * class359.field5186 >> 8;
                    } else {
                        int var6 = (class161.field2160[var1] & 0xFF) * 128;
                        int var7 = class161.field2160[var1] >> 16 & 0xFF;
                        int var8 = var7 * 128 + 64 - class227.field2988.field740;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = (class161.field2160[var1] & 0xFF1F) >> 8;
                        int var10 = var9 * 128 + 64 - class227.field2988.field734;
                        if (var10 < 0) {
                            var10 = -var10;
                        }
                        int var11 = var8 + var10 - 128;
                        if (var6 < var11) {
                            class245.field3284[var1] = -100;
                            continue;
                        }
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        var5 = (var6 - var11) * class164.field2209[var1] * class156.field2123 / var6 >> 8;
                    }
                    if (var5 > 0) {
                        class13 var12 = var4.method1958().method92(class375.field5450);
                        class137 var13 = class137.method856(var12, 100, var5);
                        var13.method887(class31.field442[var1] - 1);
                        class156.field2122.method2506(var13);
                    }
                    class245.field3284[var1] = -100;
                }
            } else {
                class321.field4730--;
                for (int var3 = var1; var3 < class321.field4730; var3++) {
                    class240.field3218[var3] = class240.field3218[var3 + 1];
                    class56.field766[var3] = class56.field766[var3 + 1];
                    class31.field442[var3] = class31.field442[var3 + 1];
                    class245.field3284[var3] = class245.field3284[var3 + 1];
                    class161.field2160[var3] = class161.field2160[var3 + 1];
                    class164.field2209[var3] = class164.field2209[var3 + 1];
                }
                var1--;
            }
        }
        int var2 = -118 / ((arg0 + 35) / 56);
        if (class7.field123 && !class298.method2039(false)) {
            if (class400.field5969 != 0 && class196.field2626 != -1) {
                class25.method178(class196.field2626, 0, false, class400.field5969, false, class385.field5583);
            }
            class7.field123 = false;
        } else if (class400.field5969 != 0 && class196.field2626 != -1 && !class298.method2039(false)) {
            class45.field643++;
            class185.field2507.method5(-6445, 31);
            class185.field2507.method1330(class196.field2626, 98);
            class196.field2626 = -1;
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(II)V", line = 146)
    public class351(int arg0, int arg1) {
        this.field5085 = arg1;
        this.field5084 = arg0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lnj;B)V", line = 160)
    public static final void method2311(class228 arg0, byte arg1) {
        field5089++;
        int var2 = arg0.method1327((byte) -64);
        class144.field1969 = new class393[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class144.field1969[var3] = new class393();
            class144.field1969[var3].field5622 = arg0.method1327((byte) -64);
            class144.field1969[var3].field5625 = arg0.method1373(-25706);
        }
        class27.field396 = arg0.method1327((byte) -64);
        class295.field4229 = arg0.method1327((byte) -64);
        class57.field774 = arg0.method1327((byte) -64);
        class339.field4885 = new class92[class295.field4229 + 1 - class27.field396];
        int var4 = 0;
        if (arg1 != -52) {
            return;
        }
        while (var4 < class57.field774) {
            int var5 = arg0.method1327((byte) -64);
            class92 var6 = class339.field4885[var5] = new class92();
            var6.field1255 = arg0.method1348(-104);
            var6.field1243 = arg0.method1344((byte) 50);
            var6.field1300 = class27.field396 + var5;
            var6.field1302 = arg0.method1373(-25706);
            var6.field1297 = arg0.method1373(-25706);
            var4++;
        }
        class281.field4092 = arg0.method1344((byte) 93);
        class352.field5101 = true;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILjava/lang/String;)I", line = 208)
    public static final int method2312(int arg0, String arg1) {
        field5086++;
        if (arg0 != -1035) {
            method2311((class228) null, (byte) -60);
        }
        return class130.method821(true, 10, (byte) 45, arg1);
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(II)I", line = 225)
    public static int method2313(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIII)V", line = 237)
    public static final void method2314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5083++;
        class261.method1801(31263, arg5);
        int var7 = arg6;
        int var8 = arg5 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class384.field5560[arg1];
        int var16 = arg2 - var8;
        int var17 = arg2 + var8;
        class207.method1221((byte) -127, arg2 - arg5, var16, var15, arg4);
        class207.method1221((byte) -128, var16, var17, var15, arg0);
        class207.method1221((byte) -122, var17, arg2 + arg5, var15, arg4);
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class317.field4644[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 <= var9) {
                    int[] var18 = class384.field5560[arg1 + var9];
                    int[] var19 = class384.field5560[arg1 - var9];
                    int var20 = arg2 + var7;
                    int var21 = arg2 - var7;
                    class207.method1221((byte) -126, var21, var20, var18, arg4);
                    class207.method1221((byte) -123, var21, var20, var19, arg4);
                } else {
                    int[] var22 = class384.field5560[arg1 + var9];
                    int[] var23 = class384.field5560[arg1 - var9];
                    int var24 = class317.field4644[var9];
                    int var25 = arg2 + var7;
                    int var26 = arg2 - var7;
                    int var27 = arg2 + var24;
                    int var28 = arg2 - var24;
                    class207.method1221((byte) -128, var26, var28, var22, arg4);
                    class207.method1221((byte) -127, var28, var27, var22, arg0);
                    class207.method1221((byte) -125, var27, var25, var22, arg4);
                    class207.method1221((byte) -127, var26, var28, var23, arg4);
                    class207.method1221((byte) -128, var28, var27, var23, arg0);
                    class207.method1221((byte) -124, var27, var25, var23, arg4);
                }
            }
            int[] var29 = class384.field5560[arg1 + var7];
            int[] var30 = class384.field5560[arg1 - var7];
            int var31 = arg2 + var9;
            int var32 = arg2 - var9;
            if (var7 < var8) {
                int var33 = var7 <= var11 ? var11 : class317.field4644[var7];
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class207.method1221((byte) -128, var32, var35, var29, arg4);
                class207.method1221((byte) -125, var35, var34, var29, arg0);
                class207.method1221((byte) -124, var34, var31, var29, arg4);
                class207.method1221((byte) -127, var32, var35, var30, arg4);
                class207.method1221((byte) -128, var35, var34, var30, arg0);
                class207.method1221((byte) -126, var34, var31, var30, arg4);
            } else {
                class207.method1221((byte) -123, var32, var31, var29, arg4);
                class207.method1221((byte) -128, var32, var31, var30, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILri;)Lri;")
    public abstract class98 method756(int arg0, int arg1, class98 arg2);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lwc;[I)V")
    public abstract void method738(class367 arg0, int[] arg1);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lri;IIIIZ)V")
    public abstract void method739(class98 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)I")
    public abstract int method745(int arg0, int arg1);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public abstract void method748(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public abstract void method750(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "()V")
    public abstract void method744();

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Lri;IIIIZ)Z")
    public abstract boolean method743(class98 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method741(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)I")
    public abstract int method742(int arg0, int arg1);

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(Lri;IIIIZ)V")
    public abstract void method757(class98 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V")
    public abstract void method746(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)V")
    public abstract void method752(int arg0, int arg1);
}

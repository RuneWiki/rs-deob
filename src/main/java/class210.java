import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class210 extends class180 {

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "[B")
    public byte[] field2965;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field2963 = 0;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "Lcs;")
    public static class351 field2966 = new class351(18, -1);

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "Lfn;")
    public static class52 field2969 = new class52(4, -1);

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "Lbd;")
    public static class464 field2970 = new class464(2, 4);

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V")
    public static final void method1319(int arg0, int arg1) {
        if (arg0 != 3) {
            method1320(true, -4, -42);
        }
        class355.method2134(-24840);
        field2968++;
        int var2 = class181.field2632.method2431((byte) -95, arg1).field197;
        if (var2 == 0) {
            return;
        }
        int var3 = class320.field4376.field3352[arg1];
        if (var2 == 5) {
            class337.field4618 = var3;
        }
        if (var2 == 6) {
            class19.field309 = var3;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZII)I")
    public static final int method1320(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field2963 = 61;
        }
        field2962++;
        return arg1 == 1 || arg1 == 3 ? class491.field6931[arg2 & 0x3] : class163.field2337[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public static void method1321(int arg0) {
        field2970 = null;
        field2969 = null;
        if (arg0 != 0) {
            field2966 = null;
        }
        field2966 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZ)I")
    public static final int method1322(int arg0, boolean arg1) {
        field2964++;
        if (class237.field3339 != null) {
            class237.field3339.method2632(32214);
            class237.field3339 = null;
        }
        if (arg1) {
            field2966 = null;
        }
        class400.field5592++;
        if (class400.field5592 > 4) {
            class400.field5592 = 0;
            class81.field1224 = 0;
            return arg0;
        }
        class81.field1224 = 0;
        if (class270.field3736 == class154.field2228) {
            class270.field3736 = class363.field5074;
        } else {
            class270.field3736 = class154.field2228;
        }
        return -1;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "([B)V")
    public class210(byte[] arg0) {
        this.field2965 = arg0;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)Z")
    public static final boolean method1323(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class227.field3211; var3++) {
            class490 var4 = class215.field3048[var3];
            if (var4.field6914 == 1) {
                int var5 = var4.field6920 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field6923 * var5 >> 8) + var4.field6919;
                    int var7 = (var4.field6909 * var5 >> 8) + var4.field6903;
                    int var8 = (var4.field6916 * var5 >> 8) + var4.field6913;
                    int var9 = (var4.field6917 * var5 >> 8) + var4.field6915;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field6914 == 2) {
                int var10 = arg0 - var4.field6920;
                if (var10 > 0) {
                    int var11 = (var4.field6923 * var10 >> 8) + var4.field6919;
                    int var12 = (var4.field6909 * var10 >> 8) + var4.field6903;
                    int var13 = (var4.field6916 * var10 >> 8) + var4.field6913;
                    int var14 = (var4.field6917 * var10 >> 8) + var4.field6915;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field6914 == 3) {
                int var15 = var4.field6919 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field6922 * var15 >> 8) + var4.field6920;
                    int var17 = (var4.field6910 * var15 >> 8) + var4.field6907;
                    int var18 = (var4.field6916 * var15 >> 8) + var4.field6913;
                    int var19 = (var4.field6917 * var15 >> 8) + var4.field6915;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field6914 == 4) {
                int var20 = arg2 - var4.field6919;
                if (var20 > 0) {
                    int var21 = (var4.field6922 * var20 >> 8) + var4.field6920;
                    int var22 = (var4.field6910 * var20 >> 8) + var4.field6907;
                    int var23 = (var4.field6916 * var20 >> 8) + var4.field6913;
                    int var24 = (var4.field6917 * var20 >> 8) + var4.field6915;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field6914 == 5) {
                int var25 = arg1 - var4.field6913;
                if (var25 > 0) {
                    int var26 = (var4.field6922 * var25 >> 8) + var4.field6920;
                    int var27 = (var4.field6910 * var25 >> 8) + var4.field6907;
                    int var28 = (var4.field6923 * var25 >> 8) + var4.field6919;
                    int var29 = (var4.field6909 * var25 >> 8) + var4.field6903;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)[Lll;")
    public static final class248[] method1324(int arg0) {
        field2967++;
        if (arg0 != 8) {
            field2969 = null;
        }
        return new class248[] { class396.field5558, class319.field4366, class334.field4581, class39.field674, class280.field3859 };
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class310 {

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public int field4244;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    private int field4241;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field4243 = 0;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method1756(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4248++;
        class238.method1382((byte) 94, arg5);
        int var7 = arg1;
        int var8 = arg5 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg4 >= class343.field4727 && arg4 <= class54.field753) {
            int[] var14 = class225.field3174[arg4];
            int var15 = class497.method2935(class175.field2497, arg3 - arg5, class382.field5379, -125);
            int var16 = class497.method2935(class175.field2497, arg3 + arg5, class382.field5379, -126);
            int var17 = class497.method2935(class175.field2497, arg3 - var8, class382.field5379, -128);
            int var18 = class497.method2935(class175.field2497, arg3 + var8, class382.field5379, -128);
            class419.method2511(var14, var15, arg2, var17, 68);
            class419.method2511(var14, var17, arg6, var18, -126);
            class419.method2511(var14, var18, arg2, var16, 108);
        }
        int var19 = -1;
        while (var7 < var9) {
            var13 += 2;
            var19 += 2;
            var12 += var19;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class131.field1813[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg4 - var9;
                int var21 = arg4 + var9;
                if (var21 >= class343.field4727 && var20 <= class54.field753) {
                    if (var9 < var8) {
                        int var22 = class131.field1813[var9];
                        int var23 = class497.method2935(class175.field2497, arg3 + var7, class382.field5379, -126);
                        int var24 = class497.method2935(class175.field2497, arg3 - var7, class382.field5379, -128);
                        int var25 = class497.method2935(class175.field2497, arg3 + var22, class382.field5379, arg1 ^ 0xFFFFFF81);
                        int var26 = class497.method2935(class175.field2497, arg3 - var22, class382.field5379, -127);
                        if (var21 <= class54.field753) {
                            int[] var27 = class225.field3174[var21];
                            class419.method2511(var27, var24, arg2, var26, -89);
                            class419.method2511(var27, var26, arg6, var25, 120);
                            class419.method2511(var27, var25, arg2, var23, arg1 - 125);
                        }
                        if (class343.field4727 <= var20) {
                            int[] var28 = class225.field3174[var20];
                            class419.method2511(var28, var24, arg2, var26, -47);
                            class419.method2511(var28, var26, arg6, var25, 85);
                            class419.method2511(var28, var25, arg2, var23, arg1 + 69);
                        }
                    } else {
                        int var29 = class497.method2935(class175.field2497, arg3 + var7, class382.field5379, -126);
                        int var30 = class497.method2935(class175.field2497, arg3 - var7, class382.field5379, -127);
                        if (class54.field753 >= var21) {
                            class419.method2511(class225.field3174[var21], var30, arg2, var29, arg1 - 50);
                        }
                        if (class343.field4727 <= var20) {
                            class419.method2511(class225.field3174[var20], var30, arg2, var29, -74);
                        }
                    }
                }
            }
            int var31 = arg4 - var7;
            int var32 = arg4 + var7;
            if (class343.field4727 <= var32 && var31 <= class54.field753) {
                int var33 = arg3 + var9;
                int var34 = arg3 - var9;
                if (var33 >= class382.field5379 && class175.field2497 >= var34) {
                    int var35 = class497.method2935(class175.field2497, var33, class382.field5379, -125);
                    int var36 = class497.method2935(class175.field2497, var34, class382.field5379, -128);
                    if (var8 > var7) {
                        int var37 = var7 > var11 ? class131.field1813[var7] : var11;
                        int var38 = class497.method2935(class175.field2497, arg3 + var37, class382.field5379, -128);
                        int var39 = class497.method2935(class175.field2497, arg3 - var37, class382.field5379, -126);
                        if (class54.field753 >= var32) {
                            int[] var40 = class225.field3174[var32];
                            class419.method2511(var40, var36, arg2, var39, -59);
                            class419.method2511(var40, var39, arg6, var38, 67);
                            class419.method2511(var40, var38, arg2, var35, -51);
                        }
                        if (class343.field4727 <= var31) {
                            int[] var41 = class225.field3174[var31];
                            class419.method2511(var41, var36, arg2, var39, -87);
                            class419.method2511(var41, var39, arg6, var38, arg1 + 124);
                            class419.method2511(var41, var38, arg2, var35, -122);
                        }
                    } else {
                        if (class54.field753 >= var32) {
                            class419.method2511(class225.field3174[var32], var36, arg2, var35, -80);
                        }
                        if (var31 >= class343.field4727) {
                            class419.method2511(class225.field3174[var31], var36, arg2, var35, 109);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "toString", descriptor = "()Ljava/lang/String;", line = 192)
    public final String toString() {
        field4246++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(II)V", line = 204)
    public class310(int arg0, int arg1) {
        this.field4244 = arg1;
        this.field4241 = arg0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Z", line = 215)
    public static final boolean method1757(int arg0, int arg1, int arg2) {
        field4242++;
        if (arg1 > -39) {
            return false;
        } else {
            return class425.method2539(arg2, arg0, -30001) | (arg0 & 0x60000) != 0 || class213.method1280(arg0, arg2, false) || class203.method1239(arg0, arg2, 116);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 226)
    public static final void method1758(int arg0) {
        if (arg0 >= -41) {
            return;
        }
        field4239++;
        int var1 = class378.field5322;
        int[] var2 = class95.field1321;
        for (int var3 = 0; var3 < var1; var3++) {
            class192 var4 = class309.field4234[var2[var3]];
            if (var4 != null) {
                class28.method195(var4, 18878, var4.method167(-1));
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)I", line = 254)
    public final int method1759(boolean arg0) {
        field4245++;
        return arg0 ? this.field4241 : 2;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 266)
    public static final String method1760(byte arg0, long arg1) {
        field4247++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            if (arg0 != -57) {
                return null;
            }
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class495.field7291[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }
}

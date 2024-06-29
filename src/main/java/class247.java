import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class247 {

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Z")
    public static boolean field3820 = false;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field3822 = 0;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "[I")
    public static int[] field3819 = new int[1000];

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field3825 = 0;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)V", line = 8)
    public static final void method1753(int arg0, boolean arg1) {
        if (arg1) {
            method1756(102, -45, 97);
        }
        if (class248.field3836 == arg0 && arg0 != 0) {
            class321 var2 = class54.field858[arg0];
            var2.method854(class223.field3591);
        }
        field3823++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILoj;ILjava/awt/Component;)Lem;", line = 26)
    public static final class11 method1754(int arg0, int arg1, class325 arg2, int arg3, Component arg4) {
        field3818++;
        if (class213.field3404 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class11 var5 = (class11) Class.forName("wg").getDeclaredConstructor().newInstance();
                var5.field201 = new int[(class141.field2238 ? 2 : 1) * 256];
                var5.field206 = arg1;
                var5.method100(arg4);
                var5.field214 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field214 > 16384) {
                    var5.field214 = 16384;
                }
                var5.method98(var5.field214);
                if (arg3 < class140.field2230 && class273.field4253 == null) {
                    class273.field4253 = new class213();
                    class273.field4253.field3391 = arg2;
                    arg2.method2237(class140.field2230, class273.field4253, (byte) 78);
                }
                if (class273.field4253 != null) {
                    if (class273.field4253.field3403[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class273.field4253.field3403[arg0] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class129 var7 = new class129(arg2, arg0);
                    var7.field201 = new int[(class141.field2238 ? 2 : 1) * 256];
                    var7.field206 = arg1;
                    var7.method100(arg4);
                    var7.field214 = 16384;
                    var7.method98(var7.field214);
                    if (class140.field2230 > 0 && class273.field4253 == null) {
                        class273.field4253 = new class213();
                        class273.field4253.field3391 = arg2;
                        arg2.method2237(class140.field2230, class273.field4253, (byte) 68);
                    }
                    if (class273.field4253 != null) {
                        if (class273.field4253.field3403[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class273.field4253.field3403[arg0] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class11();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIBII)V", line = 107)
    public static final void method1755(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field3821++;
        int var7 = arg0 - arg5;
        if (var7 < 0) {
            var7 = 0;
        }
        class55.method405(arg0, 20333);
        int var8 = 0;
        int var9 = -arg0;
        if (arg4 <= 25) {
            method1755(104, 15, 24, -56, (byte) -50, -65, -76);
        }
        int var10 = arg0;
        int var11 = var7;
        int var12 = -var7;
        int var13 = -1;
        int var14 = -1;
        if (arg2 >= class188.field2995 && arg2 <= class195.field3108) {
            int[] var15 = class102.field1729[arg2];
            int var16 = class308.method2129(arg6 - arg0, class116.field1888, class319.field4965, 1252946087);
            int var17 = class308.method2129(arg6 + arg0, class116.field1888, class319.field4965, 1252946087);
            int var18 = class308.method2129(arg6 - var7, class116.field1888, class319.field4965, 1252946087);
            int var19 = class308.method2129(arg6 + var7, class116.field1888, class319.field4965, 1252946087);
            class86.method614(arg1, -24891, var18, var16, var15);
            class86.method614(arg3, -24891, var19, var18, var15);
            class86.method614(arg1, -24891, var17, var19, var15);
        }
        while (var10 > var8) {
            var14 += 2;
            var12 += var14;
            var13 += 2;
            var9 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class26.field427[var11] = var8;
            }
            var8++;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                int var20 = arg2 - var10;
                int var21 = arg2 + var10;
                if (class188.field2995 <= var21 && class195.field3108 >= var20) {
                    if (var7 > var10) {
                        int var22 = class26.field427[var10];
                        int var23 = class308.method2129(arg6 + var8, class116.field1888, class319.field4965, 1252946087);
                        int var24 = class308.method2129(arg6 - var8, class116.field1888, class319.field4965, 1252946087);
                        int var25 = class308.method2129(arg6 + var22, class116.field1888, class319.field4965, 1252946087);
                        int var26 = class308.method2129(arg6 - var22, class116.field1888, class319.field4965, 1252946087);
                        if (var21 <= class195.field3108) {
                            int[] var27 = class102.field1729[var21];
                            class86.method614(arg1, -24891, var26, var24, var27);
                            class86.method614(arg3, -24891, var25, var26, var27);
                            class86.method614(arg1, -24891, var23, var25, var27);
                        }
                        if (class188.field2995 <= var20) {
                            int[] var28 = class102.field1729[var20];
                            class86.method614(arg1, -24891, var26, var24, var28);
                            class86.method614(arg3, -24891, var25, var26, var28);
                            class86.method614(arg1, -24891, var23, var25, var28);
                        }
                    } else {
                        int var29 = class308.method2129(arg6 + var8, class116.field1888, class319.field4965, 1252946087);
                        int var30 = class308.method2129(arg6 - var8, class116.field1888, class319.field4965, 1252946087);
                        if (var21 <= class195.field3108) {
                            class86.method614(arg1, -24891, var29, var30, class102.field1729[var21]);
                        }
                        if (var20 >= class188.field2995) {
                            class86.method614(arg1, -24891, var29, var30, class102.field1729[var20]);
                        }
                    }
                }
            }
            int var31 = arg2 + var8;
            int var32 = arg2 - var8;
            if (var31 >= class188.field2995 && var32 <= class195.field3108) {
                int var33 = arg6 + var10;
                int var34 = arg6 - var10;
                if (var33 >= class319.field4965 && var34 <= class116.field1888) {
                    int var35 = class308.method2129(var33, class116.field1888, class319.field4965, 1252946087);
                    int var36 = class308.method2129(var34, class116.field1888, class319.field4965, 1252946087);
                    if (var8 >= var7) {
                        if (class195.field3108 >= var31) {
                            class86.method614(arg1, -24891, var35, var36, class102.field1729[var31]);
                        }
                        if (class188.field2995 <= var32) {
                            class86.method614(arg1, -24891, var35, var36, class102.field1729[var32]);
                        }
                    } else {
                        int var37 = var11 < var8 ? class26.field427[var8] : var11;
                        int var38 = class308.method2129(arg6 + var37, class116.field1888, class319.field4965, 1252946087);
                        int var39 = class308.method2129(arg6 - var37, class116.field1888, class319.field4965, 1252946087);
                        if (class195.field3108 >= var31) {
                            int[] var40 = class102.field1729[var31];
                            class86.method614(arg1, -24891, var39, var36, var40);
                            class86.method614(arg3, -24891, var38, var39, var40);
                            class86.method614(arg1, -24891, var35, var38, var40);
                        }
                        if (class188.field2995 <= var32) {
                            int[] var41 = class102.field1729[var32];
                            class86.method614(arg1, -24891, var39, var36, var41);
                            class86.method614(arg3, -24891, var38, var39, var41);
                            class86.method614(arg1, -24891, var35, var38, var41);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V", line = 304)
    public static final void method1756(int arg0, int arg1, int arg2) {
        field3816++;
        class239.field3721++;
        class269.field4191.method246(false, 131);
        if (arg0 != -1941) {
            method1756(40, -120, -45);
        }
        class269.field4191.method739(arg2, 95);
        class269.field4191.method773(-79, arg1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[B", line = 320)
    public static final byte[] method1757(int arg0, int arg1) {
        field3817++;
        class159 var2 = (class159) class246.field3813.method2017(arg1 + arg1, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class86.method621((byte) -113, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class159(var3);
            class246.field3813.method2018((long) arg0, var2, arg1 ^ 0xFFFFFE58);
        }
        return var2.field2505;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 369)
    public static void method1758(byte arg0) {
        if (arg0 < 123) {
            method1756(34, 45, 71);
        }
        field3819 = null;
    }
}

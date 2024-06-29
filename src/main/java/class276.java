import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class276 extends class128 {

    @OriginalMember(owner = "client!od", name = "F", descriptor = "[B")
    public byte[] field4389;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "Lim;")
    public static class178 field4384 = null;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field4387 = 0;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field4386 = 0;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "Ljava/lang/String;")
    public static String field4391 = "Loaded input handler";

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field4393 = 0;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lfk;IILjava/awt/Component;B)Lca;")
    public static final class138 method1792(class52 arg0, int arg1, int arg2, Component arg3, byte arg4) {
        field4388++;
        if (class175.field2476 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class138 var5 = (class138) Class.forName("ab").getDeclaredConstructor().newInstance();
                var5.field1916 = arg1;
                var5.field1911 = new int[(class53.field760 ? 2 : 1) * 256];
                var5.method868(arg3);
                var5.field1921 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field1921 > 16384) {
                    var5.field1921 = 16384;
                }
                var5.method885(var5.field1921);
                if (class84.field1181 > 0 && class145.field2007 == null) {
                    class145.field2007 = new class34();
                    class145.field2007.field508 = arg0;
                    arg0.method325((byte) -128, class145.field2007, class84.field1181);
                }
                if (arg4 > -17) {
                    field4393 = -80;
                }
                if (class145.field2007 != null) {
                    if (class145.field2007.field511[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class145.field2007.field511[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class219 var6 = new class219(arg0, arg2);
                    var6.field1916 = arg1;
                    var6.field1911 = new int[(class53.field760 ? 2 : 1) * 256];
                    var6.method868(arg3);
                    var6.field1921 = 16384;
                    var6.method885(var6.field1921);
                    if (class84.field1181 > 0 && class145.field2007 == null) {
                        class145.field2007 = new class34();
                        class145.field2007.field508 = arg0;
                        arg0.method325((byte) -97, class145.field2007, class84.field1181);
                    }
                    if (class145.field2007 != null) {
                        if (class145.field2007.field511[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class145.field2007.field511[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class138();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
    public static void method1793(byte arg0) {
        field4391 = null;
        if (arg0 == -124) {
            field4384 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZZZZIIILgb;I)Lbf;")
    public static final class108 method1794(boolean arg0, boolean arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, class69 arg7, int arg8) {
        field4390++;
        class10 var9 = class281.method1822((byte) -101, arg8);
        if (arg5 > 1 && var9.field157 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg5 >= var9.field108[var11] && var9.field108[var11] != 0) {
                    var10 = var9.field157[var11];
                }
            }
            if (var10 != -1) {
                var9 = class281.method1822((byte) -113, var10);
            }
        }
        class66 var12 = var9.method66(arg7, (byte) -41);
        if (var12 == null) {
            return null;
        }
        class203 var13 = null;
        if (var9.field112 != -1) {
            var13 = (class203) method1794(false, true, true, true, 1, 10, 0, arg7, var9.field120);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field148 != -1) {
            var13 = (class203) method1794(false, true, false, true, arg4, arg5, arg6, arg7, var9.field159);
            if (var13 == null) {
                return null;
            }
        }
        int var14 = class266.field4277;
        int var15 = class266.field4275;
        int[] var16 = class266.field4282;
        int[] var17 = new int[4];
        class266.method1731(var17);
        class203 var18 = new class203(36, 32);
        class266.method1746(var18.field3058, 36, 32);
        class118.method765();
        class118.method769(16, 16);
        class118.field1693 = false;
        int var19 = var9.field123;
        if (arg2) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg4 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class118.field1690[var9.field110] * var19 >> 16;
        int var21 = class118.field1697[var9.field110] * var19 >> 16;
        var12.method428(0, var9.field149, var9.field176, var9.field110, var9.field133, (var21 + var9.field126) - (var12.method9() / 2), var20 - -var9.field126, -1L);
        if (arg4 >= 1) {
            var18.method1270(1);
            if (arg4 >= 2) {
                var18.method1270(16777215);
            }
            class266.method1746(var18.field3058, 36, 32);
        }
        if (arg6 != 0) {
            var18.method1279(arg6);
        }
        if (var9.field112 != -1) {
            var13.method694(0, 0);
        } else if (var9.field148 != -1) {
            class266.method1746(var13.field3058, 36, 32);
            var18.method694(0, 0);
            var18 = var13;
        }
        if (arg0 && (var9.field150 == 1 || arg5 != 1) && arg5 != -1) {
            class227.field3556.method206(class222.method1455(arg5, (byte) 9), 0, 9, 16776960, 1);
        }
        class266.method1746(var16, var15, var14);
        class266.method1727(var17);
        class118.method765();
        class118.field1693 = arg3;
        return var18;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "([B)V")
    public class276(byte[] arg0) {
        this.field4389 = arg0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4392++;
        if (class311.method2104(91, arg7)) {
            class197.method1244(arg5, arg6, arg3, class262.field4214[arg7], arg8, arg2, arg4, arg1, arg0, false);
        } else if (arg6 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class274.field4355[var9] = true;
            }
        } else {
            class274.field4355[arg6] = true;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
    public static final void method1796(boolean arg0) {
        class231.field3614.method809(108, 0);
        field4385++;
        class96.field1375++;
        class231.field3614.method1363(class246.method1611(100), -94);
        class231.field3614.method1385(class218.field3386, true);
        class231.field3614.method1385(class174.field2460, true);
        class231.field3614.method1363(class179.field2716, -123);
        if (arg0) {
            field4383 = -6;
        }
    }
}

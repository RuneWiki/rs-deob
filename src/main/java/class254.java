import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class254 {

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field4517 = 0;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Leg;")
    public static class37 field4512 = class174.method1167("<br>", 116);

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Leg;")
    public static class37 field4515 = class174.method1167(",Mcran)2titre charg-B", -59);

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "[I")
    public static int[] field4518 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "[I")
    public static int[] field4519 = new int[1000];

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "[Lmd;")
    public static class208[] field4520;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public static void method1734(int arg0) {
        field4518 = null;
        field4519 = null;
        field4512 = null;
        field4520 = null;
        field4515 = null;
        if (arg0 < 71) {
            method1738(19, -18, 123);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIII)V")
    public static final void method1735(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class89 var5 = (class89) class127.field2130.method1566(-3); var5 != null; var5 = (class89) class127.field2130.method1570(3)) {
            class196.method1362(arg3, arg1, (byte) 104, var5, arg4, arg0);
        }
        field4521++;
        for (class89 var6 = (class89) class175.field2928.method1566(-3); var6 != null; var6 = (class89) class175.field2928.method1570(3)) {
            byte var10 = 1;
            if (var6.field1418.field1789 == var6.field1418.field1767) {
                var10 = 0;
            } else if (var6.field1418.field1789 == var6.field1418.field1764) {
                var10 = 2;
            }
            if (var6.field1413 != var10) {
                int var11 = class247.method1708(26421, var6.field1418);
                if (var6.field1417 != var11) {
                    if (var6.field1410 != null) {
                        class127.field2127.method1514(var6.field1410);
                        var6.field1410 = null;
                    }
                    var6.field1417 = var11;
                }
                var6.field1413 = var10;
            }
            var6.field1402 = var6.field1418.field1799;
            var6.field1414 = var6.field1418.field1799 + (var6.field1418.method763(-1) * 64);
            var6.field1403 = var6.field1418.field1793;
            var6.field1408 = var6.field1418.field1793 + (var6.field1418.method763(-1) * 64);
            class196.method1362(arg3, arg1, (byte) 104, var6, arg4, arg0);
        }
        if (arg2 <= 68) {
            method1736((Component) null, 100, (class207) null, 127, (byte) 112);
        }
        for (class89 var7 = (class89) class154.field2584.method993(-15322); var7 != null; var7 = (class89) class154.field2584.method988(4586)) {
            byte var8 = 1;
            if (var7.field1415.field1789 == var7.field1415.field1767) {
                var8 = 0;
            } else if (var7.field1415.field1789 == var7.field1415.field1764) {
                var8 = 2;
            }
            if (var7.field1413 != var8) {
                int var9 = class285.method1911(-50, var7.field1415);
                if (var7.field1417 != var9) {
                    if (var7.field1410 != null) {
                        class127.field2127.method1514(var7.field1410);
                        var7.field1410 = null;
                    }
                    var7.field1417 = var9;
                }
                var7.field1413 = var8;
            }
            var7.field1402 = var7.field1415.field1799;
            var7.field1414 = var7.field1415.field1799 + var7.field1415.method763(-1) * 64;
            var7.field1403 = var7.field1415.field1793;
            var7.field1408 = var7.field1415.field1793 + (var7.field1415.method763(-1) * 64);
            class196.method1362(arg3, arg1, (byte) 104, var7, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/awt/Component;ILlb;IB)Lsc;")
    public static final class131 method1736(Component arg0, int arg1, class207 arg2, int arg3, byte arg4) {
        field4513++;
        if (class215.field3720 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class131 var5 = (class131) Class.forName("uk").getDeclaredConstructor().newInstance();
                var5.field2205 = arg3;
                var5.field2194 = new int[(class225.field3868 ? 2 : 1) * 256];
                var5.method631(arg0);
                var5.field2211 = (arg3 & 0xFFFFFC00) + 1024;
                if (arg4 != 60) {
                    return null;
                }
                if (var5.field2211 > 16384) {
                    var5.field2211 = 16384;
                }
                var5.method628(var5.field2211);
                if (class115.field1948 > 0 && class247.field4441 == null) {
                    class247.field4441 = new class222();
                    class247.field4441.field3819 = arg2;
                    arg2.method1423(class247.field4441, 122, class115.field1948);
                }
                if (class247.field4441 != null) {
                    if (class247.field4441.field3821[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class247.field4441.field3821[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class283 var6 = new class283(arg2, arg1);
                    var6.field2205 = arg3;
                    var6.field2194 = new int[(class225.field3868 ? 2 : 1) * 256];
                    var6.method631(arg0);
                    var6.field2211 = 16384;
                    var6.method628(var6.field2211);
                    if (class115.field1948 > 0 && class247.field4441 == null) {
                        class247.field4441 = new class222();
                        class247.field4441.field3819 = arg2;
                        arg2.method1423(class247.field4441, -81, class115.field1948);
                    }
                    if (class247.field4441 != null) {
                        if (class247.field4441.field3821[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class247.field4441.field3821[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class131();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZI[Lpe;II)V")
    public static final void method1737(int arg0, boolean arg1, int arg2, class237[] arg3, int arg4, int arg5) {
        if (arg2 != -5260) {
            field4519 = null;
        }
        for (int var6 = 0; var6 < arg3.length; var6++) {
            class237 var7 = arg3[var6];
            if (var7 != null && var7.field4171 == arg0) {
                class35.method204(arg1, var7, (byte) 126, arg5, arg4);
                class273.method1825(arg4, false, var7, arg5);
                if (var7.field4136 > var7.field4132 - var7.field4067) {
                    var7.field4136 = var7.field4132 - var7.field4067;
                }
                if (var7.field4136 < 0) {
                    var7.field4136 = 0;
                }
                if (var7.field4122 > (var7.field4090 - var7.field4206)) {
                    var7.field4122 = var7.field4090 - var7.field4206;
                }
                if (var7.field4122 < 0) {
                    var7.field4122 = 0;
                }
                if (var7.field4228 == 0) {
                    class272.method1823(96, arg1, var7);
                }
            }
        }
        field4516++;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)Lvb;")
    public static final class68 method1738(int arg0, int arg1, int arg2) {
        class111 var3 = class286.field5048[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class68 var4 = var3.field1870;
            var3.field1870 = null;
            return var4;
        }
    }
}

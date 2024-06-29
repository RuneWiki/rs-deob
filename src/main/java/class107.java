import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class107 {

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field1550 = 0;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "Ltd;")
    public static class210 field1553 = new class210();

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Z")
    public static boolean field1555;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "[[[I")
    public static int[][][] field1556;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
    public static final void method702(int arg0, int arg1, int arg2) {
        field1548++;
        class97 var3 = class162.field2335[class163.field2364][arg1][arg2];
        if (var3 == null) {
            class263.method1748(class163.field2364, arg1, arg2);
            return;
        }
        int var4 = -99999999;
        class274 var5 = null;
        if (arg0 != 30926) {
            method707(67);
        }
        for (class274 var6 = (class274) var3.method656(arg0 - 30825); var6 != null; var6 = (class274) var3.method650(124)) {
            class273 var13 = class259.method1735(var6.field4404.field903, -14667);
            int var14 = var13.field4381;
            if (var13.field4387 == 1) {
                var14 = (var6.field4404.field899 + 1) * var14;
            }
            if (var14 > var4) {
                var5 = var6;
                var4 = var14;
            }
        }
        if (var5 == null) {
            class263.method1748(class163.field2364, arg1, arg2);
            return;
        }
        var3.method657(var5, (byte) 121);
        class274 var7 = (class274) var3.method656(arg0 ^ 0x78A3);
        class59 var8 = null;
        class59 var9 = null;
        while (var7 != null) {
            class59 var12 = var7.field4404;
            if (var5.field4404.field903 != var12.field903) {
                if (var8 == null) {
                    var8 = var12;
                }
                if (var8.field903 != var12.field903 && var9 == null) {
                    var9 = var12;
                }
            }
            var7 = (class274) var3.method650(127);
        }
        long var10 = (long) ((arg2 << 7) + arg1 + 1610612736);
        class103.method687(class163.field2364, arg1, arg2, class81.method542(arg1 * 128 + 64, -1, class163.field2364, arg2 * 128 + 64), var5.field4404, var10, var8, var9);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZII)V")
    public static final void method703(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class142.field2061 = arg4;
        class93.field1418 = arg0;
        field1547++;
        if (arg2) {
            method704(64, 47, -18, 34, (class219) null, -57, 59L, 52, 107, 22, -8);
        }
        class254.field3857 = arg1;
        class93.field1412 = arg3;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIILtk;IJIIII)Z")
    public static final boolean method704(int arg0, int arg1, int arg2, int arg3, class219 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class191.method1228(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIZZI)Lij;")
    public static final class69 method705(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        field1549++;
        int var6 = (arg2 << 17) + ((arg3 ? 65536 : 0) + arg5 + (arg0 << 19));
        long var8 = (long) arg1 * 3147483667L + ((long) var6 * 3849834839L);
        class69 var10 = (class69) class61.field931.method263((byte) 111, var8);
        if (var10 != null) {
            return var10;
        }
        class18.field263 = false;
        class69 var11 = class66.method453(arg3, arg4, arg0, arg2, arg1, -3232, false, arg5);
        if (var11 != null && !class18.field263) {
            class61.field931.method255(var8, var11, (byte) -126);
        }
        return var11;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method706(int arg0) {
        if (arg0 != 5196) {
            method707(-4);
        }
        field1556 = null;
        field1553 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public static final void method707(int arg0) {
        field1551++;
        if (class162.field2341 == 0) {
            return;
        }
        if (arg0 != 2) {
            field1554 = -82;
        }
        try {
            if ((++class179.field2561) > 1500) {
                if (class10.field180 != null) {
                    class10.field180.method362(false);
                    class10.field180 = null;
                }
                if (class151.field2170 >= 1) {
                    class162.field2341 = 0;
                    class118.field1741 = -5;
                    return;
                }
                class179.field2561 = 0;
                if (class88.field1347 == class43.field614) {
                    class88.field1347 = class255.field3868;
                } else {
                    class88.field1347 = class43.field614;
                }
                class162.field2341 = 1;
                class151.field2170++;
            }
            if (class162.field2341 == 1) {
                class182.field2600 = class163.field2378.method550(class282.field4498, 32606, class88.field1347);
                class162.field2341 = 2;
            }
            if (class162.field2341 == 2) {
                if (class182.field2600.field3588 == 2) {
                    throw new IOException();
                }
                if (class182.field2600.field3588 != 1) {
                    return;
                }
                class10.field180 = new class54((Socket) class182.field2600.field3585, class163.field2378);
                class182.field2600 = null;
                class10.field180.method356((byte) 13, class95.field1451.field1629, 0, class95.field1451.field1673);
                if (class217.field3198 != null) {
                    class217.field3198.method1455(false);
                }
                if (class240.field3599 != null) {
                    class240.field3599.method1455(false);
                }
                int var1 = class10.field180.method358(100);
                if (class217.field3198 != null) {
                    class217.field3198.method1455(false);
                }
                if (class240.field3599 != null) {
                    class240.field3599.method1455(false);
                }
                if (var1 != 101) {
                    class118.field1741 = var1;
                    class162.field2341 = 0;
                    class10.field180.method362(false);
                    class10.field180 = null;
                    return;
                }
                class162.field2341 = 3;
            }
            if (class162.field2341 == 3 && class10.field180.method357((byte) -107) >= 2) {
                int var2 = class10.field180.method358(42) << 8 | class10.field180.method358(69);
                class43.method295(arg0 + 78, var2);
                if (class29.field415 == -1) {
                    class118.field1741 = 6;
                    class162.field2341 = 0;
                    class10.field180.method362(false);
                    class10.field180 = null;
                } else {
                    class162.field2341 = 0;
                    class10.field180.method362(false);
                    class10.field180 = null;
                    class42.method292(arg0 ^ 0xFFFFB441);
                }
            }
        } catch (IOException var3) {
            if (class10.field180 != null) {
                class10.field180.method362(false);
                class10.field180 = null;
            }
            if (class151.field2170 >= 1) {
                class118.field1741 = -4;
                class162.field2341 = 0;
            } else {
                class179.field2561 = 0;
                class162.field2341 = 1;
                if (class88.field1347 == class43.field614) {
                    class88.field1347 = class255.field3868;
                } else {
                    class88.field1347 = class43.field614;
                }
                class151.field2170++;
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class125 {

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "Lbd;")
    public static class162 field2275 = class17.method142(0, "rot:");

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "[I")
    public static int[] field2277 = new int[256];

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Lbd;")
    public static class162 field2280 = class17.method142(0, ")1");

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V", line = 5)
    public static final void method1010(int arg0, int arg1, int arg2) {
        field2281++;
        if (arg0 > -50) {
            method1013((byte) -8);
        }
        for (int var3 = 0; var3 < class213.field3573; var3++) {
            class266 var4 = class83.method644(-117, var3);
            if (var4 != null) {
                int var5 = var4.field4439;
                if (var5 >= 0 && !class312.field5271.method153(var5, (byte) 120)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field4431 >= 0) {
                    int var6 = var4.field4431;
                    int var7 = (var6 & 0x7F) + arg2;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg1 + var6 & 0xFC00) - (-(var6 & 0x380) - var7);
                    var9 = class312.field5264[class89.method679(var8, 96, -52)];
                } else if (var5 >= 0) {
                    var9 = class312.field5264[class89.method679(class312.field5271.method157(var5, false), 96, -87)];
                } else if (var4.field4426 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field4426;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg1 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class312.field5264[class89.method679(var12, 96, -88)];
                }
                class222.field3713[var3 + 1] = var9;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[BI)I", line = 91)
    public static final int method1011(int arg0, byte[] arg1, int arg2) {
        field2276++;
        int var3 = -28 / ((23 - arg0) / 55);
        return class133.method1053((byte) -92, arg1, arg2, 0);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZIIII)Ldc;", line = 101)
    public static final class71 method1012(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2279++;
        int var6 = (arg2 << 19) + (arg5 << 17) + arg0 + (arg1 ? 65536 : 0);
        long var8 = (long) arg4 * 3147483667L + ((long) var6 * 3849834839L);
        if (arg3 != 25) {
            method1014(-61);
        }
        class71 var10 = (class71) class126.field2294.method1536(var8, -105);
        if (var10 != null) {
            return var10;
        }
        class312.field5258 = false;
        class71 var11 = class289.method2006(arg5, false, false, arg2, arg3 ^ 0x3F, arg0, arg4, arg1);
        if (var11 != null && !class312.field5258) {
            class126.field2294.method1532(var8, -61, var11);
        }
        return var11;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 139)
    public static final void method1013(byte arg0) {
        field2278++;
        class235.method1676((byte) 73);
        System.gc();
        class122.method984(25, 2047);
        if (arg0 != 12) {
            field2280 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 160)
    public static void method1014(int arg0) {
        if (arg0 != 256) {
            method1011(-98, (byte[]) null, 96);
        }
        field2275 = null;
        field2280 = null;
        field2277 = null;
    }
}

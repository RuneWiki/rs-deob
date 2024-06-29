import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class193 extends class101 {

    @OriginalMember(owner = "client!cw", name = "s", descriptor = "Ltm;")
    public class412 field2590 = new class412();

    @OriginalMember(owner = "client!cw", name = "q", descriptor = "Lhv;")
    public static class546 field2588 = new class546(1, 2);

    @OriginalMember(owner = "client!cw", name = "n", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!cw", name = "p", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!cw", name = "r", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!cw", name = "t", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!cw", name = "o", descriptor = "J")
    public static long field2586;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(III)V", line = 3)
    public static final void method1329(int arg0, int arg1, int arg2) {
        field2585++;
        if (class605.field8218 == 1) {
            class249.method1675(class665.field9190, arg0, 114, arg1);
        } else if (class605.field8218 == 2) {
            if (class130.field1934) {
                class286.method1827(class621.method3410(-2) + arg0, class550.method3117(99) + arg1, -81);
            } else {
                class286.method1827(arg0, arg1, -118);
            }
        }
        class605.field8218 = 0;
        class665.field9190 = null;
        int var3 = -69 / ((arg2 + 76) / 44);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIII)V", line = 28)
    public static final void method1330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 0) {
            field2588 = null;
        }
        field2589++;
        for (int var6 = arg3; var6 <= arg5; var6++) {
            class138.method1069(class785.field10808[var6], (byte) -38, arg0, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V", line = 48)
    public static void method1331(byte arg0) {
        field2588 = null;
        if (arg0 != 31) {
            method1331((byte) -1);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I[B)V", line = 63)
    public static final void method1332(int arg0, byte[] arg1) {
        field2587++;
        class376 var2 = new class376(arg1);
        while (true) {
            int var3;
            label49: do {
                while (true) {
                    while (true) {
                        var3 = var2.method2398(arg0 - 1372747256);
                        if (var3 == 0) {
                            if (arg0 != 0) {
                                method1331((byte) 94);
                                return;
                            }
                            return;
                        }
                        if (var3 == 1) {
                            int[] var8 = class477.field6627 = new int[6];
                            var8[0] = var2.method2359(-1);
                            var8[1] = var2.method2359(arg0 - 1);
                            var8[2] = var2.method2359(arg0 - 1);
                            var8[3] = var2.method2359(-1);
                            var8[4] = var2.method2359(-1);
                            var8[5] = var2.method2359(-1);
                        } else {
                            if (var3 != 4) {
                                continue label49;
                            }
                            int var6 = var2.method2398(arg0 ^ 0xAE2D8A08);
                            class637.field8872 = new int[var6];
                            for (int var7 = 0; var7 < var6; var7++) {
                                class637.field8872[var7] = var2.method2359(-1);
                                if (class637.field8872[var7] == 65535) {
                                    class637.field8872[var7] = -1;
                                }
                            }
                        }
                    }
                }
            } while (var3 != 5);
            int var4 = var2.method2398(-1372747256);
            class213.field2815 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                class213.field2815[var5] = var2.method2359(-1);
                if (class213.field2815[var5] == 65535) {
                    class213.field2815[var5] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(BII)Z", line = 142)
    public static final boolean method1333(byte arg0, int arg1, int arg2) {
        field2591++;
        if (arg0 > -16) {
            method1332(-61, null);
        }
        return (arg2 & 0x800) != 0;
    }
}

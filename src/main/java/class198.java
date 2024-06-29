import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class198 {

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field2928 = 1;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "[I")
    public static int[] field2929 = new int[1000];

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    public static int field2931 = 12;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "[[B")
    public static byte[][] field2930;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V", line = 5)
    public static void method1369(int arg0) {
        field2929 = null;
        field2930 = null;
        int var1 = 106 / ((arg0 + 37) / 39);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILjava/lang/String;III)V", line = 16)
    public static final void method1370(int arg0, String arg1, int arg2, int arg3, int arg4) {
        field2927++;
        if (arg3 != -31859) {
            method1372(false);
        }
        class172 var5 = class77.method678(arg4, 126, arg0);
        if (var5 == null) {
            return;
        }
        if (var5.field2610 != null) {
            class472 var6 = new class472();
            var6.field6640 = arg2;
            var6.field6649 = var5.field2610;
            var6.field6642 = var5;
            var6.field6644 = arg1;
            class457.method2745(var6);
        }
        boolean var7 = true;
        if (var5.field2624 != 0) {
            var7 = class484.method2850(false, var5);
        }
        if (!var7 || !client.method547(var5).method871((byte) -113, arg2 - 1)) {
            return;
        }
        if (arg2 == 1) {
            class9.field66++;
            class336.method2111(class200.field2961, 119);
            class77.method679(30983, arg0, arg4, var5.field2483);
        }
        if (arg2 == 2) {
            class336.method2111(class262.field3771, 123);
            class143.field1990++;
            class77.method679(arg3 + 62842, arg0, arg4, var5.field2483);
        }
        if (arg2 == 3) {
            class416.field5716++;
            class336.method2111(class465.field6548, arg3 + 31971);
            class77.method679(30983, arg0, arg4, var5.field2483);
        }
        if (arg2 == 4) {
            class336.method2111(class217.field3131, arg3 + 31983);
            class98.field1394++;
            class77.method679(30983, arg0, arg4, var5.field2483);
        }
        if (arg2 == 5) {
            class107.field1501++;
            class336.method2111(class127.field1733, 119);
            class77.method679(30983, arg0, arg4, var5.field2483);
        }
        if (arg2 == 6) {
            class92.field1303++;
            class336.method2111(class185.field2791, arg3 + 31947);
            class77.method679(arg3 ^ 0xFFFFFA8A, arg0, arg4, var5.field2483);
        }
        if (arg2 == 7) {
            class166.field2410++;
            class336.method2111(class30.field310, arg3 ^ 0xFFFF83F7);
            class77.method679(30983, arg0, arg4, var5.field2483);
        }
        if (arg2 == 8) {
            class336.method2111(class212.field3090, 100);
            class297.field4202++;
            class77.method679(arg3 ^ 0xFFFFFA8A, arg0, arg4, var5.field2483);
        }
        if (arg2 == 9) {
            class336.method2111(class312.field4420, 123);
            class158.field2249++;
            class77.method679(arg3 + 62842, arg0, arg4, var5.field2483);
        }
        if (arg2 == 10) {
            class336.method2111(class143.field1988, 123);
            class88.field1246++;
            class77.method679(30983, arg0, arg4, var5.field2483);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZIZLml;Lml;I)I", line = 145)
    public static final int method1371(int arg0, boolean arg1, int arg2, boolean arg3, class21 arg4, class21 arg5, int arg6) {
        field2925++;
        if (arg6 != 14182) {
            field2924 = 39;
        }
        int var7 = class227.method1550(arg2, arg4, arg3, arg5, arg6 - 14182);
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var8 = class227.method1550(arg0, arg4, arg1, arg5, 0);
            return arg1 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)Z", line = 179)
    public static final boolean method1372(boolean arg0) {
        for (int var1 = class350.field4832; var1 < class310.field4398; var1++) {
            class52[][] var2 = class385.field5285[var1];
            for (int var3 = -class4.field30; var3 <= 0; var3++) {
                int var4 = class409.field5607 + var3;
                int var5 = class409.field5607 - var3;
                if (var4 >= class316.field4461 || var5 < class106.field1497) {
                    for (int var6 = -class4.field30; var6 <= 0; var6++) {
                        int var7 = class54.field811 + var6;
                        int var8 = class54.field811 - var6;
                        if (var4 >= class316.field4461) {
                            if (var7 >= client.field877) {
                                class52 var9 = var2[var4][var7];
                                if (var9 != null && var9.field769) {
                                    class412.field5643 = arg0;
                                    class291.field4124.method139(var9, 0);
                                    class291.field4124.method136(-23413);
                                }
                            }
                            if (var8 < class380.field5224) {
                                class52 var10 = var2[var4][var8];
                                if (var10 != null && var10.field769) {
                                    class412.field5643 = arg0;
                                    class291.field4124.method139(var10, 0);
                                    class291.field4124.method136(-23413);
                                }
                            }
                        }
                        if (var5 < class106.field1497) {
                            if (var7 >= client.field877) {
                                class52 var11 = var2[var5][var7];
                                if (var11 != null && var11.field769) {
                                    class412.field5643 = arg0;
                                    class291.field4124.method139(var11, 0);
                                    class291.field4124.method136(-23413);
                                }
                            }
                            if (var8 < class380.field5224) {
                                class52 var12 = var2[var5][var8];
                                if (var12 != null && var12.field769) {
                                    class412.field5643 = arg0;
                                    class291.field4124.method139(var12, 0);
                                    class291.field4124.method136(-23413);
                                }
                            }
                        }
                        if (class466.field6563 == 0) {
                            if (class296.field4181) {
                                class291.field4124.method142((byte) -83, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lnl;B)V", line = 292)
    public static final void method1373(class435 arg0, byte arg1) {
        field2926++;
        class108.field1517 = 0;
        if (arg1 < 117) {
            return;
        }
        class189.field2811 = 0;
        class384.field5274 = new class262();
        class163.field2378 = new class474[1024];
        class340.method2127(arg0, true);
        class221.method1521((byte) -89, arg0);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class265 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field4265 = 0;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "[Llh;")
    public static class200[] field4273 = new class200[32768];

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "[I")
    public static int[] field4274 = new int[1000];

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4268 = "Ok";

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "F")
    public static float field4269;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "Leh;")
    public static class137 field4271;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
    public static void method1785(boolean arg0) {
        if (arg0) {
            method1785(false);
        }
        field4274 = null;
        field4271 = null;
        field4273 = null;
        field4268 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([IZ[ILbl;[I)V")
    public static final void method1786(int[] arg0, boolean arg1, int[] arg2, class259 arg3, int[] arg4) {
        if (arg1) {
            return;
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var8 != 0 && arg3.field3839.length > var9) {
                if ((var8 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field3839[var9] = null;
                    } else {
                        class165 var10 = class208.method1458((byte) 99, var6);
                        int var11 = var10.field2647;
                        class201 var12 = arg3.field3839[var9];
                        if (var12 != null) {
                            if (var12.field3180 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field3839[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3184 = 1;
                                    var12.field3177 = 0;
                                    var12.field3178 = 0;
                                    var12.field3188 = var7;
                                    var12.field3187 = 0;
                                    class221.method1562(0, arg3.field3820, arg3.field3818, var10, (byte) 47, class286.field4571 == arg3);
                                } else if (var11 == 2) {
                                    var12.field3178 = 0;
                                }
                            } else if (var10.field2646 >= class208.method1458((byte) -83, var12.field3180).field2646) {
                                var12 = arg3.field3839[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class201 var13 = arg3.field3839[var9] = new class201();
                            var13.field3187 = 0;
                            var13.field3178 = 0;
                            var13.field3177 = 0;
                            var13.field3180 = var6;
                            var13.field3184 = 1;
                            var13.field3188 = var7;
                            class221.method1562(0, arg3.field3820, arg3.field3818, var10, (byte) 47, class286.field4571 == arg3);
                        }
                    }
                }
                var9++;
                var8 >>>= 0x1;
            }
        }
        field4272++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIILwb;IIII)V")
    public static final void method1787(int arg0, int arg1, int arg2, class123 arg3, int arg4, int arg5, int arg6, int arg7) {
        field4267++;
        if (class282.field4475) {
            class135.field2138 = 32;
        } else {
            class135.field2138 = 0;
        }
        if (arg0 != -16) {
            field4274 = null;
        }
        class282.field4475 = false;
        if (class113.field1626 != 0) {
            if (arg2 <= arg6 && arg6 < arg2 + 16 && arg5 >= arg1 && (arg1 + 16) > arg5) {
                arg3.field1872 -= 4;
                class129.method875((byte) -21, arg3);
            } else if (arg6 >= arg2 && arg6 < (arg2 + 16) && arg1 + arg4 - 16 <= arg5 && arg1 + arg4 > arg5) {
                arg3.field1872 += 4;
                class129.method875((byte) -21, arg3);
            } else if (arg6 >= (arg2 - class135.field2138) && arg2 - (-class135.field2138 - 16) > arg6 && arg5 >= (arg1 + 16) && arg5 < (arg1 + arg4 - 16)) {
                int var8 = (arg4 - 32) * arg4 / arg7;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg5 - arg1 - (var8 / 2) - 16;
                int var10 = arg4 - var8 - 32;
                arg3.field1872 = (arg7 - arg4) * var9 / var10;
                class129.method875((byte) -21, arg3);
                class282.field4475 = true;
            }
        }
        if (class130.field2088 == 0) {
            return;
        }
        int var11 = arg3.field1879;
        if ((arg2 - var11) <= arg6 && arg5 >= arg1 && arg2 + 16 > arg6 && arg5 <= arg1 + arg4) {
            arg3.field1872 += class130.field2088 * 45;
            class129.method875((byte) -21, arg3);
            return;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIB)V")
    public static final void method1788(int arg0, int arg1, byte arg2) {
        field4270++;
        int var3 = -94 % ((arg2 + 8) / 42);
        for (int var4 = 0; var4 < class42.field534; var4++) {
            class225 var5 = class224.method1585(var4, (byte) -120);
            if (var5 != null) {
                int var6 = var5.field3619;
                if (var6 >= 0 && !class174.field2756.method781(19146, var6)) {
                    var6 = -1;
                }
                int var10;
                if (var5.field3625 >= 0) {
                    int var11 = var5.field3625;
                    int var12 = (var11 & 0x7F) + arg1;
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 127) {
                        var12 = 127;
                    }
                    int var13 = (arg0 + var11 & 0xFC00) + (var11 & 0x380) + var12;
                    var10 = class174.field2764[class111.method718((byte) -108, var13, 96)];
                } else if (var6 >= 0) {
                    var10 = class174.field2764[class111.method718((byte) -108, class174.field2756.method779(-7078, var6), 96)];
                } else if (var5.field3614 == -1) {
                    var10 = -1;
                } else {
                    int var7 = var5.field3614;
                    int var8 = (var7 & 0x7F) + arg1;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg0 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var10 = class174.field2764[class111.method718((byte) -108, var9, 96)];
                }
                class177.field2807[var4 + 1] = var10;
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class609 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "F")
    public static float field8462;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field8461;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field8463;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field8467;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Lga;")
    public static class332 field8466;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static final void method3377(byte arg0) {
        for (int var1 = 0; var1 < class289.field3820; var1++) {
            int var2 = class389.field5220[var1];
            class407 var3 = (class407) class296.field3921.method3057(arg0 - 43, (long) var2);
            if (var3 != null) {
                class351 var4 = var3.field5354;
                class665.method3791(var4, var4.field4671.field5105, 6144);
            }
        }
        if (arg0 != 44) {
            method3377((byte) -81);
        }
        field8461++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method3378(int arg0) {
        int var1 = 108 / ((-arg0 - 68) / 35);
        field8466 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method3379(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field8464++;
        if ((arg5 ? class602.field8408.field4320 : class602.field8408.field4310) != 0 && arg2 != 0 && class413.field5414 < 50 && arg0 != -1) {
            class67.field824[class413.field5414++] = new class480((byte) (arg5 ? 3 : 2), arg0, arg2, arg1, arg3, 0);
        }
        if (arg4 > -72) {
            method3380(null, false);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljd;Z)V")
    public static final void method3380(class537 arg0, boolean arg1) {
        field8467++;
        arg0.method3011(-1);
        int var2 = 0;
        for (int var3 = 0; var3 < class426.field5750; var3++) {
            int var15 = class586.field8104[var3];
            if ((class376.field4975[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class376.field4975[var15] = (byte) class665.method3789(class376.field4975[var15], 2);
                    var2--;
                } else {
                    int var16 = arg0.method3008(false, 1);
                    if (var16 == 0) {
                        var2 = class640.method3544(5, arg0);
                        class376.field4975[var15] = (byte) class665.method3789(class376.field4975[var15], 2);
                    } else {
                        class78.method425(arg0, var15, 108);
                    }
                }
            }
        }
        arg0.method3016(119);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method3011(-1);
        for (int var4 = 0; var4 < class426.field5750; var4++) {
            int var13 = class586.field8104[var4];
            if ((class376.field4975[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class376.field4975[var13] = (byte) class665.method3789(class376.field4975[var13], 2);
                    var2--;
                } else {
                    int var14 = arg0.method3008(false, 1);
                    if (var14 == 0) {
                        var2 = class640.method3544(5, arg0);
                        class376.field4975[var13] = (byte) class665.method3789(class376.field4975[var13], 2);
                    } else {
                        class78.method425(arg0, var13, 94);
                    }
                }
            }
        }
        arg0.method3016(108);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method3011(-1);
        if (!arg1) {
            return;
        }
        for (int var5 = 0; var5 < class293.field3900; var5++) {
            int var11 = class306.field4084[var5];
            if ((class376.field4975[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class376.field4975[var11] = (byte) class665.method3789(class376.field4975[var11], 2);
                    var2--;
                } else {
                    int var12 = arg0.method3008(false, 1);
                    if (var12 == 0) {
                        var2 = class640.method3544(5, arg0);
                        class376.field4975[var11] = (byte) class665.method3789(class376.field4975[var11], 2);
                    } else if (class696.method3932(var11, 255, arg0)) {
                        class376.field4975[var11] = (byte) class665.method3789(class376.field4975[var11], 2);
                    }
                }
            }
        }
        arg0.method3016(65);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method3011(-1);
        for (int var6 = 0; var6 < class293.field3900; var6++) {
            int var9 = class306.field4084[var6];
            if ((class376.field4975[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class376.field4975[var9] = (byte) class665.method3789(class376.field4975[var9], 2);
                    var2--;
                } else {
                    int var10 = arg0.method3008(!arg1, 1);
                    if (var10 == 0) {
                        var2 = class640.method3544(5, arg0);
                        class376.field4975[var9] = (byte) class665.method3789(class376.field4975[var9], 2);
                    } else if (class696.method3932(var9, 255, arg0)) {
                        class376.field4975[var9] = (byte) class665.method3789(class376.field4975[var9], 2);
                    }
                }
            }
        }
        arg0.method3016(59);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class293.field3900 = 0;
        class426.field5750 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class376.field4975[var7] = (byte) (class376.field4975[var7] >> 1);
            class573 var8 = class513.field7145[var7];
            if (var8 == null) {
                class306.field4084[class293.field3900++] = var7;
            } else {
                class586.field8104[class426.field5750++] = var7;
            }
        }
    }
}

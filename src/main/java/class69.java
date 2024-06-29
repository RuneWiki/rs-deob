import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class69 {

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "[I")
    public static int[] field756 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "[I")
    public static int[] field757 = new int[3];

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()V", line = 14)
    public static final void method516() {
        for (int var0 = class170.field2119; var0 < class307.field4170; var0++) {
            for (int var1 = 0; var1 < class68.field743; var1++) {
                for (int var2 = 0; var2 < class480.field6629; var2++) {
                    class624 var3 = class77.field947[var0][var1][var2];
                    if (var3 != null) {
                        class719 var4 = var3.field8728;
                        class719 var5 = var3.field8737;
                        if (var4 != null && var4.method157((byte) -105)) {
                            class639.method3597(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method157((byte) -90)) {
                                class639.method3597(var5, var0, var1, var2, 1, 1);
                                var5.method162(var4, (byte) -106, false, 0, class22.field158, 0, 0);
                                var5.method150((byte) -73);
                            }
                            var4.method150((byte) -73);
                        }
                        for (class603 var6 = var3.field8729; var6 != null; var6 = var6.field8413) {
                            class752 var8 = var6.field8410;
                            if (var8 != null && var8.method157((byte) -128)) {
                                class639.method3597(var8, var0, var1, var2, var8.field10426 + 1 - var8.field10422, var8.field10425 - var8.field10421 + 1);
                                var8.method150((byte) -73);
                            }
                        }
                        class142 var7 = var3.field8736;
                        if (var7 != null && var7.method157((byte) -93)) {
                            class756.method4203(var7, var0, var1, var2);
                            var7.method150((byte) -73);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 89)
    public static void method517(int arg0) {
        field756 = null;
        field757 = null;
        if (arg0 > -118) {
            method517(-8);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[I[ILcea;[I)V", line = 107)
    public static final void method518(int arg0, int[] arg1, int[] arg2, class215 arg3, int[] arg4) {
        field758++;
        if (arg0 != 26256) {
            return;
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg3.field839.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field839[var9] = null;
                    } else {
                        class300 var10 = class460.field6365.method1090(var6, 16383);
                        int var11 = var10.field4043;
                        class474 var12 = arg3.field839[var9];
                        if (var12 != null) {
                            if (var12.field6557 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field839[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field6564 = 0;
                                    var12.field6559 = 0;
                                    var12.field6561 = 0;
                                    var12.field6560 = var8;
                                    var12.field6558 = 1;
                                    if (!arg3.field819) {
                                        class153.method930((byte) -127, arg3, 0, var10);
                                    }
                                } else if (var11 == 2) {
                                    var12.field6561 = 0;
                                }
                            } else if (var10.field4056 >= class460.field6365.method1090(var12.field6557, arg0 ^ 0x596F).field4056) {
                                var12 = arg3.field839[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class474 var13 = arg3.field839[var9] = new class474();
                            var13.field6560 = var8;
                            var13.field6561 = 0;
                            var13.field6557 = var6;
                            var13.field6564 = 0;
                            var13.field6559 = 0;
                            var13.field6558 = 1;
                            if (!arg3.field819) {
                                class153.method930((byte) -126, arg3, 0, var10);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }
}

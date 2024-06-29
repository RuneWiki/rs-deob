import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class175 {

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Lpm;")
    public static class349 field2460;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static void method1237(byte arg0) {
        field2460 = null;
        if (arg0 < 13) {
            field2459 = 33;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lmq;ILvq;IBLak;)Z")
    public static final boolean method1238(class297 arg0, int arg1, class269 arg2, int arg3, byte arg4, class194 arg5) {
        field2457++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg0.field4313 != null) {
            var9 = class176.field2481 - ((arg0.field4318 + arg5.field2797 - class176.field2475) * (class176.field2481 - class176.field2474) / (class176.field2480 - class176.field2475));
            var7 = (arg0.field4303 + arg5.field2793 - class176.field2484) * (class176.field2479 - class176.field2482) / (class176.field2489 - class176.field2484) + class176.field2482;
            var6 = (arg0.field4308 + arg5.field2793 - class176.field2484) * (class176.field2479 - class176.field2482) / (class176.field2489 - class176.field2484) + class176.field2482;
            var8 = class176.field2481 - ((arg5.field2797 + arg0.field4328 - class176.field2475) * (class176.field2481 - class176.field2474) / (class176.field2480 - class176.field2475));
        }
        class256 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg0.field4307 != -1) {
            if (arg5.field2790 && arg0.field4289 != -1) {
                var10 = arg0.method2005(arg2, true, -74);
            } else {
                var10 = arg0.method2005(arg2, false, arg4 - 119);
            }
            if (var10 != null) {
                var11 = arg5.field2791 - (var10.method83() + 1 >> 1);
                var12 = arg5.field2791 + (var10.method83() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                if (var12 > var7) {
                    var7 = var12;
                }
                var13 = arg5.field2792 - (var10.method75() + 1 >> 1);
                var14 = arg5.field2792 + (var10.method75() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class400 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        if (arg4 != 16) {
            method1237((byte) 12);
        }
        int var22 = 0;
        if (arg0.field4310 != null) {
            var15 = class200.method1416(arg4 + 21598, arg0.field4298);
            if (var15 != null) {
                var16 = class423.field6036.method1310((int[]) null, class410.field5885, (class256[]) null, arg0.field4310, true);
                int var23 = arg5.field2792;
                if (var10 == null) {
                    var17 = var23 - var15.method2509() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method75() >> 1) + var16 * var15.method2506());
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class410.field5885[var24];
                    if (var24 < (var16 - 1)) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method2508(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg5.field2791 + arg3 - (var18 / 2);
                var20 = var18 / 2 + arg5.field2791 + arg3;
                if (var6 > var19) {
                    var6 = var19;
                }
                var21 = arg1 + var17;
                if (var7 < var20) {
                    var7 = var20;
                }
                if (var21 < var8) {
                    var8 = var21;
                }
                var22 = arg1 + var15.method2506() * var16 + var17;
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (var7 < class176.field2482 || class176.field2479 < var6 || var9 < class176.field2474 || class176.field2481 < var8) {
            return true;
        }
        if (arg0.field4313 != null) {
            int[] var27 = new int[arg0.field4313.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg0.field4313[var28 * 2] + arg5.field2793;
                int var31 = arg0.field4313[var28 * 2 + 1] + arg5.field2797;
                var27[var28 * 2] = (var30 - class176.field2484) * (class176.field2479 - class176.field2482) / (class176.field2489 - class176.field2484) + class176.field2482;
                var27[var28 * 2 + 1] = class176.field2481 - ((class176.field2481 - class176.field2474) * (var31 - class176.field2475) / (class176.field2480 - class176.field2475));
            }
            class27.method147(arg2, var27, arg0.field4295);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg2.method1835(var27[var29 * 2], var27[(var29 + 1) * 2], arg0.field4324, arg4 - 15, var27[(var29 - -1) * 2 + 1], var27[var29 * 2 + 1]);
            }
            arg2.method1835(var27[var27.length - 2], var27[0], arg0.field4324, arg4 - 15, var27[1], var27[var27.length - 1]);
        }
        if (var10 != null) {
            if (class166.field2377 > 0 && (class334.field4849 != -1 && class334.field4849 == arg5.field2794 || class252.field3743 != -1 && class252.field3743 == arg0.field4287)) {
                int var32;
                if (class385.field5445 > 50) {
                    var32 = (100 - class385.field5445) * 2;
                } else {
                    var32 = class385.field5445 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg2.method1828(arg5.field2791, var33, var10.method87() / 2 + 7, arg5.field2792, -21915);
                arg2.method1828(arg5.field2791, var33, var10.method87() / 2 + 5, arg5.field2792, arg4 - 21931);
                arg2.method1828(arg5.field2791, var33, var10.method87() / 2 + 3, arg5.field2792, -21915);
                arg2.method1828(arg5.field2791, var33, var10.method87() / 2 + 1, arg5.field2792, arg4 ^ 0xFFFFAA75);
                arg2.method1828(arg5.field2791, var33, var10.method87() / 2, arg5.field2792, -21915);
            }
            var10.method1772(arg5.field2791 - (var10.method83() >> 1), arg5.field2792 - (var10.method75() >> 1));
        }
        if (arg0.field4310 != null && var15 != null) {
            class129.method795(arg5, (byte) 119, var18, var17, arg0, arg2, var15, var16);
        }
        if (arg0.field4307 != -1 || arg0.field4310 != null) {
            class249 var34 = new class249(arg5);
            var34.field3717 = var11;
            var34.field3719 = var21;
            var34.field3715 = var12;
            var34.field3714 = var20;
            var34.field3710 = var19;
            var34.field3713 = var14;
            var34.field3718 = var13;
            var34.field3708 = var22;
            class301.field4388.method2756(78, var34);
        }
        return false;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIBI)I")
    public static final int method1239(int arg0, int arg1, byte arg2, int arg3) {
        field2458++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg1;
        } else {
            int var5 = 12 % ((-arg2 - 32) / 37);
            return var4 == 2 ? 1023 - arg0 : arg1;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static final void method1240(int arg0) {
        field2456++;
        class443 var1 = null;
        try {
            if (arg0 != 1) {
                field2459 = -117;
            }
            class156 var2 = class401.field5628.method1535(12);
            while (var2.field2298 == 0) {
                class259.method1790((byte) -85, 1L);
            }
            if (var2.field2298 == 1) {
                var1 = (class443) var2.field2295;
                byte[] var3 = new byte[(int) var1.method2765(0)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2767(true, var3, var4, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class182.method1300(new class130(var3), (byte) 21);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2762(-1);
            }
        } catch (Exception var6) {
        }
    }

    static {
        new class349("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field2460 = new class349(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");
    }
}

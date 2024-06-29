import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class453 {

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "F")
    public float field6521 = 0.25F;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "F")
    public float field6516 = 1.0F;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "F")
    public float field6524 = 1.0F;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public int field6529;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Lrs;")
    public class649 field6522;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public int field6520;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public int field6532;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public int field6526;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public int field6518;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "F")
    public float field6533;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public int field6517;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "F")
    public float field6534;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "F")
    public float field6530;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "[I")
    public static int[] field6527 = new int[14];

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "[I")
    public static int[] field6531 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILla;Ljava/lang/String;Lr;ZLfo;)V")
    public static final void method2656(int arg0, class393 arg1, String arg2, class98 arg3, boolean arg4, class606 arg5) {
        field6519++;
        boolean var6 = !class115.field1728 || class677.method3809(62);
        if (!var6) {
            return;
        }
        if (class115.field1728 && var6) {
            class606 var12 = class473.field6800;
            class393 var13 = arg3.method684(var12, class612.field8822, true);
            int var14 = var12.method3460(null, true, 250, arg2);
            int var15 = var12.method3452(var12.field8754, (byte) -119, 250, null, arg2);
            int var16 = class607.field8765.field8869;
            int var17 = var16 + 4;
            int var18 = var17 * 2 + var15;
            int var19 = var17 * 2 + var14;
            if (var18 < class451.field6510) {
                var18 = class451.field6510;
            }
            if (var19 < class82.field1319) {
                var19 = class82.field1319;
            }
            int var20 = class361.field5298.method3193(-30796, class677.field9591, var19) + class175.field2454;
            int var21 = class544.field8038.method1916((byte) 124, class619.field8966, var18) + class474.field6808;
            arg3.method660(class528.field7665, false).method53(class635.field9153.field8869 + var20, class635.field9153.field8868 + var21, var19 - (class635.field9153.field8869 * 2), -(class635.field9153.field8868 * 2) + var18, 1, 0, 0);
            arg3.method660(class635.field9153, true).method1534(var20, var21);
            class635.field9153.method3514();
            arg3.method660(class635.field9153, true).method1534(var20 + var19 - var16, var21);
            class635.field9153.method3519();
            arg3.method660(class635.field9153, true).method1534(var19 + var20 - var16, var18 + var21 + -var16);
            class635.field9153.method3514();
            arg3.method660(class635.field9153, true).method1534(var20, var21 + var18 - var16);
            class635.field9153.method3519();
            arg3.method660(class607.field8765, true).method1528(var20, class635.field9153.field8868 + var21, var16, var18 - (class635.field9153.field8868 * 2));
            class607.field8765.method3507();
            arg3.method660(class607.field8765, true).method1528(class635.field9153.field8869 + var20, var21, var19 - (class635.field9153.field8869 * 2), var16);
            class607.field8765.method3507();
            arg3.method660(class607.field8765, true).method1528(var20 + var19 - var16, var21 - -class635.field9153.field8868, var16, var18 - class635.field9153.field8868 * 2);
            class607.field8765.method3507();
            arg3.method660(class607.field8765, true).method1528(class635.field9153.field8869 + var20, -var16 + var18 + var21, var19 - class635.field9153.field8869 * 2, var16);
            class607.field8765.method3507();
            var13.method2435(null, null, arg2, arg0, var19 - (var17 * 2), var17 + var20, var18 - (var17 * 2), class501.field7082 | 0xFF000000, var17 + var21, 1, 0, -1, 1, null, 0, 0);
            class430.method2569(var18, arg0, var20, var19, var21);
        } else {
            int var7 = arg5.method3460(null, true, 250, arg2);
            int var8 = arg5.method3461(250, (byte) -126, null, arg2) * 13;
            byte var9 = 4;
            int var10 = var9 + 6;
            int var11 = var9 + 6;
            arg3.method700(var10 - var9, -var9 + var11, var7 + var9 + var9, var8 + var9 + var9, -16777216, 0);
            arg3.method633(var10 - var9, var11 - var9, var9 + var9 + var7, var9 + var9 + var8, -1, 0);
            arg1.method2435(null, null, arg2, 0, var7, var10, var8, -1, var11, 1, 0, -1, 1, null, 0, 0);
            class430.method2569(var8 + var9 + var9, 0, var10 - var9, var9 - -var9 + var7, var11 - var9);
        }
        if (arg4) {
            try {
                arg3.method655();
            } catch (class232 var22) {
            }
        }
        if (arg0 != 0) {
            field6527 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lew;Lgk;BI)V")
    public static final void method2657(class226 arg0, class540 arg1, byte arg2, int arg3) {
        field6525++;
        class201 var4 = new class201();
        var4.field2729 = arg1.method3115(29871);
        var4.field2736 = arg1.method3160(false);
        var4.field2738 = new byte[var4.field2729][][];
        var4.field2734 = new int[var4.field2729];
        if (arg2 < 26) {
            field6527 = null;
        }
        var4.field2727 = new int[var4.field2729];
        var4.field2726 = new class254[var4.field2729];
        var4.field2735 = new class254[var4.field2729];
        var4.field2728 = new int[var4.field2729];
        for (int var5 = 0; var5 < var4.field2729; var5++) {
            try {
                int var6 = arg1.method3115(29871);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg1.method3145((byte) -121);
                    String var8 = arg1.method3145((byte) -121);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg1.method3160(false);
                    }
                    var4.field2727[var5] = var6;
                    var4.field2734[var5] = var9;
                    var4.field2735[var5] = arg0.method1402(var8, class597.method3400((byte) 100, var7), (byte) -98);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg1.method3145((byte) -121);
                    String var11 = arg1.method3145((byte) -121);
                    int var12 = arg1.method3115(29871);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg1.method3145((byte) -121);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method3160(false);
                            var15[var16] = new byte[var17];
                            arg1.method3155(var17, 0, var15[var16], 0);
                        }
                    }
                    var4.field2727[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class597.method3400((byte) 100, var13[var19]);
                    }
                    var4.field2726[var5] = arg0.method1399(class597.method3400((byte) 100, var10), (byte) -92, var18, var11);
                    var4.field2738[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2728[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2728[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2728[var5] = -3;
            } catch (Exception var23) {
                var4.field2728[var5] = -4;
            } catch (Throwable var24) {
                var4.field2728[var5] = -5;
            }
        }
        class250.field3284.method1909(var4, (byte) -81);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lgk;I)V")
    public final void method2658(class540 arg0, int arg1) {
        field6523++;
        int var3 = -14 % ((arg1 - 39) / 59);
        this.field6524 = (float) (arg0.method3115(29871) * 8) / 255.0F;
        this.field6521 = (float) (arg0.method3115(29871) * 8) / 255.0F;
        this.field6516 = (float) (arg0.method3115(29871) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static void method2659(byte arg0) {
        if (arg0 < 115) {
            field6527 = null;
        }
        field6527 = null;
        field6531 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
    public static final int method2660(int arg0, String arg1, String arg2, int arg3) {
        field6535++;
        int var4 = arg2.length();
        if (arg0 != 5992) {
            field6531 = null;
        }
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while ((var6 - var8) < var4 || var7 - var9 < var5) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg2.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg1.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class468.method2698(-53, var22);
            var9 = class468.method2698(arg0 - 6112, var24);
            char var26 = class169.method1179(var22, 9790, arg3);
            char var27 = class169.method1179(var24, 9790, arg3);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class392.method2429(arg3, -38, var28) - class392.method2429(arg3, -65, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg3 == 2) {
                var16 = var4 - var11 - 1;
                var17 = var5 - var11 - 1;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg2.charAt(var16);
            char var19 = arg1.charAt(var17);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class392.method2429(arg3, -102, var20) - class392.method2429(arg3, -65, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg2.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class392.method2429(arg3, -96, var14) - class392.method2429(arg3, -103, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLdj;)Z")
    public final boolean method2661(byte arg0, class453 arg1) {
        if (arg0 == 32) {
            field6528++;
            return this.field6526 == arg1.field6526 && this.field6534 == arg1.field6534 && this.field6533 == arg1.field6533 && this.field6530 == arg1.field6530 && this.field6521 == arg1.field6521 && this.field6524 == arg1.field6524 && this.field6516 == arg1.field6516 && this.field6517 == arg1.field6517 && this.field6520 == arg1.field6520 && this.field6522 == arg1.field6522;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class453() {
        this.field6529 = -50;
        this.field6522 = class329.field4779;
        this.field6520 = 0;
        this.field6532 = -60;
        this.field6526 = class20.field384;
        this.field6518 = -50;
        this.field6533 = 0.69921875F;
        this.field6517 = class440.field6398;
        this.field6534 = 1.1523438F;
        this.field6530 = 1.2F;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lgk;)V")
    public class453(class540 arg0) {
        int var2 = arg0.method3115(29871);
        if (class335.field4872.method3785(class62.field996, 3) && class170.field2401.method669() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field6526 = class20.field384;
            } else {
                this.field6526 = arg0.method3160(false);
            }
            if ((var2 & 0x2) == 0) {
                this.field6534 = 1.1523438F;
            } else {
                this.field6534 = (float) arg0.method3169(26488) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field6533 = 0.69921875F;
            } else {
                this.field6533 = (float) arg0.method3169(26488) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field6530 = 1.2F;
            } else {
                this.field6530 = (float) arg0.method3169(26488) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method3160(false);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method3169(26488);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method3169(26488);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method3169(26488);
            }
            this.field6526 = class20.field384;
            this.field6533 = 0.69921875F;
            this.field6530 = 1.2F;
            this.field6534 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field6532 = -60;
            this.field6529 = -50;
            this.field6518 = -50;
        } else {
            this.field6518 = arg0.method3129(89);
            this.field6532 = arg0.method3129(86);
            this.field6529 = arg0.method3129(78);
        }
        if ((var2 & 0x20) == 0) {
            this.field6517 = class440.field6398;
        } else {
            this.field6517 = arg0.method3160(false);
        }
        if ((var2 & 0x40) == 0) {
            this.field6520 = 0;
        } else {
            this.field6520 = arg0.method3169(26488);
        }
        if ((var2 & 0x80) == 0) {
            this.field6522 = class329.field4779;
        } else {
            int var3 = arg0.method3169(26488);
            int var4 = arg0.method3169(26488);
            int var5 = arg0.method3169(26488);
            int var6 = arg0.method3169(26488);
            int var7 = arg0.method3169(26488);
            int var8 = arg0.method3169(26488);
            this.field6522 = class581.method3336(var3, var4, var6, var5, var8, 125, var7);
        }
    }
}

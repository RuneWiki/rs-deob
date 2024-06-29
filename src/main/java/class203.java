import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class203 {

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public int field2660 = 1;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field2665 = -1;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Lum;")
    public static class82 field2656 = new class82("WTWIP", 3);

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "C")
    public char field2659;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "[[I")
    public static int[][] field2667;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
    public static final void method1328(int arg0, int arg1) {
        field2662++;
        int var2 = class264.field3353 - class72.field901;
        if (var2 >= 100) {
            class396.field5271 = 1;
            return;
        }
        int var3 = (int) class163.field2110;
        if (var3 < (class21.field393 >> 8)) {
            var3 = class21.field393 >> 8;
        }
        if (class102.field1396[4] && var3 < class301.field3905[4] + 128) {
            var3 = class301.field3905[4] + 128;
        }
        int var4 = (int) class244.field3138 + class82.field1021 & 0x3FFF;
        class30.method206(class293.field3801, arg1, var4, (var3 >> 3) * 3 + 600 << 0, class366.method2145(class366.field4715, (byte) 22, class37.field573.field6239, class37.field573.field6241) - 50, class73.field926, var3, (byte) -122);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class299.field3885 = (int) ((float) (class299.field3885 - class420.field5633) * var5 + (float) class420.field5633);
        class53.field730 = (int) ((float) (class53.field730 - class53.field729) * var5 + (float) class53.field729);
        class430.field5935 = (int) ((float) (class430.field5935 - class349.field4460) * var5 + (float) class349.field4460);
        if (arg0 != -9469) {
            method1331((byte) 26);
        }
        class291.field3724 = (int) ((float) (class291.field3724 - class221.field2854) * var5 + (float) class221.field2854);
        int var6 = class261.field3319 - class336.field4297;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class261.field3319 = (int) ((float) var6 * var5 + (float) class336.field4297);
        class261.field3319 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static void method1329(int arg0) {
        field2667 = null;
        field2656 = null;
        if (arg0 < 94) {
            method1329(8);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)I")
    public static final int method1330(byte arg0, int arg1) {
        field2657++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        int var12 = -30 / ((-arg0 - 43) / 60);
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var17 < 0.5D) {
                var15 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var13 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var13 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var13 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var19 = var13 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var15 * 256.0D);
        int var23 = (int) (var17 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var22 >>= 0x4;
        } else if (var23 > 217) {
            var22 >>= 0x3;
        } else if (var23 > 192) {
            var22 >>= 0x2;
        } else if (var23 > 179) {
            var22 >>= 0x1;
        }
        return ((var21 >> 2 & 0x3F) << 10) + (var22 >> 5 << 7) + (var23 >> 1);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)Z")
    public static final boolean method1331(byte arg0) {
        if (arg0 != 93) {
            return true;
        }
        field2655++;
        class502 var1 = (class502) class103.field1421.field64.field7455;
        if (var1 == null || class103.field1421.field64 == var1) {
            return false;
        } else {
            if (var1.field7390 >= 2000) {
                var1.field7390 -= 2000;
            }
            return var1.field7390 == 1008;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lbt;IB)V")
    private final void method1332(class88 arg0, int arg1, byte arg2) {
        field2664++;
        if (arg1 == 1) {
            this.field2659 = class148.method1027(arg0.method575(-53), (byte) -92);
        } else if (arg1 == 2) {
            this.field2660 = 0;
        }
        if (arg2 > -12) {
            this.field2659 = (char) 65424;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lbt;B)V")
    public final void method1333(class88 arg0, byte arg1) {
        int var3 = -124 % ((arg1 - 46) / 50);
        while (true) {
            int var4 = arg0.method617(2);
            if (var4 == 0) {
                field2663++;
                return;
            }
            this.method1332(arg0, var4, (byte) -82);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method1334(int arg0, int arg1, int arg2) {
        field2666++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            if (arg0 >= -62) {
                field2656 = null;
            }
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILjava/awt/Component;Lhs;I)Lfr;")
    public static final class493 method1335(int arg0, int arg1, Component arg2, class441 arg3, int arg4) {
        field2658++;
        if (class426.field5847 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class493 var5 = (class493) Class.forName("is").getDeclaredConstructor().newInstance();
                var5.field7218 = arg0;
                var5.field7205 = new int[(class414.field5502 ? 2 : 1) * 256];
                var5.method4(arg2);
                var5.field7222 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field7222 > 16384) {
                    var5.field7222 = 16384;
                }
                var5.method6(var5.field7222);
                if (class243.field3122 > 0 && class179.field2299 == null) {
                    class179.field2299 = new class312();
                    class179.field2299.field4028 = arg3;
                    arg3.method2620(class179.field2299, class243.field3122, 59);
                }
                if (class179.field2299 != null) {
                    if (class179.field2299.field4025[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class179.field2299.field4025[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class280 var6 = new class280(arg3, arg1);
                    var6.field7218 = arg0;
                    var6.field7205 = new int[(class414.field5502 ? 2 : 1) * 256];
                    var6.method4(arg2);
                    if (arg4 != 179) {
                        field2665 = 4;
                    }
                    var6.field7222 = 16384;
                    var6.method6(var6.field7222);
                    if (class243.field3122 > 0 && class179.field2299 == null) {
                        class179.field2299 = new class312();
                        class179.field2299.field4028 = arg3;
                        arg3.method2620(class179.field2299, class243.field3122, arg4 - 103);
                    }
                    if (class179.field2299 != null) {
                        if (class179.field2299.field4025[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class179.field2299.field4025[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class493();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILqa;IIZLoa;I)V")
    public static final void method1336(int arg0, class129 arg1, int arg2, int arg3, boolean arg4, class167 arg5, int arg6) {
        if (arg4) {
            class473.field6921.method2406((class23.field419 - class473.field6921.method370()) / 2, (class92.field1281 - class473.field6921.method369()) / 2);
            class517.field7621.method2406((class23.field419 - class517.field7621.method370()) / 2, 18);
        }
        field2661++;
        arg5.method1105((class494.field7234 == class276.field3527 ? class338.field4321 : class472.field6896).method1127(class379.field4920, false), class23.field419 / 2, class92.field1281 / 2 - 26, (byte) -116, arg6, -1);
        int var7 = class92.field1281 / 2 - 18;
        arg1.method918(class23.field419 / 2 - 152, var7, 304, 34, arg2, 0);
        arg1.method918(class23.field419 / 2 - 151, arg3 + var7, 302, 32, 0, 0);
        arg1.method861(class23.field419 / 2 - 150, var7 + 2, class349.field4474 * 3, 30, arg0, 0);
        arg1.method861(class349.field4474 * 3 + class23.field419 / 2 - 150, var7 + 2, 300 - (class349.field4474 * 3), 30, 0, 0);
        arg5.method1105(class234.field3042, class23.field419 / 2, class92.field1281 / 2 + 4, (byte) -110, arg6, -1);
    }
}

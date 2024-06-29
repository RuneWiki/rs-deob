import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class class39 {

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field674 = 2;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field679 = -1;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Lmb;")
    public static class96 field672 = class243.method1708("; Expires=", (byte) 91);

    @OriginalMember(owner = "client!di", name = "f", descriptor = "Lmb;")
    public static class96 field677 = class243.method1708("Verbindung zum Update)2Server hergestellt)3", (byte) 121);

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "Lff;")
    public static class3 field685;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static final void method304(int arg0) {
        field684++;
        try {
            if (class249.field4308 == 1) {
                int var1 = class254.field4385.method234(false);
                if (var1 > 0 && class254.field4385.method228((byte) 123)) {
                    int var2 = var1 - class141.field2525;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class254.field4385.method222((byte) 116, var2);
                    return;
                }
                class254.field4385.method233(20145);
                class254.field4385.method217(true);
                class103.field1738 = null;
                class250.field4329 = null;
                if (class85.field1436 == null) {
                    class249.field4308 = 0;
                } else {
                    class249.field4308 = 2;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class254.field4385.method233(20145);
            class85.field1436 = null;
            class250.field4329 = null;
            class249.field4308 = 0;
            class103.field1738 = null;
        }
        if (arg0 != 0) {
            method304(-8);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lw;I)Z")
    public static final boolean method305(class107 arg0, int arg1) {
        field675++;
        if (arg1 < 33) {
            method307((byte) -51, 10);
        }
        if (arg0.field1908 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field1908.length; var2++) {
            int var3 = class132.method992(var2, true, arg0);
            int var4 = arg0.field1808[var2];
            if (arg0.field1908[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field1908[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field1908[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljb;B)Ljb;")
    public abstract class179 method306(class179 arg0, byte arg1);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)[B")
    public static final byte[] method307(byte arg0, int arg1) {
        field683++;
        class137 var2 = (class137) class135.field2417.method158((long) arg1, (byte) -54);
        int var3 = -100 % ((-arg0 - 48) / 35);
        if (var2 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg1);
            for (int var6 = 0; var6 < 255; var6++) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class50.method379(var8, var5, (byte) 26);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[511 - var7] = var10;
            }
            var2 = new class137(var4);
            class135.field2417.method155((long) arg1, var2, (byte) 78);
        }
        return var2.field2448;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lmb;IILmb;Lmb;)V")
    public static final void method308(class96 arg0, int arg1, int arg2, class96 arg3, class96 arg4) {
        int var5 = -70 / ((arg1 + 72) / 48);
        field681++;
        class29.method193(-1, arg0, arg3, -1, arg2, arg4);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIBIIII)V")
    public static final void method309(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field682++;
        int var9 = 1 / ((-arg4 - 68) / 34);
        for (int var10 = 0; var10 < class227.field3870.field2027; var10++) {
            int var11 = class146.field2592 + class176.field3068 - class227.field3870.field2029[var10] - 1;
            int var12 = class227.field3870.field2035[var10] - class179.field3091;
            int var13 = arg2 + ((arg1 - arg2) * (var12 - arg3) / (arg8 - arg3));
            int var14 = arg6 + ((var11 - arg7) * (arg5 - arg6) / (arg0 - arg7));
            int var15 = class227.field3870.method842(var10, 3);
            int var16 = 16777215;
            class111 var17 = null;
            if (var15 == 0) {
                if ((double) class121.field2232 == 3.0D) {
                    var17 = class178.field3083;
                }
                if ((double) class121.field2232 == 4.0D) {
                    var17 = class53.field935;
                }
                if ((double) class121.field2232 == 6.0D) {
                    var17 = class151.field2660;
                }
                if ((double) class121.field2232 == 8.0D) {
                    var17 = class116.field2160;
                }
            }
            if (var15 == 1) {
                if ((double) class121.field2232 == 3.0D) {
                    var17 = class151.field2660;
                }
                if ((double) class121.field2232 == 4.0D) {
                    var17 = class116.field2160;
                }
                if ((double) class121.field2232 == 6.0D) {
                    var17 = class47.field838;
                }
                if ((double) class121.field2232 == 8.0D) {
                    var17 = class3.field63;
                }
            }
            if (var15 == 2) {
                if ((double) class121.field2232 == 3.0D) {
                    var17 = class47.field838;
                }
                var16 = 16755200;
                if ((double) class121.field2232 == 4.0D) {
                    var17 = class3.field63;
                }
                if ((double) class121.field2232 == 6.0D) {
                    var17 = class179.field3094;
                }
                if ((double) class121.field2232 == 8.0D) {
                    var17 = class154.field2717;
                }
            }
            if (class227.field3870.field2034[var10] != -1) {
                var16 = class227.field3870.field2034[var10];
            }
            if (var17 != null) {
                class96[] var18 = new class96[class227.field3870.field2028[var10].method672(-57, 60) + 1];
                class149.field2628.method124(class227.field3870.field2028[var10], (int[]) null, var18);
                int var19 = var18.length;
                int var20 = var14 - (var19 - 1) * var17.method853() / 2;
                int var21 = var20 + var17.method849() / 2;
                for (int var22 = 0; var22 < var19; var22++) {
                    class96 var23 = (var19 - 1) == var22 ? var18[var22] : var18[var22].method716(var18[var22].method707(-92) - 4, (byte) -13, 0);
                    var17.method847(var23, var13, var21, var16, true);
                    var21 += var17.method853();
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public static void method310(byte arg0) {
        field672 = null;
        field685 = null;
        if (arg0 != 35) {
            method314(false, 44L);
        }
        field677 = null;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(B)V")
    public static final void method311(byte arg0) {
        field678++;
        while (class1.field4.method1014(class47.field820, (byte) 6) >= 27) {
            int var1 = class1.field4.method1017((byte) 125, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class86.field1450[var1] == null) {
                var2 = true;
                class86.field1450[var1] = new class197();
            }
            class197 var3 = class86.field1450[var1];
            class222.field3797[class132.field2375++] = var1;
            var3.field4510 = class236.field4053;
            if (var3.field3436 != null && var3.field3436.method1570(118)) {
                class274.method1859((byte) 15, var3);
            }
            var3.field3436 = class260.method1799(class1.field4.method1017((byte) 127, 14), (byte) -17);
            int var4 = class1.field4.method1017((byte) 127, 1);
            if (var4 == 1) {
                class78.field1335[class157.field2745++] = var1;
            }
            int var5 = class146.field2604[class1.field4.method1017((byte) 124, 3)];
            if (var2) {
                var3.field4531 = var3.field4534 = var5;
            }
            int var6 = class1.field4.method1017((byte) 127, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class1.field4.method1017((byte) 125, 1);
            int var8 = class1.field4.method1017((byte) 126, 5);
            var3.method1791(var3.field3436.field3914, 128);
            var3.field4515 = var3.field3436.field3889;
            var3.field4540 = var3.field3436.field3937;
            var3.field4569 = var3.field3436.field3890;
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.field4539 = var3.field3436.field3919;
            var3.field4505 = var3.field3436.field3895;
            var3.field4508 = var3.field3436.field3929;
            var3.field4521 = var3.field3436.field3898;
            if (var3.field4539 == 0) {
                var3.field4534 = 0;
            }
            var3.field4517 = var3.field3436.field3880;
            var3.method1802(-10795, class236.field4047.field4566[0] + var8, var7 == 1, class236.field4047.field4528[0] + var6, var3.method366((byte) 95));
            if (var3.field3436.method1570(101)) {
                class236.method1609((class47) null, var3, var3.field4566[0], class216.field3712, (byte) -101, var3.field4528[0], (class196) null, 0);
            }
        }
        class1.field4.method1018((byte) -128);
        if (arg0 < 112) {
            field674 = -68;
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(B)[Lmj;")
    public static final class246[] method312(byte arg0) {
        class246[] var1 = new class246[class252.field4368];
        field686++;
        int var2 = -19 % ((arg0 + 51) / 42);
        for (int var3 = 0; var3 < class252.field4368; var3++) {
            int var4 = class31.field490[var3] * class170.field2982[var3];
            int[] var5 = new int[var4];
            byte[] var6 = class217.field3724[var3];
            for (int var7 = 0; var7 < var4; var7++) {
                var5[var7] = class139.field2492[class130.method985(255, var6[var7])];
            }
            var1[var3] = new class174(class249.field4309, class109.field2019, class241.field4187[var3], class176.field3064[var3], class31.field490[var3], class170.field2982[var3], var5);
        }
        class192.method1344(0);
        return var1;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)I")
    public static final int method313(boolean arg0) {
        if (arg0) {
            field679 = -23;
        }
        field687++;
        return 2;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZJ)V")
    public static final void method314(boolean arg0, long arg1) {
        field673++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class76.field1306; var3++) {
            if (class250.field4317[var3] == arg1) {
                class76.field1306--;
                class200.field3470++;
                for (int var4 = var3; var4 < class76.field1306; var4++) {
                    class185.field3224[var4] = class185.field3224[var4 + 1];
                    class251.field4337[var4] = class251.field4337[var4 + 1];
                    class251.field4336[var4] = class251.field4336[var4 + 1];
                    class250.field4317[var4] = class250.field4317[var4 + 1];
                    class124.field2298[var4] = class124.field2298[var4 + 1];
                    class86.field1454[var4] = class86.field1454[var4 + 1];
                }
                class208.field3588 = class67.field1137;
                class140.field2505.method1012((byte) -126, 40);
                class140.field2505.method1668(arg1, -98);
                break;
            }
        }
        if (!arg0) {
            method305((class107) null, -10);
        }
    }
}

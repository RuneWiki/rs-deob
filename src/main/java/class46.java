import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class46 implements Runnable {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Lci;")
    private class171 field716 = new class171();

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Z")
    private boolean field717 = false;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public int field730 = 0;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field731;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Leg;")
    public static class37 field714 = class174.method1167("Texturen geladen)3", 119);

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Z")
    public static boolean field720 = true;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field721 = 0;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Leg;")
    public static class37 field725 = class174.method1167("hitmarks", -92);

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field729 = 0;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!mc", name = "run", descriptor = "()V")
    public final void run() {
        field723++;
        while (!this.field717) {
            class171 var1 = this.field716;
            class95 var2;
            synchronized (this.field716) {
                var2 = (class95) this.field716.method1150(-19113);
                if (var2 == null) {
                    try {
                        this.field716.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field730--;
            }
            try {
                if (var2.field1495 == 2) {
                    var2.field1491.method578(var2.field1487, (int) var2.field5125, var2.field1487.length, 122);
                } else if (var2.field1495 == 3) {
                    var2.field1487 = var2.field1491.method579((int) var2.field5125, (byte) -120);
                }
            } catch (Exception var6) {
                class200.method1392(58, (String) null, var6);
            }
            var2.field1500 = false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Z")
    public static final boolean method298(int arg0, int arg1) {
        if (arg1 <= 82) {
            return true;
        } else {
            field718++;
            return (arg0 & 0x50C069) >> 22 != 0;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lia;IIIIIIIZ)V")
    public static final void method299(class228 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class23.field301;
        int var11;
        int var12 = var11 = (arg7 << 7) - class184.field3099;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class218.field3754[arg1][arg6][arg7] - class120.field2032;
        int var18 = class218.field3754[arg1][arg6 + 1][arg7] - class120.field2032;
        int var19 = class218.field3754[arg1][arg6 + 1][arg7 + 1] - class120.field2032;
        int var20 = class218.field3754[arg1][arg6][arg7 + 1] - class120.field2032;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class76.field1179;
        int var46 = (var24 << 9) / var25 + class76.field1194;
        int var47 = (var27 << 9) / var31 + class76.field1179;
        int var48 = (var30 << 9) / var31 + class76.field1194;
        int var49 = (var33 << 9) / var37 + class76.field1179;
        int var50 = (var36 << 9) / var37 + class76.field1194;
        int var51 = (var39 << 9) / var43 + class76.field1179;
        int var52 = (var42 << 9) / var43 + class76.field1194;
        class76.field1193 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class160.field2672 && class110.method773(class76.field1179 + class265.field4650, class76.field1194 + class270.field4713, var50, var52, var48, var49, var51, var47)) {
                class172.field2886 = arg6;
                class83.field1313 = arg7;
            }
            if (!arg8) {
                class76.field1186 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class76.field1190 || var51 > class76.field1190 || var47 > class76.field1190) {
                    class76.field1186 = true;
                }
                if (arg0.field3927 == -1) {
                    if (arg0.field3904 != 12345678) {
                        class76.method515(var50, var52, var48, var49, var51, var47, arg0.field3904, arg0.field3931, arg0.field3908);
                    }
                } else if (!class40.field646) {
                    int var53 = class76.field1196.method717(0, arg0.field3927);
                    class76.method515(var50, var52, var48, var49, var51, var47, class109.method758(var53, arg0.field3904), class109.method758(var53, arg0.field3931), class109.method758(var53, arg0.field3908));
                } else if (arg0.field3918) {
                    class76.method514(var50, var52, var48, var49, var51, var47, arg0.field3904, arg0.field3931, arg0.field3908, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3927);
                } else {
                    class76.method514(var50, var52, var48, var49, var51, var47, arg0.field3904, arg0.field3931, arg0.field3908, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3927);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class160.field2672 && class110.method773(class76.field1179 + class265.field4650, class76.field1194 + class270.field4713, var46, var48, var52, var45, var47, var51)) {
            class172.field2886 = arg6;
            class83.field1313 = arg7;
        }
        if (arg8) {
            return;
        }
        class76.field1186 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class76.field1190 || var47 > class76.field1190 || var51 > class76.field1190) {
            class76.field1186 = true;
        }
        if (arg0.field3927 != -1) {
            if (class40.field646) {
                class76.method514(var46, var48, var52, var45, var47, var51, arg0.field3929, arg0.field3908, arg0.field3931, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3927);
                return;
            }
            int var54 = class76.field1196.method717(0, arg0.field3927);
            class76.method515(var46, var48, var52, var45, var47, var51, class109.method758(var54, arg0.field3929), class109.method758(var54, arg0.field3908), class109.method758(var54, arg0.field3931));
        } else if (arg0.field3929 != 12345678) {
            class76.method515(var46, var48, var52, var45, var47, var51, arg0.field3929, arg0.field3908, arg0.field3931);
            return;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)V")
    public static final void method300(int arg0, int arg1) {
        if (arg0 != 16) {
            field720 = false;
        }
        class137.field2342 = new int[arg1];
        class169.field2821 = new int[arg1];
        class268.field4694 = new int[arg1];
        class167.field2797 = new int[arg1];
        field724++;
        class214.field3711 = new int[arg1];
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[BLbj;I)Lpd;")
    public final class95 method301(int arg0, byte[] arg1, class87 arg2, int arg3) {
        field728++;
        class95 var5 = new class95();
        var5.field1502 = false;
        var5.field1495 = 2;
        var5.field1491 = arg2;
        var5.field1487 = arg1;
        var5.field5125 = (long) arg3;
        if (arg0 == 0) {
            this.method305(arg0 + 9, var5);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public final void method302(boolean arg0) {
        if (arg0) {
            field729 = 30;
        }
        field727++;
        this.field717 = true;
        class171 var2 = this.field716;
        synchronized (this.field716) {
            this.field716.notifyAll();
        }
        try {
            this.field731.join();
        } catch (InterruptedException var3) {
        }
        this.field731 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lbj;BI)Lpd;")
    public final class95 method303(class87 arg0, byte arg1, int arg2) {
        field719++;
        class95 var4 = new class95();
        var4.field1502 = false;
        if (arg1 <= 54) {
            return null;
        }
        var4.field5125 = (long) arg2;
        var4.field1495 = 3;
        var4.field1491 = arg0;
        this.method305(9, var4);
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method304(Random arg0, int arg1, int arg2) {
        field722++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class123.method885(arg1, arg2 ^ 0x1D43)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
            if (arg2 != -7486) {
                field729 = -38;
            }
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class35.method202(arg1, 238, var4);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILpd;)V")
    private final void method305(int arg0, class95 arg1) {
        field726++;
        class171 var3 = this.field716;
        synchronized (this.field716) {
            this.field716.method1152(22, arg1);
            this.field730++;
            this.field716.notifyAll();
            if (arg0 != 9) {
                this.field731 = null;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method306(int arg0) {
        if (arg0 == -19893) {
            field714 = null;
            field725 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILbj;B)Lpd;")
    public final class95 method307(int arg0, class87 arg1, byte arg2) {
        field715++;
        class95 var4 = new class95();
        var4.field1495 = 1;
        class171 var5 = this.field716;
        synchronized (this.field716) {
            if (arg2 != 92) {
                method299((class228) null, -13, 109, -53, -54, 65, -73, -1, true);
            }
            class95 var6 = (class95) this.field716.method1148(arg2 ^ 0x4B1B);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg0) == var6.field5125 && var6.field1491 == arg1 && var6.field1495 == 2) {
                    var4.field1500 = false;
                    var4.field1487 = var6.field1487;
                    return var4;
                }
                var6 = (class95) this.field716.method1142(arg2 ^ 0xA26);
            }
        }
        var4.field1487 = arg1.method579(arg0, (byte) -87);
        var4.field1502 = true;
        var4.field1500 = false;
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class46() {
        class251 var1 = class177.field2957.method1423(this, 76, 5);
        while (var1.field4488 == 0) {
            class144.method1008(121, 10L);
        }
        if (var1.field4488 == 2) {
            throw new RuntimeException();
        }
        this.field731 = (Thread) var1.field4483;
    }
}

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class218 {

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    private int field3400 = 32;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "Z")
    private boolean field3421 = false;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "J")
    private long field3418 = class98.method665(true);

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "J")
    private long field3422 = 0L;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "[Log;")
    private class194[] field3427 = new class194[8];

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    private int field3425 = 0;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
    private int field3429 = 0;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "J")
    private long field3426 = 0L;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "[Log;")
    private class194[] field3424 = new class194[8];

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "Z")
    private boolean field3431 = true;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    private int field3423 = 0;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    private int field3428 = 0;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "[J")
    public static long[] field3419 = new long[200];

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field3416 = 0;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "I")
    public int field3432;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    private int field3433;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public int field3434;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Log;")
    private class194 field3407;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Lvl;")
    public static class73 field3409;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "[I")
    public int[] field3414;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()I")
    public int method588() throws Exception {
        field3410++;
        return this.field3432;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method590(Component arg0) throws Exception {
        field3411++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Log;ZI)V")
    private final void method1525(class194 arg0, boolean arg1, int arg2) {
        field3399++;
        int var4 = arg2 >> 5;
        class194 var5 = this.field3427[var4];
        if (var5 == null) {
            this.field3424[var4] = arg0;
        } else {
            var5.field3073 = arg0;
        }
        this.field3427[var4] = arg0;
        arg0.field3072 = arg2;
        if (arg1) {
            this.method1536(125);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ)Lpb;")
    public static final class71 method1526(int arg0, boolean arg1) {
        field3415++;
        class71 var2 = (class71) class247.field4023.method707((long) arg0, (byte) -97);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class138.field1979.method501(-2, arg0 & 0x7FFF, 1);
        } else {
            var3 = class67.field1001.method501(-2, arg0, 1);
        }
        class71 var4 = new class71();
        if (var3 != null) {
            var4.method474(new class170(var3), 8940);
        }
        if (arg0 >= 32768) {
            var4.method471(32);
        }
        class247.field4023.method712(arg1, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
    private final void method1527(int arg0, int arg1) {
        this.field3428 -= arg1;
        if (this.field3428 < 0) {
            this.field3428 = 0;
        }
        field3420++;
        if (arg0 <= 93) {
            this.field3407 = null;
        }
        if (this.field3407 != null) {
            this.field3407.method952(arg1);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public final synchronized void method1528(int arg0) {
        field3413++;
        if (arg0 >= -67) {
            return;
        }
        if (class130.field1866 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class130.field1866.field4680[var3] == this) {
                    class130.field1866.field4680[var3] = null;
                }
                if (class130.field1866.field4680[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class130.field1866.field4677 = true;
                while (class130.field1866.field4688) {
                    class7.method43(-99, 50L);
                }
                class130.field1866 = null;
            }
        }
        this.method592();
        this.field3421 = true;
        this.field3414 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLog;)V")
    public final synchronized void method1529(byte arg0, class194 arg1) {
        field3403++;
        this.field3407 = arg1;
        if (arg0 != 122) {
            this.field3418 = 96L;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public static void method1530(int arg0) {
        field3419 = null;
        if (arg0 != 768) {
            method1531((class231) null, 62, 37);
        }
        field3409 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lfe;II)Ljava/lang/String;")
    public static final String method1531(class231 arg0, int arg1, int arg2) {
        field3417++;
        if (arg2 != 0) {
            method1530(-21);
        }
        if (!client.method1698(arg0).method147(arg1, -15469) && arg0.field3590 == null) {
            return null;
        } else if (arg0.field3622 == null || arg0.field3622.length <= arg1 || arg0.field3622[arg1] == null || arg0.field3622[arg1].trim().length() == 0) {
            return class107.field1563 ? "Hidden-" + arg1 : null;
        } else {
            return arg0.field3622[arg1];
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
    public void method589(int arg0) throws Exception {
        field3402++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BIIIIILli;)Lli;")
    public static final class208 method1532(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class208 arg6) {
        long var7 = (long) arg1;
        field3405++;
        class208 var9 = (class208) class84.field1301.method1517(var7, (byte) 120);
        if (var9 == null) {
            class141 var10 = class141.method909(class212.field3298, arg1, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method916(64, 768, -50, -10, -50);
            class84.field1301.method1518(var9, var7, (byte) 75);
        }
        int var11 = arg6.method343();
        int var12 = arg6.method326();
        int var13 = arg6.method321();
        int var14 = -112 / ((arg0 + 31) / 37);
        int var15 = arg6.method318();
        class208 var16 = var9.method345(true, true, true);
        if (arg5 != 0) {
            var16.method332(arg5);
        }
        class51 var17 = (class51) var16;
        if (arg2 != class52.method351(-103, arg4 + var13, arg3 - -var11, class148.field2204) || arg2 != class52.method351(-97, arg4 + var15, arg3 + var12, class148.field2204)) {
            for (int var18 = 0; var18 < var17.field674; var18++) {
                var17.field649[var18] += class52.method351(-89, var17.field673[var18] + arg4, var17.field647[var18] + arg3, class148.field2204) - arg2;
            }
            var17.field656 = false;
        }
        return var16;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "()V")
    public void method593() throws Exception {
        field3404++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([II)V")
    private final void method1533(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class189.field2953) {
            var3 = arg1 << 1;
        }
        class103.method694(arg0, 0, var3);
        this.field3428 -= arg1;
        if (this.field3407 != null && this.field3428 <= 0) {
            this.field3428 += class197.field3105 >> 4;
            class5.method30(116749187, this.field3407);
            this.method1525(this.field3407, false, this.field3407.method973());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class194 var10 = null;
                        class194 var11 = this.field3424[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class87 var12 = var11.field3074;
                                if (var12 == null || var12.field1325 <= var8) {
                                    var11.field3071 = true;
                                    int var13 = var11.method948();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1325 += var13;
                                    }
                                    if (var4 >= this.field3400) {
                                        break label107;
                                    }
                                    class194 var14 = var11.method988();
                                    if (var14 != null) {
                                        int var15 = var11.field3072;
                                        while (var14 != null) {
                                            this.method1525(var14, false, var15 * var14.method973() >> 8);
                                            var14 = var11.method947();
                                        }
                                    }
                                    class194 var16 = var11.field3073;
                                    var11.field3073 = null;
                                    if (var10 == null) {
                                        this.field3424[var7] = var16;
                                    } else {
                                        var10.field3073 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3427[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3073;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class194 var18 = this.field3424[var17];
                this.field3424[var17] = this.field3427[var17] = null;
                while (var18 != null) {
                    class194 var19 = var18.field3073;
                    var18.field3073 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3428 < 0) {
            this.field3428 = 0;
        }
        if (this.field3407 != null) {
            this.field3407.method969(arg0, 0, arg1);
        }
        this.field3418 = class98.method665(true);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public final synchronized void method1534(byte arg0) {
        field3412++;
        if (this.field3421) {
            return;
        }
        long var2 = class98.method665(true);
        try {
            if (var2 > (this.field3418 + 500000L)) {
                this.field3418 = var2 - 500000L;
            }
            while ((this.field3418 + 5000L) < var2) {
                this.method1527(99, 256);
                this.field3418 += (long) (256000 / class197.field3105);
            }
        } catch (Exception var7) {
            this.field3418 = var2;
        }
        if (this.field3414 == null) {
            return;
        }
        if (arg0 >= -74) {
            this.field3433 = -75;
        }
        try {
            if (this.field3422 != 0L) {
                if (var2 < this.field3422) {
                    return;
                }
                this.method589(this.field3432);
                this.field3422 = 0L;
                this.field3431 = true;
            }
            int var4 = this.method588();
            int var5 = this.field3434 + this.field3433;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field3429 - var4 > this.field3425) {
                this.field3425 = this.field3429 - var4;
            }
            if (this.field3432 < var5 + 256) {
                this.field3432 += 1024;
                if (this.field3432 > 16384) {
                    this.field3432 = 16384;
                }
                var4 = 0;
                this.method592();
                this.method589(this.field3432);
                this.field3431 = true;
                if (this.field3432 < var5 + 256) {
                    var5 = this.field3432 - 256;
                    this.field3433 = var5 - this.field3434;
                }
            }
            while (var5 > var4) {
                this.method1533(this.field3414, 256);
                var4 += 256;
                this.method591();
            }
            if (var2 > this.field3426) {
                if (this.field3431) {
                    this.field3431 = false;
                } else if (this.field3425 == 0 && this.field3423 == 0) {
                    this.method592();
                    this.field3422 = var2 + 2000L;
                    return;
                } else {
                    this.field3433 = Math.min(this.field3423, this.field3425);
                    this.field3423 = this.field3425;
                }
                this.field3425 = 0;
                this.field3426 = var2 + 2000L;
            }
            this.field3429 = var4;
        } catch (Exception var6) {
            this.method592();
            this.field3422 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "()V")
    public void method592() {
        field3430++;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "()V")
    public void method591() throws Exception {
        field3408++;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
    public final synchronized void method1535(byte arg0) {
        this.field3431 = true;
        try {
            this.method593();
        } catch (Exception var2) {
            this.method592();
            this.field3422 = class98.method665(true) + 2000L;
        }
        if (arg0 == 23) {
            field3401++;
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
    public final void method1536(int arg0) {
        if (arg0 == 32768) {
            field3406++;
            this.field3431 = true;
        }
    }
}

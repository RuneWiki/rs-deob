import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class215 extends class279 {

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    private int field3510 = 0;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    private int field3517 = 2048;

    @OriginalMember(owner = "client!hg", name = "Z", descriptor = "I")
    private int field3524 = 10;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "Lj;")
    public static class138 field3505 = new class138(64);

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "Ltl;")
    public static class59 field3515 = class85.method639("Lade Titelbild )2 ", 9588);

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "Ltl;")
    public static class59 field3516 = class85.method639(" weitere Optionen", 9588);

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    public static int field3514 = 0;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "Ltl;")
    public static class59 field3509 = class85.method639("Titelbild geladen)3", 9588);

    @OriginalMember(owner = "client!hg", name = "W", descriptor = "[J")
    public static long[] field3521 = new long[1000];

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "[I")
    public static int[] field3522 = new int[32];

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!hg", name = "Y", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "Loh;")
    public static class257 field3513;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "[I")
    private int[] field3511;

    @OriginalMember(owner = "client!hg", name = "ab", descriptor = "[I")
    private int[] field3525;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method1494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3506++;
        class245.method1736((byte) 116, arg1);
        int var7 = 0;
        int var8 = arg1 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = -arg1;
        int var10 = arg0;
        int var11 = -var8;
        int var12 = var8;
        int var13 = arg1;
        if (arg5 >= class28.field369 && class62.field957 >= arg5) {
            int[] var14 = class163.field2662[arg5];
            int var15 = class262.method1808(arg4 - arg1, class69.field1061, 0, class153.field2504);
            int var16 = class262.method1808(arg1 + arg4, class69.field1061, 0, class153.field2504);
            int var17 = class262.method1808(arg4 - var8, class69.field1061, 0, class153.field2504);
            int var18 = class262.method1808(arg4 + var8, class69.field1061, 0, class153.field2504);
            class174.method1283(7, arg2, var14, var15, var17);
            class174.method1283(7, arg6, var14, var17, var18);
            class174.method1283(7, arg2, var14, var18, var16);
        }
        int var19 = -1;
        while (var13 > var7) {
            var10 += 2;
            var11 += var10;
            var19 += 2;
            if (var11 >= 0 && var12 >= 1) {
                var12--;
                class147.field2401[var12] = var7;
                var11 -= var12 << 1;
            }
            var9 += var19;
            var7++;
            if (var9 >= 0) {
                var13--;
                int var20 = arg5 - var13;
                int var21 = arg5 + var13;
                var9 -= var13 << 1;
                if (class28.field369 <= var21 && var20 <= class62.field957) {
                    if (var8 > var13) {
                        int var22 = class147.field2401[var13];
                        int var23 = class262.method1808(arg4 + var7, class69.field1061, 0, class153.field2504);
                        int var24 = class262.method1808(arg4 - var7, class69.field1061, arg0 + 1, class153.field2504);
                        int var25 = class262.method1808(arg4 + var22, class69.field1061, ~arg0, class153.field2504);
                        int var26 = class262.method1808(arg4 - var22, class69.field1061, 0, class153.field2504);
                        if (class62.field957 >= var21) {
                            int[] var27 = class163.field2662[var21];
                            class174.method1283(7, arg2, var27, var24, var26);
                            class174.method1283(7, arg6, var27, var26, var25);
                            class174.method1283(7, arg2, var27, var25, var23);
                        }
                        if (var20 >= class28.field369) {
                            int[] var28 = class163.field2662[var20];
                            class174.method1283(7, arg2, var28, var24, var26);
                            class174.method1283(7, arg6, var28, var26, var25);
                            class174.method1283(7, arg2, var28, var25, var23);
                        }
                    } else {
                        int var29 = class262.method1808(arg4 + var7, class69.field1061, 0, class153.field2504);
                        int var30 = class262.method1808(arg4 - var7, class69.field1061, 0, class153.field2504);
                        if (var21 <= class62.field957) {
                            class174.method1283(7, arg2, class163.field2662[var21], var30, var29);
                        }
                        if (class28.field369 <= var20) {
                            class174.method1283(7, arg2, class163.field2662[var20], var30, var29);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (var32 >= class28.field369 && class62.field957 >= var31) {
                int var33 = arg4 + var13;
                int var34 = arg4 - var13;
                if (var33 >= class69.field1061 && var34 <= class153.field2504) {
                    int var35 = class262.method1808(var33, class69.field1061, arg0 + 1, class153.field2504);
                    int var36 = class262.method1808(var34, class69.field1061, arg0 + 1, class153.field2504);
                    if (var8 <= var7) {
                        if (var32 <= class62.field957) {
                            class174.method1283(arg0 + 8, arg2, class163.field2662[var32], var36, var35);
                        }
                        if (var31 >= class28.field369) {
                            class174.method1283(arg0 + 8, arg2, class163.field2662[var31], var36, var35);
                        }
                    } else {
                        int var37 = var12 < var7 ? class147.field2401[var7] : var12;
                        int var38 = class262.method1808(arg4 + var37, class69.field1061, 0, class153.field2504);
                        int var39 = class262.method1808(arg4 - var37, class69.field1061, ~arg0, class153.field2504);
                        if (class62.field957 >= var32) {
                            int[] var40 = class163.field2662[var32];
                            class174.method1283(7, arg2, var40, var36, var39);
                            class174.method1283(7, arg6, var40, var39, var38);
                            class174.method1283(7, arg2, var40, var38, var35);
                        }
                        if (class28.field369 <= var31) {
                            int[] var41 = class163.field2662[var31];
                            class174.method1283(7, arg2, var41, var36, var39);
                            class174.method1283(7, arg6, var41, var39, var38);
                            class174.method1283(7, arg2, var41, var38, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lme;I)V", line = 185)
    public static final void method1495(class295 arg0, int arg1) {
        field3518++;
        class143.field2361 = arg0;
        class90.field1424 = class143.field2361.method2040(4, (byte) -97);
        if (arg1 != 8715) {
            method1494(16, 70, -17, -42, -95, -10, 79);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/util/Random;II)I", line = 197)
    public static final int method1496(Random arg0, int arg1, int arg2) {
        field3520++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class25.method163((byte) 106, arg2)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = 54 % ((arg1 + 70) / 39);
            int var4 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            int var5;
            do {
                var5 = arg0.nextInt();
            } while (var4 <= var5);
            return class12.method81(0, arg2, var5);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)[I", line = 226)
    public final int[] method44(boolean arg0, int arg1) {
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        field3519++;
        if (this.field4781.field354) {
            int var4 = class71.field1104[arg1];
            if (this.field3510 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field3524; var12++) {
                    if (var4 >= this.field3525[var12] && var4 < this.field3525[var12 + 1]) {
                        if (this.field3511[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class63.method522(var3, 0, class56.field835, var11);
            } else {
                for (int var5 = 0; var5 < class56.field835; var5++) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class31.field430[var5];
                    int var9 = this.field3510;
                    if (var9 == 1) {
                        var6 = var8;
                    } else if (var9 == 2) {
                        var6 = (-(-var4 - var8) - 4096 >> 1) + 2048;
                    } else if (var9 == 3) {
                        var6 = (var8 - var4 >> 1) + 2048;
                    }
                    for (int var10 = 0; var10 < this.field3524; var10++) {
                        if (var6 >= this.field3525[var10] && this.field3525[var10 + 1] > var6) {
                            if (this.field3511[var10] > var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            }
        }
        if (arg0) {
            field3521 = (long[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V", line = 354)
    public static void method1497(int arg0) {
        field3509 = null;
        field3516 = null;
        field3513 = null;
        if (arg0 <= 30) {
            field3513 = (class257) null;
        }
        field3515 = null;
        field3522 = null;
        field3505 = null;
        field3521 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 379)
    public final void method319(byte arg0) {
        if (arg0 >= -9) {
            field3509 = (class59) null;
        }
        field3512++;
        this.method1498(110);
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V", line = 442)
    public class215() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V", line = 408)
    private final void method1498(int arg0) {
        this.field3511 = new int[this.field3524 + 1];
        this.field3525 = new int[this.field3524 + 1];
        field3508++;
        int var2 = 4096 / this.field3524;
        int var3 = this.field3517 * var2 >> 12;
        int var4 = 0;
        if (arg0 <= 27) {
            this.method44(true, -10);
        }
        for (int var5 = 0; var5 < this.field3524; var5++) {
            this.field3525[var5] = var4;
            this.field3511[var5] = var3 + var4;
            var4 += var2;
        }
        this.field3525[this.field3524] = 4096;
        this.field3511[this.field3524] = this.field3511[0] + 4096;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILs;)V", line = 453)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg0 > -125) {
            return;
        }
        field3507++;
        if (arg1 == 0) {
            this.field3524 = arg2.method1221(100);
        } else if (arg1 == 1) {
            this.field3517 = arg2.method1214(-18254);
        } else if (arg1 == 2) {
            this.field3510 = arg2.method1221(123);
        }
    }
}

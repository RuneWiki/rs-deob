import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class204 extends class182 {

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
    private int field3395 = 0;

    @OriginalMember(owner = "client!ao", name = "N", descriptor = "I")
    private int field3399 = 0;

    @OriginalMember(owner = "client!ao", name = "M", descriptor = "I")
    private int field3398 = 1365;

    @OriginalMember(owner = "client!ao", name = "S", descriptor = "I")
    private int field3404 = 20;

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
    public static int field3396 = 0;

    @OriginalMember(owner = "client!ao", name = "V", descriptor = "I")
    public static int field3407 = -1;

    @OriginalMember(owner = "client!ao", name = "K", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!ao", name = "O", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!ao", name = "P", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!ao", name = "Q", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!ao", name = "R", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!ao", name = "T", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!ao", name = "U", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Loe;IB)V", line = 6)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg2 != 60) {
            this.field3399 = 66;
        }
        if (arg1 == 0) {
            this.field3398 = arg0.method989(arg2 ^ 0x6B);
        } else if (arg1 == 1) {
            this.field3404 = arg0.method989(arg2 ^ 0x72);
        } else if (arg1 == 2) {
            this.field3399 = arg0.method989(105);
        } else if (arg1 == 3) {
            this.field3395 = arg0.method989(111);
        }
        field3400++;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V", line = 104)
    public class204() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "(I)Lae;", line = 67)
    public static final class310 method1391(int arg0) {
        field3405++;
        if (arg0 != 1365) {
            field3396 = -109;
        }
        try {
            return (class310) Class.forName("rc").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(III)Lg;", line = 86)
    public static final class181 method1392(int arg0, int arg1, int arg2) {
        class181 var3 = class224.method1564(-98, arg0);
        field3401++;
        if (arg1 != 1) {
            return (class181) null;
        } else if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field3095 == null || arg2 >= var3.field3095.length) {
            return null;
        } else {
            return var3.field3095[arg2];
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B[I[III)V", line = 109)
    public static final void method1393(byte arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        field3402++;
        if (arg3 > arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var8;
            for (int var9 = arg4; var9 < arg3; var9++) {
                if ((var9 & 0x1) + var7 > arg1[var9]) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var8;
            method1393((byte) -90, arg1, arg2, var6 - 1, arg4);
            method1393((byte) -84, arg1, arg2, arg3, var6 + 1);
        }
        if (arg0 > -52) {
            method1392(86, 43, 64);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILek;Lek;Z)V", line = 163)
    public static final void method1394(int arg0, class206 arg1, class206 arg2, boolean arg3) {
        class16.field475 = arg2;
        field3403++;
        if (arg0 < -93) {
            class122.field2151 = arg3;
            class156.field2642 = arg1;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)[I", line = 184)
    public final int[] method125(int arg0, int arg1) {
        field3406++;
        int[] var3 = this.field3166.method775(arg1, 125);
        if (arg0 != 2) {
            this.method125(-76, -36);
        }
        if (this.field3166.field1903) {
            for (int var4 = 0; var4 < class26.field672; var4++) {
                int var5 = (class21.field539[var4] << 12) / this.field3398 + this.field3399;
                int var6 = (class248.field4066[arg1] << 12) / this.field3398 + this.field3395;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6 * var6 >> 12;
                int var11 = var5 * var5 >> 12;
                int var12 = 0;
                int var13 = var6;
                while (var10 + var11 < 16384 && var12 < this.field3404) {
                    var13 = (var9 * var13 >> 12) * 2 + var8;
                    var9 = var7 + var11 - var10;
                    var10 = var13 * var13 >> 12;
                    var11 = var9 * var9 >> 12;
                    var12++;
                }
                var3[var4] = this.field3404 - 1 > var12 ? (var12 << 12) / this.field3404 : 0;
            }
        }
        return var3;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class205 extends class262 {

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "I")
    private int field3406 = 0;

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
    private int field3403 = 0;

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
    private int field3407 = 0;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "Lhd;")
    public static class117 field3402 = new class117(50);

    @OriginalMember(owner = "client!lb", name = "eb", descriptor = "I")
    public static int field3414 = 0;

    @OriginalMember(owner = "client!lb", name = "ib", descriptor = "I")
    public static int field3418 = 0;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "I")
    private int field3398;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "I")
    private int field3399;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "I")
    private int field3400;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
    private int field3404;

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "I")
    private int field3408;

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
    private int field3409;

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!lb", name = "db", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!lb", name = "fb", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!lb", name = "gb", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!lb", name = "hb", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!lb", name = "cb", descriptor = "Z")
    public static boolean field3412;

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 3)
    public class205() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[Lok;II)Lok;", line = 8)
    public static final class146 method1553(int arg0, class146[] arg1, int arg2, int arg3) {
        field3401++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg1[arg0 + var5] == null) {
                arg1[arg0 + var5] = class127.field2064;
            }
            var4 += arg1[arg0 + var5].field2461;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg3; var8++) {
            class146 var9 = arg1[arg0 + var8];
            class244.method1768(var9.field2462, 0, var6, var7, var9.field2461);
            var7 += var9.field2461;
        }
        if (arg2 == 17804) {
            class146 var10 = new class146();
            var10.field2461 = var4;
            var10.field2462 = var6;
            return var10;
        } else {
            return (class146) null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)V", line = 53)
    private final void method1554(int arg0, int arg1, int arg2, int arg3) {
        field3405++;
        int var5 = arg3 < arg2 ? arg2 : arg3;
        if (arg0 != 520) {
            return;
        }
        int var6 = arg1 > var5 ? arg1 : var5;
        int var7 = arg3 > arg2 ? arg2 : arg3;
        int var8 = arg1 >= var7 ? var7 : arg1;
        this.field3409 = (var6 + var8) / 2;
        int var9 = var6 - var8;
        if (var9 > 0) {
            int var10 = (var6 - arg2 << 12) / var9;
            int var11 = (var6 - arg1 << 12) / var9;
            int var12 = (var6 - arg3 << 12) / var9;
            if (arg2 == var6) {
                this.field3408 = arg3 == var8 ? var11 + 20480 : -var12 + 4096;
            } else if (arg3 == var6) {
                this.field3408 = arg1 == var8 ? var10 + 4096 : 12288 - var11;
            } else {
                this.field3408 = arg2 == var8 ? var12 + 12288 : 20480 - var10;
            }
            this.field3408 /= 6;
        } else {
            this.field3408 = 0;
        }
        if (this.field3409 > 0 && this.field3409 < 4096) {
            this.field3398 = (var9 << 12) / (this.field3409 <= 2048 ? this.field3409 * 2 : 8192 - (this.field3409 * 2));
        } else {
            this.field3398 = 0;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(IZ)I", line = 109)
    public static final int method1555(int arg0, boolean arg1) {
        if (class98.field1582 != null) {
            class98.field1582.method284((byte) 115);
            class98.field1582 = null;
        }
        class297.field5059++;
        if (arg1) {
            field3418 = 67;
        }
        field3417++;
        if (class297.field5059 > 4) {
            class164.field2776 = 0;
            class297.field5059 = 0;
            return arg0;
        }
        if (class265.field4556 == class147.field2490) {
            class147.field2490 = class198.field3293;
        } else {
            class147.field2490 = class265.field4556;
        }
        class164.field2776 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIBI)V", line = 167)
    private final void method1556(int arg0, int arg1, byte arg2, int arg3) {
        field3411++;
        int var5 = arg3 <= 2048 ? (arg1 + 4096) * arg3 >> 12 : arg1 + arg3 - (arg1 * arg3 >> 12);
        if (var5 <= 0) {
            this.field3400 = this.field3404 = this.field3399 = arg3;
        } else {
            int var6 = arg0 * 6;
            int var7 = arg3 + arg3 - var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var5 - var13;
            int var15 = var7 + var13;
            if (var9 == 0) {
                this.field3400 = var5;
                this.field3404 = var15;
                this.field3399 = var7;
            } else if (var9 == 1) {
                this.field3404 = var5;
                this.field3400 = var14;
                this.field3399 = var7;
            } else if (var9 == 2) {
                this.field3400 = var7;
                this.field3404 = var5;
                this.field3399 = var15;
            } else if (var9 == 3) {
                this.field3404 = var14;
                this.field3400 = var7;
                this.field3399 = var5;
            } else if (var9 == 4) {
                this.field3404 = var7;
                this.field3399 = var5;
                this.field3400 = var15;
            } else if (var9 == 5) {
                this.field3400 = var5;
                this.field3404 = var7;
                this.field3399 = var14;
            }
        }
        if (arg2 != -17) {
            field3412 = true;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lwe;II)V", line = 282)
    public final void method40(class47 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3407 = arg0.method343(arg1 + 24119);
        } else if (arg2 == 1) {
            this.field3406 = (arg0.method352(255) << 12) / 100;
        } else if (arg2 == 2) {
            this.field3403 = (arg0.method352(255) << 12) / 100;
        }
        if (arg1 != 2048) {
            method1553(-29, (class146[]) null, -4, 97);
        }
        field3416++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Loh;Loh;B)V", line = 326)
    public static final void method1557(class15 arg0, class15 arg1, byte arg2) {
        class258.field4286 = arg0;
        int var3 = -56 % ((-arg2 - 41) / 32);
        field3410++;
        class180.field3029 = arg1;
        class25.field443 = class180.field3029.method95(64, 3);
    }

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)V", line = 347)
    public static void method1558(int arg0) {
        if (arg0 != 6051) {
            method1557((class15) null, (class15) null, (byte) 34);
        }
        field3402 = null;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)[[I", line = 357)
    public final int[][] method87(int arg0, int arg1) {
        field3413++;
        int[][] var3 = this.field4347.method536(arg1, 4096);
        if (this.field4347.field1202) {
            int[][] var4 = this.method1893(0, arg1, arg0 ^ 0xFFFFFF9D);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class98.field1598; var11++) {
                this.method1554(arg0 + 513, var7[var11], var5[var11], var6[var11]);
                for (this.field3408 += this.field3407; this.field3408 < 0; this.field3408 += 4096) {
                }
                this.field3398 += this.field3406;
                if (this.field3398 < 0) {
                    this.field3398 = 0;
                }
                this.field3409 += this.field3403;
                while (this.field3408 > 4096) {
                    this.field3408 -= 4096;
                }
                if (this.field3409 < 0) {
                    this.field3409 = 0;
                }
                if (this.field3398 > 4096) {
                    this.field3398 = 4096;
                }
                if (this.field3409 > 4096) {
                    this.field3409 = 4096;
                }
                this.method1556(this.field3408, this.field3398, (byte) -17, this.field3409);
                var8[var11] = this.field3400;
                var10[var11] = this.field3404;
                var9[var11] = this.field3399;
            }
        }
        if (arg0 != 7) {
            method1553(-127, (class146[]) null, 11, 100);
        }
        return var3;
    }
}

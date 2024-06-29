import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class172 extends class64 {

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    private int field3409 = 4096;

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
    private int field3417 = 12288;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    private int field3414 = 0;

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "I")
    private int field3419 = 0;

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
    private int field3420 = 20480;

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "I")
    private int field3425 = 2048;

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
    private int field3427 = 2048;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "[Z")
    public static boolean[] field3412 = new boolean[100];

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
    public static int field3421 = 0;

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "I")
    public static int field3423 = 0;

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "I")
    public static int field3426 = 0;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field3410;
        int[] var3 = super.field1513.method1033(-78, arg0);
        if (arg1 != -9421) {
            this.method1083(37, 1, (byte) -120);
        }
        if (super.field1513.field3368) {
            int var4 = class95.field1995[arg0] + -2048;
            for (int var5 = 0; var5 < class168.field3367; ++var5) {
                int var6 = this.field3414 + var4;
                int var7 = ~var6 <= 2047 ? var6 : var6 + 4096;
                int var8 = var7 > 2048 ? var7 - 4096 : var7;
                int var9 = class174.field3475[var5] + -2048;
                int var10 = this.field3425 + var9;
                int var11 = this.field3427 + var4;
                int var12 = ~var10 <= 2047 ? var10 : var10 + 4096;
                int var13 = var12 > 2048 ? var12 + -4096 : var12;
                int var14 = this.field3419 + var9;
                int var15 = ~var11 <= 2047 ? var11 : var11 - -4096;
                int var16 = ~var15 < -2049 ? var15 + -4096 : var15;
                int var17 = ~var14 > 2047 ? var14 + 4096 : var14;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method1083(var8, var13, (byte) 89) && !this.method1084(var16, false, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
    public static void method1082(byte arg0) {
        field3412 = null;
        if (arg0 != 57) {
            field3426 = -39;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIB)Z")
    private final boolean method1083(int arg0, int arg1, byte arg2) {
        if (arg2 < 44) {
            return false;
        } else {
            ++field3415;
            int var4 = (-arg1 + arg0) * this.field3417 >> 12;
            int var5 = class48.field1151[255 & var4 * 255 >> 12];
            int var6 = (var5 << 12) / this.field3417;
            int var7 = (var6 << 12) / this.field3420;
            int var8 = this.field3409 * var7 >> 12;
            return ~var8 < ~(arg0 + arg1) && arg1 - -arg0 > -var8;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZI)Z")
    private final boolean method1084(int arg0, boolean arg1, int arg2) {
        ++field3413;
        int var4 = (arg0 + arg2) * this.field3417 >> 12;
        int var5 = class48.field1151[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field3417;
        int var7 = (var6 << 12) / this.field3420;
        if (arg1) {
            this.method1084(12, true, -60);
        }
        int var8 = this.field3409 * var7 >> 12;
        return ~var8 < ~(-arg2 + arg0) && ~(-var8) > ~(-arg2 + arg0);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lcd;I)V")
    public static final void method1085(class23 arg0, int arg1) {
        ++field3424;
        if (class159.field3189 != null) {
            int var2 = 0;
            if (arg1 != -2048) {
                field3426 = 118;
            }
            long var3 = arg0.method166((byte) -121);
            if (var3 != 0L) {
                while (var2 < class159.field3189.length && ~class159.field3189[var2].field3317 != ~var3) {
                    ++var2;
                }
                if (class159.field3189.length > var2 && class159.field3189[var2] != null) {
                    ++class29.field623;
                    class159.field3190.method631(219, -1);
                    class159.field3190.method1199(class159.field3189[var2].field3317, -1898826808);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        int var4 = -22 % ((7 - arg0) / 43);
        ++field3418;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field3420 = arg2.method1197(-1);
                                }
                            } else {
                                this.field3409 = arg2.method1197(-1);
                            }
                        } else {
                            this.field3417 = arg2.method1197(-1);
                        }
                    } else {
                        this.field3427 = arg2.method1197(-1);
                    }
                } else {
                    this.field3419 = arg2.method1197(-1);
                }
            } else {
                this.field3414 = arg2.method1197(-1);
            }
        } else {
            this.field3425 = arg2.method1197(-1);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
    public final void method44(byte arg0) {
        ++field3411;
        if (arg0 != -22) {
            this.method1084(75, false, -97);
        }
        class111.method715(4096);
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class172() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)Lcd;")
    public static final class23 method1086(int arg0, int arg1) {
        ++field3416;
        if (arg0 < 100000) {
            return class3.method14(true, new class23[] { class200.field3957, class184.method1132(-1, arg0), class60.field1404 });
        } else if (~arg0 > -10000001) {
            return class3.method14(true, new class23[] { class113.field2377, class184.method1132(-1, arg0 / 1000), class68.field1607, class60.field1404 });
        } else {
            if (arg1 != 1000000) {
                field3412 = null;
            }
            return class3.method14(true, new class23[] { class146.field2990, class184.method1132(-1, arg0 / 1000000), class66.field1565, class60.field1404 });
        }
    }
}

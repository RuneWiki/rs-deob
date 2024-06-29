import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class171 extends class51 {

    @OriginalMember(owner = "client!ta", name = "ib", descriptor = "I")
    private int field3500 = 0;

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "I")
    private int field3491 = 2048;

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "I")
    private int field3493 = 2048;

    @OriginalMember(owner = "client!ta", name = "kb", descriptor = "I")
    private int field3502 = 0;

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "I")
    private int field3492 = 20480;

    @OriginalMember(owner = "client!ta", name = "fb", descriptor = "I")
    private int field3497 = 12288;

    @OriginalMember(owner = "client!ta", name = "eb", descriptor = "I")
    private int field3496 = 4096;

    @OriginalMember(owner = "client!ta", name = "gb", descriptor = "Lea;")
    public static class38 field3498 = class9.method46((byte) 102, "Neuer Benutzer");

    @OriginalMember(owner = "client!ta", name = "qb", descriptor = "Lea;")
    public static class38 field3508 = class9.method46((byte) 108, "Stufe)2");

    @OriginalMember(owner = "client!ta", name = "mb", descriptor = "Lea;")
    private static class38 field3504 = class9.method46((byte) 112, "Bad session id)3");

    @OriginalMember(owner = "client!ta", name = "cb", descriptor = "Lea;")
    public static class38 field3494 = field3504;

    @OriginalMember(owner = "client!ta", name = "ub", descriptor = "I")
    public static int field3512 = 0;

    @OriginalMember(owner = "client!ta", name = "tb", descriptor = "I")
    public static int field3511 = 0;

    @OriginalMember(owner = "client!ta", name = "pb", descriptor = "[I")
    public static int[] field3507 = new int[32];

    @OriginalMember(owner = "client!ta", name = "rb", descriptor = "[Z")
    public static boolean[] field3509 = new boolean[5];

    @OriginalMember(owner = "client!ta", name = "db", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!ta", name = "hb", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!ta", name = "jb", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ta", name = "lb", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!ta", name = "nb", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ta", name = "ob", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!ta", name = "sb", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
    public final void method235(int arg0) {
        class165.method1177(108);
        ++field3501;
        if (arg0 != -2) {
            this.method55(103, -90);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (arg2) {
            ++field3503;
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 != 2) {
                        if (~arg1 != -4) {
                            if (~arg1 != -5) {
                                if (~arg1 != -6) {
                                    if (arg1 == 6) {
                                        this.field3492 = arg0.method511(-123);
                                    }
                                } else {
                                    this.field3496 = arg0.method511(-127);
                                }
                            } else {
                                this.field3497 = arg0.method511(-125);
                            }
                        } else {
                            this.field3493 = arg0.method511(26);
                        }
                    } else {
                        this.field3502 = arg0.method511(-126);
                    }
                } else {
                    this.field3500 = arg0.method511(8);
                }
            } else {
                this.field3491 = arg0.method511(71);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(III)Z")
    private final boolean method1202(int arg0, int arg1, int arg2) {
        if (arg0 < 59) {
            this.field3493 = -68;
        }
        ++field3510;
        int var4 = (arg2 - arg1) * this.field3497 >> 12;
        int var5 = class33.field673[(1047648 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field3497;
        int var7 = (var6 << 12) / this.field3492;
        int var8 = this.field3496 * var7 >> 12;
        return var8 > arg1 + arg2 && -var8 < arg1 + arg2;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class171() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BII)Z")
    private final boolean method1203(byte arg0, int arg1, int arg2) {
        ++field3506;
        int var4 = (arg1 - -arg2) * this.field3497 >> 12;
        int var5 = class33.field673[(1047169 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field3497;
        int var7 = (var6 << 12) / this.field3492;
        if (arg0 != -12) {
            return false;
        } else {
            int var8 = this.field3496 * var7 >> 12;
            return -arg2 + arg1 < var8 && -arg2 + arg1 > -var8;
        }
    }

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "(I)V")
    public static void method1204(int arg0) {
        field3508 = null;
        field3509 = null;
        if (arg0 != 2048) {
            method1205(-18, 35L);
        }
        field3498 = null;
        field3504 = null;
        field3507 = null;
        field3494 = null;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        if (arg0 >= -125) {
            field3498 = null;
        }
        ++field3505;
        int[] var3 = super.field1312.method827(arg1, true);
        if (super.field1312.field2271) {
            int var4 = class170.field3490[arg1] + -2048;
            for (int var5 = 0; ~class86.field2008 < ~var5; ++var5) {
                int var6 = class196.field3854[var5] - 2048;
                int var7 = this.field3491 + var6;
                int var8 = this.field3493 + var4;
                int var9 = ~var8 > 2047 ? var8 + 4096 : var8;
                int var10 = var9 <= 2048 ? var9 : var9 + -4096;
                int var11 = var7 >= -2048 ? var7 : var7 + 4096;
                int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                int var13 = this.field3500 + var4;
                int var14 = this.field3502 + var6;
                int var15 = ~var13 > 2047 ? var13 - -4096 : var13;
                int var16 = var15 > 2048 ? var15 + -4096 : var15;
                int var17 = ~var14 > 2047 ? var14 + 4096 : var14;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method1202(107, var12, var16) && !this.method1203((byte) -12, var10, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IJ)V")
    public static final void method1205(int arg0, long arg1) {
        ++field3495;
        if (~arg1 != -1L) {
            int var3 = -20 % ((arg0 - -25) / 63);
            for (int var4 = 0; ~var4 > ~class43.field951; ++var4) {
                if (~class186.field3704[var4] == ~arg1) {
                    ++class51.field1299;
                    --class43.field951;
                    for (int var5 = var4; ~class43.field951 < ~var5; ++var5) {
                        class186.field3704[var5] = class186.field3704[var5 - -1];
                        class43.field943[var5] = class43.field943[var5 + 1];
                    }
                    class181.field3653 = class192.field3796;
                    class111.field2483.method169(-1494101117, 1);
                    class111.field2483.method480(arg1, (byte) -82);
                    return;
                }
            }
        }
    }
}

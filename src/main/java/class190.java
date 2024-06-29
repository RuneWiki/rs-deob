import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class190 extends class43 {

    @OriginalMember(owner = "client!rf", name = "cb", descriptor = "I")
    private int field3514 = 1024;

    @OriginalMember(owner = "client!rf", name = "fb", descriptor = "I")
    private int field3517 = 81;

    @OriginalMember(owner = "client!rf", name = "ob", descriptor = "I")
    private int field3526 = 204;

    @OriginalMember(owner = "client!rf", name = "nb", descriptor = "I")
    private int field3525 = 409;

    @OriginalMember(owner = "client!rf", name = "kb", descriptor = "I")
    private int field3522 = 4;

    @OriginalMember(owner = "client!rf", name = "gb", descriptor = "I")
    private int field3518 = 8;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "I")
    private int field3512 = 1024;

    @OriginalMember(owner = "client!rf", name = "sb", descriptor = "I")
    private int field3530 = 0;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "Lmb;")
    private static class132 field3508 = class166.method1092("and choose the (Wcreate account(W", 126);

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "I")
    public static int field3509 = 0;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "Lmb;")
    private static class132 field3505 = class166.method1092("Please wait 1 minute and try again)3", 118);

    @OriginalMember(owner = "client!rf", name = "pb", descriptor = "Lmb;")
    public static class132 field3527 = field3508;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "Lmb;")
    public static class132 field3507 = field3505;

    @OriginalMember(owner = "client!rf", name = "tb", descriptor = "[[[I")
    public static int[][][] field3531 = new int[4][105][105];

    @OriginalMember(owner = "client!rf", name = "qb", descriptor = "Lmb;")
    public static class132 field3528 = field3505;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "I")
    private int field3513;

    @OriginalMember(owner = "client!rf", name = "db", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!rf", name = "eb", descriptor = "I")
    private int field3516;

    @OriginalMember(owner = "client!rf", name = "hb", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!rf", name = "ib", descriptor = "I")
    private int field3520;

    @OriginalMember(owner = "client!rf", name = "jb", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!rf", name = "mb", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!rf", name = "rb", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "[I")
    private int[] field3506;

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "[[I")
    private int[][] field3511;

    @OriginalMember(owner = "client!rf", name = "lb", descriptor = "[[I")
    private int[][] field3523;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(Z)V")
    public static void method1212(boolean arg0) {
        field3531 = null;
        field3507 = null;
        field3508 = null;
        field3505 = null;
        if (arg0) {
            field3528 = null;
            field3527 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)V")
    private final void method1213(int arg0) {
        ++field3515;
        Random var2 = new Random((long) this.field3518);
        this.field3511 = new int[this.field3518][this.field3522 - -1];
        this.field3513 = 4096 / this.field3518;
        this.field3516 = this.field3517 / 2;
        this.field3506 = new int[this.field3518 - -1];
        this.field3520 = 4096 / this.field3522;
        this.field3506[arg0] = 0;
        this.field3523 = new int[this.field3518][this.field3522];
        int var3 = this.field3520 / 2;
        int var4 = this.field3513 / 2;
        for (int var5 = 0; var5 < this.field3518; ++var5) {
            if (var5 > 0) {
                int var6 = this.field3513;
                int var7 = (-2048 + class133.method914((byte) 53, var2, 4096)) * this.field3526 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3506[var5] = this.field3506[var5 + -1] + var8;
            }
            this.field3511[var5][0] = 0;
            for (int var9 = 0; var9 < this.field3522; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field3520;
                    int var11 = (-2048 + class133.method914((byte) 53, var2, 4096)) * this.field3525 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3511[var5][var9] = this.field3511[var5][var9 + -1] + var12;
                }
                this.field3523[var5][var9] = this.field3512 > 0 ? -class133.method914((byte) 53, var2, this.field3512) + 4096 : 4096;
            }
            this.field3511[var5][this.field3522] = 4096;
        }
        this.field3506[this.field3518] = 4096;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        int[] var3 = super.field768.method1123(arg1, arg0);
        if (super.field768.field3219) {
            int var4 = 0;
            int var5;
            for (var5 = class2.field35[arg0] + this.field3530; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~this.field3518 < ~var4 && var5 >= this.field3506[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (1 & var4) == 0;
            int var8 = this.field3506[var4 + -1];
            int var9 = this.field3506[var4];
            if (this.field3516 + var8 < var5 && var5 < -this.field3516 + var9) {
                for (int var10 = 0; var10 < class131.field2427; ++var10) {
                    int var11 = var7 ? this.field3514 : -this.field3514;
                    int var12;
                    for (var12 = (this.field3520 * var11 >> 12) + class156.field2849[var10]; ~var12 > -1; var12 += 4096) {
                    }
                    int var13 = 0;
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    while (~this.field3522 < ~var13 && ~var12 <= ~this.field3511[var6][var13]) {
                        ++var13;
                    }
                    int var14 = var13 + -1;
                    int var15 = this.field3511[var6][var13];
                    int var16 = this.field3511[var6][var14];
                    if (var12 > this.field3516 + var16 && ~var12 > ~(-this.field3516 + var15)) {
                        var3[var10] = this.field3523[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class80.method493(var3, 0, class131.field2427, 0);
            }
        }
        ++field3521;
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (~arg0 == -8) {
                                        this.field3512 = arg2.method739(77);
                                    }
                                } else {
                                    this.field3517 = arg2.method739(-124);
                                }
                            } else {
                                this.field3530 = arg2.method739(arg1 ^ 52);
                            }
                        } else {
                            this.field3514 = arg2.method739(arg1 + -50);
                        }
                    } else {
                        this.field3526 = arg2.method739(arg1 ^ 51);
                    }
                } else {
                    this.field3525 = arg2.method739(arg1 + -53);
                }
            } else {
                this.field3518 = arg2.method716(-1308);
            }
        } else {
            this.field3522 = arg2.method716(-1308);
        }
        if (arg1 == -73) {
            ++field3510;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I[B)V")
    public static final void method1214(int arg0, byte[] arg1) {
        ++field3529;
        int var2 = 0;
        while (true) {
            while (arg1.length > var2) {
                int var3 = -class28.field451 + 64 * (arg1[var2++] & 255);
                int var4 = -class141.field2632 + 64 * (255 & arg1[var2++]);
                if (~var3 < -1 && ~var4 < -1 && var3 - -64 < class192.field3586 && ~(var4 + 64) > ~class113.field2188) {
                    int var5 = var3 >> 6;
                    int var6 = -var4 + -1 + class113.field2188 >> 6;
                    for (int var7 = 0; ~var7 > -65; ++var7) {
                        for (int var8 = -64; ~var8 > -1; ++var8) {
                            byte var9 = arg1[var2++];
                            if (var9 != 0) {
                                if (class154.field2813[var5][var6] == null) {
                                    class154.field2813[var5][var6] = new byte[4096];
                                }
                                class154.field2813[var5][var6][(-(var8 + 1) << 6) + var7] = var9;
                                byte var10 = arg1[var2++];
                                if (class24.field369[var5][var6] == null) {
                                    class24.field369[var5][var6] = new byte[4096];
                                }
                                class24.field369[var5][var6][(-(var8 + 1) << 6) + var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; ~var11 > -1; ++var11) {
                        byte var12 = arg1[var2++];
                        if (~var12 != -1) {
                            ++var2;
                        }
                    }
                }
            }
            if (arg0 != 4096) {
                field3527 = null;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class190() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
    public final void method234(int arg0) {
        if (arg0 < 21) {
            method1212(false);
        }
        this.method1213(0);
        ++field3524;
    }
}

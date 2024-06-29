import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class315 extends class298 {

    @OriginalMember(owner = "client!es", name = "U", descriptor = "I")
    private int field4599 = 1024;

    @OriginalMember(owner = "client!es", name = "Q", descriptor = "I")
    private int field4596 = 4;

    @OriginalMember(owner = "client!es", name = "N", descriptor = "I")
    private int field4593 = 8;

    @OriginalMember(owner = "client!es", name = "S", descriptor = "I")
    private int field4598 = 1024;

    @OriginalMember(owner = "client!es", name = "R", descriptor = "I")
    private int field4597 = 204;

    @OriginalMember(owner = "client!es", name = "Z", descriptor = "I")
    private int field4604 = 409;

    @OriginalMember(owner = "client!es", name = "L", descriptor = "I")
    private int field4591 = 0;

    @OriginalMember(owner = "client!es", name = "eb", descriptor = "I")
    private int field4609 = 81;

    @OriginalMember(owner = "client!es", name = "V", descriptor = "Lec;")
    public static class40 field4600 = new class40("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!es", name = "gb", descriptor = "Lec;")
    public static class40 field4611 = new class40("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!es", name = "ib", descriptor = "I")
    public static int field4613 = 0;

    @OriginalMember(owner = "client!es", name = "K", descriptor = "I")
    private int field4590;

    @OriginalMember(owner = "client!es", name = "M", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!es", name = "P", descriptor = "I")
    private int field4595;

    @OriginalMember(owner = "client!es", name = "X", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!es", name = "Y", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!es", name = "ab", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!es", name = "bb", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!es", name = "fb", descriptor = "I")
    private int field4610;

    @OriginalMember(owner = "client!es", name = "hb", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!es", name = "db", descriptor = "Lue;")
    public static class142 field4608;

    @OriginalMember(owner = "client!es", name = "O", descriptor = "[I")
    private int[] field4594;

    @OriginalMember(owner = "client!es", name = "W", descriptor = "[[I")
    private int[][] field4601;

    @OriginalMember(owner = "client!es", name = "cb", descriptor = "[[I")
    private int[][] field4607;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V")
    public final void method15(int arg0) {
        ++field4605;
        if (arg0 >= -41) {
            this.method15(47);
        }
        this.method1946(4096);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)[I")
    public final int[] method13(int arg0, boolean arg1) {
        ++field4606;
        if (!arg1) {
            return null;
        } else {
            int[] var3 = super.field4443.method2877(arg0, 1);
            if (super.field4443.field6915) {
                int var4 = 0;
                int var5;
                for (var5 = class156.field1865[arg0] + this.field4591; var5 < 0; var5 += 4096) {
                }
                while (var5 > 4096) {
                    var5 -= 4096;
                }
                while (var4 < this.field4593 && this.field4594[var4] <= var5) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = ~(var4 & 1) == -1;
                int var8 = this.field4594[var4];
                int var9 = this.field4594[var4 - 1];
                if (this.field4610 + var9 < var5 && ~(var8 - this.field4610) < ~var5) {
                    for (int var10 = 0; class158.field1877 > var10; ++var10) {
                        int var11 = var7 ? this.field4599 : -this.field4599;
                        int var12 = 0;
                        int var13;
                        for (var13 = class236.field3260[var10] - -(this.field4590 * var11 >> 12); var13 < 0; var13 += 4096) {
                        }
                        while (var13 > 4096) {
                            var13 -= 4096;
                        }
                        while (~this.field4596 < ~var12 && ~var13 <= ~this.field4601[var6][var12]) {
                            ++var12;
                        }
                        int var14 = var12 + -1;
                        int var15 = this.field4601[var6][var12];
                        int var16 = this.field4601[var6][var14];
                        if (~(this.field4610 + var16) > ~var13 && ~var13 > ~(var15 - this.field4610)) {
                            var3[var10] = this.field4607[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class268.method1621(var3, 0, class158.field1877, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V")
    public static void method1944(int arg0) {
        field4600 = null;
        if (arg0 > -113) {
            method1944(103);
        }
        field4608 = null;
        field4611 = null;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IILvt;)V")
    public final void method10(int arg0, int arg1, class179 arg2) {
        if (arg0 < -44) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (arg1 != 3) {
                            if (~arg1 != -5) {
                                if (arg1 != 5) {
                                    if (arg1 != 6) {
                                        if (arg1 == 7) {
                                            this.field4598 = arg2.method916(21933);
                                        }
                                    } else {
                                        this.field4609 = arg2.method916(21933);
                                    }
                                } else {
                                    this.field4591 = arg2.method916(21933);
                                }
                            } else {
                                this.field4599 = arg2.method916(21933);
                            }
                        } else {
                            this.field4597 = arg2.method916(21933);
                        }
                    } else {
                        this.field4604 = arg2.method916(21933);
                    }
                } else {
                    this.field4593 = arg2.method895((byte) -92);
                }
            } else {
                this.field4596 = arg2.method895((byte) -94);
            }
            ++field4603;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILg;)V")
    public static final void method1945(int arg0, class470 arg1) {
        class144.field1738 = arg1;
        ++field4592;
        if (arg0 != -29811) {
            field4612 = -22;
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "()V")
    public class315() {
        super(0, true);
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(I)V")
    private final void method1946(int arg0) {
        ++field4602;
        Random var2 = new Random((long) this.field4593);
        this.field4595 = 4096 / this.field4593;
        this.field4610 = this.field4609 / 2;
        this.field4590 = 4096 / this.field4596;
        int var3 = this.field4590 / 2;
        int var4 = this.field4595 / 2;
        this.field4601 = new int[this.field4593][this.field4596 - -1];
        this.field4594 = new int[this.field4593 - -1];
        this.field4607 = new int[this.field4593][this.field4596];
        this.field4594[0] = 0;
        for (int var5 = 0; var5 < this.field4593; ++var5) {
            if (var5 > 0) {
                int var6 = this.field4595;
                int var7 = (-2048 + class459.method2706(4096, var2, arg0 ^ 4159)) * this.field4597 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4594[var5] = this.field4594[var5 - 1] + var8;
            }
            this.field4601[var5][0] = 0;
            for (int var9 = 0; var9 < this.field4596; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field4590;
                    int var11 = (-2048 + class459.method2706(4096, var2, -46)) * this.field4604 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4601[var5][var9] = this.field4601[var5][var9 + -1] + var12;
                }
                this.field4607[var5][var9] = this.field4598 <= 0 ? 4096 : 4096 - class459.method2706(this.field4598, var2, 120);
            }
            this.field4601[var5][this.field4596] = 4096;
        }
        this.field4594[this.field4593] = arg0;
    }
}

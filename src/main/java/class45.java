import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class45 extends class23 {

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    private int field779 = 1024;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "I")
    private int field781 = 409;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    private int field776 = 0;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
    private int field788 = 81;

    @OriginalMember(owner = "client!e", name = "nb", descriptor = "I")
    private int field797 = 4;

    @OriginalMember(owner = "client!e", name = "ob", descriptor = "I")
    private int field798 = 1024;

    @OriginalMember(owner = "client!e", name = "pb", descriptor = "I")
    private int field799 = 8;

    @OriginalMember(owner = "client!e", name = "gb", descriptor = "I")
    private int field790 = 204;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "Lwi;")
    public static class248 field783 = new class248();

    @OriginalMember(owner = "client!e", name = "mb", descriptor = "I")
    public static int field796 = 0;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "I")
    private int field787;

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!e", name = "hb", descriptor = "I")
    private int field791;

    @OriginalMember(owner = "client!e", name = "ib", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!e", name = "kb", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!e", name = "lb", descriptor = "I")
    private int field795;

    @OriginalMember(owner = "client!e", name = "qb", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "[I")
    private int[] field780;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "[[B")
    public static byte[][] field774;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "[[I")
    private int[][] field777;

    @OriginalMember(owner = "client!e", name = "jb", descriptor = "[[I")
    private int[][] field793;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
    private final void method289(int arg0) {
        Random var2 = new Random((long) this.field799);
        this.field793 = new int[this.field799][this.field797];
        this.field777 = new int[this.field799][this.field797 + 1];
        this.field795 = 4096 / this.field797;
        this.field787 = this.field788 / 2;
        this.field780 = new int[this.field799 - -1];
        this.field780[0] = 0;
        this.field791 = 4096 / this.field799;
        int var3 = this.field795 / 2;
        int var4 = this.field791 / 2;
        ++field786;
        for (int var5 = 0; var5 < this.field799; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field791;
                int var7 = (class119.method814(4096, var2, 54210528) - 2048) * this.field790 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field780[var5] = this.field780[var5 - 1] + var8;
            }
            this.field777[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field797; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field795;
                    int var11 = (-2048 + class119.method814(4096, var2, 54210528)) * this.field781 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field777[var5][var9] = this.field777[var5][var9 - 1] + var12;
                }
                this.field793[var5][var9] = ~this.field798 >= -1 ? 4096 : 4096 + -class119.method814(this.field798, var2, 54210528);
            }
            this.field777[var5][this.field797] = 4096;
        }
        this.field780[this.field799] = arg0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (arg1 != -3) {
            field789 = -31;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (arg2 == 7) {
                                        this.field798 = arg0.method301(35);
                                    }
                                } else {
                                    this.field788 = arg0.method301(75);
                                }
                            } else {
                                this.field776 = arg0.method301(95);
                            }
                        } else {
                            this.field779 = arg0.method301(84);
                        }
                    } else {
                        this.field790 = arg0.method301(91);
                    }
                } else {
                    this.field781 = arg0.method301(62);
                }
            } else {
                this.field799 = arg0.method347(arg1 ^ -26118);
            }
        } else {
            this.field797 = arg0.method347(26119);
        }
        ++field778;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        ++field792;
        if (arg1 <= 19) {
            method291((class144) null, (byte) -64, (class144) null, (class144) null);
        }
        int[] var3 = super.field379.method1080(false, arg0);
        if (super.field379.field3100) {
            int var4 = 0;
            int var5;
            for (var5 = class111.field2023[arg0] + this.field776; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field799 > var4 && ~var5 <= ~this.field780[var4]) {
                ++var4;
            }
            int var6 = this.field780[var4];
            boolean var7 = (var4 & 1) == 0;
            int var8 = var4 + -1;
            int var9 = this.field780[var4 + -1];
            if (var5 > this.field787 + var9 && ~(-this.field787 + var6) < ~var5) {
                for (int var10 = 0; ~var10 > ~class70.field1276; ++var10) {
                    int var11 = var7 ? this.field779 : -this.field779;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field795 * var11 >> 12) + class22.field351[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~this.field797 < ~var12 && this.field777[var8][var12] <= var13) {
                        ++var12;
                    }
                    int var14 = this.field777[var8][var12];
                    int var15 = var12 + -1;
                    int var16 = this.field777[var8][var15];
                    if (~(this.field787 + var16) > ~var13 && ~var13 > ~(-this.field787 + var14)) {
                        var3[var10] = this.field793[var8][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class124.method839(var3, 0, class70.field1276, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)V")
    public static final void method290(int arg0) {
        ++field794;
        if (class214.field4035 != null) {
            class214.field4035.method919(true);
        }
        if (arg0 != 0) {
            field783 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lnb;BLnb;Lnb;)V")
    public static final void method291(class144 arg0, byte arg1, class144 arg2, class144 arg3) {
        class142.field2626 = arg2;
        class37.field672 = arg0;
        int var4 = 41 % ((arg1 - 8) / 50);
        ++field785;
        class148.field2780 = arg3;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
    public final void method123(byte arg0) {
        this.method289(4096);
        ++field775;
        if (arg0 != -69) {
            this.field781 = 98;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)I")
    public static final int method292(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 / arg1;
        ++field800;
        int var5 = arg1 + arg3 & arg2;
        int var6 = arg1 + -1 & arg0;
        int var7 = arg0 / arg1;
        int var8 = class9.method48(var7, 52, var4);
        int var9 = class9.method48(var7, 83, var4 + 1);
        int var10 = class9.method48(var7 + 1, 56, var4);
        int var11 = class9.method48(var7 + 1, 75, var4 + 1);
        int var12 = class57.method419(arg1, arg3 ^ 122, var8, var5, var9);
        int var13 = class57.method419(arg1, -123, var10, var5, var11);
        return class57.method419(arg1, -124, var12, var6, var13);
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(I)V")
    public static final void method293(int arg0) {
        if (arg0 != -4362) {
            field796 = -122;
        }
        ++field782;
        while (true) {
            class248 var1 = class227.field4254;
            class90 var2;
            synchronized (class227.field4254) {
                var2 = (class90) class131.field2463.method1615(-70);
            }
            if (var2 == null) {
                return;
            }
            var2.field1703.method111(var2.field1706, (int) var2.field1219, var2.field1714, (byte) -72, false);
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
    public class45() {
        super(0, true);
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(B)V")
    public static void method294(byte arg0) {
        field774 = null;
        field783 = null;
        if (arg0 < 70) {
            method291((class144) null, (byte) 77, (class144) null, (class144) null);
        }
    }
}

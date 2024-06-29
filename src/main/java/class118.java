import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class118 extends class200 {

    @OriginalMember(owner = "client!hh", name = "U", descriptor = "I")
    private int field2006 = 81;

    @OriginalMember(owner = "client!hh", name = "db", descriptor = "I")
    private int field2015 = 409;

    @OriginalMember(owner = "client!hh", name = "Y", descriptor = "I")
    private int field2010 = 1024;

    @OriginalMember(owner = "client!hh", name = "X", descriptor = "I")
    private int field2009 = 204;

    @OriginalMember(owner = "client!hh", name = "lb", descriptor = "I")
    private int field2023 = 8;

    @OriginalMember(owner = "client!hh", name = "eb", descriptor = "I")
    private int field2016 = 4;

    @OriginalMember(owner = "client!hh", name = "pb", descriptor = "I")
    private int field2027 = 1024;

    @OriginalMember(owner = "client!hh", name = "rb", descriptor = "I")
    private int field2029 = 0;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "Lid;")
    public static class149 field2001 = class60.method382("OK", (byte) 33);

    @OriginalMember(owner = "client!hh", name = "cb", descriptor = "Lid;")
    public static class149 field2014 = class60.method382("Moteur son pr-Bpar-B", (byte) 74);

    @OriginalMember(owner = "client!hh", name = "jb", descriptor = "Lid;")
    public static class149 field2021 = class60.method382("Lade Wordpack )2 ", (byte) 36);

    @OriginalMember(owner = "client!hh", name = "fb", descriptor = "Lid;")
    public static class149 field2017 = class60.method382("Forced tweening disabled)3", (byte) 20);

    @OriginalMember(owner = "client!hh", name = "kb", descriptor = "I")
    public static int field2022 = 0;

    @OriginalMember(owner = "client!hh", name = "ab", descriptor = "Lid;")
    public static class149 field2012 = class60.method382("Suche nach Updates )2 ", (byte) 69);

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "Lve;")
    public static class189 field2004 = new class189(64);

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
    private int field2005;

    @OriginalMember(owner = "client!hh", name = "Z", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!hh", name = "gb", descriptor = "I")
    private int field2018;

    @OriginalMember(owner = "client!hh", name = "hb", descriptor = "I")
    private int field2019;

    @OriginalMember(owner = "client!hh", name = "ib", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!hh", name = "mb", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!hh", name = "nb", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!hh", name = "sb", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "[I")
    private int[] field2000;

    @OriginalMember(owner = "client!hh", name = "qb", descriptor = "[I")
    public static int[] field2028;

    @OriginalMember(owner = "client!hh", name = "bb", descriptor = "[Lid;")
    public static class149[] field2013;

    @OriginalMember(owner = "client!hh", name = "V", descriptor = "[[I")
    private int[][] field2007;

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "[[I")
    private int[][] field2008;

    @OriginalMember(owner = "client!hh", name = "ob", descriptor = "[[[B")
    public static byte[][][] field2026;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(JI)V")
    public static final void method817(long arg0, int arg1) {
        class208.field3720.field1340 = 0;
        ++field2020;
        class208.field3720.method494((byte) 4, 186);
        class208.field3720.method496(2, arg0);
        class70.field1228 = 0;
        class197.field3570 = 1;
        int var3 = 85 % ((-43 - arg1) / 54);
        class210.field3742 = 0;
        class207.field3716 = -3;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class118() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public final void method150(int arg0) {
        int var2 = -48 / ((arg0 - -60) / 62);
        this.method818((byte) 117);
        ++field2024;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (arg1) {
            ++field2002;
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (~arg2 != -4) {
                            if (arg2 != 4) {
                                if (~arg2 != -6) {
                                    if (~arg2 != -7) {
                                        if (arg2 == 7) {
                                            this.field2010 = arg0.method485(-2386);
                                        }
                                    } else {
                                        this.field2006 = arg0.method485(-2386);
                                    }
                                } else {
                                    this.field2029 = arg0.method485(-2386);
                                }
                            } else {
                                this.field2027 = arg0.method485(-2386);
                            }
                        } else {
                            this.field2009 = arg0.method485(-2386);
                        }
                    } else {
                        this.field2015 = arg0.method485(-2386);
                    }
                } else {
                    this.field2023 = arg0.method489((byte) -112);
                }
            } else {
                this.field2016 = arg0.method489((byte) 101);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(B)V")
    private final void method818(byte arg0) {
        ++field2025;
        Random var2 = new Random((long) this.field2023);
        this.field2007 = new int[this.field2023][this.field2016];
        this.field2019 = 4096 / this.field2023;
        this.field2000 = new int[this.field2023 - -1];
        this.field2000[0] = 0;
        int var3 = this.field2019 / 2;
        this.field2005 = this.field2006 / 2;
        this.field2008 = new int[this.field2023][this.field2016 + 1];
        this.field2018 = 4096 / this.field2016;
        int var4 = this.field2018 / 2;
        int var5 = 0;
        if (arg0 != 117) {
            this.method818((byte) -51);
        }
        while (~var5 > ~this.field2023) {
            if (~var5 < -1) {
                int var6 = this.field2019;
                int var7 = (class35.method200(arg0 + -122, var2, 4096) - 2048) * this.field2009 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field2000[var5] = this.field2000[var5 - 1] + var8;
            }
            this.field2008[var5][0] = 0;
            for (int var9 = 0; ~this.field2016 < ~var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field2018;
                    int var11 = (-2048 + class35.method200(127, var2, 4096)) * this.field2015 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field2008[var5][var9] = this.field2008[var5][var9 + -1] - -var12;
                }
                this.field2007[var5][var9] = ~this.field2010 < -1 ? 4096 + -class35.method200(115, var2, this.field2010) : 4096;
            }
            this.field2008[var5][this.field2016] = 4096;
            ++var5;
        }
        this.field2000[this.field2023] = 4096;
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V")
    public static void method819(int arg0) {
        int var1 = 126 % ((arg0 - -89) / 37);
        field2028 = null;
        field2012 = null;
        field2021 = null;
        field2013 = null;
        field2017 = null;
        field2026 = null;
        field2014 = null;
        field2004 = null;
        field2001 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            int var4 = 0;
            int var5;
            for (var5 = class93.field1644[arg0] + this.field2029; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field2023 > var4 && ~var5 <= ~this.field2000[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (1 & var4) == 0;
            int var8 = this.field2000[var4 + -1];
            int var9 = this.field2000[var4];
            if (this.field2005 + var8 < var5 && ~(var9 - this.field2005) < ~var5) {
                for (int var10 = 0; var10 < class137.field2515; ++var10) {
                    int var11 = var7 ? this.field2027 : -this.field2027;
                    int var12;
                    for (var12 = (this.field2018 * var11 >> 12) + class73.field1263[var10]; var12 < 0; var12 += 4096) {
                    }
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    int var13;
                    for (var13 = 0; this.field2016 > var13 && this.field2008[var6][var13] <= var12; ++var13) {
                    }
                    int var14 = this.field2008[var6][var13];
                    int var15 = var13 + -1;
                    int var16 = this.field2008[var6][var15];
                    if (var12 > this.field2005 + var16 && var14 - this.field2005 > var12) {
                        var3[var10] = this.field2007[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class209.method1427(var3, 0, class137.field2515, 0);
            }
        }
        ++field2003;
        return arg1 != 55 ? null : var3;
    }
}

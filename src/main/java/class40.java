import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class40 extends class242 {

    @OriginalMember(owner = "client!ok", name = "X", descriptor = "I")
    private int field689 = 0;

    @OriginalMember(owner = "client!ok", name = "db", descriptor = "I")
    private int field695 = 4096;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "[[[I")
    public static int[][][] field684 = new int[4][13][13];

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "I")
    public static int field687 = 0;

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "Lp;")
    public static class280 field688 = class18.method140((byte) -124, "hint_mapedge");

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "Lp;")
    public static class280 field685 = class18.method140((byte) -126, ")2");

    @OriginalMember(owner = "client!ok", name = "Y", descriptor = "Lp;")
    public static class280 field690 = class18.method140((byte) -126, "(R");

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "Lp;")
    private static class280 field683 = class18.method140((byte) -117, "skill: ");

    @OriginalMember(owner = "client!ok", name = "fb", descriptor = "Lp;")
    public static class280 field697 = class18.method140((byte) -124, "violet:");

    @OriginalMember(owner = "client!ok", name = "eb", descriptor = "Lp;")
    public static class280 field696 = field683;

    @OriginalMember(owner = "client!ok", name = "Z", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!ok", name = "ab", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!ok", name = "bb", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!ok", name = "cb", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!ok", name = "gb", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "Lak;")
    public static class137 field686;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (arg0 > -119) {
            field686 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field4248 = ~arg2.method189((byte) -103) == -2;
                }
            } else {
                this.field695 = arg2.method193((byte) 77);
            }
        } else {
            this.field689 = arg2.method193((byte) 77);
        }
        ++field698;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public static final void method313(byte arg0) {
        if (class44.field727 != null) {
            class44.field727.method1532(87);
            class44.field727 = null;
        }
        ++field694;
        class68.method462(arg0 + 53);
        class20.method156();
        for (int var1 = 0; var1 < 4; ++var1) {
            class183.field3211[var1].method706(78);
        }
        class100.method710(arg0 ^ 5212, false);
        System.gc();
        class263.method1779(false, 2);
        class243.field4270 = -1;
        class54.field893 = false;
        class168.method1170(true, (byte) 38);
        class49.field806 = 0;
        class91.field1480 = 0;
        class264.field4655 = 0;
        class115.field2088 = false;
        class126.field2215 = 0;
        for (int var2 = 0; class81.field1335.length > var2; ++var2) {
            class81.field1335[var2] = null;
        }
        class112.field1845 = 0;
        class205.field3554 = 0;
        int var3 = 0;
        if (arg0 == 71) {
            while (~var3 > -2049) {
                class280.field4940[var3] = null;
                class92.field1486[var3] = null;
                ++var3;
            }
            for (int var4 = 0; var4 < 32768; ++var4) {
                class46.field756[var4] = null;
            }
            for (int var5 = 0; var5 < 4; ++var5) {
                for (int var6 = 0; ~var6 > -105; ++var6) {
                    for (int var7 = 0; ~var7 > -105; ++var7) {
                        class165.field2896[var5][var6][var7] = null;
                    }
                }
            }
            class33.method281(20555);
            class238.field4128 = 0;
            class8.method80(true);
            class43.method327(arg0 + -137, true);
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
    public class40() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "(I)V")
    public static void method314(int arg0) {
        field685 = null;
        field688 = null;
        field690 = null;
        field683 = null;
        if (arg0 != 3740) {
            method314(25);
        }
        field684 = null;
        field696 = null;
        field697 = null;
        field686 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        int[][] var3 = super.field4257.method917(arg1, 1);
        if (super.field4257.field2357) {
            int[][] var4 = this.method1648(26484, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var3[0];
            for (int var11 = 0; class264.field4654 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 <= ~this.field689) {
                    if (var12 <= this.field695) {
                        var10[var11] = var12;
                    } else {
                        var10[var11] = this.field695;
                    }
                } else {
                    var10[var11] = this.field689;
                }
                if (~this.field689 >= ~var13) {
                    if (~this.field695 <= ~var13) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field695;
                    }
                } else {
                    var9[var11] = this.field689;
                }
                if (var14 >= this.field689) {
                    if (var14 > this.field695) {
                        var8[var11] = this.field695;
                    } else {
                        var8[var11] = var14;
                    }
                } else {
                    var8[var11] = this.field689;
                }
            }
        }
        ++field692;
        return !arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        int var3 = 40 / ((73 - arg1) / 41);
        int[] var4 = super.field4251.method1417((byte) 123, arg0);
        if (super.field4251.field3655) {
            int[] var5 = this.method1647(0, arg0, 48);
            for (int var6 = 0; var6 < class264.field4654; ++var6) {
                int var7 = var5[var6];
                if (~var7 <= ~this.field689) {
                    if (~var7 >= ~this.field695) {
                        var4[var6] = var7;
                    } else {
                        var4[var6] = this.field695;
                    }
                } else {
                    var4[var6] = this.field689;
                }
            }
        }
        ++field693;
        return var4;
    }
}

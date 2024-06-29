import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class85 extends class89 {

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
    private int field1622 = 0;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
    private int field1619 = 1;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
    private int field1620 = 0;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "I")
    public static volatile int field1615 = 0;

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "I")
    public static int field1626 = 0;

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "Lha;")
    public static class46 field1625 = class271.method1828("::fps ", -46);

    @OriginalMember(owner = "client!s", name = "hb", descriptor = "Lha;")
    public static class46 field1628 = class271.method1828("scape main", -46);

    @OriginalMember(owner = "client!s", name = "S", descriptor = "Lha;")
    public static class46 field1613 = class271.method1828("", -46);

    @OriginalMember(owner = "client!s", name = "jb", descriptor = "Lha;")
    public static class46 field1630 = class271.method1828("Lade Wordpack )2 ", -46);

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "Lha;")
    public static class46 field1623 = field1613;

    @OriginalMember(owner = "client!s", name = "db", descriptor = "Lha;")
    public static class46 field1624 = field1613;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!s", name = "gb", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!s", name = "ib", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "Lpb;")
    public static class157 field1618;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILwe;)Lha;")
    public static final class46 method665(int arg0, class75 arg1) {
        ++field1629;
        int var2 = -101 / ((-5 - arg0) / 58);
        return class131.method1017(32767, true, arg1);
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        int var3 = -82 % ((arg1 - 51) / 44);
        ++field1621;
        int[] var4 = super.field1688.method936(1, arg0);
        if (super.field1688.field2200) {
            int var5 = class87.field1652[arg0];
            int var6 = var5 + -2048 >> 1;
            for (int var7 = 0; class241.field4284 > var7; ++var7) {
                int var8 = class259.field4523[var7];
                int var9 = var8 - 2048 >> 1;
                int var12;
                if (~this.field1622 != -1) {
                    int var10 = var6 * var6 + var9 * var9 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var12 = (int) ((double) (this.field1619 * var11) * 3.141592653589793D);
                } else {
                    var12 = (-var5 + var8) * this.field1619;
                }
                int var13 = var12 - (var12 & -4096);
                if (~this.field1620 == -1) {
                    var13 = class260.field4541[(var13 & 4080) >> 4] + 4096 >> 1;
                } else if (~this.field1620 == -3) {
                    var13 -= 2048;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    var13 = -var13 + 2048 << 1;
                }
                var4[var7] = var13;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(B)Z")
    public static final boolean method666(byte arg0) {
        if (arg0 != -126) {
            method666((byte) 112);
        }
        ++field1614;
        try {
            return class2.method4(-1);
        } catch (IOException var4) {
            class68.method495(-32486);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class109.field2039 + "," + class206.field3692 + "," + class212.field3776 + " - " + class219.field3861 + "," + (class277.field4824.field2523[0] + class29.field567) + "," + (class277.field4824.field2517[0] + class77.field1432) + " - ";
            for (int var3 = 0; class219.field3861 > var3 && ~var3 > -51; ++var3) {
                var2 = var2 + class147.field2651.field1368[var3] + ",";
            }
            class272.method1835(var5, -30, var2);
            class109.method856(-22374);
            return true;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)I")
    public static final int method667(int arg0, int arg1) {
        ++field1627;
        if (arg1 > -7) {
            field1615 = -82;
        }
        class273 var2 = class269.method1801(102, arg0);
        int var3 = var2.field4770;
        int var4 = var2.field4771;
        int var5 = var2.field4778;
        int var6 = class235.field4083[-var3 + var4];
        return var6 & class29.field568[var5] >> var3;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class85() {
        super(0, true);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1616;
        int var8 = arg7;
        int var9 = 0;
        int var10 = -arg0 + arg2;
        int var11 = 0;
        int var12 = -arg0 + arg7;
        int var13 = arg2 * arg2;
        int var14 = var12 * var12;
        int var15 = arg7 * arg7;
        int var16 = var15 << 1;
        int var17 = var10 * var10;
        int var18 = var13 << 1;
        int var19 = arg7 << 1;
        int var20 = var14 << 1;
        int var21 = var12 << 1;
        int var22 = -((arg3 + var19) * var18) + var15;
        int var23 = (-var19 + 1) * var13 - -var16;
        int var24 = (-var21 + 1) * var17 + var20;
        int var25 = var13 << 2;
        int var26 = var17 << 1;
        int var27 = -((var21 + -1) * var26) + var14;
        int var28 = var15 << 2;
        int var29 = var17 << 2;
        int var30 = var16 * 3;
        int var31 = var14 << 2;
        int var32 = (var19 - 3) * var18;
        int var33 = (var21 - 3) * var26;
        int var34 = var20 * 3;
        int var35 = var28;
        int var36 = (arg7 - 1) * var25;
        int var37 = var31;
        int[] var38 = class6.field100[arg6];
        class24.method170((byte) 33, -arg2 + arg5, var38, -var10 + arg5, arg1);
        int var39 = (var12 - 1) * var29;
        class24.method170((byte) 33, arg5 - var10, var38, arg5 + var10, arg4);
        class24.method170((byte) 33, arg5 - -var10, var38, arg2 + arg5, arg1);
        while (~var8 < -1) {
            boolean var40 = ~var12 <= ~var8;
            --var8;
            if (var40) {
                if (~var24 > -1) {
                    while (var24 < 0) {
                        var24 += var34;
                        ++var9;
                        var27 += var37;
                        var37 += var31;
                        var34 += var31;
                    }
                }
                if (~var27 > -1) {
                    ++var9;
                    var24 += var34;
                    var27 += var37;
                    var37 += var31;
                    var34 += var31;
                }
                var27 += -var33;
                var24 += -var39;
                var39 -= var29;
                var33 -= var29;
            }
            if (var23 < 0) {
                while (~var23 > -1) {
                    var22 += var35;
                    var23 += var30;
                    ++var11;
                    var35 += var28;
                    var30 += var28;
                }
            }
            int var41 = -var8 + arg6;
            int var42 = arg6 + var8;
            if (~var22 > -1) {
                var23 += var30;
                var30 += var28;
                ++var11;
                var22 += var35;
                var35 += var28;
            }
            var23 += -var36;
            int var43 = -var11 + arg5;
            var36 -= var25;
            var22 += -var32;
            var32 -= var25;
            int var44 = arg5 - -var11;
            if (!var40) {
                class24.method170((byte) 33, var43, class6.field100[var41], var44, arg1);
                class24.method170((byte) 33, var43, class6.field100[var42], var44, arg1);
            } else {
                int var45 = -var9 + arg5;
                int var46 = arg5 + var9;
                class24.method170((byte) 33, var43, class6.field100[var41], var45, arg1);
                class24.method170((byte) 33, var45, class6.field100[var41], var46, arg4);
                class24.method170((byte) 33, var46, class6.field100[var41], var44, arg1);
                class24.method170((byte) 33, var43, class6.field100[var42], var45, arg1);
                class24.method170((byte) 33, var45, class6.field100[var42], var46, arg4);
                class24.method170((byte) 33, var46, class6.field100[var42], var44, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field1619 = arg0.method558(1);
                }
            } else {
                this.field1620 = arg0.method558(1);
            }
        } else {
            this.field1622 = arg0.method558(1);
        }
        if (arg1 == -641641492) {
            ++field1612;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        if (!arg0) {
            method669(-23);
        }
        class49.method365((byte) 123);
        ++field1617;
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
    public static void method669(int arg0) {
        field1623 = null;
        field1625 = null;
        field1628 = null;
        field1618 = null;
        field1624 = null;
        field1630 = null;
        field1613 = null;
        if (arg0 != 2048) {
            method669(93);
        }
    }
}

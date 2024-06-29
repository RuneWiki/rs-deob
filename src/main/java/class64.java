import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class64 extends class259 {

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "Z")
    private boolean field1411 = true;

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "Z")
    private boolean field1415 = true;

    @OriginalMember(owner = "client!wa", name = "ab", descriptor = "Lsg;")
    public static class30 field1418 = class167.method1221((byte) 33, "http:)4)4");

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "[I")
    public static int[] field1414 = new int[4096];

    @OriginalMember(owner = "client!wa", name = "db", descriptor = "Lsg;")
    public static class30 field1421;

    @OriginalMember(owner = "client!wa", name = "cb", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!wa", name = "fb", descriptor = "Z")
    public static boolean field1423;

    @OriginalMember(owner = "client!wa", name = "hb", descriptor = "Lsg;")
    public static class30 field1425;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!wa", name = "ib", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!wa", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field1422;

    @OriginalMember(owner = "client!wa", name = "gb", descriptor = "[Lbj;")
    public static class44[] field1424;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            int[] var3 = super.field4581.method1841(18, arg0);
            ++field1416;
            if (super.field4581.field4729) {
                int[] var4 = this.method1799(0, this.field1415 ? -arg0 + class263.field4649 : arg0, 112);
                if (!this.field1411) {
                    class26.method229(var4, 0, var3, 0, class223.field3999);
                } else {
                    for (int var5 = 0; class223.field3999 > var5; ++var5) {
                        var3[var5] = var4[-var5 + class52.field1174];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(III)Z")
    public static final boolean method575(int arg0, int arg1, int arg2) {
        ++field1412;
        if (arg2 != 1) {
            return false;
        } else {
            return (arg1 >> arg0 - -1 & 1) != 0;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 != -1586849108) {
            this.method4(-93, 44, (class8) null);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field4588 = arg2.method63((byte) 69) == 1;
                }
            } else {
                this.field1415 = ~arg2.method63((byte) 106) == -2;
            }
        } else {
            this.field1411 = arg2.method63((byte) 64) == 1;
        }
        ++field1410;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class64() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V")
    public static void method576(byte arg0) {
        field1425 = null;
        field1421 = null;
        field1424 = null;
        field1422 = null;
        field1418 = null;
        field1414 = null;
        if (arg0 >= -74) {
            field1425 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        ++field1413;
        int[][] var3 = super.field4568.method241(-127, arg1);
        if (super.field4568.field564) {
            int[][] var4 = this.method1795(!this.field1415 ? arg1 : -arg1 + class263.field4649, 2, 0);
            int[] var5 = var4[1];
            int[] var6 = var3[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var4[0];
            if (!this.field1411) {
                for (int var11 = 0; var11 < class223.field3999; ++var11) {
                    var8[var11] = var10[var11];
                    var6[var11] = var5[var11];
                    var9[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~class223.field3999 < ~var12; ++var12) {
                    var8[var12] = var10[-var12 + class52.field1174];
                    var6[var12] = var5[-var12 + class52.field1174];
                    var9[var12] = var7[class52.field1174 - var12];
                }
            }
        }
        int var13 = -83 % ((-48 - arg0) / 42);
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)V")
    public static final void method577(byte arg0) {
        ++field1417;
        for (class202 var1 = (class202) class41.field1024.method478(0); var1 != null; var1 = (class202) class41.field1024.method476((byte) 13)) {
            if (var1.field3617 > 0) {
                --var1.field3617;
            }
            if (~var1.field3617 != -1) {
                if (var1.field3614 > 0) {
                    --var1.field3614;
                }
                if (~var1.field3614 == -1 && var1.field3616 >= 1 && ~var1.field3596 <= -2 && var1.field3616 <= 102 && var1.field3596 <= 102 && (~var1.field3618 > -1 || class127.method948(var1.field3612, var1.field3618, 2397))) {
                    class239.method1695(var1.field3616, var1.field3618, var1.field3605, var1.field3604, 0, var1.field3609, var1.field3596, var1.field3612);
                    var1.field3614 = -1;
                    if (var1.field3618 == var1.field3608 && var1.field3608 == -1) {
                        var1.method1681(false);
                    } else if (var1.field3618 == var1.field3608 && ~var1.field3604 == ~var1.field3595 && var1.field3612 == var1.field3610) {
                        var1.method1681(false);
                    }
                }
            } else if (var1.field3608 < 0 || class127.method948(var1.field3610, var1.field3608, 2397)) {
                class239.method1695(var1.field3616, var1.field3608, var1.field3605, var1.field3595, 0, var1.field3609, var1.field3596, var1.field3610);
                var1.method1681(false);
            }
        }
        if (arg0 < 121) {
            field1426 = -124;
        }
    }

    static {
        for (int var0 = 0; ~var0 > -4097; ++var0) {
            field1414[var0] = class186.method1338(40960, var0);
        }
        field1421 = class167.method1221((byte) 33, "(U (X");
        field1420 = 0;
        field1423 = false;
        field1425 = class167.method1221((byte) 33, "; version=1; path=)4; domain=");
    }
}

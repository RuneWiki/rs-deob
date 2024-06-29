import java.awt.Graphics;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class93 extends class260 {

    @OriginalMember(owner = "client!la", name = "N", descriptor = "I")
    private int field1828 = 0;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "I")
    private int field1837 = 4096;

    @OriginalMember(owner = "client!la", name = "X", descriptor = "I")
    private int field1838 = 2000;

    @OriginalMember(owner = "client!la", name = "eb", descriptor = "I")
    private int field1845 = 16;

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "I")
    private int field1839 = 0;

    @OriginalMember(owner = "client!la", name = "Z", descriptor = "Loh;")
    private static class263 field1840 = class253.method1681(-125, "Cancel");

    @OriginalMember(owner = "client!la", name = "L", descriptor = "Loh;")
    public static class263 field1826 = class253.method1681(-119, "::");

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "Loh;")
    public static class263 field1831 = field1840;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "Llb;")
    public static class127 field1835 = new class127(5);

    @OriginalMember(owner = "client!la", name = "O", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!la", name = "ab", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!la", name = "bb", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!la", name = "db", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!la", name = "cb", descriptor = "Lci;")
    public static class234 field1843;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "[Loe;")
    public static class140[] field1830;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "[Ltd;")
    public static class70[] field1827;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIII)V")
    public static final void method653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1842;
        if (arg4 <= 114) {
            field1835 = null;
        }
        if (arg3 == arg5) {
            class252.method1677(arg2, arg1, arg0, (byte) -96, arg5);
        } else if (~class51.field1099 >= ~(-arg5 + arg0) && arg0 - -arg5 <= class198.field3587 && -arg3 + arg1 >= class11.field249 && class276.field4831 >= arg1 + arg3) {
            class253.method1683(arg3, -65, arg1, arg5, arg2, arg0);
        } else {
            class51.method331(arg5, arg2, arg1, arg3, true, arg0);
        }
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(I)V")
    public static void method654(int arg0) {
        if (arg0 == 0) {
            field1835 = null;
            field1831 = null;
            field1826 = null;
            field1843 = null;
            field1827 = null;
            field1830 = null;
            field1840 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(Z)V")
    public static final void method655(boolean arg0) {
        if (!arg0) {
            ++field1836;
            class63.field1275.method1187(-14331);
            class177.field3242 = 1;
            class71.field1431 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class93() {
        super(0, true);
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
    public final void method88(int arg0) {
        if (arg0 >= 81) {
            ++field1834;
            class217.method1481((byte) -118);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILoh;Z)V")
    public static final void method656(int arg0, class263 arg1, boolean arg2) {
        ++field1832;
        byte var3 = 4;
        int var4 = 6 - -var3;
        int var5 = var3 + 6;
        int var6 = class151.field2733.method402(arg1, 250);
        int var7 = class151.field2733.method406(arg1, 250) * 13;
        if (arg0 != -19472) {
            method657(false);
        }
        class133.method865(-var3 + var4, -var3 + var5, var3 + var6 + var3, var7 - -var3 + var3, 0);
        class133.method876(-var3 + var4, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        class151.field2733.method414(arg1, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class53.method338(-var3 + var4, arg0 ^ -19470, var3 + var7 + var3, -var3 + var5, var3 + var3 + var6);
        if (!arg2) {
            class111.method730(var4, var6, var5, true, var7);
        } else {
            try {
                Graphics var8 = class202.field3648.getGraphics();
                class255.field4454.method611(0, (byte) -88, var8, 0);
            } catch (Exception var9) {
                class202.field3648.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        if (arg1 != 255) {
            method655(false);
        }
        ++field1829;
        int[] var3 = super.field4511.method304(arg0, false);
        if (super.field4511.field1029) {
            int var4 = this.field1837 >> 1;
            int[][] var5 = super.field4511.method306((byte) -59);
            Random var6 = new Random((long) this.field1828);
            for (int var7 = 0; ~var7 > ~this.field1838; ++var7) {
                int var8 = this.field1837 <= 0 ? this.field1839 : this.field1839 - -class256.method1699(var6, arg1 + -144, this.field1837) - var4;
                int var9 = 255 & var8 >> 4;
                int var10 = class256.method1699(var6, arg1 ^ 140, class49.field1052);
                int var11 = class256.method1699(var6, 120, class60.field1235);
                int var12 = (class251.field4374[var9] * this.field1845 >> 12) + var10;
                int var13 = var12 - var10;
                int var14 = (class1.field13[var9] * this.field1845 >> 12) + var11;
                int var15 = var14 - var11;
                if (~var13 != -1 || ~var15 != -1) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    boolean var16 = var15 > var13;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var12 = var14;
                        var14 = var18;
                        var10 = var11;
                        var11 = var17;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        var10 = var12;
                        var12 = var19;
                        int var20 = var11;
                        var11 = var14;
                        var14 = var20;
                    }
                    int var21 = -var10 + var12;
                    int var22 = var11;
                    int var23 = var14 - var11;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var24 = -var21 / 2;
                    int var25 = 2048 / var21;
                    int var26 = var11 >= var14 ? -1 : 1;
                    int var27 = 1024 - (class256.method1699(var6, 109, 4096) >> 2);
                    for (int var28 = var10; var12 > var28; ++var28) {
                        var24 += var23;
                        int var29 = var27 + 1024 - -((var28 - var10) * var25);
                        int var30 = class166.field3024 & var28;
                        int var31 = class277.field4846 & var22;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (~var24 < -1) {
                            var22 += var26;
                            var24 -= var21;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(Z)V")
    public static final void method657(boolean arg0) {
        ++field1833;
        if (arg0) {
            method656(-76, (class263) null, true);
        }
        class12.field312.method825(0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (arg1 != 5701) {
            this.field1845 = 120;
        }
        ++field1841;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            this.field1837 = arg2.method1294((byte) 3);
                        }
                    } else {
                        this.field1839 = arg2.method1294((byte) 3);
                    }
                } else {
                    this.field1845 = arg2.method1301(arg1 + -14018);
                }
            } else {
                this.field1838 = arg2.method1294((byte) 3);
            }
        } else {
            this.field1828 = arg2.method1301(-8317);
        }
    }
}

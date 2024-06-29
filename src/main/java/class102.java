import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class102 extends class28 {

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "Z")
    public boolean field1808 = false;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "Lfa;")
    private class166 field1801;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "Z")
    private boolean field1810;

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "Z")
    private boolean field1816;

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "I")
    private int field1817;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    private int field1805;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public static int field1798 = -2;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "Lvf;")
    public static class265 field1803 = class87.method582(-46, "Lade)3)3)3");

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    public static int field1806 = 0;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "[I")
    public static int[] field1811 = new int[100];

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "Lvf;")
    private static class265 field1815 = class87.method582(-46, "Allocated memory");

    @OriginalMember(owner = "client!hd", name = "fb", descriptor = "Z")
    public static boolean field1820 = false;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    public static int field1809 = 1;

    @OriginalMember(owner = "client!hd", name = "hb", descriptor = "Lvf;")
    public static class265 field1822 = field1815;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "F")
    private float field1799;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!hd", name = "eb", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!hd", name = "gb", descriptor = "Lfl;")
    public static class192 field1821;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "[I")
    private int[] field1802;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "[Z")
    public static boolean[] field1812;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method680(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILfl;Ljb;Z)[I")
    public final int[] method681(int arg0, class192 arg1, class24 arg2, boolean arg3) {
        if (arg0 >= -52) {
            field1798 = -56;
        }
        field1807++;
        if (this.field1801.method1099(-120, arg2, arg1)) {
            int var5 = arg3 ? 64 : 128;
            return this.field1801.method1098(false, arg2, arg1, var5, var5, this.field1816, 0, 1.0D);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
    public static void method682(int arg0) {
        field1822 = null;
        field1815 = null;
        field1803 = null;
        field1821 = null;
        field1812 = null;
        int var1 = 22 / ((-arg0 - 14) / 63);
        field1811 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lng;B)V")
    public static final void method683(class135 arg0, byte arg1) {
        byte[] var2 = new byte[24];
        field1818++;
        int var3 = 46 % ((arg1 - 37) / 60);
        if (class166.field3011 != null) {
            try {
                int var4 = 0;
                class166.field3011.method252(0L, 0);
                class166.field3011.method260(var2, (byte) 76);
                while (var4 < 24 && var2[var4] == 0) {
                    var4++;
                }
                if (var4 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method939(-63, 24, var2, 0);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lng;B)Lah;")
    public static final class174 method684(class135 arg0, byte arg1) {
        field1813++;
        if (arg1 != 127) {
            method683((class135) null, (byte) 91);
        }
        return new class174(arg0.method894(-116), arg0.method894(-119), arg0.method894(-109), arg0.method894(arg1 ^ 0xFFFFFFF5), arg0.method909(-917770352), arg0.method920((byte) 28));
    }

    @OriginalMember(owner = "client!hd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1814++;
        super.finalize();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljb;ILfl;)Z")
    public final boolean method685(class24 arg0, int arg1, class192 arg2) {
        if (arg1 > -63) {
            this.field1810 = false;
        }
        field1800++;
        return this.field1801.method1099(-122, arg0, arg2);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)V")
    public final void method686(byte arg0, int arg1) {
        if (arg0 != 76) {
            this.field1799 = 0.47218654F;
        }
        field1797++;
        if (this.field1802 == null || this.field1805 == 0 && this.field1817 == 0) {
            return;
        }
        if (class260.field4485 == null || this.field1802.length > class260.field4485.length) {
            class260.field4485 = new int[this.field1802.length];
        }
        int var3 = this.field1802.length == 4096 ? 64 : 128;
        int var4 = this.field1802.length;
        int var5 = var3 - 1;
        int var6 = this.field1805 * arg1 * var3;
        int var7 = this.field1817 * arg1;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var11 = var8 & var9 + var6;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = var9 + var12;
                int var14 = (var7 + var12 & var5) + var11;
                class260.field4485[var13] = this.field1802[var14];
            }
        }
        int[] var10 = this.field1802;
        this.field1802 = class260.field4485;
        class260.field4485 = var10;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lng;)V")
    public class102(class135 arg0) {
        this.field1801 = new class166(arg0);
        this.field1810 = arg0.method920((byte) 34) == 1;
        this.field1816 = arg0.method920((byte) 33) == 1;
        arg0.method920((byte) 40);
        arg0.method920((byte) 78);
        int var2 = arg0.method920((byte) 54) & 0x3;
        this.field1817 = arg0.method929((byte) -3);
        this.field1805 = arg0.method929((byte) -3);
        arg0.method920((byte) 57);
        arg0.method920((byte) 88);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljb;Lfl;ZBF)[I")
    public final int[] method687(class24 arg0, class192 arg1, boolean arg2, byte arg3, float arg4) {
        field1819++;
        if (arg3 != 31) {
            return null;
        }
        if (this.field1802 == null || this.field1799 != arg4) {
            if (!this.field1801.method1099(arg3 - 113, arg0, arg1)) {
                return null;
            }
            int var6 = arg2 ? 64 : 128;
            this.field1802 = this.field1801.method1098(true, arg0, arg1, var6, var6, this.field1816, 0, (double) arg4);
            this.field1799 = arg4;
            if (this.field1810) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6 * var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var12 = var6;
                int var13 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var15; var34 >= 0; var34--) {
                        var12--;
                        int var35 = this.field1802[var12];
                        var10[var34] += class203.method1395(255, var35 >> 16);
                        var7[var34] += class203.method1395(var35, 65355) >> 8;
                        var8[var34] += class203.method1395(255, var35);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 1;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var22--;
                        var24 += var8[var22];
                        var23 += var7[var22];
                        var25 += var10[var22];
                        if (var22 == 0) {
                            var22 = var11;
                        }
                    }
                    for (int var27 = var15; var27 >= 0; var27--) {
                        int var31 = var24 / 9;
                        var22--;
                        var21--;
                        int var32 = var23 / 9;
                        int var33 = var25 / 9;
                        var19--;
                        var9[var19] = class144.method992(var31, class144.method992(var33 << 16, var32 << 8));
                        var23 += var7[var22] - var7[var21];
                        var25 += var10[var22] - var10[var21];
                        var24 += var8[var22] - var8[var21];
                        if (var22 == 0) {
                            var22 = var11;
                        }
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    for (int var28 = var15; var28 >= 0; var28--) {
                        var12--;
                        int var29 = this.field1802[var12];
                        var13--;
                        int var30 = this.field1802[var13];
                        var10[var28] += -class203.method1395(var30 >> 16, 255) + class203.method1395(var29 >> 16, 255);
                        var7[var28] += -(class203.method1395(var30, 65282) >> 8) + class203.method1395(var29 >> 8, 255);
                        var8[var28] += -class203.method1395(255, var30) + class203.method1395(var29, 255);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                this.field1802 = var9;
            }
        }
        return this.field1802;
    }
}

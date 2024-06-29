import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class148 {

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "[I")
    private int[] field2431;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
    public static int[] field2421 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Ltl;")
    public static class59 field2423 = class85.method639("hint_mapmarkers", 9588);

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "[S")
    public static short[] field2425 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[S")
    public static short[] field2426 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Ltl;")
    public static class59 field2422 = class85.method639("(U2", 9588);

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "Ltl;")
    public static class59 field2433 = class85.method639(" x ", 9588);

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Z")
    public static boolean field2429 = true;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)I", line = 7)
    public static final int method1069(int arg0, int arg1, int arg2, int arg3) {
        field2432++;
        int var4 = arg3 / arg0;
        int var5 = arg0 - 1 & arg3;
        int var6 = arg0 - 1 & arg2;
        int var7 = arg2 / arg0;
        if (arg1 != 29141) {
            field2429 = false;
        }
        int var8 = class157.method1118(true, var7, var4);
        int var9 = class157.method1118(true, var7, var4 + 1);
        int var10 = class157.method1118(true, var7 + 1, var4);
        int var11 = class157.method1118(true, var7 + 1, var4 + 1);
        int var12 = class146.method1061(arg1 ^ 0xFFFF8E42, arg0, var9, var8, var5);
        int var13 = class146.method1061(58, arg0, var11, var10, var5);
        return class146.method1061(-85, arg0, var13, var12, var6);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 47)
    public static void method1070(byte arg0) {
        field2425 = null;
        field2423 = null;
        field2433 = null;
        field2422 = null;
        field2426 = null;
        int var1 = -88 % ((arg0 - 58) / 37);
        field2421 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILwk;)V", line = 70)
    public static final void method1071(int arg0, class105 arg1) {
        field2427++;
        arg1.field1767 = arg1.field1720;
        if (arg1.field1790 == 0) {
            arg1.field1775 = 0;
            return;
        }
        if (arg1.field1737 != -1 && arg1.field1786 == 0) {
            class129 var2 = class265.method1834((byte) -39, arg1.field1737);
            if (arg1.field1779 > 0 && var2.field2120 == 0) {
                arg1.field1775++;
                return;
            }
            if (arg1.field1779 <= 0 && var2.field2128 == 0) {
                arg1.field1775++;
                return;
            }
        }
        int var3 = arg1.field1774;
        if (arg0 != -10733) {
            method1071(-6, (class105) null);
        }
        int var4 = arg1.field1769;
        int var5 = arg1.field1729[arg1.field1790 - 1] * 128 + (arg1.method776(true) * 64);
        int var6 = arg1.field1773[arg1.field1790 - 1] * 128 + (arg1.method776(true) * 64);
        if ((var5 - var3) > 256 || var5 - var3 < -256 || var6 - var4 > 256 || (var6 - var4) < -256) {
            arg1.field1769 = var6;
            arg1.field1774 = var5;
            return;
        }
        if (var5 > var3) {
            if (var4 < var6) {
                arg1.field1750 = 1280;
            } else if (var4 <= var6) {
                arg1.field1750 = 1536;
            } else {
                arg1.field1750 = 1792;
            }
        } else if (var3 <= var5) {
            if (var4 < var6) {
                arg1.field1750 = 1024;
            } else if (var4 > var6) {
                arg1.field1750 = 0;
            }
        } else if (var6 > var4) {
            arg1.field1750 = 768;
        } else if (var6 >= var4) {
            arg1.field1750 = 512;
        } else {
            arg1.field1750 = 256;
        }
        int var7 = arg1.field1750 - arg1.field1765 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg1.field1745;
        int var9 = 4;
        boolean var10 = true;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field1763;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field1725;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field1776;
        }
        if (var8 == -1) {
            var8 = arg1.field1763;
        }
        arg1.field1767 = var8;
        if (arg1 instanceof class23) {
            var10 = ((class23) arg1).field314.field1934;
        }
        if (var10) {
            if (arg1.field1765 != arg1.field1750 && arg1.field1772 == -1 && arg1.field1778 != 0) {
                var9 = 2;
            }
            if (arg1.field1790 > 2) {
                var9 = 6;
            }
            if (arg1.field1790 > 3) {
                var9 = 8;
            }
            if (arg1.field1775 > 0 && arg1.field1790 > 1) {
                var9 = 8;
                arg1.field1775--;
            }
        } else {
            if (arg1.field1790 > 1) {
                var9 = 6;
            }
            if (arg1.field1790 > 2) {
                var9 = 8;
            }
            if (arg1.field1775 > 0 && arg1.field1790 > 1) {
                arg1.field1775--;
                var9 = 8;
            }
        }
        if (arg1.field1739[arg1.field1790 - 1]) {
            var9 <<= 0x1;
        }
        if (var6 > var4) {
            arg1.field1769 += var9;
            if (arg1.field1769 > var6) {
                arg1.field1769 = var6;
            }
        } else if (var6 < var4) {
            arg1.field1769 -= var9;
            if (arg1.field1769 < var6) {
                arg1.field1769 = var6;
            }
        }
        if (var3 < var5) {
            arg1.field1774 += var9;
            if (arg1.field1774 > var5) {
                arg1.field1774 = var5;
            }
        } else if (var3 > var5) {
            arg1.field1774 -= var9;
            if (arg1.field1774 < var5) {
                arg1.field1774 = var5;
            }
        }
        if (var9 >= 8 && arg1.field1767 == arg1.field1763 && arg1.field1788 != -1) {
            arg1.field1767 = arg1.field1788;
        }
        if (arg1.field1774 == var5 && arg1.field1769 == var6) {
            if (arg1.field1779 > 0) {
                arg1.field1779--;
            }
            arg1.field1790--;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "([I)V", line = 304)
    public class148(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field2431 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field2431[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2431[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field2431[var5 + var5] = arg0[var4];
            this.field2431[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)I", line = 351)
    public final int method1072(int arg0, int arg1) {
        field2424++;
        if (arg1 != -10379) {
            return 89;
        }
        int var3 = (this.field2431.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field2431[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2431[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class117 implements class200 {

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Lbn;")
    public static class256 field1624 = new class256(8);

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1627 = "slide:";

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field1628 = 0;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public int field1614;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public int field1615;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public int field1626;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public int field1630;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Z")
    public boolean field1622;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "[I")
    public static int[] field1625;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
    public static final void method851(String[] arg0, int arg1, short[] arg2) {
        field1620++;
        class201.method1394(arg0.length + arg1, arg0, 1, arg2, 0);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Z")
    public static final boolean method852(boolean arg0) {
        if (!arg0) {
            field1625 = null;
        }
        field1617++;
        return class128.field2035 == 0 ? class39.field497 : true;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)J")
    public final long method853(int arg0) {
        field1616++;
        long[] var2 = class84.field1045;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field1621 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) ((var5 ^ (long) (this.field1614 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) ((var7 ^ (long) this.field1614) & 0xFFL)];
        if (arg0 >= -16) {
            this.field1626 = -56;
        }
        long var11 = var2[(int) (((long) (this.field1615 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field1615 >> 16)) & 0xFFL)];
        long var15 = var2[(int) ((var13 ^ (long) (this.field1615 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) (((long) this.field1615 ^ var15) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field1623) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field1626 >> 24)) & 0xFFL)];
        long var23 = var2[(int) ((var21 ^ (long) (this.field1626 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) ((var23 ^ (long) (this.field1626 >> 8)) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var2[(int) ((var25 ^ (long) this.field1626) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field1630 ^ var27) & 0xFFL)];
        return var29 >>> 8 ^ var2[(int) (((long) (this.field1622 ? 1 : 0) ^ var29) & 0xFFL)];
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lvh;B)Z")
    public final boolean method854(class200 arg0, byte arg1) {
        field1618++;
        if (!(arg0 instanceof class117)) {
            return false;
        }
        class117 var3 = (class117) arg0;
        if (this.field1621 != var3.field1621) {
            return false;
        } else if (this.field1614 != var3.field1614) {
            return false;
        } else if (this.field1615 != var3.field1615) {
            return false;
        } else if (this.field1623 == var3.field1623) {
            if (arg1 != -65) {
                method852(true);
            }
            if (this.field1626 != var3.field1626) {
                return false;
            } else if (this.field1630 == var3.field1630) {
                return var3.field1622 == this.field1622;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILe;Lne;I)V")
    public static final void method855(int arg0, int arg1, class312 arg2, class172 arg3, int arg4) {
        field1619++;
        if (arg4 >= -43) {
            method852(false);
        }
        if (arg3.field2707 == 2) {
            for (int var6 = arg0; var6 <= arg1; var6++) {
                int var7 = arg3.field2858[var6] - 1;
                if (var7 != -1) {
                    if (class374.field5639 == 1 && class386.field5838 == var6 && class288.field4622 == arg3.field2865) {
                        boolean var8 = class428.method2653((class208) null, arg2, var7, arg3.field2720[var6], 92, 2, arg3.field2734, 0) == null;
                        if (var8) {
                            class386.field5832.method245(500, new class269(var7, arg3.field2720[var6], 2, 0, arg3.field2734, false));
                        }
                    } else {
                        boolean var9 = class428.method2653((class208) null, arg2, var7, arg3.field2720[var6], 88, 1, arg3.field2734, -13623264) == null;
                        if (var9) {
                            class386.field5832.method245(500, new class269(var7, arg3.field2720[var6], 1, -13623264, arg3.field2734, false));
                        }
                    }
                }
            }
        } else if (arg3.field2707 == 5) {
            boolean var5 = class428.method2653(arg3.field2826 ? class261.field4201.field3599 : null, arg2, arg3.field2691, arg3.field2848, 108, arg3.field2857, arg3.field2734, arg3.field2842 | 0xFF000000) == null;
            if (var5) {
                class386.field5832.method245(500, new class269(arg3.field2691, arg3.field2848, arg3.field2857, arg3.field2842 | 0xFF000000, arg3.field2734, arg3.field2826));
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static void method856(byte arg0) {
        if (arg0 != -31) {
            field1628 = 117;
        }
        field1624 = null;
        field1627 = null;
        field1625 = null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class130 {

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public int field1744 = -1;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1735 = "red:";

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "Lmi;")
    public static class408 field1743 = new class408();

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Ltb;")
    public static class103 field1746 = new class103();

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "Lsf;")
    public static class143 field1747 = new class143(16);

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field1749 = 0;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public int field1732;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public int field1736;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public int field1737;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public int field1739;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public int field1740;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public int field1741;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public int field1742;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public int field1748;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jd", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field1750;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)Lhn;")
    public static final class256 method884(boolean arg0) {
        field1734++;
        class256 var1 = (class256) class166.field2166.method1252(-25);
        if (var1 != null) {
            var1.method2574((byte) 117);
            var1.method1439(-29183);
            return var1;
        }
        if (!arg0) {
            method884(false);
        }
        class256 var2;
        do {
            var2 = (class256) class376.field5677.method1252(-65);
            if (var2 == null) {
                return null;
            }
            if (var2.method1613(2) > class55.method375(-3913)) {
                return null;
            }
            var2.method2574((byte) 124);
            var2.method1439(-29183);
        } while ((var2.field3305 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method885(int arg0) {
        field1746 = null;
        field1735 = null;
        if (arg0 != 64) {
            method885(59);
        }
        field1747 = null;
        field1743 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)Z")
    public static final boolean method886(int arg0, int arg1, int arg2, int arg3) {
        if (!class54.method374(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class88.field1226[arg0].method781(arg1, arg2) - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class146.field1926) {
                    if (!class447.method2814(var4, var6, var5)) {
                        return false;
                    }
                    if (!class447.method2814(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class447.method2814(var4, var7, var5)) {
                        return false;
                    }
                    if (!class447.method2814(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class447.method2814(var4, var8, var5)) {
                    return false;
                }
                if (!class447.method2814(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class239.field3369) {
                    if (!class447.method2814(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class447.method2814(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class447.method2814(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class447.method2814(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class447.method2814(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class447.method2814(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class146.field1926) {
                    if (!class447.method2814(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class447.method2814(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class447.method2814(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class447.method2814(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class447.method2814(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class447.method2814(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class239.field3369) {
                    if (!class447.method2814(var4, var6, var5)) {
                        return false;
                    }
                    if (!class447.method2814(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class447.method2814(var4, var7, var5)) {
                        return false;
                    }
                    if (!class447.method2814(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class447.method2814(var4, var8, var5)) {
                    return false;
                }
                if (!class447.method2814(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class447.method2814(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class447.method2814(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class447.method2814(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class447.method2814(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class447.method2814(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static final void method887(int arg0) {
        field1738++;
        int var1 = -89 / ((arg0 - 25) / 56);
        while (true) {
            class153 var2;
            class18 var4;
            do {
                do {
                    var2 = (class153) class261.field3789.method2647((byte) 93);
                    if (var2 == null) {
                        return;
                    }
                } while (class343.field5032 == null);
                if (var2.field1999 >= 0) {
                    int var3 = var2.field1999 - 1;
                    var4 = class23.field408[var3];
                } else {
                    int var5 = -var2.field1999 - 1;
                    if (class452.field6590 == var5) {
                        var4 = class100.field1350;
                    } else {
                        var4 = class125.field1664[var5];
                    }
                }
            } while (var4 == null);
            class404 var6 = class165.method1020(var2.field2012, 1);
            int var7;
            int var8;
            if (var2.field2007 == 1 || var2.field2007 == 3) {
                var8 = var6.field6048;
                var7 = var6.field6014;
            } else {
                var7 = var6.field6048;
                var8 = var6.field6014;
            }
            int var9 = var2.field2009 + (var7 >> 1);
            int var10 = var2.field2009 + (var7 + 1 >> 1);
            int var11 = (var8 >> 1) + var2.field2006;
            int var12 = (var8 + 1 >> 1) + var2.field2006;
            class337 var13 = class88.field1226[var4.field5291];
            int var14 = var13.method781(var9, var11) - (-var13.method781(var10, var11) - var13.method781(var9, var12)) + var13.method781(var10, var12) >> 2;
            class351 var15 = null;
            int var16 = class18.field219[var2.field2000];
            if (var16 == 0) {
                var15 = (class351) class87.method539(var4.field5291, var2.field2009, var2.field2006);
            } else if (var16 == 1) {
                var15 = (class351) class117.method822(var4.field5291, var2.field2009, var2.field2006);
            } else if (var16 == 2) {
                var15 = (class351) class312.method1947(var4.field5291, var2.field2009, var2.field2006, field1750 == null ? (field1750 = method889("im")) : field1750);
            } else if (var16 == 3) {
                var15 = (class351) class135.method910(var4.field5291, var2.field2009, var2.field2006);
            }
            if (var15 != null) {
                class265.method1695(0, var2.field2009, var2.field1996, var16, var2.field2006, -29403, 0, var2.field2010 + 1, var4.field5291, -1);
                var4.field298 = var2.field2006 * 128 + (var8 * 64);
                var4.field307 = class50.field698 + var2.field1996;
                var4.field302 = var2.field2009 * 128 + var7 * 64;
                var4.field299 = var2.field2010 + class50.field698;
                var4.field308 = var15;
                var4.field300 = var14;
                int var17 = var2.field2011;
                int var18 = var2.field2001;
                int var19 = var2.field2005;
                if (var17 > var18) {
                    int var20 = var17;
                    var17 = var18;
                    var18 = var20;
                }
                int var21 = var2.field2002;
                if (var19 > var21) {
                    int var22 = var19;
                    var19 = var21;
                    var21 = var22;
                }
                var4.field292 = var2.field2009 + var17;
                var4.field294 = var2.field2009 + var18;
                var4.field310 = var2.field2006 + var21;
                var4.field295 = var2.field2006 + var19;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZLpp;)V")
    public static final void method888(int arg0, int arg1, boolean arg2, class262 arg3) {
        field1733++;
        class416.field6195[arg0][arg1] = arg3;
        if (!arg2) {
            method885(-74);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method889(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

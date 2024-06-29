import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class80 {

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Ljd;")
    private static class92 field1620 = class202.method1325((byte) 90, "Enter your username (V password)3");

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Ljd;")
    private static class92 field1626 = class202.method1325((byte) 90, "skill)2");

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Ljd;")
    public static class92 field1625 = class202.method1325((byte) 90, "; Max)2Age=");

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Ljd;")
    public static class92 field1624 = field1626;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Ljd;")
    public static class92 field1629 = field1620;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field1628 = -1;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "[[[[Z")
    public static boolean[][][][] field1622;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIB)I")
    public static final int method542(int arg0, int arg1, byte arg2) {
        if (arg2 > -86) {
            method544(5, (byte) -73);
        }
        field1621++;
        class116 var3 = (class116) class29.field637.method216(-96, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var3.field2347.length) {
            return var3.field2347[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)Z")
    public static final boolean method543(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class165.field3255; var3++) {
            class13 var4 = class207.field3980[var3];
            if (var4.field381 == 1) {
                int var5 = var4.field392 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field382 * var5 >> 8) + var4.field389;
                    int var7 = (var4.field388 * var5 >> 8) + var4.field380;
                    int var8 = (var4.field385 * var5 >> 8) + var4.field379;
                    int var9 = (var4.field390 * var5 >> 8) + var4.field395;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field381 == 2) {
                int var10 = arg0 - var4.field392;
                if (var10 > 0) {
                    int var11 = (var4.field382 * var10 >> 8) + var4.field389;
                    int var12 = (var4.field388 * var10 >> 8) + var4.field380;
                    int var13 = (var4.field385 * var10 >> 8) + var4.field379;
                    int var14 = (var4.field390 * var10 >> 8) + var4.field395;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field381 == 3) {
                int var15 = var4.field389 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field386 * var15 >> 8) + var4.field392;
                    int var17 = (var4.field377 * var15 >> 8) + var4.field374;
                    int var18 = (var4.field385 * var15 >> 8) + var4.field379;
                    int var19 = (var4.field390 * var15 >> 8) + var4.field395;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field381 == 4) {
                int var20 = arg2 - var4.field389;
                if (var20 > 0) {
                    int var21 = (var4.field386 * var20 >> 8) + var4.field392;
                    int var22 = (var4.field377 * var20 >> 8) + var4.field374;
                    int var23 = (var4.field385 * var20 >> 8) + var4.field379;
                    int var24 = (var4.field390 * var20 >> 8) + var4.field395;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field381 == 5) {
                int var25 = arg1 - var4.field379;
                if (var25 > 0) {
                    int var26 = (var4.field386 * var25 >> 8) + var4.field392;
                    int var27 = (var4.field377 * var25 >> 8) + var4.field374;
                    int var28 = (var4.field382 * var25 >> 8) + var4.field389;
                    int var29 = (var4.field388 * var25 >> 8) + var4.field380;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)Z")
    public static final boolean method544(int arg0, byte arg1) {
        if (arg1 != -101) {
            field1628 = 5;
        }
        field1630++;
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static void method545(byte arg0) {
        if (arg0 >= -126) {
            field1628 = -64;
        }
        field1620 = null;
        field1622 = null;
        field1626 = null;
        field1625 = null;
        field1629 = null;
        field1624 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public static final void method546(int arg0, int arg1) {
        field1623++;
        if (arg0 == arg1 && !class118.field2399) {
            class55.method320(arg0 + 85);
        } else if (arg1 != -1 && (class116.field2349 != arg1 || !class95.method664(-19281)) && class151.field2996 != 0 && !class118.field2399) {
            class99.method692(false, 0, 2, class81.field1653, arg0 ^ 0xFFFF92E8, arg1, class151.field2996);
        }
        class116.field2349 = arg1;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(III)V")
    public static final void method547(int arg0, int arg1, int arg2) {
        class43 var3 = class31.field698[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field953 = null;
        }
    }
}

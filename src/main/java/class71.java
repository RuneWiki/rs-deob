import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class class71 {

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Lmc;")
    public static class75 field1806 = class30.method234(true, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Lmc;")
    public static class75 field1805 = class30.method234(true, " ");

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Lmc;")
    public static class75 field1804 = class30.method234(true, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Lmc;")
    public static class75 field1807 = class30.method234(true, " hat sich eingeloggt)3");

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field1802 = 0;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field1813 = 0;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field1814 = 0;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field1803 = 1;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "[Z")
    public static boolean[] field1810 = new boolean[112];

    @OriginalMember(owner = "client!le", name = "s", descriptor = "[B")
    public static byte[] field1817 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!le", name = "t", descriptor = "Lmc;")
    public static class75 field1818 = class30.method234(true, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Lp;")
    public static class90 field1799;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)V", line = 9)
    public static final void method598(byte arg0, int arg1) {
        int var2 = 87 % ((arg0 - 16) / 60);
        field1809++;
        class88.method736(-1, arg1);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 24)
    public static void method599(byte arg0) {
        field1810 = null;
        field1807 = null;
        field1804 = null;
        if (arg0 != 12) {
            field1813 = 47;
        }
        field1818 = null;
        field1806 = null;
        field1805 = null;
        field1799 = null;
        field1817 = null;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 48)
    public static final void method600(int arg0) {
        if (arg0 != 10721) {
            method599((byte) 89);
        }
        for (class100 var1 = (class100) class90.field2210.method248(32); var1 != null; var1 = (class100) class90.field2210.method252(92)) {
            if (var1.field2577 != null) {
                class110.field2792.method868(var1.field2577);
                var1.field2577 = null;
            }
            if (var1.field2582 != null) {
                class110.field2792.method868(var1.field2582);
                var1.field2582 = null;
            }
        }
        class90.field2210.method256(false);
        field1800++;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 131)
    public static final void method601(int arg0) {
        field1811++;
        class97.field2448.method711(-30816);
        int var1 = class97.field2448.method709(-127, 8);
        if (class110.field2790 > var1) {
            for (int var2 = var1; var2 < class110.field2790; var2++) {
                class78.field1955[class112.field2843++] = class118.field2929[var2];
            }
        }
        if (arg0 != 1) {
            method599((byte) -31);
        }
        if (var1 > class110.field2790) {
            throw new RuntimeException("gnpov1");
        }
        class110.field2790 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class118.field2929[var3];
            class97 var5 = class12.field231[var4];
            int var6 = class97.field2448.method709(-127, 1);
            if (var6 == 0) {
                class118.field2929[class110.field2790++] = var4;
                var5.field1215 = class34.field781;
            } else {
                int var7 = class97.field2448.method709(arg0 ^ 0xFFFFFF80, 2);
                if (var7 == 0) {
                    class118.field2929[class110.field2790++] = var4;
                    var5.field1215 = class34.field781;
                    class94.field2369[class76.field1921++] = var4;
                } else if (var7 == 1) {
                    class118.field2929[class110.field2790++] = var4;
                    var5.field1215 = class34.field781;
                    int var8 = class97.field2448.method709(-127, 3);
                    var5.method390(104, var8, false);
                    int var9 = class97.field2448.method709(-126, 1);
                    if (var9 == 1) {
                        class94.field2369[class76.field1921++] = var4;
                    }
                } else if (var7 == 2) {
                    class118.field2929[class110.field2790++] = var4;
                    var5.field1215 = class34.field781;
                    int var10 = class97.field2448.method709(-128, 3);
                    var5.method390(113, var10, true);
                    int var11 = class97.field2448.method709(arg0 - 129, 3);
                    var5.method390(126, var11, true);
                    int var12 = class97.field2448.method709(-128, 1);
                    if (var12 == 1) {
                        class94.field2369[class76.field1921++] = var4;
                    }
                } else if (var7 == 3) {
                    class78.field1955[class112.field2843++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BII)Z", line = 237)
    public static final boolean method602(byte arg0, int arg1, int arg2) {
        field1812++;
        if (arg1 == 0 && class8.field126 == arg2) {
            return true;
        } else if (arg1 == 1 && class117.field2916 == arg2) {
            return true;
        } else if ((arg1 == 2 || arg1 == 3) && class24.field478 == arg2) {
            return true;
        } else {
            int var3 = 127 % ((-arg0 - 21) / 46);
            return false;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLja;)V", line = 263)
    public static final void method603(byte arg0, class55 arg1) {
        if (arg0 >= -74) {
            field1818 = null;
        }
        class126.field3078 = arg1;
        field1801++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public abstract void method136(int arg0);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I[BIZ)V")
    public abstract void method137(int arg0, byte[] arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBI)V")
    public abstract void method138(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
    public abstract void method142(byte arg0);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)V")
    public abstract void method140(int arg0, byte arg1);

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(B)V")
    public abstract void method141(byte arg0);
}

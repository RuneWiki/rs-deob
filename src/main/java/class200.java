import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class200 extends class176 {

    @OriginalMember(owner = "client!oq", name = "M", descriptor = "[I")
    public static int[] field2852 = new int[14];

    @OriginalMember(owner = "client!oq", name = "I", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!oq", name = "K", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!oq", name = "L", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!oq", name = "N", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!oq", name = "O", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!oq", name = "P", descriptor = "I")
    public static int field2855;

    static {
        new class349("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I[B)Lhk;", line = 3)
    public static final class54 method1413(int arg0, byte[] arg1) {
        field2849++;
        class54 var2 = new class54();
        class130 var3 = new class130(arg1);
        var3.field1880 = var3.field1851.length - 2;
        int var4 = var3.method798(false);
        int var5 = var3.field1851.length - var4 - 2 - 12;
        var3.field1880 = var5;
        int var6 = var3.method815(true);
        var2.field693 = var3.method798(false);
        var2.field701 = var3.method798(false);
        var2.field694 = var3.method798(false);
        var2.field704 = var3.method798(false);
        int var7 = var3.method837(true);
        if (arg0 != -101) {
            return null;
        }
        if (var7 > 0) {
            var2.field692 = new class191[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method798(false);
                class191 var10 = new class191(class258.method1787(-117, var9));
                var2.field692[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method815(true);
                    int var12 = var3.method815(true);
                    var10.method1376(new class24(var12), (long) var11, 85);
                }
            }
        }
        var3.field1880 = 0;
        var2.field696 = var3.method830(3);
        var2.field697 = new int[var6];
        var2.field705 = new String[var6];
        var2.field700 = new int[var6];
        int var13 = 0;
        while (var3.field1880 < var5) {
            int var14 = var3.method798(false);
            if (var14 == 3) {
                var2.field705[var13] = var3.method843(-89).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field700[var13] = var3.method837(true);
            } else {
                var2.field700[var13] = var3.method815(true);
            }
            var2.field697[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)V", line = 82)
    public static void method1414(int arg0) {
        field2852 = null;
        if (arg0 != -101) {
            field2854 = 26;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lbr;I)Z", line = 96)
    public static final boolean method1415(class223 arg0, int arg1) {
        if (arg1 <= 81) {
            method1417((class108) null, (byte) -118, (class108) null, true, 101);
        }
        field2853++;
        if (arg0.field3281 == 205) {
            class86.field1122 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(II)Lt;", line = 118)
    public static final class400 method1416(int arg0, int arg1) {
        field2850++;
        if (arg1 == 0) {
            if ((double) class176.field2468 == 3.0D) {
                return class288.field4199;
            }
            if ((double) class176.field2468 == 4.0D) {
                return class63.field844;
            }
            if ((double) class176.field2468 == 6.0D) {
                return class206.field2915;
            }
            if ((double) class176.field2468 >= 8.0D) {
                return class413.field5912;
            }
        } else if (arg1 == 1) {
            if ((double) class176.field2468 == 3.0D) {
                return class206.field2915;
            }
            if ((double) class176.field2468 == 4.0D) {
                return class413.field5912;
            }
            if ((double) class176.field2468 == 6.0D) {
                return class341.field4930;
            }
            if ((double) class176.field2468 >= 8.0D) {
                return class147.field2199;
            }
        } else if (arg1 == 2) {
            if ((double) class176.field2468 == 3.0D) {
                return class341.field4930;
            }
            if ((double) class176.field2468 == 4.0D) {
                return class147.field2199;
            }
            if ((double) class176.field2468 == 6.0D) {
                return class338.field4896;
            }
            if ((double) class176.field2468 >= 8.0D) {
                return class214.field3068;
            }
        }
        return arg0 == 21614 ? null : null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ltj;BLtj;ZI)V", line = 188)
    public static final void method1417(class108 arg0, byte arg1, class108 arg2, boolean arg3, int arg4) {
        class206.field2890 = arg4;
        class306.field4456 = arg3;
        class154.field2284 = arg2;
        int var5 = -108 % ((arg1 + 40) / 61);
        field2851++;
        class75.field983 = arg0;
    }
}

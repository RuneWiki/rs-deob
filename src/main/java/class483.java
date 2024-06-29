import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class483 {

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "[Lnm;")
    public class304[] field6797 = new class304[100];

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "[I")
    public int[] field6796 = new int[100];

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "[I")
    public int[] field6801 = new int[3];

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "[Lvf;")
    public class94[] field6799 = new class94[8];

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Lus;")
    public static class1 field6804;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "F")
    public static float field6806;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Ldk;")
    public static class326 field6805;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "Ldk;")
    public static class326 field6807;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public int field6802;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field6800;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBII)I")
    public static final int method2821(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == 10) {
            field6795++;
            int var4 = ((arg3 & 0xFF00) * arg2 & 0xFF0000 | (arg3 & 0xFF00FF) * arg2 & 0xFF00FF00) >>> 8;
            int var5 = 255 - arg2;
            return (((arg0 & 0xFF00) * var5 & 0xFF0000 | (arg0 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
        } else {
            return -61;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
    public static final void method2822(int arg0, int arg1) {
        field6798++;
        class489 var2 = class116.method731(arg1 - 625541414, arg1, arg0);
        var2.method2861(-229012000);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method2823(int arg0) {
        if (arg0 != -16711936) {
            field6807 = null;
        }
        field6805 = null;
        field6804 = null;
        field6807 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZBIZ)V")
    public static final void method2824(int arg0, boolean arg1, byte arg2, int arg3, boolean arg4) {
        field6803++;
        int var5 = -31 / ((arg2 + 78) / 32);
        if (!arg4 && class310.field4388 == arg0 && class242.field3622 == arg3 && class42.field619 == class29.field394 || class314.field4438.method1174((byte) -76, class437.field6083)) {
            return;
        }
        class310.field4388 = arg0;
        class42.field619 = class29.field394;
        class242.field3622 = arg3;
        if (class314.field4438.method1174((byte) -101, class437.field6083)) {
            class42.field619 = 0;
        }
        if (arg1) {
            class211.method1368((byte) -118, 28);
        } else {
            class211.method1368((byte) -56, 25);
        }
        class306.method1898(class92.field1166, 868, class27.field363.method2065(120, class326.field4711), true);
        int var6 = class240.field3602;
        class240.field3602 = (class310.field4388 - (class58.field758 >> 4)) * 8;
        int var7 = class360.field5180;
        class360.field5180 = (class242.field3622 - (class287.field4181 >> 4)) * 8;
        class367.field5264 = class395.method2369(class310.field4388 * 8, class242.field3622 * 8);
        class269.field3929 = null;
        int var8 = class240.field3602 - var6;
        int var9 = class360.field5180 - var7;
        if (arg1) {
            class225.field3418 = 0;
            int var13 = (class58.field758 - 1) * 128;
            int var14 = class287.field4181 * 128 - 128;
            for (int var15 = 0; var15 < 32768; var15++) {
                class216 var20 = class139.field1851[var15];
                if (var20 != null) {
                    var20.field4317 -= var9 * 128;
                    var20.field4331 -= var8 * 128;
                    if (var20.field4331 >= 0 && var20.field4331 <= var13 && var20.field4317 >= 0 && var14 >= var20.field4317) {
                        boolean var21 = true;
                        for (int var22 = 0; var22 < 10; var22++) {
                            var20.field2163[var22] -= var8;
                            var20.field2159[var22] -= var9;
                            if (var20.field2163[var22] < 0 || class58.field758 <= var20.field2163[var22] || var20.field2159[var22] < 0 || class287.field4181 <= var20.field2159[var22]) {
                                var21 = false;
                            }
                        }
                        if (var21) {
                            class281.field4139[class225.field3418++] = var15;
                        } else {
                            class139.field1851[var15].method1386(-18479, (class466) null);
                            class139.field1851[var15] = null;
                        }
                    } else {
                        class139.field1851[var15].method1386(-18479, (class466) null);
                        class139.field1851[var15] = null;
                    }
                }
            }
        } else {
            for (int var10 = 0; var10 < 32768; var10++) {
                class216 var11 = class139.field1851[var10];
                if (var11 != null) {
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field2163[var12] -= var8;
                        var11.field2159[var12] -= var9;
                    }
                    var11.field4317 -= var9 * 128;
                    var11.field4331 -= var8 * 128;
                }
            }
        }
        for (int var16 = 0; var16 < 2048; var16++) {
            class452 var18 = class124.field1559[var16];
            if (var18 != null) {
                for (int var19 = 0; var19 < 10; var19++) {
                    var18.field2163[var19] -= var8;
                    var18.field2159[var19] -= var9;
                }
                var18.field4331 -= var8 * 128;
                var18.field4317 -= var9 * 128;
            }
        }
        class260.method1616(var9, var8, -128);
        for (class393 var17 = (class393) class34.field445.method2843(1123227612); var17 != null; var17 = (class393) class34.field445.method2842(1673506446)) {
            var17.field5579 -= var9;
            var17.field5573 -= var8;
            if (var17.field5573 < 0 || var17.field5579 < 0 || class58.field758 <= var17.field5573 || class287.field4181 <= var17.field5579) {
                var17.method1510((byte) -13);
            }
        }
        if (class118.field1493 != 0) {
            class359.field5161 -= var9;
            class118.field1493 -= var8;
        }
        class442.field6125 = 0;
        if (arg1) {
            class111.field1417 -= var8;
            class115.field1469 -= var8;
            class343.field4996 -= var9 * 128;
            class490.field6904 -= var8 * 128;
            class39.field512 -= var9;
            class418.field5842 -= var9;
            if (Math.abs(var8) > class58.field758 || Math.abs(var9) > class287.field4181) {
                class141.method887(24);
            }
        } else if (class136.field1807 == 4) {
            class353.field5098 -= var8 * 128;
            class453.field6393 -= var8 * 128;
            class480.field6734 -= var9 * 128;
            class317.field4596 -= var9 * 128;
        } else {
            class136.field1807 = 1;
        }
        class298.method1840(true);
        class304.method1885(872);
        class387.field5504.method2838((byte) 43);
        class170.field2480.method2838((byte) 8);
        class212.field3208.method1447(-127);
        class62.method388(true);
    }

    static {
        new class326("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field6804 = new class1(73, -1);
        field6806 = 1024.0F;
        field6805 = new class326("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");
        field6807 = new class326("Examine", "Untersuchen", "Examiner", "Examinar");
        new class326("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
    }
}

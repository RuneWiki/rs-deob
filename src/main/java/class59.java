import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class class59 {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lad;")
    public static class5 field1441 = class88.method674("Update)2Liste geladen)3", -83);

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Lbb;")
    public static class9 field1444 = new class9(64);

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Lad;")
    public static class5 field1451 = class88.method674("k", -63);

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Lad;")
    public static class5 field1450 = class88.method674("backleft2", -119);

    @OriginalMember(owner = "client!je", name = "i", descriptor = "[Lee;")
    public static class30[] field1448 = new class30[13];

    @OriginalMember(owner = "client!je", name = "j", descriptor = "Lad;")
    private static class5 field1449 = class88.method674("Please check your message)2centre for details)3", 30);

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Lad;")
    public static class5 field1454 = class88.method674("@yel@*V", -91);

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Lad;")
    public static class5 field1452 = field1449;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field1447 = 0;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Lad;")
    private static class5 field1456 = class88.method674("Classic", -64);

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lad;")
    public static class5 field1453 = field1456;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Lgd;")
    public static class40 field1455;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIZLub;)V", line = 5)
    public static final void method480(int arg0, int arg1, boolean arg2, class122 arg3) {
        field1442++;
        int var4 = arg1 * arg1 + arg0 * arg0;
        if (var4 > 4225 && var4 < 90000) {
            int var5 = class133.field3220 + class131.field3177 & 0x7FF;
            int var6 = class45.field1176[var5];
            int var7 = var6 * 256 / (class102.field2476 + 256);
            int var8 = class45.field1166[var5];
            int var9 = var8 * 256 / (class102.field2476 + 256);
            int var10 = arg0 * var9 - arg1 * var7 >> 16;
            int var11 = arg0 * var7 + arg1 * var9 >> 16;
            double var12 = Math.atan2((double) var11, (double) var10);
            int var14 = (int) (Math.sin(var12) * 63.0D);
            int var15 = (int) (Math.cos(var12) * 57.0D);
            class87.field2005.method969(var14 + 98 - 10, 83 - var15 - 20, 20, 20, 15, 15, var12, 256);
        } else {
            class100.method800(arg0, arg3, arg1, (byte) 54);
        }
        if (arg2) {
            field1453 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 49)
    public static final void method481(byte arg0) {
        field1446++;
        class65.field1568 = 0;
        int var1 = (class82.field1932.field112 >> 7) + class47.field1235;
        int var2 = 58 / ((arg0 - 6) / 54);
        int var3 = (class82.field1932.field120 >> 7) + class106.field2659;
        if (var1 >= 3053 && var1 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            class65.field1568 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            class65.field1568 = 1;
        }
        if (class65.field1568 == 1 && var1 >= 3139 && var1 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            class65.field1568 = 0;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)Z", line = 82)
    public static final boolean method482(boolean arg0, int arg1) {
        if (!arg0) {
            field1448 = null;
        }
        field1440++;
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V", line = 105)
    public static void method483(byte arg0) {
        field1441 = null;
        field1456 = null;
        field1454 = null;
        field1450 = null;
        field1444 = null;
        field1448 = null;
        if (arg0 != 42) {
            field1454 = null;
        }
        field1449 = null;
        field1451 = null;
        field1455 = null;
        field1453 = null;
        field1452 = null;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(B)V", line = 131)
    public static final void method484(byte arg0) {
        field1445++;
        for (int var1 = -1; var1 < class12.field348; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class105.field2577[var1];
            }
            class112 var6 = class7.field251[var5];
            if (var6 != null && var6.field98 > 0) {
                var6.field98--;
                if (var6.field98 == 0) {
                    var6.field55 = null;
                }
            }
        }
        if (arg0 != 54) {
            method480(-60, 42, false, null);
        }
        for (int var2 = 0; var2 < class33.field790; var2++) {
            int var3 = class25.field611[var2];
            class61 var4 = class103.field2504[var3];
            if (var4 != null && var4.field98 > 0) {
                var4.field98--;
                if (var4.field98 == 0) {
                    var4.field55 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZI)I")
    public abstract int method92(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
    public abstract void method90(byte arg0);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public abstract void method91(int arg0);
}

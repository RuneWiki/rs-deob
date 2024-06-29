import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class109 extends class314 {

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "[I")
    public int[] field2013 = new int[] { 0 };

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "[I")
    public int[] field2019 = new int[] { -1 };

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Lud;")
    private static class279 field2008 = class130.method1024("Checking for updates )2 ", 255);

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Lud;")
    private static class279 field2010 = class130.method1024("Hidden", 255);

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lud;")
    public static class279 field2007 = field2010;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "Lud;")
    public static class279 field2017 = field2008;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field2016 = 2;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lud;")
    public static class279 field2009 = class130.method1024("Lade Konfiguration )2 ", 255);

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public static int field2020 = 0;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Lok;")
    public static class149 field2012;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Llm;")
    public static class49 field2015;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILgf;IZI)V", line = 10)
    public static final void method899(int arg0, class8 arg1, int arg2, boolean arg3, int arg4) {
        field2014++;
        int var5 = arg1.field297;
        if (arg1.field162 == 0) {
            arg1.field297 = arg1.field204;
        } else if (arg1.field162 == 1) {
            arg1.field297 = arg2 - arg1.field204;
        } else if (arg1.field162 == 2) {
            arg1.field297 = arg1.field204 * arg2 >> 14;
        } else if (arg1.field162 == 3) {
            if (arg1.field201 == 2) {
                arg1.field297 = (arg1.field204 - 1) * arg1.field176 + arg1.field204 * 32;
            } else if (arg1.field201 == 7) {
                arg1.field297 = (arg1.field204 - 1) * arg1.field176 + arg1.field204 * 12;
            }
        }
        int var6 = arg1.field220;
        if (arg1.field241 == arg4) {
            arg1.field220 = arg1.field218;
        } else if (arg1.field241 == 1) {
            arg1.field220 = arg0 - arg1.field218;
        } else if (arg1.field241 == 2) {
            arg1.field220 = arg1.field218 * arg0 >> 14;
        } else if (arg1.field241 == 3) {
            if (arg1.field201 == 2) {
                arg1.field220 = arg1.field218 * 32 + ((arg1.field218 - 1) * arg1.field295);
            } else if (arg1.field201 == 7) {
                arg1.field220 = (arg1.field218 - 1) * arg1.field295 + arg1.field218 * 115;
            }
        }
        if (arg1.field241 == 4) {
            arg1.field220 = arg1.field297 * arg1.field196 / arg1.field296;
        }
        if (arg1.field162 == 4) {
            arg1.field297 = arg1.field296 * arg1.field220 / arg1.field196;
        }
        if (class205.field3641 && (client.method1798(arg1).field4372 != 0 || arg1.field201 == 0)) {
            if (arg1.field297 < 5 && arg1.field220 < 5) {
                arg1.field220 = 5;
                arg1.field297 = 5;
            } else {
                if (arg1.field220 <= 0) {
                    arg1.field220 = 5;
                }
                if (arg1.field297 <= 0) {
                    arg1.field297 = 5;
                }
            }
        }
        if (arg1.field326 == 1337) {
            class23.field597 = arg1;
        }
        if (arg3 && arg1.field270 != null && (arg1.field220 != var6 || arg1.field297 != var5)) {
            class23 var7 = new class23();
            var7.field608 = arg1.field270;
            var7.field596 = arg1;
            class268.field4804.method2246(true, var7);
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)V", line = 111)
    public static final void method900(byte arg0) {
        class1.field83.method1334((byte) -25);
        if (arg0 >= -34) {
            method901(-125);
        }
        field2011++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)Z", line = 145)
    public static final boolean method901(int arg0) {
        field2018++;
        if (arg0 != 2330) {
            method899(97, (class8) null, -22, true, -126);
        }
        try {
            return class126.method1011(-1);
        } catch (IOException var5) {
            class141.method1084(0);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class143.field2597 + "," + class302.field5366 + "," + class165.field2969 + " - " + class264.field4741 + "," + (class72.field1420.field11[0] + class112.field2058) + "," + (class12.field396 + class72.field1420.field34[0]) + " - ";
            for (int var4 = 0; class264.field4741 > var4 && var4 < 50; var4++) {
                var3 = var3 + class287.field5106.field1168[var4] + ",";
            }
            class94.method792(var6, (byte) -115, var3);
            class63.method551(-74);
            return true;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V", line = 175)
    public static void method902(int arg0) {
        field2007 = null;
        field2010 = null;
        field2017 = null;
        field2009 = null;
        field2012 = null;
        field2008 = null;
        int var1 = 76 % ((59 - arg0) / 39);
        field2015 = null;
    }
}

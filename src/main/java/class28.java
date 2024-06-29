import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class28 {

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "Lka;")
    public final class180 field413;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public final int field408;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Leg;")
    public static class37 field405 = class174.method1167("Lade)3)3)3", -95);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field404 = -2;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "Lji;")
    public static class238 field409 = class198.method1377((byte) 121);

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
    public static final void method159(int arg0, int arg1, int arg2) {
        class153.field2572 = arg2 - class13.field205;
        class82.field1291 = class228.field3921 + class118.field2004 - arg1 - 1;
        field407++;
        int var3 = (int) ((float) class27.field379.field4067 / class79.field1229) + class153.field2572;
        int var4 = 95 / ((-arg0 - 73) / 47);
        int var5 = class82.field1291 - (int) ((float) class27.field379.field4206 / class79.field1229);
        int var6 = class82.field1291 + ((int) ((float) class27.field379.field4206 / class79.field1229));
        if (var5 < 0) {
            class82.field1291 = (int) ((float) class27.field379.field4206 / class79.field1229);
        }
        if (class118.field2004 < var6) {
            class82.field1291 = class118.field2004 - (int) ((float) class27.field379.field4206 / class79.field1229);
        }
        int var7 = class153.field2572 - ((int) ((float) class27.field379.field4067 / class79.field1229));
        if (var7 < 0) {
            class153.field2572 = (int) ((float) class27.field379.field4067 / class79.field1229);
        }
        if (class243.field4368 < var3) {
            class153.field2572 = class243.field4368 - ((int) ((float) class27.field379.field4067 / class79.field1229));
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
    public static final void method160(int arg0, int arg1) {
        if (arg1 <= 24) {
            field405 = null;
        }
        class274 var2 = class166.method1116(5, arg0, true);
        field406++;
        var2.method1840(10000);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static final void method161(int arg0) {
        field410++;
        class89.field1422.method1409(88);
        if (arg0 != 24754) {
            method161(-9);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()V")
    public static final void method162() {
        if (class88.field1394 != null) {
            for (int var0 = 0; var0 < class88.field1394.length; var0++) {
                for (int var1 = 0; var1 < class175.field2936; var1++) {
                    for (int var2 = 0; var2 < class160.field2675; var2++) {
                        class88.field1394[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class233.field4031 != null) {
            for (int var3 = 0; var3 < class233.field4031.length; var3++) {
                for (int var4 = 0; var4 < class175.field2936; var4++) {
                    for (int var5 = 0; var5 < class160.field2675; var5++) {
                        class233.field4031[var3][var4][var5] = null;
                    }
                }
            }
        }
        class152.field2561 = 0;
        if (class66.field1054 != null) {
            for (int var6 = 0; var6 < class152.field2561; var6++) {
                class66.field1054[var6] = null;
            }
        }
        if (class134.field2320 != null) {
            for (int var7 = 0; var7 < class224.field3839; var7++) {
                class134.field2320[var7] = null;
            }
            class224.field3839 = 0;
        }
        if (class108.field1735 != null) {
            for (int var8 = 0; var8 < class108.field1735.length; var8++) {
                class108.field1735[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIB)V")
    public static final void method163(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field412++;
        class122.method869(arg3, arg1, arg0 + arg3, arg1 - -arg2);
        class122.method873(arg3, arg1, arg0, arg2, 0);
        int var5 = -54 % ((arg4 + 44) / 38);
        if (class78.field1216 < 100) {
            return;
        }
        if (class35.field494 == null || class35.field494.field1627 != arg0 || class35.field494.field1637 != arg2) {
            class195 var6 = new class195(arg0, arg2);
            class122.method876(var6.field3331, arg0, arg2);
            class174.method1169(class118.field2004, class243.field4368, arg0, arg2, 0, 0, 0, 0, (byte) 98);
            class35.field494 = var6;
            class276.field4897.method1368(-88);
        }
        class35.field494.method705(arg3, arg1);
        int var7 = class82.field1298 * arg0 / class243.field4368 + arg3;
        int var8 = class69.field1106 * arg0 / class243.field4368;
        int var9 = arg1 + (class225.field3871 * arg2 / class118.field2004);
        int var10 = class126.field2126 * arg2 / class118.field2004;
        class122.method860(var7, var9, var8, var10, 16711680, 128);
        class122.method861(var7, var9, var8, var10, 16711680);
        if (class171.field2879 <= 0 || class171.field2879 % 10 >= 5) {
            return;
        }
        for (class83 var11 = (class83) class64.field1045.method1566(-3); var11 != null; var11 = (class83) class64.field1045.method1570(3)) {
            if (class187.field3193 == var11.field1310) {
                int var12 = var11.field1307 * arg0 / class243.field4368 + arg3;
                int var13 = var11.field1311 * arg2 / class118.field2004 + arg1;
                class122.method873(var12 - 2, var13 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
    public static void method164(boolean arg0) {
        field409 = null;
        if (!arg0) {
            method161(6);
        }
        field405 = null;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(II)V")
    public class28(int arg0, int arg1) {
        this.field413 = class247.method1704(arg0, -5072);
        this.field408 = arg1;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lka;I)V")
    public class28(class180 arg0, int arg1) {
        this.field408 = arg1;
        this.field413 = arg0;
    }
}

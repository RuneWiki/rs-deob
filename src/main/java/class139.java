import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class139 extends class116 {

    @OriginalMember(owner = "client!u", name = "v", descriptor = "[J")
    public static long[] field3093 = new long[100];

    @OriginalMember(owner = "client!u", name = "t", descriptor = "Lic;")
    public static class59 field3091 = class59.method433(0, ":tradereq:");

    @OriginalMember(owner = "client!u", name = "u", descriptor = "Lic;")
    private static class59 field3092 = class59.method433(0, "button near the top of that page)3");

    @OriginalMember(owner = "client!u", name = "w", descriptor = "Lic;")
    public static class59 field3094 = class59.method433(0, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!u", name = "z", descriptor = "Lic;")
    public static class59 field3097 = class59.method433(0, "Registrierter Benutzer");

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    public static volatile int field3106 = 0;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "Lic;")
    public static class59 field3110 = class59.method433(0, "::noclip");

    @OriginalMember(owner = "client!u", name = "J", descriptor = "Lic;")
    public static class59 field3107 = field3092;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "I")
    public int field3102;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    public int field3103;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "Lwf;")
    public class159 field3095;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "Lwf;")
    public class159 field3104;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "Lic;")
    public class59 field3105;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "[Ljava/lang/Object;")
    public Object[] field3096;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V")
    public static final void method1052(byte arg0) {
        if (arg0 != -80) {
            field3093 = null;
        }
        for (int var1 = 0; var1 < class68.field1703; var1++) {
            int var10002 = class38.field973[var1]--;
            if (class38.field973[var1] >= -10) {
                class101 var3 = class4.field81[var1];
                if (var3 == null) {
                    var3 = class101.method809(class103.field2514, class75.field1855[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class38.field973[var1] += var3.method812();
                    class4.field81[var1] = var3;
                }
                if (class38.field973[var1] < 0) {
                    int var10;
                    if (class22.field522[var1] == 0) {
                        var10 = class56.field1373;
                    } else {
                        int var4 = class22.field522[var1] >> 16 & 0xFF;
                        int var5 = (class22.field522[var1] & 0xFF) * 128;
                        int var6 = var4 * 128 + 64 - class159.field3650.field1730;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = class22.field522[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class159.field3650.field1751;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var5 < var9) {
                            class38.field973[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var5 - var9) * class73.field1804 / var5;
                    }
                    if (var10 > 0) {
                        class104 var11 = var3.method810().method816(class157.field3459);
                        class71 var12 = class71.method582(var11, 100, var10);
                        var12.method575(class61.field1562[var1] - 1);
                        class120.field2766.method1076(var12);
                    }
                    class38.field973[var1] = -100;
                }
            } else {
                class68.field1703--;
                for (int var2 = var1; var2 < class68.field1703; var2++) {
                    class75.field1855[var2] = class75.field1855[var2 + 1];
                    class4.field81[var2] = class4.field81[var2 + 1];
                    class61.field1562[var2] = class61.field1562[var2 + 1];
                    class38.field973[var2] = class38.field973[var2 + 1];
                    class22.field522[var2] = class22.field522[var2 + 1];
                }
                var1--;
            }
        }
        field3101++;
        if (class63.field1625 && !class131.method1002(arg0 + 643655663)) {
            if (class49.field1242 != 0 && class81.field2004 != -1) {
                class94.method781(0, class49.field1242, false, -123, class73.field1832, class81.field2004);
            }
            class63.field1625 = false;
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V")
    public static final void method1053(byte arg0) {
        field3100++;
        if (arg0 != 85) {
            method1055(null, 44, null, (byte) -99);
        }
        Object var1 = class63.field1614;
        synchronized (class63.field1614) {
            if (class80.field1995 == 0) {
                class102.field2497.method543(new class5(), 5, 0);
            }
            class80.field1995 = 600;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
    public static void method1054(int arg0) {
        field3093 = null;
        field3097 = null;
        field3094 = null;
        field3092 = null;
        field3091 = null;
        if (arg0 == 1) {
            field3110 = null;
            field3107 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lmd;ILpd;B)V")
    public static final void method1055(class87 arg0, int arg1, class108 arg2, byte arg3) {
        field3099++;
        if (arg3 != 21) {
            method1054(26);
        }
        class52 var4 = new class52();
        var4.field1292 = arg0;
        var4.field1290 = 1;
        var4.field2736 = arg1;
        var4.field1295 = arg2;
        class83 var5 = class152.field3301;
        synchronized (class152.field3301) {
            class152.field3301.method689(var4, (byte) -128);
        }
        method1053((byte) 85);
    }
}

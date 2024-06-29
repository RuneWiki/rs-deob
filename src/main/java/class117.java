import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class117 {

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "[Lod;")
    public static class101[] field3077 = new class101[4];

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Lfc;")
    public static class39 field3069 = class90.method774(":tradereq:", -107);

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Lfc;")
    public static class39 field3070 = class90.method774("Wen m-Ochten Sie hinzuf-Ugen?", -97);

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Lfc;")
    public static class39 field3072 = class90.method774("Anmelde)2Limit -Uberschritten)3", -116);

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "[I")
    public static int[] field3075 = new int[99];

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "[I")
    public static int[] field3076 = new int[500];

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Lfc;")
    public static class39 field3074 = class90.method774("Duell akzeptieren", -110);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lfc;")
    public static class39 field3067 = class90.method774("Titelbild geladen)3", -108);

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "Lfc;")
    private static class39 field3083 = class90.method774("Unexpected loginserver response)3", -105);

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "Lfc;")
    public static class39 field3080 = field3083;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public int field3071;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public int field3082;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field3075[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 5)
    public static void method1017(int arg0) {
        field3075 = null;
        field3077 = null;
        field3070 = null;
        field3072 = null;
        field3074 = null;
        field3076 = null;
        field3067 = null;
        field3080 = null;
        if (arg0 < 74) {
            field3075 = null;
        }
        field3083 = null;
        field3069 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 24)
    public static final void method1018(byte arg0) {
        field3079++;
        if (arg0 != -120) {
            field3072 = null;
        }
        while (true) {
            class2 var1 = class7.field214;
            class108 var2;
            synchronized (class7.field214) {
                var2 = (class108) class29.field829.method6(73);
            }
            if (var2 == null) {
                return;
            }
            var2.field2706.method765((int) var2.field3619, var2.field2705, var2.field2707, 0, false);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLoc;Loc;ZLma;)V", line = 64)
    public static final void method1019(byte arg0, class100 arg1, class100 arg2, boolean arg3, class84 arg4) {
        class38.field1032 = arg2;
        class42.field1140 = arg3;
        field3068++;
        class114.field2999 = arg1;
        class65.field1562 = class114.field2999.method849((byte) 106, 10);
        if (arg0 < 7) {
            field3072 = null;
        }
        class101.field2517 = arg4;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V", line = 80)
    public static final void method1020(byte arg0) {
        class139.method1142(2);
        field3081++;
        if (class126.field3195 == 1) {
            class70.field1637[class10.field291 / 100].method116(class12.field327 - 4 - 8, class76.field1738 + -4 - 8);
        }
        if (arg0 >= -59) {
            return;
        }
        if (class126.field3195 == 2) {
            class70.field1637[class10.field291 / 100 + 4].method116(class12.field327 - 12, class76.field1738 + -8 + -4);
        }
        if (class2.field36 != -1) {
            class27.method341(0, class2.field36);
            class28.method354(class2.field36, 334, 0, 4, (byte) 105, 0, 512);
        }
        if (class126.field3198 != -1) {
            class27.method341(0, class126.field3198);
            class28.method354(class126.field3198, 334, 0, 0, (byte) 120, 0, 512);
        }
        class104.method929((byte) -127);
        if (!class94.field2206) {
            class128.method1065(117);
            class17.method208((byte) 9);
        } else if (class50.field1258 == 0) {
            class30.method366(16776960);
        }
        if (class58.field1425 == 1) {
            class104.field2626.method116(472, 296);
        }
        if (class100.field2478) {
            short var1 = 507;
            byte var2 = 20;
            class50.field1255.method704(class137.method1111(new class39[] { class127.field3235, class86.method734(class124.field3181, 2218) }, (byte) 91), var1, var2, 16776960, -1);
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            int var9 = var2 + 15;
            int var5 = 16776960;
            if (var4 > 32768 && class74.field1705) {
                var5 = 16711680;
            }
            if (var4 > 65536 && !class74.field1705) {
                var5 = 16711680;
            }
            class50.field1255.method704(class137.method1111(new class39[] { class150.field3729, class86.method734(var4, 2218), class10.field283 }, (byte) -52), var1, var9, var5, -1);
            var9 += 15;
            if (class147.field3655) {
                class50.field1255.method704(class25.field739, var1, var9, 16711680, -1);
                class147.field3655 = false;
                var9 += 15;
            }
            if (class111.field2882) {
                class50.field1255.method704(class131.field3321, var1, var9, 16711680, -1);
                var9 += 15;
                class111.field2882 = false;
            }
            if (class63.field1548) {
                class50.field1255.method704(class15.field407, var1, var9, 16711680, -1);
                class63.field1548 = false;
                var9 += 15;
            }
        }
        if (class120.field3131 == 0) {
            return;
        }
        int var6 = class120.field3131 / 50;
        int var7 = var6 / 60;
        int var8 = var6 % 60;
        if (var8 >= 10) {
            class50.field1255.method700(class137.method1111(new class39[] { class31.field864, class86.method734(var7, 2218), class6.field190, class86.method734(var8, 2218) }, (byte) -109), 4, 329, 16776960, -1);
        } else {
            class50.field1255.method700(class137.method1111(new class39[] { class31.field864, class86.method734(var7, 2218), class132.field3330, class86.method734(var8, 2218) }, (byte) -45), 4, 329, 16776960, -1);
        }
    }
}

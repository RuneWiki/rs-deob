import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 {

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public int field995 = 0;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public int field998 = 0;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Lrd;")
    private static class117 field984 = class95.method812("Accept challenge", (byte) 8);

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Lrd;")
    public static class117 field989 = class95.method812("@or1@", (byte) 8);

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field991 = -1;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "Lrd;")
    private static class117 field994 = class95.method812("Sorry invited players only)3", (byte) 8);

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lrd;")
    public static class117 field977 = field984;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Lrd;")
    public static class117 field981 = field994;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "[I")
    public static int[] field997 = new int[1000];

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "B")
    public static byte field988 = 0;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Z")
    public static boolean field986 = false;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public int field1000;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public int field1001;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public int field990;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Lge;")
    public static class47 field983;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lid;")
    public class60 field974;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Lid;")
    public class60 field979;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "[I")
    public static int[] field987;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static final void method384(int arg0) {
        if (arg0 > -102) {
            method391((byte) -73, 7);
        }
        field975++;
        if (class53.field1510 != 0 && class53.field1510 != 3 || client.field624 != 1) {
            return;
        }
        int var1 = class66.field1873 - 25 - 550;
        int var2 = class68.field1909 - 4 - 5;
        if (var1 < 0 || var2 < 0 || var1 >= 146 || var2 >= 151) {
            return;
        }
        var2 -= 75;
        int var3 = class99.field2459 + class132.field3172 & 0x7FF;
        var1 -= 73;
        int var4 = class129.field3135[var3];
        int var5 = (class14.field277 + 256) * var4 >> 8;
        int var6 = class129.field3131[var3];
        int var7 = (class14.field277 + 256) * var6 >> 8;
        int var8 = var1 * var7 + var2 * var5 >> 11;
        int var9 = var2 * var7 - var1 * var5 >> 11;
        int var10 = class144.field3516.field717 + var8 >> 7;
        int var11 = class144.field3516.field751 - var9 >> 7;
        boolean var12 = class136.method1103(0, var10, 1, true, var11, 0, 0, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 0);
        if (!var12) {
            return;
        }
        class25.field754.method162(var1, -23339);
        class25.field754.method162(var2, -23339);
        class25.field754.method164(19877, class132.field3172);
        class25.field754.method162(57, -23339);
        class25.field754.method162(class99.field2459, -23339);
        class25.field754.method162(class14.field277, -23339);
        class25.field754.method162(89, -23339);
        class25.field754.method164(19877, class144.field3516.field717);
        class25.field754.method164(19877, class144.field3516.field751);
        class25.field754.method162(class66.field1875, -23339);
        class25.field754.method162(63, -23339);
        return;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static final void method385(int arg0) {
        class92.field2324 = -1;
        class15.field354 = false;
        class53.field1510 = 0;
        class21.field604 = 0;
        class119.field2922 = 0;
        class40.field1164 = 0;
        class138.field3323 = -1;
        field996++;
        class134.field3206 = -1;
        class25.field754.field314 = 0;
        class35.field1025 = 0;
        class104.field2588.field314 = arg0;
        class17.field395 = 0;
        class68.field1911 = -1;
        for (int var1 = 0; var1 < class93.field2340.length; var1++) {
            if (class93.field2340[var1] != null) {
                class93.field2340[var1].field696 = -1;
            }
        }
        for (int var2 = 0; var2 < class93.field2334.length; var2++) {
            if (class93.field2334[var2] != null) {
                class93.field2334[var2].field696 = -1;
            }
        }
        class27.method284((byte) -124);
        class85.method769(0, 30);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILwa;I)Lrd;")
    public static final class117 method386(int arg0, class144 arg1, int arg2) {
        field999++;
        if (!class15.method175(class97.method827((byte) 70, arg1), arg2, -3630)) {
            return null;
        }
        if (arg0 != 0) {
            field989 = null;
        }
        if (arg1.field3494 == null || arg2 >= arg1.field3494.length || arg1.field3494[arg2] == null || arg1.field3494[arg2].method976(65).method954(arg0 ^ 0xFFFFFFB6) == 0) {
            return class73.field2037 ? class18.method193(new class117[] { class138.field3320, class142.method1131(arg2, true) }, 99) : null;
        } else {
            return arg1.field3494[arg2];
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Lgd;")
    public static final class46 method387(int arg0, int arg1) {
        field992++;
        class46 var2 = (class46) class86.field2238.method774((long) arg0, 329);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 7455) {
            field989 = null;
        }
        byte[] var3 = class87.field2253.method526((byte) 118, 12, arg0);
        class46 var4 = new class46();
        if (var3 != null) {
            var4.method508(-1, new class14(var3));
        }
        var4.method498(true);
        class86.field2238.method773((long) arg0, (byte) -17, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
    public static void method388(int arg0) {
        field994 = null;
        field984 = null;
        if (arg0 != 1) {
            method389(11, -7);
        }
        field981 = null;
        field977 = null;
        field983 = null;
        field989 = null;
        field987 = null;
        field997 = null;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)V")
    public static final void method389(int arg0, int arg1) {
        field980++;
        if (!class40.method463(-112, arg1)) {
            return;
        }
        class144[] var2 = class77.field2090[arg1];
        if (arg0 != 13147) {
            field989 = null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class144 var4 = var2[var3];
            if (var4 != null) {
                var4.field3540 = 0;
                var4.field3481 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
    public static final void method390(int arg0) {
        for (class120 var1 = (class120) class96.field2397.method3(false); var1 != null; var1 = (class120) class96.field2397.method14(127)) {
            if (var1.field2956 != null) {
                class61.field1702.method881(var1.field2956);
                var1.field2956 = null;
            }
            if (var1.field2952 != null) {
                class61.field1702.method881(var1.field2952);
                var1.field2952 = null;
            }
        }
        class96.field2397.method17((byte) 44);
        if (arg0 == 13503) {
            field978++;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)Z")
    public static final boolean method391(byte arg0, int arg1) {
        field982++;
        if (arg0 <= 115) {
            method384(-17);
        }
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }
}

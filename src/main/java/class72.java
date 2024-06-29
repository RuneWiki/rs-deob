import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class72 {

    @OriginalMember(owner = "client!m", name = "g", descriptor = "[Lu;")
    private class34[] field1320;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Z")
    public static boolean field1318 = false;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Lke;")
    public static class256 field1323 = class316.method2202("::", 27626);

    @OriginalMember(owner = "client!m", name = "b", descriptor = "[I")
    public static int[] field1315 = new int[100];

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field1328 = 64;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Lke;")
    private static class256 field1324 = class316.method2202("Close", 27626);

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Lke;")
    public static class256 field1322 = field1324;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lng;")
    public static class138 field1317;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Lng;")
    public static class138 field1321;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "Lng;")
    public static class138 field1326;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "[Lum;")
    public static class217[] field1316;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "[[[I")
    public static int[][][] field1329;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lla;B)V", line = 12)
    public static final void method546(class188 arg0, byte arg1) {
        field1314++;
        int var2 = arg0.field3357;
        if (var2 == 324) {
            if (class177.field3129 == -1) {
                class167.field2967 = arg0.field3405;
                class177.field3129 = arg0.field3425;
            }
            if (class13.field176.field892) {
                arg0.field3425 = class177.field3129;
            } else {
                arg0.field3425 = class167.field2967;
            }
        } else if (var2 == 325) {
            if (class177.field3129 == -1) {
                class177.field3129 = arg0.field3425;
                class167.field2967 = arg0.field3405;
            }
            if (class13.field176.field892) {
                arg0.field3425 = class167.field2967;
            } else {
                arg0.field3425 = class177.field3129;
            }
        } else if (arg1 > 108) {
            if (var2 == 327) {
                arg0.field3353 = 150;
                arg0.field3313 = (int) (Math.sin((double) class45.field840 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field3434 = 5;
                arg0.field3306 = -1;
            } else if (var2 == 328) {
                if (class121.field2124.field2532 == null) {
                    arg0.field3306 = 0;
                } else {
                    arg0.field3353 = 150;
                    arg0.field3313 = (int) (Math.sin((double) class45.field840 / 40.0D) * 256.0D) & 0x7FF;
                    arg0.field3434 = 5;
                    arg0.field3306 = ((int) class121.field2124.field2532.method1780(true) << 11) + 2047;
                    arg0.field3318 = class121.field2124.field1236;
                    arg0.field3394 = class121.field2124.field1208;
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 96)
    public static void method547(int arg0) {
        field1329 = (int[][][]) null;
        field1321 = null;
        field1324 = null;
        field1317 = null;
        field1326 = null;
        field1315 = null;
        if (arg0 != -13642) {
            method548(110, 123);
        }
        field1316 = null;
        field1322 = null;
        field1323 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V", line = 125)
    public static final void method548(int arg0, int arg1) {
        field1327++;
        int var2 = -119 % ((arg1 + 10) / 55);
        class77 var3 = class156.method1158(6, false, arg0);
        var3.method586((byte) 98);
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(I)V", line = 148)
    public class72(int arg0) {
        this.field1320 = new class34[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class34 var3 = this.field1320[var2] = new class34();
            var3.field543 = var3;
            var3.field529 = var3;
        }
    }
}

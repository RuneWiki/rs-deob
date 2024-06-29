import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class70 extends class60 {

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    public int field1238;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    private int field1240;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "[Z")
    public boolean[] field1235;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "[I")
    public int[] field1237;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "[[I")
    public int[][] field1230;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "Lub;")
    public static class227 field1231 = class257.method1749("mod_icons", 17263);

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "Lub;")
    private static class227 field1232 = class257.method1749("Players", 17263);

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "Lub;")
    public static class227 field1233 = field1232;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "Z")
    public static boolean field1234 = true;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "Lub;")
    private static class227 field1239 = class257.method1749("Free world", 17263);

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "Lub;")
    public static class227 field1242 = class257.method1749("null", 17263);

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "Lub;")
    public static class227 field1229 = field1239;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public static int field1241 = 0;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLub;)V")
    public static final void method427(byte arg0, class227 arg1) {
        if (arg0 != -113) {
            return;
        }
        field1236++;
        if (class78.field1365 >= 2) {
            if (arg1.method1522(class92.field1569, (byte) -56)) {
                class165.method1018(255);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class130.method799(1403, 0, (class227) null, class76.method445((byte) -82, new class227[] { class9.field169, class204.method1303(var4, arg0 ^ 0xFFFFFF8E), class258.field4513 }));
            }
            if (arg1.method1522(class213.field3601, (byte) -56)) {
                class168.method1038(-94);
            }
            if (arg1.method1522(class194.field3299, (byte) -56)) {
                class12.method60(25, 123);
            }
            if (arg1.method1522(class10.field176, (byte) -56)) {
                class99.field1731 = true;
            }
            if (arg1.method1522(class120.field2187, (byte) -56)) {
                class99.field1731 = false;
            }
            if (arg1.method1522(class87.field1509, (byte) -56)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class78.field1370[var5].field2338[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method1529(-8517, class186.field3175) && class169.field2832 != 0) {
                class232.method1562(16640, arg1.method1517((byte) 21, 6).method1497(false));
            }
            if (arg1.method1522(class228.field3982, (byte) -56) && class169.field2832 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method1529(-8517, class43.field711)) {
                class22.field389 = arg1.method1517((byte) 104, 12).method1519(arg0 - 19037).method1497(false);
                class130.method799(1403, 0, (class227) null, class76.method445((byte) -123, new class227[] { class235.field4068, class204.method1303(class22.field389, arg0 + 114) }));
            }
            if (arg1.method1522(class253.field4443, (byte) -56)) {
                class50.field882 = true;
            }
        }
        class160.field2703++;
        class176.field2935.method664((byte) 48, 143);
        class176.field2935.method1443(arg1.method1521((byte) 79) - 1, 0);
        class176.field2935.method1452(arg1.method1517((byte) -98, 2), (byte) -63);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
    public static void method428(boolean arg0) {
        field1232 = null;
        if (arg0) {
            field1232 = null;
        }
        field1231 = null;
        field1239 = null;
        field1242 = null;
        field1233 = null;
        field1229 = null;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I[B)V")
    public class70(int arg0, byte[] arg1) {
        this.field1238 = arg0;
        class226 var3 = new class226(arg1);
        this.field1240 = var3.method1471(255);
        this.field1235 = new boolean[this.field1240];
        this.field1237 = new int[this.field1240];
        this.field1230 = new int[this.field1240][];
        for (int var4 = 0; var4 < this.field1240; var4++) {
            this.field1237[var4] = var3.method1471(255);
        }
        for (int var5 = 0; var5 < this.field1240; var5++) {
            this.field1235[var5] = var3.method1471(255) == 1;
        }
        for (int var6 = 0; var6 < this.field1240; var6++) {
            this.field1230[var6] = new int[var3.method1471(255)];
        }
        for (int var7 = 0; var7 < this.field1240; var7++) {
            for (int var8 = 0; var8 < this.field1230[var7].length; var8++) {
                this.field1230[var7][var8] = var3.method1471(255);
            }
        }
    }
}

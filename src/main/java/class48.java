import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class48 extends class207 {

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "Li;")
    private static class88 field892 = class208.method1425(105, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "[J")
    public static long[] field903 = new long[32];

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "Li;")
    private static class88 field897 = class208.method1425(105, "No reply from loginserver)3");

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field898 = 0;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "Li;")
    private static class88 field900 = class208.method1425(105, "OFF");

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "Li;")
    public static class88 field906 = field897;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public static int field894 = 0;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "[I")
    public static int[] field904 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "Li;")
    public static class88 field902 = field892;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "Li;")
    public static class88 field901 = field900;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "Li;")
    private static class88 field910 = class208.method1425(105, "Malformed login packet)3");

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "Z")
    public static boolean field909 = false;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "Li;")
    public static class88 field896 = field910;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "[[Z")
    public static boolean[][] field893;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "[[[I")
    public static int[][][] field895;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V")
    public static void method365(byte arg0) {
        int var1 = 112 / ((arg0 + 49) / 35);
        field892 = null;
        field902 = null;
        field895 = null;
        field897 = null;
        field896 = null;
        field901 = null;
        field903 = null;
        field906 = null;
        field904 = null;
        field893 = null;
        field910 = null;
        field900 = null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    public static final void method366(int arg0) {
        if (arg0 <= 113) {
            field902 = null;
        }
        field907++;
        class53 var1 = class166.field3190;
        synchronized (class166.field3190) {
            class114.field2070++;
            class203.field3860 = field898;
            if (class32.field524 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class247.field4513[var2] = false;
                }
                class32.field524 = class148.field2803;
            } else {
                while (class32.field524 != class148.field2803) {
                    int var3 = class114.field2061[class148.field2803];
                    class148.field2803 = class148.field2803 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class247.field4513[var3] = true;
                    } else {
                        class247.field4513[~var3] = false;
                    }
                }
            }
            field898 = class191.field3683;
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
    public static final void method367(int arg0) {
        for (int var1 = 0; var1 < class174.field3447; var1++) {
            int var10002 = class8.field116[var1]--;
            if (class8.field116[var1] >= -10) {
                class38 var3 = class237.field4419[var1];
                if (var3 == null) {
                    var3 = class38.method252(class12.field172, class25.field397[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class8.field116[var1] += var3.method251();
                    class237.field4419[var1] = var3;
                }
                if (class8.field116[var1] < 0) {
                    int var4;
                    if (class145.field2728[var1] == 0) {
                        var4 = class119.field2174;
                    } else {
                        int var5 = (class145.field2728[var1] & 0xFF) * 128;
                        int var6 = class145.field2728[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class240.field4458.field4138;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class145.field2728[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - class240.field4458.field4123;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var5 < var10) {
                            class8.field116[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class223.field4213 / var5;
                    }
                    if (var4 > 0) {
                        class213 var11 = var3.method253().method1455(class117.field2126);
                        class162 var12 = class162.method1126(var11, 100, var4);
                        var12.method1121(class110.field2018[var1] - 1);
                        class226.field4250.method1508(var12);
                    }
                    class8.field116[var1] = -100;
                }
            } else {
                class174.field3447--;
                for (int var2 = var1; var2 < class174.field3447; var2++) {
                    class25.field397[var2] = class25.field397[var2 + 1];
                    class237.field4419[var2] = class237.field4419[var2 + 1];
                    class110.field2018[var2] = class110.field2018[var2 + 1];
                    class8.field116[var2] = class8.field116[var2 + 1];
                    class145.field2728[var2] = class145.field2728[var2 + 1];
                }
                var1--;
            }
        }
        if (class110.field2014 && !class102.method709(100)) {
            if (class65.field1183 != 0 && class2.field25 != -1) {
                class53.method388(0, class99.field1816, (byte) -105, false, class2.field25, class65.field1183);
            }
            class110.field2014 = false;
        } else if (class65.field1183 != 0 && class2.field25 != -1 && !class102.method709(100)) {
            class131.field2451++;
            class146.field2749.method30((byte) -33, 133);
            class146.field2749.method338(2112555600, class2.field25);
            class2.field25 = -1;
        }
        if (arg0 != 11449) {
            method366(109);
        }
        field908++;
    }
}

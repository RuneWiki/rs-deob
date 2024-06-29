import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class16 {

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Li;")
    private static class88 field238 = class208.method1425(105, "Too many connections from your address)3");

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Li;")
    public static class88 field241 = class208.method1425(105, "<col=ffffff>");

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Li;")
    public static class88 field243 = field238;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "[[I")
    public static int[][] field247 = new int[5][5000];

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Li;")
    private static class88 field240 = class208.method1425(105, "Enter your username (V password)3");

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Li;")
    public static class88 field246 = class208.method1425(105, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "[[I")
    public static int[][] field248 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Li;")
    public static class88 field242 = field240;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static void method77(byte arg0) {
        field246 = null;
        field238 = null;
        field248 = null;
        field243 = null;
        field240 = null;
        field242 = null;
        field247 = null;
        field241 = null;
        if (arg0 != 77) {
            method79((byte) 86);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILq;)V")
    public static final void method78(int arg0, class174 arg1) {
        field244++;
        int var2 = arg1.field3441;
        if (var2 == 324) {
            if (class55.field1033 == -1) {
                class166.field3194 = arg1.field3435;
                class55.field1033 = arg1.field3475;
            }
            if (class130.field2443.field3959) {
                arg1.field3475 = class55.field1033;
            } else {
                arg1.field3475 = class166.field3194;
            }
        } else if (var2 == 325) {
            if (class55.field1033 == -1) {
                class166.field3194 = arg1.field3435;
                class55.field1033 = arg1.field3475;
            }
            if (class130.field2443.field3959) {
                arg1.field3475 = class166.field3194;
            } else {
                arg1.field3475 = class55.field1033;
            }
        } else {
            if (arg0 != 6479) {
                field243 = null;
            }
            if (var2 == 327) {
                arg1.field3457 = 150;
                arg1.field3511 = (int) (Math.sin((double) class117.field2115 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3411 = -1;
                arg1.field3432 = 5;
            } else if (var2 == 328) {
                if (class240.field4458.field766 == null) {
                    arg1.field3411 = 0;
                } else {
                    arg1.field3457 = 150;
                    arg1.field3511 = (int) (Math.sin((double) class117.field2115 / 40.0D) * 256.0D) & 0x7FF;
                    arg1.field3432 = 5;
                    arg1.field3411 = ((int) class240.field4458.field766.method630(false) << 11) + 2047;
                    arg1.field3406 = class240.field4458.field4108;
                    arg1.field3381 = class240.field4458.field4129;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
    public static final void method79(byte arg0) {
        int var1 = class230.field4314.method28(8, -315);
        if (var1 < class55.field1027) {
            for (int var2 = var1; var2 < class55.field1027; var2++) {
                class53.field999[class223.field4198++] = class174.field3430[var2];
            }
        }
        field237++;
        int var3 = -38 / ((arg0 - 14) / 36);
        if (var1 > class55.field1027) {
            throw new RuntimeException("gppov1");
        }
        class55.field1027 = 0;
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class174.field3430[var4];
            class44 var6 = class244.field4493[var5];
            int var7 = class230.field4314.method28(1, -315);
            if (var7 == 0) {
                class174.field3430[class55.field1027++] = var5;
                var6.field4083 = class117.field2115;
            } else {
                int var8 = class230.field4314.method28(2, -315);
                if (var8 == 0) {
                    class174.field3430[class55.field1027++] = var5;
                    var6.field4083 = class117.field2115;
                    class139.field2581[class192.field3704++] = var5;
                } else if (var8 == 1) {
                    class174.field3430[class55.field1027++] = var5;
                    var6.field4083 = class117.field2115;
                    int var9 = class230.field4314.method28(3, -315);
                    var6.method1478((byte) 127, false, var9);
                    int var10 = class230.field4314.method28(1, -315);
                    if (var10 == 1) {
                        class139.field2581[class192.field3704++] = var5;
                    }
                } else if (var8 == 2) {
                    class174.field3430[class55.field1027++] = var5;
                    var6.field4083 = class117.field2115;
                    int var11 = class230.field4314.method28(3, -315);
                    var6.method1478((byte) 127, true, var11);
                    int var12 = class230.field4314.method28(3, -315);
                    var6.method1478((byte) 127, true, var12);
                    int var13 = class230.field4314.method28(1, -315);
                    if (var13 == 1) {
                        class139.field2581[class192.field3704++] = var5;
                    }
                } else if (var8 == 3) {
                    class53.field999[class223.field4198++] = var5;
                }
            }
        }
    }
}

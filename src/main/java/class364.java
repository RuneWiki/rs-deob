import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class364 {

    @OriginalMember(owner = "client!op", name = "a", descriptor = "[Lwe;")
    public static class26[] field5260 = new class26[32768];

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field5263;

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
    public class364() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)V")
    public static final void method2315(int arg0, byte arg1) {
        class267.field3968 = arg0;
        field5261++;
        class109.field1482.method2313(95);
        if (arg1 <= 4) {
            field5260 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V")
    public static final void method2316(int arg0, int arg1) {
        if (arg1 == 10) {
            field5264++;
            class401.field5795.method2300(arg0, true);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
    public static void method2317(byte arg0) {
        field5260 = null;
        if (arg0 < 70) {
            field5260 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZIZII)V")
    public static final void method2318(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field5265++;
        if (!arg0 && class92.field1147 == arg3 && class135.field1854 == arg4 && class423.field6117 == class276.field4085 || class163.method1082((byte) 95)) {
            return;
        }
        class92.field1147 = arg3;
        class135.field1854 = arg4;
        class276.field4085 = class423.field6117;
        if (class163.method1082((byte) 95)) {
            class276.field4085 = 0;
        }
        if (arg2) {
            client.method1796(28, 120);
        } else {
            client.method1796(25, arg1 + 107);
        }
        class76.method536(true, class196.field2755.method2543(false, class153.field2073), false, class13.field215);
        int var5 = class28.field399;
        class28.field399 = (class92.field1147 - (class195.field2745 >> 4)) * 8;
        int var6 = class134.field1846;
        class134.field1846 = (class135.field1854 - (class78.field984 >> 4)) * 8;
        class272.field4020 = class66.method480(class92.field1147 * 8, class135.field1854 * 8);
        class339.field5003 = null;
        int var7 = class28.field399 - var5;
        int var8 = class134.field1846 - var6;
        if (arg1 != 10) {
            field5260 = null;
        }
        if (arg2) {
            class14.field231 = 0;
            int var9 = (class195.field2745 - 1) * 128;
            int var10 = class78.field984 * 128 - 128;
            for (int var11 = 0; var11 < 32768; var11++) {
                class26 var12 = field5260[var11];
                if (var12 != null) {
                    var12.field4954 -= var7 * 128;
                    var12.field4951 -= var8 * 128;
                    if (var12.field4954 >= 0 && var12.field4954 <= var9 && var12.field4951 >= 0 && var10 >= var12.field4951) {
                        boolean var13 = true;
                        for (int var14 = 0; var14 < 10; var14++) {
                            var12.field793[var14] -= var7;
                            var12.field784[var14] -= var8;
                            if (var12.field793[var14] < 0 || var12.field793[var14] >= class195.field2745 || var12.field784[var14] < 0 || var12.field784[var14] >= class78.field984) {
                                var13 = false;
                            }
                        }
                        if (var13) {
                            class301.field4380[class14.field231++] = var11;
                        } else {
                            field5260[var11].method273((class327) null, arg1 ^ 0xFFFF94F1);
                            field5260[var11] = null;
                        }
                    } else {
                        field5260[var11].method273((class327) null, -27397);
                        field5260[var11] = null;
                    }
                }
            }
        } else {
            for (int var15 = 0; var15 < 32768; var15++) {
                class26 var20 = field5260[var15];
                if (var20 != null) {
                    for (int var21 = 0; var21 < 10; var21++) {
                        var20.field793[var21] -= var7;
                        var20.field784[var21] -= var8;
                    }
                    var20.field4954 -= var7 * 128;
                    var20.field4951 -= var8 * 128;
                }
            }
        }
        for (int var16 = 0; var16 < 2048; var16++) {
            class380 var18 = class455.field6731[var16];
            if (var18 != null) {
                for (int var19 = 0; var19 < 10; var19++) {
                    var18.field793[var19] -= var7;
                    var18.field784[var19] -= var8;
                }
                var18.field4951 -= var8 * 128;
                var18.field4954 -= var7 * 128;
            }
        }
        class388.method2449(false, var7, var8);
        for (class265 var17 = (class265) class276.field4087.method2478(1603); var17 != null; var17 = (class265) class276.field4087.method2486((byte) -82)) {
            var17.field3937 -= var7;
            var17.field3915 -= var8;
            if (var17.field3937 < 0 || var17.field3915 < 0 || var17.field3937 >= class195.field2745 || var17.field3915 >= class78.field984) {
                var17.method1820(-25246);
            }
        }
        class32.field447 = 0;
        if (class36.field516 != 0) {
            class36.field516 -= var7;
            class247.field3647 -= var8;
        }
        if (arg2) {
            class298.field4343 -= var7 * 128;
            class2.field27 -= var7;
            class93.field1159 -= var7;
            class345.field5077 -= var8 * 128;
            class32.field444 -= var8;
            class86.field1064 -= var8;
            if (Math.abs(var7) > class195.field2745 || Math.abs(var8) > class78.field984) {
                class365.method2329(-34);
            }
        } else if (class28.field402 == 4) {
            class152.field2056 -= var7 * 128;
            class171.field2236 -= var8 * 128;
            class188.field2629 -= var8 * 128;
            class108.field1463 -= var7 * 128;
        } else {
            class28.field402 = 1;
        }
        class359.method2282(119);
        class83.method554(-113);
        class189.field2650.method2477(arg1 ^ 0xFFFFC879);
        class26.field383.method2477(-14221);
        class134.field1839.method2021(-16777216);
        class187.method1277(0);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILat;[B)V")
    public final void method2319(int arg0, class256 arg1, byte[] arg2) {
        field5266++;
        if (~arg1.field3764[arg1.field3762] != arg0 || arg1.field3764[arg1.field3762 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field5263 == null) {
            this.field5263 = new Inflater(true);
        }
        try {
            this.field5263.setInput(arg1.field3764, arg1.field3762 + 10, arg1.field3764.length + -8 + -arg1.field3762 + -10);
            this.field5263.inflate(arg2);
        } catch (Exception var4) {
            this.field5263.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field5263.reset();
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(III)V")
    private class364(int arg0, int arg1, int arg2) {
    }
}

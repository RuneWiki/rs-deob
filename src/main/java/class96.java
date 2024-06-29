import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class96 {

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field1484 = 100;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field1491 = new String[500];

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field1480 = 0;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "[I")
    public static int[] field1494 = new int[32];

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public int field1477;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public int field1493;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "Ldl;")
    public static class123 field1492;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "[Lhc;")
    public static class229[] field1483;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)Z")
    public final boolean method636(byte arg0) {
        if (arg0 < 114) {
            return false;
        } else {
            field1489++;
            return (this.field1493 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)Z")
    public final boolean method637(byte arg0) {
        field1479++;
        int var2 = -59 / ((arg0 + 2) / 60);
        return (this.field1493 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)Z")
    public final boolean method638(int arg0) {
        if (arg0 <= 33) {
            this.field1493 = 125;
        }
        field1474++;
        return (this.field1493 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(B)V")
    public static void method639(byte arg0) {
        field1492 = null;
        field1491 = null;
        if (arg0 < -30) {
            field1483 = null;
            field1494 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ldl;Ldl;Ldl;B)V")
    public static final void method640(class123 arg0, class123 arg1, class123 arg2, byte arg3) {
        if (arg3 != 24) {
            method645(94, 69, 48, 4, 113, 44, 101, 103, -97, -126);
        }
        class207.field3223 = arg2;
        field1481++;
        class276.field4392 = arg1;
        class239.field3824 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public static final void method641(int arg0) {
        if (arg0 != 0) {
            method643(-95);
        }
        field1482++;
        class105.field1620.method1430(-1);
        class28.field384.method1430(arg0 - 1);
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)Z")
    public final boolean method642(int arg0) {
        field1475++;
        if (arg0 == 21649) {
            return (this.field1493 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
    public static final void method643(int arg0) {
        class135.field1965.method1164(32623);
        class189.field2985 = arg0;
        field1485++;
        class63.field887 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method644(String arg0, int arg1) {
        field1486++;
        if (class280.field4438 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class131.method896(false);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class106.method693((String) null, 0, "mem=" + var4 + "k", (byte) -66);
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class131.method896(false);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class106.method693((String) null, 0, "Memory before cleanup=" + var7 + "k", (byte) 116);
                class91.method610(16975);
                class131.method896(false);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class106.method693((String) null, 0, "Memory after cleanup=" + var9 + "k", (byte) -114);
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class106.method693((String) null, 0, "Number of player models in cache:" + class258.method1772(1400618188), (byte) -78);
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class103.method681((byte) -107);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class68.field958.method1551(-113);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class68.field958.method1545((byte) 56);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class2.field23.method139(7931);
                class240.field3833.method1844((byte) 76);
                class68.field958.method1549(-103);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class82.field1199 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class245.method1650(25, (byte) -121);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class248.field3966 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class248.field3966 = false;
            }
            if (arg0.equalsIgnoreCase("::noclip")) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class290.field4574[var10].field1125[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg0.startsWith("::setparticles")) {
                class217.method1469(class243.method1640((byte) 81, arg0.substring(15)));
                class7.method45(255, class2.field23);
                class21.field256 = false;
            }
            if (arg0.startsWith("::fps ") && class184.field2892 != 0) {
                class13.method95(class243.method1640((byte) 99, arg0.substring(6)), (byte) 124);
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class4.field56 = class243.method1640((byte) 100, arg0.substring(12).trim());
                class106.method693((String) null, 0, "rect_debug=" + class4.field56, (byte) 95);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class22.field270 = true;
            }
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class200.field3132) {
                    class200.field3132 = false;
                    class106.method693((String) null, 0, "Forced tweening disabled.", (byte) -94);
                } else {
                    class200.field3132 = true;
                    class106.method693((String) null, 0, "Forced tweening ENABLED!", (byte) -88);
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class129.field1890) {
                    System.out.println("Shift-click disabled.");
                    class129.field1890 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class129.field1890 = true;
                }
            }
        }
        int var13 = 76 % ((-arg1 - 5) / 63);
        class13.field165.method892(8, (byte) -119);
        class13.field165.method184(arg0.length() - 1, 105);
        class13.field165.method199(0, arg0.substring(2));
        class92.field1418++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1488++;
        class83 var10 = (class83) class272.field4323.method350(8240);
        class83 var11 = null;
        while (var10 != null) {
            if (var10.field1309 == arg4 && var10.field1298 == arg8 && var10.field1310 == arg5 && var10.field1299 == arg6) {
                var11 = var10;
                break;
            }
            var10 = (class83) class272.field4323.method353((byte) -120);
        }
        if (var11 == null) {
            var11 = new class83();
            var11.field1299 = arg6;
            var11.field1298 = arg8;
            var11.field1310 = arg5;
            var11.field1309 = arg4;
            class62.method433(true, var11);
            class272.field4323.method349(var11, true);
        }
        var11.field1303 = arg3;
        var11.field1296 = arg9;
        var11.field1305 = arg2;
        var11.field1308 = arg0;
        if (arg7 != 0) {
            method641(-128);
        }
        var11.field1302 = arg1;
    }
}

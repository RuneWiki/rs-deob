import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class6 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Lmq;")
    private class104 field112 = new class104(64);

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Lfc;")
    private class343 field115;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Lfn;")
    public static class52 field116 = new class52(73, 0);

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 4)
    public static final void method79(int arg0) {
        class425.field5846 = arg0;
        for (int var1 = 0; var1 < class456.field6299; var1++) {
            for (int var2 = 0; var2 < class205.field2946; var2++) {
                if (class455.field6293[arg0][var1][var2] == null) {
                    class455.field6293[arg0][var1][var2] = new class406(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V", line = 26)
    public static void method80(int arg0) {
        if (arg0 != 4) {
            method80(90);
        }
        field116 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)Lkf;", line = 40)
    public final class340 method81(byte arg0, int arg1) {
        field113++;
        class104 var3 = this.field112;
        class340 var4;
        synchronized (this.field112) {
            var4 = (class340) this.field112.method659((long) arg1, (byte) -1);
            if (arg0 != 111) {
                this.field115 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field115.method2029(5, arg1, 0);
        class340 var6 = new class340();
        if (var5 != null) {
            var6.method2015(-25, new class425(var5));
        }
        class104 var7 = this.field112;
        synchronized (this.field112) {
            this.field112.method653(arg0 - 65, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lkm;I)V", line = 80)
    public static final void method82(class487 arg0, int arg1) {
        field114++;
        if (!(arg1 <= class161.field2310 || class184.field2678) || class146.field2070 != null) {
            return;
        }
        String var2;
        if (class184.field2678 && class161.field2310 < 2) {
            var2 = class238.field3363 + class182.field2651.method695(-122, class487.field6867) + class357.field4981 + " ->";
        } else if (class228.field3215 && class194.field2757.method531(81, arg1 ^ 0x6E) && class161.field2310 > 2) {
            var2 = class239.method1500(82, (class106) class250.field3514.field3504.field2609.field2609);
        } else {
            class106 var3 = (class106) class250.field3514.field3504.field2609;
            var2 = class239.method1500(-99, var3);
            int[] var4 = null;
            if (class290.method1786((byte) 51, var3.field1517)) {
                var4 = class58.field918.method344((int) var3.field1515, 31757).field2409;
            } else if (var3.field1524 != -1) {
                var4 = class58.field918.method344(var3.field1524, 31757).field2409;
            } else if (class43.method355(5, var3.field1517)) {
                class196 var7 = class256.field3581[(int) var3.field1515];
                if (var7 != null) {
                    class127 var8 = var7.field2789;
                    if (var8.field1780 != null) {
                        var8 = var8.method767(class320.field4376, (byte) 48);
                    }
                    if (var8 != null) {
                        var4 = var8.field1802;
                    }
                }
            } else if (class103.method649(var3.field1517, (byte) -83)) {
                Object var5 = null;
                class475 var6;
                if (var3.field1517 == 1007) {
                    var6 = class304.field4160.method2075((int) var3.field1515, false);
                } else {
                    var6 = class304.field4160.method2075((int) (var3.field1515 >>> 32 & 0x7FFFFFFFL), false);
                }
                if (var6.field6690 != null) {
                    var6 = var6.method2797(class320.field4376, -126);
                }
                if (var6 != null) {
                    var4 = var6.field6676;
                }
            }
            if (var4 != null) {
                var2 = var2 + class318.method1922(0, var4);
            }
        }
        if (class161.field2310 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class161.field2310 - 2) + class410.field5692.method695(arg1 - 116, class487.field6867);
        }
        if (class280.field3854 != null) {
            class485 var9 = class280.field3854.method2205(26666, arg0);
            if (var9 == null) {
                var9 = class211.field2981;
            }
            var9.method2848(class280.field3854.field5082, class224.field3184, class383.field5439, class280.field3854.field5095, class294.field4065, (byte) 64, class280.field3854.field5101, class227.field3205, class280.field3854.field5200, class280.field3854.field5131, class306.field4194, var2, class280.field3854.field5059, class167.field2458, class232.field3275);
            class189.method1222(class232.field3275[3], class232.field3275[0], -10584, class232.field3275[1], class232.field3275[2]);
        } else if (class200.field2879 != null && class305.field4173 == class172.field2553) {
            int var10 = class211.field2981.method2855(16777215, class41.field684 + 4, 0, class389.field5485 + 16, class224.field3184, class294.field4065, class167.field2458, var2, class227.field3205, -1);
            class189.method1222(16, class41.field684 + 4, -10584, class389.field5485, class328.field4531.method522(arg1 ^ 0x2, var2) + var10);
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ldk;ILfc;)V", line = 182)
    public class6(class328 arg0, int arg1, class343 arg2) {
        this.field115 = arg2;
        this.field115.method2054(0, 5);
    }
}

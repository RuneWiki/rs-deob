import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class523 {

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "Z")
    public boolean field7651 = false;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "[I")
    public static int[] field7657 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "[I")
    public static int[] field7658 = new int[5];

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    public int field7660;

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!mv", name = "n", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!mv", name = "p", descriptor = "I")
    public int field7666;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "Lvr;")
    public static class187 field7659;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "Lhb;")
    public class251 field7656;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "Z")
    public static boolean field7655;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)[Lrb;")
    public static final class283[] method3105(int arg0) {
        field7652++;
        return arg0 == 2 ? new class283[] { class237.field3281, class419.field6067, class133.field2030, class426.field6202, class444.field6540, class264.field3544, class92.field1513, class86.field1403, class211.field3005, class249.field3396, class212.field3022, class180.field2678, class384.field5518, class534.field7866, class265.field3569, class504.field7371, class485.field6976, class10.field119, class358.field5150, class201.field2919, class92.field1511, class54.field779, class312.field4237, class100.field1593, class535.field7873, class520.field7636, class146.field2209, class16.field251, class163.field2440, class411.field5853, class27.field399, class5.field74, class140.field2094, class42.field618, class439.field6323, class50.field727, class117.field1843, class363.field5224, class316.field4294, class382.field5485, class441.field6362, class407.field5771, class104.field1712, class521.field7646, class427.field6206, class122.field1898, class128.field1974, class326.field4460, class54.field764, class520.field7639, class444.field6494, class373.field5355, class515.field7539, class265.field3568, class222.field3140, class196.field2879, class323.field4428, class515.field7536, class519.field7635, class32.field482, class264.field3551, class397.field5707, class502.field7341, class100.field1570, class94.field1527, class342.field4948, class487.field7051, class425.field6190, class141.field2105, class458.field6667, class366.field5255, class369.field5281, class339.field4918, class181.field2684, class40.field599, class266.field3578, class109.field1773, class53.field763, class125.field1942, class449.field6576, class251.field3429, class39.field589, class516.field7566, class134.field2048, class104.field1713, class403.field5759, class428.field6220, class451.field6611, class153.field2349, class149.field2299, class420.field6077, class457.field6663, class322.field4420, class166.field2547, class346.field4982, class390.field5626, class163.field2477, class186.field2751, class191.field2798, class311.field4226, class508.field7416, class412.field5873, class467.field6746, class224.field3169, class66.field952, class92.field1505, class24.field330, class224.field3168, class384.field5511, class503.field7361, class274.field3719, class414.field5905, class233.field3244 } : null;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)V")
    public static void method3106(boolean arg0) {
        field7658 = null;
        field7659 = null;
        field7657 = null;
        if (!arg0) {
            field7659 = null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)Lbi;")
    public static final class385 method3107(int arg0, int arg1) {
        field7661++;
        class385 var2 = (class385) class232.field3235.method2767((long) arg1, arg0 - 23244);
        if (var2 != null) {
            return var2;
        } else if (arg0 == 23244) {
            byte[] var3 = class161.field2436.method2512(0, (byte) -93, arg1);
            class385 var4 = new class385();
            if (var3 != null) {
                var4.method2282(arg1, arg0 - 23363, new class319(var3));
            }
            class232.field3235.method2777(-1025, var4, (long) arg1);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZIZ)I")
    public static final int method3108(boolean arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method3105(-96);
        }
        field7663++;
        if (arg0) {
            return 0;
        }
        class412 var3 = class379.method2261(3597, arg0, arg1);
        if (var3 == null) {
            return class486.field6993.method121(arg1, (byte) -43).field3573;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field5865.length; var5++) {
            if (var3.field5865[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class486.field6993.method121(arg1, (byte) -88).field3573 - var3.field5865.length);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BI)Z")
    public static final boolean method3109(byte arg0, int arg1) {
        field7653++;
        if (class210.field3004[arg1]) {
            return true;
        }
        if (arg0 != -65) {
            field7658 = null;
        }
        if (!class41.field614.method2489(arg1, (byte) 119)) {
            return false;
        }
        int var2 = class41.field614.method2509(0, arg1);
        if (var2 == 0) {
            class210.field3004[arg1] = true;
            return true;
        }
        if (class505.field7387[arg1] == null) {
            class505.field7387[arg1] = new class444[var2];
        }
        for (int var3 = 0; var3 < var2; var3++) {
            if (class505.field7387[arg1][var3] == null) {
                byte[] var4 = class41.field614.method2512(arg1, (byte) -93, var3);
                if (var4 != null) {
                    class444 var5 = class505.field7387[arg1][var3] = new class444();
                    var5.field6469 = (arg1 << 16) + var3;
                    if (var4[0] != -1) {
                        throw new IllegalStateException("if1");
                    }
                    var5.method2624(128, new class319(var4));
                }
            }
        }
        class210.field3004[arg1] = true;
        return true;
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)Z")
    public final boolean method3110(int arg0) {
        if (arg0 != -20447) {
            field7655 = true;
        }
        field7654++;
        return this.field7656.field3431.method2517(this.field7666, (byte) -42);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IILsv;)V")
    private final void method3111(int arg0, int arg1, class319 arg2) {
        field7664++;
        if (arg1 != 2) {
            this.field7656 = null;
        }
        if (arg0 == 1) {
            this.field7666 = arg2.method1844(arg1 - 104);
        } else if (arg0 == 2) {
            this.field7660 = arg2.method1852(arg1 ^ 0x40BF532A);
        } else if (arg0 == 3) {
            this.field7651 = true;
            return;
        } else if (arg0 == 4) {
            this.field7666 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZBLza;)Lo;")
    public final class359 method3112(int arg0, boolean arg1, byte arg2, class295 arg3) {
        field7662++;
        long var5 = (long) (arg3.field3976 << 19 | arg0 << 16 | this.field7666 | (arg1 ? 262144 : 0));
        if (arg2 != 83) {
            return null;
        }
        class359 var7 = (class359) this.field7656.field3438.method2767(var5, 0);
        if (var7 != null) {
            return var7;
        } else if (this.field7656.field3431.method2517(this.field7666, (byte) -59)) {
            class396 var8 = class396.method2353(this.field7656.field3431, this.field7666, 0);
            if (var8 != null) {
                var8.field5701 = var8.field5694 = var8.field5697 = var8.field5699 = 0;
                if (arg1) {
                    var8.method2345();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method2342();
                }
            }
            class359 var10 = arg3.method555(var8, true);
            if (var10 != null) {
                this.field7656.field3438.method2777(-1025, var10, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lsv;B)V")
    public final void method3113(class319 arg0, byte arg1) {
        if (arg1 > -85) {
            field7659 = null;
        }
        field7665++;
        while (true) {
            int var3 = arg0.method1869(-97);
            if (var3 == 0) {
                return;
            }
            this.method3111(var3, 2, arg0);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class198 extends class199 {

    @OriginalMember(owner = "client!fi", name = "ib", descriptor = "I")
    private int field2783 = -1;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "[I")
    public static int[] field2770 = new int[128];

    @OriginalMember(owner = "client!fi", name = "hb", descriptor = "[I")
    public static int[] field2782 = new int[64];

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    private int field2769;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!fi", name = "cb", descriptor = "I")
    private int field2777;

    @OriginalMember(owner = "client!fi", name = "db", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!fi", name = "eb", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!fi", name = "gb", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!fi", name = "jb", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!fi", name = "fb", descriptor = "[I")
    private int[] field2780;

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V", line = 8)
    public class198() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([SB)[S", line = 12)
    public static final short[] method1448(short[] arg0, byte arg1) {
        field2775++;
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class87.method633(arg0, 0, var2, 0, arg0.length);
            int var3 = 70 / ((arg1 - 81) / 38);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)I", line = 31)
    public static final int method1449(int arg0, int arg1) {
        if (arg1 != 16711680) {
            field2782 = (int[]) null;
        }
        field2779++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V", line = 42)
    public static void method1450(int arg0) {
        field2770 = null;
        if (arg0 == 23086) {
            field2782 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)[[I", line = 57)
    public final int[][] method215(int arg0, int arg1) {
        field2774++;
        int[][] var3 = this.field2796.method2187(arg0, -76);
        if (this.field2796.field4667 && this.method1451(187)) {
            int var4 = this.field2769 * (class224.field3233 == this.field2777 ? arg0 : this.field2777 * arg0 / class224.field3233);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            if (class95.field1235 == this.field2769) {
                for (int var8 = 0; var8 < class95.field1235; var8++) {
                    int var9 = this.field2780[var4++];
                    var6[var8] = class335.method2339(var9 << 4, 4080);
                    var7[var8] = class335.method2339(65280, var9) >> 4;
                    var5[var8] = class335.method2339(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class95.field1235; var10++) {
                    int var11 = this.field2769 * var10 / class95.field1235;
                    int var12 = this.field2780[var4 + var11];
                    var6[var10] = class335.method2339(var12, 255) << 4;
                    var7[var10] = class335.method2339(var12, 65280) >> 4;
                    var5[var10] = class335.method2339(var12 >> 12, 4080);
                }
            }
        }
        if (arg1 != -29869) {
            method1457((class333) null, 79);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)Z", line = 122)
    private final boolean method1451(int arg0) {
        if (arg0 != 187) {
            return true;
        }
        field2767++;
        if (this.field2780 != null) {
            return true;
        } else if (this.field2783 >= 0) {
            int var2 = class224.field3233;
            int var3 = class95.field1235;
            int var4 = class83.field1067.method1618(this.field2783, (byte) -48).field106 ? 64 : 128;
            this.field2780 = class83.field1067.method1612(var4, 1.0F, this.field2783, var4, arg0 ^ 0xFFFFFF39, false);
            this.field2777 = var4;
            this.field2769 = var4;
            class271.method1849(var3, var2, false);
            return this.field2780 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(BI)Lqg;", line = 156)
    public static final class23 method1452(byte arg0, int arg1) {
        field2773++;
        class23 var2 = (class23) class172.field2376.method2265((long) arg1, (byte) -103);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 1) {
            field2782 = (int[]) null;
        }
        byte[] var3 = class360.field5629.method1089(34, (byte) 125, arg1);
        class23 var4 = new class23();
        if (var3 != null) {
            var4.method157(arg1, false, new class299(var3));
        }
        class172.field2376.method2257(-126, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lwf;IIB)V", line = 180)
    public static final void method1453(class333 arg0, int arg1, int arg2, byte arg3) {
        field2772++;
        if (class33.field410 != null || class159.field2263 || arg0 == null || method1457(arg0, 26) == null) {
            return;
        }
        class33.field410 = arg0;
        class100.field1311 = method1457(arg0, 26);
        class106.field1377 = false;
        if (arg3 <= 47) {
            field2782 = (int[]) null;
        }
        class133.field1809 = 0;
        class160.field2290 = arg1;
        client.field1638 = arg2;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLfd;I)V", line = 205)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2783 = arg1.method2083((byte) -74);
        }
        if (arg0 != -43) {
            this.field2777 = 99;
        }
        field2771++;
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V", line = 221)
    public final void method1454(int arg0) {
        field2776++;
        super.method1454(arg0);
        this.field2780 = null;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)I", line = 230)
    public final int method1455(byte arg0) {
        if (arg0 >= -26) {
            return -93;
        } else {
            field2781++;
            return this.field2783;
        }
    }

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "(I)V", line = 243)
    public static final void method1456(int arg0) {
        if (arg0 != 24739) {
            return;
        }
        field2768++;
        if (class69.field885.toLowerCase().indexOf("microsoft") != -1) {
            class296.field4295[188] = 71;
            class296.field4295[223] = 28;
            class296.field4295[219] = 42;
            class296.field4295[192] = 58;
            class296.field4295[221] = 43;
            class296.field4295[190] = 72;
            class296.field4295[189] = 26;
            class296.field4295[222] = 59;
            class296.field4295[186] = 57;
            class296.field4295[220] = 74;
            class296.field4295[187] = 27;
            class296.field4295[191] = 73;
            return;
        }
        class296.field4295[61] = 27;
        class296.field4295[46] = 72;
        if (class69.field890 == null) {
            class296.field4295[192] = 58;
            class296.field4295[222] = 59;
        } else {
            class296.field4295[520] = 59;
            class296.field4295[192] = 28;
            class296.field4295[222] = 58;
        }
        class296.field4295[92] = 74;
        class296.field4295[91] = 42;
        class296.field4295[93] = 43;
        class296.field4295[45] = 26;
        class296.field4295[44] = 71;
        class296.field4295[47] = 73;
        class296.field4295[59] = 57;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lwf;I)Lwf;", line = 299)
    private static final class333 method1457(class333 arg0, int arg1) {
        class333 var2 = client.method896(arg0);
        if (arg1 != 26) {
            field2770 = (int[]) null;
        }
        field2778++;
        if (var2 == null) {
            var2 = arg0.field5038;
        }
        return var2;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class268 extends class23 {

    @OriginalMember(owner = "client!re", name = "pb", descriptor = "I")
    private int field4475 = -1;

    @OriginalMember(owner = "client!re", name = "gb", descriptor = "[I")
    public static int[] field4466 = new int[200];

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "Lqd;")
    public static class40 field4459 = class147.method1106("blinken2:", (byte) -98);

    @OriginalMember(owner = "client!re", name = "hb", descriptor = "Lqd;")
    public static class40 field4467 = class147.method1106(")1a2)1m", (byte) -98);

    @OriginalMember(owner = "client!re", name = "lb", descriptor = "Lqd;")
    public static class40 field4471 = class147.method1106("::cardmem", (byte) -128);

    @OriginalMember(owner = "client!re", name = "qb", descriptor = "I")
    public static int field4476 = 0;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!re", name = "db", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!re", name = "fb", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!re", name = "ib", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!re", name = "jb", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!re", name = "kb", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!re", name = "mb", descriptor = "I")
    private int field4472;

    @OriginalMember(owner = "client!re", name = "nb", descriptor = "I")
    private int field4473;

    @OriginalMember(owner = "client!re", name = "ob", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "[I")
    private int[] field4464;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)[[I", line = 15)
    public final int[][] method17(int arg0, int arg1) {
        if (arg0 <= 30) {
            this.method23(-99, -119, (class26) null);
        }
        field4468++;
        int[][] var3 = this.field417.method1251(arg1, 126);
        if (this.field417.field2751 && this.method1866((byte) 112)) {
            int var4 = (class271.field4497 == this.field4472 ? arg1 : this.field4472 * arg1 / class271.field4497) * this.field4473;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class52.field1007 == this.field4473) {
                for (int var11 = 0; var11 < class52.field1007; var11++) {
                    int var12 = this.field4464[var4++];
                    var7[var11] = class276.method1923(255, var12) << 4;
                    var6[var11] = class276.method1923(var12, 65280) >> 4;
                    var5[var11] = class276.method1923(4080, var12 >> 12);
                }
            } else {
                for (int var8 = 0; var8 < class52.field1007; var8++) {
                    int var9 = this.field4473 * var8 / class52.field1007;
                    int var10 = this.field4464[var4 + var9];
                    var7[var8] = class276.method1923(var10, 255) << 4;
                    var6[var8] = class276.method1923(var10, 65280) >> 4;
                    var5[var8] = class276.method1923(16711680, var10) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)V", line = 88)
    public static void method1863(boolean arg0) {
        field4471 = null;
        if (!arg0) {
            field4476 = -121;
        }
        field4467 = null;
        field4459 = null;
        field4466 = null;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)I", line = 109)
    public final int method170(int arg0) {
        field4458++;
        if (arg0 > -54) {
            this.method1866((byte) -74);
        }
        return this.field4475;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZZ)V", line = 122)
    public static final void method1864(boolean arg0, boolean arg1) {
        byte[][] var2;
        byte var3;
        if (class21.field350 && arg0) {
            var2 = class109.field1903;
            var3 = 1;
        } else {
            var2 = class139.field2355;
            var3 = 4;
        }
        if (arg1) {
            method1865((class239) null, true);
        }
        field4463++;
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = (class5.field70[var5] & 0xFF) * 64 - class263.field4407;
            int var7 = (class5.field70[var5] >> 8) * 64 - class196.field3152;
            byte[] var8 = var2[var5];
            if (var8 != null) {
                class194.method1385(4);
                class303.method2065(class159.field2662 * 8 - 48, var7, var8, (byte) 21, class255.field4247, var6, (class78.field1319 - 6) * 8, arg0);
            }
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = (class5.field70[var9] >> 8) * 64 - class196.field3152;
            int var11 = (class5.field70[var9] & 0xFF) * 64 - class263.field4407;
            byte[] var12 = var2[var9];
            if (var12 == null && class159.field2662 < 800) {
                class194.method1385(4);
                for (int var13 = 0; var13 < var3; var13++) {
                    class227.method1589(var11, var13, 64, var10, 64, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lce;Z)V", line = 202)
    public static final void method1865(class239 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field4461++;
        if (class244.field4029) {
            return;
        }
        if (class21.field350) {
            class111.method844();
        } else {
            class115.method864();
        }
        class194.field3132 = class188.method1357(arg0, -99, class247.field4084);
        int var2 = class73.field1287;
        int var3 = var2 * 956 / 503;
        class194.field3132.method734((class112.field1945 - var3) / 2, 0, var3, var2);
        class308.field5165 = class306.method2094(class7.field111, -832020500, arg0);
        class308.field5165.method587(class112.field1945 / 2 - (class308.field5165.field4116 / 2), 18);
        class244.field4029 = true;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IILsd;)V", line = 230)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg0 == arg1) {
            this.field4475 = arg2.method197(arg1 - 1);
        }
        field4469++;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 248)
    public class268() {
        super(0, false);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V", line = 252)
    public final void method18(boolean arg0) {
        field4470++;
        super.method18(arg0);
        this.field4464 = null;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)Z", line = 289)
    private final boolean method1866(byte arg0) {
        field4474++;
        if (this.field4464 != null) {
            return true;
        } else if (this.field4475 < 0) {
            if (arg0 != 112) {
                field4476 = 109;
            }
            return false;
        } else {
            int var2 = class52.field1007;
            int var3 = class271.field4497;
            int var4 = class43.field824.method575(arg0 ^ 0x70, this.field4475) ? 64 : 128;
            this.field4464 = class43.field824.method578(0, this.field4475);
            this.field4472 = var4;
            this.field4473 = var4;
            class57.method480(false, var3, var2);
            return this.field4464 != null;
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(Z)V", line = 319)
    public static final void method1867(boolean arg0) {
        field4465++;
        class40.field772 = null;
        class233.field3838 = null;
        if (!arg0) {
            method1865((class239) null, true);
        }
        class204.field3251 = null;
    }
}

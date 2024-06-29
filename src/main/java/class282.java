import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class282 extends class337 {

    @OriginalMember(owner = "client!we", name = "F", descriptor = "I")
    private int field4286 = 3216;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    private int field4292 = 3216;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "[I")
    private int[] field4295 = new int[3];

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "I")
    private int field4296 = 4096;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    public static int field4294 = 0;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "Lee;")
    public static class480 field4297 = new class480("runescape", 0);

    @OriginalMember(owner = "client!we", name = "C", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "Lul;")
    public static class406 field4287;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "[Lgo;")
    public static class445[] field4291;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "[[S")
    public static short[][] field4289;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BILhp;)V", line = 12)
    public final void method177(byte arg0, int arg1, class217 arg2) {
        ++field4284;
        int var4 = -115 / ((arg0 - 82) / 40);
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field4292 = arg2.method1511(-100);
                }
            } else {
                this.field4286 = arg2.method1511(-28);
            }
        } else {
            this.field4296 = arg2.method1511(87);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBI)I", line = 53)
    public static final int method1832(int arg0, byte arg1, int arg2) {
        ++field4293;
        int var3 = class284.method1840(arg0 + -1, arg2 + -1, true) + class284.method1840(arg0 + 1, arg2 + -1, true) + (class284.method1840(arg0 + -1, arg2 + 1, true) - -class284.method1840(arg0 - -1, arg2 + 1, true));
        int var4 = class284.method1840(arg0 + -1, arg2, true) - -class284.method1840(arg0 + 1, arg2, true) - (-class284.method1840(arg0, arg2 + -1, true) - class284.method1840(arg0, arg2 + 1, true));
        if (arg1 != -89) {
            field4289 = null;
        }
        int var5 = class284.method1840(arg0, arg2, true);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 70)
    public final void method174(byte arg0) {
        if (arg0 > 1) {
            this.method1833(-14971);
            ++field4288;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V", line = 122)
    public class282() {
        super(1, true);
    }

    @OriginalMember(owner = "client!we", name = "i", descriptor = "(I)V", line = 90)
    private final void method1833(int arg0) {
        ++field4298;
        double var2 = Math.cos((double) ((float) this.field4292 / 4096.0F));
        this.field4295[0] = (int) (var2 * Math.sin((double) ((float) this.field4286 / 4096.0F)) * 4096.0D);
        if (arg0 != -14971) {
            method1832(-51, (byte) -87, -7);
        }
        this.field4295[1] = (int) (4096.0D * Math.cos((double) ((float) this.field4286 / 4096.0F)) * var2);
        this.field4295[2] = (int) (4096.0D * Math.sin((double) ((float) this.field4292 / 4096.0F)));
        int var4 = this.field4295[0] * this.field4295[0] >> 12;
        int var5 = this.field4295[1] * this.field4295[1] >> 12;
        int var6 = this.field4295[2] * this.field4295[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field4295[2] = (this.field4295[2] << 12) / var7;
            this.field4295[1] = (this.field4295[1] << 12) / var7;
            this.field4295[0] = (this.field4295[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)V", line = 129)
    public static final void method1834(int arg0, int arg1) {
        ++field4285;
        if (~class424.field6319 != ~arg0) {
            class69.field976 = class285.field4328 = class307.field4636[arg0];
            class336.method2118(4905);
            class406.field6030 = new int[class69.field976][class285.field4328];
            class359.field5327 = new int[class69.field976][class285.field4328];
            class294.field4484 = new int[4][class69.field976 >> 3][class285.field4328 >> 3];
            for (int var2 = 0; ~var2 > -5; ++var2) {
                class184.field2758[var2] = class25.method181((byte) -113, class285.field4328, class69.field976);
            }
            class221.field3633 = new byte[arg1][class69.field976][class285.field4328];
            class165.method1100(4, class69.field976, class285.field4328, (byte) 102);
            class154.method1058(class377.field5692, arg1 + 60, class69.field976 >> 3, class285.field4328 >> 3);
            class424.field6319 = arg0;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIBBLcl;)V", line = 157)
    public static final void method1835(int arg0, int arg1, byte arg2, byte arg3, class177 arg4) {
        ++field4283;
        int var5 = arg4.field1978[0];
        int var6 = arg4.field1976[0];
        if (~var5 <= -1 && ~var5 > ~class69.field976 && var6 >= 0 && ~var6 > ~class285.field4328) {
            if (~arg0 <= -1 && ~class69.field976 < ~arg0 && ~arg1 <= -1 && ~arg1 > ~class285.field4328) {
                int var7 = class422.method2633(arg4.method953(-98), class309.field4655, arg0, 0, arg1, 0, class184.field2758[arg4.field5826], 0, var6, -4, true, class4.field22, 0, (byte) -82, var5);
                int var8 = -13 % ((arg2 - -12) / 52);
                if (var7 >= 1) {
                    if (~var7 >= -4) {
                        for (int var9 = 0; var9 < var7 + -1; ++var9) {
                            arg4.method1182(class4.field22[var9], class309.field4655[var9], arg3, (byte) 107);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)[I", line = 198)
    public final int[] method179(int arg0, byte arg1) {
        ++field4290;
        int[] var3 = super.field5007.method512(arg0, 0);
        if (arg1 != -11) {
            return null;
        } else {
            if (super.field5007.field687) {
                int var4 = class24.field292 * this.field4296 >> 12;
                int[] var5 = this.method2124(class123.field1843 & arg0 + -1, 0, -69);
                int[] var6 = this.method2124(arg0, 0, -100);
                int[] var7 = this.method2124(arg0 - -1 & class123.field1843, 0, arg1 ^ 75);
                for (int var8 = 0; ~var8 > ~class402.field5977; ++var8) {
                    int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                    int var10 = (var6[var8 + -1 & class446.field6541] + -var6[var8 - -1 & class446.field6541]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    int var12 = var9 >> 4;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (var11 > 255) {
                        var11 = 255;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = 255 & class121.field1818[((var12 - -1) * var12 >> 1) + var11];
                    int var14 = var10 * var13 >> 8;
                    int var15 = var9 * var13 >> 8;
                    int var16 = var13 * 4096 >> 8;
                    int var17 = this.field4295[0] * var14 >> 12;
                    int var18 = this.field4295[2] * var16 >> 12;
                    int var19 = this.field4295[1] * var15 >> 12;
                    var3[var8] = var17 + var19 + var18;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V", line = 277)
    public static void method1836(byte arg0) {
        field4287 = null;
        field4291 = null;
        if (arg0 != 46) {
            method1835(-52, -44, (byte) 92, (byte) 50, (class177) null);
        }
        field4297 = null;
        field4289 = null;
    }
}

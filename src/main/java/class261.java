import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class261 extends class3 {

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
    private int field4112 = 3216;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
    private int field4109 = 3216;

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
    private int field4114 = 4096;

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "[I")
    private int[] field4111 = new int[3];

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "[I")
    public static int[] field4121 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "Lui;")
    public static class98 field4115 = new class98(64);

    @OriginalMember(owner = "client!ii", name = "W", descriptor = "Ljava/lang/String;")
    public static String field4122 = "Prepared sound engine";

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "Lsi;")
    public static class264 field4110;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)[I", line = 9)
    public final int[] method25(byte arg0, int arg1) {
        if (arg0 < 57) {
            method1833(-125, (class221) null, 68, -62, 105, -127, false);
        }
        field4113++;
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int var4 = class54.field809 * this.field4114 >> 12;
            int[] var5 = this.method24(arg1 - 1 & class129.field1970, 1, 0);
            int[] var6 = this.method24(arg1, 1, 0);
            int[] var7 = this.method24(arg1 + 1 & class129.field1970, 1, 0);
            for (int var8 = 0; var8 < class326.field5342; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class5.field70] - var6[class5.field70 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class159.field2553[((var12 + 1) * var12 >> 1) + var11] & 0xFF;
                int var14 = var9 * var13 >> 8;
                int var15 = this.field4111[1] * var14 >> 12;
                int var16 = var10 * var13 >> 8;
                int var17 = var13 * 4096 >> 8;
                int var18 = this.field4111[2] * var17 >> 12;
                int var19 = this.field4111[0] * var16 >> 12;
                var3[var8] = var15 + var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(B)V", line = 78)
    public final void method20(byte arg0) {
        this.method1831(0);
        int var2 = 57 / ((-arg0 - 20) / 58);
        field4119++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lfh;IZ)V", line = 101)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.field4114 = arg0.method2250(-1613178296);
        } else if (arg1 == 1) {
            this.field4112 = arg0.method2250(-1613178296);
        } else if (arg1 == 2) {
            this.field4109 = arg0.method2250(-1613178296);
        }
        if (arg2) {
            this.method14((class313) null, 67, true);
        }
        field4107++;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V", line = 141)
    public class261() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V", line = 146)
    private final void method1831(int arg0) {
        field4120++;
        double var2 = Math.cos((double) ((float) this.field4109 / 4096.0F));
        this.field4111[arg0] = (int) (var2 * Math.sin((double) ((float) this.field4112 / 4096.0F)) * 4096.0D);
        this.field4111[1] = (int) (var2 * 4096.0D * Math.cos((double) ((float) this.field4112 / 4096.0F)));
        this.field4111[2] = (int) (Math.sin((double) ((float) this.field4109 / 4096.0F)) * 4096.0D);
        int var4 = this.field4111[1] * this.field4111[1] >> 12;
        int var5 = this.field4111[0] * this.field4111[0] >> 12;
        int var6 = this.field4111[2] * this.field4111[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field4111[1] = (this.field4111[1] << 12) / var7;
            this.field4111[0] = (this.field4111[0] << 12) / var7;
            this.field4111[2] = (this.field4111[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(B)V", line = 175)
    public static void method1832(byte arg0) {
        field4122 = null;
        int var1 = 50 % ((-arg0 - 57) / 60);
        field4110 = null;
        field4121 = null;
        field4115 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILnm;IIIIZ)V", line = 187)
    public static final void method1833(int arg0, class221 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg3 > -113) {
            return;
        }
        class4.field56 = arg5;
        class58.field885 = arg1;
        field4117++;
        class196.field3016 = arg0;
        class77.field1147 = 1;
        class56.field863 = arg4;
        class294.field4893 = arg6;
        class259.field4104 = arg2;
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V", line = 206)
    public static final void method1834(int arg0) {
        if (arg0 != 4096) {
            method1836(-59);
        }
        field4106++;
        if (class49.field717) {
            return;
        }
        class58.field884 = true;
        if (class307.field5005) {
            class355.field5628 = (float) ((int) class355.field5628 + 191 & 0xFFFFFF80);
        } else {
            class41.field629 += (24.0F - class41.field629) / 2.0F;
        }
        class49.field717 = true;
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(B)Z", line = 236)
    public static final boolean method1835(byte arg0) {
        field4116++;
        class199 var1 = class300.field4960;
        synchronized (class300.field4960) {
            if (class347.field5566 == class305.field4989) {
                return false;
            }
            class181.field2815 = class5.field59[class347.field5566];
            class293.field4856 = class339.field5459[class347.field5566];
            class347.field5566 = class347.field5566 + 1 & 0x7F;
            if (arg0 < 17) {
                method1836(-88);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)Z", line = 268)
    public static final boolean method1836(int arg0) {
        if (arg0 != 0) {
            field4115 = (class98) null;
        }
        field4118++;
        return class245.field3886 ? true : class242.field3816;
    }
}

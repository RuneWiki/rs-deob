import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class12 extends class305 {

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    private int field135 = 1024;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    private int field138 = 2048;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    private int field140 = 3072;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public static int field134 = -1;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "Lmo;")
    public static class271 field131 = new class271(14, 16);

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "[I")
    public static int[] field141 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "Lum;")
    public static class83 field133;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "[Lo;")
    public static class363[] field130;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method70(int arg0, String arg1) {
        ++field128;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 != 60) {
            method71(122, (class249) null);
        }
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 - -var3);
        for (int var6 = 0; var2 > var6; ++var6) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field129;
        int[] var3 = super.field4677.method2174(arg0, arg1 + -4779);
        if (super.field4677.field5040) {
            int[] var4 = this.method2021(0, arg0, 0);
            for (int var5 = 0; var5 < class91.field1471; ++var5) {
                var3[var5] = (var4[var5] * this.field138 >> 12) + this.field135;
            }
        }
        if (arg1 != 4688) {
            field141 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILfh;B)V")
    public final void method14(int arg0, class194 arg1, byte arg2) {
        ++field139;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field4675 = arg1.method1337((byte) 108) == 1;
                }
            } else {
                this.field140 = arg1.method1396(64);
            }
        } else {
            this.field135 = arg1.method1396(70);
        }
        if (arg2 < 76) {
            this.field140 = -92;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public final void method17(byte arg0) {
        ++field137;
        this.field138 = -this.field135 + this.field140;
        if (arg0 != -62) {
            field133 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class12() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILtt;)V")
    public static final void method71(int arg0, class249 arg1) {
        ++field136;
        if (class372.field5523 == null) {
            class442 var2 = new class442();
            byte[] var3 = var2.method2732(128, arg0 ^ 5853, 128, 16);
            class372.field5523 = class91.method780(43, var3, false);
        }
        if (class182.field2787 == null) {
            class498 var4 = new class498();
            byte[] var5 = var4.method2978(16, arg0 + 19854, 128, 128);
            class182.field2787 = class91.method780(-59, var5, false);
        }
        if (arg0 != 5819) {
            method70(96, (String) null);
        }
        class159 var6 = arg1.field3924;
        if (var6.method1150(35632) && class288.field4479 == null) {
            byte[] var7 = class503.method3000(8, 4.0F, 0.5F, 16, 128, arg0 ^ 3563, 16.0F, 4.0F, 0.6F, new class232(419684), 128);
            class288.field4479 = class91.method780(-116, var7, false);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)[[I")
    public final int[][] method72(int arg0, byte arg1) {
        ++field132;
        if (arg1 >= -59) {
            this.field140 = 125;
        }
        int[][] var3 = super.field4674.method2206(-105, arg0);
        if (super.field4674.field5110) {
            int[][] var4 = this.method2015(true, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class91.field1471; ++var11) {
                var8[var11] = this.field135 - -(var5[var11] * this.field138 >> 12);
                var9[var11] = (var6[var11] * this.field138 >> 12) + this.field135;
                var10[var11] = (var7[var11] * this.field138 >> 12) + this.field135;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V")
    public static void method73(int arg0) {
        field133 = null;
        field130 = null;
        field141 = null;
        field131 = null;
        int var1 = -120 / ((arg0 - -51) / 40);
    }
}

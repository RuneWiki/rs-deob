import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class339 extends class30 {

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    private int field4540 = 32768;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "Z")
    public static boolean field4548 = false;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    public static int field4547 = 0;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "[I")
    public static int[] field4549 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "Z")
    public static boolean field4541;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "[Lbaa;")
    public static class483[] field4546;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        if (arg0 != 1) {
            field4541 = true;
        }
        ++field4543;
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (super.field374.field9032) {
            int[] var4 = this.method294(arg1, 1, (byte) 70);
            int[] var5 = this.method294(arg1, 2, (byte) 80);
            for (int var6 = 0; ~var6 > ~class31.field399; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field4540 >> 12;
                int var9 = class76.field995[var7] * var8 >> 12;
                int var10 = class256.field3495[var7] * var8 >> 12;
                int var11 = class353.field4694 & (var9 >> 12) + var6;
                int var12 = class649.field9002 & (var10 >> 12) + arg1;
                int[] var13 = this.method294(var12, 0, (byte) 121);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    public static void method1983(int arg0) {
        field4549 = null;
        if (arg0 == 2897) {
            field4546 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field4542;
        int[][] var3 = super.field377.method3683(arg0, (byte) -28);
        if (arg1 != 7) {
            field4548 = true;
        }
        if (super.field377.field9085) {
            int[] var4 = this.method294(arg0, 1, (byte) 75);
            int[] var5 = this.method294(arg0, 2, (byte) -65);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class31.field399; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field4540 >> 12;
                int var12 = class76.field995[var10] * var11 >> 12;
                int var13 = class256.field3495[var10] * var11 >> 12;
                int var14 = class353.field4694 & (var12 >> 12) + var9;
                int var15 = (var13 >> 12) + arg0 & class649.field9002;
                int[][] var16 = this.method292(106, 0, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
    public final void method29(byte arg0) {
        ++field4551;
        class118.method841(0);
        if (arg0 >= -10) {
            method1983(34);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg0 >= 100) {
            if (~arg1 != -1) {
                if (~arg1 == -2) {
                    super.field378 = ~arg2.method2874((byte) -75) == -2;
                }
            } else {
                this.field4540 = arg2.method2845(-1) << 4;
            }
            ++field4550;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILjava/lang/String;[BZ)I")
    public static final int method1984(int arg0, String arg1, byte[] arg2, boolean arg3) {
        ++field4545;
        int var4 = arg1.length();
        int var5 = arg0;
        for (int var6 = 0; var6 < var4; ++var6) {
            char var7 = arg1.charAt(var6);
            if (var7 > 127) {
                if (~var7 < -2048) {
                    arg2[var5++] = (byte) class647.method3617(var7 >> 12, 224);
                    arg2[var5++] = (byte) class647.method3617(128, class136.method950(63, var7 >> 6));
                    arg2[var5++] = (byte) class647.method3617(128, class136.method950(var7, 63));
                } else {
                    arg2[var5++] = (byte) (class647.method3617(var7, 12294) >> 6);
                    arg2[var5++] = (byte) class647.method3617(128, class136.method950(var7, 63));
                }
            } else {
                arg2[var5++] = (byte) var7;
            }
        }
        if (!arg3) {
            method1983(-95);
        }
        return -arg0 + var5;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class339() {
        super(3, false);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZZI)V")
    public static final void method1985(boolean arg0, boolean arg1, int arg2) {
        ++field4552;
        if (!arg1) {
            field4541 = false;
        }
        class124.field1793 = arg2;
        class76.field997 = 3;
        class587.method3337(class100.field1401.field2472, 50000, class100.field1401.field2475);
        if (!arg0) {
            class467.method2639((byte) -95);
            class72.method577(class659.field9152, -118, false, class83.field1243);
        } else {
            class72.method577("", -89, false, "");
        }
    }
}

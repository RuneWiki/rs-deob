import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class686 extends class533 {

    @OriginalMember(owner = "client!mv", name = "M", descriptor = "I")
    public static int field9700 = -1;

    @OriginalMember(owner = "client!mv", name = "L", descriptor = "Leba;")
    public static class550 field9699 = new class550(20, 17);

    @OriginalMember(owner = "client!mv", name = "E", descriptor = "I")
    public static int field9692;

    @OriginalMember(owner = "client!mv", name = "F", descriptor = "I")
    public static int field9693;

    @OriginalMember(owner = "client!mv", name = "G", descriptor = "I")
    public static int field9694;

    @OriginalMember(owner = "client!mv", name = "I", descriptor = "I")
    public static int field9696;

    @OriginalMember(owner = "client!mv", name = "K", descriptor = "I")
    public static int field9698;

    @OriginalMember(owner = "client!mv", name = "N", descriptor = "I")
    public static int field9701;

    @OriginalMember(owner = "client!mv", name = "H", descriptor = "[B")
    private byte[] field9695;

    @OriginalMember(owner = "client!mv", name = "J", descriptor = "[I")
    public static int[] field9697;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)V")
    public static final void method3881(int arg0) {
        field9693++;
        if (class669.field9514 == -1 || class68.field831 == -1) {
            return;
        }
        int var1 = class501.field6889 + ((class426.field5745 - class501.field6889) * class390.field5229 >> 16);
        class390.field5229 += var1;
        if (class390.field5229 < 65535) {
            class690.field9745 = false;
            class328.field4410 = false;
        } else {
            class390.field5229 = 65535;
            if (class690.field9745) {
                class328.field4410 = false;
            } else {
                class328.field4410 = true;
            }
            class690.field9745 = true;
        }
        float var2 = (float) class390.field5229 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class571.field7768 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class490.field6780[class669.field9514][var4][var5] * 3;
            int var22 = class490.field6780[class669.field9514][var4 + 1][var5] * 3;
            int var23 = (class490.field6780[class669.field9514][var4 + 2][var5] + class490.field6780[class669.field9514][var4 + 2][var5] - class490.field6780[class669.field9514][var4 + 3][var5]) * 3;
            int var24 = class490.field6780[class669.field9514][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class490.field6780[class669.field9514][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class147.field1980 = (int) var3[2] - (class4.field23 * 512);
        class148.field1986 = (int) var3[1] * -1;
        class82.field946 = (int) var3[0] - class125.field1745 * 512;
        float[] var6 = new float[3];
        int var7 = class524.field7283 * 2;
        int var8 = 0;
        if (arg0 != 2048) {
            method3881(-28);
        }
        while (var8 < 3) {
            int var14 = class490.field6780[class68.field831][var7][var8] * 3;
            int var15 = class490.field6780[class68.field831][var7 + 1][var8] * 3;
            int var16 = (class490.field6780[class68.field831][var7 + 2][var8] + class490.field6780[class68.field831][var7 - -2][var8] - class490.field6780[class68.field831][var7 + 3][var8]) * 3;
            int var17 = class490.field6780[class68.field831][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - var15 * 2;
            int var20 = class490.field6780[class68.field831][var7 + 2][var8] + var15 - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
            var8++;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class558.field7615 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class604.field8440 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class660.field9416 = ((class490.field6780[class669.field9514][var4 + 2][3] - class490.field6780[class669.field9514][var4][3]) * class390.field5229 >> 16) + class490.field6780[class669.field9514][var4][3];
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(B)V")
    public static void method3882(byte arg0) {
        field9699 = null;
        field9697 = null;
        int var1 = 37 / ((-arg0 - 2) / 47);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIB)V")
    public final void method761(int arg0, int arg1, byte arg2) {
        field9696++;
        int var4 = arg0 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field9695[var10001] = -1;
        this.field9695[var6] = (byte) (var5 * 3 >> 5);
        if (arg1 > -116) {
            this.field9695 = null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "()V")
    public class686() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(IIB)I")
    public static final int method3883(int arg0, int arg1, byte arg2) {
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        field9692++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg2 != -61) {
            method3881(83);
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
    public static final void method3884(String arg0, byte arg1, String arg2, int arg3, String arg4, String arg5, int arg6, String arg7, int arg8) {
        field9701++;
        class279 var9 = class292.field3858[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class292.field3858[var10] = class292.field3858[var10 - 1];
        }
        if (arg1 < 90) {
            field9699 = null;
        }
        if (var9 == null) {
            var9 = new class279(arg3, arg6, arg0, arg7, arg4, arg2, arg8, arg5);
        } else {
            var9.method1663(arg2, arg3, arg8, arg5, arg6, arg0, arg7, (byte) 51, arg4);
        }
        class80.field935 = class155.field2183;
        class206.field2759++;
        class292.field3858[0] = var9;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3885(int arg0, byte arg1, int arg2) {
        if (arg1 != -37) {
            field9699 = null;
        }
        field9698++;
        return class450.method2531((byte) -88, arg0, arg2) | (arg0 & 0x800) != 0 || class472.method2727(arg2, arg0, arg1 ^ 0x404C);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIII)[B")
    public final byte[] method3886(int arg0, int arg1, int arg2, int arg3) {
        field9694++;
        this.field9695 = new byte[arg0 * arg3 * 2 * arg2];
        if (arg1 == 0) {
            this.method481(arg0, arg3, (byte) -95, arg2);
            return this.field9695;
        } else {
            return null;
        }
    }
}

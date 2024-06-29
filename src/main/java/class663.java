import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class663 {

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "[I")
    private int[] field9256;

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "I")
    public static int field9257;

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "I")
    public static int field9258;

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "I")
    public static int field9259;

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "I")
    public static int field9260;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method3748(boolean arg0) {
        field9260++;
        if (class120.field1575 != null) {
            return;
        }
        class120.field1575 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        int var3 = 0;
        if (arg0) {
            field9258 = 50;
        }
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var9 = var8;
                    var11 = var16;
                } else if (var14 == 1) {
                    var10 = var8;
                    var9 = var17;
                    var11 = var16;
                } else if (var14 == 2) {
                    var9 = var16;
                    var11 = var18;
                    var10 = var8;
                } else if (var14 == 3) {
                    var9 = var16;
                    var10 = var17;
                    var11 = var8;
                } else if (var14 == 4) {
                    var10 = var16;
                    var11 = var8;
                    var9 = var18;
                } else if (var14 == 5) {
                    var11 = var17;
                    var9 = var8;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + ((var23 << 8) + var24 - 16777216);
                class120.field1575[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(BI)I", line = 126)
    public final int method3749(byte arg0, int arg1) {
        if (arg0 != -26) {
            method3750(83, null, -111, null, 117, (byte) -54);
        }
        field9259++;
        int var3 = (this.field9256.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field9256[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field9256[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "([I)V", line = 154)
    public class663(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field9256 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field9256[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field9256[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field9256[var5 + var5] = arg0[var4];
            this.field9256[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILvha;ILha;IB)V", line = 191)
    public static final void method3750(int arg0, class685 arg1, int arg2, class60 arg3, int arg4, byte arg5) {
        field9257++;
        if (arg5 != 70) {
            method3750(76, null, 62, null, 80, (byte) -43);
        }
        class23 var6 = class593.field8266.method1365(arg1.field9602, (byte) 97);
        if (var6.field168 == -1) {
            return;
        }
        int var8;
        if (arg1.field9617) {
            int var7 = arg1.field9570 + arg0;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class680 var9 = var6.method89(arg1.field9586, 0, var8, arg3);
        if (var9 == null) {
            return;
        }
        int var10 = arg1.field9603;
        int var11 = arg1.field9588;
        if ((var8 & 0x1) == 1) {
            var11 = arg1.field9603;
            var10 = arg1.field9588;
        }
        int var12 = var9.method666();
        int var13 = var9.method663();
        if (var6.field174) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field173 == 0) {
            var9.method3855(arg2, arg4 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method3856(arg2, arg4 + 4 - var11 * 4, var12, var13, 0, var6.field173 | 0xFF000000, 1);
        }
    }
}

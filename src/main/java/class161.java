import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class161 extends class93 {

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field2858 = "scroll:";

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "[J")
    public static long[] field2857 = new long[256];

    @OriginalMember(owner = "client!va", name = "db", descriptor = "Lul;")
    public static class51 field2862;

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "[I")
    public static int[] field2863;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "(I)V", line = 4)
    public static final void method1282(int arg0) {
        field2860++;
        if (class277.field4402 == -1 || class213.field3586 == -1) {
            return;
        }
        int var1 = class280.field4443 + ((class75.field1231 - class280.field4443) * class33.field467 >> 16);
        class33.field467 += var1;
        int var2 = class258.field4188 * arg0;
        if (class33.field467 < 65535) {
            class72.field1206 = false;
            class189.field3177 = false;
        } else {
            class33.field467 = 65535;
            if (class72.field1206) {
                class189.field3177 = false;
            } else {
                class189.field3177 = true;
            }
            class72.field1206 = true;
        }
        float[] var3 = new float[3];
        float var4 = (float) class33.field467 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class148.field2661[class277.field4402][var2][var5] * 3;
            int var7 = class148.field2661[class277.field4402][var2 + 1][var5] * 3;
            int var8 = class148.field2661[class277.field4402][var2][var5];
            int var9 = (class148.field2661[class277.field4402][var2 + 2][var5] + class148.field2661[class277.field4402][var2 + 2][var5] - class148.field2661[class277.field4402][var2 + 3][var5]) * 3;
            int var10 = var7 - var6;
            int var11 = var6 + var9 - (var7 * 2);
            int var12 = class148.field2661[class277.field4402][var2 + 2][var5] + var7 - var8 - var9;
            var3[var5] = (((float) var12 * var4 + (float) var11) * var4 + (float) var10) * var4 + (float) var8;
        }
        class32.field454 = (int) var3[2] - (class34.field484 * 128);
        class139.field2563 = (int) var3[1] * -1;
        float[] var13 = new float[3];
        class269.field4309 = (int) var3[0] - (class24.field345 * 128);
        int var14 = class72.field1198 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = (class148.field2661[class213.field3586][var14 + 2][var15] + class148.field2661[class213.field3586][var14 + 2][var15] - class148.field2661[class213.field3586][var14 + 3][var15]) * 3;
            int var17 = class148.field2661[class213.field3586][var14 + 1][var15] * 3;
            int var18 = class148.field2661[class213.field3586][var14][var15];
            int var19 = class148.field2661[class213.field3586][var14][var15] * 3;
            int var20 = var17 - var19;
            int var21 = class148.field2661[class213.field3586][var14 + 2][var15] - (var18 - var17) - var16;
            int var22 = var19 + var16 - (var17 * 2);
            var13[var15] = (((float) var21 * var4 + (float) var22) * var4 + (float) var20) * var4 + (float) var18;
        }
        float var23 = var13[0] - var3[0];
        float var24 = (var13[1] - var3[1]) * -1.0F;
        float var25 = var13[2] - var3[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class160.field2832 = (float) Math.atan2((double) var24, var26);
        class271.field4322 = -((float) Math.atan2((double) var23, (double) var25));
        class141.field2592 = (int) ((double) class160.field2832 * 325.949D) & 0x7FF;
        class311.field4924 = (int) ((double) class271.field4322 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIII)V", line = 109)
    public static final void method1283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 4) {
            field2862 = (class51) null;
        }
        for (int var6 = arg1; var6 <= arg3; var6++) {
            class317.method2184(arg2, (byte) -80, class64.field1007[var6], arg4, arg0);
        }
        field2856++;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(B)V", line = 127)
    public static void method1284(byte arg0) {
        field2863 = null;
        int var1 = 120 % ((74 - arg0) / 45);
        field2857 = null;
        field2862 = null;
        field2858 = null;
    }

    @OriginalMember(owner = "client!va", name = "i", descriptor = "(I)V", line = 142)
    public static final void method1285(int arg0) {
        field2854++;
        class94.field1471 = class100.method864(8, 8, true, (byte) -3, 35, 2048, 0.4F, 4);
        if (arg0 != 1985) {
            method1282(-82);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)[[I", line = 158)
    public final int[][] method299(int arg0, int arg1) {
        if (arg1 != 2) {
            this.method299(-111, -12);
        }
        field2859++;
        int[][] var3 = this.field4958.method2404(arg0, (byte) 120);
        if (this.field4958.field5463 && this.method808(0)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = arg0 % this.field1459 * this.field1459;
            for (int var8 = 0; var8 < class133.field2269; var8++) {
                int var9 = this.field1465[var8 % this.field1463 + var7];
                var6[var8] = class36.method319(255, var9) << 4;
                var4[var8] = class36.method319(65280, var9) >> 4;
                var5[var8] = class36.method319(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2857[var0] = var1;
        }
        field2862 = new class51(16);
        field2863 = new int[500];
    }
}

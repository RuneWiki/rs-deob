import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class611 {

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "Lme;")
    private class668 field8252 = new class668(256);

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "Lji;")
    private class622 field8245;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "Le;")
    private class702 field8253;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "Lnj;")
    public static class415 field8247 = new class415(12, 3);

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "[I")
    public static int[] field8254 = new int[14];

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "[F")
    public static float[] field8256 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
    public static int field8257 = 0;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "I")
    public static int field8258 = 104;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public static int field8246;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field8248;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public static int field8250;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "Luk;")
    public static class265 field8255;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "[Lxa;")
    public static class511[] field8251;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3312(int arg0) {
        class408.field5286.method404(class407.field5182, class260.field3509.field1278 ? class705.field9822 + 256 << 2 : -1, 0);
        if (arg0 > 7) {
            field8250++;
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V", line = 21)
    public static void method3313(int arg0) {
        field8247 = null;
        field8251 = null;
        field8256 = null;
        field8254 = null;
        if (arg0 != 0) {
            method3313(-85);
        }
        field8255 = null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V", line = 38)
    public final void method3314(byte arg0) {
        field8246++;
        this.field8252.method3659(-124, 5);
        if (arg0 >= -40) {
            method3313(35);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I[BIIIII)V", line = 49)
    public static final void method3315(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8249++;
        if (arg4 > 0 && !class386.method2202(-44, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class386.method2202(-80, arg3)) {
            int var7 = class168.method1158(arg0, (byte) 67);
            int var8 = 0;
            int var9 = arg4 < arg3 ? arg4 : arg3;
            int var10 = arg4 >> 1;
            if (arg6 >= 38) {
                int var11 = arg3 >> 1;
                byte[] var12 = arg1;
                byte[] var13 = new byte[var10 * var11 * var7];
                while (true) {
                    OpenGL.glTexImage2Dub(arg2, var8, arg5, arg4, arg3, 0, arg0, 5121, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg4 * var7;
                    for (int var15 = 0; var15 < var7; var15++) {
                        int var17 = var15;
                        int var18 = var15;
                        int var19 = var14 + var15;
                        for (int var20 = 0; var20 < var11; var20++) {
                            for (int var21 = 0; var21 < var10; var21++) {
                                byte var22 = var12[var18];
                                int var23 = var7 + var18;
                                int var24 = var12[var23] + var22;
                                int var25 = var12[var19] + var24;
                                var18 = var7 + var23;
                                int var26 = var7 + var19;
                                int var27 = var12[var26] + var25;
                                var13[var17] = (byte) (var27 >> 2);
                                var19 = var7 + var26;
                                var17 += var7;
                            }
                            var19 += var14;
                            var18 += var14;
                        }
                    }
                    byte[] var16 = var13;
                    var13 = var12;
                    var12 = var16;
                    arg3 = var11;
                    arg4 = var10;
                    var8++;
                    var9 >>= 0x1;
                    var10 >>= 0x1;
                    var11 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)V", line = 146)
    public final void method3316(int arg0) {
        this.field8252.method3656((byte) 0);
        field8244++;
        if (arg0 != 1) {
            field8256 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lji;Le;)V", line = 217)
    public class611(class622 arg0, class702 arg1) {
        this.field8245 = arg0;
        this.field8253 = arg1;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)Lvga;", line = 166)
    public final class239 method3317(byte arg0, int arg1) {
        field8248++;
        Object var3 = this.field8252.method3655(27, (long) arg1);
        if (var3 != null) {
            return (class239) var3;
        } else if (this.field8253.method3164((byte) -31, arg1)) {
            class59 var4 = this.field8253.method3162((byte) -104, arg1);
            int var5 = var4.field794 ? 64 : this.field8245.field8555;
            class239 var7;
            if (var4.field795 && this.field8245.method211()) {
                float[] var6 = this.field8253.method3157(0.7F, var5, arg1, false, var5, -45);
                var7 = new class239(this.field8245, 3553, 34842, var5, var5, var4.field801 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field812) {
                    var8 = this.field8253.method3160(false, var5, arg1, var5, 0.7F, 100);
                } else {
                    var8 = this.field8253.method3158(var5, true, 0.7F, var5, arg1, (byte) -56);
                }
                var7 = new class239(this.field8245, 3553, 6408, var5, var5, var4.field801 != 0, var8, false);
            }
            int var9 = 42 % ((arg0 + 52) / 40);
            var7.method1504(var4.field809, (byte) 81, var4.field808);
            this.field8252.method3650((long) arg1, -120, var7);
            return var7;
        } else {
            return null;
        }
    }
}

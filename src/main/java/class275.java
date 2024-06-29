import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class275 extends class27 {

    @OriginalMember(owner = "client!pm", name = "T", descriptor = "I")
    private int field4169 = 32768;

    @OriginalMember(owner = "client!pm", name = "S", descriptor = "I")
    public static volatile int field4168 = 0;

    @OriginalMember(owner = "client!pm", name = "W", descriptor = "I")
    public static int field4172 = -1;

    @OriginalMember(owner = "client!pm", name = "Y", descriptor = "[I")
    public static int[] field4174 = new int[25];

    @OriginalMember(owner = "client!pm", name = "N", descriptor = "I")
    public static int field4163 = -1;

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!pm", name = "O", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!pm", name = "Q", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!pm", name = "R", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!pm", name = "U", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!pm", name = "V", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!pm", name = "X", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "[I")
    public static int[] field4162;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILsb;I)V", line = 5)
    public final void method23(int arg0, class190 arg1, int arg2) {
        field4173++;
        if (arg2 == 0) {
            this.field4169 = arg1.method1317((byte) 79) << 4;
        } else if (arg2 == 1) {
            this.field376 = arg1.method1319(255) == 1;
        }
        if (arg0 != -5836) {
            field4162 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)[[I", line = 44)
    public final int[][] method19(int arg0, int arg1) {
        field4165++;
        if (arg0 != -28941) {
            field4174 = (int[]) null;
        }
        int[][] var3 = this.field379.method668(arg1, 0);
        if (this.field379.field1171) {
            int[] var4 = this.method164(arg1, arg0 ^ 0xFFFF8EAC, 1);
            int[] var5 = this.method164(arg1, 47, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; var9 < class209.field3053; var9++) {
                int var10 = (var4[var9] * 255 & 0xFFE88) >> 12;
                int var11 = var5[var9] * this.field4169 >> 12;
                int var12 = class16.field270[var10] * var11 >> 12;
                int var13 = client.field646[var10] * var11 >> 12;
                int var14 = (var13 >> 12) + var9 & class150.field2180;
                int var15 = class214.field3080 & (var12 >> 12) + arg1;
                int[][] var16 = this.method168(0, -5, var15);
                var6[var9] = var16[0][var14];
                var8[var9] = var16[1][var14];
                var7[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)V", line = 98)
    public final void method22(int arg0) {
        class172.method1206(28820);
        if (arg0 < -63) {
            field4171++;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BZ)V", line = 117)
    public static final void method2008(byte arg0, boolean arg1) {
        if (arg0 > -54) {
            return;
        }
        byte[][] var2;
        if (class141.field2031 && arg1) {
            var2 = class219.field3275;
        } else {
            var2 = class333.field5155;
        }
        field4166++;
        int var3 = class178.field2560.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class85.field1201[var4] >> 8) * 64 - class272.field4123;
                int var7 = (class85.field1201[var4] & 0xFF) * 64 - class202.field2968;
                class32.method228(0);
                class216.method1562(var7, var6, class92.field1269, arg1, var5, (byte) -127);
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)Lod;", line = 158)
    public static final class343 method2009(int arg0, int arg1) {
        field4160++;
        class343 var2 = (class343) client.field628.method551(arg0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class110.field1611.method2520(11, arg1, (byte) -25);
        class343 var4 = new class343();
        if (var3 != null) {
            var4.method2400(~arg0, new class190(var3));
        }
        client.field628.method547((long) arg1, -1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)[I", line = 181)
    public final int[] method18(int arg0, byte arg1) {
        if (arg1 != -62) {
            method2010();
        }
        field4167++;
        int[] var3 = this.field375.method2087(arg1 + 10, arg0);
        if (this.field375.field4382) {
            int[] var4 = this.method164(arg0, 28, 1);
            int[] var5 = this.method164(arg0, 48, 2);
            for (int var6 = 0; var6 < class209.field3053; var6++) {
                int var7 = var5[var6] * this.field4169 >> 12;
                int var8 = var4[var6] >> 4 & 0xFF;
                int var9 = client.field646[var8] * var7 >> 12;
                int var10 = class150.field2180 & var6 + (var9 >> 12);
                int var11 = class16.field270[var8] * var7 >> 12;
                int var12 = (var11 >> 12) + arg0 & class214.field3080;
                int[] var13 = this.method164(var12, 94, 0);
                var3[var6] = var13[var10];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "()V", line = 233)
    public static final void method2010() {
        GL var0 = class141.field2025;
        var0.glDisableClientState(32886);
        class141.method1021(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class141.method1020();
        for (int var1 = 0; var1 < class247.field3663[0].length; var1++) {
            class224 var2 = class247.field3663[0][var1];
            if (var2.field3353 >= 0 && class173.method1213(24815, class345.field5336.method586(var2.field3353, 13078))) {
                var0.glColor4fv(class203.method1474(var2.field3375, -20690), 0);
                float var3 = 201.5F - (var2.field3360 ? 1.0F : 0.5F);
                var2.method1639(class302.field4502, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class141.method983();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class141.method1023();
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(III)V", line = 275)
    public static final void method2011(int arg0, int arg1, int arg2) {
        field4164++;
        class95 var3 = class227.method1699(13, -1855723168, arg0);
        var3.method738((byte) 51);
        var3.field1328 = arg1;
        if (arg2 != 0) {
            field4172 = 16;
        }
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(B)Z", line = 288)
    public static final boolean method2012(byte arg0) {
        field4161++;
        if (class158.field2272) {
            try {
                return !(Boolean) class114.method858("showingVideoAd", (byte) -67, class54.field787.field878);
            } catch (Throwable var2) {
            }
        }
        if (arg0 < 64) {
            field4162 = (int[]) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "(I)V", line = 307)
    public static void method2013(int arg0) {
        field4174 = null;
        field4162 = null;
        if (arg0 > -2) {
            method2009(-48, -11);
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 323)
    public class275() {
        super(3, false);
    }
}

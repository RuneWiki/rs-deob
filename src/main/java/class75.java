import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class75 extends class134 {

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "B")
    private byte field1016 = 0;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "Z")
    public boolean field1026 = false;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    private int field1031 = 0;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "B")
    private byte field1036 = 0;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "I")
    private int field1032 = 0;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public int field1021 = 0;

    @OriginalMember(owner = "client!cd", name = "db", descriptor = "I")
    private int field1046 = 0;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "[I")
    private int[] field1005;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "[I")
    public int[] field1006;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "[I")
    public int[] field1010;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "[I")
    public int[] field1024;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "[I")
    private int[] field1022;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "[S")
    private short[] field1035;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "[S")
    private short[] field1019;

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "[S")
    private short[] field1044;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "[S")
    private short[] field1015;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "[S")
    private short[] field1034;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "[F")
    private float[] field1027;

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "[F")
    private float[] field1038;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "[S")
    private short[] field1009;

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "[B")
    private byte[] field1043;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "[S")
    private short[] field1030;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "[S")
    private short[] field1007;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "[S")
    private short[] field1014;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "[S")
    private short[] field1033;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "[B")
    private byte[] field1017;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "[S")
    private short[] field1029;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "Lvg;")
    public class278 field1041;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "Lje;")
    public class81 field1011;

    @OriginalMember(owner = "client!cd", name = "eb", descriptor = "Lje;")
    private class81 field1047;

    @OriginalMember(owner = "client!cd", name = "gb", descriptor = "Lje;")
    private class81 field1049;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "Lje;")
    private class81 field1040;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "Lje;")
    private class81 field1028;

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "S")
    private short field1039;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "S")
    private short field1020;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "[S")
    private short[] field1008;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "[I")
    private int[] field1037;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "Lim;")
    private static class192 field1025 = new class192(10000);

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "Lcd;")
    private static class75 field1042 = new class75();

    @OriginalMember(owner = "client!cd", name = "hb", descriptor = "Lcd;")
    private static class75 field1050 = new class75();

    @OriginalMember(owner = "client!cd", name = "ib", descriptor = "Lcd;")
    private static class75 field1051 = new class75();

    @OriginalMember(owner = "client!cd", name = "jb", descriptor = "Lcd;")
    private static class75 field1052 = new class75();

    @OriginalMember(owner = "client!cd", name = "kb", descriptor = "Lcd;")
    private static class75 field1053 = new class75();

    @OriginalMember(owner = "client!cd", name = "lb", descriptor = "Lcd;")
    private static class75 field1054 = new class75();

    @OriginalMember(owner = "client!cd", name = "sb", descriptor = "[I")
    private static int[] field1061 = new int[1];

    @OriginalMember(owner = "client!cd", name = "wb", descriptor = "[I")
    private static int[] field1065 = new int[1];

    @OriginalMember(owner = "client!cd", name = "ub", descriptor = "Z")
    private static boolean field1063 = false;

    @OriginalMember(owner = "client!cd", name = "mb", descriptor = "F")
    private static float field1055;

    @OriginalMember(owner = "client!cd", name = "qb", descriptor = "F")
    private static float field1059;

    @OriginalMember(owner = "client!cd", name = "rb", descriptor = "F")
    private static float field1060;

    @OriginalMember(owner = "client!cd", name = "tb", descriptor = "F")
    private static float field1062;

    @OriginalMember(owner = "client!cd", name = "vb", descriptor = "F")
    private static float field1064;

    @OriginalMember(owner = "client!cd", name = "xb", descriptor = "F")
    private static float field1066;

    @OriginalMember(owner = "client!cd", name = "nb", descriptor = "I")
    private static int field1056;

    @OriginalMember(owner = "client!cd", name = "ob", descriptor = "I")
    private static int field1057;

    @OriginalMember(owner = "client!cd", name = "pb", descriptor = "I")
    private static int field1058;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "Laf;")
    private class190 field1013;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "Lrl;")
    private class207 field1018;

    @OriginalMember(owner = "client!cd", name = "fb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1048;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "[J")
    private static long[] field1012;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "[[I")
    private int[][] field1023;

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "[[I")
    private int[][] field1045;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ISIB)I", line = 11)
    private static final int method492(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class25.field368[class76.method554(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class25.field365.method377((byte) 108, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class25.field365.method375(arg1 & 0xFFFF, (byte) -128);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(SS)V", line = 73)
    public final void method493(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1032; var3++) {
            if (this.field1033[var3] == arg0) {
                this.field1033[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class25.field365.method377((byte) 105, arg0 & 0xFFFF);
            var5 = class25.field365.method375(arg0 & 0xFFFF, (byte) -100);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class25.field365.method377((byte) 126, arg1 & 0xFFFF);
            var7 = class25.field365.method375(arg1 & 0xFFFF, (byte) -112);
        }
        if (var4 != var6 || var5 != var7) {
            this.field1047.field1236 = false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)Lh;", line = 110)
    public final class232 method494(int arg0, int arg1, int arg2) {
        this.field1026 = false;
        if (this.field1013 != null) {
            this.field1019 = this.field1013.field3084;
            this.field1044 = this.field1013.field3083;
            this.field1015 = this.field1013.field3085;
            this.field1034 = this.field1013.field3082;
            this.field1013 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V", line = 123)
    public final void method495(int arg0) {
        this.field1020 = (short) arg0;
        if (this.field1049 != null) {
            this.field1049.field1236 = false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "()I", line = 130)
    public final int method496() {
        return this.field1020;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([FI)[F", line = 134)
    private static final float[] method497(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class213.method1556(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(SS)V", line = 141)
    public final void method498(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1032; var3++) {
            if (this.field1009[var3] == arg0) {
                this.field1009[var3] = arg1;
            }
        }
        this.field1047.field1236 = false;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIJ)V", line = 153)
    public final void method499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field1046 == 0) {
            return;
        }
        GL var10 = class186.field2990;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method528();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "()V", line = 182)
    public final void method500() {
        if (this.field1019 == null) {
            this.method533();
            return;
        }
        for (int var1 = 0; var1 < this.field1021; var1++) {
            this.field1006[var1] = -this.field1006[var1];
            this.field1024[var1] = -this.field1024[var1];
        }
        for (int var2 = 0; var2 < this.field1046; var2++) {
            this.field1019[var2] = (short) (-this.field1019[var2]);
            this.field1015[var2] = (short) (-this.field1015[var2]);
        }
        this.field1041.field4391 = false;
        this.field1011.field1236 = false;
        if (this.field1049 != null) {
            this.field1049.field1236 = false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V", line = 215)
    public final void method501(int arg0) {
        if (this.field1019 == null) {
            this.method530(arg0);
            return;
        }
        int var2 = class25.field355[arg0];
        int var3 = class25.field359[arg0];
        for (int var4 = 0; var4 < this.field1021; var4++) {
            int var5 = this.field1024[var4] * var2 + this.field1006[var4] * var3 >> 16;
            this.field1024[var4] = this.field1024[var4] * var3 - this.field1006[var4] * var2 >> 16;
            this.field1006[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field1046; var6++) {
            int var7 = this.field1019[var6] * var3 + this.field1015[var6] * var2 >> 16;
            this.field1015[var6] = (short) (this.field1015[var6] * var3 - this.field1019[var6] * var2 >> 16);
            this.field1019[var6] = (short) var7;
        }
        this.field1041.field4391 = false;
        this.field1011.field1236 = false;
        if (this.field1049 != null) {
            this.field1049.field1236 = false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIII[FFIF)V", line = 259)
    private static final void method502(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field1064 = var16;
        field1055 = var17;
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "()V", line = 305)
    public final void method503() {
        for (int var1 = 0; var1 < this.field1021; var1++) {
            int var2 = this.field1006[var1];
            this.field1006[var1] = this.field1024[var1];
            this.field1024[var1] = -var2;
        }
        this.field1041.field4391 = false;
        this.field1011.field1236 = false;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIII[FIF)V", line = 319)
    private static final void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field1060 = var16;
        field1062 = var17;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()I", line = 364)
    public final int method152() {
        if (!this.field1041.field4391) {
            this.method544();
        }
        return this.field1041.field4390;
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "()I", line = 370)
    public final int method505() {
        if (!this.field1041.field4391) {
            this.method544();
        }
        return this.field1041.field4386;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V", line = 4531)
    private class75() {
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lle;IIZ)V", line = 4533)
    public class75(class259 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field4133];
        this.field1005 = new int[arg0.field4090 + 1];
        for (int var6 = 0; var6 < arg0.field4133; var6++) {
            if ((arg0.field4089 == null || arg0.field4089[var6] != 2) && (arg0.field4121 == null || arg0.field4121[var6] == -1 || !class25.field365.method379(arg0.field4121[var6] & 0xFFFF, 66))) {
                var5[this.field1032++] = var6;
                this.field1005[arg0.field4136[var6]]++;
                this.field1005[arg0.field4130[var6]]++;
                this.field1005[arg0.field4126[var6]]++;
            }
        }
        long[] var7 = new long[this.field1032];
        for (int var8 = 0; var8 < this.field1032; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field4121 != null) {
                var14 = arg0.field4121[var9];
                if (var14 != -1) {
                    var12 = class25.field365.method382(var14 & 0xFFFF, (byte) -62);
                    var13 = class25.field365.method384(255, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field4096 != null && arg0.field4096[var9] != 0 || var14 != -1 && !class25.field365.method380(var14 & 0xFFFF, -23908);
            if ((arg3 || var15) && arg0.field4095 != null) {
                var10 += arg0.field4095[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class239.method1697(var7, var5, true);
        this.field1021 = arg0.field4090;
        this.field1031 = arg0.field4124;
        this.field1006 = arg0.field4107;
        this.field1010 = arg0.field4094;
        this.field1024 = arg0.field4131;
        this.field1022 = arg0.field4138;
        this.field1035 = arg0.field4106;
        int var20 = this.field1032 * 3;
        this.field1019 = new short[var20];
        this.field1044 = new short[var20];
        this.field1015 = new short[var20];
        this.field1034 = new short[var20];
        this.field1027 = new float[var20];
        this.field1038 = new float[var20];
        this.field1009 = new short[this.field1032];
        this.field1043 = new byte[this.field1032];
        this.field1030 = new short[this.field1032];
        this.field1007 = new short[this.field1032];
        this.field1014 = new short[this.field1032];
        this.field1033 = new short[this.field1032];
        if (arg0.field4135 != null) {
            this.field1017 = new byte[this.field1032];
        }
        if (arg0.field4114 != null) {
            this.field1029 = new short[this.field1032];
        }
        this.field1041 = new class278();
        this.field1011 = new class81();
        this.field1047 = new class81();
        if (class269.field4250) {
            this.field1049 = new class81();
        }
        this.field1040 = new class81();
        this.field1028 = new class81();
        this.field1039 = (short) arg1;
        this.field1020 = (short) arg2;
        this.field1008 = new short[var20];
        field1012 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < this.field1031; var22++) {
            int var23 = this.field1005[var22];
            this.field1005[var22] = var21;
            var21 += var23;
        }
        this.field1005[this.field1031] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field4100 != null) {
            int var28 = arg0.field4120;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field1032; var36++) {
                int var37 = var5[var36];
                if (arg0.field4100[var37] != -1) {
                    int var38 = arg0.field4100[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field4136[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field4130[var37];
                        } else {
                            var40 = arg0.field4126[var37];
                        }
                        int var41 = arg0.field4107[var40];
                        int var42 = arg0.field4094[var40];
                        int var43 = arg0.field4131[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field4137[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field4091[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field4110[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field4091[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field4110[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field4093[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field4091[var44] / 1024.0F;
                        var49 = (float) arg0.field4110[var44] / 1024.0F;
                        var48 = (float) arg0.field4093[var44] / 1024.0F;
                    }
                    var27[var44] = method514(arg0.field4119[var44], arg0.field4128[var44], arg0.field4118[var44], arg0.field4092[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field1032; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field4134[var51] & 0xFFFF;
            short var53;
            if (arg0.field4121 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field4121[var51];
            }
            int var54;
            if (arg0.field4100 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field4100[var51];
            }
            int var55;
            if (arg0.field4096 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field4096[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field4137[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field4136[var51];
                        int var67 = arg0.field4130[var51];
                        int var68 = arg0.field4126[var51];
                        short var69 = arg0.field4119[var54];
                        short var70 = arg0.field4128[var54];
                        short var71 = arg0.field4118[var54];
                        float var72 = (float) arg0.field4107[var69];
                        float var73 = (float) arg0.field4094[var69];
                        float var74 = (float) arg0.field4131[var69];
                        float var75 = (float) arg0.field4107[var70] - var72;
                        float var76 = (float) arg0.field4094[var70] - var73;
                        float var77 = (float) arg0.field4131[var70] - var74;
                        float var78 = (float) arg0.field4107[var71] - var72;
                        float var79 = (float) arg0.field4094[var71] - var73;
                        float var80 = (float) arg0.field4131[var71] - var74;
                        float var81 = (float) arg0.field4107[var66] - var72;
                        float var82 = (float) arg0.field4094[var66] - var73;
                        float var83 = (float) arg0.field4131[var66] - var74;
                        float var84 = (float) arg0.field4107[var67] - var72;
                        float var85 = (float) arg0.field4094[var67] - var73;
                        float var86 = (float) arg0.field4131[var67] - var74;
                        float var87 = (float) arg0.field4107[var68] - var72;
                        float var88 = (float) arg0.field4094[var68] - var73;
                        float var89 = (float) arg0.field4131[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field4136[var51];
                        int var102 = arg0.field4130[var51];
                        int var103 = arg0.field4126[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field4102[var54];
                        float var109 = (float) arg0.field4112[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field4093[var54] & 0xFFFF) / 1024.0F;
                            method502(arg0.field4107[var101], arg0.field4094[var101], arg0.field4131[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field1064;
                            var57 = field1055;
                            method502(arg0.field4107[var102], arg0.field4094[var102], arg0.field4131[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field1064;
                            var59 = field1055;
                            method502(arg0.field4107[var103], arg0.field4094[var103], arg0.field4131[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field1064;
                            var61 = field1055;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field4108[var54] / 256.0F;
                            float var113 = (float) arg0.field4098[var54] / 256.0F;
                            int var114 = arg0.field4107[var102] - arg0.field4107[var101];
                            int var115 = arg0.field4094[var102] - arg0.field4094[var101];
                            int var116 = arg0.field4131[var102] - arg0.field4131[var101];
                            int var117 = arg0.field4107[var103] - arg0.field4107[var101];
                            int var118 = arg0.field4094[var103] - arg0.field4094[var101];
                            int var119 = arg0.field4131[var103] - arg0.field4131[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field4091[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field4110[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field4093[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method548(var126, var127, var128);
                            method532(arg0.field4107[var101], arg0.field4094[var101], arg0.field4131[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field1066;
                            var57 = field1059;
                            method532(arg0.field4107[var102], arg0.field4094[var102], arg0.field4131[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field1066;
                            var59 = field1059;
                            method532(arg0.field4107[var103], arg0.field4094[var103], arg0.field4131[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field1066;
                            var61 = field1059;
                        } else if (var65 == 3) {
                            method504(arg0.field4107[var101], arg0.field4094[var101], arg0.field4131[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field1060;
                            var57 = field1062;
                            method504(arg0.field4107[var102], arg0.field4094[var102], arg0.field4131[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field1060;
                            var59 = field1062;
                            method504(arg0.field4107[var103], arg0.field4094[var103], arg0.field4131[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field1060;
                            var61 = field1062;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method1843();
            byte var129;
            if (arg0.field4089 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field4089[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field4136[var51];
                class172 var133 = arg0.field4105[var132];
                this.field1030[var50] = this.method536(arg0, var132, var130, var133.field2740, var133.field2742, var133.field2734, var133.field2738, var56, var57);
                int var134 = arg0.field4130[var51];
                class172 var135 = arg0.field4105[var134];
                this.field1007[var50] = this.method536(arg0, var134, (long) var62 + var130, var135.field2740, var135.field2742, var135.field2734, var135.field2738, var58, var59);
                int var136 = arg0.field4126[var51];
                class172 var137 = arg0.field4105[var136];
                this.field1014[var50] = this.method536(arg0, var136, (long) var63 + var130, var137.field2740, var137.field2742, var137.field2734, var137.field2738, var60, var61);
            } else if (var129 == 1) {
                class44 var138 = arg0.field4132[var51];
                long var139 = (long) ((var54 << 2) + (var138.field596 > 0 ? 1024 : 2048) + (var138.field597 + 256 << 12) + (var138.field599 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field1030[var50] = this.method536(arg0, arg0.field4136[var51], var139, var138.field596, var138.field597, var138.field599, 0, var56, var57);
                this.field1007[var50] = this.method536(arg0, arg0.field4130[var51], (long) var62 + var139, var138.field596, var138.field597, var138.field599, 0, var58, var59);
                this.field1014[var50] = this.method536(arg0, arg0.field4126[var51], (long) var63 + var139, var138.field596, var138.field597, var138.field599, 0, var60, var61);
            }
            if (arg0.field4121 == null) {
                this.field1033[var50] = -1;
            } else {
                this.field1033[var50] = arg0.field4121[var51];
            }
            if (this.field1017 != null) {
                this.field1017[var50] = (byte) arg0.field4135[var51];
            }
            this.field1009[var50] = arg0.field4134[var51];
            if (arg0.field4096 != null) {
                this.field1043[var50] = arg0.field4096[var51];
            }
            if (arg0.field4114 != null) {
                this.field1029[var50] = arg0.field4114[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field1032; var143++) {
            short var144 = this.field1033[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field1037 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field1032; var147++) {
            short var148 = this.field1033[var147];
            if (var146 != var148) {
                this.field1037[var145++] = var147;
                var146 = var148;
            }
        }
        this.field1037[var145] = this.field1032;
        field1012 = null;
        this.field1019 = method547(this.field1019, this.field1046);
        this.field1044 = method547(this.field1044, this.field1046);
        this.field1015 = method547(this.field1015, this.field1046);
        this.field1034 = method547(this.field1034, this.field1046);
        this.field1027 = method497(this.field1027, this.field1046);
        this.field1038 = method497(this.field1038, this.field1046);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[IIIIZ)V", line = 381)
    public final void method506(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field1058 = 0;
            field1056 = 0;
            field1057 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field1023.length) {
                    int[] var14 = this.field1023[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field1058 += this.field1006[var16];
                        field1056 += this.field1010[var16];
                        field1057 += this.field1024[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field1058 = field1058 / var11 + var8;
                field1056 = field1056 / var11 + var9;
                field1057 = field1057 / var11 + var10;
            } else {
                field1058 = var8;
                field1056 = var9;
                field1057 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field1023.length) {
                    int[] var22 = this.field1023[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field1006[var24] += var17;
                        this.field1010[var24] += var18;
                        this.field1024[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field1023.length) {
                    int[] var27 = this.field1023[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field1006[var29] -= field1058;
                        this.field1010[var29] -= field1056;
                        this.field1024[var29] -= field1057;
                        if (arg4 != 0) {
                            int var30 = class25.field355[arg4];
                            int var31 = class25.field359[arg4];
                            int var32 = this.field1010[var29] * var30 + this.field1006[var29] * var31 + 32767 >> 16;
                            this.field1010[var29] = this.field1010[var29] * var31 + 32767 - this.field1006[var29] * var30 >> 16;
                            this.field1006[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class25.field355[arg2];
                            int var34 = class25.field359[arg2];
                            int var35 = this.field1010[var29] * var34 + 32767 - this.field1024[var29] * var33 >> 16;
                            this.field1024[var29] = this.field1024[var29] * var34 + this.field1010[var29] * var33 + 32767 >> 16;
                            this.field1010[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class25.field355[arg3];
                            int var37 = class25.field359[arg3];
                            int var38 = this.field1024[var29] * var36 + this.field1006[var29] * var37 + 32767 >> 16;
                            this.field1024[var29] = this.field1024[var29] * var37 + 32767 - this.field1006[var29] * var36 >> 16;
                            this.field1006[var29] = var38;
                        }
                        this.field1006[var29] += field1058;
                        this.field1010[var29] += field1056;
                        this.field1024[var29] += field1057;
                    }
                }
            }
            if (arg5 && this.field1019 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field1023.length) {
                        int[] var41 = this.field1023[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field1005[var43];
                            int var45 = this.field1005[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field1008[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class25.field355[arg4];
                                    int var49 = class25.field359[arg4];
                                    int var50 = this.field1044[var47] * var48 + this.field1019[var47] * var49 + 32767 >> 16;
                                    this.field1044[var47] = (short) (this.field1044[var47] * var49 + 32767 - this.field1019[var47] * var48 >> 16);
                                    this.field1019[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class25.field355[arg2];
                                    int var52 = class25.field359[arg2];
                                    int var53 = this.field1044[var47] * var52 + 32767 - this.field1015[var47] * var51 >> 16;
                                    this.field1015[var47] = (short) (this.field1044[var47] * var51 + this.field1015[var47] * var52 + 32767 >> 16);
                                    this.field1044[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class25.field355[arg3];
                                    int var55 = class25.field359[arg3];
                                    int var56 = this.field1019[var47] * var55 + this.field1015[var47] * var54 + 32767 >> 16;
                                    this.field1015[var47] = (short) (this.field1015[var47] * var55 + 32767 - this.field1019[var47] * var54 >> 16);
                                    this.field1019[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field1049 != null) {
                    this.field1049.field1236 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field1023.length) {
                    int[] var59 = this.field1023[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field1006[var61] -= field1058;
                        this.field1010[var61] -= field1056;
                        this.field1024[var61] -= field1057;
                        this.field1006[var61] = this.field1006[var61] * arg2 >> 7;
                        this.field1010[var61] = this.field1010[var61] * arg3 >> 7;
                        this.field1024[var61] = this.field1024[var61] * arg4 >> 7;
                        this.field1006[var61] += field1058;
                        this.field1010[var61] += field1056;
                        this.field1024[var61] += field1057;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1045 != null && this.field1043 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field1045.length) {
                        int[] var64 = this.field1045[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field1043[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field1043[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field1047.field1236 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field1045 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field1045.length) {
                    int[] var70 = this.field1045[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field1009[var72] & 0xFFFF;
                        int var74 = var73 >> 10 & 0x3F;
                        int var75 = var73 >> 7 & 0x7;
                        int var76 = var73 & 0x7F;
                        int var77 = arg2 + var74 & 0x3F;
                        int var78 = arg3 / 4 + var75;
                        if (var78 < 0) {
                            var78 = 0;
                        } else if (var78 > 7) {
                            var78 = 7;
                        }
                        int var79 = arg4 + var76;
                        if (var79 < 0) {
                            var79 = 0;
                        } else if (var79 > 127) {
                            var79 = 127;
                        }
                        this.field1009[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field1047.field1236 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZZZ)Llf;", line = 788)
    public final class134 method507(boolean arg0, boolean arg1, boolean arg2) {
        return this.method539(arg0, arg1, arg2, field1052, field1051);
    }

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "()V", line = 791)
    public final void method508() {
        int var10002;
        if (this.field1022 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1021; var3++) {
                int var4 = this.field1022[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1023 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1023[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1021) {
                int var7 = this.field1022[var6] & 0xFF;
                this.field1023[var7][var1[var7]++] = var6++;
            }
            this.field1022 = null;
        }
        if (this.field1017 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1032; var10++) {
            int var11 = this.field1017[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1045 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1045[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1032) {
            int var14 = this.field1017[var13] & 0xFF;
            this.field1045[var14][var8[var14]++] = var13++;
        }
        this.field1017 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()Z", line = 883)
    public final boolean method509() {
        return this.field1026 && this.field1006 != null && this.field1019 != null;
    }

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "()Z", line = 886)
    public final boolean method510() {
        if (this.field1023 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field1021; var1++) {
            this.field1006[var1] <<= 0x4;
            this.field1010[var1] <<= 0x4;
            this.field1024[var1] <<= 0x4;
        }
        field1058 = 0;
        field1056 = 0;
        field1057 = 0;
        return true;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIIJILll;)V", line = 907)
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class167 arg10) {
        if (this.field1046 == 0) {
            return;
        }
        if (!this.field1041.field4391) {
            this.method544();
        }
        short var13 = this.field1041.field4385;
        short var14 = this.field1041.field4390;
        short var15 = this.field1041.field4389;
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class338.field5244) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class131.field1931) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class204.field3334) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class287.field4527) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class25.field355[arg0];
            var27 = class25.field359[arg0];
        }
        if (arg8 > 0L && class4.field31 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (class147.field2196 >= var28 && class147.field2196 <= var29 && class175.field2794 >= var30 && class175.field2794 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field1041.field4388;
                short var37 = this.field1041.field4392;
                short var38 = this.field1041.field4387;
                short var39 = this.field1041.field4386;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (class147.field2196 >= var32 && class147.field2196 <= var33 && class175.field2794 >= var34 && class175.field2794 <= var35) {
                    if (this.field2042) {
                        class250.field3974[class283.field4470++] = arg8;
                    } else {
                        if (field1065.length < this.field1046) {
                            field1065 = new int[this.field1046];
                            field1061 = new int[this.field1046];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field1031) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field1032) {
                                        break label118;
                                    }
                                    short var80 = this.field1030[var79];
                                    short var81 = this.field1007[var79];
                                    short var82 = this.field1014[var79];
                                    if (this.method516(class147.field2196, class175.field2794, field1061[var80], field1061[var81], field1061[var82], field1065[var80], field1065[var81], field1065[var82])) {
                                        class250.field3974[class283.field4470++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field1006[var59];
                            int var61 = this.field1010[var59];
                            int var62 = this.field1024[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field1005[var59];
                            int var76 = this.field1005[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field1008[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field1065[var78] = var73;
                                field1061[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class186.field2990;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method528();
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "()V", line = 1179)
    public static final void method511() {
        field1042 = new class75();
        field1050 = new class75();
        field1051 = new class75();
        field1052 = new class75();
        field1053 = new class75();
        field1054 = new class75();
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)V", line = 1188)
    public final void method512(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field1058 = 0;
            field1056 = 0;
            field1057 = 0;
            for (int var6 = 0; var6 < this.field1021; var6++) {
                field1058 += this.field1006[var6];
                field1056 += this.field1010[var6];
                field1057 += this.field1024[var6];
                var5++;
            }
            if (var5 > 0) {
                field1058 = field1058 / var5 + arg1;
                field1056 = field1056 / var5 + arg2;
                field1057 = field1057 / var5 + arg3;
            } else {
                field1058 = arg1;
                field1056 = arg2;
                field1057 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field1021; var7++) {
                this.field1006[var7] += arg1;
                this.field1010[var7] += arg2;
                this.field1024[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field1021; var8++) {
                this.field1006[var8] -= field1058;
                this.field1010[var8] -= field1056;
                this.field1024[var8] -= field1057;
                if (arg3 != 0) {
                    int var9 = class25.field355[arg3];
                    int var10 = class25.field359[arg3];
                    int var11 = this.field1010[var8] * var9 + this.field1006[var8] * var10 + 32767 >> 16;
                    this.field1010[var8] = this.field1010[var8] * var10 + 32767 - this.field1006[var8] * var9 >> 16;
                    this.field1006[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class25.field355[arg1];
                    int var13 = class25.field359[arg1];
                    int var14 = this.field1010[var8] * var13 + 32767 - this.field1024[var8] * var12 >> 16;
                    this.field1024[var8] = this.field1024[var8] * var13 + this.field1010[var8] * var12 + 32767 >> 16;
                    this.field1010[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class25.field355[arg2];
                    int var16 = class25.field359[arg2];
                    int var17 = this.field1024[var8] * var15 + this.field1006[var8] * var16 + 32767 >> 16;
                    this.field1024[var8] = this.field1024[var8] * var16 + 32767 - this.field1006[var8] * var15 >> 16;
                    this.field1006[var8] = var17;
                }
                this.field1006[var8] += field1058;
                this.field1010[var8] += field1056;
                this.field1024[var8] += field1057;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field1021; var18++) {
                this.field1006[var18] -= field1058;
                this.field1010[var18] -= field1056;
                this.field1024[var18] -= field1057;
                this.field1006[var18] = this.field1006[var18] * arg1 / 128;
                this.field1010[var18] = this.field1010[var18] * arg2 / 128;
                this.field1024[var18] = this.field1024[var18] * arg3 / 128;
                this.field1006[var18] += field1058;
                this.field1010[var18] += field1056;
                this.field1024[var18] += field1057;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field1032; var19++) {
                int var20 = (this.field1043[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field1043[var19] = (byte) var20;
            }
            this.field1047.field1236 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field1032; var21++) {
                int var22 = this.field1009[var21] & 0xFFFF;
                int var23 = var22 >> 10 & 0x3F;
                int var24 = var22 >> 7 & 0x7;
                int var25 = var22 & 0x7F;
                int var26 = arg1 + var23 & 0x3F;
                int var27 = arg2 / 4 + var24;
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 7) {
                    var27 = 7;
                }
                int var28 = arg3 + var25;
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 127) {
                    var28 = 127;
                }
                this.field1009[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field1047.field1236 = false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "()I", line = 1385)
    public final int method513() {
        if (!this.field1041.field4391) {
            this.method544();
        }
        return this.field1041.field4387;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIFFF)[F", line = 1393)
    private static final float[] method514(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float var8 = 1.0F;
        float var9 = 0.0F;
        float var10 = (float) arg1 / 32767.0F;
        float var11 = -((float) Math.sqrt((double) (1.0F - var10 * var10)));
        float var12 = 1.0F - var10;
        float var13 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var13 != 0.0F) {
            var8 = (float) (-arg2) / var13;
            var9 = (float) arg0 / var13;
        }
        var7[0] = var8 * var8 * var12 + var10;
        var7[1] = var9 * var11;
        var7[2] = var8 * var9 * var12;
        var7[3] = -var9 * var11;
        var7[4] = var10;
        var7[5] = var8 * var11;
        var7[6] = var8 * var9 * var12;
        var7[7] = -var8 * var11;
        var7[8] = var9 * var9 * var12 + var10;
        float[] var14 = new float[9];
        float var15 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var16 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var17 = 1.0F - var15;
        var14[0] = var15;
        var14[1] = 0.0F;
        var14[2] = var16;
        var14[3] = 0.0F;
        var14[4] = 1.0F;
        var14[5] = 0.0F;
        var14[6] = -var16;
        var14[7] = 0.0F;
        var14[8] = var15;
        float[] var18 = new float[] { var7[6] * var14[2] + var7[0] * var14[0] + var7[3] * var14[1], var7[7] * var14[2] + var7[1] * var14[0] + var7[4] * var14[1], var7[8] * var14[2] + var7[2] * var14[0] + var7[5] * var14[1], var7[6] * var14[5] + var7[0] * var14[3] + var7[3] * var14[4], var7[7] * var14[5] + var7[1] * var14[3] + var7[4] * var14[4], var7[8] * var14[5] + var7[2] * var14[3] + var7[5] * var14[4], var7[6] * var14[8] + var7[0] * var14[6] + var7[3] * var14[7], var7[7] * var14[8] + var7[1] * var14[6] + var7[4] * var14[7], var7[8] * var14[8] + var7[2] * var14[6] + var7[5] * var14[7] };
        var18[0] *= arg4;
        var18[1] *= arg4;
        var18[2] *= arg4;
        var18[3] *= arg5;
        var18[4] *= arg5;
        var18[5] *= arg5;
        var18[6] *= arg6;
        var18[7] *= arg6;
        var18[8] *= arg6;
        return var18;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 1461)
    public final void method515(int arg0) {
        int var2 = class25.field355[arg0];
        int var3 = class25.field359[arg0];
        for (int var4 = 0; var4 < this.field1021; var4++) {
            int var5 = this.field1010[var4] * var2 + this.field1006[var4] * var3 >> 16;
            this.field1010[var4] = this.field1010[var4] * var3 - this.field1006[var4] * var2 >> 16;
            this.field1006[var4] = var5;
        }
        this.field1041.field4391 = false;
        this.field1011.field1236 = false;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIII)Z", line = 1480)
    private final boolean method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZZZZZZZZZZZ)Lcd;", line = 1496)
    public final class75 method517(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class75 var12 = new class75();
        var12.field1021 = this.field1021;
        var12.field1031 = this.field1031;
        var12.field1046 = this.field1046;
        var12.field1032 = this.field1032;
        if (arg0) {
            var12.field1006 = this.field1006;
            var12.field1024 = this.field1024;
        } else {
            var12.field1006 = class97.method692(this.field1006, (byte) -94);
            var12.field1024 = class97.method692(this.field1024, (byte) -94);
        }
        if (arg1) {
            var12.field1010 = this.field1010;
        } else {
            var12.field1010 = class97.method692(this.field1010, (byte) -94);
        }
        if (arg0 && arg1) {
            var12.field1011 = this.field1011;
            var12.field1041 = this.field1041;
        } else {
            var12.field1011 = new class81();
            var12.field1041 = new class278();
        }
        if (arg2) {
            var12.field1009 = this.field1009;
        } else {
            var12.field1009 = class170.method1170(0, this.field1009);
        }
        if (arg3) {
            var12.field1043 = this.field1043;
        } else {
            var12.field1043 = class60.method414((byte) 122, this.field1043);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class269.field4250) {
            var12.field1047 = new class81();
        } else {
            var12.field1047 = this.field1047;
        }
        if (arg5) {
            var12.field1019 = this.field1019;
            var12.field1044 = this.field1044;
            var12.field1015 = this.field1015;
            var12.field1034 = this.field1034;
        } else {
            var12.field1019 = class170.method1170(0, this.field1019);
            var12.field1044 = class170.method1170(0, this.field1044);
            var12.field1015 = class170.method1170(0, this.field1015);
            var12.field1034 = class170.method1170(0, this.field1034);
        }
        if (!class269.field4250) {
            var12.field1049 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field1049 = this.field1049;
        } else {
            var12.field1049 = new class81();
        }
        if (arg8) {
            var12.field1027 = this.field1027;
            var12.field1038 = this.field1038;
            var12.field1040 = this.field1040;
        } else {
            var12.field1027 = class89.method643(this.field1027, -1);
            var12.field1038 = class89.method643(this.field1038, -1);
            var12.field1040 = new class81();
        }
        if (arg9) {
            var12.field1030 = this.field1030;
            var12.field1007 = this.field1007;
            var12.field1014 = this.field1014;
            var12.field1028 = this.field1028;
        } else {
            var12.field1030 = class170.method1170(0, this.field1030);
            var12.field1007 = class170.method1170(0, this.field1007);
            var12.field1014 = class170.method1170(0, this.field1014);
            var12.field1028 = new class81();
        }
        if (arg10) {
            var12.field1033 = this.field1033;
        } else {
            var12.field1033 = class170.method1170(0, this.field1033);
        }
        var12.field1022 = this.field1022;
        var12.field1023 = this.field1023;
        var12.field1017 = this.field1017;
        var12.field1045 = this.field1045;
        var12.field1037 = this.field1037;
        var12.field1008 = this.field1008;
        var12.field1005 = this.field1005;
        var12.field1039 = this.field1039;
        var12.field1020 = this.field1020;
        var12.field1035 = this.field1035;
        var12.field1029 = this.field1029;
        return var12;
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "()V", line = 1636)
    public final void method518() {
        for (int var1 = 0; var1 < this.field1021; var1++) {
            this.field1006[var1] = this.field1006[var1] + 7 >> 4;
            this.field1010[var1] = this.field1010[var1] + 7 >> 4;
            this.field1024[var1] = this.field1024[var1] + 7 >> 4;
        }
        this.field1041.field4391 = false;
        this.field1011.field1236 = false;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(III)V", line = 1653)
    public final void method519(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1021; var4++) {
            this.field1006[var4] += arg0;
            this.field1010[var4] += arg1;
            this.field1024[var4] += arg2;
        }
        this.field1041.field4391 = false;
        this.field1011.field1236 = false;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 1667)
    public final void method520(int arg0) {
        int var2 = class25.field355[arg0];
        int var3 = class25.field359[arg0];
        for (int var4 = 0; var4 < this.field1021; var4++) {
            int var5 = this.field1010[var4] * var3 - this.field1024[var4] * var2 >> 16;
            this.field1024[var4] = this.field1024[var4] * var3 + this.field1010[var4] * var2 >> 16;
            this.field1010[var4] = var5;
        }
        this.field1041.field4391 = false;
        this.field1011.field1236 = false;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "()I", line = 1686)
    public final int method521() {
        if (!this.field1041.field4391) {
            this.method544();
        }
        return this.field1041.field4389;
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V", line = 1695)
    public final void method522(int arg0) {
        this.field1039 = (short) arg0;
        this.field1047.field1236 = false;
    }

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "()V", line = 1700)
    public final void method523() {
        if (this.field1019 == null) {
            this.method503();
            return;
        }
        for (int var1 = 0; var1 < this.field1021; var1++) {
            int var2 = this.field1006[var1];
            this.field1006[var1] = this.field1024[var1];
            this.field1024[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field1046; var3++) {
            short var4 = this.field1019[var3];
            this.field1019[var3] = this.field1015[var3];
            this.field1015[var3] = (short) (-var4);
        }
        this.field1041.field4391 = false;
        this.field1011.field1236 = false;
        if (this.field1049 != null) {
            this.field1049.field1236 = false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "()V", line = 1742)
    public final void method524() {
        for (int var1 = 0; var1 < this.field1021; var1++) {
            int var2 = this.field1024[var1];
            this.field1024[var1] = this.field1006[var1];
            this.field1006[var1] = -var2;
        }
        this.field1041.field4391 = false;
        this.field1011.field1236 = false;
    }

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "()I", line = 1756)
    public final int method525() {
        if (!this.field1041.field4391) {
            this.method544();
        }
        return this.field1041.field4388;
    }

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "()I", line = 1766)
    public final int method526() {
        return this.field1039;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(ZZZ)Llf;", line = 1772)
    public final class134 method527(boolean arg0, boolean arg1, boolean arg2) {
        return this.method539(arg0, arg1, arg2, field1054, field1053);
    }

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "()V", line = 1777)
    private final void method528() {
        GL var1 = class186.field2990;
        if (this.field1032 == 0) {
            return;
        }
        if (this.field1016 != 0) {
            this.method541(true, !this.field1011.field1236 && (this.field1016 & 0x1) != 0, !this.field1047.field1236 && (this.field1016 & 0x2) != 0, this.field1049 != null && !this.field1049.field1236 && (this.field1016 & 0x4) != 0, false);
        }
        this.method541(false, !this.field1011.field1236, !this.field1047.field1236, this.field1049 != null && !this.field1049.field1236, !this.field1040.field1236);
        if (!this.field1028.field1236) {
            this.method546();
        }
        if (this.field1036 != 0) {
            if ((this.field1036 & 0x1) != 0) {
                this.field1006 = null;
                this.field1010 = null;
                this.field1024 = null;
                this.field1008 = null;
                this.field1005 = null;
            }
            if ((this.field1036 & 0x2) != 0) {
                this.field1009 = null;
                this.field1043 = null;
            }
            if ((this.field1036 & 0x4) != 0) {
                this.field1019 = null;
                this.field1044 = null;
                this.field1015 = null;
                this.field1034 = null;
            }
            if ((this.field1036 & 0x8) != 0) {
                this.field1027 = null;
                this.field1038 = null;
            }
            if ((this.field1036 & 0x10) != 0) {
                this.field1030 = null;
                this.field1007 = null;
                this.field1014 = null;
            }
            this.field1036 = 0;
        }
        class207 var2 = null;
        if (this.field1011.field1235 != null) {
            this.field1011.field1235.method1517();
            var2 = this.field1011.field1235;
            var1.glVertexPointer(3, 5126, this.field1011.field1234, (long) this.field1011.field1228);
        }
        if (this.field1047.field1235 != null) {
            if (this.field1047.field1235 != var2) {
                this.field1047.field1235.method1517();
                var2 = this.field1047.field1235;
            }
            var1.glColorPointer(4, 5121, this.field1047.field1234, (long) this.field1047.field1228);
        }
        if (class269.field4250 && this.field1049.field1235 != null) {
            if (this.field1049.field1235 != var2) {
                this.field1049.field1235.method1517();
                var2 = this.field1049.field1235;
            }
            var1.glNormalPointer(5126, this.field1049.field1234, (long) this.field1049.field1228);
        }
        if (this.field1040.field1235 != null) {
            if (this.field1040.field1235 != var2) {
                this.field1040.field1235.method1517();
                class207 var3 = this.field1040.field1235;
            }
            var1.glTexCoordPointer(2, 5126, this.field1040.field1234, (long) this.field1040.field1228);
        }
        if (this.field1028.field1235 != null) {
            this.field1028.field1235.method1516();
        }
        if (this.field1011.field1235 == null || this.field1047.field1235 == null || class269.field4250 && this.field1049.field1235 == null || this.field1040.field1235 == null) {
            if (class186.field3027) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field1011.field1235 == null) {
                this.field1011.field1239.position(this.field1011.field1228);
                var1.glVertexPointer(3, 5126, this.field1011.field1234, this.field1011.field1239);
            }
            if (this.field1047.field1235 == null) {
                this.field1047.field1239.position(this.field1047.field1228);
                var1.glColorPointer(4, 5121, this.field1047.field1234, this.field1047.field1239);
            }
            if (class269.field4250 && this.field1049.field1235 == null) {
                this.field1049.field1239.position(this.field1049.field1228);
                var1.glNormalPointer(5126, this.field1049.field1234, this.field1049.field1239);
            }
            if (this.field1040.field1235 == null) {
                this.field1040.field1239.position(this.field1040.field1228);
                var1.glTexCoordPointer(2, 5126, this.field1040.field1234, this.field1040.field1239);
            }
        }
        if (this.field1028.field1235 == null && class186.field3027) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field1037.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field1037[var5];
            int var7 = this.field1037[var5 + 1];
            short var8 = this.field1033[var6];
            if (var8 == -1) {
                class186.method1288(-1);
                class188.method1328(0, 0, (byte) 123);
            } else {
                class25.field365.method381(110, var8 & 0xFFFF);
            }
            if (this.field1028.field1235 == null) {
                this.field1028.field1239.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field1028.field1239);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "()V", line = 1948)
    public final void method529() {
        if (this.field1019 == null) {
            this.method524();
            return;
        }
        for (int var1 = 0; var1 < this.field1021; var1++) {
            int var2 = this.field1024[var1];
            this.field1024[var1] = this.field1006[var1];
            this.field1006[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field1046; var3++) {
            short var4 = this.field1015[var3];
            this.field1015[var3] = this.field1019[var3];
            this.field1019[var3] = (short) (-var4);
        }
        this.field1041.field4391 = false;
        this.field1011.field1236 = false;
        if (this.field1049 != null) {
            this.field1049.field1236 = false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V", line = 1987)
    public final void method530(int arg0) {
        int var2 = class25.field355[arg0];
        int var3 = class25.field359[arg0];
        for (int var4 = 0; var4 < this.field1021; var4++) {
            int var5 = this.field1024[var4] * var2 + this.field1006[var4] * var3 >> 16;
            this.field1024[var4] = this.field1024[var4] * var3 - this.field1006[var4] * var2 >> 16;
            this.field1006[var4] = var5;
        }
        this.field1041.field4391 = false;
        this.field1011.field1236 = false;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(III)V", line = 2008)
    public final void method531(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1021; var4++) {
            this.field1006[var4] = this.field1006[var4] * arg0 >> 7;
            this.field1010[var4] = this.field1010[var4] * arg1 >> 7;
            this.field1024[var4] = this.field1024[var4] * arg2 >> 7;
        }
        this.field1041.field4391 = false;
        this.field1011.field1236 = false;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 2023)
    private static final void method532(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field1066 = var18;
        field1059 = var19;
    }

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "()V", line = 2103)
    public final void method533() {
        for (int var1 = 0; var1 < this.field1021; var1++) {
            this.field1006[var1] = -this.field1006[var1];
            this.field1024[var1] = -this.field1024[var1];
        }
        this.field1041.field4391 = false;
        this.field1011.field1236 = false;
    }

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "()V", line = 2115)
    public static void method534() {
        field1012 = null;
        field1025 = null;
        field1048 = null;
        field1042 = null;
        field1050 = null;
        field1051 = null;
        field1052 = null;
        field1053 = null;
        field1054 = null;
        field1065 = null;
        field1061 = null;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "()I", line = 2128)
    public final int method535() {
        if (!this.field1041.field4391) {
            this.method544();
        }
        return this.field1041.field4392;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lle;IJIIIIFF)S", line = 2135)
    private final short method536(class259 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field1005[arg1];
        int var12 = this.field1005[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field1008[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field1012[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field1008[var13] = (short) (this.field1046 + 1);
        field1012[var13] = arg2;
        this.field1019[this.field1046] = (short) arg3;
        this.field1044[this.field1046] = (short) arg4;
        this.field1015[this.field1046] = (short) arg5;
        this.field1034[this.field1046] = (short) arg6;
        this.field1027[this.field1046] = arg7;
        this.field1038[this.field1046] = arg8;
        return (short) (this.field1046++);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILcd;[[I[[IIII)V", line = 2170)
    public final void method537(int arg0, int arg1, class75 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field1041.field4391) {
            arg2.method544();
        }
        int var9 = arg2.field1041.field4388 + arg5;
        int var10 = arg2.field1041.field4392 + arg5;
        int var11 = arg2.field1041.field4387 + arg7;
        int var12 = arg2.field1041.field4386 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field1031; var17++) {
                int var18 = this.field1006[var17] + arg5;
                int var19 = this.field1024[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field1010[var17] = this.field1010[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field1041.field4390;
            for (int var28 = 0; var28 < this.field1031; var28++) {
                int var29 = (this.field1010[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field1006[var28] + arg5;
                    int var31 = this.field1024[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field1010[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method917(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field1041.field4389 - arg2.field1041.field4390;
            for (int var42 = 0; var42 < this.field1031; var42++) {
                int var43 = this.field1006[var42] + arg5;
                int var44 = this.field1024[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field1010[var42] = var51 + this.field1010[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field1041.field4389 - arg2.field1041.field4390;
            for (int var53 = 0; var53 < this.field1031; var53++) {
                int var54 = this.field1006[var53] + arg5;
                int var55 = this.field1024[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field1010[var53] = ((this.field1010[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field1011.field1236 = false;
        this.field1041.field4391 = false;
    }

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "()I", line = 2370)
    public final int method538() {
        if (!this.field1041.field4391) {
            this.method544();
        }
        return this.field1041.field4385;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZZZLcd;Lcd;)Llf;", line = 2380)
    private final class134 method539(boolean arg0, boolean arg1, boolean arg2, class75 arg3, class75 arg4) {
        arg3.field1021 = this.field1021;
        arg3.field1031 = this.field1031;
        arg3.field1046 = this.field1046;
        arg3.field1032 = this.field1032;
        arg3.field1039 = this.field1039;
        arg3.field1020 = this.field1020;
        arg3.field1016 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field1006 == null || arg3.field1006.length < this.field1021) {
            arg3.field1006 = new int[this.field1021 + 100];
            arg3.field1010 = new int[this.field1021 + 100];
            arg3.field1024 = new int[this.field1021 + 100];
        }
        for (int var6 = 0; var6 < this.field1021; var6++) {
            arg3.field1006[var6] = this.field1006[var6];
            arg3.field1010[var6] = this.field1010[var6];
            arg3.field1024[var6] = this.field1024[var6];
        }
        if (arg3.field1011 == null) {
            arg3.field1011 = new class81();
        }
        arg3.field1011.field1236 = false;
        if (arg3.field1041 == null) {
            arg3.field1041 = new class278();
        }
        arg3.field1041.field4391 = false;
        if (arg0) {
            arg3.field1043 = this.field1043;
        } else {
            if (arg4.field1043 == null || arg4.field1043.length < this.field1032) {
                arg4.field1043 = new byte[this.field1032 + 100];
            }
            arg3.field1043 = arg4.field1043;
            for (int var7 = 0; var7 < this.field1032; var7++) {
                arg3.field1043[var7] = this.field1043[var7];
            }
        }
        if (arg1) {
            arg3.field1009 = this.field1009;
        } else {
            if (arg4.field1009 == null || arg4.field1009.length < this.field1032) {
                arg4.field1009 = new short[this.field1032 + 100];
            }
            arg3.field1009 = arg4.field1009;
            for (int var8 = 0; var8 < this.field1032; var8++) {
                arg3.field1009[var8] = this.field1009[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field1047 = this.field1047;
        } else {
            if (arg4.field1047 == null) {
                arg4.field1047 = new class81();
            }
            arg3.field1047 = arg4.field1047;
            arg3.field1047.field1236 = false;
        }
        if (arg2 || this.field1019 == null) {
            arg3.field1019 = this.field1019;
            arg3.field1044 = this.field1044;
            arg3.field1015 = this.field1015;
            arg3.field1034 = this.field1034;
            arg3.field1049 = this.field1049;
        } else {
            if (arg4.field1019 == null || arg4.field1019.length < this.field1046) {
                arg4.field1019 = new short[this.field1046 + 100];
                arg4.field1044 = new short[this.field1046 + 100];
                arg4.field1015 = new short[this.field1046 + 100];
                arg4.field1034 = new short[this.field1046 + 100];
            }
            arg3.field1019 = arg4.field1019;
            arg3.field1044 = arg4.field1044;
            arg3.field1015 = arg4.field1015;
            arg3.field1034 = arg4.field1034;
            for (int var9 = 0; var9 < this.field1046; var9++) {
                arg3.field1019[var9] = this.field1019[var9];
                arg3.field1044[var9] = this.field1044[var9];
                arg3.field1015[var9] = this.field1015[var9];
                arg3.field1034[var9] = this.field1034[var9];
            }
            if (class269.field4250) {
                if (arg4.field1049 == null) {
                    arg4.field1049 = new class81();
                }
                arg3.field1049 = arg4.field1049;
                arg3.field1049.field1236 = false;
            } else {
                arg3.field1049 = null;
            }
        }
        arg3.field1027 = this.field1027;
        arg3.field1038 = this.field1038;
        arg3.field1022 = this.field1022;
        arg3.field1023 = this.field1023;
        arg3.field1030 = this.field1030;
        arg3.field1007 = this.field1007;
        arg3.field1014 = this.field1014;
        arg3.field1033 = this.field1033;
        arg3.field1017 = this.field1017;
        arg3.field1045 = this.field1045;
        arg3.field1040 = this.field1040;
        arg3.field1028 = this.field1028;
        arg3.field1037 = this.field1037;
        arg3.field1008 = this.field1008;
        arg3.field1005 = this.field1005;
        arg3.field2042 = this.field2042;
        arg3.field1035 = this.field1035;
        arg3.field1029 = this.field1029;
        return arg3;
    }

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "()V", line = 2535)
    public final void method540() {
        for (int var1 = 0; var1 < this.field1021; var1++) {
            this.field1024[var1] = -this.field1024[var1];
        }
        if (this.field1015 != null) {
            for (int var2 = 0; var2 < this.field1046; var2++) {
                this.field1015[var2] = (short) (-this.field1015[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field1032; var3++) {
            short var4 = this.field1030[var3];
            this.field1030[var3] = this.field1014[var3];
            this.field1014[var3] = var4;
        }
        this.field1041.field4391 = false;
        this.field1011.field1236 = false;
        if (this.field1049 != null) {
            this.field1049.field1236 = false;
        }
        this.field1028.field1236 = false;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZZZZZ)V", line = 2572)
    private final void method541(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field1011.field1228 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field1047.field1228 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field1049.field1228 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field1040.field1228 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field1025.field3128.length < this.field1046 * var6) {
            field1025 = new class192((this.field1046 + 100) * var6);
        } else {
            field1025.field3129 = 0;
        }
        if (arg1) {
            if (class186.field3014) {
                for (int var7 = 0; var7 < this.field1031; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field1006[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field1010[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field1024[var7]);
                    int var11 = this.field1005[var7];
                    int var12 = this.field1005[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field1008[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field1025.field3129 = var6 * var14;
                        field1025.method1350(var8, -79);
                        field1025.method1350(var9, -44);
                        field1025.method1350(var10, -52);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field1031; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field1006[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field1010[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field1024[var15]);
                    int var19 = this.field1005[var15];
                    int var20 = this.field1005[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field1008[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field1025.field3129 = var6 * var22;
                        field1025.method1400(var16, (byte) -94);
                        field1025.method1400(var17, (byte) -108);
                        field1025.method1400(var18, (byte) -119);
                    }
                }
            }
        }
        if (arg2) {
            if (class269.field4250) {
                for (int var42 = 0; var42 < this.field1032; var42++) {
                    int var43 = method492(this.field1009[var42], this.field1033[var42], this.field1039, this.field1043[var42]);
                    field1025.field3129 = this.field1030[var42] * var6 + this.field1047.field1228;
                    field1025.method1350(var43, -82);
                    field1025.field3129 = this.field1007[var42] * var6 + this.field1047.field1228;
                    field1025.method1350(var43, -49);
                    field1025.field3129 = this.field1014[var42] * var6 + this.field1047.field1228;
                    field1025.method1350(var43, -125);
                }
            } else {
                int var23 = (int) class109.field1637[0];
                int var24 = (int) class109.field1637[1];
                int var25 = (int) class109.field1637[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field1039 * 1.3F);
                int var28 = this.field1020 * var26 >> 8;
                for (int var29 = 0; var29 < this.field1032; var29++) {
                    short var30 = this.field1030[var29];
                    short var31 = this.field1034[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field1015[var30] * var25 + this.field1044[var30] * var24 + this.field1019[var30] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field1015[var30] * var25 + this.field1044[var30] * var24 + this.field1019[var30] * var23) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field1034[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field1007[var29];
                    short var34 = this.field1034[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field1015[var33] * var25 + this.field1044[var33] * var24 + this.field1019[var33] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field1015[var33] * var25 + this.field1044[var33] * var24 + this.field1019[var33] * var23) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field1034[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field1014[var29];
                    short var37 = this.field1034[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field1015[var36] * var25 + this.field1044[var36] * var24 + this.field1019[var36] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field1015[var36] * var25 + this.field1044[var36] * var24 + this.field1019[var36] * var23) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field1034[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method492(this.field1009[var29], this.field1033[var29], var32, this.field1043[var29]);
                    int var40 = method492(this.field1009[var29], this.field1033[var29], var35, this.field1043[var29]);
                    int var41 = method492(this.field1009[var29], this.field1033[var29], var38, this.field1043[var29]);
                    field1025.field3129 = var6 * var30 + this.field1047.field1228;
                    field1025.method1350(var39, -97);
                    field1025.field3129 = var6 * var33 + this.field1047.field1228;
                    field1025.method1350(var40, -49);
                    field1025.field3129 = var6 * var36 + this.field1047.field1228;
                    field1025.method1350(var41, -78);
                }
                this.field1019 = null;
                this.field1044 = null;
                this.field1015 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field1020;
            float var45 = 3.0F / (float) (this.field1020 / 2 + this.field1020);
            field1025.field3129 = this.field1049.field1228;
            if (class186.field3014) {
                for (int var46 = 0; var46 < this.field1046; var46++) {
                    short var47 = this.field1034[var46];
                    if (var47 == 0) {
                        field1025.method1345(31252, (float) this.field1019[var46] * var45);
                        field1025.method1345(31252, (float) this.field1044[var46] * var45);
                        field1025.method1345(31252, (float) this.field1015[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field1025.method1345(31252, (float) this.field1019[var46] * var48);
                        field1025.method1345(31252, (float) this.field1044[var46] * var48);
                        field1025.method1345(31252, (float) this.field1015[var46] * var48);
                    }
                    field1025.field3129 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field1046; var49++) {
                    short var50 = this.field1034[var49];
                    if (var50 == 0) {
                        field1025.method1373(111, (float) this.field1019[var49] * var45);
                        field1025.method1373(77, (float) this.field1044[var49] * var45);
                        field1025.method1373(52, (float) this.field1015[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field1025.method1373(124, (float) this.field1019[var49] * var51);
                        field1025.method1373(59, (float) this.field1044[var49] * var51);
                        field1025.method1373(81, (float) this.field1015[var49] * var51);
                    }
                    field1025.field3129 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field1025.field3129 = this.field1040.field1228;
            if (class186.field3014) {
                for (int var52 = 0; var52 < this.field1046; var52++) {
                    field1025.method1345(31252, this.field1027[var52]);
                    field1025.method1345(31252, this.field1038[var52]);
                    field1025.field3129 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field1046; var53++) {
                    field1025.method1373(108, this.field1027[var53]);
                    field1025.method1373(59, this.field1038[var53]);
                    field1025.field3129 += var6 - 8;
                }
            }
        }
        field1025.field3129 = this.field1046 * var6;
        if (arg0) {
            if (class186.field2984) {
                ByteBuffer var54 = ByteBuffer.wrap(field1025.field3128, 0, field1025.field3129);
                if (this.field1018 == null) {
                    this.field1018 = new class207(true);
                    this.field1018.method1518(var54);
                } else {
                    this.field1018.method1515(var54);
                }
                if (arg1) {
                    this.field1011.field1236 = true;
                    this.field1011.field1239 = null;
                    this.field1011.field1235 = this.field1018;
                    this.field1011.field1234 = var6;
                }
                if (arg2) {
                    this.field1047.field1236 = true;
                    this.field1047.field1239 = null;
                    this.field1047.field1235 = this.field1018;
                    this.field1047.field1234 = var6;
                }
                if (arg3) {
                    this.field1049.field1236 = true;
                    this.field1049.field1239 = null;
                    this.field1049.field1235 = this.field1018;
                    this.field1049.field1234 = var6;
                }
                if (arg4) {
                    this.field1040.field1236 = true;
                    this.field1040.field1239 = null;
                    this.field1040.field1235 = this.field1018;
                    this.field1040.field1234 = var6;
                }
            } else {
                if (field1048 == null || field1048.capacity() < field1025.field3129) {
                    field1048 = ByteBuffer.allocateDirect(var6 * 100 + field1025.field3129);
                } else {
                    field1048.clear();
                }
                field1048.put(field1025.field3128, 0, field1025.field3129);
                field1048.flip();
                if (arg1) {
                    this.field1011.field1236 = true;
                    this.field1011.field1239 = field1048;
                    this.field1011.field1235 = null;
                    this.field1011.field1234 = var6;
                }
                if (arg2) {
                    this.field1047.field1236 = true;
                    this.field1047.field1239 = field1048;
                    this.field1011.field1235 = null;
                    this.field1047.field1234 = var6;
                }
                if (arg3) {
                    this.field1049.field1236 = true;
                    this.field1049.field1239 = field1048;
                    this.field1049.field1235 = null;
                    this.field1049.field1234 = var6;
                }
                if (arg4) {
                    this.field1040.field1236 = true;
                    this.field1040.field1239 = field1048;
                    this.field1040.field1235 = null;
                    this.field1040.field1234 = var6;
                }
            }
        } else if (class186.field3027) {
            class207 var55 = new class207();
            ByteBuffer var56 = ByteBuffer.wrap(field1025.field3128, 0, field1025.field3129);
            var55.method1518(var56);
            if (arg1) {
                this.field1011.field1236 = true;
                this.field1011.field1239 = null;
                this.field1011.field1235 = var55;
                this.field1011.field1234 = var6;
            }
            if (arg2) {
                this.field1047.field1236 = true;
                this.field1047.field1239 = null;
                this.field1047.field1235 = var55;
                this.field1047.field1234 = var6;
            }
            if (arg3) {
                this.field1049.field1236 = true;
                this.field1049.field1239 = null;
                this.field1049.field1235 = var55;
                this.field1049.field1234 = var6;
            }
            if (arg4) {
                this.field1040.field1236 = true;
                this.field1040.field1239 = null;
                this.field1040.field1235 = var55;
                this.field1040.field1234 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field1025.field3129);
            var57.put(field1025.field3128, 0, field1025.field3129);
            var57.flip();
            if (arg1) {
                this.field1011.field1236 = true;
                this.field1011.field1239 = var57;
                this.field1011.field1235 = null;
                this.field1011.field1234 = var6;
            }
            if (arg2) {
                this.field1047.field1236 = true;
                this.field1047.field1239 = var57;
                this.field1011.field1235 = null;
                this.field1047.field1234 = var6;
            }
            if (arg3) {
                this.field1049.field1236 = true;
                this.field1049.field1239 = var57;
                this.field1049.field1235 = null;
                this.field1049.field1234 = var6;
            }
            if (arg4) {
                this.field1040.field1236 = true;
                this.field1040.field1239 = var57;
                this.field1040.field1235 = null;
                this.field1040.field1234 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(ZZZ)Llf;", line = 3103)
    public final class134 method542(boolean arg0, boolean arg1, boolean arg2) {
        return this.method539(arg0, arg1, arg2, field1050, field1042);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[IIIIZI[I)V", line = 3107)
    public final void method543(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field1058 = 0;
            field1056 = 0;
            field1057 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field1023.length) {
                    int[] var16 = this.field1023[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field1035 == null || (arg6 & this.field1035[var18]) != 0) {
                            field1058 += this.field1006[var18];
                            field1056 += this.field1010[var18];
                            field1057 += this.field1024[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field1058 = field1058 / var13 + var10;
                field1056 = field1056 / var13 + var11;
                field1057 = field1057 / var13 + var12;
                field1063 = true;
            } else {
                field1058 = var10;
                field1056 = var11;
                field1057 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field1023.length) {
                    int[] var27 = this.field1023[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field1035 == null || (arg6 & this.field1035[var29]) != 0) {
                            this.field1006[var29] += var22;
                            this.field1010[var29] += var23;
                            this.field1024[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field1023.length) {
                        int[] var92 = this.field1023[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field1035 == null || (arg6 & this.field1035[var94]) != 0) {
                                this.field1006[var94] -= field1058;
                                this.field1010[var94] -= field1056;
                                this.field1024[var94] -= field1057;
                                if (arg4 != 0) {
                                    int var95 = class25.field355[arg4];
                                    int var96 = class25.field359[arg4];
                                    int var97 = this.field1010[var94] * var95 + this.field1006[var94] * var96 + 32767 >> 16;
                                    this.field1010[var94] = this.field1010[var94] * var96 + 32767 - this.field1006[var94] * var95 >> 16;
                                    this.field1006[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class25.field355[arg2];
                                    int var99 = class25.field359[arg2];
                                    int var100 = this.field1010[var94] * var99 + 32767 - this.field1024[var94] * var98 >> 16;
                                    this.field1024[var94] = this.field1024[var94] * var99 + this.field1010[var94] * var98 + 32767 >> 16;
                                    this.field1010[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class25.field355[arg3];
                                    int var102 = class25.field359[arg3];
                                    int var103 = this.field1024[var94] * var101 + this.field1006[var94] * var102 + 32767 >> 16;
                                    this.field1024[var94] = this.field1024[var94] * var102 + 32767 - this.field1006[var94] * var101 >> 16;
                                    this.field1006[var94] = var103;
                                }
                                this.field1006[var94] += field1058;
                                this.field1010[var94] += field1056;
                                this.field1024[var94] += field1057;
                            }
                        }
                    }
                }
                if (arg5 && this.field1019 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field1023.length) {
                            int[] var106 = this.field1023[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field1035 == null || (arg6 & this.field1035[var108]) != 0) {
                                    int var109 = this.field1005[var108];
                                    int var110 = this.field1005[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field1008[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class25.field355[arg4];
                                            int var114 = class25.field359[arg4];
                                            int var115 = this.field1044[var112] * var113 + this.field1019[var112] * var114 + 32767 >> 16;
                                            this.field1044[var112] = (short) (this.field1044[var112] * var114 + 32767 - this.field1019[var112] * var113 >> 16);
                                            this.field1019[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class25.field355[arg2];
                                            int var117 = class25.field359[arg2];
                                            int var118 = this.field1044[var112] * var117 + 32767 - this.field1015[var112] * var116 >> 16;
                                            this.field1015[var112] = (short) (this.field1044[var112] * var116 + this.field1015[var112] * var117 + 32767 >> 16);
                                            this.field1044[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class25.field355[arg3];
                                            int var120 = class25.field359[arg3];
                                            int var121 = this.field1019[var112] * var120 + this.field1015[var112] * var119 + 32767 >> 16;
                                            this.field1015[var112] = (short) (this.field1015[var112] * var120 + 32767 - this.field1019[var112] * var119 >> 16);
                                            this.field1019[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field1049 != null) {
                        this.field1049.field1236 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field1063) {
                    int var36 = arg7[6] * field1057 + arg7[0] * field1058 + arg7[3] * field1056 + 16384 >> 15;
                    int var37 = arg7[7] * field1057 + arg7[1] * field1058 + arg7[4] * field1056 + 16384 >> 15;
                    int var38 = arg7[8] * field1057 + arg7[2] * field1058 + arg7[5] * field1056 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field1058 = var39;
                    field1056 = var40;
                    field1057 = var41;
                    field1063 = false;
                }
                int[] var42 = new int[9];
                int var43 = class25.field359[arg2] >> 1;
                int var44 = class25.field355[arg2] >> 1;
                int var45 = class25.field359[arg3] >> 1;
                int var46 = class25.field355[arg3] >> 1;
                int var47 = class25.field359[arg4] >> 1;
                int var48 = class25.field355[arg4] >> 1;
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                int var51 = var42[2] * -field1057 + var42[0] * -field1058 + var42[1] * -field1056 + 16384 >> 15;
                int var52 = var42[5] * -field1057 + var42[3] * -field1058 + var42[4] * -field1056 + 16384 >> 15;
                int var53 = var42[8] * -field1057 + var42[6] * -field1058 + var42[7] * -field1056 + 16384 >> 15;
                int var54 = field1058 + var51;
                int var55 = field1056 + var52;
                int var56 = field1057 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var59 = 0; var59 < 3; var59++) {
                        int var60 = 0;
                        for (int var61 = 0; var61 < 3; var61++) {
                            var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                        }
                        var57[var58 * 3 + var59] = var60 + 16384 >> 15;
                    }
                }
                int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 16384 >> 15;
                int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 16384 >> 15;
                int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var65 = var54 + var62;
                int var66 = var55 + var63;
                int var67 = var56 + var64;
                int[] var68 = new int[9];
                for (int var69 = 0; var69 < 3; var69++) {
                    for (int var70 = 0; var70 < 3; var70++) {
                        int var71 = 0;
                        for (int var72 = 0; var72 < 3; var72++) {
                            var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                        }
                        var68[var69 * 3 + var70] = var71 + 16384 >> 15;
                    }
                }
                int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 16384 >> 15;
                int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 16384 >> 15;
                int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 16384 >> 15;
                int var76 = var30 + var73;
                int var77 = var31 + var74;
                int var78 = var32 + var75;
                for (int var79 = 0; var79 < var9; var79++) {
                    int var80 = arg1[var79];
                    if (var80 < this.field1023.length) {
                        int[] var81 = this.field1023[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field1035 == null || (arg6 & this.field1035[var83]) != 0) {
                                int var84 = this.field1024[var83] * var68[2] + this.field1010[var83] * var68[1] + this.field1006[var83] * var68[0] + 16384 >> 15;
                                int var85 = this.field1024[var83] * var68[5] + this.field1010[var83] * var68[4] + this.field1006[var83] * var68[3] + 16384 >> 15;
                                int var86 = this.field1024[var83] * var68[8] + this.field1010[var83] * var68[7] + this.field1006[var83] * var68[6] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field1006[var83] = var87;
                                this.field1010[var83] = var88;
                                this.field1024[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field1023.length) {
                        int[] var174 = this.field1023[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field1035 == null || (arg6 & this.field1035[var176]) != 0) {
                                this.field1006[var176] -= field1058;
                                this.field1010[var176] -= field1056;
                                this.field1024[var176] -= field1057;
                                this.field1006[var176] = this.field1006[var176] * arg2 >> 7;
                                this.field1010[var176] = this.field1010[var176] * arg3 >> 7;
                                this.field1024[var176] = this.field1024[var176] * arg4 >> 7;
                                this.field1006[var176] += field1058;
                                this.field1010[var176] += field1056;
                                this.field1024[var176] += field1057;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (field1063) {
                    int var128 = arg7[6] * field1057 + arg7[0] * field1058 + arg7[3] * field1056 + 16384 >> 15;
                    int var129 = arg7[7] * field1057 + arg7[1] * field1058 + arg7[4] * field1056 + 16384 >> 15;
                    int var130 = arg7[8] * field1057 + arg7[2] * field1058 + arg7[5] * field1056 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field1058 = var131;
                    field1056 = var132;
                    field1057 = var133;
                    field1063 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field1058 * var134 + 16384 >> 15;
                int var138 = -field1056 * var135 + 16384 >> 15;
                int var139 = -field1057 * var136 + 16384 >> 15;
                int var140 = field1058 + var137;
                int var141 = field1056 + var138;
                int var142 = field1057 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var152 = 0; var152 < 3; var152++) {
                        int var153 = 0;
                        for (int var154 = 0; var154 < 3; var154++) {
                            var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                        }
                        var150[var151 * 3 + var152] = var153 + 16384 >> 15;
                    }
                }
                int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 16384 >> 15;
                int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 16384 >> 15;
                int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 16384 >> 15;
                int var158 = var122 + var155;
                int var159 = var123 + var156;
                int var160 = var124 + var157;
                for (int var161 = 0; var161 < var9; var161++) {
                    int var162 = arg1[var161];
                    if (var162 < this.field1023.length) {
                        int[] var163 = this.field1023[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field1035 == null || (arg6 & this.field1035[var165]) != 0) {
                                int var166 = this.field1024[var165] * var150[2] + this.field1010[var165] * var150[1] + this.field1006[var165] * var150[0] + 16384 >> 15;
                                int var167 = this.field1024[var165] * var150[5] + this.field1010[var165] * var150[4] + this.field1006[var165] * var150[3] + 16384 >> 15;
                                int var168 = this.field1024[var165] * var150[8] + this.field1010[var165] * var150[7] + this.field1006[var165] * var150[6] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field1006[var165] = var169;
                                this.field1010[var165] = var170;
                                this.field1024[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1045 != null && this.field1043 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field1045.length) {
                        int[] var179 = this.field1045[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field1029 == null || (arg6 & this.field1029[var181]) != 0) {
                                int var182 = (this.field1043[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field1043[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field1047.field1236 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field1045 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field1045.length) {
                    int[] var185 = this.field1045[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field1029 == null || (arg6 & this.field1029[var187]) != 0) {
                            int var188 = this.field1009[var187] & 0xFFFF;
                            int var189 = var188 >> 10 & 0x3F;
                            int var190 = var188 >> 7 & 0x7;
                            int var191 = var188 & 0x7F;
                            int var192 = arg2 + var189 & 0x3F;
                            int var193 = arg3 / 4 + var190;
                            if (var193 < 0) {
                                var193 = 0;
                            } else if (var193 > 7) {
                                var193 = 7;
                            }
                            int var194 = arg4 + var191;
                            if (var194 < 0) {
                                var194 = 0;
                            } else if (var194 > 127) {
                                var194 = 127;
                            }
                            this.field1009[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field1047.field1236 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "()V", line = 3899)
    private final void method544() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field1031; var9++) {
            int var10 = this.field1006[var9];
            int var11 = this.field1010[var9];
            int var12 = this.field1024[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field1041.field4388 = (short) var1;
        this.field1041.field4392 = (short) var4;
        this.field1041.field4390 = (short) var2;
        this.field1041.field4389 = (short) var5;
        this.field1041.field4387 = (short) var3;
        this.field1041.field4386 = (short) var6;
        this.field1041.field4385 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field1041.field4391 = true;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lag;)Lag;", line = 3968)
    public final class123 method545(class123 arg0) {
        if (this.field1046 == 0) {
            return null;
        }
        if (!this.field1041.field4391) {
            this.method544();
        }
        int var2;
        int var3;
        if (class109.field1630 > 0) {
            var2 = this.field1041.field4388 - (class109.field1630 * this.field1041.field4389 >> 8) >> 3;
            var3 = this.field1041.field4392 - (class109.field1630 * this.field1041.field4390 >> 8) >> 3;
        } else {
            var2 = this.field1041.field4388 - (class109.field1630 * this.field1041.field4390 >> 8) >> 3;
            var3 = this.field1041.field4392 - (class109.field1630 * this.field1041.field4389 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class109.field1633 > 0) {
            var4 = this.field1041.field4387 - (class109.field1633 * this.field1041.field4389 >> 8) >> 3;
            var5 = this.field1041.field4386 - (class109.field1633 * this.field1041.field4390 >> 8) >> 3;
        } else {
            var4 = this.field1041.field4387 - (class109.field1633 * this.field1041.field4390 >> 8) >> 3;
            var5 = this.field1041.field4386 - (class109.field1633 * this.field1041.field4389 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class123 var8;
        if (arg0 == null || arg0.field1853.length < var6 * var7) {
            var8 = new class123(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field4027 = arg0.field4037 = var6;
            arg0.field4028 = arg0.field4039 = var7;
            arg0.method849();
        }
        var8.field4034 = var2;
        var8.field4031 = var4;
        if (field1065.length < this.field1046) {
            field1065 = new int[this.field1046];
            field1061 = new int[this.field1046];
        }
        for (int var9 = 0; var9 < this.field1031; var9++) {
            int var10 = (this.field1006[var9] - (this.field1010[var9] * class109.field1630 >> 8) >> 3) - var2;
            int var11 = (this.field1024[var9] - (this.field1010[var9] * class109.field1633 >> 8) >> 3) - var4;
            int var12 = this.field1005[var9];
            int var13 = this.field1005[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field1008[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field1065[var15] = var10;
                field1061[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field1032; var16++) {
            if (this.field1043[var16] <= 128) {
                short var17 = this.field1030[var16];
                short var18 = this.field1007[var16];
                short var19 = this.field1014[var16];
                int var20 = field1065[var17];
                int var21 = field1065[var18];
                int var22 = field1065[var19];
                int var23 = field1061[var17];
                int var24 = field1061[var18];
                int var25 = field1061[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class25.method167(var8.field1853, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "()V", line = 4091)
    private final void method546() {
        if (field1025.field3128.length < this.field1032 * 12) {
            field1025 = new class192((this.field1032 + 100) * 12);
        } else {
            field1025.field3129 = 0;
        }
        if (class186.field3014) {
            for (int var1 = 0; var1 < this.field1032; var1++) {
                field1025.method1350(this.field1030[var1], -128);
                field1025.method1350(this.field1007[var1], -77);
                field1025.method1350(this.field1014[var1], -121);
            }
        } else {
            for (int var2 = 0; var2 < this.field1032; var2++) {
                field1025.method1400(this.field1030[var2], (byte) -82);
                field1025.method1400(this.field1007[var2], (byte) -71);
                field1025.method1400(this.field1014[var2], (byte) -122);
            }
        }
        if (!class186.field3027) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field1025.field3129);
            var5.put(field1025.field3128, 0, field1025.field3129);
            var5.flip();
            this.field1028.field1236 = true;
            this.field1028.field1239 = var5;
            this.field1028.field1235 = null;
            return;
        }
        class207 var3 = new class207();
        ByteBuffer var4 = ByteBuffer.wrap(field1025.field3128, 0, field1025.field3129);
        var3.method1518(var4);
        this.field1028.field1236 = true;
        this.field1028.field1239 = null;
        this.field1028.field1235 = var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([SI)[S", line = 4151)
    private static final short[] method547(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class213.method1558(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(FFF)I", line = 4160)
    private static final int method548(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZZZZZZZ)V", line = 4195)
    public final void method549(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field1016 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field1046 != 0) {
            if (arg6) {
                boolean var8 = !this.field1047.field1236 && (arg1 || arg2 && !class269.field4250);
                this.method541(false, !this.field1011.field1236 && arg0, var8, this.field1049 != null && !this.field1049.field1236 && arg2, !this.field1040.field1236 && arg3);
                if (!this.field1028.field1236 && arg4 && arg1) {
                    this.method546();
                }
            }
            if (arg0) {
                if (this.field1011.field1236) {
                    if (!this.field1041.field4391) {
                        this.method544();
                    }
                    this.field1006 = null;
                    this.field1010 = null;
                    this.field1024 = null;
                    this.field1008 = null;
                    this.field1005 = null;
                } else {
                    this.field1036 = (byte) (this.field1036 | 0x1);
                }
            }
            if (arg1) {
                if (this.field1047.field1236) {
                    this.field1009 = null;
                    this.field1043 = null;
                } else {
                    this.field1036 = (byte) (this.field1036 | 0x2);
                }
            }
            if (arg2 && class269.field4250) {
                if (this.field1049.field1236) {
                    this.field1019 = null;
                    this.field1044 = null;
                    this.field1015 = null;
                    this.field1034 = null;
                } else {
                    this.field1036 = (byte) (this.field1036 | 0x4);
                }
            }
            if (arg3) {
                if (this.field1040.field1236) {
                    this.field1027 = null;
                    this.field1038 = null;
                } else {
                    this.field1036 = (byte) (this.field1036 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field1028.field1236 && this.field1047.field1236) {
                    this.field1030 = null;
                    this.field1007 = null;
                    this.field1014 = null;
                } else {
                    this.field1036 = (byte) (this.field1036 | 0x10);
                }
            }
            if (arg5) {
                this.field1022 = null;
                this.field1017 = null;
                this.field1023 = (int[][]) null;
                this.field1045 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lh;IIIZ)V", line = 4292)
    public final void method550(class232 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class75 var6 = (class75) arg0;
        if (this.field1032 == 0 || var6.field1032 == 0) {
            return;
        }
        int var7 = var6.field1031;
        int[] var8 = var6.field1006;
        int[] var9 = var6.field1010;
        int[] var10 = var6.field1024;
        short[] var11 = var6.field1019;
        short[] var12 = var6.field1044;
        short[] var13 = var6.field1015;
        short[] var14 = var6.field1034;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field1013 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field1013.field3084;
            var16 = this.field1013.field3083;
            var17 = this.field1013.field3085;
            var18 = this.field1013.field3082;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field1013 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field1013.field3084;
            var20 = var6.field1013.field3083;
            var21 = var6.field1013.field3085;
            var22 = var6.field1013.field3082;
        }
        int[] var23 = var6.field1005;
        short[] var24 = var6.field1008;
        if (!var6.field1041.field4391) {
            var6.method544();
        }
        short var25 = var6.field1041.field4390;
        short var26 = var6.field1041.field4389;
        short var27 = var6.field1041.field4388;
        short var28 = var6.field1041.field4392;
        short var29 = var6.field1041.field4387;
        short var30 = var6.field1041.field4386;
        for (int var31 = 0; var31 < this.field1031; var31++) {
            int var32 = this.field1010[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field1006[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field1024[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field1005[var31];
                        int var37 = this.field1005[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field1008[var38] - 1;
                            if (var35 == -1 || this.field1034[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field1013 = new class190();
                                            var15 = this.field1013.field3084 = class170.method1170(0, this.field1019);
                                            var16 = this.field1013.field3083 = class170.method1170(0, this.field1044);
                                            var17 = this.field1013.field3085 = class170.method1170(0, this.field1015);
                                            var18 = this.field1013.field3082 = class170.method1170(0, this.field1034);
                                        }
                                        if (var19 == null) {
                                            class190 var44 = var6.field1013 = new class190();
                                            var19 = var44.field3084 = class170.method1170(0, var11);
                                            var20 = var44.field3083 = class170.method1170(0, var12);
                                            var21 = var44.field3085 = class170.method1170(0, var13);
                                            var22 = var44.field3082 = class170.method1170(0, var14);
                                        }
                                        short var45 = this.field1019[var35];
                                        short var46 = this.field1044[var35];
                                        short var47 = this.field1015[var35];
                                        short var48 = this.field1034[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field1005[var31];
                                        int var58 = this.field1005[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field1008[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class62 extends class196 {

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Z")
    public boolean field971 = false;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public int field986 = 0;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "B")
    private byte field994 = 0;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    private int field977 = 0;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "B")
    private byte field981 = 0;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    private int field1003 = 0;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "[I")
    private int[] field985;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "[I")
    public int[] field984;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "[I")
    public int[] field998;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "[I")
    public int[] field1009;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "[I")
    private int[] field976;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "[S")
    private short[] field991;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "[S")
    private short[] field1012;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "[S")
    private short[] field993;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "[S")
    private short[] field990;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "[F")
    private float[] field973;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "[F")
    private float[] field989;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "[S")
    private short[] field980;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "[B")
    private byte[] field999;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "[S")
    private short[] field982;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "[S")
    private short[] field1001;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "[S")
    private short[] field1005;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "[S")
    private short[] field1002;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "[B")
    private byte[] field987;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "Lgf;")
    public class113 field995;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "Lid;")
    public class251 field996;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lid;")
    private class251 field972;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "Lid;")
    private class251 field1000;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "Lid;")
    private class251 field983;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "Lid;")
    private class251 field1010;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "S")
    private short field979;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "S")
    private short field978;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "[S")
    private short[] field997;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "[I")
    private int[] field975;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "Lbb;")
    private static class134 field1004 = new class134(10000);

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "Lib;")
    private static class62 field1007 = new class62();

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "Lib;")
    private static class62 field1013 = new class62();

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "Lib;")
    private static class62 field1014 = new class62();

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "Lib;")
    private static class62 field1015 = new class62();

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "[I")
    private static int[] field1017 = new int[1];

    @OriginalMember(owner = "client!ib", name = "hb", descriptor = "[I")
    private static int[] field1021 = new int[1];

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "F")
    private static float field1016;

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "F")
    private static float field1018;

    @OriginalMember(owner = "client!ib", name = "fb", descriptor = "F")
    private static float field1019;

    @OriginalMember(owner = "client!ib", name = "gb", descriptor = "F")
    private static float field1020;

    @OriginalMember(owner = "client!ib", name = "jb", descriptor = "F")
    private static float field1023;

    @OriginalMember(owner = "client!ib", name = "kb", descriptor = "F")
    private static float field1024;

    @OriginalMember(owner = "client!ib", name = "ib", descriptor = "I")
    private static int field1022;

    @OriginalMember(owner = "client!ib", name = "lb", descriptor = "I")
    private static int field1025;

    @OriginalMember(owner = "client!ib", name = "mb", descriptor = "I")
    private static int field1026;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "Lom;")
    private class154 field1011;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "Lgb;")
    private class83 field988;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1008;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "[J")
    private static long[] field992;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "[[I")
    private int[][] field1006;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "[[I")
    private int[][] field974;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "()V", line = 7)
    public final void method216() {
        for (int var1 = 0; var1 < this.field986; var1++) {
            int var2 = this.field1009[var1];
            this.field1009[var1] = this.field984[var1];
            this.field984[var1] = -var2;
        }
        this.field995.field1926 = false;
        this.field996.field4196 = false;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIFFF)[F", line = 22)
    private static final float[] method415(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float[] var8 = new float[9];
        float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var11 = 1.0F - var9;
        var7[0] = var9;
        var7[1] = 0.0F;
        var7[2] = var10;
        var7[3] = 0.0F;
        var7[4] = 1.0F;
        var7[5] = 0.0F;
        var7[6] = -var10;
        var7[7] = 0.0F;
        var7[8] = var9;
        float[] var12 = new float[9];
        float var13 = 1.0F;
        float var14 = 0.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var17 = 1.0F - var15;
        float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var18 == 0.0F && var15 == 0.0F) {
            var8 = var7;
        } else {
            if (var18 != 0.0F) {
                var13 = (float) (-arg2) / var18;
                var14 = (float) arg0 / var18;
            }
            var12[0] = var13 * var13 * var17 + var15;
            var12[1] = var14 * var16;
            var12[2] = var13 * var14 * var17;
            var12[3] = -var14 * var16;
            var12[4] = var15;
            var12[5] = var13 * var16;
            var12[6] = var13 * var14 * var17;
            var12[7] = -var13 * var16;
            var12[8] = var14 * var14 * var17 + var15;
            var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
            var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
            var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
            var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
            var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
            var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
            var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
            var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
            var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
        }
        var8[0] *= arg4;
        var8[1] *= arg4;
        var8[2] *= arg4;
        var8[3] *= arg5;
        var8[4] *= arg5;
        var8[5] *= arg5;
        var8[6] *= arg6;
        var8[7] *= arg6;
        var8[8] *= arg6;
        return var8;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 99)
    private static final void method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field1023 = var18;
        field1024 = var19;
    }

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "()V", line = 177)
    public final void method417() {
        if (this.field991 == null) {
            this.method216();
            return;
        }
        for (int var1 = 0; var1 < this.field986; var1++) {
            int var2 = this.field1009[var1];
            this.field1009[var1] = this.field984[var1];
            this.field984[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field1003; var3++) {
            short var4 = this.field993[var3];
            this.field993[var3] = this.field991[var3];
            this.field991[var3] = (short) (-var4);
        }
        this.field995.field1926 = false;
        this.field996.field4196 = false;
        if (this.field1000 != null) {
            this.field1000.field4196 = false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "()V", line = 217)
    public final void method418() {
        for (int var1 = 0; var1 < this.field986; var1++) {
            this.field1009[var1] = -this.field1009[var1];
        }
        if (this.field993 != null) {
            for (int var2 = 0; var2 < this.field1003; var2++) {
                this.field993[var2] = (short) (-this.field993[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field977; var3++) {
            short var4 = this.field982[var3];
            this.field982[var3] = this.field1005[var3];
            this.field1005[var3] = var4;
        }
        this.field995.field1926 = false;
        this.field996.field4196 = false;
        if (this.field1000 != null) {
            this.field1000.field4196 = false;
        }
        this.field1010.field4196 = false;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lfd;I)V", line = 253)
    public final void method227(class219 arg0, int arg1) {
        if (this.field974 == null || arg1 == -1) {
            return;
        }
        class145 var3 = arg0.field3691[arg1];
        class180 var4 = var3.field2655;
        field1025 = 0;
        field1022 = 0;
        field1026 = 0;
        for (int var5 = 0; var5 < var3.field2645; var5++) {
            short var6 = var3.field2651[var5];
            if (var4.field3139[var6]) {
                if (var3.field2646[var5] != -1) {
                    this.method448(0, 0, 0, 0);
                }
                this.method448(var4.field3137[var6], var3.field2648[var5], var3.field2647[var5], var3.field2650[var5]);
            }
        }
        this.field996.field4196 = false;
        this.field995.field1926 = false;
    }

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "()V", line = 288)
    public final void method419() {
        if (this.field991 == null) {
            this.method235();
            return;
        }
        for (int var1 = 0; var1 < this.field986; var1++) {
            int var2 = this.field984[var1];
            this.field984[var1] = this.field1009[var1];
            this.field1009[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field1003; var3++) {
            short var4 = this.field991[var3];
            this.field991[var3] = this.field993[var3];
            this.field993[var3] = (short) (-var4);
        }
        this.field995.field1926 = false;
        this.field996.field4196 = false;
        if (this.field1000 != null) {
            this.field1000.field4196 = false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "()V", line = 327)
    private final void method420() {
        if (field1004.field2282.length < this.field1003 * 12) {
            field1004 = new class134((this.field1003 + 100) * 12);
        } else {
            field1004.field2299 = 0;
        }
        if (class56.field845) {
            for (int var1 = 0; var1 < this.field977; var1++) {
                field1004.method947(this.field982[var1], (byte) 103);
                field1004.method947(this.field1001[var1], (byte) 112);
                field1004.method947(this.field1005[var1], (byte) 97);
            }
        } else {
            for (int var2 = 0; var2 < this.field977; var2++) {
                field1004.method941(-100, this.field982[var2]);
                field1004.method941(-114, this.field1001[var2]);
                field1004.method941(-103, this.field1005[var2]);
            }
        }
        if (!class56.field855) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field1004.field2299);
            var5.put(field1004.field2282, 0, field1004.field2299);
            var5.flip();
            this.field1010.field4196 = true;
            this.field1010.field4206 = var5;
            this.field1010.field4191 = null;
            return;
        }
        class83 var3 = new class83();
        ByteBuffer var4 = ByteBuffer.wrap(field1004.field2282, 0, field1004.field2299);
        var3.method585(var4);
        this.field1010.field4196 = true;
        this.field1010.field4206 = null;
        this.field1010.field4191 = var3;
    }

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "()V", line = 388)
    private final void method421() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field986; var9++) {
            int var10 = this.field984[var9];
            int var11 = this.field998[var9];
            int var12 = this.field1009[var9];
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
        this.field995.field1930 = (short) var1;
        this.field995.field1925 = (short) var4;
        this.field995.field1928 = (short) var2;
        this.field995.field1929 = (short) var5;
        this.field995.field1927 = (short) var3;
        this.field995.field1924 = (short) var6;
        this.field995.field1931 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field995.field1926 = true;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIII[FIF)V", line = 458)
    private static final void method422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field1019 = var16;
        field1020 = var17;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZZZZZZZZZZZ)Lib;", line = 503)
    public final class62 method423(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class62 var12 = new class62();
        var12.field986 = this.field986;
        var12.field1003 = this.field1003;
        var12.field977 = this.field977;
        if (arg0) {
            var12.field984 = this.field984;
            var12.field1009 = this.field1009;
        } else {
            var12.field984 = class74.method536(-1734678527, this.field984);
            var12.field1009 = class74.method536(-1734678527, this.field1009);
        }
        if (arg1) {
            var12.field998 = this.field998;
        } else {
            var12.field998 = class74.method536(-1734678527, this.field998);
        }
        if (arg0 && arg1) {
            var12.field996 = this.field996;
            var12.field995 = this.field995;
        } else {
            var12.field996 = new class251();
            var12.field995 = new class113();
        }
        if (arg2) {
            var12.field980 = this.field980;
        } else {
            var12.field980 = class187.method1348(this.field980, 0);
        }
        if (arg3) {
            var12.field999 = this.field999;
        } else {
            var12.field999 = class260.method1763(-32556, this.field999);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class249.field4166) {
            var12.field972 = new class251();
        } else {
            var12.field972 = this.field972;
        }
        if (arg5) {
            var12.field991 = this.field991;
            var12.field1012 = this.field1012;
            var12.field993 = this.field993;
            var12.field990 = this.field990;
        } else {
            var12.field991 = class187.method1348(this.field991, 0);
            var12.field1012 = class187.method1348(this.field1012, 0);
            var12.field993 = class187.method1348(this.field993, 0);
            var12.field990 = class187.method1348(this.field990, 0);
        }
        if (!class249.field4166) {
            var12.field1000 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field1000 = this.field1000;
        } else {
            var12.field1000 = new class251();
        }
        if (arg8) {
            var12.field973 = this.field973;
            var12.field989 = this.field989;
            var12.field983 = this.field983;
        } else {
            var12.field973 = class110.method724((byte) 124, this.field973);
            var12.field989 = class110.method724((byte) 104, this.field989);
            var12.field983 = new class251();
        }
        if (arg9) {
            var12.field982 = this.field982;
            var12.field1001 = this.field1001;
            var12.field1005 = this.field1005;
            var12.field1010 = this.field1010;
        } else {
            var12.field982 = class187.method1348(this.field982, 0);
            var12.field1001 = class187.method1348(this.field1001, 0);
            var12.field1005 = class187.method1348(this.field1005, 0);
            var12.field1010 = new class251();
        }
        if (arg10) {
            var12.field1002 = this.field1002;
        } else {
            var12.field1002 = class187.method1348(this.field1002, 0);
        }
        var12.field976 = this.field976;
        var12.field974 = this.field974;
        var12.field987 = this.field987;
        var12.field1006 = this.field1006;
        var12.field975 = this.field975;
        var12.field997 = this.field997;
        var12.field985 = this.field985;
        var12.field979 = this.field979;
        var12.field978 = this.field978;
        return var12;
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V", line = 641)
    public final void method424(int arg0) {
        if (this.field991 == null) {
            this.method233(arg0);
            return;
        }
        int var2 = class236.field3985[arg0];
        int var3 = class236.field3971[arg0];
        for (int var4 = 0; var4 < this.field986; var4++) {
            int var5 = this.field984[var4] * var3 + this.field1009[var4] * var2 >> 16;
            this.field1009[var4] = this.field1009[var4] * var3 - this.field984[var4] * var2 >> 16;
            this.field984[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field1003; var6++) {
            int var7 = this.field993[var6] * var2 + this.field991[var6] * var3 >> 16;
            this.field993[var6] = (short) (this.field993[var6] * var3 - this.field991[var6] * var2 >> 16);
            this.field991[var6] = (short) var7;
        }
        this.field995.field1926 = false;
        this.field996.field4196 = false;
        if (this.field1000 != null) {
            this.field1000.field4196 = false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "()V", line = 682)
    public static final void method425() {
        field1007 = new class62();
        field1013 = new class62();
        field1014 = new class62();
        field1015 = new class62();
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([SI)[S", line = 690)
    private static final short[] method426(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class230.method1564(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZZ)Lwi;", line = 695)
    public final class196 method226(boolean arg0, boolean arg1) {
        return this.method434(arg0, arg1, field1015, field1014);
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V", line = 699)
    public final void method212(int arg0) {
        int var2 = class236.field3985[arg0];
        int var3 = class236.field3971[arg0];
        for (int var4 = 0; var4 < this.field986; var4++) {
            int var5 = this.field998[var4] * var2 + this.field984[var4] * var3 >> 16;
            this.field998[var4] = this.field998[var4] * var3 - this.field984[var4] * var2 >> 16;
            this.field984[var4] = var5;
        }
        this.field995.field1926 = false;
        this.field996.field4196 = false;
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)V", line = 718)
    public final void method427(int arg0) {
        this.field979 = (short) arg0;
        this.field972.field4196 = false;
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "()I", line = 724)
    public final int method215() {
        if (!this.field995.field1926) {
            this.method421();
        }
        return this.field995.field1927;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZZZZZ)V", line = 731)
    private final void method428(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field996.field4197 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field972.field4197 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field1000.field4197 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field983.field4197 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field1004.field2282.length < this.field1003 * var6) {
            field1004 = new class134((this.field1003 + 100) * var6);
        } else {
            field1004.field2299 = 0;
        }
        if (arg1) {
            if (class56.field845) {
                for (int var7 = 0; var7 < this.field986; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field984[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field998[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field1009[var7]);
                    int var11 = this.field985[var7];
                    int var12 = this.field985[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field997[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field1004.field2299 = var6 * var14;
                        field1004.method947(var8, (byte) 116);
                        field1004.method947(var9, (byte) 101);
                        field1004.method947(var10, (byte) 104);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field986; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field984[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field998[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field1009[var15]);
                    int var19 = this.field985[var15];
                    int var20 = this.field985[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field997[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field1004.field2299 = var6 * var22;
                        field1004.method941(-98, var16);
                        field1004.method941(-113, var17);
                        field1004.method941(-127, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class249.field4166) {
                for (int var42 = 0; var42 < this.field977; var42++) {
                    int var43 = method450(this.field980[var42], this.field1002[var42], this.field979, this.field999[var42]);
                    field1004.field2299 = this.field982[var42] * var6 + this.field972.field4197;
                    field1004.method947(var43, (byte) 103);
                    field1004.field2299 = this.field1001[var42] * var6 + this.field972.field4197;
                    field1004.method947(var43, (byte) 125);
                    field1004.field2299 = this.field1005[var42] * var6 + this.field972.field4197;
                    field1004.method947(var43, (byte) 101);
                }
            } else {
                int var23 = (int) class235.field3959[0];
                int var24 = (int) class235.field3959[1];
                int var25 = (int) class235.field3959[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field979 * 1.3F);
                int var28 = this.field978 * var26 >> 8;
                for (int var29 = 0; var29 < this.field977; var29++) {
                    short var30 = this.field982[var29];
                    short var31 = this.field990[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field993[var30] * var25 + this.field991[var30] * var23 + this.field1012[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field993[var30] * var25 + this.field991[var30] * var23 + this.field1012[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field990[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field1001[var29];
                    short var34 = this.field990[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field993[var33] * var25 + this.field991[var33] * var23 + this.field1012[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field993[var33] * var25 + this.field991[var33] * var23 + this.field1012[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field990[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field1005[var29];
                    short var37 = this.field990[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field993[var36] * var25 + this.field991[var36] * var23 + this.field1012[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field993[var36] * var25 + this.field991[var36] * var23 + this.field1012[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field990[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method450(this.field980[var29], this.field1002[var29], var32, this.field999[var29]);
                    int var40 = method450(this.field980[var29], this.field1002[var29], var35, this.field999[var29]);
                    int var41 = method450(this.field980[var29], this.field1002[var29], var38, this.field999[var29]);
                    field1004.field2299 = var6 * var30 + this.field972.field4197;
                    field1004.method947(var39, (byte) 109);
                    field1004.field2299 = var6 * var33 + this.field972.field4197;
                    field1004.method947(var40, (byte) 110);
                    field1004.field2299 = var6 * var36 + this.field972.field4197;
                    field1004.method947(var41, (byte) 94);
                }
                this.field991 = null;
                this.field1012 = null;
                this.field993 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field978;
            float var45 = 3.0F / (float) (this.field978 / 2 + this.field978);
            field1004.field2299 = this.field1000.field4197;
            if (class56.field845) {
                for (int var46 = 0; var46 < this.field1003; var46++) {
                    short var47 = this.field990[var46];
                    if (var47 == 0) {
                        field1004.method956((float) this.field991[var46] * var45, false);
                        field1004.method956((float) this.field1012[var46] * var45, false);
                        field1004.method956((float) this.field993[var46] * var45, false);
                    } else {
                        float var48 = var44 / (float) var47;
                        field1004.method956((float) this.field991[var46] * var48, false);
                        field1004.method956((float) this.field1012[var46] * var48, false);
                        field1004.method956((float) this.field993[var46] * var48, false);
                    }
                    field1004.field2299 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field1003; var49++) {
                    short var50 = this.field990[var49];
                    if (var50 == 0) {
                        field1004.method940((float) this.field991[var49] * var45, 967648728);
                        field1004.method940((float) this.field1012[var49] * var45, 967648728);
                        field1004.method940((float) this.field993[var49] * var45, 967648728);
                    } else {
                        float var51 = var44 / (float) var50;
                        field1004.method940((float) this.field991[var49] * var51, 967648728);
                        field1004.method940((float) this.field1012[var49] * var51, 967648728);
                        field1004.method940((float) this.field993[var49] * var51, 967648728);
                    }
                    field1004.field2299 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field1004.field2299 = this.field983.field4197;
            if (class56.field845) {
                for (int var52 = 0; var52 < this.field1003; var52++) {
                    field1004.method956(this.field973[var52], false);
                    field1004.method956(this.field989[var52], false);
                    field1004.field2299 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field1003; var53++) {
                    field1004.method940(this.field973[var53], 967648728);
                    field1004.method940(this.field989[var53], 967648728);
                    field1004.field2299 += var6 - 8;
                }
            }
        }
        field1004.field2299 = this.field1003 * var6;
        if (arg0) {
            if (class56.field858) {
                ByteBuffer var54 = ByteBuffer.wrap(field1004.field2282, 0, field1004.field2299);
                if (this.field988 == null) {
                    this.field988 = new class83(true);
                    this.field988.method585(var54);
                } else {
                    this.field988.method589(var54);
                }
                if (arg1) {
                    this.field996.field4196 = true;
                    this.field996.field4206 = null;
                    this.field996.field4191 = this.field988;
                    this.field996.field4208 = var6;
                }
                if (arg2) {
                    this.field972.field4196 = true;
                    this.field972.field4206 = null;
                    this.field972.field4191 = this.field988;
                    this.field972.field4208 = var6;
                }
                if (arg3) {
                    this.field1000.field4196 = true;
                    this.field1000.field4206 = null;
                    this.field1000.field4191 = this.field988;
                    this.field1000.field4208 = var6;
                }
                if (arg4) {
                    this.field983.field4196 = true;
                    this.field983.field4206 = null;
                    this.field983.field4191 = this.field988;
                    this.field983.field4208 = var6;
                }
            } else {
                if (field1008 == null || field1008.capacity() < field1004.field2299) {
                    field1008 = ByteBuffer.allocateDirect(var6 * 100 + field1004.field2299);
                } else {
                    field1008.clear();
                }
                field1008.put(field1004.field2282, 0, field1004.field2299);
                field1008.flip();
                if (arg1) {
                    this.field996.field4196 = true;
                    this.field996.field4206 = field1008;
                    this.field996.field4191 = null;
                    this.field996.field4208 = var6;
                }
                if (arg2) {
                    this.field972.field4196 = true;
                    this.field972.field4206 = field1008;
                    this.field996.field4191 = null;
                    this.field972.field4208 = var6;
                }
                if (arg3) {
                    this.field1000.field4196 = true;
                    this.field1000.field4206 = field1008;
                    this.field1000.field4191 = null;
                    this.field1000.field4208 = var6;
                }
                if (arg4) {
                    this.field983.field4196 = true;
                    this.field983.field4206 = field1008;
                    this.field983.field4191 = null;
                    this.field983.field4208 = var6;
                }
            }
        } else if (class56.field855) {
            class83 var55 = new class83();
            ByteBuffer var56 = ByteBuffer.wrap(field1004.field2282, 0, field1004.field2299);
            var55.method585(var56);
            if (arg1) {
                this.field996.field4196 = true;
                this.field996.field4206 = null;
                this.field996.field4191 = var55;
                this.field996.field4208 = var6;
            }
            if (arg2) {
                this.field972.field4196 = true;
                this.field972.field4206 = null;
                this.field972.field4191 = var55;
                this.field972.field4208 = var6;
            }
            if (arg3) {
                this.field1000.field4196 = true;
                this.field1000.field4206 = null;
                this.field1000.field4191 = var55;
                this.field1000.field4208 = var6;
            }
            if (arg4) {
                this.field983.field4196 = true;
                this.field983.field4206 = null;
                this.field983.field4191 = var55;
                this.field983.field4208 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field1004.field2299);
            var57.put(field1004.field2282, 0, field1004.field2299);
            var57.flip();
            if (arg1) {
                this.field996.field4196 = true;
                this.field996.field4206 = var57;
                this.field996.field4191 = null;
                this.field996.field4208 = var6;
            }
            if (arg2) {
                this.field972.field4196 = true;
                this.field972.field4206 = var57;
                this.field996.field4191 = null;
                this.field972.field4208 = var6;
            }
            if (arg3) {
                this.field1000.field4196 = true;
                this.field1000.field4206 = var57;
                this.field1000.field4191 = null;
                this.field1000.field4208 = var6;
            }
            if (arg4) {
                this.field983.field4196 = true;
                this.field983.field4206 = var57;
                this.field983.field4191 = null;
                this.field983.field4208 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIIJILqj;)V", line = 1259)
    public final void method241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class211 arg10) {
        if (this.field1003 == 0) {
            return;
        }
        if (!this.field995.field1926) {
            this.method421();
        }
        short var13 = this.field995.field1931;
        short var14 = this.field995.field1928;
        short var15 = this.field995.field1929;
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
        if (var21 / var18 <= class265.field4492) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class58.field915) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class87.field1370) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class269.field4551) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class236.field3985[arg0];
            var27 = class236.field3971[arg0];
        }
        if (arg8 > 0L && class70.field1147 && var19 > 0) {
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
            if (class85.field1355 >= var28 && class85.field1355 <= var29 && class5.field56 >= var30 && class5.field56 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field995.field1930;
                short var37 = this.field995.field1925;
                short var38 = this.field995.field1927;
                short var39 = this.field995.field1924;
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
                if (class85.field1355 >= var32 && class85.field1355 <= var33 && class5.field56 >= var34 && class5.field56 <= var35) {
                    if (this.field3364) {
                        class263.field4392[class1.field8++] = arg8;
                    } else {
                        if (field1017.length < this.field1003) {
                            field1017 = new int[this.field1003];
                            field1021 = new int[this.field1003];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field986) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field977) {
                                        break label118;
                                    }
                                    short var80 = this.field982[var79];
                                    short var81 = this.field1001[var79];
                                    short var82 = this.field1005[var79];
                                    if (this.method443(class85.field1355, class5.field56, field1021[var80], field1021[var81], field1021[var82], field1017[var80], field1017[var81], field1017[var82])) {
                                        class263.field4392[class1.field8++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field984[var59];
                            int var61 = this.field998[var59];
                            int var62 = this.field1009[var59];
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
                            int var75 = this.field985[var59];
                            int var76 = this.field985[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field997[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field1017[var78] = var73;
                                field1021[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class56.field848;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method444();
        var83.glRotatef((float) (-arg0) * 0.17578125F, 0.0F, 1.0F, 0.0F);
        var83.glTranslatef((float) (-arg5), (float) (-arg6), (float) (-arg7));
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILib;[[I[[IIII)V", line = 1534)
    public final void method429(int arg0, int arg1, class62 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field995.field1926) {
            arg2.method421();
        }
        int var9 = arg2.field995.field1930 + arg5;
        int var10 = arg2.field995.field1925 + arg5;
        int var11 = arg2.field995.field1927 + arg7;
        int var12 = arg2.field995.field1924 + arg7;
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
            for (int var17 = 0; var17 < this.field986; var17++) {
                int var18 = this.field984[var17] + arg5;
                int var19 = this.field1009[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field998[var17] = this.field998[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field995.field1928;
            for (int var28 = 0; var28 < this.field986; var28++) {
                int var29 = (this.field998[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field984[var28] + arg5;
                    int var31 = this.field1009[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field998[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1393(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field995.field1929 - arg2.field995.field1928;
            for (int var42 = 0; var42 < this.field986; var42++) {
                int var43 = this.field984[var42] + arg5;
                int var44 = this.field1009[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field998[var42] = var51 + this.field998[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field995.field1929 - arg2.field995.field1928;
            for (int var53 = 0; var53 < this.field986; var53++) {
                int var54 = this.field984[var53] + arg5;
                int var55 = this.field1009[var53] + arg7;
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
                this.field998[var53] = ((this.field998[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field996.field4196 = false;
        this.field995.field1926 = false;
    }

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "()I", line = 1731)
    public final int method430() {
        return this.field979;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)Lja;", line = 1734)
    public final class114 method431(int arg0, int arg1, int arg2) {
        this.field971 = false;
        if (this.field1011 != null) {
            this.field991 = this.field1011.field2810;
            this.field1012 = this.field1011.field2808;
            this.field993 = this.field1011.field2807;
            this.field990 = this.field1011.field2809;
            this.field1011 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lfd;ILfd;I[IZ)V", line = 1747)
    public final void method210(class219 arg0, int arg1, class219 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method208(arg0, arg1, arg5);
            return;
        }
        class145 var7 = arg0.field3691[arg1];
        class145 var8 = arg2.field3691[arg3];
        class180 var9 = var7.field2655;
        for (int var10 = 0; var10 < this.field986; var10++) {
            this.field984[var10] <<= 0x4;
            this.field998[var10] <<= 0x4;
            this.field1009[var10] <<= 0x4;
        }
        field1025 = 0;
        field1022 = 0;
        field1026 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field2645; var13++) {
            short var14 = var7.field2651[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field3137[var14] == 0) {
                if (var7.field2646[var13] != -1) {
                    this.method440(0, var9.field3133[var7.field2646[var13]], 0, 0, 0, arg5);
                }
                this.method440(var9.field3137[var14], var9.field3133[var14], var7.field2648[var13], var7.field2647[var13], var7.field2650[var13], arg5);
            }
        }
        field1025 = 0;
        field1022 = 0;
        field1026 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field2645; var17++) {
            short var18 = var8.field2651[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field3137[var18] == 0) {
                if (var8.field2646[var17] != -1) {
                    this.method440(0, var9.field3133[var8.field2646[var17]], 0, 0, 0, arg5);
                }
                this.method440(var9.field3137[var18], var9.field3133[var18], var8.field2648[var17], var8.field2647[var17], var8.field2650[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field986; var19++) {
            this.field984[var19] >>= 0x4;
            this.field998[var19] >>= 0x4;
            this.field1009[var19] >>= 0x4;
        }
        this.field995.field1926 = false;
        this.field996.field4196 = false;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([FI)[F", line = 1843)
    private static final float[] method432(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class230.method1569(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "()I", line = 1848)
    public final int method225() {
        if (!this.field995.field1926) {
            this.method421();
        }
        return this.field995.field1928;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V", line = 3749)
    private class62() {
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lkm;IIZ)V", line = 3752)
    public class62(class146 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field2677];
        this.field985 = new int[arg0.field2657 + 1];
        for (int var6 = 0; var6 < arg0.field2677; var6++) {
            if ((arg0.field2663 == null || arg0.field2663[var6] != 2) && (arg0.field2699 == null || arg0.field2699[var6] == -1 || !class236.field3987.method608(-14101, arg0.field2699[var6] & 0xFFFF))) {
                var5[this.field977++] = var6;
                this.field985[arg0.field2678[var6]]++;
                this.field985[arg0.field2674[var6]]++;
                this.field985[arg0.field2668[var6]]++;
            }
        }
        long[] var7 = new long[this.field977];
        for (int var8 = 0; var8 < this.field977; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field2699 != null) {
                var14 = arg0.field2699[var9];
                if (var14 != -1) {
                    var12 = class236.field3987.method598(true, var14 & 0xFFFF);
                    var13 = class236.field3987.method601(var14 & 0xFFFF, -125);
                }
            }
            boolean var15 = arg0.field2690 != null && arg0.field2690[var9] != 0 || var14 != -1 && !class236.field3987.method605(0, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field2669 != null) {
                var10 += arg0.field2669[var9] << 17;
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
        class186.method1345(var5, -127, var7);
        this.field986 = arg0.field2657;
        this.field984 = arg0.field2672;
        this.field998 = arg0.field2661;
        this.field1009 = arg0.field2686;
        this.field976 = arg0.field2692;
        int var20 = this.field977 * 3;
        this.field991 = new short[var20];
        this.field1012 = new short[var20];
        this.field993 = new short[var20];
        this.field990 = new short[var20];
        this.field973 = new float[var20];
        this.field989 = new float[var20];
        this.field980 = new short[this.field977];
        this.field999 = new byte[this.field977];
        this.field982 = new short[this.field977];
        this.field1001 = new short[this.field977];
        this.field1005 = new short[this.field977];
        this.field1002 = new short[this.field977];
        if (arg0.field2695 != null) {
            this.field987 = new byte[this.field977];
        }
        this.field995 = new class113();
        this.field996 = new class251();
        this.field972 = new class251();
        if (class249.field4166) {
            this.field1000 = new class251();
        }
        this.field983 = new class251();
        this.field1010 = new class251();
        this.field979 = (short) arg1;
        this.field978 = (short) arg2;
        this.field997 = new short[var20];
        field992 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field2657; var22++) {
            int var23 = this.field985[var22];
            this.field985[var22] = var21;
            var21 += var23;
        }
        this.field985[arg0.field2657] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field2660 != null) {
            int var28 = arg0.field2683;
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
            for (int var36 = 0; var36 < this.field977; var36++) {
                int var37 = var5[var36];
                if (arg0.field2660[var37] != -1) {
                    int var38 = arg0.field2660[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field2678[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field2674[var37];
                        } else {
                            var40 = arg0.field2668[var37];
                        }
                        int var41 = arg0.field2672[var40];
                        int var42 = arg0.field2661[var40];
                        int var43 = arg0.field2686[var40];
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
                byte var45 = arg0.field2688[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field2700[var44];
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
                        var49 = 64.0F / (float) (arg0.field2702[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field2700[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field2702[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field2666[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field2700[var44] / 1024.0F;
                        var49 = (float) arg0.field2702[var44] / 1024.0F;
                        var48 = (float) arg0.field2666[var44] / 1024.0F;
                    }
                    var27[var44] = method415(arg0.field2693[var44], arg0.field2691[var44], arg0.field2701[var44], arg0.field2675[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field977; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field2696[var51] & 0xFFFF;
            short var53;
            if (arg0.field2699 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field2699[var51];
            }
            int var54;
            if (arg0.field2660 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field2660[var51];
            }
            int var55;
            if (arg0.field2690 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field2690[var51] & 0xFF;
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
                    byte var65 = arg0.field2688[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field2678[var51];
                        int var67 = arg0.field2674[var51];
                        int var68 = arg0.field2668[var51];
                        short var69 = arg0.field2693[var54];
                        short var70 = arg0.field2691[var54];
                        short var71 = arg0.field2701[var54];
                        float var72 = (float) arg0.field2672[var69];
                        float var73 = (float) arg0.field2661[var69];
                        float var74 = (float) arg0.field2686[var69];
                        float var75 = (float) arg0.field2672[var70] - var72;
                        float var76 = (float) arg0.field2661[var70] - var73;
                        float var77 = (float) arg0.field2686[var70] - var74;
                        float var78 = (float) arg0.field2672[var71] - var72;
                        float var79 = (float) arg0.field2661[var71] - var73;
                        float var80 = (float) arg0.field2686[var71] - var74;
                        float var81 = (float) arg0.field2672[var66] - var72;
                        float var82 = (float) arg0.field2661[var66] - var73;
                        float var83 = (float) arg0.field2686[var66] - var74;
                        float var84 = (float) arg0.field2672[var67] - var72;
                        float var85 = (float) arg0.field2661[var67] - var73;
                        float var86 = (float) arg0.field2686[var67] - var74;
                        float var87 = (float) arg0.field2672[var68] - var72;
                        float var88 = (float) arg0.field2661[var68] - var73;
                        float var89 = (float) arg0.field2686[var68] - var74;
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
                        int var101 = arg0.field2678[var51];
                        int var102 = arg0.field2674[var51];
                        int var103 = arg0.field2668[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field2656[var54];
                        float var109 = (float) arg0.field2658[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field2666[var54] & 0xFFFF) / 1024.0F;
                            method438(arg0.field2672[var101], arg0.field2661[var101], arg0.field2686[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field1016;
                            var57 = field1018;
                            method438(arg0.field2672[var102], arg0.field2661[var102], arg0.field2686[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field1016;
                            var59 = field1018;
                            method438(arg0.field2672[var103], arg0.field2661[var103], arg0.field2686[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field1016;
                            var61 = field1018;
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
                            float var112 = (float) arg0.field2684[var54] / 256.0F;
                            float var113 = (float) arg0.field2679[var54] / 256.0F;
                            int var114 = arg0.field2672[var102] - arg0.field2672[var101];
                            int var115 = arg0.field2661[var102] - arg0.field2661[var101];
                            int var116 = arg0.field2686[var102] - arg0.field2686[var101];
                            int var117 = arg0.field2672[var103] - arg0.field2672[var101];
                            int var118 = arg0.field2661[var103] - arg0.field2661[var101];
                            int var119 = arg0.field2686[var103] - arg0.field2686[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field2700[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field2702[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field2666[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method447(var126, var127, var128);
                            method416(arg0.field2672[var101], arg0.field2661[var101], arg0.field2686[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field1023;
                            var57 = field1024;
                            method416(arg0.field2672[var102], arg0.field2661[var102], arg0.field2686[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field1023;
                            var59 = field1024;
                            method416(arg0.field2672[var103], arg0.field2661[var103], arg0.field2686[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field1023;
                            var61 = field1024;
                        } else if (var65 == 3) {
                            method422(arg0.field2672[var101], arg0.field2661[var101], arg0.field2686[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field1019;
                            var57 = field1020;
                            method422(arg0.field2672[var102], arg0.field2661[var102], arg0.field2686[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field1019;
                            var59 = field1020;
                            method422(arg0.field2672[var103], arg0.field2661[var103], arg0.field2686[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field1019;
                            var61 = field1020;
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
            arg0.method1082();
            byte var129;
            if (arg0.field2663 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field2663[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field2678[var51];
                class223 var133 = arg0.field2671[var132];
                this.field982[var50] = this.method451(arg0, var132, var130, var133.field3758, var133.field3761, var133.field3762, var133.field3760, var56, var57);
                int var134 = arg0.field2674[var51];
                class223 var135 = arg0.field2671[var134];
                this.field1001[var50] = this.method451(arg0, var134, (long) var62 + var130, var135.field3758, var135.field3761, var135.field3762, var135.field3760, var58, var59);
                int var136 = arg0.field2668[var51];
                class223 var137 = arg0.field2671[var136];
                this.field1005[var50] = this.method451(arg0, var136, (long) var63 + var130, var137.field3758, var137.field3761, var137.field3762, var137.field3760, var60, var61);
            } else if (var129 == 1) {
                class170 var138 = arg0.field2703[var51];
                long var139 = (long) ((var54 << 2) + (var138.field3021 > 0 ? 1024 : 2048) + (var138.field3022 + 256 << 12) + (var138.field3025 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field982[var50] = this.method451(arg0, arg0.field2678[var51], var139, var138.field3021, var138.field3022, var138.field3025, 0, var56, var57);
                this.field1001[var50] = this.method451(arg0, arg0.field2674[var51], (long) var62 + var139, var138.field3021, var138.field3022, var138.field3025, 0, var58, var59);
                this.field1005[var50] = this.method451(arg0, arg0.field2668[var51], (long) var63 + var139, var138.field3021, var138.field3022, var138.field3025, 0, var60, var61);
            }
            if (arg0.field2699 == null) {
                this.field1002[var50] = -1;
            } else {
                this.field1002[var50] = arg0.field2699[var51];
            }
            if (this.field987 != null) {
                this.field987[var50] = (byte) arg0.field2695[var51];
            }
            this.field980[var50] = arg0.field2696[var51];
            if (arg0.field2690 != null) {
                this.field999[var50] = arg0.field2690[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field977; var143++) {
            short var144 = this.field1002[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field975 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field977; var147++) {
            short var148 = this.field1002[var147];
            if (var146 != var148) {
                this.field975[var145++] = var147;
                var146 = var148;
            }
        }
        this.field975[var145] = this.field977;
        field992 = null;
        this.field991 = method426(this.field991, this.field1003);
        this.field1012 = method426(this.field1012, this.field1003);
        this.field993 = method426(this.field993, this.field1003);
        this.field990 = method426(this.field990, this.field1003);
        this.field973 = method432(this.field973, this.field1003);
        this.field989 = method432(this.field989, this.field1003);
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(III)V", line = 1859)
    public final void method231(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field986; var4++) {
            this.field984[var4] = this.field984[var4] * arg0 >> 7;
            this.field998[var4] = this.field998[var4] * arg1 >> 7;
            this.field1009[var4] = this.field1009[var4] * arg2 >> 7;
        }
        this.field995.field1926 = false;
        this.field996.field4196 = false;
    }

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "()V", line = 1872)
    public static void method433() {
        field992 = null;
        field1004 = null;
        field1008 = null;
        field1007 = null;
        field1013 = null;
        field1014 = null;
        field1015 = null;
        field1017 = null;
        field1021 = null;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V", line = 1884)
    public final void method233(int arg0) {
        int var2 = class236.field3985[arg0];
        int var3 = class236.field3971[arg0];
        for (int var4 = 0; var4 < this.field986; var4++) {
            int var5 = this.field984[var4] * var3 + this.field1009[var4] * var2 >> 16;
            this.field1009[var4] = this.field1009[var4] * var3 - this.field984[var4] * var2 >> 16;
            this.field984[var4] = var5;
        }
        this.field995.field1926 = false;
        this.field996.field4196 = false;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)V", line = 1905)
    public final void method240(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field986; var4++) {
            this.field984[var4] += arg0;
            this.field998[var4] += arg1;
            this.field1009[var4] += arg2;
        }
        this.field995.field1926 = false;
        this.field996.field4196 = false;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V", line = 1920)
    public final void method218(int arg0) {
        int var2 = class236.field3985[arg0];
        int var3 = class236.field3971[arg0];
        for (int var4 = 0; var4 < this.field986; var4++) {
            int var5 = this.field998[var4] * var3 - this.field1009[var4] * var2 >> 16;
            this.field1009[var4] = this.field998[var4] * var2 + this.field1009[var4] * var3 >> 16;
            this.field998[var4] = var5;
        }
        this.field995.field1926 = false;
        this.field996.field4196 = false;
    }

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "()I", line = 1941)
    public final int method229() {
        if (!this.field995.field1926) {
            this.method421();
        }
        return this.field995.field1930;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZZLib;Lib;)Lwi;", line = 1950)
    private final class196 method434(boolean arg0, boolean arg1, class62 arg2, class62 arg3) {
        arg2.field986 = this.field986;
        arg2.field1003 = this.field1003;
        arg2.field977 = this.field977;
        arg2.field979 = this.field979;
        arg2.field978 = this.field978;
        arg2.field981 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field984 == null || arg2.field984.length < this.field986) {
            arg2.field984 = new int[this.field986 + 100];
            arg2.field998 = new int[this.field986 + 100];
            arg2.field1009 = new int[this.field986 + 100];
        }
        for (int var5 = 0; var5 < this.field986; var5++) {
            arg2.field984[var5] = this.field984[var5];
            arg2.field998[var5] = this.field998[var5];
            arg2.field1009[var5] = this.field1009[var5];
        }
        if (arg2.field996 == null) {
            arg2.field996 = new class251();
        }
        arg2.field996.field4196 = false;
        if (arg2.field995 == null) {
            arg2.field995 = new class113();
        }
        arg2.field995.field1926 = false;
        if (arg0) {
            arg2.field999 = this.field999;
            arg2.field972 = this.field972;
        } else {
            if (arg3.field999 == null || arg3.field999.length < this.field977) {
                arg3.field999 = new byte[this.field977 + 100];
            }
            arg2.field999 = arg3.field999;
            for (int var6 = 0; var6 < this.field977; var6++) {
                arg2.field999[var6] = this.field999[var6];
            }
            if (arg3.field972 == null) {
                arg3.field972 = new class251();
            }
            arg2.field972 = arg3.field972;
            arg2.field972.field4196 = false;
        }
        if (arg1) {
            arg2.field991 = this.field991;
            arg2.field1012 = this.field1012;
            arg2.field993 = this.field993;
            arg2.field990 = this.field990;
            arg2.field1000 = this.field1000;
        } else {
            if (arg3.field991 == null || arg3.field991.length < this.field1003) {
                arg3.field991 = new short[this.field1003 + 100];
                arg3.field1012 = new short[this.field1003 + 100];
                arg3.field993 = new short[this.field1003 + 100];
                arg3.field990 = new short[this.field1003 + 100];
            }
            arg2.field991 = arg3.field991;
            arg2.field1012 = arg3.field1012;
            arg2.field993 = arg3.field993;
            arg2.field990 = arg3.field990;
            for (int var7 = 0; var7 < this.field1003; var7++) {
                arg2.field991[var7] = this.field991[var7];
                arg2.field1012[var7] = this.field1012[var7];
                arg2.field993[var7] = this.field993[var7];
                arg2.field990[var7] = this.field990[var7];
            }
            if (class249.field4166) {
                if (arg3.field1000 == null) {
                    arg3.field1000 = new class251();
                }
                arg2.field1000 = arg3.field1000;
                arg2.field1000.field4196 = false;
            } else {
                arg2.field1000 = null;
            }
        }
        arg2.field973 = this.field973;
        arg2.field989 = this.field989;
        arg2.field976 = this.field976;
        arg2.field974 = this.field974;
        arg2.field980 = this.field980;
        arg2.field982 = this.field982;
        arg2.field1001 = this.field1001;
        arg2.field1005 = this.field1005;
        arg2.field1002 = this.field1002;
        arg2.field987 = this.field987;
        arg2.field1006 = this.field1006;
        arg2.field983 = this.field983;
        arg2.field1010 = this.field1010;
        arg2.field975 = this.field975;
        arg2.field997 = this.field997;
        arg2.field985 = this.field985;
        arg2.field3364 = this.field3364;
        return arg2;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(SS)V", line = 2079)
    public final void method435(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field977; var3++) {
            if (this.field980[var3] == arg0) {
                this.field980[var3] = arg1;
            }
        }
        this.field972.field4196 = false;
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "()V", line = 2093)
    public final void method239() {
        for (int var1 = 0; var1 < this.field986; var1++) {
            this.field984[var1] = -this.field984[var1];
            this.field1009[var1] = -this.field1009[var1];
        }
        this.field995.field1926 = false;
        this.field996.field4196 = false;
    }

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "()V", line = 2105)
    public final void method436() {
        int var10002;
        if (this.field976 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field986; var3++) {
                int var4 = this.field976[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field974 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field974[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field986) {
                int var7 = this.field976[var6] & 0xFF;
                this.field974[var7][var1[var7]++] = var6++;
            }
            this.field976 = null;
        }
        if (this.field987 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field977; var10++) {
            int var11 = this.field987[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1006 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1006[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field977) {
            int var14 = this.field987[var13] & 0xFF;
            this.field1006[var14][var8[var14]++] = var13++;
        }
        this.field987 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lja;IIIZ)V", line = 2198)
    public final void method437(class114 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class62 var6 = (class62) arg0;
        if (this.field977 == 0 || var6.field977 == 0) {
            return;
        }
        int var7 = var6.field986;
        int[] var8 = var6.field984;
        int[] var9 = var6.field998;
        int[] var10 = var6.field1009;
        short[] var11 = var6.field991;
        short[] var12 = var6.field1012;
        short[] var13 = var6.field993;
        short[] var14 = var6.field990;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field1011 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field1011.field2810;
            var16 = this.field1011.field2808;
            var17 = this.field1011.field2807;
            var18 = this.field1011.field2809;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field1011 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field1011.field2810;
            var20 = var6.field1011.field2808;
            var21 = var6.field1011.field2807;
            var22 = var6.field1011.field2809;
        }
        int[] var23 = var6.field985;
        short[] var24 = var6.field997;
        if (!var6.field995.field1926) {
            var6.method421();
        }
        short var25 = var6.field995.field1928;
        short var26 = var6.field995.field1929;
        short var27 = var6.field995.field1930;
        short var28 = var6.field995.field1925;
        short var29 = var6.field995.field1927;
        short var30 = var6.field995.field1924;
        for (int var31 = 0; var31 < this.field986; var31++) {
            int var32 = this.field998[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field984[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field1009[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field985[var31];
                        int var37 = this.field985[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field997[var38] - 1;
                            if (var35 == -1 || this.field990[var35] != 0) {
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
                                            this.field1011 = new class154();
                                            var15 = this.field1011.field2810 = class187.method1348(this.field991, 0);
                                            var16 = this.field1011.field2808 = class187.method1348(this.field1012, 0);
                                            var17 = this.field1011.field2807 = class187.method1348(this.field993, 0);
                                            var18 = this.field1011.field2809 = class187.method1348(this.field990, 0);
                                        }
                                        if (var19 == null) {
                                            class154 var44 = var6.field1011 = new class154();
                                            var19 = var44.field2810 = class187.method1348(var11, 0);
                                            var20 = var44.field2808 = class187.method1348(var12, 0);
                                            var21 = var44.field2807 = class187.method1348(var13, 0);
                                            var22 = var44.field2809 = class187.method1348(var14, 0);
                                        }
                                        short var45 = this.field991[var35];
                                        short var46 = this.field1012[var35];
                                        short var47 = this.field993[var35];
                                        short var48 = this.field990[var35];
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
                                        int var57 = this.field985[var31];
                                        int var58 = this.field985[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field997[var59] - 1;
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

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIII[FFIF)V", line = 2436)
    private static final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field1016 = var16;
        field1018 = var17;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lfd;IZ)V", line = 2480)
    public final void method208(class219 arg0, int arg1, boolean arg2) {
        if (this.field974 == null || arg1 == -1) {
            return;
        }
        class145 var4 = arg0.field3691[arg1];
        class180 var5 = var4.field2655;
        for (int var6 = 0; var6 < this.field986; var6++) {
            this.field984[var6] <<= 0x4;
            this.field998[var6] <<= 0x4;
            this.field1009[var6] <<= 0x4;
        }
        field1025 = 0;
        field1022 = 0;
        field1026 = 0;
        for (int var7 = 0; var7 < var4.field2645; var7++) {
            short var8 = var4.field2651[var7];
            if (var4.field2646[var7] != -1) {
                this.method440(0, var5.field3133[var4.field2646[var7]], 0, 0, 0, arg2);
            }
            this.method440(var5.field3137[var8], var5.field3133[var8], var4.field2648[var7], var4.field2647[var7], var4.field2650[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field986; var9++) {
            this.field984[var9] >>= 0x4;
            this.field998[var9] >>= 0x4;
            this.field1009[var9] >>= 0x4;
        }
        this.field995.field1926 = false;
        this.field996.field4196 = false;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZZZZZZZ)V", line = 2533)
    public final void method439(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field981 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field1003 != 0) {
            if (arg6) {
                boolean var8 = !this.field972.field4196 && (arg1 || arg2 && !class249.field4166);
                this.method428(false, !this.field996.field4196 && arg0, var8, this.field1000 != null && !this.field1000.field4196 && arg2, !this.field983.field4196 && arg3);
                if (!this.field1010.field4196 && arg4 && arg1) {
                    this.method420();
                }
            }
            if (arg0) {
                if (this.field996.field4196) {
                    if (!this.field995.field1926) {
                        this.method421();
                    }
                    this.field984 = null;
                    this.field998 = null;
                    this.field1009 = null;
                    this.field997 = null;
                    this.field985 = null;
                } else {
                    this.field994 = (byte) (this.field994 | 0x1);
                }
            }
            if (arg1) {
                if (this.field972.field4196) {
                    this.field980 = null;
                    this.field999 = null;
                } else {
                    this.field994 = (byte) (this.field994 | 0x2);
                }
            }
            if (arg2 && class249.field4166) {
                if (this.field1000.field4196) {
                    this.field991 = null;
                    this.field1012 = null;
                    this.field993 = null;
                    this.field990 = null;
                } else {
                    this.field994 = (byte) (this.field994 | 0x4);
                }
            }
            if (arg3) {
                if (this.field983.field4196) {
                    this.field973 = null;
                    this.field989 = null;
                } else {
                    this.field994 = (byte) (this.field994 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field1010.field4196 && this.field972.field4196) {
                    this.field982 = null;
                    this.field1001 = null;
                    this.field1005 = null;
                } else {
                    this.field994 = (byte) (this.field994 | 0x10);
                }
            }
            if (arg5) {
                this.field976 = null;
                this.field987 = null;
                this.field974 = (int[][]) null;
                this.field1006 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[IIIIZ)V", line = 2631)
    private final void method440(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field1025 = 0;
            field1022 = 0;
            field1026 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field974.length) {
                    int[] var14 = this.field974[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field1025 += this.field984[var16];
                        field1022 += this.field998[var16];
                        field1026 += this.field1009[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field1025 = field1025 / var11 + var8;
                field1022 = field1022 / var11 + var9;
                field1026 = field1026 / var11 + var10;
            } else {
                field1025 = var8;
                field1022 = var9;
                field1026 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field974.length) {
                    int[] var22 = this.field974[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field984[var24] += var17;
                        this.field998[var24] += var18;
                        this.field1009[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field974.length) {
                    int[] var27 = this.field974[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field984[var29] -= field1025;
                        this.field998[var29] -= field1022;
                        this.field1009[var29] -= field1026;
                        if (arg4 != 0) {
                            int var30 = class236.field3985[arg4];
                            int var31 = class236.field3971[arg4];
                            int var32 = this.field998[var29] * var30 + this.field984[var29] * var31 + 32767 >> 16;
                            this.field998[var29] = this.field998[var29] * var31 + 32767 - this.field984[var29] * var30 >> 16;
                            this.field984[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class236.field3985[arg2];
                            int var34 = class236.field3971[arg2];
                            int var35 = this.field998[var29] * var34 + 32767 - this.field1009[var29] * var33 >> 16;
                            this.field1009[var29] = this.field998[var29] * var33 + this.field1009[var29] * var34 + 32767 >> 16;
                            this.field998[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class236.field3985[arg3];
                            int var37 = class236.field3971[arg3];
                            int var38 = this.field984[var29] * var37 + this.field1009[var29] * var36 + 32767 >> 16;
                            this.field1009[var29] = this.field1009[var29] * var37 + 32767 - this.field984[var29] * var36 >> 16;
                            this.field984[var29] = var38;
                        }
                        this.field984[var29] += field1025;
                        this.field998[var29] += field1022;
                        this.field1009[var29] += field1026;
                    }
                }
            }
            if (arg5 && this.field991 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field974.length) {
                        int[] var41 = this.field974[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field985[var43];
                            int var45 = this.field985[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field997[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class236.field3985[arg4];
                                    int var49 = class236.field3971[arg4];
                                    int var50 = this.field991[var47] * var49 + this.field1012[var47] * var48 + 32767 >> 16;
                                    this.field1012[var47] = (short) (this.field1012[var47] * var49 + 32767 - this.field991[var47] * var48 >> 16);
                                    this.field991[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class236.field3985[arg2];
                                    int var52 = class236.field3971[arg2];
                                    int var53 = this.field1012[var47] * var52 + 32767 - this.field993[var47] * var51 >> 16;
                                    this.field993[var47] = (short) (this.field993[var47] * var52 + this.field1012[var47] * var51 + 32767 >> 16);
                                    this.field1012[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class236.field3985[arg3];
                                    int var55 = class236.field3971[arg3];
                                    int var56 = this.field993[var47] * var54 + this.field991[var47] * var55 + 32767 >> 16;
                                    this.field993[var47] = (short) (this.field993[var47] * var55 + 32767 - this.field991[var47] * var54 >> 16);
                                    this.field991[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field1000 != null) {
                    this.field1000.field4196 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field974.length) {
                    int[] var59 = this.field974[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field984[var61] -= field1025;
                        this.field998[var61] -= field1022;
                        this.field1009[var61] -= field1026;
                        this.field984[var61] = this.field984[var61] * arg2 >> 7;
                        this.field998[var61] = this.field998[var61] * arg3 >> 7;
                        this.field1009[var61] = this.field1009[var61] * arg4 >> 7;
                        this.field984[var61] += field1025;
                        this.field998[var61] += field1022;
                        this.field1009[var61] += field1026;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1006 != null && this.field999 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field1006.length) {
                    int[] var64 = this.field1006[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field999[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field999[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field972.field4196 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "()I", line = 2974)
    public final int method441() {
        return this.field978;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lie;)Lie;", line = 2978)
    public final class2 method442(class2 arg0) {
        if (this.field1003 == 0) {
            return null;
        }
        if (!this.field995.field1926) {
            this.method421();
        }
        int var2;
        int var3;
        if (class235.field3961 > 0) {
            var2 = this.field995.field1930 - (class235.field3961 * this.field995.field1929 >> 8) >> 3;
            var3 = this.field995.field1925 - (class235.field3961 * this.field995.field1928 >> 8) >> 3;
        } else {
            var2 = this.field995.field1930 - (class235.field3961 * this.field995.field1928 >> 8) >> 3;
            var3 = this.field995.field1925 - (class235.field3961 * this.field995.field1929 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class235.field3966 > 0) {
            var4 = this.field995.field1927 - (class235.field3966 * this.field995.field1929 >> 8) >> 3;
            var5 = this.field995.field1924 - (class235.field3966 * this.field995.field1928 >> 8) >> 3;
        } else {
            var4 = this.field995.field1927 - (class235.field3966 * this.field995.field1928 >> 8) >> 3;
            var5 = this.field995.field1924 - (class235.field3966 * this.field995.field1929 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class2 var8;
        if (arg0 == null || arg0.field14.length < var6 * var7) {
            var8 = new class2(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field360 = arg0.field376 = var6;
            arg0.field367 = arg0.field375 = var7;
            arg0.method13();
        }
        var8.field368 = var2;
        var8.field363 = var4;
        if (field1017.length < this.field1003) {
            field1017 = new int[this.field1003];
            field1021 = new int[this.field1003];
        }
        for (int var9 = 0; var9 < this.field986; var9++) {
            int var10 = (this.field984[var9] - (this.field998[var9] * class235.field3961 >> 8) >> 3) - var2;
            int var11 = (this.field1009[var9] - (this.field998[var9] * class235.field3966 >> 8) >> 3) - var4;
            int var12 = this.field985[var9];
            int var13 = this.field985[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field997[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field1017[var15] = var10;
                field1021[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field977; var16++) {
            if (this.field999[var16] <= 128) {
                short var17 = this.field982[var16];
                short var18 = this.field1001[var16];
                short var19 = this.field1005[var16];
                int var20 = field1017[var17];
                int var21 = field1017[var18];
                int var22 = field1017[var19];
                int var23 = field1021[var17];
                int var24 = field1021[var18];
                int var25 = field1021[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class236.method1622(var8.field14, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "()V", line = 3104)
    public final void method235() {
        for (int var1 = 0; var1 < this.field986; var1++) {
            int var2 = this.field984[var1];
            this.field984[var1] = this.field1009[var1];
            this.field1009[var1] = -var2;
        }
        this.field995.field1926 = false;
        this.field996.field4196 = false;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "()I", line = 3121)
    public final int method222() {
        if (!this.field995.field1926) {
            this.method421();
        }
        return this.field995.field1925;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIII)Z", line = 3127)
    private final boolean method443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "()V", line = 3143)
    private final void method444() {
        GL var1 = class56.field848;
        if (this.field977 == 0) {
            return;
        }
        if (this.field981 != 0) {
            this.method428(true, !this.field996.field4196 && (this.field981 & 0x1) != 0, !this.field972.field4196 && (this.field981 & 0x2) != 0, this.field1000 != null && !this.field1000.field4196 && (this.field981 & 0x4) != 0, false);
        }
        this.method428(false, !this.field996.field4196, !this.field972.field4196, this.field1000 != null && !this.field1000.field4196, !this.field983.field4196);
        if (!this.field1010.field4196) {
            this.method420();
        }
        if (this.field994 != 0) {
            if ((this.field994 & 0x1) != 0) {
                this.field984 = null;
                this.field998 = null;
                this.field1009 = null;
                this.field997 = null;
                this.field985 = null;
            }
            if ((this.field994 & 0x2) != 0) {
                this.field980 = null;
                this.field999 = null;
            }
            if ((this.field994 & 0x4) != 0) {
                this.field991 = null;
                this.field1012 = null;
                this.field993 = null;
                this.field990 = null;
            }
            if ((this.field994 & 0x8) != 0) {
                this.field973 = null;
                this.field989 = null;
            }
            if ((this.field994 & 0x10) != 0) {
                this.field982 = null;
                this.field1001 = null;
                this.field1005 = null;
            }
            this.field994 = 0;
        }
        class83 var2 = null;
        if (this.field996.field4191 != null) {
            this.field996.field4191.method588();
            var2 = this.field996.field4191;
            var1.glVertexPointer(3, 5126, this.field996.field4208, (long) this.field996.field4197);
        }
        if (this.field972.field4191 != null) {
            if (this.field972.field4191 != var2) {
                this.field972.field4191.method588();
                var2 = this.field972.field4191;
            }
            var1.glColorPointer(4, 5121, this.field972.field4208, (long) this.field972.field4197);
        }
        if (class249.field4166 && this.field1000.field4191 != null) {
            if (this.field1000.field4191 != var2) {
                this.field1000.field4191.method588();
                var2 = this.field1000.field4191;
            }
            var1.glNormalPointer(5126, this.field1000.field4208, (long) this.field1000.field4197);
        }
        if (this.field983.field4191 != null) {
            if (this.field983.field4191 != var2) {
                this.field983.field4191.method588();
                class83 var3 = this.field983.field4191;
            }
            var1.glTexCoordPointer(2, 5126, this.field983.field4208, (long) this.field983.field4197);
        }
        if (this.field1010.field4191 != null) {
            this.field1010.field4191.method587();
        }
        if (this.field996.field4191 == null || this.field972.field4191 == null || class249.field4166 && this.field1000.field4191 == null || this.field983.field4191 == null) {
            if (class56.field855) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field996.field4191 == null) {
                this.field996.field4206.position(this.field996.field4197);
                var1.glVertexPointer(3, 5126, this.field996.field4208, this.field996.field4206);
            }
            if (this.field972.field4191 == null) {
                this.field972.field4206.position(this.field972.field4197);
                var1.glColorPointer(4, 5121, this.field972.field4208, this.field972.field4206);
            }
            if (class249.field4166 && this.field1000.field4191 == null) {
                this.field1000.field4206.position(this.field1000.field4197);
                var1.glNormalPointer(5126, this.field1000.field4208, this.field1000.field4206);
            }
            if (this.field983.field4191 == null) {
                this.field983.field4206.position(this.field983.field4197);
                var1.glTexCoordPointer(2, 5126, this.field983.field4208, this.field983.field4206);
            }
        }
        if (this.field1010.field4191 == null && class56.field855) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field975.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field975[var5];
            int var7 = this.field975[var5 + 1];
            short var8 = this.field1002[var6];
            if (var8 == -1) {
                class56.method354(-1);
                class51.method325(0, 0, 26604);
            } else {
                class236.field3987.method604((byte) 101, var8 & 0xFFFF);
            }
            if (this.field1010.field4191 == null) {
                this.field1010.field4206.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field1010.field4206);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "()V", line = 3314)
    public final void method445() {
        if (this.field991 == null) {
            this.method239();
            return;
        }
        for (int var1 = 0; var1 < this.field986; var1++) {
            this.field984[var1] = -this.field984[var1];
            this.field1009[var1] = -this.field1009[var1];
        }
        for (int var2 = 0; var2 < this.field1003; var2++) {
            this.field991[var2] = (short) (-this.field991[var2]);
            this.field993[var2] = (short) (-this.field993[var2]);
        }
        this.field995.field1926 = false;
        this.field996.field4196 = false;
        if (this.field1000 != null) {
            this.field1000.field4196 = false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(SS)V", line = 3349)
    public final void method446(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field977; var3++) {
            if (this.field1002[var3] == arg0) {
                this.field1002[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class236.field3987.method596((byte) -71, arg0 & 0xFFFF);
            var5 = class236.field3987.method602(arg0 & 0xFFFF, (byte) -87);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class236.field3987.method596((byte) -103, arg1 & 0xFFFF);
            var7 = class236.field3987.method602(arg1 & 0xFFFF, (byte) -87);
        }
        if (var4 != var6 || var5 != var7) {
            this.field972.field4196 = false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "()I", line = 3384)
    public final int method236() {
        if (!this.field995.field1926) {
            this.method421();
        }
        return this.field995.field1924;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIJ)V", line = 3390)
    public final void method220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field1003 == 0) {
            return;
        }
        GL var10 = class56.field848;
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
        this.method444();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(FFF)I", line = 3418)
    private static final int method447(float arg0, float arg1, float arg2) {
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

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V", line = 3453)
    private final void method448(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field1025 = 0;
            field1022 = 0;
            field1026 = 0;
            for (int var6 = 0; var6 < this.field986; var6++) {
                field1025 += this.field984[var6];
                field1022 += this.field998[var6];
                field1026 += this.field1009[var6];
                var5++;
            }
            if (var5 > 0) {
                field1025 = field1025 / var5 + arg1;
                field1022 = field1022 / var5 + arg2;
                field1026 = field1026 / var5 + arg3;
            } else {
                field1025 = arg1;
                field1022 = arg2;
                field1026 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field986; var7++) {
                this.field984[var7] += arg1;
                this.field998[var7] += arg2;
                this.field1009[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field986; var8++) {
                this.field984[var8] -= field1025;
                this.field998[var8] -= field1022;
                this.field1009[var8] -= field1026;
                if (arg3 != 0) {
                    int var9 = class236.field3985[arg3];
                    int var10 = class236.field3971[arg3];
                    int var11 = this.field998[var8] * var9 + this.field984[var8] * var10 + 32767 >> 16;
                    this.field998[var8] = this.field998[var8] * var10 + 32767 - this.field984[var8] * var9 >> 16;
                    this.field984[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class236.field3985[arg1];
                    int var13 = class236.field3971[arg1];
                    int var14 = this.field998[var8] * var13 + 32767 - this.field1009[var8] * var12 >> 16;
                    this.field1009[var8] = this.field998[var8] * var12 + this.field1009[var8] * var13 + 32767 >> 16;
                    this.field998[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class236.field3985[arg2];
                    int var16 = class236.field3971[arg2];
                    int var17 = this.field984[var8] * var16 + this.field1009[var8] * var15 + 32767 >> 16;
                    this.field1009[var8] = this.field1009[var8] * var16 + 32767 - this.field984[var8] * var15 >> 16;
                    this.field984[var8] = var17;
                }
                this.field984[var8] += field1025;
                this.field998[var8] += field1022;
                this.field1009[var8] += field1026;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field986; var18++) {
                this.field984[var18] -= field1025;
                this.field998[var18] -= field1022;
                this.field1009[var18] -= field1026;
                this.field984[var18] = this.field984[var18] * arg1 / 128;
                this.field998[var18] = this.field998[var18] * arg2 / 128;
                this.field1009[var18] = this.field1009[var18] * arg3 / 128;
                this.field984[var18] += field1025;
                this.field998[var18] += field1022;
                this.field1009[var18] += field1026;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field977; var19++) {
                int var20 = (this.field999[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field999[var19] = (byte) var20;
            }
            this.field972.field4196 = false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()Z", line = 3612)
    public final boolean method449() {
        return this.field971 && this.field984 != null && this.field991 != null;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(ZZ)Lwi;", line = 3620)
    public final class196 method217(boolean arg0, boolean arg1) {
        return this.method434(arg0, arg1, field1013, field1007);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ISIB)I", line = 3625)
    private static final int method450(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class236.field3979[class38.method232(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class236.field3987.method596((byte) -107, arg1 & 0xFFFF);
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
            int var9 = class236.field3987.method602(arg1 & 0xFFFF, (byte) -87);
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

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lkm;IJIIIIFF)S", line = 3692)
    private final short method451(class146 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field985[arg1];
        int var12 = this.field985[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field997[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field992[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field997[var13] = (short) (this.field1003 + 1);
        field992[var13] = arg2;
        this.field991[this.field1003] = (short) arg3;
        this.field1012[this.field1003] = (short) arg4;
        this.field993[this.field1003] = (short) arg5;
        this.field990[this.field1003] = (short) arg6;
        this.field973[this.field1003] = arg7;
        this.field989[this.field1003] = arg8;
        return (short) (this.field1003++);
    }

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "(I)V", line = 3727)
    public final void method452(int arg0) {
        this.field978 = (short) arg0;
        if (this.field1000 != null) {
            this.field1000.field4196 = false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "()I", line = 3739)
    public final int method242() {
        if (!this.field995.field1926) {
            this.method421();
        }
        return this.field995.field1931;
    }
}

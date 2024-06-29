import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class408 extends class413 {

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "Lao;")
    public static class188 field5988 = new class188(54, 10);

    @OriginalMember(owner = "client!ht", name = "G", descriptor = "[B")
    public static byte[] field6014 = new byte[16384];

    @OriginalMember(owner = "client!ht", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field6017 = new String[100];

    @OriginalMember(owner = "client!ht", name = "B", descriptor = "[I")
    public static int[] field6009 = new int[14];

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "F")
    public float field5991;

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "F")
    public float field5992;

    @OriginalMember(owner = "client!ht", name = "s", descriptor = "F")
    public float field6000;

    @OriginalMember(owner = "client!ht", name = "u", descriptor = "F")
    public float field6002;

    @OriginalMember(owner = "client!ht", name = "v", descriptor = "F")
    public float field6003;

    @OriginalMember(owner = "client!ht", name = "D", descriptor = "F")
    public float field6011;

    @OriginalMember(owner = "client!ht", name = "F", descriptor = "F")
    public float field6013;

    @OriginalMember(owner = "client!ht", name = "H", descriptor = "F")
    public float field6015;

    @OriginalMember(owner = "client!ht", name = "K", descriptor = "F")
    public float field6018;

    @OriginalMember(owner = "client!ht", name = "N", descriptor = "F")
    public float field6021;

    @OriginalMember(owner = "client!ht", name = "Q", descriptor = "F")
    public float field6024;

    @OriginalMember(owner = "client!ht", name = "T", descriptor = "F")
    public float field6027;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!ht", name = "n", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!ht", name = "o", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!ht", name = "p", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!ht", name = "q", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!ht", name = "r", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!ht", name = "t", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!ht", name = "w", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!ht", name = "x", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!ht", name = "A", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!ht", name = "C", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!ht", name = "E", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!ht", name = "I", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!ht", name = "M", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!ht", name = "O", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!ht", name = "P", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!ht", name = "R", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!ht", name = "S", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!ht", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field6019;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)[F", line = 3)
    public final float[] method2525(int arg0) {
        class287.field4142[5] = this.field6027;
        field6005++;
        class287.field4142[0] = this.field6024;
        if (arg0 != -14766) {
            field6014 = null;
        }
        class287.field4142[9] = this.field6013;
        class287.field4142[4] = this.field6002;
        class287.field4142[2] = this.field6021;
        class287.field4142[1] = this.field5992;
        class287.field4142[6] = this.field6000;
        class287.field4142[12] = 0.0F;
        class287.field4142[14] = 0.0F;
        class287.field4142[10] = this.field6015;
        class287.field4142[8] = this.field6003;
        class287.field4142[13] = 0.0F;
        return class287.field4142;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(III[I)V", line = 29)
    public final void method997(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field6015 + (float) arg0 * this.field6021 + (float) arg1 * this.field6000 + this.field6011);
        field6006++;
        arg3[0] = (int) ((float) arg2 * this.field6003 + (float) arg0 * this.field6024 + (float) arg1 * this.field6002 + this.field6018);
        arg3[1] = (int) ((float) arg2 * this.field6013 + (float) arg0 * this.field5992 + (float) arg1 * this.field6027 + this.field5991);
    }

    @OriginalMember(owner = "client!ht", name = "ba", descriptor = "(Lia;)V", line = 45)
    public final void method995(class413 arg0) {
        field6012++;
        class408 var2 = (class408) arg0;
        this.field6015 = var2.field6015;
        this.field6027 = var2.field6027;
        this.field6013 = var2.field6013;
        this.field6002 = var2.field6002;
        this.field6000 = var2.field6000;
        this.field6021 = var2.field6021;
        this.field6018 = var2.field6018;
        this.field6024 = var2.field6024;
        this.field5991 = var2.field5991;
        this.field6011 = var2.field6011;
        this.field6003 = var2.field6003;
        this.field5992 = var2.field5992;
    }

    @OriginalMember(owner = "client!ht", name = "X", descriptor = "([I)V", line = 68)
    public final void method1005(int[] arg0) {
        field6023++;
        float var2 = (float) arg0[0] - this.field6018;
        float var3 = (float) arg0[1] - this.field5991;
        float var4 = (float) arg0[2] - this.field6011;
        arg0[1] = (int) (this.field6000 * var4 + this.field6027 * var3 + this.field6002 * var2);
        arg0[0] = (int) (this.field6021 * var4 + this.field6024 * var2 + this.field5992 * var3);
        arg0[2] = (int) (this.field6015 * var4 + this.field6013 * var3 + this.field6003 * var2);
    }

    @OriginalMember(owner = "client!ht", name = "na", descriptor = "(I)V", line = 87)
    public final void method994(int arg0) {
        field5993++;
        float var2 = class428.field6256[arg0 & 0x3FFF];
        float var3 = class428.field6253[arg0 & 0x3FFF];
        float var4 = this.field5992;
        float var5 = this.field6027;
        float var6 = this.field6013;
        float var7 = this.field5991;
        this.field5992 = var2 * var4 - this.field6021 * var3;
        this.field6021 = this.field6021 * var2 + var3 * var4;
        this.field6027 = var2 * var5 - this.field6000 * var3;
        this.field6013 = var2 * var6 - this.field6015 * var3;
        this.field6000 = this.field6000 * var2 + var3 * var5;
        this.field6015 = this.field6015 * var2 + var3 * var6;
        this.field5991 = var2 * var7 - this.field6011 * var3;
        this.field6011 = this.field6011 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)[F", line = 116)
    public final float[] method2526(int arg0) {
        class287.field4142[12] = this.field6018;
        class287.field4142[13] = this.field5991;
        class287.field4142[1] = this.field5992;
        class287.field4142[5] = this.field6027;
        class287.field4142[9] = this.field6013;
        class287.field4142[8] = this.field6003;
        class287.field4142[4] = this.field6002;
        field5997++;
        class287.field4142[10] = this.field6015;
        class287.field4142[2] = this.field6021;
        if (arg0 <= 38) {
            this.method1007(-33);
        }
        class287.field4142[0] = this.field6024;
        class287.field4142[6] = this.field6000;
        class287.field4142[14] = this.field6011;
        return class287.field4142;
    }

    @OriginalMember(owner = "client!ht", name = "R", descriptor = "(III)V", line = 139)
    public final void method1008(int arg0, int arg1, int arg2) {
        this.field6011 = arg2;
        this.field6024 = this.field6027 = this.field6015 = 1.0F;
        this.field6018 = arg0;
        this.field5991 = arg1;
        field5990++;
        this.field5992 = this.field6021 = this.field6002 = this.field6000 = this.field6003 = this.field6013 = 0.0F;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)[Ldq;", line = 155)
    public static final class489[] method2527(byte arg0) {
        if (arg0 == 83) {
            field5994++;
            return new class489[] { class359.field5430, class406.field5974, class358.field5426, class222.field3222, class397.field5835, class475.field6990, class455.field6734, class182.field2743, class127.field1934, class94.field1537, class266.field3837, class92.field1518, class290.field4165, class18.field273, class353.field5342 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "ZA", descriptor = "(III)V", line = 166)
    public final void method1004(int arg0, int arg1, int arg2) {
        field6022++;
        this.field6011 += arg2;
        this.field6018 += arg0;
        this.field5991 += arg1;
    }

    @OriginalMember(owner = "client!ht", name = "YA", descriptor = "(I)V", line = 177)
    public final void method999(int arg0) {
        field5996++;
        this.field6024 = 1.0F;
        this.field6027 = this.field6015 = class428.field6256[arg0 & 0x3FFF];
        this.field6000 = class428.field6253[arg0 & 0x3FFF];
        this.field6002 = this.field6003 = this.field6018 = this.field5992 = this.field5991 = this.field6021 = this.field6011 = 0.0F;
        this.field6013 = -this.field6000;
    }

    @OriginalMember(owner = "client!ht", name = "O", descriptor = "(I)V", line = 191)
    public final void method1007(int arg0) {
        this.field6027 = 1.0F;
        field6020++;
        this.field6024 = this.field6015 = class428.field6256[arg0 & 0x3FFF];
        this.field6003 = class428.field6253[arg0 & 0x3FFF];
        this.field6021 = -this.field6003;
        this.field6002 = this.field6018 = this.field5992 = this.field6013 = this.field5991 = this.field6000 = this.field6011 = 0.0F;
    }

    @OriginalMember(owner = "client!ht", name = "Q", descriptor = "(IIIIII)V", line = 209)
    public final void method1000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6008++;
        float var7 = class428.field6256[arg3 & 0x3FFF];
        float var8 = class428.field6253[arg3 & 0x3FFF];
        float var9 = class428.field6256[arg4 & 0x3FFF];
        float var10 = class428.field6253[arg4 & 0x3FFF];
        float var11 = class428.field6256[arg5 & 0x3FFF];
        float var12 = class428.field6253[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field6015 = var7 * var9;
        this.field6027 = var7 * var11;
        this.field6000 = -var8;
        this.field6024 = var9 * var11 + var10 * var14;
        this.field6002 = var7 * var12;
        this.field6003 = -var10 * var11 + var9 * var14;
        this.field6021 = var7 * var10;
        this.field5992 = -var9 * var12 + var10 * var13;
        this.field6013 = var9 * var13 + var10 * var12;
        this.field6018 = (float) (-arg0) * this.field6024 - (float) arg1 * this.field6002 - ((float) arg2 * this.field6003);
        this.field6011 = (float) (-arg0) * this.field6021 - ((float) arg1 * this.field6000) - ((float) arg2 * this.field6015);
        this.field5991 = (float) (-arg0) * this.field5992 - (float) arg1 * this.field6027 - (float) arg2 * this.field6013;
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)V", line = 245)
    public final void method996(int arg0) {
        field6010++;
        float var2 = class428.field6256[arg0 & 0x3FFF];
        float var3 = class428.field6253[arg0 & 0x3FFF];
        float var4 = this.field6024;
        float var5 = this.field6002;
        float var6 = this.field6003;
        this.field6024 = this.field6021 * var3 + var2 * var4;
        float var7 = this.field6018;
        this.field6021 = this.field6021 * var2 - var3 * var4;
        this.field6002 = this.field6000 * var3 + var2 * var5;
        this.field6003 = this.field6015 * var3 + var2 * var6;
        this.field6000 = this.field6000 * var2 - (var3 * var5);
        this.field6015 = this.field6015 * var2 - (var3 * var6);
        this.field6018 = this.field6011 * var3 + var2 * var7;
        this.field6011 = this.field6011 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "(I)V", line = 272)
    public static void method2528(int arg0) {
        if (arg0 != 9) {
            field6014 = null;
        }
        field5988 = null;
        field6009 = null;
        field6019 = null;
        field6014 = null;
        field6017 = null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IFIFFBI)V", line = 295)
    public final void method2529(int arg0, float arg1, int arg2, float arg3, float arg4, byte arg5, int arg6) {
        field5995++;
        if (arg6 == 0) {
            this.field6027 = arg0;
            this.field6024 = arg2;
            this.field6015 = 1.0F;
            this.field5992 = this.field6021 = this.field6002 = this.field6000 = this.field6003 = this.field6013 = 0.0F;
        } else {
            float var8 = class428.field6256[arg6 & 0x3FFF];
            float var9 = class428.field6253[arg6 & 0x3FFF];
            this.field6024 = (float) arg2 * var8;
            this.field6021 = this.field6000 = this.field6003 = this.field6013 = 0.0F;
            this.field6015 = 1.0F;
            this.field6002 = (float) arg0 * -var9;
            this.field5992 = (float) arg2 * var9;
            this.field6027 = (float) arg0 * var8;
        }
        this.field5991 = arg4;
        this.field6018 = arg1;
        this.field6011 = arg3;
        if (arg5 < 10) {
            this.method1004(-125, -27, 13);
        }
    }

    @OriginalMember(owner = "client!ht", name = "E", descriptor = "(III[I)V", line = 329)
    public final void method993(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field6003 + (float) arg0 * this.field6024 + (float) arg1 * this.field6002);
        arg3[2] = (int) ((float) arg2 * this.field6015 + (float) arg0 * this.field6021 + (float) arg1 * this.field6000);
        field6016++;
        arg3[1] = (int) ((float) arg2 * this.field6013 + (float) arg0 * this.field5992 + (float) arg1 * this.field6027);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "([[BBLqs;)V", line = 345)
    public static final void method2530(byte[][] arg0, byte arg1, class425 arg2) {
        field6026++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class303 var11 = new class303(var10);
                int var12 = class274.field3954[var5] >> 8;
                int var13 = class274.field3954[var5] & 0xFF;
                int var14 = var12 * 64 - class483.field7082;
                int var15 = var13 * 64 - class465.field6840;
                class292.method1811(true);
                arg2.method1073(class465.field6840, class255.field3679, true, var15, var14, class483.field7082, var11);
                arg2.method2594(var11, (byte) -115, class394.field5821, var3, var15, var14);
                if (!arg2.field2251 && (class351.field5335 / 8) == var12 && class251.field3624 / 8 == var13 && var3[0] != -1) {
                    class118.field1861 = class233.field3389.method1209(class25.field443, (byte) 100, var3[3], var3[0], var3[2], var3[1]);
                    class37.field574 = var3[4];
                }
            }
        }
        int var6 = 0;
        if (arg1 > -33) {
            method2528(-48);
        }
        while (var4 > var6) {
            int var7 = (class274.field3954[var6] >> 8) * 64 - class483.field7082;
            int var8 = (class274.field3954[var6] & 0xFF) * 64 - class465.field6840;
            byte[] var9 = arg0[var6];
            if (var9 == null && class251.field3624 < 800) {
                class292.method1811(true);
                arg2.method1072(-120, var7, 64, 64, var8);
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BLia;)V", line = 418)
    public final void method2531(byte arg0, class413 arg1) {
        field5989++;
        class408 var3 = (class408) arg1;
        if (arg0 >= -50) {
            return;
        }
        this.field6003 = var3.field6021;
        this.field6024 = var3.field6024;
        this.field6002 = var3.field5992;
        this.field6027 = var3.field6027;
        this.field6013 = var3.field6000;
        this.field6021 = var3.field6003;
        this.field5992 = var3.field6002;
        this.field6015 = var3.field6015;
        this.field6018 = -(this.field6003 * var3.field6011 + this.field6024 * var3.field6018 + this.field6002 * var3.field5991);
        this.field6000 = var3.field6013;
        this.field5991 = -(this.field6013 * var3.field6011 + this.field6027 * var3.field5991 + this.field5992 * var3.field6018);
        this.field6011 = -(this.field6015 * var3.field6011 + this.field6021 * var3.field6018 + this.field6000 * var3.field5991);
    }

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "(I)V", line = 446)
    public static final void method2532(int arg0) {
        class333.field5117 = 0;
        field6001++;
        if (arg0 != 2) {
            field5988 = null;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class253.field3640[var1] = null;
            class133.field2063[var1] = 1;
            class518.field7618[var1] = null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "ma", descriptor = "(I)V", line = 468)
    public final void method998(int arg0) {
        field5998++;
        this.field6015 = 1.0F;
        this.field6024 = this.field6027 = class428.field6256[arg0 & 0x3FFF];
        this.field5992 = class428.field6253[arg0 & 0x3FFF];
        this.field6002 = -this.field5992;
        this.field6003 = this.field6018 = this.field6013 = this.field5991 = this.field6021 = this.field6000 = this.field6011 = 0.0F;
    }

    @OriginalMember(owner = "client!ht", name = "HA", descriptor = "()V", line = 485)
    public final void method1003() {
        this.field6024 = this.field6027 = this.field6015 = 1.0F;
        this.field5992 = this.field6021 = this.field6002 = this.field6000 = this.field6003 = this.field6013 = this.field6018 = this.field5991 = this.field6011 = 0.0F;
        field6025++;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "()Lia;", line = 494)
    public final class413 method1002() {
        field6007++;
        class408 var1 = new class408();
        var1.field6013 = this.field6013;
        var1.field6003 = this.field6003;
        var1.field6027 = this.field6027;
        var1.field6011 = this.field6011;
        var1.field6018 = this.field6018;
        var1.field6015 = this.field6015;
        var1.field5991 = this.field5991;
        var1.field5992 = this.field5992;
        var1.field6024 = this.field6024;
        var1.field6021 = this.field6021;
        var1.field6000 = this.field6000;
        var1.field6002 = this.field6002;
        return var1;
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V", line = 516)
    public class408() {
        this.method1003();
    }

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "(I)V", line = 527)
    public static final void method2533(int arg0) {
        field6004++;
        if (!class319.field4567) {
            return;
        }
        int var1 = 89 / ((arg0 + 5) / 61);
        while (true) {
            while (class6.field93 < class291.field4170.length) {
                class507 var2 = class291.field4170[class6.field93];
                if (var2 != null && var2.field7413 == -1) {
                    if (class127.field1931 == null) {
                        class127.field1931 = class47.field722.method216(var2.field7416, 915);
                    }
                    int var3 = class127.field1931.field4956;
                    if (var3 == -1) {
                        return;
                    }
                    var2.field7413 = var3;
                    class6.field93++;
                    class127.field1931 = null;
                } else {
                    class6.field93++;
                }
            }
            return;
        }
    }
}

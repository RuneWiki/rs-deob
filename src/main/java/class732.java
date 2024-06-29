import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class732 implements class151 {

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "Llp;")
    private class393 field10251 = new class393(256);

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "Lvd;")
    private class39 field10246;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "Lvd;")
    private class39 field10240;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    private int field10253;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "[Ltha;")
    private class293[] field10242;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "Lfa;")
    public static class235 field10250 = new class235(10, 2, 2, 0);

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "J")
    public static long field10254 = 0L;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field10241;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field10243;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field10244;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field10247;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field10248;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public static int field10249;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field10252;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "[Lpga;")
    public static class536[] field10245;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
    public static void method4126(int arg0) {
        field10245 = null;
        if (arg0 != -4081) {
            method4126(-1);
        }
        field10250 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIFZ)[F")
    public final float[] method1122(int arg0, int arg1, int arg2, int arg3, float arg4, boolean arg5) {
        field10248++;
        if (arg0 != 16614) {
            this.method1125((byte) -29);
        }
        return this.method4127(arg1, (byte) 118).method3971(arg3, arg2, this.field10246, this.field10242[arg1].field4190, (byte) 77, this);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)Ltha;")
    public final class293 method1124(byte arg0, int arg1) {
        int var3 = -127 % ((-arg0 - 34) / 52);
        field10252++;
        return this.field10242[arg1];
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZIBFII)[I")
    public final int[] method1126(boolean arg0, int arg1, byte arg2, float arg3, int arg4, int arg5) {
        field10247++;
        if (arg2 <= 75) {
            this.method1124((byte) 18, -86);
        }
        return this.method4127(arg1, (byte) 118).method3975(false, arg5, this.field10246, arg4, this.field10242[arg1].field4190, this, (double) arg3);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BFZIII)[I")
    public final int[] method1123(byte arg0, float arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 66) {
            return null;
        } else {
            field10243++;
            return this.method4127(arg3, (byte) 118).method3970(arg4, this.field10246, arg2, this.field10242[arg3].field4190, -106, arg5, (double) arg1, this);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Z")
    public final boolean method1121(int arg0, int arg1) {
        if (arg0 != -30695) {
            this.method1121(81, 76);
        }
        field10249++;
        class700 var3 = this.method4127(arg1, (byte) 118);
        return var3 != null && var3.method3974(this.field10246, this, (byte) -97);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IB)Ldq;")
    private final class700 method4127(int arg0, byte arg1) {
        field10241++;
        class408 var3 = this.field10251.method2515((long) arg0, (byte) -116);
        if (var3 != null) {
            return (class700) var3;
        }
        byte[] var4 = this.field10240.method226(81, arg0);
        if (var4 == null) {
            return null;
        }
        if (arg1 != 118) {
            this.field10246 = null;
        }
        class700 var5 = new class700(new class645(var4));
        this.field10251.method2518((long) arg0, 22363, var5);
        return var5;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)I")
    public final int method1125(byte arg0) {
        if (arg0 >= -125) {
            this.field10242 = null;
        }
        field10244++;
        return this.field10253;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lvd;Lvd;Lvd;)V")
    public class732(class39 arg0, class39 arg1, class39 arg2) {
        this.field10246 = arg2;
        this.field10240 = arg1;
        class645 var4 = new class645(arg0.method211(true, 0, 0));
        this.field10253 = var4.method3712((byte) -106);
        this.field10242 = new class293[this.field10253];
        for (int var5 = 0; var5 < this.field10253; var5++) {
            if (var4.method3745(-6314) == 1) {
                this.field10242[var5] = new class293();
            }
        }
        for (int var6 = 0; var6 < this.field10253; var6++) {
            if (this.field10242[var6] != null) {
                this.field10242[var6].field4184 = var4.method3745(-6314) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field10253; var7++) {
            if (this.field10242[var7] != null) {
                this.field10242[var7].field4174 = var4.method3745(-6314) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field10253; var8++) {
            if (this.field10242[var8] != null) {
                this.field10242[var8].field4187 = var4.method3745(-6314) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field10253; var9++) {
            if (this.field10242[var9] != null) {
                this.field10242[var9].field4193 = var4.method3743(true);
            }
        }
        for (int var10 = 0; var10 < this.field10253; var10++) {
            if (this.field10242[var10] != null) {
                this.field10242[var10].field4179 = var4.method3743(true);
            }
        }
        for (int var11 = 0; var11 < this.field10253; var11++) {
            if (this.field10242[var11] != null) {
                this.field10242[var11].field4185 = var4.method3743(true);
            }
        }
        for (int var12 = 0; var12 < this.field10253; var12++) {
            if (this.field10242[var12] != null) {
                this.field10242[var12].field4176 = var4.method3743(true);
            }
        }
        for (int var13 = 0; var13 < this.field10253; var13++) {
            if (this.field10242[var13] != null) {
                this.field10242[var13].field4175 = (short) var4.method3712((byte) 8);
            }
        }
        for (int var14 = 0; var14 < this.field10253; var14++) {
            if (this.field10242[var14] != null) {
                this.field10242[var14].field4188 = var4.method3743(true);
            }
        }
        for (int var15 = 0; var15 < this.field10253; var15++) {
            if (this.field10242[var15] != null) {
                this.field10242[var15].field4171 = var4.method3743(true);
            }
        }
        for (int var16 = 0; var16 < this.field10253; var16++) {
            if (this.field10242[var16] != null) {
                this.field10242[var16].field4178 = var4.method3745(-6314) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field10253; var17++) {
            if (this.field10242[var17] != null) {
                this.field10242[var17].field4190 = var4.method3745(-6314) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field10253; var18++) {
            if (this.field10242[var18] != null) {
                this.field10242[var18].field4180 = var4.method3743(true);
            }
        }
        for (int var19 = 0; var19 < this.field10253; var19++) {
            if (this.field10242[var19] != null) {
                this.field10242[var19].field4186 = var4.method3745(-6314) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field10253; var20++) {
            if (this.field10242[var20] != null) {
                this.field10242[var20].field4189 = var4.method3745(-6314) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field10253; var21++) {
            if (this.field10242[var21] != null) {
                this.field10242[var21].field4181 = var4.method3745(-6314) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field10253; var22++) {
            if (this.field10242[var22] != null) {
                this.field10242[var22].field4182 = var4.method3745(-6314);
            }
        }
        for (int var23 = 0; var23 < this.field10253; var23++) {
            if (this.field10242[var23] != null) {
                this.field10242[var23].field4172 = var4.method3720(-19541);
            }
        }
        for (int var24 = 0; var24 < this.field10253; var24++) {
            if (this.field10242[var24] != null) {
                this.field10242[var24].field4192 = var4.method3745(-6314);
            }
        }
    }
}

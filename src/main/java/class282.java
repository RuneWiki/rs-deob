import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class282 implements class127 {

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Lwa;")
    private class505 field4406 = new class505(256);

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Lum;")
    private class83 field4409;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Lum;")
    private class83 field4407;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    private int field4405;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "[Loc;")
    private class420[] field4395;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "[[B")
    public static byte[][] field4400 = new byte[1000][];

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field4402 = -1;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Ld;")
    public static class242 field4404 = new class242(8);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIZF)[I", line = 3)
    public final int[] method939(int arg0, int arg1, int arg2, int arg3, boolean arg4, float arg5) {
        if (arg1 != -8507) {
            field4404 = null;
        }
        field4396++;
        return this.method1899(arg2, 106).method2545(arg3, this.field4395[arg2].field6172, arg0, this.field4409, arg4, arg1 ^ 0xFFFFDEC4, this, (double) arg5);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)Loc;", line = 14)
    public final class420 method938(int arg0, int arg1) {
        field4401++;
        if (arg0 != 28923) {
            field4402 = 120;
        }
        return this.field4395[arg1];
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)Lno;", line = 26)
    private final class404 method1899(int arg0, int arg1) {
        field4394++;
        class472 var3 = this.field4406.method3008((long) arg0, (byte) 119);
        if (var3 != null) {
            return (class404) var3;
        }
        byte[] var4 = this.field4407.method735(arg0, 0);
        if (var4 == null) {
            return null;
        } else {
            int var5 = -29 / ((28 - arg1) / 35);
            class404 var6 = new class404(new class194(var4));
            this.field4406.method3011((long) arg0, var6, 102);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 54)
    public static final boolean method1900(String arg0, boolean arg1) {
        field4403++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class324.field4920; var2++) {
            if (arg0.equalsIgnoreCase(class271.field4283[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class280.field4362[var2])) {
                return true;
            }
        }
        if (arg1) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)Z", line = 84)
    public final boolean method936(int arg0, byte arg1) {
        field4398++;
        if (arg1 != -119) {
            field4408 = 33;
        }
        class404 var3 = this.method1899(arg0, 101);
        return var3 != null && var3.method2538(0, this, this.field4409);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(FIZBII)[F", line = 100)
    public final float[] method940(float arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        field4399++;
        int var7 = -9 % ((arg3 + 52) / 51);
        return this.method1899(arg4, -97).method2540(this.field4395[arg4].field6172, this.field4409, -117, this, arg5, arg1);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 113)
    public static void method1901(int arg0) {
        if (arg0 == 0) {
            field4400 = null;
            field4404 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIZIF)[I", line = 126)
    public final int[] method937(int arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5) {
        field4397++;
        if (arg1 != -15746) {
            this.field4407 = null;
        }
        return this.method1899(arg0, 100).method2544((byte) 76, this.field4395[arg0].field6172, (double) arg5, arg2, arg4, this.field4409, this);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lum;Lum;Lum;)V", line = 154)
    public class282(class83 arg0, class83 arg1, class83 arg2) {
        this.field4409 = arg2;
        this.field4407 = arg1;
        class194 var4 = new class194(arg0.method731(0, 0, 0));
        this.field4405 = var4.method1396(124);
        this.field4395 = new class420[this.field4405];
        for (int var5 = 0; var5 < this.field4405; var5++) {
            if (var4.method1337((byte) -117) == 1) {
                this.field4395[var5] = new class420();
            }
        }
        for (int var6 = 0; var6 < this.field4405; var6++) {
            if (this.field4395[var6] != null) {
                this.field4395[var6].field6161 = var4.method1337((byte) -127) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field4405; var7++) {
            if (this.field4395[var7] != null) {
                this.field4395[var7].field6175 = var4.method1337((byte) 65) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field4405; var8++) {
            if (this.field4395[var8] != null) {
                this.field4395[var8].field6170 = var4.method1337((byte) -123) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field4405; var9++) {
            if (this.field4395[var9] != null) {
                this.field4395[var9].field6155 = var4.method1337((byte) 41) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field4405; var10++) {
            if (this.field4395[var10] != null) {
                this.field4395[var10].field6162 = var4.method1398(35);
            }
        }
        for (int var11 = 0; var11 < this.field4405; var11++) {
            if (this.field4395[var11] != null) {
                this.field4395[var11].field6165 = var4.method1398(92);
            }
        }
        for (int var12 = 0; var12 < this.field4405; var12++) {
            if (this.field4395[var12] != null) {
                this.field4395[var12].field6169 = var4.method1398(65);
            }
        }
        for (int var13 = 0; var13 < this.field4405; var13++) {
            if (this.field4395[var13] != null) {
                this.field4395[var13].field6178 = var4.method1398(19);
            }
        }
        for (int var14 = 0; var14 < this.field4405; var14++) {
            if (this.field4395[var14] != null) {
                this.field4395[var14].field6160 = (short) var4.method1396(-107);
            }
        }
        for (int var15 = 0; var15 < this.field4405; var15++) {
            if (this.field4395[var15] != null) {
                this.field4395[var15].field6166 = var4.method1398(38);
            }
        }
        for (int var16 = 0; var16 < this.field4405; var16++) {
            if (this.field4395[var16] != null) {
                this.field4395[var16].field6154 = var4.method1398(97);
            }
        }
        for (int var17 = 0; var17 < this.field4405; var17++) {
            if (this.field4395[var17] != null) {
                this.field4395[var17].field6159 = var4.method1337((byte) -119) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field4405; var18++) {
            if (this.field4395[var18] != null) {
                this.field4395[var18].field6172 = var4.method1337((byte) 88) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field4405; var19++) {
            if (this.field4395[var19] != null) {
                this.field4395[var19].field6156 = var4.method1398(63);
            }
        }
        for (int var20 = 0; var20 < this.field4405; var20++) {
            if (this.field4395[var20] != null) {
                this.field4395[var20].field6180 = var4.method1337((byte) -118) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field4405; var21++) {
            if (this.field4395[var21] != null) {
                this.field4395[var21].field6157 = var4.method1337((byte) -118) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field4405; var22++) {
            if (this.field4395[var22] != null) {
                this.field4395[var22].field6163 = var4.method1337((byte) 91) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field4405; var23++) {
            if (this.field4395[var23] != null) {
                this.field4395[var23].field6158 = var4.method1337((byte) 25);
            }
        }
        for (int var24 = 0; var24 < this.field4405; var24++) {
            if (this.field4395[var24] != null) {
                this.field4395[var24].field6179 = var4.method1401(123);
            }
        }
        for (int var25 = 0; var25 < this.field4405; var25++) {
            if (this.field4395[var25] != null) {
                this.field4395[var25].field6168 = var4.method1337((byte) 58) == 1;
            }
        }
    }
}

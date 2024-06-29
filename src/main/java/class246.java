import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class246 extends class179 {

    @OriginalMember(owner = "client!ul", name = "T", descriptor = "[S")
    private short[] field4183 = new short[257];

    @OriginalMember(owner = "client!ul", name = "kb", descriptor = "I")
    private int field4200 = 0;

    @OriginalMember(owner = "client!ul", name = "gb", descriptor = "I")
    public static int field4196 = 0;

    @OriginalMember(owner = "client!ul", name = "eb", descriptor = "Lke;")
    public static class256 field4194 = class316.method2202(":chalreq:", 27626);

    @OriginalMember(owner = "client!ul", name = "fb", descriptor = "Lke;")
    public static class256 field4195 = class316.method2202("<col=ffb000>", 27626);

    @OriginalMember(owner = "client!ul", name = "bb", descriptor = "Lij;")
    public static class175 field4191 = new class175();

    @OriginalMember(owner = "client!ul", name = "lb", descriptor = "Lke;")
    private static class256 field4201 = class316.method2202("Ok", 27626);

    @OriginalMember(owner = "client!ul", name = "mb", descriptor = "Lke;")
    public static class256 field4202 = field4201;

    @OriginalMember(owner = "client!ul", name = "nb", descriptor = "Lke;")
    public static class256 field4203 = class316.method2202("gelb:", 27626);

    @OriginalMember(owner = "client!ul", name = "R", descriptor = "B")
    public static byte field4181;

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!ul", name = "S", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!ul", name = "V", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!ul", name = "X", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!ul", name = "ab", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!ul", name = "cb", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!ul", name = "db", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!ul", name = "hb", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!ul", name = "ib", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!ul", name = "U", descriptor = "Lng;")
    public static class138 field4184;

    @OriginalMember(owner = "client!ul", name = "jb", descriptor = "Lhd;")
    public static class319 field4199;

    @OriginalMember(owner = "client!ul", name = "Y", descriptor = "[I")
    private int[] field4188;

    @OriginalMember(owner = "client!ul", name = "Z", descriptor = "[I")
    private int[] field4189;

    @OriginalMember(owner = "client!ul", name = "W", descriptor = "[[I")
    private int[][] field4186;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method41(int arg0, int arg1) {
        if (arg1 != -31598) {
            this.field4186 = (int[][]) ((int[][]) null);
        }
        field4197++;
        int[] var3 = this.field3157.method1258(-47, arg0);
        if (this.field3157.field3081) {
            int[] var4 = this.method1312(0, arg0, (byte) -75);
            for (int var5 = 0; var5 < class161.field2858; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field4183[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(II)[I", line = 49)
    private final int[] method1661(int arg0, int arg1) {
        field4187++;
        if (arg0 < 0) {
            return this.field4188;
        } else if (arg0 < this.field4186.length) {
            return arg1 == -2 ? this.field4186[arg0] : (int[]) null;
        } else {
            return this.field4189;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 76)
    public final void method418(byte arg0) {
        if (this.field4186 == null) {
            this.field4186 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (arg0 != -110) {
            return;
        }
        field4190++;
        if (this.field4186.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field4200 == 2) {
            this.method1666((byte) -103);
        }
        class118.method803((byte) -87);
        this.method1662(414512044);
    }

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "(I)V", line = 109)
    private final void method1662(int arg0) {
        int var2 = this.field4200;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < this.field4186.length - 1 && this.field4186[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field4186[var5];
                int[] var7 = this.field4186[var5 - 1];
                int var8 = this.method1661(var5 - 2, -2)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var11 = this.method1661(var5 + 1, -2)[1];
                int var12 = var10 + var11 - var8 - var9;
                int var13 = var8 - var10 - var12;
                int var14 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var15 = var14 * var14 >> 12;
                int var17 = var9 - var8;
                int var18 = (var12 * var14 >> 12) * var15 >> 12;
                int var19 = var14 * var17 >> 12;
                int var20 = var13 * var15 >> 12;
                int var21 = var18 + var10 + var20 + var19;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field4183[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; var24 < (this.field4186.length - 1) && var23 >= this.field4186[var24][0]; var24++) {
                }
                int[] var25 = this.field4186[var24 - 1];
                int[] var26 = this.field4186[var24];
                int var27 = (var23 - var25[0] << 12) / (var26[0] - var25[0]);
                int var28 = 4096 - class321.field5494[var27 >> 5 & 0xFF] >> 1;
                int var29 = 4096 - var28;
                int var30 = var25[1] * var29 + (var26[1] * var28) >> 12;
                if (var30 <= -32768) {
                    var30 = -32767;
                }
                if (var30 >= 32768) {
                    var30 = 32767;
                }
                this.field4183[var22] = (short) var30;
            }
        } else {
            for (int var31 = 0; var31 < 257; var31++) {
                int var32 = var31 << 4;
                int var33;
                for (var33 = 1; var33 < this.field4186.length - 1 && var32 >= this.field4186[var33][0]; var33++) {
                }
                int[] var34 = this.field4186[var33];
                int[] var35 = this.field4186[var33 - 1];
                int var36 = (var32 - var35[0] << 12) / (var34[0] - var35[0]);
                int var37 = 4096 - var36;
                int var38 = var34[1] * var36 + var35[1] * var37 >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field4183[var31] = (short) var38;
            }
        }
        field4193++;
        if (arg0 != 414512044) {
            method1664((byte) 77);
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V", line = 278)
    public class246() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILra;I)V", line = 289)
    public final void method54(int arg0, class41 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4200 = arg1.method357(false);
            this.field4186 = new int[arg1.method357(false)][2];
            for (int var4 = 0; var4 < this.field4186.length; var4++) {
                this.field4186[var4][0] = arg1.method346(-16);
                this.field4186[var4][1] = arg1.method346(-16);
            }
        }
        field4192++;
        if (arg0 < 108) {
            method1665((int[]) null, -77);
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)Z", line = 321)
    public static final boolean method1663(byte arg0) {
        field4185++;
        if (class92.field1674) {
            try {
                class37.field660.method1766(class272.field4658.field52, 0);
                return true;
            } catch (Throwable var2) {
            }
        }
        if (arg0 != 98) {
            method1663((byte) -93);
        }
        return false;
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)V", line = 343)
    public static void method1664(byte arg0) {
        field4191 = null;
        field4202 = null;
        field4194 = null;
        field4199 = null;
        field4203 = null;
        field4184 = null;
        field4195 = null;
        if (arg0 != -114) {
            field4184 = (class138) null;
        }
        field4201 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([II)[I", line = 371)
    public static final int[] method1665(int[] arg0, int arg1) {
        if (arg1 != 1) {
            return (int[]) null;
        }
        field4182++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class299.method2090(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(B)V", line = 408)
    private final void method1666(byte arg0) {
        field4180++;
        if (arg0 > -14) {
            method1664((byte) 54);
        }
        int[] var2 = this.field4186[0];
        int[] var3 = this.field4186[1];
        int[] var4 = this.field4186[this.field4186.length - 1];
        int[] var5 = this.field4186[this.field4186.length - 2];
        this.field4189 = new int[] { var5[0] - (var4[0] - var5[0]), var5[1] + -var4[1] + var5[1] };
        this.field4188 = new int[] { var2[0] + var2[0] - var3[0], var2[1] + -var3[1] + var2[1] };
    }
}

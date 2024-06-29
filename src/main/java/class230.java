import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class230 extends class304 {

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "[S")
    private short[] field3498 = new short[257];

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "I")
    private int field3510 = 0;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "Lec;")
    public static class99 field3500 = new class99(4);

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
    public static int field3506 = 1;

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "[I")
    private int[] field3499;

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "[I")
    private int[] field3513;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "[S")
    public static short[] field3501;

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "[[I")
    private int[][] field3503;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)[I", line = 5)
    private final int[] method1619(int arg0, int arg1) {
        if (arg1 > -109) {
            this.method1624(23);
        }
        field3502++;
        if (arg0 >= 0) {
            return arg0 >= this.field3503.length ? this.field3499 : this.field3503[arg0];
        } else {
            return this.field3513;
        }
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(B)V", line = 24)
    public static final void method1620(byte arg0) {
        field3505++;
        if (!class343.field5307) {
            return;
        }
        class111.field1679 = null;
        if (arg0 < -108) {
            class279.field4329 = null;
            class343.field5307 = false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V", line = 401)
    public class230() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V", line = 46)
    public static void method1621(int arg0) {
        if (arg0 != 11853) {
            method1621(70);
        }
        field3501 = null;
        field3500 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lwm;II)V", line = 58)
    public final void method69(class254 arg0, int arg1, int arg2) {
        field3509++;
        if (arg1 == 0) {
            this.field3510 = arg0.method1774((byte) -92);
            this.field3503 = new int[arg0.method1774((byte) -97)][2];
            for (int var4 = 0; var4 < this.field3503.length; var4++) {
                this.field3503[var4][0] = arg0.method1755(false);
                this.field3503[var4][1] = arg0.method1755(false);
            }
        }
        if (arg2 != -2828) {
            this.field3498 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(B)V", line = 98)
    public static final void method1622(byte arg0) {
        field3512++;
        int var1 = class61.field821;
        int var2 = class205.field3145;
        int var3 = class183.field2901;
        int var4 = class139.field2095;
        int var5 = 6116423;
        if (class73.field1058) {
            class175.method1322(var1, var2, var3, var4, var5);
            class175.method1322(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class175.method1320(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        } else {
            class287.method1987(var1, var2, var3, var4, var5);
            class287.method1987(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class287.method1981(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        }
        class167.field2703.method2274(class130.field2002, var1 + 3, var2 + 14, var5, -1);
        int var6 = class290.field4468;
        int var7 = class108.field1622;
        for (int var8 = 0; var8 < class32.field393; var8++) {
            int var9 = (class32.field393 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var1 < var6 && (var1 + var3) > var6 && var9 - 13 < var7 && var7 < var9 + 3) {
                var10 = 16776960;
            }
            class167.field2703.method2274(class90.method656(3, var8), var1 + 3, var9, var10, 0);
        }
        class299.method2060((byte) -123, class61.field821, class205.field3145, class183.field2901, class139.field2095);
        if (arg0 > -110) {
            field3506 = 59;
        }
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)V", line = 163)
    private final void method1623(int arg0) {
        int var2 = this.field3510;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < this.field3503.length - 1 && this.field3503[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field3503[var5];
                int[] var7 = this.field3503[var5 - 1];
                int var8 = this.method1619(var5 - 2, -128)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var11 = this.method1619(var5 + 1, -119)[1];
                int var12 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var13 = var9 - var8;
                int var14 = var10 + var11 - var8 - var9;
                int var16 = var8 - var14 - var10;
                int var17 = var12 * var13 >> 12;
                int var18 = var12 * var12 >> 12;
                int var19 = (var12 * var14 >> 12) * var18 >> 12;
                int var20 = var16 * var18 >> 12;
                int var21 = var10 + var17 + var20 + var19;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field3498[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var30 = 0; var30 < 257; var30++) {
                int var31 = var30 << 4;
                int var32;
                for (var32 = 1; var32 < (this.field3503.length - 1) && var31 >= this.field3503[var32][0]; var32++) {
                }
                int[] var33 = this.field3503[var32 - 1];
                int[] var34 = this.field3503[var32];
                int var35 = (var31 - var33[0] << 12) / (var34[0] - var33[0]);
                int var36 = 4096 - class264.field4074[var35 >> 5 & 0xFF] >> 1;
                int var37 = 4096 - var36;
                int var38 = var33[1] * var37 + var34[1] * var36 >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3498[var30] = (short) var38;
            }
        } else {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; var24 < this.field3503.length - 1 && var23 >= this.field3503[var24][0]; var24++) {
                }
                int[] var25 = this.field3503[var24 - 1];
                int[] var26 = this.field3503[var24];
                int var27 = (var23 - var25[0] << 12) / (var26[0] - var25[0]);
                int var28 = 4096 - var27;
                int var29 = var25[1] * var28 + var26[1] * var27 >> 12;
                if (var29 <= -32768) {
                    var29 = -32767;
                }
                if (var29 >= 32768) {
                    var29 = 32767;
                }
                this.field3498[var22] = (short) var29;
            }
        }
        field3508++;
        if (arg0 != 255) {
            this.method1623(112);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V", line = 334)
    public final void method100(boolean arg0) {
        field3507++;
        if (this.field3503 == null) {
            this.field3503 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (this.field3503.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field3510 == 2) {
            this.method1624(75);
        }
        class32.method251(-63);
        if (!arg0) {
            field3500 = (class99) null;
        }
        this.method1623(255);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)[I", line = 362)
    public final int[] method71(int arg0, int arg1) {
        if (arg0 != 7) {
            return (int[]) null;
        }
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            int[] var4 = this.method2086(arg1, 0, (byte) 112);
            for (int var5 = 0; var5 < class218.field3333; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3498[var6];
            }
        }
        field3511++;
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "(I)V", line = 405)
    private final void method1624(int arg0) {
        field3504++;
        int[] var2 = this.field3503[0];
        if (arg0 < 46) {
            field3501 = (short[]) null;
        }
        int[] var3 = this.field3503[1];
        int[] var4 = this.field3503[this.field3503.length - 2];
        int[] var5 = this.field3503[this.field3503.length - 1];
        this.field3513 = new int[] { var2[0] + var2[0] - var3[0], var2[1] + var2[1] - var3[1] };
        this.field3499 = new int[] { var4[0] + var4[0] - var5[0], var4[1] - (var5[1] + -var4[1]) };
    }
}

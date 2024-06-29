import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class138 extends class71 {

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    private int field2491 = 0;

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "[S")
    private short[] field2495 = new short[257];

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "[I")
    public static int[] field2482 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "Lud;")
    private static class279 field2487 = class130.method1024("Select", 255);

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "Lud;")
    public static class279 field2497 = class130.method1024("ondulation:", 255);

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "Z")
    public static boolean field2493 = false;

    @OriginalMember(owner = "client!ch", name = "eb", descriptor = "Lud;")
    public static class279 field2499 = class130.method1024("Schrifts-=tze geladen)3", 255);

    @OriginalMember(owner = "client!ch", name = "db", descriptor = "Lud;")
    public static class279 field2498 = field2487;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "F")
    public static float field2489;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "[I")
    private int[] field2478;

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "[I")
    private int[] field2496;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "[[I")
    private int[][] field2479;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B[I[Ljava/lang/Object;)V", line = 4)
    public static final void method1067(byte arg0, int[] arg1, Object[] arg2) {
        class235.method1695(arg1.length - 1, -105, 0, arg2, arg1);
        if (arg0 != -4) {
            field2498 = (class279) null;
        }
        field2484++;
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(I)V", line = 21)
    private final void method1068(int arg0) {
        if (arg0 != 0) {
            method1072(101, -38);
        }
        int var2 = this.field2491;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; (this.field2479.length - 1) > var5 && this.field2479[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field2479[var5 - 1];
                int[] var7 = this.field2479[var5];
                int var8 = this.method1073(var5 - 2, 1)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var11 = this.method1073(var5 + 1, 1)[1];
                int var12 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var13 = var12 * var12 >> 12;
                int var14 = var9 + (var11 - var10) - var8;
                int var15 = var8 - var9 - var14;
                int var16 = var10 - var8;
                int var18 = (var12 * var14 >> 12) * var13 >> 12;
                int var19 = var13 * var15 >> 12;
                int var20 = var12 * var16 >> 12;
                int var21 = var9 + var20 + var18 + var19;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field2495[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var30 = 0; var30 < 257; var30++) {
                int var31 = var30 << 4;
                int var32;
                for (var32 = 1; var32 < this.field2479.length - 1 && var31 >= this.field2479[var32][0]; var32++) {
                }
                int[] var33 = this.field2479[var32];
                int[] var34 = this.field2479[var32 - 1];
                int var35 = (var31 - var34[0] << 12) / (var33[0] - var34[0]);
                int var36 = 4096 - class87.field1668[var35 >> 5 & 0xFF] >> 1;
                int var37 = 4096 - var36;
                int var38 = var34[1] * var37 + (var33[1] * var36) >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field2495[var30] = (short) var38;
            }
        } else {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; var24 < (this.field2479.length - 1) && this.field2479[var24][0] <= var23; var24++) {
                }
                int[] var25 = this.field2479[var24];
                int[] var26 = this.field2479[var24 - 1];
                int var27 = (var23 - var26[0] << 12) / (var25[0] - var26[0]);
                int var28 = 4096 - var27;
                int var29 = var25[1] * var27 + var26[1] * var28 >> 12;
                if (var29 <= -32768) {
                    var29 = -32767;
                }
                if (var29 >= 32768) {
                    var29 = 32767;
                }
                this.field2495[var22] = (short) var29;
            }
        }
        field2492++;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 197)
    public class138() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(IB)[I", line = 206)
    public final int[] method199(int arg0, byte arg1) {
        field2480++;
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            int[] var4 = this.method624(arg0, -3, 0);
            for (int var5 = 0; var5 < class215.field3787; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field2495[var6];
            }
        }
        return arg1 >= -69 ? (int[]) null : var3;
    }

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V", line = 250)
    public static final void method1069(int arg0) {
        if (arg0 > -29) {
            return;
        }
        class312.field5516++;
        class314.field5534.method1634(249, 0);
        field2486++;
        for (class176 var1 = (class176) class226.field3977.method609(-26368); var1 != null; var1 = (class176) class226.field3977.method604(2)) {
            if (var1.field3163 == 0) {
                class5.method29(false, var1, true);
            }
        }
        if (class320.field5597 != null) {
            class50.method426(class320.field5597, false);
            class320.field5597 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZLvh;)V", line = 282)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (!arg1) {
            method1071((byte) 112);
        }
        field2490++;
        if (arg0 != 0) {
            return;
        }
        this.field2491 = arg2.method483(-103);
        this.field2479 = new int[arg2.method483(-123)][2];
        for (int var4 = 0; var4 < this.field2479.length; var4++) {
            this.field2479[var4][0] = arg2.method468(28214);
            this.field2479[var4][1] = arg2.method468(28214);
        }
    }

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "(I)V", line = 310)
    private final void method1070(int arg0) {
        if (arg0 != 27014) {
            this.method1070(85);
        }
        int[] var2 = this.field2479[0];
        field2488++;
        int[] var3 = this.field2479[1];
        int[] var4 = this.field2479[this.field2479.length - 2];
        int[] var5 = this.field2479[this.field2479.length - 1];
        this.field2496 = new int[] { var2[0] + var2[0] - var3[0], var2[1] + -var3[1] + var2[1] };
        this.field2478 = new int[] { var4[0] + var4[0] - var5[0], var4[1] - (var5[1] - var4[1]) };
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(B)V", line = 333)
    public static void method1071(byte arg0) {
        field2499 = null;
        field2497 = null;
        field2482 = null;
        field2498 = null;
        int var1 = -33 / ((-arg0 - 87) / 34);
        field2487 = null;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)V", line = 364)
    public static final void method1072(int arg0, int arg1) {
        field2483++;
        int var2 = 96 % ((arg0 - 56) / 41);
        class104 var3 = class293.method2085(10, arg1, false);
        var3.method875(12466);
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V", line = 380)
    public final void method627(int arg0) {
        if (this.field2479 == null) {
            this.field2479 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field2485++;
        if (this.field2479.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field2491 == 2) {
            this.method1070(27014);
        }
        class75.method644(122);
        this.method1068(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(II)[I", line = 410)
    private final int[] method1073(int arg0, int arg1) {
        field2481++;
        if (arg1 != 1) {
            this.field2491 = 119;
        }
        if (arg0 >= 0) {
            return arg0 >= this.field2479.length ? this.field2478 : this.field2479[arg0];
        } else {
            return this.field2496;
        }
    }
}

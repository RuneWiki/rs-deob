import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class203 extends class286 {

    @OriginalMember(owner = "client!i", name = "R", descriptor = "[S")
    private short[] field3464 = new short[257];

    @OriginalMember(owner = "client!i", name = "ib", descriptor = "I")
    private int field3481 = 0;

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "Lbe;")
    private static class283 field3474 = class153.method941(-108, "Discard");

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "Lbe;")
    public static class283 field3471 = class153.method941(126, ")1j");

    @OriginalMember(owner = "client!i", name = "cb", descriptor = "Lbe;")
    public static class283 field3475 = class153.method941(126, " GMT");

    @OriginalMember(owner = "client!i", name = "eb", descriptor = "I")
    public static int field3477 = 0;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "Lbe;")
    private static class283 field3460 = class153.method941(125, "Allocated memory");

    @OriginalMember(owner = "client!i", name = "U", descriptor = "Lkg;")
    public static class69 field3467 = null;

    @OriginalMember(owner = "client!i", name = "jb", descriptor = "Lbe;")
    public static class283 field3482 = class153.method941(125, "Texturen geladen)3");

    @OriginalMember(owner = "client!i", name = "db", descriptor = "Lbe;")
    public static class283 field3476 = field3460;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "Lbe;")
    public static class283 field3472 = field3474;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!i", name = "gb", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!i", name = "kb", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "[I")
    private int[] field3462;

    @OriginalMember(owner = "client!i", name = "hb", descriptor = "[I")
    private int[] field3480;

    @OriginalMember(owner = "client!i", name = "fb", descriptor = "[[I")
    private int[][] field3478;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V", line = 6)
    public static final void method1295(int arg0, int arg1) {
        class277.field4636.method1637(true, arg1);
        if (arg0 != 1) {
            method1298((byte) 36);
        }
        class107.field1824.method1637(true, arg1);
        field3483++;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(II)[I", line = 20)
    private final int[] method1296(int arg0, int arg1) {
        if (arg0 != 1) {
            field3465 = -71;
        }
        field3468++;
        if (arg1 >= 0) {
            return this.field3478.length > arg1 ? this.field3478[arg1] : this.field3480;
        } else {
            return this.field3462;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lfe;ZI)V", line = 41)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        field3470++;
        if (arg1) {
            this.method1299(-76);
        }
        if (arg2 != 0) {
            return;
        }
        this.field3481 = arg0.method1535((byte) 78);
        this.field3478 = new int[arg0.method1535((byte) 124)][2];
        for (int var4 = 0; var4 < this.field3478.length; var4++) {
            this.field3478[var4][0] = arg0.method1496(true);
            this.field3478[var4][1] = arg0.method1496(true);
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V", line = 69)
    public final void method276(int arg0) {
        if (this.field3478 == null) {
            this.field3478 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field3473++;
        if (arg0 != 3) {
            return;
        }
        if (this.field3478.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field3481 == 2) {
            this.method1301((byte) -109);
        }
        class86.method555(4096);
        this.method1299(-66);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V", line = 404)
    public class203() {
        super(1, true);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IBI)V", line = 99)
    public static final void method1297(int arg0, byte arg1, int arg2) {
        int var3 = arg0;
        field3461++;
        if (arg0 > 25) {
            var3 = 25;
        }
        arg0--;
        int var4 = class126.field2082[arg0];
        if (arg1 >= -9) {
            field3477 = -22;
        }
        int var5 = class298.field5046[arg0];
        if (arg2 == 0) {
            class228.field3831.method621(42, 8);
            class44.field599++;
            class228.field3831.method1499(true, var3 + var3 + 3);
        }
        if (arg2 == 1) {
            class228.field3831.method621(131, 8);
            class186.field3192++;
            class228.field3831.method1499(true, var3 + var3 + 3 + 14);
        }
        if (arg2 == 2) {
            class223.field3756++;
            class228.field3831.method621(160, 8);
            class228.field3831.method1499(true, var3 + var3 + 3);
        }
        class175.field3021 = class298.field5046[0];
        class88.field1496 = class126.field2082[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg0--;
            class228.field3831.method1499(true, class126.field2082[arg0] - var4);
            class228.field3831.method1518(class298.field5046[arg0] - var5, -9726);
        }
        class228.field3831.method1533(true, class107.field1833 + var5);
        class228.field3831.method1540(class214.field3637 + var4, (byte) -40);
        class228.field3831.method1552(-26058, class246.field4178[82] ? 1 : 0);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V", line = 159)
    public static final void method1298(byte arg0) {
        class180.field3091.method1636(125);
        if (arg0 != 34) {
            field3476 = (class283) null;
        }
        class294.field4970.method1636(115);
        field3479++;
    }

    @OriginalMember(owner = "client!i", name = "h", descriptor = "(I)V", line = 189)
    private final void method1299(int arg0) {
        int var2 = this.field3481;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < this.field3478.length - 1 && var4 >= this.field3478[var5][0]; var5++) {
                }
                int[] var6 = this.field3478[var5];
                int[] var7 = this.field3478[var5 - 1];
                int var8 = this.method1296(1, var5 - 2)[1];
                int var9 = var7[1];
                int var10 = var6[1];
                int var11 = this.method1296(1, var5 + 1)[1];
                int var12 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var13 = var12 * var12 >> 12;
                int var14 = var11 + var9 - var8 - var10;
                int var15 = var8 - var9 - var14;
                int var17 = (var12 * var14 >> 12) * var13 >> 12;
                int var18 = var10 - var8;
                int var19 = var13 * var15 >> 12;
                int var20 = var12 * var18 >> 12;
                int var21 = var19 + var20 + var9 + var17;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field3464[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; var24 < this.field3478.length - 1 && var23 >= this.field3478[var24][0]; var24++) {
                }
                int[] var25 = this.field3478[var24 - 1];
                int[] var26 = this.field3478[var24];
                int var27 = (var23 - var25[0] << 12) / (var26[0] - var25[0]);
                int var28 = 4096 - class33.field490[(var27 & 0x1FFA) >> 5] >> 1;
                int var29 = 4096 - var28;
                int var30 = var25[1] * var29 + (var26[1] * var28) >> 12;
                if (var30 <= -32768) {
                    var30 = -32767;
                }
                if (var30 >= 32768) {
                    var30 = 32767;
                }
                this.field3464[var22] = (short) var30;
            }
        } else {
            for (int var31 = 0; var31 < 257; var31++) {
                int var32 = var31 << 4;
                int var33;
                for (var33 = 1; this.field3478.length - 1 > var33 && var32 >= this.field3478[var33][0]; var33++) {
                }
                int[] var34 = this.field3478[var33];
                int[] var35 = this.field3478[var33 - 1];
                int var36 = (var32 - var35[0] << 12) / (var34[0] - var35[0]);
                int var37 = 4096 - var36;
                int var38 = var34[1] * var36 + var35[1] * var37 >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3464[var31] = (short) var38;
            }
        }
        int var39 = -84 / ((8 - arg0) / 43);
        field3469++;
    }

    @OriginalMember(owner = "client!i", name = "i", descriptor = "(I)V", line = 364)
    public static void method1300(int arg0) {
        field3482 = null;
        field3475 = null;
        field3474 = null;
        field3471 = null;
        field3472 = null;
        field3467 = null;
        if (arg0 != 7140) {
            field3472 = (class283) null;
        }
        field3460 = null;
        field3476 = null;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(B)V", line = 382)
    private final void method1301(byte arg0) {
        if (arg0 > -23) {
            method1297(-98, (byte) -8, -45);
        }
        int[] var2 = this.field3478[0];
        int[] var3 = this.field3478[1];
        int[] var4 = this.field3478[this.field3478.length - 1];
        int[] var5 = this.field3478[this.field3478.length - 2];
        this.field3480 = new int[] { var5[0] + var5[0] - var4[0], var5[1] + -var4[1] + var5[1] };
        this.field3462 = new int[] { var2[0] - (var3[0] - var2[0]), var2[1] - var3[1] - -var2[1] };
        field3463++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)[I", line = 418)
    public final int[] method14(int arg0, int arg1) {
        if (arg0 > -52) {
            method1297(-96, (byte) 118, -5);
        }
        field3466++;
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            int[] var4 = this.method1963(arg1, 0, -1);
            for (int var5 = 0; var5 < class27.field410; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3464[var6];
            }
        }
        return var3;
    }
}

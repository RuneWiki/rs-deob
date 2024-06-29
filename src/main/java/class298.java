import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class298 {

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public int field3560;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "[B")
    private byte[] field3552;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "F")
    public static float field3557;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public int field3541;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public int field3544;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public int field3559;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "Ltfa;")
    public class36 field3555;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "[I")
    public int[] field3543;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "[I")
    public int[] field3547;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "[I")
    public int[] field3550;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "[I")
    public int[] field3553;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "[I")
    public int[] field3558;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "[I")
    public int[] field3564;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "[Ltfa;")
    public class36[] field3548;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "[[B")
    public byte[][] field3549;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "[[I")
    public int[][] field3545;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "[[I")
    public int[][] field3565;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[BI)I")
    public static final int method1739(int arg0, byte[] arg1, int arg2) {
        if (arg0 != 0) {
            field3557 = 1.5869564F;
        }
        field3556++;
        return class60.method518(arg2, 0, (byte) -104, arg1);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[B)V")
    private final void method1740(int arg0, byte[] arg1) {
        field3551++;
        class403 var3 = new class403(class50.method471((byte) 21, arg1));
        int var4 = var3.method2396((byte) 50);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field3559 = 0;
        } else {
            this.field3559 = var3.method2381((byte) 95);
        }
        int var5 = var3.method2396((byte) 13);
        boolean var6 = (var5 & 0x1) != 0;
        this.field3541 = var3.method2390((byte) -121);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        int var9 = -1;
        this.field3558 = new int[this.field3541];
        for (int var10 = 0; var10 < this.field3541; var10++) {
            this.field3558[var10] = var8 += var3.method2390((byte) 88);
            if (this.field3558[var10] > var9) {
                var9 = this.field3558[var10];
            }
        }
        this.field3544 = var9 + 1;
        this.field3545 = new int[this.field3544][];
        this.field3564 = new int[this.field3544];
        this.field3553 = new int[this.field3544];
        if (var7) {
            this.field3549 = new byte[this.field3544][];
        }
        this.field3543 = new int[this.field3544];
        this.field3547 = new int[this.field3544];
        if (var6) {
            this.field3550 = new int[this.field3544];
            for (int var11 = 0; var11 < this.field3544; var11++) {
                this.field3550[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field3541; var12++) {
                this.field3550[this.field3558[var12]] = var3.method2381((byte) 69);
            }
            this.field3555 = new class36(this.field3550);
        }
        for (int var13 = 0; var13 < this.field3541; var13++) {
            this.field3564[this.field3558[var13]] = var3.method2381((byte) 71);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field3541; var14++) {
                byte[] var15 = new byte[64];
                var3.method2401(65280, var15, 0, 64);
                this.field3549[this.field3558[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field3541; var16++) {
            this.field3553[this.field3558[var16]] = var3.method2381((byte) 43);
        }
        if (arg0 >= -54) {
            method1741(null, 57);
        }
        for (int var17 = 0; var17 < this.field3541; var17++) {
            this.field3543[this.field3558[var17]] = var3.method2390((byte) -128);
        }
        for (int var18 = 0; var18 < this.field3541; var18++) {
            int var25 = this.field3558[var18];
            int var26 = this.field3543[var25];
            int var27 = 0;
            this.field3545[var25] = new int[var26];
            int var28 = -1;
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field3545[var25][var29] = var27 += var3.method2390((byte) 14);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field3547[var25] = var28 + 1;
            if ((var28 + 1) == var26) {
                this.field3545[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field3565 = new int[var9 + 1][];
        this.field3548 = new class36[var9 + 1];
        for (int var19 = 0; var19 < this.field3541; var19++) {
            int var20 = this.field3558[var19];
            int var21 = this.field3543[var20];
            this.field3565[var20] = new int[this.field3547[var20]];
            for (int var22 = 0; var22 < this.field3547[var20]; var22++) {
                this.field3565[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field3545[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field3545[var20][var23];
                }
                this.field3565[var20][var24] = var3.method2381((byte) 82);
            }
            this.field3548[var20] = new class36(this.field3565[var20]);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1741(String arg0, int arg1) {
        field3554++;
        if (arg0.equals("")) {
            return;
        }
        class369.field4590++;
        class336 var2 = class512.method3076(class320.field3959, class591.field8030, (byte) 105);
        var2.field4150.method2353(-81, class615.method3482(arg0, arg1));
        var2.field4150.method2388(arg1 + 254, arg0);
        class578.method3334(4, var2);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)I")
    public static final int method1742(int arg0, int arg1, byte arg2) {
        if (arg2 != -42) {
            field3561 = 62;
        }
        field3542++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg1 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZIIIII)V")
    public static final void method1743(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3546++;
        class615[] var7 = class56.field756;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class615 var9 = var7[var8];
            if (var9 != null && var9.field8259 == 2) {
                class352.method2078(arg5, var9.field8261, arg4, var9.field8260 * 2, var9.field8268, var9.field8266, arg6 >> 1, -128, arg0 >> 1);
                if (class123.field1576[0] > -1 && (class228.field2707 % 20) < 10) {
                    class312 var10 = class535.field7535[var9.field8264];
                    int var11 = arg2 + class123.field1576[0] - 12;
                    int var12 = class123.field1576[1] + arg3 - 28;
                    var10.method1838(var11, var12);
                    class326.method1945(var12, var11 + var10.method1634(), var11, var12 + var10.method1636(), arg1);
                }
            }
        }
        if (arg1) {
            method1741(null, 61);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BIII)Z")
    public static final boolean method1744(byte arg0, int arg1, int arg2, int arg3) {
        field3562++;
        class720.field10112.method132(arg1, arg2, arg3, class650.field8982);
        int var4 = class650.field8982[2];
        if (var4 < 50) {
            return false;
        }
        class650.field8982[0] = class650.field8982[0] * class454.field6397 / var4 + class304.field3623;
        class650.field8982[1] = class495.field6888 + (class650.field8982[1] * class71.field984 / var4);
        class650.field8982[2] = var4;
        int var5 = -19 % ((2 - arg0) / 39);
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([BI[B)V")
    public class298(byte[] arg0, int arg1, byte[] arg2) {
        this.field3560 = method1739(0, arg0, arg0.length);
        if (this.field3560 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field3552 = class259.method1551(arg0, (byte) -118, 0, arg0.length);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field3552[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method1740(-63, arg0);
    }
}

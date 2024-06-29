import java.awt.Component;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class240 extends class167 {

    @OriginalMember(owner = "client!wa", name = "cb", descriptor = "I")
    private int field4341 = 8;

    @OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
    private int field4344 = 1024;

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
    private int field4333 = 1024;

    @OriginalMember(owner = "client!wa", name = "eb", descriptor = "I")
    private int field4343 = 409;

    @OriginalMember(owner = "client!wa", name = "lb", descriptor = "I")
    private int field4350 = 204;

    @OriginalMember(owner = "client!wa", name = "sb", descriptor = "I")
    private int field4357 = 4;

    @OriginalMember(owner = "client!wa", name = "hb", descriptor = "I")
    private int field4346 = 81;

    @OriginalMember(owner = "client!wa", name = "wb", descriptor = "I")
    private int field4361 = 0;

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "[I")
    public static int[] field4336 = new int[4096];

    @OriginalMember(owner = "client!wa", name = "kb", descriptor = "Lkh;")
    public static class117 field4349 = class224.method1450((byte) 107, ":tradereq:");

    @OriginalMember(owner = "client!wa", name = "gb", descriptor = "Lkh;")
    public static class117 field4345 = class224.method1450((byte) -72, ":duelstake:");

    @OriginalMember(owner = "client!wa", name = "qb", descriptor = "I")
    public static int field4355 = 0;

    @OriginalMember(owner = "client!wa", name = "ub", descriptor = "Lkh;")
    private static class117 field4359 = class224.method1450((byte) -19, "level)2");

    @OriginalMember(owner = "client!wa", name = "ib", descriptor = "I")
    public static int field4347 = 0;

    @OriginalMember(owner = "client!wa", name = "jb", descriptor = "Lkh;")
    public static class117 field4348 = field4359;

    @OriginalMember(owner = "client!wa", name = "vb", descriptor = "I")
    public static int field4360 = -1;

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!wa", name = "db", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!wa", name = "mb", descriptor = "I")
    private int field4351;

    @OriginalMember(owner = "client!wa", name = "ob", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!wa", name = "pb", descriptor = "I")
    private int field4354;

    @OriginalMember(owner = "client!wa", name = "tb", descriptor = "I")
    private int field4358;

    @OriginalMember(owner = "client!wa", name = "nb", descriptor = "Lai;")
    public static class10 field4352;

    @OriginalMember(owner = "client!wa", name = "ab", descriptor = "Lah;")
    public static class9 field4339;

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "[I")
    private int[] field4335;

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "[[I")
    private int[][] field4337;

    @OriginalMember(owner = "client!wa", name = "rb", descriptor = "[[I")
    private int[][] field4356;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    public final void method262(int arg0) {
        ++field4332;
        this.method1521(120);
        int var2 = -89 / ((-18 - arg0) / 59);
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V")
    private final void method1521(int arg0) {
        if (arg0 <= 116) {
            this.field4344 = 40;
        }
        Random var2 = new Random((long) this.field4341);
        this.field4351 = 4096 / this.field4357;
        this.field4356 = new int[this.field4341][this.field4357];
        this.field4358 = 4096 / this.field4341;
        ++field4342;
        int var3 = this.field4351 / 2;
        this.field4354 = this.field4346 / 2;
        this.field4337 = new int[this.field4341][this.field4357 + 1];
        int var4 = this.field4358 / 2;
        this.field4335 = new int[this.field4341 - -1];
        this.field4335[0] = 0;
        for (int var5 = 0; var5 < this.field4341; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field4358;
                int var7 = (class223.method1447(4096, var2, (byte) -79) + -2048) * this.field4350 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4335[var5] = this.field4335[var5 + -1] + var8;
            }
            this.field4337[var5][0] = 0;
            for (int var9 = 0; var9 < this.field4357; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field4351;
                    int var11 = (-2048 + class223.method1447(4096, var2, (byte) -79)) * this.field4343 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4337[var5][var9] = this.field4337[var5][var9 + -1] + var12;
                }
                this.field4356[var5][var9] = ~this.field4333 < -1 ? 4096 - class223.method1447(this.field4333, var2, (byte) -79) : 4096;
            }
            this.field4337[var5][this.field4357] = 4096;
        }
        this.field4335[this.field4341] = 4096;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(III)V")
    public static final void method1522(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class60.field1208; ++var3) {
            for (int var4 = 0; var4 < class92.field1698; ++var4) {
                for (int var5 = 0; var5 < class170.field3053; ++var5) {
                    class170 var6 = class109.field2063[var3][var4][var5];
                    if (var6 != null) {
                        class90 var7 = var6.field3062;
                        if (var7 != null && var7.field1661.method146()) {
                            class73.method514(var7.field1661, var3, var4, var5, 1, 1);
                            if (var7.field1678 != null && var7.field1678.method146()) {
                                class73.method514(var7.field1678, var3, var4, var5, 1, 1);
                                var7.field1661.method152(var7.field1678, 0, 0, 0, false);
                                var7.field1678 = var7.field1678.method136(arg0, arg1, arg2);
                            }
                            var7.field1661 = var7.field1661.method136(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3065; ++var8) {
                            class57 var10 = var6.field3063[var8];
                            if (var10 != null && var10.field1182.method146()) {
                                class73.method514(var10.field1182, var3, var4, var5, var10.field1178 - var10.field1186 + 1, var10.field1179 - var10.field1170 + 1);
                                var10.field1182 = var10.field1182.method136(arg0, arg1, arg2);
                            }
                        }
                        class28 var9 = var6.field3074;
                        if (var9 != null && var9.field683.method146()) {
                            class74.method519(var9.field683, var3, var4, var5);
                            var9.field683 = var9.field683.method136(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (~arg2 == -8) {
                                        this.field4333 = arg0.method1049((byte) 110);
                                    }
                                } else {
                                    this.field4346 = arg0.method1049((byte) 110);
                                }
                            } else {
                                this.field4361 = arg0.method1049((byte) 99);
                            }
                        } else {
                            this.field4344 = arg0.method1049((byte) 104);
                        }
                    } else {
                        this.field4350 = arg0.method1049((byte) 113);
                    }
                } else {
                    this.field4343 = arg0.method1049((byte) 117);
                }
            } else {
                this.field4341 = arg0.method998(86);
            }
        } else {
            this.field4357 = arg0.method998(75);
        }
        if (arg1) {
            this.method1521(-39);
        }
        ++field4340;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIILdd;IJ)Z")
    public static final boolean method1523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class172.method1203(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class240() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -96) {
            this.field4356 = null;
        }
        ++field4334;
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (super.field3013.field4085) {
            int var4 = 0;
            int var5;
            for (var5 = class143.field2583[arg1] + this.field4361; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~this.field4341 < ~var4 && var5 >= this.field4335[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(var4 & 1) == -1;
            int var8 = this.field4335[var4];
            int var9 = this.field4335[var4 + -1];
            if (~var5 < ~(var9 - -this.field4354) && ~(-this.field4354 + var8) < ~var5) {
                for (int var10 = 0; var10 < class115.field2146; ++var10) {
                    int var11 = var7 ? this.field4344 : -this.field4344;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field4351 * var11 >> 12) + class70.field1350[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (this.field4357 > var12 && var13 >= this.field4337[var6][var12]) {
                        ++var12;
                    }
                    int var14 = this.field4337[var6][var12];
                    int var15 = var12 + -1;
                    int var16 = this.field4337[var6][var15];
                    if (var16 - -this.field4354 < var13 && ~(-this.field4354 + var14) < ~var13) {
                        var3[var10] = this.field4356[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class2.method8(var3, 0, class115.field2146, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1524(Component arg0, byte arg1) {
        ++field4338;
        Method var2 = class134.field2411;
        if (arg1 != 26) {
            field4336 = null;
        }
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class94.field1719);
        arg0.addFocusListener(class94.field1719);
    }

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)V")
    public static void method1525(int arg0) {
        field4349 = null;
        field4336 = null;
        field4348 = null;
        field4339 = null;
        field4345 = null;
        field4352 = null;
        field4359 = null;
        int var1 = -90 / ((arg0 - 74) / 52);
    }
}

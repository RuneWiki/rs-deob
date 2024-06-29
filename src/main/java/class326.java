import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class326 {

    @OriginalMember(owner = "client!du", name = "b", descriptor = "[J")
    private long[] field4345 = new long[8];

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    private int field4347 = 0;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "[J")
    private long[] field4344 = new long[8];

    @OriginalMember(owner = "client!du", name = "e", descriptor = "[J")
    private long[] field4348 = new long[8];

    @OriginalMember(owner = "client!du", name = "f", descriptor = "[B")
    private byte[] field4349 = new byte[64];

    @OriginalMember(owner = "client!du", name = "l", descriptor = "[B")
    private byte[] field4355 = new byte[32];

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    private int field4359 = 0;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "[J")
    private long[] field4358 = new long[8];

    @OriginalMember(owner = "client!du", name = "r", descriptor = "[J")
    private long[] field4361 = new long[8];

    @OriginalMember(owner = "client!du", name = "i", descriptor = "[I")
    public static int[] field4352 = new int[3];

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(II)Z")
    public static final boolean method1894(int arg0, int arg1) {
        if (arg1 != 32) {
            field4352 = null;
        }
        field4346++;
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IBIIZ)V")
    public static final void method1895(int arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        field4356++;
        if (class62.method607((byte) -106, arg3)) {
            if (arg1 < 100) {
                field4352 = null;
            }
            class503.method2917(arg2, -1, arg4, 0, arg0, class516.field7555[arg3]);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V")
    public final void method1896(byte arg0) {
        for (int var2 = 0; var2 < 32; var2++) {
            this.field4355[var2] = 0;
        }
        field4357++;
        this.field4349[0] = 0;
        this.field4359 = this.field4347 = 0;
        if (arg0 != 126) {
            this.method1901(125, null, 14L);
        }
        for (int var3 = 0; var3 < 8; var3++) {
            this.field4344[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method1897(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        if ((arg3 ? class221.field2851.field4176 : class221.field2851.field4155) != 0 && arg6 != 0 && class244.field3334 < 50 && arg4 != -1) {
            class465.field6487[class244.field3334++] = new class68((byte) (arg3 ? 3 : 2), arg4, arg6, arg0, arg7, arg2, arg1, null);
        }
        if (arg5 < 25) {
            method1895(23, (byte) 114, -71, -16, false);
        }
        field4353++;
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(B)V")
    public static void method1898(byte arg0) {
        field4352 = null;
        if (arg0 <= 45) {
            method1894(-9, 24);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
    private final void method1899(int arg0) {
        field4350++;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field4358[var2] = class421.method2547(class567.method3323((long) this.field4349[var3 + 7], 255L), class421.method2547(class567.method3323(255L, (long) this.field4349[var3 + 6]) << 8, class421.method2547(class421.method2547(class567.method3323(0xFFL << 24, (long) this.field4349[var3 + 4] << 24), class421.method2547(class567.method3323(0xFFL << 32, (long) this.field4349[var3 + 3] << 32), class421.method2547(class567.method3323((long) this.field4349[var3 + 2], 255L) << 40, class421.method2547(class567.method3323((long) this.field4349[var3 + 1], 255L) << 48, (long) this.field4349[var3] << 56)))), class567.method3323(0xFFL << 16, (long) this.field4349[var3 + 5] << 16))));
            var2++;
            var3 += 8;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field4361[var4] = class421.method2547(this.field4358[var4], this.field4345[var4] = this.field4344[var4]);
        }
        if (arg0 >= -106) {
            return;
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field4348[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field4348[var7] = class421.method2547(this.field4348[var7], class324.field4334[var13][class435.method2605(255, (int) (this.field4345[class435.method2605(var7 - var13, 7)] >>> var14))]);
                    var14 -= 8;
                    var13++;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field4345[var8] = this.field4348[var8];
            }
            this.field4345[0] = class421.method2547(this.field4345[0], class324.field4331[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field4348[var9] = this.field4345[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field4348[var9] = class421.method2547(this.field4348[var9], class324.field4334[var11][class435.method2605(255, (int) (this.field4361[class435.method2605(var9 - var11, 7)] >>> var12))]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field4361[var10] = this.field4348[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field4344[var6] = class421.method2547(this.field4344[var6], class421.method2547(this.field4361[var6], this.field4358[var6]));
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z[BI)V")
    public final void method1900(boolean arg0, byte[] arg1, int arg2) {
        field4360++;
        this.field4349[this.field4347] = (byte) class242.method1474(this.field4349[this.field4347], 0x80 >>> class435.method2605(this.field4359, 7));
        this.field4347++;
        if (this.field4347 > 32) {
            while (true) {
                if (this.field4347 >= 64) {
                    this.method1899(-122);
                    this.field4347 = 0;
                    break;
                }
                this.field4349[this.field4347++] = 0;
            }
        }
        while (this.field4347 < 32) {
            this.field4349[this.field4347++] = 0;
        }
        class252.method1545(this.field4355, 0, this.field4349, 32, 32);
        this.method1899(-118);
        int var4 = 0;
        if (arg0) {
            method1902(70, null);
        }
        int var5 = arg2;
        while (var4 < 8) {
            long var6 = this.field4344[var4];
            arg1[var5] = (byte) ((int) (var6 >>> 56));
            arg1[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg1[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg1[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg1[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg1[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg1[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg1[var5 + 7] = (byte) ((int) var6);
            var5 += 8;
            var4++;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I[BJ)V")
    public final void method1901(int arg0, byte[] arg1, long arg2) {
        field4354++;
        int var5 = 0;
        if (arg0 != -1) {
            this.method1900(true, null, 73);
        }
        int var6 = 8 - ((int) arg2 & 0x7) & 0x7;
        int var7 = this.field4359 & 0x7;
        long var8 = arg2;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field4355[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field4355[var10] = (byte) var16;
            var11 = var16 >>> 8;
            var8 >>>= 0x8;
            var10--;
        }
        while (arg2 > 8L) {
            int var15 = arg1[var5] << var6 & 0xFF | (arg1[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field4349[this.field4347] = (byte) class242.method1474(this.field4349[this.field4347], var15 >>> var7);
            this.field4359 += 8 - var7;
            this.field4347++;
            if (this.field4359 == 512) {
                this.method1899(-111);
                this.field4359 = this.field4347 = 0;
            }
            this.field4349[this.field4347] = (byte) class435.method2605(var15 << 8 - var7, 255);
            arg2 -= 8L;
            this.field4359 += var7;
            var5++;
        }
        int var12;
        if (arg2 > 0L) {
            var12 = arg1[var5] << var6 & 0xFF;
            this.field4349[this.field4347] = (byte) class242.method1474(this.field4349[this.field4347], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if ((long) var7 + arg2 < 8L) {
            this.field4359 = (int) ((long) this.field4359 + arg2);
            return;
        }
        this.field4347++;
        this.field4359 += 8 - var7;
        long var13 = arg2 - (long) (8 - var7);
        if (this.field4359 == 512) {
            this.method1899(-120);
            this.field4359 = this.field4347 = 0;
        }
        this.field4349[this.field4347] = (byte) class435.method2605(var12 << 8 - var7, 255);
        this.field4359 += (int) var13;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ILr;)V")
    public static final void method1902(int arg0, class165 arg1) {
        field4351++;
        int var2 = class22.field548;
        int var3 = class1.field2;
        int var4 = class675.field9685;
        int var5 = class84.field1195 - 3;
        byte var6 = 20;
        if (class215.field2735 == null || class504.field7035 == null) {
            if (class692.field9847.method3802(class588.field8520, (byte) 104) && class692.field9847.method3802(class417.field5904, (byte) -57)) {
                class215.field2735 = arg1.method216(class495.method2874(class692.field9847, class588.field8520, 0), true);
                class495 var7 = class495.method2874(class692.field9847, class417.field5904, 0);
                class504.field7035 = arg1.method216(var7, true);
                var7.method2881();
                class205.field2454 = arg1.method216(var7, true);
            } else {
                arg1.method248(var2, var3, var4, var6, class668.field9606 | 255 - class401.field5663 << 24, 1);
            }
        }
        if (class215.field2735 != null && class504.field7035 != null) {
            int var8 = (var4 - (class504.field7035.method902() * 2)) / class215.field2735.method902();
            for (int var9 = 0; var9 < var8; var9++) {
                class215.field2735.method3924(class504.field7035.method902() + var2 + (var9 * class215.field2735.method902()), var3);
            }
            class504.field7035.method3924(var2, var3);
            class205.field2454.method3924(var2 + var4 - class205.field2454.method902(), var3);
        }
        class36.field691.method2515(-1, 0, class227.field2936 | 0xFF000000, class424.field6062.method2561(class370.field4980, 0), var3 + 14, var2 + 3);
        arg1.method248(var2, var3 + var6, var4, var5 - var6, class668.field9606 | -class401.field5663 + 255 << 24, 1);
        int var10 = class478.field6713.method1349(-120);
        int var11 = class478.field6713.method1338(1);
        int var12 = 0;
        for (class377 var13 = (class377) class34.field679.method1132((byte) -102); var13 != null; var13 = (class377) class34.field679.method1134(8446)) {
            int var31 = (class271.field3704 - var12 - 1) * 16 + var6 + var3 + 13;
            var12++;
            if (var10 > var2 && (var2 + var4) > var10 && var31 - 13 < var11 && var11 < var31 + 4 && var13.field5057) {
                arg1.method248(var2, var31 - 12, var4, 16, class562.field8126 | 255 - class514.field7543 << 24, 1);
            }
        }
        if (arg0 <= 54) {
            return;
        }
        if ((class496.field6934 == null || class406.field5747 == null || class186.field2282 == null) && class692.field9847.method3802(class116.field1505, (byte) -122) && class692.field9847.method3802(class285.field3866, (byte) 120) && class692.field9847.method3802(class435.field6236, (byte) -117)) {
            class495 var14 = class495.method2874(class692.field9847, class285.field3866, 0);
            class406.field5747 = arg1.method216(var14, true);
            var14.method2881();
            class568.field8314 = arg1.method216(var14, true);
            class496.field6934 = arg1.method216(class495.method2874(class692.field9847, class116.field1505, 0), true);
            class495 var15 = class495.method2874(class692.field9847, class435.field6236, 0);
            class186.field2282 = arg1.method216(var15, true);
            var15.method2881();
            class562.field8119 = arg1.method216(var15, true);
        }
        if (class496.field6934 != null && class406.field5747 != null && class186.field2282 != null) {
            int var16 = (var4 - class186.field2282.method902() * 2) / class496.field6934.method902();
            for (int var17 = 0; var17 < var16; var17++) {
                class496.field6934.method3924(class186.field2282.method902() + var2 + class496.field6934.method902() * var17, var3 + var5 - class496.field6934.method900());
            }
            int var18 = (var5 - class186.field2282.method900() - var6) / class406.field5747.method900();
            for (int var19 = 0; var19 < var18; var19++) {
                class406.field5747.method3924(var2, var19 * class406.field5747.method900() + (var3 + var6));
                class568.field8314.method3924((var2 + var4) - class568.field8314.method902(), var6 + var3 + var19 * class406.field5747.method900());
            }
            class186.field2282.method3924(var2, var5 + (var3 - class186.field2282.method900()));
            class562.field8119.method3924(var2 + var4 - class186.field2282.method902(), -class186.field2282.method900() + (var3 - -var5));
        }
        int var20 = 0;
        for (class377 var21 = (class377) class34.field679.method1132((byte) -126); var21 != null; var21 = (class377) class34.field679.method1134(8446)) {
            int var22 = (class271.field3704 - var20 - 1) * 16 + (var3 - (-var6 - 13));
            int var23 = class227.field2936 | 0xFF000000;
            if (var2 < var10 && var10 < var2 + var4 && (var22 - 13) < var11 && var11 < (var22 + 4) && var21.field5057) {
                var23 = class231.field3007 | 0xFF000000;
            }
            int[] var24 = null;
            if (class267.method1619(var21.field5062, true)) {
                var24 = class65.field1021.method178(false, (int) var21.field5064).field3210;
            } else if (var21.field5067 != -1) {
                var24 = class65.field1021.method178(false, var21.field5067).field3210;
            } else if (class660.method3740((byte) 126, var21.field5062)) {
                class633 var25 = (class633) class522.field7662.method3678((long) ((int) var21.field5064), -126);
                if (var25 != null) {
                    class557 var26 = var25.field9097;
                    class323 var27 = var26.field8052;
                    if (var27.field4315 != null) {
                        var27 = var27.method1881(class410.field5804, (byte) 125);
                    }
                    if (var27 != null) {
                        var24 = var27.field4292;
                    }
                }
            } else if (class19.method333(-1002, var21.field5062)) {
                Object var28 = null;
                class232 var29;
                if (var21.field5062 == 1011) {
                    var29 = class37.field703.method807(0, (int) var21.field5064);
                } else {
                    var29 = class37.field703.method807(0, (int) (var21.field5064 >>> 32 & 0x7FFFFFFFL));
                }
                if (var29.field3094 != null) {
                    var29 = var29.method1412(88, class410.field5804);
                }
                if (var29 != null) {
                    var24 = var29.field3019;
                }
            }
            String var30 = class207.method1245(false, var21);
            if (var24 != null) {
                var30 = var30 + class416.method2497(-17581, var24);
            }
            class36.field691.method2532(class634.field9106, var2 + 3, var30, var23, var22, class420.field5955, true, 0);
            var20++;
            if (var21.field5061) {
                class612.field8779.method3924(var2 - (-class12.field205.method553(var30, 97) - 5), var22 + -12);
            }
        }
        class210.method1254(class1.field2, class84.field1195, class22.field548, (byte) -41, class675.field9685);
    }
}

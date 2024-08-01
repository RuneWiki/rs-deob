import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("se")
public class class171 extends class85 {

    @OriginalMember(owner = "se", name = "T", descriptor = "[I")
    private int[] field3202 = new int[3];

    @OriginalMember(owner = "se", name = "S", descriptor = "I")
    private int field3201 = 3216;

    @OriginalMember(owner = "se", name = "ab", descriptor = "I")
    private int field3209 = 4096;

    @OriginalMember(owner = "se", name = "W", descriptor = "I")
    private int field3205 = 3216;

    @OriginalMember(owner = "se", name = "Z", descriptor = "Llf;")
    public static class109 field3208 = class35.method275("Bitte warten Sie eine Minute", 2);

    @OriginalMember(owner = "se", name = "bb", descriptor = "Llf;")
    public static class109 field3210 = class35.method275("Zu viele Anmelde)2Versuche von Ihrer Adresse", 2);

    @OriginalMember(owner = "se", name = "eb", descriptor = "Llf;")
    public static class109 field3213 = class35.method275("blinken1:", 2);

    @OriginalMember(owner = "se", name = "R", descriptor = "[I")
    public static int[] field3200 = new int[99];

    @OriginalMember(owner = "se", name = "gb", descriptor = "I")
    public static int field3215 = 0;

    @OriginalMember(owner = "se", name = "hb", descriptor = "[I")
    public static int[] field3216;

    @OriginalMember(owner = "se", name = "kb", descriptor = "Llf;")
    public static class109 field3219;

    @OriginalMember(owner = "se", name = "lb", descriptor = "Llf;")
    public static class109 field3220;

    @OriginalMember(owner = "se", name = "jb", descriptor = "Llf;")
    public static class109 field3218;

    @OriginalMember(owner = "se", name = "Q", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "se", name = "U", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "se", name = "V", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "se", name = "X", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "se", name = "Y", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "se", name = "cb", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "se", name = "fb", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "se", name = "db", descriptor = "Loh;")
    public static class138 field3212;

    @OriginalMember(owner = "se", name = "ib", descriptor = "Lbg;")
    public static class18 field3217;

    @OriginalMember(owner = "se", name = "<init>", descriptor = "()V")
    public class171() {
        super(1, true);
    }

    @OriginalMember(owner = "se", name = "c", descriptor = "(I)V")
    public final void method199(int arg0) {
        if (arg0 == 25614) {
            this.method1149((byte) 127);
            ++field3207;
        }
    }

    @OriginalMember(owner = "se", name = "d", descriptor = "(B)V")
    private final void method1149(byte arg0) {
        ++field3203;
        double var2 = Math.cos((double) (this.field3201 / 4096));
        this.field3202[0] = (int) (4096.0D * var2 * Math.sin((double) (this.field3205 / 4096)));
        this.field3202[1] = (int) (4096.0D * Math.cos((double) (this.field3205 / 4096)) * var2);
        this.field3202[2] = (int) (4096.0D * Math.sin((double) (this.field3201 / 4096)));
        int var4 = this.field3202[2] * this.field3202[2] >> 12;
        int var5 = this.field3202[0] * this.field3202[0] >> 12;
        int var6 = this.field3202[1] * this.field3202[1] >> 12;
        if (arg0 >= 94) {
            int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
            if (var7 != 0) {
                this.field3202[1] = (this.field3202[1] << 12) / var7;
                this.field3202[0] = (this.field3202[0] << 12) / var7;
                this.field3202[2] = (this.field3202[2] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "se", name = "e", descriptor = "(I)V")
    public static final void method1150(int arg0) {
        class35.field784 = 0;
        ++field3204;
        int var1 = (class157.field2955.field3549 >> 7) + class53.field1079;
        int var2 = (class157.field2955.field3609 >> 7) + class42.field880;
        int var3 = -102 / ((40 - arg0) / 58);
        if (~var1 <= -3054 && ~var1 >= -3157 && var2 >= 3056 && ~var2 >= -3137) {
            class35.field784 = 1;
        }
        if (~var1 <= -3073 && var1 <= 3118 && var2 >= 9492 && ~var2 >= -9536) {
            class35.field784 = 1;
        }
        if (~class35.field784 == -2 && var1 >= 3139 && ~var1 >= -3200 && ~var2 <= -3009 && var2 <= 3062) {
            class35.field784 = 0;
        }
    }

    @OriginalMember(owner = "se", name = "c", descriptor = "(III)V")
    public static final void method1151(int arg0, int arg1, int arg2) {
        ++field3199;
        class181 var3 = class201.field3965[class72.field1405][arg0][arg2];
        if (var3 == null) {
            class78.method494(class72.field1405, arg0, arg2);
        } else {
            if (arg1 != -28592) {
                method1152(56);
            }
            int var4 = -99999999;
            class72 var5 = (class72) var3.method1230(80);
            class72 var6 = null;
            while (var5 != null) {
                class83 var12 = class128.method926(var5.field1399, -4);
                int var13 = var12.field1659;
                if (var12.field1635 == 1) {
                    var13 = (var5.field1391 + 1) * var13;
                }
                if (var13 > var4) {
                    var4 = var13;
                    var6 = var5;
                }
                var5 = (class72) var3.method1234(-1);
            }
            if (var6 == null) {
                class78.method494(class72.field1405, arg0, arg2);
            } else {
                var3.method1227(var6, (byte) -69);
                class72 var7 = (class72) var3.method1230(arg1 + 28662);
                class72 var8 = null;
                long var9 = (long) ((arg2 << 7) + arg0 + 1610612736);
                class72 var11 = null;
                while (var7 != null) {
                    if (var6.field1399 != var7.field1399) {
                        if (var8 == null) {
                            var8 = var7;
                        }
                        if (~var7.field1399 != ~var8.field1399 && var11 == null) {
                            var11 = var7;
                        }
                    }
                    var7 = (class72) var3.method1234(-1);
                }
                class107.method772(class72.field1405, arg0, arg2, class19.method180(arg2 * 128 + 64, false, class72.field1405, arg0 * 128 + 64), var6, var9, var8, var11);
            }
        }
    }

    @OriginalMember(owner = "se", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field3201 = arg2.method569(true);
                }
            } else {
                this.field3205 = arg2.method569(true);
            }
        } else {
            this.field3209 = arg2.method569(true);
        }
        if (arg0 >= -120) {
            field3219 = null;
        }
        ++field3211;
    }

    @OriginalMember(owner = "se", name = "f", descriptor = "(I)V")
    public static void method1152(int arg0) {
        field3218 = null;
        field3216 = null;
        if (arg0 == -1566999956) {
            field3213 = null;
            field3219 = null;
            field3210 = null;
            field3208 = null;
            field3220 = null;
            field3200 = null;
            field3217 = null;
            field3212 = null;
        }
    }

    @OriginalMember(owner = "se", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        if (arg0 > -49) {
            return null;
        } else {
            int[] var3 = super.field1736.method835(-314, arg1);
            if (super.field1736.field2253) {
                int[] var4 = this.method540(class150.field2892 & arg1 + -1, 114, 0);
                int[] var5 = this.method540(arg1, 37, 0);
                int[] var6 = this.method540(arg1 + 1 & class150.field2892, 3, 0);
                for (int var7 = 0; ~class57.field1152 < ~var7; ++var7) {
                    int var8 = (var5[class29.field624 & var7 + 1] + -var5[var7 + -1 & class29.field624]) * this.field3209;
                    int var9 = (var6[var7] + -var4[var7]) * this.field3209;
                    int var10 = var8 >> 12;
                    int var11 = var9 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (Math.sqrt((double) ((var12 - -var13 - -4096) / 4096)) * 4096.0D);
                    int var15;
                    int var16;
                    int var17;
                    if (var14 == 0) {
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                    } else {
                        var17 = 16777216 / var14;
                        var15 = var9 / var14;
                        var16 = var8 / var14;
                    }
                    int var18 = this.field3202[0] * var16 >> 12;
                    int var19 = this.field3202[2] * var17 >> 12;
                    int var20 = this.field3202[1] * var15 >> 12;
                    var3[var7] = var18 - (-var20 - var19);
                }
            }
            ++field3214;
            return var3;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 - -1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field3200[var1] = var0 / 4;
        }
        field3216 = new int[32];
        field3219 = class35.method275("", 2);
        field3220 = class35.method275(" )2>", 2);
        field3218 = class35.method275("::fpson", 2);
    }
}

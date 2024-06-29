import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class398 extends class194 {

    @OriginalMember(owner = "client!cp", name = "B", descriptor = "I")
    private int field5579;

    @OriginalMember(owner = "client!cp", name = "C", descriptor = "I")
    private int field5580;

    @OriginalMember(owner = "client!cp", name = "A", descriptor = "I")
    private int field5578;

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "I")
    private int field5573;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "[I")
    public static int[] field5565 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "[I")
    public static int[] field5571 = new int[8];

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "[I")
    public static int[] field5567 = new int[100];

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "Ljava/lang/String;")
    public static String field5577 = "flash2:";

    @OriginalMember(owner = "client!cp", name = "y", descriptor = "I")
    public static int field5576 = 0;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(III)V", line = 3)
    public final void method592(int arg0, int arg1, int arg2) {
        ++field5570;
        if (arg0 != 50000) {
            this.method592(46, -97, 32);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IILvj;IIILbi;Lkb;)V", line = 20)
    public static final void method2443(int arg0, int arg1, class179 arg2, int arg3, int arg4, int arg5, class139 arg6, class80 arg7) {
        ++field5569;
        if (arg7 != null) {
            int var8;
            if (class184.field2675 != 4) {
                var8 = (int) class313.field4229 + class161.field2395 & 16383;
            } else {
                var8 = 16383 & (int) class313.field4229;
            }
            int var9 = Math.max(arg6.field2027 / 2, arg6.field2011 / 2) + 10;
            int var10 = arg0 * arg0 + arg1 * arg1;
            if (var10 <= var9 * var9) {
                if (arg5 == 4217) {
                    int var11 = class174.field2572[var8];
                    int var12 = class174.field2564[var8];
                    if (class184.field2675 != 4) {
                        var11 = var11 * 256 / (field5576 - -256);
                        var12 = var12 * 256 / (field5576 + 256);
                    }
                    int var13 = arg0 * var11 + arg1 * var12 >> 15;
                    int var14 = arg0 * var12 - arg1 * var11 >> 15;
                    arg7.method721(arg3 + (arg6.field2027 / 2 - (-var13 + arg7.method740() / 2)), -var14 + (arg6.field2011 / 2 + arg4 - arg7.method739() / 2), arg2, arg3, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BC)C", line = 65)
    public static final char method2444(byte arg0, char arg1) {
        ++field5562;
        if (arg1 == 198) {
            return 'E';
        } else if (arg0 < 32) {
            return (char) 65481;
        } else if (~arg1 == -231) {
            return 'e';
        } else if (~arg1 == -224) {
            return 's';
        } else if (arg1 == 338) {
            return 'E';
        } else {
            return (char) (~arg1 == -340 ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(IIIIIII)V", line = 93)
    public class398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5579 = arg3;
        this.field5580 = arg0;
        this.field5578 = arg2;
        this.field5573 = arg1;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BI)V", line = 109)
    public static final void method2445(byte arg0, int arg1) {
        class243 var2 = class127.field1799;
        synchronized (class127.field1799) {
            if (arg0 < 110) {
                method2448(77);
            }
            class404.field5625 = arg1;
        }
        ++field5574;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BII)I", line = 136)
    public static final int method2446(byte arg0, int arg1, int arg2) {
        ++field5575;
        if (arg2 != 1 && arg2 != 3) {
            if (arg0 != 60) {
                method2447((byte) -78);
            }
            return class359.field4867[3 & arg1];
        } else {
            return class66.field987[3 & arg1];
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)V", line = 157)
    public final void method594(int arg0, int arg1, int arg2) {
        ++field5566;
        if (arg0 > -29) {
            method2446((byte) -123, 42, 91);
        }
        int var4 = this.field5580 * arg1 >> 12;
        int var5 = this.field5578 * arg1 >> 12;
        int var6 = this.field5573 * arg2 >> 12;
        int var7 = this.field5579 * arg2 >> 12;
        class262.method1686(super.field2782, (byte) -67, var7, super.field2788, var6, super.field2787, var4, var5);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIB)V", line = 179)
    public final void method593(int arg0, int arg1, byte arg2) {
        ++field5564;
        int var4 = this.field5580 * arg0 >> 12;
        if (arg2 < 5) {
            field5567 = null;
        }
        int var5 = this.field5578 * arg0 >> 12;
        int var6 = this.field5573 * arg1 >> 12;
        int var7 = this.field5579 * arg1 >> 12;
        class194.method1395(var4, super.field2787, var7, var5, var6, (byte) 23);
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)V", line = 199)
    public static final void method2447(byte arg0) {
        class166.field2464 = 0;
        ++field5572;
        class298.field4018 = 0;
        class191.method1372((byte) 25);
        class414.method2567((byte) -119);
        class326.method2073(21595);
        if (arg0 > -21) {
            method2446((byte) 86, -25, -86);
        }
        class64.method565(-28202);
        for (int var1 = 0; var1 < class298.field4018; ++var1) {
            int var3 = class26.field461[var1];
            if (class414.field5793 != class220.field3044[var3].field4937) {
                if (~class220.field3044[var3].field4578 < -1) {
                    class28.method331((byte) -117, class220.field3044[var3]);
                }
                class220.field3044[var3] = null;
            }
        }
        if (class213.field2961 != class417.field5851.field3938) {
            throw new RuntimeException("gpp1 pos:" + class417.field5851.field3938 + " psize:" + class213.field2961);
        } else {
            for (int var2 = 0; var2 < class174.field2579; ++var2) {
                if (class220.field3044[class134.field1921[var2]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class174.field2579);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V", line = 256)
    public static void method2448(int arg0) {
        int var1 = 125 / ((54 - arg0) / 32);
        field5571 = null;
        field5567 = null;
        field5565 = null;
        field5577 = null;
    }
}

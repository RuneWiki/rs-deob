import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class314 extends class182 {

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    private int field5059 = 3072;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
    private int field5067 = 2048;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "I")
    private int field5069 = 1024;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public static int field5060 = 0;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "Z")
    public static boolean field5063 = true;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field5066 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!td", name = "W", descriptor = "Z")
    public static boolean field5065 = false;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([Lhg;IB)V")
    public static final void method2127(class207[] arg0, int arg1, byte arg2) {
        for (int var3 = 0; var3 < arg0.length; ++var3) {
            class207 var4 = arg0[var3];
            if (var4 != null && var4.field3465 == arg1 && (!var4.field3446 || !client.method733(var4))) {
                if (var4.field3376 == 0) {
                    if (!var4.field3446 && client.method733(var4) && class70.field1169 != var4) {
                        continue;
                    }
                    method2127(arg0, var4.field3405, (byte) 94);
                    if (var4.field3462 != null) {
                        method2127(var4.field3462, var4.field3405, (byte) 94);
                    }
                    class278 var5 = (class278) class306.field4952.method987(-119, (long) var4.field3405);
                    if (var5 != null) {
                        class146.method1082(-72, var5.field4622);
                    }
                }
                if (~var4.field3376 == -7) {
                    if (var4.field3501 != -1 || ~var4.field3461 != 0) {
                        boolean var6 = class223.method1581(93, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field3461;
                        } else {
                            var7 = var4.field3501;
                        }
                        if (~var7 != 0) {
                            class163 var8 = class34.method211(var7, arg2 + -91);
                            if (var8 != null) {
                                var4.field3365 += class19.field356;
                                while (~var8.field2638[var4.field3512] > ~var4.field3365) {
                                    var4.field3365 -= var8.field2638[var4.field3512];
                                    ++var4.field3512;
                                    if (var4.field3512 >= var8.field2639.length) {
                                        var4.field3512 -= var8.field2637;
                                        if (var4.field3512 < 0 || ~var8.field2639.length >= ~var4.field3512) {
                                            var4.field3512 = 0;
                                        }
                                    }
                                    var4.field3445 = var4.field3512 + 1;
                                    if (var8.field2639.length <= var4.field3445) {
                                        var4.field3445 -= var8.field2637;
                                        if (~var4.field3445 > -1 || var4.field3445 >= var8.field2639.length) {
                                            var4.field3445 = -1;
                                        }
                                    }
                                    class206.method1441(0, var4);
                                }
                            }
                        }
                    }
                    if (var4.field3426 != 0 && !var4.field3446) {
                        int var9 = var4.field3426 << 16 >> 16;
                        int var10 = var4.field3426 >> 16;
                        int var11 = class19.field356 * var9;
                        int var12 = class19.field356 * var10;
                        var4.field3370 = 2047 & var4.field3370 + var12;
                        var4.field3366 = 2047 & var4.field3366 + var11;
                        class206.method1441(0, var4);
                    }
                }
            }
        }
        if (arg2 != 94) {
            method2129(-54, 3);
        }
        ++field5057;
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
    public final void method469(int arg0) {
        if (arg0 != -1) {
            this.method153(true, 0);
        }
        this.field5067 = this.field5059 - this.field5069;
        ++field5064;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
    public static void method2128(byte arg0) {
        if (arg0 != 44) {
            field5060 = 67;
        }
        field5066 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
    public static final void method2129(int arg0, int arg1) {
        if (class101.field1608 != 0) {
            class220.field3704 = arg1;
        } else {
            class313.field5050.method781(arg1, true);
        }
        ++field5061;
        int var2 = -125 % (arg0 / 41);
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class314() {
        super(1, false);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        if (arg0) {
            this.method157((byte) 114, 126);
        }
        ++field5068;
        int[] var3 = super.field2911.method77(arg1, -27);
        if (super.field2911.field287) {
            int[] var4 = this.method1323(0, -17707, arg1);
            for (int var5 = 0; var5 < class4.field116; ++var5) {
                var3[var5] = (var4[var5] * this.field5067 >> 12) + this.field5069;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        ++field5062;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field2896 = ~arg1.method1802((byte) -102) == -2;
                }
            } else {
                this.field5059 = arg1.method1821((byte) 51);
            }
        } else {
            this.field5069 = arg1.method1821((byte) 51);
        }
        if (arg0) {
            field5060 = 19;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        int var3 = 55 / ((-64 - arg0) / 49);
        int[][] var4 = super.field2905.method50(arg1, (byte) 123);
        ++field5058;
        if (super.field2905.field158) {
            int[][] var5 = this.method1327(0, 0, arg1);
            int[] var6 = var5[2];
            int[] var7 = var5[0];
            int[] var8 = var4[1];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var5[1];
            for (int var12 = 0; var12 < class4.field116; ++var12) {
                var9[var12] = (var7[var12] * this.field5067 >> 12) + this.field5069;
                var8[var12] = (var11[var12] * this.field5067 >> 12) + this.field5069;
                var10[var12] = (var6[var12] * this.field5067 >> 12) + this.field5069;
            }
        }
        return var4;
    }
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class534 extends class232 {

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    private int field7840 = 2;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    private int field7842 = 5;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "[B")
    private byte[] field7843 = new byte[512];

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    private int field7841 = 5;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    private int field7847 = 2048;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "[S")
    private short[] field7836 = new short[512];

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    private int field7844 = 1;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    private int field7845 = 0;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "[Ljava/lang/String;")
    private static final String[] field7848 = new String[] { method3987(method3986("2\u0017\u0018^6")), method3987(method3986("2\u0017\u0018[6")), method3987(method3986("&]\u00181c")), method3987(method3986("3\u0006Zs")), method3987(method3986("2\u0017\u0018Z6")), method3987(method3986("2\u0017\u0018S6")), method3987(method3986("2\u0017\u0018Y6")), method3987(method3986("2\u0017\u0018U6")), method3987(method3986("2\u0017\u0018T6")), method3987(method3986("2\u0017\u0018\\6")) };

    @OriginalMember(owner = "client!od", name = "T", descriptor = "[I")
    public static int[] field7839 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    public static int field7834;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public static int field7835;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZII)V", line = 3)
    public static final void method3981(boolean arg0, int arg1, int arg2) {
        try {
            ++field7837;
            class551 var3 = class380.method3113(29, (long) arg1, 5);
            if (arg0) {
                field7839 = null;
            }
            var3.method4086(126);
            var3.field8076 = arg2;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7848[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V", line = 17)
    public static void method3982(int arg0) {
        try {
            field7839 = null;
            if (arg0 != -14903) {
                field7839 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7848[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(II)Lnka;", line = 31)
    public static final class309 method3983(int arg0, int arg1) {
        try {
            ++field7834;
            class309 var2 = (class309) class501.field7496.method302(-92, (long) arg0);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class683.field9895.method604((byte) -122, arg0, 0);
                class309 var4 = new class309();
                if (arg1 != -30534) {
                    field7839 = null;
                }
                if (var3 != null) {
                    var4.method2652(new class176(var3), 0);
                }
                var4.method2651(-1);
                class501.field7496.method295(false, (long) arg0, var4);
                return var4;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7848[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 59)
    public final void method67(byte arg0) {
        try {
            ++field7838;
            this.field7843 = class478.method3652(512, this.field7845);
            this.method3984((byte) -117);
            int var2 = 60 % ((arg0 - 73) / 34);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7848[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V", line = 70)
    private final void method3984(byte arg0) {
        try {
            ++field7835;
            if (arg0 >= -116) {
                this.method67((byte) 120);
            }
            Random var2 = new Random((long) this.field7845);
            this.field7836 = new short[512];
            if (this.field7847 > 0) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field7836[var3] = (short) class235.method2039(var2, this.field7847, -97);
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7848[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)[I", line = 97)
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field7846;
            if (arg1 != 123) {
                return null;
            } else {
                int[] var3 = super.field3601.method3467(arg0, (byte) -61);
                if (super.field3601.field6907) {
                    int var4 = class100.field1467[arg0] * this.field7842 + 2048;
                    int var5 = var4 >> 12;
                    int var6 = var5 + 1;
                    for (int var7 = 0; ~class449.field6969 < ~var7; ++var7) {
                        class634.field9113 = Integer.MAX_VALUE;
                        class269.field4340 = Integer.MAX_VALUE;
                        class82.field1250 = Integer.MAX_VALUE;
                        class748.field11044 = Integer.MAX_VALUE;
                        int var8 = class788.field11518[var7] * this.field7841 + 2048;
                        int var9 = var8 >> 12;
                        int var10 = var9 + 1;
                        for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                            int var12 = this.field7843[255 & (this.field7842 <= var11 ? -this.field7842 + var11 : var11)] & 255;
                            for (int var13 = var9 + -1; ~var13 >= ~var10; ++var13) {
                                int var14 = (this.field7843[255 & var12 + (~this.field7841 >= ~var13 ? var13 - this.field7841 : var13)] & 255) * 2;
                                int var10000 = -(var13 << 12);
                                int var29 = var14 + 1;
                                int var15 = var10000 - this.field7836[var14] + var8;
                                int var16 = -(var11 << 12) - (this.field7836[var29] - var4);
                                int var17 = this.field7844;
                                int var18;
                                if (~var17 != -2) {
                                    if (var17 != 3) {
                                        if (~var17 != -5) {
                                            if (var17 != 5) {
                                                if (~var17 == -3) {
                                                    var18 = (~var16 <= -1 ? var16 : -var16) + (var15 >= 0 ? var15 : -var15);
                                                } else {
                                                    var18 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)));
                                                }
                                            } else {
                                                int var24 = var16 * var16;
                                                int var25 = var15 * var15;
                                                var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var24 + var25) / 1.6777216E7F))) * 4096.0D);
                                            }
                                        } else {
                                            int var21 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)));
                                            int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                            int var23 = var21 + var22;
                                            var18 = var23 * var23 >> 12;
                                        }
                                    } else {
                                        int var19 = ~var15 > -1 ? -var15 : var15;
                                        int var20 = var16 < 0 ? -var16 : var16;
                                        var18 = var20 < var19 ? var19 : var20;
                                    }
                                } else {
                                    var18 = var15 * var15 + var16 * var16 >> 12;
                                }
                                if (var18 >= class748.field11044) {
                                    if (var18 < class82.field1250) {
                                        class634.field9113 = class269.field4340;
                                        class269.field4340 = class82.field1250;
                                        class82.field1250 = var18;
                                    } else if (var18 >= class269.field4340) {
                                        if (var18 < class634.field9113) {
                                            class634.field9113 = var18;
                                        }
                                    } else {
                                        class634.field9113 = class269.field4340;
                                        class269.field4340 = var18;
                                    }
                                } else {
                                    class634.field9113 = class269.field4340;
                                    class269.field4340 = class82.field1250;
                                    class82.field1250 = class748.field11044;
                                    class748.field11044 = var18;
                                }
                            }
                        }
                        int var26 = this.field7840;
                        if (~var26 != -1) {
                            if (~var26 != -2) {
                                if (var26 != 3) {
                                    if (var26 != 4) {
                                        if (var26 == 2) {
                                            var3[var7] = -class748.field11044 + class82.field1250;
                                        }
                                    } else {
                                        var3[var7] = class634.field9113;
                                    }
                                } else {
                                    var3[var7] = class269.field4340;
                                }
                            } else {
                                var3[var7] = class82.field1250;
                            }
                        } else {
                            var3[var7] = class748.field11044;
                        }
                    }
                }
                return var3;
            }
        } catch (RuntimeException var28) {
            throw class590.method4333(var28, field7848[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILwq;I)V", line = 306)
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            ++field7833;
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (~arg2 != -4) {
                            if (~arg2 != -5) {
                                if (arg2 != 5) {
                                    if (arg2 == 6) {
                                        this.field7842 = arg1.method1645((byte) -100);
                                    }
                                } else {
                                    this.field7841 = arg1.method1645((byte) -80);
                                }
                            } else {
                                this.field7844 = arg1.method1645((byte) -86);
                            }
                        } else {
                            this.field7840 = arg1.method1645((byte) -91);
                        }
                    } else {
                        this.field7847 = arg1.method1687((byte) -73);
                    }
                } else {
                    this.field7845 = arg1.method1645((byte) -120);
                }
            } else {
                this.field7841 = this.field7842 = arg1.method1645((byte) -117);
            }
            if (arg0 < 96) {
                this.field7841 = -88;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7848[4] + arg0 + ',' + (arg1 != null ? field7848[2] : field7848[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 390)
    public class534() {
        super(0, true);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILef;)V", line = 399)
    public static final void method3985(int arg0, class515 arg1) {
        try {
            ++field7832;
            if (arg1.field7605 != null) {
                arg1.field7605.field3822 = 0;
            }
            arg1.field7606 = false;
            for (class515 var2 = arg1.method1134(); var2 != null; var2 = arg1.method1136()) {
                method3985(0, var2);
            }
            if (arg0 != 0) {
                method3985(5, (class515) null);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7848[6] + arg0 + ',' + (arg1 != null ? field7848[2] : field7848[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!od", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3986(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 30);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!od", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3987(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 93;
                    break;
                case 1:
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 54;
                    break;
                case 3:
                    var10005 = 31;
                    break;
                default:
                    var10005 = 30;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class60 extends class313 {

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    private int field925 = 2048;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "[B")
    private byte[] field930 = new byte[512];

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    private int field929 = 1;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "[S")
    private short[] field934 = new short[512];

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    private int field928 = 5;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    private int field936 = 0;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
    private int field939 = 2;

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
    private int field940 = 5;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Llg;Ljava/lang/String;B)Ljava/lang/String;", line = 5)
    public static final String method554(class137 arg0, String arg1, byte arg2) {
        field933++;
        if (arg2 > -62) {
            return (String) null;
        } else if (arg1.indexOf("%") == -1) {
            return arg1;
        } else {
            while (true) {
                int var3 = arg1.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            return arg1;
                                                        }
                                                        String var9 = "";
                                                        if (class113.field1887 != null) {
                                                            if (class113.field1887.field712 == null) {
                                                                var9 = class170.method1346(class113.field1887.field711, 255);
                                                            } else {
                                                                var9 = (String) class113.field1887.field712;
                                                            }
                                                        }
                                                        arg1 = arg1.substring(0, var8) + var9 + arg1.substring(var8 + 4);
                                                    }
                                                }
                                                arg1 = arg1.substring(0, var7) + class347.method2433(47, class113.method966(arg0, 4, -123)) + arg1.substring(var7 + 2);
                                            }
                                        }
                                        arg1 = arg1.substring(0, var6) + class347.method2433(67, class113.method966(arg0, 3, -122)) + arg1.substring(var6 + 2);
                                    }
                                }
                                arg1 = arg1.substring(0, var5) + class347.method2433(72, class113.method966(arg0, 2, -109)) + arg1.substring(var5 + 2);
                            }
                        }
                        arg1 = arg1.substring(0, var4) + class347.method2433(111, class113.method966(arg0, 1, -119)) + arg1.substring(var4 + 2);
                    }
                }
                arg1 = arg1.substring(0, var3) + class347.method2433(118, class113.method966(arg0, 0, -119)) + arg1.substring(var3 + 2);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V", line = 93)
    public class60() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V", line = 98)
    private final void method555(int arg0) {
        Random var2 = new Random((long) this.field936);
        if (arg0 != 26266) {
            return;
        }
        this.field934 = new short[512];
        field932++;
        if (this.field925 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field934[var3] = (short) class129.method1075(this.field925, 19192, var2);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(JZ)V", line = 132)
    public static final void method556(long arg0, boolean arg1) {
        if (class191.field3194 == 1 || class191.field3194 == 5) {
            class181.method1379(arg0, 0);
        } else if (class191.field3194 == 2) {
            class329.method2282(true);
        } else {
            class161.method1282(2);
        }
        field935++;
        if (!class207.field3515) {
            class221.field3691[0] = class321.field5075;
            class293.field4708 = 1;
            class276.field4401[0] = 1004;
            if (class17.field267 != 0) {
                class172.field2980 = class70.field1151;
                class67.field1087 = class127.field2198;
            } else if (class284.field4509 == 0) {
                class67.field1087 = class258.field4182;
                class172.field2980 = class284.field4508;
            } else {
                class172.field2980 = class218.field3635;
                class67.field1087 = class226.field3812;
            }
            class166.field2909[0] = class331.field5282;
            class241.field3944[0] = "";
        }
        class65.method625((long) class181.field3045);
        if (class311.field4933 != -1) {
            class212.method1571(class311.field4933, (byte) 26);
        }
        for (int var3 = 0; var3 < class215.field3602; var3++) {
            if (class272.field4337[var3]) {
                class224.field3746[var3] = true;
            }
            class127.field2211[var3] = class272.field4337[var3];
            class272.field4337[var3] = false;
        }
        class280.field4435 = -1;
        class262.field4249 = class181.field3045;
        if (class43.field680) {
            class155.field2759 = true;
        }
        class51.field800 = null;
        class166.field2902 = null;
        class104.field1748 = -1;
        if (class311.field4933 != -1) {
            class215.field3602 = 0;
            class1.method6(-24489);
        }
        if (class43.field680) {
            class169.method1335();
        } else {
            class47.method403();
        }
        class289.method1964(1);
        if (class207.field3515) {
            if (class177.field3007) {
                class258.method1789(15);
            } else {
                class146.method1169((byte) -107);
            }
        } else if (class51.field800 != null) {
            class40.method335((byte) -85, class51.field800, class211.field3566, class143.field2610);
        } else if (class280.field4435 != -1) {
            class40.method335((byte) -67, (class137) null, class104.field1748, class280.field4435);
        }
        int var4 = class207.field3515 ? -1 : class143.method1153(-122);
        if (arg1) {
            return;
        }
        if (var4 == -1) {
            var4 = class254.field4101;
        }
        class239.method1683(-20083, var4);
        if (class203.field3454 == 1) {
            class203.field3454 = 2;
        }
        if (class272.field4336 == 1) {
            class272.field4336 = 2;
        }
        if (class324.field5157 == 3) {
            for (int var5 = 0; var5 < class215.field3602; var5++) {
                if (class127.field2211[var5]) {
                    if (class43.field680) {
                        class169.method1329(class328.field5227[var5], class213.field3579[var5], class15.field231[var5], class15.field225[var5], 16711935, 128);
                    } else {
                        class47.method417(class328.field5227[var5], class213.field3579[var5], class15.field231[var5], class15.field225[var5], 16711935, 128);
                    }
                } else if (class224.field3746[var5]) {
                    if (class43.field680) {
                        class169.method1329(class328.field5227[var5], class213.field3579[var5], class15.field231[var5], class15.field225[var5], 16711680, 128);
                    } else {
                        class47.method417(class328.field5227[var5], class213.field3579[var5], class15.field231[var5], class15.field225[var5], 16711680, 128);
                    }
                }
            }
        }
        class198.method1493(class205.field3497, class218.field3632.field1985, class31.field446, class218.field3632.field2036, true);
        class31.field446 = 0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILpi;)V", line = 293)
    public final void method185(int arg0, int arg1, class336 arg2) {
        field926++;
        if (arg1 != -17848) {
            this.field940 = 47;
        }
        if (arg0 == 0) {
            this.field928 = this.field940 = arg2.method2364(-9069);
        } else if (arg0 == 1) {
            this.field936 = arg2.method2364(-9069);
        } else if (arg0 == 2) {
            this.field925 = arg2.method2339((byte) -46);
        } else if (arg0 == 3) {
            this.field939 = arg2.method2364(-9069);
        } else if (arg0 == 4) {
            this.field929 = arg2.method2364(-9069);
        } else if (arg0 == 5) {
            this.field928 = arg2.method2364(-9069);
        } else if (arg0 == 6) {
            this.field940 = arg2.method2364(arg1 ^ 0x66DB);
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)[I", line = 375)
    public final int[] method111(int arg0, int arg1) {
        field938++;
        if (arg0 != 4) {
            method556(9L, true);
        }
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            int var4 = class1.field6[arg1] * this.field940 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class133.field2269; var7++) {
                class110.field1863 = Integer.MAX_VALUE;
                class238.field3907 = Integer.MAX_VALUE;
                class72.field1205 = Integer.MAX_VALUE;
                class189.field3179 = Integer.MAX_VALUE;
                int var8 = class8.field104[var7] * this.field928 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field930[(this.field940 <= var11 ? var11 - this.field940 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field930[var12 + (this.field928 > var13 ? var13 : var13 - this.field928) & 0xFF] & 0xFF) * 2;
                        int var10000 = var8 - (var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 - this.field934[var14];
                        int var16 = var4 - this.field934[var27] - (var11 << 12);
                        int var17 = this.field929;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var24 = var15 >= 0 ? var15 : -var15;
                            int var25 = var16 < 0 ? -var16 : var16;
                            var18 = var25 < var24 ? var24 : var25;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var18 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var19 = var15 * var15;
                            int var20 = var16 * var16;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var19 + var20) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var16 < 0 ? -var16 : var16) + (var15 >= 0 ? var15 : -var15);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class189.field3179 > var18) {
                            class110.field1863 = class238.field3907;
                            class238.field3907 = class72.field1205;
                            class72.field1205 = class189.field3179;
                            class189.field3179 = var18;
                        } else if (class72.field1205 > var18) {
                            class110.field1863 = class238.field3907;
                            class238.field3907 = class72.field1205;
                            class72.field1205 = var18;
                        } else if (var18 < class238.field3907) {
                            class110.field1863 = class238.field3907;
                            class238.field3907 = var18;
                        } else if (class110.field1863 > var18) {
                            class110.field1863 = var18;
                        }
                    }
                }
                int var26 = this.field939;
                if (var26 == 0) {
                    var3[var7] = class189.field3179;
                } else if (var26 == 1) {
                    var3[var7] = class72.field1205;
                } else if (var26 == 3) {
                    var3[var7] = class238.field3907;
                } else if (var26 == 4) {
                    var3[var7] = class110.field1863;
                } else if (var26 == 2) {
                    var3[var7] = class72.field1205 - class189.field3179;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(III)Llg;", line = 596)
    public static final class137 method557(int arg0, int arg1, int arg2) {
        if (arg1 < 84) {
            field937 = 67;
        }
        class137 var3 = class146.method1167(1169843632, arg0);
        field931++;
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field2453 == null || arg2 >= var3.field2453.length) {
            return null;
        } else {
            return var3.field2453[arg2];
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V", line = 619)
    public final void method182(int arg0) {
        if (arg0 == 25833) {
            field927++;
            this.field930 = class170.method1341(this.field936, (byte) 60);
            this.method555(26266);
        }
    }
}

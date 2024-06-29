import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class481 extends class518 {

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "[B")
    private byte[] field7081 = new byte[512];

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    private int field7079 = 5;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    private int field7085 = 1;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
    private int field7086 = 5;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    private int field7083 = 2;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    private int field7087 = 2048;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    private int field7088 = 0;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "[S")
    private short[] field7080 = new short[512];

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field7089 = new String[] { method3719(method3718(":\bhy\u0005")), method3719(method3718(":\bhz\u0005")), method3719(method3718(":\bhw\u0005")), method3719(method3718(":\bh\u007f\u0005")), method3719(method3718(":\bh~\u0005")), method3719(method3718("*Nh\u0013P")), method3719(method3718("?\u0015*Q")) };

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "[[I")
    public static int[][] field7084 = new int[128][128];

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V")
    private final void method3716(int arg0) {
        try {
            ++field7078;
            Random var2 = new Random((long) this.field7088);
            if (arg0 <= -16) {
                this.field7080 = new short[512];
                if (this.field7087 > 0) {
                    for (int var3 = 0; ~var3 > -513; ++var3) {
                        this.field7080[var3] = (short) class70.method723(var2, this.field7087, (byte) 58);
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7089[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field7076;
            int var3 = -98 / ((arg1 - -57) / 55);
            int[] var4 = super.field7564.method4462(26041, arg0);
            if (super.field7564.field8652) {
                int var5 = class568.field8263[arg0] * this.field7086 + 2048;
                int var6 = var5 >> 12;
                int var7 = var6 + 1;
                for (int var8 = 0; ~var8 > ~class110.field1436; ++var8) {
                    class324.field4418 = Integer.MAX_VALUE;
                    class538.field7914 = Integer.MAX_VALUE;
                    class792.field11526 = Integer.MAX_VALUE;
                    class20.field254 = Integer.MAX_VALUE;
                    int var9 = class393.field5718[var8] * this.field7079 + 2048;
                    int var10 = var9 >> 12;
                    int var11 = var10 - -1;
                    for (int var12 = var6 - 1; var7 >= var12; ++var12) {
                        int var13 = 255 & this.field7081[(this.field7086 <= var12 ? var12 - this.field7086 : var12) & 255];
                        for (int var14 = var10 + -1; ~var11 <= ~var14; ++var14) {
                            int var15 = 2 * (255 & this.field7081[(var14 < this.field7079 ? var14 : var14 - this.field7079) + var13 & 255]);
                            int var10000 = -(var14 << 12);
                            int var30 = var15 + 1;
                            int var16 = var10000 - (this.field7080[var15] - var9);
                            int var17 = -(var12 << 12) + -this.field7080[var30] + var5;
                            int var18 = this.field7085;
                            int var19;
                            if (~var18 != -2) {
                                if (var18 != 3) {
                                    if (~var18 != -5) {
                                        if (var18 != 5) {
                                            if (var18 == 2) {
                                                var19 = (var17 >= 0 ? var17 : -var17) + (~var16 <= -1 ? var16 : -var16);
                                            } else {
                                                var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                            }
                                        } else {
                                            int var25 = var17 * var17;
                                            int var26 = var16 * var16;
                                            var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var26 - -var25) / 1.6777216E7F))));
                                        }
                                    } else {
                                        int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)));
                                        int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)));
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var20 = var16 >= 0 ? var16 : -var16;
                                    int var21 = ~var17 > -1 ? -var17 : var17;
                                    var19 = var21 >= var20 ? var21 : var20;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (class20.field254 > var19) {
                                class324.field4418 = class538.field7914;
                                class538.field7914 = class792.field11526;
                                class792.field11526 = class20.field254;
                                class20.field254 = var19;
                            } else if (~class792.field11526 >= ~var19) {
                                if (var19 < class538.field7914) {
                                    class324.field4418 = class538.field7914;
                                    class538.field7914 = var19;
                                } else if (var19 < class324.field4418) {
                                    class324.field4418 = var19;
                                }
                            } else {
                                class324.field4418 = class538.field7914;
                                class538.field7914 = class792.field11526;
                                class792.field11526 = var19;
                            }
                        }
                    }
                    int var27 = this.field7083;
                    if (var27 != 0) {
                        if (~var27 != -2) {
                            if (~var27 != -4) {
                                if (~var27 != -5) {
                                    if (~var27 == -3) {
                                        var4[var8] = -class20.field254 + class792.field11526;
                                    }
                                } else {
                                    var4[var8] = class324.field4418;
                                }
                            } else {
                                var4[var8] = class538.field7914;
                            }
                        } else {
                            var4[var8] = class792.field11526;
                        }
                    } else {
                        var4[var8] = class20.field254;
                    }
                }
            }
            return var4;
        } catch (RuntimeException var29) {
            throw class665.method4799(var29, field7089[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
    public final void method12(int arg0) {
        try {
            ++field7075;
            this.field7081 = class712.method5156(this.field7088, (byte) 126);
            if (arg0 <= 38) {
                this.field7086 = 92;
            }
            this.method3716(-56);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7089[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class481() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjc;I)V")
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            ++field7082;
            if (arg2 == -3) {
                if (~arg0 != -1) {
                    if (arg0 != 1) {
                        if (arg0 != 2) {
                            if (~arg0 != -4) {
                                if (arg0 != 4) {
                                    if (arg0 != 5) {
                                        if (~arg0 == -7) {
                                            this.field7086 = arg1.method5128(arg2 + 3);
                                        }
                                    } else {
                                        this.field7079 = arg1.method5128(0);
                                    }
                                } else {
                                    this.field7085 = arg1.method5128(arg2 + 3);
                                }
                            } else {
                                this.field7083 = arg1.method5128(0);
                            }
                        } else {
                            this.field7087 = arg1.method5116((byte) -107);
                        }
                    } else {
                        this.field7088 = arg1.method5128(0);
                    }
                } else {
                    this.field7079 = this.field7086 = arg1.method5128(arg2 + 3);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7089[4] + arg0 + ',' + (arg1 != null ? field7089[5] : field7089[6]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
    public static void method3717(int arg0) {
        try {
            field7084 = null;
            if (arg0 >= -58) {
                field7084 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7089[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3718(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3719(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 96;
                    break;
                case 2:
                    var10005 = 70;
                    break;
                case 3:
                    var10005 = 61;
                    break;
                default:
                    var10005 = 45;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

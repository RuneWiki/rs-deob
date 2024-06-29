import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class128 extends class397 {

    @OriginalMember(owner = "client!fq", name = "R", descriptor = "I")
    private int field1637 = 0;

    @OriginalMember(owner = "client!fq", name = "N", descriptor = "I")
    private int field1633 = 20;

    @OriginalMember(owner = "client!fq", name = "Q", descriptor = "I")
    private int field1636 = 1365;

    @OriginalMember(owner = "client!fq", name = "S", descriptor = "I")
    private int field1638 = 0;

    @OriginalMember(owner = "client!fq", name = "L", descriptor = "I")
    public static int field1631 = -1;

    @OriginalMember(owner = "client!fq", name = "U", descriptor = "Liu;")
    public static class390 field1640;

    @OriginalMember(owner = "client!fq", name = "M", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!fq", name = "O", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!fq", name = "P", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!fq", name = "T", descriptor = "I")
    public static int field1639;

    static {
        new class194("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field1640 = new class390(4, 1);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILmd;)V", line = 4)
    public static final void method712(int arg0, class364 arg1) {
        ++field1632;
        int var2 = 0;
        arg1.method2217((byte) 123);
        for (int var3 = 0; var3 < class276.field3953; ++var3) {
            int var15 = class330.field4790[var3];
            if ((class58.field903[var15] & 1) == 0) {
                if (~var2 < -1) {
                    --var2;
                    class58.field903[var15] = (byte) class51.method379(class58.field903[var15], 2);
                } else {
                    int var16 = arg1.method2229(1, arg0 + -2078729828);
                    if (~var16 == -1) {
                        var2 = class271.method1653(arg1, 8);
                        class58.field903[var15] = (byte) class51.method379(class58.field903[var15], 2);
                    } else {
                        class7.method63(arg1, var15, (byte) -57);
                    }
                }
            }
        }
        arg1.method2227(8);
        if (~var2 != -1) {
            throw new RuntimeException("nsn0");
        } else {
            arg1.method2217((byte) -18);
            for (int var4 = 0; var4 < class276.field3953; ++var4) {
                int var13 = class330.field4790[var4];
                if (~(1 & class58.field903[var13]) != -1) {
                    if (~var2 < -1) {
                        class58.field903[var13] = (byte) class51.method379(class58.field903[var13], 2);
                        --var2;
                    } else {
                        int var14 = arg1.method2229(1, -1);
                        if (var14 == 0) {
                            var2 = class271.method1653(arg1, 8);
                            class58.field903[var13] = (byte) class51.method379(class58.field903[var13], 2);
                        } else {
                            class7.method63(arg1, var13, (byte) -100);
                        }
                    }
                }
            }
            arg1.method2227(8);
            if (arg0 != 2078729827) {
                method714((byte) 56);
            }
            if (~var2 != -1) {
                throw new RuntimeException("nsn1");
            } else {
                arg1.method2217((byte) -39);
                for (int var5 = 0; class141.field1849 > var5; ++var5) {
                    int var11 = class363.field5463[var5];
                    if (~(class58.field903[var11] & 1) != -1) {
                        if (var2 > 0) {
                            --var2;
                            class58.field903[var11] = (byte) class51.method379(class58.field903[var11], 2);
                        } else {
                            int var12 = arg1.method2229(1, -1);
                            if (~var12 == -1) {
                                var2 = class271.method1653(arg1, 8);
                                class58.field903[var11] = (byte) class51.method379(class58.field903[var11], 2);
                            } else if (class405.method2423(arg1, arg0 ^ 2078677308, var11)) {
                                class58.field903[var11] = (byte) class51.method379(class58.field903[var11], 2);
                            }
                        }
                    }
                }
                arg1.method2227(arg0 + -2078729819);
                if (var2 != 0) {
                    throw new RuntimeException("nsn2");
                } else {
                    arg1.method2217((byte) 115);
                    for (int var6 = 0; ~class141.field1849 < ~var6; ++var6) {
                        int var9 = class363.field5463[var6];
                        if ((1 & class58.field903[var9]) == 0) {
                            if (~var2 < -1) {
                                class58.field903[var9] = (byte) class51.method379(class58.field903[var9], 2);
                                --var2;
                            } else {
                                int var10 = arg1.method2229(1, arg0 ^ -2078729828);
                                if (var10 == 0) {
                                    var2 = class271.method1653(arg1, arg0 ^ 2078729835);
                                    class58.field903[var9] = (byte) class51.method379(class58.field903[var9], 2);
                                } else if (class405.method2423(arg1, 65375, var9)) {
                                    class58.field903[var9] = (byte) class51.method379(class58.field903[var9], 2);
                                }
                            }
                        }
                    }
                    arg1.method2227(8);
                    if (~var2 != -1) {
                        throw new RuntimeException("nsn3");
                    } else {
                        class276.field3953 = 0;
                        class141.field1849 = 0;
                        for (int var7 = 1; var7 < 2048; ++var7) {
                            class58.field903[var7] = (byte) (class58.field903[var7] >> 1);
                            class313 var8 = class262.field3742[var7];
                            if (var8 == null) {
                                class363.field5463[class141.field1849++] = var7;
                            } else {
                                class330.field4790[class276.field3953++] = var7;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V", line = 206)
    public class128() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "(I)V", line = 210)
    public static void method713(int arg0) {
        if (arg0 != 0) {
            method713(-95);
        }
        field1640 = null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IBLae;)V", line = 221)
    public final void method27(int arg0, byte arg1, class156 arg2) {
        ++field1635;
        if (arg1 == 80) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (arg0 == 3) {
                            this.field1638 = arg2.method993((byte) -75);
                        }
                    } else {
                        this.field1637 = arg2.method993((byte) -115);
                    }
                } else {
                    this.field1633 = arg2.method993((byte) -99);
                }
            } else {
                this.field1636 = arg2.method993((byte) -34);
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(II)[I", line = 276)
    public final int[] method31(int arg0, int arg1) {
        ++field1634;
        int[] var3 = super.field5854.method465(arg1, 119);
        if (arg0 != -780833076) {
            method714((byte) -29);
        }
        if (super.field5854.field991) {
            for (int var4 = 0; var4 < class164.field2152; ++var4) {
                int var5 = (class228.field3210[var4] << 12) / this.field1636 + this.field1637;
                int var6 = (class447.field6523[arg1] << 12) / this.field1636 + this.field1638;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 - -var12) > -16385 && this.field1633 > var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var11 - var12 + var7;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = ~(this.field1633 - 1) >= ~var13 ? 0 : (var13 << 12) / this.field1633;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "(B)V", line = 347)
    public static final void method714(byte arg0) {
        if (class323.field4729 != 10 && class323.field4729 != 28) {
            int var1 = class415.field6145.field4279[0] >> 3;
            int var2 = class415.field6145.field4282[0] >> 3;
            if (var1 >= 0 && ~(class362.field5442 >> 3) < ~var1 && ~var2 <= -1 && ~var2 > ~(class203.field2813 >> 3)) {
                class334.method2021(var1, 5000, (byte) -46, var2);
            } else {
                class334.method2021(class362.field5442 >> 4, 0, (byte) 125, class203.field2813 >> 4);
            }
        } else {
            class334.method2021(class205.field2843 >> 10, 5000, (byte) -102, class282.field4026 >> 10);
        }
        ++field1639;
        class440.method2577(arg0 + 3065);
        class234.method1423(-9665);
        class400.method2386(0);
        if (arg0 == -34) {
            class485.method2831((byte) 118);
        }
    }
}

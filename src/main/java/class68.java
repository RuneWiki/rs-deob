import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class68 extends class194 {

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    private int field808 = 5;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
    private int field811 = 2;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "[B")
    private byte[] field814 = new byte[512];

    @OriginalMember(owner = "client!pk", name = "X", descriptor = "I")
    private int field822 = 5;

    @OriginalMember(owner = "client!pk", name = "W", descriptor = "I")
    private int field821 = 0;

    @OriginalMember(owner = "client!pk", name = "U", descriptor = "[S")
    private short[] field819 = new short[512];

    @OriginalMember(owner = "client!pk", name = "ab", descriptor = "I")
    private int field825 = 1;

    @OriginalMember(owner = "client!pk", name = "Z", descriptor = "I")
    private int field824 = 2048;

    @OriginalMember(owner = "client!pk", name = "V", descriptor = "I")
    public static int field820 = 20;

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
    public static int field818 = -1;

    @OriginalMember(owner = "client!pk", name = "Y", descriptor = "Z")
    public static boolean field823 = false;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!pk", name = "bb", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!pk", name = "cb", descriptor = "I")
    public static int field827;

    static {
        new class72("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)Lkj;", line = 6)
    public static final class175 method392(byte arg0, int arg1) {
        ++field809;
        class288[] var2 = class300.field4005;
        synchronized (class300.field4005) {
            class175 var3;
            if (~class300.field4005.length < ~arg1 && !class300.field4005[arg1].method1836(-107)) {
                var3 = (class175) class300.field4005[arg1].method1835(64);
                var3.method358(42);
                int var10002 = class240.field3156[arg1]--;
            } else {
                var3 = new class175();
                var3.field2030 = new class34[arg1];
                for (int var4 = 0; var4 < arg1; ++var4) {
                    var3.field2030[var4] = new class34();
                }
            }
            int var5 = -83 / ((27 - arg0) / 32);
            return var3;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)[I", line = 39)
    public final int[] method55(int arg0, int arg1) {
        ++field826;
        int[] var3 = super.field2292.method1781(arg0, false);
        if (super.field2292.field3708) {
            int var4 = class249.field3283[arg0] * this.field808 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class138.field1579; ++var7) {
                class387.field5288 = Integer.MAX_VALUE;
                class382.field5233 = Integer.MAX_VALUE;
                class146.field1717 = Integer.MAX_VALUE;
                class344.field4676 = Integer.MAX_VALUE;
                int var8 = class277.field3585[var7] * this.field822 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 - 1; var11 <= var6; ++var11) {
                    int var13 = this.field814[255 & (this.field808 > var11 ? var11 : -this.field808 + var11)] & 255;
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = 2 * (this.field814[var13 + (~var14 <= ~this.field822 ? -this.field822 + var14 : var14) & 255] & 255);
                        int var28 = var15 + 1;
                        int var16 = var8 - (this.field819[var15] + (var14 << 12));
                        int var17 = -(var11 << 12) + -this.field819[var28] + var4;
                        int var18 = this.field825;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (var16 < 0 ? -var16 : var16) - -(var17 >= 0 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 >= 0 ? var17 : -var17;
                                int var26 = ~var16 > -1 ? -var16 : var16;
                                var19 = ~var25 <= ~var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~class344.field4676 >= ~var19) {
                            if (class146.field1717 > var19) {
                                class387.field5288 = class382.field5233;
                                class382.field5233 = class146.field1717;
                                class146.field1717 = var19;
                            } else if (~var19 <= ~class382.field5233) {
                                if (class387.field5288 > var19) {
                                    class387.field5288 = var19;
                                }
                            } else {
                                class387.field5288 = class382.field5233;
                                class382.field5233 = var19;
                            }
                        } else {
                            class387.field5288 = class382.field5233;
                            class382.field5233 = class146.field1717;
                            class146.field1717 = class344.field4676;
                            class344.field4676 = var19;
                        }
                    }
                }
                int var12 = this.field811;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = class146.field1717 - class344.field4676;
                                }
                            } else {
                                var3[var7] = class387.field5288;
                            }
                        } else {
                            var3[var7] = class382.field5233;
                        }
                    } else {
                        var3[var7] = class146.field1717;
                    }
                } else {
                    var3[var7] = class344.field4676;
                }
            }
        }
        int var27 = 27 / ((arg1 - 57) / 46);
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V", line = 246)
    private final void method393(byte arg0) {
        if (arg0 != 124) {
            this.field824 = -47;
        }
        ++field810;
        Random var2 = new Random((long) this.field821);
        this.field819 = new short[512];
        if (~this.field824 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field819[var3] = (short) class174.method1096(-20548, var2, this.field824);
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V", line = 275)
    public final void method280(int arg0) {
        ++field816;
        this.field814 = class428.method2613(this.field821, 511);
        this.method393((byte) 124);
        int var2 = 16 % ((arg0 - 28) / 63);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II[BI)I", line = 289)
    public static final int method394(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field812;
        int var4 = -1;
        int var5 = arg3;
        if (arg0 < 21) {
            field818 = 126;
        }
        while (~arg1 < ~var5) {
            var4 = var4 >>> 8 ^ class161.field1878[(var4 ^ arg2[var5]) & 255];
            ++var5;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 460)
    public class68() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 322)
    public static final String method395(String arg0, int arg1) {
        ++field827;
        int var2 = arg0.length();
        char[] var3 = new char[var2];
        if (arg1 != 29766) {
            method392((byte) 120, -128);
        }
        byte var4 = 2;
        for (int var5 = 0; ~var2 < ~var5; ++var5) {
            char var6 = arg0.charAt(var5);
            if (~var4 != -1) {
                if (~var4 == -3 || Character.isUpperCase(var6)) {
                    var6 = class223.method1360(var6, false);
                }
            } else {
                var6 = Character.toLowerCase(var6);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (~var6 != -47 && var6 != '?' && var6 != '!') {
                if (!Character.isSpaceChar(var6)) {
                    var4 = 1;
                } else if (~var4 != -3) {
                    var4 = 1;
                }
            } else {
                var4 = 2;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILbg;)V", line = 384)
    public final void method54(int arg0, int arg1, class242 arg2) {
        int var4 = -44 % ((arg1 - 52) / 61);
        ++field815;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field808 = arg2.method1563(-128);
                                }
                            } else {
                                this.field822 = arg2.method1563(-128);
                            }
                        } else {
                            this.field825 = arg2.method1563(-128);
                        }
                    } else {
                        this.field811 = arg2.method1563(-128);
                    }
                } else {
                    this.field824 = arg2.method1587((byte) -102);
                }
            } else {
                this.field821 = arg2.method1563(-128);
            }
        } else {
            this.field822 = this.field808 = arg2.method1563(-128);
        }
    }
}

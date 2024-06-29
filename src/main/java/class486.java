import java.applet.Applet;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class486 extends class739 {

    @OriginalMember(owner = "client!rt", name = "G", descriptor = "I")
    private int field7000 = 2048;

    @OriginalMember(owner = "client!rt", name = "A", descriptor = "[B")
    private byte[] field6995 = new byte[512];

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "I")
    private int field6994 = 0;

    @OriginalMember(owner = "client!rt", name = "H", descriptor = "I")
    private int field7001 = 2;

    @OriginalMember(owner = "client!rt", name = "Q", descriptor = "I")
    private int field7009 = 5;

    @OriginalMember(owner = "client!rt", name = "M", descriptor = "[S")
    private short[] field7006 = new short[512];

    @OriginalMember(owner = "client!rt", name = "D", descriptor = "I")
    private int field6998 = 5;

    @OriginalMember(owner = "client!rt", name = "S", descriptor = "I")
    private int field7011 = 1;

    @OriginalMember(owner = "client!rt", name = "J", descriptor = "[Z")
    public static boolean[] field7003 = new boolean[100];

    @OriginalMember(owner = "client!rt", name = "K", descriptor = "Z")
    public static boolean field7004 = false;

    @OriginalMember(owner = "client!rt", name = "B", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!rt", name = "C", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!rt", name = "I", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!rt", name = "L", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!rt", name = "O", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!rt", name = "P", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!rt", name = "R", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!rt", name = "E", descriptor = "Ljava/applet/Applet;")
    public static Applet field6999;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V")
    private final void method2964(byte arg0) {
        ++field6997;
        Random var2 = new Random((long) this.field6994);
        if (arg0 != -42) {
            field6999 = null;
        }
        this.field7006 = new short[512];
        if (this.field7000 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field7006[var3] = (short) class151.method1094(var2, 4, this.field7000);
            }
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZI)[I")
    public final int[] method445(boolean arg0, int arg1) {
        ++field7008;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (arg0) {
            this.field7006 = null;
        }
        if (super.field10317.field2170) {
            int var4 = class19.field185[arg1] * this.field6998 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~class399.field5703 < ~var7; ++var7) {
                class152.field2221 = Integer.MAX_VALUE;
                class583.field8316 = Integer.MAX_VALUE;
                class227.field3389 = Integer.MAX_VALUE;
                class193.field2833 = Integer.MAX_VALUE;
                int var8 = class604.field8580[var7] * this.field7009 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = this.field6995[(~var11 <= ~this.field6998 ? -this.field6998 + var11 : var11) & 255] & 255;
                    for (int var14 = var9 - 1; var10 >= var14; ++var14) {
                        int var15 = 2 * (255 & this.field6995[255 & (var14 >= this.field7009 ? -this.field7009 + var14 : var14) + var13]);
                        int var27 = var15 + 1;
                        int var16 = -this.field7006[var15] + -(var14 << 12) + var8;
                        int var17 = -this.field7006[var27] + var4 + -(var11 << 12);
                        int var18 = this.field7011;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (~var17 > -1 ? -var17 : var17) + (var16 >= 0 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 >= 0 ? var17 : -var17;
                                int var26 = ~var16 > -1 ? -var16 : var16;
                                var19 = ~var26 < ~var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~var19 > ~class193.field2833) {
                            class152.field2221 = class583.field8316;
                            class583.field8316 = class227.field3389;
                            class227.field3389 = class193.field2833;
                            class193.field2833 = var19;
                        } else if (class227.field3389 <= var19) {
                            if (~var19 > ~class583.field8316) {
                                class152.field2221 = class583.field8316;
                                class583.field8316 = var19;
                            } else if (var19 < class152.field2221) {
                                class152.field2221 = var19;
                            }
                        } else {
                            class152.field2221 = class583.field8316;
                            class583.field8316 = class227.field3389;
                            class227.field3389 = var19;
                        }
                    }
                }
                int var12 = this.field7001;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = -class193.field2833 + class227.field3389;
                                }
                            } else {
                                var3[var7] = class152.field2221;
                            }
                        } else {
                            var3[var7] = class583.field8316;
                        }
                    } else {
                        var3[var7] = class227.field3389;
                    }
                } else {
                    var3[var7] = class193.field2833;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field6998 = arg0.method2886(true);
                                }
                            } else {
                                this.field7009 = arg0.method2886(true);
                            }
                        } else {
                            this.field7011 = arg0.method2886(true);
                        }
                    } else {
                        this.field7001 = arg0.method2886(true);
                    }
                } else {
                    this.field7000 = arg0.method2882(-1);
                }
            } else {
                this.field6994 = arg0.method2886(true);
            }
        } else {
            this.field7009 = this.field6998 = arg0.method2886(true);
        }
        ++field7007;
        if (arg2 != 1) {
            method2966((byte) 90);
        }
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "()V")
    public class486() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "([[[Ldn;I)V")
    public static final void method2965(class375[][][] arg0, int arg1) {
        for (int var2 = 0; ~var2 > ~arg0.length; ++var2) {
            class375[][] var4 = arg0[var2];
            for (int var5 = 0; ~var4.length < ~var5; ++var5) {
                for (int var6 = 0; var4[var5].length > var6; ++var6) {
                    class375 var7 = var4[var5][var6];
                    if (var7 != null) {
                        if (var7.field5422 instanceof class324) {
                            ((class324) var7.field5422).method598((byte) -112);
                        }
                        if (var7.field5428 instanceof class324) {
                            ((class324) var7.field5428).method598((byte) -34);
                        }
                        if (var7.field5424 instanceof class324) {
                            ((class324) var7.field5424).method598((byte) -25);
                        }
                        if (var7.field5431 instanceof class324) {
                            ((class324) var7.field5431).method598((byte) -105);
                        }
                        if (var7.field5427 instanceof class324) {
                            ((class324) var7.field5427).method598((byte) -99);
                        }
                        for (class208 var8 = var7.field5425; var8 != null; var8 = var8.field3146) {
                            class638 var9 = var8.field3144;
                            if (var9 instanceof class324) {
                                ((class324) var9).method598((byte) -56);
                            }
                        }
                    }
                }
            }
        }
        ++field7010;
        int var3 = 53 % (arg1 / 47);
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V")
    public final void method628(int arg0) {
        ++field7002;
        this.field6995 = class297.method1853(this.field6994, 123);
        if (arg0 > 53) {
            this.method2964((byte) -42);
        }
    }

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "(B)V")
    public static final void method2966(byte arg0) {
        int var1 = 39 % ((arg0 - -6) / 43);
        ++field6996;
        class169.field2396.method1460(-86);
        for (int var2 = 0; var2 < 32; ++var2) {
            class390.field5619[var2] = 0L;
        }
        for (int var3 = 0; ~var3 > -33; ++var3) {
            class548.field7952[var3] = 0L;
        }
        class257.field3683 = 0;
    }

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "(B)V")
    public static void method2967(byte arg0) {
        if (arg0 <= 32) {
            method2966((byte) 51);
        }
        field7003 = null;
        field6999 = null;
    }
}

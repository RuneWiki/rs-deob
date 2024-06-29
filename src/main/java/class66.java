import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class66 extends class601 {

    @OriginalMember(owner = "client!hia", name = "D", descriptor = "I")
    private int field809 = 5;

    @OriginalMember(owner = "client!hia", name = "F", descriptor = "I")
    private int field811 = 2;

    @OriginalMember(owner = "client!hia", name = "H", descriptor = "I")
    private int field813 = 2048;

    @OriginalMember(owner = "client!hia", name = "J", descriptor = "I")
    private int field815 = 0;

    @OriginalMember(owner = "client!hia", name = "I", descriptor = "I")
    private int field814 = 5;

    @OriginalMember(owner = "client!hia", name = "E", descriptor = "[S")
    private short[] field810 = new short[512];

    @OriginalMember(owner = "client!hia", name = "M", descriptor = "[B")
    private byte[] field818 = new byte[512];

    @OriginalMember(owner = "client!hia", name = "C", descriptor = "I")
    private int field808 = 1;

    @OriginalMember(owner = "client!hia", name = "Q", descriptor = "Lkaa;")
    public static class47 field822 = new class47(60, -1);

    @OriginalMember(owner = "client!hia", name = "R", descriptor = "I")
    public static int field823 = 0;

    @OriginalMember(owner = "client!hia", name = "S", descriptor = "I")
    public static int field824 = 0;

    @OriginalMember(owner = "client!hia", name = "T", descriptor = "Lqr;")
    public static class65 field825 = new class65(5);

    @OriginalMember(owner = "client!hia", name = "V", descriptor = "[I")
    public static int[] field827 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!hia", name = "G", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!hia", name = "K", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!hia", name = "L", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!hia", name = "N", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!hia", name = "O", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!hia", name = "P", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!hia", name = "W", descriptor = "Lkk;")
    public static class192 field828;

    @OriginalMember(owner = "client!hia", name = "U", descriptor = "Lu;")
    public static class74 field826;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(Lee;BI)V")
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field814 = arg0.method3821((byte) 83);
                                }
                            } else {
                                this.field809 = arg0.method3821((byte) 124);
                            }
                        } else {
                            this.field808 = arg0.method3821((byte) 100);
                        }
                    } else {
                        this.field811 = arg0.method3821((byte) 90);
                    }
                } else {
                    this.field813 = arg0.method3807(-1);
                }
            } else {
                this.field815 = arg0.method3821((byte) 110);
            }
        } else {
            this.field809 = this.field814 = arg0.method3821((byte) 111);
        }
        if (arg1 != -61) {
            field823 = -28;
        }
        ++field819;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        this.field818 = class737.method4115(this.field815, 83);
        ++field812;
        if (arg0 == 8351) {
            this.method567((byte) 96);
        }
    }

    @OriginalMember(owner = "client!hia", name = "d", descriptor = "(Z)V")
    public static void method565(boolean arg0) {
        if (arg0) {
            field827 = null;
        }
        field822 = null;
        field826 = null;
        field825 = null;
        field827 = null;
        field828 = null;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(II)V")
    public static final void method566(int arg0, int arg1) {
        ++field821;
        if (class15.field215 != arg0) {
            if (~arg0 == -14) {
                if (class677.field9393 == null) {
                    class625.method3436(class371.field5166, class416.field5739, 102, class758.field10539);
                } else {
                    class275.method1651(arg1 + 21070, class758.field10539);
                }
            }
            if (arg0 != 13 && class459.field6276 != null) {
                class459.field6276.method1439(-1);
                class459.field6276 = null;
            }
            if (~arg0 == -4) {
                class702.method3951(arg1 + 20997, ~class443.field6101 != ~class226.field3226);
            }
            if (arg1 == -21035) {
                if (~arg0 == -8) {
                    class85.method655((byte) 84, class555.field7299 != class443.field6101);
                }
                if (~arg0 != -6) {
                    if (~arg0 == -7) {
                        if (class677.field9393 == null) {
                            class625.method3436(class371.field5166, class416.field5739, 126, class758.field10539);
                        } else {
                            class275.method1651(35, class758.field10539);
                        }
                    } else if (~arg0 == -10) {
                        if (class677.field9393 == null) {
                            class625.method3436(class371.field5166, class416.field5739, 107, class758.field10539);
                        } else {
                            class275.method1651(arg1 + 21070, class758.field10539);
                        }
                    } else if (arg0 == 12) {
                        if (class677.field9393 != null) {
                            class360.method2136((byte) -109);
                        } else {
                            class313.method1916(class371.field5166, (byte) 26, class416.field5739);
                        }
                    }
                } else if (class677.field9393 == null) {
                    class313.method1916(class371.field5166, (byte) 26, class416.field5739);
                } else {
                    class360.method2136((byte) -65);
                }
                if (class608.method3313(-118, class15.field215)) {
                    class622.field8296.field5225 = 2;
                    class352.field4951.field5225 = 2;
                    class654.field8670.field5225 = 2;
                    class324.field4602.field5225 = 2;
                    class254.field3491.field5225 = 2;
                    class187.field2825.field5225 = 2;
                    class423.field5827.field5225 = 2;
                }
                if (class608.method3313(-94, arg0)) {
                    class440.field6075 = 1;
                    class708.field9799 = 1;
                    class74.field902 = 0;
                    class613.field8162 = 0;
                    class582.field7631 = 0;
                    class26.method249(true, (byte) -123);
                    class622.field8296.field5225 = 1;
                    class352.field4951.field5225 = 1;
                    class654.field8670.field5225 = 1;
                    class324.field4602.field5225 = 1;
                    class254.field3491.field5225 = 1;
                    class187.field2825.field5225 = 1;
                    class423.field5827.field5225 = 1;
                }
                if (~arg0 == -12 || ~arg0 == -4) {
                    class742.method4133(23159);
                }
                boolean var2 = ~arg0 == -3 || class745.method4176(arg1 + 21029, arg0) || class239.method1501((byte) -14, arg0);
                boolean var3 = class15.field215 == 2 || class745.method4176(-6, class15.field215) || class239.method1501((byte) -14, class15.field215);
                if (!var3 != !var2) {
                    if (!var2) {
                        class284.method1763(2, (byte) -57);
                        class448.field6137.method2086((byte) 115, true);
                    } else {
                        class453.field6192 = class450.field6169;
                        if (class411.field5711.field3917.method2432(true) != 0) {
                            class372.method2182(0, class411.field5711.field3917.method2432(true), 2, false, (byte) -34, class450.field6169, class165.field2501);
                            class390.method2314(false);
                        } else {
                            class284.method1763(2, (byte) -127);
                        }
                        class448.field6137.method2086((byte) 110, false);
                    }
                }
                if (class608.method3313(-53, arg0) || ~arg0 == -14) {
                    class341.field4807.method431();
                }
                class15.field215 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(B)V")
    private final void method567(byte arg0) {
        ++field817;
        if (arg0 >= 87) {
            Random var2 = new Random((long) this.field815);
            this.field810 = new short[512];
            if (this.field813 > 0) {
                for (int var3 = 0; var3 < 512; ++var3) {
                    this.field810[var3] = (short) class309.method1906(this.field813, -1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(BI)[I")
    public final int[] method5(byte arg0, int arg1) {
        ++field816;
        if (arg0 != -40) {
            field826 = null;
        }
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            int var4 = class250.field3446[arg1] * this.field814 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~class171.field2624 < ~var7; ++var7) {
                class536.field7064 = Integer.MAX_VALUE;
                class24.field414 = Integer.MAX_VALUE;
                class271.field3788 = Integer.MAX_VALUE;
                class351.field4934 = Integer.MAX_VALUE;
                int var8 = class453.field6186[var7] * this.field809 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = 255 & this.field818[(var11 < this.field814 ? var11 : -this.field814 + var11) & 255];
                    for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                        int var15 = (255 & this.field818[var13 + (~var14 > ~this.field809 ? var14 : -this.field809 + var14) & 255]) * 2;
                        int var27 = var15 + 1;
                        int var16 = var8 - (this.field810[var15] - -(var14 << 12));
                        int var17 = -(var11 << 12) + -this.field810[var27] + var4;
                        int var18 = this.field808;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (~var17 > -1 ? -var17 : var17) + (~var16 <= -1 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 < 0 ? -var17 : var17;
                                int var26 = var16 >= 0 ? var16 : -var16;
                                var19 = ~var26 >= ~var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class351.field4934 <= var19) {
                            if (var19 < class271.field3788) {
                                class536.field7064 = class24.field414;
                                class24.field414 = class271.field3788;
                                class271.field3788 = var19;
                            } else if (class24.field414 <= var19) {
                                if (~var19 > ~class536.field7064) {
                                    class536.field7064 = var19;
                                }
                            } else {
                                class536.field7064 = class24.field414;
                                class24.field414 = var19;
                            }
                        } else {
                            class536.field7064 = class24.field414;
                            class24.field414 = class271.field3788;
                            class271.field3788 = class351.field4934;
                            class351.field4934 = var19;
                        }
                    }
                }
                int var12 = this.field811;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class351.field4934 + class271.field3788;
                                }
                            } else {
                                var3[var7] = class536.field7064;
                            }
                        } else {
                            var3[var7] = class24.field414;
                        }
                    } else {
                        var3[var7] = class271.field3788;
                    }
                } else {
                    var3[var7] = class351.field4934;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hia", name = "e", descriptor = "(I)V")
    public static final void method568(int arg0) {
        ++field820;
        if (arg0 == 881726188) {
            if (class597.field7823 == 5) {
                class597.field7823 = 6;
            }
        }
    }

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "()V")
    public class66() {
        super(0, true);
    }
}

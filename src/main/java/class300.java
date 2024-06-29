import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class300 extends class182 {

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
    private int field4894 = 5;

    @OriginalMember(owner = "client!oc", name = "gb", descriptor = "I")
    private int field4903 = 0;

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "I")
    private int field4898 = 5;

    @OriginalMember(owner = "client!oc", name = "kb", descriptor = "[S")
    private short[] field4907 = new short[512];

    @OriginalMember(owner = "client!oc", name = "lb", descriptor = "I")
    private int field4908 = 2;

    @OriginalMember(owner = "client!oc", name = "ib", descriptor = "I")
    private int field4905 = 1;

    @OriginalMember(owner = "client!oc", name = "jb", descriptor = "[B")
    private byte[] field4906 = new byte[512];

    @OriginalMember(owner = "client!oc", name = "ob", descriptor = "I")
    private int field4911 = 2048;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    public static int field4893 = 50;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "[I")
    public static int[] field4888 = new int[field4893];

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "[I")
    public static int[] field4891 = new int[14];

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "[I")
    public static int[] field4887 = new int[field4893];

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "[I")
    public static int[] field4892 = new int[field4893];

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "[I")
    public static int[] field4885 = new int[field4893];

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "[I")
    public static int[] field4890 = new int[field4893];

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "[I")
    public static int[] field4897 = new int[field4893];

    @OriginalMember(owner = "client!oc", name = "fb", descriptor = "[Ljava/lang/String;")
    public static String[] field4902 = new String[field4893];

    @OriginalMember(owner = "client!oc", name = "nb", descriptor = "[I")
    public static int[] field4910 = new int[field4893];

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "I")
    public static int field4899 = 0;

    @OriginalMember(owner = "client!oc", name = "hb", descriptor = "Lbb;")
    public static class49 field4904 = new class49();

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!oc", name = "db", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!oc", name = "mb", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!oc", name = "eb", descriptor = "[Lhg;")
    public static class207[] field4901;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "(I)V")
    public static void method2052(int arg0) {
        field4885 = null;
        field4910 = null;
        field4892 = null;
        field4888 = null;
        field4902 = null;
        field4897 = null;
        field4890 = null;
        field4904 = null;
        field4891 = null;
        field4901 = null;
        field4887 = null;
        if (arg0 != 2048) {
            field4902 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Luk;")
    public static final class87 method2053(int arg0, int arg1) {
        ++field4896;
        class87 var2 = (class87) class90.field1496.method252((long) arg1, false);
        if (var2 != null) {
            return var2;
        } else {
            if (arg0 != -23029) {
                method2052(42);
            }
            byte[] var3 = class32.field528.method1149(arg1, (byte) 93, 0);
            if (var3 != null && var3.length > 1) {
                class87 var4 = class127.method940((byte) -115, var3);
                class90.field1496.method247(var4, (long) arg1, 107);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        if (arg0) {
            method2055((byte) -101);
        }
        ++field4889;
        int[] var3 = super.field2911.method77(arg1, -113);
        if (super.field2911.field287) {
            int var4 = 2048 - -(class66.field1112[arg1] * this.field4898);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class4.field116; ++var7) {
                class268.field4457 = Integer.MAX_VALUE;
                class126.field2110 = Integer.MAX_VALUE;
                class232.field3928 = Integer.MAX_VALUE;
                class302.field4926 = Integer.MAX_VALUE;
                int var8 = class207.field3415[var7] * this.field4894 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = this.field4906[255 & (var11 >= this.field4898 ? -this.field4898 + var11 : var11)] & 255;
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = 2 * (255 & this.field4906[(var14 < this.field4894 ? var14 : var14 - this.field4894) + var13 & 255]);
                        int var10001 = var14 << 12;
                        int var27 = var15 + 1;
                        int var16 = var8 - (var10001 + this.field4907[var15]);
                        int var17 = -(var11 << 12) - (this.field4907[var27] - var4);
                        int var18 = this.field4905;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (var17 >= 0 ? var17 : -var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 <= -1 ? var16 : -var16;
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                var19 = ~var25 >= ~var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class302.field4926 > var19) {
                            class268.field4457 = class126.field2110;
                            class126.field2110 = class232.field3928;
                            class232.field3928 = class302.field4926;
                            class302.field4926 = var19;
                        } else if (~var19 > ~class232.field3928) {
                            class268.field4457 = class126.field2110;
                            class126.field2110 = class232.field3928;
                            class232.field3928 = var19;
                        } else if (~var19 <= ~class126.field2110) {
                            if (~class268.field4457 < ~var19) {
                                class268.field4457 = var19;
                            }
                        } else {
                            class268.field4457 = class126.field2110;
                            class126.field2110 = var19;
                        }
                    }
                }
                int var12 = this.field4908;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = -class302.field4926 + class232.field3928;
                                }
                            } else {
                                var3[var7] = class268.field4457;
                            }
                        } else {
                            var3[var7] = class126.field2110;
                        }
                    } else {
                        var3[var7] = class232.field3928;
                    }
                } else {
                    var3[var7] = class302.field4926;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class300() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    private final void method2054(byte arg0) {
        ++field4909;
        Random var2 = new Random((long) this.field4903);
        this.field4907 = new short[512];
        int var3 = 23 % ((arg0 - 63) / 32);
        if (this.field4911 > 0) {
            for (int var4 = 0; ~var4 > -513; ++var4) {
                this.field4907[var4] = (short) class32.method205(this.field4911, (byte) 90, var2);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V")
    public final void method469(int arg0) {
        this.field4906 = class31.method196(100, this.field4903);
        ++field4895;
        if (arg0 != -1) {
            this.method153(false, 2);
        }
        this.method2054((byte) 119);
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V")
    public static final void method2055(byte arg0) {
        class206.field3323.method94(34);
        ++field4886;
        if (arg0 > -117) {
            method2055((byte) 81);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (!arg0) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 != 2) {
                        if (arg2 != 3) {
                            if (arg2 != 4) {
                                if (~arg2 != -6) {
                                    if (arg2 == 6) {
                                        this.field4898 = arg1.method1802((byte) -89);
                                    }
                                } else {
                                    this.field4894 = arg1.method1802((byte) 85);
                                }
                            } else {
                                this.field4905 = arg1.method1802((byte) 83);
                            }
                        } else {
                            this.field4908 = arg1.method1802((byte) 75);
                        }
                    } else {
                        this.field4911 = arg1.method1821((byte) 51);
                    }
                } else {
                    this.field4903 = arg1.method1802((byte) -96);
                }
            } else {
                this.field4894 = this.field4898 = arg1.method1802((byte) -103);
            }
            ++field4900;
        }
    }
}

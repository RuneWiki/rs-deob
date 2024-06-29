import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class166 extends class272 {

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
    public static int field3097 = 0;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "I")
    public static int field3104 = 0;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "Lli;")
    private static class185 field3098 = class245.method1649("Connection lost)3", -96);

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "Lli;")
    public static class185 field3095 = class245.method1649("cyan:", -79);

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "Lli;")
    public static class185 field3099 = field3098;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBI)V")
    private final void method1183(int arg0, byte arg1, int arg2) {
        ++field3102;
        if (arg1 != -45) {
            this.method32(118, (byte) -124);
        }
        int var4 = class232.field4177[arg2];
        int var5 = class38.field598[arg0];
        float var6 = (float) Math.atan2((double) (var5 + -2048), (double) (var4 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class48.field788 = arg2;
            class23.field377 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class48.field788 = arg0;
            class23.field377 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class48.field788 = arg0;
            class23.field377 = -arg2 + class246.field4385;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class23.field377 = arg0;
            class48.field788 = -arg2 + class13.field235;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class48.field788 = -arg2 + class13.field235;
            class23.field377 = class246.field4385 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class23.field377 = -arg2 + class246.field4385;
            class48.field788 = -arg0 + class13.field235;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class48.field788 = class13.field235 - arg0;
            class23.field377 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class48.field788 = arg2;
            class23.field377 = -arg0 + class246.field4385;
        }
        class23.field377 &= class59.field1037;
        class48.field788 &= class99.field1826;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class166() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)V")
    public static void method1184(int arg0) {
        field3099 = null;
        if (arg0 != 10468) {
            field3099 = null;
        }
        field3095 = null;
        field3098 = null;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        int[][] var3 = super.field4818.method1514(-2, arg0);
        int var4 = -107 % ((arg1 - -60) / 45);
        ++field3101;
        if (super.field4818.field3954) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class246.field4385 < ~var8; ++var8) {
                this.method1183(var8, (byte) -45, arg0);
                int[][] var9 = this.method1860(class48.field788, 3, 0);
                var5[var8] = var9[0][class23.field377];
                var6[var8] = var9[1][class23.field377];
                var7[var8] = var9[2][class23.field377];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field3092;
        if (arg1 != 4421) {
            field3099 = null;
        }
        int[] var3 = super.field4819.method1632(0, arg0);
        if (super.field4819.field4294) {
            for (int var4 = 0; class246.field4385 > var4; ++var4) {
                this.method1183(var4, (byte) -45, arg0);
                int[] var5 = this.method1866(class48.field788, 0, 86);
                var3[var4] = var5[class23.field377];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            super.field4832 = ~arg0.method867(false) == -2;
        }
        ++field3094;
        int var4 = -105 / ((arg1 - -21) / 55);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIII)V")
    public static final void method1185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 == -24025) {
            int var6 = arg1 - arg4;
            int var7 = -arg0 + arg5;
            ++field3093;
            if (~var6 != -1) {
                if (var7 == 0) {
                    class45.method279((byte) 80, arg4, arg0, arg3, arg1);
                } else {
                    int var8 = (var7 << 12) / var6;
                    int var9 = -(arg4 * var8 >> 12) + arg0;
                    int var10;
                    int var11;
                    if (~class207.field3810 < ~arg1) {
                        var10 = class207.field3810;
                        var11 = (class207.field3810 * var8 >> 12) + var9;
                    } else if (~arg1 >= ~class66.field1163) {
                        var11 = arg5;
                        var10 = arg1;
                    } else {
                        var10 = class66.field1163;
                        var11 = (class66.field1163 * var8 >> 12) + var9;
                    }
                    if (~var11 > ~class216.field3964) {
                        var11 = class216.field3964;
                        var10 = (-var9 + class216.field3964 << 12) / var8;
                    } else if (class113.field2040 < var11) {
                        var11 = class113.field2040;
                        var10 = (-var9 + class113.field2040 << 12) / var8;
                    }
                    int var12;
                    int var13;
                    if (arg4 < class207.field3810) {
                        var12 = (class207.field3810 * var8 >> 12) + var9;
                        var13 = class207.field3810;
                    } else if (arg4 <= class66.field1163) {
                        var13 = arg4;
                        var12 = arg0;
                    } else {
                        var12 = (class66.field1163 * var8 >> 12) + var9;
                        var13 = class66.field1163;
                    }
                    if (class216.field3964 <= var12) {
                        if (~class113.field2040 > ~var12) {
                            var13 = (-var9 + class113.field2040 << 12) / var8;
                            var12 = class113.field2040;
                        }
                    } else {
                        var13 = (class216.field3964 - var9 << 12) / var8;
                        var12 = class216.field3964;
                    }
                    class36.method224(var10, arg3, var11, 0, var12, var13);
                }
            } else {
                if (~var7 != -1) {
                    class180.method1275(arg4, arg3, arg2 ^ -23937, arg5, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)V")
    public static final void method1186(int arg0) {
        ++field3096;
        class165.field3078.method86(arg0);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)Llf;")
    public static final class105 method1187(int arg0, int arg1) {
        ++field3100;
        class105 var2 = (class105) class242.field4325.method82(127, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            if (arg1 != 18553) {
                method1184(77);
            }
            class105 var3 = class73.method473(class47.field769, false, 65280, class123.field2227, arg0);
            if (var3 != null) {
                class242.field4325.method84(102, (long) arg0, var3);
            }
            return var3;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class555 extends class38 {

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
    private int field7920 = 8192;

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
    private int field7927 = 12288;

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
    private int field7926 = 0;

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "I")
    private int field7925 = 0;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
    private int field7921 = 2048;

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
    private int field7928 = 4096;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
    private int field7934 = 2048;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "Loo;")
    public static class629 field7931 = new class629(9, 7);

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "Lwl;")
    public static class410 field7933 = new class410();

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "Lqg;")
    public static class464 field7936 = new class464("runescape", 0);

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "I")
    public static int field7930;

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "I")
    public static int field7935;

    @OriginalMember(owner = "client!ii", name = "W", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "Lvd;")
    public static class39 field7932;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IILrg;)V")
    public final void method190(int arg0, int arg1, class645 arg2) {
        ++field7935;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field7920 = arg2.method3712((byte) -109);
                                }
                            } else {
                                this.field7928 = arg2.method3712((byte) 119);
                            }
                        } else {
                            this.field7927 = arg2.method3712((byte) -124);
                        }
                    } else {
                        this.field7921 = arg2.method3712((byte) 85);
                    }
                } else {
                    this.field7926 = arg2.method3712((byte) 2);
                }
            } else {
                this.field7925 = arg2.method3712((byte) -106);
            }
        } else {
            this.field7934 = arg2.method3712((byte) 69);
        }
        if (arg0 < 34) {
            this.field7927 = -71;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([Lsca;II)V")
    public static final void method3239(class46[] arg0, int arg1, int arg2) {
        int var3 = -50 % ((80 - arg1) / 37);
        for (int var4 = 0; ~arg0.length < ~var4; ++var4) {
            class46 var5 = arg0[var4];
            if (var5 != null) {
                if (~var5.field577 == -1) {
                    if (var5.field621 != null) {
                        method3239(var5.field621, 119, arg2);
                    }
                    class421 var6 = (class421) class291.field4168.method2287((long) var5.field610, (byte) -117);
                    if (var6 != null) {
                        class127.method894(var6.field6282, arg2, 8558);
                    }
                }
                if (~arg2 == -1 && var5.field646 != null) {
                    class177 var7 = new class177();
                    var7.field2743 = var5;
                    var7.field2737 = var5.field646;
                    class709.method4025(var7);
                }
                if (arg2 == 1 && var5.field543 != null) {
                    if (var5.field603 >= 0) {
                        class46 var8 = class405.method2580(var5.field610, -95);
                        if (var8 == null || var8.field621 == null || ~var8.field621.length >= ~var5.field603 || var8.field621[var5.field603] != var5) {
                            continue;
                        }
                    }
                    class177 var9 = new class177();
                    var9.field2737 = var5.field543;
                    var9.field2743 = var5;
                    class709.method4025(var9);
                }
            }
        }
        ++field7924;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(III)Z")
    private final boolean method3240(int arg0, int arg1, int arg2) {
        ++field7919;
        if (arg0 < 70) {
            return false;
        } else {
            int var4 = (arg1 + arg2) * this.field7927 >> 12;
            int var5 = class89.field1268[(1045978 & var4 * 255) >> 12];
            int var6 = (var5 << 12) / this.field7927;
            int var7 = (var6 << 12) / this.field7920;
            int var8 = this.field7928 * var7 >> 12;
            return ~(arg1 - arg2) > ~var8 && -arg2 + arg1 > -var8;
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(III)Z")
    private final boolean method3241(int arg0, int arg1, int arg2) {
        ++field7923;
        int var4 = (arg1 - arg0) * this.field7927 >> 12;
        if (arg2 != -4096) {
            field7932 = null;
        }
        int var5 = class89.field1268[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field7927;
        int var7 = (var6 << 12) / this.field7920;
        int var8 = this.field7928 * var7 >> 12;
        return arg0 - -arg1 < var8 && ~(arg0 + arg1) < ~(-var8);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
    public static void method3242(int arg0) {
        field7936 = null;
        int var1 = 54 / ((arg0 - -38) / 39);
        field7931 = null;
        field7932 = null;
        field7933 = null;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class555() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public final void method191(byte arg0) {
        class417.method2634((byte) -118);
        ++field7929;
        if (arg0 <= 120) {
            this.method199((byte) 46, -118);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)[I")
    public final int[] method199(byte arg0, int arg1) {
        ++field7922;
        if (arg0 >= -43) {
            return null;
        } else {
            int[] var3 = super.field397.method1376(arg1, (byte) -101);
            if (super.field397.field3005) {
                int var4 = class136.field1816[arg1] + -2048;
                for (int var5 = 0; ~class729.field10216 < ~var5; ++var5) {
                    int var6 = class255.field3666[var5] + -2048;
                    int var7 = this.field7934 + var6;
                    int var8 = ~var7 > 2047 ? var7 - -4096 : var7;
                    int var9 = var8 <= 2048 ? var8 : var8 + -4096;
                    int var10 = this.field7925 + var4;
                    int var11 = ~var10 <= 2047 ? var10 : var10 + 4096;
                    int var12 = var11 > 2048 ? var11 + -4096 : var11;
                    int var13 = var6 - -this.field7926;
                    int var14 = ~var13 <= 2047 ? var13 : var13 + 4096;
                    int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                    int var16 = this.field7921 + var4;
                    int var17 = var16 < -2048 ? var16 + 4096 : var16;
                    int var18 = var17 > 2048 ? var17 + -4096 : var17;
                    var3[var5] = !this.method3241(var9, var12, -4096) && !this.method3240(77, var18, var15) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Z")
    public static final boolean method3243(int arg0, int arg1) {
        int var2 = -1 % ((18 - arg1) / 50);
        ++field7930;
        return arg0 == 2 || ~arg0 == -4;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class466 extends class352 implements class105 {

    @OriginalMember(owner = "client!og", name = "z", descriptor = "I")
    private int field6951;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field6946 = new String[200];

    @OriginalMember(owner = "client!og", name = "v", descriptor = "Ljava/lang/String;")
    public static String field6947 = null;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "Lga;")
    public static class282 field6949 = null;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "[I")
    public static int[] field6948 = new int[50];

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "I")
    public static int field6950;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "[[I")
    public static int[][] field6955;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static final void method2801(byte arg0) {
        class456.field6845.method829(((float) class203.field2716.field1166 * 0.1F + 0.7F) * class491.field7254);
        if (arg0 == 55) {
            ++field6941;
            class456.field6845.method759(class146.field1936, class11.field203, class177.field2361, (float) (class511.field7509 << 0), (float) (class49.field703 << 0), (float) (class459.field6882 << 0));
            class456.field6845.method799(class496.field7321);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)J")
    public final long method676(boolean arg0) {
        ++field6950;
        if (arg0) {
            this.method676(true);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(Z)V")
    public static final void method2802(boolean arg0) {
        ++field6954;
        int var1 = class20.field310;
        int[] var2 = class55.field778;
        if (arg0) {
            field6946 = null;
        }
        for (int var3 = 0; ~var3 > ~var1; ++var3) {
            class96 var9 = class241.field3398[var2[var3]];
            if (var9 != null && var9.field3879 > 0) {
                --var9.field3879;
                if (~var9.field3879 == -1) {
                    var9.field3862 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class333.field5187; ++var4) {
            long var5 = (long) class224.field3114[var4];
            class24 var7 = (class24) class406.field6158.method1747(var5, false);
            if (var7 != null) {
                class17 var8 = var7.field348;
                if (~var8.field3879 < -1) {
                    --var8.field3879;
                    if (~var8.field3879 == -1) {
                        var8.field3862 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI[BI)V")
    public final void method675(byte arg0, int arg1, byte[] arg2, int arg3) {
        this.method2263(arg2, arg1, 35044);
        ++field6952;
        this.field6951 = arg3;
        int var5 = 127 % ((-24 - arg0) / 33);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lnq;I[BIZ)V")
    public class466(class325 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field6951 = arg1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)I")
    public final int method674(boolean arg0) {
        ++field6943;
        return !arg0 ? 111 : this.field6951;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)I")
    public final int method677(int arg0) {
        if (arg0 != -9737) {
            field6948 = null;
        }
        ++field6945;
        return super.field5441;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method2803(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (~arg0 > -2) {
            arg0 = 1;
        }
        if (~arg4 > -2) {
            arg4 = 1;
        }
        ++field6953;
        int var6 = arg4 + -334;
        if (var6 >= 0) {
            if (var6 > 100) {
                var6 = 100;
            }
        } else {
            var6 = 0;
        }
        int var7 = class408.field6193 - -((-class408.field6193 + class187.field2515) * var6 / 100);
        if (var7 >= class99.field1455) {
            if (class283.field4165 < var7) {
                var7 = class283.field4165;
            }
        } else {
            var7 = class99.field1455;
        }
        int var8 = arg4 * var7 * 512 / (arg0 * 334);
        if (var8 < class244.field3424) {
            short var9 = class244.field3424;
            var7 = var9 * 334 * arg0 / (arg4 * 512);
            if (var7 > class283.field4165) {
                var7 = class283.field4165;
                int var10 = arg4 * var7 * 512 / (var9 * 334);
                int var11 = (arg0 - var10) / 2;
                if (arg5) {
                    class400.field6090.method753();
                    class400.field6090.method1117(arg4, arg2, -16777216, arg3, var11, (byte) 73);
                    class400.field6090.method1117(arg4, arg2, -16777216, -var11 + arg3 + arg0, var11, (byte) 73);
                }
                arg3 += var11;
                arg0 -= var11 * 2;
            }
        } else if (~var8 < ~class78.field1122) {
            short var12 = class78.field1122;
            var7 = var12 * 334 * arg0 / (arg4 * 512);
            if (class99.field1455 > var7) {
                var7 = class99.field1455;
                int var13 = var12 * 334 * arg0 / (var7 * 512);
                int var14 = (arg4 - var13) / 2;
                if (arg5) {
                    class400.field6090.method753();
                    class400.field6090.method1117(var14, arg2, -16777216, arg3, arg0, (byte) 73);
                    class400.field6090.method1117(var14, arg2 + arg4 + -var14, -16777216, arg3, arg0, (byte) 73);
                }
                arg2 += var14;
                arg4 -= var14 * 2;
            }
        }
        class178.field2381 = (short) arg4;
        class320.field4633 = arg2;
        class359.field5513 = (short) arg0;
        int var15 = 11 / ((arg1 - -45) / 46);
        class72.field997 = arg3;
        client.field2678 = arg4 * var7 / 334;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public static void method2804(int arg0) {
        field6948 = null;
        field6949 = null;
        field6947 = null;
        field6955 = null;
        field6946 = null;
        if (arg0 != 100) {
            method2801((byte) 73);
        }
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
    public final void method469(int arg0) {
        ++field6944;
        super.field5439.method2031(-25866, this);
        int var2 = 104 % ((39 - arg0) / 63);
    }
}

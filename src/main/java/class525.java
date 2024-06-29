import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class525 extends class618 {

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lcm;")
    public class679 field7121;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Llh;")
    public static class487 field7122 = new class487(62, 7);

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field7124 = -1;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field7125 = 0;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(JJ)J")
    public static long method2990(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZI)V")
    public static final void method2991(int arg0, int arg1, boolean arg2, int arg3) {
        field7120++;
        if (arg2) {
            class689 var4 = class187.field2718[arg1][arg0];
            class420.method2433(var4 == null ? class589.field8268 : var4, arg3, false);
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
    public static void method2992(int arg0) {
        field7122 = null;
        if (arg0 != 12075) {
            field7122 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method2993(boolean arg0, byte[] arg1) {
        field7117++;
        class501 var2 = new class501(arg1);
        int var3 = var2.method2874((byte) -75);
        int var4 = var2.method2840(false);
        if (!arg0) {
            method2994(null, null, false, null, null);
        }
        if (var4 < 0 || class63.field719 != 0 && class63.field719 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method2857(var8, var4, (byte) 125, 0);
            return var8;
        } else {
            int var5 = var2.method2840(false);
            if (var5 < 0 || class63.field719 != 0 && class63.field719 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class522.method2971(var6, var5, arg1, var4, 9);
            } else {
                class598 var7 = class318.field4364;
                synchronized (class318.field4364) {
                    class318.field4364.method3376(var2, var6, -2259);
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lnv;II[B)V")
    public class525(class382 arg0, int arg1, int arg2, byte[] arg3) {
        this.field7121 = arg0.method2236(class559.field7539, arg3, (byte) 97, arg2, false, arg1);
        this.field7121.method2137(false, 96, false);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lqh;[IZ[I[I)V")
    public static final void method2994(class61 arg0, int[] arg1, boolean arg2, int[] arg3, int[] arg4) {
        if (arg2) {
            field7123 = 117;
        }
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg3[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && arg0.field1794.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field1794[var9] = null;
                    } else {
                        class403 var10 = class192.field2727.method3090(105, var6);
                        int var11 = var10.field5660;
                        class133 var12 = arg0.field1794[var9];
                        if (var12 != null) {
                            if (var12.field1897 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field1794[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1898 = 0;
                                    var12.field1893 = 0;
                                    var12.field1899 = 0;
                                    var12.field1895 = var8;
                                    var12.field1896 = 1;
                                    if (!arg0.field1764) {
                                        class234.method1476(arg0, var10, 0, (byte) 7);
                                    }
                                } else if (var11 == 2) {
                                    var12.field1898 = 0;
                                }
                            } else if (var10.field5668 >= class192.field2727.method3090(-103, var12.field1897).field5668) {
                                var12 = arg0.field1794[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class133 var13 = arg0.field1794[var9] = new class133();
                            var13.field1899 = 0;
                            var13.field1898 = 0;
                            var13.field1895 = var8;
                            var13.field1897 = var6;
                            var13.field1896 = 1;
                            var13.field1893 = 0;
                            if (!arg0.field1764) {
                                class234.method1476(arg0, var10, 0, (byte) -100);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field7118++;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lnv;II[I)V")
    public class525(class382 arg0, int arg1, int arg2, int[] arg3) {
        this.field7121 = arg0.method2206(false, arg3, arg2, arg1, -12482);
        this.field7121.method2137(false, 109, false);
    }
}

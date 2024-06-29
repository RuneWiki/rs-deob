import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class399 extends class601 {

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "[I")
    public static int[] field5459 = new int[2048];

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Ldh;")
    public static class320 field5458 = new class320(92, 8);

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field5465 = 0;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "J")
    public static long field5464;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Loh;")
    public static class404 field5466;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)I")
    public final int method34(int arg0, int arg1) {
        if (arg1 != 15706) {
            return -73;
        } else {
            ++field5463;
            return 1;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lgn;)V")
    public class399(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)I")
    public final int method2441(int arg0) {
        int var2 = 51 / ((arg0 - -59) / 61);
        ++field5461;
        return super.field8565;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)V")
    public final void method40(int arg0, boolean arg1) {
        super.field8565 = arg0;
        ++field5460;
        if (arg1) {
            method2444((class504) null, (byte) -88);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BJ)V")
    public static final void method2442(byte arg0, long arg1) {
        ++field5462;
        int var3 = class591.field8338 + class90.field937.field4635;
        int var4 = class52.field547 + class90.field937.field4629;
        if (~(class496.field7015 - var3) > 1999 || ~(class496.field7015 - var3) < -2001 || ~(-var4 + class559.field7986) > 1999 || -var4 + class559.field7986 > 2000) {
            class559.field7986 = var4;
            class496.field7015 = var3;
        }
        if (~class496.field7015 != ~var3) {
            int var5 = -class496.field7015 + var3;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (~var5 >= -1) {
                if (var6 != 0) {
                    if (var6 < var5) {
                        var6 = var5;
                    }
                } else {
                    var6 = -1;
                }
            } else if (~var6 != -1) {
                if (var6 > var5) {
                    var6 = var5;
                }
            } else {
                var6 = 1;
            }
            class496.field7015 += var6;
        }
        class308.field3835 += (float) arg1 * class319.field4068 / 6.0F;
        if (arg0 != -81) {
            field5466 = null;
        }
        if (~class559.field7986 != ~var4) {
            int var7 = -class559.field7986 + var4;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (~var7 < -1) {
                if (~var8 != -1) {
                    if (~var7 > ~var8) {
                        var8 = var7;
                    }
                } else {
                    var8 = 1;
                }
            } else if (~var8 == -1) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class559.field7986 += var8;
        }
        class227.field2590 += (float) arg1 * class144.field1602 / 6.0F;
        class472.method2850(1536);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)I")
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            method2443((byte) -87);
        }
        ++field5457;
        return 3;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(ILgn;)V")
    public class399(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public final void method35(byte arg0) {
        if (super.field8565 < 0 || super.field8565 > 4) {
            super.field8565 = this.method39((byte) -17);
        }
        if (arg0 > -37) {
            this.method39((byte) -42);
        }
        ++field5455;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
    public static void method2443(byte arg0) {
        if (arg0 == 95) {
            field5466 = null;
            field5459 = null;
            field5458 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lbda;B)V")
    public static final void method2444(class504 arg0, byte arg1) {
        ++field5456;
        if (arg1 == -27) {
            boolean var2 = false;
            if (class392.field5398 != arg0.field7167 && arg0.field7145 != -1 && ~arg0.field7132 == -1) {
                class25 var3 = class637.field9158.method1905(108, arg0.field7145);
                if (var3.field251 || ~var3.field253[arg0.field7089] > ~(arg0.field7115 + 1)) {
                    var2 = true;
                }
            } else {
                var2 = true;
            }
            if (var2) {
                int var4 = -arg0.field7141 + arg0.field7167;
                int var5 = -arg0.field7141 + class392.field5398;
                int var6 = arg0.field7172 * 512 + 256 * arg0.method1128(-1);
                int var7 = arg0.field7176 * 512 + 256 * arg0.method1128(-1);
                int var8 = arg0.field7096 * 512 - -(256 * arg0.method1128(-1));
                int var9 = arg0.field7073 * 512 - -(arg0.method1128(-1) * 256);
                arg0.field4629 = ((-var5 + var4) * var7 + var5 * var9) / var4;
                arg0.field4635 = ((var4 - var5) * var6 - -(var5 * var8)) / var4;
            }
            arg0.field7185 = 0;
            if (~arg0.field7119 == -1) {
                arg0.method2990(8192, 74, false);
            }
            if (arg0.field7119 == 1) {
                arg0.method2990(12288, 65, false);
            }
            if (~arg0.field7119 == -3) {
                arg0.method2990(0, 72, false);
            }
            if (~arg0.field7119 == -4) {
                arg0.method2990(4096, 91, false);
            }
        }
    }
}

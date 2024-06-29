import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class586 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Lqr;")
    private class65 field7657 = new class65(64);

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lwu;")
    private class376 field7664;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field7665 = 0;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field7668 = -1;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "[I")
    public static int[] field7661 = new int[1000];

    @OriginalMember(owner = "client!id", name = "n", descriptor = "[I")
    public static int[] field7670 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)I", line = 8)
    public static final int method3198(int arg0, int arg1, int arg2) {
        field7662++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (arg0 < ~var3) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 28)
    public static final void method3199(int arg0) {
        field7658++;
        class528.field6997.method561((byte) -78);
        if (arg0 > -75) {
            field7668 = -119;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V", line = 40)
    public static final void method3200(int arg0) {
        class375.field5197 = arg0;
        for (int var1 = 0; var1 < class735.field10163; var1++) {
            for (int var2 = 0; var2 < class143.field2290; var2++) {
                if (class660.field8718[arg0][var1][var2] == null) {
                    class660.field8718[arg0][var1][var2] = new class701(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 64)
    public static void method3201(byte arg0) {
        if (arg0 <= 41) {
            field7668 = 124;
        }
        field7661 = null;
        field7670 = null;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V", line = 77)
    public final void method3202(byte arg0) {
        class65 var2 = this.field7657;
        synchronized (this.field7657) {
            if (arg0 != -126) {
                return;
            }
            this.field7657.method561((byte) -78);
        }
        field7669++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZJJZIIZIILjava/lang/String;BLjava/lang/String;I)V", line = 90)
    public static final void method3203(boolean arg0, long arg1, long arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, String arg9, byte arg10, String arg11, int arg12) {
        field7659++;
        if (class403.field5625 || class181.field2730 >= 500) {
            return;
        }
        int var15 = arg8 == -1 ? class737.field10192 : arg8;
        class433 var16 = new class433(arg9, arg11, var15, arg5, arg7, arg2, arg12, arg4, arg0, arg6, arg1, arg3);
        if (arg10 != 87) {
            field7665 = -32;
        }
        class148.method1111(var16, 73);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V", line = 110)
    public final void method3204(int arg0, int arg1) {
        field7667++;
        class65 var3 = this.field7657;
        synchronized (this.field7657) {
            this.field7657.method553(arg1, -15782);
            if (arg0 <= 108) {
                this.method3204(-12, 93);
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)Lqu;", line = 124)
    public final class98 method3205(int arg0, int arg1) {
        field7666++;
        class65 var3 = this.field7657;
        class98 var4;
        synchronized (this.field7657) {
            var4 = (class98) this.field7657.method552(arg0 ^ 0xFFFFB04C, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field7664;
        byte[] var6;
        synchronized (this.field7664) {
            if (arg0 != -20408) {
                this.field7657 = null;
            }
            var6 = this.field7664.method2218((byte) 114, 32, arg1);
        }
        class98 var7 = new class98();
        if (var6 != null) {
            var7.method728(new class677(var6), (byte) -25);
        }
        class65 var8 = this.field7657;
        synchronized (this.field7657) {
            this.field7657.method556((byte) 0, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V", line = 157)
    public final void method3206(byte arg0) {
        field7660++;
        class65 var2 = this.field7657;
        synchronized (this.field7657) {
            if (arg0 > 58) {
                this.field7657.method558(0);
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lms;ILwu;)V", line = 186)
    public class586(class763 arg0, int arg1, class376 arg2) {
        this.field7664 = arg2;
        this.field7664.method2195(32, 0);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V", line = 201)
    public static final void method3207(int arg0) {
        class388.field5409 = -1;
        field7663++;
        class355.field4993 = null;
        if (arg0 != -31736) {
            field7665 = 110;
        }
    }
}

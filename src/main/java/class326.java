import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class326 {

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "[Ljava/lang/String;")
    private String[] field4707;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "[I")
    public static int[] field4709 = new int[5];

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "Lus;")
    public static class1 field4706 = new class1(81, 8);

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "Z")
    public static boolean field4710 = true;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field4711 = 0;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Lpi;")
    public static class317 field4700;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "[S")
    public static short[] field4701;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static final void method2064(int arg0) {
        class232 var1 = class458.field6420;
        synchronized (class458.field6420) {
            class458.field6420.method1475(0);
        }
        field4708++;
        if (arg0 >= -72) {
            method2066(122);
        }
    }

    @OriginalMember(owner = "client!dk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4697++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method2065(int arg0, int arg1) {
        field4704++;
        int var3 = 51 % ((arg0 + 26) / 63);
        return this.field4707[arg1];
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
    public static void method2066(int arg0) {
        field4700 = null;
        field4706 = null;
        field4709 = null;
        field4701 = null;
        if (arg0 > -57) {
            method2068((byte) -105, 119, -73);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lrp;I)V")
    public static final void method2067(class276 arg0, int arg1) {
        field4698++;
        if ((arg0.field4064.length - arg0.field4021) < 1) {
            return;
        }
        int var2 = arg0.method1701(-23121);
        if (var2 < 0 || var2 > 1 || (arg0.field4064.length - arg0.field4021) < 2) {
            return;
        }
        int var3 = arg0.method1729(65280);
        if (arg1 * var3 != arg0.field4064.length - arg0.field4021) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg0.field4021 >= arg0.field4064.length) {
                            return;
                        }
                        var4 = arg0.method1729(65280);
                        var5 = arg0.method1688(20402);
                    } while (class156.field2320.length <= var4);
                } while (!class146.field2102[var4]);
            } while (class179.field2584.method540((byte) 121, var4).field718 == '1' && (var5 < -1 || var5 > 1));
            class156.field2320[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BII)V")
    public static final void method2068(byte arg0, int arg1, int arg2) {
        field4702++;
        class489 var3 = class116.method731(-625541408, 5, arg2);
        var3.method2863(255);
        var3.field6895 = arg1;
        if (arg0 >= -98) {
            field4706 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([B[IB[[B[II[[BI)I")
    public static final int method2069(byte[] arg0, int[] arg1, byte arg2, byte[][] arg3, int[] arg4, int arg5, byte[][] arg6, int arg7) {
        field4703++;
        int var8 = arg1[arg5];
        int var9 = arg4[arg5] + var8;
        int var10 = arg1[arg7];
        int var11 = var10 + arg4[arg7];
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg0[arg5] & 0xFF;
        if ((arg0[arg7] & 0xFF) < var14) {
            var14 = arg0[arg7] & 0xFF;
        }
        byte[] var15 = arg3[arg5];
        byte[] var16 = arg6[arg7];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        int var19 = -81 / ((arg2 - 41) / 53);
        for (int var20 = var12; var20 < var13; var20++) {
            int var21 = var16[var18++] + var15[var17++];
            if (var21 < var14) {
                var14 = var21;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class326(String arg0, String arg1, String arg2, String arg3) {
        this.field4707 = new String[] { arg0, arg1, arg2, arg3 };
    }
}

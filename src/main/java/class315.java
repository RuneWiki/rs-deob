import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class315 extends class321 {

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "Lht;")
    public static class607 field3913 = new class607("", 12);

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
    public static int field3923 = 50;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "[I")
    public static int[] field3916 = new int[field3923];

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "[I")
    public static int[] field3915 = new int[field3923];

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "[I")
    public static int[] field3920 = new int[field3923];

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "[I")
    public static int[] field3924 = new int[field3923];

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field3917 = new String[field3923];

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "[I")
    public static int[] field3922 = new int[field3923];

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "[I")
    public static int[] field3918 = new int[field3923];

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "Lrb;")
    public class383 field3914;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "[Lufa;")
    public class374[] field3912;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([II[I)V")
    public static final void method1808(int[] arg0, int arg1, int[] arg2) {
        field3919++;
        if (arg0 == null || arg2 == null) {
            class664.field9292 = null;
            class560.field7995 = null;
            class185.field2096 = null;
            return;
        }
        class185.field2096 = arg0;
        class560.field7995 = new int[arg0.length];
        class664.field9292 = new byte[arg0.length][][];
        if (arg1 == 1) {
            for (int var3 = 0; var3 < class185.field2096.length; var3++) {
                class664.field9292[var3] = new byte[arg2[var3]][];
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([IIIII)V")
    public static final void method1809(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        arg3--;
        field3911++;
        if (arg2 > -127) {
            field3913 = null;
        }
        int var8 = arg4 - 1;
        int var5 = var8 - 7;
        while (var5 > arg3) {
            int var6 = arg3 + 1;
            arg0[var6] = arg1;
            int var7 = var6 + 1;
            arg0[var7] = arg1;
            int var9 = var7 + 1;
            arg0[var9] = arg1;
            int var10 = var9 + 1;
            arg0[var10] = arg1;
            int var11 = var10 + 1;
            arg0[var11] = arg1;
            int var12 = var11 + 1;
            arg0[var12] = arg1;
            int var13 = var12 + 1;
            arg0[var13] = arg1;
            arg3 = var13 + 1;
            arg0[arg3] = arg1;
        }
        while (var8 > arg3) {
            arg3++;
            arg0[arg3] = arg1;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILce;)V")
    public static final void method1810(int arg0, class445 arg1) {
        field3910++;
        arg1.method2575(0);
        int var2 = 0;
        for (int var3 = 0; var3 < class306.field3786; var3++) {
            int var15 = class396.field5353[var3];
            if ((class194.field2249[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class194.field2249[var15] = (byte) class422.method2436(class194.field2249[var15], 2);
                    var2--;
                } else {
                    int var16 = arg1.method2574(296813219, 1);
                    if (var16 == 0) {
                        var2 = class341.method1969(true, arg1);
                        class194.field2249[var15] = (byte) class422.method2436(class194.field2249[var15], 2);
                    } else {
                        class457.method2625(var15, arg0 - 28188, arg1);
                    }
                }
            }
        }
        arg1.method2583((byte) -58);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method2575(0);
        for (int var4 = 0; var4 < class306.field3786; var4++) {
            int var13 = class396.field5353[var4];
            if ((class194.field2249[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class194.field2249[var13] = (byte) class422.method2436(class194.field2249[var13], 2);
                } else {
                    int var14 = arg1.method2574(296813219, 1);
                    if (var14 == 0) {
                        var2 = class341.method1969(true, arg1);
                        class194.field2249[var13] = (byte) class422.method2436(class194.field2249[var13], 2);
                    } else {
                        class457.method2625(var13, arg0 - 28077, arg1);
                    }
                }
            }
        }
        arg1.method2583((byte) -58);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method2575(arg0 - 28062);
        for (int var5 = 0; var5 < class342.field4326; var5++) {
            int var11 = class492.field7134[var5];
            if ((class194.field2249[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class194.field2249[var11] = (byte) class422.method2436(class194.field2249[var11], 2);
                    var2--;
                } else {
                    int var12 = arg1.method2574(296813219, 1);
                    if (var12 == 0) {
                        var2 = class341.method1969(true, arg1);
                        class194.field2249[var11] = (byte) class422.method2436(class194.field2249[var11], 2);
                    } else if (class181.method1100(arg1, (byte) 76, var11)) {
                        class194.field2249[var11] = (byte) class422.method2436(class194.field2249[var11], 2);
                    }
                }
            }
        }
        arg1.method2583((byte) -58);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method2575(arg0 ^ arg0);
        for (int var6 = 0; var6 < class342.field4326; var6++) {
            int var9 = class492.field7134[var6];
            if ((class194.field2249[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class194.field2249[var9] = (byte) class422.method2436(class194.field2249[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method2574(296813219, 1);
                    if (var10 == 0) {
                        var2 = class341.method1969(true, arg1);
                        class194.field2249[var9] = (byte) class422.method2436(class194.field2249[var9], 2);
                    } else if (class181.method1100(arg1, (byte) -119, var9)) {
                        class194.field2249[var9] = (byte) class422.method2436(class194.field2249[var9], 2);
                    }
                }
            }
        }
        arg1.method2583((byte) -58);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class342.field4326 = 0;
        class306.field3786 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class194.field2249[var7] = (byte) (class194.field2249[var7] >> 1);
            class236 var8 = class139.field1540[var7];
            if (var8 == null) {
                class492.field7134[class342.field4326++] = var7;
            } else {
                class396.field5353[class306.field3786++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILr;IB)Z")
    public final boolean method1811(int arg0, class564 arg1, int arg2, byte arg3) {
        field3921++;
        if (arg3 < 88) {
            this.field3912 = null;
        }
        if (this.field3912 != null) {
            for (int var5 = 0; var5 < this.field3912.length; var5++) {
                if (this.field3912[var5].method2173(arg2, arg0) && this.field3914.method173(arg1, arg2, 0, arg0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static void method1812(int arg0) {
        if (arg0 != 1) {
            method1809(null, 14, 32, 69, 38);
        }
        field3916 = null;
        field3922 = null;
        field3913 = null;
        field3920 = null;
        field3917 = null;
        field3924 = null;
        field3915 = null;
        field3918 = null;
    }
}

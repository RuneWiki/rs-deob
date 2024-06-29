import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class88 extends class656 {

    @OriginalMember(owner = "client!iia", name = "p", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "client!iia", name = "m", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!iia", name = "t", descriptor = "[I")
    public int[] field1079;

    @OriginalMember(owner = "client!iia", name = "l", descriptor = "[Z")
    public boolean[] field1071;

    @OriginalMember(owner = "client!iia", name = "v", descriptor = "[I")
    public int[] field1081;

    @OriginalMember(owner = "client!iia", name = "n", descriptor = "[[I")
    public int[][] field1073;

    @OriginalMember(owner = "client!iia", name = "k", descriptor = "Lkaa;")
    public static class47 field1070 = new class47(32, 3);

    @OriginalMember(owner = "client!iia", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field1077 = new String[200];

    @OriginalMember(owner = "client!iia", name = "s", descriptor = "I")
    public static int field1078 = 0;

    @OriginalMember(owner = "client!iia", name = "j", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!iia", name = "o", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!iia", name = "q", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!iia", name = "u", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!iia", name = "i", descriptor = "Z")
    public static boolean field1068;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(III)Lcj;", line = 6)
    public static final class694 method674(int arg0, int arg1, int arg2) {
        class701 var3 = class660.field8718[arg0][arg1][arg2];
        return var3 == null ? null : var3.field9737;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Lrc;Lda;Lha;BZLjava/lang/String;)V", line = 20)
    public static final void method675(class539 arg0, class60 arg1, class59 arg2, byte arg3, boolean arg4, String arg5) {
        field1080++;
        boolean var6 = !class689.field9594 || class336.method2026((byte) -54);
        if (!var6) {
            return;
        }
        if (class689.field9594 && var6) {
            class539 var12 = class739.field10206;
            class60 var13 = arg2.method425(var12, class313.field4477, true);
            int var14 = var12.method3003(arg5, -121, null, 250);
            int var15 = var12.method2998(arg3 ^ 0x1A, arg5, 250, null, var12.field7142);
            int var16 = class298.field4236.field10028;
            int var17 = var16 + 4;
            int var18 = var17 * 2 + var14;
            int var19 = var17 * 2 + var15;
            if (class32.field494 > var18) {
                var18 = class32.field494;
            }
            if (class244.field3404 > var19) {
                var19 = class244.field3404;
            }
            int var20 = class109.field1494.method1911(var18, 0, class69.field844) + class447.field6132;
            int var21 = class397.field5535.method2861((byte) -87, class304.field4321, var19) + class328.field4677;
            if (class24.field412) {
                var20 += class367.method2167(-2);
                var21 += class672.method3717((byte) -81);
            }
            arg2.method415(class525.field6967, false).method1047(class277.field3858.field10028 + var20, var21 - -class277.field3858.field10029, var18 - (class277.field3858.field10028 * 2), -(class277.field3858.field10029 * 2) + var19, 1, 0, 0);
            arg2.method415(class277.field3858, true).method1035(var20, var21);
            class277.field3858.method4044();
            arg2.method415(class277.field3858, true).method1035(var18 + var20 - var16, var21);
            class277.field3858.method4033();
            arg2.method415(class277.field3858, true).method1035(var18 + var20 - var16, var19 + var21 + -var16);
            class277.field3858.method4044();
            arg2.method415(class277.field3858, true).method1035(var20, var19 + var21 - var16);
            class277.field3858.method4033();
            arg2.method415(class298.field4236, true).method1049(var20, class277.field3858.field10029 + var21, var16, var19 - class277.field3858.field10029 * 2);
            class298.field4236.method4038();
            arg2.method415(class298.field4236, true).method1049(var20 + class277.field3858.field10028, var21, var18 - (class277.field3858.field10028 * 2), var16);
            class298.field4236.method4038();
            arg2.method415(class298.field4236, true).method1049(var18 + var20 - var16, class277.field3858.field10029 + var21, var16, var19 - (class277.field3858.field10029 * 2));
            class298.field4236.method4038();
            arg2.method415(class298.field4236, true).method1049(var20 + class277.field3858.field10028, var21 - -var19 + -var16, var18 - (class277.field3858.field10028 * 2), var16);
            class298.field4236.method4038();
            var13.method528(var21 + var17, 1, null, arg5, 0, null, class456.field6218 | 0xFF000000, var17 + var20, -(var17 * 2) + var19, -1, 0, 0, null, 0, 1, var18 - var17 * 2);
            class310.method1908(var19, var20, -86, var21, var18);
        } else {
            int var7 = arg0.method3003(arg5, -122, null, 250);
            int var8 = arg0.method2999(arg5, (byte) -46, null, 250) * 13;
            byte var9 = 4;
            int var10 = var9 + 6;
            int var11 = var9 + 6;
            arg2.method504(var10 - var9, -var9 + var11, var7 + var9 + var9, var8 - -var9 + var9, -16777216, 0);
            arg2.method455(var10 - var9, -var9 + var11, var9 + var9 + var7, var8 - -var9 + var9, -1, 0);
            arg1.method528(var11, 1, null, arg5, 0, null, -1, var10, var8, -1, 0, 0, null, 0, 1, var7);
            class310.method1908(var8 + var9 + var9, -var9 + var10, -64, var11 - var9, var7 - (-var9 + -var9));
        }
        if (arg3 != -27 || !arg4) {
            return;
        }
        try {
            if (class24.field412) {
                class351.method2104((byte) 56);
            } else {
                arg2.method498(5);
            }
        } catch (class149 var22) {
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(II)V", line = 120)
    public static final void method676(int arg0, int arg1) {
        class317.field4518 = arg1;
        field1074++;
        class65 var2 = class573.field7516;
        synchronized (class573.field7516) {
            class573.field7516.method561((byte) -78);
            if (arg0 != -15286) {
                field1076 = -118;
            }
        }
    }

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "(Z)V", line = 139)
    public static void method677(boolean arg0) {
        field1077 = null;
        if (arg0) {
            field1068 = true;
        }
        field1070 = null;
    }

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(I[B)V", line = 159)
    public class88(int arg0, byte[] arg1) {
        this.field1075 = arg0;
        class677 var3 = new class677(arg1);
        this.field1072 = var3.method3821((byte) -17);
        this.field1079 = new int[this.field1072];
        this.field1071 = new boolean[this.field1072];
        this.field1081 = new int[this.field1072];
        this.field1073 = new int[this.field1072][];
        for (int var4 = 0; var4 < this.field1072; var4++) {
            this.field1081[var4] = var3.method3821((byte) 87);
            if (this.field1081[var4] == 6) {
                this.field1081[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field1072; var5++) {
            this.field1071[var5] = var3.method3821((byte) 106) == 1;
        }
        for (int var6 = 0; var6 < this.field1072; var6++) {
            this.field1079[var6] = var3.method3807(-1);
        }
        for (int var7 = 0; var7 < this.field1072; var7++) {
            this.field1073[var7] = new int[var3.method3821((byte) -63)];
        }
        for (int var8 = 0; var8 < this.field1072; var8++) {
            for (int var9 = 0; var9 < this.field1073[var8].length; var9++) {
                this.field1073[var8][var9] = var3.method3821((byte) 104);
            }
        }
    }
}

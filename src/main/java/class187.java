import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class187 {

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "I")
    public static int field2781 = 2;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "Liu;")
    public static class541 field2785;

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "Lgj;")
    public static class593 field2784;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method1229(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class109.field1593++;
        class585.field7757 = 0;
        for (int var6 = class135.field2199; var6 < class13.field218; var6++) {
            class24[][] var15 = class703.field9899[var6];
            for (int var16 = class253.field3500; var16 < class149.field2388; var16++) {
                for (int var17 = class669.field9498; var17 < class221.field3133; var17++) {
                    class24 var18 = var15[var16][var17];
                    if (var18 != null) {
                        if (class516.field6888[var16 + class364.field4927 - class350.field4797][var17 + class364.field4927 - class173.field2673] && arg1 == null || var6 < arg2 || arg1[var6][var16][var17] != arg3) {
                            var18.field405 = true;
                            var18.field421 = true;
                            if (var18.field409 == null) {
                                var18.field419 = false;
                            } else {
                                var18.field419 = true;
                            }
                            class585.field7757++;
                        } else {
                            var18.field405 = false;
                            var18.field421 = false;
                            var18.field407 = 0;
                            if (var16 >= class350.field4797 - 16 && var16 <= class350.field4797 + 16 && var17 >= class173.field2673 - 16 && var17 <= class173.field2673 + 16 && (var18.field411 != null || var18.field406 != null || var18.field396 != null || var18.field413 != null || var18.field422 != null || var18.field409 != null)) {
                                class692.field9746.method1410(92, var18);
                            }
                        }
                    }
                }
            }
        }
        for (int var7 = class135.field2199; var7 < class13.field218; var7++) {
            if (class269.field3751.method396() && var7 >= arg2 && arg1 != null) {
                int var8 = class516.field6888.length;
                if (class516.field6888.length + class253.field3500 > class657.field8966) {
                    var8 -= class516.field6888.length + class253.field3500 - class657.field8966;
                }
                int var9 = class516.field6888[0].length;
                if (class516.field6888[0].length + class669.field9498 > class227.field3196) {
                    var9 -= class516.field6888[0].length + class669.field9498 - class227.field3196;
                }
                int var10 = class483.field6538;
                while (true) {
                    if (var10 >= var8) {
                        class692.field9746.method1411((byte) 96, class218.field3099[var7], var7, true);
                        break;
                    }
                    int var11 = class253.field3500 + var10 - class483.field6538;
                    for (int var12 = class371.field5006; var12 < var9; var12++) {
                        class659.field9356[var10][var12] = false;
                        if (class516.field6888[var10][var12]) {
                            int var13 = class669.field9498 + var12 - class371.field5006;
                            for (int var14 = var7; var14 >= 0; var14--) {
                                if (class703.field9899[var14][var11][var13] != null && class703.field9899[var14][var11][var13].field402 == var7) {
                                    class659.field9356[var10][var12] = class703.field9899[var14][var11][var13].field405;
                                    break;
                                }
                            }
                        }
                    }
                    var10++;
                }
            } else {
                class692.field9746.method1411((byte) 100, class218.field3099[var7], var7, false);
            }
            class692.field9746.method1407(true);
        }
        if (!class146.method1057(true)) {
            class146.method1057(false);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V")
    public static void method1230(byte arg0) {
        if (arg0 == -53) {
            field2784 = null;
            field2785 = null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BI)[B")
    public static final byte[] method1231(byte arg0, int arg1) {
        if (arg0 > -4) {
            method1232(-116, true, 69, 23, true, -96);
        }
        field2779++;
        class414 var2 = (class414) class74.field1181.method1642(-1717, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class660.method3697(0, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class414(var3);
            class74.field1181.method1643(var2, 13642, (long) arg1);
        }
        return var2.field5672;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IZIIZI)V")
    public static final void method1232(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (!arg4) {
            return;
        }
        field2782++;
        long var6 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
        class521 var8 = (class521) class62.field957.method2918(var6, (byte) -59);
        if (var8 == null) {
            var8 = new class521();
            class62.field957.method2911(var6, var8, (byte) -28);
        }
        if (var8.field6961.length <= arg5) {
            int[] var9 = new int[arg5 + 1];
            int[] var10 = new int[arg5 + 1];
            for (int var11 = 0; var11 < var8.field6961.length; var11++) {
                var9[var11] = var8.field6961[var11];
                var10[var11] = var8.field6958[var11];
            }
            for (int var12 = var8.field6961.length; var12 < arg5; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field6958 = var10;
            var8.field6961 = var9;
        }
        var8.field6961[arg5] = arg3;
        var8.field6958[arg5] = arg2;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)V")
    public static final void method1233(int arg0, int arg1) {
        field2783++;
        int var2 = 45 / ((arg1 - 41) / 40);
        class382 var3 = class396.method2276(124, 12, arg0);
        var3.method2228((byte) -55);
    }
}

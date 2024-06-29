import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class447 {

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "Lpr;")
    public static class407 field6138 = new class407(84, 6);

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "[[I")
    public static int[][] field6139 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "Leo;")
    public static class266 field6140;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)V", line = 8)
    public static void method2474(byte arg0) {
        int var1 = -18 / ((44 - arg0) / 44);
        field6139 = null;
        field6140 = null;
        field6138 = null;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I[[[BIBII)V", line = 32)
    public static final void method2475(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class419.field5577++;
        class195.field2336 = 0;
        for (int var6 = class472.field6593; var6 < class337.field4416; var6++) {
            class287[][] var15 = class97.field1074[var6];
            for (int var16 = class650.field9307; var16 < class648.field9178; var16++) {
                for (int var17 = class147.field1649; var17 < class585.field8323; var17++) {
                    class287 var18 = var15[var16][var17];
                    if (var18 != null) {
                        if (class581.field8258[var16 + class658.field9390 - class325.field4238][var17 + class658.field9390 - class75.field789] && arg1 == null || var6 < arg2 || arg1[var6][var16][var17] != arg3) {
                            var18.field3682 = true;
                            var18.field3695 = true;
                            if (var18.field3680 == null) {
                                var18.field3693 = false;
                            } else {
                                var18.field3693 = true;
                            }
                            class195.field2336++;
                        } else {
                            var18.field3682 = false;
                            var18.field3695 = false;
                            var18.field3691 = 0;
                            if (var16 >= class325.field4238 - 16 && var16 <= class325.field4238 + 16 && var17 >= class75.field789 - 16 && var17 <= class75.field789 + 16 && (var18.field3697 != null || var18.field3690 != null || var18.field3678 != null || var18.field3677 != null || var18.field3686 != null || var18.field3680 != null)) {
                                class81.field859.method1408(0, var18);
                            }
                        }
                    }
                }
            }
        }
        for (int var7 = class472.field6593; var7 < class337.field4416; var7++) {
            if (class618.field8703.method315() && var7 >= arg2 && arg1 != null) {
                int var8 = class581.field8258.length;
                if (class581.field8258.length + class650.field9307 > class181.field2222) {
                    var8 -= class581.field8258.length + class650.field9307 - class181.field2222;
                }
                int var9 = class581.field8258[0].length;
                if (class581.field8258[0].length + class147.field1649 > class272.field3451) {
                    var9 -= class581.field8258[0].length + class147.field1649 - class272.field3451;
                }
                int var10 = class88.field937;
                while (true) {
                    if (var10 >= var8) {
                        class81.field859.method1411(class628.field8912[var7], -3172, true, var7);
                        break;
                    }
                    int var11 = class650.field9307 + var10 - class88.field937;
                    for (int var12 = class438.field6091; var12 < var9; var12++) {
                        class321.field4164[var10][var12] = false;
                        if (class581.field8258[var10][var12]) {
                            int var13 = class147.field1649 + var12 - class438.field6091;
                            for (int var14 = var7; var14 >= 0; var14--) {
                                if (class97.field1074[var14][var11][var13] != null && class97.field1074[var14][var11][var13].field3685 == var7) {
                                    class321.field4164[var10][var12] = class97.field1074[var14][var11][var13].field3682;
                                    break;
                                }
                            }
                        }
                    }
                    var10++;
                }
            } else {
                class81.field859.method1411(class628.field8912[var7], -3172, false, var7);
            }
            class81.field859.method1412((byte) 91);
        }
        if (!class679.method3794(true)) {
            class679.method3794(false);
        }
    }
}

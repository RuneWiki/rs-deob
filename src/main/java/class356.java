import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class356 {

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field4844 = 0;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4839 = "Stellar Dawn is loading - please wait...";

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "Lon;")
    public static class35 field4848 = new class35(128);

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "[[I")
    public static int[][] field4849 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Lpg;")
    public static class112 field4840;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "Lkb;")
    public static class80 field4841;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "[Lvi;")
    public static class310[] field4845;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(FIZIIIII)[I")
    public static final int[] method2245(float arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4843++;
        int[] var8 = new int[arg3];
        class426 var9 = new class426();
        var9.field6017 = arg7;
        var9.field6026 = arg5;
        var9.field6036 = (int) ((float) arg6 * arg0);
        var9.field6034 = arg4;
        var9.field6016 = arg2;
        var9.field6019 = arg1;
        var9.method87((byte) 77);
        class69.method597(1, arg3, -1);
        var9.method2624(-122, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
    public static final void method2246(int arg0, int arg1) {
        class395.field5532 = -1;
        class148.field2286 = 0;
        class229.field3182 = 1;
        class433.field6142 = -1;
        field4847++;
        class163.field2414 = false;
        class241.field3327 = null;
        class266.field3567 = arg0;
        if (arg1 == 12614) {
            ;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public static void method2247(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field4840 = null;
        field4839 = null;
        field4845 = null;
        field4841 = null;
        field4848 = null;
        field4849 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLcc;[I[I[I)V")
    public static final void method2248(byte arg0, class338 arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var7 = arg2[var5];
            int var8 = arg3[var5];
            int var9 = arg4[var5];
            int var10 = 0;
            while (var8 != 0 && var10 < arg1.field4990.length) {
                if ((var8 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg1.field4990[var10] = null;
                    } else {
                        class209 var11 = class288.method1819(var7, (byte) 105);
                        int var12 = var11.field2917;
                        class291 var13 = arg1.field4990[var10];
                        if (var13 != null) {
                            if (var13.field3955 == var7) {
                                if (var12 == 0) {
                                    var13 = arg1.field4990[var10] = null;
                                } else if (var12 == 1) {
                                    var13.field3951 = 0;
                                    var13.field3948 = 1;
                                    var13.field3945 = 0;
                                    var13.field3946 = 0;
                                    var13.field3952 = var9;
                                    class232.method1547(13238, var11, arg1.field3167, class95.field1379 == arg1, 0, arg1.field3176);
                                } else if (var12 == 2) {
                                    var13.field3951 = 0;
                                }
                            } else if (var11.field2906 >= class288.method1819(var13.field3955, (byte) 105).field2906) {
                                var13 = arg1.field4990[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class291 var14 = arg1.field4990[var10] = new class291();
                            var14.field3948 = 1;
                            var14.field3945 = 0;
                            var14.field3951 = 0;
                            var14.field3952 = var9;
                            var14.field3955 = var7;
                            var14.field3946 = 0;
                            class232.method1547(13238, var11, arg1.field3167, class95.field1379 == arg1, 0, arg1.field3176);
                        }
                    }
                }
                var10++;
                var8 >>>= 0x1;
            }
        }
        int var6 = 65 / ((arg0 - 70) / 39);
        field4846++;
    }
}

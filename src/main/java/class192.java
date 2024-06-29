import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class192 {

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Lhi;")
    public static class45 field2803 = new class45(26, -1);

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "[F")
    public static float[] field2805 = new float[4];

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Z")
    public static boolean field2807 = true;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Lhi;")
    public static class45 field2806 = new class45(56, -1);

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field2809 = 104;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Lhi;")
    public static class45 field2808 = new class45(33, -1);

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "[F")
    public static float[] field2810 = new float[16];

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIZIFBII)[I")
    public static final int[] method1270(int arg0, int arg1, boolean arg2, int arg3, float arg4, byte arg5, int arg6, int arg7) {
        field2804++;
        int[] var8 = new int[arg1];
        class315 var9 = new class315();
        var9.field4266 = arg0;
        var9.field4269 = arg2;
        var9.field4268 = (int) (arg4 * 4096.0F);
        int var10 = 43 / ((12 - arg5) / 57);
        var9.field4270 = arg6;
        var9.field4279 = arg3;
        var9.field4278 = arg7;
        var9.method146((byte) -103);
        class481.method2860(arg1, (byte) 97, 1);
        var9.method1815(101, var8, 0);
        return var8;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public static void method1271(byte arg0) {
        field2803 = null;
        field2810 = null;
        field2808 = null;
        if (arg0 <= -93) {
            field2805 = null;
            field2806 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([I[I[IBLpf;)V")
    public static final void method1272(int[] arg0, int[] arg1, int[] arg2, byte arg3, class487 arg4) {
        field2802++;
        int var5 = 15 % ((45 - arg3) / 37);
        for (int var6 = 0; var6 < arg0.length; var6++) {
            int var7 = arg0[var6];
            int var8 = arg2[var6];
            int var9 = arg1[var6];
            int var10 = 0;
            while (var8 != 0 && arg4.field246.length > var10) {
                if ((var8 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg4.field246[var10] = null;
                    } else {
                        class55 var11 = class50.field716.method831(var7, (byte) 54);
                        int var12 = var11.field792;
                        class384 var13 = arg4.field246[var10];
                        if (var13 != null) {
                            if (var13.field5512 == var7) {
                                if (var12 == 0) {
                                    var13 = arg4.field246[var10] = null;
                                } else if (var12 == 1) {
                                    var13.field5509 = var9;
                                    var13.field5516 = 0;
                                    var13.field5506 = 1;
                                    var13.field5514 = 0;
                                    var13.field5517 = 0;
                                    class196.method1286(var11, arg4.field6287, class81.field1158 == arg4, (byte) 1, arg4.field6279, arg4.field6284, 0);
                                } else if (var12 == 2) {
                                    var13.field5517 = 0;
                                }
                            } else if (var11.field784 >= class50.field716.method831(var13.field5512, (byte) 54).field784) {
                                var13 = arg4.field246[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class384 var14 = arg4.field246[var10] = new class384();
                            var14.field5509 = var9;
                            var14.field5506 = 1;
                            var14.field5512 = var7;
                            var14.field5516 = 0;
                            var14.field5517 = 0;
                            var14.field5514 = 0;
                            class196.method1286(var11, arg4.field6287, class81.field1158 == arg4, (byte) 1, arg4.field6279, arg4.field6284, 0);
                        }
                    }
                }
                var10++;
                var8 >>>= 0x1;
            }
        }
    }
}

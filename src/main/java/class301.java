import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class301 extends class42 {

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "Lcu;")
    public static class145 field3983;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "Lff;")
    public static class9 field3984;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "Lub;")
    public static class18 field3985;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
    public int field3981;

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
    public int field3982;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "Lss;")
    public static class295 field3980;

    static {
        new class304(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
        field3983 = new class145(17, 8);
        field3984 = new class9(80, -2);
        field3985 = new class18(8);
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(Z)V", line = 5)
    public static final void method1754(boolean arg0) {
        if (arg0) {
            class497.field6886 = class376.field5102;
            class141.field2049 = class37.field582;
        } else {
            class497.field6886 = class490.field6821;
            class141.field2049 = class209.field2868;
        }
        class508.field7055 = class497.field6886.length;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "([I[IILsq;[I)V", line = 28)
    public static final void method1755(int[] arg0, int[] arg1, int arg2, class117 arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg0[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var7 != 0 && arg3.field6237.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field6237[var9] = null;
                    } else {
                        class5 var10 = class423.field5791.method1601(var6, (byte) -125);
                        int var11 = var10.field126;
                        class250 var12 = arg3.field6237[var9];
                        if (var12 != null) {
                            if (var12.field3326 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field6237[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3318 = var8;
                                    var12.field3319 = 1;
                                    var12.field3316 = 0;
                                    var12.field3315 = 0;
                                    var12.field3320 = 0;
                                    class291.method1711(var10, 0, arg3.field574, -19, arg3.field573, arg3.field584, false);
                                } else if (var11 == 2) {
                                    var12.field3316 = 0;
                                }
                            } else if (var10.field135 >= class423.field5791.method1601(var12.field3326, (byte) -121).field135) {
                                var12 = arg3.field6237[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class250 var13 = arg3.field6237[var9] = new class250();
                            var13.field3319 = 1;
                            var13.field3315 = 0;
                            var13.field3326 = var6;
                            var13.field3318 = var8;
                            var13.field3316 = 0;
                            var13.field3320 = 0;
                            class291.method1711(var10, 0, arg3.field574, -55, arg3.field573, arg3.field584, false);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        if (arg2 == 20201) {
            field3979++;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V", line = 125)
    public static void method1756(int arg0) {
        field3985 = null;
        field3984 = null;
        if (arg0 != -20223) {
            method1755(null, null, -29, null, null);
        }
        field3983 = null;
        field3980 = null;
    }
}

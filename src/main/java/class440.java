import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class440 {

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "Ltca;")
    public class174 field6262 = new class174();

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "Z")
    public boolean field6263 = false;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "Lfh;")
    public static class652 field6259 = new class652("LOCAL", 4);

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "F")
    public static float field6267 = 1024.0F;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "Lpha;")
    public static class166 field6266 = new class166();

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IBIIII[II)Z")
    public static final boolean method2650(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        field6261++;
        if (class359.field5179 < arg4) {
            arg4 = class359.field5179;
        }
        if (arg5 < 0) {
            arg5 = 0;
        }
        if (arg1 != -25) {
            field6268 = -32;
        }
        if (arg5 >= arg4) {
            return true;
        }
        int var8 = arg5 + arg7 - 1;
        int var9 = arg0 * arg5 + arg2;
        int var10 = arg4 - arg5 >> 2;
        int var10000;
        if (class179.field2740 == 1) {
            class399.field5890 += var10;
            while (true) {
                var10--;
                if (var10 < 0) {
                    int var16 = arg4 - arg5 & 0x3;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            return true;
                        }
                        var10000 = ~var9;
                        var8++;
                        if (var10000 > ~arg6[var8]) {
                            arg6[var8] = var9;
                        }
                        var9 += arg0;
                    }
                }
                var10000 = ~var9;
                var8++;
                if (var10000 > ~arg6[var8]) {
                    arg6[var8] = var9;
                }
                int var17 = arg0 + var9;
                var10000 = ~var17;
                var8++;
                if (var10000 > ~arg6[var8]) {
                    arg6[var8] = var17;
                }
                int var18 = arg0 + var17;
                var8++;
                if (var18 < arg6[var8]) {
                    arg6[var8] = var18;
                }
                int var19 = arg0 + var18;
                var10000 = ~var19;
                var8++;
                if (var10000 > ~arg6[var8]) {
                    arg6[var8] = var19;
                }
                var9 = arg0 + var19;
            }
        } else {
            int var11 = var9 - 38400;
            while (true) {
                var10--;
                if (var10 < 0) {
                    int var12 = arg4 - arg5 & 0x3;
                    while (true) {
                        var12--;
                        if (var12 < 0) {
                            return true;
                        }
                        var8++;
                        if (var11 < arg6[var8]) {
                            return false;
                        }
                        var11 += arg0;
                    }
                }
                var10000 = ~var11;
                var8++;
                if (var10000 > ~arg6[var8]) {
                    return false;
                }
                int var13 = arg0 + var11;
                var8++;
                if (arg6[var8] > var13) {
                    return false;
                }
                int var14 = arg0 + var13;
                var8++;
                if (var14 < arg6[var8]) {
                    return false;
                }
                int var15 = arg0 + var14;
                var8++;
                if (arg6[var8] > var15) {
                    return false;
                }
                var11 = arg0 + var15;
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
    public static void method2651(byte arg0) {
        field6266 = null;
        field6259 = null;
        if (arg0 >= -110) {
            method2650(-68, (byte) 45, 58, 119, 101, -92, null, 79);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V")
    public static final void method2652(boolean arg0) {
        class593.field8116 = arg0;
        field6264++;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljda;I)V")
    public final void method2653(class228 arg0, int arg1) {
        field6260++;
        class404 var3 = arg0.field3309;
        boolean var4 = true;
        class317[] var5 = arg0.field3313;
        for (int var6 = 0; var6 < var5.length; var6++) {
            if (var5[var6].field4379) {
                var4 = false;
                break;
            }
        }
        if (var4) {
            return;
        }
        if (this.field6263) {
            for (class228 var7 = (class228) this.field6262.method1301(8); var7 != null; var7 = (class228) this.field6262.method1307((byte) -103)) {
                if (var7.field3309 == var3) {
                    var7.method4018(false);
                    class520.method3028(var7, -41);
                }
            }
        }
        for (class228 var8 = (class228) this.field6262.method1301(8); var8 != null; var8 = (class228) this.field6262.method1307((byte) -44)) {
            if (var3.field5934 >= var8.field3309.field5934) {
                class614.method3482(var8, arg0, true);
                return;
            }
        }
        if (arg1 != 18802) {
            field6266 = null;
        }
        this.field6262.method1298(-107, arg0);
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)V")
    public final void method2654(byte arg0) {
        while (true) {
            class228 var2 = (class228) this.field6262.method1304(60);
            if (var2 == null) {
                field6258++;
                if (arg0 != 69) {
                    field6268 = -20;
                    return;
                }
                return;
            }
            var2.method4018(false);
            class520.method3028(var2, 123);
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Z)V")
    public class440(boolean arg0) {
        this.field6263 = arg0;
    }
}

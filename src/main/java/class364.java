import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class364 extends class24 {

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Lvn;")
    public static class169 field5292 = new class169();

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "Z")
    public static boolean field5294 = true;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Lvn;")
    public static class169 field5293 = new class169();

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "Ljava/lang/String;")
    public static String field5296 = null;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "Ljava/lang/String;")
    public static String field5298 = "shake:";

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "Lra;")
    public static class57 field5295;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(Z)V", line = 5)
    public static void method2308(boolean arg0) {
        field5293 = null;
        field5295 = null;
        field5292 = null;
        field5296 = null;
        field5298 = null;
        if (!arg0) {
            method2309(0, 86, -47, (class174) null, 10, -121, 38, (byte[]) null, -120, (class39[]) null, false, -36);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILen;III[BI[Ldl;ZI)V", line = 19)
    public static final void method2309(int arg0, int arg1, int arg2, class174 arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, class39[] arg9, boolean arg10, int arg11) {
        if (arg11 != 7) {
            return;
        }
        field5297++;
        class211 var12 = new class211(arg7);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1347(-1063535536);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1376(128);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = (var15 & 0xFC3) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method1342((byte) -128);
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg2 == var19 && var18 >= arg4 && var18 < arg4 + 8 && arg0 <= var17 && var17 < arg0 + 8) {
                    class327 var23 = class157.method1036(arg11 - 7, var13);
                    int var24 = class10.method86(var22, var18 & 0x7, arg5, 3, var23.field4680, var23.field4615, var17 & 0x7) + arg1;
                    int var25 = arg6 + class422.method2621(var23.field4615, arg5, var23.field4680, var18 & 0x7, var17 & 0x7, var22, arg11);
                    if (var24 > 0 && var25 > 0 && var24 < (class279.field3935 - 1) && class164.field2287 - 1 > var25) {
                        class39 var26 = null;
                        if (!arg10) {
                            int var27 = arg8;
                            if ((class166.field2327[1][var24][var25] & 0x2) == 2) {
                                var27 = arg8 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg9[var27];
                            }
                        }
                        class103.method558(arg8, var21, arg3, -1, var26, arg8, var13, var25, arg5 + var22 & 0x3, var24, arg10, true, -30);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V", line = 107)
    public static final void method2310(byte arg0) {
        field5291++;
        int var1 = class433.field6308.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class433.field6308[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class362.field5277; var4++) {
                    if (class71.field805[var2] == class290.field4129[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class290.field4129[class362.field5277] = class71.field805[var2];
                    var3 = class362.field5277++;
                }
                class211 var5 = new class211(class433.field6308[var2]);
                int var6 = 0;
                while (var5.field2888 < class433.field6308[var2].length && var6 < 511 && class426.field6168 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1355(arg0 ^ 0x7DD8);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class71.field805[var2] >> 8) * 64 - (class40.field427 - var10);
                    int var13 = (class71.field805[var2] & 0xFF) * 64 + var11 - class217.field2975;
                    class335 var14 = class282.method1806(75, var5.method1355(32136));
                    if (class81.field917[var7] == null && (var14.field4929 & 0x1) > 0 && class356.field5209 == var9 && var12 >= 0 && (var14.field4982 + var12) < class279.field3935 && var13 >= 0 && class164.field2287 > var14.field4982 + var13) {
                        class81.field917[var7] = new class358();
                        class81.field917[var7].field6279 = var7;
                        class358 var15 = class81.field917[var7];
                        class201.field2770[class426.field6168++] = var7;
                        var15.field6320 = class221.field3033;
                        var15.method2282(var14, (byte) 100);
                        var15.method2684(var15.field5229.field4982, (byte) -106);
                        var15.field6307 = var15.field5229.field4950 << 3;
                        if (var15.field6307 == 0) {
                            var15.method2687(0, true);
                        } else {
                            var15.method2687(class196.field2668[var15.field5229.field4972 - 1], true);
                        }
                        var15.method2696(var12, var9, var13, var15.method786((byte) 70), true, -29874);
                    }
                }
            }
        }
        if (arg0 != 80) {
            method2309(-92, -21, -75, (class174) null, -21, 84, -59, (byte[]) null, 1, (class39[]) null, false, -11);
        }
    }
}

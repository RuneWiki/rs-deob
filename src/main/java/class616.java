import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class616 {

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "I")
    public static int field8774 = 0;

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "Lqk;")
    public static class148 field8773 = new class148(19, 2);

    @OriginalMember(owner = "client!dia", name = "g", descriptor = "[I")
    public static int[] field8778 = new int[4096];

    @OriginalMember(owner = "client!dia", name = "f", descriptor = "Lqk;")
    public static class148 field8777 = new class148(65, -1);

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "I")
    public static int field8775;

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V")
    public static void method3615(int arg0) {
        if (arg0 > -13) {
            method3616(false);
        }
        field8778 = null;
        field8777 = null;
        field8773 = null;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Z)Ljava/lang/String;")
    public static final String method3616(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field8776++;
            return class484.field6549 || class627.field8950 == null ? "" : class627.field8950.field51;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(BZLjava/lang/String;)V")
    public static final void method3617(byte arg0, boolean arg1, String arg2) {
        field8775++;
        if (arg2 == null) {
            return;
        }
        if (class458.field6302 >= 100) {
            class216.method1417(class138.field1875.method891(-2041650704, class369.field4721), (byte) 127, 4);
            return;
        }
        if (arg0 <= 69) {
            field8778 = null;
        }
        String var3 = class53.method357(arg2, 1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class458.field6302; var4++) {
            String var9 = class53.method357(class46.field674[var4], 1);
            if (var9 != null && var9.equals(var3)) {
                class216.method1417(arg2 + class138.field1876.method891(-2041650704, class369.field4721), (byte) 126, 4);
                return;
            }
            if (class270.field3639[var4] != null) {
                String var10 = class53.method357(class270.field3639[var4], 1);
                if (var10 != null && var10.equals(var3)) {
                    class216.method1417(arg2 + class138.field1876.method891(-2041650704, class369.field4721), (byte) 127, 4);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class713.field10110; var5++) {
            String var7 = class53.method357(class570.field8079[var5], 1);
            if (var7 != null && var7.equals(var3)) {
                class216.method1417(class138.field1881.method891(-2041650704, class369.field4721) + arg2 + class138.field1882.method891(-2041650704, class369.field4721), (byte) 114, 4);
                return;
            }
            if (class82.field1117[var5] != null) {
                String var8 = class53.method357(class82.field1117[var5], 1);
                if (var8 != null && var8.equals(var3)) {
                    class216.method1417(class138.field1881.method891(-2041650704, class369.field4721) + arg2 + class138.field1882.method891(-2041650704, class369.field4721), (byte) 125, 4);
                    return;
                }
            }
        }
        if (class53.method357(class473.field6483.field9272, 1).equals(var3)) {
            class216.method1417(class138.field1878.method891(-2041650704, class369.field4721), (byte) -42, 4);
            return;
        }
        class383.field5384++;
        class120 var6 = class292.method1716(class608.field8668, true, class161.field2234);
        var6.field1653.method184(class678.method3882(arg2, (byte) 109) + 1, -102);
        var6.field1653.method187(arg2, (byte) -95);
        var6.field1653.method184(arg1 ? 1 : 0, -62);
        class471.method2805(88, var6);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(II[IIIBII)V")
    public static final void method3618(int arg0, int arg1, int[] arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field8772++;
        if (arg1 > 0 && !class447.method2664(0, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg6 > 0 && !class447.method2664(0, arg6)) {
            throw new IllegalArgumentException("");
        } else if (arg3 == 32993) {
            int var8 = 0;
            int var9 = arg6 <= arg1 ? arg6 : arg1;
            int var10 = -26 % ((arg5 - 26) / 57);
            int var11 = arg1 >> 1;
            int var12 = arg6 >> 1;
            int[] var13 = arg2;
            int[] var14 = new int[var11 * var12];
            while (true) {
                OpenGL.glTexImage2Di(arg7, var8, arg4, arg1, arg6, 0, arg3, arg0, var13, 0);
                if (var9 <= 1) {
                    return;
                }
                int var15 = 0;
                int var16 = 0;
                int var17 = arg1 + var16;
                int[] var18 = var14;
                for (int var19 = 0; var19 < var12; var19++) {
                    for (int var20 = 0; var20 < var11; var20++) {
                        int var21 = var13[var16++];
                        int var22 = var13[var16++];
                        int var23 = var13[var17++];
                        int var24 = var21 & 0xFF;
                        int var25 = var21 >> 16 & 0xFF;
                        int var26 = var21 >> 8 & 0xFF;
                        int var27 = var21 >> 24 & 0xFF;
                        int var28 = var13[var17++];
                        int var29 = (var22 >> 24 & 0xFF) + var27;
                        int var30 = (var22 & 0xFF) + var24;
                        int var31 = ((var22 & 0xFFDD8B) >> 16) + var25;
                        int var32 = ((var22 & 0xFF47) >> 8) + var26;
                        int var33 = (var23 & 0xFF) + var30;
                        int var34 = ((var23 & 0xFFD496) >> 16) + var31;
                        int var35 = (var23 >> 8 & 0xFF) + var32;
                        int var36 = (var23 >> 24 & 0xFF) + var29;
                        int var37 = (var28 >> 24 & 0xFF) + var36;
                        int var38 = ((var28 & 0xFF5C) >> 8) + var35;
                        int var39 = (var28 >> 16 & 0xFF) + var34;
                        int var40 = (var28 & 0xFF) + var33;
                        var14[var15++] = class747.method4153(class747.method4153(class747.method4153(class136.method878(1020, var39) << 14, class136.method878(1020, var37) << 22), class136.method878(1020, var38) << 6), class136.method878(1020, var40) >> 2);
                    }
                    var17 += arg1;
                    var16 += arg1;
                }
                var14 = var13;
                arg6 = var12;
                var13 = var18;
                arg1 = var11;
                var11 >>= 0x1;
                var12 >>= 0x1;
                var9 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}

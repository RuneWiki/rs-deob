import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class25 extends class578 {

    @OriginalMember(owner = "client!ir", name = "A", descriptor = "J")
    public static long field309 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!ir", name = "L", descriptor = "I")
    public static int field320 = 0;

    @OriginalMember(owner = "client!ir", name = "K", descriptor = "Lbb;")
    public static class303 field319 = new class303(0, -1);

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "I")
    public int field310;

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "I")
    public int field313;

    @OriginalMember(owner = "client!ir", name = "G", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!ir", name = "H", descriptor = "I")
    public int field316;

    @OriginalMember(owner = "client!ir", name = "I", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!ir", name = "M", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "Len;")
    public class290 field311;

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "Ljava/lang/String;")
    public String field314;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "[I")
    public int[] field306;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "[I")
    public int[] field308;

    @OriginalMember(owner = "client!ir", name = "J", descriptor = "[Lfaa;")
    public class139[] field318;

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field312;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I[Lin;IZII)V")
    public static final void method244(int arg0, class78[] arg1, int arg2, boolean arg3, int arg4, int arg5) {
        for (int var6 = 0; var6 < arg1.length; var6++) {
            class78 var8 = arg1[var6];
            if (var8 != null && var8.field1178 == arg4) {
                class393.method2298(arg2, -99, var8, arg3, arg0);
                class80.method626(-3159, arg0, var8, arg2);
                if (var8.field1158 > var8.field1106 - var8.field1104) {
                    var8.field1158 = var8.field1106 - var8.field1104;
                }
                if (var8.field1158 < 0) {
                    var8.field1158 = 0;
                }
                if (var8.field1128 - var8.field1050 < var8.field1170) {
                    var8.field1170 = var8.field1128 - var8.field1050;
                }
                if (var8.field1170 < 0) {
                    var8.field1170 = 0;
                }
                if (var8.field1075 == 0) {
                    class543.method3063(var8, (byte) 117, arg3);
                }
            }
        }
        field315++;
        int var7 = 55 / ((arg5 - 11) / 59);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V")
    public static final void method245(int arg0, int arg1) {
        int var2 = 3 % ((arg1 + 46) / 62);
        class293.field4024.method3754(arg0, true);
        field317++;
        class462.field6369.method3754(arg0, true);
        class143.field2058.method3754(arg0, true);
        class281.field3840.method3754(arg0, true);
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(Z)V")
    public static void method246(boolean arg0) {
        if (arg0) {
            method246(true);
        }
        field319 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIII)V")
    public static final void method247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field321++;
        int var6 = arg0 - arg2;
        int var7 = arg4 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class553.method3106((byte) 124, arg3, arg2, arg0, arg1);
            }
        } else if (var6 == 0) {
            class313.method1891(arg4, arg1, arg2, 4, arg3);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg1;
                arg1 = arg2;
                int var10 = arg4;
                arg2 = var9;
                arg4 = arg0;
                arg0 = var10;
            }
            if (arg4 < arg1) {
                int var11 = arg1;
                arg1 = arg4;
                int var12 = arg2;
                arg4 = var11;
                arg2 = arg0;
                arg0 = var12;
            }
            int var13 = arg2;
            int var14 = arg4 - arg1;
            int var15 = arg0 - arg2;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg2 >= arg0 ? -1 : 1;
            if (var8) {
                for (int var18 = arg1; var18 <= arg4; var18++) {
                    class344.field4599[var18][var13] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg1; var19 <= arg4; var19++) {
                    class344.field4599[var13][var19] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
            if (arg5 < 33) {
                method244(49, null, -57, false, -7, -109);
            }
        }
    }
}

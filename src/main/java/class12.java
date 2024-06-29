import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class12 {

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field157 = 0;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field164 = 0;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field160 = 0;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Ltl;")
    public static class59 field156 = class85.method639("3D)2Softwarebibliothek gestartet)3", 9588);

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Ltl;")
    public static class59 field158 = class85.method639("Card:", 9588);

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Lgb;")
    public static class212 field159 = new class212(50);

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "[I")
    public static int[] field155;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "[Llj;")
    public static class5[] field163;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)I", line = 15)
    public static final int method81(int arg0, int arg1, int arg2) {
        field161++;
        if (arg0 != 0) {
            method83(-78);
        }
        int var3 = arg2 >> 31 & arg1 - 1;
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIIIILfg;IZJ)Z", line = 34)
    public static final boolean method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class176 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class97.field1558 == class4.field57;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class120.field2000 || var16 >= class78.field1244) {
                    return false;
                }
                class245 var17 = class120.field2010[arg0][var15][var16];
                if (var17 != null && var17.field4092 >= 5) {
                    return false;
                }
            }
        }
        class165 var18 = new class165();
        var18.field2673 = arg11;
        var18.field2674 = arg0;
        var18.field2675 = arg5;
        var18.field2677 = arg6;
        var18.field2672 = arg7;
        var18.field2688 = arg8;
        var18.field2671 = arg9;
        var18.field2682 = arg1;
        var18.field2670 = arg2;
        var18.field2681 = arg1 + arg3 - 1;
        var18.field2676 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class120.field2010[var22][var19][var20] == null) {
                        class120.field2010[var22][var19][var20] = new class245(var22, var19, var20);
                    }
                }
                class245 var23 = class120.field2010[arg0][var19][var20];
                var23.field4107[var23.field4092] = var18;
                var23.field4094[var23.field4092] = var21;
                var23.field4089 |= var21;
                var23.field4092++;
                if (var13 && class172.field2833[var19][var20] != 0) {
                    var14 = class172.field2833[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class172.field2833[var24][var25] == 0) {
                        class172.field2833[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class131.field2171[class269.field4672++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 152)
    public static void method83(int arg0) {
        field159 = null;
        field155 = null;
        field163 = null;
        field158 = null;
        if (arg0 != 701370175) {
            field155 = (int[]) null;
        }
        field156 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIILim;I)Ljava/awt/Frame;", line = 178)
    public static final Frame method84(int arg0, int arg1, int arg2, int arg3, class175 arg4, int arg5) {
        field162++;
        if (!arg4.method1286(5513)) {
            return null;
        }
        if (arg0 == arg2) {
            class143[] var6 = class311.method2146(arg4, true);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field2367 == arg1 && var6[var8].field2364 == arg3 && (arg5 == 0 || var6[var8].field2359 == arg5) && (!var7 || var6[var8].field2366 > arg2)) {
                    arg2 = var6[var8].field2366;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class257 var9 = arg4.method1288(arg1, arg3, arg2, arg5, -45);
        while (var9.field4256 == 0) {
            class183.method1360(false, 10L);
        }
        Frame var10 = (Frame) var9.field4255;
        if (var10 == null) {
            return null;
        } else if (var9.field4256 == 2) {
            class128.method938(arg4, 83, var10);
            return null;
        } else {
            return var10;
        }
    }
}

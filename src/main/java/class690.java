import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public abstract class class690 extends class108 {

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "[I")
    public static int[] field9742 = new int[1024];

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "Lcb;")
    public static class318 field9741 = new class318(28, -1);

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "Lrh;")
    public static class59 field9744 = new class59();

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "I")
    public static int field9746 = 0;

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "F")
    public static float field9748 = 0.0F;

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
    public static int field9738;

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
    public static int field9739;

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "I")
    public static int field9740;

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "I")
    public static int field9743;

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "I")
    public static int field9745;

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "I")
    public static int field9747;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Loa;IILrh;I)V")
    public static final void method3820(class689 arg0, int arg1, int arg2, class59 arg3, int arg4) {
        class626.field8524.method365(arg2);
        field9739++;
        if (class456.field6219) {
            return;
        }
        for (class588 var5 = (class588) arg3.method374((byte) 77); var5 != null; var5 = (class588) arg3.method372(-20740)) {
            class679 var6 = class561.field7649.method218(var5.field8076, (byte) 13);
            if (class542.method3057((byte) 25, var6)) {
                boolean var7 = class465.method2635(var6, var5, 4710, arg0, arg4, arg1);
                if (var7) {
                    class668.method3704(var5, var6, (byte) -89, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIZII)V")
    public static final void method3821(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field9738++;
        if (arg2 != 0) {
            return;
        }
        long var6 = (long) (arg1 | (arg3 ? Integer.MIN_VALUE : 0));
        class149 var8 = (class149) class452.field6159.method2506(82, var6);
        if (var8 == null) {
            var8 = new class149();
            class452.field6159.method2504(var6, -10, var8);
        }
        if (arg4 >= var8.field1873.length) {
            int[] var9 = new int[arg4 + 1];
            int[] var10 = new int[arg4 + 1];
            for (int var11 = 0; var11 < var8.field1873.length; var11++) {
                var9[var11] = var8.field1873[var11];
                var10[var11] = var8.field1877[var11];
            }
            for (int var12 = var8.field1873.length; var12 < arg4; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field1877 = var10;
            var8.field1873 = var9;
        }
        var8.field1873[arg4] = arg5;
        var8.field1877[arg4] = arg0;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZI)V")
    public static final void method3822(boolean arg0, int arg1) {
        field9740++;
        if (!arg0) {
            field9748 = -0.32737792F;
        }
        if (!class42.method251(arg1, 0)) {
            return;
        }
        class188[] var2 = class328.field4799[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class188 var4 = var2[var3];
            if (var4 != null) {
                var4.field2368 = 0;
                var4.field2343 = 1;
                var4.field2316 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V")
    public static void method3823(byte arg0) {
        field9741 = null;
        if (arg0 > -24) {
            method3823((byte) -126);
        }
        field9742 = null;
        field9744 = null;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZLe;ILjava/awt/Canvas;)Loa;")
    public static final class689 method3824(boolean arg0, class479 arg1, int arg2, Canvas arg3) {
        field9743++;
        if (arg2 > -103) {
            method3821(-79, 21, -20, true, 109, -55);
        }
        return arg0 ? new class527(arg3, arg1) : new class300(arg3, arg1);
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)Lcn;")
    public abstract class322 method1328(int arg0);
}

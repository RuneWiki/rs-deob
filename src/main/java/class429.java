import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class429 extends class122 {

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BIIIII)V")
    public static final void method2566(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6295++;
        int var6 = class537.method3051(-10168, arg2, class239.field3747, class520.field7329);
        int var7 = class537.method3051(-10168, arg4, class239.field3747, class520.field7329);
        int var8 = class537.method3051(-10168, arg3, class248.field3859, class15.field153);
        int var9 = class537.method3051(-10168, arg1, class248.field3859, class15.field153);
        for (int var10 = var6; var10 <= var7; var10++) {
            class58.method623(arg5, var9, 23309, class651.field9125[var10], var8);
        }
        if (arg0 < 57) {
            field6294 = -62;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Lcfa;")
    public static final class152 method2567(int arg0, int arg1) {
        field6296++;
        class152 var2 = (class152) class143.field2112.method2287(arg0 ^ 0xFFFFFFFC, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class46.field721.method3007(1, arg1, 5);
        class152 var4 = new class152();
        var4.field2192 = arg1;
        if (var3 != null) {
            var4.method1071(new class695(var3), -22661);
        }
        var4.method1070(false);
        if (~var4.field2185 == arg0 && class502.field7111.method1405((long) arg1, (byte) -65) == null) {
            class502.field7111.method1403((byte) -18, new class111(class461.field6644), (long) arg1);
            class693.field9739[class461.field6644++] = var4;
        }
        class143.field2112.method2291(var4, (long) arg1, 1);
        return var4;
    }
}

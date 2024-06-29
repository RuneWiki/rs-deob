import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class255 {

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "Lpp;")
    public static class464 field3706 = new class464(50, 2);

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "Z")
    public static boolean field3709 = false;

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V")
    public static final void method1603(int arg0) {
        class142.field2216.method2404((byte) -82);
        field3707++;
        if (arg0 != 2) {
            field3709 = false;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)V")
    public static void method1604(byte arg0) {
        int var1 = -17 / ((arg0 - 38) / 38);
        field3706 = null;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILae;IIIZ)Ljava/awt/Frame;")
    public static final Frame method1605(int arg0, class40 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3708++;
        if (!arg1.method350(-111)) {
            return null;
        }
        if (arg2 == 0) {
            class145[] var6 = class460.method2692(arg1, 43);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field2236 == arg0 && var6[var8].field2237 == arg3 && (arg4 == 0 || var6[var8].field2238 == arg4) && (!var7 || arg2 < var6[var8].field2234)) {
                    var7 = true;
                    arg2 = var6[var8].field2234;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class329 var9 = arg1.method351(arg2, arg4, (byte) -126, arg0, arg3);
        if (!arg5) {
            method1605(117, null, 81, 99, -34, true);
        }
        while (var9.field4739 == 0) {
            class210.method1342(-98, 10L);
        }
        Frame var10 = (Frame) var9.field4737;
        if (var10 == null) {
            return null;
        } else if (var9.field4739 == 2) {
            class499.method2843(arg1, (byte) 10, var10);
            return null;
        } else {
            return var10;
        }
    }
}

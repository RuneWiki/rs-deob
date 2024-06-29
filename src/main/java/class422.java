import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class422 {

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field6188 = 0;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "Lph;")
    public static class114 field6190 = new class114(4);

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    public static int field6191 = 0;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
    public static int field6189;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sp", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field6192;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sp", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field6193;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sp", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field6194;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
    public static void method2627(int arg0) {
        int var1 = 111 % ((-arg0 - 78) / 33);
        field6190 = null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIII)V")
    public static final void method2628(int arg0, int arg1, int arg2, int arg3) {
        field6189++;
        class40 var4 = class162.method872(arg3, (byte) 92, arg2);
        var4.method190(0);
        var4.field413 = arg0;
        var4.field418 = arg1;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Llh;Ljava/awt/Canvas;IILal;Z)Lvm;")
    public static final class322 method2629(class450 arg0, Canvas arg1, int arg2, int arg3, class369 arg4, boolean arg5) {
        field6186++;
        try {
            Class var6 = Class.forName("ql");
            Constructor var7 = var6.getConstructor(field6192 == null ? (field6192 = method2631("java.awt.Canvas")) : field6192, field6193 == null ? (field6193 = method2631("al")) : field6193, Integer.TYPE, Integer.TYPE, field6194 == null ? (field6194 = method2631("lh")) : field6194);
            if (!arg5) {
                field6191 = 110;
            }
            return (class322) var7.newInstance(arg1, arg4, Integer.valueOf(arg3), new Integer(arg2), arg0);
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZI)V")
    public static final void method2630(boolean arg0, int arg1) {
        field6187++;
        class40 var2 = class162.method872(arg1, (byte) 92, 14);
        var2.method193(-64);
        if (arg0) {
            field6188 = -104;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2631(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class class183 {

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Leh;")
    public static class47 field3512 = class195.method1282((byte) -4, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Leh;")
    private static class47 field3515 = class195.method1282((byte) -4, "Loaded wordpack");

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Leh;")
    public static class47 field3511 = field3515;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I")
    public abstract int method251(byte arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILah;IZLah;)Lma;")
    public static final class109 method1220(int arg0, class9 arg1, int arg2, boolean arg3, class9 arg4) {
        field3514++;
        boolean var5 = true;
        int[] var6 = arg4.method61(0, arg2);
        if (arg0 != 2101587688) {
            method1221(-96);
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method57(var6[var7], -85, arg2);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg3) {
                    var10 = arg1.method57(var9, -112, 0);
                } else {
                    var10 = arg1.method57(0, -60, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class109(arg4, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method1221(int arg0) {
        field3512 = null;
        field3511 = null;
        if (arg0 != 0) {
            method1220(-32, null, 79, false, null);
        }
        field3515 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method1222(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3510++;
        int var8 = 2 / ((-arg0 - 28) / 52);
        if (class57.method493(arg7, 2093369712)) {
            class6.method28(arg6, arg4, arg5, arg3, class51.field986[arg7], -1, arg1, -29618, arg2);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method250(Component arg0, byte arg1);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method252(byte arg0, Component arg1);
}

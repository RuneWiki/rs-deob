import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class123 {

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "Lro;")
    public static class249 field1646 = null;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "[I")
    public static int[] field1645 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field1647 = 0;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "Lqj;")
    public static class238 field1642;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "Lqj;")
    public static class238 field1649;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "Z")
    public static boolean field1648;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)Lhl;")
    public static final class60 method846(int arg0, int arg1, int arg2) {
        class10 var3 = class343.field5032[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class60 var4 = var3.field121;
            var3.field121 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/awt/Component;Lud;IBI)Lwi;")
    public static final class214 method847(Component arg0, class2 arg1, int arg2, byte arg3, int arg4) {
        field1643++;
        if (class29.field505 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class214 var5 = (class214) Class.forName("vk").getDeclaredConstructor().newInstance();
                var5.field3067 = arg2;
                var5.field3062 = new int[(class215.field3079 ? 2 : 1) * 256];
                var5.method380(arg0);
                var5.field3074 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field3074 > 16384) {
                    var5.field3074 = 16384;
                }
                var5.method376(var5.field3074);
                if (class94.field1301 > 0 && class308.field4404 == null) {
                    class308.field4404 = new class297();
                    class308.field4404.field4274 = arg1;
                    arg1.method25((byte) 107, class308.field4404, class94.field1301);
                }
                if (class308.field4404 != null) {
                    if (class308.field4404.field4269[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class308.field4404.field4269[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class397 var6 = new class397(arg1, arg4);
                    var6.field3067 = arg2;
                    var6.field3062 = new int[(class215.field3079 ? 2 : 1) * 256];
                    var6.method380(arg0);
                    var6.field3074 = 16384;
                    var6.method376(var6.field3074);
                    if (class94.field1301 > 0 && class308.field4404 == null) {
                        class308.field4404 = new class297();
                        class308.field4404.field4274 = arg1;
                        arg1.method25((byte) 107, class308.field4404, class94.field1301);
                    }
                    if (arg3 != 91) {
                        field1648 = true;
                    }
                    if (class308.field4404 != null) {
                        if (class308.field4404.field4269[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class308.field4404.field4269[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class214();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZIILfg;II)V")
    public static final void method848(int arg0, boolean arg1, int arg2, int arg3, class18 arg4, int arg5, int arg6) {
        field1644++;
        if (arg1) {
            field1648 = false;
        }
        class374.method2475(arg6, 31496, arg2, arg4.field5298, arg4.field5284, arg0, 0, arg5, arg3);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
    public static void method849(byte arg0) {
        field1646 = null;
        if (arg0 >= -111) {
            field1646 = null;
        }
        field1649 = null;
        field1642 = null;
        field1645 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZLaf;)V")
    public static final void method850(boolean arg0, class102 arg1) {
        arg1.field1370 = arg0;
        field1650++;
        if (arg1.field1372 != null) {
            arg1.field1372.field1164 = 0;
        }
        for (class102 var2 = arg1.method167(); var2 != null; var2 = arg1.method165()) {
            method850(false, var2);
        }
    }
}

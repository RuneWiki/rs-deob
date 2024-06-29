import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class161 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Leb;")
    private static class230 field2875 = class68.method589(0, "Loading textures )2 ");

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Leb;")
    public static class230 field2876 = field2875;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Leb;")
    public static class230 field2879 = class68.method589(0, "<col=00ffff>");

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILka;II)V")
    public static final void method1211(int arg0, int arg1, class245 arg2, int arg3, int arg4) {
        if (arg0 != 14005) {
            field2879 = null;
        }
        if (class34.field639 < 3) {
            ((class10) class248.field4404).method110(arg3, arg1, arg2.field4325, arg2.field4307, class248.field4404.field1458 / 2, class248.field4404.field1463 / 2, class34.field641, 256, arg2.field4314, arg2.field4241);
        } else {
            class87.method714(arg3, arg1, 0, arg2.field4314, arg2.field4241);
        }
        field2874++;
        class125.field2198[arg4] = true;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/awt/Component;BIILfh;)Loe;")
    public static final class140 method1212(Component arg0, byte arg1, int arg2, int arg3, class129 arg4) {
        field2878++;
        if (class55.field1011 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class140 var5 = (class140) Class.forName("jd").getDeclaredConstructor().newInstance();
                var5.field2522 = arg3;
                var5.field2493 = new int[(class157.field2804 ? 2 : 1) * 256];
                var5.method689(arg0);
                var5.field2521 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field2521 > 16384) {
                    var5.field2521 = 16384;
                }
                var5.method685(var5.field2521);
                if (class169.field2998 > 0 && class131.field2352 == null) {
                    class131.field2352 = new class48();
                    class131.field2352.field847 = arg4;
                    arg4.method1019(class131.field2352, (byte) 84, class169.field2998);
                }
                int var6 = 75 / ((5 - arg1) / 45);
                if (class131.field2352 != null) {
                    if (class131.field2352.field843[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class131.field2352.field843[arg2] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class256 var7 = new class256(arg4, arg2);
                    var7.field2522 = arg3;
                    var7.field2493 = new int[(class157.field2804 ? 2 : 1) * 256];
                    var7.method689(arg0);
                    var7.field2521 = 16384;
                    var7.method685(var7.field2521);
                    if (class169.field2998 > 0 && class131.field2352 == null) {
                        class131.field2352 = new class48();
                        class131.field2352.field847 = arg4;
                        arg4.method1019(class131.field2352, (byte) 118, class169.field2998);
                    }
                    if (class131.field2352 != null) {
                        if (class131.field2352.field843[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class131.field2352.field843[arg2] = var7;
                    }
                    return var7;
                } catch (Throwable var8) {
                    return new class140();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
    public static void method1213(boolean arg0) {
        if (arg0) {
            field2879 = null;
            field2876 = null;
            field2875 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method1214(byte[] arg0, boolean arg1) {
        if (!arg1) {
            return null;
        }
        field2873++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class43.method376(arg0, 0, var3, 0, var2);
        return var3;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class236 {

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3736 = new String[200];

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3738 = " has logged out.";

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "[I")
    public static int[] field3739 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "Z")
    public static boolean field3740 = false;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "[[Lej;")
    public static class52[][] field3742;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 4)
    public static void method1624(int arg0) {
        if (arg0 != 768) {
            method1624(-122);
        }
        field3738 = null;
        field3742 = (class52[][]) null;
        field3739 = null;
        field3736 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIII)Z", line = 19)
    public static final boolean method1625(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class347.field5560 * arg0 + class160.field2555 * arg3 >> 16;
        int var6 = class347.field5560 * arg3 - class160.field2555 * arg0 >> 16;
        int var7 = class292.field4845 * arg1 + class197.field3022 * var6 >> 16;
        int var8 = class197.field3022 * arg1 - class292.field4845 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class292.field4845 * arg2 + class197.field3022 * var6 >> 16;
        int var12 = class197.field3022 * arg2 - class292.field4845 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class361.field5696 && var13 < class361.field5696) {
            return false;
        } else if (var9 > class293.field4861 && var13 > class293.field4861) {
            return false;
        } else if (var10 < class296.field4918 && var14 < class296.field4918) {
            return false;
        } else {
            return var10 <= class9.field110 || var14 <= class9.field110;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Lml;", line = 75)
    public static final class178 method1626(int arg0) {
        field3741++;
        if (arg0 != -13528) {
            method1626(125);
        }
        try {
            return new class63();
        } catch (Throwable var4) {
            try {
                return (class178) Class.forName("de").getDeclaredConstructor().newInstance();
            } catch (Throwable var3) {
                return new class323();
            }
        }
    }
}

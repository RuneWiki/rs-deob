import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class260 {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3780 = "green:";

    @OriginalMember(owner = "client!od", name = "b", descriptor = "[Z")
    public static boolean[] field3781 = new boolean[100];

    @OriginalMember(owner = "client!od", name = "e", descriptor = "[Z")
    public static boolean[] field3784 = new boolean[112];

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Lrc;")
    public static class9 field3785 = new class9(64);

    @OriginalMember(owner = "client!od", name = "h", descriptor = "[Lfd;")
    public static class58[] field3787 = new class58[14];

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3788 = "glow3:";

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Lrc;")
    public static class9 field3786 = new class9(16);

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Lrc;")
    public static class9 field3789 = new class9(200);

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field3790 = 0;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[B")
    public static final byte[] method1665(int arg0, int arg1) {
        int var2 = 105 / ((72 - arg1) / 50);
        class175 var3 = (class175) class42.field514.method1567((long) arg0, 8);
        if (var3 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg0);
            for (int var6 = 0; var6 < 255; var6++) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class198.method1277((byte) 37, var8, var5);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[511 - var7] = var10;
            }
            var3 = new class175(var4);
            class42.field514.method1568((byte) -85, var3, (long) arg0);
        }
        field3782++;
        return var3.field2493;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method1666(int arg0) {
        field3787 = null;
        if (arg0 > -49) {
            field3781 = null;
        }
        field3788 = null;
        field3786 = null;
        field3785 = null;
        field3789 = null;
        field3781 = null;
        field3784 = null;
        field3780 = null;
    }
}

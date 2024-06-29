import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class48 {

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Ljf;")
    public static class229 field871 = class212.method1457((byte) 108, "M");

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field867 = 0;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Ljf;")
    public static class229 field868 = class212.method1457((byte) 63, "clignotant1:");

    @OriginalMember(owner = "client!m", name = "g", descriptor = "[Z")
    public static boolean[] field873 = new boolean[200];

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Ljg;")
    public static class303 field870 = new class303();

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Ljf;")
    public static class229 field874 = class212.method1457((byte) 107, ":trade:");

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Ljf;")
    public static class229 field876 = class212.method1457((byte) 105, "Versteckt");

    @OriginalMember(owner = "client!m", name = "l", descriptor = "[[B")
    public static byte[][] field878 = new byte[50][];

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field879 = -1;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Ljf;")
    public static class229 field880 = class212.method1457((byte) 70, "<col=00ffff>");

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "[I")
    public static int[] field869;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 17)
    public static void method408(byte arg0) {
        field871 = null;
        field869 = null;
        field873 = null;
        field868 = null;
        field876 = null;
        field870 = null;
        field878 = (byte[][]) null;
        field880 = null;
        if (arg0 > 101) {
            field874 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Z", line = 43)
    public static final boolean method409(int arg0) {
        field872++;
        return ~class318.field5373 == arg0 ? class184.field3186.method2205((byte) -84) : true;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLek;Lek;BI)Lll;", line = 60)
    public static final class158 method410(boolean arg0, class185 arg1, class185 arg2, byte arg3, int arg4) {
        field877++;
        int var5 = 7 % ((20 - arg3) / 58);
        boolean var6 = true;
        int[] var7 = arg2.method1280(arg4, (byte) 80);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg2.method1272(var7[var8], 123, arg4);
            if (var9 == null) {
                var6 = false;
            } else {
                int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
                byte[] var11;
                if (arg0) {
                    var11 = arg1.method1272(var10, 96, 0);
                } else {
                    var11 = arg1.method1272(0, 81, var10);
                }
                if (var11 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class158(arg2, arg1, arg4, arg0);
        } catch (Exception var13) {
            return null;
        }
    }
}

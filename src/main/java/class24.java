import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public abstract class class24 {

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field260 = 0;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field269 = -1;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "[B")
    public static byte[] field268 = new byte[520];

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "[I")
    public static int[] field275 = new int[2000];

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public int field259;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public int field261;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public int field262;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public int field265;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public int field270;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public int field276;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "Lwi;")
    public static class242 field271;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "Lhi;")
    public static class26 field274;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "Z")
    public static boolean field273;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V", line = 7)
    public static void method122(boolean arg0) {
        field268 = null;
        field271 = null;
        field275 = null;
        if (!arg0) {
            field274 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;B)Lmh;", line = 27)
    public static final class62 method123(String arg0, byte arg1) {
        if (arg1 <= 77) {
            method125(-3L, false, -11, 64, -23);
        }
        field267++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg0.getBytes();
        }
        class62 var4 = new class62();
        var4.field893 = 0;
        var4.field906 = var2;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field893++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(JZIII)Lmh;", line = 70)
    public static final class62 method125(long arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field272++;
        class62 var6 = class296.method2005(0, -1757618132);
        if (arg0 < 0L) {
            var6.method403(class264.field4454, false);
            arg0 = -arg0;
        }
        class62 var7 = class5.field56;
        class62 var8 = class150.field2366;
        if (arg4 == 1) {
            var8 = class5.field56;
            var7 = class150.field2366;
        }
        if (arg4 == 2) {
            var8 = class53.field774;
            var7 = class150.field2366;
        }
        class62 var9 = class296.method2005(arg3, arg3 - 1757618132);
        class62 var10 = class296.method2005(0, -1757618132);
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method403(class42.method284((int) (arg0 % 10L), -117), false);
            arg0 /= 10L;
        }
        if (arg0 == 0L) {
            var9 = class300.field5142;
        }
        int var12 = 0;
        while (arg0 > 0L) {
            if (arg1 && var12 != 0 && var12 % 3 == 0) {
                var9.method403(var8, false);
            }
            var12++;
            var9.method403(class42.method284((int) (arg0 % 10L), arg3 ^ 0xFFFFFF8B), false);
            arg0 /= 10L;
        }
        if (var10.method439(-124) > 0) {
            var10.method403(var7, false);
        }
        return class254.method1772(new class62[] { var6, var9.method408(arg3 - 1), var10.method408(-1) }, 0);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
    public abstract void method124(int arg0, int arg1);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V")
    public abstract void method126(int arg0, int arg1, int arg2);
}

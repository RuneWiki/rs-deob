import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class336 extends class130 {

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "I")
    public static int field5062 = -2;

    @OriginalMember(owner = "client!wp", name = "u", descriptor = "I")
    public static int field5064 = 0;

    @OriginalMember(owner = "client!wp", name = "x", descriptor = "Z")
    public static boolean field5067 = false;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "I")
    public int field5058;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!wp", name = "w", descriptor = "I")
    public int field5066;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "[I")
    public int[] field5060;

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "[I")
    public static int[] field5061;

    @OriginalMember(owner = "client!wp", name = "t", descriptor = "[I")
    public int[] field5063;

    @OriginalMember(owner = "client!wp", name = "v", descriptor = "[I")
    public int[] field5065;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "[Lwk;")
    public class329[] field5055;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "[Lwk;")
    public class329[] field5057;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "[[[B")
    public byte[][][] field5054;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V", line = 12)
    public static void method2186(int arg0) {
        if (arg0 == 3) {
            field5061 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIII)I", line = 23)
    public static final int method2187(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field5059++;
        if (arg0 <= 35) {
            method2188(false, -28, true, null);
        }
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZIZLur;)V", line = 54)
    public static final void method2188(boolean arg0, int arg1, boolean arg2, class295 arg3) {
        field5056++;
        int var4 = arg3.field4546;
        int var5 = (int) arg3.field1932;
        arg3.method947((byte) 98);
        if (arg1 != 1) {
            field5061 = null;
        }
        if (arg0) {
            class52.method342(1, var4);
        }
        class426.method2661(25, var4);
        class38 var6 = class159.method1143(arg1 ^ 0xEAB52A31, var5);
        if (var6 != null) {
            class5.method27(var6, -208246073);
        }
        class396.method2501(-28916);
        if (!arg2 && class134.field2010 != -1) {
            class306.method2022(class134.field2010, 1, (byte) 126);
        }
        class1 var7 = new class1(class215.field3248);
        for (class295 var8 = (class295) var7.method3(0); var8 != null; var8 = (class295) var7.method2((byte) -111)) {
            if (!var8.method949(1767)) {
                var8 = (class295) var7.method3(0);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field4542 == 3) {
                int var9 = (int) var8.field1932;
                if ((var9 >>> 16) == var4) {
                    method2188(true, arg1, arg2, var8);
                }
            }
        }
    }
}

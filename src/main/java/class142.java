import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class142 extends class335 {

    @OriginalMember(owner = "client!nr", name = "W", descriptor = "I")
    public static int field1852 = 0;

    @OriginalMember(owner = "client!nr", name = "L", descriptor = "Lqu;")
    public static class364 field1850 = new class364(66, 2);

    @OriginalMember(owner = "client!nr", name = "Y", descriptor = "[[I")
    public static int[][] field1854 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!nr", name = "Z", descriptor = "Lgu;")
    public static class126 field1855 = new class126();

    @OriginalMember(owner = "client!nr", name = "S", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!nr", name = "ab", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!nr", name = "X", descriptor = "[[B")
    public static byte[][] field1853;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILwca;)Ljava/lang/String;")
    public static final String method854(int arg0, class311 arg1) {
        if (arg0 != 22227) {
            return null;
        } else {
            ++field1856;
            if (~client.method3619(arg1).method3517((byte) 92) == -1) {
                return null;
            } else if (arg1.field4683 != null && ~arg1.field4683.trim().length() != -1) {
                return arg1.field4683;
            } else {
                return class220.field3252 ? "Hidden-use" : null;
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(B)V")
    public static void method855(byte arg0) {
        field1854 = null;
        if (arg0 <= 47) {
            field1854 = null;
        }
        field1853 = null;
        field1850 = null;
        field1855 = null;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BI)[[I")
    public final int[][] method78(byte arg0, int arg1) {
        ++field1851;
        int[][] var3 = super.field5364.method3064(1, arg1);
        if (super.field5364.field7632 && this.method2092((byte) 99)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field4921 * super.field4921;
            for (int var8 = 0; class41.field455 > var8; ++var8) {
                int var9 = super.field4928[var8 % super.field4926 + var7];
                var6[var8] = class637.method3693(4080, var9 << 4);
                var5[var8] = class637.method3693(4080, var9 >> 4);
                var4[var8] = class637.method3693(var9, 16711680) >> 12;
            }
        }
        if (arg0 != 36) {
            method854(-123, (class311) null);
        }
        return var3;
    }
}

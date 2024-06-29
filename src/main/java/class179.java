import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class179 extends class329 {

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public int field2315;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public int field2317;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "[[B")
    public static byte[][] field2311 = new byte[250][];

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field2313 = -1;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "[F")
    public static float[] field2314 = new float[4];

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
    public static final void method1129(boolean arg0, String arg1, boolean arg2) {
        field2316++;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = (arg2 ? class428.field5360.field9474 : class428.field5360.field9476) + var6;
        if (!arg0) {
            return;
        }
        for (int var8 = var6; var8 < var7; var8++) {
            class629 var11 = class428.field5360.method3781(var8, (byte) 18);
            if (var11.field8770 && var11.method3455((byte) 93).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class530.field7163 = -1;
                    class182.field2328 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class530.field7163 = var5;
        class182.field2328 = var4;
        class467.field5936 = 0;
        String[] var9 = new String[class530.field7163];
        for (int var10 = 0; var10 < class530.field7163; var10++) {
            var9[var10] = class428.field5360.method3781(var4[var10], (byte) 79).method3455((byte) 33);
        }
        class356.method1953(class182.field2328, var9, 0);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method1130(int arg0) {
        if (arg0 != 16) {
            field2314 = null;
        }
        field2311 = null;
        field2314 = null;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(II)V")
    public class179(int arg0, int arg1) {
        this.field2315 = arg0;
        this.field2317 = arg1;
    }
}

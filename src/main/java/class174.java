import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class174 {

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "[[B")
    public static byte[][] field3205 = new byte[1000][];

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Z")
    public static boolean field3204 = false;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Lid;")
    public static class149 field3208 = class60.method382("welle:", (byte) 12);

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3201;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Z")
    public static boolean field3207;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "[S")
    public static short[] field3202;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)Lle;")
    public static final class43 method1236(int arg0) {
        if (arg0 >= -73) {
            return null;
        }
        field3206++;
        try {
            return (class43) Class.forName("ih").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static void method1237(byte arg0) {
        if (arg0 >= 22) {
            field3208 = null;
            field3201 = null;
            field3202 = null;
            field3205 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method1238(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3203++;
        int var8 = arg4 + arg6;
        int var9 = arg2 - arg6;
        int var10 = arg0 - arg6;
        for (int var11 = arg4; var11 < var8; var11++) {
            class141.method987(2, arg7, class15.field220[var11], arg0, arg3);
        }
        int var12 = arg6 + arg7;
        int var13 = arg2;
        if (!arg1) {
            field3202 = null;
        }
        while (var13 > var9) {
            class141.method987(2, arg7, class15.field220[var13], arg0, arg3);
            var13--;
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class15.field220[var14];
            class141.method987(2, arg7, var15, var12, arg3);
            class141.method987(2, var12, var15, var10, arg5);
            class141.method987(2, var10, var15, arg0, arg3);
        }
    }
}

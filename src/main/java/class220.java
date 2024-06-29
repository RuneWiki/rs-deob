import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class220 {

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Liba;")
    public static class211 field2919 = new class211(52, -1);

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public int field2918;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public int field2920;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public int field2921;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public int field2922;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public int field2924;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public int field2926;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "[[Lps;")
    public static class5[][] field2917;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([Ljava/lang/Object;B[I)V", line = 9)
    public static final void method1382(Object[] arg0, byte arg1, int[] arg2) {
        class390.method2417(0, arg0, arg2.length - 1, arg2, 41);
        if (arg1 > -13) {
            field2917 = null;
        }
        field2923++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 22)
    public static void method1383(int arg0) {
        field2917 = null;
        int var1 = -79 % ((arg0 + 29) / 58);
        field2919 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([BB)Lf;", line = 36)
    public static final class256 method1384(byte[] arg0, byte arg1) {
        field2925++;
        if (arg0 == null) {
            throw new RuntimeException("");
        }
        if (arg1 < 112) {
            method1384(null, (byte) -53);
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                MediaTracker var3 = new MediaTracker(class420.field6187);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class420.field6187);
                int var5 = var2.getHeight(class420.field6187);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class332.field4821.method704(var6, 0, var4, var4, var5);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V", line = 78)
    public static final void method1385(boolean arg0) throws IOException {
        if (!arg0) {
            method1382(null, (byte) -21, null);
        }
        if (class230.field3051 != null && class267.field3485 > 0) {
            int var1 = 0;
            while (true) {
                class654 var2 = (class654) class474.field6805.method1904(false);
                if (var2 == null) {
                    class227.field3021 = 0;
                    class355.field5255 += var1;
                    break;
                }
                class230.field3051.method1363(false, 0, var2.field9360, var2.field9358.field7952);
                var1 += var2.field9360;
                class267.field3485 -= var2.field9360;
                var2.method2360((byte) 66);
                var2.field9358.method3150(-26792);
                var2.method3701(76);
            }
        }
        field2928++;
    }
}

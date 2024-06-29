import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class112 {

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Ljava/util/Random;")
    public static Random field1874 = new Random();

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public int field1872;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public int field1875;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public int field1876;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public int field1877;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "J")
    public long field1879;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Luk;")
    public class104 field1871;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Luk;")
    public class104 field1873;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Luk;")
    public class104 field1880;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Ldd;")
    public static class272 field1881;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "[[Z")
    public static boolean[][] field1878;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 13)
    public static void method960(byte arg0) {
        field1878 = (boolean[][]) null;
        field1874 = null;
        if (arg0 > -13) {
            method961(0.034497628068270954D, -88);
        }
        field1881 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(DI)V", line = 44)
    public static final void method961(double arg0, int arg1) {
        field1870++;
        if (class51.field791 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class298.field4757[var3] = var4 <= 255 ? var4 : 255;
            }
            class51.field791 = arg0;
        }
        if (arg1 != 20526) {
            method961(-0.15681489125485967D, -86);
        }
    }
}

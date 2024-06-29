import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class79 implements Runnable {

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Z")
    public boolean field1861 = true;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Ljava/lang/Object;")
    public Object field1864 = new Object();

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "[I")
    public int[] field1868 = new int[500];

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "[I")
    public int[] field1869 = new int[500];

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public int field1867 = 0;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Z")
    public static boolean field1863 = false;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Lu;")
    public static class135 field1865 = class87.method676((byte) -122, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1858 = 0;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Le;")
    public static class29 field1857 = new class29(200);

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "[I")
    public static int[] field1881 = new int[2000];

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "Lu;")
    public static class135 field1877 = class87.method676((byte) -93, "backvmid1");

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "Lu;")
    public static class135 field1876 = class87.method676((byte) -43, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "[Lpe;")
    public static class109[] field1886 = new class109[256];

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "Lu;")
    public static class135 field1888 = class87.method676((byte) -123, ":tradereq:");

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public static int field1885 = 0;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field1884 = 0;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "Lu;")
    private static class135 field1873 = class87.method676((byte) -77, "wave2:");

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Lu;")
    public static class135 field1871 = field1873;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "Lu;")
    public static class135 field1882 = field1873;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "Lu;")
    public static class135 field1875 = class87.method676((byte) -52, "backbase1");

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "Lu;")
    private static class135 field1890 = class87.method676((byte) -98, "Please try using a different world)3");

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "Lu;")
    public static class135 field1880 = field1890;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "Lu;")
    public static class135 field1883 = field1890;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "Lu;")
    public static class135 field1889 = field1890;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Lu;")
    public static class135 field1872 = field1890;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Lu;")
    public static class135 field1870 = field1890;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "Lu;")
    public static class135 field1874 = field1890;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "Le;")
    public static class29 field1878 = new class29(64);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "Lof;")
    public static class103 field1879;

    @OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field1861) {
            Object var1 = this.field1864;
            synchronized (this.field1864) {
                if (this.field1867 < 500) {
                    this.field1868[this.field1867] = class53.field1278;
                    this.field1869[this.field1867] = class76.field1798;
                    this.field1867++;
                }
            }
            class96.method795(50L, 92);
        }
        field1866++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static final void method625(int arg0) {
        for (class58 var1 = (class58) class41.field955.method182((byte) 50); var1 != null; var1 = (class58) class41.field955.method181((byte) 110)) {
            if (var1.field1436 != null) {
                class65.field1645.method1182(var1.field1436);
                var1.field1436 = null;
            }
            if (var1.field1427 != null) {
                class65.field1645.method1182(var1.field1427);
                var1.field1427 = null;
            }
        }
        if (arg0 != 0) {
            method627(-92);
        }
        class41.field955.method188(125);
        field1860++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLg;II)Z")
    public static final boolean method626(byte arg0, class43 arg1, int arg2, int arg3) {
        field1856++;
        if (arg0 >= -26) {
            method627(1);
        }
        byte[] var4 = arg1.method324(0, arg3, arg2);
        if (var4 == null) {
            return false;
        } else {
            class101.method831(var4, (byte) -40);
            return true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static void method627(int arg0) {
        field1878 = null;
        field1881 = null;
        field1877 = null;
        field1875 = null;
        field1883 = null;
        field1879 = null;
        field1874 = null;
        field1870 = null;
        field1890 = null;
        field1872 = null;
        field1873 = null;
        field1871 = null;
        field1857 = null;
        field1882 = null;
        field1889 = null;
        field1886 = null;
        field1888 = null;
        if (arg0 != 200) {
            field1883 = null;
        }
        field1865 = null;
        field1880 = null;
        field1876 = null;
    }
}

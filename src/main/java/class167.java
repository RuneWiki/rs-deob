import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class167 {

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "[I")
    public static int[] field2871 = new int[50];

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "Ljd;")
    public static class85 field2877 = class221.method1499("Bitte warten Sie)3)3)3", (byte) 109);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public int field2870;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public int field2872;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public int field2874;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public int field2881;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "J")
    public long field2883;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "Lqb;")
    public class56 field2873;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "Lqb;")
    public class56 field2879;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "Lqb;")
    public class56 field2880;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "Ljava/awt/Frame;")
    public static Frame field2882;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "[I")
    public static int[] field2876;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method1124(int arg0) {
        if (arg0 == 99999999) {
            field2871 = null;
            field2876 = null;
            field2882 = null;
            field2877 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIILjd;BJ)V")
    public static final void method1125(int arg0, int arg1, int arg2, int arg3, class85 arg4, byte arg5, long arg6) {
        class247 var8 = new class247(128);
        var8.method1714(10, -714043120);
        field2878++;
        var8.method1703((int) (Math.random() * 99999.0D), -112);
        var8.method1703(511, -118);
        var8.method1674((byte) 101, arg6);
        var8.method1715((int) (Math.random() * 9.9999999E7D), (byte) -92);
        var8.method1698((byte) -72, arg4);
        var8.method1715((int) (Math.random() * 9.9999999E7D), (byte) 122);
        var8.method1703(class245.field4191, -92);
        var8.method1714(arg2, -714043120);
        var8.method1714(arg0, -714043120);
        var8.method1715((int) (Math.random() * 9.9999999E7D), (byte) 122);
        var8.method1703(arg1, -111);
        var8.method1703(arg3, -111);
        var8.method1715((int) (Math.random() * 9.9999999E7D), (byte) -106);
        var8.method1719(class125.field2207, class125.field2208, 0);
        class207.field3618.field4224 = 0;
        class207.field3618.method1714(134, -714043120);
        if (arg5 > -120) {
            field2871 = null;
        }
        class207.field3618.method1714(var8.field4224, -714043120);
        class207.field3618.method1668(var8.field4238, 0, 255, var8.field4224);
        class177.field3032 = 0;
        class112.field1965 = -3;
        class86.field1616 = 0;
        class115.field2056 = 1;
    }
}

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class166 {

    @OriginalMember(owner = "client!r", name = "e", descriptor = "[I")
    public static int[] field2516 = new int[2];

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field2512 = 0;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "J")
    public static long field2514;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field2513;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method1146(String arg0, byte arg1) {
        field2515++;
        int var2 = arg0.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg0.charAt(var5) - var3;
        }
        if (arg1 != -30) {
            method1147((byte) 14);
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static void method1147(byte arg0) {
        field2513 = null;
        field2516 = null;
        if (arg0 > -59) {
            method1147((byte) 6);
        }
    }
}

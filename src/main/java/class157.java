import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class157 extends class181 {

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2299 = new CRC32();

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field2303 = 0;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "Lhl;")
    public static class139 field2302 = new class139(4);

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "Ljava/lang/String;")
    public static String field2306 = "Opened title screen";

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public static int field2305 = 0;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    public static volatile int field2307 = -1;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public int field2290;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public int field2297;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "[I")
    public int[] field2291;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "[I")
    public int[] field2295;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "[I")
    public int[] field2301;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "[Lec;")
    public class40[] field2294;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "[Lec;")
    public class40[] field2296;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "[[[B")
    public byte[][][] field2293;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public static final void method1060(int arg0) {
        if (arg0 < 27) {
            method1062(70, -74);
        }
        field2300++;
        class24.field387.method944(65535);
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V")
    public static void method1061(byte arg0) {
        field2306 = null;
        field2299 = null;
        int var1 = 75 / ((arg0 + 1) / 43);
        field2302 = null;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)I")
    public static final int method1062(int arg0, int arg1) {
        field2298++;
        if (arg0 < 0) {
            return 0;
        }
        class270 var2 = (class270) class155.field2273.method306((long) arg0, 16216);
        if (var2 == null) {
            return class75.method600(false, arg0).field4380;
        }
        int var3 = 0;
        for (int var4 = arg1; var4 < var2.field4213.length; var4++) {
            if (var2.field4213[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class75.method600(false, arg0).field4380 - var2.field4213.length);
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
    public static final void method1063(int arg0) {
        field2304++;
        if (arg0 != 0) {
            field2306 = null;
        }
    }
}

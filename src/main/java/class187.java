import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class187 {

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "J")
    public long field2977 = 0L;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2980 = "cyan:";

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field2979 = 0;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "[Loj;")
    public static class144[] field2975 = new class144[4];

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "[I")
    public static int[] field2984 = new int[25];

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "[I")
    public static int[] field2989 = new int[500];

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Lbc;")
    public static class139 field2974 = new class139();

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "Z")
    public static boolean field2991 = false;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2992 = new CRC32();

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public int field2981;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public int field2982;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public int field2986;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public int field2987;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public int field2988;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Lpb;")
    public class264 field2983;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "Lpb;")
    public class264 field2990;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Lkf;")
    public static class93 field2978;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static void method1302(byte arg0) {
        field2974 = null;
        field2980 = null;
        field2989 = null;
        int var1 = -5 / (arg0 / 54);
        field2975 = null;
        field2992 = null;
        field2978 = null;
        field2984 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIBI)V")
    public static final void method1303(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class196.field3129 == 1) {
            class90.field1121[class59.field757 / 100].method315(class211.field3396 - 8, class141.field2244 + -8);
        }
        if (class196.field3129 == 2) {
            class90.field1121[class59.field757 / 100 + 4].method315(class211.field3396 - 8, class141.field2244 - 8);
        }
        field2985++;
        class282.method1885((byte) -86);
        if (arg3 >= -39) {
            method1302((byte) 33);
        }
    }
}

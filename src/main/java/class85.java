import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class85 {

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Z")
    public static volatile boolean field1224 = false;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Lok;")
    private static class41 field1234 = class137.method956("Jul", 45);

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lok;")
    private static class41 field1223 = class137.method956("Jan", 45);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lok;")
    private static class41 field1222 = class137.method956("May", 45);

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Lok;")
    private static class41 field1232 = class137.method956("Mar", 45);

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Lok;")
    private static class41 field1233 = class137.method956("Apr", 45);

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "J")
    public static long field1240 = 0L;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lok;")
    private static class41 field1226 = class137.method956("Sep", 45);

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "[Z")
    public static boolean[] field1225 = new boolean[112];

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field1239 = 0;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lok;")
    private static class41 field1235 = class137.method956("Jun", 45);

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Lok;")
    private static class41 field1238 = class137.method956("Nov", 45);

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lok;")
    private static class41 field1241 = class137.method956("Dec", 45);

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "[I")
    public static int[] field1246 = new int[25];

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "Lok;")
    private static class41 field1242 = class137.method956("Feb", 45);

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Lok;")
    private static class41 field1243 = class137.method956("Oct", 45);

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "Lok;")
    private static class41 field1247 = class137.method956("Aug", 45);

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public static int field1248 = 0;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "[Lok;")
    public static class41[] field1236 = new class41[] { field1223, field1242, field1232, field1233, field1222, field1235, field1234, field1247, field1226, field1243, field1238, field1241 };

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public int field1244;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "Lmh;")
    public static class65 field1245;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "[[[B")
    public static byte[][][] field1231;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILlb;)V", line = 19)
    public final void method605(int arg0, class112 arg1) {
        while (true) {
            int var3 = arg1.method792(arg0 ^ 0xFFFFFFFD);
            if (var3 == 0) {
                field1230++;
                if (arg0 != -1) {
                    field1246 = (int[]) null;
                }
                return;
            }
            this.method606(98, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILlb;I)V", line = 37)
    private final void method606(int arg0, class112 arg1, int arg2) {
        int var4 = -54 / ((-arg0 - 2) / 47);
        if (arg2 == 1) {
            this.field1227 = arg1.method759((byte) -44);
            this.field1244 = arg1.method792(2);
            this.field1237 = arg1.method792(2);
        }
        field1228++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V", line = 104)
    public static final void method607(int arg0, int arg1) {
        field1229++;
        if (arg0 <= 0) {
            method608((byte) -70);
        }
        class252 var2 = class43.field679;
        synchronized (class43.field679) {
            class78.field1154 = arg1;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 144)
    public static void method608(byte arg0) {
        field1226 = null;
        field1225 = null;
        field1234 = null;
        field1243 = null;
        field1223 = null;
        field1236 = null;
        field1222 = null;
        field1238 = null;
        field1241 = null;
        field1245 = null;
        field1235 = null;
        field1246 = null;
        field1233 = null;
        field1247 = null;
        field1242 = null;
        if (arg0 != -102) {
            field1241 = (class41) null;
        }
        field1232 = null;
        field1231 = (byte[][][]) null;
    }
}

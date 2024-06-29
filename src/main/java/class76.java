import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class76 {

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "[I")
    public static int[] field1318 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "[J")
    public static long[] field1320 = new long[500];

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "Lbe;")
    public static class283 field1329 = class153.method941(-44, "::cardmem");

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field1328 = 50;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "[I")
    public static int[] field1323 = new int[field1328];

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "[I")
    public static int[] field1321 = new int[field1328];

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "[Lbe;")
    public static class283[] field1331 = new class283[field1328];

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "[I")
    public static int[] field1333 = new int[field1328];

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field1322 = 0;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "[I")
    public static int[] field1334 = new int[field1328];

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "[I")
    public static int[] field1326 = new int[field1328];

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "[[Z")
    public static boolean[][] field1319 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "[I")
    public static int[] field1324 = new int[field1328];

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "[I")
    public static int[] field1332 = new int[field1328];

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "[Lbe;")
    public static class283[] field1327;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "[Lhe;")
    public static class87[] field1330;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V", line = 36)
    public static final void method499(int arg0, int arg1) {
        if (arg1 != 1280) {
            method500(-91);
        }
        class291.field4930.method1637(true, arg0);
        field1317++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 53)
    public static void method500(int arg0) {
        field1323 = null;
        field1324 = null;
        field1320 = null;
        field1329 = null;
        field1321 = null;
        field1327 = null;
        field1318 = null;
        field1334 = null;
        field1332 = null;
        field1330 = null;
        field1331 = null;
        field1326 = null;
        if (arg0 == 1280) {
            field1333 = null;
            field1319 = (boolean[][]) null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class72 extends class157 {

    @OriginalMember(owner = "client!td", name = "N", descriptor = "Lcc;")
    public static class209 field1354 = class95.method669(93, "Prendre");

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field1355 = -1;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field1360 = -2;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "Lcc;")
    public static class209 field1356 = class95.method669(123, "Continuer");

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "Lcc;")
    private static class209 field1371 = class95.method669(92, "Apr");

    @OriginalMember(owner = "client!td", name = "gb", descriptor = "Lcc;")
    public static class209 field1373 = class95.method669(112, "Hidden)2use");

    @OriginalMember(owner = "client!td", name = "R", descriptor = "Lcc;")
    private static class209 field1358 = class95.method669(114, "Sep");

    @OriginalMember(owner = "client!td", name = "kb", descriptor = "Lcc;")
    private static class209 field1377 = class95.method669(97, "Dec");

    @OriginalMember(owner = "client!td", name = "jb", descriptor = "Lcc;")
    private static class209 field1376 = class95.method669(117, "Feb");

    @OriginalMember(owner = "client!td", name = "W", descriptor = "Lcc;")
    public static class209 field1363 = class95.method669(84, "Okay");

    @OriginalMember(owner = "client!td", name = "mb", descriptor = "Lcc;")
    private static class209 field1379 = class95.method669(92, "Jul");

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "Lcc;")
    private static class209 field1372 = class95.method669(120, "Mar");

    @OriginalMember(owner = "client!td", name = "nb", descriptor = "Lcc;")
    private static class209 field1380 = class95.method669(117, "Aug");

    @OriginalMember(owner = "client!td", name = "lb", descriptor = "J")
    public static long field1378 = 0L;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "Z")
    public static boolean field1364 = false;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "Lcc;")
    private static class209 field1366 = class95.method669(126, "Drop");

    @OriginalMember(owner = "client!td", name = "pb", descriptor = "Lcc;")
    private static class209 field1382 = class95.method669(81, "Jan");

    @OriginalMember(owner = "client!td", name = "hb", descriptor = "Lcc;")
    private static class209 field1374 = class95.method669(85, "Jun");

    @OriginalMember(owner = "client!td", name = "V", descriptor = "Lcc;")
    private static class209 field1362 = class95.method669(121, "Nov");

    @OriginalMember(owner = "client!td", name = "S", descriptor = "Lcc;")
    public static class209 field1359 = field1366;

    @OriginalMember(owner = "client!td", name = "ob", descriptor = "Lcc;")
    private static class209 field1381 = class95.method669(108, "Oct");

    @OriginalMember(owner = "client!td", name = "qb", descriptor = "Z")
    public static boolean field1383 = true;

    @OriginalMember(owner = "client!td", name = "rb", descriptor = "Lcc;")
    private static class209 field1384 = class95.method669(96, "May");

    @OriginalMember(owner = "client!td", name = "db", descriptor = "[Lcc;")
    public static class209[] field1370 = new class209[] { field1382, field1376, field1372, field1371, field1384, field1374, field1379, field1380, field1358, field1381, field1362, field1377 };

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "I")
    private int field1367;

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "I")
    private int field1369;

    @OriginalMember(owner = "client!td", name = "ib", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (~arg0 == -1) {
            this.method519(arg2.method776(121), 0);
        }
        ++field1361;
        if (arg1 > -29) {
            this.method250(55, -49);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILcc;)V")
    public static final void method518(int arg0, class209 arg1) {
        ++field1365;
        for (class284 var2 = (class284) class21.field396.method1119(20896); var2 != null; var2 = (class284) class21.field396.method1120(39)) {
            if (var2.field4994.method1457((byte) -98, arg1)) {
                class111.field2244 = var2;
                return;
            }
        }
        if (arg0 != 4080) {
            field1382 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class72() {
        this(0);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)V")
    private final void method519(int arg0, int arg1) {
        this.field1369 = 4080 & arg0 >> 12;
        this.field1367 = arg0 << 4 & 4080;
        this.field1368 = arg0 >> 4 & 4080;
        ++field1375;
        if (arg1 != 0) {
            this.method250(92, 112);
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I)V")
    private class72(int arg0) {
        super(0, false);
        this.method519(arg0, 0);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)[[I")
    public final int[][] method250(int arg0, int arg1) {
        ++field1357;
        int[][] var3 = super.field2872.method533(arg1, 3);
        if (super.field2872.field1434) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class226.field4124; ++var7) {
                var4[var7] = this.field1369;
                var5[var7] = this.field1368;
                var6[var7] = this.field1367;
            }
        }
        return arg0 != 1 ? null : var3;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V")
    public static void method520(byte arg0) {
        field1359 = null;
        field1382 = null;
        field1354 = null;
        if (arg0 == 108) {
            field1371 = null;
            field1358 = null;
            field1372 = null;
            field1376 = null;
            field1374 = null;
            field1379 = null;
            field1362 = null;
            field1370 = null;
            field1356 = null;
            field1381 = null;
            field1373 = null;
            field1384 = null;
            field1366 = null;
            field1363 = null;
            field1377 = null;
            field1380 = null;
        }
    }
}

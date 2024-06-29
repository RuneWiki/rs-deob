import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class79 extends class286 {

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    public static int field1363 = 0;

    @OriginalMember(owner = "client!th", name = "X", descriptor = "Lbe;")
    public static class283 field1371 = class153.method941(125, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!th", name = "W", descriptor = "Lbe;")
    public static class283 field1370 = class153.method941(125, ": ");

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    private int field1364;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    private int field1365;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "I")
    private int field1366;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!th", name = "V", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!th", name = "Y", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "[I")
    public static int[] field1367;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "(I)I", line = 4)
    public static final int method521(int arg0) {
        if (arg0 != 0) {
            method521(-8);
        }
        field1368++;
        return ((class118.field1990 == 0 ? 0 : 1) << 21) + ((class33.field501 ? 1 : 0) << 19) + (class119.field2007 & 0x3 << 17) + ((class2.field26 ? 1 : 0) << 15) + ((class83.field1408 ? 1 : 0) << 9) + ((class178.field3068 ? 1 : 0) << 7) + (class155.field2552 & 0x7) + (((class269.field4547 ? 1 : 0) << 3) - -((class228.field3839 ? 1 : 0) << 4) - -((class55.field769 ? 1 : 0) << 5)) + (((class149.field2432 ? 1 : 0) << 6) - (-((class96.field1612 ? 1 : 0) << 8) - ((class91.field1541 ? 1 : 0) << 10)) - (-((class23.field345 & 0x3) << 11) + -((class44.field601 ? 1 : 0) << 13) + -((class47.field650 ? 1 : 0) << 16) + -((class255.field4301 == 0 ? 0 : 1) << 20) + -((class33.field500 == 0 ? 0 : 1) << 22)));
    }

    @OriginalMember(owner = "client!th", name = "i", descriptor = "(I)V", line = 15)
    public static final void method522(int arg0) {
        field1369++;
        class38.field551 = (int[][][]) null;
        class74.field1297 = (short[][][]) null;
        class180.field3112 = (byte[][][]) null;
        class270.field4554 = null;
        class91.field1530 = null;
        class163.field2686 = null;
        class86.field1451 = (byte[][][]) null;
        class23.field349 = arg0;
        class309.field5291 = (int[][][]) null;
        class77.field1346 = (byte[][][]) null;
        class260.field4416 = (byte[][][]) null;
        class71.field1225 = (byte[][][]) null;
        class48.field659.method1810(93);
        class153.field2507 = null;
        class54.field725 = null;
        class12.field107 = null;
        class66.field927 = null;
        class272.field4577 = null;
        class187.field3209 = null;
        class169.field2848 = null;
        class117.field1980 = null;
        class208.field3565 = null;
        class217.field3673 = null;
        class210.field3577 = null;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(II)V", line = 50)
    private final void method523(int arg0, int arg1) {
        this.field1364 = arg0 >> 12 & arg1;
        this.field1365 = arg0 >> 4 & 0xFF0;
        field1372++;
        this.field1366 = (arg0 & 0xFF) << 4;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lfe;ZI)V", line = 61)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        field1362++;
        if (arg2 == 0) {
            this.method523(arg0.method1551(3), 4080);
        }
        if (arg1) {
            this.field1364 = 88;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V", line = 86)
    public class79() {
        this(0);
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(B)V", line = 92)
    public static void method524(byte arg0) {
        field1367 = null;
        field1370 = null;
        field1371 = null;
        int var1 = -84 / ((51 - arg0) / 42);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)[[I", line = 113)
    public final int[][] method16(int arg0, byte arg1) {
        field1361++;
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        if (this.field4878.field2524) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class27.field410; var7++) {
                var4[var7] = this.field1364;
                var6[var7] = this.field1365;
                var5[var7] = this.field1366;
            }
        }
        if (arg1 != -19) {
            method522(-41);
        }
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(I)V", line = 155)
    private class79(int arg0) {
        super(0, false);
        this.method523(arg0, 4080);
    }
}

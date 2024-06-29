import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class89 extends class166 {

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1563 = "Choose Option";

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public int field1541;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public int field1542;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public int field1545;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public int field1549;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public int field1550;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public int field1554;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
    public int field1560;

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
    public int field1561;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "I")
    public int field1562;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
    public int field1566;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "Lfk;")
    public class14 field1555;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "Ldc;")
    public class243 field1559;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "Lh;")
    public class278 field1546;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Lah;")
    public class285 field1547;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "[I")
    public static int[] field1557;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method684(int arg0, int arg1) {
        field1551++;
        if (arg1 < 999999999) {
            return Integer.toString(arg1);
        } else {
            if (arg0 != -1554) {
                method685(97, 124);
            }
            return "*";
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(II)I")
    public static final int method685(int arg0, int arg1) {
        int var7 = arg0 - 1;
        field1548++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg1 != -1609027472) {
            method685(-103, -82);
        }
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
    public static void method686(int arg0) {
        field1557 = null;
        if (arg0 > -7) {
            method685(-122, -37);
        }
        field1563 = null;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)V")
    public final void method687(int arg0) {
        this.field1555 = null;
        this.field1559 = null;
        if (arg0 > -74) {
            this.method687(-27);
        }
        this.field1546 = null;
        this.field1547 = null;
        field1565++;
    }
}

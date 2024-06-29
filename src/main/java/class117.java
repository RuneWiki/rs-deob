import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class117 extends class439 {

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
    public static int field1850 = 0;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "Lvp;")
    public static class123 field1847 = new class123(51, 3);

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "J")
    public long field1844;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "Lsq;")
    public class117 field1843;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "Lsq;")
    public class117 field1845;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
    public final void method855(int arg0) {
        field1852++;
        if (this.field1843 == null) {
            return;
        }
        this.field1843.field1845 = this.field1845;
        if (arg0 == 51) {
            this.field1845.field1843 = this.field1843;
            this.field1843 = null;
            this.field1845 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V")
    public static final void method856(int arg0, int arg1) {
        if (class453.field6716 == null || class453.field6716.length < arg0) {
            class453.field6716 = new int[arg0];
        }
        field1853++;
        if (arg1 != 51) {
            method858((byte) -50);
        }
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)Z")
    public final boolean method857(int arg0) {
        if (arg0 != 51) {
            field1846 = 12;
        }
        field1851++;
        return this.field1843 != null;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)Lks;")
    public static final class301 method858(byte arg0) {
        if (arg0 <= 113) {
            field1847 = null;
        }
        field1848++;
        class301 var1 = (class301) class492.field7182.method1644((byte) -64);
        if (var1 == null) {
            return new class301();
        } else {
            class445.field6529--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(I)V")
    public static void method859(int arg0) {
        field1847 = null;
        if (arg0 != 3) {
            method856(8, 36);
        }
    }
}

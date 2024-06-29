import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class100 {

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public int field1800 = -1;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "[I")
    public static int[] field1793 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Lhi;")
    public static class82 field1796 = class95.method664((byte) -54, "Fichiers config charg-Bs");

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field1799 = -1;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Lhk;")
    public class40 field1792;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "Ljf;")
    public static class86 field1798;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "[I")
    public int[] field1794;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "[Lhi;")
    public class82[] field1801;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIZ)V", line = 5)
    public static final void method683(int arg0, int arg1, int arg2, boolean arg3) {
        field1795++;
        class82 var4 = class29.method182(-6039, new class82[] { class214.field3739, class327.method2240((byte) -74, arg1), class316.field5432, class327.method2240((byte) -74, arg0 >> 6), class316.field5432, class327.method2240((byte) -74, arg2 >> 6), class316.field5432, class327.method2240((byte) -74, arg0 & 0x3F), class316.field5432, class327.method2240((byte) -74, arg2 & 0x3F) });
        var4.method526((byte) 78);
        if (arg3) {
            class160.method1162(var4, -58);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Lcc;", line = 31)
    public static final class321 method684(int arg0) {
        field1797++;
        if (arg0 != 1332893734) {
            return (class321) null;
        }
        try {
            return (class321) Class.forName("pj").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 55)
    public static void method685(byte arg0) {
        field1796 = null;
        field1798 = null;
        field1793 = null;
        if (arg0 >= -11) {
            method685((byte) -24);
        }
    }
}

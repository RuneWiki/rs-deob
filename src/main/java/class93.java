import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class93 extends class154 {

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "J")
    public long field1641;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "Loh;")
    public static class258 field1642 = class153.method1046("m", 98);

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "Loh;")
    public static class258 field1646 = class153.method1046("Loading world list data", 113);

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "[[B")
    public static byte[][] field1645 = new byte[50][];

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "Loh;")
    public static class258 field1647 = class153.method1046("Update)2Liste geladen)3", 88);

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "Loh;")
    public static class258 field1649 = class153.method1046(":", 105);

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Lgb;")
    public static class213 field1639;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Lgb;")
    public static class213 field1643;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V", line = 12)
    public static final void method689(boolean arg0, int arg1) {
        field1638++;
        if (!class92.method685(-1, arg1)) {
            return;
        }
        class171[] var2 = class23.field290[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class171 var4 = var2[var3];
            if (var4 != null) {
                var4.field2965 = 0;
                var4.field2950 = 0;
            }
        }
        if (!arg0) {
            field1640 = 67;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[B)Lqe;", line = 61)
    public static final class35 method690(int arg0, byte[] arg1) {
        field1636++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 103 / ((arg0 + 54) / 53);
        class35 var3;
        if (class257.field4390) {
            var3 = new class156(arg1, class279.field4795, class280.field4819, class113.field1958, class301.field5149, class37.field497);
        } else {
            var3 = new class216(arg1, class279.field4795, class280.field4819, class113.field1958, class301.field5149, class37.field497);
        }
        class290.method2038(121);
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(IIIII)V", line = 81)
    public static final void method691(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1648++;
        if (arg0 > -119) {
            return;
        }
        for (int var5 = 0; var5 < class312.field5298; var5++) {
            if (class276.field4763[var5] + class114.field2026[var5] > arg3 && arg1 + arg3 > class276.field4763[var5] && class38.field517[var5] + class121.field2146[var5] > arg4 && class121.field2146[var5] < (arg2 + arg4)) {
                class238.field4151[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 128)
    public static void method692(int arg0) {
        field1642 = null;
        if (arg0 != 50) {
            method691(10, -49, -119, -81, -88);
        }
        field1643 = null;
        field1649 = null;
        field1646 = null;
        field1647 = null;
        field1639 = null;
        field1645 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V", line = 149)
    public class93() {
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(J)V", line = 151)
    public class93(long arg0) {
        this.field1641 = arg0;
    }
}

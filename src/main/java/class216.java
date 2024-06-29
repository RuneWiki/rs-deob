import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class216 extends class338 {

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "Z")
    public boolean field2902 = false;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "I")
    public int field2903 = -1;

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "Z")
    public static boolean field2897 = false;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "Z")
    public static boolean field2905 = true;

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "J")
    public static long field2906 = 0L;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
    public int field2895;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "I")
    public int field2896;

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
    public int field2898;

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "I")
    public int field2907;

    @OriginalMember(owner = "client!ir", name = "A", descriptor = "I")
    public int field2908;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "Lam;")
    public static class286 field2899;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "Lam;")
    public static class286 field2900;

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "Lok;")
    public static class60 field2909;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lam;Z)I")
    public static final int method1162(class286 arg0, boolean arg1) {
        field2901++;
        if (!arg1) {
            field2905 = false;
        }
        int var2 = 0;
        if (arg0.method1673(-114, class199.field2658)) {
            var2++;
        }
        if (arg0.method1673(13, class316.field4221)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(I)V")
    public static void method1163(int arg0) {
        if (arg0 >= 111) {
            field2899 = null;
            field2909 = null;
            field2900 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)V")
    public static final void method1164(boolean arg0) {
        class388.field5553 = 0;
        class338.field4509 = 0;
        field2904++;
        class1.method3(67);
        class418.method2596(-11263);
        class451.method2802((byte) -113);
        if (arg0) {
            return;
        }
        for (int var1 = 0; var1 < class388.field5553; var1++) {
            int var3 = class270.field3664[var1];
            if (class234.field3224 != class38.field397[var3].field6071) {
                if (class38.field397[var3].field1035.method2012(-1)) {
                    class295.method1734(class38.field397[var3], true);
                }
                class38.field397[var3].method503((class345) null, -31893);
                class38.field397[var3] = null;
            }
        }
        if (class161.field2065 != class448.field6514.field3389) {
            throw new RuntimeException("gnp1 pos:" + class448.field6514.field3389 + " psize:" + class161.field2065);
        }
        for (int var2 = 0; var2 < class244.field3320; var2++) {
            if (class38.field397[class308.field4175[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class244.field3320);
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(I)V")
    public class216(int arg0) {
        this.field2903 = arg0;
    }
}

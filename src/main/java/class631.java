import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public abstract class class631 {

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "Leea;")
    public class131 field8722;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field8721 = 0;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field8720;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field8723;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lnga;")
    public static class513 field8724;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)Z")
    public abstract boolean method1507(byte arg0);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static final void method3518(int arg0) {
        field8723++;
        if (arg0 != 2) {
            method3518(26);
        }
        class714 var1 = class689.field9415;
        synchronized (class689.field9415) {
            class689.field9415.method4024(arg0 - 2);
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
    public abstract void method1513(int arg0);

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V")
    public static void method3519(int arg0) {
        field8724 = null;
        if (arg0 < 111) {
            method3519(-35);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILta;)V")
    public abstract void method1508(int arg0, int arg1, class210 arg2);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZZ)V")
    public abstract void method1509(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V")
    public abstract void method1512(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)I")
    public static final int method3520(int arg0, int arg1) {
        field8720++;
        if (arg1 != -11904) {
            field8724 = null;
        }
        byte var2;
        if (arg0 > 12000) {
            class643.method3555(arg1 ^ 0x2E7F);
            var2 = 4;
        } else if (arg0 > 5000) {
            class262.method1713(1);
            var2 = 3;
        } else if (arg0 <= 2000) {
            class546.method3170(arg1 ^ 0xFFFFD1F3, true);
            var2 = 1;
        } else {
            class493.method2941(-65536);
            var2 = 2;
        }
        if (class557.field7812.field6521.method2556(false) != 2) {
            class557.field7812.method2755(249682952, 2, class557.field7812.field6555);
            class759.method4212(false, 0, 2);
        }
        class90.method681(arg1 ^ 0xFFFFF9E7);
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZ)V")
    public abstract void method1506(int arg0, boolean arg1);

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Leea;)V")
    public class631(class131 arg0) {
        this.field8722 = arg0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class7 {

    @OriginalMember(owner = "client!to", name = "b", descriptor = "Lla;")
    public static class319 field151 = new class319(75, 3);

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V", line = 10)
    public static void method91(int arg0) {
        field151 = null;
        if (arg0 != 0) {
            field151 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Luu;III)Lju;", line = 22)
    public static final class82 method92(class191 arg0, int arg1, int arg2, int arg3) {
        field150++;
        if (arg2 != -15471) {
            field151 = null;
        }
        byte[] var4 = arg0.method1281(arg3, arg1, 86);
        return var4 == null ? null : new class82(var4);
    }
}

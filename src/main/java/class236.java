import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class236 {

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public int field3980;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public int field3982;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Lka;")
    public static class177 field3981;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Lcb;")
    public static class267 field3983;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "Lcb;")
    public static class267 field3985;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIII)V", line = 24)
    public static final void method1714(int arg0, int arg1, int arg2, int arg3) {
        class242 var4 = class271.field4681[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class235 var5 = var4.field4096;
        if (var5 != null) {
            var5.field3960 = var5.field3960 * arg3 / 16;
            var5.field3975 = var5.field3975 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)Lai;", line = 41)
    public static final class117 method1715(int arg0, int arg1) {
        field3984++;
        class117 var2 = (class117) class274.field4730.method1193((long) arg0, arg1 + 6935);
        if (arg1 != -6834) {
            method1715(-11, -55);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class19.field244.method1911(3, arg0, -119);
        class117 var4 = new class117();
        if (var3 != null) {
            var4.method892(new class60(var3), -71);
        }
        class274.field4730.method1194(var4, (long) arg0, false);
        return var4;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(IIIIIIZ)V", line = 66)
    public class236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3980 = arg5;
        this.field3982 = arg2;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 86)
    public static void method1716(int arg0) {
        field3985 = null;
        field3981 = null;
        field3983 = null;
        if (arg0 != -2925) {
            field3983 = (class267) null;
        }
    }
}

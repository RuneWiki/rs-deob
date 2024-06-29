import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class640 extends class28 {

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public int field8726;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public int field8727;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "Lej;")
    public static class229 field8725 = new class229("", 12);

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "F")
    public static float field8731;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field8723;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field8724;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public static int field8728;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "Lpq;")
    public static class159 field8729;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "Lsk;")
    public static class433 field8730;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II[Lfca;ZBI)V", line = 3)
    public static final void method3481(int arg0, int arg1, class188[] arg2, boolean arg3, byte arg4, int arg5) {
        field8724++;
        if (arg4 >= -107) {
            return;
        }
        for (int var6 = 0; var6 < arg2.length; var6++) {
            class188 var7 = arg2[var6];
            if (var7 != null && var7.field2414 == arg0) {
                class244.method1496(var7, arg1, arg5, arg3, (byte) 113);
                class654.method3624(arg1, arg5, var7, (byte) -122);
                if (var7.field2379 - var7.field2438 < var7.field2315) {
                    var7.field2315 = var7.field2379 - var7.field2438;
                }
                if (var7.field2315 < 0) {
                    var7.field2315 = 0;
                }
                if (var7.field2431 > (var7.field2406 - var7.field2371)) {
                    var7.field2431 = var7.field2406 - var7.field2371;
                }
                if (var7.field2431 < 0) {
                    var7.field2431 = 0;
                }
                if (var7.field2304 == 0) {
                    class59.method370(89, arg3, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 53)
    public static void method3482(int arg0) {
        field8730 = null;
        field8729 = null;
        if (arg0 != -1) {
            method3482(35);
        }
        field8725 = null;
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(II)V", line = 66)
    public class640(int arg0, int arg1) {
        this.field8726 = arg0;
        this.field8727 = arg1;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILoa;)V", line = 82)
    public static final void method3483(int arg0, class689 arg1) {
        field8723++;
        if (class251.field3389 == class596.field8164.field3925 || class145.field1841 == null) {
            return;
        }
        if (class517.method2943(class596.field8164.field3925, arg1, (byte) 21)) {
            class251.field3389 = class596.field8164.field3925;
        }
        if (arg0 != 0) {
            method3483(-24, null);
        }
    }
}

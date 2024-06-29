import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class221 {

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field4065 = 0;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Z")
    public static boolean field4068 = false;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Lpk;")
    public static class99 field4067;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static final void method1574(int arg0) {
        class195.field3437.method209((byte) 122);
        class88.field1597 = null;
        if (arg0 == 20612) {
            field4065 = 1;
            field4066++;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Lod;")
    public static final class90 method1575(int arg0, int arg1, int arg2) {
        field4064++;
        class90 var3 = (class90) class48.field951.method1867((long) arg0 << 32 | (long) arg1, true);
        if (arg2 != 1651481952) {
            field4067 = null;
        }
        if (var3 == null) {
            var3 = new class90(arg0, arg1);
            class48.field951.method1863((byte) -83, var3, var3.field3407);
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[Lqk;)[Lqk;")
    public static final class207[] method1576(int arg0, class207[] arg1) {
        field4069++;
        class207[] var2 = new class207[5];
        if (arg0 > -29) {
            return null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class105.method757(false, new class207[] { class262.method1815(var3, (byte) -108), class227.field4165 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class105.method757(false, new class207[] { var2[var3], arg1[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static void method1577(int arg0) {
        field4067 = null;
        if (arg0 != 5) {
            method1577(-90);
        }
    }
}

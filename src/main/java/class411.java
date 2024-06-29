import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class411 {

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field5966 = -1;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Lng;")
    public static class190 field5963 = new class190(64);

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Lng;")
    public static class190 field5967 = new class190(4);

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5968 = "Loading world list data";

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Leb;I)Ljb;")
    public static final class285 method2630(class371 arg0, int arg1) {
        if (arg1 == 1) {
            field5964++;
            return new class285(arg0.method2378(arg1 - 2), arg0.method2378(-1), arg0.method2378(-1), arg0.method2378(-1), arg0.method2425(-104), arg0.method2425(-3), arg0.method2429(arg1 - 1));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
    public static void method2631(boolean arg0) {
        if (arg0) {
            field5968 = null;
        }
        field5963 = null;
        field5968 = null;
        field5967 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)Lrh;")
    public static final class144 method2632(int arg0, byte arg1) {
        field5965++;
        class144 var2 = (class144) class265.field3616.method567((byte) 57, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class141.field2008.method1920(arg0, false, 1);
        } else {
            var3 = class401.field5849.method1920(arg0 & 0x7FFF, false, 1);
        }
        class144 var4 = new class144();
        if (var3 != null) {
            var4.method980(new class371(var3), -1);
        }
        if (arg0 >= 32768) {
            var4.method991(0);
        }
        int var5 = -102 / ((-arg1 - 61) / 37);
        class265.field3616.method565(-1, var4, (long) arg0);
        return var4;
    }
}

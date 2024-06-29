import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class231 {

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Lvj;")
    private class90 field3447 = new class90();

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "Lhc;")
    private class151 field3458 = new class151();

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    private int field3459;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    private int field3460;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "Lh;")
    private class190 field3457;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field3455 = 0;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Lha;")
    public static class267 field3453 = null;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)Lwg;")
    public final class254 method1498(int arg0) {
        field3452++;
        if (arg0 != 90) {
            this.field3459 = 15;
        }
        return this.field3457.method1223(arg0 + 37);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(JILvj;)V")
    public final void method1499(long arg0, int arg1, class90 arg2) {
        if (arg1 >= -79) {
            return;
        }
        field3449++;
        if (this.field3459 == 0) {
            class90 var5 = this.field3458.method1023((byte) 54);
            var5.method1706(-108);
            var5.method609(-15747);
            if (this.field3447 == var5) {
                class90 var6 = this.field3458.method1023((byte) 54);
                var6.method1706(-63);
                var6.method609(-15747);
            }
        } else {
            this.field3459--;
        }
        this.field3457.method1215(arg2, -98, arg0);
        this.field3458.method1028(false, arg2);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V")
    public final void method1500(boolean arg0) {
        this.field3458.method1024(arg0);
        field3450++;
        if (arg0) {
            this.method1499(-58L, 58, (class90) null);
        }
        this.field3457.method1222(0);
        this.field3447 = new class90();
        this.field3459 = this.field3460;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(JB)Lvj;")
    public final class90 method1501(long arg0, byte arg1) {
        field3451++;
        class90 var4 = (class90) this.field3457.method1218(arg0, -4);
        int var5 = 40 % ((66 - arg1) / 37);
        if (var4 != null) {
            this.field3458.method1028(false, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V")
    public static void method1502(int arg0) {
        field3453 = null;
        if (arg0 >= -90) {
            method1502(-109);
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)Lwg;")
    public final class254 method1503(int arg0) {
        if (arg0 != 29704) {
            this.field3459 = 53;
        }
        field3456++;
        return this.field3457.method1219(1);
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(I)V")
    public class231(int arg0) {
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field3459 = arg0;
        this.field3460 = arg0;
        this.field3457 = new class190(var2);
    }
}

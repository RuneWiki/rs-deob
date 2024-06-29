import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class250 {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "S")
    public static short field3828 = 256;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3833 = "Hidden";

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Lhc;")
    public static class235 field3827;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Lclient;")
    public static client field3826;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
    public static final void method1674(boolean arg0) {
        if (!arg0) {
            field3829 = 87;
        }
        field3831++;
        if (class160.field2245 != null && class54.field778 != null) {
            return;
        }
        class54.field778 = new int[256];
        class160.field2245 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class160.field2245[var1] = (int) (Math.sin(var2) * 4096.0D);
            class54.field778[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)Lwi;")
    public static final class136 method1675(int arg0, byte arg1) {
        class136 var2 = (class136) class233.field3522.method961((long) arg0, arg1 + 9124);
        field3832++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class5.field44.method1576(-79, 26, arg0);
        class136 var4 = new class136();
        if (var3 != null) {
            var4.method920(-20920, new class224(var3));
        }
        if (arg1 != 32) {
            field3826 = null;
        }
        class233.field3522.method957(21915, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method1676(int arg0) {
        field3833 = null;
        field3827 = null;
        if (arg0 == 256) {
            field3826 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)Ltg;")
    public static final class186 method1677(int arg0, int arg1, int arg2) {
        class89 var3 = class194.field2682[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class186 var4 = var3.field1246;
            var3.field1246 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(IB)V")
    public static final void method1678(int arg0, byte arg1) {
        int var2 = 57 % ((8 - arg1) / 59);
        class69.field936.method536(-46, arg0);
        field3830++;
        class151.field2082.method536(112, arg0);
        class122.field1699.method536(-30, arg0);
    }
}

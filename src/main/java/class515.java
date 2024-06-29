import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class515 {

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Ljava/lang/String;")
    public String field7274;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public int field7268;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "S")
    public static short field7271 = 256;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Lrg;")
    public static class548 field7269 = new class548(24, 5);

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Lvj;")
    public static class373 field7275 = new class373(85, 8);

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field7273;

    // $FF: synthetic field
    @OriginalMember(owner = "client!re", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field7276;

    // $FF: synthetic method
    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2955(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BIII)Z", line = 9)
    public static final boolean method2952(byte arg0, int arg1, int arg2, int arg3) {
        field7272++;
        boolean var4 = true;
        class269 var5 = (class269) class19.method124(arg1, arg3, arg2);
        if (var5 != null) {
            var4 &= class164.method895(var5, (byte) 107);
        }
        class269 var6 = (class269) class198.method1072(arg1, arg3, arg2, field7276 == null ? (field7276 = method2955("fp")) : field7276);
        if (var6 != null) {
            var4 &= class164.method895(var6, (byte) 77);
        }
        class269 var7 = (class269) class543.method3171(arg1, arg3, arg2);
        if (var7 != null) {
            var4 &= class164.method895(var7, (byte) -78);
        }
        if (arg0 <= 83) {
            field7275 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 36)
    public static void method2953(int arg0) {
        field7275 = null;
        if (arg0 != -128) {
            method2952((byte) -112, 82, -82, -2);
        }
        field7269 = null;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V", line = 51)
    public static final void method2954(int arg0) {
        field7273++;
        if (class55.field482) {
            return;
        }
        class55.field482 = true;
        if (arg0 != -65) {
            method2952((byte) -105, -124, 21, 88);
        }
        class35.field278 = true;
        if (class565.field8299.field2184) {
            class558.field8223 = ((int) class558.field8223 - 65 & 0xFFFFFF80);
        } else {
            class289.field3759 += (-class289.field3759 - 24.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!re", name = "toString", descriptor = "()Ljava/lang/String;", line = 75)
    public final String toString() {
        field7270++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 89)
    public class515(String arg0, int arg1) {
        this.field7274 = arg0;
        this.field7268 = arg1;
    }
}

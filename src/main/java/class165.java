import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class165 {

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "Lwk;")
    public class428 field2098 = new class428();

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public static int field2101 = 0;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "Z")
    public static boolean field2103 = false;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
    public static int field2105 = 0;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "Lwk;")
    private class428 field2102;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "Z")
    public static boolean field2104;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIILjava/lang/Class;)Lhd;")
    public static final class17 method878(int arg0, int arg1, int arg2, Class arg3) {
        class96 var4 = class176.field2209[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class122 var5 = var4.field1130; var5 != null; var5 = var5.field1511) {
            class17 var6 = var5.field1505;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field168 == arg1 && var6.field159 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V")
    public final void method879(boolean arg0) {
        while (true) {
            class428 var2 = this.field2098.field6280;
            if (this.field2098 == var2) {
                field2099++;
                this.field2102 = null;
                if (arg0) {
                    this.method883(-46);
                    return;
                }
                return;
            }
            var2.method2649(22);
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(Z)Lwk;")
    public final class428 method880(boolean arg0) {
        field2107++;
        class428 var2 = this.field2102;
        if (this.field2098 == var2) {
            this.field2102 = null;
            return null;
        }
        this.field2102 = var2.field6280;
        if (!arg0) {
            field2103 = true;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lwk;I)V")
    public final void method881(class428 arg0, int arg1) {
        field2106++;
        if (arg0.field6279 != null) {
            arg0.method2649(22);
        }
        arg0.field6279 = this.field2098.field6279;
        arg0.field6280 = this.field2098;
        arg0.field6279.field6280 = arg0;
        if (arg1 != 11022) {
            field2101 = 92;
        }
        arg0.field6280.field6279 = arg0;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)B")
    public static final byte method882(int arg0, int arg1, int arg2) {
        field2108++;
        if (arg0 == 9) {
            if (arg2 < 115) {
                method882(-55, -70, -122);
            }
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Lwk;")
    public final class428 method883(int arg0) {
        field2100++;
        class428 var2 = this.field2098.field6280;
        if (this.field2098 == var2) {
            this.field2102 = null;
            return null;
        } else {
            int var3 = 42 / ((46 - arg0) / 35);
            this.field2102 = var2.field6280;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V")
    public class165() {
        this.field2098.field6280 = this.field2098;
        this.field2098.field6279 = this.field2098;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class618 {

    @OriginalMember(owner = "client!aga", name = "i", descriptor = "Lvg;")
    private class49 field8753 = new class49(16);

    @OriginalMember(owner = "client!aga", name = "h", descriptor = "Lri;")
    private class97 field8752;

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "I")
    public static int field8747 = 0;

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "Lcf;")
    public static class561 field8746 = new class561();

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "I")
    public static int field8750;

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!aga", name = "j", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)V")
    public final void method3586(int arg0, int arg1) {
        class49 var3 = this.field8753;
        synchronized (this.field8753) {
            if (arg1 >= -24) {
                return;
            }
            this.field8753.method573((byte) 122, arg0);
        }
        field8745++;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method3587(int arg0, String arg1) {
        field8750++;
        if (arg0 != 0) {
            return null;
        } else if (class402.field6210.startsWith("win")) {
            return arg1 + ".dll";
        } else if (class402.field6210.startsWith("linux")) {
            return "lib" + arg1 + ".so";
        } else if (class402.field6210.startsWith("mac")) {
            return "lib" + arg1 + ".dylib";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)V")
    public final void method3588(int arg0) {
        if (arg0 >= -71) {
            method3587(-11, null);
        }
        class49 var2 = this.field8753;
        synchronized (this.field8753) {
            this.field8753.method563(0);
        }
        field8751++;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIILjava/lang/Class;)Liaa;")
    public static final class459 method3589(int arg0, int arg1, int arg2, Class arg3) {
        class252 var4 = class454.field6818[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class531 var5 = var4.field4026; var5 != null; var5 = var5.field7736) {
            class459 var6 = var5.field7739;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6865 == arg1 && var6.field6869 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(BI)Lpl;")
    public final class603 method3590(byte arg0, int arg1) {
        field8749++;
        if (arg0 <= 77) {
            field8748 = -128;
        }
        class49 var3 = this.field8753;
        class603 var4;
        synchronized (this.field8753) {
            var4 = (class603) this.field8753.method560(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class97 var5 = this.field8752;
        byte[] var6;
        synchronized (this.field8752) {
            var6 = this.field8752.method926(30, -128, arg1);
        }
        class603 var7 = new class603();
        if (var6 != null) {
            var7.method3516((byte) -79, new class6(var6));
        }
        class49 var8 = this.field8753;
        synchronized (this.field8753) {
            this.field8753.method559(var7, (long) arg1, 0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)V")
    public final void method3591(int arg0) {
        if (arg0 >= -123) {
            this.method3590((byte) -71, -26);
        }
        class49 var2 = this.field8753;
        synchronized (this.field8753) {
            this.field8753.method569(0);
        }
        field8754++;
    }

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)V")
    public static void method3592(int arg0) {
        field8746 = null;
        int var1 = 45 / ((-arg0 - 23) / 50);
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lei;ILri;)V")
    public class618(class162 arg0, int arg1, class97 arg2) {
        this.field8752 = arg2;
        this.field8752.method949(30, 0);
    }
}

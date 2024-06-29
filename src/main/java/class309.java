import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class309 {

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Z")
    public boolean field4405 = false;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field4408 = -1;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public int field4399;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public int field4400;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Lu;")
    public static class65 field4401;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Lu;")
    public class65 field4407;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLol;)V")
    public final void method1897(byte arg0, class431 arg1) {
        field4404++;
        if (arg0 != 26) {
            return;
        }
        while (true) {
            int var3 = arg1.method2557(14929);
            if (var3 == 0) {
                return;
            }
            this.method1902(var3, 126, arg1);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILha;ZI)Lmq;")
    public final class85 method1898(int arg0, class475 arg1, boolean arg2, int arg3) {
        field4402++;
        if (arg3 != 262144) {
            this.method1897((byte) 123, null);
        }
        long var5 = (long) (arg1.field6448 << 19 | this.field4399 | arg0 << 16 | (arg2 ? 262144 : 0));
        class85 var7 = (class85) this.field4407.field983.method2882(var5, (byte) -90);
        if (var7 != null) {
            return var7;
        } else if (this.field4407.field974.method3005(this.field4399, (byte) -69)) {
            class418 var8 = class418.method2468(this.field4407.field974, this.field4399, 0);
            if (var8 != null) {
                var8.field5800 = var8.field5794 = var8.field5797 = var8.field5799 = 0;
                if (arg2) {
                    var8.method2470();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method2471();
                }
            }
            class85 var10 = arg1.method487(var8, true);
            if (var10 != null) {
                this.field4407.field983.method2890(-7307, var5, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public static void method1899(boolean arg0) {
        field4401 = null;
        if (!arg0) {
            field4401 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static final void method1900(int arg0) {
        field4406++;
        class458.method2681(-1);
        class593.field8489 = false;
        if (arg0 != -12053) {
            method1900(-69);
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)Z")
    public final boolean method1901(int arg0) {
        field4409++;
        if (arg0 != 17519) {
            this.method1898(57, null, false, -85);
        }
        return this.field4407.field974.method3005(this.field4399, (byte) -69);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILol;)V")
    private final void method1902(int arg0, int arg1, class431 arg2) {
        if (arg1 <= 49) {
            field4401 = null;
        }
        field4403++;
        if (arg0 == 1) {
            this.field4399 = arg2.method2565((byte) -87);
        } else if (arg0 == 2) {
            this.field4400 = arg2.method2515(37);
            return;
        } else if (arg0 == 3) {
            this.field4405 = true;
            return;
        } else if (arg0 == 4) {
            this.field4399 = -1;
            return;
        }
    }
}

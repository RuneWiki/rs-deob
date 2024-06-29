import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class564 {

    @OriginalMember(owner = "client!br", name = "j", descriptor = "Laq;")
    private class494 field7873 = new class494(64);

    @OriginalMember(owner = "client!br", name = "k", descriptor = "Laq;")
    private class494 field7874 = new class494(100);

    @OriginalMember(owner = "client!br", name = "f", descriptor = "Lgga;")
    private class513 field7869;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field7865;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field7867;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field7868;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "I")
    public static int field7871;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "[[[B")
    public static byte[][][] field7872;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(III)Z")
    public static final boolean method3283(int arg0, int arg1, int arg2) {
        field7865++;
        if (arg1 == -14896) {
            return (arg0 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)Lsk;")
    public final class495 method3284(int arg0, byte arg1) {
        if (arg1 >= -105) {
            this.method3286(31, (byte) 111);
        }
        field7864++;
        class494 var3 = this.field7874;
        synchronized (this.field7874) {
            class495 var4 = (class495) this.field7874.method2882((long) arg0, (byte) -86);
            if (var4 == null) {
                var4 = new class495(arg0);
                this.field7874.method2890(-7307, (long) arg0, var4);
            }
            return var4.method2901(115) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V")
    public final void method3285(boolean arg0) {
        class494 var2 = this.field7873;
        synchronized (this.field7873) {
            this.field7873.method2881((byte) -25);
        }
        field7870++;
        class494 var3 = this.field7874;
        synchronized (this.field7874) {
            this.field7874.method2881((byte) -114);
            if (!arg0) {
                method3288((byte) -52);
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(IB)V")
    public final void method3286(int arg0, byte arg1) {
        class494 var3 = this.field7873;
        synchronized (this.field7873) {
            this.field7873.method2888(arg0, 116);
            if (arg1 != 36) {
                this.field7873 = null;
            }
        }
        field7868++;
        class494 var4 = this.field7874;
        synchronized (this.field7874) {
            this.field7874.method2888(arg0, 127);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)Lje;")
    public final class98 method3287(int arg0, int arg1) {
        field7867++;
        class494 var3 = this.field7873;
        class98 var4;
        synchronized (this.field7873) {
            var4 = (class98) this.field7873.method2882((long) arg1, (byte) -64);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field7869;
        byte[] var6;
        synchronized (this.field7869) {
            var6 = this.field7869.method3019(class786.method4308(false, arg1), class321.method1946(-32603, arg1), 73);
            if (arg0 < 68) {
                field7872 = null;
            }
        }
        class98 var7 = new class98();
        var7.field1404 = this;
        var7.field1413 = arg1;
        if (var6 != null) {
            var7.method805(-1, new class431(var6));
        }
        var7.method810(2);
        class494 var8 = this.field7873;
        synchronized (this.field7873) {
            this.field7873.method2890(-7307, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
    public static void method3288(byte arg0) {
        if (arg0 != -76) {
            field7872 = null;
        }
        field7872 = null;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(II)I")
    public static final int method3289(int arg0, int arg1) {
        int var2 = -109 % ((-arg1 - 36) / 35);
        field7871++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
    public final void method3290(int arg0) {
        if (arg0 <= 52) {
            method3283(91, 42, -25);
        }
        field7866++;
        class494 var2 = this.field7873;
        synchronized (this.field7873) {
            this.field7873.method2893((byte) -120);
        }
        class494 var3 = this.field7874;
        synchronized (this.field7874) {
            this.field7874.method2893((byte) -67);
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lmca;ILgga;Lgga;Lgga;)V")
    public class564(class41 arg0, int arg1, class513 arg2, class513 arg3, class513 arg4) {
        this.field7869 = arg2;
        if (this.field7869 != null) {
            int var6 = this.field7869.method3011((byte) -109) - 1;
            this.field7869.method3007(-1, var6);
        }
        class374.method2232(2, arg4, arg3, (byte) -59);
    }
}

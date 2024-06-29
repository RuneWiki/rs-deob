import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class265 {

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "Laq;")
    private class494 field3741 = new class494(64);

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "Lgga;")
    private class513 field3735;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "[I")
    public static int[] field3736 = new int[2];

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "Lin;")
    public static class380 field3742 = new class380(48, 4);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "Lgga;")
    public static class513 field3739;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static final void method1705(byte arg0) {
        class629.method3593((byte) -127);
        field3734++;
        int var1 = -32 / ((arg0 + 25) / 60);
        class184.field2800 = null;
        class726.field10109 = null;
        class548.field7629 = null;
        class321.field4568 = null;
        class163.field2506 = null;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V")
    public static void method1706(byte arg0) {
        field3739 = null;
        if (arg0 <= -89) {
            field3736 = null;
            field3742 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)V")
    public final void method1707(int arg0, byte arg1) {
        class494 var3 = this.field3741;
        synchronized (this.field3741) {
            if (arg1 != -94) {
                this.field3735 = null;
            }
            this.field3741.method2888(arg0, arg1 ^ 0xFFFFFFDF);
        }
        field3740++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public final void method1708(int arg0) {
        class494 var2 = this.field3741;
        synchronized (this.field3741) {
            this.field3741.method2881((byte) -26);
        }
        if (arg0 != 64) {
            field3739 = null;
        }
        field3733++;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public final void method1709(int arg0) {
        class494 var2 = this.field3741;
        synchronized (this.field3741) {
            this.field3741.method2893((byte) 101);
        }
        if (arg0 != 48) {
            method1706((byte) 32);
        }
        field3731++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)Lwg;")
    public final class580 method1710(int arg0, int arg1) {
        field3738++;
        class494 var3 = this.field3741;
        class580 var4;
        synchronized (this.field3741) {
            var4 = (class580) this.field3741.method2882((long) arg1, (byte) -58);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field3735;
        byte[] var6;
        synchronized (this.field3735) {
            var6 = this.field3735.method3019(54, arg1, arg0 ^ 0x13);
        }
        if (arg0 != 64) {
            return null;
        }
        class580 var7 = new class580();
        if (var6 != null) {
            var7.method3411((byte) -127, new class431(var6));
        }
        class494 var8 = this.field3741;
        synchronized (this.field3741) {
            this.field3741.method2890(-7307, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lmca;ILgga;)V")
    public class265(class41 arg0, int arg1, class513 arg2) {
        this.field3735 = arg2;
        if (this.field3735 != null) {
            this.field3735.method3007(-1, 54);
        }
    }
}

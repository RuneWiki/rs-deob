import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class527 {

    @OriginalMember(owner = "client!au", name = "g", descriptor = "Lwi;")
    private class330 field7729 = new class330(64);

    @OriginalMember(owner = "client!au", name = "a", descriptor = "Luu;")
    private class191 field7723;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    public static int field7728 = 0;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field7725;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "I")
    public static int field7727;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!au", name = "i", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Lce;")
    public final class205 method3118(int arg0, int arg1) {
        field7724++;
        class330 var3 = this.field7729;
        class205 var4;
        synchronized (this.field7729) {
            var4 = (class205) this.field7729.method2133((long) arg0, (byte) 38);
        }
        if (arg1 != -13676) {
            method3120(true, false, -128, -119, 8);
        }
        if (var4 != null) {
            return var4;
        }
        class191 var5 = this.field7723;
        byte[] var6;
        synchronized (this.field7723) {
            var6 = this.field7723.method1281(11, arg0, arg1 + 13787);
        }
        class205 var7 = new class205();
        if (var6 != null) {
            var7.method1384(arg1 + 13755, new class164(var6));
        }
        class330 var8 = this.field7729;
        synchronized (this.field7729) {
            this.field7729.method2131(var7, (long) arg0, false);
            return var7;
        }
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(II)V")
    public final void method3119(int arg0, int arg1) {
        if (arg0 != 0) {
            return;
        }
        field7727++;
        class330 var3 = this.field7729;
        synchronized (this.field7729) {
            this.field7729.method2140(-127, arg1);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ZZIII)V")
    public static final void method3120(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field7725++;
        if (arg4 != 27397) {
            field7728 = -76;
        }
        class400.method2474(arg3, 0, class4.field22.length - 1, arg0, arg2, arg1, (byte) -106);
        class367.field5619 = 0;
        class139.field1849 = null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
    public final void method3121(int arg0) {
        class330 var2 = this.field7729;
        synchronized (this.field7729) {
            this.field7729.method2135(arg0);
        }
        field7731++;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V")
    public final void method3122(int arg0) {
        class330 var2 = this.field7729;
        synchronized (this.field7729) {
            this.field7729.method2127((byte) -10);
            if (arg0 != -22776) {
                this.field7723 = null;
            }
        }
        field7730++;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(BII)Z")
    public static final boolean method3123(byte arg0, int arg1, int arg2) {
        if (arg0 <= 124) {
            method3120(true, true, -82, 98, 46);
        }
        field7726++;
        return (class24.method226(false, arg1, arg2) | (arg2 & 0x2000) != 0 | class63.method449(arg1, -3463, arg2)) & class143.method956(arg1, arg2, 19688);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method3124(int arg0, int arg1, int arg2, Class arg3) {
        class452 var4 = class443.field6672[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class384 var5 = var4.field6814; var5 != null; var5 = var5.field5834) {
            class140 var6 = var5.field5832;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1868 == arg1 && var6.field1863 == arg2) {
                class211.method1451(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Liv;ILuu;)V")
    public class527(class65 arg0, int arg1, class191 arg2) {
        this.field7723 = arg2;
        if (this.field7723 != null) {
            this.field7723.method1290(false, 11);
        }
    }
}

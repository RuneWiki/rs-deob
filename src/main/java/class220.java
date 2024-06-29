import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class220 {

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "Lqg;")
    private class196 field3818;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "Lde;")
    private class226 field3813;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "Lll;")
    private class152 field3817;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field3819 = 0;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "Lhi;")
    public static class82 field3821 = class95.method664((byte) -92, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "Lhi;")
    public static class82 field3814 = class95.method664((byte) -102, "Fps:");

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "Lbc;")
    private class153 field3808;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "[Lmi;")
    private class208[] field3812;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V", line = 11)
    public static void method1555(boolean arg0) {
        field3821 = null;
        field3814 = null;
        if (arg0) {
            method1555(false);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lph;BZILph;)Lmi;", line = 23)
    private final class208 method1556(class282 arg0, byte arg1, boolean arg2, int arg3, class282 arg4) {
        field3815++;
        if (this.field3808 == null) {
            throw new RuntimeException();
        }
        this.field3808.field2611 = arg3 * 8 + 5;
        if (this.field3808.field2611 >= this.field3808.field2598.length) {
            throw new RuntimeException();
        } else if (this.field3812[arg3] == null) {
            int var6 = this.field3808.method1097((byte) -120);
            int var7 = this.field3808.method1097((byte) -103);
            if (arg1 != -46) {
                method1559(-69, (class153) null);
            }
            class208 var8 = new class208(arg3, arg4, arg0, this.field3818, this.field3813, var6, var7, arg2);
            this.field3812[arg3] = var8;
            return var8;
        } else {
            return this.field3812[arg3];
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)V", line = 72)
    public static final void method1557(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3809++;
        if (class200.field3443 <= arg0 && arg0 <= class207.field3623) {
            int var5 = class163.method1179(arg2, class29.field399, class60.field931, (byte) -122);
            int var6 = class163.method1179(arg4, class29.field399, class60.field931, (byte) -115);
            class15.method83(arg3, var5, var6, arg0, arg1 + 6);
        }
        if (arg1 != -5) {
            method1559(39, (class153) null);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 92)
    public final void method1558(int arg0) {
        field3820++;
        if (this.field3812 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3812.length; var2++) {
            if (this.field3812[var2] != null) {
                this.field3812[var2].method1493(-119);
            }
        }
        if (arg0 != -20290) {
            field3821 = (class82) null;
        }
        for (int var3 = 0; var3 < this.field3812.length; var3++) {
            if (this.field3812[var3] != null) {
                this.field3812[var3].method1491(arg0 ^ 0x4F22);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILbc;)Lhi;", line = 129)
    public static final class82 method1559(int arg0, class153 arg1) {
        field3806++;
        if (arg0 >= -111) {
            method1557(-31, -18, 102, -52, -117);
        }
        return class198.method1384(arg1, 32767, (byte) -105);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)Z", line = 141)
    public final boolean method1560(int arg0) {
        field3811++;
        if (this.field3808 != null) {
            return true;
        }
        if (arg0 <= 53) {
            this.field3818 = (class196) null;
        }
        if (this.field3817 == null) {
            if (this.field3818.method1370(-124)) {
                return false;
            }
            this.field3817 = this.field3818.method1369(255, 255, 20, true, (byte) 0);
        }
        if (this.field3817.field2433) {
            return false;
        } else {
            this.field3808 = new class153(this.field3817.method964(-1));
            this.field3812 = new class208[(this.field3808.field2598.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lph;IILph;)Lmi;", line = 169)
    public final class208 method1561(class282 arg0, int arg1, int arg2, class282 arg3) {
        if (arg2 != 255) {
            this.method1561((class282) null, 27, 11, (class282) null);
        }
        field3810++;
        return this.method1556(arg0, (byte) -46, true, arg1, arg3);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lqg;Lde;)V", line = 182)
    public class220(class196 arg0, class226 arg1) {
        this.field3818 = arg0;
        this.field3813 = arg1;
        if (!this.field3818.method1370(-126)) {
            this.field3817 = this.field3818.method1369(255, 255, 20, true, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 206)
    public static final void method1562(byte arg0) {
        class256.field4405 = (byte[][][]) null;
        class325.field5582 = (int[][][]) null;
        class296.field5006 = null;
        field3816++;
        int var1 = 51 % ((arg0 - 71) / 38);
        class9.field80 = null;
        class77.field1323 = (byte[][][]) null;
        class204.field3581 = (byte[][][]) null;
        class311.field5314 = null;
        class17.field185 = null;
        class29.field401 = null;
        class138.field2371 = (byte[][][]) null;
        class255.field4389 = (byte[][][]) null;
    }
}

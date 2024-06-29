import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class172 extends class31 {

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "Lhj;")
    public static class69 field3151 = class181.method1318("3D)2Softwarebibliothek gestartet)3", (byte) -127);

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "Lta;")
    public static class241 field3147 = new class241(64);

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "[I")
    public static int[] field3152 = new int[5];

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static void method1257(int arg0) {
        int var1 = -23 % ((arg0 - 9) / 55);
        field3152 = null;
        field3151 = null;
        field3147 = null;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)V")
    public static final void method1258(byte arg0) {
        int var1 = 89 % ((62 - arg0) / 40);
        field3145++;
        if (class141.field2626 != null) {
            class258 var2 = class141.field2626;
            synchronized (class141.field2626) {
                class141.field2626 = null;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lnc;Lnc;BLwj;)V")
    public static final void method1259(class83 arg0, class83 arg1, byte arg2, class6 arg3) {
        class76.field1480 = arg0;
        class202.field3649 = arg3;
        if (arg2 >= -25) {
            field3152 = null;
        }
        class221.field3977 = arg1;
        field3143++;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lti;ILti;)V")
    public static final void method1260(class5 arg0, int arg1, class5 arg2) {
        if (arg2.field47 != null) {
            arg2.method24(true);
        }
        if (arg1 >= -115) {
            method1257(88);
        }
        arg2.field47 = arg0;
        arg2.field37 = arg0.field37;
        field3149++;
        arg2.field47.field37 = arg2;
        arg2.field37.field47 = arg2;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)[Lqb;")
    public static final class56[] method1261(int arg0) {
        class56[] var1 = new class56[class196.field3573];
        field3150++;
        int var2 = 0;
        if (arg0 != 255) {
            field3151 = null;
        }
        while (class196.field3573 > var2) {
            int var3 = class69.field1350[var2] * class113.field2167[var2];
            byte[] var4 = class157.field2919[var2];
            if (class270.field4788[var2]) {
                int[] var7 = new int[var3];
                byte[] var8 = class45.field645[var2];
                for (int var9 = 0; var9 < var3; var9++) {
                    var7[var9] = class230.method1644(class50.field841[class69.method443(255, var4[var9])], class69.method443(var8[var9] << 24, -16777216));
                }
                var1[var2] = new class77(class229.field4196, class53.field941, class138.field2585[var2], class88.field1682[var2], class69.field1350[var2], class113.field2167[var2], var7);
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class50.field841[class69.method443(var4[var6], 255)];
                }
                var1[var2] = new class264(class229.field4196, class53.field941, class138.field2585[var2], class88.field1682[var2], class69.field1350[var2], class113.field2167[var2], var5);
            }
            var2++;
        }
        class229.method1636((byte) 28);
        return var1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)Z")
    public static final boolean method1262(byte arg0, int arg1) {
        if (arg0 >= -11) {
            method1257(-26);
        }
        field3148++;
        return (arg1 >> 31 & 0x1) != 0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class121 {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Lof;")
    private class328 field1649 = new class328(64);

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Lmn;")
    private class162 field1652;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Lof;")
    public static class328 field1653 = new class328(4);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
    public static final void method759(int arg0, int arg1) {
        if (arg0 <= 110) {
            return;
        }
        field1650++;
        for (class529 var2 = class368.field5673.method1119(false); var2 != null; var2 = class368.field5673.method1121((byte) -125)) {
            if (((long) arg1) == (var2.field7780 >> 48 & 0xFFFFL)) {
                var2.method3149(102);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)Lrk;")
    public final class198 method760(int arg0, int arg1) {
        field1654++;
        class328 var3 = this.field1649;
        class198 var4;
        synchronized (this.field1649) {
            var4 = (class198) this.field1649.method2191((byte) -73, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != -18573) {
            this.method762((byte) -108);
        }
        class162 var5 = this.field1652;
        byte[] var6;
        synchronized (this.field1652) {
            var6 = this.field1652.method1004(class56.method434(arg0 ^ 0x6C416E59, arg1), false, class447.method2822(arg1, 84));
        }
        class198 var7 = new class198();
        if (var6 != null) {
            var7.method1362(96, new class208(var6));
        }
        class328 var8 = this.field1649;
        synchronized (this.field1649) {
            this.field1649.method2188(arg0 + 18451, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method761(int arg0) {
        field1653 = null;
        int var1 = 43 / ((arg0 + 84) / 34);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public final void method762(byte arg0) {
        class328 var2 = this.field1649;
        synchronized (this.field1649) {
            this.field1649.method2187(-1);
        }
        field1648++;
        if (arg0 >= -12) {
            field1653 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)V")
    public final void method763(boolean arg0, int arg1) {
        if (!arg0) {
            field1653 = null;
        }
        class328 var3 = this.field1649;
        synchronized (this.field1649) {
            this.field1649.method2202(0, arg1);
        }
        field1656++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)V")
    public final void method764(byte arg0, int arg1) {
        field1655++;
        int var3 = -63 % ((arg0 + 40) / 58);
        class328 var4 = this.field1649;
        synchronized (this.field1649) {
            this.field1649.method2189(false);
            this.field1649 = new class328(arg1);
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lpr;ILmn;)V")
    public class121(class236 arg0, int arg1, class162 arg2) {
        this.field1652 = arg2;
        if (this.field1652 != null) {
            int var4 = this.field1652.method1023(126) - 1;
            this.field1652.method1008(var4, (byte) -21);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public final void method765(int arg0) {
        if (arg0 != -661) {
            return;
        }
        field1657++;
        class328 var2 = this.field1649;
        synchronized (this.field1649) {
            this.field1649.method2189(false);
        }
    }
}

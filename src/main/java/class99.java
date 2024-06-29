import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class99 {

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Laf;")
    private class39 field1158 = new class39(64);

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lae;")
    private class283 field1154;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lpja;")
    public static class171 field1151;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Lae;")
    public static class283 field1155;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
    public final void method705(int arg0, int arg1) {
        field1156++;
        class39 var3 = this.field1158;
        synchronized (this.field1158) {
            this.field1158.method308(arg0 - 1, arg1);
        }
        if (arg0 != 0) {
            field1155 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;BILjava/lang/String;I)V")
    public static final void method706(String arg0, String arg1, int arg2, String arg3, String arg4, byte arg5, int arg6, String arg7, int arg8) {
        field1160++;
        if (arg5 != -10) {
            return;
        }
        class598 var9 = class501.field6855[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class501.field6855[var10] = class501.field6855[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class598(arg6, arg8, arg1, arg3, arg0, arg7, arg2, arg4);
        } else {
            var9.method3475(arg8, arg1, arg2, true, arg3, arg0, arg7, arg6, arg4);
        }
        class380.field5450++;
        class501.field6855[0] = var9;
        class323.field4563 = class453.field6312;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)Z")
    public static final boolean method707(int arg0, int arg1) {
        field1152++;
        if (arg1 >= -117) {
            method707(10, 88);
        }
        return arg0 == 0 || arg0 == 2;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public final void method708(int arg0) {
        field1153++;
        class39 var2 = this.field1158;
        synchronized (this.field1158) {
            this.field1158.method314(-2);
            if (arg0 != 11) {
                this.method711(88);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)Lsp;")
    public final class771 method709(byte arg0, int arg1) {
        field1157++;
        class39 var3 = this.field1158;
        class771 var4;
        synchronized (this.field1158) {
            var4 = (class771) this.field1158.method312(0, (long) arg1);
        }
        if (arg0 <= 96) {
            field1151 = null;
        }
        if (var4 != null) {
            return var4;
        }
        class283 var5 = this.field1154;
        byte[] var6;
        synchronized (this.field1154) {
            var6 = this.field1154.method1849(arg1, (byte) 86, 11);
        }
        class771 var7 = new class771();
        if (var6 != null) {
            var7.method4255(26738, new class511(var6));
        }
        class39 var8 = this.field1158;
        synchronized (this.field1158) {
            this.field1158.method305(var7, (long) arg1, 18320);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ljk;ILae;)V")
    public class99(class788 arg0, int arg1, class283 arg2) {
        this.field1154 = arg2;
        if (this.field1154 != null) {
            this.field1154.method1867(11, (byte) 49);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public static void method710(int arg0) {
        field1151 = null;
        if (arg0 >= -25) {
            field1151 = null;
        }
        field1155 = null;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public final void method711(int arg0) {
        if (arg0 != -15855) {
            field1155 = null;
        }
        class39 var2 = this.field1158;
        synchronized (this.field1158) {
            this.field1158.method319(-24);
        }
        field1159++;
    }
}

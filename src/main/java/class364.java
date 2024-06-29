import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class364 {

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "B")
    public byte field4879;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Z")
    public boolean field4876;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "S")
    public short field4884;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public int field4881;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "S")
    public short field4887;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public int field4883;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "B")
    public byte field4888;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "S")
    public short field4880;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "[Lqq;")
    public static class653[] field4885 = new class653[300];

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lqg;")
    public static class216 field4875 = new class216("LIVE", 0);

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Lps;")
    public static class469 field4889 = new class469(12, 3);

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field4890 = new String[8];

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Lmo;")
    public static class365 field4891;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Ltf;")
    public static class701 field4874;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZZLgu;Lgu;III)I", line = 4)
    public static final int method2126(boolean arg0, boolean arg1, class130 arg2, class130 arg3, int arg4, int arg5, int arg6) {
        field4877++;
        int var7 = class597.method3348(arg2, arg3, arg5, (byte) 82, arg0);
        if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else {
            if (arg4 != -17260) {
                method2126(false, false, null, null, -11, 44, 36);
            }
            int var8 = class597.method3348(arg2, arg3, arg6, (byte) 105, arg1);
            return arg1 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I", line = 39)
    public static final int method2127(int arg0) {
        field4886++;
        if (arg0 != -21221) {
            return -21;
        }
        if (class497.field7199 == null) {
            if (!class188.field2148 && class661.field9266 > 0) {
                if (class701.field9845 && class140.field1549.method1945(81, false) && class661.field9266 > 2) {
                    return ((class336) class694.field9730.field8677.field4174.field4174).field4224;
                }
                return ((class336) class694.field9730.field8677.field4174).field4224;
            }
            int var1 = class108.field1166.method253(true);
            int var2 = class108.field1166.method252(7);
            int var3 = class200.field2357;
            int var4 = class376.field5112;
            int var5 = class598.field8426;
            if (var3 < var1 && var1 < var3 + var5) {
                int var6 = -1;
                for (int var7 = 0; var7 < class661.field9266; var7++) {
                    if (class213.field2597) {
                        int var11 = var4 + ((class661.field9266 - 1 + -var7) * 16) + 33;
                        if ((var11 - 13) < var2 && var2 <= var11 + 3) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class661.field9266 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > (var12 - 13) && var2 <= (var12 + 3)) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class217 var9 = new class217(class694.field9730);
                    for (class336 var10 = (class336) var9.method1270(true); var10 != null; var10 = (class336) var9.method1268(-15212)) {
                        if (var8++ == var6) {
                            return var10.field4224;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V", line = 136)
    public static void method2128(boolean arg0) {
        if (!arg0) {
            method2129(-83, 73);
        }
        field4890 = null;
        field4889 = null;
        field4874 = null;
        field4875 = null;
        field4891 = null;
        field4885 = null;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 158)
    public class364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field4879 = (byte) arg7;
        this.field4876 = arg9;
        this.field4884 = (short) arg4;
        this.field4881 = arg10;
        this.field4887 = (short) arg5;
        this.field4883 = arg0;
        this.field4888 = (byte) arg8;
        this.field4880 = (short) arg6;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V", line = 179)
    public static final void method2129(int arg0, int arg1) {
        field4878++;
        class76 var2 = class3.method28(arg0, (byte) 42, arg1);
        var2.method406(-975503968);
    }
}

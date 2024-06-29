import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public abstract class class552 extends class256 {

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "S")
    public short field7274;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "[I")
    public static int[] field7278;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(Lha;B)Z")
    public final boolean method1560(class59 arg0, byte arg1) {
        if (arg1 != 35) {
            method3078(40);
        }
        ++field7273;
        return class336.method2023((byte) -117, super.field3515, super.field3505 >> class140.field2224, super.field3502 >> class140.field2224);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)Lfk;")
    public static final class654 method3077(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        } else {
            ++field7275;
            return ~arg1 <= -1 && ~arg1 > -101 ? class739.field10205[arg1] : null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "(I)V")
    public static void method3078(int arg0) {
        if (arg0 != 32397) {
            field7278 = null;
        }
        field7278 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)Z")
    public static final boolean method3079(int arg0, int arg1, int arg2) {
        ++field7279;
        if (!class403.field5625) {
            return false;
        } else {
            int var3 = arg1 >> 16;
            int var4 = 65535 & arg1;
            if (arg0 != -12599) {
                method3080(-25, 69);
            }
            if (class747.field10393[var3] != null && class747.field10393[var3][var4] != null) {
                class672 var5 = class747.field10393[var3][var4];
                if (arg2 == -1 && ~var5.field9239 == -1) {
                    for (class433 var6 = (class433) class446.field6126.method21(2); var6 != null; var6 = (class433) class446.field6126.method9(arg0 + 12472)) {
                        if (~var6.field5963 == -26 || var6.field5963 == 1003 || var6.field5963 == 17 || ~var6.field5963 == -49 || ~var6.field5963 == -31) {
                            for (class672 var7 = class21.method225(65535, var6.field5951); var7 != null; var7 = class442.method2542(false, var7)) {
                                if (~var5.field9200 == ~var7.field9200) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class433 var8 = (class433) class446.field6126.method21(2); var8 != null; var8 = (class433) class446.field6126.method9(arg0 + 12471)) {
                        if (~var8.field5962 == ~arg2 && var5.field9200 == var8.field5951 && (~var8.field5963 == -26 || var8.field5963 == 1003 || ~var8.field5963 == -18 || ~var8.field5963 == -49 || var8.field5963 == 30)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)V")
    public static final void method3080(int arg0, int arg1) {
        if (arg0 == -1) {
            ++field7276;
            class127 var2 = class760.method4231(arg1, -874792672, 12);
            var2.method1002(-98);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([Ltn;B)I")
    public final int method1557(class87[] arg0, byte arg1) {
        ++field7277;
        return arg1 != -58 ? -47 : this.method1561(arg0, super.field3505 >> class140.field2224, (byte) 85, super.field3502 >> class140.field2224);
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)Z")
    public final boolean method1558(int arg0) {
        ++field7272;
        if (arg0 > -100) {
            this.method1560((class59) null, (byte) 8);
        }
        return class672.field9269[(super.field3505 >> class140.field2224) - class458.field6258 - -class183.field2779][(super.field3502 >> class140.field2224) + class183.field2779 + -class610.field8134];
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IIIIII)V")
    public class552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field3508 = (byte) arg3;
        super.field3502 = arg2;
        super.field3505 = arg0;
        this.field7274 = (short) arg5;
        super.field3515 = (byte) arg4;
        super.field3510 = arg1;
    }
}

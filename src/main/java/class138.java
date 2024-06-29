import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class138 {

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "Lwp;")
    public static class453 field1787 = new class453(18, 4);

    @OriginalMember(owner = "client!ida", name = "h", descriptor = "[I")
    public static int[] field1793 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ida", name = "l", descriptor = "Lil;")
    public static class68 field1797 = new class68(8);

    @OriginalMember(owner = "client!ida", name = "n", descriptor = "[I")
    public static int[] field1799 = new int[32];

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!ida", name = "j", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!ida", name = "k", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!ida", name = "m", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "Lida;")
    public class138 field1789;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "Lqda;")
    public class172 field1786;

    @OriginalMember(owner = "client!ida", name = "i", descriptor = "[Lsw;")
    public static class11[] field1794;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIIZII)V", line = 5)
    public static final void method790(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field1795++;
        int var6 = arg0 - arg2;
        int var7 = arg1 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class26.method181(arg4, arg0, (byte) 125, arg5, arg2);
            }
        } else if (var6 == 0) {
            class221.method1308(arg2, arg1, (byte) -80, arg4, arg5);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg5;
                arg5 = arg2;
                int var10 = arg1;
                arg2 = var9;
                arg1 = arg0;
                arg0 = var10;
            }
            if (arg5 > arg1) {
                int var11 = arg5;
                int var12 = arg2;
                arg5 = arg1;
                arg2 = arg0;
                arg1 = var11;
                arg0 = var12;
            }
            int var13 = arg2;
            int var14 = arg1 - arg5;
            int var15 = arg0 - arg2;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg2 < arg0 ? 1 : -1;
            if (var8) {
                for (int var18 = arg5; var18 <= arg1; var18++) {
                    class550.field7650[var18][var13] = arg4;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg5; var19 <= arg1; var19++) {
                    class550.field7650[var13][var19] = arg4;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
            if (arg3) {
                field1787 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Z)V", line = 123)
    public static void method791(boolean arg0) {
        field1793 = null;
        field1797 = null;
        field1799 = null;
        field1787 = null;
        if (arg0) {
            field1787 = null;
        }
        field1794 = null;
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(Z)V", line = 142)
    public static final void method792(boolean arg0) {
        if (arg0) {
            field1794 = null;
        }
        field1792++;
        class337.field4338.method1075(class384.field4843, class301.field3698.field6609 ? class172.field2249 + 256 << 2 : -1, 0);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(BI)V", line = 163)
    public static final void method793(byte arg0, int arg1) {
        field1790++;
        int var2 = 7 / ((arg0 - 39) / 45);
        class592 var3 = class61.method371(1, arg1, (byte) -127);
        var3.method3253(0);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V", line = 175)
    public final void method794(int arg0) {
        field1788++;
        if (arg0 < ~class91.field1280) {
            this.field1786 = null;
            this.field1789 = class281.field3525;
            class91.field1280++;
            class281.field3525 = this;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIB)Lkp;", line = 202)
    public static final class507 method795(int arg0, int arg1, byte arg2) {
        field1791++;
        class507 var3 = class156.method894(-1018745488, arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field6707 == null || arg1 >= var3.field6707.length) {
            return null;
        } else if (arg2 < 36) {
            return null;
        } else {
            return var3.field6707[arg1];
        }
    }
}

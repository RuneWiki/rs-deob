import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class555 extends class392 {

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "Z")
    public static boolean field7709 = false;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!uu", name = "n", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!uu", name = "o", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "[[B")
    public static byte[][] field7705;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(Z)V", line = 8)
    public final void method291(boolean arg0) {
        if (super.field5452 != 1 && ~super.field5452 != -1) {
            super.field5452 = this.method292(true);
        }
        ++field7699;
        if (arg0) {
            field7709 = true;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V", line = 23)
    public static final void method3200(byte arg0) {
        ++field7701;
        if (~class420.field5820.field9495.method1677(17539) == -1 && class403.field5560 != class112.field1620) {
            class694.method3901(11, class263.field3718, 26055, class732.field10181, false);
        } else {
            if (arg0 < 28) {
                field7709 = false;
            }
            class403.method2393(class686.field9702, (byte) 115);
            if (class403.field5560 != class381.field5338) {
                class244.method1624(true);
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(ILw;)V", line = 45)
    public class555(int arg0, class675 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Z)I", line = 51)
    public final int method292(boolean arg0) {
        ++field7702;
        if (!arg0) {
            this.method292(false);
        }
        return 1;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(II)I", line = 62)
    public final int method290(int arg0, int arg1) {
        if (arg1 >= -124) {
            field7705 = null;
        }
        ++field7708;
        return 1;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)I", line = 73)
    public final int method3201(int arg0) {
        ++field7700;
        if (arg0 != 17539) {
            this.method292(true);
        }
        return super.field5452;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BI)V", line = 84)
    public final void method286(byte arg0, int arg1) {
        ++field7706;
        int var3 = 90 % ((arg0 - -80) / 38);
        super.field5452 = arg1;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)Lw;", line = 94)
    public static final class675 method3202(byte arg0) {
        ++field7704;
        class694 var1 = null;
        class675 var2 = new class675(class113.field1647, 0);
        try {
            int var3 = -82 / (-arg0 / 56);
            class746 var4 = class336.field4775.method907("", true, -14087);
            while (~var4.field10365 == -1) {
                class579.method3405(1L, 10);
            }
            if (~var4.field10365 == -2) {
                var1 = (class694) var4.field10371;
                byte[] var5 = new byte[(int) var1.method3896(-8486)];
                int var7;
                for (int var6 = 0; var6 < var5.length; var6 += var7) {
                    var7 = var1.method3904(var6, var5.length - var6, var5, 127);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class675(new class431(var5), class113.field1647, 0);
            }
        } catch (Exception var9) {
        }
        try {
            if (var1 != null) {
                var1.method3900(113);
            }
        } catch (Exception var8) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lw;)V", line = 146)
    public class555(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(Z)V", line = 151)
    public static void method3203(boolean arg0) {
        field7705 = null;
        if (arg0) {
            field7705 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILjava/lang/String;)V", line = 165)
    public static final void method3204(int arg0, String arg1) {
        ++field7703;
        if (arg1 != null) {
            if ((~class381.field5340 > -201 || class29.field315) && class381.field5340 < 200) {
                String var2 = class147.method1160(-128, arg1);
                if (arg0 != 27900) {
                    field7705 = null;
                }
                if (var2 != null) {
                    for (int var3 = 0; var3 < class381.field5340; ++var3) {
                        String var8 = class147.method1160(arg0 + -27776, class586.field8428[var3]);
                        if (var8 != null && var8.equals(var2)) {
                            class446.method2645(arg1 + class563.field7836.method3281(class423.field5892, -1), 0, 4);
                            return;
                        }
                        if (class713.field9952[var3] != null) {
                            String var9 = class147.method1160(arg0 ^ 27828, class713.field9952[var3]);
                            if (var9 != null && var9.equals(var2)) {
                                class446.method2645(arg1 + class563.field7836.method3281(class423.field5892, -1), arg0 + -27900, 4);
                                return;
                            }
                        }
                    }
                    for (int var4 = 0; ~class458.field6267 < ~var4; ++var4) {
                        String var6 = class147.method1160(-120, class263.field3721[var4]);
                        if (var6 != null && var6.equals(var2)) {
                            class446.method2645(class563.field7841.method3281(class423.field5892, -1) + arg1 + class563.field7842.method3281(class423.field5892, -1), arg0 + -27900, 4);
                            return;
                        }
                        if (class581.field8364[var4] != null) {
                            String var7 = class147.method1160(-118, class581.field8364[var4]);
                            if (var7 != null && var7.equals(var2)) {
                                class446.method2645(class563.field7841.method3281(class423.field5892, -1) + arg1 + class563.field7842.method3281(class423.field5892, arg0 + -27901), 0, 4);
                                return;
                            }
                        }
                    }
                    if (class147.method1160(arg0 ^ -27890, class719.field10041.field212).equals(var2)) {
                        class446.method2645(class563.field7839.method3281(class423.field5892, -1), 0, 4);
                    } else {
                        ++class647.field9189;
                        class302 var5 = class582.method3419(class604.field8579, (byte) 127, class626.field8901);
                        var5.field4341.method2524(false, class389.method2339(arg1, true));
                        var5.field4341.method2566(-2, arg1);
                        class501.method2928(0, var5);
                    }
                }
            } else {
                class446.method2645(class563.field7809.method3281(class423.field5892, -1), 0, 4);
            }
        }
    }
}

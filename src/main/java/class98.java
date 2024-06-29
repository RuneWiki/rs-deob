import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class98 extends class194 {

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
    public static int field1147 = -1;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "[Lti;")
    public static class208[] field1148 = new class208[16];

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
    private int field1145;

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
    private int field1146;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!ci", name = "N", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!ci", name = "O", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "I")
    private int field1155;

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(I)V", line = 5)
    private class98(int arg0) {
        super(0, false);
        this.method603((byte) -127, arg0);
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)[[I", line = 14)
    public final int[][] method59(int arg0, int arg1) {
        ++field1152;
        int[][] var3 = super.field2283.method1667(arg1, -84);
        if (arg0 != -730) {
            method604(28);
        }
        if (super.field2283.field3451) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class138.field1579; ++var7) {
                var4[var7] = this.field1155;
                var5[var7] = this.field1145;
                var6[var7] = this.field1146;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "(I)Z", line = 54)
    public static final boolean method602(int arg0) {
        if (arg0 != 65280) {
            method604(-78);
        }
        ++field1150;
        return class20.field220 == 0 ? class270.field3485 : true;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)V", line = 76)
    private final void method603(byte arg0, int arg1) {
        ++field1154;
        this.field1155 = arg1 >> 12 & 4080;
        if (arg0 >= -99) {
            method602(-73);
        }
        this.field1146 = (255 & arg1) << 4;
        this.field1145 = (65280 & arg1) >> 4;
    }

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "(I)V", line = 91)
    public static void method604(int arg0) {
        if (arg0 != 0) {
            method605(47, true, (String) null);
        }
        field1148 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILbg;)V", line = 102)
    public final void method54(int arg0, int arg1, class242 arg2) {
        int var4 = -104 / ((52 - arg1) / 61);
        if (arg0 == 0) {
            this.method603((byte) -118, arg2.method1545(8));
        }
        ++field1149;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 130)
    public static final void method605(int arg0, boolean arg1, String arg2) {
        ++field1151;
        if (arg2 != null) {
            if (~class368.field5019 <= -101) {
                class134.method876((byte) -111, class53.field622.method434(class373.field5057, -8192));
            } else {
                String var3 = class405.method2524((byte) -72, arg2);
                if (var3 != null) {
                    for (int var4 = 0; ~var4 > ~class368.field5019; ++var4) {
                        String var8 = class405.method2524((byte) -55, class319.field4290[var4]);
                        if (var8 != null && var8.equals(var3)) {
                            class134.method876((byte) -111, arg2 + class170.field1990.method434(class373.field5057, -8192));
                            return;
                        }
                        if (class89.field1026[var4] != null) {
                            String var9 = class405.method2524((byte) 102, class89.field1026[var4]);
                            if (var9 != null && var9.equals(var3)) {
                                class134.method876((byte) -111, arg2 + class170.field1990.method434(class373.field5057, -8192));
                                return;
                            }
                        }
                    }
                    for (int var5 = 0; class332.field4536 > var5; ++var5) {
                        String var6 = class405.method2524((byte) -49, class107.field1275[var5]);
                        if (var6 != null && var6.equals(var3)) {
                            class134.method876((byte) -111, class412.field5670.method434(class373.field5057, -8192) + arg2 + class70.field872.method434(class373.field5057, arg0 + -8193));
                            return;
                        }
                        if (class300.field4007[var5] != null) {
                            String var7 = class405.method2524((byte) 84, class300.field4007[var5]);
                            if (var7 != null && var7.equals(var3)) {
                                class134.method876((byte) -111, class412.field5670.method434(class373.field5057, -8192) + arg2 + class70.field872.method434(class373.field5057, -8192));
                                return;
                            }
                        }
                    }
                    if (class405.method2524((byte) 68, class143.field1684.field1480).equals(var3)) {
                        class134.method876((byte) -111, class104.field1225.method434(class373.field5057, -8192));
                    } else {
                        ++class403.field5600;
                        class427.field5837.method2162(false, 136);
                        class427.field5837.method1593(class350.method2229(2, arg2) + arg0, -104);
                        class427.field5837.method1562(-61, arg2);
                        class427.field5837.method1593(!arg1 ? 0 : 1, arg0 ^ -114);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 225)
    public class98() {
        this(0);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class365 extends class508 {

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "[I")
    private int[] field4977 = new int[this.field7357];

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "S")
    public static short field4986 = 32767;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    private int field4981;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    private int field4989;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "[B")
    private byte[] field4988;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public final void method556(byte arg0) {
        this.field4981 = 0;
        this.field4989 = 0;
        ++field4978;
        if (arg0 <= 41) {
            this.method1385((byte) 4, 67, -122);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)V")
    public final void method554(int arg0, int arg1, byte arg2) {
        ++field4980;
        this.field4981 += this.field4977[arg0] * arg1 >> 12;
        if (arg2 > -106) {
            field4987 = 60;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
    public static final void method2170(int arg0) {
        if (arg0 != -2830) {
            field4987 = -29;
        }
        ++field4979;
        if (class264.field3541 > 0) {
            int var1 = 0;
            for (int var2 = 0; class176.field2278.length > var2; ++var2) {
                if (class176.field2278[var2].startsWith("--> ")) {
                    ++var1;
                    if (~class264.field3541 == ~var1) {
                        class470.field6980 = class176.field2278[var2].substring(4);
                        return;
                    }
                }
            }
        } else {
            class470.field6980 = "";
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BII)V")
    public void method1385(byte arg0, int arg1, int arg2) {
        this.field4988[this.field4989++] = (byte) (127 + (class95.method534(255, arg0) >> 1));
        ++field4976;
        if (arg2 != 18936) {
            method2171(110);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public final void method559(int arg0) {
        ++field4984;
        this.field4981 = Math.abs(this.field4981);
        if (arg0 != -4096) {
            this.field4989 = -82;
        }
        if (~this.field4981 <= -4097) {
            this.field4981 = 4095;
        }
        this.method1385((byte) (this.field4981 >> 4), this.field4989++, 18936);
        this.field4981 = 0;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
    public static final void method2171(int arg0) {
        if (arg0 != -32007) {
            field4986 = -94;
        }
        if (class137.field1837.toLowerCase().indexOf("microsoft") != -1) {
            class497.field7252[188] = 71;
            class497.field7252[221] = 43;
            class497.field7252[219] = 42;
            class497.field7252[220] = 74;
            class497.field7252[222] = 59;
            class497.field7252[186] = 57;
            class497.field7252[192] = 58;
            class497.field7252[189] = 26;
            class497.field7252[223] = 28;
            class497.field7252[190] = 72;
            class497.field7252[187] = 27;
            class497.field7252[191] = 73;
        } else {
            class497.field7252[61] = 27;
            class497.field7252[91] = 42;
            if (class137.field1842 == null) {
                class497.field7252[192] = 58;
                class497.field7252[222] = 59;
            } else {
                class497.field7252[520] = 59;
                class497.field7252[192] = 28;
                class497.field7252[222] = 58;
            }
            class497.field7252[44] = 71;
            class497.field7252[92] = 74;
            class497.field7252[47] = 73;
            class497.field7252[93] = 43;
            class497.field7252[59] = 57;
            class497.field7252[46] = 72;
            class497.field7252[45] = 26;
        }
        ++field4983;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIILjava/lang/Class;)Lns;")
    public static final class279 method2172(int arg0, int arg1, int arg2, Class arg3) {
        class498 var4 = class186.field2421[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        } else {
            for (class192 var5 = var4.field7263; var5 != null; var5 = var5.field2469) {
                class279 var6 = var5.field2466;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field3698 == arg1 && var6.field3688 == arg2) {
                    return var6;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IIIIIF)V")
    public class365(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field7357 < ~var7; ++var7) {
            this.field4977[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
    public static final void method2173(int arg0) {
        ++field4982;
        class86 var1 = null;
        try {
            if (arg0 != 45) {
                field4987 = -67;
            }
            class236 var2 = class381.field5518.method850("2", true, true);
            while (var2.field3149 == 0) {
                class316.method1873(1L, false);
            }
            if (var2.field3149 == 1) {
                var1 = (class86) var2.field3151;
                class396 var3 = new class396(class267.field3573 * 6 + 3);
                var3.method2449((byte) 117, 1);
                var3.method2444((byte) 65, class267.field3573);
                for (int var4 = 0; var4 < class302.field3999.length; ++var4) {
                    if (class272.field3636[var4]) {
                        var3.method2444((byte) 65, var4);
                        var3.method2398(117, class302.field3999[var4]);
                    }
                }
                var1.method469(0, var3.field5729, 23609, var3.field5761);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method472(-29827);
            }
        } catch (Exception var5) {
        }
        class340.field4495 = class45.method252((byte) -8);
        class323.field4297 = false;
    }
}

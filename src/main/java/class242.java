import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class242 {

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "Ljava/lang/String;")
    private String field3423 = "null";

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "Lkm;")
    public static class299 field3434 = new class299();

    @OriginalMember(owner = "client!uu", name = "r", descriptor = "Z")
    public static boolean field3435 = false;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "C")
    public char field3418;

    @OriginalMember(owner = "client!uu", name = "p", descriptor = "C")
    public char field3433;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
    private int field3426;

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!uu", name = "n", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!uu", name = "o", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "Lsd;")
    private class80 field3422;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "Lsd;")
    public class80 field3427;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V")
    public static void method1608(byte arg0) {
        field3434 = null;
        if (arg0 > -49) {
            method1612(-13, 99, false, -38, -121, -54, -78, (byte) -36, 0);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILrt;B)V")
    private final void method1609(int arg0, class194 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field3433 = class247.method1635(16, arg1.method1213((byte) 21));
        } else if (arg0 == 2) {
            this.field3418 = class247.method1635(16, arg1.method1213((byte) 106));
        } else if (arg0 == 3) {
            this.field3423 = arg1.method1218(false);
        } else if (arg0 == 4) {
            this.field3426 = arg1.method1178(-230315992);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method1220(-128);
            this.field3427 = new class80(class367.method2354(-224121456, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1178(-230315992);
                class324 var7;
                if (arg0 == 5) {
                    var7 = new class621(arg1.method1218(false));
                } else {
                    var7 = new class388(arg1.method1178(-230315992));
                }
                this.field3427.method520((byte) -97, var7, (long) var6);
            }
        }
        field3424++;
        if (arg2 >= -46) {
            this.method1614(87);
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)V")
    private final void method1610(byte arg0) {
        this.field3422 = new class80(this.field3427.method529(false));
        field3429++;
        for (class621 var2 = (class621) this.field3427.method523(-119); var2 != null; var2 = (class621) this.field3427.method530(arg0 ^ 0x31AD)) {
            class297 var3 = new class297(var2.field8996, (int) var2.field4676);
            this.field3422.method520((byte) -94, var3, class130.method802(var2.field8996, false));
        }
        if (arg0 != 7) {
            this.field3426 = -25;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBI)I")
    public static final int method1611(int arg0, byte arg1, int arg2) {
        field3428++;
        if (arg1 >= -78) {
            method1608((byte) -6);
        }
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg0 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg0 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIZIIIIBI)Z")
    public static final boolean method1612(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field3420++;
        if (arg7 <= 64) {
            field3434 = null;
        }
        int var9 = class439.field6548.field2515[0];
        int var10 = class439.field6548.field2524[0];
        if (var9 < 0 || class90.field1032 <= var9 || var10 < 0 || class30.field349 <= var10) {
            return false;
        } else if (arg0 >= 0 && class90.field1032 > arg0 && arg8 >= 0 && class30.field349 > arg8) {
            int var11 = class371.method2388(arg6, var10, arg1, class439.field6548.method1153(true), (byte) 80, class353.field5027, class14.field120[class439.field6548.field1757], class322.field4656, arg2, arg5, arg3, arg4, var9, arg8, arg0);
            if (var11 < 1) {
                return false;
            }
            class82.field925 = class322.field4656[var11 - 1];
            class50.field531 = class353.field5027[var11 - 1];
            class87.field992 = false;
            class304.method2026((byte) 73);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BI)Z")
    public final boolean method1613(byte arg0, int arg1) {
        field3431++;
        if (this.field3427 == null) {
            return false;
        }
        int var3 = 77 / ((arg0 - 46) / 63);
        if (this.field3422 == null) {
            this.method1614(24489);
        }
        class388 var4 = (class388) this.field3422.method524((byte) 100, (long) arg1);
        return var4 != null;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
    private final void method1614(int arg0) {
        field3419++;
        this.field3422 = new class80(this.field3427.method529(false));
        class388 var2 = (class388) this.field3427.method523(-122);
        if (arg0 != 24489) {
            this.field3418 = (char) 65492;
        }
        while (var2 != null) {
            class388 var3 = new class388((int) var2.field4676);
            this.field3422.method520((byte) -76, var3, (long) var2.field5965);
            var2 = (class388) this.field3427.method530(12714);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILrt;)V")
    public final void method1615(int arg0, class194 arg1) {
        while (true) {
            int var3 = arg1.method1177(255);
            if (var3 == 0) {
                if (arg0 <= 97) {
                    return;
                }
                field3432++;
                return;
            }
            this.method1609(var3, arg1, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method1616(String arg0, byte arg1) {
        field3421++;
        int var3 = -17 % ((-arg1 - 35) / 40);
        if (this.field3427 == null) {
            return false;
        }
        if (this.field3422 == null) {
            this.method1610((byte) 7);
        }
        for (class297 var4 = (class297) this.field3422.method524((byte) 126, class130.method802(arg0, false)); var4 != null; var4 = (class297) this.field3422.method526(2)) {
            if (var4.field4398.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)I")
    public final int method1617(int arg0, int arg1) {
        if (arg0 < 86) {
            this.field3423 = null;
        }
        field3430++;
        if (this.field3427 == null) {
            return this.field3426;
        } else {
            class388 var3 = (class388) this.field3427.method524((byte) 91, (long) arg1);
            return var3 == null ? this.field3426 : var3.field5965;
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(BI)Ljava/lang/String;")
    public final String method1618(byte arg0, int arg1) {
        field3425++;
        if (this.field3427 == null) {
            return this.field3423;
        } else {
            int var3 = -23 % ((arg0 + 2) / 62);
            class621 var4 = (class621) this.field3427.method524((byte) 93, (long) arg1);
            return var4 == null ? this.field3423 : var4.field8996;
        }
    }
}

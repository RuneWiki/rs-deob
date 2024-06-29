import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class310 {

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Ljava/lang/String;")
    private String field4240 = "null";

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "[Lqr;")
    public static class23[] field4235 = new class23[2048];

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "[I")
    public static int[] field4241 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field4245 = 0;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "C")
    public char field4227;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "C")
    public char field4242;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    private int field4244;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "Lsq;")
    private class454 field4236;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Lsq;")
    public class454 field4246;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method1870(String arg0, byte arg1) {
        field4229++;
        if (this.field4246 == null) {
            return false;
        }
        if (this.field4236 == null) {
            this.method1880(-1);
        }
        if (arg1 < 86) {
            method1877((byte) -89);
        }
        for (class439 var3 = (class439) this.field4236.method2614(class114.method719((byte) -27, arg0), -80); var3 != null; var3 = (class439) this.field4236.method2616(false)) {
            if (var3.field6018.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method1871(int arg0) {
        if (arg0 > -10) {
            field4238 = 44;
        }
        field4235 = null;
        field4241 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILlk;)V")
    public final void method1872(int arg0, class425 arg1) {
        field4231++;
        while (true) {
            int var3 = arg1.method2503(true);
            if (var3 == 0) {
                if (arg0 == -31034) {
                    return;
                } else {
                    this.field4236 = null;
                    return;
                }
            }
            this.method1878(var3, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)I")
    public final int method1873(int arg0, int arg1) {
        field4230++;
        if (this.field4246 == null) {
            return this.field4244;
        }
        class128 var3 = (class128) this.field4246.method2614((long) arg0, arg1 - 21000);
        if (arg1 == 20916) {
            return var3 == null ? this.field4244 : var3.field1815;
        } else {
            return -85;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public final String method1874(boolean arg0, int arg1) {
        field4243++;
        if (this.field4246 == null) {
            return this.field4240;
        }
        if (arg0) {
            method1879(-48, 121, 117, -33, 106);
        }
        class329 var3 = (class329) this.field4246.method2614((long) arg1, 75);
        return var3 == null ? this.field4240 : var3.field4535;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)V")
    public static final void method1875(int arg0, int arg1) {
        class351.field4805 = null;
        if (arg1 != -7) {
            method1871(-79);
        }
        class344.field4708 = false;
        field4234++;
        class351.field4802 = arg0;
        class70.field1040 = 1;
        class71.field1041 = 0;
        class174.field2565 = -1;
        class18.field302 = -1;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)Z")
    public final boolean method1876(int arg0, int arg1) {
        field4226++;
        if (this.field4246 == null) {
            return false;
        }
        if (this.field4236 == null) {
            this.method1881(-4);
        }
        class128 var3 = (class128) this.field4236.method2614((long) arg0, -107);
        int var4 = 91 % ((24 - arg1) / 55);
        return var3 != null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static final void method1877(byte arg0) {
        if (arg0 == 29) {
            field4239++;
            class235.field3314.method2623((byte) 106);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILlk;I)V")
    private final void method1878(int arg0, class425 arg1, int arg2) {
        if (arg0 == 1) {
            this.field4242 = class104.method665(arg1.method2480(-8315), (byte) 48);
        } else if (arg0 == 2) {
            this.field4227 = class104.method665(arg1.method2480(arg2 ^ 0x207A), (byte) 67);
        } else if (arg0 == 3) {
            this.field4240 = arg1.method2464(false);
        } else if (arg0 == 4) {
            this.field4244 = arg1.method2502((byte) -86);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method2508(true);
            this.field4246 = new class454(class406.method2388(var4, -42));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method2502((byte) -86);
                class180 var7;
                if (arg0 == 5) {
                    var7 = new class329(arg1.method2464(false));
                } else {
                    var7 = new class128(arg1.method2502((byte) -86));
                }
                this.field4246.method2620((long) var6, var7, false);
            }
        }
        field4233++;
        if (arg2 != -1) {
            this.method1873(-99, -77);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V")
    public static final void method1879(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 > -121) {
            field4235 = null;
        }
        field4232++;
        class265 var5 = class440.method2554(arg3, 2, 4);
        var5.method1675(false);
        var5.field3692 = arg1;
        var5.field3689 = arg4;
        var5.field3698 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
    private final void method1880(int arg0) {
        this.field4236 = new class454(this.field4246.method2617(arg0 + 1033));
        field4237++;
        if (arg0 == -1) {
            for (class329 var2 = (class329) this.field4246.method2615((byte) -18); var2 != null; var2 = (class329) this.field4246.method2619((byte) -98)) {
                class439 var3 = new class439(var2.field4535, (int) var2.field2608);
                this.field4236.method2620(class114.method719((byte) -27, var2.field4535), var3, false);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
    private final void method1881(int arg0) {
        field4228++;
        this.field4236 = new class454(this.field4246.method2617(1032));
        for (class128 var2 = (class128) this.field4246.method2615((byte) -18); var2 != null; var2 = (class128) this.field4246.method2619((byte) -98)) {
            class128 var3 = new class128((int) var2.field2608);
            this.field4236.method2620((long) var2.field1815, var3, false);
        }
        if (arg0 != -4) {
            this.field4236 = null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class440 {

    @OriginalMember(owner = "client!hba", name = "s", descriptor = "Ljava/lang/String;")
    private String field5846 = "null";

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public static int field5831 = -1;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "Luf;")
    public static class380 field5830 = new class380(64);

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "C")
    public char field5828;

    @OriginalMember(owner = "client!hba", name = "n", descriptor = "C")
    public char field5841;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!hba", name = "i", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!hba", name = "j", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!hba", name = "k", descriptor = "I")
    private int field5838;

    @OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!hba", name = "m", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!hba", name = "o", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!hba", name = "p", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!hba", name = "r", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!hba", name = "u", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "Lwh;")
    private class546 field5834;

    @OriginalMember(owner = "client!hba", name = "q", descriptor = "Lwh;")
    public class546 field5844;

    @OriginalMember(owner = "client!hba", name = "t", descriptor = "Lk;")
    public static class91 field5847;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "([BBZ)Ljava/lang/Object;")
    public static final Object method2477(byte[] arg0, byte arg1, boolean arg2) {
        if (arg1 > -52) {
            return null;
        }
        field5840++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class8.field70) {
            try {
                class337 var3 = (class337) Class.forName("tp").getDeclaredConstructor().newInstance();
                var3.method1221(0, arg0);
                return var3;
            } catch (Throwable var4) {
                class8.field70 = true;
            }
        }
        return arg2 ? class339.method1981(0, arg0) : arg0;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lio;B)V")
    public final void method2478(class157 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method930(255);
            if (var3 == 0) {
                if (arg1 >= -21) {
                    method2477(null, (byte) -106, true);
                }
                field5842++;
                return;
            }
            this.method2484(arg0, var3, 5);
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
    public static void method2479(int arg0) {
        if (arg0 != 5) {
            method2479(-113);
        }
        field5847 = null;
        field5830 = null;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(BI)I")
    public final int method2480(byte arg0, int arg1) {
        field5835++;
        if (arg0 <= 46) {
            return -23;
        } else if (this.field5844 == null) {
            return this.field5838;
        } else {
            class37 var3 = (class37) this.field5844.method3057(1, (long) arg1);
            return var3 == null ? this.field5838 : var3.field505;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method2481(byte arg0, String arg1) {
        field5836++;
        if (this.field5844 == null) {
            return false;
        }
        if (this.field5834 == null) {
            this.method2489(11967);
        }
        for (class225 var3 = (class225) this.field5834.method3057(1, class542.method3042(arg1, -124)); var3 != null; var3 = (class225) this.field5834.method3062(78)) {
            if (var3.field2926.equals(arg1)) {
                return true;
            }
        }
        if (arg0 != 92) {
            this.method2481((byte) 65, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)Z")
    public final boolean method2482(int arg0, int arg1) {
        field5837++;
        if (arg0 != 5) {
            return false;
        } else if (this.field5844 == null) {
            return false;
        } else {
            if (this.field5834 == null) {
                this.method2483((byte) -62);
            }
            class37 var3 = (class37) this.field5834.method3057(arg0 - 4, (long) arg1);
            return var3 != null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V")
    private final void method2483(byte arg0) {
        this.field5834 = new class546(this.field5844.method3054((byte) -92));
        field5832++;
        if (arg0 != -62) {
            this.field5841 = (char) 65517;
        }
        for (class37 var2 = (class37) this.field5844.method3053((byte) 117); var2 != null; var2 = (class37) this.field5844.method3056(18113)) {
            class37 var3 = new class37((int) var2.field545);
            this.field5834.method3061(124, (long) var2.field505, var3);
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lio;II)V")
    private final void method2484(class157 arg0, int arg1, int arg2) {
        field5839++;
        if (arg2 != 5) {
            this.method2489(20);
        }
        if (arg1 == 1) {
            this.field5841 = class55.method322(arg0.method969(arg2 ^ 0x6), (byte) 104);
        } else if (arg1 == 2) {
            this.field5828 = class55.method322(arg0.method969(3), (byte) 40);
        } else if (arg1 == 3) {
            this.field5846 = arg0.method925(61);
        } else if (arg1 == 4) {
            this.field5838 = arg0.method908(false);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method963(-119);
            this.field5844 = new class546(class385.method2206(arg2 - 5, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method908(false);
                class45 var7;
                if (arg1 == 5) {
                    var7 = new class419(arg0.method925(52));
                } else {
                    var7 = new class37(arg0.method908(false));
                }
                this.field5844.method3061(arg2 + 120, (long) var6, var7);
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V")
    public static final void method2485(int arg0) {
        field5843++;
        class137.field1873 = arg0;
        class101.field1211.method2512(-11558);
        class674.field9590 = false;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIIIII)V")
    public static final void method2486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg4; var6 <= arg3; var6++) {
            class285.method1691(arg0, class315.field4224[var6], -7, arg1, arg2);
        }
        if (arg5 != 0) {
            method2485(2);
        }
        field5829++;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IB)V")
    public static final void method2487(int arg0, byte arg1) {
        if (arg1 >= 97) {
            class323.field4357.method2179(false, arg0);
            field5845++;
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(BI)Ljava/lang/String;")
    public final String method2488(byte arg0, int arg1) {
        field5833++;
        if (this.field5844 == null) {
            return this.field5846;
        }
        class419 var3 = (class419) this.field5844.method3057(1, (long) arg1);
        if (var3 == null) {
            return this.field5846;
        } else if (arg0 > -56) {
            return null;
        } else {
            return var3.field5506;
        }
    }

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "(I)V")
    private final void method2489(int arg0) {
        field5848++;
        this.field5834 = new class546(this.field5844.method3054((byte) -96));
        if (arg0 != 11967) {
            this.field5828 = 't';
        }
        for (class419 var2 = (class419) this.field5844.method3053((byte) 81); var2 != null; var2 = (class419) this.field5844.method3056(arg0 ^ 0x687E)) {
            class225 var3 = new class225(var2.field5506, (int) var2.field545);
            this.field5834.method3061(arg0 ^ 0x2EC3, class542.method3042(var2.field5506, 122), var3);
        }
    }
}

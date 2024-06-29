import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class363 {

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "Ljava/lang/String;")
    private String field5045 = "null";

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "Z")
    public static boolean field5056 = false;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "C")
    public char field5050;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "C")
    public char field5060;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
    private int field5059;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "Lmo;")
    private class482 field5055;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "Lmo;")
    public class482 field5057;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
    private final void method2178(int arg0) {
        field5054++;
        this.field5055 = new class482(this.field5057.method2820(false));
        for (class83 var2 = (class83) this.field5057.method2815(0); var2 != null; var2 = (class83) this.field5057.method2814(arg0 ^ 0x768B)) {
            class83 var3 = new class83((int) var2.field6265);
            this.field5055.method2816(var3, (long) var2.field1264, false);
        }
        if (arg0 != 30351) {
            method2179(null, -120);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lvo;I)V")
    public static final void method2179(class345 arg0, int arg1) {
        class10.field129 = arg0;
        if (arg1 <= -91) {
            field5044++;
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
    public static final void method2180(int arg0) {
        class495.field7246 = null;
        class105.field1750 = null;
        field5047++;
        int var1 = -12 / (-arg0 / 63);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZI)I")
    public final int method2181(boolean arg0, int arg1) {
        if (!arg0) {
            this.field5057 = null;
        }
        field5046++;
        if (this.field5057 == null) {
            return this.field5059;
        } else {
            class83 var3 = (class83) this.field5057.method2818(-22803, (long) arg1);
            return var3 == null ? this.field5059 : var3.field1264;
        }
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V")
    private final void method2182(int arg0) {
        this.field5055 = new class482(this.field5057.method2820(false));
        field5051++;
        if (arg0 > -45) {
            this.field5059 = 15;
        }
        for (class527 var2 = (class527) this.field5057.method2815(0); var2 != null; var2 = (class527) this.field5057.method2814(4)) {
            class25 var3 = new class25(var2.field7719, (int) var2.field6265);
            this.field5055.method2816(var3, class692.method3894(var2.field7719, -2), false);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method2183(int arg0, String arg1) {
        if (arg0 != 1005) {
            return false;
        }
        field5061++;
        if (this.field5057 == null) {
            return false;
        }
        if (this.field5055 == null) {
            this.method2182(-57);
        }
        for (class25 var3 = (class25) this.field5055.method2818(-22803, class692.method3894(arg1, -2)); var3 != null; var3 = (class25) this.field5055.method2810((byte) -45)) {
            if (var3.field349.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method2184(int arg0, byte arg1) {
        field5048++;
        if (this.field5057 == null) {
            return this.field5045;
        }
        class527 var3 = (class527) this.field5057.method2818(-22803, (long) arg0);
        if (var3 == null) {
            return this.field5045;
        } else {
            int var4 = -98 % ((arg1 + 21) / 40);
            return var3.field7719;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILek;I)V")
    private final void method2185(int arg0, class465 arg1, int arg2) {
        if (arg0 == 1) {
            this.field5060 = class409.method2446(arg1.method2712(arg2 ^ 0x4243), -18082);
        } else if (arg0 == 2) {
            this.field5050 = class409.method2446(arg1.method2712(arg2 ^ 0x425B), arg2 - 1176);
        } else if (arg0 == 3) {
            this.field5045 = arg1.method2717(true);
        } else if (arg0 == 4) {
            this.field5059 = arg1.method2691((byte) -67);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method2755((byte) -115);
            this.field5057 = new class482(class99.method830(var4, false));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method2691((byte) -67);
                class435 var7;
                if (arg0 == 5) {
                    var7 = new class527(arg1.method2717(true));
                } else {
                    var7 = new class83(arg1.method2691((byte) -67));
                }
                this.field5057.method2816(var7, (long) var6, false);
            }
        }
        if (arg2 == -16906) {
            field5058++;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lek;I)V")
    public final void method2186(class465 arg0, int arg1) {
        if (arg1 != -2) {
            this.method2178(120);
        }
        while (true) {
            int var3 = arg0.method2705(-99);
            if (var3 == 0) {
                field5052++;
                return;
            }
            this.method2185(var3, arg0, -16906);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZ)Z")
    public final boolean method2187(int arg0, boolean arg1) {
        field5053++;
        if (this.field5057 == null) {
            return false;
        }
        if (this.field5055 == null) {
            this.method2178(30351);
        }
        class83 var3 = (class83) this.field5055.method2818(-22803, (long) arg0);
        if (!arg1) {
            this.field5059 = 46;
        }
        return var3 != null;
    }
}

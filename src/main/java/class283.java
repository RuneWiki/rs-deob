import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class283 extends class135 {

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "Ljava/lang/String;")
    private String field4490 = "null";

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "[I")
    public static int[] field4485 = new int[100];

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "C")
    public char field4482;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "C")
    public char field4484;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    private int field4479;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "Lpk;")
    public class100 field4477;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "Lpk;")
    private class100 field4492;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1886(int arg0, String arg1) {
        field4483++;
        if (this.field4477 == null) {
            return false;
        } else if (arg0 == 2) {
            if (this.field4492 == null) {
                this.method1895((byte) 121);
            }
            for (class173 var3 = (class173) this.field4492.method665((byte) -45, class159.method1069(arg1, arg0 ^ 0x3)); var3 != null; var3 = (class173) this.field4492.method669(-20677)) {
                if (var3.field2722.equals(arg1)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Llj;II)V")
    private final void method1887(class25 arg0, int arg1, int arg2) {
        if (arg1 != 100) {
            this.field4479 = 4;
        }
        field4481++;
        if (arg2 == 1) {
            this.field4484 = class272.method1835(arg0.method188(arg1 + 5), (byte) -128);
        } else if (arg2 == 2) {
            this.field4482 = class272.method1835(arg0.method188(-101), (byte) -120);
        } else if (arg2 == 3) {
            this.field4490 = arg0.method189(false);
        } else if (arg2 == 4) {
            this.field4479 = arg0.method214((byte) 44);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method190(-3);
            this.field4477 = new class100(class279.method1869((byte) -29, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method214((byte) 44);
                class120 var7;
                if (arg2 == 5) {
                    var7 = new class2(arg0.method189(false));
                } else {
                    var7 = new class179(arg0.method214((byte) 44));
                }
                this.field4477.method662(0, var7, (long) var6);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public final String method1888(int arg0, boolean arg1) {
        field4493++;
        if (this.field4477 == null) {
            return this.field4490;
        } else if (arg1) {
            return null;
        } else {
            class2 var3 = (class2) this.field4477.method665((byte) -78, (long) arg0);
            return var3 == null ? this.field4490 : var3.field20;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLlj;)V")
    public final void method1889(byte arg0, class25 arg1) {
        field4486++;
        while (true) {
            int var3 = arg1.method201(255);
            if (var3 == 0) {
                if (arg0 > -83) {
                    this.field4479 = -43;
                    return;
                } else {
                    return;
                }
            }
            this.method1887(arg1, 100, var3);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)Z")
    public final boolean method1890(int arg0, byte arg1) {
        field4480++;
        if (this.field4477 == null) {
            return false;
        }
        if (this.field4492 == null) {
            this.method1893(-105);
        }
        if (arg1 != -33) {
            this.field4492 = null;
        }
        class179 var3 = (class179) this.field4492.method665((byte) -118, (long) arg0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V")
    public static void method1891(byte arg0) {
        if (arg0 != 27) {
            method1894((byte) -54, -115, true, -7, -22, 86, -3, 6, -51, -30, -95, -13);
        }
        field4485 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)I")
    public final int method1892(boolean arg0, int arg1) {
        field4487++;
        if (!arg0) {
            return -89;
        } else if (this.field4477 == null) {
            return this.field4479;
        } else {
            class179 var3 = (class179) this.field4477.method665((byte) 118, (long) arg1);
            return var3 == null ? this.field4479 : var3.field2791;
        }
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
    private final void method1893(int arg0) {
        this.field4492 = new class100(this.field4477.method664(-1));
        if (arg0 >= -37) {
            this.field4492 = null;
        }
        for (class179 var2 = (class179) this.field4477.method671(0); var2 != null; var2 = (class179) this.field4477.method666(100)) {
            class179 var3 = new class179((int) var2.field1750);
            this.field4492.method662(0, var3, (long) var2.field2791);
        }
        field4488++;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BIZIIIIIIIII)Z")
    public static final boolean method1894(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field4478++;
        if (class149.field2227.method565((byte) 0) == 2) {
            return class270.method1830(arg4, arg8, (byte) 126, arg3, arg6, arg9, arg7, arg10, arg5, arg11, arg2, arg1);
        } else if (class149.field2227.method565((byte) 0) > 2) {
            return class261.method1787(arg9, arg2, arg5, arg11, class149.field2227.method565((byte) 0), arg7, arg6, 100, arg1, arg3, arg8, arg10, arg4);
        } else if (arg0 <= 71) {
            return true;
        } else {
            return class207.method1409(arg5, arg8, arg10, arg4, arg2, arg9, arg7, (byte) 104, arg1, arg6, arg11, arg3);
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)V")
    private final void method1895(byte arg0) {
        field4491++;
        this.field4492 = new class100(this.field4477.method664(arg0 ^ 0xFFFFFF86));
        class2 var2 = (class2) this.field4477.method671(arg0 - 121);
        if (arg0 != 121) {
            this.field4492 = null;
        }
        while (var2 != null) {
            class173 var3 = new class173(var2.field20, (int) var2.field1750);
            this.field4492.method662(0, var3, class159.method1069(var2.field20, arg0 - 120));
            var2 = (class2) this.field4477.method666(94);
        }
    }
}

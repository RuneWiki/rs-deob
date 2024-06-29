import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class288 extends class259 {

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "Lcc;")
    public static class209 field5076 = class95.method669(120, "Impossible de trouver ");

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "Lcc;")
    public static class209 field5081 = class95.method669(108, "Moteur son pr-Bpar-B");

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "Lcc;")
    public static class209 field5088 = class95.method669(91, "cookiehost");

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "Lcc;")
    public static class209 field5089 = class95.method669(100, "http:)4)4");

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "Lcc;")
    public static class209 field5091 = class95.method669(82, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
    private int field5078;

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "I")
    public int field5084;

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "Lcc;")
    public class209 field5090;

    @OriginalMember(owner = "client!lh", name = "P", descriptor = "Lsj;")
    public static class49 field5086;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILtf;)V")
    public final void method1932(int arg0, class106 arg1) {
        field5079++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method774((byte) 121);
            if (var3 == 0) {
                return;
            }
            this.method1934(var3, -2, arg1);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method1933(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (arg0 >= 0 && arg5 >= 0 && arg0 < 103 && arg5 < 103) {
            if (arg4 == 0) {
                class187 var8 = class247.method1718(arg3, arg0, arg5);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field3385 >>> 32);
                    if (arg1 == 2) {
                        var8.field3377 = new class115(var9, 2, arg7 + 4, arg3, arg0, arg5, arg2, false, var8.field3377);
                        var8.field3387 = new class115(var9, 2, arg7 + 1 & 0x3, arg3, arg0, arg5, arg2, false, var8.field3387);
                    } else {
                        var8.field3377 = new class115(var9, arg1, arg7, arg3, arg0, arg5, arg2, false, var8.field3377);
                    }
                }
            }
            if (arg4 == 1) {
                class181 var10 = class223.method1574(arg3, arg0, arg5);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field3270 >>> 32);
                    if (arg1 == 4 || arg1 == 5) {
                        var10.field3269 = new class115(var11, 4, arg7, arg3, arg0, arg5, arg2, false, var10.field3269);
                    } else if (arg1 == 6) {
                        var10.field3269 = new class115(var11, 4, arg7 + 4, arg3, arg0, arg5, arg2, false, var10.field3269);
                    } else if (arg1 == 7) {
                        var10.field3269 = new class115(var11, 4, (arg7 + 2 & 0x3) + 4, arg3, arg0, arg5, arg2, false, var10.field3269);
                    } else if (arg1 == 8) {
                        var10.field3269 = new class115(var11, 4, arg7 + 4, arg3, arg0, arg5, arg2, false, var10.field3269);
                        var10.field3265 = new class115(var11, 4, (arg7 + 2 & 0x3) + 4, arg3, arg0, arg5, arg2, false, var10.field3265);
                    }
                }
            }
            if (arg4 == 2) {
                class264 var12 = class290.method1944(arg3, arg0, arg5);
                if (arg1 == 11) {
                    arg1 = 10;
                }
                if (var12 != null) {
                    var12.field4735 = new class115((int) (var12.field4733 >>> 32) & Integer.MAX_VALUE, arg1, arg7, arg3, arg0, arg5, arg2, false, var12.field4735);
                }
            }
            if (arg4 == 3) {
                class230 var13 = class126.method908(arg3, arg0, arg5);
                if (var13 != null) {
                    var13.field4183 = new class115((int) (var13.field4171 >>> 32) & Integer.MAX_VALUE, 22, arg7, arg3, arg0, arg5, arg2, false, var13.field4183);
                }
            }
        }
        if (arg6 != 95) {
            method1939(-41);
        }
        field5083++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILtf;)V")
    private final void method1934(int arg0, int arg1, class106 arg2) {
        if (arg1 != -2) {
            field5086 = null;
        }
        field5085++;
        if (arg0 == 1) {
            this.field5078 = arg2.method774((byte) 90);
        } else if (arg0 == 2) {
            this.field5084 = arg2.method746((byte) -100);
        } else if (arg0 == 5) {
            this.field5090 = arg2.method755(1);
            return;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
    public static void method1935(byte arg0) {
        field5081 = null;
        field5088 = null;
        field5091 = null;
        if (arg0 != 90) {
            method1933(48, 8, 25, -106, 2, 57, (byte) -103, 59);
        }
        field5086 = null;
        field5089 = null;
        field5076 = null;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)Z")
    public final boolean method1936(byte arg0) {
        field5082++;
        int var2 = 86 / ((arg0 - 58) / 63);
        return this.field5078 == 115;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLjava/lang/Object;Lw;)V")
    public static final void method1937(byte arg0, Object arg1, class143 arg2) {
        field5077++;
        if (arg2.field2633 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field2633.peekEvent() != null; var3++) {
            class174.method1196((byte) 116, 1L);
        }
        int var4 = -77 / ((-arg0 - 36) / 52);
        if (arg1 != null) {
            arg2.field2633.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)V")
    public static final void method1938(byte arg0) {
        if (class143.field2643.toLowerCase().indexOf("microsoft") == -1) {
            class49.field952[46] = 72;
            class49.field952[61] = 27;
            class49.field952[59] = 57;
            class49.field952[44] = 71;
            if (class143.field2649 == null) {
                class49.field952[222] = 59;
                class49.field952[192] = 58;
            } else {
                class49.field952[222] = 58;
                class49.field952[192] = 28;
                class49.field952[520] = 59;
            }
            class49.field952[91] = 42;
            class49.field952[45] = 26;
            class49.field952[93] = 43;
            class49.field952[92] = 74;
            class49.field952[47] = 73;
        } else {
            class49.field952[187] = 27;
            class49.field952[223] = 28;
            class49.field952[222] = 59;
            class49.field952[191] = 73;
            class49.field952[186] = 57;
            class49.field952[221] = 43;
            class49.field952[189] = 26;
            class49.field952[188] = 71;
            class49.field952[190] = 72;
            class49.field952[220] = 74;
            class49.field952[192] = 58;
            class49.field952[219] = 42;
        }
        int var1 = -32 % ((arg0 - 4) / 61);
        field5087++;
    }

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "(I)I")
    public static final int method1939(int arg0) {
        if (arg0 == -1) {
            field5075++;
            return class134.field2548 == null || class134.field2545 >= class134.field2548.field3036 ? -1 : class134.field2545++;
        } else {
            return 106;
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(II)Z")
    public static final boolean method1940(int arg0, int arg1) {
        if (arg0 != 57) {
            method1933(-119, 119, -96, -110, 35, -26, (byte) 61, -90);
        }
        field5080++;
        return arg1 >= 48 && arg1 <= 57;
    }
}

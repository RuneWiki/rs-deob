import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class205 {

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "Z")
    public boolean field3261 = true;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public int field3263 = -1;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public int field3259 = 0;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public int field3268 = -1;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Lue;")
    public static class223 field3262 = new class223(0, -1);

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field3264 = 0;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "Ldk;")
    public static class251 field3265;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "Ldd;")
    public static class77 field3266;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBLwd;)V")
    public final void method1430(int arg0, byte arg1, class162 arg2) {
        while (true) {
            int var4 = arg2.method1133((byte) 53);
            if (var4 == 0) {
                field3256++;
                if (arg1 != 21) {
                    method1436('\u0016', (StringBuffer) null, -107, 8);
                    return;
                }
                return;
            }
            this.method1437(arg0, var4, arg2, 121);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)V")
    public static final void method1431(int arg0, byte arg1) {
        field3269++;
        class175 var2 = class182.method1317(7, arg0, false);
        var2.method1278((byte) 124);
        if (arg1 > -83) {
            method1431(87, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static final void method1432(int arg0) {
        field3257++;
        int var1 = -34 % ((arg0 - 62) / 51);
        for (class107 var2 = (class107) class237.field3809.method1643((byte) -79); var2 != null; var2 = (class107) class237.field3809.method1642((byte) 51)) {
            if (var2.field1705) {
                var2.method765(0);
            }
        }
        for (class107 var3 = (class107) class267.field4298.method1643((byte) 117); var3 != null; var3 = (class107) class267.field4298.method1642((byte) 62)) {
            if (var3.field1705) {
                var3.method765(0);
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
    public static void method1433(int arg0) {
        field3265 = null;
        field3262 = null;
        field3266 = null;
        if (arg0 > -7) {
            field3265 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)I")
    public static final int method1434(byte arg0) {
        field3255++;
        int var1 = -72 / ((49 - arg0) / 44);
        return class14.field151;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)J")
    public static final long method1435(int arg0, int arg1, int arg2) {
        class151 var3 = class218.field3584[arg0][arg1][arg2];
        return var3 == null || var3.field2364 == null ? 0L : var3.field2364.field3050;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(CLjava/lang/StringBuffer;II)Ljava/lang/StringBuffer;")
    public static final StringBuffer method1436(char arg0, StringBuffer arg1, int arg2, int arg3) {
        if (arg3 != -14526) {
            field3265 = null;
        }
        int var4 = arg1.length();
        field3258++;
        arg1.setLength(arg2);
        for (int var5 = var4; var5 < arg2; var5++) {
            arg1.setCharAt(var5, arg0);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILwd;I)V")
    private final void method1437(int arg0, int arg1, class162 arg2, int arg3) {
        if (arg3 <= 33) {
            return;
        }
        field3260++;
        if (arg1 == 1) {
            this.field3259 = class313.method2089(-1, arg2.method1137(31155));
        } else if (arg1 == 2) {
            this.field3263 = arg2.method1133((byte) 53);
        } else if (arg1 == 3) {
            this.field3263 = arg2.method1142(-18970);
            if (this.field3263 == 65535) {
                this.field3263 = -1;
                return;
            }
        } else if (arg1 == 5) {
            this.field3261 = false;
            return;
        } else if (arg1 == 7) {
            this.field3268 = class313.method2089(-1, arg2.method1137(31155));
            return;
        } else if (arg1 == 8) {
            class173.field2832 = arg0;
            return;
        } else {
            if (arg1 == 9) {
                arg2.method1142(-18970);
            } else if (arg1 != 10) {
                if (arg1 == 11) {
                    arg2.method1133((byte) 53);
                    return;
                }
                if (arg1 != 12) {
                    if (arg1 == 13) {
                        arg2.method1137(31155);
                    } else if (arg1 == 14) {
                        arg2.method1133((byte) 53);
                        return;
                    }
                    return;
                }
            }
            return;
        }
    }
}

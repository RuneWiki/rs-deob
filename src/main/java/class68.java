import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class68 {

    @OriginalMember(owner = "client!er", name = "b", descriptor = "Ljava/lang/String;")
    private String field1172 = "null";

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field1175 = 0;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "C")
    public char field1177;

    @OriginalMember(owner = "client!er", name = "t", descriptor = "C")
    public char field1190;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    private int field1176;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!er", name = "p", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!er", name = "u", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "Lcv;")
    private class398 field1174;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "Lcv;")
    public class398 field1179;

    @OriginalMember(owner = "client!er", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1189;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "[I")
    public static int[] field1182;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
    private final void method584(int arg0) {
        field1181++;
        this.field1174 = new class398(this.field1179.method2479(77));
        if (arg0 != -6) {
            this.method594(39, 19);
        }
        for (class411 var2 = (class411) this.field1179.method2483(114); var2 != null; var2 = (class411) this.field1179.method2481((byte) -27)) {
            class103 var3 = new class103(var2.field6046, (int) var2.field6399);
            this.field1174.method2486(14, var3, class369.method2368(22788, var2.field6046));
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method585(int arg0, String arg1) {
        field1178++;
        if (arg0 != -4) {
            method593(-53, -50, null, -14);
        }
        if (this.field1179 == null) {
            return false;
        }
        if (this.field1174 == null) {
            this.method584(-6);
        }
        for (class103 var3 = (class103) this.field1174.method2485(3, class369.method2368(22788, arg1)); var3 != null; var3 = (class103) this.field1174.method2480(-1)) {
            if (var3.field1639.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
    private final void method586(int arg0) {
        field1173++;
        this.field1174 = new class398(this.field1179.method2479(115));
        if (arg0 < -88) {
            for (class242 var2 = (class242) this.field1179.method2483(-60); var2 != null; var2 = (class242) this.field1179.method2481((byte) -27)) {
                class242 var3 = new class242((int) var2.field6399);
                this.field1174.method2486(-104, var3, (long) var2.field3509);
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public final String method587(boolean arg0, int arg1) {
        field1184++;
        if (this.field1179 == null) {
            return this.field1172;
        } else if (arg0) {
            return null;
        } else {
            class411 var3 = (class411) this.field1179.method2485(64, (long) arg1);
            return var3 == null ? this.field1172 : var3.field6046;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILti;)V")
    public final void method588(int arg0, class303 arg1) {
        if (arg0 != 3) {
            return;
        }
        field1171++;
        while (true) {
            int var3 = arg1.method1918((byte) 124);
            if (var3 == 0) {
                return;
            }
            this.method592(var3, arg1, -19717);
        }
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V")
    public static void method589(int arg0) {
        if (arg0 != -16777216) {
            field1175 = -39;
        }
        field1189 = null;
        field1182 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)I")
    public final int method590(int arg0, int arg1) {
        if (arg1 > -104) {
            field1182 = null;
        }
        field1187++;
        if (this.field1179 == null) {
            return this.field1176;
        } else {
            class242 var3 = (class242) this.field1179.method2485(101, (long) arg0);
            return var3 == null ? this.field1176 : var3.field3509;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLqa;Ltn;)V")
    public static final void method591(byte arg0, class162 arg1, class58 arg2) {
        int var3 = -128 % ((33 - arg0) / 40);
        field1180++;
        boolean var4 = class8.field111.method3084(arg2.field977, arg1, arg2.field889, arg2.field852, arg2.field983 | 0xFF000000, (byte) 121, arg2.field834 ? class95.field1558.field1060 : null, arg2.field946) == null;
        if (var4) {
            class37.field571.method2270(0, new class401(arg2.field946, arg2.field977, arg2.field852, arg2.field983 | 0xFF000000, arg2.field889, arg2.field834));
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILti;I)V")
    private final void method592(int arg0, class303 arg1, int arg2) {
        if (arg2 != -19717) {
            method591((byte) -69, null, null);
        }
        if (arg0 == 1) {
            this.field1190 = class470.method2804(63, arg1.method1899((byte) 124));
        } else if (arg0 == 2) {
            this.field1177 = class470.method2804(63, arg1.method1899((byte) -100));
        } else if (arg0 == 3) {
            this.field1172 = arg1.method1879(30669);
        } else if (arg0 == 4) {
            this.field1176 = arg1.method1870(arg2 ^ 0x73F214AB);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method1868(0);
            this.field1179 = new class398(class159.method1146(false, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1870(arg2 ^ 0x73F214AB);
                class439 var7;
                if (arg0 == 5) {
                    var7 = new class411(arg1.method1879(30669));
                } else {
                    var7 = new class242(arg1.method1870(-1945262512));
                }
                this.field1179.method2486(-105, var7, (long) var6);
            }
        }
        field1183++;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IILjava/lang/Object;I)[B")
    public static final byte[] method593(int arg0, int arg1, Object arg2, int arg3) {
        field1186++;
        if (arg2 == null) {
            return null;
        }
        if (arg1 >= -48) {
            method595(-66, -13);
        }
        if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return class103.method788((byte) 112, arg0, arg3, var4);
        } else if (arg2 instanceof class383) {
            class383 var5 = (class383) arg2;
            return var5.method1858(arg0, arg3, (byte) 127);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(II)Z")
    public final boolean method594(int arg0, int arg1) {
        field1191++;
        if (this.field1179 == null) {
            return false;
        }
        if (this.field1174 == null) {
            this.method586(-94);
        }
        if (arg1 <= 51) {
            return true;
        } else {
            class242 var3 = (class242) this.field1174.method2485(52, (long) arg0);
            return var3 != null;
        }
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(II)Ljava/lang/String;")
    public static final String method595(int arg0, int arg1) {
        if (arg1 != -2) {
            method595(-88, 51);
        }
        field1185++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class407.field5978.method1273(true, class370.field5530) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class436.field6339.method1273(true, class370.field5530) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }
}

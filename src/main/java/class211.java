import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class211 extends class446 {

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field2946 = new String[100];

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "Lnj;")
    public static class133 field2945 = new class133();

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "Lec;")
    private class129 field2943;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V")
    public static final void method1387(int arg0) {
        field2948++;
        int var1 = -52 / ((-arg0 - 58) / 57);
        for (int var2 = -1; var2 < class26.field467; var2++) {
            int var6;
            if (var2 == -1) {
                var6 = 2047;
            } else {
                var6 = class66.field974[var2];
            }
            class134 var7 = class381.field5447[var6];
            if (var7 != null && var7.field5245 > 0) {
                var7.field5245--;
                if (var7.field5245 == 0) {
                    var7.field5292 = null;
                }
            }
        }
        for (int var3 = 0; var3 < class125.field1758; var3++) {
            int var4 = class135.field1967[var3];
            class198 var5 = class98.field1358[var4];
            if (var5 != null && var5.field5245 > 0) {
                var5.field5245--;
                if (var5.field5245 == 0) {
                    var5.field5292 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;")
    public final String method1388(byte arg0, String arg1, int arg2) {
        if (arg0 < 81) {
            field2945 = null;
        }
        field2947++;
        if (this.field2943 == null) {
            return arg1;
        } else {
            class200 var4 = (class200) this.field2943.method886((long) arg2, 25651);
            return var4 == null ? arg1 : var4.field2765;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)I")
    public static final int method1389(boolean arg0) {
        if (arg0) {
            method1389(false);
        }
        field2951++;
        return ((class345.field4692 == 0 ? 0 : 1) << 22) + ((class52.field731 == 0 ? 0 : 1) << 21) + (class42.field614 << 17) + ((class171.field2346 ? 1 : 0) << 15) + ((class312.field4271 ? 1 : 0) << 13) + (class327.field4508 & 0x3 << 11) + ((class106.field1472 ? 1 : 0) << 10) + ((class64.field886 ? 1 : 0) << 9) + ((class70.field1032 ? 1 : 0) << 8) + ((class61.field845 ? 1 : 0) << 4) + (class361.field5000 & 0x7) + (((class288.field4044 ? 1 : 0) << 3) - (-((class154.field2169 ? 1 : 0) << 5) - (((class414.field5867 ? 1 : 0) << 6) - -((class54.field755 ? 1 : 0) << 16) + ((class133.field1904 ? 1 : 0) << 19)))) + (((class371.field5212 == 0 ? 0 : 1) << 20) - (-(class39.method365((byte) 121) << 23) + -(class237.field3369 << 25) + -((class175.field2397 ? 1 : 0) << 27) + -(class251.field3544 << 28)));
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLkh;)V")
    public final void method1390(byte arg0, class11 arg1) {
        if (arg0 > -53) {
            method1393((byte) -61);
        }
        field2950++;
        while (true) {
            int var3 = arg1.method172((byte) 52);
            if (var3 == 0) {
                return;
            }
            this.method1391(var3, arg1, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILkh;B)V")
    private final void method1391(int arg0, class11 arg1, byte arg2) {
        int var4 = 91 / ((-arg2 - 39) / 44);
        field2942++;
        if (arg0 != 249) {
            return;
        }
        int var5 = arg1.method172((byte) 52);
        if (this.field2943 == null) {
            int var6 = class438.method2748((byte) 118, var5);
            this.field2943 = new class129(var6);
        }
        for (int var7 = 0; var7 < var5; var7++) {
            boolean var8 = arg1.method172((byte) 52) == 1;
            int var9 = arg1.method208(27308);
            class390 var10;
            if (var8) {
                var10 = new class200(arg1.method171(-9265));
            } else {
                var10 = new class406(arg1.method185(25239));
            }
            this.field2943.method883((byte) -54, (long) var9, var10);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)V")
    public static final void method1392(String arg0, String arg1, byte arg2, int arg3) {
        class17.field312 = arg1;
        field2949++;
        class229.field3332 = arg0;
        class160.field2240 = arg3;
        if (class17.field312.equals("") || class229.field3332.equals("")) {
            class390.field5593 = 3;
            return;
        }
        if (arg2 != -87) {
            field2954 = 44;
        }
        if (class277.field3883 != -1) {
            class368.method2370(-100);
            return;
        }
        class64.field935 = 1;
        class390.field5593 = -3;
        field2953 = 0;
        class415.field5900 = 0;
        class11 var4 = new class11(128);
        var4.method173(10, 255);
        var4.method155(15489, (int) (Math.random() * 9.9999999E7D));
        var4.method165(class67.method527(class17.field312, (byte) -122), (byte) 16);
        var4.method155(arg2 ^ 0xFFFFC328, (int) (Math.random() * 9.9999999E7D));
        var4.method160(class229.field3332, false);
        var4.method155(15489, (int) (Math.random() * 9.9999999E7D));
        var4.method168(class375.field5355, (byte) -95, class191.field2632);
        class46.field648.field191 = 0;
        class46.field648.method173(24, 255);
        class46.field648.method173(var4.field191 + 2, 255);
        class46.field648.method191(567, -89);
        class46.field648.method213(var4.field230, 107, var4.field191, 0);
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)V")
    public static void method1393(byte arg0) {
        field2945 = null;
        if (arg0 <= 63) {
            field2945 = null;
        }
        field2946 = null;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(III)I")
    public final int method1394(int arg0, int arg1, int arg2) {
        if (arg2 <= 11) {
            return -63;
        }
        field2944++;
        if (this.field2943 == null) {
            return arg1;
        } else {
            class406 var4 = (class406) this.field2943.method886((long) arg0, 25651);
            return var4 == null ? arg1 : var4.field5773;
        }
    }

    static {
        new class442("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field2953 = 0;
        field2954 = 104;
    }
}

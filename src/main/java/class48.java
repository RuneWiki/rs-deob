import java.awt.Component;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class48 extends RuntimeException {

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Ljava/lang/String;")
    public String field1197;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1206;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field1191 = 0;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Lhb;")
    public static class44 field1187 = class102.method810("Wen m-Ochten Sie von der Liste entfernen?", -28606);

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Lhb;")
    private static class44 field1196 = class102.method810("Walk here", -28606);

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1195 = 0;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field1186 = 0;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Lhb;")
    public static class44 field1194 = field1196;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Lhb;")
    public static class44 field1190 = class102.method810("@cr2@", -28606);

    @OriginalMember(owner = "client!i", name = "t", descriptor = "Lhb;")
    public static class44 field1205 = class102.method810(",Zffentlicher Chat", -28606);

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
    public static int[] field1198 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "Lqd;")
    public static class100 field1204;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 21)
    public static void method451(int arg0) {
        field1198 = null;
        field1187 = null;
        field1196 = null;
        field1190 = null;
        field1204 = null;
        if (arg0 < -56) {
            field1194 = null;
            field1205 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLjava/awt/Component;Ljb;)V", line = 42)
    public static final void method452(byte arg0, Component arg1, class56 arg2) {
        field1201++;
        try {
            class17 var3 = (class17) Class.forName("vd").getDeclaredConstructor().newInstance();
            if (arg0 != -64) {
                method455(false, true);
            }
            var3.method117(arg2, 2048);
            class16.field325 = var3;
        } catch (Throwable var6) {
            try {
                class16.field325 = new class12(arg2, arg1);
            } catch (Throwable var5) {
                if (class56.field1423.toLowerCase().indexOf("microsoft") >= 0) {
                    try {
                        class16.field325 = new class76();
                        return;
                    } catch (Throwable var4) {
                    }
                }
                class16.field325 = new class14(8000);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILwd;B)Lhb;", line = 97)
    public static final class44 method453(int arg0, class131 arg1, byte arg2) {
        int var3 = 45 % ((arg2 + 3) / 58);
        field1202++;
        try {
            class44 var4 = new class44();
            var4.field1070 = arg1.method1019(174545128);
            if (var4.field1070 > arg0) {
                var4.field1070 = arg0;
            }
            var4.field1074 = new byte[var4.field1070];
            arg1.field3182 += class34.field837.method633(false, 0, arg1.field3172, var4.field1074, var4.field1070, arg1.field3182);
            return var4;
        } catch (Exception var5) {
            return class61.field1561;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 153)
    public static final int method454(KeyEvent arg0, int arg1) {
        int var2 = arg0.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        if (arg1 < 48) {
            field1193 = 93;
        }
        field1189++;
        return var2;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZZ)V", line = 170)
    public static final void method455(boolean arg0, boolean arg1) {
        field1203++;
        if (class28.field662 == null) {
            return;
        }
        try {
            if (arg1) {
                field1191 = 72;
            }
            class131 var2 = new class131(4);
            var2.method993(19579, arg0 ? 2 : 3);
            var2.method977(-128, 0);
            class28.field662.method323(0, (byte) 118, 4, var2.field3172);
        } catch (IOException var4) {
            try {
                class28.field662.method328(256);
            } catch (Exception var3) {
            }
            class117.field2856++;
            class28.field662 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 199)
    public class48(Throwable arg0, String arg1) {
        this.field1197 = arg1;
        this.field1206 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lqd;II)V", line = 215)
    public static final void method456(class100 arg0, int arg1, int arg2) {
        field1192++;
        if (class53.field1306 != null) {
            class53.field1306.field3182 = arg2 * 4 + 5;
            int var3 = class53.field1306.method994((byte) 36);
            arg0.method786(255, var3);
            return;
        }
        class110.method843(arg1 ^ 0x561FD2B3, 255, null, 0, 255, (byte) 0, true);
        if (arg1 != 5027) {
            method452((byte) 77, null, null);
        }
        class77.field1940[arg2] = arg0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIZ)Lhb;", line = 236)
    public static final class44 method457(int arg0, int arg1, boolean arg2) {
        field1199++;
        if (!arg2) {
            return null;
        }
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return class93.field2367;
        } else if (var3 < -6) {
            return class127.field3064;
        } else if (var3 < -3) {
            return class53.field1328;
        } else if (var3 < 0) {
            return class77.field1927;
        } else if (var3 > 9) {
            return class109.field2738;
        } else if (var3 > 6) {
            return class128.field3077;
        } else if (var3 > 3) {
            return class16.field309;
        } else if (var3 > 0) {
            return class95.field2416;
        } else {
            return class100.field2534;
        }
    }
}

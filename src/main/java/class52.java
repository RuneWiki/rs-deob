import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class52 {

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "[Lka;")
    public static class70[] field1176 = new class70[2048];

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1178 = 0;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lec;")
    private static class32 field1175 = class73.method594("Login server offline)3", true);

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Lec;")
    public static class32 field1180 = class73.method594("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", true);

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lec;")
    public static class32 field1179 = class73.method594("cross", true);

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lec;")
    public static class32 field1177 = field1175;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Lec;")
    private static class32 field1182 = class73.method594("Loaded title screen", true);

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Lec;")
    public static class32 field1183 = field1182;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Lec;")
    public static class32 field1174 = class73.method594("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", true);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([Lec;B)Lec;")
    public static final class32 method403(class32[] arg0, byte arg1) {
        if (arg1 != -20) {
            field1178 = -63;
        }
        field1184++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class84.method656(arg0, arg0.length, 0, (byte) -126);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method404(Component arg0, int arg1) {
        field1181++;
        if (arg1 != -24436) {
            return;
        }
        Method var2 = class25.field452;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class38.field920);
        arg0.addFocusListener(class38.field920);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method405(byte arg0) {
        field1177 = null;
        field1180 = null;
        field1174 = null;
        field1182 = null;
        field1179 = null;
        int var1 = 123 % ((arg0 + 14) / 63);
        field1175 = null;
        field1183 = null;
        field1176 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILga;I)V")
    public static final void method406(int arg0, class44 arg1, int arg2) {
        field1187++;
        if (arg2 != 20538) {
            method406(-104, null, -69);
        }
        if (class119.field2848 == null) {
            class126.method987(true, (byte) -109, (byte) 0, 255, 255, null, 0);
            class88.field2049[arg0] = arg1;
        } else {
            class119.field2848.field1569 = arg0 * 8 + 5;
            int var3 = class119.field2848.method539(true);
            int var4 = class119.field2848.method539(true);
            arg1.method337(var4, var3, arg2 - 3756);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I")
    public static final int method407(int arg0, int arg1, int arg2) {
        class107 var3 = (class107) class34.field710.method1198((long) arg1, (byte) -106);
        field1189++;
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && var3.field2537.length > arg2) {
            if (arg0 >= -1) {
                method408((byte) -83);
            }
            return var3.field2537[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)J")
    public static final synchronized long method408(byte arg0) {
        field1188++;
        long var1 = System.currentTimeMillis();
        if (var1 < class74.field1745) {
            class98.field2269 += class74.field1745 - var1;
        }
        class74.field1745 = var1;
        if (arg0 >= -29) {
            method403(null, (byte) 70);
        }
        return class98.field2269 + var1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILea;I)Lhb;")
    public static final class51 method409(int arg0, class30 arg1, int arg2) {
        field1190++;
        if (class47.method359(arg1, arg2, (byte) 61)) {
            if (arg0 != -7450) {
                field1183 = null;
            }
            return class94.method743(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLea;)V")
    public static final void method410(byte arg0, class30 arg1) {
        field1186++;
        int var2 = -84 % ((-arg0 - 54) / 60);
        class91.field2088 = arg1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static final void method411(int arg0) {
        if (arg0 == 0) {
            class3.field43.method491(arg0 + 33);
            field1185++;
        }
    }
}

import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class109 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field2020 = 0;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Lai;")
    public static class10 field2021 = class44.method278("Einloggen", -110);

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field2024 = 0;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field2026 = 10;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field2027 = 50;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "[I")
    public static int[] field2025 = new int[field2027];

    @OriginalMember(owner = "client!m", name = "d", descriptor = "[I")
    public static int[] field2023 = new int[field2027];

    @OriginalMember(owner = "client!m", name = "m", descriptor = "[Lai;")
    public static class10[] field2032 = new class10[field2027];

    @OriginalMember(owner = "client!m", name = "j", descriptor = "[I")
    public static int[] field2029 = new int[field2027];

    @OriginalMember(owner = "client!m", name = "p", descriptor = "[I")
    public static int[] field2035 = new int[field2027];

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field2034 = 0;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "[I")
    public static int[] field2028 = new int[field2027];

    @OriginalMember(owner = "client!m", name = "q", descriptor = "[I")
    public static int[] field2036 = new int[field2027];

    @OriginalMember(owner = "client!m", name = "s", descriptor = "[I")
    public static int[] field2038 = new int[field2027];

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Lbf;")
    public static class17 field2037;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static final void method698(int arg0) {
        if (class98.field1819 != null) {
            class27 var1 = class98.field1819;
            synchronized (class98.field1819) {
                class98.field1819 = null;
            }
        }
        if (arg0 <= 9) {
            method699(-89);
        }
        field2030++;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
    public static void method699(int arg0) {
        field2038 = null;
        field2035 = null;
        field2028 = null;
        field2021 = null;
        field2029 = null;
        field2037 = null;
        if (arg0 != -19518) {
            field2021 = null;
        }
        field2025 = null;
        field2032 = null;
        field2023 = null;
        field2036 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V")
    public static final void method700(Throwable arg0, String arg1, byte arg2) {
        field2031++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class183.method1182(325, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            if (arg2 > -83) {
                field2032 = null;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class49.field856.field1410 != null) {
                class22 var8 = class49.field856.method501(0, new URL(class49.field856.field1410.getCodeBase(), "clienterror.ws?c=" + class154.field2976 + "&u=" + class75.field1304 + "&v1=" + class81.field1412 + "&v2=" + class81.field1409 + "&e=" + var7));
                while (var8.field352 == 0) {
                    class172.method1130(1L, (byte) -79);
                }
                if (var8.field352 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field353;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lai;IIII)V")
    public static final void method701(class10 arg0, int arg1, int arg2, int arg3, int arg4) {
        field2022++;
        class200 var5 = class82.method507((byte) 116, arg4, arg1);
        if (arg2 != 58) {
            method699(11);
        }
        if (var5 == null) {
            return;
        }
        if (var5.field3762 != null) {
            class5 var6 = new class5();
            var6.field57 = arg0;
            var6.field55 = var5;
            var6.field50 = arg3;
            var6.field53 = var5.field3762;
            class104.method681(arg2 + 199942, var6);
        }
        boolean var7 = true;
        if (var5.field3865 > 0) {
            var7 = class183.method1183(var5, arg2 + 18);
        }
        if (!var7 || !class149.method1022(class203.method1318(0, var5), arg3 - 1, arg2 + -170)) {
            return;
        }
        if (arg3 == 1) {
            class30.field466++;
            class76.field1323.method635((byte) -120, 49);
            class76.field1323.method786(arg4, (byte) -51);
            class76.field1323.method793(101, arg1);
        }
        if (arg3 == 2) {
            class195.field3705++;
            class76.field1323.method635((byte) -88, 230);
            class76.field1323.method786(arg4, (byte) -59);
            class76.field1323.method793(arg2 + 40, arg1);
        }
        if (arg3 == 3) {
            class76.field1323.method635((byte) -83, 34);
            class102.field1911++;
            class76.field1323.method786(arg4, (byte) -107);
            class76.field1323.method793(arg2 + 44, arg1);
        }
        if (arg3 == 4) {
            class56.field993++;
            class76.field1323.method635((byte) -119, 106);
            class76.field1323.method786(arg4, (byte) -54);
            class76.field1323.method793(116, arg1);
        }
        if (arg3 == 5) {
            class43.field705++;
            class76.field1323.method635((byte) -65, 190);
            class76.field1323.method786(arg4, (byte) -54);
            class76.field1323.method793(arg2 + 37, arg1);
        }
        if (arg3 == 6) {
            class76.field1323.method635((byte) -46, 125);
            class53.field948++;
            class76.field1323.method786(arg4, (byte) -103);
            class76.field1323.method793(121, arg1);
        }
        if (arg3 == 7) {
            class133.field2503++;
            class76.field1323.method635((byte) -105, 245);
            class76.field1323.method786(arg4, (byte) -70);
            class76.field1323.method793(102, arg1);
        }
        if (arg3 == 8) {
            class76.field1323.method635((byte) -47, 132);
            class76.field1323.method786(arg4, (byte) -118);
            class76.field1323.method793(118, arg1);
            class139.field2626++;
        }
        if (arg3 == 9) {
            class68.field1188++;
            class76.field1323.method635((byte) -67, 135);
            class76.field1323.method786(arg4, (byte) -67);
            class76.field1323.method793(84, arg1);
        }
        if (arg3 == 10) {
            class76.field1323.method635((byte) -85, 221);
            class97.field1783++;
            class76.field1323.method786(arg4, (byte) -128);
            class76.field1323.method793(99, arg1);
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
    public static final void method702(int arg0) {
        field2033++;
        class94.field1742.method226((byte) -90);
        class40.field671.method226((byte) -90);
        class194.field3692.method226((byte) -90);
        if (arg0 >= -24) {
            field2024 = 103;
        }
        class186.field3534.method226((byte) -90);
        class40.field672.method226((byte) -90);
    }
}

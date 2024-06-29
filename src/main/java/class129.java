import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class129 extends class41 {

    @OriginalMember(owner = "client!wc", name = "Pc", descriptor = "[Z")
    public static boolean[] field3111 = new boolean[5];

    @OriginalMember(owner = "client!wc", name = "Sc", descriptor = "Lke;")
    public static class65 field3114 = class1.method17("Willkommen auf RuneScape", -122);

    @OriginalMember(owner = "client!wc", name = "Rc", descriptor = "Lke;")
    public static class65 field3113 = class1.method17("::clientdrop", -127);

    @OriginalMember(owner = "client!wc", name = "Yc", descriptor = "Lke;")
    public static class65 field3120 = class1.method17("(U", -116);

    @OriginalMember(owner = "client!wc", name = "Zc", descriptor = "Lke;")
    private static class65 field3121 = class1.method17("Invalid loginserver requested)3", -114);

    @OriginalMember(owner = "client!wc", name = "bd", descriptor = "Lke;")
    public static class65 field3123 = class1.method17("mapfunction", -128);

    @OriginalMember(owner = "client!wc", name = "Qc", descriptor = "Lke;")
    public static class65 field3112 = field3121;

    @OriginalMember(owner = "client!wc", name = "gd", descriptor = "Lke;")
    public static class65 field3128 = class1.method17("p11_full", -120);

    @OriginalMember(owner = "client!wc", name = "Xc", descriptor = "Lke;")
    public static class65 field3119 = class1.method17("m-Ochte mit Ihnen handeln)3", -115);

    @OriginalMember(owner = "client!wc", name = "Tc", descriptor = "Z")
    public static boolean field3115 = false;

    @OriginalMember(owner = "client!wc", name = "fd", descriptor = "I")
    public static int field3127 = 0;

    @OriginalMember(owner = "client!wc", name = "Oc", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!wc", name = "Uc", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!wc", name = "Wc", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!wc", name = "cd", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!wc", name = "hd", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!wc", name = "ad", descriptor = "Lta;")
    public static class112 field3122;

    @OriginalMember(owner = "client!wc", name = "ed", descriptor = "Ljb;")
    public class55 field3126;

    @OriginalMember(owner = "client!wc", name = "Vc", descriptor = "Ljd;")
    public static class58 field3117;

    @OriginalMember(owner = "client!wc", name = "dd", descriptor = "[I")
    public static int[] field3125;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljd;I)I", line = 10)
    public static final int method1014(class58 arg0, int arg1) {
        ++field3110;
        if (arg1 != -20905) {
            field3122 = null;
        }
        int var2 = 0;
        if (arg0.method485(class9.field158, -27716, class48.field1262)) {
            ++var2;
        }
        if (arg0.method485(class9.field158, -27716, class33.field864)) {
            ++var2;
        }
        if (arg0.method485(class9.field158, -27716, class125.field3030)) {
            ++var2;
        }
        if (arg0.method485(class9.field158, arg1 + -6811, class102.field2643)) {
            ++var2;
        }
        if (arg0.method485(class9.field158, arg1 + -6811, class24.field607)) {
            ++var2;
        }
        if (arg0.method485(class9.field158, -27716, class100.field2616)) {
            ++var2;
        }
        if (arg0.method485(class9.field158, -27716, class78.field2087)) {
            ++var2;
        }
        if (arg0.method485(class9.field158, -27716, class51.field1291)) {
            ++var2;
        }
        if (arg0.method485(class9.field158, arg1 ^ 15851, client.field398)) {
            ++var2;
        }
        if (arg0.method485(class9.field158, arg1 ^ 15851, class121.field2966)) {
            ++var2;
        }
        if (arg0.method485(class9.field158, -27716, class97.field2508)) {
            ++var2;
        }
        if (arg0.method485(class9.field158, -27716, class20.field483)) {
            ++var2;
        }
        if (arg0.method485(class9.field158, -27716, class94.field2476)) {
            ++var2;
        }
        if (arg0.method485(class9.field158, -27716, class115.field2904)) {
            ++var2;
        }
        if (arg0.method485(class9.field158, -27716, class1.field1)) {
            ++var2;
        }
        if (arg0.method485(class9.field158, -27716, class78.field2078)) {
            ++var2;
        }
        if (arg0.method485(class9.field158, -27716, class46.field1209)) {
            ++var2;
        }
        if (arg0.method485(class9.field158, -27716, class64.field1692)) {
            ++var2;
        }
        if (arg0.method485(class9.field158, -27716, class104.field2666)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V", line = 95)
    public static final void method1015(int arg0, Throwable arg1, String arg2) {
        if (arg0 < -81) {
            ++field3129;
            try {
                String var3 = "";
                if (arg1 != null) {
                    var3 = class22.method175((byte) 125, arg1);
                }
                if (arg2 != null) {
                    if (arg1 != null) {
                        var3 = var3 + " | ";
                    }
                    var3 = var3 + arg2;
                }
                System.out.println("Error: " + var3);
                String var4 = var3.replace(':', '.');
                String var5 = var4.replace('@', '_');
                String var6 = var5.replace('&', '_');
                String var7 = var6.replace('#', '_');
                class34 var8 = class21.field515.method94(new URL(class21.field515.field316.getCodeBase(), "clienterror.ws?c=" + client.field397 + "&u=" + class74.field1997 + "&v1=" + class15.field312 + "&v2=" + class15.field297 + "&e=" + var7), 0);
                while (~var8.field875 == -1) {
                    class58.method498(1L, 10);
                }
                if (~var8.field875 == -2) {
                    DataInputStream var9 = (DataInputStream) var8.field878;
                    var9.read();
                    var9.close();
                }
            } catch (Exception var10) {
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)Lga;", line = 152)
    public final class37 method45(int arg0) {
        ++field3116;
        if (this.field3126 == null) {
            return null;
        } else {
            class1 var2 = ~super.field1072 != 0 && ~super.field1118 == -1 ? class80.method702(122, super.field1072) : null;
            class1 var3 = ~super.field1062 == 0 || ~super.field1064 == ~super.field1062 && var2 != null ? null : class80.method702(102, super.field1062);
            class37 var4 = this.field3126.method450(super.field1049, var2, super.field1107, -29898, var3);
            if (var4 == null) {
                return null;
            } else {
                var4.method272();
                int var5 = 117 % ((arg0 - -6) / 52);
                super.field1083 = var4.field118;
                if (~super.field1075 != 0 && ~super.field1084 != 0) {
                    class37 var6 = class5.method36(super.field1075, -123).method696((byte) 101, super.field1084);
                    if (var6 != null) {
                        var6.method267(0, -super.field1115, 0);
                        class37[] var7 = new class37[] { var4, var6 };
                        var4 = new class37(var7, 2, true);
                    }
                }
                if (this.field3126.field1406 == 1) {
                    var4.field900 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "(I)Z", line = 207)
    public final boolean method363(int arg0) {
        ++field3124;
        if (arg0 != 0) {
            return true;
        } else {
            return this.field3126 != null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(B)V", line = 235)
    public static void method1016(byte arg0) {
        field3112 = null;
        field3113 = null;
        field3122 = null;
        field3123 = null;
        field3114 = null;
        field3111 = null;
        field3121 = null;
        field3125 = null;
        field3117 = null;
        field3119 = null;
        if (arg0 > -80) {
            method1016((byte) -9);
        }
        field3128 = null;
        field3120 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZZI)I", line = 275)
    public static final int method1017(boolean arg0, boolean arg1, int arg2) {
        ++field3118;
        int var3 = 0;
        if (arg0) {
            var3 += class88.field2359 + class125.field3053;
        }
        if (arg1) {
            var3 += class91.field2408 + class90.field2394;
        }
        return arg2 >= -43 ? 109 : var3;
    }
}

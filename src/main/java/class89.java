import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class89 extends class544 {

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "Z")
    private boolean field1087;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    private int field1086;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    private int field1084;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    private int field1094;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "Z")
    private boolean field1088;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    private int field1089;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    private int field1095;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    private int field1083;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field1085 = 0;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "Lcea;")
    public static class180 field1092 = new class180("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "Lui;")
    public static class193 field1096 = new class193();

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "Lcu;")
    public static class185 field1097 = new class185(11, 3);

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lqa;)V", line = 13)
    public static final void method531(class206 arg0) {
        for (int var1 = class76.field881; var1 < client.field3216; var1++) {
            for (int var2 = 0; var2 < class238.field2985; var2++) {
                for (int var3 = 0; var3 < class548.field8061; var3++) {
                    class349 var4 = class383.field5070[var1][var2][var3];
                    if (var4 != null) {
                        class241 var5 = var4.field4496;
                        class241 var6 = var4.field4497;
                        if (var5 != null && var5.method317(64)) {
                            class403.method2302(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method317(64)) {
                                class403.method2302(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method312(false, var5, 0, arg0, 0, 13915, 0);
                                var6.method314((byte) 77);
                            }
                            var5.method314((byte) 48);
                        }
                        for (class61 var7 = var4.field4499; var7 != null; var7 = var7.field595) {
                            class598 var9 = var7.field589;
                            if (var9 != null && var9.method317(64)) {
                                class403.method2302(arg0, var9, var1, var2, var3, var9.field8663 + 1 - var9.field8653, var9.field8654 - var9.field8650 + 1);
                                var9.method314((byte) 31);
                            }
                        }
                        class31 var8 = var4.field4506;
                        if (var8 != null && var8.method317(64)) {
                            class24.method145(arg0, var8, var1, var2, var3);
                            var8.method314((byte) 105);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Los;I)V", line = 88)
    public final void method532(class374 arg0, int arg1) {
        field1093++;
        arg0.method2093(2, -112);
        arg0.method2093(this.field1090, -126);
        arg0.method2093(this.field1087 ? 1 : 0, -109);
        arg0.method2093(this.field1086, -112);
        if (arg1 <= 94) {
            return;
        }
        arg0.method2093(this.field1084, -117);
        arg0.method2093(this.field1094, -122);
        arg0.method2093(this.field1091, -118);
        arg0.method2093(this.field1088 ? 1 : 0, -111);
        arg0.method2115(this.field1095, 3324);
        arg0.method2093(this.field1089, -114);
        arg0.method2102(this.field1083, (byte) 100);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 115)
    public static void method533(byte arg0) {
        field1096 = null;
        field1092 = null;
        int var1 = -40 / ((arg0 + 34) / 62);
        field1097 = null;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(ZLpq;)V", line = 136)
    public class89(boolean arg0, class165 arg1) {
        if (arg0) {
            if (class165.field2026.startsWith("win")) {
                this.field1090 = 1;
            } else if (class165.field2026.startsWith("mac")) {
                this.field1090 = 2;
            } else if (class165.field2026.startsWith("linux")) {
                this.field1090 = 3;
            } else {
                this.field1090 = 4;
            }
            if (class165.field2010.startsWith("amd64") || class165.field2010.startsWith("x86_64")) {
                this.field1087 = true;
            } else {
                this.field1087 = false;
            }
            if (class165.field2016.toLowerCase().indexOf("sun") != -1) {
                this.field1086 = 1;
            } else if (class165.field2016.toLowerCase().indexOf("microsoft") != -1) {
                this.field1086 = 2;
            } else if (class165.field2016.toLowerCase().indexOf("apple") == -1) {
                this.field1086 = 4;
            } else {
                this.field1086 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (class165.field2030.length() > var3) {
                    char var5 = class165.field2030.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var5 - (48 - var4 * 10);
                }
            } catch (Exception var15) {
            }
            this.field1084 = var4;
            int var6 = 0;
            int var7 = class165.field2030.indexOf(46, 2) + 1;
            try {
                while (class165.field2030.length() > var7) {
                    char var8 = class165.field2030.charAt(var7);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6 = var6 * 10 + var8 - 48;
                    var7++;
                }
            } catch (Exception var14) {
            }
            this.field1094 = var6;
            int var9 = 0;
            int var10 = class165.field2030.indexOf(95, 4) + 1;
            try {
                while (class165.field2030.length() > var10) {
                    char var11 = class165.field2030.charAt(var10);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10++;
                    var9 = var9 * 10 - (48 - var11);
                }
            } catch (Exception var13) {
            }
            if (class165.field2028 == 3) {
                this.field1088 = true;
            } else {
                this.field1088 = false;
            }
            this.field1091 = var9;
            if (this.field1084 <= 3) {
                this.field1089 = 0;
            } else {
                this.field1089 = class618.field8938;
            }
            this.field1095 = class252.field3258;
            try {
                this.field1083 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var12) {
                this.field1083 = 0;
            }
        }
    }
}

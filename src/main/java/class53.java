import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class53 {

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "[I")
    private int[] field1181;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Ltd;")
    public static class136 field1184 = class145.method1172(")4lang)4de", 45);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Ltd;")
    public static class136 field1178 = class145.method1172("m-Ochte sich mit Ihnen duellieren)3", 45);

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "[I")
    public static int[] field1182 = new int[4000];

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field1183 = 0;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Ltd;")
    public static class136 field1190 = class145.method1172("Verbindung mit Update)2Server)3)3)3", 45);

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Ltd;")
    public static class136 field1192 = class145.method1172(" zuerst von Ihrer Freunde)2Liste(Q", 45);

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "[I")
    public static int[] field1180;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static final void method426(int arg0) {
        if (arg0 == 2047) {
            class11.field178.method1165((byte) -73);
            field1186++;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)I")
    public final int method427(byte arg0, int arg1) {
        field1188++;
        int var3 = -21 % ((-arg0 - 19) / 56);
        int var4 = this.field1181.length - 2;
        int var5 = var4 & arg1 << 1;
        while (true) {
            int var6 = this.field1181[var5];
            if (arg1 == var6) {
                return this.field1181[var5 + 1];
            }
            if (var6 == -1) {
                return -1;
            }
            var5 = var5 + 2 & var4;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public static final void method428(int arg0) {
        class35.field814.method1165((byte) -73);
        class128.field3040.method1165((byte) -73);
        class63.field1348.method1165((byte) -73);
        field1191++;
        if (arg0 <= -77) {
            class12.field222.method1165((byte) -73);
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    public static final void method429(int arg0) {
        field1193++;
        for (int var1 = arg0; var1 < class55.field1255; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class24.field564[var1];
            }
            class13 var3 = class154.field3518[var2];
            if (var3 != null) {
                class149.method1190(0, 1, var3);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static final void method430(boolean arg0) {
        field1187++;
        if (!arg0) {
            method431((byte) 45);
        }
        class97.field2322 = false;
        class65.field1399 = false;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method431(byte arg0) {
        field1178 = null;
        field1192 = null;
        if (arg0 <= -48) {
            field1184 = null;
            field1182 = null;
            field1180 = null;
            field1190 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)I")
    public static final int method432(int arg0, byte arg1) {
        field1189++;
        int var2 = 5 / ((arg1 - 41) / 34);
        return arg0 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/Throwable;ZLjava/lang/String;)V")
    public static final void method433(Throwable arg0, boolean arg1, String arg2) {
        field1185++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class142.method1152(true, arg0);
            }
            if (arg1) {
                field1180 = null;
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class43.field992.field476 != null) {
                class150 var8 = class43.field992.method179(-30036, new URL(class43.field992.field476.getCodeBase(), "clienterror.ws?c=" + class2.field29 + "&u=" + class120.field2747 + "&v1=" + class22.field472 + "&v2=" + class22.field480 + "&e=" + var7));
                while (var8.field3442 == 0) {
                    class9.method42(0, 1L);
                }
                if (var8.field3442 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3441;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([I)V")
    public class53(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field1181 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1181[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1181[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field1181[var5 + var5] = arg0[var4];
            this.field1181[var5 + var5 + 1] = var4++;
        }
    }
}

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public abstract class class196 {

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public int field3421;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public int field3412;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public int field3422;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field3413 = 0;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "S")
    public static short field3417 = 205;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Loa;")
    public static class99 field3419 = class221.method1463(2844, ")1 ");

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3420;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "[[Z")
    public static boolean[][] field3414;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method1315(boolean arg0, Throwable arg1, String arg2) {
        field3423++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class1.method3(arg1, false);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class260.method1689(var3, arg0);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class137.field2408.field1493 != null) {
                class275 var8 = class137.field2408.method593(4, new URL(class137.field2408.field1493.getCodeBase(), "clienterror.ws?c=" + class277.field4874 + "&u=" + class86.field1486 + "&v1=" + class87.field1506 + "&v2=" + class87.field1511 + "&e=" + var7));
                while (var8.field4844 == 0) {
                    class100.method711(0, 1L);
                }
                if (var8.field4844 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field4843;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V")
    public abstract void method275(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(III)V")
    public abstract void method277(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IBI)V")
    public static final void method1316(int arg0, byte arg1, int arg2) {
        field3424++;
        class65.field1108 = class112.field2026 + class230.field3983 - arg0 - 1;
        class44.field775 = arg2 - class48.field802;
        if (arg1 > -99) {
            return;
        }
        int var3 = class44.field775 - ((int) ((float) class76.field1351.field1933 / class31.field560));
        int var4 = class44.field775 + ((int) ((float) class76.field1351.field1933 / class31.field560));
        int var5 = class65.field1108 - ((int) ((float) class76.field1351.field1793 / class31.field560));
        if (var3 < 0) {
            class44.field775 = (int) ((float) class76.field1351.field1933 / class31.field560);
        }
        if (class218.field3794 < var4) {
            class44.field775 = class218.field3794 - ((int) ((float) class76.field1351.field1933 / class31.field560));
        }
        int var6 = (int) ((float) class76.field1351.field1793 / class31.field560) + class65.field1108;
        if (var5 < 0) {
            class65.field1108 = (int) ((float) class76.field1351.field1793 / class31.field560);
        }
        if (class230.field3983 < var6) {
            class65.field1108 = class230.field3983 - ((int) ((float) class76.field1351.field1793 / class31.field560));
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static final void method1317(int arg0) {
        if (arg0 > 20) {
            class131.field2277.method966((byte) 49, 39);
            field3415++;
            class17.field184++;
            class131.field2277.method1699(0L, 85);
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    public static void method1318(int arg0) {
        field3414 = null;
        field3419 = null;
        field3420 = null;
        if (arg0 != 10305) {
            method1316(95, (byte) 127, -9);
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)Z")
    public static final boolean method1319(int arg0) {
        field3416++;
        if (arg0 > -58) {
            return false;
        }
        try {
            return class36.method285(-1);
        } catch (IOException var4) {
            class230.method1507(-123);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class212.field3669 + "," + class107.field1823 + "," + class238.field4112 + " - " + class180.field3146 + "," + (class168.field3006.field1317[0] + class280.field4910) + "," + (class215.field3731 + class168.field3006.field1259[0]) + " - ";
            for (int var3 = 0; var3 < class180.field3146 && var3 < 50; var3++) {
                var2 = var2 + class129.field2252.field4619[var3] + ",";
            }
            method1315(false, var5, var2);
            class116.method784((byte) 12);
            return true;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(III)V")
    public class196(int arg0, int arg1, int arg2) {
        this.field3421 = arg0;
        this.field3412 = arg1;
        this.field3422 = arg2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIB)V")
    public abstract void method271(int arg0, int arg1, byte arg2);
}

import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class201 extends class253 {

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "Lsb;")
    public static class214 field3502 = new class214(16);

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
    public static int field3507 = 2;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "Ljd;")
    private static class85 field3510 = class221.method1499("Please wait )2 attempting to reestablish)3", (byte) 109);

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public static int field3506 = 0;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "Ljd;")
    public static class85 field3505 = field3510;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "J")
    public long field3509;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "Lm;")
    public static class113 field3511;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "Lcc;")
    public class201 field3498;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "Lcc;")
    public class201 field3503;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "Lge;")
    public static class68 field3508;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
    public static final void method1379(Throwable arg0, String arg1, int arg2) {
        field3501++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class23.method152(arg0, (byte) -123);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class104.field1835.field1478 != null) {
                if (arg2 != 2552) {
                    field3510 = null;
                }
                class69 var8 = class104.field1835.method551(false, new URL(class104.field1835.field1478.getCodeBase(), "clienterror.ws?c=" + class94.field1712 + "&u=" + class268.field4766 + "&v1=" + class81.field1477 + "&v2=" + class81.field1463 + "&e=" + var7));
                while (var8.field1296 == 0) {
                    class190.method1311(1L, 1);
                }
                if (var8.field1296 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1292;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V")
    public final void method1380(boolean arg0) {
        field3497++;
        if (this.field3498 != null && arg0) {
            this.field3498.field3503 = this.field3503;
            this.field3503.field3498 = this.field3498;
            this.field3498 = null;
            this.field3503 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
    public static final void method1381(int arg0) {
        if (class6.field75 < 0) {
            class150.field2537 = -1;
            class147.field2496 = -1;
            class6.field75 = 0;
        }
        if (arg0 != 0) {
            method1381(-25);
        }
        field3500++;
        if (class100.field1793 < class6.field75) {
            class150.field2537 = -1;
            class6.field75 = class100.field1793;
            class147.field2496 = -1;
        }
        if (class168.field2901 < 0) {
            class168.field2901 = 0;
            class147.field2496 = -1;
            class150.field2537 = -1;
        }
        if (class168.field2901 > class79.field1458) {
            class147.field2496 = -1;
            class168.field2901 = class79.field1458;
            class150.field2537 = -1;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIILwb;II)Lwb;")
    public static final class26 method1382(int arg0, int arg1, int arg2, int arg3, class26 arg4, int arg5, int arg6) {
        long var7 = (long) arg0;
        field3499++;
        class26 var9 = (class26) class252.field4360.method1269(var7, (byte) 59);
        if (var9 == null) {
            class165 var10 = class165.method1111(class271.field4798, arg0, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1085(64, 768, -50, -10, -50);
            class252.field4360.method1271(-15561, var9, var7);
        }
        int var11 = arg4.method187();
        int var12 = arg4.method178();
        int var13 = arg4.method186();
        int var14 = arg4.method173();
        class26 var15 = var9.method170(true, true);
        if (arg2 != -50) {
            method1383(118);
        }
        if (arg3 != 0) {
            var15.method169(arg3);
        }
        class42 var16 = (class42) var15;
        if (class246.method1660(604124551, arg1 + var11, class116.field2066, arg6 + var13) != arg5 || class246.method1660(arg2 ^ 0xDBFDCA49, arg1 + var12, class116.field2066, arg6 + var14) != arg5) {
            for (int var17 = 0; var17 < var16.field691; var17++) {
                var16.field692[var17] += class246.method1660(604124551, var16.field710[var17] + arg1, class116.field2066, var16.field694[var17] + arg6) - arg5;
            }
            var16.field689 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
    public static void method1383(int arg0) {
        field3510 = null;
        field3502 = null;
        if (arg0 >= -3) {
            method1382(11, 64, -126, -7, (class26) null, 104, -119);
        }
        field3505 = null;
        field3508 = null;
        field3511 = null;
    }
}

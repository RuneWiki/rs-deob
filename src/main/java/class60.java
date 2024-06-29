import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class60 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "[I")
    public static int[] field1110 = new int[1000];

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Z")
    public static boolean field1111 = false;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lbb;")
    public static class14 field1112 = new class14(64);

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Ldc;")
    private static class37 field1114 = class185.method1233((byte) 86, "FULL");

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "[I")
    public static int[] field1115 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Ldc;")
    public static class37 field1116 = class185.method1233((byte) 86, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Ldc;")
    public static class37 field1118 = field1114;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Ldc;")
    public static class37 field1119 = class185.method1233((byte) 86, "<col=ffffff>");

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method454(int arg0) {
        if (arg0 >= -78) {
            field1115 = null;
        }
        field1115 = null;
        field1119 = null;
        field1118 = null;
        field1116 = null;
        field1112 = null;
        field1114 = null;
        field1110 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method455(int arg0, Throwable arg1, String arg2) {
        field1113++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class236.method1526((byte) -74, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', (char) arg0);
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class177.field3342.field347 != null) {
                class132 var8 = class177.field3342.method139(new URL(class177.field3342.field347.getCodeBase(), "clienterror.ws?c=" + class224.field4156 + "&u=" + class198.field3695 + "&v1=" + class21.field357 + "&v2=" + class21.field343 + "&e=" + var7), 127);
                while (var8.field2461 == 0) {
                    class238.method1548((byte) -68, 1L);
                }
                if (var8.field2461 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2465;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lre;I)V")
    public static final void method456(class190 arg0, int arg1) {
        if (arg1 <= 1) {
            method455(-35, null, null);
        }
        if (class203.field3758 == arg0.field3547 || arg0.field3524 == -1 || arg0.field3537 != 0 || arg0.field3495 + 1 > class16.method113(arg0.field3524, (byte) 93).field3882[arg0.field3540]) {
            int var2 = class203.field3758 - arg0.field3515;
            int var3 = arg0.field3547 - arg0.field3515;
            int var4 = arg0.field3499 * 64 + arg0.field3481 * 128;
            int var5 = arg0.field3499 * 64 + arg0.field3464 * 128;
            int var6 = arg0.field3512 * 128 + arg0.field3499 * 64;
            arg0.field3505 = ((var3 - var2) * var4 + var2 * var5) / var3;
            int var7 = arg0.field3519 * 128 + arg0.field3499 * 64;
            arg0.field3490 = ((var3 - var2) * var7 + var2 * var6) / var3;
        }
        field1117++;
        if (arg0.field3548 == 0) {
            arg0.field3513 = 1024;
        }
        if (arg0.field3548 == 1) {
            arg0.field3513 = 1536;
        }
        arg0.field3463 = 0;
        if (arg0.field3548 == 2) {
            arg0.field3513 = 0;
        }
        if (arg0.field3548 == 3) {
            arg0.field3513 = 512;
        }
        arg0.field3511 = arg0.field3513;
    }
}

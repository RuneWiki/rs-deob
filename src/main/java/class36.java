import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class36 extends class29 {

    @OriginalMember(owner = "mapview!t", name = "k", descriptor = "Lv;")
    public static class40 field473 = class24.method170("Fishing Spot", (byte) -94);

    @OriginalMember(owner = "mapview!t", name = "l", descriptor = "[Z")
    public static boolean[] field474 = new boolean[112];

    @OriginalMember(owner = "mapview!t", name = "m", descriptor = "Lv;")
    public static class40 field475 = class24.method170("Combat Training", (byte) 110);

    @OriginalMember(owner = "mapview!t", name = "n", descriptor = "Lv;")
    public static class40 field476 = class24.method170("Farming shop", (byte) 67);

    @OriginalMember(owner = "mapview!t", name = "o", descriptor = "Lv;")
    public static class40 field477 = class24.method170("General Store", (byte) 123);

    @OriginalMember(owner = "mapview!t", name = "p", descriptor = "Lv;")
    public static class40 field478 = class24.method170(" )2 ", (byte) -76);

    @OriginalMember(owner = "mapview!t", name = "j", descriptor = "Lv;")
    public static class40 field472 = class24.method170("100(U", (byte) -88);

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IIIZ)Lv;", line = 5)
    public static final class40 method216(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var4 = 1;
        for (int var5 = arg1 / arg2; var5 != 0; var5 /= arg2) {
            var4++;
        }
        int var6 = var4;
        if (arg1 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 > -109) {
            return (class40) null;
        }
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg1 % arg2;
            if (var9 < 0) {
                var9 = -var9;
            }
            arg1 /= arg2;
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class40 var10 = new class40();
        var10.field511 = var7;
        var10.field510 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(I)V", line = 79)
    public static final void method217(int arg0) {
        if (class23.field261 != null) {
            class31 var1 = class23.field261;
            synchronized (class23.field261) {
                class23.field261 = null;
            }
        }
        if (arg0 != 9522) {
            method218(false);
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Z)V", line = 124)
    public static void method218(boolean arg0) {
        field473 = null;
        field472 = null;
        field478 = null;
        if (arg0) {
            field474 = null;
        }
        field474 = null;
        field476 = null;
        field477 = null;
        field475 = null;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(II)I", line = 143)
    public static int method219(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V", line = 158)
    public static final void method220(Throwable arg0, int arg1, String arg2) {
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class37.method229(arg0, (byte) -54);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace((char) arg1, '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class27.field416.field170 == null) {
                return;
            }
            class13 var8 = class27.field416.method94(-12899, new URL(class27.field416.field170.getCodeBase(), "clienterror.ws?c=" + class32.field440 + "&u=" + class12.field122 + "&v1=" + class17.field176 + "&v2=" + class17.field179 + "&e=" + var7));
            while (var8.field137 == 0) {
                class37.method226(303, 1L);
            }
            if (var8.field137 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field136;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }
}

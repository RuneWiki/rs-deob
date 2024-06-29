import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class7 {

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "Lea;")
    public static class10 field56 = class3.method8("Loading )3)3)3", 90);

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "I")
    public static int field55 = 0;

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "Lea;")
    public static class10 field58 = class3.method8("Kebab Seller", -14);

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "Lea;")
    public static class10 field59 = class3.method8("details)3dat", 101);

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "I")
    public static int field57 = 0;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "mapview!d", name = "g", descriptor = "[I")
    public static int[] field60;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(ZLjava/lang/Throwable;Ljava/lang/String;)V", line = 12)
    public static final void method31(boolean arg0, Throwable arg1, String arg2) {
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class20.method141(0, arg1);
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
            if (class34.field454.field98 == null) {
                return;
            }
            class29 var8 = class34.field454.method94(14, new URL(class34.field454.field98.getCodeBase(), "clienterror.ws?c=" + class14.field159 + "&u=" + class28.field407 + "&v1=" + class12.field104 + "&v2=" + class12.field106 + "&e=" + var7));
            while (var8.field417 == 0) {
                class31.method220(1L, -17164);
            }
            if (var8.field417 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field413;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
        if (!arg0) {
            field57 = -52;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(IIBBI)V", line = 90)
    public static final void method32(int arg0, int arg1, byte arg2, byte arg3, int arg4) {
        int var5 = arg1 >> 6;
        int var6 = arg4 >> 6;
        if (class22.field239[arg0][var6][var5] == null) {
            class22.field239[arg0][var6][var5] = new byte[4096];
        }
        if (arg3 == -9) {
            class22.field239[arg0][var6][var5][class13.method96(arg1, 63) + class13.method96(arg4 << 6, 4032)] = arg2;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(B)V", line = 115)
    public static void method33(byte arg0) {
        field59 = null;
        field60 = null;
        field56 = null;
        field58 = null;
        if (arg0 >= -83) {
            method33((byte) 111);
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(II)[B", line = 134)
    public static final synchronized byte[] method34(int arg0, int arg1) {
        if (arg1 == 100 && class18.field194 > 0) {
            byte[] var2 = class36.field492[--class18.field194];
            class36.field492[class18.field194] = null;
            return var2;
        } else if (arg1 == 5000 && class6.field52 > 0) {
            byte[] var3 = class20.field215[--class6.field52];
            class20.field215[class6.field52] = null;
            return var3;
        } else if (arg0 == arg1 && class32.field438 > 0) {
            byte[] var4 = class14.field162[--class32.field438];
            class14.field162[class32.field438] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}

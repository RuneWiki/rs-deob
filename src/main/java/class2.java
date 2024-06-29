import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public class class2 {

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "Z")
    public static volatile boolean field81 = false;

    @OriginalMember(owner = "mapview!aa", name = "e", descriptor = "I")
    public static int field85 = 0;

    @OriginalMember(owner = "mapview!aa", name = "d", descriptor = "I")
    public static int field84 = -1;

    @OriginalMember(owner = "mapview!aa", name = "f", descriptor = "Lt;")
    public static class31 field86 = class11.method64(-73, "Loading ");

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "Lt;")
    public static class31 field83 = class11.method64(114, "100(U");

    @OriginalMember(owner = "mapview!aa", name = "g", descriptor = "Lt;")
    public static class31 field87 = class11.method64(-59, "Loom");

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "Lt;")
    public static class31 field82 = class11.method64(-106, "Skirt Shop");

    @OriginalMember(owner = "mapview!aa", name = "h", descriptor = "I")
    public static int field88 = 0;

    @OriginalMember(owner = "mapview!aa", name = "j", descriptor = "Lt;")
    public static class31 field90 = class11.method64(-86, "Dungeon");

    @OriginalMember(owner = "mapview!aa", name = "i", descriptor = "I")
    public static int field89 = 0;

    @OriginalMember(owner = "mapview!aa", name = "k", descriptor = "Lt;")
    public static class31 field91 = class11.method64(82, "Cookery Shop");

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(II)[B", line = 19)
    public static final synchronized byte[] method33(int arg0, int arg1) {
        if (arg1 == 100 && class31.field352 > 0) {
            byte[] var2 = mapview.field33[--class31.field352];
            mapview.field33[class31.field352] = null;
            return var2;
        } else if (arg1 == 5000 && class25.field284 > 0) {
            byte[] var3 = class8.field134[--class25.field284];
            class8.field134[class25.field284] = null;
            return var3;
        } else {
            if (arg0 > 0) {
                method34(-13L, (byte) -23);
            }
            if (arg1 == 30000 && class3.field96 > 0) {
                byte[] var4 = class3.field103[--class3.field96];
                class3.field103[class3.field96] = null;
                return var4;
            } else {
                return new byte[arg1];
            }
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(JB)V", line = 56)
    public static final void method34(long arg0, byte arg1) {
        if (arg1 == 38) {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var4) {
            }
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V", line = 70)
    public static final void method35(String arg0, int arg1, Throwable arg2) {
        try {
            if (arg1 != 12895) {
                field91 = null;
            }
            String var3 = "";
            if (arg2 != null) {
                var3 = class9.method61(126, arg2);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class13 var8 = class25.field287.method69((byte) -76, new URL(class25.field287.field191.getCodeBase(), "clienterror.ws?c=" + class33.field380 + "&u=" + class30.field337 + "&v1=" + class12.field202 + "&v2=" + class12.field196 + "&e=" + var7));
            while (var8.field212 == 0) {
                class22.method111(0, 1L);
            }
            if (var8.field212 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field207;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(I)V", line = 118)
    public static void method36(int arg0) {
        field87 = null;
        if (arg0 < 57) {
            field84 = -11;
        }
        field90 = null;
        field91 = null;
        field86 = null;
        field83 = null;
        field82 = null;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 174)
    public static final int method37(int arg0, KeyEvent arg1) {
        int var2 = arg1.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        if (arg0 != -1) {
            method34(-108L, (byte) 126);
        }
        return var2;
    }
}

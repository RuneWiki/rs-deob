import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public class class30 {

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "Ln;")
    public static class26 field382 = class9.method82(255, "map");

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "Ln;")
    public static class26 field384 = class9.method82(255, "codeversion");

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "Ln;")
    public static class26 field381 = class9.method82(255, "Furnace");

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "Ln;")
    public static class26 field383 = class9.method82(255, "Rare Trees");

    @OriginalMember(owner = "mapview!p", name = "h", descriptor = "Ln;")
    public static class26 field388 = class9.method82(255, "u_pass");

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "Z")
    public static volatile boolean field387 = false;

    @OriginalMember(owner = "mapview!p", name = "i", descriptor = "Ln;")
    public static class26 field389 = class9.method82(255, "Food Shop");

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "Ln;")
    public static class26 field385 = class9.method82(255, "???");

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "Laa;")
    public static class2 field386;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Z)Lh;", line = 25)
    public static final class15 method210(boolean arg0) {
        if (!arg0) {
            field384 = null;
        }
        try {
            return (class15) Class.forName("t").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class5();
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I)[Lg;", line = 41)
    public static final class13[] method211(int arg0) {
        class13[] var1 = new class13[class1.field70];
        for (int var2 = 0; var2 < class1.field70; var2++) {
            class13 var3 = var1[var2] = new class13();
            var3.field218 = class4.field121[var2];
            var3.field221 = class34.field418[var2];
            var3.field220 = class1.field73[var2];
            var3.field219 = class14.field223[var2];
            byte[] var4 = class7.field156[var2];
            int var5 = var3.field220 * var3.field219;
            var3.field222 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field222[var6] = class28.field367[mapview.method15(var4[var6], 255)];
            }
        }
        int var7 = 80 % ((13 - arg0) / 53);
        mapview.method14((byte) -67);
        return var1;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 87)
    public static final int method212(int arg0, KeyEvent arg1) {
        int var2 = arg1.getKeyChar();
        if (arg0 <= ~var2 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(I)V", line = 113)
    public static void method213(int arg0) {
        field385 = null;
        if (arg0 != 0) {
            field382 = null;
        }
        field381 = null;
        field384 = null;
        field386 = null;
        field383 = null;
        field382 = null;
        field388 = null;
        field389 = null;
    }
}

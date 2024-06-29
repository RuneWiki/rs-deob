import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class15 {

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "Lt;")
    public static class35 field176 = class3.method28(false, "37(U");

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "Lt;")
    public static class35 field180 = class3.method28(false, "Clothes Shop");

    @OriginalMember(owner = "mapview!h", name = "g", descriptor = "J")
    public static long field182 = 0L;

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "Lt;")
    public static class35 field178 = class3.method28(false, "mapscene");

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "mapview!h", name = "f", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "[B")
    public static byte[] field179;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Z)V", line = 15)
    public static void method91(boolean arg0) {
        if (!arg0) {
            field176 = null;
            field180 = null;
            field178 = null;
            field179 = null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(B)[Ll;", line = 33)
    public static final class22[] method92(byte arg0) {
        class22[] var1 = new class22[class16.field189];
        for (int var2 = 0; var2 < class16.field189; var2++) {
            class22 var3 = var1[var2] = new class22();
            var3.field252 = class34.field426[var2];
            var3.field251 = class30.field341[var2];
            var3.field253 = class36.field448[var2];
            var3.field249 = class2.field67[var2];
            int var4 = var3.field253 * var3.field249;
            byte[] var5 = class13.field174[var2];
            var3.field250 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field250[var6] = class24.field275[mapview.method15(var5[var6], 255)];
            }
        }
        if (arg0 == -43) {
            class18.method115(arg0 + 42);
            return var1;
        } else {
            return (class22[]) null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I)Z", line = 76)
    public static final boolean method93(int arg0) {
        class8 var1 = class26.field302;
        synchronized (class26.field302) {
            if (mapview.field5 == class31.field381) {
                return false;
            } else if (arg0 == 18035) {
                class31.field387 = class17.field197[mapview.field5];
                class13.field169 = class23.field263[mapview.field5];
                mapview.field5 = mapview.field5 + 1 & 0x7F;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(B)V", line = 101)
    public static final void method94(byte arg0) {
        if (class31.field393 != null) {
            class17 var1 = class31.field393;
            synchronized (class31.field393) {
                class31.field393 = null;
            }
        }
        if (arg0 != -19) {
            method94((byte) -120);
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(JI)V", line = 118)
    public static final void method95(long arg0, int arg1) {
        if (arg1 == 0) {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var4) {
            }
        }
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(I)V", line = 165)
    public static final void method96(int arg0) {
        class17 var1 = class31.field393;
        synchronized (class31.field393) {
            if (arg0 == 7591) {
                class19.field221 = class36.field452;
                class7.field125 = class32.field402;
                class36.field453 = class13.field165;
                class16.field192 = class33.field416;
                class21.field247 = class5.field97;
                class33.field417 = class3.field73;
                class33.field416 = 0;
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public class class33 {

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "Ln;")
    public static class26 field404 = class9.method82(255, "Pub)4Bar");

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "Ln;")
    public static class26 field402 = class9.method82(255, "Amulet Shop");

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "Z")
    public static boolean field405 = true;

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "Ln;")
    public static class26 field403 = class9.method82(255, "overlay2)3dat");

    @OriginalMember(owner = "mapview!r", name = "e", descriptor = "Ln;")
    public static class26 field406 = class9.method82(255, "Axe Shop");

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "([BI)V", line = 20)
    public static final void method226(byte[] arg0, int arg1) {
        class17 var2 = new class17(arg0);
        var2.field251 = arg0.length - 2;
        class1.field70 = var2.method134((byte) 49);
        class4.field121 = new int[class1.field70];
        class1.field73 = new int[class1.field70];
        class34.field418 = new int[class1.field70];
        class7.field156 = new byte[class1.field70][];
        class14.field223 = new int[class1.field70];
        var2.field251 = arg0.length - class1.field70 * 8 - 7;
        class21.field303 = var2.method134((byte) 108);
        class34.field417 = var2.method134((byte) 125);
        int var3 = (var2.method130(false) & 0xFF) + 1;
        for (int var4 = 0; var4 < class1.field70; var4++) {
            class4.field121[var4] = var2.method134((byte) 125);
        }
        for (int var5 = 0; var5 < class1.field70; var5++) {
            class34.field418[var5] = var2.method134((byte) 98);
        }
        for (int var6 = 0; var6 < class1.field70; var6++) {
            class1.field73[var6] = var2.method134((byte) 34);
        }
        for (int var7 = 0; var7 < class1.field70; var7++) {
            class14.field223[var7] = var2.method134((byte) 77);
        }
        var2.field251 = arg0.length + 3 - class1.field70 * 8 - var3 * 3 - 7;
        class28.field367 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class28.field367[var8] = var2.method121(class9.method83(arg1, -127));
            if (class28.field367[var8] == 0) {
                class28.field367[var8] = 1;
            }
        }
        var2.field251 = 0;
        for (int var9 = arg1; var9 < class1.field70; var9++) {
            int var10 = class1.field73[var9];
            int var11 = class14.field223[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class7.field156[var9] = var13;
            int var14 = var2.method130(false);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method125((byte) -68);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var10 * var16 + var15] = var2.method125((byte) -79);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(B)B", line = 167)
    public static final byte method227(byte arg0) {
        int var1 = 115 % ((-arg0 - 27) / 47);
        return class8.field176 == null ? 0 : class8.field176[class18.field262];
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I)Z", line = 189)
    public static final boolean method228(int arg0) {
        class28 var1 = class35.field419;
        synchronized (class35.field419) {
            if (arg0 != 4730) {
                field404 = null;
            }
            if (class36.field460 == class11.field204) {
                return false;
            } else {
                class5.field130 = class29.field375[class11.field204];
                class36.field434 = class28.field359[class11.field204];
                class11.field204 = class11.field204 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(I)V", line = 209)
    public static void method229(int arg0) {
        int var1 = -81 % ((63 - arg0) / 46);
        field403 = null;
        field404 = null;
        field406 = null;
        field402 = null;
    }
}

import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class185 implements class164 {

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Z")
    private boolean field3401 = true;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field3410 = 0;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "Lli;")
    public static class185 field3417 = class245.method1649("Sprites charg-Bs", 127);

    @OriginalMember(owner = "client!li", name = "n", descriptor = "Lgf;")
    public static class7 field3408 = new class7(64);

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "Lli;")
    public static class185 field3444 = class245.method1649("cookiehost", -58);

    @OriginalMember(owner = "client!li", name = "bb", descriptor = "[[S")
    public static short[][] field3446 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!li", name = "ib", descriptor = "I")
    public static int field3453 = 0;

    @OriginalMember(owner = "client!li", name = "lb", descriptor = "Z")
    public static boolean field3456 = false;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    public int field3437;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!li", name = "cb", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!li", name = "db", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!li", name = "eb", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!li", name = "gb", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!li", name = "hb", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!li", name = "jb", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!li", name = "kb", descriptor = "I")
    public static int field3455;

    // $FF: synthetic field
    @OriginalMember(owner = "client!li", name = "mb", descriptor = "Ljava/lang/Class;")
    public static Class field3457;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "[B")
    public byte[] field3411;

    @OriginalMember(owner = "client!li", name = "fb", descriptor = "[[[I")
    public static int[][][] field3450;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIB[BI)I")
    public final int method1298(int arg0, int arg1, byte arg2, byte[] arg3, int arg4) {
        field3403++;
        class190.method1370(this.field3411, arg1, arg3, arg4, arg0 - arg1);
        return arg2 == 26 ? arg0 - arg1 : 49;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILli;)Z")
    public final boolean method1299(int arg0, class185 arg1) {
        field3422++;
        if (arg1.field3437 > this.field3437) {
            return false;
        } else if (arg0 > -98) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field3437; var3++) {
                byte var4 = this.field3411[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg1.field3411[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/applet/Applet;I)Lli;")
    public final class185 method1300(Applet arg0, int arg1) {
        field3404++;
        if (arg1 == 26090) {
            String var3 = new String(this.field3411, 0, this.field3437);
            String var4 = arg0.getParameter(var3);
            return var4 == null ? null : class265.method1810(var4, arg1 ^ 0xFFFF9A03);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BII)Lli;")
    public final class185 method1301(byte arg0, int arg1, int arg2) {
        field3395++;
        class185 var4 = new class185();
        if (arg0 >= -44) {
            this.method1327((byte) -5);
        }
        var4.field3411 = new byte[arg1 - arg2];
        var4.field3437 = arg1 - arg2;
        class190.method1370(this.field3411, arg2, var4.field3411, 0, var4.field3437);
        return var4;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lli;I)Z")
    public final boolean method1302(class185 arg0, int arg1) {
        field3435++;
        if (this.field3437 < arg0.field3437) {
            return false;
        }
        int var3 = this.field3437 - arg0.field3437;
        if (arg1 <= 44) {
            this.method1325(-11);
        }
        for (int var4 = 0; var4 < arg0.field3437; var4++) {
            if (this.field3411[var3 + var4] != arg0.field3411[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lli;B)I")
    public final int method1303(class185 arg0, byte arg1) {
        field3454++;
        int var3;
        if (this.field3437 > arg0.field3437) {
            var3 = arg0.field3437;
        } else {
            var3 = this.field3437;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field3411[var4] & 0xFF) > (this.field3411[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field3411[var4] & 0xFF) < (this.field3411[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg0.field3437 > this.field3437) {
            return -1;
        }
        if (arg1 != -12) {
            this.method1341((class185) null, false);
        }
        if (arg0.field3437 < this.field3437) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)Lli;")
    public final class185 method1304(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field3413++;
        class185 var2 = new class185();
        var2.field3437 = this.field3437;
        var2.field3411 = new byte[var2.field3437];
        for (int var3 = 0; var3 < this.field3437; var3++) {
            var2.field3411[this.field3437 - var3 - 1] = this.field3411[var3];
        }
        return var2;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)I")
    public final int method1305(byte arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        int var4 = 0;
        field3399++;
        boolean var5 = false;
        if (arg0 < 43) {
            this.method1324(125);
        }
        for (int var6 = 0; var6 < this.field3437; var6++) {
            int var7 = this.field3411[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (var7 >= arg1) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var4 + var7;
            if ((var8 / arg1) != var4) {
                throw new NumberFormatException();
            }
            var4 = var8;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Lli;B)Z")
    public final boolean method1306(class185 arg0, byte arg1) {
        field3425++;
        if (this.field3437 < arg0.field3437) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field3437; var3++) {
            if (this.field3411[var3] != arg0.field3411[var3]) {
                return false;
            }
        }
        if (arg1 < 103) {
            this.method1317(3, (class185) null, 2);
        }
        return true;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Lli;")
    public final class185 method1307(int arg0) {
        field3448++;
        long var2 = this.method1330(false);
        synchronized (field3457 == null ? (field3457 = method1346("li")) : field3457) {
            if (class93.field1775 == null) {
                class93.field1775 = new class31(4096);
            } else {
                for (class229 var5 = (class229) class93.field1775.method195(46, var2); var5 != null; var5 = (class229) class93.field1775.method197(-63)) {
                    if (this.method1329(var5.field4169, (byte) 22)) {
                        return var5.field4169;
                    }
                }
            }
            int var7 = -17 % ((arg0 - 43) / 57);
            class229 var8 = new class229();
            this.field3401 = false;
            var8.field4169 = this;
            class93.field1775.method190(var8, (byte) -101, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)Ljava/net/URL;")
    public final URL method1308(boolean arg0) throws MalformedURLException {
        if (arg0) {
            field3452++;
            return new URL(new String(this.field3411, 0, this.field3437));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field3455++;
        if (!arg0 instanceof class185) {
            throw new IllegalArgumentException();
        }
        return this.method1329((class185) arg0, (byte) 22);
    }

    @OriginalMember(owner = "client!li", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3436++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)Lli;")
    public final class185 method1309(int arg0) {
        int var2 = this.field3437;
        if (arg0 != -1) {
            return null;
        }
        int var3;
        for (var3 = 0; this.field3437 > var3 && (this.field3411[var3] >= 0 && this.field3411[var3] <= 32 || (this.field3411[var3] & 0xFF) == 160); var3++) {
        }
        field3397++;
        while (var2 > var3 && (this.field3411[var2 - 1] >= 0 && this.field3411[var2 - 1] <= 32 || (this.field3411[var2 - 1] & 0xFF) == 160)) {
            var2--;
        }
        if (var3 == 0 && this.field3437 == var2) {
            return this;
        }
        class185 var4 = new class185();
        var4.field3437 = var2 - var3;
        var4.field3411 = new byte[var4.field3437];
        for (int var5 = 0; var5 < var4.field3437; var5++) {
            var4.field3411[var5] = this.field3411[var3 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Lli;")
    public final class185 method1310(int arg0, int arg1) {
        if (arg0 == 39) {
            field3443++;
            return this.method1301((byte) -85, this.field3437, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)I")
    public final int method1311(byte arg0) {
        field3416++;
        return arg0 == 49 ? this.field3437 : -92;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Lli;I)Z")
    public final boolean method1312(class185 arg0, int arg1) {
        field3431++;
        if (arg0 == null) {
            return false;
        } else if (this.field3437 == arg0.field3437) {
            if (arg1 != -30055) {
                field3417 = null;
            }
            for (int var3 = 0; var3 < this.field3437; var3++) {
                byte var4 = this.field3411[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg0.field3411[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)Z")
    private final boolean method1313(int arg0, int arg1) {
        field3430++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3437; var6++) {
            int var7 = this.field3411[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (var7 >= arg1) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                return false;
            }
            var5 = var8;
            var4 = true;
        }
        if (arg0 != -32553) {
            this.method1318(22, -54);
        }
        return var4;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(Z)Lli;")
    public final class185 method1314(boolean arg0) {
        field3423++;
        class185 var2 = class271.method1859((byte) -108, this.method1327((byte) 101));
        if (arg0) {
            return null;
        } else if (var2 == null) {
            return class105.field1899;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/applet/Applet;)Ljava/lang/Object;")
    public final Object method1315(int arg0, Applet arg1) throws Throwable {
        String var3 = new String(this.field3411, 0, this.field3437);
        field3421++;
        Object var4 = class279.method1911(arg1, true, var3);
        int var5 = 61 % ((46 - arg0) / 55);
        if (var4 instanceof String) {
            byte[] var6 = ((String) var4).getBytes();
            var4 = class204.method1451(var6, (byte) -125, var6.length, 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)Lli;")
    public final class185 method1316(int arg0) {
        field3396++;
        if (arg0 != -6017) {
            return null;
        }
        class185 var2 = new class185();
        var2.field3437 = this.field3437;
        byte var3 = 2;
        var2.field3411 = new byte[this.field3437];
        for (int var4 = 0; var4 < this.field3437; var4++) {
            byte var5 = this.field3411[var4];
            if (!(var5 < 97 || var5 > 122) || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var3 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = 2;
            } else if (var5 != 32) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2.field3411[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILli;I)I")
    public final int method1317(int arg0, class185 arg1, int arg2) {
        field3424++;
        int var4 = arg1.field3437;
        if (arg2 >= this.field3437) {
            return var4 == 0 ? this.field3437 : -1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (var4 == 0) {
            return arg2;
        }
        byte[] var5 = arg1.field3411;
        int var6 = this.field3437 - var4;
        byte var7 = var5[0];
        int var8 = arg2;
        if (arg0 != -25988) {
            return 18;
        }
        while (var8 <= var6) {
            if (this.field3411[var8] != var7) {
                do {
                    var8++;
                    if (var8 > var6) {
                        return -1;
                    }
                } while (this.field3411[var8] != var7);
            }
            boolean var9 = true;
            int var10 = 1;
            int var11 = var8 + 1;
            while (var10 < var4) {
                if (this.field3411[var11] != var5[var10]) {
                    var9 = false;
                    break;
                }
                var10++;
                var11++;
            }
            if (var9) {
                return var8;
            }
            var8++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(II)V")
    public final void method1318(int arg0, int arg1) {
        field3441++;
        if (!this.field3401) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > this.field3411.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class190.method1370(this.field3411, 0, var4, 0, this.field3437);
                this.field3411 = var4;
            }
            if (arg1 != 0) {
                this.toString();
            }
            for (int var5 = this.field3437; var5 < arg0; var5++) {
                this.field3411[var5] = 32;
            }
            this.field3437 = arg0;
        }
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)I")
    public final int method1319(int arg0) {
        int var2 = 0;
        field3442++;
        for (int var3 = 0; var3 < this.field3437; var3++) {
            var2 = (var2 << 5) + (this.field3411[var3] & 0xFF) - var2;
        }
        int var4 = 106 % ((arg0 + 40) / 47);
        return var2;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/net/URL;B)Ljava/net/URL;")
    public final URL method1320(URL arg0, byte arg1) throws MalformedURLException {
        if (arg1 == 47) {
            field3434++;
            return new URL(arg0, new String(this.field3411, 0, this.field3437));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BLli;)I")
    public final int method1321(byte arg0, class185 arg1) {
        if (arg0 <= 30) {
            field3410 = -6;
        }
        field3407++;
        return this.method1317(-25988, arg1, 0);
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V")
    public static void method1322(int arg0) {
        field3444 = null;
        field3417 = null;
        field3450 = null;
        field3446 = null;
        field3408 = null;
        if (arg0 != 17916) {
            field3450 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)Lli;")
    public final class185 method1323(byte arg0) {
        field3428++;
        if (arg0 >= -47) {
            return null;
        } else if (this.field3401) {
            if (this.field3411.length != this.field3437) {
                byte[] var2 = new byte[this.field3437];
                class190.method1370(this.field3411, 0, var2, 0, this.field3437);
                this.field3411 = var2;
            }
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!li", name = "f", descriptor = "(I)Z")
    public final boolean method1324(int arg0) {
        if (arg0 == 10) {
            field3440++;
            return this.method1313(-32553, 10);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!li", name = "g", descriptor = "(I)Lli;")
    public final class185 method1325(int arg0) {
        field3418++;
        class185 var2 = new class185();
        var2.field3437 = this.field3437;
        var2.field3411 = new byte[this.field3437];
        int var3 = 0;
        if (arg0 != 40) {
            this.method1311((byte) 25);
        }
        while (var3 < this.field3437) {
            byte var4 = this.field3411[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field3411[var3] = var4;
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(Z)V")
    public final void method1326(boolean arg0) {
        if (arg0) {
            return;
        }
        field3409++;
        String var2;
        try {
            var2 = new String(this.field3411, 0, this.field3437, "ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var2 = new String(this.field3411, 0, this.field3437);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(B)J")
    public final long method1327(byte arg0) {
        field3432++;
        long var2 = 0L;
        for (int var4 = 0; this.field3437 > var4 && var4 < 12; var4++) {
            byte var5 = this.field3411[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 + 1 - 65);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 - 21);
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        if (arg0 != 101) {
            this.method1342(-67, (FontMetrics) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(BI)I")
    public final int method1328(byte arg0, int arg1) {
        field3419++;
        if (arg0 != 96) {
            field3408 = null;
        }
        return this.field3411[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(Lli;B)Z")
    public final boolean method1329(class185 arg0, byte arg1) {
        field3451++;
        if (arg0 == null) {
            return false;
        } else if (arg0 == this) {
            return true;
        } else if (this.field3437 == arg0.field3437) {
            byte[] var3 = this.field3411;
            byte[] var4 = arg0.field3411;
            if (arg1 != 22) {
                field3410 = -83;
            }
            for (int var5 = 0; var5 < this.field3437; var5++) {
                if (var3[var5] != var4[var5]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(Z)J")
    public final long method1330(boolean arg0) {
        long var2 = 0L;
        field3438++;
        if (arg0) {
            field3447 = 33;
        }
        for (int var4 = 0; var4 < this.field3437; var4++) {
            var2 = (var2 << 5) + (long) (this.field3411[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)I")
    public final int method1331(int arg0, int arg1, int arg2) {
        field3405++;
        byte var4 = (byte) arg0;
        if (arg2 <= 105) {
            field3453 = 82;
        }
        for (int var5 = arg1; var5 < this.field3437; var5++) {
            if (this.field3411[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!li", name = "h", descriptor = "(I)I")
    public final int method1332(int arg0) {
        if (arg0 != 10634) {
            this.method1343(43, 57, -3, (Graphics) null);
        }
        field3400++;
        return this.method1305((byte) 94, 10);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)[Lli;")
    public final class185[] method1333(int arg0, byte arg1) {
        if (arg1 > -31) {
            this.method1338(127, 31, (class185) null, (byte) -49);
        }
        field3449++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3437; var4++) {
            if (this.field3411[var4] == arg0) {
                var3++;
            }
        }
        class185[] var5 = new class185[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field3411[var7 + var9] != arg0; var9++) {
            }
            var5[var6++] = this.method1301((byte) -117, var7 + var9, var7);
            var7 += var9 + 1;
        }
        var5[var3] = this.method1301((byte) -90, this.field3437, var7);
        return var5;
    }

    @OriginalMember(owner = "client!li", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field3415++;
        return this.method1319(-101);
    }

    @OriginalMember(owner = "client!li", name = "i", descriptor = "(I)Lli;")
    public final class185 method1334(int arg0) {
        class185 var2 = new class185();
        field3412++;
        var2.field3437 = this.field3437;
        var2.field3411 = new byte[this.field3437];
        boolean var3 = true;
        if (arg0 != 38) {
            field3410 = -96;
        }
        for (int var4 = 0; var4 < this.field3437; var4++) {
            byte var5 = this.field3411[var4];
            if (var5 == 95) {
                var2.field3411[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field3411[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var3 = false;
                var2.field3411[var4] = var5;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(II)Lli;")
    public final class185 method1335(int arg0, int arg1) {
        field3420++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class185 var3 = new class185();
        var3.field3411 = new byte[this.field3437 + arg1];
        var3.field3437 = this.field3437 + 1;
        class190.method1370(this.field3411, 0, var3.field3411, 0, this.field3437);
        var3.field3411[this.field3437] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BLli;Lli;)Lli;")
    public final class185 method1336(byte arg0, class185 arg1, class185 arg2) {
        int var4 = this.field3437;
        int var5 = arg1.field3437 - arg2.field3437;
        if (arg0 != -102) {
            this.method1332(109);
        }
        field3439++;
        int var6 = 0;
        while (true) {
            int var7 = this.method1317(arg0 ^ 0x65E6, arg2, var6);
            if (var7 < 0) {
                class185 var8 = class37.method232(var4, 0);
                int var9 = 0;
                while (true) {
                    int var10 = this.method1317(-25988, arg2, var9);
                    if (var10 < 0) {
                        while (this.field3437 > var9) {
                            var8.method1340(this.field3411[var9++] & 0xFF, (byte) -112);
                        }
                        return var8;
                    }
                    while (var9 < var10) {
                        var8.method1340(this.field3411[var9++] & 0xFF, (byte) -112);
                    }
                    var8.method1337(arg1, -27866);
                    var9 += arg2.field3437;
                }
            }
            var6 = arg2.field3437 + var7;
            var4 += var5;
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(Lli;I)Lli;")
    public final class185 method1337(class185 arg0, int arg1) {
        field3429++;
        if (!this.field3401) {
            throw new IllegalArgumentException();
        }
        if (this.field3437 + arg0.field3437 > this.field3411.length) {
            int var3;
            for (var3 = 1; var3 < this.field3437 + arg0.field3437; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class190.method1370(this.field3411, 0, var4, 0, this.field3437);
            this.field3411 = var4;
        }
        if (arg1 != -27866) {
            this.method1325(-96);
        }
        class190.method1370(arg0.field3411, 0, this.field3411, this.field3437, arg0.field3437);
        this.field3437 += arg0.field3437;
        return this;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILli;B)Lli;")
    public final class185 method1338(int arg0, int arg1, class185 arg2, byte arg3) {
        if (arg3 != 108) {
            field3450 = null;
        }
        field3402++;
        if (!this.field3401) {
            throw new IllegalArgumentException();
        } else if (arg0 >= 0 && arg0 <= arg1 && arg2.field3437 >= arg1) {
            if (this.field3411.length < this.field3437 + arg1 - arg0) {
                int var5;
                for (var5 = 1; var5 < (this.field3437 + arg2.field3437); var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class190.method1370(this.field3411, 0, var6, 0, this.field3437);
                this.field3411 = var6;
            }
            class190.method1370(arg2.field3411, arg0, this.field3411, this.field3437, arg1 - arg0);
            this.field3437 += arg1 - arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(B)[B")
    public final byte[] method1339(byte arg0) {
        byte[] var2 = new byte[this.field3437];
        class190.method1370(this.field3411, 0, var2, 0, this.field3437);
        field3406++;
        if (arg0 < 90) {
            this.field3437 = 41;
        }
        return var2;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(IB)Lli;")
    public final class185 method1340(int arg0, byte arg1) {
        field3433++;
        if (arg1 != -112) {
            this.toString();
        }
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field3401) {
            if (this.field3411.length == this.field3437) {
                int var3;
                for (var3 = 1; var3 <= this.field3437; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class190.method1370(this.field3411, 0, var4, 0, this.field3437);
                this.field3411 = var4;
            }
            this.field3411[this.field3437++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lli;Z)I")
    public final int method1341(class185 arg0, boolean arg1) {
        field3426++;
        int var3 = this.field3437;
        int var4 = 0;
        int var5 = arg0.field3437;
        int var6 = 0;
        int var7 = this.field3437;
        int var8 = arg0.field3437;
        int var9 = 0;
        if (arg1) {
            this.field3411 = null;
        }
        int var10 = 0;
        while (var3 != 0 && var5 != 0) {
            if (var4 == 156 || var4 == 230) {
                var4 = 101;
            } else if (var4 == 140 || var4 == 198) {
                var4 = 69;
            } else if (var4 == 223) {
                var4 = 115;
            } else {
                var4 = this.field3411[var9] & 0xFF;
                var9++;
            }
            if (class60.method421(230, var4)) {
                var7++;
            } else {
                var3--;
            }
            if (var6 == 156 || var6 == 230) {
                var6 = 101;
            } else if (var6 == 140 || var6 == 198) {
                var6 = 69;
            } else if (var6 == 223) {
                var6 = 115;
            } else {
                var6 = arg0.field3411[var10] & 0xFF;
                var10++;
            }
            if (class60.method421(230, var6)) {
                var8++;
            } else {
                var5--;
            }
            if (class157.field2982[var6] > class157.field2982[var4]) {
                return -1;
            }
            if (class157.field2982[var6] < class157.field2982[var4]) {
                return 1;
            }
        }
        if (var7 < var8) {
            return -1;
        } else if (var8 < var7) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
    public final int method1342(int arg0, FontMetrics arg1) {
        field3445++;
        String var3;
        try {
            var3 = new String(this.field3411, 0, this.field3437, "ISO-8859-1");
            if (arg0 >= -34) {
                this.method1334(112);
            }
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field3411, 0, this.field3437);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method1343(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0 > -120) {
            this.field3437 = -30;
        }
        field3427++;
        String var5;
        try {
            var5 = new String(this.field3411, 0, this.field3437, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field3411, 0, this.field3437);
        }
        arg3.drawString(var5, arg2, arg1);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(ILjava/applet/Applet;)V")
    public final void method1344(int arg0, Applet arg1) throws Throwable {
        field3414++;
        if (arg0 != -15737) {
            field3410 = 96;
        }
        String var3 = new String(this.field3411, 0, this.field3437);
        class279.method1910(-26463, var3, arg1);
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(II)I")
    public static final int method1345(int arg0, int arg1) {
        field3398++;
        int var2 = -12 / ((-arg1 - 68) / 40);
        return arg0 & 0x7F;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1346(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

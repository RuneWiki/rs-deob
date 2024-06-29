import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ra")
public class class35 extends class38 {

    @OriginalMember(owner = "mapview!ra", name = "w", descriptor = "[J")
    private long[] field501 = new long[10];

    @OriginalMember(owner = "mapview!ra", name = "r", descriptor = "I")
    private int field496 = 256;

    @OriginalMember(owner = "mapview!ra", name = "s", descriptor = "I")
    private int field497 = 0;

    @OriginalMember(owner = "mapview!ra", name = "u", descriptor = "I")
    private int field499 = 1;

    @OriginalMember(owner = "mapview!ra", name = "i", descriptor = "J")
    private long field487 = class22.method134((byte) -87);

    @OriginalMember(owner = "mapview!ra", name = "j", descriptor = "I")
    public static int field488 = 0;

    @OriginalMember(owner = "mapview!ra", name = "m", descriptor = "Lf;")
    public static class10 field491 = class23.method139("sprites", (byte) -118);

    @OriginalMember(owner = "mapview!ra", name = "k", descriptor = "Lf;")
    public static class10 field489 = class23.method139("Next page", (byte) -58);

    @OriginalMember(owner = "mapview!ra", name = "v", descriptor = "Lf;")
    public static class10 field500 = class23.method139("Mini Obelisk", (byte) -94);

    @OriginalMember(owner = "mapview!ra", name = "q", descriptor = "I")
    public static int field495 = 20;

    @OriginalMember(owner = "mapview!ra", name = "t", descriptor = "Lf;")
    public static class10 field498 = class23.method139("Fishing Spot", (byte) -101);

    @OriginalMember(owner = "mapview!ra", name = "n", descriptor = "[I")
    public static int[] field492 = new int[128];

    @OriginalMember(owner = "mapview!ra", name = "o", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "mapview!ra", name = "p", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "mapview!ra", name = "y", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "mapview!ra", name = "x", descriptor = "J")
    public static long field502;

    @OriginalMember(owner = "mapview!ra", name = "l", descriptor = "[[B")
    public static byte[][] field490;

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V", line = 11)
    public static final void method230(String arg0, int arg1, Throwable arg2) {
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = mapview.method159(arg2, 16);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            if (arg1 != 24789) {
                method230(null, 59, null);
            }
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class6.field56.field84 == null) {
                return;
            }
            class29 var8 = class6.field56.method47(new URL(class6.field56.field84.getCodeBase(), "clienterror.ws?c=" + class17.field156 + "&u=" + class17.field157 + "&v1=" + class9.field89 + "&v2=" + class9.field98 + "&e=" + var7), 0);
            while (var8.field399 == 0) {
                class24.method142(108, 1L);
            }
            if (var8.field399 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field401;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(ZI)I", line = 84)
    public static final int method231(boolean arg0, int arg1) {
        if (arg1 >= 65 && arg1 <= 90 || !(arg1 < 192 || arg1 > 222 || arg1 == 215)) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            if (arg0) {
                field493 = -41;
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(ILc;II)[Ln;", line = 116)
    public static final class26[] method232(int arg0, class5 arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            field491 = null;
        }
        return class37.method240(arg3, arg2, -112, arg1) ? class5.method25((byte) -48) : null;
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(IIILc;Lc;)Lg;", line = 138)
    public static final class12 method233(int arg0, int arg1, int arg2, class5 arg3, class5 arg4) {
        if (class37.method240(arg0, arg2, -114, arg3)) {
            if (arg1 > -62) {
                field491 = null;
            }
            return class24.method141(1, arg4.method29(-1, arg0, arg2));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "c", descriptor = "(I)V", line = 163)
    public static void method234(int arg0) {
        field500 = null;
        if (arg0 != 58) {
            return;
        }
        field489 = null;
        field491 = null;
        field490 = null;
        field498 = null;
        field492 = null;
    }

    @OriginalMember(owner = "mapview!ra", name = "<init>", descriptor = "()V", line = 274)
    public class35() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field501[var1] = this.field487;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(IIZ)I", line = 205)
    public final int method235(int arg0, int arg1, boolean arg2) {
        int var4 = this.field496;
        this.field496 = 300;
        int var5 = this.field499;
        this.field499 = 1;
        this.field487 = class22.method134((byte) -87);
        if (this.field501[this.field503] == 0L) {
            this.field496 = var4;
            this.field499 = var5;
        } else if (this.field501[this.field503] < this.field487) {
            this.field496 = (int) ((long) (arg1 * 2560) / (this.field487 - this.field501[this.field503]));
        }
        if (this.field496 < 25) {
            this.field496 = 25;
        }
        if (this.field496 > 256) {
            this.field496 = 256;
            this.field499 = (int) ((long) arg1 - (this.field487 - this.field501[this.field503]) / 10L);
        }
        if (this.field499 > arg1) {
            this.field499 = arg1;
        }
        this.field501[this.field503] = this.field487;
        this.field503 = (this.field503 + 1) % 10;
        if (arg2) {
            field498 = null;
        }
        if (this.field499 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field501[var6] != 0L) {
                    this.field501[var6] += this.field499;
                }
            }
        }
        if (this.field499 < arg0) {
            this.field499 = arg0;
        }
        class24.method142(125, (long) this.field499);
        int var7 = 0;
        while (this.field497 < 256) {
            this.field497 += this.field496;
            var7++;
        }
        this.field497 &= 0xFF;
        return var7;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class243 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    private int field3304 = 0;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Luc;")
    private class58 field3309;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field3305 = 0;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lfd;")
    public static class194 field3308 = null;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3307 = "Loading config - ";

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "Z")
    public static boolean field3314 = false;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field3317 = 0;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3310 = "cyan:";

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Lam;")
    public static class286 field3318;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "Lgl;")
    private class338 field3316;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "[I")
    public static int[] field3306;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V")
    public static final void method1301(int arg0, int arg1, int arg2) {
        field3313++;
        if (arg2 != 0) {
            field3308 = null;
        }
        class89 var3 = class21.field197[arg0][arg1];
        if (var3 != null) {
            class275.field3713 = var3.field1025;
            class173.field2174 = var3.field1012;
            class368.field5158 = var3.field1018;
        }
        class201.method1088(arg2 ^ 0xFFFFFFCE);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public static void method1302(byte arg0) {
        field3310 = null;
        field3306 = null;
        int var1 = 65 % ((arg0 - 41) / 55);
        field3318 = null;
        field3308 = null;
        field3307 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)Lgl;")
    public final class338 method1303(int arg0) {
        field3319++;
        this.field3304 = arg0;
        return this.method1304((byte) -111);
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Luc;)V")
    public class243(class58 arg0) {
        this.field3309 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)Lgl;")
    public final class338 method1304(byte arg0) {
        field3315++;
        if (this.field3304 > 0 && this.field3309.field604[this.field3304 - 1] != this.field3316) {
            class338 var2 = this.field3316;
            this.field3316 = var2.field4505;
            return var2;
        }
        if (arg0 >= -108) {
            field3317 = -43;
        }
        while (this.field3309.field591 > this.field3304) {
            class338 var3 = this.field3309.field604[this.field3304++].field4505;
            if (this.field3309.field604[this.field3304 - 1] != var3) {
                this.field3316 = var3.field4505;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lam;IIZ)Ljp;")
    public static final class402 method1305(class286 arg0, int arg1, int arg2, boolean arg3) {
        field3312++;
        byte[] var4 = arg0.method1687(arg1, arg2, 255);
        if (!arg3) {
            field3306 = null;
        }
        return var4 == null ? null : new class402(var4);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IJ)V")
    public static final void method1306(int arg0, long arg1) {
        field3311++;
        int var3 = class183.field2335 + class427.field6264.field152;
        int var4 = class161.field2066 + class427.field6264.field154;
        if (class449.field6526 - var3 < -500 || class449.field6526 - var3 > 500 || class275.field3706 - var4 < -500 || (class275.field3706 - var4) > 500) {
            class449.field6526 = var3;
            class275.field3706 = var4;
        }
        if (arg0 != 1) {
            method1306(-46, -123L);
        }
        if (class449.field6526 != var3) {
            int var5 = var3 - class449.field6526;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class449.field6526 += var6;
        }
        if (class275.field3706 != var4) {
            int var7 = var4 - class275.field3706;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class275.field3706 += var8;
        }
        if (!class165.field2104) {
            class41.field432 += (float) arg1 * class125.field1604 / 6.0F;
            class425.field6241 += (float) arg1 * class335.field4460 / 6.0F;
        }
        class203.method1103(0);
    }
}

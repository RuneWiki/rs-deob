import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class15 extends class176 {

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "I")
    private int field278 = -1;

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
    private int field279 = 0;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "Lob;")
    public static class141 field266 = class175.method1195(40, "<col=40ff00>");

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "Lob;")
    public static class141 field269 = class175.method1195(40, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
    public static int field273 = -1;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
    public static int field271 = 0;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "Lob;")
    public static class141 field270 = class175.method1195(40, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "Lob;")
    public static class141 field280 = class175.method1195(40, ")1 ");

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
    public static int field283 = 0;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "I")
    public int field276;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public int field281;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    public int field282;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "[I")
    public static int[] field272;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLog;I)V")
    public final void method93(byte arg0, class146 arg1, int arg2) {
        field267++;
        while (true) {
            int var4 = arg1.method991(255);
            if (var4 == 0) {
                if (arg0 == -14) {
                    return;
                } else {
                    field280 = null;
                    return;
                }
            }
            this.method96(var4, arg2, (byte) -117, arg1);
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)I")
    public static int method94(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
    public static final void method95(int arg0) {
        class224.method1439(-101);
        if (arg0 <= 106) {
            method98((byte) -88);
        }
        field277++;
        class90.method616((byte) 74);
        class160.method1120(0);
        class184.method1233(-976);
        class143.method943((byte) 57);
        class7.method48((byte) 50);
        class87.method594(-18802);
        class154.method1055((byte) -117);
        class106.method705((byte) -86);
        class192.method1266((byte) 89);
        class139.method894(false);
        class181.method1225(-127);
        ((class160) class44.field857).method1117(-100);
        class29.field558.method1385(9946);
        class24.field452.method1076(-3628);
        class177.field3501.method1076(-3628);
        class5.field65.method1076(-3628);
        class79.field1612.method1076(-3628);
        class125.field2414.method1076(-3628);
        class159.field3067.method1076(-3628);
        class160.field3118.method1076(-3628);
        class109.field2108.method1076(-3628);
        class59.field1146.method1076(-3628);
        class164.field3174.method1076(-3628);
        class96.field1913.method1076(-3628);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIBLog;)V")
    private final void method96(int arg0, int arg1, byte arg2, class146 arg3) {
        field274++;
        if (arg0 == 1) {
            this.field279 = arg3.method1012(-124);
            this.method99(this.field279, (byte) -9);
        } else if (arg0 == 2) {
            this.field278 = arg3.method1007(97);
            if (this.field278 == 65535) {
                this.field278 = -1;
            }
        } else if (arg0 == 3) {
            arg3.method1007(111);
        }
        if (arg2 >= -111) {
            this.field279 = -57;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)Z")
    public static final boolean method97(int arg0, int arg1, int arg2) {
        int var3 = class141.field2734[arg0][arg1][arg2];
        if (-class209.field3942 == var3) {
            return false;
        } else if (class209.field3942 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class214.method1399(var4 + 1, class110.field2119[arg0][arg1][arg2], var5 + 1) && class214.method1399(var4 + 128 - 1, class110.field2119[arg0][arg1 + 1][arg2], var5 + 1) && class214.method1399(var4 + 128 - 1, class110.field2119[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class214.method1399(var4 + 1, class110.field2119[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class141.field2734[arg0][arg1][arg2] = class209.field3942;
                return true;
            } else {
                class141.field2734[arg0][arg1][arg2] = -class209.field3942;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
    public static void method98(byte arg0) {
        field272 = null;
        field266 = null;
        field280 = null;
        if (arg0 != 30) {
            field280 = null;
        }
        field269 = null;
        field270 = null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(IB)V")
    private final void method99(int arg0, byte arg1) {
        field268++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var3 < var5) {
            var9 = var5;
        }
        if (var7 > var9) {
            var9 = var7;
        }
        if (var3 > var5) {
            var11 = var5;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var11 > var7) {
            var11 = var7;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var9 - var11) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var11) / (2.0D - var9 - var11);
            }
            if (var3 == var9) {
                var13 = (var5 - var7) / (-var11 + var9);
            } else if (var5 == var9) {
                var13 = (var7 - var3) / (-var11 + var9) + 2.0D;
            } else if (var7 == var9) {
                var13 = (var3 - var5) / (var9 - var11) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        if (var17 > 0.5D) {
            this.field276 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field276 = (int) (var15 * var17 * 512.0D);
        }
        this.field281 = (int) (var15 * 256.0D);
        if (arg1 != -9) {
            method98((byte) -25);
        }
        if (this.field281 < 0) {
            this.field281 = 0;
        } else if (this.field281 > 255) {
            this.field281 = 255;
        }
        if (this.field276 < 1) {
            this.field276 = 1;
        }
        this.field282 = (int) (var17 * 256.0D);
        if (this.field282 < 0) {
            this.field282 = 0;
        } else if (this.field282 > 255) {
            this.field282 = 255;
        }
        this.field275 = (int) ((double) this.field276 * var19);
    }
}

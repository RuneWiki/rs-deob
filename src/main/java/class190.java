import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class190 {

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2832 = new CRC32();

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
    public static int field2836 = 0;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public int field2831;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "[Laf;")
    public class437[] field2829;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lga;ILhg;I)V")
    public static final void method1366(class404 arg0, int arg1, class691 arg2, int arg3) {
        field2835++;
        if (class649.field8920 >= 50 || arg2 == null || arg2.field9354 == null || arg1 >= arg2.field9354.length || arg2.field9354[arg1] == null) {
            return;
        }
        int var4 = arg2.field9354[arg1][0];
        int var5 = var4 >> 8;
        int var6 = (var4 & 0xF1) >> 5;
        if (arg3 > -13) {
            field2836 = 0;
        }
        if (arg2.field9354[arg1].length > 1) {
            int var7 = (int) ((double) arg2.field9354[arg1].length * Math.random());
            if (var7 > 0) {
                var5 = arg2.field9354[arg1][var7];
            }
        }
        int var8 = var4 & 0x1F;
        int var9 = 256;
        if (arg2.field9326 != null && arg2.field9355 != null) {
            var9 = (int) (Math.random() * (double) (arg2.field9355[arg1] - arg2.field9326[arg1])) + arg2.field9326[arg1];
        }
        int var10 = arg2.field9343 == null ? 255 : arg2.field9343[arg1];
        if (var8 == 0) {
            if (class58.field1147 == arg0) {
                if (!arg2.field9358) {
                    class717.method3991(true, var10, var5, var6, 0, var9);
                    return;
                }
                class550.method3171(var6, var9, false, (byte) -35, var10, 0, var5);
            }
        } else if (class693.field9368.field4431.method820(-32350) != 0) {
            int var11 = arg0.field5922 - 256 >> 9;
            int var12 = arg0.field5933 - 256 >> 9;
            int var13 = class58.field1147 == arg0 ? 0 : (arg0.field5926 << 24) + (var11 << 16) + (var12 << 8) + var8;
            class429.field6148[class649.field8920++] = new class456((byte) (arg2.field9358 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg0);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method1367(String arg0, byte arg1) {
        field2830++;
        int var2 = arg0.length();
        long var3 = 0L;
        if (arg1 <= 98) {
            method1372((char) 65517, -66);
        }
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg0.charAt(var5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    public static void method1368(byte arg0) {
        field2832 = null;
        if (arg0 > -70) {
            field2836 = 92;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(JIIIILat;IILaa;)V")
    public static final void method1369(long arg0, int arg1, int arg2, int arg3, int arg4, class378 arg5, int arg6, int arg7, class487 arg8) {
        field2827++;
        int var10 = arg3 * arg3 + arg6 * arg6;
        if (((long) var10) > arg0) {
            return;
        }
        if (arg2 > -49) {
            method1366(null, -119, null, 58);
        }
        int var11 = Math.min(arg5.field5385 / 2, arg5.field5465 / 2);
        if (var10 <= var11 * var11) {
            class256.method1739(arg1, class241.field3523[arg7], arg4, arg5, arg8, arg3, 2, arg6);
            return;
        }
        var11 -= 10;
        int var12;
        if (class438.field6252 == 4) {
            var12 = (int) class451.field6366 & 0x3FFF;
        } else {
            var12 = (int) class451.field6366 + class28.field748 & 0x3FFF;
        }
        int var13 = class255.field3698[var12];
        int var14 = class255.field3695[var12];
        if (class438.field6252 != 4) {
            var14 = var14 * 256 / (class548.field7552 + 256);
            var13 = var13 * 256 / (class548.field7552 + 256);
        }
        int var15 = arg3 * var13 + arg6 * var14 >> 14;
        int var16 = arg3 * var14 - (arg6 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class455.field6416[arg7].method2930((float) arg5.field5385 / 2.0F + (float) arg4 + (float) var19, (float) arg5.field5465 / 2.0F + (float) arg1 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZLad;Lcea;)Laf;")
    private final class437 method1370(boolean arg0, class426 arg1, class215 arg2) {
        field2833++;
        if (class293.field4105 == arg1) {
            return class96.method901((byte) 64, arg2);
        } else if (class215.field3087 == arg1) {
            return class232.method1617(743571200, arg2);
        } else if (class515.field7183 == arg1) {
            return class181.method1331(arg2, (byte) -112);
        } else if (class133.field2238 == arg1) {
            return class716.method3988((byte) 26, arg2);
        } else {
            if (!arg0) {
                method1368((byte) -104);
            }
            if (class438.field6244 == arg1) {
                return class427.method2609(arg2, 86);
            } else if (class464.field6513 == arg1) {
                return class600.method3412(16533, arg2);
            } else if (class681.field9229 == arg1) {
                return class410.method2542(0, arg2);
            } else if (class558.field7732 == arg1) {
                return class29.method403(-27794, arg2);
            } else if (class406.field5948 == arg1) {
                return class222.method1575(arg2, true);
            } else if (class186.field2801 == arg1) {
                return class115.method1016(-1730, arg2);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lcea;I)V")
    public final void method1371(class215 arg0, int arg1) {
        this.field2831 = arg0.method1499(-1);
        field2834++;
        this.field2828 = arg0.method1478(842397944);
        this.field2829 = new class437[arg0.method1535(arg1 ^ 0x557D)];
        class426[] var3 = class207.method1430(-99);
        int var4 = 0;
        if (arg1 != 21890) {
            method1368((byte) 25);
        }
        while (this.field2829.length > var4) {
            this.field2829[var4] = this.method1370(true, var3[arg0.method1535(class710.method3948(arg1, 21885))], arg0);
            var4++;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(CI)C")
    public static final char method1372(char arg0, int arg1) {
        field2826++;
        if (arg1 != -10072) {
            field2836 = -123;
        }
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }
}

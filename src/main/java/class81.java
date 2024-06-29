import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class class81 extends class43 {

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public int field1256;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public int field1251;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public int field1259;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public int field1254;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public int field1261;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1252 = "Loading defaults - ";

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "Lod;")
    public static class293 field1249;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)Z", line = 6)
    public final boolean method137(int arg0) {
        field1248++;
        if (arg0 != 0) {
            method578((byte) 14);
        }
        return false;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V", line = 18)
    public final void method135(byte arg0) {
        field1257++;
        if (arg0 == -123) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZC)B", line = 30)
    public static final byte method576(boolean arg0, char arg1) {
        field1258++;
        if (arg0) {
            field1252 = null;
        }
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)V", line = 162)
    public static final void method577(int arg0, int arg1) {
        field1250++;
        if (arg0 > -108) {
            method576(true, '@');
        }
        class399 var2 = class269.method1655(1, arg1, -57);
        var2.method2582(0);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZIILaa;ILqh;)V", line = 177)
    public final void method129(int arg0, boolean arg1, int arg2, int arg3, class281 arg4, int arg5, class43 arg6) {
        if (arg0 == 0) {
            field1247++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(B)V", line = 189)
    public static void method578(byte arg0) {
        int var1 = -51 / ((arg0 + 54) / 48);
        field1249 = null;
        field1252 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BIII)Lvf;", line = 205)
    public static final class84 method580(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 89) {
            method576(false, (char) 65413);
        }
        field1260++;
        int var4 = arg1 << 8 | arg3;
        class84 var5 = (class84) class7.field110.method567((byte) 95, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class146.field2121.method1904(class146.field2121.method1887(var4, -17277), 255);
        if (var6 == null) {
            int var8 = arg3 | arg2 + 65536 << 8;
            class84 var9 = (class84) class7.field110.method567((byte) 82, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class146.field2121.method1904(class146.field2121.method1887(var8, -17277), 255);
            if (var10 == null) {
                int var12 = arg3 | 0xFFFF00;
                class84 var13 = (class84) class7.field110.method567((byte) 87, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class146.field2121.method1904(class146.field2121.method1887(var12, -17277), 255);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class84 var15 = class270.method1662(var14, (byte) -108);
                    var15.field1298 = arg3;
                    class7.field110.method565(-1, var15, (long) var12 << 16);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class84 var11 = class270.method1662(var10, (byte) -108);
                var11.field1298 = arg3;
                class7.field110.method565(-1, var11, (long) var8 << 16);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class84 var7 = class270.method1662(var6, (byte) -108);
            var7.field1298 = arg3;
            class7.field110.method565(-1, var7, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(IIIIIII)V", line = 273)
    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1256 = arg2;
        this.field1251 = arg0;
        this.field1259 = arg1;
        this.field1254 = arg4;
        this.field1255 = arg6;
        this.field1261 = arg3;
        this.field1253 = arg5;
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(B)I")
    public abstract int method579(byte arg0);
}

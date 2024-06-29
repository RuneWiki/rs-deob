import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class191 {

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    private int field2654 = 0;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Lbr;")
    private class223 field2657;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2659 = "Loading textures - ";

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "Lmh;")
    private class376 field2663;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "[I")
    public static int[] field2656;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 8)
    public static final byte[] method1262(String arg0, byte arg1) {
        field2655++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        if (arg1 != -108) {
            method1266(27);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IJ)V", line = 146)
    public static final void method1263(int arg0, long arg1) {
        field2661++;
        if (class5.field79 != null) {
            if (class123.field1731 == 1 || class123.field1731 == 5) {
                class324.method2043(arg1, (byte) 32);
            } else if (class123.field1731 == 4) {
                class10.method66((byte) 74, arg1);
            }
        }
        class208.method1356(class408.field5920, (long) class35.field541, (byte) -100);
        if (class230.field3089 != -1) {
            class21.method144(class230.field3089, (byte) 122);
        }
        for (int var3 = 0; var3 < class75.field1161; var3++) {
            if (class259.field3553[var3]) {
                class296.field4100[var3] = true;
            }
            class257.field3512[var3] = class259.field3553[var3];
            class259.field3553[var3] = false;
        }
        class217.field2874 = class35.field541;
        if (class408.field5920.method1790()) {
            class237.field3230 = true;
        }
        class286.field3947 = null;
        if (class230.field3089 != -1) {
            class75.field1161 = 0;
            class181.method1201(31383);
        }
        class408.field5920.method1812();
        class120.method817(class408.field5920, (byte) -29);
        int var4 = class437.method2735(18117);
        if (~var4 == arg0) {
            var4 = class89.field1363;
        }
        class179.method1190(var4, arg0 + 3163);
        class24.method165(class307.field4211.field6192, (byte) 33, class63.field980, class307.field4211.field6197, class265.field3617);
        class63.field980 = 0;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lbr;)V", line = 338)
    public class191(class223 arg0) {
        this.field2657 = arg0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)Lmh;", line = 209)
    public final class376 method1264(byte arg0) {
        field2662++;
        this.field2654 = 0;
        return arg0 == -56 ? this.method1265(-1) : null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)Lmh;", line = 222)
    public final class376 method1265(int arg0) {
        field2664++;
        if (~this.field2654 < arg0 && this.field2657.field2992[this.field2654 - 1] != this.field2663) {
            class376 var2 = this.field2663;
            this.field2663 = var2.field5365;
            return var2;
        }
        while (this.field2654 < this.field2657.field2994) {
            class376 var3 = this.field2657.field2992[this.field2654++].field5365;
            if (this.field2657.field2992[this.field2654 - 1] != var3) {
                this.field2663 = var3.field5365;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 251)
    public static void method1266(int arg0) {
        if (arg0 != 8224) {
            method1268(87L, -51, 110, 42);
        }
        field2656 = null;
        field2659 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V", line = 269)
    public static final void method1267(int arg0, int arg1) {
        if (arg0 >= 16) {
            class229.field3057 = arg1;
            field2658++;
            class20.field259.method1249(1);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(JIII)V", line = 281)
    public static final void method1268(long arg0, int arg1, int arg2, int arg3) {
        int var5 = -90 % ((arg3 + 9) / 36);
        field2660++;
        int var6 = (int) arg0 >> 14 & 0x1F;
        int var7 = ((int) arg0 & 0x342210) >> 20;
        int var8 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (var6 != 10 && var6 != 11 && var6 != 22) {
            class386.method2522(class307.field4211.field944[0], var7, true, 0, var6, (byte) -23, class307.field4211.field956[0], 0, 0, arg1, arg2);
            return;
        }
        class369 var9 = class310.method1961(var8, (byte) 35);
        int var10;
        int var11;
        if (var7 == 0 || var7 == 2) {
            var11 = var9.field5215;
            var10 = var9.field5200;
        } else {
            var10 = var9.field5215;
            var11 = var9.field5200;
        }
        int var12 = var9.field5232;
        if (var7 != 0) {
            var12 = (var12 << var7 & 0xF) + (var12 >> 4 - var7);
        }
        class386.method2522(class307.field4211.field944[0], 0, true, var11, 0, (byte) 92, class307.field4211.field956[0], var12, var10, arg1, arg2);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([BII)I", line = 327)
    public static final int method1269(byte[] arg0, int arg1, int arg2) {
        field2653++;
        if (arg1 != 376) {
            field2656 = null;
        }
        return class287.method1855(arg2, 0, 40, arg0);
    }
}

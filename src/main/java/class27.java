import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class27 extends class219 {

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    private int field450 = -1;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "[[B")
    public static byte[][] field451 = new byte[1000][];

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "Z")
    public static boolean field458 = true;

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "Lqb;")
    public static class209 field459 = new class209(500);

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
    public int field452;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "client!kj", name = "X", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!kj", name = "Y", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!kj", name = "cb", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!kj", name = "bb", descriptor = "J")
    public static long field465;

    @OriginalMember(owner = "client!kj", name = "ab", descriptor = "Lhb;")
    public static class280 field464;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "[I")
    public int[] field448;

    @OriginalMember(owner = "client!kj", name = "Z", descriptor = "[Ldc;")
    public static class71[] field463;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V", line = 4)
    public static void method213(int arg0) {
        field459 = null;
        field463 = null;
        if (arg0 >= -118) {
            method220(47);
        }
        field464 = null;
        field451 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIII)V", line = 21)
    public static final void method214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field449++;
        int var6 = class19.method172(class303.field5106, arg5, class298.field4989, false);
        if (arg4 != -20008) {
            method217((class28) null, (byte) 12);
        }
        int var7 = class19.method172(class303.field5106, arg1, class298.field4989, false);
        int var8 = class19.method172(class112.field2028, arg2, class82.field1426, false);
        int var9 = class19.method172(class112.field2028, arg3, class82.field1426, false);
        for (int var10 = var6; var10 <= var7; var10++) {
            class3.method14(arg0, var8, var9, class184.field3180[var10], -100);
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V", line = 49)
    public class27() {
        super(0, false);
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(B)I", line = 62)
    public final int method215(byte arg0) {
        field466++;
        if (arg0 > -120) {
            method218(-111, (class143) null, (byte) 99);
        }
        return this.field450;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 75)
    public final void method216(int arg0) {
        field453++;
        super.method216(-66);
        if (arg0 > -12) {
            method214(-7, -36, 112, 70, -23, -54);
        }
        this.field448 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILb;)V", line = 96)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg0 == 0) {
            this.field450 = arg2.method761((byte) 108);
        }
        if (arg1 == 0) {
            field456++;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lib;B)V", line = 114)
    public static final void method217(class28 arg0, byte arg1) {
        if (arg1 <= 55) {
            field457 = 112;
        }
        field461++;
        class197 var2 = null;
        try {
            class166 var3 = arg0.method229("runescape", -120);
            while (var3.field2934 == 0) {
                class177.method1342(1L, 1);
            }
            if (var3.field2934 == 1) {
                var2 = (class197) var3.field2933;
                class94 var4 = class82.method630(116);
                var2.method1474(0, -85, var4.field1653, var4.field1681);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1476((byte) 124);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILda;B)Lha;", line = 155)
    public static final class303 method218(int arg0, class143 arg1, byte arg2) {
        if (arg2 <= 94) {
            return (class303) null;
        } else {
            byte[] var3 = arg1.method1137((byte) -103, arg0);
            field447++;
            return var3 == null ? null : new class303(var3);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)[[I", line = 180)
    public int[][] method219(int arg0, byte arg1) {
        if (arg1 != 83) {
            this.field448 = (int[]) null;
        }
        int[][] var3 = this.field3651.method406(false, arg0);
        if (this.field3651.field917 && this.method221((byte) 35)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = this.field452 * (class47.field749 == this.field460 ? arg0 : this.field460 * arg0 / class47.field749);
            if (class128.field2326 == this.field452) {
                for (int var11 = 0; var11 < class128.field2326; var11++) {
                    int var12 = this.field448[var7++];
                    var5[var11] = class92.method695(4080, var12 << 4);
                    var6[var11] = class92.method695(4080, var12 >> 4);
                    var4[var11] = class92.method695(4080, var12 >> 12);
                }
            } else {
                for (int var8 = 0; var8 < class128.field2326; var8++) {
                    int var9 = this.field452 * var8 / class128.field2326;
                    int var10 = this.field448[var7 + var9];
                    var5[var8] = class92.method695(255, var10) << 4;
                    var6[var8] = class92.method695(65280, var10) >> 4;
                    var4[var8] = class92.method695(var10 >> 12, 4080);
                }
            }
        }
        field454++;
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)Z", line = 252)
    public static final boolean method220(int arg0) {
        field455++;
        class247 var1 = class237.field3946;
        synchronized (class237.field3946) {
            if (class17.field286 == class139.field2477) {
                return false;
            } else if (arg0 == 25039) {
                class261.field4351 = class30.field503[class139.field2477];
                class308.field5174 = class83.field1464[class139.field2477];
                class139.field2477 = class139.field2477 + 1 & 0x7F;
                return true;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(B)Z", line = 272)
    public final boolean method221(byte arg0) {
        field462++;
        if (this.field448 != null) {
            return true;
        } else if (this.field450 < 0) {
            int var2 = -13 / ((-arg0 - 33) / 58);
            return false;
        } else {
            class79 var3 = class274.method1858(class301.field5012, (byte) -125, this.field450);
            var3.method612();
            this.field452 = var3.field1131;
            this.field448 = var3.field1384;
            this.field460 = var3.field1135;
            return true;
        }
    }
}

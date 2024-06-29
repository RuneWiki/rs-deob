import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class116 extends class73 {

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "[B")
    public static byte[] field2825 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public static int field2832 = 0;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field2824 = 0;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "Lrd;")
    public static class117 field2831 = class95.method812("huffman", (byte) 8);

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "[I")
    public static int[] field2835 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    public static int field2837 = 0;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field2834 = 0;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    public static int field2839 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "Lce;")
    public static class20 field2830;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "Ll;")
    public static class76 field2829;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "[[I")
    public static int[][] field2836;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
    public static void method933(int arg0) {
        field2825 = null;
        if (arg0 != 6628) {
            field2830 = null;
        }
        field2831 = null;
        field2829 = null;
        field2836 = null;
        field2835 = null;
        field2830 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLwa;)Lrd;")
    public static final class117 method934(byte arg0, class144 arg1) {
        field2826++;
        int var2 = -46 % ((arg0 - 1) / 58);
        if (class53.method583(20, class97.method827((byte) 111, arg1)) == 0) {
            return null;
        } else if (arg1.field3525 == null || arg1.field3525.method976(120).method954(-101) == 0) {
            return class73.field2037 ? class6.field144 : null;
        } else {
            return arg1.field3525;
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class116() {
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(I)V")
    public class116(int arg0) {
        this.field2828 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)I")
    public static final int method935(byte arg0) {
        field2838++;
        if (arg0 != 119) {
            method933(17);
        }
        int var1 = 3;
        if (class39.field1131 < 310) {
            int var2 = class45.field1271 >> 7;
            int var3 = class4.field105 >> 7;
            int var4 = class144.field3516.field717 >> 7;
            if ((class124.field3002[class120.field2940][var2][var3] & 0x4) != 0) {
                var1 = class120.field2940;
            }
            int var5;
            if (var4 > var2) {
                var5 = var4 - var2;
            } else {
                var5 = var2 - var4;
            }
            int var6 = class144.field3516.field751 >> 7;
            int var7;
            if (var3 >= var6) {
                var7 = var3 - var6;
            } else {
                var7 = var6 - var3;
            }
            if (var5 <= var7) {
                int var8 = 32768;
                int var9 = var5 * 65536 / var7;
                while (var3 != var6) {
                    if (var6 > var3) {
                        var3++;
                    } else if (var6 < var3) {
                        var3--;
                    }
                    if ((class124.field3002[class120.field2940][var2][var3] & 0x4) != 0) {
                        var1 = class120.field2940;
                    }
                    var8 += var9;
                    if (var8 >= 65536) {
                        if (var2 < var4) {
                            var2++;
                        } else if (var4 < var2) {
                            var2--;
                        }
                        var8 -= 65536;
                        if ((class124.field3002[class120.field2940][var2][var3] & 0x4) != 0) {
                            var1 = class120.field2940;
                        }
                    }
                }
            } else {
                int var10 = var7 * 65536 / var5;
                int var11 = 32768;
                while (var2 != var4) {
                    var11 += var10;
                    if (var2 < var4) {
                        var2++;
                    } else if (var4 < var2) {
                        var2--;
                    }
                    if ((class124.field3002[class120.field2940][var2][var3] & 0x4) != 0) {
                        var1 = class120.field2940;
                    }
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var6 > var3) {
                            var3++;
                        } else if (var6 < var3) {
                            var3--;
                        }
                        if ((class124.field3002[class120.field2940][var2][var3] & 0x4) != 0) {
                            var1 = class120.field2940;
                        }
                    }
                }
            }
        }
        if ((class124.field3002[class120.field2940][class144.field3516.field717 >> 7][class144.field3516.field751 >> 7] & 0x4) != 0) {
            var1 = class120.field2940;
        }
        return var1;
    }
}

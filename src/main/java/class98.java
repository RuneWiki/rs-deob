import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class98 {

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Lkc;")
    public static class67 field2214 = class19.method144("redstone3", 124);

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Lkc;")
    private static class67 field2211 = class19.method144("Enter name of friend to delete from list", 110);

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "[I")
    public static int[] field2215 = new int[50];

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field2218 = -1;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Lkc;")
    public static class67 field2212 = field2211;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Lkc;")
    public static class67 field2217 = class19.method144("Menge eingeben:", 88);

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lpc;")
    public static class97 field2213;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "[I")
    public static int[] field2210;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 4)
    public static void method758(int arg0) {
        if (arg0 >= -43) {
            return;
        }
        field2215 = null;
        field2211 = null;
        field2210 = null;
        field2212 = null;
        field2217 = null;
        field2213 = null;
        field2214 = null;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)I", line = 76)
    public static final int method759(int arg0) {
        field2219++;
        int var1 = 3;
        if (class116.field2737 < 310) {
            int var2 = class69.field1640.field1260 >> 7;
            int var3 = class74.field1776 >> 7;
            int var4 = class69.field1640.field1190 >> 7;
            int var5;
            if (var3 < var4) {
                var5 = var4 - var3;
            } else {
                var5 = var3 - var4;
            }
            int var6 = class127.field2980 >> 7;
            if ((class21.field443[class112.field2593][var6][var3] & 0x4) != 0) {
                var1 = class112.field2593;
            }
            int var7;
            if (var6 < var2) {
                var7 = var2 - var6;
            } else {
                var7 = var6 - var2;
            }
            if (var5 < var7) {
                int var8 = var5 * 65536 / var7;
                int var9 = 32768;
                while (var2 != var6) {
                    var9 += var8;
                    if (var2 > var6) {
                        var6++;
                    } else if (var2 < var6) {
                        var6--;
                    }
                    if ((class21.field443[class112.field2593][var6][var3] & 0x4) != 0) {
                        var1 = class112.field2593;
                    }
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var3 < var4) {
                            var3++;
                        } else if (var4 < var3) {
                            var3--;
                        }
                        if ((class21.field443[class112.field2593][var6][var3] & 0x4) != 0) {
                            var1 = class112.field2593;
                        }
                    }
                }
            } else {
                int var10 = var7 * 65536 / var5;
                int var11 = 32768;
                while (var3 != var4) {
                    var11 += var10;
                    if (var3 < var4) {
                        var3++;
                    } else if (var4 < var3) {
                        var3--;
                    }
                    if ((class21.field443[class112.field2593][var6][var3] & 0x4) != 0) {
                        var1 = class112.field2593;
                    }
                    if (var11 >= 65536) {
                        if (var2 > var6) {
                            var6++;
                        } else if (var6 > var2) {
                            var6--;
                        }
                        if ((class21.field443[class112.field2593][var6][var3] & 0x4) != 0) {
                            var1 = class112.field2593;
                        }
                        var11 -= 65536;
                    }
                }
            }
        }
        if ((class21.field443[class112.field2593][class69.field1640.field1260 >> arg0][class69.field1640.field1190 >> 7] & 0x4) != 0) {
            var1 = class112.field2593;
        }
        return var1;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class39 extends class106 {

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
    public static int field800 = 0;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "[[B")
    public static byte[][] field801 = new byte[50][];

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
    public static int field797 = 0;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "Lrf;")
    public static class163 field804 = class53.method392(-50, "m");

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "Lrf;")
    private static class163 field811 = class53.method392(117, "Please reload this page)3");

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "Lrf;")
    public static class163 field802 = field811;

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "Lrf;")
    private static class163 field812 = class53.method392(-113, " has logged in)3");

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "Lrf;")
    public static class163 field798 = field812;

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "B")
    public byte field808;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "Lue;")
    public class189 field807;

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "[I")
    public static int[] field809;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILig;B)V")
    public static final void method244(int arg0, int arg1, class84 arg2, byte arg3) {
        field806++;
        if (class118.field2492 != null || class32.field638 || (arg2 == null || class36.method226(arg2, arg3 - 111) == null)) {
            return;
        }
        class118.field2492 = arg2;
        class129.field2692 = class36.method226(arg2, -85);
        class27.field490 = false;
        if (arg3 != 9) {
            field797 = 12;
        }
        class209.field4072 = 0;
        class162.field3291 = arg0;
        class133.field2769 = arg1;
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(B)V")
    public static final void method245(byte arg0) {
        field805++;
        if (class92.field2004 != null) {
            class92.field2004.method694((byte) -59);
            class92.field2004 = null;
        }
        class114.method783(-84);
        class7.method62();
        if (arg0 < 95) {
            method245((byte) -67);
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class103.field2163[var1].method871((byte) 88);
        }
        System.gc();
        class9.method72(2, -1);
        class103.field2165 = -1;
        class107.field2234 = false;
        class152.method979(-29);
        class84.method589(10, -26);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(III)V")
    public static final void method246(int arg0, int arg1, int arg2) {
        class111 var3 = class97.field2054[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field2346 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lrf;Lrf;Lu;IZII)V")
    public static final void method247(class163 arg0, class163 arg1, class184 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var7 = arg2.method1228(94, arg0);
        field803++;
        if (arg5 != -15619) {
            field802 = null;
        }
        int var8 = arg2.method1231(arg1, var7, 2);
        class37.method236(arg4, var8, arg2, false, arg6, var7, arg3);
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(B)I")
    public static final int method248(byte arg0) {
        if (arg0 != -11) {
            field797 = -90;
        }
        int var1 = 3;
        field799++;
        if (class44.field894 < 310) {
            int var2 = class86.field1882 >> 7;
            int var3 = class56.field1136.field716 >> 7;
            int var4 = class90.field1939 >> 7;
            int var5 = class56.field1136.field679 >> 7;
            if ((class21.field372[class60.field1227][var2][var4] & 0x4) != 0) {
                var1 = class60.field1227;
            }
            int var6;
            if (var2 >= var3) {
                var6 = var2 - var3;
            } else {
                var6 = var3 - var2;
            }
            int var7;
            if (var4 >= var5) {
                var7 = var4 - var5;
            } else {
                var7 = var5 - var4;
            }
            if (var7 >= var6) {
                int var8 = var6 * 65536 / var7;
                int var9 = 32768;
                while (var4 != var5) {
                    var9 += var8;
                    if (var5 > var4) {
                        var4++;
                    } else if (var5 < var4) {
                        var4--;
                    }
                    if ((class21.field372[class60.field1227][var2][var4] & 0x4) != 0) {
                        var1 = class60.field1227;
                    }
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var2 < var3) {
                            var2++;
                        } else if (var3 < var2) {
                            var2--;
                        }
                        if ((class21.field372[class60.field1227][var2][var4] & 0x4) != 0) {
                            var1 = class60.field1227;
                        }
                    }
                }
            } else {
                int var10 = var7 * 65536 / var6;
                int var11 = 32768;
                while (var2 != var3) {
                    if (var3 > var2) {
                        var2++;
                    } else if (var2 > var3) {
                        var2--;
                    }
                    if ((class21.field372[class60.field1227][var2][var4] & 0x4) != 0) {
                        var1 = class60.field1227;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var5 > var4) {
                            var4++;
                        } else if (var5 < var4) {
                            var4--;
                        }
                        if ((class21.field372[class60.field1227][var2][var4] & 0x4) != 0) {
                            var1 = class60.field1227;
                        }
                    }
                }
            }
        }
        if ((class21.field372[class60.field1227][class56.field1136.field716 >> 7][class56.field1136.field679 >> 7] & 0x4) != 0) {
            var1 = class60.field1227;
        }
        return var1;
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)V")
    public static void method249(int arg0) {
        field809 = null;
        field801 = null;
        field812 = null;
        field804 = null;
        field798 = null;
        field811 = null;
        if (arg0 != 4) {
            method246(33, 12, -78);
        }
        field802 = null;
    }
}

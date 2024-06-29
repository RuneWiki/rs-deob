import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class96 {

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "Lda;")
    public static class275 field1637 = class255.method1672(107, "_");

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field1632 = 100;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "[I")
    public static int[] field1635 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Lda;")
    public static class275 field1639 = class255.method1672(123, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field1640 = 0;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Lma;")
    public static class105 field1634;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Lma;")
    public static class105 field1636;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "Lma;")
    public static class105 field1638;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLdj;)V")
    public static final void method685(byte arg0, class104 arg1) {
        int var2 = -119 % ((35 - arg0) / 58);
        arg1.field1771 = false;
        if (arg1.field1788 != -1) {
            class215 var3 = class201.method1321(128, arg1.field1788);
            if (var3 == null || var3.field3688 == null) {
                arg1.field1788 = -1;
            } else {
                arg1.field1743++;
                if (arg1.field1746 < var3.field3688.length && arg1.field1743 > var3.field3667[arg1.field1746]) {
                    arg1.field1746++;
                    arg1.field1743 = 1;
                    class12.method54(-1797326908, class66.field1094 == arg1, arg1.field1758, arg1.field1770, arg1.field1746, var3);
                }
                if (arg1.field1746 >= var3.field3688.length) {
                    arg1.field1743 = 0;
                    arg1.field1746 = 0;
                    class12.method54(-1797326908, class66.field1094 == arg1, arg1.field1758, arg1.field1770, arg1.field1746, var3);
                }
            }
        }
        if (arg1.field1724 != -1 && class35.field576 >= arg1.field1723) {
            int var4 = class188.method1246(arg1.field1724, 6).field1194;
            if (var4 == -1) {
                arg1.field1724 = -1;
            } else {
                class215 var5 = class201.method1321(128, var4);
                if (var5 == null || var5.field3688 == null) {
                    arg1.field1724 = -1;
                } else {
                    if (arg1.field1777 < 0) {
                        arg1.field1777 = 0;
                        class12.method54(-1797326908, class66.field1094 == arg1, arg1.field1758, arg1.field1770, 0, var5);
                    }
                    arg1.field1726++;
                    if (var5.field3688.length > arg1.field1777 && var5.field3667[arg1.field1777] < arg1.field1726) {
                        arg1.field1726 = 1;
                        arg1.field1777++;
                        class12.method54(-1797326908, class66.field1094 == arg1, arg1.field1758, arg1.field1770, arg1.field1777, var5);
                    }
                    if (arg1.field1777 >= var5.field3688.length) {
                        arg1.field1724 = -1;
                    }
                }
            }
        }
        field1631++;
        if (arg1.field1776 != -1 && arg1.field1749 <= 1) {
            class215 var6 = class201.method1321(128, arg1.field1776);
            if (var6.field3663 == 1 && arg1.field1781 > 0 && class35.field576 >= arg1.field1779 && arg1.field1737 < class35.field576) {
                arg1.field1749 = 1;
                return;
            }
        }
        if (arg1.field1776 != -1 && arg1.field1749 == 0) {
            class215 var7 = class201.method1321(128, arg1.field1776);
            if (var7 == null || var7.field3688 == null) {
                arg1.field1776 = -1;
            } else {
                arg1.field1780++;
                if (arg1.field1740 < var7.field3688.length && var7.field3667[arg1.field1740] < arg1.field1780) {
                    arg1.field1780 = 1;
                    arg1.field1740++;
                    class12.method54(-1797326908, class66.field1094 == arg1, arg1.field1758, arg1.field1770, arg1.field1740, var7);
                }
                if (arg1.field1740 >= var7.field3688.length) {
                    arg1.field1744++;
                    arg1.field1740 -= var7.field3664;
                    if (arg1.field1744 >= var7.field3672) {
                        arg1.field1776 = -1;
                    } else if (arg1.field1740 >= 0 && arg1.field1740 < var7.field3688.length) {
                        class12.method54(-1797326908, class66.field1094 == arg1, arg1.field1758, arg1.field1770, arg1.field1740, var7);
                    } else {
                        arg1.field1776 = -1;
                    }
                }
                arg1.field1771 = var7.field3678;
            }
        }
        if (arg1.field1749 > 0) {
            arg1.field1749--;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static void method686(byte arg0) {
        field1638 = null;
        if (arg0 != 99) {
            field1638 = null;
        }
        field1637 = null;
        field1634 = null;
        field1635 = null;
        field1636 = null;
        field1639 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILma;)V")
    public static final void method687(int arg0, class105 arg1) {
        field1633++;
        class261.field4545 = class57.method361(class85.field1423, arg1, 126);
        class273.field4723 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) ((class30.field449[var2] & 0xFF0000) >> 16);
            int var5 = class30.field449[var2 + 1] >> 16 & 0xFF;
            float var6 = ((float) var5 - var4) / 64.0F;
            float var7 = (float) (class30.field449[var2] >> 8 & 0xFF);
            int var8 = class30.field449[var2 + 1] >> 8 & 0xFF;
            float var9 = ((float) var8 - var7) / 64.0F;
            float var10 = (float) (class30.field449[var2] & 0xFF);
            int var11 = class30.field449[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var10) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class273.field4723[var2 * 64 + var13] = class246.method1612(class246.method1612((int) var7 << 8, (int) var4 << 16), (int) var10);
                var7 += var9;
                var10 += var12;
                var4 += var6;
            }
        }
        if (arg0 != 210891048) {
            field1637 = null;
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class273.field4723[var3] = class30.field449[3];
        }
        class209.field3531 = new int[32768];
        client.field1481 = new int[32768];
        class238.method1575(arg0 + 1110945663, (class20) null);
        class205.field3475 = new int[32768];
        class141.field2496 = new int[32768];
        class122.field2191 = new class259(128, 254);
    }
}

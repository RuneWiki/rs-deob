import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class193 {

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    private int field3102 = -1;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    private int field3105 = 0;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "[I")
    public static int[] field3103 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "[C")
    public static char[] field3111 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public int field3100;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public int field3114;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public int field3115;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Lbh;")
    public static class7 field3101;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "Llc;")
    public static class86 field3110;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
    public static void method1430(byte arg0) {
        field3110 = null;
        field3101 = null;
        field3103 = null;
        field3111 = null;
        int var1 = -105 / ((30 - arg0) / 51);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;Z)J")
    public static final long method1431(String arg0, boolean arg1) {
        field3108++;
        long var2 = 0L;
        int var4 = arg0.length();
        if (arg1) {
            return -39L;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIBII)V")
    public static final void method1432(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field3112++;
        if (arg3 != 99) {
            method1438((byte) 31, 117, 36);
        }
        for (int var6 = arg2; var6 <= arg1; var6++) {
            class177.method1330(class240.field3831[var6], arg0, arg5, 32232, arg4);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILv;I)V")
    private final void method1433(int arg0, int arg1, class152 arg2, int arg3) {
        field3116++;
        if (arg0 != 3) {
            this.field3114 = 43;
        }
        if (arg3 == 1) {
            this.field3105 = arg2.method1128((byte) -91);
            this.method1437(this.field3105, 37);
        } else if (arg3 == 2) {
            this.field3102 = arg2.method1126(false);
            if (this.field3102 == 65535) {
                this.field3102 = -1;
                return;
            }
        } else if (arg3 == 3) {
            arg2.method1126(false);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)I")
    public static final int method1434(int arg0, int arg1, int arg2) {
        field3107++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg0 > -49) {
            method1432(-113, 87, 0, (byte) -114, -67, 33);
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIILlc;)[Lsi;")
    public static final class204[] method1435(int arg0, int arg1, int arg2, class86 arg3) {
        if (arg2 == 38) {
            field3113++;
            return class156.method1155(arg0, arg3, 80, arg1) ? class178.method1333(0) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BILv;)V")
    public final void method1436(byte arg0, int arg1, class152 arg2) {
        if (arg0 > -46) {
            field3103 = null;
        }
        while (true) {
            int var4 = arg2.method1111(255);
            if (var4 == 0) {
                field3099++;
                return;
            }
            this.method1433(3, arg1, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
    private final void method1437(int arg0, int arg1) {
        field3104++;
        double var3 = (double) ((arg0 & 0xFFEDEF) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field3114 = (int) (var17 * 256.0D);
        this.field3115 = (int) (var15 * 256.0D);
        if (var17 > 0.5D) {
            this.field3109 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3109 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3114 < 0) {
            this.field3114 = 0;
        } else if (this.field3114 > 255) {
            this.field3114 = 255;
        }
        if (this.field3115 < 0) {
            this.field3115 = 0;
        } else if (this.field3115 > 255) {
            this.field3115 = 255;
        }
        if (this.field3109 < 1) {
            this.field3109 = 1;
        }
        if (arg1 != 37) {
            field3103 = null;
        }
        double var19 = var13 / 6.0D;
        this.field3100 = (int) ((double) this.field3109 * var19);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BII)I")
    public static final int method1438(byte arg0, int arg1, int arg2) {
        int var3 = 1;
        field3106++;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            if (arg0 < 58) {
                method1438((byte) 14, -71, -37);
            }
            return var3;
        }
    }
}

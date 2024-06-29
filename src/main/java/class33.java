import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class33 extends class59 {

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
    public static int field491 = 0;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "Z")
    public static boolean field499 = true;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "Z")
    public static boolean field498 = false;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "Lok;")
    public static class41 field501 = class137.method956("Benutzen", 45);

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "Lok;")
    public static class41 field505 = class137.method956("Suche nach Updates )2 ", 45);

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    public static int field488 = 0;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "I")
    public static int field493 = 1;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "Z")
    public static boolean field506;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "[I")
    public int[] field489;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "[I")
    public int[] field502;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "[I")
    public int[] field509;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "[Ldm;")
    public class182[] field494;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "[Ldm;")
    public class182[] field495;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "[[[B")
    public byte[][][] field504;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILmh;Lmh;B)Ldk;", line = 5)
    public static final class253 method226(int arg0, int arg1, class65 arg2, class65 arg3, byte arg4) {
        if (arg4 == -97) {
            field496++;
            return class10.method40(arg1, true, arg0, arg2) ? class262.method1847(arg3.method454(arg0, 0, arg1), (byte) -121) : null;
        } else {
            return (class253) null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBIIII)V", line = 38)
    public static final void method227(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field497++;
        int var6 = class109.method733(class15.field192, class237.field3801, (byte) 16, arg2);
        int var7 = class109.method733(class15.field192, class237.field3801, (byte) 16, arg3);
        int var8 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg0);
        int var9 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg5);
        for (int var10 = var6; var10 <= var7; var10++) {
            class269.method1908(19, class239.field3829[var10], arg4, var9, var8);
        }
        if (arg1 <= 24) {
            method227(122, (byte) 36, 39, 123, -68, -69);
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)I", line = 66)
    public static final int method228(byte arg0) {
        field490++;
        if (class55.field803 != null) {
            return 3;
        } else if (arg0 < 103) {
            return -64;
        } else if (class166.field2625 && class218.field3513) {
            return 2;
        } else if (class166.field2625 && !class218.field3513) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIBI)V", line = 100)
    public static final void method229(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        class194.field3124 = arg5;
        class176.field2865 = arg1;
        class167.field2654 = arg2;
        int var6 = 37 % ((40 - arg4) / 54);
        class272.field4416 = arg3;
        class51.field770 = arg0;
        if (class176.field2865 >= 100) {
            int var7 = class51.field770 * 128 + 64;
            int var8 = class272.field4416 * 128 + 64;
            int var9 = class140.method983((byte) -105, class55.field807, var7, var8) - class167.field2654;
            int var10 = var7 - class235.field3779;
            int var11 = var8 - class251.field3990;
            int var12 = var9 - class13.field159;
            int var13 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class57.field823 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
            class304.field5072 = (int) (-325.949D * Math.atan2((double) var10, (double) var11)) & 0x7FF;
            if (class57.field823 < 128) {
                class57.field823 = 128;
            }
            if (class57.field823 > 383) {
                class57.field823 = 383;
            }
        }
        class28.field416 = 2;
        field492++;
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V", line = 145)
    public static void method230(int arg0) {
        field501 = null;
        if (arg0 >= 79) {
            field505 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)I", line = 157)
    public static final int method231(int arg0, int arg1) {
        int var2 = 0;
        if (arg1 != 8) {
            method228((byte) -8);
        }
        field508++;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return var2 + arg0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 {

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Lrd;")
    private class119 field805 = new class119(256);

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Lpc;")
    private class105 field799;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Lpc;")
    private class105 field795;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Loc;")
    private static class99 field786 = class48.method402((byte) -104, "Please remove ");

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Loc;")
    private static class99 field783 = class48.method402((byte) -104, "Enter name of player to delete from list");

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Loc;")
    public static class99 field788 = class48.method402((byte) -104, "Wen m-Ochten Sie entfernen?");

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Loc;")
    public static class99 field789 = field783;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Loc;")
    public static class99 field787 = class48.method402((byte) -104, "Hidden)2");

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "Loc;")
    public static class99 field801 = class48.method402((byte) -104, "@cr1@");

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "[B")
    public static byte[] field800 = new byte[520];

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field802 = 0;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Loc;")
    public static class99 field796 = field786;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "J")
    public static long field803 = 0L;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Loc;")
    public static class99 field797 = field786;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "[I")
    public static int[] field794;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lhe;I)Loc;")
    public static final class99 method278(class54 arg0, int arg1) {
        if (arg1 != -1966086522) {
            field788 = null;
        }
        field793++;
        if (class11.method121(class20.method188(arg0, -604452832), 4728) == 0) {
            return null;
        } else if (arg0.field1278 == null || arg0.field1278.method846(-1).method810(-58) == 0) {
            return class54.field1367 ? class74.field1864 : null;
        } else {
            return arg0.field1278;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method279(byte arg0) {
        field801 = null;
        field794 = null;
        field797 = null;
        field787 = null;
        int var1 = 7 % ((-arg0 - 53) / 51);
        field796 = null;
        field788 = null;
        field783 = null;
        field800 = null;
        field789 = null;
        field786 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[II)Lfc;")
    public final class38 method280(int arg0, int[] arg1, int arg2) {
        long var4 = (long) arg0 ^ 0x300000000L;
        class38 var6 = (class38) this.field805.method1001(var4, (byte) 100);
        field785++;
        if (var6 != null) {
            return var6;
        } else if (arg1 == null || arg1[0] > 0) {
            class13 var7 = class13.method138(this.field799, arg0);
            if (var7 == null) {
                return null;
            }
            class38 var8 = var7.method136();
            if (arg2 >= -59) {
                return null;
            }
            this.field805.method1006(var4, var8, -112);
            if (arg1 != null) {
                arg1[0] -= var8.field957.length;
            }
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIILae;I[Lee;II[B)V")
    public static final void method281(int arg0, int arg1, int arg2, int arg3, int arg4, class6 arg5, int arg6, class34[] arg7, int arg8, int arg9, byte[] arg10) {
        field798++;
        class57 var11 = new class57(arg10);
        int var12 = -1;
        if (arg2 <= 42) {
            return;
        }
        while (true) {
            int var13 = var11.method470((byte) -102);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method470((byte) -101);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = var14 >> 6 & 0x3F;
                int var19 = var11.method510(-128);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg0 == var17 && arg9 <= var18 && arg9 + 8 > var18 && var16 >= arg8 && arg8 + 8 > var16) {
                    class16 var22 = class83.method717(6, var12);
                    int var23 = arg4 + class59.method532(var21, arg6, var18 & 0x7, var22.field425, 96, var16 & 0x7, var22.field376);
                    int var24 = arg3 + class135.method1121(var18 & 0x7, -3, arg6, var16 & 0x7, var22.field376, var22.field425, var21);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg1;
                        if ((class81.field2028[1][var23][var24] & 0x2) == 2) {
                            var25 = arg1 - 1;
                        }
                        class34 var26 = null;
                        if (var25 >= 0) {
                            var26 = arg7[var25];
                        }
                        class132.method1068(var24, arg1, arg5, var23, var20, var26, var12, -4388, arg6 + var21 & 0x3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Z")
    public static final boolean method282(int arg0, int arg1) {
        field784++;
        int var2 = -42 % ((63 - arg1) / 58);
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I[II)Lfc;")
    public final class38 method283(int arg0, int[] arg1, int arg2) {
        field790++;
        int var4 = 116 % ((-arg0 - 56) / 37);
        long var5 = (long) arg2 ^ 0x200000000L;
        class38 var7 = (class38) this.field805.method1001(var5, (byte) -63);
        if (var7 != null) {
            return var7;
        } else if (arg1 == null || arg1[0] > 0) {
            class98 var8 = class98.method806(this.field795, arg2);
            if (var8 == null) {
                return null;
            }
            class38 var9 = var8.method807();
            this.field805.method1006(var5, var9, -122);
            if (arg1 != null) {
                arg1[0] -= var9.field957.length;
            }
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lpc;Lpc;)V")
    public class33(class105 arg0, class105 arg1) {
        this.field799 = arg1;
        this.field795 = arg0;
    }
}

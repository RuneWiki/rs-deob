import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class49 extends class62 {

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "[Lo;")
    public class84[] field997;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "Llc;")
    public static class69 field995 = class69.method470((byte) -119, "Nov");

    @OriginalMember(owner = "client!ia", name = "ib", descriptor = "Llc;")
    public static class69 field1006 = class69.method470((byte) -128, "redstone2");

    @OriginalMember(owner = "client!ia", name = "hb", descriptor = "Llc;")
    public static class69 field1005 = class69.method470((byte) -116, " has logged in)3");

    @OriginalMember(owner = "client!ia", name = "ob", descriptor = "Llc;")
    public static class69 field1012 = class69.method470((byte) -111, "Public chat");

    @OriginalMember(owner = "client!ia", name = "nb", descriptor = "Llc;")
    public static class69 field1011 = class69.method470((byte) -119, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!ia", name = "kb", descriptor = "I")
    public static volatile int field1008 = 0;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "Llc;")
    public static class69 field1001 = class69.method470((byte) -116, "Enter name of player to delete from list");

    @OriginalMember(owner = "client!ia", name = "qb", descriptor = "I")
    public static int field1014 = 0;

    @OriginalMember(owner = "client!ia", name = "wb", descriptor = "[I")
    public static int[] field1020 = new int[50];

    @OriginalMember(owner = "client!ia", name = "vb", descriptor = "I")
    public static int field1019 = 0;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "Llc;")
    public static class69 field992 = class69.method470((byte) -100, "");

    @OriginalMember(owner = "client!ia", name = "rb", descriptor = "Llc;")
    public static class69 field1015 = field992;

    @OriginalMember(owner = "client!ia", name = "lb", descriptor = "Llc;")
    public static class69 field1009 = field992;

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "Llc;")
    public static class69 field1002 = field992;

    @OriginalMember(owner = "client!ia", name = "pb", descriptor = "Llc;")
    public static class69 field1013 = field992;

    @OriginalMember(owner = "client!ia", name = "tb", descriptor = "Llc;")
    public static class69 field1017 = field992;

    @OriginalMember(owner = "client!ia", name = "jb", descriptor = "Llc;")
    public static class69 field1007 = field992;

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!ia", name = "gb", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!ia", name = "sb", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!ia", name = "ub", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!ia", name = "xb", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "Lda;")
    public static class20 field994;

    @OriginalMember(owner = "client!ia", name = "mb", descriptor = "[Lda;")
    public static class20[] field1010;

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "[[I")
    public static int[][] field1003;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII[Lvb;III[BI)V")
    public static final void method317(int arg0, int arg1, int arg2, int arg3, class122[] arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg2 + var10 > 0 && arg2 + var10 < 103 && arg3 + var15 > 0 && arg3 + var15 < 103) {
                    arg4[arg9].field2662[arg2 + var10][arg3 + var15] = class23.method151(arg4[arg9].field2662[arg2 + var10][arg3 + var15], -16777217);
                }
            }
        }
        field998++;
        class94 var11 = new class94(arg8);
        for (int var12 = arg1; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg7 == var12 && var13 >= arg6 && arg6 + 8 > var13 && var14 >= arg5 && var14 < arg5 + 8) {
                        class60.method361(0, var11, 0, 72, client.method122(false, arg0, var13 & 0x7, var14 & 0x7) + arg2, arg0, arg9, arg3 + client.method110(var14 & 0x7, 3, arg0, var13 & 0x7));
                    } else {
                        class60.method361(0, var11, 0, arg1 ^ 0x77, -1, 0, 0, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)Lle;")
    public static final class71 method318(byte arg0, int arg1) {
        class71 var2 = (class71) class25.field528.method224((long) arg1, (byte) -113);
        field1000++;
        if (var2 != null) {
            return var2;
        } else if (arg0 == 20) {
            byte[] var3 = class107.field2330.method394(16, arg1, (byte) -77);
            class71 var4 = new class71();
            if (var3 != null) {
                var4.method504(-1, new class94(var3));
            }
            class25.field528.method221(var4, true, (long) arg1);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lkc;Lkc;IZ)V")
    public class49(class63 arg0, class63 arg1, int arg2, boolean arg3) {
        class80 var5 = new class80();
        int var6 = arg0.method382(arg2, (byte) 24);
        this.field997 = new class84[var6];
        int[] var7 = arg0.method385(arg2, -1);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method394(arg2, var7[var8], (byte) -59);
            class46 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class46 var12 = (class46) var5.method580((byte) -72); var12 != null; var12 = (class46) var5.method576((byte) 65)) {
                if (var12.field957 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method381(var11, 0, true);
                } else {
                    var13 = arg1.method381(0, var11, true);
                }
                var10 = new class46(var11, var13);
                var5.method577(var10, -34);
            }
            this.field997[var7[var8]] = new class84(var9, var10);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Z")
    public final boolean method319(int arg0, int arg1) {
        field1016++;
        if (arg1 > -58) {
            method323((byte) -99, 17);
        }
        return this.field997[arg0].field1892;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)Z")
    public static final boolean method320(int arg0, int arg1) {
        field1021++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else if (arg0 >= 129 && arg0 <= 159) {
            return false;
        } else {
            if (arg1 != -160) {
                field1010 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method321(byte arg0) {
        field1015 = null;
        field1002 = null;
        field1012 = null;
        field1005 = null;
        field1009 = null;
        if (arg0 != 24) {
            method321((byte) -37);
        }
        field995 = null;
        field1017 = null;
        field1001 = null;
        field1020 = null;
        field1011 = null;
        field1006 = null;
        field992 = null;
        field994 = null;
        field1010 = null;
        field1003 = null;
        field1007 = null;
        field1013 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IJ)Llc;")
    public static final class69 method322(int arg0, long arg1) {
        field1018++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            byte[] var6 = new byte[var5];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = class51.field1105[(int) (var8 - arg1 * 37L)];
            }
            if (arg0 < 84) {
                field1020 = null;
            }
            class69 var7 = new class69();
            var7.field1488 = var6;
            var7.field1523 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(BI)V")
    public static final void method323(byte arg0, int arg1) {
        if (arg0 != 6) {
            method323((byte) 69, -78);
        }
        class93.method653(arg1, (byte) 109);
        field996++;
    }
}

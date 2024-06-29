import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class98 extends class219 {

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "Z")
    public boolean field1505 = false;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
    private int field1523 = -1;

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
    private int field1526 = 0;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    private int field1533 = -32768;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    private int field1517 = 0;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
    public int field1518;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "I")
    public int field1515;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public int field1507;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    public int field1513;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "Lsi;")
    private class198 field1524;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "[I")
    public static int[] field1519 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "Ljava/lang/String;")
    public static String field1525 = "wave:";

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "Ldl;")
    public static class123 field1509;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "Lid;")
    public static class149 field1528;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "Lql;")
    private class217 field1535;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V")
    public final void method370(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1521++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
    public final void method648(int arg0, int arg1) {
        field1514++;
        if (this.field1505) {
            return;
        }
        this.field1526 += arg0;
        if (arg1 <= 26) {
            field1527 = 64;
        }
        while (this.field1526 > this.field1524.field3080[this.field1517]) {
            this.field1526 -= this.field1524.field3080[this.field1517];
            this.field1517++;
            if (this.field1524.field3107.length <= this.field1517) {
                this.field1505 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
    public static void method649(boolean arg0) {
        field1525 = null;
        if (!arg0) {
            method653(-16, -74, (class123) null);
        }
        field1528 = null;
        field1509 = null;
        field1519 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIIJILql;)V")
    public final void method373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class217 arg10) {
        class114 var13 = this.method650((byte) -112);
        field1530++;
        if (var13 != null) {
            var13.method373(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1535);
            this.field1533 = var13.method363();
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)Lua;")
    private final class114 method650(byte arg0) {
        field1511++;
        class70 var2 = class77.method521(this.field1536, (byte) -42);
        if (arg0 != -112) {
            return null;
        }
        class114 var3;
        if (this.field1505) {
            var3 = var2.method473(-1, (byte) 90, 0, -1);
        } else {
            var3 = var2.method473(this.field1517, (byte) -73, this.field1526, this.field1523);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZLdl;)V")
    public static final void method651(boolean arg0, class123 arg1) {
        field1512++;
        class4.field64 = class102.method675((byte) -61, arg1, class104.field1605);
        class162.field2522 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) (class178.field2777[var2] >> 16 & 0xFF);
            int var5 = (class178.field2777[var2 + 1] & 0xFF0000) >> 16;
            float var6 = (float) ((class178.field2777[var2] & 0xFF00) >> 8);
            int var7 = (class178.field2777[var2 + 1] & 0xFF00) >> 8;
            float var8 = (float) (class178.field2777[var2] & 0xFF);
            float var9 = ((float) var5 - var4) / 64.0F;
            float var10 = ((float) var7 - var6) / 64.0F;
            int var11 = class178.field2777[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var8) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class162.field2522[var2 * 64 + var13] = class120.method787(class120.method787((int) var6 << 8, (int) var4 << 16), (int) var8);
                var8 += var12;
                var6 += var10;
                var4 += var9;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class162.field2522[var3] = class178.field2777[3];
        }
        if (arg0) {
            method649(false);
        }
        class111.field1685 = new int[32768];
        class130.field1908 = new int[32768];
        class28.method236(-63, (class15) null);
        class229.field3711 = new int[32768];
        class71.field998 = new int[32768];
        class22.field264 = new class12(128, 254);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)Lfg;")
    public static final class12 method652(int arg0) {
        int var1 = class236.field3777[0] * class228.field3696[0];
        field1531++;
        if (arg0 != -25405) {
            method653(54, 104, (class123) null);
        }
        byte[] var2 = class101.field1574[0];
        class12 var6;
        if (class80.field1148[0]) {
            int[] var3 = new int[var1];
            byte[] var4 = class37.field496[0];
            for (int var5 = 0; var5 < var1; var5++) {
                var3[var5] = class120.method787(class224.method1526(var4[var5] << 24, -16777216), class72.field1023[class224.method1526(var2[var5], 255)]);
            }
            var6 = new class183(class46.field583, class209.field3253, class206.field3221[0], class226.field3653[0], class236.field3777[0], class228.field3696[0], var3);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class72.field1023[class224.method1526(var2[var8], 255)];
            }
            var6 = new class12(class46.field583, class209.field3253, class206.field3221[0], class226.field3653[0], class236.field3777[0], class228.field3696[0], var7);
        }
        class222.method1506((byte) 111);
        return var6;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "()I")
    public final int method363() {
        field1508++;
        return this.field1533;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILdl;)Z")
    public static final boolean method653(int arg0, int arg1, class123 arg2) {
        byte[] var3 = arg2.method834(true, arg1);
        field1520++;
        if (arg0 != -1) {
            return true;
        } else if (var3 == null) {
            return false;
        } else {
            class152.method1011((byte) 65, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIB)V")
    public static final void method654(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field1534++;
        int var6 = arg1 - arg3;
        if (arg5 != 91) {
            field1519 = null;
        }
        int var7 = arg2 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class218.method1475(arg4, arg3, arg0, arg2, false);
            }
        } else if (var7 == 0) {
            class284.method1897(arg3, 16776960, arg0, arg4, arg1);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (arg1 < class51.field710) {
                var10 = (class51.field710 * var8 >> 12) + var9;
                var11 = class51.field710;
            } else if (arg1 > class96.field1484) {
                var11 = class96.field1484;
                var10 = (class96.field1484 * var8 >> 12) + var9;
            } else {
                var11 = arg1;
                var10 = arg2;
            }
            int var12;
            int var13;
            if (class51.field710 > arg3) {
                var12 = class51.field710;
                var13 = var9 + (class51.field710 * var8 >> 12);
            } else if (class96.field1484 < arg3) {
                var13 = (class96.field1484 * var8 >> 12) + var9;
                var12 = class96.field1484;
            } else {
                var13 = arg4;
                var12 = arg3;
            }
            if (var10 < class110.field1669) {
                var11 = (class110.field1669 - var9 << 12) / var8;
                var10 = class110.field1669;
            } else if (var10 > class189.field2984) {
                var11 = (class189.field2984 - var9 << 12) / var8;
                var10 = class189.field2984;
            }
            if (class110.field1669 > var13) {
                var12 = (class110.field1669 - var9 << 12) / var8;
                var13 = class110.field1669;
            } else if (var13 > class189.field2984) {
                var12 = (class189.field2984 - var9 << 12) / var8;
                var13 = class189.field2984;
            }
            class34.method270(var13, (byte) -96, var11, var12, arg0, var10);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method655(long arg0, int arg1) {
        field1506++;
        if (arg0 <= (long) arg1 || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class192.field3022[(int) (var7 - arg0 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(IIIIIII)V")
    public class98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1518 = arg1;
        this.field1532 = arg5 + arg6;
        this.field1536 = arg0;
        this.field1515 = arg2;
        this.field1507 = arg3;
        this.field1513 = arg4;
        int var8 = class77.method521(this.field1536, (byte) -42).field985;
        if (var8 == -1) {
            this.field1505 = true;
        } else {
            this.field1505 = false;
            this.field1524 = class104.method688(var8, 30091);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class244 {

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public int field4146;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "[B")
    public byte[] field4151;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "[S")
    public short[] field4144;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "[Luf;")
    public class168[] field4158;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "[I")
    public int[] field4147;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "[S")
    public short[] field4148;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Luf;")
    public static class168 field4143 = class148.method1019(-1720, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "Lkb;")
    public static class80 field4152 = new class80(16);

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "Luf;")
    public static class168 field4155 = class148.method1019(-1720, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field4156 = -1;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "Luf;")
    public static class168 field4161 = class148.method1019(-1720, "p11_full");

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "[I")
    public static int[] field4162 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "Lfj;")
    public static class283 field4159;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 5)
    public static void method1678(int arg0) {
        field4152 = null;
        field4162 = null;
        field4143 = null;
        field4161 = null;
        if (arg0 <= 115) {
            method1678(41);
        }
        field4155 = null;
        field4159 = null;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 23)
    public static final void method1679(int arg0) {
        field4145++;
        class154.field2430 = null;
        class254.field4341 = null;
        class236.field3779 = (byte[][]) null;
        class205.field3374 = null;
        if (arg0 != -14642) {
            method1678(97);
        }
        class214.field3490 = null;
        class123.field1905 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)V", line = 46)
    public static final void method1680(byte arg0, int arg1) {
        field4153++;
        class78.field1066.method1428(arg1, 29946);
        int var2 = -121 / ((arg0 + 29) / 58);
        class71.field956.method1428(arg1, 29946);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Z", line = 57)
    public final boolean method1681(int arg0, int arg1) {
        if (arg1 < 94) {
            return false;
        } else {
            field4142++;
            return (this.field4151[arg0] & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIB)V", line = 73)
    public static final void method1682(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class133.method925(arg4 ^ 0x3969, arg3 - arg2, arg1, arg2 + arg3, class284.field4810[arg0]);
        field4150++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -1;
        if (arg4 != 63) {
            return;
        }
        int var8 = -arg2;
        while (var6 > var5) {
            var7 += 2;
            var5++;
            var8 += var7;
            if (var8 >= 0) {
                var6--;
                int[] var9 = class284.field4810[arg0 + var6];
                int[] var10 = class284.field4810[arg0 - var6];
                var8 -= var6 << 1;
                int var11 = arg3 + var5;
                int var12 = arg3 - var5;
                class133.method925(14678, var12, arg1, var11, var9);
                class133.method925(14678, var12, arg1, var11, var10);
            }
            int var13 = arg3 + var6;
            int[] var14 = class284.field4810[arg0 + var5];
            int var15 = arg3 - var6;
            int[] var16 = class284.field4810[arg0 - var5];
            class133.method925(14678, var15, arg1, var13, var14);
            class133.method925(arg4 ^ 0x3969, var15, arg1, var13, var16);
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)I", line = 127)
    public final int method1683(int arg0, int arg1) {
        field4149++;
        if (arg1 != 2) {
            method1679(-70);
        }
        return this.field4151[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIII)V", line = 146)
    public static final void method1684(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4157++;
        int var6 = arg1 - arg5;
        int var7 = arg3 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class295.method2027(arg2, arg1, arg5, -124, arg0);
            }
        } else if (var6 == 0) {
            class71.method401(arg2, arg3, arg0, arg5, (byte) -99);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg2;
                arg2 = arg5;
                arg5 = var9;
                int var10 = arg3;
                arg3 = arg1;
                arg1 = var10;
            }
            if (arg2 > arg3) {
                int var11 = arg2;
                arg2 = arg3;
                arg3 = var11;
                int var12 = arg5;
                arg5 = arg1;
                arg1 = var12;
            }
            int var13 = arg5;
            int var14 = arg3 - arg2;
            int var15 = -(var14 >> 1);
            int var16 = arg1 - arg5;
            if (var16 < 0) {
                var16 = -var16;
            }
            int var17 = arg1 > arg5 ? 1 : -1;
            if (arg4 == -9045) {
                if (var8) {
                    for (int var19 = arg2; var19 <= arg3; var19++) {
                        var15 += var16;
                        class284.field4810[var19][var13] = arg0;
                        if (var15 > 0) {
                            var13 += var17;
                            var15 -= var14;
                        }
                    }
                } else {
                    for (int var18 = arg2; var18 <= arg3; var18++) {
                        var15 += var16;
                        class284.field4810[var13][var18] = arg0;
                        if (var15 > 0) {
                            var15 -= var14;
                            var13 += var17;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(I)V", line = 290)
    public class244(int arg0) {
        this.field4146 = arg0;
        this.field4151 = new byte[this.field4146];
        this.field4144 = new short[this.field4146];
        this.field4158 = new class168[this.field4146];
        this.field4147 = new int[this.field4146];
        this.field4148 = new short[this.field4146];
    }
}

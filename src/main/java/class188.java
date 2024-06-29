import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class188 {

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    private int field3044 = 0;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    private int field3043 = 128;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    private int field3047 = 0;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public int field3050 = -1;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    private int field3045 = 0;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Z")
    public boolean field3046 = false;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    private int field3037 = 128;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field3048 = 0;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    private int field3051;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public int field3054;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lsc;")
    public static class250 field3040;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "[S")
    private short[] field3038;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "[S")
    private short[] field3039;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "[S")
    private short[] field3052;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "[S")
    private short[] field3055;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZII)Loi;")
    public final class80 method1283(int arg0, boolean arg1, int arg2, int arg3) {
        field3053++;
        class80 var5 = (class80) class227.field3757.method480((long) this.field3054, 99);
        if (var5 == null) {
            class150 var6 = class150.method1058(class6.field74, this.field3051, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field3038 != null) {
                for (int var7 = 0; var7 < this.field3038.length; var7++) {
                    var6.method1036(this.field3038[var7], this.field3052[var7]);
                }
            }
            if (this.field3039 != null) {
                for (int var8 = 0; var8 < this.field3039.length; var8++) {
                    var6.method1035(this.field3039[var8], this.field3055[var8]);
                }
            }
            var5 = var6.method1034(this.field3047 + 64, this.field3045 + 850, -30, -50, -30);
            class227.field3757.method474((long) this.field3054, (byte) 115, var5);
        }
        if (!arg1) {
            this.field3046 = true;
        }
        class80 var9;
        if (this.field3050 == -1 || arg2 == -1) {
            var9 = var5.method572(true, true, true);
        } else {
            var9 = class49.method384(this.field3050, -125).method1231(356782832, var5, arg3, arg2, arg0);
        }
        if (this.field3037 != 128 || this.field3043 != 128) {
            var9.method564(this.field3037, this.field3043, this.field3037);
        }
        if (this.field3044 != 0) {
            if (this.field3044 == 90) {
                var9.method561();
            }
            if (this.field3044 == 180) {
                var9.method575();
            }
            if (this.field3044 == 270) {
                var9.method581();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public static void method1284(boolean arg0) {
        if (!arg0) {
            field3040 = null;
        }
        field3040 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLog;)V")
    public final void method1285(boolean arg0, class221 arg1) {
        field3049++;
        if (arg0) {
            method1286(85, -58, -67);
        }
        while (true) {
            int var3 = arg1.method1517((byte) -96);
            if (var3 == 0) {
                return;
            }
            this.method1288(arg1, var3, -9);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)Z")
    public static final boolean method1286(int arg0, int arg1, int arg2) {
        int var3 = class284.field4482[arg0][arg1][arg2];
        if (-class20.field344 == var3) {
            return false;
        } else if (class20.field344 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class204.method1409(var4 + 1, class124.field2012[arg0][arg1][arg2], var5 + 1) && class204.method1409(var4 + 128 - 1, class124.field2012[arg0][arg1 + 1][arg2], var5 + 1) && class204.method1409(var4 + 128 - 1, class124.field2012[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class204.method1409(var4 + 1, class124.field2012[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class284.field4482[arg0][arg1][arg2] = class20.field344;
                return true;
            } else {
                class284.field4482[arg0][arg1][arg2] = -class20.field344;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIILtf;)V")
    public static final void method1287(int arg0, int arg1, int arg2, int arg3, class107 arg4) {
        field3042++;
        if (class205.field3291 >= 400) {
            return;
        }
        if (arg4.field1716 != null) {
            arg4 = arg4.method775(false);
        }
        if (arg4 == null || !arg4.field1773) {
            return;
        }
        String var5 = arg4.field1714;
        if (arg4.field1732 != 0) {
            String var6 = class111.field1837 == 1 ? class13.field239 : class48.field861;
            var5 = var5 + class30.method255(arg0 ^ 0xFFFFF05A, class167.field2655.field519, arg4.field1732) + " (" + var6 + arg4.field1732 + ")";
        }
        if (arg0 != -4014) {
            field3048 = 83;
        }
        if (class51.field894 == 1) {
            class40.method348(arg3, (long) arg1, (short) 38, class200.field3193, arg2, class89.field1414, class197.field3152 + " -> <col=ffff00>" + var5, true);
            class235.field3835++;
        } else if (class288.field4560) {
            class39 var14 = class35.field543 == -1 ? null : class87.method632(class35.field543, 124);
            if ((class212.field3473 & 0x2) != 0) {
                if (var14 == null || arg4.method783(class35.field543, (byte) 43, var14.field735) != var14.field735) {
                    class262.field4153++;
                    class40.method348(arg3, (long) arg1, (short) 59, class154.field2496, arg2, class138.field2268, class149.field2403 + " -> <col=ffff00>" + var5, true);
                }
                return;
            }
        } else {
            class125.field2017++;
            String[] var7 = arg4.field1740;
            if (class266.field4218) {
                var7 = class176.method1204(var7, 5);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class111.field1837 != 0 || !var7[var8].equalsIgnoreCase(class78.field1247))) {
                        class273.field4328++;
                        byte var9 = 0;
                        int var10 = -1;
                        if (arg4.field1761 == var8) {
                            var10 = arg4.field1747;
                        }
                        if (arg4.field1767 == var8) {
                            var10 = arg4.field1772;
                        }
                        if (var8 == 0) {
                            var9 = 25;
                        }
                        if (var8 == 1) {
                            var9 = 6;
                        }
                        if (var8 == 2) {
                            var9 = 21;
                        }
                        if (var8 == 3) {
                            var9 = 7;
                        }
                        if (var8 == 4) {
                            var9 = 8;
                        }
                        class40.method348(arg3, (long) arg1, var9, var7[var8], arg2, var10, "<col=ffff00>" + var5, true);
                    }
                }
            }
            if (class111.field1837 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class78.field1247)) {
                        class152.field2465++;
                        short var12 = 0;
                        short var13 = 0;
                        if (var11 == 0) {
                            var12 = 25;
                        }
                        if (class167.field2655.field519 < arg4.field1732) {
                            var13 = 2000;
                        }
                        if (var11 == 1) {
                            var12 = 6;
                        }
                        if (var11 == 2) {
                            var12 = 21;
                        }
                        if (var11 == 3) {
                            var12 = 7;
                        }
                        if (var11 == 4) {
                            var12 = 8;
                        }
                        if (var12 != 0) {
                            var12 += var13;
                        }
                        class40.method348(arg3, (long) arg1, var12, var7[var11], arg2, arg4.field1752, "<col=ffff00>" + var5, true);
                    }
                }
            }
            class40.method348(arg3, (long) arg1, (short) 1003, class288.field4561, arg2, class24.field397, "<col=ffff00>" + var5, true);
            return;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Log;II)V")
    private final void method1288(class221 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3051 = arg0.method1521((byte) 113);
        } else if (arg1 == 2) {
            this.field3050 = arg0.method1521((byte) 113);
        } else if (arg1 == 4) {
            this.field3037 = arg0.method1521((byte) 113);
        } else if (arg1 == 5) {
            this.field3043 = arg0.method1521((byte) 113);
        } else if (arg1 == 6) {
            this.field3044 = arg0.method1521((byte) 113);
        } else if (arg1 == 7) {
            this.field3047 = arg0.method1517((byte) -96);
        } else if (arg1 == 8) {
            this.field3045 = arg0.method1517((byte) -96);
        } else if (arg1 == 9) {
            this.field3046 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method1517((byte) -96);
            this.field3038 = new short[var6];
            this.field3052 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3038[var7] = (short) arg0.method1521((byte) 113);
                this.field3052[var7] = (short) arg0.method1521((byte) 113);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method1517((byte) -96);
            this.field3055 = new short[var4];
            this.field3039 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3039[var5] = (short) arg0.method1521((byte) 113);
                this.field3055[var5] = (short) arg0.method1521((byte) 113);
            }
        }
        field3041++;
        if (arg2 != -9) {
            method1284(false);
        }
    }
}

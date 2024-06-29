import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class281 {

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public int field4330 = 2;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "Z")
    public boolean field4328 = false;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public int field4337 = -1;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public int field4321 = -1;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public int field4338 = 99;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "Z")
    public boolean field4331 = false;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public int field4324 = -1;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "Z")
    public boolean field4341 = false;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public int field4329 = -1;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
    public int field4344 = 5;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "Z")
    public boolean field4345 = false;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public int field4333 = -1;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lgd;")
    public static class170 field4320 = new class170(32);

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "Lpg;")
    public static class320 field4342 = new class320(30);

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public static int field4343 = 0;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "[Z")
    public static boolean[] field4346 = new boolean[100];

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public int field4340;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "[I")
    public int[] field4322;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "[I")
    private int[] field4323;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "[I")
    public int[] field4326;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "[Z")
    public boolean[] field4318;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "[[I")
    public int[][] field4319;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lwi;BIII)Lwi;", line = 7)
    public final class221 method1921(class221 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4334++;
        int var6 = this.field4322[arg4];
        int var7 = this.field4326[arg4];
        class75 var8 = class268.method1850(var7 >> 16, true);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg0.method194(true, true, true);
        }
        class75 var10 = null;
        class75 var11 = null;
        if ((this.field4345 || class244.field3904) && arg3 != -1 && arg3 < this.field4326.length) {
            int var12 = this.field4326[arg3];
            var11 = class268.method1850(var12 >> 16, true);
            arg3 = var12 & 0xFFFF;
        }
        class75 var13 = null;
        int var14 = 0;
        int var15 = 0;
        if (this.field4323 != null) {
            if (this.field4323.length > arg4) {
                var14 = this.field4323[arg4];
                if (var14 != 65535) {
                    var10 = class268.method1850(var14 >> 16, true);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field4345 || class244.field3904) && arg3 != -1 && this.field4323.length > arg3) {
                var15 = this.field4323[arg3];
                if (var15 != 65535) {
                    var13 = class268.method1850(var15 >> 16, true);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method551(var9, (byte) -84);
        if (arg1 <= 2) {
            this.field4329 = 76;
        }
        boolean var17 = !var8.method549(var9, 0);
        if (var10 != null) {
            var16 &= !var10.method551(var14, (byte) -72);
            var17 &= !var10.method549(var14, 0);
        }
        if (var11 != null) {
            var16 &= !var11.method551(arg3, (byte) -89);
            var17 &= !var11.method549(arg3, 0);
        }
        if (var13 != null) {
            var16 &= !var13.method551(var15, (byte) -89);
            var17 &= !var13.method549(var15, 0);
        }
        class221 var18 = arg0.method194(var16, var17, !this.field4341);
        var18.method1576(var8, var9, var11, arg3, arg2 - 1, var6, this.field4341);
        if (var10 != null) {
            var18.method1576(var10, var14, var13, var15, arg2 - 1, var6, this.field4341);
        }
        return var18;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILkh;)V", line = 103)
    public final void method1922(int arg0, class166 arg1) {
        field4327++;
        while (true) {
            int var3 = arg1.method1178(0);
            if (var3 == 0) {
                if (arg0 != -13091) {
                    this.field4341 = false;
                }
                return;
            }
            this.method1927(var3, arg1, -108);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLwi;III)Lwi;", line = 138)
    public final class221 method1923(byte arg0, class221 arg1, int arg2, int arg3, int arg4) {
        field4339++;
        int var6 = this.field4322[arg2];
        int var7 = this.field4326[arg2];
        class75 var8 = class268.method1850(var7 >> 16, true);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg1.method191(true, true, true);
        }
        if (arg0 < 46) {
            this.field4318 = (boolean[]) null;
        }
        class75 var10 = null;
        if ((this.field4345 || class244.field3904) && arg4 != -1 && arg4 < this.field4326.length) {
            int var11 = this.field4326[arg4];
            var10 = class268.method1850(var11 >> 16, true);
            arg4 = var11 & 0xFFFF;
        }
        class221 var12;
        if (var10 == null) {
            var12 = arg1.method191(!var8.method551(var9, (byte) -83), !var8.method549(var9, 0), !this.field4341);
        } else {
            var12 = arg1.method191(!var8.method551(var9, (byte) -114) & !var10.method551(arg4, (byte) -71), !var8.method549(var9, 0) & !var10.method549(arg4, 0), !this.field4341);
        }
        var12.method1576(var8, var9, var10, arg4, arg3 - 1, var6, this.field4341);
        return var12;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIILwi;II)Lwi;", line = 176)
    public final class221 method1924(int arg0, int arg1, int arg2, class221 arg3, int arg4, int arg5) {
        int var7 = this.field4322[arg5];
        field4335++;
        int var8 = this.field4326[arg5];
        class75 var9 = class268.method1850(var8 >> 16, true);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method211(true, true, true);
        }
        int var11 = arg0 & 0x3;
        if (arg1 != 2) {
            return (class221) null;
        }
        class75 var12 = null;
        if ((this.field4345 || class244.field3904) && arg2 != -1 && this.field4326.length > arg2) {
            int var13 = this.field4326[arg2];
            var12 = class268.method1850(var13 >> 16, true);
            arg2 = var13 & 0xFFFF;
        }
        class221 var14;
        if (var12 == null) {
            var14 = arg3.method211(!var9.method551(var10, (byte) -107), !var9.method549(var10, 0), !this.field4341);
        } else {
            var14 = arg3.method211(!var9.method551(var10, (byte) -112) & !var12.method551(arg2, (byte) -99), !var9.method549(var10, 0) & !var12.method549(arg2, 0), !this.field4341);
        }
        if (class94.field1516 && this.field4341) {
            if (var11 == 1) {
                ((class21) var14).method174();
            } else if (var11 == 2) {
                ((class21) var14).method179();
            } else if (var11 == 3) {
                ((class21) var14).method189();
            }
        } else if (var11 == 1) {
            var14.method181();
        } else if (var11 == 2) {
            var14.method213();
        } else if (var11 == 3) {
            var14.method180();
        }
        var14.method1576(var9, var10, var12, arg2, arg4 - 1, var7, this.field4341);
        if (class94.field1516 && this.field4341) {
            if (var11 == 1) {
                ((class21) var14).method189();
            } else if (var11 == 2) {
                ((class21) var14).method179();
            } else if (var11 == 3) {
                ((class21) var14).method174();
            }
        } else if (var11 == 1) {
            var14.method180();
        } else if (var11 == 2) {
            var14.method213();
        } else if (var11 == 3) {
            var14.method181();
        }
        return var14;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 279)
    public final void method1925(int arg0) {
        if (arg0 != 22463) {
            return;
        }
        if (this.field4324 == -1) {
            if (this.field4318 == null) {
                this.field4324 = 0;
            } else {
                this.field4324 = 2;
            }
        }
        field4336++;
        if (this.field4321 != -1) {
            return;
        }
        if (this.field4318 == null) {
            this.field4321 = 0;
        } else {
            this.field4321 = 2;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V", line = 319)
    public static void method1926(int arg0) {
        field4320 = null;
        if (arg0 <= -56) {
            field4346 = null;
            field4342 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILkh;I)V", line = 353)
    private final void method1927(int arg0, class166 arg1, int arg2) {
        field4332++;
        int var4 = -56 / ((-arg2 - 41) / 34);
        if (arg0 == 1) {
            int var5 = arg1.method1151(-105);
            this.field4322 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field4322[var6] = arg1.method1151(-110);
            }
            this.field4326 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                this.field4326[var7] = arg1.method1151(-125);
            }
            for (int var8 = 0; var8 < var5; var8++) {
                this.field4326[var8] += arg1.method1151(-87) << 16;
            }
        } else if (arg0 == 2) {
            this.field4337 = arg1.method1151(-121);
        } else if (arg0 == 3) {
            this.field4318 = new boolean[256];
            int var9 = arg1.method1178(0);
            for (int var10 = 0; var10 < var9; var10++) {
                this.field4318[arg1.method1178(0)] = true;
            }
        } else if (arg0 == 4) {
            this.field4331 = true;
        } else if (arg0 == 5) {
            this.field4344 = arg1.method1178(0);
        } else if (arg0 == 6) {
            this.field4329 = arg1.method1151(-103);
        } else if (arg0 == 7) {
            this.field4333 = arg1.method1151(-75);
        } else if (arg0 == 8) {
            this.field4338 = arg1.method1178(0);
        } else if (arg0 == 9) {
            this.field4321 = arg1.method1178(0);
        } else if (arg0 == 10) {
            this.field4324 = arg1.method1178(0);
        } else if (arg0 == 11) {
            this.field4330 = arg1.method1178(0);
        } else if (arg0 == 12) {
            int var15 = arg1.method1178(0);
            this.field4323 = new int[var15];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field4323[var16] = arg1.method1151(-55);
            }
            for (int var17 = 0; var17 < var15; var17++) {
                this.field4323[var17] = (arg1.method1151(-118) << 16) + this.field4323[var17];
            }
        } else if (arg0 == 13) {
            int var11 = arg1.method1151(-93);
            this.field4319 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg1.method1178(0);
                if (var13 > 0) {
                    this.field4319[var12] = new int[var13];
                    this.field4319[var12][0] = arg1.method1156((byte) 17);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field4319[var12][var14] = arg1.method1151(-51);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field4341 = true;
        } else if (arg0 == 15) {
            this.field4345 = true;
        } else if (arg0 == 16) {
            this.field4328 = true;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILwi;BIII)Lwi;", line = 544)
    public final class221 method1928(int arg0, class221 arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field4322[arg3];
        field4325++;
        int var8 = this.field4326[arg3];
        if (arg2 < 32) {
            return (class221) null;
        }
        class75 var9 = class268.method1850(var8 >> 16, true);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method194(true, true, true);
        }
        int var11 = arg5 & 0x3;
        class75 var12 = null;
        if ((this.field4345 || class244.field3904) && arg4 != -1 && this.field4326.length > arg4) {
            int var13 = this.field4326[arg4];
            var12 = class268.method1850(var13 >> 16, true);
            arg4 = var13 & 0xFFFF;
        }
        class221 var14;
        if (var12 == null) {
            var14 = arg1.method194(!var9.method551(var10, (byte) -87), !var9.method549(var10, 0), !this.field4341);
        } else {
            var14 = arg1.method194(!var9.method551(var10, (byte) -101) & !var12.method551(arg4, (byte) -112), !var9.method549(var10, 0) & !var12.method549(arg4, 0), !this.field4341);
        }
        if (this.field4341 && class94.field1516) {
            if (var11 == 1) {
                ((class21) var14).method174();
            } else if (var11 == 2) {
                ((class21) var14).method179();
            } else if (var11 == 3) {
                ((class21) var14).method189();
            }
        } else if (var11 == 1) {
            var14.method181();
        } else if (var11 == 2) {
            var14.method213();
        } else if (var11 == 3) {
            var14.method180();
        }
        var14.method1576(var9, var10, var12, arg4, arg0 - 1, var7, this.field4341);
        if (this.field4341 && class94.field1516) {
            if (var11 == 1) {
                ((class21) var14).method189();
            } else if (var11 == 2) {
                ((class21) var14).method179();
            } else if (var11 == 3) {
                ((class21) var14).method174();
            }
        } else if (var11 == 1) {
            var14.method180();
        } else if (var11 == 2) {
            var14.method213();
        } else if (var11 == 3) {
            var14.method181();
        }
        return var14;
    }
}

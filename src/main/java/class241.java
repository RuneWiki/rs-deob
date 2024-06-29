import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class241 {

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "Z")
    public boolean field4353 = false;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public int field4350 = -1;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public int field4345 = -1;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public int field4359 = -1;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "I")
    public int field4366 = -1;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
    public int field4362 = 5;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public int field4367 = 2;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    public int field4370 = 99;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "Z")
    private boolean field4371 = false;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
    public int field4368 = -1;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field4351 = 0;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "[I")
    public static int[] field4340 = new int[32];

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field4349 = 0;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    public static int field4372 = -1;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "[I")
    public int[] field4341;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "[I")
    public int[] field4344;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "[I")
    private int[] field4361;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "[I")
    private int[] field4364;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "[[I")
    public int[][] field4358;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILvc;)Lvc;")
    public final class189 method1661(int arg0, int arg1, class189 arg2) {
        int var4 = this.field4341[arg0];
        class47 var5 = class253.method1747(var4 >> 16, -111);
        int var6 = var4 & 0xFFFF;
        field4369++;
        if (arg1 != 31042) {
            return null;
        } else if (var5 == null) {
            return arg2.method427(true, true);
        } else {
            class189 var7 = arg2.method427(!var5.method344(23, var6), !this.field4371);
            var7.method418(var5, var6, this.field4371);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ltf;I)V")
    public final void method1662(class106 arg0, int arg1) {
        if (arg1 != 65535) {
            field4372 = -92;
        }
        while (true) {
            int var3 = arg0.method774((byte) 120);
            if (var3 == 0) {
                field4352++;
                return;
            }
            this.method1672(var3, -97, arg0);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public final void method1663(int arg0) {
        if (arg0 != -29919) {
            this.method1669(-67, (class189) null, -18);
        }
        field4342++;
        if (this.field4345 == -1) {
            if (this.field4361 == null) {
                this.field4345 = 0;
            } else {
                this.field4345 = 2;
            }
        }
        if (this.field4350 != -1) {
            return;
        }
        if (this.field4361 == null) {
            this.field4350 = 0;
        } else {
            this.field4350 = 2;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLfl;Lvc;II)Lvc;")
    public final class189 method1664(byte arg0, class241 arg1, class189 arg2, int arg3, int arg4) {
        field4354++;
        int var6 = this.field4341[arg3];
        class47 var7 = class253.method1747(var6 >> 16, -88);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method1661(arg4, 31042, arg2);
        }
        int var9 = arg1.field4341[arg4];
        class47 var10 = class253.method1747(var9 >> 16, -82);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class189 var12 = arg2.method427(!var7.method344(88, var8), !this.field4371);
            var12.method418(var7, var8, this.field4371);
            return var12;
        }
        if (arg0 != -93) {
            this.method1663(69);
        }
        class189 var13 = arg2.method427(!var7.method344(103, var8) & !var10.method344(36, var11), !this.field4371 & !arg1.field4371);
        var13.method426(var7, var8, var10, var11, this.field4361, this.field4371 | arg1.field4371);
        return var13;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
    public static final void method1665(int arg0, int arg1) {
        if (arg1 == 5) {
            field4365++;
            class195 var2 = class178.method1229(arg0, 11, arg1 - 116);
            var2.method1340(true);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLlk;)V")
    public static final void method1666(byte arg0, class81 arg1) {
        field4355++;
        if (class163.field2968 == arg1.field1563 || arg1.field1541 == -1 || arg1.field1539 != 0 || arg1.field1566 + 1 > class245.method1706(arg1.field1541, (byte) 127).field4344[arg1.field1521]) {
            int var2 = class163.field2968 - arg1.field1542;
            int var3 = arg1.field1563 - arg1.field1542;
            int var4 = arg1.field1514 * 128 + (arg1.method577((byte) -76) * 64);
            int var5 = arg1.field1532 * 128 + (arg1.method577((byte) -80) * 64);
            int var6 = arg1.field1560 * 128 + (arg1.method577((byte) -114) * 64);
            int var7 = arg1.field1556 * 128 + (arg1.method577((byte) -87) * 64);
            arg1.field1571 = ((var3 - var2) * var4 + (var2 * var6)) / var3;
            arg1.field1534 = ((var3 - var2) * var5 + var2 * var7) / var3;
        }
        if (arg1.field1535 == 0) {
            arg1.field1570 = 1024;
        }
        arg1.field1554 = 0;
        if (arg0 != 2) {
            return;
        }
        if (arg1.field1535 == 1) {
            arg1.field1570 = 1536;
        }
        if (arg1.field1535 == 2) {
            arg1.field1570 = 0;
        }
        if (arg1.field1535 == 3) {
            arg1.field1570 = 512;
        }
        arg1.field1504 = arg1.field1570;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLvc;II)Lvc;")
    public final class189 method1667(byte arg0, class189 arg1, int arg2, int arg3) {
        int var5 = this.field4341[arg2];
        field4356++;
        class47 var6 = class253.method1747(var5 >> 16, -127);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method427(true, true);
        }
        int var8 = arg3 & 0x3;
        if (arg0 >= -39) {
            this.method1661(-35, -52, (class189) null);
        }
        class189 var9 = arg1.method427(!var6.method344(37, var7), !this.field4371);
        if (var8 == 1) {
            var9.method408();
        } else if (var8 == 2) {
            var9.method435();
        } else if (var8 == 3) {
            var9.method412();
        }
        var9.method418(var6, var7, this.field4371);
        if (var8 == 1) {
            var9.method412();
        } else if (var8 == 2) {
            var9.method435();
        } else if (var8 == 3) {
            var9.method408();
        }
        return var9;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)Z")
    public static final boolean method1668(int arg0, int arg1) {
        if (arg1 >= -121) {
            return true;
        } else {
            field4347++;
            return (arg0 & -arg0) == arg0;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILvc;I)Lvc;")
    public final class189 method1669(int arg0, class189 arg1, int arg2) {
        field4363++;
        int var4 = this.field4341[arg2];
        if (arg0 >= -77) {
            return null;
        }
        class47 var5 = class253.method1747(var4 >> 16, -63);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method427(true, true);
        }
        int var7 = 0;
        class47 var8 = null;
        if (this.field4364 != null && arg2 < this.field4364.length) {
            int var9 = this.field4364[arg2];
            var8 = class253.method1747(var9 >> 16, -111);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class189 var11 = arg1.method427(!var5.method344(57, var6), !this.field4371);
            var11.method418(var5, var6, this.field4371);
            return var11;
        } else {
            class189 var10 = arg1.method427(!var5.method344(42, var6) & !var8.method344(70, var7), !this.field4371);
            var10.method418(var5, var6, this.field4371);
            var10.method418(var8, var7, this.field4371);
            return var10;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lvc;II)Lvc;")
    public final class189 method1670(class189 arg0, int arg1, int arg2) {
        int var4 = this.field4341[arg1];
        field4343++;
        if (arg2 != -8) {
            return null;
        }
        class47 var5 = class253.method1747(var4 >> 16, -61);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method425(true, true);
        } else {
            class189 var7 = arg0.method425(!var5.method344(31, var6), !this.field4371);
            var7.method418(var5, var6, this.field4371);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public static void method1671(byte arg0) {
        field4340 = null;
        if (arg0 != 68) {
            field4360 = 64;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILtf;)V")
    private final void method1672(int arg0, int arg1, class106 arg2) {
        if (arg0 == 1) {
            int var4 = arg2.method736(122);
            this.field4344 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4344[var5] = arg2.method736(123);
            }
            this.field4341 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4341[var6] = arg2.method736(124);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field4341[var7] += arg2.method736(123) << 16;
            }
        } else if (arg0 == 2) {
            this.field4366 = arg2.method736(122);
        } else if (arg0 == 3) {
            int var15 = arg2.method774((byte) 75);
            this.field4361 = new int[var15 + 1];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field4361[var16] = arg2.method774((byte) 101);
            }
            this.field4361[var15] = 9999999;
        } else if (arg0 == 4) {
            this.field4353 = true;
        } else if (arg0 == 5) {
            this.field4362 = arg2.method774((byte) 102);
        } else if (arg0 == 6) {
            this.field4368 = arg2.method736(127);
        } else if (arg0 == 7) {
            this.field4359 = arg2.method736(121);
        } else if (arg0 == 8) {
            this.field4370 = arg2.method774((byte) 91);
        } else if (arg0 == 9) {
            this.field4345 = arg2.method774((byte) 81);
        } else if (arg0 == 10) {
            this.field4350 = arg2.method774((byte) 97);
        } else if (arg0 == 11) {
            this.field4367 = arg2.method774((byte) 96);
        } else if (arg0 == 12) {
            int var12 = arg2.method774((byte) 88);
            this.field4364 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field4364[var13] = arg2.method736(124);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field4364[var14] = (arg2.method736(127) << 16) + this.field4364[var14];
            }
        } else if (arg0 == 13) {
            int var8 = arg2.method736(123);
            this.field4358 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method774((byte) 125);
                if (var10 > 0) {
                    this.field4358[var9] = new int[var10];
                    this.field4358[var9][0] = arg2.method776(125);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field4358[var9][var11] = arg2.method736(127);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field4371 = true;
        }
        field4348++;
        if (arg1 >= -51) {
            this.field4361 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILsj;I)Lwd;")
    public static final class22 method1673(int arg0, class49 arg1, int arg2) {
        field4357++;
        if (arg2 == -26688) {
            byte[] var3 = arg1.method355((byte) 53, arg0);
            return var3 == null ? null : new class22(var3);
        } else {
            return null;
        }
    }
}

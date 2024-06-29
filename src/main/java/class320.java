import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class320 {

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public int field4408 = -1;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Z")
    public boolean field4410 = false;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public int field4414 = 0;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public int field4415 = -1;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public int field4420 = -1;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public int field4421 = -1;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public int field4419 = 2;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Z")
    public boolean field4422 = false;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public int field4430 = 5;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "Z")
    public boolean field4429 = false;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public int field4409 = -1;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public int field4407 = 99;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "Luv;")
    public static class3 field4426 = new class3(25, 6);

    @OriginalMember(owner = "client!na", name = "B", descriptor = "Llg;")
    public static class32 field4434 = new class32();

    @OriginalMember(owner = "client!na", name = "C", descriptor = "[I")
    public static int[] field4435 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public int field4428;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Lok;")
    public class97 field4411;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "[I")
    private int[] field4423;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "[I")
    public int[] field4431;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "[I")
    public int[] field4432;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "[Z")
    public boolean[] field4425;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "[[I")
    public int[][] field4418;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static void method1992(int arg0) {
        field4426 = null;
        if (arg0 != -1) {
            method1992(-60);
        }
        field4435 = null;
        field4434 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZII)I")
    public final int method1993(int arg0, boolean arg1, int arg2, int arg3) {
        field4412++;
        int var5 = 0;
        int var6 = arg3;
        int var7 = this.field4431[arg0];
        class556 var8 = null;
        class556 var9 = this.field4411.method536(var7 >> 16, (byte) -46);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field4410 || class551.field7667) && arg2 != -1 && arg2 < this.field4431.length) {
            int var11 = this.field4431[arg2];
            var8 = this.field4411.method536(var11 >> 16, (byte) -46);
            var6 = var11 & 0xFFFF;
        }
        if (this.field4422) {
            var5 |= 0x200;
        }
        if (var9.method3113(var10, 25971)) {
            var5 |= 0x80;
        }
        if (var9.method3114(var10, 0)) {
            var5 |= 0x100;
        }
        if (var9.method3116(arg3 ^ 0xFFFF9030, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method3113(var6, 25971)) {
                var5 |= 0x80;
            }
            if (var8.method3114(var6, 0)) {
                var5 |= 0x100;
            }
            if (var8.method3116(-28624, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field4423 != null && arg1) {
            if (this.field4423.length > arg0) {
                int var12 = this.field4423[arg0];
                if (var12 != 65535) {
                    class556 var13 = this.field4411.method536(var12 >> 16, (byte) -46);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method3113(var14, 25971)) {
                            var5 |= 0x80;
                        }
                        if (var13.method3114(var14, 0)) {
                            var5 |= 0x100;
                        }
                        if (var13.method3116(-28624, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field4410 || class551.field7667) && arg2 != -1 && arg2 < this.field4423.length) {
                int var15 = this.field4423[arg2];
                if (var15 != 65535) {
                    class556 var16 = this.field4411.method536(var15 >> 16, (byte) -46);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method3113(var17, arg3 + 25971)) {
                            var5 |= 0x80;
                        }
                        if (var16.method3114(var17, arg3)) {
                            var5 |= 0x100;
                        }
                        if (var16.method3116(-28624, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static final void method1994(int arg0) {
        class90.method501(class15.field162, -1);
        field4413++;
        class582.field8216++;
        if (class495.field6900 && class475.field6702) {
            int var1 = class343.field4760.method100((byte) -111);
            if (arg0 == 0) {
                int var2 = class343.field4760.method92(8);
                int var3 = var2 - class520.field7240;
                int var4 = var1 - class624.field9002;
                if (var4 < class227.field2905) {
                    var4 = class227.field2905;
                }
                if (var4 + class15.field162.field6330 > class227.field2905 + class254.field3157.field6330) {
                    var4 = class254.field3157.field6330 + class227.field2905 - class15.field162.field6330;
                }
                if (var3 < class384.field5356) {
                    var3 = class384.field5356;
                }
                if (class384.field5356 + class254.field3157.field6218 < class15.field162.field6218 + var3) {
                    var3 = class384.field5356 + class254.field3157.field6218 - class15.field162.field6218;
                }
                int var5 = var4 + class254.field3157.field6291 - class227.field2905;
                int var6 = var3 + class254.field3157.field6280 - class384.field5356;
                if (class343.field4760.method2078((byte) 92)) {
                    if (class582.field8216 > class15.field162.field6225) {
                        int var8 = var4 - class646.field9350;
                        int var9 = var3 - class558.field7813;
                        if (class15.field162.field6239 < var8 || var8 < (-class15.field162.field6239) || var9 > class15.field162.field6239 || -class15.field162.field6239 > var9) {
                            class496.field6917 = true;
                        }
                    }
                    if (class15.field162.field6232 != null && class496.field6917) {
                        class9 var10 = new class9();
                        var10.field85 = var5;
                        var10.field83 = var6;
                        var10.field81 = class15.field162.field6232;
                        var10.field77 = class15.field162;
                        class218.method1408(var10);
                    }
                } else {
                    if (class496.field6917) {
                        class606.method3471(arg0 ^ 0x64);
                        if (class15.field162.field6279 != null) {
                            class9 var7 = new class9();
                            var7.field81 = class15.field162.field6279;
                            var7.field77 = class15.field162;
                            var7.field85 = var5;
                            var7.field79 = class103.field1353;
                            var7.field83 = var6;
                            class218.method1408(var7);
                        }
                        if (class103.field1353 != null && client.method3570(class15.field162) != null) {
                            class353.method2203(class15.field162, (byte) -128, class103.field1353);
                        }
                    } else if ((class598.field8641 == 1 || class179.method1105((byte) 3)) && class50.field673 > 2) {
                        class254.method1534(class646.field9350 + class624.field9002, class520.field7240 - -class558.field7813, 13772);
                    } else if (class221.method1417(arg0 ^ 0xFFFFFFB1)) {
                        class254.method1534(class646.field9350 + class624.field9002, class558.field7813 + class520.field7240, arg0 ^ 0x35CC);
                    }
                    class15.field162 = null;
                }
            }
        } else if (class582.field8216 > 1) {
            class15.field162 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIBLr;I)Lr;")
    public final class521 method1995(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class521 arg6, int arg7) {
        field4427++;
        int var9 = this.field4432[arg0];
        int var10 = this.field4431[arg0];
        class556 var11 = this.field4411.method536(var10 >> 16, (byte) -46);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg6.method1607(arg5, arg3, true);
        }
        class556 var13 = null;
        if ((this.field4410 || class551.field7667) && arg4 != -1 && arg4 < this.field4431.length) {
            int var14 = this.field4431[arg4];
            var13 = this.field4411.method536(var14 >> 16, (byte) -46);
            arg4 = var14 & 0xFFFF;
        }
        if (this.field4422) {
            arg3 |= 0x200;
        }
        if (var11.method3113(var12, 25971)) {
            arg3 |= 0x80;
        }
        if (var11.method3114(var12, 0)) {
            arg3 |= 0x100;
        }
        if (var11.method3116(-28624, var12)) {
            arg3 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3113(arg4, 25971)) {
                arg3 |= 0x80;
            }
            if (var13.method3114(arg4, arg1 - 32)) {
                arg3 |= 0x100;
            }
            if (var13.method3116(arg1 ^ 0xFFFF9010, arg4)) {
                arg3 |= 0x400;
            }
        }
        int var15 = arg3 | arg1;
        class521 var16 = arg6.method1607(arg5, var15, true);
        var16.method2910(var11, var9, arg2 - 1, var13, arg4, arg7, 2, var12, this.field4422);
        return var16;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILr;III)Lr;")
    public final class521 method1996(int arg0, int arg1, class521 arg2, int arg3, int arg4, int arg5) {
        field4433++;
        int var7 = this.field4432[arg5];
        int var8 = this.field4431[arg5];
        class556 var9 = this.field4411.method536(var8 >> 16, (byte) -46);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method1607((byte) 1, arg3, true);
        }
        class556 var11 = null;
        if ((this.field4410 || class551.field7667) && arg0 != -1 && this.field4431.length > arg0) {
            int var12 = this.field4431[arg0];
            var11 = this.field4411.method536(var12 >> 16, (byte) -46);
            arg0 = var12 & 0xFFFF;
        }
        if (arg4 != -2086254192) {
            this.method1996(-1, 7, null, -11, 115, -15);
        }
        class556 var13 = null;
        class556 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field4423 != null) {
            if (this.field4423.length > arg5) {
                var15 = this.field4423[arg5];
                if (var15 != 65535) {
                    var13 = this.field4411.method536(var15 >> 16, (byte) -46);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field4410 || class551.field7667) && arg0 != -1 && arg0 < this.field4423.length) {
                var16 = this.field4423[arg0];
                if (var16 != 65535) {
                    var14 = this.field4411.method536(var16 >> 16, (byte) -46);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field4422) {
            arg3 |= 0x200;
        }
        if (var9.method3113(var10, 25971)) {
            arg3 |= 0x80;
        }
        if (var9.method3114(var10, 0)) {
            arg3 |= 0x100;
        }
        if (var9.method3116(-28624, var10)) {
            arg3 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3113(var15, 25971)) {
                arg3 |= 0x80;
            }
            if (var13.method3114(var15, 0)) {
                arg3 |= 0x100;
            }
            if (var13.method3116(arg4 ^ 0x7C59D9A0, var15)) {
                arg3 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method3113(arg0, 25971)) {
                arg3 |= 0x80;
            }
            if (var11.method3114(arg0, 0)) {
                arg3 |= 0x100;
            }
            if (var11.method3116(arg4 ^ 0x7C59D9A0, arg0)) {
                arg3 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method3113(var16, 25971)) {
                arg3 |= 0x80;
            }
            if (var14.method3114(var16, 0)) {
                arg3 |= 0x100;
            }
            if (var14.method3116(-28624, var16)) {
                arg3 |= 0x400;
            }
        }
        int var17 = arg3 | 0x20;
        class521 var18 = arg2.method1607((byte) 1, var17, true);
        var18.method2910(var9, var7, arg1 - 1, var11, arg0, 0, 2, var10, this.field4422);
        if (var13 != null) {
            var18.method2910(var13, var7, arg1 - 1, var14, var16, 0, 2, var15, this.field4422);
        }
        return var18;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILge;)V")
    private final void method1997(int arg0, int arg1, class551 arg2) {
        int var4 = 59 / ((52 - arg0) / 53);
        if (arg1 == 1) {
            int var14 = arg2.method3090(-106);
            this.field4432 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field4432[var15] = arg2.method3090(-98);
            }
            this.field4431 = new int[var14];
            for (int var16 = 0; var16 < var14; var16++) {
                this.field4431[var16] = arg2.method3090(-82);
            }
            for (int var17 = 0; var17 < var14; var17++) {
                this.field4431[var17] = (arg2.method3090(-83) << 16) + this.field4431[var17];
            }
        } else if (arg1 == 2) {
            this.field4421 = arg2.method3090(-117);
        } else if (arg1 == 3) {
            this.field4425 = new boolean[256];
            int var5 = arg2.method3045(-128);
            for (int var6 = 0; var6 < var5; var6++) {
                this.field4425[arg2.method3045(-127)] = true;
            }
        } else if (arg1 == 5) {
            this.field4430 = arg2.method3045(-125);
        } else if (arg1 == 6) {
            this.field4420 = arg2.method3090(-111);
        } else if (arg1 == 7) {
            this.field4409 = arg2.method3090(-87);
        } else if (arg1 == 8) {
            this.field4407 = arg2.method3045(-128);
        } else if (arg1 == 9) {
            this.field4415 = arg2.method3045(-126);
        } else if (arg1 == 10) {
            this.field4408 = arg2.method3045(-126);
        } else if (arg1 == 11) {
            this.field4419 = arg2.method3045(-127);
        } else if (arg1 == 12) {
            int var7 = arg2.method3045(-125);
            this.field4423 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4423[var8] = arg2.method3090(-72);
            }
            for (int var9 = 0; var9 < var7; var9++) {
                this.field4423[var9] += arg2.method3090(-107) << 16;
            }
        } else if (arg1 == 13) {
            int var10 = arg2.method3090(-93);
            this.field4418 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg2.method3045(-127);
                if (var12 > 0) {
                    this.field4418[var11] = new int[var12];
                    this.field4418[var11][0] = arg2.method3043((byte) 49);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field4418[var11][var13] = arg2.method3090(-118);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field4422 = true;
        } else if (arg1 == 15) {
            this.field4410 = true;
        } else if (arg1 == 16) {
            this.field4429 = true;
        } else if (arg1 == 17) {
            this.field4414 = arg2.method3045(-127);
        }
        field4416++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLge;)V")
    public final void method1998(byte arg0, class551 arg1) {
        if (arg0 >= -30) {
            this.method1995(120, 4, -126, -85, 13, (byte) -115, null, -94);
        }
        while (true) {
            int var3 = arg1.method3045(-128);
            if (var3 == 0) {
                field4417++;
                return;
            }
            this.method1997(124, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
    public final void method1999(int arg0) {
        field4424++;
        if (arg0 != 7550) {
            return;
        }
        if (this.field4408 == -1) {
            if (this.field4425 == null) {
                this.field4408 = 0;
            } else {
                this.field4408 = 2;
            }
        }
        if (this.field4415 != -1) {
            return;
        }
        if (this.field4425 == null) {
            this.field4415 = 0;
        } else {
            this.field4415 = 2;
        }
    }
}

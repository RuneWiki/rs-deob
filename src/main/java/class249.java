import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class249 extends class108 {

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    private int field4432 = -32768;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Z")
    public boolean field4419 = false;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    private int field4438 = 0;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    private int field4442 = 0;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    private int field4428 = -1;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public int field4429;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public int field4424;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "I")
    public int field4447;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    private int field4425;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public int field4420;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public int field4433;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "Ldb;")
    private class182 field4440;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "Lud;")
    public static class279 field4426 = class130.method1024("Poser", 255);

    @OriginalMember(owner = "client!md", name = "x", descriptor = "Lud;")
    public static class279 field4431 = class130.method1024("M-Bmoire attribu-Be", 255);

    @OriginalMember(owner = "client!md", name = "D", descriptor = "[I")
    public static int[] field4436 = new int[100];

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public static int field4443 = 1;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "[Z")
    public static boolean[] field4446 = new boolean[100];

    @OriginalMember(owner = "client!md", name = "t", descriptor = "Lhc;")
    public static class171 field4427 = new class171(64);

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "[J")
    public static long[] field4448 = new long[32];

    @OriginalMember(owner = "client!md", name = "S", descriptor = "[Lvh;")
    public static class53[] field4450 = new class53[2048];

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public static int field4449 = 0;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Lok;")
    public static class149 field4421;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "Lia;")
    public static class206 field4444;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "Llb;")
    private class208 field4434;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "()I", line = 5)
    public final int method184() {
        field4437++;
        return this.field4432;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V", line = 16)
    public final void method1781(int arg0, int arg1) {
        field4430++;
        if (this.field4419) {
            return;
        }
        this.field4442 += arg0;
        while (this.field4442 > this.field4440.field3318[this.field4438]) {
            this.field4442 -= this.field4440.field3318[this.field4438];
            this.field4438++;
            if (this.field4440.field3341.length <= this.field4438) {
                this.field4419 = true;
                break;
            }
        }
        if (arg1 > -68) {
            method1784(70, 9, 72, -13, -123, 33, -124);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZI)V", line = 49)
    public static final void method1782(boolean arg0, int arg1) {
        field4422++;
        if ((class72.field1420.field86 >> 7) == class100.field1882 && (class72.field1420.field79 >> 7) == class72.field1415) {
            class100.field1882 = 0;
        }
        int var2 = class103.field1931;
        if (arg0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class239 var4;
            if (arg0) {
                var4 = class72.field1420;
            } else {
                var4 = class96.field1780[class252.field4503[var3]];
            }
            if (var4 != null && var4.method2(27121)) {
                int var5 = var4.method3((byte) -94);
                if (var5 == 1) {
                    if ((var4.field86 & 0x7F) == 64 && (var4.field79 & 0x7F) == 64) {
                        int var6 = var4.field79 >> 7;
                        int var7 = var4.field86 >> 7;
                        if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                            var10002 = class229.field3984[var7][var6]++;
                        }
                    }
                } else if (((var5 & 0x1) != 0 || (var4.field86 & 0x7F) == 0 && (var4.field79 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field86 & 0x7F) == 64 && (var4.field79 & 0x7F) == 64)) {
                    int var8 = var4.field86 - (var5 * 64) >> 7;
                    int var9 = var4.field79 - (var5 * 64) >> 7;
                    int var10 = var4.method3((byte) -109) + var8;
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    if (var10 > 104) {
                        var10 = 104;
                    }
                    int var11 = var9 + var4.method3((byte) -101);
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    if (var11 > 104) {
                        var11 = 104;
                    }
                    for (int var12 = var8; var12 < var10; var12++) {
                        for (int var13 = var9; var13 < var11; var13++) {
                            var10002 = class229.field3984[var12][var13]++;
                        }
                    }
                }
            }
        }
        label223: for (int var14 = 0; var14 < var2; var14++) {
            class239 var15;
            long var16;
            if (arg0) {
                var16 = 8791798054912L;
                var15 = class72.field1420;
            } else {
                var15 = class96.field1780[class252.field4503[var14]];
                var16 = (long) class252.field4503[var14] << 32;
            }
            if (var15 != null && var15.method2(27121)) {
                var15.field4207 = false;
                if ((class86.field1614 && class103.field1931 > 200 || class103.field1931 > 50) && !arg0 && var15.field25 == var15.method15(116).field765) {
                    var15.field4207 = true;
                }
                int var18 = var15.method3((byte) -103);
                if (var18 == 1) {
                    if ((var15.field86 & 0x7F) == 64 && (var15.field79 & 0x7F) == 64) {
                        int var28 = var15.field79 >> 7;
                        int var29 = var15.field86 >> 7;
                        if (var29 < 0 || var29 >= 104 || var28 < 0 || var28 >= 104) {
                            continue;
                        }
                        if (class229.field3984[var29][var28] > 1) {
                            var10002 = class229.field3984[var29][var28]--;
                            continue;
                        }
                    }
                } else if ((var18 & 0x1) == 0 && (var15.field86 & 0x7F) == 0 && (var15.field79 & 0x7F) == 0 || (var18 & 0x1) == 1 && (var15.field86 & 0x7F) == 64 && (var15.field79 & 0x7F) == 0) {
                    int var19 = var15.field86 - (var18 * 64) >> 7;
                    int var20 = var15.field79 - var18 * 64 >> 7;
                    int var21 = var18 + var19;
                    if (var21 > 104) {
                        var21 = 104;
                    }
                    int var22 = var20 + var18;
                    if (var22 > 104) {
                        var22 = 104;
                    }
                    if (var19 < 0) {
                        var19 = 0;
                    }
                    boolean var23 = true;
                    if (var20 < 0) {
                        var20 = 0;
                    }
                    for (int var24 = var19; var24 < var21; var24++) {
                        for (int var25 = var20; var25 < var22; var25++) {
                            if (class229.field3984[var24][var25] <= 1) {
                                var23 = false;
                                break;
                            }
                        }
                    }
                    if (var23) {
                        int var26 = var19;
                        while (true) {
                            if (var26 >= var21) {
                                continue label223;
                            }
                            for (int var27 = var20; var27 < var22; var27++) {
                                var10002 = class229.field3984[var26][var27]--;
                            }
                            var26++;
                        }
                    }
                }
                if (var15.field24 == null || var15.field76 > class8.field279 || var15.field41 <= class8.field279) {
                    var15.field70 = class130.method1025(var15.field86, 1008652135, class287.field5134, var15.field79);
                    class320.method2251(class287.field5134, var15.field86, var15.field79, var15.field70, var18 * 64 + 60 - 64, var15, var15.field44, var16, var15.field20);
                } else {
                    var15.field4207 = false;
                    var15.field70 = class130.method1025(var15.field86, 1008652135, class287.field5134, var15.field79);
                    class284.method2035(class287.field5134, var15.field86, var15.field79, var15.field70, var15, var15.field44, var16, var15.field56, var15.field100, var15.field72, var15.field67);
                }
            }
        }
        if (arg1 > -91) {
            method1785((class149) null, 8, (class149) null);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)V", line = 309)
    public final void method179(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4435++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Lga;", line = 325)
    private final class19 method1783(byte arg0) {
        if (arg0 >= -13) {
            method1785((class149) null, -27, (class149) null);
        }
        class213 var2 = class103.method874(this.field4425, -601);
        field4451++;
        class19 var3;
        if (this.field4419) {
            var3 = var2.method1566(-1, false, 0, -1);
        } else {
            var3 = var2.method1566(this.field4438, false, this.field4442, this.field4428);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIIIJILlb;)V", line = 349)
    public final void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class208 arg10) {
        field4441++;
        class19 var13 = this.method1783((byte) -56);
        if (var13 != null) {
            var13.method186(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4434);
            this.field4432 = var13.method184();
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIII)V", line = 378)
    public static final void method1784(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4439++;
        class8 var7 = class103.method868(250, arg2, arg6);
        if (arg0 != -13180) {
            method1785((class149) null, -43, (class149) null);
        }
        if (var7 != null && var7.field156 != null) {
            class23 var8 = new class23();
            var8.field608 = var7.field156;
            var8.field596 = var7;
            class279.method2017(0, var8);
        }
        class230.field4016 = arg3;
        class222.field3935 = arg1;
        class38.field848 = true;
        class315.field5545 = arg6;
        class271.field4839 = arg5;
        class248.field4409 = arg4;
        class236.field4107 = arg2;
        class50.method426(var7, false);
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(IIIIIII)V", line = 480)
    public class249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4429 = arg1;
        this.field4424 = arg5 + arg6;
        this.field4447 = arg3;
        this.field4425 = arg0;
        this.field4420 = arg2;
        this.field4433 = arg4;
        int var8 = class103.method874(this.field4425, -601).field3755;
        if (var8 == -1) {
            this.field4419 = true;
        } else {
            this.field4419 = false;
            this.field4440 = class131.method1033((byte) -82, var8);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(Lok;ILok;)V", line = 414)
    public static final void method1785(class149 arg0, int arg1, class149 arg2) {
        class261.field4638 = arg0;
        class94.field1771 = arg2;
        if (arg1 <= 23) {
            method1784(-67, -34, 67, 116, 123, 100, -54);
        }
        field4423++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 429)
    public static void method1786(int arg0) {
        field4444 = null;
        field4421 = null;
        field4427 = null;
        field4436 = null;
        field4450 = null;
        field4426 = null;
        if (arg0 < 52) {
            method1785((class149) null, 95, (class149) null);
        }
        field4448 = null;
        field4446 = null;
        field4431 = null;
    }
}

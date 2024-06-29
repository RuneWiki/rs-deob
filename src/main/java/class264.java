import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class264 extends class240 {

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    private int field4523 = 409;

    @OriginalMember(owner = "client!uh", name = "cb", descriptor = "I")
    private int field4533 = 204;

    @OriginalMember(owner = "client!uh", name = "fb", descriptor = "I")
    private int field4536 = 4;

    @OriginalMember(owner = "client!uh", name = "jb", descriptor = "I")
    private int field4540 = 1024;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "I")
    private int field4522 = 0;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    private int field4524 = 81;

    @OriginalMember(owner = "client!uh", name = "nb", descriptor = "I")
    private int field4544 = 1024;

    @OriginalMember(owner = "client!uh", name = "rb", descriptor = "I")
    private int field4548 = 8;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "Lcd;")
    public static class64 field4525 = class44.method335((byte) 71, "Hierhin gehen");

    @OriginalMember(owner = "client!uh", name = "kb", descriptor = "I")
    public static int field4541 = 0;

    @OriginalMember(owner = "client!uh", name = "qb", descriptor = "Lcd;")
    public static class64 field4547 = class44.method335((byte) 71, "k");

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "F")
    public static float field4521;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    private int field4526;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    private int field4527;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!uh", name = "ab", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!uh", name = "db", descriptor = "I")
    private int field4534;

    @OriginalMember(owner = "client!uh", name = "eb", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!uh", name = "gb", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!uh", name = "hb", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!uh", name = "mb", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!uh", name = "ob", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!uh", name = "pb", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!uh", name = "bb", descriptor = "[I")
    private int[] field4532;

    @OriginalMember(owner = "client!uh", name = "ib", descriptor = "[[I")
    private int[][] field4539;

    @OriginalMember(owner = "client!uh", name = "lb", descriptor = "[[I")
    private int[][] field4542;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "[[[B")
    public static byte[][][] field4528;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method12(int arg0, int arg1) {
        if (arg0 != 64) {
            method1853(-123, (class60[]) null, -60, -106, (byte) -88, true);
        }
        int[] var3 = this.field4094.method179(arg1, true);
        field4546++;
        if (this.field4094.field344) {
            int var4 = 0;
            int var5;
            for (var5 = class268.field4615[arg1] + this.field4522; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field4548 > var4 && this.field4532[var4] <= var5) {
                var4++;
            }
            boolean var6 = (var4 & 0x1) == 0;
            int var7 = var4 - 1;
            int var8 = this.field4532[var4];
            int var9 = this.field4532[var4 - 1];
            if (var5 > this.field4527 + var9 && var8 - this.field4527 > var5) {
                for (int var10 = 0; var10 < class169.field2936; var10++) {
                    int var11 = var6 ? this.field4540 : -this.field4540;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field4526 * var11 >> 12) + class74.field1408[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field4536 > var12 && this.field4542[var7][var12] <= var13) {
                        var12++;
                    }
                    int var14 = this.field4542[var7][var12];
                    int var15 = var12 - 1;
                    int var16 = this.field4542[var7][var15];
                    if ((this.field4527 + var16) < var13 && (var14 - this.field4527) > var13) {
                        var3[var10] = this.field4539[var7][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class95.method718(var3, 0, class169.field2936, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)V", line = 113)
    public static void method1849(int arg0) {
        field4525 = null;
        field4547 = null;
        field4528 = (byte[][][]) null;
        if (arg0 >= -5) {
            field4547 = (class64) null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILkh;)V", line = 149)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg1 == 0) {
            this.field4536 = arg2.method152((byte) -111);
        } else if (arg1 == 1) {
            this.field4548 = arg2.method152((byte) -95);
        } else if (arg1 == 2) {
            this.field4523 = arg2.method112((byte) 92);
        } else if (arg1 == 3) {
            this.field4533 = arg2.method112((byte) 92);
        } else if (arg1 == 4) {
            this.field4540 = arg2.method112((byte) 92);
        } else if (arg1 == 5) {
            this.field4522 = arg2.method112((byte) 92);
        } else if (arg1 == 6) {
            this.field4524 = arg2.method112((byte) 92);
        } else if (arg1 == 7) {
            this.field4544 = arg2.method112((byte) 92);
        }
        if (arg0 != 2) {
            this.field4542 = (int[][]) ((int[][]) null);
        }
        field4537++;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V", line = 223)
    public class264() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lkh;I)Lb;", line = 227)
    public static final class56 method1850(class13 arg0, int arg1) {
        field4545++;
        int var2 = -24 % ((arg1 + 31) / 45);
        return new class56(arg0.method153(-121), arg0.method153(111), arg0.method153(-73), arg0.method153(65), arg0.method111(1263702152), arg0.method111(1263702152), arg0.method152((byte) -97));
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(III)V", line = 241)
    public static final void method1851(int arg0, int arg1, int arg2) {
        field4530++;
        if (arg1 > -104) {
            method1851(98, 74, 40);
        }
        class299 var3 = class158.method1135(arg0, -104, 5);
        var3.method2091(19);
        var3.field5153 = arg2;
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V", line = 257)
    public final void method288(int arg0) {
        this.method1852(arg0 - 17691);
        field4535++;
        if (arg0 != 17772) {
            this.field4536 = -16;
        }
    }

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)V", line = 270)
    private final void method1852(int arg0) {
        Random var2 = new Random((long) this.field4548);
        this.field4527 = this.field4524 / 2;
        this.field4532 = new int[this.field4548 + 1];
        this.field4539 = new int[this.field4548][this.field4536];
        this.field4534 = 4096 / this.field4548;
        field4531++;
        if (arg0 != 81) {
            return;
        }
        this.field4532[0] = 0;
        this.field4526 = 4096 / this.field4536;
        this.field4542 = new int[this.field4548][this.field4536 + 1];
        int var3 = this.field4526 / 2;
        int var4 = this.field4534 / 2;
        for (int var5 = 0; var5 < this.field4548; var5++) {
            if (var5 > 0) {
                int var6 = this.field4534;
                int var7 = (class206.method1439(var2, (byte) 126, 4096) - 2048) * this.field4533 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4532[var5] = this.field4532[var5 - 1] + var8;
            }
            this.field4542[var5][0] = 0;
            for (int var9 = 0; var9 < this.field4536; var9++) {
                if (var9 > 0) {
                    int var10 = this.field4526;
                    int var11 = (class206.method1439(var2, (byte) 124, 4096) - 2048) * this.field4523 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4542[var5][var9] = this.field4542[var5][var9 - 1] + var12;
                }
                this.field4539[var5][var9] = this.field4544 > 0 ? 4096 - class206.method1439(var2, (byte) 124, this.field4544) : 4096;
            }
            this.field4542[var5][this.field4536] = 4096;
        }
        this.field4532[this.field4548] = 4096;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[Lja;IIBZ)V", line = 334)
    public static final void method1853(int arg0, class60[] arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        field4520++;
        int var6 = 0;
        if (arg4 != 45) {
            return;
        }
        while (var6 < arg1.length) {
            class60 var7 = arg1[var6];
            if (var7 != null && var7.field1113 == arg2) {
                class206.method1435(arg0, (byte) 85, arg5, arg3, var7);
                class198.method1388(var7, arg3, arg0, arg4 ^ 0xFFFFFFD2);
                if (var7.field1022 > var7.field1171 - var7.field1016) {
                    var7.field1022 = var7.field1171 - var7.field1016;
                }
                if (var7.field1175 > (var7.field1112 - var7.field1163)) {
                    var7.field1175 = var7.field1112 - var7.field1163;
                }
                if (var7.field1022 < 0) {
                    var7.field1022 = 0;
                }
                if (var7.field1175 < 0) {
                    var7.field1175 = 0;
                }
                if (var7.field1091 == 0) {
                    class240.method1744((byte) -116, arg5, var7);
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIIII)V", line = 392)
    public static final void method1854(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 != 15706) {
            return;
        }
        field4538++;
        if (class159.method1148(arg4 - 15707, arg6)) {
            class181.field3118 = null;
            class30.method262(arg7, -1, arg3, class272.field4675[arg6], arg5, (byte) 120, arg8, arg1, arg2, arg0);
            if (class181.field3118 != null) {
                class30.method262(arg7, -1412584499, arg3, class181.field3118, arg5, (byte) 120, class280.field4828, arg1, arg2, class255.field4433);
                class181.field3118 = null;
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class249.field4328[var9] = true;
            }
        } else {
            class249.field4328[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "(I)V", line = 435)
    public static final void method1855(int arg0) {
        field4543++;
        for (int var1 = 0; var1 < class218.field3707; var1++) {
            int var2 = class254.field4422[var1];
            class232 var3 = class2.field12[var2];
            if (var3 != null) {
                class182.method1290((byte) 119, var3, var3.field3911.field141);
            }
        }
        if (arg0 != 6930) {
            method1854(91, -38, 82, -43, -4, -70, -37, 38, 12);
        }
    }
}

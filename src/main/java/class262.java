import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class262 extends class264 {

    @OriginalMember(owner = "client!og", name = "lb", descriptor = "Lma;")
    private static class5 field4473 = class12.method119("Sep", (byte) 109);

    @OriginalMember(owner = "client!og", name = "jb", descriptor = "Lma;")
    private static class5 field4471 = class12.method119("Nov", (byte) 97);

    @OriginalMember(owner = "client!og", name = "pb", descriptor = "Lma;")
    private static class5 field4477 = class12.method119("Dec", (byte) 104);

    @OriginalMember(owner = "client!og", name = "mb", descriptor = "Lma;")
    private static class5 field4474 = class12.method119("May", (byte) 99);

    @OriginalMember(owner = "client!og", name = "fb", descriptor = "Lma;")
    private static class5 field4467 = class12.method119("Jul", (byte) 115);

    @OriginalMember(owner = "client!og", name = "sb", descriptor = "Lma;")
    private static class5 field4480 = class12.method119("Mar", (byte) 82);

    @OriginalMember(owner = "client!og", name = "rb", descriptor = "Lma;")
    private static class5 field4479 = class12.method119("Aug", (byte) 118);

    @OriginalMember(owner = "client!og", name = "vb", descriptor = "Lma;")
    private static class5 field4483 = class12.method119("Cancel", (byte) 94);

    @OriginalMember(owner = "client!og", name = "kb", descriptor = "Lma;")
    public static class5 field4472 = field4483;

    @OriginalMember(owner = "client!og", name = "tb", descriptor = "Lma;")
    private static class5 field4481 = class12.method119("Feb", (byte) 98);

    @OriginalMember(owner = "client!og", name = "qb", descriptor = "Lma;")
    private static class5 field4478 = class12.method119("Jun", (byte) 56);

    @OriginalMember(owner = "client!og", name = "ub", descriptor = "Lma;")
    private static class5 field4482 = class12.method119("Jan", (byte) 107);

    @OriginalMember(owner = "client!og", name = "zb", descriptor = "Lma;")
    private static class5 field4487 = class12.method119("Apr", (byte) 81);

    @OriginalMember(owner = "client!og", name = "Ab", descriptor = "Lma;")
    private static class5 field4488 = class12.method119("Oct", (byte) 71);

    @OriginalMember(owner = "client!og", name = "gb", descriptor = "[Lma;")
    public static class5[] field4468 = new class5[] { field4482, field4481, field4480, field4487, field4474, field4478, field4467, field4479, field4473, field4488, field4471, field4477 };

    @OriginalMember(owner = "client!og", name = "hb", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!og", name = "ib", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!og", name = "nb", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!og", name = "ob", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!og", name = "wb", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!og", name = "yb", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!og", name = "xb", descriptor = "[Lk;")
    private class225[] field4485;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B[Lma;[S)V", line = 14)
    public static final void method1810(byte arg0, class5[] arg1, short[] arg2) {
        int var3 = 0 / ((-arg0 - 62) / 55);
        field4469++;
        class11.method115(arg1.length - 1, 0, 9357, arg2, arg1);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B[[I)V", line = 37)
    private final void method1811(byte arg0, int[][] arg1) {
        if (arg0 != 107) {
            return;
        }
        int var3 = class119.field1807;
        field4484++;
        int var4 = class226.field3716;
        class242.method1706(0, arg1);
        class111.method735(class68.field1082, class256.field4370, 0, arg0 - 226, 0);
        if (this.field4485 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field4485.length; var5++) {
            class225 var6 = this.field4485[var5];
            int var7 = var6.field3704;
            int var8 = var6.field3705;
            if (var7 >= 0) {
                if (var8 >= 0) {
                    var6.method395(var4, var3, (byte) 29);
                } else {
                    var6.method393(var4, var3, (byte) -3);
                }
            } else if (var8 >= 0) {
                var6.method397(var4, var3, (byte) -112);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "h", descriptor = "(I)I", line = 87)
    public static final int method1812(int arg0) {
        field4476++;
        if (class207.field3291 != null) {
            return 2;
        } else if (class116.field1731) {
            return 1;
        } else {
            if (arg0 >= -122) {
                field4488 = (class5) null;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V", line = 109)
    public class262() {
        super(0, true);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)[I", line = 118)
    public final int[] method5(int arg0, int arg1) {
        field4475++;
        int[] var3 = this.field4501.method1176(arg1, 127);
        if (this.field4501.field2741) {
            this.method1811((byte) 107, this.field4501.method1175((byte) 106));
        }
        if (arg0 >= -58) {
            method1813(-53);
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILii;)V", line = 146)
    public final void method4(int arg0, int arg1, class221 arg2) {
        field4470++;
        if (arg0 == 0) {
            this.field4485 = new class225[arg2.method1509(true)];
            for (int var4 = 0; var4 < this.field4485.length; var4++) {
                int var5 = arg2.method1509(true);
                if (var5 == 0) {
                    this.field4485[var4] = class65.method468(true, arg2);
                } else if (var5 == 1) {
                    this.field4485[var4] = class59.method440(arg2, 0);
                } else if (var5 == 2) {
                    this.field4485[var4] = class19.method156((byte) -106, arg2);
                } else if (var5 == 3) {
                    this.field4485[var4] = class185.method1215(-122, arg2);
                }
            }
        } else if (arg0 == 1) {
            this.field4496 = arg2.method1509(true) == 1;
        }
        if (arg1 > -27) {
            method1813(-128);
        }
    }

    @OriginalMember(owner = "client!og", name = "i", descriptor = "(I)V", line = 223)
    public static void method1813(int arg0) {
        field4467 = null;
        field4488 = null;
        if (arg0 != -1) {
            field4473 = (class5) null;
        }
        field4468 = null;
        field4471 = null;
        field4477 = null;
        field4481 = null;
        field4480 = null;
        field4478 = null;
        field4483 = null;
        field4479 = null;
        field4474 = null;
        field4482 = null;
        field4472 = null;
        field4473 = null;
        field4487 = null;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(BI)[[I", line = 290)
    public final int[][] method138(byte arg0, int arg1) {
        int var3 = -38 / ((arg0 + 43) / 55);
        int[][] var4 = this.field4524.method1462(-15077, arg1);
        field4486++;
        if (this.field4524.field3506) {
            int var5 = class226.field3716;
            int var6 = class119.field1807;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = this.field4524.method1464(-90);
            this.method1811((byte) 107, var7);
            for (int var9 = 0; var9 < class119.field1807; var9++) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[1];
                int[] var13 = var11[0];
                int[] var14 = var11[2];
                for (int var15 = 0; var15 < class226.field3716; var15++) {
                    int var16 = var10[var15];
                    var14[var15] = class204.method1354(var16, 255) << 4;
                    var12[var15] = class204.method1354(65280, var16) >> 4;
                    var13[var15] = class204.method1354(var16, 16711680) >> 12;
                }
            }
        }
        return var4;
    }
}

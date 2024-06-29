import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class7 extends class171 {

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "[J")
    private long[] field136 = new long[10];

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    private int field134 = 256;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    private int field125 = 0;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    private int field137 = 1;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "J")
    private long field139 = class25.method182(true);

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field123 = -2;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "S")
    public static short field132 = 1;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "[I")
    public static int[] field121 = new int[32];

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field127 = -1;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "Z")
    public static boolean field135 = true;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "Loh;")
    public static class263 field138 = class253.method1681(-118, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "Loh;")
    private static class263 field140 = class253.method1681(-117, "Connecting to update server");

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "Loh;")
    public static class263 field128 = field140;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "Lue;")
    public static class86 field131;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static final void method43(int arg0) {
        field129++;
        if (arg0 != -6623) {
            field131 = null;
        }
        class150.field2704.method830(50);
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(B)V")
    public static void method44(byte arg0) {
        int var1 = 119 / ((63 - arg0) / 57);
        field121 = null;
        field131 = null;
        field128 = null;
        field138 = null;
        field140 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public final void method45(byte arg0) {
        if (arg0 != -111) {
            method44((byte) -27);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field136[var2] = 0L;
        }
        field122++;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)Loh;")
    public static final class263 method46(int arg0, int arg1) {
        field124++;
        class263 var2 = new class263();
        if (arg1 != 1) {
            field132 = 51;
        }
        var2.field4605 = new byte[arg0];
        var2.field4591 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIB)I")
    public final int method47(int arg0, int arg1, byte arg2) {
        field133++;
        int var4 = this.field134;
        this.field134 = 300;
        int var5 = this.field137;
        this.field137 = 1;
        if (arg2 != -103) {
            field121 = null;
        }
        this.field139 = class25.method182(true);
        if (this.field136[this.field126] == 0L) {
            this.field137 = var5;
            this.field134 = var4;
        } else if (this.field136[this.field126] < this.field139) {
            this.field134 = (int) ((long) (arg1 * 2560) / (this.field139 - this.field136[this.field126]));
        }
        if (this.field134 < 25) {
            this.field134 = 25;
        }
        if (this.field134 > 256) {
            this.field134 = 256;
            this.field137 = (int) ((long) arg1 - ((this.field139 - this.field136[this.field126]) / 10L));
        }
        if (arg1 < this.field137) {
            this.field137 = arg1;
        }
        this.field136[this.field126] = this.field139;
        this.field126 = (this.field126 + 1) % 10;
        if (this.field137 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field136[var6] != 0L) {
                    this.field136[var6] -= -((long) this.field137);
                }
            }
        }
        int var7 = 0;
        if (this.field137 < arg0) {
            this.field137 = arg0;
        }
        class215.method1457((long) this.field137, (byte) 115);
        while (this.field125 < 256) {
            var7++;
            this.field125 += this.field134;
        }
        this.field125 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class7() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field136[var1] = this.field139;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lpc;IIB)V")
    public static final void method48(class21 arg0, int arg1, int arg2, byte arg3) {
        field130++;
        if (class159.field2900 != 0 && class159.field2900 != 3 || !arg0.method156(94)) {
            return;
        }
        int var4 = arg0.field543[arg2];
        if (var4 > arg1 || arg1 > arg0.field512[arg2] + var4) {
            return;
        }
        int var5 = arg2 - arg0.field479 / 2;
        if (arg3 <= 90) {
            return;
        }
        int var6 = arg1 - arg0.field539 / 2;
        int var7 = class241.field4230 + class201.field3625 & 0x7FF;
        int var8 = class270.field4769[var7];
        int var9 = class270.field4762[var7];
        int var10 = (class121.field2255 + 256) * var8 >> 8;
        int var11 = (class121.field2255 + 256) * var9 >> 8;
        int var12 = var5 * var10 + var6 * var11 >> 11;
        int var13 = var5 * var11 - var6 * var10 >> 11;
        int var14 = class229.field4018.field4705 - var13 >> 7;
        int var15 = class229.field4018.field4688 + var12 >> 7;
        if (class4.field82 > 0 && class248.field4342[82] && class248.field4342[81]) {
            class64.method391((byte) -68, class12.field321, class142.field2596 + var14, class93.field1844 + var15);
            return;
        }
        boolean var16 = class131.method845(true, class229.field4018.field4713[0], 1, 0, var15, 0, class229.field4018.field4714[0], var14, 0, 0, 0, (byte) -101);
        if (!var16) {
            return;
        }
        class154.field2792.method1288((byte) -60, var6);
        class154.field2792.method1288((byte) -71, var5);
        class154.field2792.method1276(class241.field4230, -73);
        class154.field2792.method1288((byte) -16, 57);
        class154.field2792.method1288((byte) -114, class201.field3625);
        class154.field2792.method1288((byte) -110, class121.field2255);
        class154.field2792.method1288((byte) -73, 89);
        class154.field2792.method1276(class229.field4018.field4688, -97);
        class154.field2792.method1276(class229.field4018.field4705, -62);
        class154.field2792.method1288((byte) -62, class209.field3774);
        class154.field2792.method1288((byte) -10, 63);
    }
}

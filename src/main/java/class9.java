import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CUQKGTCO")
public class class9 {

    @OriginalMember(owner = "CUQKGTCO", name = "a", descriptor = "I")
    private int field558 = 34;

    @OriginalMember(owner = "CUQKGTCO", name = "f", descriptor = "[LAQBPXQWT;")
    private class2[] field563 = new class2[10];

    @OriginalMember(owner = "CUQKGTCO", name = "b", descriptor = "[LCUQKGTCO;")
    private static class9[] field559 = new class9[5000];

    @OriginalMember(owner = "CUQKGTCO", name = "c", descriptor = "[I")
    public static int[] field560 = new int[5000];

    @OriginalMember(owner = "CUQKGTCO", name = "g", descriptor = "I")
    private int field564;

    @OriginalMember(owner = "CUQKGTCO", name = "h", descriptor = "I")
    private int field565;

    @OriginalMember(owner = "CUQKGTCO", name = "e", descriptor = "LXQPFGONL;")
    private static class62 field562;

    @OriginalMember(owner = "CUQKGTCO", name = "d", descriptor = "[B")
    private static byte[] field561;

    @OriginalMember(owner = "CUQKGTCO", name = "<init>", descriptor = "(B)V")
    private class9(byte arg0) {
        if (arg0 != -24) {
            this.field558 = 153;
        }
    }

    @OriginalMember(owner = "CUQKGTCO", name = "a", descriptor = "(ZLXQPFGONL;)V")
    public static final void method174(boolean arg0, class62 arg1) {
        field561 = new byte[441000];
        field562 = new class62(field561, 49938);
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class2.method4();
        while (true) {
            int var3 = arg1.method480();
            if (var3 == 65535) {
                return;
            }
            field559[var3] = new class9((byte) -24);
            field559[var3].method176(arg1, 168);
            field560[var3] = field559[var3].method177(4);
        }
    }

    @OriginalMember(owner = "CUQKGTCO", name = "a", descriptor = "(III)LXQPFGONL;")
    public static final class62 method175(int arg0, int arg1, int arg2) {
        if (arg2 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field559[arg0] == null) {
            return null;
        } else {
            class9 var4 = field559[arg0];
            return var4.method178(arg1, false);
        }
    }

    @OriginalMember(owner = "CUQKGTCO", name = "a", descriptor = "(LXQPFGONL;I)V")
    private final void method176(class62 arg0, int arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var5 = arg0.method478();
            if (var5 != 0) {
                arg0.field1542--;
                this.field563[var3] = new class2();
                this.field563[var3].method7(arg0, 168);
            }
        }
        this.field564 = arg0.method480();
        this.field565 = arg0.method480();
        if (arg1 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "CUQKGTCO", name = "a", descriptor = "(I)I")
    private final int method177(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field563[var3] != null && this.field563[var3].field22 / 20 < var2) {
                var2 = this.field563[var3].field22 / 20;
            }
        }
        if (this.field564 < this.field565 && this.field564 / 20 < var2) {
            var2 = this.field564 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field563[var4] != null) {
                this.field563[var4].field22 -= var2 * 20;
            }
        }
        if (arg0 < 4 || arg0 > 4) {
            return this.field558;
        }
        if (this.field564 < this.field565) {
            this.field564 -= var2 * 20;
            this.field565 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "CUQKGTCO", name = "a", descriptor = "(IZ)LXQPFGONL;")
    private final class62 method178(int arg0, boolean arg1) {
        int var3 = this.method179(arg0);
        field562.field1542 = 0;
        field562.method472(1380533830);
        field562.method473(false, var3 + 36);
        field562.method472(1463899717);
        field562.method472(1718449184);
        field562.method473(false, 16);
        field562.method470((byte) 3, 1);
        field562.method470((byte) 3, 1);
        field562.method473(false, 22050);
        field562.method473(false, 22050);
        field562.method470((byte) 3, 1);
        field562.method470((byte) 3, 8);
        if (arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field562.method472(1684108385);
        field562.method473(false, var3);
        field562.field1542 += var3;
        return field562;
    }

    @OriginalMember(owner = "CUQKGTCO", name = "b", descriptor = "(I)I")
    private final int method179(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field563[var3] != null && this.field563[var3].field22 + this.field563[var3].field21 > var2) {
                var2 = this.field563[var3].field22 + this.field563[var3].field21;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field564 * 22050 / 1000;
        int var6 = this.field565 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field561[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field563[var9] != null) {
                int var15 = this.field563[var9].field21 * 22050 / 1000;
                int var16 = this.field563[var9].field22 * 22050 / 1000;
                int[] var17 = this.field563[var9].method5(var15, this.field563[var9].field21);
                for (int var18 = 0; var18 < var15; var18++) {
                    field561[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
                }
            }
        }
        if (arg0 > 1) {
            var5 += 44;
            var6 += 44;
            var4 += 44;
            var7 += 44;
            int var10 = var7 - var4;
            for (int var11 = var4 - 1; var11 >= var6; var11--) {
                field561[var10 + var11] = field561[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field561[var13 + var14] = field561[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}

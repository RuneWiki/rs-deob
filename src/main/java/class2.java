import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BSYFPVLV")
public class class2 {

    @OriginalMember(owner = "BSYFPVLV", name = "b", descriptor = "I")
    private int field5 = 1;

    @OriginalMember(owner = "BSYFPVLV", name = "c", descriptor = "Z")
    private boolean field6 = false;

    @OriginalMember(owner = "BSYFPVLV", name = "h", descriptor = "[LRLHOXRLU;")
    private class44[] field11 = new class44[10];

    @OriginalMember(owner = "BSYFPVLV", name = "d", descriptor = "[LBSYFPVLV;")
    private static class2[] field7 = new class2[5000];

    @OriginalMember(owner = "BSYFPVLV", name = "e", descriptor = "[I")
    public static int[] field8 = new int[5000];

    @OriginalMember(owner = "BSYFPVLV", name = "i", descriptor = "I")
    private int field12;

    @OriginalMember(owner = "BSYFPVLV", name = "j", descriptor = "I")
    private int field13;

    @OriginalMember(owner = "BSYFPVLV", name = "a", descriptor = "I")
    private int field4;

    @OriginalMember(owner = "BSYFPVLV", name = "g", descriptor = "LMLYYHULT;")
    private static class30 field10;

    @OriginalMember(owner = "BSYFPVLV", name = "f", descriptor = "[B")
    private static byte[] field9;

    @OriginalMember(owner = "BSYFPVLV", name = "<init>", descriptor = "(B)V")
    private class2(byte arg0) {
        if (arg0 != -75) {
            this.field5 = 163;
        }
    }

    @OriginalMember(owner = "BSYFPVLV", name = "a", descriptor = "(LMLYYHULT;B)V")
    public static final void method1(class30 arg0, byte arg1) {
        field9 = new byte[441000];
        field10 = new class30(true, field9);
        if (arg1 != 3) {
            return;
        }
        boolean var2 = false;
        class44.method441();
        while (true) {
            int var3 = arg0.method298();
            if (var3 == 65535) {
                return;
            }
            field7[var3] = new class2((byte) -75);
            field7[var3].method3(arg0, (byte) 2);
            field8[var3] = field7[var3].method4(6);
        }
    }

    @OriginalMember(owner = "BSYFPVLV", name = "a", descriptor = "(BII)LMLYYHULT;")
    public static final class30 method2(byte arg0, int arg1, int arg2) {
        if (arg0 != 9) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        if (field7[arg2] == null) {
            return null;
        } else {
            class2 var4 = field7[arg2];
            return var4.method5(arg1, 30473);
        }
    }

    @OriginalMember(owner = "BSYFPVLV", name = "b", descriptor = "(LMLYYHULT;B)V")
    private final void method3(class30 arg0, byte arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method296();
            if (var4 != 0) {
                arg0.field1092--;
                this.field11[var3] = new class44();
                this.field11[var3].method444(arg0, (byte) 2);
            }
        }
        this.field12 = arg0.method298();
        if (arg1 != 2) {
            throw new NullPointerException();
        }
        this.field13 = arg0.method298();
    }

    @OriginalMember(owner = "BSYFPVLV", name = "a", descriptor = "(I)I")
    private final int method4(int arg0) {
        if (arg0 != 6) {
            return this.field4;
        }
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field11[var3] != null && this.field11[var3].field1368 / 20 < var2) {
                var2 = this.field11[var3].field1368 / 20;
            }
        }
        if (this.field12 < this.field13 && this.field12 / 20 < var2) {
            var2 = this.field12 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field11[var4] != null) {
                this.field11[var4].field1368 -= var2 * 20;
            }
        }
        if (this.field12 < this.field13) {
            this.field12 -= var2 * 20;
            this.field13 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "BSYFPVLV", name = "a", descriptor = "(II)LMLYYHULT;")
    private final class30 method5(int arg0, int arg1) {
        int var3 = this.method6(arg0);
        field10.field1092 = 0;
        field10.method290(1380533830);
        field10.method291(var3 + 36, (byte) 2);
        field10.method290(1463899717);
        field10.method290(1718449184);
        field10.method291(16, (byte) 2);
        field10.method288((byte) 7, 1);
        field10.method288((byte) 7, 1);
        field10.method291(22050, (byte) 2);
        field10.method291(22050, (byte) 2);
        field10.method288((byte) 7, 1);
        if (arg1 != 30473) {
            this.field4 = -216;
        }
        field10.method288((byte) 7, 8);
        field10.method290(1684108385);
        field10.method291(var3, (byte) 2);
        field10.field1092 += var3;
        return field10;
    }

    @OriginalMember(owner = "BSYFPVLV", name = "b", descriptor = "(I)I")
    private final int method6(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field11[var3] != null && this.field11[var3].field1368 + this.field11[var3].field1367 > var2) {
                var2 = this.field11[var3].field1368 + this.field11[var3].field1367;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field12 * 22050 / 1000;
        int var6 = this.field13 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field9[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field11[var9] != null) {
                int var15 = this.field11[var9].field1367 * 22050 / 1000;
                int var16 = this.field11[var9].field1368 * 22050 / 1000;
                int[] var17 = this.field11[var9].method442(var15, this.field11[var9].field1367);
                for (int var18 = 0; var18 < var15; var18++) {
                    field9[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field9[var10 + var11] = field9[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field9[var13 + var14] = field9[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}

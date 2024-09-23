import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FPQKMBUX")
public class class20 {

    @OriginalMember(owner = "FPQKMBUX", name = "a", descriptor = "B")
    private byte field749 = -84;

    @OriginalMember(owner = "FPQKMBUX", name = "c", descriptor = "I")
    private int field751 = 189;

    @OriginalMember(owner = "FPQKMBUX", name = "i", descriptor = "[LLLJZJXBB;")
    private class40[] field757 = new class40[10];

    @OriginalMember(owner = "FPQKMBUX", name = "b", descriptor = "I")
    private static int field750 = 189;

    @OriginalMember(owner = "FPQKMBUX", name = "d", descriptor = "I")
    private static int field752 = 829;

    @OriginalMember(owner = "FPQKMBUX", name = "e", descriptor = "[LFPQKMBUX;")
    private static class20[] field753 = new class20[5000];

    @OriginalMember(owner = "FPQKMBUX", name = "f", descriptor = "[I")
    public static int[] field754 = new int[5000];

    @OriginalMember(owner = "FPQKMBUX", name = "j", descriptor = "I")
    private int field758;

    @OriginalMember(owner = "FPQKMBUX", name = "k", descriptor = "I")
    private int field759;

    @OriginalMember(owner = "FPQKMBUX", name = "h", descriptor = "LEGCCHUZS;")
    private static class15 field756;

    @OriginalMember(owner = "FPQKMBUX", name = "g", descriptor = "[B")
    private static byte[] field755;

    @OriginalMember(owner = "FPQKMBUX", name = "<init>", descriptor = "(B)V")
    private class20(byte arg0) {
        if (this.field749 != arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "FPQKMBUX", name = "a", descriptor = "(ILEGCCHUZS;)V")
    public static final void method307(int arg0, class15 arg1) {
        field755 = new byte[441000];
        field756 = new class15(field755, false);
        class40.method465();
        if (arg0 != 0) {
            field752 = -205;
        }
        while (true) {
            int var2 = arg1.method263();
            if (var2 == 65535) {
                return;
            }
            field753[var2] = new class20((byte) -84);
            field753[var2].method309(arg1, true);
            field754[var2] = field753[var2].method310(field750);
        }
    }

    @OriginalMember(owner = "FPQKMBUX", name = "a", descriptor = "(III)LEGCCHUZS;")
    public static final class15 method308(int arg0, int arg1, int arg2) {
        if (arg0 >= 0) {
            field752 = -94;
        }
        if (field753[arg1] == null) {
            return null;
        } else {
            class20 var3 = field753[arg1];
            return var3.method311(-523, arg2);
        }
    }

    @OriginalMember(owner = "FPQKMBUX", name = "a", descriptor = "(LEGCCHUZS;Z)V")
    private final void method309(class15 arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method261();
            if (var4 != 0) {
                arg0.field709--;
                this.field757[var3] = new class40();
                this.field757[var3].method468(arg0, true);
            }
        }
        this.field758 = arg0.method263();
        this.field759 = arg0.method263();
    }

    @OriginalMember(owner = "FPQKMBUX", name = "a", descriptor = "(I)I")
    private final int method310(int arg0) {
        int var2 = 75 / arg0;
        int var3 = 9999999;
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field757[var4] != null && this.field757[var4].field1162 / 20 < var3) {
                var3 = this.field757[var4].field1162 / 20;
            }
        }
        if (this.field758 < this.field759 && this.field758 / 20 < var3) {
            var3 = this.field758 / 20;
        }
        if (var3 == 9999999 || var3 == 0) {
            return 0;
        }
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field757[var5] != null) {
                this.field757[var5].field1162 -= var3 * 20;
            }
        }
        if (this.field758 < this.field759) {
            this.field758 -= var3 * 20;
            this.field759 -= var3 * 20;
        }
        return var3;
    }

    @OriginalMember(owner = "FPQKMBUX", name = "a", descriptor = "(II)LEGCCHUZS;")
    private final class15 method311(int arg0, int arg1) {
        int var3 = this.method312(arg1);
        field756.field709 = 0;
        field756.method255(1380533830);
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        field756.method256(-25153, var3 + 36);
        field756.method255(1463899717);
        field756.method255(1718449184);
        field756.method256(-25153, 16);
        field756.method253(1, (byte) 5);
        field756.method253(1, (byte) 5);
        field756.method256(-25153, 22050);
        field756.method256(-25153, 22050);
        field756.method253(1, (byte) 5);
        field756.method253(8, (byte) 5);
        field756.method255(1684108385);
        field756.method256(-25153, var3);
        field756.field709 += var3;
        return field756;
    }

    @OriginalMember(owner = "FPQKMBUX", name = "b", descriptor = "(I)I")
    private final int method312(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field757[var3] != null && this.field757[var3].field1162 + this.field757[var3].field1161 > var2) {
                var2 = this.field757[var3].field1162 + this.field757[var3].field1161;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field758 * 22050 / 1000;
        int var6 = this.field759 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field755[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field757[var9] != null) {
                int var15 = this.field757[var9].field1161 * 22050 / 1000;
                int var16 = this.field757[var9].field1162 * 22050 / 1000;
                int[] var17 = this.field757[var9].method466(var15, this.field757[var9].field1161);
                for (int var18 = 0; var18 < var15; var18++) {
                    field755[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field755[var10 + var11] = field755[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field755[var13 + var14] = field755[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}

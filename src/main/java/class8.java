import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CMHYVIXN")
public class class8 {

    @OriginalMember(owner = "CMHYVIXN", name = "a", descriptor = "B")
    private byte field650 = -79;

    @OriginalMember(owner = "CMHYVIXN", name = "b", descriptor = "I")
    private int field651 = 5;

    @OriginalMember(owner = "CMHYVIXN", name = "d", descriptor = "Z")
    private boolean field653 = true;

    @OriginalMember(owner = "CMHYVIXN", name = "i", descriptor = "[LWLTAOGXS;")
    private class60[] field658 = new class60[10];

    @OriginalMember(owner = "CMHYVIXN", name = "e", descriptor = "[LCMHYVIXN;")
    private static class8[] field654 = new class8[5000];

    @OriginalMember(owner = "CMHYVIXN", name = "f", descriptor = "[I")
    public static int[] field655 = new int[5000];

    @OriginalMember(owner = "CMHYVIXN", name = "j", descriptor = "I")
    private int field659;

    @OriginalMember(owner = "CMHYVIXN", name = "k", descriptor = "I")
    private int field660;

    @OriginalMember(owner = "CMHYVIXN", name = "h", descriptor = "LGLMIQHJI;")
    private static class21 field657;

    @OriginalMember(owner = "CMHYVIXN", name = "c", descriptor = "Z")
    private static boolean field652;

    @OriginalMember(owner = "CMHYVIXN", name = "g", descriptor = "[B")
    private static byte[] field656;

    @OriginalMember(owner = "CMHYVIXN", name = "<init>", descriptor = "(B)V")
    private class8(byte arg0) {
        if (arg0 != 9) {
            throw new NullPointerException();
        }
        boolean var2 = false;
    }

    @OriginalMember(owner = "CMHYVIXN", name = "a", descriptor = "(ZLGLMIQHJI;)V")
    public static final void method166(boolean arg0, class21 arg1) {
        field656 = new byte[441000];
        field657 = new class21(field656, -49015);
        if (arg0) {
            field652 = !field652;
        }
        class60.method551();
        while (true) {
            int var2 = arg1.method246();
            if (var2 == 65535) {
                return;
            }
            field654[var2] = new class8((byte) 9);
            field654[var2].method168((byte) 8, arg1);
            field655[var2] = field654[var2].method169(24288);
        }
    }

    @OriginalMember(owner = "CMHYVIXN", name = "a", descriptor = "(III)LGLMIQHJI;")
    public static final class21 method167(int arg0, int arg1, int arg2) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        } else if (field654[arg2] == null) {
            return null;
        } else {
            class8 var3 = field654[arg2];
            return var3.method170((byte) 126, arg0);
        }
    }

    @OriginalMember(owner = "CMHYVIXN", name = "a", descriptor = "(BLGLMIQHJI;)V")
    private final void method168(byte arg0, class21 arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var5 = arg1.method244();
            if (var5 != 0) {
                arg1.field818--;
                this.field658[var3] = new class60();
                this.field658[var3].method554((byte) 8, arg1);
            }
        }
        this.field659 = arg1.method246();
        if (arg0 == 8) {
            boolean var4 = false;
        } else {
            this.field653 = !this.field653;
        }
        this.field660 = arg1.method246();
    }

    @OriginalMember(owner = "CMHYVIXN", name = "a", descriptor = "(I)I")
    private final int method169(int arg0) {
        if (arg0 != 24288) {
            this.field651 = 29;
        }
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field658[var3] != null && this.field658[var3].field1572 / 20 < var2) {
                var2 = this.field658[var3].field1572 / 20;
            }
        }
        if (this.field659 < this.field660 && this.field659 / 20 < var2) {
            var2 = this.field659 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field658[var4] != null) {
                this.field658[var4].field1572 -= var2 * 20;
            }
        }
        if (this.field659 < this.field660) {
            this.field659 -= var2 * 20;
            this.field660 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "CMHYVIXN", name = "a", descriptor = "(BI)LGLMIQHJI;")
    private final class21 method170(byte arg0, int arg1) {
        if (arg0 != 126) {
            this.field651 = -173;
        }
        int var3 = this.method171(arg1);
        field657.field818 = 0;
        field657.method238(1380533830);
        field657.method239(var3 + 36, false);
        field657.method238(1463899717);
        field657.method238(1718449184);
        field657.method239(16, false);
        field657.method236(this.field650, 1);
        field657.method236(this.field650, 1);
        field657.method239(22050, false);
        field657.method239(22050, false);
        field657.method236(this.field650, 1);
        field657.method236(this.field650, 8);
        field657.method238(1684108385);
        field657.method239(var3, false);
        field657.field818 += var3;
        return field657;
    }

    @OriginalMember(owner = "CMHYVIXN", name = "b", descriptor = "(I)I")
    private final int method171(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field658[var3] != null && this.field658[var3].field1572 + this.field658[var3].field1571 > var2) {
                var2 = this.field658[var3].field1572 + this.field658[var3].field1571;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field659 * 22050 / 1000;
        int var6 = this.field660 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field656[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field658[var9] != null) {
                int var15 = this.field658[var9].field1571 * 22050 / 1000;
                int var16 = this.field658[var9].field1572 * 22050 / 1000;
                int[] var17 = this.field658[var9].method552(var15, this.field658[var9].field1571);
                for (int var18 = 0; var18 < var15; var18++) {
                    field656[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field656[var10 + var11] = field656[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field656[var13 + var14] = field656[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}

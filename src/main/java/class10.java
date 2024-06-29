import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DCZESDQX")
public class class10 {

    @OriginalMember(owner = "client!DCZESDQX", name = "a", descriptor = "Z")
    private boolean field637 = true;

    @OriginalMember(owner = "client!DCZESDQX", name = "b", descriptor = "I")
    private int field638 = 340;

    @OriginalMember(owner = "client!DCZESDQX", name = "c", descriptor = "Z")
    private boolean field639 = false;

    @OriginalMember(owner = "client!DCZESDQX", name = "j", descriptor = "[LZJWNEIBQ;")
    private class72[] field646 = new class72[10];

    @OriginalMember(owner = "client!DCZESDQX", name = "d", descriptor = "I")
    private static int field640 = -645;

    @OriginalMember(owner = "client!DCZESDQX", name = "e", descriptor = "I")
    private static int field641 = 438;

    @OriginalMember(owner = "client!DCZESDQX", name = "f", descriptor = "[LDCZESDQX;")
    private static class10[] field642 = new class10[5000];

    @OriginalMember(owner = "client!DCZESDQX", name = "g", descriptor = "[I")
    public static int[] field643 = new int[5000];

    @OriginalMember(owner = "client!DCZESDQX", name = "k", descriptor = "I")
    private int field647;

    @OriginalMember(owner = "client!DCZESDQX", name = "l", descriptor = "I")
    private int field648;

    @OriginalMember(owner = "client!DCZESDQX", name = "i", descriptor = "LBSNPYLEV;")
    private static class7 field645;

    @OriginalMember(owner = "client!DCZESDQX", name = "h", descriptor = "[B")
    private static byte[] field644;

    @OriginalMember(owner = "client!DCZESDQX", name = "<init>", descriptor = "(B)V")
    private class10(byte arg0) {
        if (arg0 != 82) {
            this.field639 = !this.field639;
        }
    }

    @OriginalMember(owner = "client!DCZESDQX", name = "a", descriptor = "(LBSNPYLEV;I)V")
    public static final void method271(class7 arg0, int arg1) {
        field644 = new byte[441000];
        if (arg1 != -29636) {
            field640 = -375;
        }
        field645 = new class7(field644, (byte) 3);
        class72.method601();
        while (true) {
            int var2 = arg0.method49();
            if (var2 == 65535) {
                return;
            }
            field642[var2] = new class10((byte) 82);
            field642[var2].method273(7, arg0);
            field643[var2] = field642[var2].method274(6);
        }
    }

    @OriginalMember(owner = "client!DCZESDQX", name = "a", descriptor = "(IZI)LBSNPYLEV;")
    public static final class7 method272(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field641 = -277;
        }
        if (field642[arg0] == null) {
            return null;
        } else {
            class10 var3 = field642[arg0];
            return var3.method275(2, arg2);
        }
    }

    @OriginalMember(owner = "client!DCZESDQX", name = "a", descriptor = "(ILBSNPYLEV;)V")
    private final void method273(int arg0, class7 arg1) {
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method47();
            if (var4 != 0) {
                arg1.field91--;
                this.field646[var3] = new class72();
                this.field646[var3].method604(7, arg1);
            }
        }
        this.field647 = arg1.method49();
        this.field648 = arg1.method49();
    }

    @OriginalMember(owner = "client!DCZESDQX", name = "a", descriptor = "(I)I")
    private final int method274(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field646[var3] != null && this.field646[var3].field1771 / 20 < var2) {
                var2 = this.field646[var3].field1771 / 20;
            }
        }
        if (this.field647 < this.field648 && this.field647 / 20 < var2) {
            var2 = this.field647 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field646[var4] != null) {
                this.field646[var4].field1771 -= var2 * 20;
            }
        }
        if (arg0 < 6 || arg0 > 6) {
            this.field638 = 322;
        }
        if (this.field647 < this.field648) {
            this.field647 -= var2 * 20;
            this.field648 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!DCZESDQX", name = "a", descriptor = "(II)LBSNPYLEV;")
    private final class7 method275(int arg0, int arg1) {
        int var3 = this.method276(arg1);
        field645.field91 = 0;
        field645.method41(1380533830);
        if (arg0 < 2 || arg0 > 2) {
            this.field637 = !this.field637;
        }
        field645.method42(-5475, var3 + 36);
        field645.method41(1463899717);
        field645.method41(1718449184);
        field645.method42(-5475, 16);
        field645.method39(0, 1);
        field645.method39(0, 1);
        field645.method42(-5475, 22050);
        field645.method42(-5475, 22050);
        field645.method39(0, 1);
        field645.method39(0, 8);
        field645.method41(1684108385);
        field645.method42(-5475, var3);
        field645.field91 += var3;
        return field645;
    }

    @OriginalMember(owner = "client!DCZESDQX", name = "b", descriptor = "(I)I")
    private final int method276(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field646[var3] != null && this.field646[var3].field1771 + this.field646[var3].field1770 > var2) {
                var2 = this.field646[var3].field1771 + this.field646[var3].field1770;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field647 * 22050 / 1000;
        int var6 = this.field648 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field644[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field646[var9] != null) {
                int var15 = this.field646[var9].field1770 * 22050 / 1000;
                int var16 = this.field646[var9].field1771 * 22050 / 1000;
                int[] var17 = this.field646[var9].method602(var15, this.field646[var9].field1770);
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = (var17[var18] >> 8) + (field644[var16 + var18 + 44] & 0xFF);
                    if ((var19 & 0xFFFFFF00) != 0) {
                        var19 = ~(var19 >> 31);
                    }
                    field644[var16 + var18 + 44] = (byte) var19;
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
                field644[var10 + var11] = field644[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field644[var13 + var14] = field644[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}

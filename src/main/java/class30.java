import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MDGCJDZI")
public class class30 {

    @OriginalMember(owner = "client!MDGCJDZI", name = "a", descriptor = "Z")
    private boolean field966 = false;

    @OriginalMember(owner = "client!MDGCJDZI", name = "c", descriptor = "I")
    private int field968 = 7;

    @OriginalMember(owner = "client!MDGCJDZI", name = "d", descriptor = "Z")
    private boolean field969 = false;

    @OriginalMember(owner = "client!MDGCJDZI", name = "i", descriptor = "[LFMKSNCAT;")
    private class14[] field974 = new class14[10];

    @OriginalMember(owner = "client!MDGCJDZI", name = "e", descriptor = "[LMDGCJDZI;")
    private static class30[] field970 = new class30[5000];

    @OriginalMember(owner = "client!MDGCJDZI", name = "f", descriptor = "[I")
    public static int[] field971 = new int[5000];

    @OriginalMember(owner = "client!MDGCJDZI", name = "b", descriptor = "I")
    private static int field967;

    @OriginalMember(owner = "client!MDGCJDZI", name = "j", descriptor = "I")
    private int field975;

    @OriginalMember(owner = "client!MDGCJDZI", name = "k", descriptor = "I")
    private int field976;

    @OriginalMember(owner = "client!MDGCJDZI", name = "h", descriptor = "LNQUAUMDT;")
    private static class36 field973;

    @OriginalMember(owner = "client!MDGCJDZI", name = "g", descriptor = "[B")
    private static byte[] field972;

    @OriginalMember(owner = "client!MDGCJDZI", name = "<init>", descriptor = "(I)V")
    private class30(int arg0) {
        if (this.field968 != arg0) {
            this.field969 = !this.field969;
        }
    }

    @OriginalMember(owner = "client!MDGCJDZI", name = "a", descriptor = "(LNQUAUMDT;I)V")
    public static final void method258(class36 arg0, int arg1) {
        if (arg1 >= 0) {
            field967 = 276;
        }
        field972 = new byte[441000];
        field973 = new class36(-587, field972);
        class14.method193();
        while (true) {
            int var2 = arg0.method341();
            if (var2 == 65535) {
                return;
            }
            field970[var2] = new class30(7);
            field970[var2].method260((byte) 6, arg0);
            field971[var2] = field970[var2].method261(-667);
        }
    }

    @OriginalMember(owner = "client!MDGCJDZI", name = "a", descriptor = "(IIZ)LNQUAUMDT;")
    public static final class36 method259(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            throw new NullPointerException();
        } else if (field970[arg0] == null) {
            return null;
        } else {
            class30 var3 = field970[arg0];
            return var3.method262((byte) -67, arg1);
        }
    }

    @OriginalMember(owner = "client!MDGCJDZI", name = "a", descriptor = "(BLNQUAUMDT;)V")
    private final void method260(byte arg0, class36 arg1) {
        if (arg0 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < 10; var4++) {
            int var5 = arg1.method339();
            if (var5 != 0) {
                arg1.field1072--;
                this.field974[var4] = new class14();
                this.field974[var4].method196((byte) 6, arg1);
            }
        }
        this.field975 = arg1.method341();
        this.field976 = arg1.method341();
    }

    @OriginalMember(owner = "client!MDGCJDZI", name = "a", descriptor = "(I)I")
    private final int method261(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field974[var3] != null && this.field974[var3].field687 / 20 < var2) {
                var2 = this.field974[var3].field687 / 20;
            }
        }
        if (this.field975 < this.field976 && this.field975 / 20 < var2) {
            var2 = this.field975 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field974[var4] != null) {
                this.field974[var4].field687 -= var2 * 20;
            }
        }
        if (arg0 >= 0) {
            this.field969 = !this.field969;
        }
        if (this.field975 < this.field976) {
            this.field975 -= var2 * 20;
            this.field976 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!MDGCJDZI", name = "a", descriptor = "(BI)LNQUAUMDT;")
    private final class36 method262(byte arg0, int arg1) {
        int var3 = this.method263(arg1);
        field973.field1072 = 0;
        field973.method333(1380533830);
        field973.method334(var3 + 36, (byte) 11);
        field973.method333(1463899717);
        field973.method333(1718449184);
        field973.method334(16, (byte) 11);
        field973.method331(1, false);
        field973.method331(1, false);
        field973.method334(22050, (byte) 11);
        field973.method334(22050, (byte) 11);
        field973.method331(1, false);
        if (arg0 != -67) {
            throw new NullPointerException();
        }
        field973.method331(8, false);
        field973.method333(1684108385);
        field973.method334(var3, (byte) 11);
        field973.field1072 += var3;
        return field973;
    }

    @OriginalMember(owner = "client!MDGCJDZI", name = "b", descriptor = "(I)I")
    private final int method263(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field974[var3] != null && this.field974[var3].field687 + this.field974[var3].field686 > var2) {
                var2 = this.field974[var3].field687 + this.field974[var3].field686;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field975 * 22050 / 1000;
        int var6 = this.field976 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field972[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field974[var9] != null) {
                int var15 = this.field974[var9].field686 * 22050 / 1000;
                int var16 = this.field974[var9].field687 * 22050 / 1000;
                int[] var17 = this.field974[var9].method194(var15, this.field974[var9].field686);
                for (int var18 = 0; var18 < var15; var18++) {
                    field972[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field972[var10 + var11] = field972[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field972[var13 + var14] = field972[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}

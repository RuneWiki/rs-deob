import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ADSZDTIC")
public class class4 {

    @OriginalMember(owner = "client!ADSZDTIC", name = "b", descriptor = "Z")
    private boolean field14 = true;

    @OriginalMember(owner = "client!ADSZDTIC", name = "c", descriptor = "B")
    private byte field15 = -83;

    @OriginalMember(owner = "client!ADSZDTIC", name = "e", descriptor = "Z")
    private boolean field17 = false;

    @OriginalMember(owner = "client!ADSZDTIC", name = "j", descriptor = "[LGCVPDIUI;")
    private class17[] field22 = new class17[10];

    @OriginalMember(owner = "client!ADSZDTIC", name = "a", descriptor = "I")
    private static int field13 = 536;

    @OriginalMember(owner = "client!ADSZDTIC", name = "d", descriptor = "I")
    private static int field16 = 3;

    @OriginalMember(owner = "client!ADSZDTIC", name = "f", descriptor = "[LADSZDTIC;")
    private static class4[] field18 = new class4[5000];

    @OriginalMember(owner = "client!ADSZDTIC", name = "g", descriptor = "[I")
    public static int[] field19 = new int[5000];

    @OriginalMember(owner = "client!ADSZDTIC", name = "k", descriptor = "I")
    private int field23;

    @OriginalMember(owner = "client!ADSZDTIC", name = "l", descriptor = "I")
    private int field24;

    @OriginalMember(owner = "client!ADSZDTIC", name = "i", descriptor = "LCMGGUSPR;")
    private static class10 field21;

    @OriginalMember(owner = "client!ADSZDTIC", name = "h", descriptor = "[B")
    private static byte[] field20;

    @OriginalMember(owner = "client!ADSZDTIC", name = "<init>", descriptor = "(I)V")
    private class4(int arg0) {
        if (arg0 != 0) {
            field13 = -445;
        }
    }

    @OriginalMember(owner = "client!ADSZDTIC", name = "a", descriptor = "(ILCMGGUSPR;)V")
    public static final void method9(int arg0, class10 arg1) {
        if (arg0 < field16 || arg0 > field16) {
            return;
        }
        field20 = new byte[441000];
        field21 = new class10(field20, field13);
        class17.method286();
        while (true) {
            int var2 = arg1.method196();
            if (var2 == 65535) {
                return;
            }
            field18[var2] = new class4(0);
            field18[var2].method11(arg1, -593);
            field19[var2] = field18[var2].method12(0);
        }
    }

    @OriginalMember(owner = "client!ADSZDTIC", name = "a", descriptor = "(III)LCMGGUSPR;")
    public static final class10 method10(int arg0, int arg1, int arg2) {
        if (arg0 < 5 || arg0 > 5) {
            throw new NullPointerException();
        } else if (field18[arg1] == null) {
            return null;
        } else {
            class4 var3 = field18[arg1];
            return var3.method13(-36990, arg2);
        }
    }

    @OriginalMember(owner = "client!ADSZDTIC", name = "a", descriptor = "(LCMGGUSPR;I)V")
    private final void method11(class10 arg0, int arg1) {
        if (arg1 >= 0) {
            field16 = -170;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method194();
            if (var4 != 0) {
                arg0.field646--;
                this.field22[var3] = new class17();
                this.field22[var3].method289(arg0, -593);
            }
        }
        this.field23 = arg0.method196();
        this.field24 = arg0.method196();
    }

    @OriginalMember(owner = "client!ADSZDTIC", name = "a", descriptor = "(I)I")
    private final int method12(int arg0) {
        int var2 = 9999999;
        if (arg0 != 0) {
            field13 = 158;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field22[var3] != null && this.field22[var3].field797 / 20 < var2) {
                var2 = this.field22[var3].field797 / 20;
            }
        }
        if (this.field23 < this.field24 && this.field23 / 20 < var2) {
            var2 = this.field23 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field22[var4] != null) {
                this.field22[var4].field797 -= var2 * 20;
            }
        }
        if (this.field23 < this.field24) {
            this.field23 -= var2 * 20;
            this.field24 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ADSZDTIC", name = "a", descriptor = "(II)LCMGGUSPR;")
    private final class10 method13(int arg0, int arg1) {
        int var3 = this.method14(arg1);
        if (arg0 != -36990) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field21.field646 = 0;
        field21.method188(1380533830);
        field21.method189(var3 + 36, this.field14);
        field21.method188(1463899717);
        field21.method188(1718449184);
        field21.method189(16, this.field14);
        field21.method186(1, 0);
        field21.method186(1, 0);
        field21.method189(22050, this.field14);
        field21.method189(22050, this.field14);
        field21.method186(1, 0);
        field21.method186(8, 0);
        field21.method188(1684108385);
        field21.method189(var3, this.field14);
        field21.field646 += var3;
        return field21;
    }

    @OriginalMember(owner = "client!ADSZDTIC", name = "b", descriptor = "(I)I")
    private final int method14(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field22[var3] != null && this.field22[var3].field797 + this.field22[var3].field796 > var2) {
                var2 = this.field22[var3].field797 + this.field22[var3].field796;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field23 * 22050 / 1000;
        int var6 = this.field24 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field20[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field22[var9] != null) {
                int var15 = this.field22[var9].field796 * 22050 / 1000;
                int var16 = this.field22[var9].field797 * 22050 / 1000;
                int[] var17 = this.field22[var9].method287(var15, this.field22[var9].field796);
                for (int var18 = 0; var18 < var15; var18++) {
                    field20[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field20[var10 + var11] = field20[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field20[var13 + var14] = field20[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}

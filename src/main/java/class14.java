import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GRRWPPAT")
public class class14 {

    @OriginalMember(owner = "client!GRRWPPAT", name = "f", descriptor = "[LOZEEIHVG;")
    private class46[] field706 = new class46[10];

    @OriginalMember(owner = "client!GRRWPPAT", name = "a", descriptor = "I")
    private static int field701 = -313;

    @OriginalMember(owner = "client!GRRWPPAT", name = "b", descriptor = "[LGRRWPPAT;")
    private static class14[] field702 = new class14[5000];

    @OriginalMember(owner = "client!GRRWPPAT", name = "c", descriptor = "[I")
    public static int[] field703 = new int[5000];

    @OriginalMember(owner = "client!GRRWPPAT", name = "g", descriptor = "I")
    private int field707;

    @OriginalMember(owner = "client!GRRWPPAT", name = "h", descriptor = "I")
    private int field708;

    @OriginalMember(owner = "client!GRRWPPAT", name = "e", descriptor = "LRGCGKKUR;")
    private static class53 field705;

    @OriginalMember(owner = "client!GRRWPPAT", name = "d", descriptor = "[B")
    private static byte[] field704;

    @OriginalMember(owner = "client!GRRWPPAT", name = "<init>", descriptor = "(I)V")
    private class14(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!GRRWPPAT", name = "a", descriptor = "(BLRGCGKKUR;)V")
    public static final void method211(byte arg0, class53 arg1) {
        field704 = new byte[441000];
        if (arg0 != 6) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        field705 = new class53(field704, (byte) -17);
        class46.method415();
        while (true) {
            int var3 = arg1.method457();
            if (var3 == 65535) {
                return;
            }
            field702[var3] = new class14(0);
            field702[var3].method213(5, arg1);
            field703[var3] = field702[var3].method214(false);
        }
    }

    @OriginalMember(owner = "client!GRRWPPAT", name = "a", descriptor = "(III)LRGCGKKUR;")
    public static final class53 method212(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field701 = -444;
        }
        if (field702[arg0] == null) {
            return null;
        } else {
            class14 var3 = field702[arg0];
            return var3.method215((byte) -1, arg1);
        }
    }

    @OriginalMember(owner = "client!GRRWPPAT", name = "a", descriptor = "(ILRGCGKKUR;)V")
    private final void method213(int arg0, class53 arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method455();
            if (var4 != 0) {
                arg1.field1539--;
                this.field706[var3] = new class46();
                this.field706[var3].method418(5, arg1);
            }
        }
        this.field707 = arg1.method457();
        this.field708 = arg1.method457();
        if (arg0 < 5 || arg0 > 5) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!GRRWPPAT", name = "a", descriptor = "(Z)I")
    private final int method214(boolean arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field706[var3] != null && this.field706[var3].field1345 / 20 < var2) {
                var2 = this.field706[var3].field1345 / 20;
            }
        }
        if (this.field707 < this.field708 && this.field707 / 20 < var2) {
            var2 = this.field707 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field706[var4] != null) {
                this.field706[var4].field1345 -= var2 * 20;
            }
        }
        if (arg0) {
            field701 = -374;
        }
        if (this.field707 < this.field708) {
            this.field707 -= var2 * 20;
            this.field708 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!GRRWPPAT", name = "a", descriptor = "(BI)LRGCGKKUR;")
    private final class53 method215(byte arg0, int arg1) {
        int var3 = this.method216(arg1);
        field705.field1539 = 0;
        field705.method449(1380533830);
        field705.method450(var3 + 36, false);
        field705.method449(1463899717);
        if (arg0 != -1) {
            field701 = 269;
        }
        field705.method449(1718449184);
        field705.method450(16, false);
        field705.method447(1, (byte) -40);
        field705.method447(1, (byte) -40);
        field705.method450(22050, false);
        field705.method450(22050, false);
        field705.method447(1, (byte) -40);
        field705.method447(8, (byte) -40);
        field705.method449(1684108385);
        field705.method450(var3, false);
        field705.field1539 += var3;
        return field705;
    }

    @OriginalMember(owner = "client!GRRWPPAT", name = "a", descriptor = "(I)I")
    private final int method216(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field706[var3] != null && this.field706[var3].field1345 + this.field706[var3].field1344 > var2) {
                var2 = this.field706[var3].field1345 + this.field706[var3].field1344;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field707 * 22050 / 1000;
        int var6 = this.field708 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field704[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field706[var9] != null) {
                int var15 = this.field706[var9].field1344 * 22050 / 1000;
                int var16 = this.field706[var9].field1345 * 22050 / 1000;
                int[] var17 = this.field706[var9].method416(var15, this.field706[var9].field1344);
                for (int var18 = 0; var18 < var15; var18++) {
                    field704[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field704[var10 + var11] = field704[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field704[var13 + var14] = field704[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}

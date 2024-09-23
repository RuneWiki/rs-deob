import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HNYSLMKN")
public class class16 {

    @OriginalMember(owner = "HNYSLMKN", name = "a", descriptor = "I")
    private int field723 = -883;

    @OriginalMember(owner = "HNYSLMKN", name = "b", descriptor = "Z")
    private boolean field724 = false;

    @OriginalMember(owner = "HNYSLMKN", name = "g", descriptor = "[LVUJNNHKQ;")
    private class62[] field729 = new class62[10];

    @OriginalMember(owner = "HNYSLMKN", name = "c", descriptor = "[LHNYSLMKN;")
    private static class16[] field725 = new class16[5000];

    @OriginalMember(owner = "HNYSLMKN", name = "d", descriptor = "[I")
    public static int[] field726 = new int[5000];

    @OriginalMember(owner = "HNYSLMKN", name = "h", descriptor = "I")
    private int field730;

    @OriginalMember(owner = "HNYSLMKN", name = "i", descriptor = "I")
    private int field731;

    @OriginalMember(owner = "HNYSLMKN", name = "f", descriptor = "LUAWAYCTK;")
    private static class55 field728;

    @OriginalMember(owner = "HNYSLMKN", name = "e", descriptor = "[B")
    private static byte[] field727;

    @OriginalMember(owner = "HNYSLMKN", name = "<init>", descriptor = "(I)V")
    private class16(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "HNYSLMKN", name = "a", descriptor = "(ILUAWAYCTK;)V")
    public static final void method219(int arg0, class55 arg1) {
        if (arg0 != 0) {
            return;
        }
        field727 = new byte[441000];
        field728 = new class55(741, field727);
        class62.method514();
        while (true) {
            int var2 = arg1.method457();
            if (var2 == 65535) {
                return;
            }
            field725[var2] = new class16(-505);
            field725[var2].method221(-7321, arg1);
            field726[var2] = field725[var2].method222(-608);
        }
    }

    @OriginalMember(owner = "HNYSLMKN", name = "a", descriptor = "(IZI)LUAWAYCTK;")
    public static final class55 method220(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            throw new NullPointerException();
        } else if (field725[arg0] == null) {
            return null;
        } else {
            class16 var3 = field725[arg0];
            return var3.method223(0, arg2);
        }
    }

    @OriginalMember(owner = "HNYSLMKN", name = "b", descriptor = "(ILUAWAYCTK;)V")
    private final void method221(int arg0, class55 arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var5 = arg1.method455();
            if (var5 != 0) {
                arg1.field1456--;
                this.field729[var3] = new class62();
                this.field729[var3].method517(-7321, arg1);
            }
        }
        this.field730 = arg1.method457();
        if (arg0 != -7321) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field731 = arg1.method457();
    }

    @OriginalMember(owner = "HNYSLMKN", name = "a", descriptor = "(I)I")
    private final int method222(int arg0) {
        int var2 = 9999999;
        while (arg0 >= 0) {
            this.field724 = !this.field724;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field729[var3] != null && this.field729[var3].field1548 / 20 < var2) {
                var2 = this.field729[var3].field1548 / 20;
            }
        }
        if (this.field730 < this.field731 && this.field730 / 20 < var2) {
            var2 = this.field730 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field729[var4] != null) {
                this.field729[var4].field1548 -= var2 * 20;
            }
        }
        if (this.field730 < this.field731) {
            this.field730 -= var2 * 20;
            this.field731 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "HNYSLMKN", name = "a", descriptor = "(II)LUAWAYCTK;")
    private final class55 method223(int arg0, int arg1) {
        int var3 = this.method224(arg1);
        field728.field1456 = 0;
        field728.method449(1380533830);
        field728.method450(this.field723, var3 + 36);
        field728.method449(1463899717);
        field728.method449(1718449184);
        field728.method450(this.field723, 16);
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        field728.method447(1, -19346);
        field728.method447(1, -19346);
        field728.method450(this.field723, 22050);
        field728.method450(this.field723, 22050);
        field728.method447(1, -19346);
        field728.method447(8, -19346);
        field728.method449(1684108385);
        field728.method450(this.field723, var3);
        field728.field1456 += var3;
        return field728;
    }

    @OriginalMember(owner = "HNYSLMKN", name = "b", descriptor = "(I)I")
    private final int method224(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field729[var3] != null && this.field729[var3].field1548 + this.field729[var3].field1547 > var2) {
                var2 = this.field729[var3].field1548 + this.field729[var3].field1547;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field730 * 22050 / 1000;
        int var6 = this.field731 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field727[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field729[var9] != null) {
                int var15 = this.field729[var9].field1547 * 22050 / 1000;
                int var16 = this.field729[var9].field1548 * 22050 / 1000;
                int[] var17 = this.field729[var9].method515(var15, this.field729[var9].field1547);
                for (int var18 = 0; var18 < var15; var18++) {
                    field727[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field727[var10 + var11] = field727[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field727[var13 + var14] = field727[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}

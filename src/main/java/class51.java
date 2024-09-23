import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PKMPUSCK")
public class class51 {

    @OriginalMember(owner = "PKMPUSCK", name = "a", descriptor = "I")
    private int field1310 = 7603;

    @OriginalMember(owner = "PKMPUSCK", name = "c", descriptor = "B")
    private byte field1312 = 6;

    @OriginalMember(owner = "PKMPUSCK", name = "d", descriptor = "Z")
    private boolean field1313 = false;

    @OriginalMember(owner = "PKMPUSCK", name = "i", descriptor = "[LUFAEFFVJ;")
    private class58[] field1318 = new class58[10];

    @OriginalMember(owner = "PKMPUSCK", name = "b", descriptor = "B")
    private static byte field1311 = 6;

    @OriginalMember(owner = "PKMPUSCK", name = "e", descriptor = "[LPKMPUSCK;")
    private static class51[] field1314 = new class51[5000];

    @OriginalMember(owner = "PKMPUSCK", name = "f", descriptor = "[I")
    public static int[] field1315 = new int[5000];

    @OriginalMember(owner = "PKMPUSCK", name = "j", descriptor = "I")
    private int field1319;

    @OriginalMember(owner = "PKMPUSCK", name = "k", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "PKMPUSCK", name = "h", descriptor = "LCKBTFRZM;")
    private static class5 field1317;

    @OriginalMember(owner = "PKMPUSCK", name = "g", descriptor = "[B")
    private static byte[] field1316;

    @OriginalMember(owner = "PKMPUSCK", name = "<init>", descriptor = "(I)V")
    private class51(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "PKMPUSCK", name = "a", descriptor = "(ZLCKBTFRZM;)V")
    public static final void method482(boolean arg0, class5 arg1) {
        field1316 = new byte[441000];
        field1317 = new class5(2, field1316);
        class58.method502();
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        while (true) {
            int var3 = arg1.method46();
            if (var3 == 65535) {
                return;
            }
            field1314[var3] = new class51(169);
            field1314[var3].method484((byte) -18, arg1);
            field1315[var3] = field1314[var3].method485(field1311);
        }
    }

    @OriginalMember(owner = "PKMPUSCK", name = "a", descriptor = "(IZI)LCKBTFRZM;")
    public static final class5 method483(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field1314[arg2] == null) {
            return null;
        } else {
            class51 var4 = field1314[arg2];
            return var4.method486((byte) 6, arg0);
        }
    }

    @OriginalMember(owner = "PKMPUSCK", name = "a", descriptor = "(BLCKBTFRZM;)V")
    private final void method484(byte arg0, class5 arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method44();
            if (var4 != 0) {
                arg1.field123--;
                this.field1318[var3] = new class58();
                this.field1318[var3].method505((byte) -18, arg1);
            }
        }
        if (arg0 != -18) {
            throw new NullPointerException();
        }
        this.field1319 = arg1.method46();
        this.field1320 = arg1.method46();
    }

    @OriginalMember(owner = "PKMPUSCK", name = "a", descriptor = "(B)I")
    private final int method485(byte arg0) {
        int var2 = 9999999;
        if (this.field1312 != arg0) {
            return this.field1310;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1318[var4] != null && this.field1318[var4].field1427 / 20 < var2) {
                var2 = this.field1318[var4].field1427 / 20;
            }
        }
        if (this.field1319 < this.field1320 && this.field1319 / 20 < var2) {
            var2 = this.field1319 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1318[var5] != null) {
                this.field1318[var5].field1427 -= var2 * 20;
            }
        }
        if (this.field1319 < this.field1320) {
            this.field1319 -= var2 * 20;
            this.field1320 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "PKMPUSCK", name = "a", descriptor = "(BI)LCKBTFRZM;")
    private final class5 method486(byte arg0, int arg1) {
        int var3 = this.method487(arg1);
        field1317.field123 = 0;
        field1317.method38(1380533830);
        field1317.method39(2, var3 + 36);
        field1317.method38(1463899717);
        field1317.method38(1718449184);
        field1317.method39(2, 16);
        if (arg0 != 6) {
            this.field1313 = !this.field1313;
        }
        field1317.method36(-96, 1);
        field1317.method36(-96, 1);
        field1317.method39(2, 22050);
        field1317.method39(2, 22050);
        field1317.method36(-96, 1);
        field1317.method36(-96, 8);
        field1317.method38(1684108385);
        field1317.method39(2, var3);
        field1317.field123 += var3;
        return field1317;
    }

    @OriginalMember(owner = "PKMPUSCK", name = "a", descriptor = "(I)I")
    private final int method487(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1318[var3] != null && this.field1318[var3].field1427 + this.field1318[var3].field1426 > var2) {
                var2 = this.field1318[var3].field1427 + this.field1318[var3].field1426;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1319 * 22050 / 1000;
        int var6 = this.field1320 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1316[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1318[var9] != null) {
                int var15 = this.field1318[var9].field1426 * 22050 / 1000;
                int var16 = this.field1318[var9].field1427 * 22050 / 1000;
                int[] var17 = this.field1318[var9].method503(var15, this.field1318[var9].field1426);
                for (int var18 = 0; var18 < var15; var18++) {
                    field1316[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field1316[var10 + var11] = field1316[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1316[var13 + var14] = field1316[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}

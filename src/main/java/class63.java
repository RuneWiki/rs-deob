import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VSVAEWAC")
public class class63 {

    @OriginalMember(owner = "VSVAEWAC", name = "a", descriptor = "I")
    private int field1591 = 22486;

    @OriginalMember(owner = "VSVAEWAC", name = "b", descriptor = "I")
    private int field1592 = -524;

    @OriginalMember(owner = "VSVAEWAC", name = "c", descriptor = "I")
    private int field1593 = -75;

    @OriginalMember(owner = "VSVAEWAC", name = "h", descriptor = "[LGJBKSAZL;")
    private class25[] field1598 = new class25[10];

    @OriginalMember(owner = "VSVAEWAC", name = "d", descriptor = "[LVSVAEWAC;")
    private static class63[] field1594 = new class63[5000];

    @OriginalMember(owner = "VSVAEWAC", name = "e", descriptor = "[I")
    public static int[] field1595 = new int[5000];

    @OriginalMember(owner = "VSVAEWAC", name = "i", descriptor = "I")
    private int field1599;

    @OriginalMember(owner = "VSVAEWAC", name = "j", descriptor = "I")
    private int field1600;

    @OriginalMember(owner = "VSVAEWAC", name = "g", descriptor = "LCFARFRSG;")
    private static class8 field1597;

    @OriginalMember(owner = "VSVAEWAC", name = "f", descriptor = "[B")
    private static byte[] field1596;

    @OriginalMember(owner = "VSVAEWAC", name = "<init>", descriptor = "(B)V")
    private class63(byte arg0) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        boolean var2 = false;
    }

    @OriginalMember(owner = "VSVAEWAC", name = "a", descriptor = "(LCFARFRSG;I)V")
    public static final void method571(class8 arg0, int arg1) {
        field1596 = new byte[441000];
        int var2 = 28 / arg1;
        field1597 = new class8(field1596, 792);
        class25.method296();
        while (true) {
            int var3 = arg0.method32();
            if (var3 == 65535) {
                return;
            }
            field1594[var3] = new class63((byte) 5);
            field1594[var3].method573(arg0, 22486);
            field1595[var3] = field1594[var3].method574(false);
        }
    }

    @OriginalMember(owner = "VSVAEWAC", name = "a", descriptor = "(III)LCFARFRSG;")
    public static final class8 method572(int arg0, int arg1, int arg2) {
        if (arg2 != -29127) {
            throw new NullPointerException();
        } else if (field1594[arg0] == null) {
            return null;
        } else {
            class63 var3 = field1594[arg0];
            return var3.method575(arg1, 154);
        }
    }

    @OriginalMember(owner = "VSVAEWAC", name = "b", descriptor = "(LCFARFRSG;I)V")
    private final void method573(class8 arg0, int arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method30();
            if (var4 != 0) {
                arg0.field72--;
                this.field1598[var3] = new class25();
                this.field1598[var3].method299(arg0, 22486);
            }
        }
        if (this.field1591 != arg1) {
            throw new NullPointerException();
        }
        this.field1599 = arg0.method32();
        this.field1600 = arg0.method32();
    }

    @OriginalMember(owner = "VSVAEWAC", name = "a", descriptor = "(Z)I")
    private final int method574(boolean arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1598[var3] != null && this.field1598[var3].field775 / 20 < var2) {
                var2 = this.field1598[var3].field775 / 20;
            }
        }
        if (arg0) {
            return 0;
        }
        if (this.field1599 < this.field1600 && this.field1599 / 20 < var2) {
            var2 = this.field1599 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1598[var4] != null) {
                this.field1598[var4].field775 -= var2 * 20;
            }
        }
        if (this.field1599 < this.field1600) {
            this.field1599 -= var2 * 20;
            this.field1600 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "VSVAEWAC", name = "a", descriptor = "(II)LCFARFRSG;")
    private final class8 method575(int arg0, int arg1) {
        int var3 = this.method576(arg0);
        field1597.field72 = 0;
        field1597.method24(1380533830);
        field1597.method25(3, var3 + 36);
        field1597.method24(1463899717);
        field1597.method24(1718449184);
        field1597.method25(3, 16);
        field1597.method22(1, false);
        field1597.method22(1, false);
        field1597.method25(3, 22050);
        field1597.method25(3, 22050);
        field1597.method22(1, false);
        int var4 = 48 / arg1;
        field1597.method22(8, false);
        field1597.method24(1684108385);
        field1597.method25(3, var3);
        field1597.field72 += var3;
        return field1597;
    }

    @OriginalMember(owner = "VSVAEWAC", name = "a", descriptor = "(I)I")
    private final int method576(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1598[var3] != null && this.field1598[var3].field775 + this.field1598[var3].field774 > var2) {
                var2 = this.field1598[var3].field775 + this.field1598[var3].field774;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1599 * 22050 / 1000;
        int var6 = this.field1600 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1596[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1598[var9] != null) {
                int var15 = this.field1598[var9].field774 * 22050 / 1000;
                int var16 = this.field1598[var9].field775 * 22050 / 1000;
                int[] var17 = this.field1598[var9].method297(var15, this.field1598[var9].field774);
                for (int var18 = 0; var18 < var15; var18++) {
                    field1596[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field1596[var10 + var11] = field1596[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1596[var13 + var14] = field1596[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}

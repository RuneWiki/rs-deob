import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KTPZRJZJ")
public class class26 {

    @OriginalMember(owner = "KTPZRJZJ", name = "b", descriptor = "I")
    private int field1011 = 5;

    @OriginalMember(owner = "KTPZRJZJ", name = "g", descriptor = "[LSMALAPQM;")
    private class48[] field1016 = new class48[10];

    @OriginalMember(owner = "KTPZRJZJ", name = "a", descriptor = "I")
    private static int field1010 = -17039;

    @OriginalMember(owner = "KTPZRJZJ", name = "c", descriptor = "[LKTPZRJZJ;")
    private static class26[] field1012 = new class26[5000];

    @OriginalMember(owner = "KTPZRJZJ", name = "d", descriptor = "[I")
    public static int[] field1013 = new int[5000];

    @OriginalMember(owner = "KTPZRJZJ", name = "h", descriptor = "I")
    private int field1017;

    @OriginalMember(owner = "KTPZRJZJ", name = "i", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "KTPZRJZJ", name = "f", descriptor = "LNHEPCMLW;")
    private static class35 field1015;

    @OriginalMember(owner = "KTPZRJZJ", name = "e", descriptor = "[B")
    private static byte[] field1014;

    @OriginalMember(owner = "KTPZRJZJ", name = "<init>", descriptor = "(Z)V")
    private class26(boolean arg0) {
        if (arg0) {
            field1010 = 431;
        }
    }

    @OriginalMember(owner = "KTPZRJZJ", name = "a", descriptor = "(ILNHEPCMLW;)V")
    public static final void method286(int arg0, class35 arg1) {
        field1014 = new byte[441000];
        field1015 = new class35((byte) -103, field1014);
        while (arg0 >= 0) {
            field1010 = -130;
        }
        class48.method444();
        while (true) {
            int var2 = arg1.method351();
            if (var2 == 65535) {
                return;
            }
            field1012[var2] = new class26(false);
            field1012[var2].method288(false, arg1);
            field1013[var2] = field1012[var2].method289((byte) 3);
        }
    }

    @OriginalMember(owner = "KTPZRJZJ", name = "a", descriptor = "(IIZ)LNHEPCMLW;")
    public static final class35 method287(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field1012[arg1] == null) {
            return null;
        } else {
            class26 var4 = field1012[arg1];
            return var4.method290(arg0, 512);
        }
    }

    @OriginalMember(owner = "KTPZRJZJ", name = "a", descriptor = "(ZLNHEPCMLW;)V")
    private final void method288(boolean arg0, class35 arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method349();
            if (var4 != 0) {
                arg1.field1107--;
                this.field1016[var3] = new class48();
                this.field1016[var3].method447(false, arg1);
            }
        }
        this.field1017 = arg1.method351();
        if (arg0) {
            throw new NullPointerException();
        }
        this.field1018 = arg1.method351();
    }

    @OriginalMember(owner = "KTPZRJZJ", name = "a", descriptor = "(B)I")
    private final int method289(byte arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1016[var3] != null && this.field1016[var3].field1373 / 20 < var2) {
                var2 = this.field1016[var3].field1373 / 20;
            }
        }
        if (this.field1017 < this.field1018 && this.field1017 / 20 < var2) {
            var2 = this.field1017 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1016[var4] != null) {
                this.field1016[var4].field1373 -= var2 * 20;
            }
        }
        if (arg0 == 3) {
            boolean var5 = false;
        } else {
            this.field1011 = 448;
        }
        if (this.field1017 < this.field1018) {
            this.field1017 -= var2 * 20;
            this.field1018 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "KTPZRJZJ", name = "a", descriptor = "(II)LNHEPCMLW;")
    private final class35 method290(int arg0, int arg1) {
        int var3 = this.method291(arg0);
        field1015.field1107 = 0;
        field1015.method343(1380533830);
        field1015.method344(-698, var3 + 36);
        field1015.method343(1463899717);
        field1015.method343(1718449184);
        field1015.method344(-698, 16);
        field1015.method341(1, 37278);
        field1015.method341(1, 37278);
        field1015.method344(-698, 22050);
        field1015.method344(-698, 22050);
        field1015.method341(1, 37278);
        field1015.method341(8, 37278);
        field1015.method343(1684108385);
        int var4 = 90 / arg1;
        field1015.method344(-698, var3);
        field1015.field1107 += var3;
        return field1015;
    }

    @OriginalMember(owner = "KTPZRJZJ", name = "a", descriptor = "(I)I")
    private final int method291(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1016[var3] != null && this.field1016[var3].field1373 + this.field1016[var3].field1372 > var2) {
                var2 = this.field1016[var3].field1373 + this.field1016[var3].field1372;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1017 * 22050 / 1000;
        int var6 = this.field1018 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1014[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1016[var9] != null) {
                int var15 = this.field1016[var9].field1372 * 22050 / 1000;
                int var16 = this.field1016[var9].field1373 * 22050 / 1000;
                int[] var17 = this.field1016[var9].method445(var15, this.field1016[var9].field1372);
                for (int var18 = 0; var18 < var15; var18++) {
                    field1014[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field1014[var10 + var11] = field1014[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1014[var13 + var14] = field1014[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FMUEZRNA")
public class class22 {

    @OriginalMember(owner = "FMUEZRNA", name = "a", descriptor = "I")
    private int field850 = 1;

    @OriginalMember(owner = "FMUEZRNA", name = "b", descriptor = "Z")
    private boolean field851 = false;

    @OriginalMember(owner = "FMUEZRNA", name = "h", descriptor = "[LXPILULJC;")
    private class66[] field857 = new class66[10];

    @OriginalMember(owner = "FMUEZRNA", name = "c", descriptor = "Z")
    private static boolean field852 = true;

    @OriginalMember(owner = "FMUEZRNA", name = "d", descriptor = "[LFMUEZRNA;")
    private static class22[] field853 = new class22[5000];

    @OriginalMember(owner = "FMUEZRNA", name = "e", descriptor = "[I")
    public static int[] field854 = new int[5000];

    @OriginalMember(owner = "FMUEZRNA", name = "i", descriptor = "I")
    private int field858;

    @OriginalMember(owner = "FMUEZRNA", name = "j", descriptor = "I")
    private int field859;

    @OriginalMember(owner = "FMUEZRNA", name = "g", descriptor = "LINLHDAGO;")
    private static class29 field856;

    @OriginalMember(owner = "FMUEZRNA", name = "f", descriptor = "[B")
    private static byte[] field855;

    @OriginalMember(owner = "FMUEZRNA", name = "<init>", descriptor = "(B)V")
    private class22(byte arg0) {
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        boolean var2 = false;
    }

    @OriginalMember(owner = "FMUEZRNA", name = "a", descriptor = "(LINLHDAGO;Z)V")
    public static final void method263(class29 arg0, boolean arg1) {
        field855 = new byte[441000];
        if (arg1) {
            return;
        }
        field856 = new class29((byte) -28, field855);
        class66.method522();
        while (true) {
            int var2 = arg0.method310();
            if (var2 == 65535) {
                return;
            }
            field853[var2] = new class22((byte) 3);
            field853[var2].method265(6, arg0);
            field854[var2] = field853[var2].method266(false);
        }
    }

    @OriginalMember(owner = "FMUEZRNA", name = "a", descriptor = "(III)LINLHDAGO;")
    public static final class29 method264(int arg0, int arg1, int arg2) {
        if (arg2 < 8 || arg2 > 8) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field853[arg1] == null) {
            return null;
        } else {
            class22 var4 = field853[arg1];
            return var4.method267(arg0, field852);
        }
    }

    @OriginalMember(owner = "FMUEZRNA", name = "a", descriptor = "(ILINLHDAGO;)V")
    private final void method265(int arg0, class29 arg1) {
        if (arg0 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < 10; var4++) {
            int var5 = arg1.method308();
            if (var5 != 0) {
                arg1.field1107--;
                this.field857[var4] = new class66();
                this.field857[var4].method525(6, arg1);
            }
        }
        this.field858 = arg1.method310();
        this.field859 = arg1.method310();
    }

    @OriginalMember(owner = "FMUEZRNA", name = "a", descriptor = "(Z)I")
    private final int method266(boolean arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field857[var3] != null && this.field857[var3].field1605 / 20 < var2) {
                var2 = this.field857[var3].field1605 / 20;
            }
        }
        if (arg0) {
            return 4;
        }
        if (this.field858 < this.field859 && this.field858 / 20 < var2) {
            var2 = this.field858 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field857[var4] != null) {
                this.field857[var4].field1605 -= var2 * 20;
            }
        }
        if (this.field858 < this.field859) {
            this.field858 -= var2 * 20;
            this.field859 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "FMUEZRNA", name = "a", descriptor = "(IZ)LINLHDAGO;")
    private final class29 method267(int arg0, boolean arg1) {
        int var3 = this.method268(arg0);
        field856.field1107 = 0;
        field856.method302(1380533830);
        field856.method303(var3 + 36, 5);
        field856.method302(1463899717);
        field856.method302(1718449184);
        field856.method303(16, 5);
        field856.method300(1, 41963);
        field856.method300(1, 41963);
        field856.method303(22050, 5);
        field856.method303(22050, 5);
        field856.method300(1, 41963);
        field856.method300(8, 41963);
        field856.method302(1684108385);
        field856.method303(var3, 5);
        field856.field1107 += var3;
        if (!arg1) {
            this.field850 = -294;
        }
        return field856;
    }

    @OriginalMember(owner = "FMUEZRNA", name = "a", descriptor = "(I)I")
    private final int method268(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field857[var3] != null && this.field857[var3].field1605 + this.field857[var3].field1604 > var2) {
                var2 = this.field857[var3].field1605 + this.field857[var3].field1604;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field858 * 22050 / 1000;
        int var6 = this.field859 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field855[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field857[var9] != null) {
                int var15 = this.field857[var9].field1604 * 22050 / 1000;
                int var16 = this.field857[var9].field1605 * 22050 / 1000;
                int[] var17 = this.field857[var9].method523(var15, this.field857[var9].field1604);
                for (int var18 = 0; var18 < var15; var18++) {
                    field855[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field855[var10 + var11] = field855[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field855[var13 + var14] = field855[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}

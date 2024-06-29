import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class69 extends class125 {

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Z")
    public boolean field1537 = false;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public int field1538;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Z")
    public boolean field1540;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "[I")
    private int[] field1545;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "[I")
    private int[] field1539;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "[I")
    private int[] field1546;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "[I")
    private int[] field1547;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "[I")
    public int[] field1541;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "[I")
    private static int[] field1543;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()V")
    public final void method495() {
        this.field1541 = null;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "()V")
    public static void method496() {
        field1543 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(DILc;)Z")
    public final boolean method497(double arg0, int arg1, class15 arg2) {
        for (int var5 = 0; var5 < this.field1545.length; var5++) {
            if (arg2.method116(this.field1545[var5], (byte) -63) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1541 = new int[var6];
        for (int var7 = 0; var7 < this.field1545.length; var7++) {
            class116 var8 = class118.method894(arg2, (byte) -122, this.field1545[var7]);
            var8.method882();
            byte[] var9 = var8.field2569;
            int[] var10 = var8.field2573;
            int var11 = this.field1547[var7];
            if ((var11 & 0xFF000000) == 50331648) {
                int var12 = var11 & 0xFF00FF;
                int var13 = var11 >> 8 & 0xFF;
                for (int var14 = 0; var14 < var10.length; var14++) {
                    int var15 = var10[var14];
                    if (var15 >> 8 == (var15 & 0xFFFF)) {
                        int var16 = var15 & 0xFF;
                        var10[var14] = var12 * var16 >> 8 & 0xFF00FF | var13 * var16 & 0xFF00;
                    }
                }
            }
            for (int var17 = 0; var17 < var10.length; var17++) {
                var10[var17] = class124.method940(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1539[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field2572 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1541[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field2572 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1541[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field2572 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1541[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V")
    public final void method498(int arg0) {
        if (this.field1541 == null) {
            return;
        }
        if (this.field1544 == 1 || this.field1544 == 3) {
            if (field1543 == null || field1543.length < this.field1541.length) {
                field1543 = new int[this.field1541.length];
            }
            short var2;
            if (this.field1541.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1541.length;
            int var4 = arg0 * var2 * this.field1542;
            int var5 = var3 - 1;
            if (this.field1544 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field1543[var6] = this.field1541[var17];
            }
            int[] var7 = this.field1541;
            this.field1541 = field1543;
            field1543 = var7;
        }
        if (this.field1544 != 2 && this.field1544 != 4) {
            return;
        }
        if (field1543 == null || field1543.length < this.field1541.length) {
            field1543 = new int[this.field1541.length];
        }
        short var8;
        if (this.field1541.length == 4096) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field1541.length;
        int var10 = this.field1542 * arg0;
        int var11 = var8 - 1;
        if (this.field1544 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field1543[var15] = this.field1541[var16];
            }
        }
        int[] var13 = this.field1541;
        this.field1541 = field1543;
        field1543 = var13;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ltf;)V")
    public class69(class138 arg0) {
        this.field1538 = arg0.method1098(true);
        this.field1540 = arg0.method1055(119) == 1;
        int var2 = arg0.method1055(110);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1545 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1545[var3] = arg0.method1098(true);
        }
        if (var2 > 1) {
            this.field1539 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1539[var4] = arg0.method1055(118);
            }
        }
        if (var2 > 1) {
            this.field1546 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1546[var5] = arg0.method1055(118);
            }
        }
        this.field1547 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1547[var6] = arg0.method1062(1809568712);
        }
        this.field1544 = arg0.method1055(110);
        this.field1542 = arg0.method1055(120);
        this.field1541 = null;
    }
}

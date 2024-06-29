import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class97 extends class145 {

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    private int field1403 = 585;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "Ljava/lang/String;")
    public static String field1399 = "Loaded defaults";

    @OriginalMember(owner = "client!e", name = "P", descriptor = "Ljava/lang/String;")
    public static String field1404 = "Created gameworld";

    @OriginalMember(owner = "client!e", name = "N", descriptor = "Laj;")
    public static class71 field1402 = new class71(8);

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field1400;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(BII)V", line = 3)
    public static final void method818(byte arg0, int arg1, int arg2) {
        class127.field1786 = new class410(arg1);
        ++field1395;
        class362.field4992 = new class410(arg2);
        if (arg0 < 104) {
            method818((byte) 110, 9, -124);
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V", line = 15)
    public static void method819(int arg0) {
        field1399 = null;
        field1402 = null;
        if (arg0 != -31201) {
            method819(-125);
        }
        field1400 = null;
        field1404 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[I", line = 28)
    public final int[] method3(int arg0, int arg1) {
        ++field1405;
        int[] var3 = super.field2218.method1614(123, arg0);
        if (super.field2218.field3396) {
            int var4 = class134.field1902[arg0];
            for (int var5 = 0; ~var5 > ~class156.field2364; ++var5) {
                int var6 = class229.field3181[var5];
                if (~var6 < ~this.field1403 && ~var6 > ~(4096 - this.field1403) && var4 > -this.field1403 + 2048 && this.field1403 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field1403 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (2048 - this.field1403 < var6 && ~var6 > ~(this.field1403 + 2048)) {
                    int var11 = var4 - 2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field1403;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field1403 + 2048);
                } else if (this.field1403 <= var4 && ~(4096 - this.field1403) <= ~var4) {
                    if (~var6 <= ~this.field1403 && ~(-this.field1403 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field1403 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field1403;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field1403 + 2048);
                }
            }
        }
        int var23 = 62 % ((arg1 - 16) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lrk;I)V", line = 112)
    public static final void method820(class427 arg0, int arg1) {
        ++field1401;
        if (arg1 <= 16) {
            field1406 = 98;
        }
        class420.field5888 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V", line = 129)
    public class97() {
        super(0, true);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lap;BI)V", line = 132)
    public final void method2(class289 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            this.field1403 = arg0.method1853(-23);
        }
        int var5 = 34 % ((arg1 - 11) / 52);
        ++field1397;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class239 extends class264 {

    @OriginalMember(owner = "client!jq", name = "U", descriptor = "I")
    private int field3500 = -1;

    @OriginalMember(owner = "client!jq", name = "P", descriptor = "I")
    public static int field3495 = 0;

    @OriginalMember(owner = "client!jq", name = "Y", descriptor = "[I")
    public static int[] field3504 = new int[2];

    @OriginalMember(owner = "client!jq", name = "X", descriptor = "Z")
    public static boolean field3503 = true;

    @OriginalMember(owner = "client!jq", name = "ab", descriptor = "Lmo;")
    public static class336 field3506 = new class336(8);

    @OriginalMember(owner = "client!jq", name = "N", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!jq", name = "O", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!jq", name = "Q", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!jq", name = "R", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!jq", name = "S", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!jq", name = "T", descriptor = "I")
    public int field3499;

    @OriginalMember(owner = "client!jq", name = "V", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!jq", name = "Z", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!jq", name = "bb", descriptor = "I")
    public int field3507;

    @OriginalMember(owner = "client!jq", name = "W", descriptor = "[I")
    public int[] field3502;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(BI)[[I", line = 3)
    public int[][] method5(byte arg0, int arg1) {
        ++field3493;
        if (arg0 != 116) {
            field3506 = null;
        }
        int[][] var3 = super.field3816.method1928((byte) 42, arg1);
        if (super.field3816.field4208 && this.method1668((byte) -103)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class129.field1772 != ~this.field3507 ? this.field3507 * arg1 / class129.field1772 : arg1) * this.field3499;
            if (class478.field6792 == this.field3499) {
                for (int var8 = 0; ~class478.field6792 < ~var8; ++var8) {
                    int var9 = this.field3502[var7++];
                    var6[var8] = class88.method739(var9 << 4, 4080);
                    var5[var8] = class88.method739(4080, var9 >> 4);
                    var4[var8] = class88.method739(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class478.field6792; ++var10) {
                    int var11 = this.field3499 * var10 / class478.field6792;
                    int var12 = this.field3502[var7 + var11];
                    var6[var10] = class88.method739(4080, var12 << 4);
                    var5[var10] = class88.method739(65280, var12) >> 4;
                    var4[var10] = class88.method739(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V", line = 76)
    public class239() {
        super(0, false);
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)Z", line = 88)
    public final boolean method1668(byte arg0) {
        ++field3498;
        if (this.field3502 != null) {
            return true;
        } else if (~this.field3500 <= -1) {
            class355 var2 = class432.field6110 < 0 ? class355.method2190(class183.field2758, this.field3500) : class355.method2187(class183.field2758, class432.field6110, this.field3500);
            var2.method2192();
            this.field3502 = var2.method2194();
            this.field3499 = var2.field4877;
            this.field3507 = var2.field4876;
            return true;
        } else {
            if (arg0 >= -24) {
                field3494 = 10;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)V", line = 114)
    public final void method1669(int arg0) {
        super.method1669(arg0);
        ++field3501;
        this.field3502 = null;
        if (arg0 != -8433) {
            method1671(101);
        }
    }

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "(I)I", line = 129)
    public final int method1670(int arg0) {
        ++field3496;
        if (arg0 != 1) {
            field3495 = -60;
        }
        return this.field3500;
    }

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "(I)V", line = 147)
    public static final void method1671(int arg0) {
        ++field3497;
        if (arg0 != 27263) {
            field3494 = -25;
        }
        class336 var1 = class279.field4010;
        synchronized (class279.field4010) {
            class279.field4010.method2109(-1);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLkk;I)V", line = 166)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        ++field3505;
        if (~arg2 == -1) {
            this.field3500 = arg1.method1134(-16848);
        }
        if (arg0 <= 31) {
            this.method1668((byte) 65);
        }
    }

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "(I)V", line = 180)
    public static void method1672(int arg0) {
        int var1 = 23 % ((-15 - arg0) / 54);
        field3506 = null;
        field3504 = null;
    }
}

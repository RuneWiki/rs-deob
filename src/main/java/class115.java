import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class115 extends class144 {

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    private int field1584 = 10;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    private int field1583 = 2048;

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "I")
    private int field1593 = 0;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public static int field1586 = -1;

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field1595 = "Connecting to update server";

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
    public static int field1590 = 0;

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "Z")
    public static boolean field1596 = true;

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "Lrc;")
    public static class9 field1594 = new class9(50);

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "I")
    public static int field1597 = 0;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "Lbc;")
    public static class282 field1587;

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "Lsi;")
    public static class56 field1592;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "[I")
    private int[] field1580;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "[I")
    private int[] field1585;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "[Lwj;")
    public static class130[] field1579;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        ++field1582;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field1593 = arg1.method1407(115);
                }
            } else {
                this.field1583 = arg1.method1380(true);
            }
        } else {
            this.field1584 = arg1.method1407(113);
        }
        if (arg2 != 20630) {
            field1595 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)J")
    public static final long method740(boolean arg0) {
        if (arg0) {
            return 81L;
        } else {
            ++field1589;
            return class55.field648.method839(true);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        int[] var3 = super.field2069.method425(true, arg0);
        if (super.field2069.field820) {
            int var4 = class143.field2045[arg0];
            if (~this.field1593 == -1) {
                short var5 = 0;
                for (int var6 = 0; this.field1584 > var6; ++var6) {
                    if (~var4 <= ~this.field1580[var6] && ~var4 > ~this.field1580[var6 + 1]) {
                        if (this.field1585[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class194.method1261(var3, 0, class104.field1411, var5);
            } else {
                for (int var7 = 0; ~var7 > ~class104.field1411; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class87.field1178[var7];
                    int var11 = this.field1593;
                    if (var11 != 1) {
                        if (~var11 != -3) {
                            if (var11 == 3) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = 2048 - -(var10 - 4096 + var4 >> 1);
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; this.field1584 > var12; ++var12) {
                        if (~this.field1580[var12] >= ~var8 && ~var8 > ~this.field1580[var12 - -1]) {
                            if (~var8 > ~this.field1585[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        if (arg1 != 255) {
            this.method742((byte) 15);
        }
        ++field1591;
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(B)V")
    public final void method31(byte arg0) {
        this.method742((byte) 116);
        if (arg0 > -109) {
            field1587 = null;
        }
        ++field1588;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class115() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V")
    public static void method741(boolean arg0) {
        field1587 = null;
        field1592 = null;
        field1594 = null;
        field1595 = null;
        if (arg0) {
            field1579 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(B)V")
    private final void method742(byte arg0) {
        int var2 = 0;
        if (arg0 > 46) {
            this.field1580 = new int[this.field1584 + 1];
            this.field1585 = new int[this.field1584 + 1];
            ++field1581;
            int var3 = 4096 / this.field1584;
            int var4 = this.field1583 * var3 >> 12;
            for (int var5 = 0; var5 < this.field1584; ++var5) {
                this.field1580[var5] = var2;
                this.field1585[var5] = var2 - -var4;
                var2 += var3;
            }
            this.field1580[this.field1584] = 4096;
            this.field1585[this.field1584] = this.field1585[0] + 4096;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class18 extends class76 {

    @OriginalMember(owner = "client!lb", name = "jb", descriptor = "I")
    private int field392 = 4096;

    @OriginalMember(owner = "client!lb", name = "fb", descriptor = "I")
    private int field388 = 0;

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "Lia;")
    private static class257 field383 = class28.method234(-116, "green:");

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "Z")
    public static boolean field384 = false;

    @OriginalMember(owner = "client!lb", name = "db", descriptor = "Lia;")
    public static class257 field386 = class28.method234(118, "m");

    @OriginalMember(owner = "client!lb", name = "gb", descriptor = "Lia;")
    public static class257 field389 = field383;

    @OriginalMember(owner = "client!lb", name = "hb", descriptor = "Lia;")
    public static class257 field390 = field383;

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!lb", name = "cb", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!lb", name = "eb", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!lb", name = "ib", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!lb", name = "kb", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!lb", name = "lb", descriptor = "Lvb;")
    public static class226 field394;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method157(int arg0, byte arg1) {
        if (arg1 <= 2) {
            field386 = null;
        }
        ++field381;
        int[][] var3 = super.field1485.method649(arg0, true);
        if (super.field1485.field1692) {
            int[][] var4 = this.method565((byte) -20, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class96.field1807; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 > ~this.field388) {
                    var8[var11] = this.field388;
                } else if (this.field392 < var12) {
                    var8[var11] = this.field392;
                } else {
                    var8[var11] = var12;
                }
                if (~var13 <= ~this.field388) {
                    if (this.field392 >= var13) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field392;
                    }
                } else {
                    var9[var11] = this.field388;
                }
                if (this.field388 <= var14) {
                    if (~this.field392 > ~var14) {
                        var10[var11] = this.field392;
                    } else {
                        var10[var11] = var14;
                    }
                } else {
                    var10[var11] = this.field388;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class18() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLib;)V")
    public static final void method168(boolean arg0, class180 arg1) {
        if (arg0) {
            method168(false, (class180) null);
        }
        class103 var2 = (class103) class79.field1553.method434((byte) -93, arg1.field3140.method1668(124));
        if (var2 != null) {
            var2.method748((byte) -126);
        } else {
            class13.method135((class197) null, arg1.field4182[0], (class233) null, class189.field3261, arg1, 0, 128, arg1.field4119[0]);
        }
        ++field382;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field391;
        if (arg0 != -9351) {
            field386 = null;
        }
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (super.field1467.field2980) {
            int[] var4 = this.method562(arg1, 0, (byte) -104);
            for (int var5 = 0; ~var5 > ~class96.field1807; ++var5) {
                int var6 = var4[var5];
                if (var6 < this.field388) {
                    var3[var5] = this.field388;
                } else if (~this.field392 > ~var6) {
                    var3[var5] = this.field392;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "(I)V")
    public static void method170(int arg0) {
        field383 = null;
        field386 = null;
        field390 = null;
        field389 = null;
        field394 = null;
        if (arg0 != 0) {
            method168(true, (class180) null);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field1477 = ~arg0.method1051((byte) -37) == -2;
                }
            } else {
                this.field392 = arg0.method1063(-17162);
            }
        } else {
            this.field388 = arg0.method1063(-17162);
        }
        if (arg1 > -86) {
            field384 = true;
        }
        ++field385;
    }
}

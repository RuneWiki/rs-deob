import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class27 extends class64 {

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    private int field564 = 4096;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
    private int field562 = 0;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "Lcd;")
    public static class23 field561 = class54.method414(")2", -1);

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "Lsa;")
    public static class162 field557 = new class162(64);

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "Lcd;")
    private static class23 field567 = class54.method414("New User", -1);

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
    public static int field568 = 0;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "Lcd;")
    public static class23 field566 = field567;

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "Lcd;")
    public static class23 field569 = class54.method414("<col=00ffff>", -1);

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field558;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(I)V")
    public static void method197(int arg0) {
        field567 = null;
        if (arg0 <= 76) {
            method197(-96);
        }
        field569 = null;
        field566 = null;
        field561 = null;
        field557 = null;
        field558 = null;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)I")
    public static int method198(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        int var4 = 53 / ((7 - arg0) / 43);
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field1510 = arg2.method1202(124) == 1;
                }
            } else {
                this.field564 = arg2.method1197(-1);
            }
        } else {
            this.field562 = arg2.method1197(-1);
        }
        ++field565;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != -9421) {
            this.method36(-120, true);
        }
        int[] var3 = super.field1513.method1033(-126, arg0);
        ++field563;
        if (super.field1513.field3368) {
            int[] var4 = this.method479(-1, arg0, 0);
            for (int var5 = 0; ~class168.field3367 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field562 < ~var6) {
                    var3[var5] = this.field562;
                } else if (var6 <= this.field564) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field564;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lfa;I)Lfa;")
    public static final class47 method199(class47 arg0, int arg1) {
        ++field560;
        if (arg1 != 2) {
            field567 = null;
        }
        class47 var2 = class72.method511(arg0, (byte) -89);
        if (var2 == null) {
            var2 = arg0.field1009;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class27() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method36(int arg0, boolean arg1) {
        ++field559;
        if (!arg1) {
            this.method37((byte) -13, -20, (class189) null);
        }
        int[][] var3 = super.field1508.method846(7287, arg0);
        if (super.field1508.field2757) {
            int[][] var4 = this.method482(0, arg0, (byte) -125);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class168.field3367 < ~var11; ++var11) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var7[var11];
                if (~this.field562 >= ~var12) {
                    if (var12 > this.field564) {
                        var8[var11] = this.field564;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field562;
                }
                if (this.field562 <= var13) {
                    if (~this.field564 > ~var13) {
                        var9[var11] = this.field564;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field562;
                }
                if (this.field562 <= var14) {
                    if (this.field564 >= var14) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field564;
                    }
                } else {
                    var10[var11] = this.field562;
                }
            }
        }
        return var3;
    }
}

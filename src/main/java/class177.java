import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("tb")
public class class177 extends class85 {

    @OriginalMember(owner = "tb", name = "R", descriptor = "I")
    private int field3333 = 585;

    @OriginalMember(owner = "tb", name = "Q", descriptor = "Llf;")
    private static class109 field3332 = class35.method275("You can(Wt add yourself to your own friend list)3", 2);

    @OriginalMember(owner = "tb", name = "U", descriptor = "Llf;")
    public static class109 field3336 = field3332;

    @OriginalMember(owner = "tb", name = "W", descriptor = "Llf;")
    public static class109 field3338 = class35.method275("und haben es deaktiviert)3 Klicken Sie auf der", 2);

    @OriginalMember(owner = "tb", name = "V", descriptor = "Ltf;")
    public static class181 field3337 = new class181();

    @OriginalMember(owner = "tb", name = "cb", descriptor = "I")
    public static int field3344 = 0;

    @OriginalMember(owner = "tb", name = "eb", descriptor = "Llf;")
    private static class109 field3346 = class35.method275("Connection lost)3", 2);

    @OriginalMember(owner = "tb", name = "Z", descriptor = "Llf;")
    public static class109 field3341 = field3346;

    @OriginalMember(owner = "tb", name = "db", descriptor = "I")
    public static int field3345 = 0;

    @OriginalMember(owner = "tb", name = "fb", descriptor = "I")
    public static int field3347 = 0;

    @OriginalMember(owner = "tb", name = "S", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "tb", name = "T", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "tb", name = "X", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "tb", name = "Y", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "tb", name = "bb", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "tb", name = "ab", descriptor = "Lbg;")
    public static class18 field3342;

    @OriginalMember(owner = "tb", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (arg0 >= -120) {
            this.method31((byte) -111, -89, (class86) null);
        }
        ++field3335;
        if (arg1 == 0) {
            this.field3333 = arg2.method569(true);
        }
    }

    @OriginalMember(owner = "tb", name = "c", descriptor = "(II)Lhe;")
    public static final class74 method1207(int arg0, int arg1) {
        ++field3340;
        class74 var2 = (class74) class83.field1688.method1086((long) arg1, -100);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class143.field2770.method147(0, arg1, 16);
            class74 var4 = new class74();
            if (var3 != null) {
                var4.method465(0, new class86(var3));
            }
            class83.field1688.method1082((long) arg1, -125, var4);
            if (arg0 > -50) {
                field3332 = null;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "tb", name = "e", descriptor = "(I)V")
    public static void method1208(int arg0) {
        field3346 = null;
        field3342 = null;
        int var1 = -58 / ((arg0 - 12) / 40);
        field3336 = null;
        field3332 = null;
        field3338 = null;
        field3341 = null;
        field3337 = null;
    }

    @OriginalMember(owner = "tb", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        int[] var3 = super.field1736.method835(-314, arg1);
        if (arg0 > -49) {
            return null;
        } else {
            ++field3334;
            if (super.field1736.field2253) {
                int var4 = class54.field1083[arg1];
                for (int var5 = 0; var5 < class57.field1152; ++var5) {
                    int var6 = class47.field980[var5];
                    if (~this.field3333 > ~var6 && var6 < -this.field3333 + 4096 && ~(2048 - this.field3333) > ~var4 && ~(this.field3333 + 2048) < ~var4) {
                        int var7 = 2048 - var6;
                        int var8 = var7 < 0 ? -var7 : var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field3333 + 2048);
                        var3[var5] = -var10 + 4096;
                    } else if (~var6 < ~(-this.field3333 + 2048) && ~var6 > ~(this.field3333 + 2048)) {
                        int var11 = var4 + -2048;
                        int var12 = ~var11 <= -1 ? var11 : -var11;
                        int var13 = var12 - this.field3333;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field3333 + 2048);
                    } else if (this.field3333 <= var4 && -this.field3333 + 4096 >= var4) {
                        if (~var6 <= ~this.field3333 && var6 <= -this.field3333 + 4096) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = var15 < 0 ? -var15 : var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field3333 + 2048);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 - 2048;
                        int var20 = ~var19 > -1 ? -var19 : var19;
                        int var21 = var20 - this.field3333;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (-this.field3333 + 2048);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "tb", name = "<init>", descriptor = "()V")
    public class177() {
        super(0, true);
    }
}

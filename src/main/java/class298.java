import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class298 extends class332 {

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    public int field4654 = 0;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "I")
    public static int field4658 = -1;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4657 = "Discard";

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public int field4639;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public int field4640;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public int field4641;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public int field4642;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public int field4643;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public int field4644;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public int field4649;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    public int field4651;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    public int field4652;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    public int field4653;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Lqb;")
    public class109 field4636;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Ldc;")
    public static class116 field4637;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "Ldf;")
    public class174 field4638;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "Ldf;")
    public class174 field4650;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "Lhc;")
    public class184 field4656;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Lfc;")
    public class238 field4633;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Z")
    public boolean field4634;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "[I")
    public int[] field4659;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V", line = 11)
    public final void method2107(int arg0) {
        int var2 = this.field4643;
        if (this.field4633 != null) {
            class238 var5 = this.field4633.method1706(true);
            if (var5 == null) {
                this.field4659 = null;
                this.field4644 = 0;
                this.field4653 = 0;
                this.field4643 = -1;
                this.field4642 = 0;
                this.field4652 = 0;
            } else {
                this.field4642 = var5.field3529;
                this.field4652 = var5.field3561 * 128;
                this.field4653 = var5.field3562;
                this.field4659 = var5.field3549;
                this.field4644 = var5.field3520;
                this.field4643 = var5.field3538;
            }
        } else if (this.field4656 != null) {
            int var3 = class142.method945(this.field4656, false);
            if (var2 != var3) {
                this.field4643 = var3;
                class282 var4 = this.field4656.field2657;
                if (var4.field4401 != null) {
                    var4 = var4.method2021((byte) 22);
                }
                if (var4 == null) {
                    this.field4653 = this.field4652 = 0;
                } else {
                    this.field4652 = var4.field4417 * 128;
                    this.field4653 = var4.field4403;
                }
            }
        } else if (this.field4636 != null) {
            this.field4643 = class224.method1547((byte) 117, this.field4636);
            this.field4653 = this.field4636.field1503;
            this.field4652 = this.field4636.field1522 * 128;
        }
        if (arg0 != 12295) {
            return;
        }
        if (this.field4643 != var2 && this.field4650 != null) {
            class19.field255.method27(this.field4650);
            this.field4650 = null;
        }
        field4655++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)V", line = 93)
    public static final void method2108(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class140.field1954.field1400 = 0;
        int var5 = 13 % ((64 - arg2) / 61);
        class140.field1954.method648(20, (byte) 38);
        field4645++;
        class140.field1954.method648(arg4, (byte) 38);
        class140.field1954.method648(arg1, (byte) 38);
        class140.field1954.method662(true, arg0);
        class140.field1954.method662(true, arg3);
        class292.field4581 = 0;
        class307.field4747 = 0;
        class239.field3585 = 1;
        class272.field4272 = -3;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)Lej;", line = 116)
    public static final class168 method2109(int arg0, int arg1, int arg2) {
        class225 var3 = class158.field2184[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3196;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 126)
    public static final void method2110(int arg0, String arg1, boolean arg2) {
        field4646++;
        short[] var3 = new short[16];
        String var4 = arg1.toLowerCase();
        int var5 = 0;
        for (int var6 = 0; var6 < class342.field5316; var6++) {
            class93 var7 = class60.method353(var6, (byte) -40);
            if ((!arg2 || var7.field1187) && var7.field1164 == -1 && var7.field1194 == -1 && var7.field1190 == 0 && var7.field1167.toLowerCase().indexOf(var4) != -1) {
                if (var5 >= 250) {
                    class280.field4342 = null;
                    class345.field5354 = -1;
                    return;
                }
                if (var3.length <= var5) {
                    short[] var8 = new short[var3.length * 2];
                    for (int var9 = 0; var9 < var5; var9++) {
                        var8[var9] = var3[var9];
                    }
                    var3 = var8;
                }
                var3[var5++] = (short) var6;
            }
        }
        class280.field4342 = var3;
        class345.field5354 = var5;
        class158.field2177 = 0;
        String[] var10 = new String[class345.field5354];
        for (int var11 = 0; var11 < class345.field5354; var11++) {
            var10[var11] = class60.method353(var3[var11], (byte) -69).field1167;
        }
        if (arg0 != 128) {
            field4637 = (class116) null;
        }
        class276.method1983(class280.field4342, var10, -121);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)V", line = 206)
    public static void method2111(boolean arg0) {
        field4657 = null;
        field4637 = null;
        if (!arg0) {
            method2110(57, (String) null, false);
        }
    }
}

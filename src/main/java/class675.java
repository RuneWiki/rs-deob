import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class675 extends class381 implements class439 {

    @OriginalMember(owner = "client!vca", name = "q", descriptor = "C")
    public char field9519;

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "I")
    public static int field9510;

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "I")
    public static int field9511;

    @OriginalMember(owner = "client!vca", name = "j", descriptor = "I")
    public static int field9512;

    @OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
    public static int field9513;

    @OriginalMember(owner = "client!vca", name = "l", descriptor = "I")
    public static int field9514;

    @OriginalMember(owner = "client!vca", name = "m", descriptor = "I")
    public static int field9515;

    @OriginalMember(owner = "client!vca", name = "n", descriptor = "I")
    public static int field9516;

    @OriginalMember(owner = "client!vca", name = "o", descriptor = "I")
    public int field9517;

    @OriginalMember(owner = "client!vca", name = "r", descriptor = "I")
    public int field9520;

    @OriginalMember(owner = "client!vca", name = "s", descriptor = "I")
    public int field9521;

    @OriginalMember(owner = "client!vca", name = "t", descriptor = "I")
    public static int field9522;

    @OriginalMember(owner = "client!vca", name = "p", descriptor = "J")
    public long field9518;

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(B)I")
    public final int method2607(byte arg0) {
        if (arg0 <= 11) {
            field9516 = -101;
        }
        field9515++;
        return this.field9517;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method3788(byte arg0, String arg1) {
        field9510++;
        if (!class240.field3164 || (class282.field3771 & 0x18) == 0) {
            return;
        }
        boolean var2 = false;
        int var3 = class416.field6150;
        int[] var4 = class35.field554;
        for (int var5 = 0; var5 < var3; var5++) {
            class71 var6 = class35.field551[var4[var5]];
            if (var6.field1094 != null && var6.field1094.equalsIgnoreCase(arg1) && (class321.field4681 == var6 && (class282.field3771 & 0x10) != 0 || var6 != null && (class282.field3771 & 0x8) != 0)) {
                class567.field8269++;
                class654 var7 = class631.method3628(class464.field6679, (byte) -51, class357.field5280);
                var7.field9358.method3143(class279.field3689, (byte) 72);
                var7.field9358.method3124(0, 79);
                var7.field9358.method3163(-128, class492.field7003);
                var7.field9358.method3140(class412.field6116, -1);
                var7.field9358.method3143(var4[var5], (byte) 72);
                class444.method2623(120, var7);
                var2 = true;
                class151.method1077(0, -2, var6.method422((byte) 78), (byte) 46, var6.field7429[0], var6.method422((byte) -40), true, 0, var6.field7430[0]);
                break;
            }
        }
        if (!var2) {
            class36.method213(0, 4, class279.field3646.method1654(126, class262.field3401) + arg1);
        }
        int var8 = -48 % ((65 - arg0) / 52);
        if (class240.field3164) {
            class541.method3183(1);
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(III)Z")
    public static final boolean method3789(int arg0, int arg1, int arg2) {
        int var3 = 83 / ((arg1 + 36) / 33);
        field9512++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)J")
    public final long method2603(int arg0) {
        field9514++;
        int var2 = 49 % ((18 - arg0) / 47);
        return this.field9518;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z)I")
    public final int method2606(boolean arg0) {
        field9513++;
        return arg0 ? this.field9521 : -32;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)I")
    public final int method2605(byte arg0) {
        field9511++;
        if (arg0 != 19) {
            this.field9518 = -113L;
        }
        return this.field9520;
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)C")
    public final char method2604(int arg0) {
        if (arg0 > -63) {
            this.method2604(-126);
        }
        field9522++;
        return this.field9519;
    }
}

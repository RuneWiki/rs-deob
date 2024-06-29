import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class470 {

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public int field6820;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lqv;")
    public static class316 field6822 = new class316(93, -2);

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "F")
    public static float field6824;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "[I")
    public static int[] field6825;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)I")
    public static final int method2782(boolean arg0) {
        if (!arg0) {
            field6825 = null;
        }
        field6821++;
        if (class290.field4312 == null) {
            if (!class248.field3714 && class430.field6184 > 0) {
                if (class65.field1106 && class218.field3339.method74(81, 64) && class430.field6184 > 2) {
                    return ((class341) class258.field3829.field1835.field859.field859).field5036;
                }
                return ((class341) class258.field3829.field1835.field859).field5036;
            }
            int var1 = class49.field909.method639((byte) -120);
            int var2 = class49.field909.method644(101);
            int var3 = class252.field3743;
            int var4 = class291.field4322;
            int var5 = class415.field5887;
            if (var1 > var3 && var1 < var3 + var5) {
                int var6 = -1;
                for (int var7 = 0; var7 < class430.field6184; var7++) {
                    if (class535.field7888) {
                        int var12 = var4 + ((class430.field6184 + -1 + -var7) * 16) + 33;
                        if (var12 - 13 < var2 && var2 <= var12 + 3) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class430.field6184 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > (var11 - 13) && var2 <= var11 + 3) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class288 var9 = new class288(class258.field3829);
                    for (class341 var10 = (class341) var9.method1846(-18451); var10 != null; var10 = (class341) var9.method1844(95)) {
                        if (var6 == var8++) {
                            return var10.field5036;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/lang/String;B)I")
    public static final int method2783(int arg0, String arg1, byte arg2) {
        field6818++;
        if (arg2 >= -93) {
            method2782(false);
        }
        return class434.method2568(true, arg0, (byte) -78, arg1);
    }

    @OriginalMember(owner = "client!fh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6814++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IJ)V")
    public static final void method2784(int arg0, long arg1) {
        field6817++;
        try {
            if (arg0 == -1) {
                Thread.sleep(arg1);
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)I")
    public final int method2785(int arg0) {
        if (arg0 != -1) {
            field6824 = 1.192104F;
        }
        field6815++;
        return this.field6820;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static void method2786(byte arg0) {
        field6825 = null;
        field6822 = null;
        int var1 = 21 / ((arg0 + 63) / 50);
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class470(String arg0, int arg1) {
        this.field6820 = arg1;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)[Lft;")
    public static final class4[] method2787(byte arg0) {
        if (arg0 != -59) {
            field6822 = null;
        }
        field6823++;
        return new class4[] { class195.field2838, class195.field2839, class195.field2840, class195.field2841, class195.field2842, class195.field2843, class195.field2844, class195.field2845, class195.field2846, class195.field2847, class195.field2848, class195.field2849, class195.field2850 };
    }

    static {
        new class44(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
    }
}

import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class class24 extends class85 {

    @OriginalMember(owner = "cc", name = "R", descriptor = "I")
    private int field532 = 0;

    @OriginalMember(owner = "cc", name = "W", descriptor = "I")
    private int field537 = 4096;

    @OriginalMember(owner = "cc", name = "U", descriptor = "[I")
    public static int[] field535 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "cc", name = "bb", descriptor = "[I")
    public static int[] field542 = new int[128];

    @OriginalMember(owner = "cc", name = "Z", descriptor = "Ljava/util/Calendar;")
    public static Calendar field540 = Calendar.getInstance();

    @OriginalMember(owner = "cc", name = "eb", descriptor = "Llf;")
    public static class109 field545 = class35.method275("ams", 2);

    @OriginalMember(owner = "cc", name = "fb", descriptor = "I")
    public static int field546 = 0;

    @OriginalMember(owner = "cc", name = "Q", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "cc", name = "S", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "cc", name = "T", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "cc", name = "V", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "cc", name = "Y", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "cc", name = "ab", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "cc", name = "cb", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "cc", name = "db", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "cc", name = "gb", descriptor = "Lbg;")
    public static class18 field547;

    @OriginalMember(owner = "cc", name = "X", descriptor = "[[I")
    public static int[][] field538;

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Lvg;BI)Llf;")
    public static final class109 method213(class200 arg0, byte arg1, int arg2) {
        ++field536;
        if (!class148.method1035(class126.method918(arg0, 99), arg2, 255) && arg0.field3861 == null) {
            return null;
        } else {
            if (arg1 <= 99) {
                method213((class200) null, (byte) -51, -104);
            }
            if (arg0.field3869 != null && ~arg2 > ~arg0.field3869.length && arg0.field3869[arg2] != null && arg0.field3869[arg2].method774((byte) 62).method786(-30593) != 0) {
                return arg0.field3869[arg2];
            } else {
                return class158.field2973 ? class36.method279(new class109[] { class184.field3452, class52.method345((byte) 85, arg2) }, 122) : null;
            }
        }
    }

    @OriginalMember(owner = "cc", name = "<init>", descriptor = "()V")
    public class24() {
        super(1, true);
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ILlf;Llf;ZLbg;I)V")
    public static final void method214(int arg0, class109 arg1, class109 arg2, boolean arg3, class18 arg4, int arg5) {
        if (arg5 != 0) {
            field546 = -78;
        }
        ++field541;
        int var6 = arg4.method151((byte) 106, arg1);
        int var7 = arg4.method154((byte) -39, arg2, var6);
        class16.method111(var7, arg5 + -114, arg0, var6, arg3, arg4);
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (arg0 >= -120) {
            field545 = null;
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field537 = arg2.method569(true);
            }
        } else {
            this.field532 = arg2.method569(true);
        }
        ++field539;
    }

    @OriginalMember(owner = "cc", name = "d", descriptor = "(B)V")
    public static void method215(byte arg0) {
        field538 = null;
        field540 = null;
        field535 = null;
        if (arg0 != -85) {
            field538 = null;
        }
        field542 = null;
        field547 = null;
        field545 = null;
    }

    @OriginalMember(owner = "cc", name = "e", descriptor = "(B)V")
    public static final void method216(byte arg0) {
        ++field544;
        class132.field2542.method1088(-51);
        class76.field1468.method1088(arg0 + 48);
        class117.field2309.method1088(-51);
        class117.field2314.method1088(arg0 ^ 80);
        class210.field4087.method1088(-51);
        if (arg0 != -99) {
            method214(99, (class109) null, (class109) null, true, (class18) null, 66);
        }
    }

    @OriginalMember(owner = "cc", name = "c", descriptor = "(II)I")
    public static int method217(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        ++field534;
        if (arg0 > -49) {
            return null;
        } else {
            int[] var3 = super.field1736.method835(-314, arg1);
            if (super.field1736.field2253) {
                int[] var4 = this.method540(arg1, -125, 0);
                for (int var5 = 0; ~var5 > ~class57.field1152; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = ~var6 <= ~this.field532 && ~this.field537 <= ~var6 ? 4096 : 0;
                }
            }
            return var3;
        }
    }
}

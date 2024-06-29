import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class58 extends class260 {

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "[F")
    public static float[] field723 = new float[16384];

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "[F")
    public static float[] field730 = new float[16384];

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "Z")
    public static boolean field724 = false;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "Lsha;")
    public static class758 field728;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field730[var2] = (float) Math.sin((double) var2 * var0);
            field723[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZLha;Z)Ljm;", line = 4)
    public static final class717 method395(int arg0, boolean arg1, class65 arg2, boolean arg3) {
        ++field725;
        if (arg0 == -1) {
            return null;
        } else {
            if (class63.field756 != null) {
                for (int var4 = 0; var4 < class63.field756.length; ++var4) {
                    if (class63.field756[var4] == arg0) {
                        return class65.field792[var4];
                    }
                }
            }
            class717 var5 = (class717) class720.field9964.method3742((byte) 67, (long) arg0);
            if (var5 != null) {
                if (arg3 && var5.field9943 == null) {
                    class6 var6 = class119.method899(-30298, class452.field6351, arg0);
                    if (var6 == null) {
                        return null;
                    }
                    var5.field9943 = var6;
                }
                return var5;
            } else {
                class1[] var7 = class1.method2(class268.field3900, arg0);
                if (var7 == null) {
                    return null;
                } else {
                    class6 var8 = class119.method899(-30298, class452.field6351, arg0);
                    if (var8 == null) {
                        return null;
                    } else {
                        if (!arg1) {
                            field733 = 112;
                        }
                        class717 var9;
                        if (!arg3) {
                            var9 = new class717(arg2.method437(var8, var7, true));
                        } else {
                            var9 = new class717(arg2.method437(var8, var7, true), var8);
                        }
                        class720.field9964.method3739((long) arg0, (byte) 66, var9);
                        return var9;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)I", line = 79)
    public final int method123(int arg0) {
        if (arg0 != 4377) {
            return -95;
        } else {
            ++field731;
            return 1;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lwia;JIIIIZI)V", line = 90)
    public static final void method396(class791 arg0, long arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        class14.field279 = arg7;
        class562.field7991 = arg3;
        class665.field9257 = arg5;
        class161.field2559 = null;
        class106.field1241 = arg0;
        if (arg2 == 0) {
            class350.field4900 = arg4;
            class353.field4975 = 10000;
            class278.field4039 = arg1;
            ++field729;
            class741.field10208 = arg6;
            class90.field1011 = 1;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 116)
    public final void method126(int arg0) {
        ++field727;
        if (arg0 < 102) {
            method396((class791) null, -57L, -121, 85, -128, 46, false, 127);
        }
        if (super.field3828 != 1 && ~super.field3828 != -1) {
            super.field3828 = this.method123(4377);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)V", line = 135)
    public final void method128(int arg0, byte arg1) {
        if (arg1 != 122) {
            field733 = 90;
        }
        super.field3828 = arg0;
        ++field726;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(ILgn;)V", line = 149)
    public class58(int arg0, class729 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(II)I", line = 152)
    public final int method129(int arg0, int arg1) {
        if (arg0 != -1) {
            field728 = null;
        }
        ++field722;
        return 1;
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)I", line = 163)
    public final int method397(int arg0) {
        if (arg0 >= -14) {
            method395(-111, true, (class65) null, false);
        }
        ++field732;
        return super.field3828;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lgn;)V", line = 175)
    public class58(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V", line = 178)
    public static void method398(byte arg0) {
        int var1 = 42 / ((-12 - arg0) / 32);
        field723 = null;
        field728 = null;
        field730 = null;
    }
}

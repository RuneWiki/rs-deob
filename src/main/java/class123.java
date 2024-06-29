import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class123 extends class212 {

    @OriginalMember(owner = "client!fv", name = "r", descriptor = "Z")
    public static boolean field2116 = false;

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!fv", name = "q", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!fv", name = "s", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!fv", name = "t", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!fv", name = "u", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!fv", name = "v", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!fv", name = "x", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)I", line = 3)
    public final int method1054(int arg0) {
        if (arg0 != -32350) {
            this.method417(100, 29);
        }
        ++field2114;
        return super.field3006;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Ldh;)V", line = 14)
    public class123(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)I", line = 19)
    public final int method422(int arg0) {
        ++field2122;
        if (arg0 != 20014) {
            this.method418(true);
        }
        return 0;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(ILdh;)V", line = 34)
    public class123(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)V", line = 37)
    public final void method419(int arg0, int arg1) {
        int var3 = -10 / ((arg0 - 82) / 35);
        super.field3006 = arg1;
        ++field2117;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(CI)Z", line = 47)
    public static final boolean method1055(char arg0, int arg1) {
        ++field2118;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class9.method59(arg0, (byte) 105)) {
            return true;
        } else {
            char[] var2 = class681.field9228;
            for (int var3 = 0; var2.length > var3; ++var3) {
                char var8 = var2[var3];
                if (~arg0 == ~var8) {
                    return true;
                }
            }
            int var4 = -127 / ((arg1 - 44) / 45);
            char[] var5 = class461.field6493;
            for (int var6 = 0; ~var6 > ~var5.length; ++var6) {
                char var7 = var5[var6];
                if (~arg0 == ~var7) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "(II)I", line = 94)
    public static final int method1056(int arg0, int arg1) {
        ++field2113;
        int var2 = 101 % ((-20 - arg1) / 37);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)I", line = 104)
    public final int method417(int arg0, int arg1) {
        ++field2115;
        if (arg0 != 3) {
            field2116 = false;
        }
        return 1;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V", line = 123)
    public static final void method1057(byte arg0) {
        ++field2121;
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class226.field3216[var1] = false;
        }
        class753.field10519 = class275.field3870;
        class361.field5196 = class634.field8721;
        class629.field8657 = class458.field6444;
        class548.field7553 = class641.field8810;
        class705.field9558 = -1;
        class44.field978 = -1;
        class143.field2364 = class108.field1896;
        int var2 = -99 % ((arg0 - 11) / 56);
        class640.field8803 = 0;
        class74.field1344 = class600.field8231;
        class641.field8817 = 0;
        class438.field6252 = 5;
        class599.field8218 = -1;
        class302.field4210 = -1;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)V", line = 155)
    public final void method418(boolean arg0) {
        if (super.field3006 < 0 || ~super.field3006 < -5) {
            super.field3006 = this.method422(20014);
        }
        ++field2119;
        if (arg0) {
            field2120 = 62;
        }
    }
}

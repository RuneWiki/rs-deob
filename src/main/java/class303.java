import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class303 extends class450 {

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field4293 = -1;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)I")
    public final int method68(boolean arg0) {
        if (arg0) {
            this.method1854(2);
        }
        ++field4302;
        return 1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)Z")
    public static final boolean method1849(int arg0, int arg1, int arg2) {
        ++field4299;
        if (arg0 != 3) {
            method1850((class677) null, (byte) -67);
        }
        return (32768 & arg1) != 0;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILup;)V")
    public class303(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)V")
    public final void method67(boolean arg0, int arg1) {
        super.field6170 = arg1;
        if (!arg0) {
            field4293 = -85;
        }
        ++field4298;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lup;)V")
    public class303(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lee;B)Lqk;")
    public static final class15 method1850(class677 arg0, byte arg1) {
        ++field4296;
        int var2 = arg0.method3807(-1);
        if (arg1 >= -35) {
            field4293 = -73;
        }
        return new class15(var2);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)I")
    public final int method1851(boolean arg0) {
        ++field4294;
        if (!arg0) {
            field4293 = 67;
        }
        return super.field6170;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1852(int arg0, int arg1, byte arg2) {
        ++field4301;
        if (arg2 > -5) {
            field4293 = 1;
        }
        return class613.method3335(5, arg0, arg1) || class199.method1343(arg1, 192, arg0);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(II)V")
    public static final void method1853(int arg0, int arg1) {
        ++field4295;
        int var2 = -class92.field1116 + class29.field474;
        if (var2 >= 100) {
            class278.field3898 = 1;
            class12.field193 = -1;
            class264.field3680 = -1;
        } else {
            int var3 = (int) class578.field7586;
            if (~(class167.field2585 >> 8) < ~var3) {
                var3 = class167.field2585 >> 8;
            }
            if (class555.field7298[4] && var3 < class468.field6425[4] + 128) {
                var3 = class468.field6425[4] + 128;
            }
            int var4 = 16383 & (int) class547.field7230 - -class262.field3656;
            class584.method3189(true, class116.field1879, var3, class425.field5854, arg0, (var3 >> 3) * 3 + 600 << 2, class153.method1118(class472.field6475.field3502, class472.field6475.field3505, 126, class507.field6775) - 200, var4);
            float var5 = -((float) ((-var2 + 100) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F) + 1.0F;
            class314.field4488 = (int) ((float) (-class14.field208 + class314.field4488) * var5 + (float) class14.field208);
            class332.field4729 = (int) ((float) (-class745.field10376 + class332.field4729) * var5 + (float) class745.field10376);
            class222.field3162 = (int) ((float) (class222.field3162 - class306.field4407) * var5 + (float) class306.field4407);
            class694.field9662 = (int) ((float) (-class257.field3522 + class694.field9662) * var5 + (float) class257.field3522);
            int var6 = -class564.field7416 + class372.field5175;
            if (arg1 >= -127) {
                method1853(-54, -76);
            }
            if (~var6 < -8193) {
                var6 -= 16384;
            } else if (~var6 > 8191) {
                var6 += 16384;
            }
            class372.field5175 = (int) ((float) var6 * var5 + (float) class564.field7416);
            class372.field5175 &= 16383;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public final void method73(byte arg0) {
        if (super.field6171.method1671(7108) != class628.field8355) {
            super.field6170 = 1;
        } else if (super.field6171.method1672(0)) {
            super.field6170 = 0;
        }
        ++field4297;
        if (~super.field6170 != -1 && super.field6170 != 1) {
            super.field6170 = this.method68(false);
        }
        if (arg0 != 98) {
            field4293 = 52;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)Z")
    public final boolean method1854(int arg0) {
        ++field4300;
        if (super.field6171.method1671(arg0 + 6848) == class628.field8355) {
            return !super.field6171.method1672(arg0 ^ 260);
        } else {
            if (arg0 != 260) {
                field4293 = 72;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field4303;
        if (super.field6171.method1671(7108) == class628.field8355) {
            if (super.field6171.method1672(0)) {
                return 3;
            } else {
                return arg1 != 0 && super.field6171.field3900.method1182(true) != 1 ? 2 : 1;
            }
        } else {
            return arg0 != 0 ? 76 : 3;
        }
    }
}

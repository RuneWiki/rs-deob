import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class18 extends class535 implements class440 {

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "Z")
    public static boolean field196 = false;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field199 = 0;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public static int field204 = 0;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "Z")
    public static boolean field205 = false;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)I")
    public final int method112(int arg0) {
        if (arg0 != -31057) {
            field196 = false;
        }
        ++field203;
        return this.field202;
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Ltt;I[BI)V")
    public class18(class249 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field202 = arg1;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(B)J")
    public final long method113(byte arg0) {
        ++field198;
        if (arg0 != -46) {
            this.method114((byte[]) null, 21, -30, 42);
        }
        return super.field7857.method2918();
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "([BIII)V")
    public final void method114(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method3152(arg0, arg3);
        ++field206;
        if (arg1 < 5) {
            field199 = 90;
        }
        this.field202 = arg2;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)[Lkw;")
    public static final class138[] method115(boolean arg0) {
        if (class2.field23 == null) {
            class138[] var1 = class343.method2207(false, class122.field1844);
            class138[] var2 = new class138[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; ~var1.length < ~var4; ++var4) {
                class138 var8 = var1[var4];
                if ((var8.field2090 <= 0 || ~var8.field2090 <= -25) && ~var8.field2085 <= -801 && ~var8.field2086 <= -601 && (class360.field5314 >= 96 || ~class108.field1631 != -1 || var8.field2085 <= 1024 && var8.field2086 <= 768)) {
                    for (int var9 = 0; var3 > var9; ++var9) {
                        class138 var10 = var2[var9];
                        if (var8.field2085 == var10.field2085 && var8.field2086 == var10.field2086) {
                            if (var10.field2090 < var8.field2090) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    ++var3;
                }
            }
            class2.field23 = new class138[var3];
            class325.method2133(var2, 0, class2.field23, 0, var3);
            int[] var5 = new int[class2.field23.length];
            for (int var6 = 0; class2.field23.length > var6; ++var6) {
                class138 var7 = class2.field23[var6];
                var5[var6] = var7.field2086 * var7.field2085;
            }
            class151.method1085(1, class2.field23, var5);
        }
        ++field197;
        if (!arg0) {
            method115(false);
        }
        return class2.field23;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)Z")
    public static final boolean method116(int arg0) {
        ++field200;
        class130 var1 = class154.field2370.field690.field1936;
        if (var1 != null && class154.field2370.field690 != var1) {
            class376 var2 = (class376) var1;
            if (arg0 != -28633) {
                return true;
            } else {
                if (~var2.field5546 <= -2001) {
                    var2.field5546 -= 2000;
                }
                return ~var2.field5546 == -1009;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)I")
    public final int method117(byte arg0) {
        if (arg0 >= -47) {
            field199 = 47;
        }
        ++field201;
        return 0;
    }
}

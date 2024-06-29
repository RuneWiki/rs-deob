import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class410 extends class329 {

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "Lnn;")
    public static class446 field5752 = new class446(2, 7);

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
    public static int field5758 = 328;

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "I")
    public static int field5757 = 0;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IIIIIF)V", line = 3)
    public class410(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method2404(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field5758 = -103;
        }
        ++field5756;
        return (arg2 & 34) != 0;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)V", line = 17)
    public final void method1721(int arg0, int arg1, int arg2, int arg3) {
        super.field4823 = arg0;
        super.field4830 = arg1;
        if (arg3 == 1) {
            super.field4820 = arg2;
            ++field5755;
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V", line = 30)
    public static void method2405(int arg0) {
        if (arg0 != 0) {
            method2405(84);
        }
        field5752 = null;
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(B)[Lmh;", line = 41)
    public static final class556[] method2406(byte arg0) {
        if (class620.field8429 == null) {
            class556[] var1 = class466.method2640((byte) -21, class495.field6687);
            class556[] var2 = new class556[var1.length];
            int var3 = 0;
            int var4 = class72.field935.method1852(class161.field2038, true);
            label73: for (int var5 = 0; ~var5 > ~var1.length; ++var5) {
                class556 var9 = var1[var5];
                if ((~var9.field7599 >= -1 || var9.field7599 >= 24) && var9.field7596 >= 800 && ~var9.field7592 <= -601 && (var4 != 2 || var9.field7596 <= 800 && var9.field7592 <= 600) && (~var4 != -2 || ~var9.field7596 >= -1025 && var9.field7592 <= 768)) {
                    for (int var10 = 0; var3 > var10; ++var10) {
                        class556 var11 = var2[var10];
                        if (~var9.field7596 == ~var11.field7596 && var9.field7592 == var11.field7592) {
                            if (~var9.field7599 < ~var11.field7599) {
                                var2[var10] = var9;
                            }
                            continue label73;
                        }
                    }
                    var2[var3] = var9;
                    ++var3;
                }
            }
            class620.field8429 = new class556[var3];
            class657.method3640(var2, 0, class620.field8429, 0, var3);
            int[] var6 = new int[class620.field8429.length];
            for (int var7 = 0; var7 < class620.field8429.length; ++var7) {
                class556 var8 = class620.field8429[var7];
                var6[var7] = var8.field7596 * var8.field7592;
            }
            class43.method257(var6, class620.field8429, (byte) -107);
        }
        if (arg0 >= -67) {
            return null;
        } else {
            ++field5753;
            return class620.field8429;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IF)V", line = 125)
    public final void method1720(int arg0, float arg1) {
        if (arg0 != -22243) {
            field5752 = null;
        }
        ++field5754;
        super.field4832 = arg1;
    }
}

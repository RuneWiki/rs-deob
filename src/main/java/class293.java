import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class293 {

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field4613 = 0;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field4617 = 0;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "Lnb;")
    public class315 field4615;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "Ldg;")
    public class320 field4619;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "[Lai;")
    public static class126[] field4614;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)[Lgk;", line = 6)
    public static final class7[] method2058(int arg0) {
        class7[] var1 = new class7[class103.field1744];
        if (arg0 != 255) {
            return (class7[]) null;
        }
        field4612++;
        for (int var2 = 0; var2 < class103.field1744; var2++) {
            int var3 = class3.field14[var2] * class108.field1797[var2];
            byte[] var4 = class270.field4198[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class251.field3871[class280.method2001(var4[var6], 255)];
            }
            var1[var2] = new class7(class326.field5064, class52.field820, class246.field3811[var2], class62.field962[var2], class108.field1797[var2], class3.field14[var2], var5);
        }
        class233.method1680((byte) -12);
        return var1;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IBI)I", line = 42)
    public static final int method2059(int arg0, byte arg1, int arg2) {
        field4618++;
        class62 var3 = (class62) class42.field748.method833(false, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 0;
            if (arg1 != 12) {
                field4614 = (class126[]) null;
            }
            while (var5 < var3.field963.length) {
                if (var3.field961[var5] == arg0) {
                    var4 += var3.field963[var5];
                }
                var5++;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V", line = 83)
    public static void method2060(byte arg0) {
        if (arg0 >= 39) {
            field4614 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)V", line = 94)
    public static final void method2061(int arg0, byte arg1) {
        field4616++;
        class4 var2 = class67.method510(1, 6, arg0);
        if (arg1 < 65) {
            method2060((byte) -93);
        }
        var2.method6(255);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIBI)V", line = 107)
    public static final void method2062(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg2 >= class319.field4965 && arg2 <= class116.field1888) {
            int var5 = class308.method2129(arg0, class195.field3108, class188.field2995, 1252946087);
            int var6 = class308.method2129(arg4, class195.field3108, class188.field2995, 1252946087);
            class242.method1720(arg1, var5, var6, arg2, 0);
        }
        if (arg3 >= -51) {
            field4614 = (class126[]) null;
        }
        field4611++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIILdg;IJZ)Z", line = 132)
    public static final boolean method2063(int arg0, int arg1, int arg2, int arg3, int arg4, class320 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class128.method960(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }
}

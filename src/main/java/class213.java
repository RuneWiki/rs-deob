import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class213 extends class121 {

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "Z")
    public static boolean field3198 = true;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field3197 = 2;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field3204;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BBILje;I)V")
    public static final void method1243(byte arg0, byte arg1, int arg2, class169 arg3, int arg4) {
        field3205++;
        int var5 = class265.method1641(arg2, class113.field1500.method911(0), class465.field6846, 0, class177.field2682, arg4, 0, class449.field6599[arg3.field1902], 0, -4, true, arg3.field2018[0], 0, arg3.field2019[0], (byte) -62);
        if (var5 < 1) {
            return;
        }
        int var6 = 0;
        int var7 = 49 % ((-arg0 - 50) / 57);
        while ((var5 - 1) > var6) {
            arg3.method1027(class465.field6846[var6], arg1, (byte) 94, class177.field2682[var6]);
            var6++;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)V")
    public static final void method1244(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3201++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -55 / ((34 - arg3) / 54);
        int var8 = -arg4;
        int var9 = -1;
        class379.method2285(126, class292.field4448[arg0], arg1 + arg4, arg2, arg1 - arg4);
        while (var5 < var6) {
            var9 += 2;
            var5++;
            var8 += var9;
            if (var8 >= 0) {
                var6--;
                var8 -= var6 << 1;
                int[] var10 = class292.field4448[arg0 + var6];
                int[] var11 = class292.field4448[arg0 - var6];
                int var12 = arg1 + var5;
                int var13 = arg1 - var5;
                class379.method2285(127, var10, var12, arg2, var13);
                class379.method2285(127, var11, var12, arg2, var13);
            }
            int var14 = arg1 + var6;
            int var15 = arg1 - var6;
            int[] var16 = class292.field4448[arg0 + var5];
            int[] var17 = class292.field4448[arg0 - var5];
            class379.method2285(124, var16, var14, arg2, var15);
            class379.method2285(126, var17, var14, arg2, var15);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Lkp;")
    public static final class337 method1245(int arg0, int arg1, int arg2) {
        class13 var3 = class277.field4216[arg0][arg1][arg2];
        return var3 == null ? null : var3.field164;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)V")
    public static void method1246(boolean arg0) {
        field3204 = null;
        if (!arg0) {
            method1244(17, -123, -127, -29, -111);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILef;)Lj;")
    public static final class229 method1247(int arg0, class385 arg1) {
        int var2 = 11 % ((35 - arg0) / 33);
        field3202++;
        return new class229(arg1.method2327((byte) -116), arg1.method2327((byte) -116), arg1.method2327((byte) -116), arg1.method2327((byte) -116), arg1.method2327((byte) -116), arg1.method2327((byte) -116), arg1.method2327((byte) -116), arg1.method2327((byte) -116), arg1.method2382((byte) -110), arg1.method2343(255));
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lon;ILon;ZZII)I")
    public static final int method1248(class432 arg0, int arg1, class432 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field3203++;
        if (arg6 > -76) {
            return 53;
        }
        int var7 = class313.method1914(arg2, arg1, arg0, arg4, (byte) -86);
        if (var7 != 0) {
            return arg4 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class313.method1914(arg2, arg5, arg0, arg3, (byte) -86);
            return arg3 ? -var8 : var8;
        }
    }
}

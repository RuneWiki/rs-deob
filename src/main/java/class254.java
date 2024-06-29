import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class254 extends class19 {

    @OriginalMember(owner = "client!o", name = "o", descriptor = "[I")
    public static int[] field4196 = new int[100];

    @OriginalMember(owner = "client!o", name = "r", descriptor = "Z")
    public static boolean field4199 = false;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "[Lil;")
    public static class165[] field4194 = new class165[14];

    @OriginalMember(owner = "client!o", name = "i", descriptor = "B")
    public static byte field4190;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Ldc;")
    public static class243 field4191;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Llc;")
    public static class86 field4197;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "[I")
    public static int[] field4198;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIILwg;IJZ)Z")
    public static final boolean method1798(int arg0, int arg1, int arg2, int arg3, int arg4, class178 arg5, int arg6, long arg7, boolean arg8) {
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
        return class216.method1549(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Llc;Z[Lak;)V")
    public static final void method1799(class86 arg0, boolean arg1, class140[] arg2) {
        class100.field1474 = arg0;
        field4192++;
        class217.field3443 = arg2;
        class11.field132 = new boolean[class217.field3443.length];
        class149.field2425.method1035(124);
        int var3 = class100.field1474.method619(-1, "details");
        int[] var4 = class100.field1474.method641(0, var3);
        int var5 = 0;
        if (arg1) {
            while (var4.length > var5) {
                class149.field2425.method1032(false, class182.method1357(new class152(class100.field1474.method643(var4[var5], var3, false)), var4[var5], 0), (long) var4[var5]);
                var5++;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)Loc;")
    public static final class62 method1800(int arg0, int arg1) {
        field4193++;
        class62 var2 = (class62) class52.field765.method1553((long) arg0, (byte) -78);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class196.field3185.method643(class194.method1441((byte) -97, arg0), class273.method1892(arg0, (byte) -29), false);
        class62 var4 = new class62();
        var4.field885 = arg0;
        if (var3 != null) {
            var4.method452(new class152(var3), (byte) -107);
        }
        var4.method447(-7505);
        if (var4.field902 != -1) {
            var4.method455(method1800(var4.field936, arg1), method1800(var4.field902, 15017), (byte) -14);
        }
        if (var4.field924 != -1) {
            var4.method453((byte) 115, method1800(var4.field937, arg1), method1800(var4.field924, 15017));
        }
        if (!class266.field4309 && var4.field869) {
            var4.field931 = class269.field4339;
            var4.field886 = false;
            var4.field890 = class117.field1675;
            var4.field896 = 0;
            var4.field910 = class128.field1980;
        }
        if (arg1 != 15017) {
            method1800(-87, 38);
        }
        class52.field765.method1551(var4, 0, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)I")
    public static final int method1801(int arg0, byte arg1) {
        if (arg1 <= 50) {
            return -91;
        }
        int var7 = arg0 - 1;
        field4200++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([BII)I")
    public static final int method1802(byte[] arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method1801(-42, (byte) 78);
        }
        field4195++;
        return class256.method1809(0, arg2, 255, arg0);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
    public static void method1803(boolean arg0) {
        if (arg0) {
            field4198 = null;
        }
        field4196 = null;
        field4198 = null;
        field4191 = null;
        field4197 = null;
        field4194 = null;
    }
}

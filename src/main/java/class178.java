import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class178 {

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Lr;")
    public static class66 field3115 = class93.method641(43, "www)2wtrc");

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "[Leh;")
    public static class37[] field3112 = new class37[32768];

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Z")
    public static boolean field3114 = true;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Lr;")
    private static class66 field3120 = class93.method641(43, "OFF");

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lr;")
    public static class66 field3117 = field3120;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "[I")
    public static int[] field3123 = new int[50];

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "Lpb;")
    public static class114 field3122;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Lcj;")
    public static class28 field3119;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method1189(int arg0) {
        field3115 = null;
        field3120 = null;
        field3122 = null;
        field3117 = null;
        field3112 = null;
        if (arg0 != 32768) {
            field3120 = null;
        }
        field3119 = null;
        field3123 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)Llj;")
    public static final class44 method1190(int arg0, int arg1, int arg2) {
        class16 var3 = class110.field2124[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field219; var4++) {
            class44 var5 = var3.field220[var4];
            if ((var5.field780 >> 29 & 0x3L) == 2L && var5.field791 == arg1 && var5.field790 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZIIII)V")
    public static final void method1191(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1) {
            for (int var6 = arg0; var6 <= arg2; var6++) {
                class194.method1266(arg4, (byte) -17, arg5, class15.field183[var6], arg3);
            }
            field3118++;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(III)V")
    public static final void method1192(int arg0, int arg1, int arg2) {
        field3124++;
        class234 var3 = class96.method664((byte) 81, arg0);
        if (arg1 != 0) {
            field3120 = null;
        }
        int var4 = var3.field4096;
        int var5 = var3.field4083;
        int var6 = var3.field4094;
        int var7 = class125.field2351[var6 - var4];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var4;
        class187.method1234(var5, ~var8 & class89.field1726[var5] | arg2 << var4 & var8, 87);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIZI)V")
    public static final void method1193(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field3121++;
        if (arg0 >= class241.field4186 && arg0 <= class222.field3788) {
            int var5 = class54.method368(arg2, class215.field3706, (byte) 114, class165.field2972);
            int var6 = class54.method368(arg4, class215.field3706, (byte) 114, class165.field2972);
            class109.method740(1, var6, var5, arg1, arg0);
        }
        if (!arg3) {
            method1193(-105, 101, 125, false, -95);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BIII)V")
    public static final void method1194(byte arg0, int arg1, int arg2, int arg3) {
        field3113++;
        if (arg0 > -48) {
            method1189(118);
        }
        class63 var4 = class218.method1401(arg3, false, arg2);
        if (var4 != null && var4.field1236 != null) {
            class237 var5 = new class237();
            var5.field4120 = var4;
            var5.field4118 = var4.field1236;
            class8.method34(var5, 16);
        }
        class247.field4308 = true;
        class9.field103 = arg1;
        class225.field3859 = arg3;
        class240.field4174 = arg2;
        class215.method1385(var4, -122);
    }
}

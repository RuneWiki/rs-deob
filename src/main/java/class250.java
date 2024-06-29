import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class250 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public int field3323;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public int field3324;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public int field3325;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public int field3326;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public int field3328;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public int field3330;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public int field3331;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public int field3332;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public int field3333;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public int field3336;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public int field3338;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
    public int field3339;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "I")
    public int field3340;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "I")
    public int field3342;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "I")
    public int field3343;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "I")
    public int field3344;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
    public int field3346;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "I")
    public int field3347;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "[I")
    public static int[] field3335;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "[Lo;")
    public static class24[] field3337;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I[Lo;)V")
    public static final void method1548(int arg0, class24[] arg1) {
        class479.field7089 = arg1.length;
        field3329++;
        class512.field7462 = new class24[class479.field7089 + 10];
        class125.field1615 = new int[class479.field7089 + 10];
        class438.method2690(arg1, 0, class512.field7462, 0, class479.field7089);
        if (arg0 != -20170) {
            return;
        }
        for (int var2 = 0; var2 < class479.field7089; var2++) {
            class125.field1615[var2] = class512.field7462[var2].method153();
        }
        for (int var3 = class479.field7089; var3 < class512.field7462.length; var3++) {
            class125.field1615[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)I")
    public static final int method1549(int arg0, int arg1, int arg2) {
        int var3 = -122 / ((arg0 - 73) / 45);
        field3334++;
        int var4 = arg1 >> 31 & arg2 - 1;
        return ((arg1 >>> 31) + arg1) % arg2 + var4;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method1550(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field3341++;
        int var8 = 103 % ((-arg5 - 9) / 48);
        if (arg2 == arg7) {
            class164.method964(arg1, arg4, arg7, arg3, arg6, arg0, 121);
        } else if ((arg0 - arg7) >= class307.field4111 && class91.field1086 >= arg0 + arg7 && class169.field2184 <= (arg3 - arg2) && arg2 + arg3 <= class386.field5620) {
            class63.method378(arg4, arg3, arg0, arg1, arg6, 29831, arg7, arg2);
        } else {
            class53.method319(arg4, arg6, arg1, arg2, (byte) -99, arg3, arg0, arg7);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)I")
    public static final int method1551(int arg0, byte arg1) {
        field3345++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        int var3 = -67 / ((arg1 - 17) / 62);
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method1552(int arg0) {
        field3337 = null;
        field3335 = null;
        int var1 = 87 / ((arg0 - 50) / 56);
    }

    static {
        new class305("Use", "Benutzen", "Utiliser", "Usar");
    }
}

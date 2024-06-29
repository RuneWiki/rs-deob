import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public abstract class class178 {

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2778 = "Please remove ";

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Z")
    public static boolean field2777 = true;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2779 = "Loading title screen - ";

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "[I")
    public static int[] field2780 = new int[2];

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "[Lrg;")
    public static class307[] field2782;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIZI)V", line = 10)
    public static final void method1249(int arg0, int arg1, boolean arg2, int arg3) {
        field2781++;
        class280 var4 = class49.method363(arg0, arg1, arg3, (byte) -128);
        if (var4 == null) {
            return;
        }
        class264.field4299 = new String[var4.field4606];
        class350.field5587 = new int[var4.field4616];
        if (arg2) {
            return;
        }
        if (var4.field4609 == 15 || var4.field4609 == 17 || var4.field4609 == 16) {
            int var5 = 0;
            int var6 = 0;
            if (class6.field79 != null) {
                var6 = class6.field79.field4286;
                var5 = class6.field79.field4310;
            }
            class350.field5587[0] = class305.field4988 - var5;
            class350.field5587[1] = class130.field1982 - var6;
        }
        class266.method1879(200000, var4, -90);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 49)
    public static void method1250(int arg0) {
        field2778 = null;
        field2780 = null;
        field2779 = null;
        field2782 = null;
        int var1 = 41 % ((-arg0 - 49) / 50);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lhm;ILnm;Lnm;)V", line = 82)
    public static final void method1251(class95 arg0, int arg1, class221 arg2, class221 arg3) {
        field2776++;
        class111.field1654 = arg2;
        class119.field1769 = arg0;
        class180.field2801 = arg3;
        if (class180.field2801 != null) {
            class130.field1983 = class180.field2801.method1486(1, -27734);
        }
        if (class111.field1654 != null) {
            class48.field690 = class111.field1654.method1486(1, -27734);
        }
        int var4 = -21 / ((arg1 - 17) / 51);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)J")
    public abstract long method451(int arg0);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)I")
    public abstract int method453(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public abstract void method452(byte arg0);
}

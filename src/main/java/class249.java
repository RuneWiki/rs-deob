import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class249 {

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Lni;")
    public static class24 field4383 = new class24(5);

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Lgg;")
    public static class72 field4384 = new class72();

    @OriginalMember(owner = "client!f", name = "k", descriptor = "[I")
    public static int[] field4388 = new int[128];

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Ljf;")
    public static class229 field4387 = class212.method1457((byte) 80, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field4389 = 0;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Z")
    public static boolean field4390 = true;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Ljf;")
    public static class229 field4386 = class212.method1457((byte) 113, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!f", name = "n", descriptor = "F")
    public static float field4391;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Lbm;")
    public static class138 field4385;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V", line = 10)
    public static final void method1795(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4378++;
        class122 var5 = class323.method2175(arg4, arg3, arg4 ^ 0xFFFF9AE7);
        var5.method862(-29044);
        var5.field2144 = arg1;
        var5.field2143 = arg2;
        var5.field2154 = arg0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I", line = 29)
    public static final int method1796(int arg0, int arg1) {
        field4380++;
        if (arg0 != 128) {
            method1797(-107, -118, -78);
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V", line = 40)
    public static final void method1797(int arg0, int arg1, int arg2) {
        field4379++;
        class286.field4908[arg2] = arg1;
        if (arg0 != 128) {
            field4383 = (class24) null;
        }
        class223 var3 = (class223) class298.field5082.method1890((long) arg2, arg0 - 223);
        if (var3 == null) {
            class223 var4 = new class223(class153.method1032(108) + 500L);
            class298.field5082.method1885((long) arg2, var4, (byte) -115);
        } else {
            var3.field3808 = class153.method1032(arg0 - 1) + 500L;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 69)
    public static void method1798(byte arg0) {
        if (arg0 >= -47) {
            method1795(91, -123, 80, -87, 99);
        }
        field4387 = null;
        field4386 = null;
        field4388 = null;
        field4385 = null;
        field4384 = null;
        field4383 = null;
    }
}

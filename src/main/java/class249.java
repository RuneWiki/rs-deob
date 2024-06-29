import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class249 {

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3701 = "white:";

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "Z")
    public static boolean field3700 = false;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field3703 = 0;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BZIII)V", line = 4)
    public static final void method1831(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3705++;
        if (class256.method1887(arg2, -1)) {
            class276.method2018(arg4, -1, arg1, (byte) -35, arg3, class119.field1677[arg2]);
            int var5 = -73 % ((-arg0 - 13) / 46);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 21)
    public static final void method1832(int arg0) {
        class19.field302 = -1;
        field3702++;
        class358.field5478 = 0;
        class352.field5426 = arg0;
        class214.field3088 = 0;
        class50.field757 = false;
        class3.field101 = 0;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V", line = 47)
    public static void method1833(byte arg0) {
        if (arg0 > -9) {
            method1834((byte) -98, (class181) null);
        }
        field3701 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BLno;)V", line = 57)
    public static final void method1834(byte arg0, class181 arg1) {
        field3704++;
        if (arg0 < 108) {
            method1833((byte) 101);
        }
        for (class349 var2 = (class349) class158.field2282.method93((byte) -49); var2 != null; var2 = (class349) class158.field2282.method97(-116)) {
            if (var2.field5384 == arg1) {
                if (var2.field5405 != null) {
                    class179.field2576.method1397(var2.field5405);
                    var2.field5405 = null;
                }
                var2.method876(8);
                return;
            }
        }
    }
}

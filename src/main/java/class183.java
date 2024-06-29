import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class183 {

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lik;")
    public static class259 field2922 = new class259(64);

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public int field2916;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public int field2924;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public int field2926;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "J")
    public long field2921;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Ldg;")
    public class320 field2914;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Ldg;")
    public class320 field2919;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Ldg;")
    public class320 field2927;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Z")
    public static boolean field2929;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIB)V", line = 7)
    public static final void method1374(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -108) {
            method1377(66);
        }
        field2928++;
        String var4 = "::tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
        System.out.println(var4);
        class318.method2180(var4, false);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 22)
    public static void method1375(byte arg0) {
        field2922 = null;
        if (arg0 <= 4) {
            field2929 = false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lja;BLja;)V", line = 35)
    public static final void method1376(class64 arg0, byte arg1, class64 arg2) {
        class324.field5030 = arg2;
        if (arg1 != -59) {
            field2929 = true;
        }
        field2917++;
        class12.field241 = arg0;
        class306.field4807 = class324.field5030.method465(3, arg1 ^ 0xFFFFFFC5);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 50)
    public static final void method1377(int arg0) {
        class24.field407 = null;
        class200.method1456(class73.field1127, class122.field1950, 0, class180.field2880, -1, 0, 9385, 0, 0);
        if (arg0 < 33) {
            return;
        }
        if (class24.field407 != null) {
            class213.method1544(class24.field407, -1412584499, class6.field101.field4593, class73.field1127, 0, class180.field2880, -1, class223.field3593, 0, class222.field3554);
            class24.field407 = null;
        }
        field2915++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)I", line = 82)
    public static final int method1378(int arg0, byte arg1) {
        field2923++;
        if (arg1 != 127) {
            field2922 = (class259) null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Lda;", line = 98)
    public static final class120 method1379(int arg0, int arg1) {
        int var2 = -120 / ((-arg0 - 34) / 52);
        field2918++;
        return class196.field3123 && arg1 >= class298.field4709 && class34.field564 >= arg1 ? class147.field2367[arg1 - class298.field4709] : null;
    }
}

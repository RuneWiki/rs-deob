import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class91 extends class123 {

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public int field1450 = -1;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    public int field1460 = -1;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public int field1462 = 12800;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    public int field1461 = 0;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public int field1452 = 0;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public int field1454 = 12800;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "Z")
    public boolean field1471 = true;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "Ljava/lang/String;")
    public String field1459;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "Ljava/lang/String;")
    public String field1470;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public int field1456;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "Lwn;")
    public class30 field1474;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "Z")
    public static boolean field1457 = false;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field1466 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "Lam;")
    public static class270 field1465 = new class270();

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "Ljava/lang/String;")
    public static String field1473 = "Checking for updates - ";

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "Lpk;")
    public static class120 field1472;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)Z", line = 13)
    public final boolean method718(int arg0, int arg1, int arg2) {
        field1463++;
        class147 var4 = (class147) this.field1474.method268(-1);
        if (arg0 >= -23) {
            return false;
        }
        while (var4 != null) {
            if (var4.method1119(arg2, arg1, 0)) {
                return true;
            }
            var4 = (class147) this.field1474.method278(1);
        }
        return false;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 299)
    public class91(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field1460 = arg4;
        this.field1471 = arg5;
        this.field1458 = arg3;
        this.field1459 = arg2;
        this.field1450 = arg6;
        this.field1470 = arg1;
        if (this.field1450 == 255) {
            this.field1450 = 0;
        }
        this.field1456 = arg0;
        this.field1474 = new class30();
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)[I", line = 42)
    public final int[] method719(int arg0, int arg1, int arg2) {
        field1448++;
        class147 var4 = (class147) this.field1474.method268(arg0 + 23305);
        if (arg0 != -23306) {
            field1466 = (String[]) null;
        }
        while (var4 != null) {
            if (var4.method1117(51, arg1, arg2)) {
                return var4.method1120(arg1, arg0 + 23197, arg2);
            }
            var4 = (class147) this.field1474.method278(1);
        }
        return null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BIII)[I", line = 70)
    public final int[] method720(byte arg0, int arg1, int arg2, int arg3) {
        field1453++;
        for (class147 var5 = (class147) this.field1474.method268(-1); var5 != null; var5 = (class147) this.field1474.method278(1)) {
            if (var5.method1114(arg1, arg3, (byte) -61, arg2)) {
                return var5.method1122((byte) 127, arg2, arg3);
            }
        }
        int var6 = -115 % ((-arg0 - 24) / 60);
        return null;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(III)J", line = 93)
    public static final long method721(int arg0, int arg1, int arg2) {
        class42 var3 = class34.field521[arg0][arg1][arg2];
        return var3 == null || var3.field666 == null ? 0L : var3.field666.field4596;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BII)[I", line = 102)
    public final int[] method722(byte arg0, int arg1, int arg2) {
        field1467++;
        for (class147 var4 = (class147) this.field1474.method268(-1); var4 != null; var4 = (class147) this.field1474.method278(1)) {
            if (var4.method1119(arg2, arg1, 0)) {
                return var4.method1122((byte) -27, arg2, arg1);
            }
        }
        int var5 = 19 % ((arg0) / 50);
        return null;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)[Lwd;", line = 127)
    public static final class88[] method723(int arg0) {
        int var1 = -69 % ((arg0 + 63) / 53);
        field1468++;
        class88[] var2 = new class88[class89.field1426];
        for (int var3 = 0; var3 < class89.field1426; var3++) {
            int var4 = class83.field1288[var3] * class309.field4887[var3];
            byte[] var5 = class207.field3277[var3];
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7] = class260.field3873[class164.method1234(var5[var7], 255)];
            }
            if (class162.field2623) {
                var2[var3] = new class196(class185.field2926, class112.field1821, class61.field892[var3], class183.field2902[var3], class309.field4887[var3], class83.field1288[var3], var6);
            } else {
                var2[var3] = new class317(class185.field2926, class112.field1821, class61.field892[var3], class183.field2902[var3], class309.field4887[var3], class83.field1288[var3], var6);
            }
        }
        class260.method1796(1952227009);
        return var2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V", line = 173)
    public static final void method724(int arg0, int arg1) {
        class145.field2348.method2285(arg1, (byte) -49);
        class337.field5206.method2285(arg1, (byte) -45);
        class195.field3013.method2285(arg1, (byte) -49);
        if (arg0 == 12800) {
            field1464++;
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(Z)V", line = 186)
    public static final void method725(boolean arg0) {
        class1.field59.method2282((byte) -123);
        field1469++;
        if (arg0) {
            method723(126);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V", line = 197)
    public static void method726(byte arg0) {
        if (arg0 != 81) {
            method727((byte) -74, -76);
        }
        field1466 = null;
        field1465 = null;
        field1472 = null;
        field1473 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)V", line = 213)
    public static final void method727(byte arg0, int arg1) {
        field1455++;
        if (arg0 != -83) {
            method724(37, 26);
        }
        class170 var2 = class221.method1613(5, arg1, -8410);
        var2.method1267(126);
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V", line = 245)
    public final void method728(int arg0) {
        field1451++;
        this.field1462 = 12800;
        this.field1461 = 0;
        this.field1454 = 12800;
        this.field1452 = 0;
        for (class147 var2 = (class147) this.field1474.method268(-1); var2 != null; var2 = (class147) this.field1474.method278(1)) {
            if (var2.field2411 > this.field1461) {
                this.field1461 = var2.field2411;
            }
            if (this.field1462 > var2.field2414) {
                this.field1462 = var2.field2414;
            }
            if (this.field1452 < var2.field2406) {
                this.field1452 = var2.field2406;
            }
            if (this.field1454 > var2.field2397) {
                this.field1454 = var2.field2397;
            }
        }
        if (arg0 != 11803) {
            this.method719(-117, -94, 57);
        }
    }
}

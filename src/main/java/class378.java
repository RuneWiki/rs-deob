import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class378 implements class121 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lpe;")
    private class615 field4838;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field4846 = -1;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Lra;")
    public static class361 field4845;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lpe;")
    public static class615 field4844;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2160(int arg0, String arg1) {
        field4847++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 > '߿') {
                var3 += 3;
            } else {
                var3 += 2;
            }
        }
        if (arg0 > -68) {
            method2161(100);
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Lev;")
    public final class144 method900(int arg0) {
        field4839++;
        if (arg0 < 1) {
            field4844 = null;
        }
        return class144.field1882;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public static final void method2161(int arg0) {
        class495.method2697((byte) -12, false);
        field4841++;
        if (arg0 < 71) {
            method2164(null, 78);
        }
        if (class708.field9877 >= 0 && class708.field9877 != 0) {
            class11.method58(class708.field9877, -125);
            class708.field9877 = -1;
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
    public static void method2162(int arg0) {
        if (arg0 != -888469431) {
            method2161(-126);
        }
        field4844 = null;
        field4845 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Z")
    public static final boolean method2163(int arg0, int arg1, int arg2) {
        field4843++;
        if (arg1 == 1408) {
            return (arg0 & 0x580) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lcda;I)V")
    public static final void method2164(class534 arg0, int arg1) {
        arg0.method2846(true);
        field4840++;
        int var2 = class353.field4536;
        class193 var3 = class233.field3130 = class592.field8019[var2] = new class193();
        var3.field2960 = var2;
        int var4 = arg0.method2845(30, 8);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        int var7 = var4 & 0x3FFF;
        var3.field3030[0] = var6 - class100.field1326;
        var3.field506 = (var3.field3030[0] << 9) + (var3.method1265(66) << 8);
        var3.field3039[0] = var7 - class186.field2376;
        var3.field503 = (var3.field3039[0] << 9) + (var3.method1265(119) << 8);
        class390.field4991 = var3.field508 = var5;
        if (class122.field1564[var2] != null) {
            var3.method1275(class122.field1564[var2], 0);
        }
        class260.field3508 = 0;
        class135.field1779[class260.field3508++] = var2;
        class699.field9752[var2] = 0;
        class154.field1951 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method2845(18, 8);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFF75) >> 8;
                int var12 = var9 & 0xFF;
                class244 var13 = class528.field6869[var8] = new class244();
                var13.field3271 = -1;
                var13.field3269 = false;
                var13.field3270 = 0;
                var13.field3265 = (var10 << 28) + (var11 << 14) + var12;
                class420.field5434[class154.field1951++] = var8;
                class699.field9752[var8] = 0;
            }
        }
        arg0.method2837((byte) -53);
        if (arg1 >= -86) {
            field4845 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lpe;)V")
    public class378(class615 arg0) {
        this.field4838 = arg0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)I")
    public final int method901(boolean arg0) {
        if (arg0) {
            field4844 = null;
        }
        field4842++;
        return this.field4838.method3357(0) ? 100 : this.field4838.method3349(false);
    }
}

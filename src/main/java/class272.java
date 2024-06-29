import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class272 {

    @OriginalMember(owner = "client!um", name = "g", descriptor = "[Ld;")
    public static class43[] field4515 = new class43[14];

    @OriginalMember(owner = "client!um", name = "d", descriptor = "Lci;")
    public static class327 field4512 = new class327();

    @OriginalMember(owner = "client!um", name = "i", descriptor = "J")
    public static long field4517 = 0L;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field4516 = 0;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field4518 = 0;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public static int field4520 = 127;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4519 = "Continue";

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Lsi;", line = 4)
    public static final class351 method2039(byte arg0) {
        field4514++;
        byte[] var1 = class163.field2578[0];
        int var2 = class322.field5132[0] * class221.field3595[0];
        int[] var3 = new int[var2];
        if (arg0 != 70) {
            return (class351) null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class121.field2026[class343.method2418(var1[var4], 255)];
        }
        class351 var5 = new class351(class164.field2595, class318.field5070, class189.field3035[0], class19.field211[0], class221.field3595[0], class322.field5132[0], var3);
        class211.method1592((byte) 41);
        return var5;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lth;B)V", line = 33)
    public static final void method2040(class57 arg0, byte arg1) {
        field4510++;
        class101.field1654 = arg0;
        if (arg1 != 39) {
            field4520 = 103;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V", line = 45)
    public static void method2041(byte arg0) {
        field4512 = null;
        field4515 = null;
        if (arg0 >= -104) {
            method2042(82, true, -84);
        }
        field4519 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZI)V", line = 62)
    public static final void method2042(int arg0, boolean arg1, int arg2) {
        field4513++;
        class321 var3 = class46.method370(6, (byte) -106, arg0);
        var3.method2265(arg1);
        var3.field5112 = arg2;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIZI)V", line = 77)
    public static final void method2043(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class89.field1500 = 0L;
        boolean var5 = false;
        int var6 = class275.method2052((byte) -115);
        if (~arg0 < arg4 != var6 > 0) {
            var5 = true;
        }
        if (arg0 == 3 || var6 == 3) {
            arg3 = true;
        }
        if (class145.field2360.startsWith("mac") && arg0 > 0) {
            arg3 = true;
        }
        field4511++;
        if (arg3 && arg0 > 0) {
            var5 = true;
        }
        class294.method2117(var5, false, arg0, arg2, arg3, var6, arg1);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class27 {

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Lhi;")
    private static class82 field355 = class95.method664((byte) -121, "Starting 3d Library");

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field359 = 0;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Lhi;")
    public static class82 field356 = field355;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "[Lti;")
    public static class186[] field362;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)V", line = 8)
    public static final void method168(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field357++;
        int var5 = 117 % ((-arg4 - 6) / 33);
        class227 var6 = class215.method1531(-1, 10, arg1);
        var6.method1616(64);
        var6.field3927 = arg2;
        var6.field3923 = arg3;
        var6.field3929 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILhi;)I", line = 53)
    public static final int method169(int arg0, class82 arg1) {
        field363++;
        int var2 = 0;
        if (arg0 != 9556) {
            return -31;
        }
        while (class84.field1500.length > var2) {
            if (class84.field1500[var2].method543(arg1, (byte) -42)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)Lbc;", line = 116)
    public static final class153 method170(int arg0) {
        field358++;
        class153 var1 = new class153(31);
        var1.method1075(8, arg0 - 2);
        var1.method1075(class112.field2032, arg0 ^ 0xFFFFFFFE);
        var1.method1075(class146.field2468 ? 1 : 0, -1);
        var1.method1075(class77.field1320 ? 1 : 0, -1);
        var1.method1075(class256.field4409 ? 1 : 0, -1);
        var1.method1075(class198.field3384 ? 1 : 0, -1);
        var1.method1075(class244.field4232 ? 1 : 0, arg0 - 2);
        if (arg0 != 1) {
            return (class153) null;
        }
        var1.method1075(class133.field2295 ? 1 : 0, -1);
        var1.method1075(class113.field2040 ? 1 : 0, -1);
        var1.method1075(class208.field3641 ? 1 : 0, -1);
        var1.method1075(class33.field504, arg0 - 2);
        var1.method1075(class75.field1303 ? 1 : 0, arg0 ^ 0xFFFFFFFE);
        var1.method1075(class126.field2220 ? 1 : 0, -1);
        var1.method1075(class52.field839 ? 1 : 0, -1);
        var1.method1075(class61.field960, -1);
        var1.method1075(class308.field5238 ? 1 : 0, -1);
        var1.method1075(class134.field2321, arg0 ^ 0xFFFFFFFE);
        var1.method1075(class284.field4771, arg0 ^ 0xFFFFFFFE);
        var1.method1075(class138.field2373, -1);
        var1.method1102((byte) -89, class93.field1660);
        var1.method1102((byte) -85, class112.field2033);
        var1.method1075(class295.method2031(), -1);
        var1.method1065(arg0 + 178808911, class123.field2155);
        var1.method1075(class261.field4470, -1);
        var1.method1075(class87.field1554 ? 1 : 0, -1);
        var1.method1075(class300.field5098 ? 1 : 0, arg0 - 2);
        return var1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V", line = 189)
    public static final void method171(int arg0, int arg1) {
        field361++;
        class164 var2 = (class164) class67.field1038.method507((long) arg1, 602425312);
        if (var2 != null) {
            for (int var3 = arg0; var3 < var2.field2870.length; var3++) {
                var2.field2870[var3] = -1;
                var2.field2864[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 219)
    public static void method172(byte arg0) {
        field355 = null;
        field362 = null;
        if (arg0 != -88) {
            field355 = (class82) null;
        }
        field356 = null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class236 {

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Lwm;")
    public static class152 field3862 = class157.method1048(" de votre liste d(Wamis)3", 115);

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field3868 = 0;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "Lwm;")
    public static class152 field3869 = class157.method1048("ondulation:", 101);

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Lwm;")
    public static class152 field3863 = class157.method1048("M-Bmoire en cours d(Wattribution", 96);

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "[Lwm;")
    public static class152[] field3864 = new class152[1000];

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "Z")
    public static boolean field3870 = true;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Lt;")
    public static class253 field3866 = new class253();

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "[I")
    public static int[] field3872 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "Lwm;")
    public static class152 field3871 = class157.method1048("<img=1>", 113);

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "[I")
    public static int[] field3865;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 4)
    public static void method1622(int arg0) {
        field3865 = null;
        field3869 = null;
        field3864 = null;
        field3862 = null;
        if (arg0 <= 33) {
            field3868 = 53;
        }
        field3872 = null;
        field3863 = null;
        field3871 = null;
        field3866 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lqc;[I[II[I)V", line = 37)
    public static final void method1623(class4 arg0, int[] arg1, int[] arg2, int arg3, int[] arg4) {
        if (arg3 != 2) {
            method1623((class4) null, (int[]) null, (int[]) null, -53, (int[]) null);
        }
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg4[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var8 != 0 && var9 < arg0.field4163.length) {
                if ((var8 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field4163[var9] = null;
                    } else {
                        class141 var10 = class133.method851(var6, arg3 - 49);
                        int var11 = var10.field2167;
                        class111 var12 = arg0.field4163[var9];
                        if (var12 != null) {
                            if (var12.field1562 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field4163[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1566 = var7;
                                    var12.field1565 = 0;
                                    var12.field1569 = 1;
                                    var12.field1564 = 0;
                                    var12.field1561 = 0;
                                    class18.method114(arg0.field4162, 0, arg0.field4231, var10, false, 28972);
                                } else if (var11 == 2) {
                                    var12.field1561 = 0;
                                }
                            } else if (var10.field2152 >= class133.method851(var12.field1562, -20).field2152) {
                                var12 = arg0.field4163[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class111 var13 = arg0.field4163[var9] = new class111();
                            var13.field1565 = 0;
                            var13.field1569 = 1;
                            var13.field1561 = 0;
                            var13.field1564 = 0;
                            var13.field1566 = var7;
                            var13.field1562 = var6;
                            class18.method114(arg0.field4162, 0, arg0.field4231, var10, false, arg3 ^ 0x712E);
                        }
                    }
                }
                var9++;
                var8 >>>= 0x1;
            }
        }
        field3867++;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIILv;IJ)Z", line = 152)
    public static final boolean method1624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class73 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class262.method1804(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }
}

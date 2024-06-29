import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class81 extends class200 {

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "[B")
    public byte[] field1430;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "Loa;")
    public static class99 field1433 = class221.method1463(2844, "Texturen geladen)3");

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "Lec;")
    public static class23 field1431;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIBII)V")
    public static final void method558(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1432++;
        int var6 = -43 % ((arg3 + 33) / 54);
        int var7 = 0;
        int var8 = arg1;
        int var9 = arg2 * arg2;
        int var10 = arg1 * arg1;
        int var11 = var10 << 2;
        int var12 = var9 << 2;
        int var13 = var10 << 1;
        int var14 = var9 << 1;
        int var15 = arg1 << 1;
        int var16 = var10 - (var15 - 1) * var14;
        int var17 = (1 - var15) * var9 + var13;
        int var18 = ((var7 << 1) + 3) * var13;
        int var19 = ((arg1 << 1) - 3) * var14;
        int var20 = (arg1 - 1) * var12;
        int var21 = (var7 + 1) * var11;
        if (class178.field3101 <= arg0 && class137.field2414 >= arg0) {
            int var22 = class166.method1127(class79.field1395, arg2 + arg4, class197.field3437, 8946);
            int var23 = class166.method1127(class79.field1395, arg4 - arg2, class197.field3437, 8946);
            class175.method1174(class124.field2177[arg0], arg5, -7, var23, var22);
        }
        while (var8 > 0) {
            var8--;
            if (var17 < 0) {
                while (var17 < 0) {
                    var7++;
                    var17 += var18;
                    var18 += var11;
                    var16 += var21;
                    var21 += var11;
                }
            }
            int var24 = arg0 - var8;
            if (var16 < 0) {
                var17 += var18;
                var18 += var11;
                var7++;
                var16 += var21;
                var21 += var11;
            }
            int var25 = arg0 + var8;
            if (var25 >= class178.field3101 && var24 <= class137.field2414) {
                int var26 = class166.method1127(class79.field1395, arg4 + var7, class197.field3437, 8946);
                int var27 = class166.method1127(class79.field1395, arg4 - var7, class197.field3437, 8946);
                if (class178.field3101 <= var24) {
                    class175.method1174(class124.field2177[var24], arg5, -7, var27, var26);
                }
                if (var25 <= class137.field2414) {
                    class175.method1174(class124.field2177[var25], arg5, -7, var27, var26);
                }
            }
            var17 += -var20;
            var20 -= var12;
            var16 += -var19;
            var19 -= var12;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)V")
    public static final void method559(int arg0, int arg1, int arg2) {
        field1428++;
        class159 var3 = class77.method539(arg2, -113);
        int var4 = var3.field2829;
        int var5 = var3.field2832;
        int var6 = var3.field2831;
        if (arg0 != 11204) {
            method561(78);
        }
        int var7 = class170.field3027[var6 - var5];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class193.method1307(arg1 << var5 & var8 | class43.field733[var4] & ~var8, (byte) 99, var4);
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)V")
    public static final void method560(int arg0) {
        class258.field4499.method1812(-105);
        if (arg0 == 0) {
            field1429++;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "([B)V")
    public class81(byte[] arg0) {
        this.field1430 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)V")
    public static void method561(int arg0) {
        field1433 = null;
        field1431 = null;
        if (arg0 >= -107) {
            method559(45, 48, 16);
        }
    }
}

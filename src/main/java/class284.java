import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class284 {

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "J")
    public long field4497 = 0L;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field4496 = 0;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "Z")
    public static boolean field4509 = false;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public int field4494;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public int field4495;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public int field4498;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public int field4499;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public int field4502;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public int field4504;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public int field4505;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public int field4506;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public int field4507;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public int field4510;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public int field4511;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "Ldl;")
    public static class123 field4501;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Lhi;")
    public class219 field4500;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)Z")
    public static final boolean method1896(byte arg0) {
        field4503++;
        if (class248.field3965) {
            try {
                class113.method730(class2.field23.field237, 188, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 >= -61) {
            field4501 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII)V")
    public static final void method1897(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class110.field1669 <= arg3 && arg3 <= class189.field2984) {
            int var5 = class34.method273(class96.field1484, arg0, false, class51.field710);
            int var6 = class34.method273(class96.field1484, arg4, false, class51.field710);
            class47.method358((byte) 124, var6, arg2, var5, arg3);
        }
        field4508++;
        if (arg1 != 16776960) {
            method1896((byte) 81);
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V")
    public static void method1898(byte arg0) {
        field4501 = null;
        if (arg0 >= -21) {
            method1897(23, -3, -26, -121, -101);
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(IIIII)V")
    public static final void method1899(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class30.field401 < 100) {
            class36.method278(88);
        }
        class127.method861(arg1, arg2, arg1 + arg3, arg0 + arg2);
        if (arg4 != 30) {
            method1896((byte) -59);
        }
        field4512++;
        if (class30.field401 < 100) {
            byte var5 = 20;
            int var6 = arg3 / 2 + arg1;
            int var7 = arg0 / 2 + arg2 - var5 - 18;
            class127.method876(arg1, arg2, arg3, arg0, 0);
            class127.method855(var6 - 152, var7, 304, 34, 9179409);
            class127.method855(var6 - 151, var7 + 1, 302, 32, 0);
            class127.method876(var6 - 150, var7 + 2, class30.field401 * 3, 30, 9179409);
            class127.method876(class30.field401 * 3 + var6 - 150, var7 + 2, 300 - (class30.field401 * 3), 30, 0);
            class232.field3734.method1315(class140.field2063, var6, var5 + var7, 16777215, -1);
            return;
        }
        class53.field727 = (int) ((float) (arg3 * 2) / class7.field106);
        class49.field626 = class158.field2435 - ((int) ((float) arg0 / class7.field106));
        class56.field785 = (int) ((float) (arg0 * 2) / class7.field106);
        int var8 = class219.field3563 - ((int) ((float) arg3 / class7.field106));
        int var9 = class158.field2435 - ((int) ((float) arg0 / class7.field106));
        int var10 = (int) ((float) arg0 / class7.field106) + class158.field2435;
        class76.field1075 = class219.field3563 - ((int) ((float) arg3 / class7.field106));
        int var11 = (int) ((float) arg3 / class7.field106) + class219.field3563;
        class140.method942(arg1, var11, arg0 + arg2, var10, var9, arg2, true, arg1 + arg3, var8);
        class38.method305(var9, arg1 + arg3, var8, var11, arg0 + arg2, arg2, var10, false, arg1);
        class199.method1374(var9, arg4 - 156, var8, var10, arg2, var11, arg0 + arg2, arg1, arg1 + arg3);
        if (class78.field1111 > 0) {
            class10.field147--;
            if (class10.field147 == 0) {
                class78.field1111--;
                class10.field147 = 20;
            }
        }
        if (!class248.field3966) {
            return;
        }
        int var12 = arg1 + arg3 - 5;
        int var13 = arg2 - (8 - arg0);
        class279.field4433.method1321("Fps:" + class19.field222, var12, var13, 16776960, -1);
        int var17 = var13 - 15;
        Runtime var14 = Runtime.getRuntime();
        int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        int var16 = 16776960;
        if (var15 > 65536) {
            var16 = 16711680;
        }
        class279.field4433.method1321("Mem:" + var15 + "k", var12, var17, var16, -1);
        var13 = var17 - 15;
    }
}

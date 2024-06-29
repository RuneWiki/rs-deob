import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class225 {

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Lol;")
    public static class231 field3655 = new class231(32);

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field3657 = 0;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Lwm;")
    public static class152 field3659 = class157.method1048("", 100);

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field3660 = 0;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public int field3654;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Lsm;")
    public class157 field3651;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "[I")
    public int[] field3652;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "[Lcn;")
    public static class266[] field3656;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Lbg;", line = 4)
    public static final class203 method1549(int arg0) {
        field3653++;
        int var1 = class8.field106[0] * class253.field4383[0];
        byte[] var2 = class23.field403[0];
        int[] var3 = new int[var1];
        int var4 = 0;
        if (arg0 != 3803) {
            field3659 = (class152) null;
        }
        while (var4 < var1) {
            var3[var4] = class134.field2070[class34.method251(255, var2[var4])];
            var4++;
        }
        class203 var5;
        if (class217.field3516) {
            var5 = new class68(class186.field2975, class193.field3068, class180.field2865[0], class179.field2856[0], class253.field4383[0], class8.field106[0], var3);
        } else {
            var5 = new class109(class186.field2975, class193.field3068, class180.field2865[0], class179.field2856[0], class253.field4383[0], class8.field106[0], var3);
        }
        class132.method841((byte) 33);
        return var5;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 45)
    public static void method1550(byte arg0) {
        if (arg0 == -84) {
            field3656 = null;
            field3659 = null;
            field3655 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)I", line = 57)
    public static final int method1551(boolean arg0) {
        field3658++;
        try {
            if (class193.field3078 == 0) {
                if ((class76.method507(-30994) - 5000L) < class3.field46) {
                    return 0;
                }
                class11.field142 = class34.field572.method962(class80.field1120, class223.field3628, (byte) -71);
                class298.field5161 = class76.method507(-30994);
                class193.field3078 = 1;
            }
            if (class298.field5161 + 30000L < class76.method507(-30994)) {
                return class137.method869(1000, 5);
            }
            if (class193.field3078 == 1) {
                if (class11.field142.field2980 == 2) {
                    return class137.method869(1001, 5);
                }
                if (class11.field142.field2980 != 1) {
                    return -1;
                }
                class265.field4477 = new class186((Socket) class11.field142.field2977, class34.field572);
                class11.field142 = null;
                class245.field4102.field4946 = 0;
                int var1 = 0;
                if (class205.field3340) {
                    var1 = class62.field934;
                }
                class245.field4102.method1980(false, 75);
                class245.field4102.method1967(var1, -1303690792);
                class265.field4477.method1237(true, 0, class245.field4102.field4946, class245.field4102.field4950);
                if (class270.field4629 != null) {
                    class270.field4629.method1676(-3091);
                }
                if (class224.field3646 != null) {
                    class224.field3646.method1676(-3091);
                }
                int var2 = class265.field4477.method1235(-95);
                if (class270.field4629 != null) {
                    class270.field4629.method1676(-3091);
                }
                if (class224.field3646 != null) {
                    class224.field3646.method1676(-3091);
                }
                if (var2 != 0) {
                    return class137.method869(var2, 5);
                }
                class193.field3078 = 2;
            }
            if (class193.field3078 == 2) {
                if (class265.field4477.method1238(1) < 2) {
                    return -1;
                }
                class172.field2751 = class265.field4477.method1235(-116);
                class172.field2751 <<= 0x8;
                class172.field2751 += class265.field4477.method1235(-120);
                class269.field4537 = 0;
                class201.field3249 = new byte[class172.field2751];
                class193.field3078 = 3;
            }
            if (!arg0) {
                field3659 = (class152) null;
            }
            if (class193.field3078 != 3) {
                return -1;
            }
            int var3 = class265.field4477.method1238(1);
            if (var3 < 1) {
                return -1;
            }
            if ((class172.field2751 - class269.field4537) < var3) {
                var3 = class172.field2751 - class269.field4537;
            }
            class265.field4477.method1240(class201.field3249, class269.field4537, var3, 107);
            class269.field4537 += var3;
            if (class172.field2751 > class269.field4537) {
                return -1;
            } else if (class149.method938(-101, class201.field3249)) {
                class262.field4456 = new class295[class325.field5673];
                int var4 = 0;
                for (int var5 = class313.field5415; var5 <= class113.field1601; var5++) {
                    class295 var6 = class192.method1276(var5, (byte) 8);
                    if (var6 != null) {
                        class262.field4456[var4++] = var6;
                    }
                }
                class265.field4477.method1239((byte) -97);
                class265.field4477 = null;
                class201.field3249 = null;
                class193.field3078 = 0;
                class149.field2323 = 0;
                class3.field46 = class76.method507(-30994);
                return 0;
            } else {
                return class137.method869(1002, 5);
            }
        } catch (IOException var8) {
            return class137.method869(1003, 5);
        }
    }
}

import java.awt.Frame;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class247 {

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "[I")
    public static int[] field3848 = new int[100];

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public int field3846;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "Lpk;")
    public static class237 field3847;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Ljava/awt/Frame;")
    public static Frame field3838;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Ljava/lang/String;")
    public String field3840;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "[[[B")
    public static byte[][][] field3844;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)I")
    public static final int method1692(int arg0, int arg1, int arg2, int arg3) {
        field3841++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (~var4 == arg1) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method1693(byte arg0, long arg1) {
        field3839++;
        class56.field949.setTime(new Date(arg1));
        int var3 = class56.field949.get(7);
        int var4 = class56.field949.get(5);
        int var5 = class56.field949.get(2);
        int var6 = class56.field949.get(1);
        int var7 = class56.field949.get(11);
        if (arg0 <= 8) {
            return null;
        } else {
            int var8 = class56.field949.get(12);
            int var9 = class56.field949.get(13);
            return class297.field4702[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class256.field3949[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI)V")
    public static final void method1694(boolean arg0, int arg1) {
        class197.field2978 = new int[104];
        class284.field4354 = new int[104];
        class133.field1953 = 99;
        class191.field2899 = new int[104];
        class225.field3516 = new int[104];
        class73.field1189 = new int[104];
        field3845++;
        class175.field2555 = new int[5];
        if (arg1 != 100) {
            field3848 = null;
        }
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class58.field957 = new byte[var2][104][104];
        class167.field2460 = new byte[var2][104][104];
        class265.field4136 = new int[var2][105][105];
        class51.field834 = new byte[var2][105][105];
        class264.field4130 = new byte[var2][104][104];
        class186.field2719 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)Ltc;")
    public static final class204 method1695(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3842++;
        long var5 = (long) arg3 & 0xFFFFL | 0xFFFFL << 16 & (long) arg0 << 16 | ((long) arg2 & 0xFFFFL) << 48 | 0xFFFFL << 32 & (long) arg4 << 32;
        if (arg1 != 0) {
            field3847 = null;
        }
        class204 var7 = (class204) class128.field1889.method945(var5, true);
        if (var7 != null) {
            return var7;
        }
        class144[] var8 = null;
        class100 var9 = class96.method724((byte) -53, arg3);
        if (var9.field1462 != null) {
            var8 = new class144[var9.field1462.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class149 var11 = class126.method879(var9.field1462[var10], (byte) -75);
                var8[var10] = new class144(var11.field2152, var11.field2164, var11.field2157, var11.field2154, var11.field2162, var11.field2158, var11.field2159, var11.field2155);
            }
        }
        class204 var12 = new class204(var9.field1459, var8, var9.field1464, arg2, arg4, arg0);
        class128.field1889.method941(var12, var5, -8447);
        return var12;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lpk;Lpk;Lpk;Lpk;B)V")
    public static final void method1696(class237 arg0, class237 arg1, class237 arg2, class237 arg3, byte arg4) {
        class287.field4390 = arg2;
        field3843++;
        class202.field3042 = arg1;
        class190.field2885 = arg3;
        class5.field68 = arg0;
        class275.field4236 = new class297[class5.field68.method1603(-1)][];
        class24.field388 = new boolean[class5.field68.method1603(-1)];
        if (arg4 >= -75) {
            field3847 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static void method1697(int arg0) {
        if (arg0 == 5) {
            field3848 = null;
            field3844 = null;
            field3847 = null;
            field3838 = null;
        }
    }
}

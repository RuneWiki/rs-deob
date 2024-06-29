import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class143 {

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public int field1985 = -1;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "Lnfa;")
    public class228 field1987;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "[I")
    public int[] field1981;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "[Ljava/lang/String;")
    public String[] field1984;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V", line = 3)
    public static final void method935(int arg0) {
        field1982++;
        short var1 = 1024;
        short var2 = 3072;
        if (class286.field3774) {
            var2 = 4096;
            if (class759.field10544) {
                var1 = 2048;
            }
        }
        if ((float) var1 > class223.field3131) {
            class223.field3131 = var1;
        }
        if (class223.field3131 > (float) var2) {
            class223.field3131 = var2;
        }
        while (class403.field5597 >= 16384.0F) {
            class403.field5597 -= 16384.0F;
        }
        while (class403.field5597 < 0.0F) {
            class403.field5597 += 16384.0F;
        }
        int var3 = class595.field8572 >> 9;
        int var4 = class128.field1755 >> 9;
        int var5 = class438.method2628(class595.field8572, class392.field5459, class128.field1755, (byte) -48);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && class514.field7179 - 4 > var3 && (class456.field6281 - 4) > var4) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class392.field5459;
                    if (var9 < 3 && class753.method4175(-12388, var8, var7)) {
                        var9++;
                    }
                    int var10 = 0;
                    if (class97.field1412.field1530 != null && class97.field1412.field1530[var9] != null) {
                        var10 = (class97.field1412.field1530[var9][var7][var8] & 0xFF) * 8 << 2;
                    }
                    if (class52.field741 != null && class52.field741[var9] != null) {
                        int var11 = var10 + var5 - class52.field741[var9].method1959(126, var8, var7);
                        if (var11 > var6) {
                            var6 = var11;
                        }
                    }
                }
            }
        }
        if (arg0 >= -18) {
            return;
        }
        int var12 = (var6 >> 2) * 1536;
        if (var12 > 786432) {
            var12 = 786432;
        }
        if (var12 < 262144) {
            var12 = 262144;
        }
        if (class652.field9224 < var12) {
            class652.field9224 += (var12 - class652.field9224) / 24;
        } else if (var12 < class652.field9224) {
            class652.field9224 += (var12 - class652.field9224) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZ)V", line = 108)
    public static final void method936(int arg0, boolean arg1) {
        field1980++;
        if (class759.field10541 == arg0) {
            return;
        }
        class514.field7179 = class456.field6281 = class4.field14[arg0];
        class183.method1226(arg1);
        class540.field7549 = new int[4][class514.field7179 >> 3][class456.field6281 >> 3];
        class491.field6605 = new int[class514.field7179][class456.field6281];
        class284.field3767 = new int[class514.field7179][class456.field6281];
        for (int var2 = 0; var2 < 4; var2++) {
            class464.field6351[var2] = class285.method1701(-6169, class456.field6281, class514.field7179);
        }
        class634.field9017 = new byte[4][class514.field7179][class456.field6281];
        class90.method547((byte) 12, 4, class514.field7179, class456.field6281);
        class95.method650(class96.field1401, class514.field7179 >> 3, (byte) -124, class456.field6281 >> 3);
        class759.field10541 = arg0;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILkha;IILam;IILkc;)V", line = 136)
    public static final void method937(int arg0, class30 arg1, int arg2, int arg3, class55 arg4, int arg5, int arg6, class655 arg7) {
        field1983++;
        if (arg3 != 19126) {
            method937(51, null, -82, -120, null, -25, -112, null);
        }
        class67 var8 = new class67();
        var8.field944 = arg0 << 9;
        var8.field933 = arg2;
        var8.field916 = arg5 << 9;
        if (arg1 != null) {
            var8.field931 = arg1;
            int var10 = arg1.field440;
            int var11 = arg1.field446;
            if (arg6 == 1 || arg6 == 3) {
                var10 = arg1.field446;
                var11 = arg1.field440;
            }
            var8.field938 = arg1.field381;
            var8.field937 = arg1.field438;
            var8.field925 = arg1.field391;
            var8.field928 = arg1.field412;
            var8.field922 = arg1.field393;
            var8.field929 = arg1.field454;
            var8.field941 = arg5 + var10 << 9;
            var8.field920 = arg1.field460;
            var8.field945 = arg1.field432;
            var8.field915 = arg1.field382 << 9;
            var8.field926 = arg1.field396;
            var8.field939 = arg0 + var11 << 9;
            if (arg1.field455 != null) {
                var8.field934 = true;
                var8.method437((byte) 122);
            }
            if (var8.field928 != null) {
                var8.field946 = var8.field920 + (int) (Math.random() * (double) (var8.field945 - var8.field920));
            }
            class154.field2122.method3116(29066, var8);
            return;
        }
        if (arg4 != null) {
            var8.field917 = arg4;
            class11 var9 = arg4.field771;
            if (var9.field111 != null) {
                var8.field934 = true;
                var9 = var9.method55((byte) 118, class554.field7826);
            }
            if (var9 != null) {
                var8.field939 = arg0 + var9.field134 << 9;
                var8.field941 = var9.field134 + arg5 << 9;
                var8.field922 = class259.method1611(arg4, (byte) -115);
                var8.field915 = var9.field112 << 9;
                var8.field926 = var9.field172;
                var8.field929 = var9.field160;
                var8.field937 = var9.field155;
                var8.field925 = var9.field167;
            }
            class483.field6544.method3116(29066, var8);
            return;
        }
        if (arg7 == null) {
            return;
        }
        var8.field942 = arg7;
        var8.field941 = arg7.method3470(arg3 - 19127) + arg5 << 9;
        var8.field939 = arg0 + arg7.method3470(-1) << 9;
        var8.field922 = class300.method1760(false, arg7);
        var8.field929 = arg7.field9271;
        var8.field925 = 256;
        var8.field915 = arg7.field9275 << 9;
        var8.field937 = arg7.field9234;
        var8.field926 = 256;
        class393.field5473.method1387(var8, (long) arg7.field8344, (byte) -124);
        return;
    }
}

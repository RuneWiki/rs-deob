import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class65 {

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field1022 = 0;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Z")
    public static boolean field1020 = true;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field1024 = 0;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lck;")
    public static class119 field1021 = class298.method1987((byte) 55, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Lck;")
    public static class119 field1025 = class298.method1987((byte) 124, ")1p");

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([BLkl;BI)V", line = 10)
    public static final void method480(byte[] arg0, class75 arg1, byte arg2, int arg3) {
        class210 var4 = new class210();
        var4.field1218 = (long) arg3;
        var4.field3349 = 0;
        field1019++;
        var4.field3354 = arg0;
        var4.field3359 = arg1;
        int var5 = -55 % ((arg2 + 63) / 39);
        class156 var6 = class82.field1256;
        synchronized (class82.field1256) {
            class82.field1256.method999(var4, (byte) -108);
        }
        class298.method1991((byte) 99);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 28)
    public static void method481(int arg0) {
        if (arg0 == 1656) {
            field1021 = null;
            field1025 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)V", line = 48)
    public static final void method482(int arg0, boolean arg1) {
        class142 var2 = (class142) class185.field2933.method1329((byte) 90, (long) arg0);
        field1023++;
        if (var2 == null) {
            return;
        }
        if (arg1) {
            method484(-36L, (byte) 127);
        }
        for (int var3 = 0; var3 < var2.field2265.length; var3++) {
            var2.field2265[var3] = -1;
            var2.field2270[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIILvc;JLvc;Lvc;)V", line = 75)
    public static final void method483(int arg0, int arg1, int arg2, int arg3, class293 arg4, long arg5, class293 arg6, class293 arg7) {
        class69 var9 = new class69();
        var9.field1076 = arg4;
        var9.field1072 = arg1 * 128 + 64;
        var9.field1093 = arg2 * 128 + 64;
        var9.field1084 = arg3;
        var9.field1069 = arg5;
        var9.field1091 = arg6;
        var9.field1077 = arg7;
        int var10 = 0;
        class104 var11 = class150.field2390[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1596; var12++) {
                class196 var13 = var11.field1610[var12];
                if ((var13.field3130 & 0x400000L) == 4194304L) {
                    int var14 = var13.field3140.method214();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1092 = -var10;
        if (class150.field2390[arg0][arg1][arg2] == null) {
            class150.field2390[arg0][arg1][arg2] = new class104(arg0, arg1, arg2);
        }
        class150.field2390[arg0][arg1][arg2].field1602 = var9;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(JB)Lck;", line = 121)
    public static final class119 method484(long arg0, byte arg1) {
        field1018++;
        class211.field3362.setTime(new Date(arg0));
        int var3 = class211.field3362.get(7);
        int var4 = class211.field3362.get(5);
        if (arg1 < 20) {
            method482(39, true);
        }
        int var5 = class211.field3362.get(2);
        int var6 = class211.field3362.get(1);
        int var7 = class211.field3362.get(11);
        int var8 = class211.field3362.get(12);
        int var9 = class211.field3362.get(13);
        return class170.method1074(new class119[] { class69.field1071[var3 - 1], class6.field137, class234.method1506(var4 / 10, (byte) -79), class234.method1506(var4 % 10, (byte) -79), class124.field1905, class101.field1544[var5], class124.field1905, class234.method1506(var6, (byte) -79), class243.field3901, class234.method1506(var7 / 10, (byte) -79), class234.method1506(var7 % 10, (byte) -79), class258.field4135, class234.method1506(var8 / 10, (byte) -79), class234.method1506(var8 % 10, (byte) -79), class258.field4135, class234.method1506(var9 / 10, (byte) -79), class234.method1506(var9 % 10, (byte) -79), class190.field3002 }, -93);
    }
}

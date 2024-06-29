import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class403 {

    @OriginalMember(owner = "client!um", name = "e", descriptor = "Lcb;")
    public static class117 field6109 = null;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
    public static final void method2470(int arg0) {
        int var1 = -43 / ((-arg0 - 50) / 50);
        class15.field250.method1022((byte) -34);
        field6108++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Canvas;ILm;I)Lqa;")
    public static final class496 method2471(Canvas arg0, int arg1, class373 arg2, int arg3) {
        if (arg3 > -54) {
            method2470(-5);
        }
        field6107++;
        return new class478(arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
    public static final void method2472(int arg0) {
        field6105++;
        class157 var1 = class295.field4360;
        synchronized (class295.field4360) {
            class295.field4360.method1015((byte) 90);
            if (arg0 != -13354) {
                field6109 = null;
            }
        }
        class157 var2 = class166.field2417;
        synchronized (class166.field2417) {
            class166.field2417.method1015((byte) 83);
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V")
    public static void method2473(int arg0) {
        if (arg0 == 23566) {
            field6109 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([BB)Lci;")
    public static final class479 method2474(byte[] arg0, byte arg1) {
        field6106++;
        class479 var2 = new class479();
        class91 var3 = new class91(arg0);
        var3.field1292 = var3.field1277.length - 2;
        if (arg1 > -46) {
            method2471(null, 99, null, 47);
        }
        int var4 = var3.method631(10494);
        int var5 = var3.field1277.length - var4 - 12 - 2;
        var3.field1292 = var5;
        int var6 = var3.method626((byte) 100);
        var2.field7003 = var3.method631(10494);
        var2.field6994 = var3.method631(10494);
        var2.field6993 = var3.method631(10494);
        var2.field6997 = var3.method631(10494);
        int var7 = var3.method618((byte) 100);
        if (var7 > 0) {
            var2.field7000 = new class141[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method631(10494);
                class141 var10 = new class141(class353.method2231(var9, (byte) -84));
                var2.field7000[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method626((byte) 100);
                    int var12 = var3.method626((byte) 100);
                    var10.method940((long) var11, -35, new class74(var12));
                }
            }
        }
        var3.field1292 = 0;
        var2.field6992 = var3.method590(-22542);
        var2.field6998 = new int[var6];
        var2.field6996 = new String[var6];
        var2.field7002 = new int[var6];
        int var13 = 0;
        while (var5 > var3.field1292) {
            int var14 = var3.method631(10494);
            if (var14 == 3) {
                var2.field6996[var13] = var3.method621(2029169511).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field7002[var13] = var3.method618((byte) 100);
            } else {
                var2.field7002[var13] = var3.method626((byte) 100);
            }
            var2.field6998[var13++] = var14;
        }
        return var2;
    }
}

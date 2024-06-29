import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class383 {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "[I")
    public static int[] field5225;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;IIIBIII)V")
    public static final void method2270(String arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field5224++;
        if (arg4 > -117) {
            field5225 = null;
        }
        class327 var8 = new class327();
        var8.field4322 = arg1;
        var8.field4314 = arg6;
        var8.field4313 = arg0;
        var8.field4312 = arg2;
        var8.field4323 = arg3;
        var8.field4318 = arg5;
        var8.field4316 = class31.field516 + arg7;
        class321.field4209.method1766((byte) 64, var8);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static final void method2271(byte arg0) {
        field5226++;
        int[] var1 = new int[class127.field1852.field5697];
        if (arg0 <= 62) {
            method2271((byte) -65);
        }
        int var2 = 0;
        for (int var3 = 0; var3 < class127.field1852.field5697; var3++) {
            class482 var5 = class127.field1852.method2390(77, var3);
            if (var5.field6675 >= 0 || var5.field6646 >= 0) {
                var1[var2++] = var3;
            }
        }
        class332.field4368 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class332.field4368[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
    public static final void method2272(byte arg0) {
        field5223++;
        class236 var1 = class496.field6882;
        synchronized (class496.field6882) {
            class496.field6882.method1459(19088);
        }
        int var2 = -115 % ((-arg0 - 27) / 52);
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)V")
    public static void method2273(byte arg0) {
        field5225 = null;
        if (arg0 != 60) {
            method2270(null, 35, -61, -58, (byte) 93, 14, 100, -51);
        }
    }
}

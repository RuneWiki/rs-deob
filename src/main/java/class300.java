import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class300 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "Z")
    public static boolean field4231 = false;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4234 = new String[8];

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)V")
    public static final void method1944(int arg0, byte arg1) {
        int var2 = 10 % ((arg1 - 74) / 34);
        class390.field5647 = arg0;
        field4232++;
        class535 var3 = class465.field6593;
        synchronized (class465.field6593) {
            class465.field6593.method3103(-11294);
        }
        class535 var4 = class263.field3874;
        synchronized (class263.field3874) {
            class263.field3874.method3103(-11294);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIII)V")
    public static final void method1945(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class455.field6521 != null) {
            class455.field6521[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class43.field462 != null) {
            class43.field462[arg0][arg1] = (short) arg3;
        }
        if (class456.field6537 != null) {
            class456.field6537[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
    public static final void method1946(byte arg0) {
        field4233++;
        int[] var1 = new int[class16.field156.field4654];
        int var2 = 0;
        if (arg0 > -118) {
            return;
        }
        for (int var3 = 0; var3 < class16.field156.field4654; var3++) {
            class369 var5 = class16.field156.method2121(var3, 25928);
            if (var5.field5330 >= 0 || var5.field5317 >= 0) {
                var1[var2++] = var3;
            }
        }
        class255.field3794 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class255.field3794[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static void method1947(int arg0) {
        field4234 = null;
        if (arg0 < 123) {
            method1945(-74, -95, 109, -36, 116);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class207 {

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "Lbp;")
    public class239 field3161 = new class239();

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "Z")
    public boolean field3168 = false;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "Ldt;")
    public static class145 field3166 = null;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    public int field3167;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "Lja;")
    public static class167 field3170;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljn;ZIZ)V")
    public static final void method1354(class465 arg0, boolean arg1, int arg2, boolean arg3) {
        field3164++;
        int var4 = arg0.field6502;
        int var5 = (int) arg0.field3568;
        arg0.method1510((byte) -13);
        if (arg3) {
            class63.method393(-109, var4);
        }
        class178.method1086((byte) 69, var4);
        class145 var6 = class166.method1028(var5, 108);
        if (var6 != null) {
            class22.method148((byte) -78, var6);
        }
        class124.method747(8);
        if (!arg1 && class36.field472 != -1) {
            class24.method169((byte) -6, class36.field472, 1);
        }
        if (arg2 > -125) {
            return;
        }
        class478 var7 = new class478(class146.field2146);
        for (class465 var8 = (class465) var7.method2797((byte) 62); var8 != null; var8 = (class465) var7.method2795(-1)) {
            if (!var8.method1512((byte) -101)) {
                var8 = (class465) var7.method2797((byte) 119);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field6500 == 3) {
                int var9 = (int) var8.field3568;
                if (var9 >>> 16 == var4) {
                    method1354(var8, arg1, -128, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public static void method1355(int arg0) {
        if (arg0 != 0) {
            field3166 = null;
        }
        field3166 = null;
        field3170 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
    public static final void method1356(byte arg0) {
        class15.method110(class431.field6041, -127);
        field3162++;
        class431.field6039++;
        if (arg0 != -36) {
            method1355(-43);
        }
        class225.field3415.method1711(false, class224.field3391);
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)V")
    public static final void method1357(byte arg0) {
        if (class58.field761 != null) {
            class58.field761.method2118(1);
            class58.field761 = null;
        }
        field3165++;
        class145.method905(1);
        class428.method2513();
        for (int var1 = 0; var1 < 4; var1++) {
            class422.field5918[var1].method2584(-127);
        }
        class363.method2247((byte) 68, false);
        System.gc();
        class482.method2819(2, 0);
        class268.field3923 = -1;
        class420.field5875 = false;
        class411.method2434(1, true);
        class369.field5332 = false;
        class240.field3602 = 0;
        class310.field4388 = 0;
        class242.field3622 = 0;
        class360.field5180 = 0;
        for (int var2 = 0; var2 < class273.field3974.length; var2++) {
            class273.field3974[var2] = null;
        }
        class487.method2856((byte) 46);
        for (int var3 = 0; var3 < 2048; var3++) {
            class124.field1559[var3] = null;
        }
        class225.field3418 = 0;
        if (arg0 >= -91) {
            return;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class139.field1851[var4] = null;
        }
        class269.field3928.method2771(-5);
        class475.method2785(-12231);
        class224.field3391 = 0;
        class140.field1859.method2696((byte) -103);
        class59.method369(22953);
        class26.method181((byte) -48);
        class116.method728(true, 6656);
        try {
            class429.method2520(class252.field3718.field6021, (byte) 122, "loggedout");
        } catch (Throwable var5) {
        }
        class281.field4137 = 0L;
        class40.field533 = null;
    }
}

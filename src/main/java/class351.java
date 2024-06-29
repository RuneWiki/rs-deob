import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class class351 {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public int field5481;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public int field5479;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public int field5486;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5485 = null;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "F")
    public static float field5484;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "F")
    public static float field5487;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Lfh;")
    public static class140 field5488;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method2445(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class101.field1319 * arg1 >> 8;
        if (~var4 != arg0 && arg3 != -1) {
            class144.method1124(var4, -20329, 0, arg3, false, class135.field1844);
            class297.field4314 = true;
        }
        field5489++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)V", line = 28)
    public static final void method2446(int arg0, boolean arg1) {
        field5483++;
        class41.method301(class306.field4482, class296.field4300, class152.field2138, class258.field3753);
        class41.method300(class54.field697, class8.field88, arg1);
        class41.method294((float) class207.field2910, (float) class105.field1367, (float) class45.field556);
        class41.method296();
        class110.field1434 = field5484;
        class302.field4433 = class289.field4182;
        if (arg0 == -3472) {
            class110.field1428 = class199.field2792;
            class110.field1433 = class86.field1100;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)V", line = 48)
    public static final void method2447(int arg0, int arg1, int arg2) {
        field5480++;
        class78 var3 = class341.method2368(arg0, -9609);
        int var4 = var3.field1003;
        int var5 = var3.field1011;
        int var6 = var3.field1012;
        int var7 = class137.field1869[var6 - var5];
        if (arg2 < arg1 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class58.method437(false, var4, arg2 << var5 & var8 | class208.field2956[var4] & ~var8);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 77)
    public static void method2448(int arg0) {
        if (arg0 != 19442) {
            method2446(-98, true);
        }
        field5488 = null;
        field5485 = null;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(III)V", line = 87)
    public class351(int arg0, int arg1, int arg2) {
        this.field5481 = arg0;
        this.field5479 = arg2;
        this.field5486 = arg1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIB)V")
    public abstract void method1294(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
    public abstract void method1297(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZ)V")
    public abstract void method1295(int arg0, int arg1, boolean arg2);
}

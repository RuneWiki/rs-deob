import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class271 extends class120 {

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public int field4310;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public int field4307;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4305 = "Please remove ";

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static volatile int field4304 = -1;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "[I")
    public static int[] field4306 = new int[32];

    @OriginalMember(owner = "client!h", name = "w", descriptor = "[Lsi;")
    public static class198[] field4314 = new class198[14];

    @OriginalMember(owner = "client!h", name = "l", descriptor = "[Lsi;")
    public static class198[] field4303 = new class198[14];

    @OriginalMember(owner = "client!h", name = "q", descriptor = "[I")
    public static int[] field4308 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field4313 = 0;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public static int field4316 = 0;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "[I")
    public static int[] field4312 = new int[128];

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "Ldl;")
    public static class123 field4315;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4311++;
        class214 var7 = class136.method918(arg6, -21154, arg2);
        if (var7 != null && var7.field3470 != null) {
            class142 var8 = new class142();
            var8.field2079 = var7;
            var8.field2086 = var7.field3470;
            class202.method1390(var8, (byte) 118);
        }
        class45.field572 = true;
        class207.field3238 = arg4;
        class191.field3019 = arg0;
        class151.field2243 = arg5;
        class50.field668 = arg6;
        class23.field291 = arg1;
        class154.field2296 = arg2;
        class55.method397(arg3, var7);
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
    public static void method1833(int arg0) {
        field4303 = null;
        field4312 = null;
        field4308 = null;
        field4314 = null;
        field4315 = null;
        if (arg0 == 0) {
            field4305 = null;
            field4306 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)Ldk;")
    public static final class276 method1834(byte arg0, int arg1) {
        field4309++;
        class276 var2 = (class276) class249.field3992.method1428((long) arg1, (byte) -53);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class198.field3096.method807((byte) 78, arg1, 34);
        if (arg0 != 74) {
            return null;
        }
        class276 var4 = new class276();
        if (var3 != null) {
            var4.method1853(new class25(var3), arg1, (byte) 65);
        }
        class249.field3992.method1424((long) arg1, var4, -2003648287);
        return var4;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(II)V")
    public class271(int arg0, int arg1) {
        this.field4310 = arg1;
        this.field4307 = arg0;
    }
}

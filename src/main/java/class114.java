import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class class114 {

    @OriginalMember(owner = "client!te", name = "c", descriptor = "[I")
    public static int[] field1611 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
    public static void method923(boolean arg0) {
        field1611 = null;
        if (arg0) {
            method924(121);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static final void method924(int arg0) {
        if (class249.field3415 != null) {
            class440.field6321.method894(arg0 ^ 0x75);
            class83.method750();
            class69.method596(arg0 + 107);
            class115.method929(19131);
            class148.method1141((byte) 122);
            class194.method1392(40000);
            if (class322.field4369 != null) {
                class322.field4369.method1936(arg0 ^ 0xFFFFFF90);
            }
            class166.method1255((byte) 125);
            class269.method1728((byte) 40);
            class284.method1793(-56);
            class153.method1178((byte) 32, false);
            class179.method1323(56);
            for (int var1 = 0; var1 < 2048; var1++) {
                class338 var5 = class220.field3044[var1];
                if (var5 != null) {
                    var5.field4997 = null;
                    for (int var6 = 0; var6 < var5.field5014.length; var6++) {
                        var5.field5014[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class298.field4012.length; var2++) {
                class127 var3 = class298.field4012[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field5014.length; var4++) {
                        var3.field5014[var4] = null;
                    }
                }
            }
            class249.field3415.method2406(-123);
            class249.field3415 = null;
        }
        field1610++;
        if (arg0 != 0) {
            field1611 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([BB)V")
    public abstract void method881(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)[B")
    public abstract byte[] method880(byte arg0);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIII)Lk;")
    public static final class293 method925(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1609++;
        long var7 = (long) arg6 * 76724863L ^ (long) arg1 * 32147369L ^ (long) arg5 * 986053L ^ (long) arg3 * 475427L ^ (long) arg4 * 67481L ^ (long) arg2 * 97549L;
        class293 var9 = (class293) class147.field2264.method2537(arg0 ^ 0xFFFFFFD9, var7);
        if (var9 != null) {
            return var9;
        }
        if (arg0 != 0) {
            method923(true);
        }
        class293 var10 = class387.field5450.method155(arg4, arg2, arg3, arg5, arg1, arg6);
        class147.field2264.method2542(var10, (byte) -88, var7);
        return var10;
    }
}

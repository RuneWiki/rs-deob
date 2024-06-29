import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public abstract class class420 {

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "[[Z")
    public static boolean[][] field6209 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "Lcr;")
    public static class189 field6213 = new class189(2);

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public static int field6216 = 0;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "Llm;")
    public static class347 field6215;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "Lwd;")
    public static class36 field6210;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hs", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field6217;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
    public static final void method2685(int arg0) {
        field6214++;
        if (arg0 != -6740) {
            method2685(76);
        }
        class156.field2114.method391(121);
        class90.field1262.method391(arg0 + 6852);
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
    public static void method2686(int arg0) {
        field6210 = null;
        field6215 = null;
        field6209 = null;
        field6213 = null;
        if (arg0 != -2) {
            method2687(-30, -11, 80, 71, 76);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIII)Luj;")
    public static final class439 method2687(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6212++;
        class269[] var5 = null;
        class318 var6 = class294.method2012(arg1 ^ 0xFFFFFFB5, arg4);
        if (var6.field4651 != null) {
            var5 = new class269[var6.field4651.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class353 var8 = class313.method2120(true, var6.field4651[var7]);
                var5[var7] = new class269(var8.field5104, var8.field5110, var8.field5114, var8.field5113, var8.field5105, var8.field5117, var8.field5106, var8.field5103);
            }
        }
        if (arg1 != 0) {
            method2685(82);
        }
        return new class439(var6.field4653, var5, var6.field4652, arg3, arg2, arg0);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IILba;ILii;IIZ)V")
    public static final void method2688(int arg0, int arg1, class270 arg2, int arg3, class405 arg4, int arg5, int arg6, boolean arg7) {
        field6211++;
        if (arg7) {
            field6215 = null;
        }
        class425 var8 = null;
        if (arg5 == 0) {
            var8 = (class425) class40.method292(arg1, arg0, arg3);
        }
        if (arg5 == 1) {
            var8 = (class425) class376.method2434(arg1, arg0, arg3);
        }
        if (arg5 == 2) {
            var8 = (class425) class243.method1460(arg1, arg0, arg3, field6217 == null ? (field6217 = method2689("jb")) : field6217);
        }
        if (arg5 == 3) {
            var8 = (class425) class130.method823(arg1, arg0, arg3);
        }
        if (var8 == null) {
            return;
        }
        int var9 = var8.method105(-118);
        int var10 = var8.method120(25940);
        class104 var11 = class329.method2190((byte) 63, var8.method121(-15123));
        if (var11.method702((byte) 30)) {
            class35.method232(arg0, arg3, arg1, -25388, var11);
        }
        if (var8.method114(30582)) {
            var8.method118(arg4, 22295);
        }
        if (arg5 == 0) {
            class377.method2447(arg1, arg0, arg3);
            if (var11.field1483 != 0) {
                arg2.method1858(-4, arg0, var11.field1442, var9, var10, !var11.field1476, arg3);
                return;
            }
        } else if (arg5 == 1) {
            class343.method2241(arg1, arg0, arg3);
        } else if (arg5 == 2) {
            class288.method1967(arg1, arg0, arg3, field6217 == null ? (field6217 = method2689("jb")) : field6217);
            if (var11.field1483 != 0 && var11.field1489 + arg0 < class192.field2574 && class364.field5262 > (arg3 + var11.field1489) && class192.field2574 > var11.field1506 + arg0 && var11.field1506 + arg3 < class364.field5262) {
                arg2.method1854(arg3, !var11.field1476, var10, arg0, var11.field1506, var11.field1442, var11.field1489, (byte) 25);
                return;
            }
        } else {
            if (arg5 == 3) {
                class353.method2322(arg1, arg0, arg3);
                if (var11.field1483 == 1) {
                    arg2.method1851(4096, arg3, arg0);
                    return;
                }
            }
            return;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2689(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

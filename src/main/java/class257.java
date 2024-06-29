import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class257 {

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public int field3718 = -1;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field3719 = 0;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "Lfg;")
    public static class18 field3722 = new class18(4);

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "[I")
    public static int[] field3725 = new int[256];

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public int field3706;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public int field3707;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public int field3708;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public int field3710;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public int field3713;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public int field3714;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public int field3715;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public int field3716;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)V", line = 14)
    public static final void method1852(int arg0, int arg1, int arg2, int arg3) {
        field3717++;
        if (class443.field6447 == null) {
            return;
        }
        long var4 = (long) (arg0 | arg3 << 28 | arg1 << 14);
        class110 var6 = (class110) class186.field2728.method1219(var4, -95);
        if (var6 == null) {
            class110.method965(arg3, arg0, arg1);
            return;
        }
        class89 var7 = (class89) var6.field1799.method157((byte) -125);
        if (var7 == null) {
            class110.method965(arg3, arg0, arg1);
            return;
        }
        class231 var8 = (class231) class110.method965(arg3, arg0, arg1);
        int var9 = 19 / ((-arg2 - 4) / 37);
        if (var8 == null) {
            var8 = new class231();
        } else {
            var8.field3377 = var8.field3376 = -1;
        }
        var8.field3381 = var7.field1416;
        var8.field3386 = var7.field1413;
        label44: while (true) {
            class89 var10 = (class89) var6.field1799.method145(-115);
            if (var10 == null) {
                break;
            }
            if (var8.field3381 != var10.field1416) {
                var8.field3382 = var10.field1413;
                var8.field3377 = var10.field1416;
                while (true) {
                    class89 var11 = (class89) var6.field1799.method145(74);
                    if (var11 == null) {
                        break label44;
                    }
                    if (var8.field3381 != var11.field1416 && var8.field3377 != var11.field1416) {
                        var8.field3374 = var11.field1413;
                        var8.field3376 = var11.field1416;
                    }
                }
            }
        }
        int var12 = class109.method957((arg1 << 7) + 64, (arg0 << 7) + 64, arg3, 20663);
        class77.method606(arg3, arg0, arg1, var12, var8);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Z", line = 92)
    public static final boolean method1853(int arg0, int arg1) {
        if (arg0 != -1974171769) {
            method1856(-18, false, 5);
        }
        field3712++;
        class218 var2 = class33.method237(arg1, (byte) -84);
        if (var2 == null) {
            return false;
        } else if (class177.field2636 == 3) {
            String var3 = "";
            if (class360.field5124 != 0) {
                var3 = ":" + (var2.field3233 + 7000);
            }
            String var4 = "";
            if (class170.field2531 != null) {
                var4 = "/p=" + class170.field2531;
            }
            String var5 = "http://" + var2.field3227 + var3 + "/l=" + class202.field2945 + "/a=" + class351.field4986 + var4 + "/j" + (class373.field5302 ? "1" : "0") + ",o" + (class64.field1036 ? "1" : "0") + ",a2";
            try {
                class122.field1926.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class447.field6515 = var2.field3227;
            class419.field6108 = var2.field3233;
            if (class360.field5124 != 0) {
                class250.field3621 = class419.field6108 + 40000;
                class397.field5833 = class419.field6108 + 50000;
                class86.field1396 = class250.field3621;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lkh;B)V", line = 142)
    public static final void method1854(class69 arg0, byte arg1) {
        arg0.field1125 = null;
        field3709++;
        int var2 = arg0.field1128.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field1128[var3].field4325 = false;
        }
        class391[] var4 = class282.field4226;
        synchronized (class282.field4226) {
            int var5 = -46 % ((49 - arg1) / 53);
            if (class282.field4226.length > var2 && class148.field2284[var2] < 200) {
                class282.field4226[var2].method2483(121, arg0);
                int var10002 = class148.field2284[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 169)
    public static void method1855(int arg0) {
        field3722 = null;
        field3725 = null;
        if (arg0 != 30131) {
            field3724 = -109;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZI)V", line = 192)
    public static final void method1856(int arg0, boolean arg1, int arg2) {
        field3720++;
        class283 var3 = class221.field3296[arg2][arg0];
        if (var3 != null) {
            class402.field5886 = var3.field4245;
            class243.field3537 = var3.field4243;
            class249.field3604 = var3.field4237;
        }
        if (arg1) {
            method1853(-61, 90);
        }
        class217.method1644(arg1);
    }
}

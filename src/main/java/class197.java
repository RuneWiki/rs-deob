import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class197 {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Z")
    public static boolean field3381 = false;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field3380 = 0;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Ljd;")
    public static class85 field3384 = class221.method1499("Wordpack geladen)3", (byte) -93);

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "[I")
    public static int[] field3383 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Ljd;")
    public static class85 field3387 = class221.method1499("::fpson", (byte) 102);

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lge;Lge;ILge;)V")
    public static final void method1343(class68 arg0, class68 arg1, int arg2, class68 arg3) {
        class221.field3884 = arg1;
        field3385++;
        class203.field3548 = arg0;
        if (arg2 == -12) {
            class37.field575 = arg3;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static final void method1344(int arg0) {
        while (true) {
            if (class189.field3249.method492(class85.field1593, true) >= 11) {
                int var1 = class189.field3249.method490(0, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class249.field4291[var1] == null) {
                        class249.field4291[var1] = new class44();
                        var2 = true;
                        if (class200.field3491[var1] != null) {
                            class249.field4291[var1].method309(98, class200.field3491[var1]);
                        }
                    }
                    class151.field2556[class196.field3375++] = var1;
                    class44 var3 = class249.field4291[var1];
                    var3.field1009 = class151.field2555;
                    int var4 = class189.field3249.method490(0, 5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class189.field3249.method490(0, 1);
                    if (var5 == 1) {
                        class36.field564[class241.field4151++] = var1;
                    }
                    int var6 = class189.field3249.method490(0, 1);
                    int var7 = class189.field3249.method490(0, 5);
                    int var8 = class43.field738[class189.field3249.method490(0, 3)];
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    if (var2) {
                        var3.field1047 = var3.field1036 = var8;
                    }
                    var3.method313(class22.field308.field1066[0] + var7, 2, class22.field308.field1043[0] + var4, var6 == 1);
                    continue;
                }
            }
            int var9 = 52 / ((arg0 + 53) / 61);
            field3389++;
            class189.field3249.method487(-66);
            return;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
    public static void method1345(boolean arg0) {
        field3383 = null;
        if (arg0) {
            method1345(true);
        }
        field3384 = null;
        field3387 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
    public static int method1346(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
    public static final void method1347(boolean arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class97.field1756[var1] = false;
        }
        class154.field2663 = -1;
        if (arg0) {
            method1343((class68) null, (class68) null, -62, (class68) null);
        }
        class146.field2491 = -1;
        field3382++;
        class273.field4825 = 1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIBLnb;I)V")
    public static final void method1348(int arg0, int arg1, byte arg2, class199 arg3, int arg4) {
        field3388++;
        class185 var5 = (class185) class247.field4254.method110(64);
        if (arg2 < 89) {
            method1345(true);
        }
        while (var5 != null) {
            if (var5.field3176 == arg0 && (arg1 * 128) == var5.field3178 && (arg4 * 128) == var5.field3188 && var5.field3177.field3420 == arg3.field3420) {
                if (var5.field3182 != null) {
                    class247.field4249.method954(var5.field3182);
                    var5.field3182 = null;
                }
                if (var5.field3172 != null) {
                    class247.field4249.method954(var5.field3172);
                    var5.field3172 = null;
                }
                var5.method1753(137);
                return;
            }
            var5 = (class185) class247.field4254.method117((byte) 118);
        }
    }
}

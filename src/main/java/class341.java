import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class341 {

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lub;")
    public static class15 field4926 = new class15(64);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public int field4935;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "Lvj;")
    public static class256 field4937;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Lt;")
    public static class400 field4930;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Lri;")
    public class59 field4936;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "Z")
    public static boolean field4938;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "[I")
    public int[] field4933;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZLvq;)V")
    public static final void method2236(boolean arg0, class269 arg1) {
        field4934++;
        if (class158.field2302 == class134.field2063 || class385.field5449 == null) {
            return;
        }
        if (!arg0) {
            method2240(-113, -61);
        }
        if (class15.method103(4, arg1, class158.field2302)) {
            class134.field2063 = class158.field2302;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method2237(byte arg0) {
        field4937 = null;
        field4926 = null;
        field4930 = null;
        if (arg0 != -12) {
            field4937 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ltj;ILtj;Lvq;)V")
    public static final void method2238(class108 arg0, int arg1, class108 arg2, class269 arg3) {
        class423.field6036 = class432.method2699(0, arg2, class110.field1417, (byte) -90);
        field4932++;
        class32.field409 = arg3.method1024(class423.field6036, class337.method2215(arg0, class110.field1417, arg1), true);
        class317.field4651 = class432.method2699(0, arg2, class392.field5514, (byte) -90);
        class402.field5648 = arg3.method1024(class317.field4651, class337.method2215(arg0, class392.field5514, 0), true);
        class70.field934 = class432.method2699(0, arg2, class331.field4781, (byte) -90);
        class154.field2285 = arg3.method1024(class70.field934, class337.method2215(arg0, class331.field4781, 0), true);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method2239(byte arg0, int arg1) {
        field4928++;
        int var2 = -115 / ((-arg0 - 48) / 53);
        String var3 = Integer.toString(arg1);
        for (int var4 = var3.length() - 3; var4 > 0; var4 -= 3) {
            var3 = var3.substring(0, var4) + "," + var3.substring(var4);
        }
        if (var3.length() > 9) {
            return " <col=00ff80>" + var3.substring(0, var3.length() - 8) + class186.field2652.method2284((byte) 121, class309.field4497) + " (" + var3 + ")</col>";
        } else if (var3.length() > 6) {
            return " <col=ffffff>" + var3.substring(0, var3.length() - 4) + class83.field1058.method2284((byte) -27, class309.field4497) + " (" + var3 + ")</col>";
        } else {
            return " <col=ffff00>" + var3 + "</col>";
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
    public static final void method2240(int arg0, int arg1) {
        field4925++;
        class175.field2459 = arg1;
        class139.field2125 = arg0;
        class139.field2125 = -1;
        class177.method1267((byte) 96);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[B)I")
    public static final int method2241(int arg0, int arg1, byte[] arg2) {
        if (arg0 != 0) {
            method2236(true, (class269) null);
        }
        field4929++;
        return class87.method518(-109, 0, arg2, arg1);
    }
}

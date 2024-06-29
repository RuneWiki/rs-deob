import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class150 {

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "Lnk;")
    private class312 field2246 = new class312();

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "Lnk;")
    private class312 field2254;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "Lmu;")
    public static class346 field2245;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)Lnk;")
    public final class312 method1072(boolean arg0) {
        field2244++;
        if (!arg0) {
            method1081((byte) -41, null);
        }
        class312 var2 = this.field2246.field4753;
        if (this.field2246 == var2) {
            this.field2254 = null;
            return null;
        } else {
            this.field2254 = var2.field4753;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)Lnk;")
    public final class312 method1073(int arg0) {
        if (arg0 != 17494) {
            return null;
        }
        field2243++;
        class312 var2 = this.field2246.field4750;
        if (this.field2246 == var2) {
            return null;
        } else {
            var2.method2069(-11);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)Z")
    public final boolean method1074(byte arg0) {
        field2248++;
        if (arg0 < 78) {
            return false;
        } else {
            return this.field2246.field4750 == this.field2246;
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(Z)I")
    public final int method1075(boolean arg0) {
        field2253++;
        int var2 = 0;
        class312 var3 = this.field2246.field4750;
        if (!arg0) {
            this.method1082(null, 41);
        }
        while (this.field2246 != var3) {
            var2++;
            var3 = var3.field4750;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)Lnk;")
    public final class312 method1076(byte arg0) {
        if (arg0 < 45) {
            return null;
        }
        field2242++;
        class312 var2 = this.field2246.field4750;
        if (this.field2246 == var2) {
            this.field2254 = null;
            return null;
        } else {
            this.field2254 = var2.field4750;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)Lnk;")
    public final class312 method1077(int arg0) {
        field2255++;
        class312 var2 = this.field2254;
        if (this.field2246 == var2) {
            this.field2254 = null;
            return null;
        }
        this.field2254 = var2.field4750;
        if (arg0 != -1) {
            field2247 = -106;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lpv;Z)V")
    public static final void method1078(class46 arg0, boolean arg1) {
        field2250++;
        for (class491 var2 = (class491) class351.field5231.method295((byte) 127); var2 != null; var2 = (class491) class351.field5231.method296(arg1)) {
            if (var2.field7180 == arg0) {
                if (var2.field7182 != null) {
                    class503.field7313.method1802(var2.field7182);
                    var2.field7182 = null;
                }
                var2.method947((byte) 114);
                return;
            }
        }
        if (!arg1) {
            field2245 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(Z)V")
    public final void method1079(boolean arg0) {
        field2252++;
        if (!arg0) {
            return;
        }
        while (true) {
            class312 var2 = this.field2246.field4750;
            if (this.field2246 == var2) {
                this.field2254 = null;
                return;
            }
            var2.method2069(-11);
        }
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)V")
    public static void method1080(int arg0) {
        if (arg0 < 4) {
            field2247 = -69;
        }
        field2245 = null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLpv;)I")
    public static final int method1081(byte arg0, class46 arg1) {
        field2251++;
        class171 var2 = arg1.field718;
        if (var2.field2611 != null) {
            var2 = var2.method1221(class288.field4476, arg0 + 72);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2639;
        if (arg0 != -72) {
            field2247 = 57;
        }
        class477 var4 = arg1.method3101(-1);
        if (arg1.field7596) {
            var3 = var2.field2624;
        } else if (arg1.field7590 == var4.field6978 || arg1.field7590 == var4.field6983 || arg1.field7590 == var4.field6997 || arg1.field7590 == var4.field7019) {
            var3 = var2.field2616;
        } else if (arg1.field7590 == var4.field6975 || arg1.field7590 == var4.field7017 || arg1.field7590 == var4.field6981 || arg1.field7590 == var4.field7004) {
            var3 = var2.field2628;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lnk;I)V")
    public final void method1082(class312 arg0, int arg1) {
        field2249++;
        if (arg0.field4753 != null) {
            arg0.method2069(-11);
        }
        arg0.field4753 = this.field2246.field4753;
        arg0.field4750 = this.field2246;
        arg0.field4753.field4750 = arg0;
        arg0.field4750.field4753 = arg0;
        int var3 = -99 % ((69 - arg1) / 32);
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V")
    public class150() {
        this.field2246.field4753 = this.field2246;
        this.field2246.field4750 = this.field2246;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class167 extends class68 {

    @OriginalMember(owner = "client!ek", name = "W", descriptor = "I")
    private int field2301 = 4096;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "I")
    private int field2297 = 0;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "[I")
    public static int[] field2295 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "Ljava/lang/String;")
    public static String field2300 = "yellow:";

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!ek", name = "X", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "[Ls;")
    public static class245[] field2299;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)V")
    public static final void method1095(boolean arg0, int arg1) {
        if (arg0) {
            if (~class212.field3193 != 0) {
                class170.method1112(class212.field3193, 0);
            }
            for (class56 var2 = (class56) class289.field4559.method21((byte) 67); var2 != null; var2 = (class56) class289.field4559.method22(true)) {
                class136.method924((byte) 86, var2, true);
            }
            class212.field3193 = -1;
            class289.field4559 = new class4(8);
            class241.method1613(-1);
            class212.field3193 = class280.field4344;
            class75.method484(false, 2295);
            class65.method412(false);
            class170.method1113((byte) 111, class212.field3193);
        }
        ++field2294;
        class172.field2399 = -1;
        class118.method789(class219.field3293, false);
        class217.field3280 = new class88();
        if (arg1 == -6025) {
            class217.field3280.field4085 = 3000;
            class217.field3280.field4019 = 3000;
            if (~class124.field1746 != -1) {
                if (~class51.field734 == -3) {
                    class89.field1252 = class188.field2600 << 7;
                    class41.field618 = class290.field4577 << 7;
                } else {
                    class217.method1409(arg1 + -25646);
                }
                class87.method550(true);
                class145.method977(100, 28);
            } else {
                class151.method1012(120, class21.field299);
                class145.method977(arg1 + 5902, 10);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZILs;Ls;)I")
    public static final int method1096(int arg0, boolean arg1, int arg2, class245 arg3, class245 arg4) {
        ++field2296;
        if (~arg0 == -2) {
            int var5 = arg4.field637;
            int var6 = arg3.field637;
            if (!arg1) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return -var6 + var5;
        } else if (arg0 == 2) {
            return class61.method376(arg3.method1649(true).field2535, 0, class218.field3288, arg4.method1649(true).field2535);
        } else if (arg0 == 3) {
            if (!arg4.field3743.equals("-")) {
                if (arg3.field3743.equals("-")) {
                    return !arg1 ? -1 : 1;
                } else {
                    return class61.method376(arg3.field3743, 0, class218.field3288, arg4.field3743);
                }
            } else if (arg3.field3743.equals("-")) {
                return 0;
            } else {
                return !arg1 ? 1 : -1;
            }
        } else {
            if (arg2 <= 102) {
                field2295 = null;
            }
            if (arg0 == 4) {
                if (arg4.method285(-80)) {
                    return arg3.method285(-25) ? 0 : 1;
                } else {
                    return !arg3.method285(-114) ? 0 : -1;
                }
            } else if (arg0 == 5) {
                if (!arg4.method284(-18254)) {
                    return arg3.method284(-18254) ? -1 : 0;
                } else {
                    return !arg3.method284(-18254) ? 1 : 0;
                }
            } else if (arg0 == 6) {
                if (arg4.method280((byte) -43)) {
                    return arg3.method280((byte) -107) ? 0 : 1;
                } else {
                    return arg3.method280((byte) -8) ? -1 : 0;
                }
            } else if (~arg0 == -8) {
                if (arg4.method275((byte) 12)) {
                    return !arg3.method275((byte) 12) ? 1 : 0;
                } else {
                    return !arg3.method275((byte) 12) ? 0 : -1;
                }
            } else {
                return -arg3.field3741 + arg4.field3741;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "(I)V")
    public static void method1097(int arg0) {
        if (arg0 == 30165) {
            field2300 = null;
            field2299 = null;
            field2295 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        if (arg1 > -118) {
            this.field2301 = 75;
        }
        ++field2292;
        int[] var3 = super.field917.method1920(arg0, true);
        if (super.field917.field4474) {
            int[] var4 = this.method423(0, (byte) -54, arg0);
            for (int var5 = 0; ~var5 > ~class89.field1248; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field2297 && ~this.field2301 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
    public class167() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        ++field2293;
        if (arg2) {
            if (~arg1 != -1) {
                if (~arg1 == -2) {
                    this.field2301 = arg0.method1445(false);
                }
            } else {
                this.field2297 = arg0.method1445(false);
            }
        }
    }
}

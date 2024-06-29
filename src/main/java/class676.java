import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class676 extends class644 {

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public static int field9444 = 1;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "Z")
    public static boolean field9448 = false;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field9440;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field9442;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    public static int field9445;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public static int field9446;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
    public static int field9447;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "Ljava/lang/String;")
    public String field9449;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "[C")
    public char[] field9450;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "[C")
    public char[] field9452;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "[I")
    public int[] field9441;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "[I")
    public int[] field9451;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "[Lvp;")
    public static class191[] field9443;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static final void method3810(int arg0) {
        field9447++;
        if (arg0 <= 0) {
            return;
        }
        try {
            if (class514.field7217 == 1) {
                int var1 = class126.field1799.method1377(-11427);
                if (var1 > 0 && class126.field1799.method1404((byte) 104)) {
                    int var2 = var1 - class360.field4661;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class126.field1799.method1384(false, var2);
                    return;
                }
                class126.field1799.method1399(true);
                class126.field1799.method1411(126);
                if (class230.field3028 == null) {
                    class514.field7217 = 0;
                } else {
                    class514.field7217 = 2;
                }
                class258.field3271 = null;
                class579.field8108 = null;
            }
            if (class514.field7217 == 3) {
                int var3 = class126.field1799.method1377(-11427);
                if (var3 < class174.field2415 && class126.field1799.method1404((byte) 117)) {
                    int var4 = class244.field3163 + var3;
                    if (var4 > class174.field2415) {
                        var4 = class174.field2415;
                    }
                    class126.field1799.method1384(false, var4);
                } else {
                    class244.field3163 = 0;
                    class514.field7217 = 0;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class126.field1799.method1399(true);
            class514.field7217 = 0;
            client.field3977 = null;
            class258.field3271 = null;
            class230.field3028 = null;
            class579.field8108 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILsl;)V")
    public final void method3811(int arg0, class461 arg1) {
        field9439++;
        while (true) {
            int var3 = arg1.method2600((byte) -127);
            if (var3 == 0) {
                int var4 = 120 % ((-arg0 - 76) / 42);
                return;
            }
            this.method3815(-108, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BC)I")
    public final int method3812(byte arg0, char arg1) {
        field9442++;
        if (arg0 != 94) {
            return -111;
        } else if (this.field9441 == null) {
            return -1;
        } else {
            for (int var3 = 0; var3 < this.field9441.length; var3++) {
                if (this.field9450[var3] == arg1) {
                    return this.field9441[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IC)I")
    public final int method3813(int arg0, char arg1) {
        field9440++;
        if (this.field9451 == null) {
            return -1;
        }
        if (arg0 != 5902) {
            this.field9452 = null;
        }
        for (int var3 = 0; var3 < this.field9451.length; var3++) {
            if (this.field9452[var3] == arg1) {
                return this.field9451[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
    public final void method3814(boolean arg0) {
        field9446++;
        if (this.field9451 != null) {
            for (int var2 = 0; var2 < this.field9451.length; var2++) {
                this.field9451[var2] = class683.method3840(this.field9451[var2], 32768);
            }
        }
        if (!arg0) {
            this.field9451 = null;
        }
        if (this.field9441 != null) {
            for (int var3 = 0; var3 < this.field9441.length; var3++) {
                this.field9441[var3] = class683.method3840(this.field9441[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILsl;I)V")
    private final void method3815(int arg0, class461 arg1, int arg2) {
        if (arg0 > -16) {
            this.field9451 = null;
        }
        if (arg2 == 1) {
            this.field9449 = arg1.method2574(-1);
        } else if (arg2 == 2) {
            int var7 = arg1.method2600((byte) -128);
            this.field9450 = new char[var7];
            this.field9441 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field9441[var8] = arg1.method2566(-2);
                byte var9 = arg1.method2601(0);
                this.field9450[var8] = var9 == 0 ? 0 : class534.method3078(255, var9);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method2600((byte) -127);
            this.field9451 = new int[var4];
            this.field9452 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field9451[var5] = arg1.method2566(-2);
                byte var6 = arg1.method2601(0);
                this.field9452[var5] = var6 == 0 ? 0 : class534.method3078(255, var6);
            }
        }
        field9445++;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
    public static void method3816(int arg0) {
        field9443 = null;
        if (arg0 != 14987) {
            method3810(93);
        }
    }
}

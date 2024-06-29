import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class259 extends class436 {

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "Z")
    public static boolean field3551 = false;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "Ljava/lang/String;")
    public static String field3550 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field3549 = new String[100];

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3547 = "Use";

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "[Z")
    public static boolean[] field3553 = new boolean[100];

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "I")
    public static int field3552 = 0;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method14(int arg0, int arg1) {
        ++field3548;
        if (arg1 != 18338) {
            field3549 = null;
        }
        int[] var3 = super.field6258.method2688((byte) -53, arg0);
        if (super.field6258.field6138) {
            int var4 = class32.field499[arg0];
            for (int var5 = 0; ~class43.field653 < ~var5; ++var5) {
                var3[var5] = this.method1597(var4, class249.field3455[var5], (byte) -45) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIB)I", line = 36)
    private final int method1597(int arg0, int arg1, byte arg2) {
        ++field3545;
        int var4 = arg0 * 57 + arg1;
        if (arg2 != -45) {
            return -128;
        } else {
            int var5 = var4 << 1 ^ var4;
            return -(((var5 * 15731 * var5 + 789221) * var5 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V", line = 50)
    public class259() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([JI[I)V", line = 60)
    public static final void method1598(long[] arg0, int arg1, int[] arg2) {
        ++field3554;
        class281.method1788(96, arg2, arg0, arg1, arg0.length + -1);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V", line = 69)
    public static final void method1599(boolean arg0) {
        if (class408.field5920 != null) {
            class145.field2112.method2305(-80);
            class55.method372();
            class157.method1058(true);
            class365.method2345(-123);
            class48.method338((byte) 83);
            class234.method1480(-99);
            if (class66.field1040 != null) {
                class66.field1040.method996((byte) 105);
            }
            class171.method1163((byte) -52);
            class33.method246(-1);
            class144.method986((byte) 14);
            class142.method968(false, -88);
            class202.method1333((byte) 15);
            for (int var1 = 0; ~var1 > -2049; ++var1) {
                class354 var5 = class12.field153[var1];
                if (var5 != null) {
                    var5.field953 = null;
                    for (int var6 = 0; ~var5.field946.length < ~var6; ++var6) {
                        var5.field946[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class445.field6422.length; ++var2) {
                class437 var3 = class445.field6422[var2];
                if (var3 != null) {
                    for (int var4 = 0; ~var3.field946.length < ~var4; ++var4) {
                        var3.field946[var4] = null;
                    }
                }
            }
            class408.field5920.method1809((byte) 79);
            class408.field5920 = null;
        }
        ++field3546;
        if (arg0) {
            method1599(true);
        }
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V", line = 165)
    public static void method1600(int arg0) {
        field3549 = null;
        field3550 = null;
        field3553 = null;
        field3547 = null;
        if (arg0 != 16196) {
            field3547 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lcp;Z)Z", line = 183)
    public static final boolean method1601(class430 arg0, boolean arg1) {
        boolean var2 = class435.field6248 == class249.field3456;
        int var3 = 0;
        arg0.method400((byte) 66);
        if (arg0.field6182 >= 0 && arg0.field6186 >= 0 && arg0.field6195 < class386.field5629 && arg0.field6185 < class371.field5311) {
            for (int var4 = arg0.field6182; var4 <= arg0.field6195; ++var4) {
                for (int var7 = arg0.field6186; var7 <= arg0.field6185; ++var7) {
                    int var8 = 0;
                    if (var4 > arg0.field6182) {
                        ++var8;
                    }
                    if (var4 < arg0.field6195) {
                        var8 += 4;
                    }
                    if (var7 > arg0.field6186) {
                        var8 += 8;
                    }
                    if (var7 < arg0.field6185) {
                        var8 += 2;
                    }
                    class61.method403(arg0.field6198, var4, var7);
                    class142 var9 = class5.field79[arg0.field6198][var4][var7];
                    class218 var10 = class218.method1386(false, var8, arg0);
                    class218 var11 = var9.field2043;
                    if (var11 == null) {
                        var9.field2043 = var10;
                    } else {
                        while (var11.field2884 != null) {
                            var11 = var11.field2884;
                        }
                        var11.field2884 = var10;
                    }
                    var9.field2036 = (byte) (var9.field2036 | var8);
                    if (var2 && class270.field3683[var4][var7] != 0) {
                        var3 = class270.field3683[var4][var7];
                    }
                }
            }
            if (var2 && var3 != 0) {
                for (int var5 = arg0.field6182; var5 <= arg0.field6195; ++var5) {
                    for (int var6 = arg0.field6186; var6 <= arg0.field6185; ++var6) {
                        if (class270.field3683[var5][var6] == 0) {
                            class270.field3683[var5][var6] = var3;
                        }
                    }
                }
            }
            if (arg1) {
                class327.field4469[class170.field2426++] = arg0;
            }
            return true;
        } else {
            return false;
        }
    }
}

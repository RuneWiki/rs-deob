import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class287 extends class295 {

    @OriginalMember(owner = "client!am", name = "H", descriptor = "Z")
    public static boolean field3847 = true;

    @OriginalMember(owner = "client!am", name = "I", descriptor = "Ltd;")
    public static class107 field3848 = new class107();

    @OriginalMember(owner = "client!am", name = "L", descriptor = "[I")
    public static int[] field3851 = new int[14];

    @OriginalMember(owner = "client!am", name = "M", descriptor = "C")
    private char field3852;

    @OriginalMember(owner = "client!am", name = "B", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!am", name = "D", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!am", name = "E", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!am", name = "F", descriptor = "I")
    public int field3845;

    @OriginalMember(owner = "client!am", name = "G", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!am", name = "J", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!am", name = "K", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!am", name = "C", descriptor = "Ljava/lang/String;")
    public String field3842;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "(I)V", line = 7)
    public static void method1811(int arg0) {
        if (arg0 <= 16) {
            method1811(118);
        }
        field3848 = null;
        field3851 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lap;B)V", line = 19)
    public final void method1812(class289 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1861((byte) -72);
            if (var3 == 0) {
                field3846++;
                if (arg1 != -57) {
                    this.field3842 = null;
                    return;
                }
                return;
            }
            this.method1816(var3, 2, arg0);
        }
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "(I)V", line = 41)
    public static final void method1813(int arg0) {
        field3849++;
        for (int var1 = 0; var1 < class221.field3055; var1++) {
            int var2 = class209.field2891[var1];
            class127 var3 = class298.field4012[var2];
            if (var3 != null) {
                class21.method278(var3.field1784.field133, var3, (byte) 49);
            }
        }
        if (arg0 != 14945) {
            field3851 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "g", descriptor = "(I)Z", line = 69)
    public final boolean method1814(int arg0) {
        field3850++;
        if (arg0 <= 39) {
            this.method1816(-93, 108, (class289) null);
        }
        return this.field3852 == 's';
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIII)V", line = 81)
    public static final void method1815(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3841++;
        int var6 = arg1 - arg4;
        int var7 = arg0 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class434.method2693(arg4, arg1, arg3, arg5, -30616);
            }
        } else if (var6 == 0) {
            class77.method659(arg3, arg4, -13935, arg0, arg5);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg5;
                int var10 = arg0;
                arg5 = arg4;
                arg4 = var9;
                arg0 = arg1;
                arg1 = var10;
            }
            if (arg5 > arg0) {
                int var11 = arg5;
                int var12 = arg4;
                arg5 = arg0;
                arg4 = arg1;
                arg0 = var11;
                arg1 = var12;
            }
            int var13 = arg4;
            int var14 = arg0 - arg5;
            int var15 = arg1 - arg4;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            if (arg2 == -20897) {
                int var17 = arg1 > arg4 ? 1 : -1;
                if (var8) {
                    for (int var18 = arg5; var18 <= arg0; var18++) {
                        var16 += var15;
                        class186.field2697[var18][var13] = arg3;
                        if (var16 > 0) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                } else {
                    for (int var19 = arg5; var19 <= arg0; var19++) {
                        class186.field2697[var13][var19] = arg3;
                        var16 += var15;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILap;)V", line = 202)
    private final void method1816(int arg0, int arg1, class289 arg2) {
        if (arg0 == 1) {
            this.field3852 = class393.method2421(arg2.method1868((byte) -123), 20483);
        } else if (arg0 == 2) {
            this.field3845 = arg2.method1856((byte) 82);
        } else if (arg0 == 5) {
            this.field3842 = arg2.method1871(arg1 - 3);
        }
        field3844++;
        if (arg1 != 2) {
            field3847 = true;
        }
    }
}

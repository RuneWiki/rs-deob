import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class259 {

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Lbea;")
    private class205 field4141;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public int field4144;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field4142 = 0;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "Lf;")
    public static class702 field4146;

    @OriginalMember(owner = "client!sm", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field4145++;
        this.field4141.method1582(this.field4144, 1);
        super.finalize();
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Liaa;Z)Z")
    public static final boolean method1830(class459 arg0, boolean arg1) {
        boolean var2 = class587.field8346 == class493.field7208;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method960(true);
        if (arg0.field6865 < 0 || arg0.field6869 < 0 || arg0.field6870 >= class43.field597 || arg0.field6871 >= class541.field7896) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field6865; var7 <= arg0.field6870; var7++) {
            for (int var11 = arg0.field6869; var11 <= arg0.field6871; var11++) {
                class252 var12 = class115.method1040(arg0.field9695, var7, var11);
                if (var12 != null) {
                    class531 var13 = class528.method3196(arg0, -10779);
                    class531 var14 = var12.field4026;
                    if (var14 == null) {
                        var12.field4026 = var13;
                    } else {
                        while (var14.field7736 != null) {
                            var14 = var14.field7736;
                        }
                        var14.field7736 = var13;
                    }
                    if (var2 && (class575.field8191[var7][var11] & 0xFF000000) != 0) {
                        var3 = class575.field8191[var7][var11];
                        var4 = class479.field7078[var7][var11];
                        var5 = class530.field7728[var7][var11];
                    }
                    if (!arg1 && var12.field4025 != null && var12.field4025.field7864 > var6) {
                        var6 = var12.field4025.field7864;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field6865; var8 <= arg0.field6870; var8++) {
                for (int var9 = arg0.field6869; var9 <= arg0.field6871; var9++) {
                    if ((class575.field8191[var8][var9] & 0xFF000000) == 0) {
                        class575.field8191[var8][var9] = var3;
                        class479.field7078[var8][var9] = var4;
                        class530.field7728[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class56.field730[class15.field203++] = arg0;
        } else {
            int var10 = class587.field8346 == class493.field7208 ? 1 : 0;
            if (!arg0.method414(0)) {
                class245.field3903[var10][class95.field1483[var10]++] = arg0;
            } else if (arg0.method402(623404585)) {
                class321.field5016[var10][class124.field2052[var10]++] = arg0;
            } else {
                class20.field329[var10][class203.field3310[var10]++] = arg0;
            }
        }
        if (arg1) {
            arg0.field9701 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1831(int arg0, int arg1, boolean arg2) {
        field4143++;
        if (arg2) {
            return (arg0 & 0x10) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZZ)V")
    public static final void method1832(boolean arg0, boolean arg1) {
        field4148++;
        if (class66.field855.length() == 0) {
            return;
        }
        class529.method3200("--> " + class66.field855, -128);
        class553.method3319(arg0, class66.field855, arg1, (byte) 75);
        class66.field855 = "";
        class384.field5944 = 0;
        class200.field3260 = 0;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "()V")
    public static final void method1833() {
        if (class500.field7343 != null) {
            for (int var0 = 0; var0 < class500.field7343.length; var0++) {
                for (int var1 = 0; var1 < class43.field597; var1++) {
                    for (int var2 = 0; var2 < class541.field7896; var2++) {
                        if (class500.field7343[var0][var1][var2] != null) {
                            class500.field7343[var0][var1][var2].method1792((byte) -93);
                        }
                        class500.field7343[var0][var1][var2] = null;
                    }
                }
            }
        }
        class500.field7343 = null;
        class491.field7187 = null;
        if (class524.field7645 != null) {
            for (int var3 = 0; var3 < class524.field7645.length; var3++) {
                for (int var4 = 0; var4 < class43.field597; var4++) {
                    for (int var5 = 0; var5 < class541.field7896; var5++) {
                        if (class524.field7645[var3][var4][var5] != null) {
                            class524.field7645[var3][var4][var5].method1792((byte) -105);
                        }
                        class524.field7645[var3][var4][var5] = null;
                    }
                }
            }
        }
        class524.field7645 = null;
        class493.field7208 = null;
        class454.field6818 = null;
        class587.field8346 = null;
        class37.field509 = null;
        class550.field7997 = null;
        class299.field4678 = null;
        class522.field7576 = null;
        class354.method2376(-105);
        if (class56.field730 != null) {
            for (int var6 = 0; var6 < class15.field203; var6++) {
                class56.field730[var6] = null;
            }
            class15.field203 = 0;
        }
        if (class20.field329 != null) {
            for (int var7 = 0; var7 < class203.field3310[0]; var7++) {
                class20.field329[0][var7] = null;
            }
            for (int var8 = 0; var8 < class203.field3310[1]; var8++) {
                class20.field329[1][var8] = null;
            }
            class203.field3310 = new int[2];
        }
        if (class321.field5016 != null) {
            for (int var9 = 0; var9 < class124.field2052[0]; var9++) {
                class321.field5016[0][var9] = null;
            }
            for (int var10 = 0; var10 < class124.field2052[1]; var10++) {
                class321.field5016[1][var10] = null;
            }
            class124.field2052 = new int[2];
        }
        if (class245.field3903 != null) {
            for (int var11 = 0; var11 < class95.field1483[0]; var11++) {
                class245.field3903[0][var11] = null;
            }
            for (int var12 = 0; var12 < class95.field1483[1]; var12++) {
                class245.field3903[1][var12] = null;
            }
            class95.field1483 = new int[2];
        }
        if (class667.field9434 != null) {
            for (int var13 = 0; var13 < class667.field9434.length; var13++) {
                class667.field9434[var13] = null;
            }
            class148.field2465 = 0;
        }
        if (class96.field1533 != null) {
            for (int var14 = 0; var14 < class96.field1533.length; var14++) {
                class96.field1533[var14] = null;
            }
            class207.field3462 = 0;
        }
        if (class529.field7714 != null) {
            for (int var15 = 0; var15 < class343.field5536; var15++) {
                class529.field7714[var15] = null;
            }
            for (int var16 = 0; var16 < class524.field7649; var16++) {
                for (int var17 = 0; var17 < class43.field597; var17++) {
                    for (int var18 = 0; var18 < class541.field7896; var18++) {
                        class99.field1601[var16][var17][var18] = 0L;
                    }
                }
            }
            class343.field5536 = 0;
        }
        class229.method1685(16711935);
        class485.field7108.method2749(-19473);
        class530.field7728 = null;
        class575.field8191 = null;
        class479.field7078 = null;
        if (class458.field6856 != null) {
            class690.method3907();
            class595.field8435.method336(1);
            class595.field8435.method293(0);
        }
        if (class235.field3744 != null) {
            class235.field3744 = null;
        }
        class595.field8435 = null;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lbea;II)V")
    public class259(class205 arg0, int arg1, int arg2) {
        this.field4141 = arg0;
        this.field4144 = arg2;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)V")
    public static void method1834(boolean arg0) {
        field4146 = null;
        if (!arg0) {
            method1830(null, true);
        }
    }
}

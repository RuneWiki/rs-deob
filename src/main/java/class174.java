import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class174 implements class669 {

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "Ljava/lang/String;")
    private String field2445;

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "Lmv;")
    private class295 field2448;

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!sfa", name = "f", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(B)Lbl;", line = 4)
    public final class348 method358(byte arg0) {
        if (arg0 <= 75) {
            this.method360((byte) 60);
        }
        field2447++;
        return class348.field5155;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)I", line = 16)
    public final int method360(byte arg0) {
        field2449++;
        if (arg0 == 84) {
            return this.field2448.method1823(this.field2445, true) ? 100 : this.field2448.method1814(0, this.field2445);
        } else {
            return 6;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "([I[IB[ILu;)V", line = 32)
    public static final void method1196(int[] arg0, int[] arg1, byte arg2, int[] arg3, class53 arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg1[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var7 != 0 && arg4.field7344.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field7344[var9] = null;
                    } else {
                        class47 var10 = class203.field2769.method2971(arg2 ^ 0x78, var6);
                        int var11 = var10.field725;
                        class220 var12 = arg4.field7344[var9];
                        if (var12 != null) {
                            if (var12.field2926 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field7344[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field2921 = 0;
                                    var12.field2924 = 0;
                                    var12.field2920 = 0;
                                    var12.field2918 = 1;
                                    var12.field2922 = var8;
                                    if (!arg4.field7372) {
                                        class620.method3567(arg4, 0, var10, (byte) -39);
                                    }
                                } else if (var11 == 2) {
                                    var12.field2921 = 0;
                                }
                            } else if (var10.field742 >= class203.field2769.method2971(-28, var12.field2926).field742) {
                                var12 = arg4.field7344[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class220 var13 = arg4.field7344[var9] = new class220();
                            var13.field2924 = 0;
                            var13.field2918 = 1;
                            var13.field2920 = 0;
                            var13.field2921 = 0;
                            var13.field2922 = var8;
                            var13.field2926 = var6;
                            if (!arg4.field7372) {
                                class620.method3567(arg4, 0, var10, (byte) -11);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        if (arg2 == -98) {
            field2450++;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lmv;Ljava/lang/String;)V", line = 135)
    public class174(class295 arg0, String arg1) {
        this.field2445 = arg1;
        this.field2448 = arg0;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(III)Z", line = 146)
    public static final boolean method1197(int arg0, int arg1, int arg2) {
        field2446++;
        if (arg2 != 18610) {
            method1196(null, null, (byte) -113, null, null);
        }
        return (arg0 & 0x84080) != 0;
    }
}

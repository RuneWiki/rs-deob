import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class30 {

    @OriginalMember(owner = "client!rca", name = "l", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "client!rca", name = "p", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "B")
    public byte field507;

    @OriginalMember(owner = "client!rca", name = "k", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "Lvg;")
    public static class622 field508 = new class622(106, 10);

    @OriginalMember(owner = "client!rca", name = "i", descriptor = "Lcq;")
    public static class273 field513 = new class273(10, 2, 2, 0);

    @OriginalMember(owner = "client!rca", name = "n", descriptor = "I")
    public static int field518 = 0;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "I")
    public int field512;

    @OriginalMember(owner = "client!rca", name = "j", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!rca", name = "m", descriptor = "I")
    public int field517;

    @OriginalMember(owner = "client!rca", name = "o", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!rca", name = "q", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!rca", name = "r", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "client!rca", name = "s", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "client!rca", name = "t", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "client!rca", name = "u", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "Lrca;")
    public class30 field511;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "([I[IBLmq;[I)V", line = 3)
    public static final void method188(int[] arg0, int[] arg1, byte arg2, class71 arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg0[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg3.field7344.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field7344[var9] = null;
                    } else {
                        class47 var10 = class203.field2769.method2971(-28, var6);
                        int var11 = var10.field725;
                        class220 var12 = arg3.field7344[var9];
                        if (var12 != null) {
                            if (var12.field2926 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field7344[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field2921 = 0;
                                    var12.field2920 = 0;
                                    var12.field2918 = 1;
                                    var12.field2922 = var8;
                                    var12.field2924 = 0;
                                    if (!arg3.field7372) {
                                        class620.method3567(arg3, 0, var10, (byte) -29);
                                    }
                                } else if (var11 == 2) {
                                    var12.field2921 = 0;
                                }
                            } else if (var10.field742 >= class203.field2769.method2971(arg2 ^ 0xFFFFFFDF, var12.field2926).field742) {
                                var12 = arg3.field7344[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class220 var13 = arg3.field7344[var9] = new class220();
                            var13.field2922 = var8;
                            var13.field2920 = 0;
                            var13.field2926 = var6;
                            var13.field2918 = 1;
                            var13.field2924 = 0;
                            var13.field2921 = 0;
                            if (!arg3.field7372) {
                                class620.method3567(arg3, 0, var10, (byte) -121);
                            }
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field514++;
        if (arg2 != 100) {
            field518 = 82;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIII)Lrca;", line = 102)
    public final class30 method189(int arg0, int arg1, int arg2, int arg3) {
        field506++;
        if (arg0 != -29197) {
            this.field511 = null;
        }
        return new class30(this.field516, arg2, arg3, arg1, this.field507);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V", line = 137)
    public static void method190(int arg0) {
        field508 = null;
        field513 = null;
        if (arg0 != -3) {
            field513 = null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)Lth;", line = 148)
    public final class112 method191(int arg0) {
        field521++;
        if (arg0 != 9982) {
            this.method189(-123, -81, -74, 73);
        }
        return class257.method1537((byte) 124, this.field516);
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(IIIIB)V", line = 166)
    public class30(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field516 = arg0;
        this.field509 = arg1;
        this.field520 = arg3;
        this.field507 = arg4;
        this.field515 = arg2;
    }
}

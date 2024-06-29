import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class264 extends class623 {

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "D")
    public double field3352;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "[[S")
    public short[][] field3348;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "[I")
    public static int[] field3346 = new int[2];

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "Lmq;")
    public static class78 field3347 = new class78(26, 3);

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II[BIIB)Z", line = 18)
    public static final boolean method1589(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte arg5) {
        field3351++;
        boolean var6 = true;
        class179 var7 = new class179(arg2);
        int var8 = -1;
        label60: while (true) {
            int var9 = var7.method1151(49);
            if (var9 == 0) {
                if (arg5 <= 54) {
                    return false;
                }
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method1158(-32768);
                    if (var13 == 0) {
                        continue label60;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = var10 >> 6 & 0x3F;
                    int var16 = var7.method1094(255) >> 2;
                    int var17 = arg0 + var15;
                    int var18 = arg1 + var14;
                    if (var17 > 0 && var18 > 0 && var17 < arg3 - 1 && var18 < arg4 - 1) {
                        class290 var19 = class358.field5112.method890(var8, false);
                        if (var16 != 22 || class223.field2944.field610.method3087((byte) -127) != 0 || var19.field3738 != 0 || var19.field3776 == 1 || var19.field3698) {
                            if (!var19.method1733(-1)) {
                                var6 = false;
                                class7.field72++;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.method1158(-32768);
                if (var12 == 0) {
                    break;
                }
                var7.method1094(255);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V", line = 102)
    public static final void method1590(int arg0, int arg1) {
        if (arg1 != 9128) {
            field3347 = null;
        }
        for (class627 var2 = class418.field5952.method3245(false); var2 != null; var2 = class418.field5952.method3252(12938)) {
            if (((long) arg0) == (var2.field8746 >> 48 & 0xFFFFL)) {
                var2.method3426((byte) -50);
            }
        }
        field3349++;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)J", line = 123)
    public final long method1591(int arg0) {
        field3345++;
        if (arg0 != -791402272) {
            this.field3352 = 0.8160687589922663D;
        }
        return (long) (this.field3348.length << 0 | this.field3348[0].length);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)Z", line = 134)
    public static final boolean method1592(byte arg0, int arg1) {
        if (arg0 >= -102) {
            method1592((byte) -56, -123);
        }
        field3350++;
        return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V", line = 146)
    public static void method1593(int arg0) {
        field3346 = null;
        field3347 = null;
        int var1 = 44 % ((-arg0 - 43) / 43);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lrq;Z)Z", line = 157)
    public static final boolean method1594(class451 arg0, boolean arg1) {
        boolean var2 = class517.field7282 == class109.field1341;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method246((byte) 122);
        if (arg0.field6321 < 0 || arg0.field6328 < 0 || arg0.field6322 >= class90.field1142 || arg0.field6324 >= class665.field9107) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field6321; var7 <= arg0.field6322; var7++) {
            for (int var11 = arg0.field6328; var11 <= arg0.field6324; var11++) {
                class73 var12 = class663.method3590(arg0.field5779, var7, var11);
                if (var12 != null) {
                    class456 var13 = class275.method1651(-1, arg0);
                    class456 var14 = var12.field969;
                    if (var14 == null) {
                        var12.field969 = var13;
                    } else {
                        while (var14.field6389 != null) {
                            var14 = var14.field6389;
                        }
                        var14.field6389 = var13;
                    }
                    if (var2 && (class224.field2949[var7][var11] & 0xFF000000) != 0) {
                        var3 = class224.field2949[var7][var11];
                        var4 = class340.field4391[var7][var11];
                        var5 = class84.field1088[var7][var11];
                    }
                    if (!arg1 && var12.field966 != null && var12.field966.field4355 > var6) {
                        var6 = var12.field966.field4355;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field6321; var8 <= arg0.field6322; var8++) {
                for (int var9 = arg0.field6328; var9 <= arg0.field6324; var9++) {
                    if ((class224.field2949[var8][var9] & 0xFF000000) == 0) {
                        class224.field2949[var8][var9] = var3;
                        class340.field4391[var8][var9] = var4;
                        class84.field1088[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class102.field1257[class618.field8661++] = arg0;
        } else {
            int var10 = class517.field7282 == class109.field1341 ? 1 : 0;
            if (!arg0.method265((byte) 122)) {
                arg0.field5793 = class293.field3797[var10];
                class293.field3797[var10] = arg0;
            } else if (arg0.method256((byte) 41)) {
                arg0.field5793 = class466.field6722[var10];
                class466.field6722[var10] = arg0;
            } else {
                arg0.field5793 = class684.field9445[var10];
                class684.field9445[var10] = arg0;
                class571.field7967 = true;
            }
        }
        if (arg1) {
            arg0.field5791 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([[SD)V", line = 281)
    public class264(short[][] arg0, double arg1) {
        this.field3352 = arg1;
        this.field3348 = arg0;
    }
}

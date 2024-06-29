import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class638 {

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "Lhv;")
    private class474 field9050 = new class474();

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
    private int field9068;

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
    private int field9067;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "Ltq;")
    private class572 field9065;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field9053 = 0;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "[[I")
    public static int[][] field9057 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field9049;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field9051;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field9052;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public static int field9055;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public static int field9056;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
    public static int field9058;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    public static int field9061;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
    public static int field9062;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "I")
    public static int field9063;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "[Lxa;")
    public static class458[] field9066;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIB)V")
    public static final void method3587(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field9061++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        int var9 = class512.method2932((byte) -46, arg0 + arg3, class163.field1942, class326.field4246);
        if (arg4 < 43) {
            field9057 = null;
        }
        int var10 = class512.method2932((byte) -46, arg3 - arg0, class163.field1942, class326.field4246);
        class445.method2463(var10, 111, var9, arg1, class156.field1755[arg2]);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg2 - var6;
                int var12 = arg2 + var6;
                if (class58.field602 <= var12 && var11 <= class501.field7217) {
                    int var13 = class512.method2932((byte) -46, arg3 + var5, class163.field1942, class326.field4246);
                    int var14 = class512.method2932((byte) -46, arg3 - var5, class163.field1942, class326.field4246);
                    if (var12 <= class501.field7217) {
                        class445.method2463(var14, 114, var13, arg1, class156.field1755[var12]);
                    }
                    if (class58.field602 <= var11) {
                        class445.method2463(var14, 109, var13, arg1, class156.field1755[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (var16 >= class58.field602 && class501.field7217 >= var15) {
                int var17 = class512.method2932((byte) -46, arg3 + var6, class163.field1942, class326.field4246);
                int var18 = class512.method2932((byte) -46, arg3 - var6, class163.field1942, class326.field4246);
                if (var16 <= class501.field7217) {
                    class445.method2463(var18, 125, var17, arg1, class156.field1755[var16]);
                }
                if (var15 >= class58.field602) {
                    class445.method2463(var18, 119, var17, arg1, class156.field1755[var15]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZLjava/lang/Object;Llo;I)V")
    private final void method3588(boolean arg0, Object arg1, class686 arg2, int arg3) {
        field9060++;
        if (this.field9068 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method3590(arg2, -30185);
        this.field9067 -= arg3;
        while (this.field9067 < 0) {
            class603 var6 = (class603) this.field9050.method2766((byte) 82);
            this.method3594((byte) 47, var6);
        }
        class461 var5 = new class461(arg2, arg1, arg3);
        this.field9065.method3235(arg2.method3470((byte) -124), -1, var5);
        this.field9050.method2765(0, var5);
        if (!arg0) {
            var5.field4676 = 0L;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)I")
    public final int method3589(int arg0) {
        field9063++;
        return arg0 == 0 ? this.field9067 : -36;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Llo;I)V")
    private final void method3590(class686 arg0, int arg1) {
        field9054++;
        long var3 = arg0.method3470((byte) 87);
        for (class603 var5 = (class603) this.field9065.method3234((byte) -65, var3); var5 != null; var5 = (class603) this.field9065.method3233(116)) {
            if (var5.field8545.method3474(false, arg0)) {
                this.method3594((byte) 47, var5);
                break;
            }
        }
        if (arg1 != -30185) {
            this.field9068 = 61;
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(Llo;I)Ljava/lang/Object;")
    public final Object method3591(class686 arg0, int arg1) {
        field9064++;
        long var3 = arg0.method3470((byte) -116);
        for (class603 var5 = (class603) this.field9065.method3234((byte) -101, var3); var5 != null; var5 = (class603) this.field9065.method3233(118)) {
            if (var5.field8545.method3474(false, arg0)) {
                Object var6 = var5.method462(-81);
                if (var6 != null) {
                    if (var5.method463((byte) -41)) {
                        class461 var7 = new class461(arg0, var6, var5.field8544);
                        this.field9065.method3235(var5.field3405, -1, var7);
                        this.field9050.method2765(0, var7);
                        var7.field4676 = 0L;
                        var5.method1519((byte) 121);
                        var5.method1968((byte) -116);
                    } else {
                        this.field9050.method2765(0, var5);
                        var5.field4676 = 0L;
                    }
                    return var6;
                }
                var5.method1519((byte) 121);
                var5.method1968((byte) -92);
                this.field9067 += var5.field8544;
            }
        }
        if (arg1 != -13445) {
            this.field9068 = 5;
        }
        return null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)I")
    public final int method3592(boolean arg0) {
        field9059++;
        if (arg0) {
            method3593(true, 29, null);
        }
        return this.field9068;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method3593(boolean arg0, int arg1, String arg2) {
        field9058++;
        class321.method1809("", arg1, (byte) 99, "", "", 0, arg2);
        if (!arg0) {
            field9053 = 33;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLlw;)V")
    private final void method3594(byte arg0, class603 arg1) {
        if (arg0 != 47) {
            method3598(19, null, -4, null);
        }
        if (arg1 != null) {
            arg1.method1519((byte) 121);
            arg1.method1968((byte) -100);
            this.field9067 += arg1.field8544;
        }
        field9051++;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)V")
    public final void method3595(boolean arg0) {
        field9055++;
        if (!arg0) {
            return;
        }
        for (class603 var2 = (class603) this.field9050.method2769(0); var2 != null; var2 = (class603) this.field9050.method2763(-23638)) {
            if (var2.method463((byte) -113)) {
                var2.method1519((byte) 121);
                var2.method1968((byte) -97);
                this.field9067 += var2.field8544;
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
    public static void method3596(int arg0) {
        field9066 = null;
        field9057 = null;
        if (arg0 != -31180) {
            method3593(true, 124, null);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/Object;BLlo;)V")
    public final void method3597(Object arg0, byte arg1, class686 arg2) {
        int var4 = 12 / ((36 - arg1) / 45);
        field9062++;
        this.method3588(false, arg0, arg2, 1);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/lang/String;I[B)I")
    public static final int method3598(int arg0, String arg1, int arg2, byte[] arg3) {
        field9049++;
        if (arg2 != 15346) {
            return 21;
        }
        int var4 = arg1.length();
        int var5 = arg0;
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 <= '\u007F') {
                arg3[var5++] = (byte) var7;
            } else if (var7 > '߿') {
                arg3[var5++] = (byte) class139.method776(var7 >> 12, 224);
                arg3[var5++] = (byte) class139.method776(128, class203.method1246(4089, var7) >> 6);
                arg3[var5++] = (byte) class139.method776(class203.method1246(var7, 63), 128);
            } else {
                arg3[var5++] = (byte) class139.method776(var7 >> 6, 192);
                arg3[var5++] = (byte) class139.method776(128, class203.method1246(var7, 63));
            }
        }
        return var5 - arg0;
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V")
    public final void method3599(int arg0) {
        if (arg0 > 0) {
            field9057 = null;
        }
        this.field9050.method2767(16993);
        field9052++;
        this.field9065.method3227((byte) -122);
        this.field9067 = this.field9068;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)V")
    public final void method3600(int arg0, int arg1) {
        if (class422.field5619 != null) {
            for (class603 var3 = (class603) this.field9050.method2769(0); var3 != null; var3 = (class603) this.field9050.method2763(arg1 - 23766)) {
                if (var3.method463((byte) -72)) {
                    if (var3.method462(-87) == null) {
                        var3.method1519((byte) 121);
                        var3.method1968((byte) -111);
                        this.field9067 += var3.field8544;
                    }
                } else if (++var3.field4676 > (long) arg0) {
                    class603 var4 = class422.field5619.method585(arg1 ^ 0xFFFFA776, var3);
                    this.field9065.method3235(var3.field3405, arg1 ^ 0xFFFFFF7F, var4);
                    class25.method128(var4, var3, false);
                    var3.method1519((byte) 121);
                    var3.method1968((byte) -128);
                }
            }
        }
        field9056++;
        if (arg1 != 128) {
            method3593(true, -38, null);
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(I)V")
    public class638(int arg0) {
        this.field9068 = arg0;
        this.field9067 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field9065 = new class572(var2);
    }
}

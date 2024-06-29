import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class313 {

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "[J")
    private long[] field4020 = new long[8];

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    private int field4022 = 0;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "[J")
    private long[] field4026 = new long[8];

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    private int field4030 = 0;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "[B")
    private byte[] field4028 = new byte[64];

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "[J")
    private long[] field4037 = new long[8];

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "[J")
    private long[] field4025 = new long[8];

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "[B")
    private byte[] field4033 = new byte[32];

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "[J")
    private long[] field4029 = new long[8];

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "Lfm;")
    public static class204 field4031;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wj", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field4038;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public final void method1812(int arg0) {
        int var2 = 0;
        if (arg0 != 8) {
            this.field4033 = null;
        }
        while (var2 < 32) {
            this.field4033[var2] = 0;
            var2++;
        }
        field4024++;
        this.field4022 = this.field4030 = 0;
        this.field4028[0] = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field4026[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    private final void method1813(byte arg0) {
        field4032++;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field4037[var2] = class413.method2187(class168.method964(255L, (long) this.field4028[var3 + 7]), class413.method2187(class168.method964(255L, (long) this.field4028[var3 + 6]) << 8, class413.method2187(class413.method2187(class168.method964((long) this.field4028[var3 + 4] << 24, 0xFFL << 24), class413.method2187(class168.method964((long) this.field4028[var3 + 3] << 32, 0xFFL << 32), class413.method2187(class413.method2187(class168.method964((long) this.field4028[var3 + 1] << 48, 0xFFL << 48), (long) this.field4028[var3] << 56), class168.method964((long) this.field4028[var3 + 2], 255L) << 40))), class168.method964(255L, (long) this.field4028[var3 + 5]) << 16)));
            var2++;
            var3 += 8;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field4025[var4] = class413.method2187(this.field4037[var4], this.field4020[var4] = this.field4026[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field4029[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field4029[var7] = class413.method2187(this.field4029[var7], class693.field9835[var13][class695.method3921(255, (int) (this.field4020[class695.method3921(var7 - var13, 7)] >>> var14))]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field4020[var8] = this.field4029[var8];
            }
            this.field4020[0] = class413.method2187(this.field4020[0], class693.field9836[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field4029[var9] = this.field4020[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field4029[var9] = class413.method2187(this.field4029[var9], class693.field9835[var11][class695.method3921((int) (this.field4025[class695.method3921(7, var9 - var11)] >>> var12), 255)]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field4025[var10] = this.field4029[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field4026[var6] = class413.method2187(this.field4026[var6], class413.method2187(this.field4025[var6], this.field4037[var6]));
        }
        if (arg0 != 36) {
            this.method1814(null, 107L, 15);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([BJI)V")
    public final void method1814(byte[] arg0, long arg1, int arg2) {
        field4021++;
        if (arg2 >= -10) {
            this.field4026 = null;
        }
        int var5 = 0;
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        int var7 = this.field4022 & 0x7;
        long var8 = arg1;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field4033[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field4033[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg1 > 8L) {
            int var15 = arg0[var5] << var6 & 0xFF | (arg0[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field4028[this.field4030] = (byte) class444.method2376(this.field4028[this.field4030], var15 >>> var7);
            this.field4030++;
            this.field4022 += 8 - var7;
            if (this.field4022 == 512) {
                this.method1813((byte) 36);
                this.field4022 = this.field4030 = 0;
            }
            this.field4028[this.field4030] = (byte) class695.method3921(var15 << 8 - var7, 255);
            this.field4022 += var7;
            arg1 -= 8L;
            var5++;
        }
        int var12;
        if (arg1 > 0L) {
            var12 = arg0[var5] << var6 & 0xFF;
            this.field4028[this.field4030] = (byte) class444.method2376(this.field4028[this.field4030], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if ((long) var7 + arg1 < 8L) {
            this.field4022 = (int) ((long) this.field4022 + arg1);
            return;
        }
        this.field4022 += 8 - var7;
        long var13 = arg1 - (long) (8 - var7);
        this.field4030++;
        if (this.field4022 == 512) {
            this.method1813((byte) 36);
            this.field4022 = this.field4030 = 0;
        }
        this.field4028[this.field4030] = (byte) class695.method3921(var12 << 8 - var7, 255);
        this.field4022 += (int) var13;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public static void method1815(int arg0) {
        field4031 = null;
        if (arg0 > -17) {
            field4031 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([BII)V")
    public final void method1816(byte[] arg0, int arg1, int arg2) {
        this.field4028[this.field4030] = (byte) class444.method2376(this.field4028[this.field4030], 0x80 >>> class695.method3921(7, this.field4022));
        field4034++;
        this.field4030++;
        if (this.field4030 > 32) {
            while (true) {
                if (this.field4030 >= 64) {
                    this.method1813((byte) 36);
                    this.field4030 = 0;
                    break;
                }
                this.field4028[this.field4030++] = 0;
            }
        }
        while (this.field4030 < 32) {
            this.field4028[this.field4030++] = 0;
        }
        class293.method1645(this.field4033, 0, this.field4028, 32, 32);
        this.method1813((byte) 36);
        int var4 = 0;
        int var5 = arg1;
        while (var4 < 8) {
            long var6 = this.field4026[var4];
            arg0[var5] = (byte) ((int) (var6 >>> 56));
            arg0[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg0[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg0[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg0[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg0[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg0[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg0[var5 + 7] = (byte) ((int) var6);
            var5 += 8;
            var4++;
        }
        if (arg2 != 256) {
            this.field4037 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != -1) {
            field4023 = -61;
        }
        field4027++;
        if (arg7 < 0 || arg5 < 0 || arg7 >= class431.field5395 - 1 || arg5 >= class452.field5802 - 1) {
            return;
        }
        if (class270.field3423 == null) {
            return;
        }
        if (arg3 == 0) {
            class339 var8 = (class339) class312.method1803(arg4, arg7, arg5);
            class339 var9 = (class339) class193.method1163(arg4, arg7, arg5);
            if (var8 != null && arg1 != 2) {
                if (var8 instanceof class451) {
                    ((class451) var8).field5779.method3124(arg2, arg0 + 2912);
                } else {
                    class590.method3246(arg3, arg2, arg6, (byte) 68, arg7, arg5, arg1, arg4, var8.method65((byte) 127));
                }
            }
            if (var9 != null) {
                if (!(var9 instanceof class451)) {
                    class590.method3246(arg3, arg2, arg6, (byte) 68, arg7, arg5, arg1, arg4, var9.method65((byte) 127));
                    return;
                }
                ((class451) var9).field5779.method3124(arg2, arg0 + 2912);
                return;
            }
            return;
        }
        if (arg3 != 1) {
            if (arg3 == 2) {
                class339 var11 = (class339) class700.method3933(arg4, arg7, arg5, field4038 == null ? (field4038 = method1819("vda")) : field4038);
                if (var11 == null) {
                    return;
                }
                if (arg1 == 11) {
                    arg1 = 10;
                }
                if (!(var11 instanceof class9)) {
                    class590.method3246(arg3, arg2, arg6, (byte) 68, arg7, arg5, arg1, arg4, var11.method65((byte) 127));
                    return;
                }
                ((class9) var11).field176.method3124(arg2, 2911);
            } else if (arg3 == 3) {
                class339 var10 = (class339) class279.method1586(arg4, arg7, arg5);
                if (var10 != null) {
                    if (!(var10 instanceof class135)) {
                        class590.method3246(arg3, arg2, arg6, (byte) 68, arg7, arg5, arg1, arg4, var10.method65((byte) 127));
                        return;
                    }
                    ((class135) var10).field1747.method3124(arg2, 2911);
                    return;
                }
            }
            return;
        }
        class339 var12 = (class339) class480.method2615(arg4, arg7, arg5);
        if (var12 == null) {
            return;
        }
        if (!(var12 instanceof class308)) {
            int var13 = var12.method65((byte) 127);
            if (arg1 != 4 && arg1 != 5) {
                if (arg1 == 6) {
                    class590.method3246(arg3, arg2, arg6 + 4, (byte) 68, arg7, arg5, 4, arg4, var13);
                } else if (arg1 == 7) {
                    class590.method3246(arg3, arg2, (arg6 + 2 & 0x3) + 4, (byte) 68, arg7, arg5, 4, arg4, var13);
                    return;
                } else if (arg1 == 8) {
                    class590.method3246(arg3, arg2, arg6 + 4, (byte) 68, arg7, arg5, 4, arg4, var13);
                    class590.method3246(arg3, arg2, (arg6 + 2 & 0x3) + 4, (byte) 68, arg7, arg5, 4, arg4, var13);
                    return;
                }
                return;
            }
            class590.method3246(arg3, arg2, arg6, (byte) 68, arg7, arg5, 4, arg4, var13);
            return;
        }
        ((class308) var12).field3930.method3124(arg2, 2911);
        return;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILjava/lang/String;Lrj;ZZ)V")
    public static final void method1818(int arg0, String arg1, class648 arg2, boolean arg3, boolean arg4) {
        field4035++;
        if (arg4) {
            if (class648.field9143.startsWith("win") && arg2.field9151) {
                String var5 = null;
                if (class422.field5308 != null) {
                    var5 = class422.field5308.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class264 var6 = class442.method2368(-89, arg1, arg2, 0);
                    class523.field7117 = arg2;
                    class168.field2204 = arg1;
                    class581.field8129 = var6;
                    return;
                }
            }
            if (class648.field9143.startsWith("mac")) {
                String var7 = null;
                if (class422.field5308 != null) {
                    var7 = class422.field5308.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg3) {
                    class442.method2368(-31, arg1, arg2, 1);
                    return;
                }
            }
            class442.method2368(126, arg1, arg2, 2);
        } else {
            class442.method2368(100, arg1, arg2, 3);
        }
        if (arg0 <= 65) {
            method1815(110);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1819(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

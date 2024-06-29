import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class161 extends class267 {

    @OriginalMember(owner = "client!l", name = "E", descriptor = "Lrh;")
    public class46 field2509 = new class46();

    @OriginalMember(owner = "client!l", name = "F", descriptor = "Lde;")
    public class109 field2510 = new class109();

    @OriginalMember(owner = "client!l", name = "D", descriptor = "Ljg;")
    private class168 field2508;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2504 = "flash3:";

    @OriginalMember(owner = "client!l", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2506 = "Members object";

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Z")
    public static boolean field2500 = false;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([III)V")
    public final void method712(int[] arg0, int arg1, int arg2) {
        field2499++;
        this.field2510.method712(arg0, arg1, arg2);
        for (class274 var4 = (class274) this.field2509.method350(8240); var4 != null; var4 = (class274) this.field2509.method353((byte) -123)) {
            if (!this.field2508.method1182(-16527, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field4377) {
                        this.method1108(var6, arg0, var5, var6 + var5, var4, false);
                        var4.field4377 -= var5;
                        break;
                    }
                    this.method1108(var6, arg0, var4.field4377, var5 + var6, var4, false);
                    var6 += var4.field4377;
                    var5 -= var4.field4377;
                } while (!this.field2508.method1165(arg0, var5, var4, (byte) -119, var6));
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)V")
    public static final void method1103(int arg0, boolean arg1) {
        field2501++;
        byte var2 = 4;
        byte[][] var3 = class235.field3770;
        int var4 = -101 / ((arg0 - 41) / 42);
        for (int var5 = 0; var5 < var2; var5++) {
            class10.method63(13371);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class75.field1061[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = (var9 & 0x3621D15) >> 24;
                        if (!arg1 || var10 == 0) {
                            int var11 = var9 >> 1 & 0x3;
                            int var12 = var9 >> 14 & 0x3FF;
                            int var13 = (var9 & 0x3FFF) >> 3;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class154.field2295.length; var15++) {
                                if (class154.field2295[var15] == var14 && var3[var15] != null) {
                                    class264.method1809((var12 & 0x7) * 8, var3[var15], var5, var10, class290.field4574, (var13 & 0x7) * 8, var7 * 8, 0, var6 * 8, var11, arg1);
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class27.method231(8, (byte) 72, var6 * 8, var7 * 8, 8, var5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()Lof;")
    public final class267 method713() {
        field2497++;
        class274 var1 = (class274) this.field2509.method350(8240);
        if (var1 == null) {
            return null;
        } else if (var1.field4384 == null) {
            return this.method717();
        } else {
            return var1.field4384;
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()Lof;")
    public final class267 method717() {
        field2495++;
        class274 var1;
        do {
            var1 = (class274) this.field2509.method353((byte) -120);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4384 == null);
        return var1.field4384;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B[S[Ljava/lang/String;)V")
    public static final void method1104(byte arg0, short[] arg1, String[] arg2) {
        field2502++;
        class199.method1373(arg2.length - 1, 0, arg1, arg2, -3);
        if (arg0 >= -67) {
            method1105((byte) -105);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static void method1105(byte arg0) {
        field2504 = null;
        int var1 = -49 / ((50 - arg0) / 43);
        field2506 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)I")
    public static final int method1106(byte arg0, int arg1) {
        field2494++;
        int var2 = 0;
        int var3 = -16 / (-arg0 / 36);
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BILoh;)V")
    private final void method1107(byte arg0, int arg1, class274 arg2) {
        field2496++;
        if ((this.field2508.field2640[arg2.field4375] & 0x4) != 0 && arg2.field4376 < 0) {
            int var4 = this.field2508.field2641[arg2.field4375] / class290.field4582;
            int var5 = (var4 + 1048575 - arg2.field4368) / var4;
            arg2.field4368 = arg2.field4368 + (arg1 * var4) & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field2508.field2643[arg2.field4375] == 0) {
                    arg2.field4384 = class255.method1725(arg2.field4371, arg2.field4384.method1750(), arg2.field4384.method1720(), arg2.field4384.method1727());
                } else {
                    arg2.field4384 = class255.method1725(arg2.field4371, arg2.field4384.method1750(), 0, arg2.field4384.method1727());
                    this.field2508.method1172(arg2, (byte) 125, arg2.field4366.field4572[arg2.field4381] < 0);
                }
                if (arg2.field4366.field4572[arg2.field4381] < 0) {
                    arg2.field4384.method1744(-1);
                }
                arg1 = arg2.field4368 / var4;
            }
        }
        int var6 = -76 % ((arg0 - 80) / 39);
        arg2.field4384.method707(arg1);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[IIILoh;Z)V")
    private final void method1108(int arg0, int[] arg1, int arg2, int arg3, class274 arg4, boolean arg5) {
        field2503++;
        if ((this.field2508.field2640[arg4.field4375] & 0x4) != 0 && arg4.field4376 < 0) {
            int var7 = this.field2508.field2641[arg4.field4375] / class290.field4582;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field4368) / var7;
                if (var8 > arg2) {
                    arg4.field4368 += arg2 * var7;
                    break;
                }
                arg2 -= var8;
                arg4.field4384.method712(arg1, arg0, var8);
                arg0 += var8;
                class255 var9 = arg4.field4384;
                int var10 = class290.field4582 / 100;
                arg4.field4368 += var7 * var8 - 1048576;
                int var11 = 262144 / var7;
                if (var10 > var11) {
                    var10 = var11;
                }
                if (this.field2508.field2643[arg4.field4375] == 0) {
                    arg4.field4384 = class255.method1725(arg4.field4371, var9.method1750(), var9.method1720(), var9.method1727());
                } else {
                    arg4.field4384 = class255.method1725(arg4.field4371, var9.method1750(), 0, var9.method1727());
                    this.field2508.method1172(arg4, (byte) 126, arg4.field4366.field4572[arg4.field4381] < 0);
                    arg4.field4384.method1734(var10, var9.method1720());
                }
                if (arg4.field4366.field4572[arg4.field4381] < 0) {
                    arg4.field4384.method1744(-1);
                }
                var9.method1731(var10);
                var9.method712(arg1, arg0, arg3 - arg0);
                if (var9.method1751()) {
                    this.field2510.method709(var9);
                }
            }
        }
        arg4.field4384.method712(arg1, arg0, arg2);
        if (arg5) {
            field2506 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ldl;IBI)[Lhc;")
    public static final class229[] method1109(class123 arg0, int arg1, byte arg2, int arg3) {
        field2505++;
        if (class214.method1445((byte) 97, arg0, arg1, arg3)) {
            if (arg2 != 61) {
                field2506 = null;
            }
            return class62.method431(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
    public final void method707(int arg0) {
        field2498++;
        this.field2510.method707(arg0);
        for (class274 var2 = (class274) this.field2509.method350(8240); var2 != null; var2 = (class274) this.field2509.method353((byte) -117)) {
            if (!this.field2508.method1182(-16527, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field4377) {
                        this.method1107((byte) 126, var3, var2);
                        var2.field4377 -= var3;
                        break;
                    }
                    this.method1107((byte) 12, var2.field4377, var2);
                    var3 -= var2.field4377;
                } while (!this.field2508.method1165((int[]) null, var3, var2, (byte) -117, 0));
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
    public final int method710() {
        field2507++;
        return 0;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljg;)V")
    public class161(class168 arg0) {
        this.field2508 = arg0;
    }
}

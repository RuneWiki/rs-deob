import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class759 {

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "Ljava/lang/String;")
    private String field10470 = "null";

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "Lbu;")
    public static class21 field10476 = new class21(82, -2);

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "Lsaa;")
    public static class345 field10480 = new class345(2, 2);

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "Z")
    public static boolean field10481 = false;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "C")
    public char field10467;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "C")
    public char field10473;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field10464;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field10466;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field10468;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field10469;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field10471;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    private int field10472;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field10474;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public static int field10475;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public static int field10477;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    private int field10478;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
    public static int field10479;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "Ljo;")
    private class353 field10463;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "Ljo;")
    public class353 field10465;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "[I")
    public static int[] field10482;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)Z", line = 4)
    public final boolean method4215(int arg0, int arg1) {
        field10471++;
        if (arg0 != -2) {
            return false;
        } else if (this.field10465 == null) {
            return false;
        } else {
            if (this.field10463 == null) {
                this.method4220(arg0 ^ 0xFFFFB6B8);
            }
            class489 var3 = (class489) this.field10463.method2242((long) arg1, arg0 + 1);
            return var3 != null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZII)Z", line = 31)
    public static final boolean method4216(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method4216(false, -3, 6);
        }
        field10469++;
        return (class690.method3901((byte) 8, arg2, arg1) | class371.method2310(arg1, arg2, true) | class618.method3572(arg2, arg1, (byte) 121)) & class55.method387(arg1, arg2, (byte) -108);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lso;Z)V", line = 42)
    public final void method4217(class494 arg0, boolean arg1) {
        if (arg1) {
            this.field10470 = null;
        }
        while (true) {
            int var3 = arg0.method2964((byte) 53);
            if (var3 == 0) {
                field10468++;
                return;
            }
            this.method4225(-5, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)I", line = 64)
    public final int method4218(int arg0, int arg1) {
        field10466++;
        if (this.field10465 == null) {
            return this.field10478;
        }
        class489 var3 = (class489) this.field10465.method2242((long) arg1, arg0 ^ 0x1);
        if (arg0 != -2) {
            field10476 = null;
        }
        return var3 == null ? this.field10478 : var3.field6926;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V", line = 85)
    public static void method4219(byte arg0) {
        field10482 = null;
        field10480 = null;
        if (arg0 > -101) {
            field10480 = null;
        }
        field10476 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 102)
    private final void method4220(int arg0) {
        this.field10463 = new class353(this.field10465.method2252(-1));
        field10479++;
        for (class489 var2 = (class489) this.field10465.method2243((byte) 100); var2 != null; var2 = (class489) this.field10465.method2248(-15690)) {
            class489 var3 = new class489((int) var2.field8133);
            this.field10463.method2241(-83, (long) var2.field6926, var3);
        }
        if (arg0 != 18758) {
            this.field10463 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(II)Ljava/lang/String;", line = 126)
    public final String method4221(int arg0, int arg1) {
        int var3 = -27 % ((arg1 - 39) / 35);
        field10474++;
        if (this.field10465 == null) {
            return this.field10470;
        } else {
            class68 var4 = (class68) this.field10465.method2242((long) arg0, -1);
            return var4 == null ? this.field10470 : var4.field825;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 146)
    public final boolean method4222(String arg0, int arg1) {
        field10464++;
        if (this.field10465 == null) {
            return false;
        }
        if (this.field10463 == null) {
            this.method4224(114);
        }
        for (class67 var3 = (class67) this.field10463.method2242(class771.method4251(arg0, 1825824517), -1); var3 != null; var3 = (class67) this.field10463.method2250(true)) {
            if (var3.field821.equals(arg0)) {
                return true;
            }
        }
        if (arg1 < 77) {
            this.field10463 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lr;III[Z)Z", line = 177)
    public static final boolean method4223(class194 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class774.field10642 != class208.field3219) {
            int var6 = class411.field5572[arg1].method1918(arg2, (byte) 125, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class294 var8 = class411.field5572[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1918(arg2, (byte) 126, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1905(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1911(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V", line = 220)
    private final void method4224(int arg0) {
        this.field10463 = new class353(this.field10465.method2252(-1));
        field10475++;
        for (class68 var2 = (class68) this.field10465.method2243((byte) 100); var2 != null; var2 = (class68) this.field10465.method2248(-15690)) {
            class67 var3 = new class67(var2.field825, (int) var2.field8133);
            this.field10463.method2241(-108, class771.method4251(var2.field825, 1825824517), var3);
        }
        if (arg0 < 109) {
            method4223(null, -73, -32, -109, null);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILso;I)V", line = 243)
    private final void method4225(int arg0, class494 arg1, int arg2) {
        if (arg0 != -5) {
            return;
        }
        field10477++;
        if (arg2 == 1) {
            this.field10473 = class583.method3412(arg1.method2943((byte) 16), (byte) -126);
        } else if (arg2 == 2) {
            this.field10467 = class583.method3412(arg1.method2943((byte) 16), (byte) 109);
        } else if (arg2 == 3) {
            this.field10470 = arg1.method2996(113);
        } else if (arg2 == 4) {
            this.field10478 = arg1.method2976(-127);
        } else if (arg2 == 5 || arg2 == 6) {
            this.field10472 = arg1.method2998(true);
            this.field10465 = new class353(class433.method2595(this.field10472, (byte) -82));
            for (int var4 = 0; var4 < this.field10472; var4++) {
                int var5 = arg1.method2976(-127);
                class577 var6;
                if (arg2 == 5) {
                    var6 = new class68(arg1.method2996(arg0 ^ 0xFFFFFF95));
                } else {
                    var6 = new class489(arg1.method2976(arg0 ^ 0x78));
                }
                this.field10465.method2241(-108, (long) var5, var6);
            }
        }
    }
}

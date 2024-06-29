import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class420 {

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "Lrda;")
    private class620 field5810 = new class620();

    @OriginalMember(owner = "client!jea", name = "m", descriptor = "I")
    private int field5814;

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "I")
    private int field5805;

    @OriginalMember(owner = "client!jea", name = "t", descriptor = "Ljw;")
    private class520 field5821;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "[S")
    private static short[] field5803 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "Z")
    public static boolean field5806 = false;

    @OriginalMember(owner = "client!jea", name = "p", descriptor = "[S")
    private static short[] field5817 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!jea", name = "o", descriptor = "[S")
    private static short[] field5816 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!jea", name = "k", descriptor = "[[S")
    public static short[][] field5812 = new short[][] { field5803, field5817, field5816 };

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!jea", name = "j", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!jea", name = "l", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!jea", name = "n", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!jea", name = "q", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!jea", name = "r", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!jea", name = "s", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!jea", name = "u", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!jea", name = "v", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)V", line = 3)
    public final void method2404(int arg0, int arg1) {
        field5811++;
        if (arg0 != 12764) {
            field5816 = null;
        }
        if (class68.field1033 == null) {
            return;
        }
        for (class553 var3 = (class553) this.field5810.method3390((byte) 78); var3 != null; var3 = (class553) this.field5810.method3401(-10265)) {
            if (var3.method118(2396)) {
                if (var3.method117(6390) == null) {
                    var3.method2797(-99);
                    var3.method131(arg0 - 12644);
                    this.field5805 += var3.field7349;
                }
            } else if ((long) arg1 < ++var3.field207) {
                class553 var4 = class68.field1033.method1819(var3, arg0 - 12890);
                this.field5821.method2911(var3.field6724, var4, (byte) -28);
                class290.method1791(121, var3, var4);
                var3.method2797(arg0 ^ 0x31B6);
                var3.method131(124);
            }
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)V", line = 52)
    public static void method2405(int arg0) {
        if (arg0 == 1) {
            field5816 = null;
            field5812 = null;
            field5817 = null;
            field5803 = null;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 65)
    public static final boolean method2406(int arg0, String arg1) {
        if (arg0 == 16036) {
            field5819++;
            return class288.method1784(10, arg1, 111, true);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILjava/lang/Object;Lhg;)V", line = 76)
    public final void method2407(int arg0, Object arg1, class648 arg2) {
        this.method2412(arg0, arg2, (byte) 44, arg1);
        field5809++;
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)V", line = 85)
    public final void method2408(int arg0) {
        field5802++;
        for (class553 var2 = (class553) this.field5810.method3390((byte) 106); var2 != null; var2 = (class553) this.field5810.method3401(-10265)) {
            if (var2.method118(arg0 ^ 0x95D)) {
                var2.method2797(29);
                var2.method131(123);
                this.field5805 += var2.field7349;
            }
        }
        if (arg0 != 1) {
            field5817 = null;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lvs;Z)V", line = 111)
    private final void method2409(class553 arg0, boolean arg1) {
        if (!arg1) {
            this.field5821 = null;
        }
        field5822++;
        if (arg0 != null) {
            arg0.method2797(113);
            arg0.method131(127);
            this.field5805 += arg0.field7349;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Z)V", line = 130)
    public final void method2410(boolean arg0) {
        this.field5810.method3398(false);
        field5807++;
        this.field5821.method2916((byte) 92);
        this.field5805 = this.field5814;
        if (!arg0) {
            this.field5805 = 104;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIIZI)Lvf;", line = 144)
    public static final class140 method2411(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field5815++;
        class140 var5 = new class140();
        var5.field2256 = arg0;
        if (arg2 != 0) {
            method2411(8, 27, 64, true, -76);
        }
        var5.field2253 = arg4;
        class264.field3667.method2911((long) arg1, var5, (byte) -28);
        class94.method740(arg0, false);
        class625 var6 = class153.method1078(65535, arg1);
        if (var6 != null) {
            class463.method2624(false, var6);
        }
        if (class436.field5966 != null) {
            class463.method2624(false, class436.field5966);
            class436.field5966 = null;
        }
        class568.method3125(false);
        if (var6 != null) {
            class209.method1340(var6, !arg3, -1);
        }
        if (!arg3) {
            class544.method3015(arg0);
        }
        if (!arg3 && class251.field3463 != -1) {
            class294.method1810(-81, 1, class251.field3463);
        }
        return var5;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILhg;BLjava/lang/Object;)V", line = 188)
    private final void method2412(int arg0, class648 arg1, byte arg2, Object arg3) {
        field5818++;
        if (this.field5814 < arg0) {
            throw new IllegalStateException("s>cs");
        }
        if (arg2 != 44) {
            this.method2416((byte) -107, null);
        }
        this.method2416((byte) 82, arg1);
        this.field5805 -= arg0;
        while (this.field5805 < 0) {
            class553 var6 = (class553) this.field5810.method3392((byte) 51);
            this.method2409(var6, true);
        }
        class536 var5 = new class536(arg1, arg3, arg0);
        this.field5821.method2911(arg1.method603(arg2 ^ 0xFFFFD569), var5, (byte) -28);
        this.field5810.method3396(var5, -1);
        var5.field207 = 0L;
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(Z)I", line = 220)
    public final int method2413(boolean arg0) {
        field5823++;
        if (arg0) {
            this.method2416((byte) -68, null);
        }
        return this.field5814;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILhi;)I", line = 245)
    public static final int method2414(int arg0, class193 arg1) {
        field5804++;
        if (class88.field1335 == arg1) {
            return 6407;
        } else if (class5.field100 == arg1) {
            return 6408;
        } else if (class616.field8164 == arg1) {
            return 6406;
        } else if (class390.field5155 == arg1) {
            return 6409;
        } else if (class98.field1488 == arg1) {
            return 6410;
        } else if (class199.field2887 == arg1) {
            return 6145;
        } else {
            if (arg0 != 144) {
                method2406(77, null);
            }
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)I", line = 283)
    public final int method2415(int arg0) {
        if (arg0 <= 0) {
            this.method2415(-62);
        }
        field5820++;
        return this.field5805;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(BLhg;)V", line = 295)
    private final void method2416(byte arg0, class648 arg1) {
        field5813++;
        long var3 = arg1.method603(-10939);
        for (class553 var5 = (class553) this.field5821.method2918(var3, (byte) -128); var5 != null; var5 = (class553) this.field5821.method2919((byte) 90)) {
            if (var5.field7348.method602((byte) 106, arg1)) {
                this.method2409(var5, true);
                break;
            }
        }
        if (arg0 < 67) {
            this.field5805 = -61;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lhg;I)Ljava/lang/Object;", line = 328)
    public final Object method2417(class648 arg0, int arg1) {
        field5808++;
        long var3 = arg0.method603(-10939);
        for (class553 var5 = (class553) this.field5821.method2918(var3, (byte) 33); var5 != null; var5 = (class553) this.field5821.method2919((byte) 60)) {
            if (var5.field7348.method602((byte) 116, arg0)) {
                Object var7 = var5.method117(6390);
                if (var7 != null) {
                    if (var5.method118(2396)) {
                        class536 var8 = new class536(arg0, var7, var5.field7349);
                        this.field5821.method2911(var5.field6724, var8, (byte) -28);
                        this.field5810.method3396(var8, -1);
                        var8.field207 = 0L;
                        var5.method2797(-122);
                        var5.method131(121);
                    } else {
                        this.field5810.method3396(var5, -1);
                        var5.field207 = 0L;
                    }
                    return var7;
                }
                var5.method2797(-97);
                var5.method131(127);
                this.field5805 += var5.field7349;
            }
        }
        int var6 = 36 % ((arg1 + 41) / 45);
        return null;
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(I)V", line = 386)
    public class420(int arg0) {
        this.field5814 = arg0;
        this.field5805 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field5821 = new class520(var2);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class344 {

    @OriginalMember(owner = "client!on", name = "d", descriptor = "Ls;")
    private class196 field5320 = new class196(256);

    @OriginalMember(owner = "client!on", name = "s", descriptor = "Ls;")
    private class196 field5335 = new class196(256);

    @OriginalMember(owner = "client!on", name = "o", descriptor = "Lph;")
    private class361 field5331;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "Lph;")
    private class361 field5318;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "[I")
    public static int[] field5322 = new int[50];

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field5332 = 0;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "[I")
    public static int[] field5333 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "[Lgd;")
    public static class180[] field5330;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I[IBI)Ld;", line = 6)
    private final class43 method2403(int arg0, int[] arg1, byte arg2, int arg3) {
        if (arg2 != -79) {
            this.field5320 = (class196) null;
        }
        int var5 = arg0 ^ (arg3 << 4 & 0xFFFE | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        field5324++;
        class43 var9 = (class43) this.field5335.method1405(var7, false);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class327 var10 = (class327) this.field5320.method1405(var7, false);
            if (var10 == null) {
                var10 = class327.method2264(this.field5318, arg3, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field5320.method1400(var7, 124, var10);
            }
            class43 var11 = var10.method2265(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method876(8);
                this.field5335.method1400(var7, arg2 + 185, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I[IB)Ld;", line = 54)
    public final class43 method2404(int arg0, int[] arg1, byte arg2) {
        if (arg2 < 38) {
            return (class43) null;
        }
        field5325++;
        if (this.field5318.method2526((byte) 105) == 1) {
            return this.method2403(arg0, arg1, (byte) -79, 0);
        } else if (this.field5318.method2539(true, arg0) == 1) {
            return this.method2403(0, arg1, (byte) -79, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)V", line = 74)
    public static final void method2405(int arg0, int arg1) {
        field5317++;
        class28.field391.method464(arg1 - 27602, arg0);
        class291.field4405.method464(arg1 - 27602, arg0);
        class3.field105.method464(3398, arg0);
        if (arg1 == 31000) {
            class125.field1820.method464(3398, arg0);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIBLqm;)V", line = 90)
    public static final void method2406(int arg0, int arg1, byte arg2, class228 arg3) {
        int var4 = 116 % ((arg2 + 16) / 63);
        field5329++;
        if (arg3.field5190 == arg1 && arg1 != -1) {
            class248 var5 = class119.method893(arg1, (byte) -41);
            int var6 = var5.field3691;
            if (var6 == 1) {
                arg3.field5132 = 0;
                arg3.field5177 = arg0;
                arg3.field5194 = 0;
                arg3.field5097 = 0;
                arg3.field5146 = 1;
                class361.method2512(-29521, arg3.field5137, class1.field55 == arg3, arg3.field5132, var5, arg3.field5165);
            }
            if (var6 == 2) {
                arg3.field5097 = 0;
            }
        } else if (arg1 == -1 || arg3.field5190 == -1 || class119.method893(arg1, (byte) -41).field3666 >= class119.method893(arg3.field5190, (byte) -41).field3666) {
            arg3.field5177 = arg0;
            arg3.field5190 = arg1;
            arg3.field5122 = arg3.field5113;
            arg3.field5194 = 0;
            arg3.field5132 = 0;
            arg3.field5097 = 0;
            arg3.field5146 = 1;
            if (arg3.field5190 != -1) {
                class361.method2512(-29521, arg3.field5137, class1.field55 == arg3, arg3.field5132, class119.method893(arg3.field5190, (byte) -41), arg3.field5165);
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I[[I)V", line = 139)
    public static final void method2407(int arg0, int[][] arg1) {
        class274.field4158 = arg1;
        int var2 = 22 / ((23 - arg0) / 62);
        field5334++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II[II)Ld;", line = 151)
    private final class43 method2408(int arg0, int arg1, int[] arg2, int arg3) {
        field5327++;
        int var5 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFF5);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        if (arg3 != 0) {
            this.field5320 = (class196) null;
        }
        class43 var9 = (class43) this.field5335.method1405(var7, false);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class188 var10 = class188.method1302(this.field5331, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            class43 var11 = var10.method1301();
            this.field5335.method1400(var7, 123, var11);
            if (arg2 != null) {
                arg2[0] -= var11.field614.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(II)I", line = 191)
    public static final int method2409(int arg0, int arg1) {
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        if (arg1 != -24724) {
            return 84;
        }
        field5321++;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I[IB)Ld;", line = 216)
    public final class43 method2410(int arg0, int[] arg1, byte arg2) {
        if (arg2 != -67) {
            method2411(true, 122, 83);
        }
        field5328++;
        if (this.field5331.method2526((byte) 97) == 1) {
            return this.method2408(arg0, 0, arg1, 0);
        } else if (this.field5331.method2539(true, arg0) == 1) {
            return this.method2408(0, arg0, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZII)V", line = 236)
    public static final void method2411(boolean arg0, int arg1, int arg2) {
        field5319++;
        class362.field5742 = class105.field1497 + class105.field1503 - arg1 - 1;
        if (arg0) {
            field5333 = (int[]) null;
        }
        class299.field4473 = arg2 - class105.field1498;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 255)
    public static void method2412(int arg0) {
        field5330 = null;
        field5333 = null;
        if (arg0 != -1) {
            method2405(-8, 81);
        }
        field5322 = null;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lph;Lph;)V", line = 293)
    public class344(class361 arg0, class361 arg1) {
        this.field5331 = arg0;
        this.field5318 = arg1;
    }
}

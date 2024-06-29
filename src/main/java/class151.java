import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class151 extends class283 {

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "Lbd;")
    public class37 field2355 = new class37();

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "Lpb;")
    public class393 field2366 = new class393();

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "Luj;")
    private class214 field2364;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "Lbd;")
    public static class37 field2360 = new class37();

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
    public static int field2365 = 0;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "Lnd;")
    public static class322 field2358;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()Lkp;", line = 3)
    public final class283 method1064() {
        field2361++;
        class345 var1;
        do {
            var1 = (class345) this.field2355.method247((byte) 106);
            if (var1 == null) {
                return null;
            }
        } while (var1.field5313 == null);
        return var1.field5313;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V", line = 24)
    public final void method1065(int arg0) {
        field2362++;
        this.field2366.method1065(arg0);
        for (class345 var2 = (class345) this.field2355.method253((byte) -6); var2 != null; var2 = (class345) this.field2355.method247((byte) 69)) {
            if (!this.field2364.method1518(var2, (byte) 85)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field5306) {
                        this.method1070(var2, var3, -1);
                        var2.field5306 -= var3;
                        break;
                    }
                    this.method1070(var2, var2.field5306, -1);
                    var3 -= var2.field5306;
                } while (!this.field2364.method1532((int[]) null, var2, var3, 28224, 0));
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Lkp;", line = 62)
    public final class283 method1066() {
        field2356++;
        class345 var1 = (class345) this.field2355.method253((byte) -6);
        if (var1 == null) {
            return null;
        } else if (var1.field5313 == null) {
            return this.method1064();
        } else {
            return var1.field5313;
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "()I", line = 79)
    public final int method1067() {
        field2353++;
        return 0;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V", line = 87)
    public static void method1068(byte arg0) {
        if (arg0 <= 106) {
            field2360 = null;
        }
        field2358 = null;
        field2360 = null;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V", line = 98)
    public static final void method1069(byte arg0) {
        field2363++;
        class52 var1 = class30.field373;
        synchronized (class30.field373) {
            class30.field373.method335((byte) 95);
            if (arg0 <= 90) {
                method1068((byte) 104);
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lv;II)V", line = 112)
    private final void method1070(class345 arg0, int arg1, int arg2) {
        field2354++;
        if (~(this.field2364.field3430[arg0.field5326] & 0x4) != arg2 && arg0.field5310 < 0) {
            int var4 = this.field2364.field3434[arg0.field5326] / class413.field6106;
            int var5 = (var4 + 1048575 - arg0.field5301) / var4;
            arg0.field5301 = arg0.field5301 + (arg1 * var4) & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field2364.field3463[arg0.field5326] == 0) {
                    arg0.field5313 = class202.method1416(arg0.field5320, arg0.field5313.method1401(), arg0.field5313.method1420(), arg0.field5313.method1434());
                } else {
                    arg0.field5313 = class202.method1416(arg0.field5320, arg0.field5313.method1401(), 0, arg0.field5313.method1434());
                    this.field2364.method1520(arg0, arg0.field5303.field5183[arg0.field5307] < 0, -113);
                }
                if (arg0.field5303.field5183[arg0.field5307] < 0) {
                    arg0.field5313.method1421(-1);
                }
                arg1 = arg0.field5301 / var4;
            }
        }
        arg0.field5313.method1065(arg1);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILv;III[I)V", line = 149)
    private final void method1071(int arg0, class345 arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg2 != 1048575) {
            return;
        }
        if ((this.field2364.field3430[arg1.field5326] & 0x4) != 0 && arg1.field5310 < 0) {
            int var7 = this.field2364.field3434[arg1.field5326] / class413.field6106;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field5301) / var7;
                if (arg4 < var8) {
                    arg1.field5301 += arg4 * var7;
                    break;
                }
                arg1.field5313.method1072(arg5, arg0, var8);
                arg0 += var8;
                arg1.field5301 += var7 * var8 - 1048576;
                arg4 -= var8;
                int var9 = class413.field6106 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class202 var11 = arg1.field5313;
                if (this.field2364.field3463[arg1.field5326] == 0) {
                    arg1.field5313 = class202.method1416(arg1.field5320, var11.method1401(), var11.method1420(), var11.method1434());
                } else {
                    arg1.field5313 = class202.method1416(arg1.field5320, var11.method1401(), 0, var11.method1434());
                    this.field2364.method1520(arg1, arg1.field5303.field5183[arg1.field5307] < 0, arg2 ^ 0xFFF00035);
                    arg1.field5313.method1413(var9, var11.method1420());
                }
                if (arg1.field5303.field5183[arg1.field5307] < 0) {
                    arg1.field5313.method1421(-1);
                }
                var11.method1408(var9);
                var11.method1072(arg5, arg0, arg3 - arg0);
                if (var11.method1426()) {
                    this.field2366.method2482(var11);
                }
            }
        }
        field2357++;
        arg1.field5313.method1072(arg5, arg0, arg4);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([III)V", line = 210)
    public final void method1072(int[] arg0, int arg1, int arg2) {
        field2359++;
        this.field2366.method1072(arg0, arg1, arg2);
        for (class345 var4 = (class345) this.field2355.method253((byte) -6); var4 != null; var4 = (class345) this.field2355.method247((byte) 37)) {
            if (!this.field2364.method1518(var4, (byte) 85)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field5306 >= var6) {
                        this.method1071(var5, var4, 1048575, var5 + var6, var6, arg0);
                        var4.field5306 -= var6;
                        break;
                    }
                    this.method1071(var5, var4, 1048575, var5 + var6, var4.field5306, arg0);
                    var6 -= var4.field5306;
                    var5 += var4.field5306;
                } while (!this.field2364.method1532(arg0, var4, var6, 28224, var5));
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Luj;)V", line = 270)
    public class151(class214 arg0) {
        this.field2364 = arg0;
    }
}

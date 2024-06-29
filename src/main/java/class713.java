import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class713 extends class97 {

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "Lifa;")
    public class450 field10003 = new class450();

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "Ltp;")
    public class560 field10010 = new class560();

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "Lqq;")
    private class502 field10006;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field10000;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field10001;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field10002;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field10004;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field10005;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public static int field10007;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field10008;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    public static int field10009;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
    public static int field10011;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
    public static int field10012;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
    public static int field10013;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "I")
    public static int field10014;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIZ)V")
    public static final void method4036(int arg0, int arg1, boolean arg2) {
        field10012++;
        if (arg1 != -1) {
            field10000 = 77;
        }
        if (arg2) {
            class336 var3 = class512.method3076(class104.field1334, class591.field8030, (byte) 101);
            var3.field4150.method2369(-18090, arg0);
            class578.method3334(4, var3);
        } else {
            class142.method1038(class466.field6516, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static final void method4037(byte arg0) {
        if (class388.field4979 != null) {
            class388.field4979.method1558(-6923);
        }
        if (arg0 > -106) {
            field10000 = 4;
        }
        field10009++;
        if (class95.field1247 != null) {
            class95.field1247.method1558(-6923);
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "()Loia;")
    public final class97 method763() {
        field10002++;
        class156 var1;
        do {
            var1 = (class156) this.field10003.method2726(-122);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1950 == null);
        return var1.field1950;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([IZLqm;III)V")
    private final void method4038(int[] arg0, boolean arg1, class156 arg2, int arg3, int arg4, int arg5) {
        if (arg1) {
            this.method4038(null, true, null, -23, 118, 55);
        }
        if ((this.field10006.field7045[arg2.field1953] & 0x4) != 0 && arg2.field1943 < 0) {
            int var7 = this.field10006.field7035[arg2.field1953] / class478.field6632;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field1941) / var7;
                if (var8 > arg5) {
                    arg2.field1941 += arg5 * var7;
                    break;
                }
                arg2.field1950.method760(arg0, arg3, var8);
                arg5 -= var8;
                arg3 += var8;
                arg2.field1941 += var7 * var8 - 1048576;
                int var9 = class478.field6632 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class80 var11 = arg2.field1950;
                if (this.field10006.field7092[arg2.field1953] == 0) {
                    arg2.field1950 = class80.method725(arg2.field1947, var11.method723(), var11.method731(), var11.method732());
                } else {
                    arg2.field1950 = class80.method725(arg2.field1947, var11.method723(), 0, var11.method732());
                    this.field10006.method3004(arg2, (byte) 45, arg2.field1952.field2862[arg2.field1938] < 0);
                    arg2.field1950.method733(var9, var11.method731());
                }
                if (arg2.field1952.field2862[arg2.field1938] < 0) {
                    arg2.field1950.method747(-1);
                }
                var11.method753(var9);
                var11.method760(arg0, arg3, arg4 - arg3);
                if (var11.method754()) {
                    this.field10010.method3258(var11);
                }
            }
        }
        field10001++;
        arg2.field1950.method760(arg0, arg3, arg5);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lqm;IB)V")
    private final void method4039(class156 arg0, int arg1, byte arg2) {
        field10007++;
        if ((this.field10006.field7045[arg0.field1953] & 0x4) != 0 && arg0.field1943 < 0) {
            int var4 = this.field10006.field7035[arg0.field1953] / class478.field6632;
            int var5 = (var4 + 1048575 - arg0.field1941) / var4;
            arg0.field1941 = arg1 * var4 + arg0.field1941 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field10006.field7092[arg0.field1953] == 0) {
                    arg0.field1950 = class80.method725(arg0.field1947, arg0.field1950.method723(), arg0.field1950.method731(), arg0.field1950.method732());
                } else {
                    arg0.field1950 = class80.method725(arg0.field1947, arg0.field1950.method723(), 0, arg0.field1950.method732());
                    this.field10006.method3004(arg0, (byte) 45, arg0.field1952.field2862[arg0.field1938] < 0);
                }
                if (arg0.field1952.field2862[arg0.field1938] < 0) {
                    arg0.field1950.method747(-1);
                }
                arg1 = arg0.field1941 / var4;
            }
        }
        if (arg2 < -123) {
            arg0.field1950.method751(arg1);
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lqq;)V")
    public class713(class502 arg0) {
        this.field10006 = arg0;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()I")
    public final int method752() {
        field10013++;
        return 0;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public final void method751(int arg0) {
        field10004++;
        this.field10010.method751(arg0);
        for (class156 var2 = (class156) this.field10003.method2725(37); var2 != null; var2 = (class156) this.field10003.method2726(-116)) {
            if (!this.field10006.method2989((byte) 120, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1934) {
                        this.method4039(var2, var3, (byte) -125);
                        var2.field1934 -= var3;
                        break;
                    }
                    this.method4039(var2, var2.field1934, (byte) -126);
                    var3 -= var2.field1934;
                } while (!this.field10006.method3002(-115, var3, 0, null, var2));
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "([III)V")
    public final void method760(int[] arg0, int arg1, int arg2) {
        field10008++;
        this.field10010.method760(arg0, arg1, arg2);
        for (class156 var4 = (class156) this.field10003.method2725(37); var4 != null; var4 = (class156) this.field10003.method2726(-116)) {
            if (!this.field10006.method2989((byte) 34, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field1934) {
                        this.method4038(arg0, false, var4, var6, var5 + var6, var5);
                        var4.field1934 -= var5;
                        break;
                    }
                    this.method4038(arg0, false, var4, var6, var6 + var5, var4.field1934);
                    var6 += var4.field1934;
                    var5 -= var4.field1934;
                } while (!this.field10006.method3002(-26, var5, var6, arg0, var4));
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "()Loia;")
    public final class97 method745() {
        field10011++;
        class156 var1 = (class156) this.field10003.method2725(37);
        if (var1 == null) {
            return null;
        } else if (var1.field1950 == null) {
            return this.method763();
        } else {
            return var1.field1950;
        }
    }
}

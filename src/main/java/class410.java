import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class410 extends class581 {

    @OriginalMember(owner = "client!qba", name = "t", descriptor = "Lro;")
    public class2 field5688 = new class2();

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "Loca;")
    public class266 field5694 = new class266();

    @OriginalMember(owner = "client!qba", name = "x", descriptor = "Lft;")
    private class3 field5692;

    @OriginalMember(owner = "client!qba", name = "m", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!qba", name = "n", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!qba", name = "o", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!qba", name = "p", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!qba", name = "r", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!qba", name = "s", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!qba", name = "u", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!qba", name = "v", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!qba", name = "w", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!qba", name = "y", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!qba", name = "q", descriptor = "Lon;")
    public static class340 field5685;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(II)Z")
    public static final boolean method2392(int arg0, int arg1) {
        field5683++;
        if (arg0 > -23) {
            field5685 = null;
        }
        if (arg1 == 59 || arg1 == 6 || arg1 == 18 || arg1 == 11 || arg1 == 47) {
            return true;
        } else {
            return arg1 == 9 || arg1 == 1002;
        }
    }

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "()I")
    public final int method49() {
        field5693++;
        return 0;
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "()Lgu;")
    public final class581 method33() {
        field5691++;
        class449 var1 = (class449) this.field5688.method21(2);
        if (var1 == null) {
            return null;
        } else if (var1.field6153 == null) {
            return this.method53();
        } else {
            return var1.field6153;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V")
    public static void method2393(byte arg0) {
        field5685 = null;
        if (arg0 != -114) {
            field5685 = null;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "([III)V")
    public final void method26(int[] arg0, int arg1, int arg2) {
        field5682++;
        this.field5694.method26(arg0, arg1, arg2);
        for (class449 var4 = (class449) this.field5688.method21(2); var4 != null; var4 = (class449) this.field5688.method9(-128)) {
            if (!this.field5692.method61(var4, 98)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field6156 >= var6) {
                        this.method2395(var6, var4, (byte) 73, var5 + var6, var5, arg0);
                        var4.field6156 -= var6;
                        break;
                    }
                    this.method2395(var4.field6156, var4, (byte) 95, var5 + var6, var5, arg0);
                    var6 -= var4.field6156;
                    var5 += var4.field6156;
                } while (!this.field5692.method28(var4, arg0, var5, 2, var6));
            }
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
    public final void method60(int arg0) {
        field5690++;
        this.field5694.method60(arg0);
        for (class449 var2 = (class449) this.field5688.method21(2); var2 != null; var2 = (class449) this.field5688.method9(-127)) {
            if (!this.field5692.method61(var2, 93)) {
                int var3 = arg0;
                do {
                    if (var2.field6156 >= var3) {
                        this.method2394((byte) -92, var3, var2);
                        var2.field6156 -= var3;
                        break;
                    }
                    this.method2394((byte) -98, var2.field6156, var2);
                    var3 -= var2.field6156;
                } while (!this.field5692.method28(var2, null, 0, 2, var3));
            }
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(BILlv;)V")
    private final void method2394(byte arg0, int arg1, class449 arg2) {
        if (arg0 > -66) {
            this.method53();
        }
        field5687++;
        if ((this.field5692.field71[arg2.field6157] & 0x4) != 0 && arg2.field6148 < 0) {
            int var4 = this.field5692.field84[arg2.field6157] / class405.field5646;
            int var5 = (var4 + 1048575 - arg2.field6165) / var4;
            arg2.field6165 = arg1 * var4 + arg2.field6165 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field5692.field61[arg2.field6157] == 0) {
                    arg2.field6153 = class527.method2915(arg2.field6147, arg2.field6153.method2934(), arg2.field6153.method2939(), arg2.field6153.method2919());
                } else {
                    arg2.field6153 = class527.method2915(arg2.field6147, arg2.field6153.method2934(), 0, arg2.field6153.method2919());
                    this.field5692.method57(arg2, (byte) -62, arg2.field6166.field10385[arg2.field6151] < 0);
                }
                if (arg2.field6166.field10385[arg2.field6151] < 0) {
                    arg2.field6153.method2927(-1);
                }
                arg1 = arg2.field6165 / var4;
            }
        }
        arg2.field6153.method60(arg1);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILlv;BII[I)V")
    private final void method2395(int arg0, class449 arg1, byte arg2, int arg3, int arg4, int[] arg5) {
        if (arg2 < 33) {
            this.method60(-25);
        }
        field5684++;
        if ((this.field5692.field71[arg1.field6157] & 0x4) != 0 && arg1.field6148 < 0) {
            int var7 = this.field5692.field84[arg1.field6157] / class405.field5646;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field6165) / var7;
                if (var8 > arg0) {
                    arg1.field6165 += arg0 * var7;
                    break;
                }
                arg1.field6153.method26(arg5, arg4, var8);
                arg0 -= var8;
                arg4 += var8;
                arg1.field6165 += var7 * var8 - 1048576;
                int var9 = class405.field5646 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class527 var11 = arg1.field6153;
                if (this.field5692.field61[arg1.field6157] == 0) {
                    arg1.field6153 = class527.method2915(arg1.field6147, var11.method2934(), var11.method2939(), var11.method2919());
                } else {
                    arg1.field6153 = class527.method2915(arg1.field6147, var11.method2934(), 0, var11.method2919());
                    this.field5692.method57(arg1, (byte) 113, arg1.field6166.field10385[arg1.field6151] < 0);
                    arg1.field6153.method2913(var9, var11.method2939());
                }
                if (arg1.field6166.field10385[arg1.field6151] < 0) {
                    arg1.field6153.method2927(-1);
                }
                var11.method2944(var9);
                var11.method26(arg5, arg4, arg3 - arg4);
                if (var11.method2928()) {
                    this.field5694.method1608(var11);
                }
            }
        }
        arg1.field6153.method26(arg5, arg4, arg0);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "()Lgu;")
    public final class581 method53() {
        field5686++;
        class449 var1;
        do {
            var1 = (class449) this.field5688.method9(-127);
            if (var1 == null) {
                return null;
            }
        } while (var1.field6153 == null);
        return var1.field6153;
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lft;)V")
    public class410(class3 arg0) {
        this.field5692 = arg0;
    }
}

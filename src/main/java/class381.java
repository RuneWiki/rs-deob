import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class381 extends class461 {

    @OriginalMember(owner = "client!op", name = "F", descriptor = "Lvf;")
    public class166 field5407 = new class166();

    @OriginalMember(owner = "client!op", name = "H", descriptor = "Lrc;")
    public class107 field5409 = new class107();

    @OriginalMember(owner = "client!op", name = "v", descriptor = "Lfi;")
    private class180 field5398;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "Ljava/lang/String;")
    public static String field5399 = null;

    @OriginalMember(owner = "client!op", name = "B", descriptor = "J")
    public static long field5403 = 0L;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "I")
    public static int field5402 = 0;

    @OriginalMember(owner = "client!op", name = "E", descriptor = "F")
    public static float field5406;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!op", name = "u", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!op", name = "x", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!op", name = "y", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!op", name = "C", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!op", name = "D", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!op", name = "G", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!op", name = "I", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!op", name = "J", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!op", name = "K", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "Ldp;")
    public static class191 field5395;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IBLkb;)V", line = 3)
    private final void method2284(int arg0, byte arg1, class87 arg2) {
        field5412++;
        int var4 = 56 % ((arg1 - 30) / 48);
        if ((this.field5398.field2269[arg2.field1066] & 0x4) != 0 && arg2.field1085 < 0) {
            int var5 = this.field5398.field2279[arg2.field1066] / class345.field4936;
            int var6 = (var5 + 1048575 - arg2.field1090) / var5;
            arg2.field1090 = arg0 * var5 + arg2.field1090 & 0xFFFFF;
            if (var6 <= arg0) {
                if (this.field5398.field2283[arg2.field1066] == 0) {
                    arg2.field1077 = class250.method1525(arg2.field1073, arg2.field1077.method1538(), arg2.field1077.method1550(), arg2.field1077.method1526());
                } else {
                    arg2.field1077 = class250.method1525(arg2.field1073, arg2.field1077.method1538(), 0, arg2.field1077.method1526());
                    this.field5398.method950(arg2, (byte) 126, arg2.field1069.field1761[arg2.field1079] < 0);
                }
                if (arg2.field1069.field1761[arg2.field1079] < 0) {
                    arg2.field1077.method1524(-1);
                }
                arg0 = arg2.field1090 / var5;
            }
        }
        arg2.field1077.method512(arg0);
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "([III)V", line = 44)
    public final void method513(int[] arg0, int arg1, int arg2) {
        field5396++;
        this.field5409.method513(arg0, arg1, arg2);
        for (class87 var4 = (class87) this.field5407.method802((byte) 127); var4 != null; var4 = (class87) this.field5407.method806((byte) 104)) {
            if (!this.field5398.method972((byte) -16, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field1075 >= var5) {
                        this.method2285(arg0, var6, var5, var5 + var6, -1, var4);
                        var4.field1075 -= var5;
                        break;
                    }
                    this.method2285(arg0, var6, var4.field1075, var5 + var6, -1, var4);
                    var5 -= var4.field1075;
                    var6 += var4.field1075;
                } while (!this.field5398.method957(var4, var5, 16384, var6, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "d", descriptor = "()I", line = 83)
    public final int method511() {
        field5401++;
        return 0;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "()Lrk;", line = 92)
    public final class461 method516() {
        field5408++;
        class87 var1 = (class87) this.field5407.method802((byte) 103);
        if (var1 == null) {
            return null;
        } else if (var1.field1077 == null) {
            return this.method517();
        } else {
            return var1.field1077;
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V", line = 125)
    public final void method512(int arg0) {
        field5404++;
        this.field5409.method512(arg0);
        for (class87 var2 = (class87) this.field5407.method802((byte) 118); var2 != null; var2 = (class87) this.field5407.method806((byte) 104)) {
            if (!this.field5398.method972((byte) -16, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field1075 >= var3) {
                        this.method2284(var3, (byte) -112, var2);
                        var2.field1075 -= var3;
                        break;
                    }
                    this.method2284(var2.field1075, (byte) -40, var2);
                    var3 -= var2.field1075;
                } while (!this.field5398.method957(var2, var3, 16384, 0, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "([IIIIILkb;)V", line = 162)
    private final void method2285(int[] arg0, int arg1, int arg2, int arg3, int arg4, class87 arg5) {
        if (arg4 != -1) {
            method2286(92);
        }
        field5397++;
        if ((this.field5398.field2269[arg5.field1066] & 0x4) != 0 && arg5.field1085 < 0) {
            int var7 = this.field5398.field2279[arg5.field1066] / class345.field4936;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field1090) / var7;
                if (arg2 < var8) {
                    arg5.field1090 += arg2 * var7;
                    break;
                }
                arg5.field1077.method513(arg0, arg1, var8);
                arg5.field1090 += var7 * var8 - 1048576;
                arg1 += var8;
                arg2 -= var8;
                int var9 = class345.field4936 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class250 var11 = arg5.field1077;
                if (this.field5398.field2283[arg5.field1066] == 0) {
                    arg5.field1077 = class250.method1525(arg5.field1073, var11.method1538(), var11.method1550(), var11.method1526());
                } else {
                    arg5.field1077 = class250.method1525(arg5.field1073, var11.method1538(), 0, var11.method1526());
                    this.field5398.method950(arg5, (byte) 124, arg5.field1069.field1761[arg5.field1079] < 0);
                    arg5.field1077.method1520(var9, var11.method1550());
                }
                if (arg5.field1069.field1761[arg5.field1079] < 0) {
                    arg5.field1077.method1524(-1);
                }
                var11.method1552(var9);
                var11.method513(arg0, arg1, arg3 - arg1);
                if (var11.method1553()) {
                    this.field5409.method508(var11);
                }
            }
        }
        arg5.field1077.method513(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "()Lrk;", line = 225)
    public final class461 method517() {
        field5405++;
        class87 var1;
        do {
            var1 = (class87) this.field5407.method806((byte) 104);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1077 == null);
        return var1.field1077;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lfi;)V", line = 283)
    public class381(class180 arg0) {
        this.field5398 = arg0;
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V", line = 253)
    public static void method2286(int arg0) {
        field5399 = null;
        field5395 = null;
        if (arg0 <= 41) {
            method2287((byte[]) null, -25);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "([BI)[B", line = 264)
    public static final byte[] method2287(byte[] arg0, int arg1) {
        field5400++;
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class268.method1625(arg0, arg1, var2, 0, arg0.length);
            return var2;
        }
    }
}

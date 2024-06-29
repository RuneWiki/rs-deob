import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class189 extends class273 {

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "Llh;")
    public class58 field2867 = new class58();

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "Lti;")
    public class146 field2871 = new class146();

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "Lre;")
    private class282 field2863;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public static int field2866 = 0;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "[I")
    public static int[] field2864 = new int[2500];

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    public static int field2873 = 0;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "Lnh;")
    public static class305 field2865;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "[I")
    public static int[] field2874;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "[Lbf;")
    public static class108[] field2857;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)Lfl;")
    public static final class85 method1193(int arg0, int arg1) {
        class85 var2 = (class85) class98.field1425.method950((long) arg1, (byte) -45);
        field2861++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 32620) {
            method1195(-71);
        }
        byte[] var3 = class6.field63.method2050(122, 32, arg1);
        class85 var4 = new class85();
        if (var3 != null) {
            var4.method557(new class215(var3), true);
        }
        var4.method552(true);
        class98.field1425.method942((long) arg1, (byte) 13, var4);
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "()Lrg;")
    public final class273 method912() {
        field2872++;
        class70 var1 = (class70) this.field2867.method369((byte) -121);
        if (var1 == null) {
            return null;
        } else if (var1.field1001 == null) {
            return this.method917();
        } else {
            return var1.field1001;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
    public final void method918(int arg0) {
        this.field2871.method918(arg0);
        for (class70 var2 = (class70) this.field2867.method369((byte) -87); var2 != null; var2 = (class70) this.field2867.method362(false)) {
            if (!this.field2863.method1835(var2, 114)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1006) {
                        this.method1196(var3, (byte) -47, var2);
                        var2.field1006 -= var3;
                        break;
                    }
                    this.method1196(var2.field1006, (byte) -47, var2);
                    var3 -= var2.field1006;
                } while (!this.field2863.method1860(var3, var2, (int[]) null, 0, (byte) -63));
            }
        }
        field2858++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIILql;[II)V")
    private final void method1194(int arg0, int arg1, int arg2, class70 arg3, int[] arg4, int arg5) {
        if (arg1 <= 100) {
            this.method1194(-103, -61, 84, (class70) null, (int[]) null, 103);
        }
        field2869++;
        if ((this.field2863.field4499[arg3.field1010] & 0x4) != 0 && arg3.field1011 < 0) {
            int var7 = this.field2863.field4501[arg3.field1010] / class175.field2476;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field1012) / var7;
                if (arg0 < var8) {
                    arg3.field1012 += arg0 * var7;
                    break;
                }
                arg3.field1001.method914(arg4, arg5, var8);
                arg0 -= var8;
                arg3.field1012 += var7 * var8 - 1048576;
                int var9 = class175.field2476 / 100;
                arg5 += var8;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class287 var11 = arg3.field1001;
                if (this.field2863.field4538[arg3.field1010] == 0) {
                    arg3.field1001 = class287.method1901(arg3.field1007, var11.method1886(), var11.method1904(), var11.method1900());
                } else {
                    arg3.field1001 = class287.method1901(arg3.field1007, var11.method1886(), 0, var11.method1900());
                    this.field2863.method1841((byte) 127, arg3.field1000.field4173[arg3.field995] < 0, arg3);
                    arg3.field1001.method1908(var9, var11.method1904());
                }
                if (arg3.field1000.field4173[arg3.field995] < 0) {
                    arg3.field1001.method1914(-1);
                }
                var11.method1913(var9);
                var11.method914(arg4, arg5, arg2 - arg5);
                if (var11.method1907()) {
                    this.field2871.method916(var11);
                }
            }
        }
        arg3.field1001.method914(arg4, arg5, arg0);
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V")
    public static void method1195(int arg0) {
        field2874 = null;
        field2857 = null;
        field2864 = null;
        field2865 = null;
        if (arg0 >= -81) {
            field2865 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBLql;)V")
    private final void method1196(int arg0, byte arg1, class70 arg2) {
        field2870++;
        if (arg1 != -47) {
            this.method914((int[]) null, -111, 103);
        }
        if ((this.field2863.field4499[arg2.field1010] & 0x4) != 0 && arg2.field1011 < 0) {
            int var4 = this.field2863.field4501[arg2.field1010] / class175.field2476;
            int var5 = (var4 + 1048575 - arg2.field1012) / var4;
            arg2.field1012 = arg0 * var4 + arg2.field1012 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field2863.field4538[arg2.field1010] == 0) {
                    arg2.field1001 = class287.method1901(arg2.field1007, arg2.field1001.method1886(), arg2.field1001.method1904(), arg2.field1001.method1900());
                } else {
                    arg2.field1001 = class287.method1901(arg2.field1007, arg2.field1001.method1886(), 0, arg2.field1001.method1900());
                    this.field2863.method1841((byte) 126, arg2.field1000.field4173[arg2.field995] < 0, arg2);
                }
                if (arg2.field1000.field4173[arg2.field995] < 0) {
                    arg2.field1001.method1914(-1);
                }
                arg0 = arg2.field1012 / var4;
            }
        }
        arg2.field1001.method918(arg0);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()I")
    public final int method911() {
        field2859++;
        return 0;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "()Lrg;")
    public final class273 method917() {
        field2862++;
        class70 var1;
        do {
            var1 = (class70) this.field2867.method362(false);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1001 == null);
        return var1.field1001;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([III)V")
    public final void method914(int[] arg0, int arg1, int arg2) {
        field2860++;
        this.field2871.method914(arg0, arg1, arg2);
        for (class70 var4 = (class70) this.field2867.method369((byte) -115); var4 != null; var4 = (class70) this.field2867.method362(false)) {
            if (!this.field2863.method1835(var4, 124)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field1006 >= var6) {
                        this.method1194(var6, 101, var5 + var6, var4, arg0, var5);
                        var4.field1006 -= var6;
                        break;
                    }
                    this.method1194(var4.field1006, 106, var5 + var6, var4, arg0, var5);
                    var5 += var4.field1006;
                    var6 -= var4.field1006;
                } while (!this.field2863.method1860(var6, var4, arg0, var5, (byte) -63));
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lre;)V")
    public class189(class282 arg0) {
        this.field2863 = arg0;
    }
}

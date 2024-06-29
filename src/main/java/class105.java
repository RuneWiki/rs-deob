import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class105 {

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "[I")
    private int[] field1948;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "[I")
    private int[] field1956;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "Lmg;")
    private class76 field1957;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Lmg;")
    private class76 field1949;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "[Lmg;")
    private class76[] field1951;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "Lia;")
    public static class257 field1954 = class28.method234(115, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field1952 = 0;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Lia;")
    public static class257 field1945 = class28.method234(81, "<col=ff3000>");

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "[[[I")
    public static int[][][] field1947;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method758(int arg0) {
        field1945 = null;
        if (arg0 != -176778750) {
            method759(-17, -81, -37);
        }
        field1947 = null;
        field1954 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)Lke;")
    public static final class8 method759(int arg0, int arg1, int arg2) {
        class177 var3 = class75.field1463[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class8 var4 = var3.field3024;
            var3.field3024 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)I")
    public static final int method760(byte arg0, int arg1) {
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        field1946++;
        int var5 = var4 | var4 >>> 8;
        if (arg0 < 63) {
            return 76;
        } else {
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class105() {
        this.field1948 = new int[0];
        this.field1956 = new int[0];
        this.field1957 = new class133();
        this.field1957.field1480 = 1;
        this.field1949 = new class133();
        this.field1949.field1480 = 1;
        this.field1951 = new class76[] { this.field1957, this.field1949 };
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZLmb;ZILmf;DIB)[I")
    public final int[] method761(boolean arg0, class178 arg1, boolean arg2, int arg3, class63 arg4, double arg5, int arg6, byte arg7) {
        field1953++;
        int[] var10 = new int[arg3 * arg6];
        class123.method861(arg5, 256);
        class32.field622 = arg1;
        class143.field2510 = arg4;
        class91.method675(434406988, arg6, arg3);
        for (int var11 = 0; var11 < this.field1951.length; var11++) {
            this.field1951[var11].method560(arg3, (byte) 98, arg6);
        }
        int var12 = 0;
        byte var13;
        int var14;
        int var15;
        if (arg2) {
            var15 = -1;
            var14 = arg3 - 1;
            var13 = -1;
        } else {
            var13 = 1;
            var14 = 0;
            var15 = arg3;
        }
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg0) {
                var12 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1957.field1477) {
                int[] var22 = this.field1957.method169(-9351, var16);
                var20 = var22;
                var21 = var22;
                var19 = var22;
            } else {
                int[][] var18 = this.field1957.method157(var16, (byte) 7);
                var19 = var18[0];
                var20 = var18[2];
                var21 = var18[1];
            }
            for (int var23 = var14; var23 != var15; var23 += var13) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                int var26 = var20[var23] >> 4;
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class37.field736[var25];
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var26 > 255) {
                    var26 = 255;
                }
                int var28 = class37.field736[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class37.field736[var26];
                var10[var12++] = (var28 << 16) + (var27 << 8) + var29;
                if (arg0) {
                    var12 += arg3 - 1;
                }
            }
        }
        if (arg7 == 77) {
            for (int var17 = 0; var17 < this.field1951.length; var17++) {
                this.field1951[var17].method557(arg7 ^ 0xFFFFFFB2);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/awt/Component;ILmi;I)Lff;")
    public static final class83 method762(int arg0, Component arg1, int arg2, class100 arg3, int arg4) {
        field1955++;
        if (class134.field2399 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= ~arg4 && arg4 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class83 var5 = (class83) Class.forName("hi").getDeclaredConstructor().newInstance();
                var5.field1610 = new int[(class102.field1899 ? 2 : 1) * 256];
                var5.field1630 = arg2;
                var5.method625(arg1);
                var5.field1633 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field1633 > 16384) {
                    var5.field1633 = 16384;
                }
                var5.method621(var5.field1633);
                if (class229.field3857 > 0 && class248.field4292 == null) {
                    class248.field4292 = new class85();
                    class248.field4292.field1665 = arg3;
                    arg3.method710(class248.field4292, (byte) -121, class229.field3857);
                }
                if (class248.field4292 != null) {
                    if (class248.field4292.field1657[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class248.field4292.field1657[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class163 var6 = new class163(arg3, arg4);
                    var6.field1610 = new int[(class102.field1899 ? 2 : 1) * 256];
                    var6.field1630 = arg2;
                    var6.method625(arg1);
                    var6.field1633 = 16384;
                    var6.method621(var6.field1633);
                    if (class229.field3857 > 0 && class248.field4292 == null) {
                        class248.field4292 = new class85();
                        class248.field4292.field1665 = arg3;
                        arg3.method710(class248.field4292, (byte) -121, class229.field3857);
                    }
                    if (class248.field4292 != null) {
                        if (class248.field4292.field1657[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class248.field4292.field1657[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class83();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lk;)V")
    public class105(class152 arg0) {
        int var2 = arg0.method1051((byte) -69);
        int var3 = 0;
        this.field1951 = new class76[var2];
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class76 var16 = class70.method527((byte) -128, arg0);
            if (var16.method563(-58) >= 0) {
                var3++;
            }
            if (var16.method564(-1) >= 0) {
                var5++;
            }
            int var17 = var16.field1468.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method1051((byte) -97);
            }
            this.field1951[var6] = var16;
        }
        this.field1948 = new int[var5];
        this.field1956 = new int[var3];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class76 var11 = this.field1951[var9];
            int var12 = var11.field1468.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1468[var13] = this.field1951[var4[var9][var13]];
            }
            int var14 = var11.method563(111);
            int var15 = var11.method564(-1);
            if (var14 > 0) {
                this.field1956[var8++] = var14;
            }
            if (var15 > 0) {
                this.field1948[var7++] = var15;
            }
            var4[var9] = null;
        }
        Object var10 = null;
        this.field1957 = this.field1951[arg0.method1051((byte) -64)];
        this.field1949 = this.field1951[arg0.method1051((byte) 114)];
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILmf;Lmb;)Z")
    public final boolean method763(int arg0, class63 arg1, class178 arg2) {
        field1958++;
        if (arg0 != 1) {
            this.method761(true, (class178) null, false, 102, (class63) null, -1.3059614975971714D, 6, (byte) 13);
        }
        for (int var4 = 0; var4 < this.field1956.length; var4++) {
            if (!arg2.method1207(this.field1956[var4], (byte) 95)) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field1948.length; var5++) {
            if (!arg1.method98(this.field1948[var5], false)) {
                return false;
            }
        }
        return true;
    }
}

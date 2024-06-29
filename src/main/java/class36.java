import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class36 {

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    private int field402 = -1;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Z")
    private boolean field411 = true;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "[Lwt;")
    private class24[] field418;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "Lwt;")
    private class24 field413;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "[Lwt;")
    private class24[] field405;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Lqp;")
    public static class586 field410 = new class586(101, 0);

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "Ljava/lang/String;")
    public static String field420 = null;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    private int field416;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "Lha;")
    private class116 field417;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "Ldda;")
    public static class597 field414;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public static void method183(byte arg0) {
        field410 = null;
        if (arg0 == -9) {
            field414 = null;
            field420 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBLqa;)Z")
    public final boolean method184(int arg0, byte arg1, class167 arg2) {
        field407++;
        if (this.field402 != arg0) {
            this.field402 = arg0;
            int var4 = class239.method1537(-24644, arg0);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field401 != var4) {
                this.field401 = var4;
                this.field417 = null;
            }
            if (this.field418 != null) {
                this.field416 = 0;
                int[] var5 = new int[this.field418.length];
                for (int var6 = 0; var6 < this.field418.length; var6++) {
                    class24 var7 = this.field418[var6];
                    if (var7.method113(this.field406, this.field408, this.field412, this.field402)) {
                        var5[this.field416] = var7.field205;
                        this.field405[this.field416++] = var7;
                    }
                }
                class304.method1872(this.field405, 0, var5, this.field416 - 1, 110);
            }
            this.field411 = true;
        }
        if (arg1 != 59) {
            method183((byte) -104);
        }
        boolean var8 = false;
        if (this.field411) {
            this.field411 = false;
            for (int var9 = this.field416 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field405[var9].method106(arg2, this.field413);
                this.field411 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method185(String arg0, byte arg1) throws ClassNotFoundException {
        field400++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else {
            if (arg1 >= -108) {
                method186(-52, -91, -42, null, null);
            }
            if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIILrk;Lqa;)V")
    public static final void method186(int arg0, int arg1, int arg2, class419 arg3, class167 arg4) {
        class34.field391.method2499(0);
        field403++;
        if (class111.field1411) {
            return;
        }
        for (class385 var5 = (class385) arg3.method2496((byte) -103); var5 != null; var5 = (class385) arg3.method2494(75)) {
            class42 var6 = class113.field1420.method1213(var5.field5633, 6);
            if (class300.method1860(85, var6)) {
                boolean var7 = class464.method2752(var5, true, var6, arg4, arg2, arg1);
                if (var7) {
                    class409.method2435(arg4, var5, 78, var6);
                }
            }
        }
        if (arg0 > -92) {
            field419 = -43;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIILqa;III)V")
    public final void method187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class167 arg6, int arg7, int arg8, int arg9) {
        int var11 = arg4 + arg9 & 0x3FFF;
        field415++;
        if (this.field404 == -1) {
            arg6.method980(arg8, arg5, arg1, arg0, arg2, 0);
        } else {
            class83 var12 = class394.field5733.method1762(this.field404, (byte) 45);
            if (this.field417 == null && class394.field5733.method1758((byte) 89, this.field404)) {
                int[] var13 = var12.field961 ? class394.field5733.method1764(0.7F, this.field401, this.field404, this.field401, false, 61) : class394.field5733.method1759(this.field401, this.field401, 0.7F, (byte) 114, this.field404, false);
                this.field417 = arg6.method982(var13, 0, this.field401, this.field401, this.field401);
            }
            if (var12.field961) {
                arg6.method980(arg8, arg5, arg1, arg0, arg2, 0);
            }
            if (this.field417 != null) {
                int var14 = var12.field961 ? 1 : 0;
                int var15 = arg0 * arg7 / -4096;
                int var16;
                for (var16 = arg0 * var11 / 4096 + (arg1 - arg0) / 2; var16 > arg0; var16 -= arg0) {
                }
                while (var16 < 0) {
                    var16 += arg0;
                }
                while (var15 > arg0) {
                    var15 -= arg0;
                }
                while (var15 < 0) {
                    var15 += arg0;
                }
                for (int var17 = var16 - arg0; var17 < arg1; var17 += arg0) {
                    for (int var18 = var15 - arg0; var18 < arg0; var18 += arg0) {
                        this.field417.method234(arg8 + var17, arg5 + var18, arg0, arg0, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field416 - 1; var19 >= 0; var19--) {
            this.field405[var19].method114(arg6, arg8, arg5, arg1, arg0, arg7, var11);
        }
        if (arg3 > -22) {
            field414 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public final void method188(int arg0) {
        if (this.field418 != null) {
            for (int var2 = 0; var2 < this.field418.length; var2++) {
                this.field418[var2].method110();
            }
        }
        field409++;
        if (arg0 == 25554) {
            this.field417 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(I[Lwt;IIII)V")
    public class36(int arg0, class24[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field404 = arg0;
        this.field408 = arg4;
        this.field406 = arg3;
        this.field418 = arg1;
        this.field412 = arg5;
        if (arg1 == null) {
            this.field413 = null;
            this.field405 = null;
        } else {
            this.field405 = new class24[arg1.length];
            this.field413 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}

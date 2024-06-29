import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public abstract class class307 extends class154 {

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
    private int field4202;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
    public int field4200;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    public int field4197;

    @OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
    public int field4213;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
    private int field4206;

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "F")
    public float field4209;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "Lcja;")
    public static class46 field4201 = new class46(8);

    @OriginalMember(owner = "client!bq", name = "x", descriptor = "Lem;")
    public static class239 field4212 = new class239();

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!bq", name = "v", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!bq", name = "w", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!bq", name = "A", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method1955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != -1) {
            return true;
        }
        field4199++;
        int var7 = arg2 + arg5;
        int var8 = arg6 + arg1;
        int var9 = arg0 + arg4;
        if (!class625.method3519(var9, arg5, arg4, var9, arg5, var8, var8, -108, var8, var7)) {
            return false;
        } else if (class625.method3519(var9, arg5, arg4, arg4, var7, var8, var8, -98, var8, var7)) {
            if (arg5 >= class14.field218) {
                if (!class625.method3519(var9, var7, var9, arg4, var7, arg6, var8, -121, var8, var7)) {
                    return false;
                }
                if (!class625.method3519(arg4, var7, var9, arg4, var7, arg6, arg6, arg3 ^ 0x7C, var8, var7)) {
                    return false;
                }
            } else if (!class625.method3519(var9, arg5, var9, arg4, arg5, arg6, var8, arg3 ^ 0xFFFFFFB7, var8, arg5)) {
                return false;
            } else if (!class625.method3519(arg4, arg5, var9, arg4, arg5, arg6, arg6, arg3 ^ 0xFFFFFFC5, var8, arg5)) {
                return false;
            }
            if (arg4 < class758.field10451) {
                if (!class625.method3519(arg4, arg5, arg4, arg4, arg5, arg6, var8, 37, var8, var7)) {
                    return false;
                }
                if (!class625.method3519(arg4, arg5, arg4, arg4, var7, arg6, arg6, 105, var8, var7)) {
                    return false;
                }
            } else if (!class625.method3519(var9, arg5, var9, var9, arg5, arg6, var8, -118, var8, var7)) {
                return false;
            } else if (!class625.method3519(var9, arg5, var9, var9, var7, arg6, arg6, arg3 - 122, var8, var7)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lfca;B)Lbp;")
    public static final class408 method1956(class93 arg0, byte arg1) {
        field4211++;
        int var2 = arg0.method763(-91);
        if (arg1 != -44) {
            method1955(62, 120, -40, -92, -69, 9, 105);
        }
        return new class408(var2);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
    public static final void method1957(int arg0) {
        field4215++;
        class583 var1 = null;
        try {
            class545 var2 = class630.field8751.method4114(true, "", true);
            while (var2.field7412 == 0) {
                class643.method3577(1L, 0);
            }
            if (var2.field7412 == 1) {
                var1 = (class583) var2.field7416;
                class93 var3 = class111.field1911.method2833((byte) 125);
                var1.method3348(0, var3.field1413, var3.field1442, 1);
            }
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method3349(arg0 ^ 0xFFFFF053);
            }
        } catch (Exception var4) {
        }
        if (arg0 != 0) {
            method1957(-120);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIII)V")
    public abstract void method1399(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)I")
    public final int method1958(boolean arg0) {
        field4198++;
        if (!arg0) {
            this.field4209 = 0.8074141F;
        }
        return this.field4213;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BI)Lfr;")
    public static final class434 method1959(byte arg0, int arg1) {
        field4205++;
        if (arg1 >= 0 && arg1 < 100) {
            if (arg0 >= -13) {
                field4201 = null;
            }
            return class169.field2716[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(Z)V")
    public static void method1960(boolean arg0) {
        if (arg0) {
            field4212 = null;
            field4201 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)I")
    public final int method1961(int arg0) {
        if (arg0 > -127) {
            field4201 = null;
        }
        field4210++;
        return this.field4197;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BF)V")
    public abstract void method1398(byte arg0, float arg1);

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)I")
    public final int method1962(int arg0) {
        if (arg0 != 0) {
            this.field4197 = 124;
        }
        field4208++;
        return this.field4200;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)I")
    public final int method1963(byte arg0) {
        field4204++;
        int var2 = -99 / ((arg0 - 62) / 35);
        return this.field4202;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BC)Z")
    public static final boolean method1964(byte arg0, char arg1) {
        field4203++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class684.method3855(-65, arg1)) {
            return true;
        } else {
            char[] var2 = class530.field7184;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class135.field2291;
            if (arg0 > -29) {
                field4201 = null;
            }
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(IIIIIF)V")
    public class307(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field4202 = arg3;
        this.field4200 = arg0;
        this.field4197 = arg1;
        this.field4213 = arg2;
        this.field4206 = arg4;
        this.field4209 = arg5;
    }

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "(I)I")
    public final int method1965(int arg0) {
        if (arg0 != 0) {
            this.field4206 = -14;
        }
        field4207++;
        return this.field4206;
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(B)F")
    public final float method1966(byte arg0) {
        field4214++;
        return arg0 == -58 ? this.field4209 : 0.78749704F;
    }
}

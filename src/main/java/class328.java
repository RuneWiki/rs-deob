import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class328 {

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    private int field5279 = 0;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "[Lqk;")
    public class70[] field5275;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public int field5272;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Lsf;")
    public static class124 field5273 = new class124(64);

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "J")
    private long field5263;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lqk;")
    private class70 field5262;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Lqk;")
    private class70 field5280;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2333(int arg0) {
        field5269++;
        class85.field1465.method2346((byte) 74);
        class54.field1072.method1582(-46);
        class197.field3288.method1582(125);
        if (arg0 >= -106) {
            field5273 = (class124) null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([Lqk;Z)I", line = 21)
    public final int method2334(class70[] arg0, boolean arg1) {
        field5281++;
        int var3 = 0;
        if (!arg1) {
            this.field5275 = (class70[]) null;
        }
        for (int var4 = 0; var4 < this.field5272; var4++) {
            class70 var5 = this.field5275[var4];
            for (class70 var6 = var5.field1290; var6 != var5; var6 = var6.field1290) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)Lqk;", line = 54)
    public final class70 method2335(byte arg0) {
        field5267++;
        if (this.field5262 == null) {
            return null;
        }
        int var2 = -64 / ((-arg0 - 86) / 38);
        class70 var3 = this.field5275[(int) (this.field5263 & (long) (this.field5272 - 1))];
        while (this.field5262 != var3) {
            if (this.field5262.field1291 == this.field5263) {
                class70 var4 = this.field5262;
                this.field5262 = this.field5262.field1290;
                return var4;
            }
            this.field5262 = this.field5262.field1290;
        }
        this.field5262 = null;
        return null;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)Lqk;", line = 85)
    public final class70 method2336(int arg0) {
        field5265++;
        if (this.field5279 > 0 && this.field5275[this.field5279 - 1] != this.field5280) {
            class70 var2 = this.field5280;
            this.field5280 = var2.field1290;
            return var2;
        }
        class70 var3;
        do {
            if (this.field5272 <= this.field5279) {
                if (arg0 >= -57) {
                    return (class70) null;
                }
                return null;
            }
            var3 = this.field5275[this.field5279++].field1290;
        } while (this.field5275[this.field5279 - 1] == var3);
        this.field5280 = var3.field1290;
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lqk;IJ)V", line = 120)
    public final void method2337(class70 arg0, int arg1, long arg2) {
        if (arg0.field1292 != null) {
            arg0.method535(-2801);
        }
        field5264++;
        class70 var5 = this.field5275[(int) ((long) (this.field5272 - 1) & arg2)];
        arg0.field1291 = arg2;
        arg0.field1292 = var5.field1292;
        arg0.field1290 = var5;
        arg0.field1292.field1290 = arg0;
        arg0.field1290.field1292 = arg0;
        if (arg1 != 709) {
            this.field5262 = (class70) null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lsh;I)V", line = 140)
    public static final void method2338(class320 arg0, int arg1) {
        class56.field1112 = arg0;
        field5266++;
        if (arg1 != -1) {
            method2339(-123, (class181) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILg;)Lg;", line = 156)
    public static final class181 method2339(int arg0, class181 arg1) {
        field5271++;
        if (arg1.field2970 != -1) {
            return class224.method1564(-105, arg1.field2970);
        }
        int var2 = arg1.field3103 >>> 16;
        class115 var3 = new class115(class34.field758);
        for (class355 var4 = (class355) var3.method852(77); var4 != null; var4 = (class355) var3.method853((byte) 56)) {
            if (var4.field5657 == var2) {
                return class224.method1564(-123, (int) var4.field1291);
            }
        }
        if (arg0 >= -29) {
            method2343((class206) null, false);
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)I", line = 188)
    public final int method2340(int arg0) {
        if (arg0 != -17734) {
            return -4;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field5272; var3++) {
            class70 var4 = this.field5275[var3];
            for (class70 var5 = var4.field1290; var5 != var4; var5 = var5.field1290) {
                var2++;
            }
        }
        field5276++;
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)I", line = 218)
    public final int method2341(byte arg0) {
        if (arg0 > -93) {
            this.field5272 = -58;
        }
        field5277++;
        return this.field5272;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V", line = 231)
    public static void method2342(int arg0) {
        field5273 = null;
        if (arg0 > -14) {
            method2338((class320) null, 1);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lek;Z)Z", line = 246)
    public static final boolean method2343(class206 arg0, boolean arg1) {
        field5268++;
        if (arg1) {
            field5273 = (class124) null;
        }
        return arg0.method1401(class317.field5174, -2689);
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(I)V", line = 262)
    public class328(int arg0) {
        this.field5275 = new class70[arg0];
        this.field5272 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class70 var3 = this.field5275[var2] = new class70();
            var3.field1290 = var3;
            var3.field1292 = var3;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IJ)Lqk;", line = 285)
    public final class70 method2344(int arg0, long arg1) {
        field5278++;
        this.field5263 = arg1;
        class70 var4 = this.field5275[(int) ((long) (this.field5272 + arg0) & arg1)];
        for (this.field5262 = var4.field1290; this.field5262 != var4; this.field5262 = this.field5262.field1290) {
            if (this.field5262.field1291 == arg1) {
                class70 var5 = this.field5262;
                this.field5262 = this.field5262.field1290;
                return var5;
            }
        }
        this.field5262 = null;
        return null;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(B)Lqk;", line = 316)
    public final class70 method2345(byte arg0) {
        field5274++;
        int var2 = -3 % ((-arg0 - 45) / 58);
        this.field5279 = 0;
        return this.method2336(-78);
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(B)V", line = 330)
    public final void method2346(byte arg0) {
        int var2 = -109 / ((-arg0 - 10) / 34);
        for (int var3 = 0; var3 < this.field5272; var3++) {
            class70 var4 = this.field5275[var3];
            while (true) {
                class70 var5 = var4.field1290;
                if (var4 == var5) {
                    break;
                }
                var5.method535(-2801);
            }
        }
        this.field5280 = null;
        this.field5262 = null;
        field5270++;
    }
}

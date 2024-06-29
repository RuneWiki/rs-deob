import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class213 {

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
    private int field3033 = 0;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public int field3019;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "[Leh;")
    public class362[] field3016;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "Lmu;")
    public static class303 field3030 = new class303(3, 3);

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "J")
    private long field3027;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "Leh;")
    private class362 field3031;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "Leh;")
    private class362 field3032;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)I", line = 3)
    public final int method1459(int arg0) {
        if (arg0 != 1) {
            method1464(20);
        }
        field3029++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3019; var3++) {
            class362 var4 = this.field3016[var3];
            for (class362 var5 = var4.field5207; var5 != var4; var5 = var5.field5207) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)I", line = 35)
    public final int method1460(boolean arg0) {
        field3018++;
        if (!arg0) {
            method1463(false);
        }
        return this.field3019;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(Z)Leh;", line = 47)
    public final class362 method1461(boolean arg0) {
        field3026++;
        if (this.field3031 == null) {
            return null;
        }
        class362 var2 = this.field3016[(int) ((long) (this.field3019 - 1) & this.field3027)];
        if (!arg0) {
            method1464(4);
        }
        while (this.field3031 != var2) {
            if (this.field3031.field5204 == this.field3027) {
                class362 var3 = this.field3031;
                this.field3031 = this.field3031.field5207;
                return var3;
            }
            this.field3031 = this.field3031.field5207;
        }
        this.field3031 = null;
        return null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I[Leh;)I", line = 84)
    public final int method1462(int arg0, class362[] arg1) {
        if (arg0 != 3) {
            field3025 = -76;
        }
        field3022++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3019; var4++) {
            class362 var5 = this.field3016[var4];
            for (class362 var6 = var5.field5207; var6 != var5; var6 = var6.field5207) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(Z)V", line = 115)
    public static void method1463(boolean arg0) {
        field3030 = null;
        if (arg0) {
            field3025 = 67;
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)Llga;", line = 128)
    public static final class710 method1464(int arg0) {
        field3020++;
        if (arg0 != -1) {
            field3025 = 43;
        }
        if (class489.field6776 == null || class184.field2779 == null) {
            return null;
        }
        for (class710 var1 = (class710) class184.field2779.method2826(10); var1 != null; var1 = (class710) class184.field2779.method2826(arg0 ^ 0xFFFFFFF5)) {
            class553 var2 = class489.field6760.method2136(var1.field9629, (byte) 92);
            if (var2 != null && var2.field7654 && var2.method3180(class489.field6766, 127)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(JI)Leh;", line = 155)
    public final class362 method1465(long arg0, int arg1) {
        this.field3027 = arg0;
        field3021++;
        class362 var4 = this.field3016[(int) (arg0 & (long) (this.field3019 - 1))];
        if (arg1 != -6008) {
            this.method1469(80);
        }
        for (this.field3031 = var4.field5207; this.field3031 != var4; this.field3031 = this.field3031.field5207) {
            if (this.field3031.field5204 == arg0) {
                class362 var5 = this.field3031;
                this.field3031 = this.field3031.field5207;
                return var5;
            }
        }
        this.field3031 = null;
        return null;
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)V", line = 185)
    public final void method1466(int arg0) {
        field3017++;
        for (int var2 = arg0; var2 < this.field3019; var2++) {
            class362 var3 = this.field3016[var2];
            while (true) {
                class362 var4 = var3.field5207;
                if (var3 == var4) {
                    break;
                }
                var4.method2314((byte) 54);
            }
        }
        this.field3031 = null;
        this.field3032 = null;
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)Leh;", line = 222)
    public final class362 method1467(int arg0) {
        field3023++;
        if (this.field3033 > arg0 && this.field3016[this.field3033 - 1] != this.field3032) {
            class362 var2 = this.field3032;
            this.field3032 = var2.field5207;
            return var2;
        }
        while (this.field3033 < this.field3019) {
            class362 var3 = this.field3016[this.field3033++].field5207;
            if (this.field3016[this.field3033 - 1] != var3) {
                this.field3032 = var3.field5207;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BJLeh;)V", line = 250)
    public final void method1468(byte arg0, long arg1, class362 arg2) {
        field3024++;
        if (arg0 < 18) {
            this.method1466(71);
        }
        if (arg2.field5208 != null) {
            arg2.method2314((byte) 57);
        }
        class362 var5 = this.field3016[(int) (arg1 & (long) (this.field3019 - 1))];
        arg2.field5207 = var5;
        arg2.field5208 = var5.field5208;
        arg2.field5208.field5207 = arg2;
        arg2.field5207.field5208 = arg2;
        arg2.field5204 = arg1;
    }

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)Leh;", line = 273)
    public final class362 method1469(int arg0) {
        this.field3033 = arg0;
        field3028++;
        return this.method1467(0);
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(I)V", line = 287)
    public class213(int arg0) {
        this.field3019 = arg0;
        this.field3016 = new class362[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class362 var3 = this.field3016[var2] = new class362();
            var3.field5207 = var3;
            var3.field5208 = var3;
        }
    }
}

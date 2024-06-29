import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class374 {

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Lcs;")
    private class287 field5179 = new class287();

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field5170 = 0;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Lada;")
    public static class144 field5177 = new class144(101, 3);

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Ltda;")
    public static class546 field5182 = new class546(6, 0, 4, 2);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Lcs;")
    private class287 field5184;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Lsf;")
    public static class447 field5183;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "[Lha;")
    public static class53[] field5180;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)Lcs;", line = 4)
    public final class287 method2233(boolean arg0) {
        field5169++;
        class287 var2 = this.field5179.field4005;
        if (!arg0) {
            field5183 = null;
        }
        if (this.field5179 == var2) {
            this.field5184 = null;
            return null;
        } else {
            this.field5184 = var2.field4005;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 28)
    public final void method2234(byte arg0) {
        field5171++;
        while (true) {
            class287 var2 = this.field5179.field4005;
            if (this.field5179 == var2) {
                if (arg0 == -24) {
                    this.field5184 = null;
                    return;
                } else {
                    return;
                }
            }
            var2.method1783((byte) 68);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII)V", line = 51)
    public static final void method2235(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5168++;
        if (arg1 != -11167) {
            method2237((byte) -56);
        }
        float var5 = (float) class339.field4682 / (float) class339.field4690;
        int var6 = arg0;
        int var7 = arg4;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg0 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        int var8 = arg2 - (arg4 - var7) / 2;
        int var9 = arg3 - (arg0 - var6) / 2;
        class177.field2703 = class339.field4682 - (class339.field4682 * var8 / var7);
        class485.field6906 = -1;
        class607.field9016 = class339.field4690 * var9 / var6;
        class451.field6372 = -1;
        class415.method2448((byte) -34);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lks;B)V", line = 91)
    public static final void method2236(class373 arg0, byte arg1) {
        field5175++;
        class14 var2 = (class14) class276.field3879.method2799((long) arg0.field1904, true);
        if (var2 == null) {
            class300.method1836((byte) 104, null, null, arg0.field8501, arg0, arg0.field1957[0], arg0.field1955[0], 0);
        } else {
            var2.method103((byte) 126);
        }
        if (arg1 != 56) {
            method2236(null, (byte) 36);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V", line = 115)
    public static void method2237(byte arg0) {
        field5180 = null;
        field5182 = null;
        field5177 = null;
        field5183 = null;
        int var1 = -111 % ((arg0 + 61) / 35);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I", line = 129)
    public final int method2238(int arg0) {
        field5176++;
        int var2 = 0;
        int var3 = -40 / ((arg0 + 19) / 51);
        for (class287 var4 = this.field5179.field4005; var4 != this.field5179; var4 = var4.field4005) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)Lcs;", line = 149)
    public final class287 method2239(int arg0) {
        field5173++;
        class287 var2 = this.field5179.field4004;
        if (arg0 != -24148) {
            field5177 = null;
        }
        if (this.field5179 == var2) {
            this.field5184 = null;
            return null;
        } else {
            this.field5184 = var2.field4004;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)Lcs;", line = 174)
    public final class287 method2240(int arg0) {
        field5181++;
        if (arg0 != 16772) {
            return null;
        }
        class287 var2 = this.field5184;
        if (this.field5179 == var2) {
            this.field5184 = null;
            return null;
        } else {
            this.field5184 = var2.field4005;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLcs;)V", line = 194)
    public final void method2241(byte arg0, class287 arg1) {
        if (arg1.field4004 != null) {
            arg1.method1783((byte) -114);
        }
        field5178++;
        arg1.field4005 = this.field5179;
        if (arg0 != 66) {
            field5177 = null;
        }
        arg1.field4004 = this.field5179.field4004;
        arg1.field4004.field4005 = arg1;
        arg1.field4005.field4004 = arg1;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)Lcs;", line = 212)
    public final class287 method2242(byte arg0) {
        field5172++;
        class287 var2 = this.field5179.field4005;
        if (this.field5179 == var2) {
            return null;
        }
        var2.method1783((byte) 126);
        if (arg0 != 45) {
            this.method2242((byte) -65);
        }
        return var2;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V", line = 239)
    public class374() {
        this.field5179.field4004 = this.field5179;
        this.field5179.field4005 = this.field5179;
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)Z", line = 248)
    public final boolean method2243(int arg0) {
        if (arg0 > -37) {
            field5170 = 47;
        }
        field5174++;
        return this.field5179.field4005 == this.field5179;
    }
}

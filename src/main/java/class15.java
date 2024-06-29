import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class15 {

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "Lsq;")
    private class29 field250 = new class29();

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "[I")
    public static int[] field241 = new int[50];

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "[I")
    public static int[] field249 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "[I")
    public static int[] field235 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field246 = 0;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "Lsq;")
    private class29 field251;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "[I")
    public static int[] field247;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)Lsq;", line = 5)
    public final class29 method209(int arg0) {
        field245++;
        if (arg0 != 28) {
            return null;
        }
        class29 var2 = this.field250.field407;
        if (this.field250 == var2) {
            this.field251 = null;
            return null;
        } else {
            this.field251 = var2.field407;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V", line = 36)
    public static final void method210(int arg0, int arg1, int arg2) {
        class14.field227[arg1] = arg0;
        field244++;
        if (arg2 != 26434) {
            method210(-97, -23, -60);
        }
        class331 var3 = (class331) class346.field5101.method609((long) arg1, arg2 - 26388);
        if (var3 == null) {
            class331 var4 = new class331(4611686018427387905L);
            class346.field5101.method606(1, var4, (long) arg1);
        } else if (var3.field4908 != 4611686018427387905L) {
            var3.field4908 = class43.method364(-16756) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lsq;I)V", line = 64)
    public final void method211(class29 arg0, int arg1) {
        if (arg0.field412 != null) {
            arg0.method299((byte) -86);
        }
        field248++;
        arg0.field407 = this.field250;
        if (arg1 != -32256) {
            method215(15);
        }
        arg0.field412 = this.field250.field412;
        arg0.field412.field407 = arg0;
        arg0.field407.field412 = arg0;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)I", line = 85)
    public final int method212(int arg0) {
        if (arg0 != 20031) {
            this.method213(24);
        }
        field236++;
        int var2 = 0;
        for (class29 var3 = this.field250.field407; var3 != this.field250; var3 = var3.field407) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)Lsq;", line = 107)
    public final class29 method213(int arg0) {
        field239++;
        if (arg0 != 0) {
            return null;
        }
        class29 var2 = this.field250.field407;
        if (this.field250 == var2) {
            return null;
        } else {
            var2.method299((byte) -86);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V", line = 129)
    public final void method214(int arg0) {
        field242++;
        while (true) {
            class29 var2 = this.field250.field407;
            if (this.field250 == var2) {
                this.field251 = null;
                if (arg0 == 7031) {
                    return;
                } else {
                    this.method211((class29) null, 126);
                    return;
                }
            }
            var2.method299((byte) -86);
        }
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V", line = 150)
    public static void method215(int arg0) {
        field247 = null;
        field249 = null;
        field241 = null;
        field235 = null;
        if (arg0 < 99) {
            method210(-63, 14, -48);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLkg;)V", line = 163)
    public static final void method216(byte arg0, class223 arg1) {
        if (class343.field5043 == arg1.field3268) {
            class344.field5053[arg1.field3365] = true;
        }
        field252++;
        if (arg0 < 121) {
            method210(123, -121, -54);
        }
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)Lsq;", line = 181)
    public final class29 method217(int arg0) {
        field237++;
        if (arg0 != -27864) {
            return null;
        }
        class29 var2 = this.field251;
        if (this.field250 == var2) {
            this.field251 = null;
            return null;
        } else {
            this.field251 = var2.field407;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V", line = 213)
    public static final void method218(int arg0, int arg1) {
        field243++;
        if (arg1 != 35) {
            field247 = null;
        }
        class125 var2 = class56.method428(arg0, 4, -3636);
        var2.method847(96);
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 235)
    public class15() {
        this.field250.field407 = this.field250;
        this.field250.field412 = this.field250;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class265 {

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public int field4084 = -1;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "Z")
    public boolean field4091 = false;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "[I")
    private int[] field4093 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "Leg;")
    public static class188 field4088 = new class188(64);

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "S")
    public static short field4094 = 32767;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "Ls;")
    public static class304 field4095 = new class304(5000);

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    public static int field4098 = 0;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "J")
    public static volatile long field4097 = 0L;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "[I")
    private int[] field4085;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "[S")
    private short[] field4076;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "[S")
    private short[] field4077;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "[S")
    private short[] field4081;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "[S")
    private short[] field4087;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "[[[B")
    public static byte[][][] field4096;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILgn;)V", line = 10)
    public final void method1751(int arg0, class303 arg1) {
        while (true) {
            int var3 = arg1.method2043((byte) -111);
            if (var3 == 0) {
                field4080++;
                if (arg0 != 0) {
                    this.field4081 = (short[]) null;
                }
                return;
            }
            this.method1759(arg1, var3, (byte) -95);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)Lvi;", line = 31)
    public final class114 method1752(int arg0) {
        field4086++;
        class114[] var2 = new class114[5];
        int var3 = arg0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field4093[var4] != -1) {
                var2[var3++] = class114.method782(class100.field1558, this.field4093[var4], 0);
            }
        }
        class114 var5 = new class114(var2, var3);
        if (this.field4087 != null) {
            for (int var6 = 0; var6 < this.field4087.length; var6++) {
                var5.method783(this.field4087[var6], this.field4081[var6]);
            }
        }
        if (this.field4076 != null) {
            for (int var7 = 0; var7 < this.field4076.length; var7++) {
                var5.method764(this.field4076[var7], this.field4077[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 84)
    public static void method1753(int arg0) {
        field4096 = (byte[][][]) null;
        field4095 = null;
        if (arg0 != 0) {
            field4098 = 66;
        }
        field4088 = null;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)Z", line = 97)
    public final boolean method1754(int arg0) {
        boolean var2 = true;
        field4078++;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field4093[var3] != -1 && !class100.field1558.method2100(0, true, this.field4093[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)Lvi;", line = 136)
    public final class114 method1755(byte arg0) {
        field4083++;
        if (this.field4085 == null) {
            return null;
        }
        class114[] var2 = new class114[this.field4085.length];
        if (arg0 > -9) {
            return (class114) null;
        }
        for (int var3 = 0; var3 < this.field4085.length; var3++) {
            var2[var3] = class114.method782(class100.field1558, this.field4085[var3], 0);
        }
        class114 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class114(var2, var2.length);
        }
        if (this.field4087 != null) {
            for (int var5 = 0; var5 < this.field4087.length; var5++) {
                var4.method783(this.field4087[var5], this.field4081[var5]);
            }
        }
        if (this.field4076 != null) {
            for (int var6 = 0; var6 < this.field4076.length; var6++) {
                var4.method764(this.field4076[var6], this.field4077[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 192)
    public static final void method1756(int arg0, int arg1) {
        class78.field1164 = arg1;
        field4079++;
        int var2 = 34 % ((-arg0 - 40) / 32);
        class329.method2227(3, -100);
        class329.method2227(4, -100);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)V", line = 208)
    public static final void method1757(int arg0, int arg1) {
        int var2 = 69 % ((arg1 + 2) / 59);
        class58.field802.method1287(arg0, -24);
        field4075++;
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V", line = 220)
    public static final void method1758(int arg0) {
        for (int var1 = arg0; var1 < class155.field2439; var1++) {
            int var2 = class144.field2286[var1];
            class80 var3 = class208.field3313[var2];
            if (var3 != null) {
                class40.method292(var3, (byte) 46, var3.field1178.field4609);
            }
        }
        field4089++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lgn;IB)V", line = 256)
    private final void method1759(class303 arg0, int arg1, byte arg2) {
        field4090++;
        if (arg1 == 1) {
            this.field4084 = arg0.method2043((byte) -111);
        } else if (arg1 == 2) {
            int var4 = arg0.method2043((byte) -112);
            this.field4085 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4085[var5] = arg0.method1994(false);
            }
        } else if (arg1 == 3) {
            this.field4091 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method2043((byte) -127);
            this.field4081 = new short[var6];
            this.field4087 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4087[var7] = (short) arg0.method1994(false);
                this.field4081[var7] = (short) arg0.method1994(false);
            }
        } else if (arg1 == 41) {
            int var8 = arg0.method2043((byte) -123);
            this.field4076 = new short[var8];
            this.field4077 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4076[var9] = (short) arg0.method1994(false);
                this.field4077[var9] = (short) arg0.method1994(false);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field4093[arg1 - 60] = arg0.method1994(false);
        }
        if (arg2 != -95) {
            field4088 = (class188) null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)Z", line = 339)
    public final boolean method1760(int arg0) {
        if (arg0 > -28) {
            this.field4087 = (short[]) null;
        }
        field4082++;
        if (this.field4085 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field4085.length; var3++) {
            if (!class100.field1558.method2100(0, true, this.field4085[var3])) {
                var2 = false;
            }
        }
        return var2;
    }
}

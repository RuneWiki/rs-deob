import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class19 {

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    private int field361 = 0;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public int field346;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "[Lil;")
    public class161[] field359;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Lp;")
    public static class280 field347 = class18.method140((byte) -128, "(Y");

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Lsb;")
    public static class221 field349 = new class221(2);

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public static int field363 = -1;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    public static int field365 = 0;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "J")
    private long field348;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "Lil;")
    private class161 field352;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "Lil;")
    private class161 field362;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)Lil;")
    public final class161 method142(boolean arg0) {
        this.field361 = 0;
        if (!arg0) {
            this.method151(-71);
        }
        field354++;
        return this.method143((byte) -126);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)Lil;")
    public final class161 method143(byte arg0) {
        if (arg0 > -116) {
            this.field362 = null;
        }
        field356++;
        if (this.field361 > 0 && this.field359[this.field361 - 1] != this.field362) {
            class161 var2 = this.field362;
            this.field362 = var2.field2828;
            return var2;
        }
        while (this.field361 < this.field346) {
            class161 var3 = this.field359[this.field361++].field2828;
            if (this.field359[this.field361 - 1] != var3) {
                this.field362 = var3.field2828;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIII)I")
    public static final int method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field355++;
        if (arg5 != -29387) {
            method144(114, 106, 104, 61, 111, -77, 116);
        }
        if ((arg2 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg0;
            arg0 = var7;
        }
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return arg4;
        } else if (var8 == 2) {
            return 1 + 7 - arg1 - arg3;
        } else {
            return 7 - (arg4 + arg0 - 1);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)I")
    public final int method145(int arg0) {
        field358++;
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field346; var3++) {
            class161 var4 = this.field359[var3];
            class161 var5 = var4.field2828;
            while (var4 != var5) {
                var5 = var5.field2828;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public final void method146(int arg0) {
        for (int var2 = 0; var2 < this.field346; var2++) {
            class161 var3 = this.field359[var2];
            while (true) {
                class161 var4 = var3.field2828;
                if (var3 == var4) {
                    break;
                }
                var4.method1146(arg0 ^ 0xFFFF99D0);
            }
        }
        this.field352 = null;
        field350++;
        this.field362 = null;
        if (arg0 != -1) {
            this.field359 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIB)I")
    public static final int method147(int arg0, int arg1, byte arg2) {
        int var3 = arg0 >>> 31;
        field357++;
        if (arg2 != -31) {
            field365 = -18;
        }
        return (arg0 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILil;J)V")
    public final void method148(int arg0, class161 arg1, long arg2) {
        field360++;
        if (arg1.field2819 != null) {
            arg1.method1146(26159);
        }
        class161 var5 = this.field359[(int) ((long) (this.field346 + arg0) & arg2)];
        arg1.field2828 = var5;
        arg1.field2827 = arg2;
        arg1.field2819 = var5.field2819;
        arg1.field2819.field2828 = arg1;
        arg1.field2828.field2819 = arg1;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
    public static void method149(byte arg0) {
        field349 = null;
        field347 = null;
        if (arg0 < 17) {
            method149((byte) 6);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(JI)Lil;")
    public final class161 method150(long arg0, int arg1) {
        field343++;
        this.field348 = arg0;
        int var4 = -115 / ((arg1 - 28) / 59);
        class161 var5 = this.field359[(int) ((long) (this.field346 - 1) & arg0)];
        for (this.field352 = var5.field2828; this.field352 != var5; this.field352 = this.field352.field2828) {
            if (this.field352.field2827 == arg0) {
                class161 var6 = this.field352;
                this.field352 = this.field352.field2828;
                return var6;
            }
        }
        this.field352 = null;
        return null;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)Lil;")
    public final class161 method151(int arg0) {
        field345++;
        if (this.field352 == null) {
            return null;
        }
        class161 var2 = this.field359[(int) ((long) (this.field346 + arg0) & this.field348)];
        while (this.field352 != var2) {
            if (this.field352.field2827 == this.field348) {
                class161 var3 = this.field352;
                this.field352 = this.field352.field2828;
                return var3;
            }
            this.field352 = this.field352.field2828;
        }
        this.field352 = null;
        return null;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
    public static final void method152(byte arg0) {
        Container var1;
        if (class129.field2237 != null) {
            var1 = class129.field2237;
        } else if (class153.field2656 == null) {
            var1 = class118.field2117.field3473;
        } else {
            var1 = class153.field2656;
        }
        class145.field2527 = var1.getSize().width;
        field342++;
        class126.field2202 = var1.getSize().height;
        if (class153.field2656 == var1) {
            Insets var2 = class153.field2656.getInsets();
            class126.field2202 -= var2.top + var2.bottom;
            class145.field2527 -= var2.left + var2.right;
        }
        if (class210.method1410(0) >= 2) {
            class35.field648 = 0;
            class103.field1724 = class126.field2202;
            class190.field3328 = class145.field2527;
            class160.field2789 = 0;
        } else {
            class103.field1724 = 503;
            class160.field2789 = (class145.field2527 - 765) / 2;
            class190.field3328 = 765;
            class35.field648 = 0;
        }
        class41.field707.setSize(class190.field3328, class103.field1724);
        if (class153.field2656 == var1) {
            Insets var3 = class153.field2656.getInsets();
            class41.field707.setLocation(class160.field2789 + var3.left, class35.field648 + var3.top);
        } else {
            class41.field707.setLocation(class160.field2789, class35.field648);
        }
        if (class246.field4315 != -1) {
            class44.method338(true, (byte) 99);
        }
        if (arg0 >= 44) {
            class47.method354(-92);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(IIB)Lqg;")
    public static final class103 method153(int arg0, int arg1, byte arg2) {
        field351++;
        if (arg2 != -97) {
            field365 = -104;
        }
        for (class103 var3 = (class103) class104.field1725.method651(12916); var3 != null; var3 = (class103) class104.field1725.method643(11066)) {
            if (var3.field1711 && var3.method724(arg1, arg0, 117)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)I")
    public final int method154(int arg0) {
        field344++;
        if (arg0 >= -47) {
            this.field361 = -13;
        }
        return this.field346;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I)V")
    public class19(int arg0) {
        this.field346 = arg0;
        this.field359 = new class161[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class161 var3 = this.field359[var2] = new class161();
            var3.field2819 = var3;
            var3.field2828 = var3;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Llj;II)Lp;")
    public static final class280 method155(class25 arg0, int arg1, int arg2) {
        field341++;
        try {
            class280 var3 = new class280();
            var3.field4908 = arg0.method210(65536);
            if (var3.field4908 > arg1) {
                var3.field4908 = arg1;
            }
            var3.field4907 = new byte[var3.field4908];
            arg0.field481 += class147.field2562.method1080(var3.field4907, arg2, arg0.field475, var3.field4908, arg0.field481, -3);
            return var3;
        } catch (Exception var4) {
            return class144.field2521;
        }
    }
}
